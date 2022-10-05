package com.ms.instagram.common.like;

import com.ms.instagram.post.Post;
import com.ms.instagram.profile.ProfileModel;
import org.springframework.context.annotation.Profile;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LikeRepository extends PagingAndSortingRepository<Like,Long>, JpaSpecificationExecutor<Like> {
    List<Like> findAllByPost(Post post);
    List<Like> findAllByProfile(ProfileModel profile);
}
