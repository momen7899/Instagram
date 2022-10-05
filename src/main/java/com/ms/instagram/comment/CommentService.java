package com.ms.instagram.comment;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class CommentService implements CommentServicePl{
private final CommentRepository repository;
    @Override
    public Comment save(Comment comment) {
        return repository.save(comment);
    }
/*
    @Override
    public Comment update(Comment comment) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Comment getById(Long id) {
        return null;
    }

    @Override
    public List<Comment> getAll() {
        return null;
    }

    @Override
    public List<Comment> getAllByUserId(Long userId) {
        return null;
    }

    @Override
    public List<Comment> getAllByPlaceId(Long placeId) {
        return null;
    }

 */
}
