package com.ms.instagram.common.like;

import com.ms.instagram.common.BaseDTO;
import com.ms.instagram.post.PostDTO;
import com.ms.instagram.profile.ProfileDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class LikeDTO extends BaseDTO {

    @ApiModelProperty(required = true,hidden = false)
    private Boolean isLike;

    @ApiModelProperty(required = true,hidden = false)
    private PostDTO post;

    @ApiModelProperty(required = true,hidden = false)
    private ProfileDTO profile;
}
