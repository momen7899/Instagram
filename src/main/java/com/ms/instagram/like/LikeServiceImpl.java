package com.ms.instagram.like;

import com.ms.instagram.common.exception.NotFoundException;
import com.ms.instagram.post.Post;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class LikeServiceImpl implements LikeService {

    private final LikeRepository repository;

    @Override
    public Like save(Like like) {
        return repository.save(like);
    }

    @Override
    public void delete(Long id) {
        repository.delete(getById(id));
    }


    @Override
    public Like getById(Long id) {
        Optional<Like> optionalLike = repository.findById(id);

        if (optionalLike.isEmpty()) {

            throw new NotFoundException("Like Not Found");
        }

        return optionalLike.get();
    }

    @Override
    public List<Like> getAllByPostId(Long postId) {
        return repository.findAllByPost_Id(postId);
    }

}
