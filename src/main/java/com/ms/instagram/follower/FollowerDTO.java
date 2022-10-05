package com.ms.instagram.follower;

import com.ms.instagram.common.BaseDTO;
import com.ms.instagram.profile.ProfileDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class FollowerDTO extends BaseDTO {

    @ApiModelProperty(required = true,hidden = false)
    private String name;


    @ApiModelProperty(required = true,hidden = false)
    private ProfileDTO profile;
}
