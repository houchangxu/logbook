package com.logbook.business.web.domain;

import lombok.Data;

import java.util.List;

@Data
public class LogPostPageVo {
    private Integer id;

    private String nickName;

    private String viewCount;

    private String title;

    private String content;

    private List<String> image;

    private String authorUid;

}