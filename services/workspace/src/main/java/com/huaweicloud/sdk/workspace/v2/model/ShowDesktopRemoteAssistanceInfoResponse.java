package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowDesktopRemoteAssistanceInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "share_space_id")

    private String shareSpaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invitation_code")

    private String invitationCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "share_space_name")

    private String shareSpaceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "share_space_passwd")

    private String shareSpacePasswd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_share_link")

    private String privateShareLink;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "internet_share_link")

    private String internetShareLink;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_reason")

    private String failedReason;

    public ShowDesktopRemoteAssistanceInfoResponse withShareSpaceId(String shareSpaceId) {
        this.shareSpaceId = shareSpaceId;
        return this;
    }

    /**
     * 协同空间ID
     * @return shareSpaceId
     */
    public String getShareSpaceId() {
        return shareSpaceId;
    }

    public void setShareSpaceId(String shareSpaceId) {
        this.shareSpaceId = shareSpaceId;
    }

    public ShowDesktopRemoteAssistanceInfoResponse withInvitationCode(String invitationCode) {
        this.invitationCode = invitationCode;
        return this;
    }

    /**
     * 协同空间邀请码(大写英文+数字,共8位)
     * @return invitationCode
     */
    public String getInvitationCode() {
        return invitationCode;
    }

    public void setInvitationCode(String invitationCode) {
        this.invitationCode = invitationCode;
    }

    public ShowDesktopRemoteAssistanceInfoResponse withShareSpaceName(String shareSpaceName) {
        this.shareSpaceName = shareSpaceName;
        return this;
    }

    /**
     * 协同空间名称
     * @return shareSpaceName
     */
    public String getShareSpaceName() {
        return shareSpaceName;
    }

    public void setShareSpaceName(String shareSpaceName) {
        this.shareSpaceName = shareSpaceName;
    }

    public ShowDesktopRemoteAssistanceInfoResponse withShareSpacePasswd(String shareSpacePasswd) {
        this.shareSpacePasswd = shareSpacePasswd;
        return this;
    }

    /**
     * 协同空间密码
     * @return shareSpacePasswd
     */
    public String getShareSpacePasswd() {
        return shareSpacePasswd;
    }

    public void setShareSpacePasswd(String shareSpacePasswd) {
        this.shareSpacePasswd = shareSpacePasswd;
    }

    public ShowDesktopRemoteAssistanceInfoResponse withPrivateShareLink(String privateShareLink) {
        this.privateShareLink = privateShareLink;
        return this;
    }

    /**
     * 专线分享链接
     * @return privateShareLink
     */
    public String getPrivateShareLink() {
        return privateShareLink;
    }

    public void setPrivateShareLink(String privateShareLink) {
        this.privateShareLink = privateShareLink;
    }

    public ShowDesktopRemoteAssistanceInfoResponse withInternetShareLink(String internetShareLink) {
        this.internetShareLink = internetShareLink;
        return this;
    }

    /**
     * 互联网分享链接
     * @return internetShareLink
     */
    public String getInternetShareLink() {
        return internetShareLink;
    }

    public void setInternetShareLink(String internetShareLink) {
        this.internetShareLink = internetShareLink;
    }

    public ShowDesktopRemoteAssistanceInfoResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间 UTC时间，格式为：yyyy-MM-dd'T'HH:mm:ss'Z'。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ShowDesktopRemoteAssistanceInfoResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 协同空间状态 - OPEN 协同空间已创建 - CLOSE 协同空间已关闭 - WAIT_USER_CONFIRM 等待用户确认进入远程协助 - WAIT_USER_ACCESS 等待用户进入远程协助
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowDesktopRemoteAssistanceInfoResponse withFailedReason(String failedReason) {
        this.failedReason = failedReason;
        return this;
    }

    /**
     * 失败原因
     * @return failedReason
     */
    public String getFailedReason() {
        return failedReason;
    }

    public void setFailedReason(String failedReason) {
        this.failedReason = failedReason;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDesktopRemoteAssistanceInfoResponse that = (ShowDesktopRemoteAssistanceInfoResponse) obj;
        return Objects.equals(this.shareSpaceId, that.shareSpaceId)
            && Objects.equals(this.invitationCode, that.invitationCode)
            && Objects.equals(this.shareSpaceName, that.shareSpaceName)
            && Objects.equals(this.shareSpacePasswd, that.shareSpacePasswd)
            && Objects.equals(this.privateShareLink, that.privateShareLink)
            && Objects.equals(this.internetShareLink, that.internetShareLink)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.status, that.status)
            && Objects.equals(this.failedReason, that.failedReason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shareSpaceId,
            invitationCode,
            shareSpaceName,
            shareSpacePasswd,
            privateShareLink,
            internetShareLink,
            createTime,
            status,
            failedReason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDesktopRemoteAssistanceInfoResponse {\n");
        sb.append("    shareSpaceId: ").append(toIndentedString(shareSpaceId)).append("\n");
        sb.append("    invitationCode: ").append(toIndentedString(invitationCode)).append("\n");
        sb.append("    shareSpaceName: ").append(toIndentedString(shareSpaceName)).append("\n");
        sb.append("    shareSpacePasswd: ").append(toIndentedString(shareSpacePasswd)).append("\n");
        sb.append("    privateShareLink: ").append(toIndentedString(privateShareLink)).append("\n");
        sb.append("    internetShareLink: ").append(toIndentedString(internetShareLink)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    failedReason: ").append(toIndentedString(failedReason)).append("\n");
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
