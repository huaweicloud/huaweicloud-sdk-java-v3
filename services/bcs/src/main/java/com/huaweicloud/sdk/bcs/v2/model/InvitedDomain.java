package com.huaweicloud.sdk.bcs.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 被邀请列表
 */
public class InvitedDomain  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="invited_username")
    
    private String invitedUsername;

    public InvitedDomain withInvitedUsername(String invitedUsername) {
        this.invitedUsername = invitedUsername;
        return this;
    }

    


    /**
     * 被邀请方租户名
     * @return invitedUsername
     */
    public String getInvitedUsername() {
        return invitedUsername;
    }

    public void setInvitedUsername(String invitedUsername) {
        this.invitedUsername = invitedUsername;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        InvitedDomain invitedDomain = (InvitedDomain) o;
        return Objects.equals(this.invitedUsername, invitedDomain.invitedUsername);
    }
    @Override
    public int hashCode() {
        return Objects.hash(invitedUsername);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InvitedDomain {\n");
        sb.append("    invitedUsername: ").append(toIndentedString(invitedUsername)).append("\n");
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

