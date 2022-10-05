package com.ms.instagram.post;

import com.ms.instagram.profile.ProfileMapper;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-05T10:52:30+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.4.1 (Amazon.com Inc.)"
)
@Component
public class PostMapperImpl implements PostMapper {

    @Autowired
    private ProfileMapper profileMapper;

    @Override
    public Post toPost(PostDTO postDTO) {
        if ( postDTO == null ) {
            return null;
        }

        Post post = new Post();

        post.setId( postDTO.getId() );
        post.setVersion( postDTO.getVersion() );
        post.setCreatedDate( postDTO.getCreatedDate() );
        post.setCreatedBy( postDTO.getCreatedBy() );
        post.setLastModifiedDate( postDTO.getLastModifiedDate() );
        post.setLastModifiedBy( postDTO.getLastModifiedBy() );
        post.setCaption( postDTO.getCaption() );
        post.setProfile( profileMapper.toProfile( postDTO.getProfile() ) );

        return post;
    }

    @Override
    public PostDTO toPostDTO(Post post) {
        if ( post == null ) {
            return null;
        }

        PostDTO postDTO = new PostDTO();

        postDTO.setId( post.getId() );
        postDTO.setVersion( post.getVersion() );
        postDTO.setCreatedDate( post.getCreatedDate() );
        postDTO.setCreatedBy( post.getCreatedBy() );
        postDTO.setLastModifiedDate( post.getLastModifiedDate() );
        postDTO.setLastModifiedBy( post.getLastModifiedBy() );
        postDTO.setCaption( post.getCaption() );
        postDTO.setProfile( profileMapper.toProfileDTO( post.getProfile() ) );

        return postDTO;
    }

    @Override
    public List<PostDTO> toPostDTOs(List<Post> posts) {
        if ( posts == null ) {
            return null;
        }

        List<PostDTO> list = new ArrayList<PostDTO>( posts.size() );
        for ( Post post : posts ) {
            list.add( toPostDTO( post ) );
        }

        return list;
    }

    @Override
    public List<Post> toPosts(List<PostDTO> postDTOS) {
        if ( postDTOS == null ) {
            return null;
        }

        List<Post> list = new ArrayList<Post>( postDTOS.size() );
        for ( PostDTO postDTO : postDTOS ) {
            list.add( toPost( postDTO ) );
        }

        return list;
    }
}
