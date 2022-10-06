package com.ms.instagram.comment;

import com.ms.instagram.common.BaseDTO;
import com.ms.instagram.post.PostDTO;
import com.ms.instagram.user.UserDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class CommentDTO extends BaseDTO {
    @ApiModelProperty(required = true, hidden = false)
    private String comment;

    @ApiModelProperty(required = true, hidden = false)
    private UserDTO profile;

    @ApiModelProperty(required = true, hidden = false)
    private PostDTO post;

}
