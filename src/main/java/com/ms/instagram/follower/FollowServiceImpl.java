package com.ms.instagram.follower;

import com.ms.instagram.common.exception.NotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Optional;

@AllArgsConstructor
@Service
public class FollowServiceImpl implements FollowService {
    private final FollowerRepository repository;

    @Override
    public Follower save(Follower follower) {
        return repository.save(follower);
    }

    @Override
    public void delete(Long id) {
        repository.delete(getById(id));
    }

    private Follower getById(Long id) {
        Optional<Follower> optionalFollower = repository.findById(id);

        if (optionalFollower.isEmpty())
            throw new NotFoundException("Not Found Follower");

        return optionalFollower.get();
    }

    @Override
    public Page<Follower> findAllFollowing(Long followerId, Integer page, Integer size) {
        return repository.findAllByUserFollower_Id(followerId, PageRequest.of(page, size, Sort.by("id").ascending()));
    }

    @Override
    public Page<Follower> findAllFollowers(Long followingId, Integer page, Integer size) {
        return repository.findAllByUserFollowing_Id(followingId, PageRequest.of(page, size, Sort.by("id").ascending()));
    }

}
