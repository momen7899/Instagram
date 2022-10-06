package com.ms.instagram.follower;

import com.ms.instagram.common.BaseDTO;
import com.ms.instagram.user.UserDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class FollowerDTO extends BaseDTO {

    @ApiModelProperty(required = true, hidden = false)
    private UserDTO userFollowerDTO;

    @ApiModelProperty(required = true, hidden = false)
    private UserDTO userFollowingDTO;
}
