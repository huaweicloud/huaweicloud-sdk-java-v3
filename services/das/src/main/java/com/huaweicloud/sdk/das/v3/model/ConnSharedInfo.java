package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 共享连接信息
 */
public class ConnSharedInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shared_time")

    private Long sharedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expired_time")

    private Long expiredTime;

    public ConnSharedInfo withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 用户ID
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ConnSharedInfo withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 用户名
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ConnSharedInfo withSharedTime(Long sharedTime) {
        this.sharedTime = sharedTime;
        return this;
    }

    /**
     * 共享连接创建时间
     * @return sharedTime
     */
    public Long getSharedTime() {
        return sharedTime;
    }

    public void setSharedTime(Long sharedTime) {
        this.sharedTime = sharedTime;
    }

    public ConnSharedInfo withExpiredTime(Long expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }

    /**
     * 共享连接过期时间
     * @return expiredTime
     */
    public Long getExpiredTime() {
        return expiredTime;
    }

    public void setExpiredTime(Long expiredTime) {
        this.expiredTime = expiredTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConnSharedInfo that = (ConnSharedInfo) obj;
        return Objects.equals(this.userId, that.userId) && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.sharedTime, that.sharedTime) && Objects.equals(this.expiredTime, that.expiredTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userName, sharedTime, expiredTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConnSharedInfo {\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    sharedTime: ").append(toIndentedString(sharedTime)).append("\n");
        sb.append("    expiredTime: ").append(toIndentedString(expiredTime)).append("\n");
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
