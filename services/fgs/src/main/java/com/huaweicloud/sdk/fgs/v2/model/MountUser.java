package com.huaweicloud.sdk.fgs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 挂载用户信息。
 */
public class MountUser  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_id")
    
    private String userId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="user_group_id")
    
    private String userGroupId;

    public MountUser withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    


    /**
     * 用户ID(-1~65534的非0整数)
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public MountUser withUserGroupId(String userGroupId) {
        this.userGroupId = userGroupId;
        return this;
    }

    


    /**
     * 用户组ID(-1~65534的非0整数)
     * @return userGroupId
     */
    public String getUserGroupId() {
        return userGroupId;
    }

    public void setUserGroupId(String userGroupId) {
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
        return Objects.equals(this.userId, mountUser.userId) &&
            Objects.equals(this.userGroupId, mountUser.userGroupId);
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

