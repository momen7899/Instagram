package com.ms.instagram.common.like;

import com.ms.instagram.post.Post;
import com.ms.instagram.post.PostServicePl;
import com.ms.instagram.profile.ProfileModel;
import com.ms.instagram.profile.ProfileServicePl;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class LikeService implements LikeServicePl {

    private  final LikeRepository repository;
    private  final PostServicePl postServicePl;
    private  final ProfileServicePl profileServicePl;

    @Override
    public Like save(Like like) {
        Long postId = like.getPost().getId();
        Post post = postServicePl.getById(postId);
        like.setPost(post);
        return repository.save(like);
    }

    @Override
    public Like update(Like like) {
        Like lastLike = getById(like.getId());
        lastLike.setIsLike(like.getIsLike());
        Long postId = like.getPost().getId();

        Post post = postServicePl.getById(postId);
        lastLike.setPost(post);
        return repository.save(lastLike);
    }


    @Override
    public void delete(Long id) {
        Optional<Like> optionalLike = repository.findById(id);

        if (!optionalLike.isPresent()){
            throw new NotFoundException("Like Not Found");
        }

        repository.deleteById(id);
    }


    @Override
    public Like getById(Long id) {
        Optional<Like> optionalLike=repository.findById(id);

        if (!optionalLike.isPresent()){

            throw new NotFoundException("Like Not Found");
        }


        return optionalLike.get();
    }


    @Override
    public List<Like> getAll() {
        return (List<Like>) repository.findAll();
    }


    @Override
    public List<Like> getAllByPostId(Long postId) {
        Post post = (Post) postServicePl.getById(postId);
        List<Like> likeList = repository.findAllByPost(post);
        return likeList;
    }


    @Override
    public List<Like> getAllByProfileId(Long profileId) {
        ProfileModel profile = profileServicePl.getById(profileId);
        List<Like> likeList = repository.findAllByProfile(profile);
        return likeList;
    }

}
