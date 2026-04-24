package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 查询订阅用户信息
 */
public class SubscribeUserInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_phone")

    private String userPhone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ai_func")

    private Boolean aiFunc;

    public SubscribeUserInfo withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 用户id。
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public SubscribeUserInfo withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 桌面用户名。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public SubscribeUserInfo withUserPhone(String userPhone) {
        this.userPhone = userPhone;
        return this;
    }

    /**
     * 用户手机号。
     * @return userPhone
     */
    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public SubscribeUserInfo withAiFunc(Boolean aiFunc) {
        this.aiFunc = aiFunc;
        return this;
    }

    /**
     * ai 功能是否启用。 * true： 启用 * false： 不启用
     * @return aiFunc
     */
    public Boolean getAiFunc() {
        return aiFunc;
    }

    public void setAiFunc(Boolean aiFunc) {
        this.aiFunc = aiFunc;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubscribeUserInfo that = (SubscribeUserInfo) obj;
        return Objects.equals(this.userId, that.userId) && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.userPhone, that.userPhone) && Objects.equals(this.aiFunc, that.aiFunc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userName, userPhone, aiFunc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubscribeUserInfo {\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    userPhone: ").append(toIndentedString(userPhone)).append("\n");
        sb.append("    aiFunc: ").append(toIndentedString(aiFunc)).append("\n");
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
