package com.ms.instagram.profile;

import com.ms.instagram.common.BaseDTO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class ProfileDTO extends BaseDTO {

    @ApiModelProperty(required = true,hidden = false)
    private String name;

    @ApiModelProperty(required = true,hidden = false)
    private String userName;

    @ApiModelProperty(required = true,hidden = false)
    private String bio;

   @ApiModelProperty(required = true,hidden = false)
   private String image;
}
