package com.ms.instagram.post;

import com.ms.instagram.common.like.Like;
import com.ms.instagram.profile.ProfileServicePl;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.util.Optional;

@AllArgsConstructor
@Service
public class PostService implements PostServicePl {
private final PostRepository repository;
private ProfileServicePl servicePl;
    @Override
    public Post save(Post post) {
        return repository.save(post);
    }

    @Override
    public Post getById(Long id) {
        Optional<Post> optionalPost=repository.findById(id);
        if (!optionalPost.isPresent()){
            throw new NotFoundException("Post Not Found");}
        return optionalPost.get();
    }

    @Override
    public Post update(Post post) {
        return null;
    }


}
