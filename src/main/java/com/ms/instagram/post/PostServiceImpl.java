package com.ms.instagram.post;

import com.ms.instagram.common.exception.NotFoundException;
import com.ms.instagram.user.UserService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Optional;

@AllArgsConstructor
@Service
public class PostServiceImpl implements PostService {
    private final PostRepository repository;
    private UserService servicePl;

    @Override
    public Post save(Post post) {
        return repository.save(post);
    }

    @Override
    public Post getById(Long id) {
        Optional<Post> optionalPost = repository.findById(id);
        if (optionalPost.isEmpty()) {
            throw new NotFoundException("Post Not Found");
        }
        return optionalPost.get();
    }

    @Override
    public Post update(Post post) {
        Post savedBefore = getById(post.getId());
        savedBefore.setFile(post.getFile());
        savedBefore.setCaption(post.getCaption());
        return repository.save(savedBefore);
    }

    @Override
    public void delete(Long id) {
        repository.delete(getById(id));
    }

    @Override
    public Page<Post> getPostsByUserId(Long userId, Integer page, Integer size) {
        return repository.findAllByUser_Id(userId, PageRequest.of(page, size, Sort.by("id").ascending()));
    }


}
