package com.huaweicloud.sdk.bcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 被邀请方的信息
 */
public class InviteeInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invitee_id")

    private String inviteeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invitee_name")

    private Long inviteeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invitee_bcs_name")

    private String inviteeBcsName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invitee_bcs_id")

    private String inviteeBcsId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invitee_project_id")

    private String inviteeProjectId;

    public InviteeInfo withInviteeId(String inviteeId) {
        this.inviteeId = inviteeId;
        return this;
    }

    /**
     * 被邀请用户id
     * @return inviteeId
     */
    public String getInviteeId() {
        return inviteeId;
    }

    public void setInviteeId(String inviteeId) {
        this.inviteeId = inviteeId;
    }

    public InviteeInfo withInviteeName(Long inviteeName) {
        this.inviteeName = inviteeName;
        return this;
    }

    /**
     * 被邀请租户名称
     * @return inviteeName
     */
    public Long getInviteeName() {
        return inviteeName;
    }

    public void setInviteeName(Long inviteeName) {
        this.inviteeName = inviteeName;
    }

    public InviteeInfo withInviteeBcsName(String inviteeBcsName) {
        this.inviteeBcsName = inviteeBcsName;
        return this;
    }

    /**
     * 被邀请的服务名称
     * @return inviteeBcsName
     */
    public String getInviteeBcsName() {
        return inviteeBcsName;
    }

    public void setInviteeBcsName(String inviteeBcsName) {
        this.inviteeBcsName = inviteeBcsName;
    }

    public InviteeInfo withInviteeBcsId(String inviteeBcsId) {
        this.inviteeBcsId = inviteeBcsId;
        return this;
    }

    /**
     * 被邀请的服务id
     * @return inviteeBcsId
     */
    public String getInviteeBcsId() {
        return inviteeBcsId;
    }

    public void setInviteeBcsId(String inviteeBcsId) {
        this.inviteeBcsId = inviteeBcsId;
    }

    public InviteeInfo withInviteeProjectId(String inviteeProjectId) {
        this.inviteeProjectId = inviteeProjectId;
        return this;
    }

    /**
     * 被邀请的项目id
     * @return inviteeProjectId
     */
    public String getInviteeProjectId() {
        return inviteeProjectId;
    }

    public void setInviteeProjectId(String inviteeProjectId) {
        this.inviteeProjectId = inviteeProjectId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InviteeInfo inviteeInfo = (InviteeInfo) o;
        return Objects.equals(this.inviteeId, inviteeInfo.inviteeId)
            && Objects.equals(this.inviteeName, inviteeInfo.inviteeName)
            && Objects.equals(this.inviteeBcsName, inviteeInfo.inviteeBcsName)
            && Objects.equals(this.inviteeBcsId, inviteeInfo.inviteeBcsId)
            && Objects.equals(this.inviteeProjectId, inviteeInfo.inviteeProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inviteeId, inviteeName, inviteeBcsName, inviteeBcsId, inviteeProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InviteeInfo {\n");
        sb.append("    inviteeId: ").append(toIndentedString(inviteeId)).append("\n");
        sb.append("    inviteeName: ").append(toIndentedString(inviteeName)).append("\n");
        sb.append("    inviteeBcsName: ").append(toIndentedString(inviteeBcsName)).append("\n");
        sb.append("    inviteeBcsId: ").append(toIndentedString(inviteeBcsId)).append("\n");
        sb.append("    inviteeProjectId: ").append(toIndentedString(inviteeProjectId)).append("\n");
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
