package com.ms.instagram.follower;

import com.ms.instagram.profile.ProfileMapper;
import com.ms.instagram.profile.ProfileModel;
import com.ms.instagram.profile.ProfileRepository;
import com.ms.instagram.profile.ProfileServicePl;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class FollowService implements FollowServicePl {
    private final ProfileServicePl servicePl;
    private final ProfileMapper mapper;
    private final FollowerRepository repository;
    @Override
    public Follower save(Follower follower) {
       Long proId=follower.getProfile().getId();
        Profile profile= (Profile) servicePl.getById(proId);
        follower.setProfile((ProfileModel) profile);
        return repository.save(follower);
    }

    /*
      public Like save(Like like) {
        Long postId = like.getPost().getId();
        Post post = postServicePl.getById(postId);
        like.setPost(post);
        return repository.save(like);
     */
}
