package com.ms.instagram.comment;

import com.ms.instagram.common.exception.NotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Optional;

@AllArgsConstructor
@Service
public class CommentServiceImpl implements CommentService {
    private final CommentRepository repository;

    @Override
    public Comment save(Comment comment) {
        return repository.save(comment);
    }

    @Override
    public void delete(Long id) {
        repository.delete(getById(id));
    }

    @Override
    public Comment getById(Long id) {
        Optional<Comment> commentOptional = repository.findById(id);

        if (commentOptional.isEmpty())
            throw new NotFoundException("Comment Not Found");

        return commentOptional.get();
    }

    @Override
    public Page<Comment> getAllByPostId(Long postId, Integer page, Integer size) {
        return repository.findAllByPost_Id(postId, PageRequest.of(page, size, Sort.by("id").ascending()));
    }

}
