package com.ms.instagram.like;

import java.util.List;

public interface LikeService {

    Like save(Like like);
    void delete(Long id);
    Like getById(Long id);

    List<Like> getAllByPostId(Long postId);

}
