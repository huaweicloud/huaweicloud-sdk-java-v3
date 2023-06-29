package com.huaweicloud.sdk.bcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 联盟成员中的被邀请方
 */
public class MemberInvitee {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invitee_bcs_id")

    private String inviteeBcsId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invitee_user_id")

    private String inviteeUserId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invitee_username")

    private String inviteeUsername;

    public MemberInvitee withInviteeBcsId(String inviteeBcsId) {
        this.inviteeBcsId = inviteeBcsId;
        return this;
    }

    /**
     * 被邀请方BCS服务实例ID
     * @return inviteeBcsId
     */
    public String getInviteeBcsId() {
        return inviteeBcsId;
    }

    public void setInviteeBcsId(String inviteeBcsId) {
        this.inviteeBcsId = inviteeBcsId;
    }

    public MemberInvitee withInviteeUserId(String inviteeUserId) {
        this.inviteeUserId = inviteeUserId;
        return this;
    }

    /**
     * 被邀请方租户id
     * @return inviteeUserId
     */
    public String getInviteeUserId() {
        return inviteeUserId;
    }

    public void setInviteeUserId(String inviteeUserId) {
        this.inviteeUserId = inviteeUserId;
    }

    public MemberInvitee withInviteeUsername(String inviteeUsername) {
        this.inviteeUsername = inviteeUsername;
        return this;
    }

    /**
     * 被邀请方租户名
     * @return inviteeUsername
     */
    public String getInviteeUsername() {
        return inviteeUsername;
    }

    public void setInviteeUsername(String inviteeUsername) {
        this.inviteeUsername = inviteeUsername;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MemberInvitee that = (MemberInvitee) obj;
        return Objects.equals(this.inviteeBcsId, that.inviteeBcsId)
            && Objects.equals(this.inviteeUserId, that.inviteeUserId)
            && Objects.equals(this.inviteeUsername, that.inviteeUsername);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inviteeBcsId, inviteeUserId, inviteeUsername);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MemberInvitee {\n");
        sb.append("    inviteeBcsId: ").append(toIndentedString(inviteeBcsId)).append("\n");
        sb.append("    inviteeUserId: ").append(toIndentedString(inviteeUserId)).append("\n");
        sb.append("    inviteeUsername: ").append(toIndentedString(inviteeUsername)).append("\n");
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
