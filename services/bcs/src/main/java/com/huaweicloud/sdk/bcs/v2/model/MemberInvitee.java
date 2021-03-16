package com.huaweicloud.sdk.bcs.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 联盟成员中的被邀请方
 */
public class MemberInvitee  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="invitee_bcs_id")
    
    private String inviteeBcsId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="invitee_user_id")
    
    private String inviteeUserId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="invitee_username")
    
    private String inviteeUsername;

    public MemberInvitee withInviteeBcsId(String inviteeBcsId) {
        this.inviteeBcsId = inviteeBcsId;
        return this;
    }

    


    /**
     * 被邀请方实例id
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MemberInvitee memberInvitee = (MemberInvitee) o;
        return Objects.equals(this.inviteeBcsId, memberInvitee.inviteeBcsId) &&
            Objects.equals(this.inviteeUserId, memberInvitee.inviteeUserId) &&
            Objects.equals(this.inviteeUsername, memberInvitee.inviteeUsername);
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

