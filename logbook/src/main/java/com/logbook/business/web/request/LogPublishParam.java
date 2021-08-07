package com.logbook.business.web.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("入参")
public class LogPublishParam {
    @ApiModelProperty("频道id")
    private Integer cid;
    @ApiModelProperty("主题id")
    private Integer tid;
    @ApiModelProperty("标签id")
    private Integer tagId;
    @ApiModelProperty("话题id")
    private Integer topicId;
    @ApiModelProperty("标题")
    private String title;
    @ApiModelProperty("内容")
    private String content;


}
