package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 修改会议配置请求。
 */
public class UpdateStartedConfigReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lockSharing")

    private Integer lockSharing;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "callInRestriction")

    private Integer callInRestriction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allowUnmuteByOneself")

    private Integer allowUnmuteByOneself;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chatPermission")

    private Integer chatPermission;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audienceCallInRestriction")

    private Integer audienceCallInRestriction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clientRecMode")

    private Integer clientRecMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allowOpenCamera")

    private Integer allowOpenCamera;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "allowRename")

    private Integer allowRename;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isLock")

    private Integer isLock;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "freeShare")

    private Integer freeShare;

    public UpdateStartedConfigReqBody withLockSharing(Integer lockSharing) {
        this.lockSharing = lockSharing;
        return this;
    }

    /**
     * 锁定共享标志位。 * 0: 不锁定 * 1: 锁定 
     * minimum: 0
     * maximum: 1
     * @return lockSharing
     */
    public Integer getLockSharing() {
        return lockSharing;
    }

    public void setLockSharing(Integer lockSharing) {
        this.lockSharing = lockSharing;
    }

    public UpdateStartedConfigReqBody withCallInRestriction(Integer callInRestriction) {
        this.callInRestriction = callInRestriction;
        return this;
    }

    /**
     * 允许加入会议的范围。 - 0: 所有用户 - 2: 企业内用户 - 3: 被邀请用户 
     * minimum: 0
     * maximum: 3
     * @return callInRestriction
     */
    public Integer getCallInRestriction() {
        return callInRestriction;
    }

    public void setCallInRestriction(Integer callInRestriction) {
        this.callInRestriction = callInRestriction;
    }

    public UpdateStartedConfigReqBody withAllowUnmuteByOneself(Integer allowUnmuteByOneself) {
        this.allowUnmuteByOneself = allowUnmuteByOneself;
        return this;
    }

    /**
     * 是否允许自己解除静音，默认为允许 - 0: 不允许 - 1: 允许 
     * minimum: 0
     * maximum: 1
     * @return allowUnmuteByOneself
     */
    public Integer getAllowUnmuteByOneself() {
        return allowUnmuteByOneself;
    }

    public void setAllowUnmuteByOneself(Integer allowUnmuteByOneself) {
        this.allowUnmuteByOneself = allowUnmuteByOneself;
    }

    public UpdateStartedConfigReqBody withChatPermission(Integer chatPermission) {
        this.chatPermission = chatPermission;
        return this;
    }

    /**
     * 会议聊天权限 1.全员禁止 2.仅允许私聊 3.仅允许公开聊天 4.允许自由聊天
     * minimum: 1
     * maximum: 4
     * @return chatPermission
     */
    public Integer getChatPermission() {
        return chatPermission;
    }

    public void setChatPermission(Integer chatPermission) {
        this.chatPermission = chatPermission;
    }

    public UpdateStartedConfigReqBody withAudienceCallInRestriction(Integer audienceCallInRestriction) {
        this.audienceCallInRestriction = audienceCallInRestriction;
        return this;
    }

    /**
     * 网络研讨会观众允许呼入的范围 0：所有用户  2：企业内用户和被邀请用户
     * minimum: 0
     * maximum: 2
     * @return audienceCallInRestriction
     */
    public Integer getAudienceCallInRestriction() {
        return audienceCallInRestriction;
    }

    public void setAudienceCallInRestriction(Integer audienceCallInRestriction) {
        this.audienceCallInRestriction = audienceCallInRestriction;
    }

    public UpdateStartedConfigReqBody withClientRecMode(Integer clientRecMode) {
        this.clientRecMode = clientRecMode;
        return this;
    }

    /**
     * 客户端本地录制权限的范围，默认为仅主持人支持本地录制 - 0: 所有用户 - 1：全部人可录制 - 2：部分人可录制 
     * minimum: 0
     * maximum: 2
     * @return clientRecMode
     */
    public Integer getClientRecMode() {
        return clientRecMode;
    }

    public void setClientRecMode(Integer clientRecMode) {
        this.clientRecMode = clientRecMode;
    }

    public UpdateStartedConfigReqBody withAllowOpenCamera(Integer allowOpenCamera) {
        this.allowOpenCamera = allowOpenCamera;
        return this;
    }

    /**
     * 与会人自行开启摄像头 0:禁止 1:允许
     * minimum: 0
     * maximum: 1
     * @return allowOpenCamera
     */
    public Integer getAllowOpenCamera() {
        return allowOpenCamera;
    }

    public void setAllowOpenCamera(Integer allowOpenCamera) {
        this.allowOpenCamera = allowOpenCamera;
    }

    public UpdateStartedConfigReqBody withAllowRename(Integer allowRename) {
        this.allowRename = allowRename;
        return this;
    }

    /**
     * 是否允许与会人改名 0:不允许 1:允许
     * minimum: 0
     * maximum: 1
     * @return allowRename
     */
    public Integer getAllowRename() {
        return allowRename;
    }

    public void setAllowRename(Integer allowRename) {
        this.allowRename = allowRename;
    }

    public UpdateStartedConfigReqBody withIsLock(Integer isLock) {
        this.isLock = isLock;
        return this;
    }

    /**
     * 锁定会议 0：解锁 1：锁定
     * minimum: 0
     * maximum: 1
     * @return isLock
     */
    public Integer getIsLock() {
        return isLock;
    }

    public void setIsLock(Integer isLock) {
        this.isLock = isLock;
    }

    public UpdateStartedConfigReqBody withFreeShare(Integer freeShare) {
        this.freeShare = freeShare;
        return this;
    }

    /**
     * 抢共享权限设置 0:仅主持人/联席 1:所有人可抢共享
     * minimum: 0
     * maximum: 1
     * @return freeShare
     */
    public Integer getFreeShare() {
        return freeShare;
    }

    public void setFreeShare(Integer freeShare) {
        this.freeShare = freeShare;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateStartedConfigReqBody that = (UpdateStartedConfigReqBody) obj;
        return Objects.equals(this.lockSharing, that.lockSharing)
            && Objects.equals(this.callInRestriction, that.callInRestriction)
            && Objects.equals(this.allowUnmuteByOneself, that.allowUnmuteByOneself)
            && Objects.equals(this.chatPermission, that.chatPermission)
            && Objects.equals(this.audienceCallInRestriction, that.audienceCallInRestriction)
            && Objects.equals(this.clientRecMode, that.clientRecMode)
            && Objects.equals(this.allowOpenCamera, that.allowOpenCamera)
            && Objects.equals(this.allowRename, that.allowRename) && Objects.equals(this.isLock, that.isLock)
            && Objects.equals(this.freeShare, that.freeShare);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lockSharing,
            callInRestriction,
            allowUnmuteByOneself,
            chatPermission,
            audienceCallInRestriction,
            clientRecMode,
            allowOpenCamera,
            allowRename,
            isLock,
            freeShare);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateStartedConfigReqBody {\n");
        sb.append("    lockSharing: ").append(toIndentedString(lockSharing)).append("\n");
        sb.append("    callInRestriction: ").append(toIndentedString(callInRestriction)).append("\n");
        sb.append("    allowUnmuteByOneself: ").append(toIndentedString(allowUnmuteByOneself)).append("\n");
        sb.append("    chatPermission: ").append(toIndentedString(chatPermission)).append("\n");
        sb.append("    audienceCallInRestriction: ").append(toIndentedString(audienceCallInRestriction)).append("\n");
        sb.append("    clientRecMode: ").append(toIndentedString(clientRecMode)).append("\n");
        sb.append("    allowOpenCamera: ").append(toIndentedString(allowOpenCamera)).append("\n");
        sb.append("    allowRename: ").append(toIndentedString(allowRename)).append("\n");
        sb.append("    isLock: ").append(toIndentedString(isLock)).append("\n");
        sb.append("    freeShare: ").append(toIndentedString(freeShare)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
