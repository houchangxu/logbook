package com.logbook.business.model;

import lombok.Data;

@Data
public class LogPostPageBo {
    private Integer id;

    private String nickName;

    private String viewCount;

    private String title;

    private String content;

    private String image;

    private String authorUid;

}