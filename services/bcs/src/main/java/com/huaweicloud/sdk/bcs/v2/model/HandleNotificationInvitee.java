package com.huaweicloud.sdk.bcs.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * HandleNotificationInvitee
 */
public class HandleNotificationInvitee  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="invitee_bcs_id")
    
    private String inviteeBcsId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="invitee_bcs_name")
    
    private String inviteeBcsName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="invitee_project_id")
    
    private String inviteeProjectId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="invitee_user_id")
    
    private String inviteeUserId;

    public HandleNotificationInvitee withInviteeBcsId(String inviteeBcsId) {
        this.inviteeBcsId = inviteeBcsId;
        return this;
    }

    


    /**
     * 被邀请方服务实例id
     * @return inviteeBcsId
     */
    public String getInviteeBcsId() {
        return inviteeBcsId;
    }

    public void setInviteeBcsId(String inviteeBcsId) {
        this.inviteeBcsId = inviteeBcsId;
    }

    public HandleNotificationInvitee withInviteeBcsName(String inviteeBcsName) {
        this.inviteeBcsName = inviteeBcsName;
        return this;
    }

    


    /**
     * 被邀请方服务实例名称，同意联盟邀请时比填
     * @return inviteeBcsName
     */
    public String getInviteeBcsName() {
        return inviteeBcsName;
    }

    public void setInviteeBcsName(String inviteeBcsName) {
        this.inviteeBcsName = inviteeBcsName;
    }

    public HandleNotificationInvitee withInviteeProjectId(String inviteeProjectId) {
        this.inviteeProjectId = inviteeProjectId;
        return this;
    }

    


    /**
     * 被邀请方project id
     * @return inviteeProjectId
     */
    public String getInviteeProjectId() {
        return inviteeProjectId;
    }

    public void setInviteeProjectId(String inviteeProjectId) {
        this.inviteeProjectId = inviteeProjectId;
    }

    public HandleNotificationInvitee withInviteeUserId(String inviteeUserId) {
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
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HandleNotificationInvitee handleNotificationInvitee = (HandleNotificationInvitee) o;
        return Objects.equals(this.inviteeBcsId, handleNotificationInvitee.inviteeBcsId) &&
            Objects.equals(this.inviteeBcsName, handleNotificationInvitee.inviteeBcsName) &&
            Objects.equals(this.inviteeProjectId, handleNotificationInvitee.inviteeProjectId) &&
            Objects.equals(this.inviteeUserId, handleNotificationInvitee.inviteeUserId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(inviteeBcsId, inviteeBcsName, inviteeProjectId, inviteeUserId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HandleNotificationInvitee {\n");
        sb.append("    inviteeBcsId: ").append(toIndentedString(inviteeBcsId)).append("\n");
        sb.append("    inviteeBcsName: ").append(toIndentedString(inviteeBcsName)).append("\n");
        sb.append("    inviteeProjectId: ").append(toIndentedString(inviteeProjectId)).append("\n");
        sb.append("    inviteeUserId: ").append(toIndentedString(inviteeUserId)).append("\n");
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

