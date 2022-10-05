package com.ms.instagram.follower;

import com.ms.instagram.post.Post;
import org.springframework.context.annotation.Profile;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FollowerRepository extends PagingAndSortingRepository<Follower,Long> {
//List<Post> FindAllPost_ProfileModel(Long proId);


//Follower FindFollower_ProfileModel(Long proId);


}
