package com.ms.instagram.post;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PostRepository extends PagingAndSortingRepository<Post, Long> {

    Page<Post> findAllByUser_Id(Long user_id, Pageable pageable);
}
