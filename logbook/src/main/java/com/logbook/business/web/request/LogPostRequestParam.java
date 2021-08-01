package com.logbook.business.web.request;

import com.logbook.common.PageHelper;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("参数")
public class LogPostRequestParam extends PageHelper {
    @ApiModelProperty("频道id")
    private Integer cid;
    @ApiModelProperty("主题id")
    private Integer tid;
}
