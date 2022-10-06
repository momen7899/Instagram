package com.ms.instagram.comment;

import org.springframework.data.domain.Page;

public interface CommentService {

    Comment save(Comment comment);

    void delete(Long id);

    Comment getById(Long id);

    Page<Comment> getAllByPostId(Long postId, Integer page, Integer size);

}
