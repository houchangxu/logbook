package com.logbook.business.model;

import lombok.Data;

@Data
public class LogThreadDraftEntity {
    private Integer id;

    private Integer cid;

    private Byte type;

    private Boolean isAnnounce;

    private Integer postId;

    private Byte readPerm;

    private Integer authorUid;

    private String title;

    private String content;

    private Integer createTime;

    private Integer lastPostTime;

    private Integer lastPostUid;

    private Integer updateTime;

    private Integer viewCount;

    private Integer replyCount;

    private Integer supportCount;

    private Integer shareCount;

    private Integer collectCount;

    private Boolean sort;

    private Boolean highLight;

    private Boolean isEssence;

    private Boolean isTop;

    private Integer attachmentId;

    private Boolean isVerify;

    private Boolean stickReply;

    private Byte status;

    private String cover;

    private Integer classId;

    private String summary;

    private String image;

    private String from;

    private String pos;

    private Integer position;

    private String productId;

    private Integer isMassage;

    private String videoId;

    private String videoUrl;

    private String rejectReason;

    private String deleteReason;

    private String videoCover;

    private String delUser;

    private Integer falseView;

    private Integer isWeibo;

    private Integer detailTop;

    private Integer indexTop;

    private Integer isNew;

    private String oid;

    private Integer sendTime;

    private String keywords;

}