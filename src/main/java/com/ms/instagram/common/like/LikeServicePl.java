package com.ms.instagram.common.like;

import java.util.List;

public interface LikeServicePl {

    Like save(Like like);
    Like update(Like like);
    void delete(Long id);
    Like getById(Long id);
    List<Like> getAll();

    List<Like> getAllByPostId(Long postId);

    List<Like> getAllByProfileId(Long profileId);

}
