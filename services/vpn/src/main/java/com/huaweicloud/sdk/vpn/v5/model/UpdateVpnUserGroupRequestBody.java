package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateVpnUserGroupRequestBody
 */
public class UpdateVpnUserGroupRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_group")

    private UpdateVpnUserGroupRequestBodyContent userGroup;

    public UpdateVpnUserGroupRequestBody withUserGroup(UpdateVpnUserGroupRequestBodyContent userGroup) {
        this.userGroup = userGroup;
        return this;
    }

    public UpdateVpnUserGroupRequestBody withUserGroup(Consumer<UpdateVpnUserGroupRequestBodyContent> userGroupSetter) {
        if (this.userGroup == null) {
            this.userGroup = new UpdateVpnUserGroupRequestBodyContent();
            userGroupSetter.accept(this.userGroup);
        }

        return this;
    }

    /**
     * Get userGroup
     * @return userGroup
     */
    public UpdateVpnUserGroupRequestBodyContent getUserGroup() {
        return userGroup;
    }

    public void setUserGroup(UpdateVpnUserGroupRequestBodyContent userGroup) {
        this.userGroup = userGroup;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateVpnUserGroupRequestBody that = (UpdateVpnUserGroupRequestBody) obj;
        return Objects.equals(this.userGroup, that.userGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userGroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateVpnUserGroupRequestBody {\n");
        sb.append("    userGroup: ").append(toIndentedString(userGroup)).append("\n");
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
