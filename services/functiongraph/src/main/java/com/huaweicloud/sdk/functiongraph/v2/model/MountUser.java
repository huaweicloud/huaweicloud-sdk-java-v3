package com.huaweicloud.sdk.functiongraph.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 挂载用户信息。 */
public class MountUser {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private Integer userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_group_id")

    private Integer userGroupId;

    public MountUser withUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    /** 用户ID(-1~65534的非0整数)
     * 
     * @return userId */
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public MountUser withUserGroupId(Integer userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }

    /** 用户组ID(-1~65534的非0整数)
     * 
     * @return userGroupId */
    public Integer getUserGroupId() {
        return userGroupId;
    }

    public void setUserGroupId(Integer userGroupId) {
        this.userGroupId = userGroupId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MountUser mountUser = (MountUser) o;
        return Objects.equals(this.userId, mountUser.userId) && Objects.equals(this.userGroupId, mountUser.userGroupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userGroupId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MountUser {\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    userGroupId: ").append(toIndentedString(userGroupId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
