package com.ms.instagram.post;

import com.ms.instagram.common.like.Like;

public interface PostServicePl {

    Post save(Post post);

    Post getById(Long id);

    Post update(Post post);

}
