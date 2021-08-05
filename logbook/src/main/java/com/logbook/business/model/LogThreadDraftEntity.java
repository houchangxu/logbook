package com.logbook.business.model;

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Boolean getIsAnnounce() {
        return isAnnounce;
    }

    public void setIsAnnounce(Boolean isAnnounce) {
        this.isAnnounce = isAnnounce;
    }

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public Byte getReadPerm() {
        return readPerm;
    }

    public void setReadPerm(Byte readPerm) {
        this.readPerm = readPerm;
    }

    public Integer getAuthorUid() {
        return authorUid;
    }

    public void setAuthorUid(Integer authorUid) {
        this.authorUid = authorUid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Integer getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    public Integer getLastPostTime() {
        return lastPostTime;
    }

    public void setLastPostTime(Integer lastPostTime) {
        this.lastPostTime = lastPostTime;
    }

    public Integer getLastPostUid() {
        return lastPostUid;
    }

    public void setLastPostUid(Integer lastPostUid) {
        this.lastPostUid = lastPostUid;
    }

    public Integer getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public Integer getReplyCount() {
        return replyCount;
    }

    public void setReplyCount(Integer replyCount) {
        this.replyCount = replyCount;
    }

    public Integer getSupportCount() {
        return supportCount;
    }

    public void setSupportCount(Integer supportCount) {
        this.supportCount = supportCount;
    }

    public Integer getShareCount() {
        return shareCount;
    }

    public void setShareCount(Integer shareCount) {
        this.shareCount = shareCount;
    }

    public Integer getCollectCount() {
        return collectCount;
    }

    public void setCollectCount(Integer collectCount) {
        this.collectCount = collectCount;
    }

    public Boolean getSort() {
        return sort;
    }

    public void setSort(Boolean sort) {
        this.sort = sort;
    }

    public Boolean getHighLight() {
        return highLight;
    }

    public void setHighLight(Boolean highLight) {
        this.highLight = highLight;
    }

    public Boolean getIsEssence() {
        return isEssence;
    }

    public void setIsEssence(Boolean isEssence) {
        this.isEssence = isEssence;
    }

    public Boolean getIsTop() {
        return isTop;
    }

    public void setIsTop(Boolean isTop) {
        this.isTop = isTop;
    }

    public Integer getAttachmentId() {
        return attachmentId;
    }

    public void setAttachmentId(Integer attachmentId) {
        this.attachmentId = attachmentId;
    }

    public Boolean getIsVerify() {
        return isVerify;
    }

    public void setIsVerify(Boolean isVerify) {
        this.isVerify = isVerify;
    }

    public Boolean getStickReply() {
        return stickReply;
    }

    public void setStickReply(Boolean stickReply) {
        this.stickReply = stickReply;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover == null ? null : cover.trim();
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from == null ? null : from.trim();
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos == null ? null : pos.trim();
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public Integer getIsMassage() {
        return isMassage;
    }

    public void setIsMassage(Integer isMassage) {
        this.isMassage = isMassage;
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId == null ? null : videoId.trim();
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl == null ? null : videoUrl.trim();
    }

    public String getRejectReason() {
        return rejectReason;
    }

    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason == null ? null : rejectReason.trim();
    }

    public String getDeleteReason() {
        return deleteReason;
    }

    public void setDeleteReason(String deleteReason) {
        this.deleteReason = deleteReason == null ? null : deleteReason.trim();
    }

    public String getVideoCover() {
        return videoCover;
    }

    public void setVideoCover(String videoCover) {
        this.videoCover = videoCover == null ? null : videoCover.trim();
    }

    public String getDelUser() {
        return delUser;
    }

    public void setDelUser(String delUser) {
        this.delUser = delUser == null ? null : delUser.trim();
    }

    public Integer getFalseView() {
        return falseView;
    }

    public void setFalseView(Integer falseView) {
        this.falseView = falseView;
    }

    public Integer getIsWeibo() {
        return isWeibo;
    }

    public void setIsWeibo(Integer isWeibo) {
        this.isWeibo = isWeibo;
    }

    public Integer getDetailTop() {
        return detailTop;
    }

    public void setDetailTop(Integer detailTop) {
        this.detailTop = detailTop;
    }

    public Integer getIndexTop() {
        return indexTop;
    }

    public void setIndexTop(Integer indexTop) {
        this.indexTop = indexTop;
    }

    public Integer getIsNew() {
        return isNew;
    }

    public void setIsNew(Integer isNew) {
        this.isNew = isNew;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid == null ? null : oid.trim();
    }

    public Integer getSendTime() {
        return sendTime;
    }

    public void setSendTime(Integer sendTime) {
        this.sendTime = sendTime;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }
}