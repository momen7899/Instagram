package com.ms.instagram.common;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class PagingDTO {
    @ApiModelProperty(required = false, hidden = true)
    private Integer size = 15;

    @ApiModelProperty(required = false, hidden = true)
    private Integer page;
}
