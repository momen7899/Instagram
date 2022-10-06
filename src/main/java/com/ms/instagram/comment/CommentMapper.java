package com.ms.instagram.comment;

import com.ms.instagram.post.PostMapper;
import com.ms.instagram.user.UserMapper;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring", uses = {PostMapper.class, UserMapper.class})
public interface CommentMapper {

    Comment toComment(CommentDTO commentDTO);
    CommentDTO toCommentDTO(Comment comment);
    List<Comment> toCommentList(List<CommentDTO> commentDTOS);
    List<CommentDTO> toCommentDTOs(List<Comment> comments);
}
