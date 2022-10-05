package com.ms.instagram.comment;

import com.ms.instagram.post.Post;
import org.springframework.context.annotation.Profile;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends PagingAndSortingRepository<Comment,Long> {

    List<Comment> findAllByProfile(Profile profile);

    List<Comment> findAllByPost(Post post);


}
