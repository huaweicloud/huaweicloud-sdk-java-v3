package com.huaweicloud.sdk.bcs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 被邀请列表
 */
public class InvitedDomain {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "invited_user")

    private String invitedUser;

    public InvitedDomain withInvitedUser(String invitedUser) {
        this.invitedUser = invitedUser;
        return this;
    }

    /**
     * 被邀请方租户
     * @return invitedUser
     */
    public String getInvitedUser() {
        return invitedUser;
    }

    public void setInvitedUser(String invitedUser) {
        this.invitedUser = invitedUser;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InvitedDomain that = (InvitedDomain) obj;
        return Objects.equals(this.invitedUser, that.invitedUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(invitedUser);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InvitedDomain {\n");
        sb.append("    invitedUser: ").append(toIndentedString(invitedUser)).append("\n");
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
