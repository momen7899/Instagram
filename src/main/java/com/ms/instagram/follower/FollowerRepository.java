package com.ms.instagram.follower;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FollowerRepository extends PagingAndSortingRepository<Follower, Long> {

    Page<Follower> findAllByUserFollower_Id(Long userFollower_id, Pageable pageable);

    Page<Follower> findAllByUserFollowing_Id(Long userFollowing_id, Pageable pageable);
}
