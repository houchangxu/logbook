package com.logbook.business.model;

import lombok.Data;

@Data
public class LogTagEntity {
    private Integer id;

    private Integer pid;

    private String name;

    private String title;

    private String content;

    private Byte type;

    private Byte status;

    private Byte sort;

    private Integer threadCount;

    private String logo;

    private String background;

    private Integer createTime;

    private Integer updateTime;

    private String allowUserGroup;

    private String summary;

    private Integer adminUid;

    private Integer lastPostTime;

    private Short level;

    private Boolean allowEditRules;

    private Boolean allowFeed;

    private Boolean needVerify;

    private Boolean listStyle;

    private Boolean allowEditPost;

    private Boolean allowGlobalStick;

    private Integer memberCount;

    private Integer shareCount;

    private Integer postCount;

    private Boolean isPrivate;

    private Integer supportCount;

    private Integer isHot;

    private Integer falseNum;

    private Integer display;

    private Integer allowPost;

    private Integer defaultFollow;

    private Integer isAudit;

    private String group;

}