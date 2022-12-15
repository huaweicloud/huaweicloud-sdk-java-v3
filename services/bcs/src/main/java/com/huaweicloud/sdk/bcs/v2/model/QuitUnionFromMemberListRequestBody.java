package com.huaweicloud.sdk.bcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * QuitUnionFromMemberListRequestBody
 */
public class QuitUnionFromMemberListRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inviter_bcsid")

    private String inviterBcsid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inviter_projectid")

    private String inviterProjectid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inviter_domainid")

    private String inviterDomainid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "inviter_username")

    private String inviterUsername;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "channel_name")

    private String channelName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invitee_bcsid")

    private String inviteeBcsid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invitee_projectid")

    private String inviteeProjectid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invitee_domainid")

    private String inviteeDomainid;

    public QuitUnionFromMemberListRequestBody withInviterBcsid(String inviterBcsid) {
        this.inviterBcsid = inviterBcsid;
        return this;
    }

    /**
     * 邀请方BCS服务实例ID。可调用“查询服务实例列表”接口获取对应的ID
     * @return inviterBcsid
     */
    public String getInviterBcsid() {
        return inviterBcsid;
    }

    public void setInviterBcsid(String inviterBcsid) {
        this.inviterBcsid = inviterBcsid;
    }

    public QuitUnionFromMemberListRequestBody withInviterProjectid(String inviterProjectid) {
        this.inviterProjectid = inviterProjectid;
        return this;
    }

    /**
     * 邀请方项目ID。控制台->邀请方帐号->我的凭证->API凭证->项目列表，选择对应的项目ID
     * @return inviterProjectid
     */
    public String getInviterProjectid() {
        return inviterProjectid;
    }

    public void setInviterProjectid(String inviterProjectid) {
        this.inviterProjectid = inviterProjectid;
    }

    public QuitUnionFromMemberListRequestBody withInviterDomainid(String inviterDomainid) {
        this.inviterDomainid = inviterDomainid;
        return this;
    }

    /**
     * 邀请方租户ID。控制台->邀请方帐号->我的凭证->API凭证->帐号ID
     * @return inviterDomainid
     */
    public String getInviterDomainid() {
        return inviterDomainid;
    }

    public void setInviterDomainid(String inviterDomainid) {
        this.inviterDomainid = inviterDomainid;
    }

    public QuitUnionFromMemberListRequestBody withInviterUsername(String inviterUsername) {
        this.inviterUsername = inviterUsername;
        return this;
    }

    /**
     * 邀请方租户名称。控制台->邀请方帐号->我的凭证->API凭证->帐号名
     * @return inviterUsername
     */
    public String getInviterUsername() {
        return inviterUsername;
    }

    public void setInviterUsername(String inviterUsername) {
        this.inviterUsername = inviterUsername;
    }

    public QuitUnionFromMemberListRequestBody withChannelName(String channelName) {
        this.channelName = channelName;
        return this;
    }

    /**
     * 联盟通道名称。BCS管理面->成员管理->通道，选择对应的邀请的通道
     * @return channelName
     */
    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public QuitUnionFromMemberListRequestBody withInviteeBcsid(String inviteeBcsid) {
        this.inviteeBcsid = inviteeBcsid;
        return this;
    }

    /**
     * 被邀请方BCS服务实例ID。可调用“查询服务实例列表”接口获取对应的id
     * @return inviteeBcsid
     */
    public String getInviteeBcsid() {
        return inviteeBcsid;
    }

    public void setInviteeBcsid(String inviteeBcsid) {
        this.inviteeBcsid = inviteeBcsid;
    }

    public QuitUnionFromMemberListRequestBody withInviteeProjectid(String inviteeProjectid) {
        this.inviteeProjectid = inviteeProjectid;
        return this;
    }

    /**
     * 被邀请方项目ID。控制台->被邀请方帐号->我的凭证->API凭证->项目列表，选择对应的项目ID
     * @return inviteeProjectid
     */
    public String getInviteeProjectid() {
        return inviteeProjectid;
    }

    public void setInviteeProjectid(String inviteeProjectid) {
        this.inviteeProjectid = inviteeProjectid;
    }

    public QuitUnionFromMemberListRequestBody withInviteeDomainid(String inviteeDomainid) {
        this.inviteeDomainid = inviteeDomainid;
        return this;
    }

    /**
     * 被邀请方租户ID。控制台->被邀请方帐号->我的凭证->API凭证->帐号ID
     * @return inviteeDomainid
     */
    public String getInviteeDomainid() {
        return inviteeDomainid;
    }

    public void setInviteeDomainid(String inviteeDomainid) {
        this.inviteeDomainid = inviteeDomainid;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QuitUnionFromMemberListRequestBody quitUnionFromMemberListRequestBody = (QuitUnionFromMemberListRequestBody) o;
        return Objects.equals(this.inviterBcsid, quitUnionFromMemberListRequestBody.inviterBcsid)
            && Objects.equals(this.inviterProjectid, quitUnionFromMemberListRequestBody.inviterProjectid)
            && Objects.equals(this.inviterDomainid, quitUnionFromMemberListRequestBody.inviterDomainid)
            && Objects.equals(this.inviterUsername, quitUnionFromMemberListRequestBody.inviterUsername)
            && Objects.equals(this.channelName, quitUnionFromMemberListRequestBody.channelName)
            && Objects.equals(this.inviteeBcsid, quitUnionFromMemberListRequestBody.inviteeBcsid)
            && Objects.equals(this.inviteeProjectid, quitUnionFromMemberListRequestBody.inviteeProjectid)
            && Objects.equals(this.inviteeDomainid, quitUnionFromMemberListRequestBody.inviteeDomainid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inviterBcsid,
            inviterProjectid,
            inviterDomainid,
            inviterUsername,
            channelName,
            inviteeBcsid,
            inviteeProjectid,
            inviteeDomainid);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QuitUnionFromMemberListRequestBody {\n");
        sb.append("    inviterBcsid: ").append(toIndentedString(inviterBcsid)).append("\n");
        sb.append("    inviterProjectid: ").append(toIndentedString(inviterProjectid)).append("\n");
        sb.append("    inviterDomainid: ").append(toIndentedString(inviterDomainid)).append("\n");
        sb.append("    inviterUsername: ").append(toIndentedString(inviterUsername)).append("\n");
        sb.append("    channelName: ").append(toIndentedString(channelName)).append("\n");
        sb.append("    inviteeBcsid: ").append(toIndentedString(inviteeBcsid)).append("\n");
        sb.append("    inviteeProjectid: ").append(toIndentedString(inviteeProjectid)).append("\n");
        sb.append("    inviteeDomainid: ").append(toIndentedString(inviteeDomainid)).append("\n");
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
