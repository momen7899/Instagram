package com.ms.instagram.follower;

import org.springframework.data.domain.Page;

public interface FollowService {
    Follower save(Follower follower);

    void delete(Long id);

    Page<Follower> findAllFollowing(Long followerId, Integer page, Integer size);

    Page<Follower> findAllFollowers(Long followingId, Integer page, Integer size);

}
