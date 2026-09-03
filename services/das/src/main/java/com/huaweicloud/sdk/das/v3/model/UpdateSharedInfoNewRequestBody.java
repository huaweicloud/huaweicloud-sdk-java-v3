package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 更新共享信息请求体
 */
public class UpdateSharedInfoNewRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "new_user_name")

    private String newUserName;

    public UpdateSharedInfoNewRequestBody withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 修改后共享的新用户ID
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public UpdateSharedInfoNewRequestBody withNewUserName(String newUserName) {
        this.newUserName = newUserName;
        return this;
    }

    /**
     * 修改后共享的新用户名
     * @return newUserName
     */
    public String getNewUserName() {
        return newUserName;
    }

    public void setNewUserName(String newUserName) {
        this.newUserName = newUserName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateSharedInfoNewRequestBody that = (UpdateSharedInfoNewRequestBody) obj;
        return Objects.equals(this.userId, that.userId) && Objects.equals(this.newUserName, that.newUserName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, newUserName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSharedInfoNewRequestBody {\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    newUserName: ").append(toIndentedString(newUserName)).append("\n");
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
