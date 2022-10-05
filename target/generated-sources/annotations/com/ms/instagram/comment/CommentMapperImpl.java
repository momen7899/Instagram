package com.ms.instagram.comment;

import com.ms.instagram.post.PostMapper;
import com.ms.instagram.profile.ProfileMapper;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-10-05T10:52:31+0200",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.4.1 (Amazon.com Inc.)"
)
@Component
public class CommentMapperImpl implements CommentMapper {

    @Autowired
    private PostMapper postMapper;
    @Autowired
    private ProfileMapper profileMapper;

    @Override
    public Comment toComment(CommentDTO commentDTO) {
        if ( commentDTO == null ) {
            return null;
        }

        Comment comment = new Comment();

        comment.setId( commentDTO.getId() );
        comment.setVersion( commentDTO.getVersion() );
        comment.setCreatedDate( commentDTO.getCreatedDate() );
        comment.setCreatedBy( commentDTO.getCreatedBy() );
        comment.setLastModifiedDate( commentDTO.getLastModifiedDate() );
        comment.setLastModifiedBy( commentDTO.getLastModifiedBy() );
        comment.setComment( commentDTO.getComment() );
        comment.setProfile( profileMapper.toProfile( commentDTO.getProfile() ) );
        comment.setPost( postMapper.toPost( commentDTO.getPost() ) );

        return comment;
    }

    @Override
    public CommentDTO toCommentDTO(Comment comment) {
        if ( comment == null ) {
            return null;
        }

        CommentDTO commentDTO = new CommentDTO();

        commentDTO.setId( comment.getId() );
        commentDTO.setVersion( comment.getVersion() );
        commentDTO.setCreatedDate( comment.getCreatedDate() );
        commentDTO.setCreatedBy( comment.getCreatedBy() );
        commentDTO.setLastModifiedDate( comment.getLastModifiedDate() );
        commentDTO.setLastModifiedBy( comment.getLastModifiedBy() );
        commentDTO.setComment( comment.getComment() );
        commentDTO.setProfile( profileMapper.toProfileDTO( comment.getProfile() ) );
        commentDTO.setPost( postMapper.toPostDTO( comment.getPost() ) );

        return commentDTO;
    }

    @Override
    public List<Comment> toCommentList(List<CommentDTO> commentDTOS) {
        if ( commentDTOS == null ) {
            return null;
        }

        List<Comment> list = new ArrayList<Comment>( commentDTOS.size() );
        for ( CommentDTO commentDTO : commentDTOS ) {
            list.add( toComment( commentDTO ) );
        }

        return list;
    }

    @Override
    public List<CommentDTO> toCommentDTOs(List<Comment> comments) {
        if ( comments == null ) {
            return null;
        }

        List<CommentDTO> list = new ArrayList<CommentDTO>( comments.size() );
        for ( Comment comment : comments ) {
            list.add( toCommentDTO( comment ) );
        }

        return list;
    }
}
