package com.logbook.business.user.model;

import java.math.BigDecimal;

public class LogUserEntity {
    private Integer uid;

    private String account;

    private String pwd;

    private String nickname;

    private String avatar;

    private String phone;

    private String email;

    private Integer addTime;

    private String addIp;

    private Integer lastTime;

    private String lastIp;

    private BigDecimal nowMoney;

    private BigDecimal integral;

    private Integer signNum;

    private Boolean status;

    private Byte level;

    private Integer spreadUid;

    private Integer spreadTime;

    private String userType;

    private Boolean isPromoter;

    private Integer payCount;

    private Integer spreadCount;

    private Integer fans;

    private Integer follow;

    private Byte sex;

    private Integer birthday;

    private String qq;

    private String signature;

    private Integer loginTime;

    private Integer posProvince;

    private Integer posCity;

    private Integer posDistrict;

    private Integer posCommunity;

    private Integer totalSign;

    private Integer supportCount;

    private String introduction;

    private Integer forumCount;

    private Integer postCount;

    private Integer exp;

    private Integer fly;

    private Integer gong;

    private Integer buy;

    private Integer one;

    private Integer two;

    private Integer three;

    private Integer four;

    private Integer five;

    private Integer isCollect;

    private String icon;

    private Integer isRed;

    private String mark;

    private String realName;

    private Integer collect;

    private Integer isAvatar;

    private Integer isPassword;

    private Integer isVest;

    private Integer cateId;

    private Integer isInvite;

    private Integer bindImUid;

    private String userBackground;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public Integer getAddTime() {
        return addTime;
    }

    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }

    public String getAddIp() {
        return addIp;
    }

    public void setAddIp(String addIp) {
        this.addIp = addIp == null ? null : addIp.trim();
    }

    public Integer getLastTime() {
        return lastTime;
    }

    public void setLastTime(Integer lastTime) {
        this.lastTime = lastTime;
    }

    public String getLastIp() {
        return lastIp;
    }

    public void setLastIp(String lastIp) {
        this.lastIp = lastIp == null ? null : lastIp.trim();
    }

    public BigDecimal getNowMoney() {
        return nowMoney;
    }

    public void setNowMoney(BigDecimal nowMoney) {
        this.nowMoney = nowMoney;
    }

    public BigDecimal getIntegral() {
        return integral;
    }

    public void setIntegral(BigDecimal integral) {
        this.integral = integral;
    }

    public Integer getSignNum() {
        return signNum;
    }

    public void setSignNum(Integer signNum) {
        this.signNum = signNum;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Byte getLevel() {
        return level;
    }

    public void setLevel(Byte level) {
        this.level = level;
    }

    public Integer getSpreadUid() {
        return spreadUid;
    }

    public void setSpreadUid(Integer spreadUid) {
        this.spreadUid = spreadUid;
    }

    public Integer getSpreadTime() {
        return spreadTime;
    }

    public void setSpreadTime(Integer spreadTime) {
        this.spreadTime = spreadTime;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    public Boolean getIsPromoter() {
        return isPromoter;
    }

    public void setIsPromoter(Boolean isPromoter) {
        this.isPromoter = isPromoter;
    }

    public Integer getPayCount() {
        return payCount;
    }

    public void setPayCount(Integer payCount) {
        this.payCount = payCount;
    }

    public Integer getSpreadCount() {
        return spreadCount;
    }

    public void setSpreadCount(Integer spreadCount) {
        this.spreadCount = spreadCount;
    }

    public Integer getFans() {
        return fans;
    }

    public void setFans(Integer fans) {
        this.fans = fans;
    }

    public Integer getFollow() {
        return follow;
    }

    public void setFollow(Integer follow) {
        this.follow = follow;
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public Integer getBirthday() {
        return birthday;
    }

    public void setBirthday(Integer birthday) {
        this.birthday = birthday;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature == null ? null : signature.trim();
    }

    public Integer getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Integer loginTime) {
        this.loginTime = loginTime;
    }

    public Integer getPosProvince() {
        return posProvince;
    }

    public void setPosProvince(Integer posProvince) {
        this.posProvince = posProvince;
    }

    public Integer getPosCity() {
        return posCity;
    }

    public void setPosCity(Integer posCity) {
        this.posCity = posCity;
    }

    public Integer getPosDistrict() {
        return posDistrict;
    }

    public void setPosDistrict(Integer posDistrict) {
        this.posDistrict = posDistrict;
    }

    public Integer getPosCommunity() {
        return posCommunity;
    }

    public void setPosCommunity(Integer posCommunity) {
        this.posCommunity = posCommunity;
    }

    public Integer getTotalSign() {
        return totalSign;
    }

    public void setTotalSign(Integer totalSign) {
        this.totalSign = totalSign;
    }

    public Integer getSupportCount() {
        return supportCount;
    }

    public void setSupportCount(Integer supportCount) {
        this.supportCount = supportCount;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public Integer getForumCount() {
        return forumCount;
    }

    public void setForumCount(Integer forumCount) {
        this.forumCount = forumCount;
    }

    public Integer getPostCount() {
        return postCount;
    }

    public void setPostCount(Integer postCount) {
        this.postCount = postCount;
    }

    public Integer getExp() {
        return exp;
    }

    public void setExp(Integer exp) {
        this.exp = exp;
    }

    public Integer getFly() {
        return fly;
    }

    public void setFly(Integer fly) {
        this.fly = fly;
    }

    public Integer getGong() {
        return gong;
    }

    public void setGong(Integer gong) {
        this.gong = gong;
    }

    public Integer getBuy() {
        return buy;
    }

    public void setBuy(Integer buy) {
        this.buy = buy;
    }

    public Integer getOne() {
        return one;
    }

    public void setOne(Integer one) {
        this.one = one;
    }

    public Integer getTwo() {
        return two;
    }

    public void setTwo(Integer two) {
        this.two = two;
    }

    public Integer getThree() {
        return three;
    }

    public void setThree(Integer three) {
        this.three = three;
    }

    public Integer getFour() {
        return four;
    }

    public void setFour(Integer four) {
        this.four = four;
    }

    public Integer getFive() {
        return five;
    }

    public void setFive(Integer five) {
        this.five = five;
    }

    public Integer getIsCollect() {
        return isCollect;
    }

    public void setIsCollect(Integer isCollect) {
        this.isCollect = isCollect;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public Integer getIsRed() {
        return isRed;
    }

    public void setIsRed(Integer isRed) {
        this.isRed = isRed;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark == null ? null : mark.trim();
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public Integer getCollect() {
        return collect;
    }

    public void setCollect(Integer collect) {
        this.collect = collect;
    }

    public Integer getIsAvatar() {
        return isAvatar;
    }

    public void setIsAvatar(Integer isAvatar) {
        this.isAvatar = isAvatar;
    }

    public Integer getIsPassword() {
        return isPassword;
    }

    public void setIsPassword(Integer isPassword) {
        this.isPassword = isPassword;
    }

    public Integer getIsVest() {
        return isVest;
    }

    public void setIsVest(Integer isVest) {
        this.isVest = isVest;
    }

    public Integer getCateId() {
        return cateId;
    }

    public void setCateId(Integer cateId) {
        this.cateId = cateId;
    }

    public Integer getIsInvite() {
        return isInvite;
    }

    public void setIsInvite(Integer isInvite) {
        this.isInvite = isInvite;
    }

    public Integer getBindImUid() {
        return bindImUid;
    }

    public void setBindImUid(Integer bindImUid) {
        this.bindImUid = bindImUid;
    }

    public String getUserBackground() {
        return userBackground;
    }

    public void setUserBackground(String userBackground) {
        this.userBackground = userBackground == null ? null : userBackground.trim();
    }
}