package com.ms.instagram.post;

import org.springframework.data.domain.Page;

public interface PostService {

    Post save(Post post);

    Post update(Post post);

    void delete(Long id);

    Post getById(Long id);


    Page<Post> getPostsByUserId(Long userId, Integer page, Integer size);
}
