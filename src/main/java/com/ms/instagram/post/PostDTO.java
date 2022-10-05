package com.ms.instagram.post;

import com.ms.instagram.common.BaseDTO;
import com.ms.instagram.profile.ProfileDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class PostDTO extends BaseDTO {

    @ApiModelProperty(required = true,hidden = false)
    private String caption;
    @ApiModelProperty(required = true,hidden = false)
    private ProfileDTO profile;
}
