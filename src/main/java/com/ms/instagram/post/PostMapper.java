package com.ms.instagram.post;

import com.ms.instagram.user.UserMapper;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {UserMapper.class})
public interface PostMapper {

    Post toPost(PostDTO postDTO);

    PostDTO toPostDTO(Post post);

    List<PostDTO> toPostDTOs(List<Post> posts);

    List<Post> toPosts(List<PostDTO> postDTOS);


}
