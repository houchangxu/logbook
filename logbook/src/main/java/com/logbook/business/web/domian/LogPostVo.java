package com.logbook.business.web.domian;

import lombok.Data;

@Data
public class LogPostVo {
    private Integer id;

    private Integer fid;

    private Integer tid;

    private Integer toReplyId;

    private Integer toReplyUid;

    private Boolean isThread;

    private Byte level;

    private Integer position;

    private Integer authorUid;

    private String title;

    private Integer createTime;

    private Integer updateTime;

    private Byte status;

    private Integer attachmentId;

    private Boolean isAnonymous;

    private String content;

    private Byte isTop;

    private Integer commentCount;

    private Integer supportCount;

    private String from;

    private Boolean isHide;

    private Boolean isEssence;

    private Boolean isRecommend;

    private Integer collectCount;

    private String image;

    private String videoShow;

    private Integer delTime;

    private String delUser;

    private Integer isVest;

    private Integer eventId;

}