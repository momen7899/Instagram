package com.ms.instagram.like;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LikeRepository extends PagingAndSortingRepository<Like, Long>, JpaSpecificationExecutor<Like> {
    List<Like> findAllByPost_Id(Long post_id);
}
