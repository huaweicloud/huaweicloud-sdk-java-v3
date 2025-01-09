package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AdOuUserInfo
 */
public class AdOuUserInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expired_time")

    private String expiredTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_existed")

    private Boolean hasExisted;

    public AdOuUserInfo withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 名称
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public AdOuUserInfo withExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }

    /**
     * 过期时间 -1代表永不过期
     * @return expiredTime
     */
    public String getExpiredTime() {
        return expiredTime;
    }

    public void setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
    }

    public AdOuUserInfo withHasExisted(Boolean hasExisted) {
        this.hasExisted = hasExisted;
        return this;
    }

    /**
     * 是否存在于用户列表
     * @return hasExisted
     */
    public Boolean getHasExisted() {
        return hasExisted;
    }

    public void setHasExisted(Boolean hasExisted) {
        this.hasExisted = hasExisted;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdOuUserInfo that = (AdOuUserInfo) obj;
        return Objects.equals(this.userName, that.userName) && Objects.equals(this.expiredTime, that.expiredTime)
            && Objects.equals(this.hasExisted, that.hasExisted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, expiredTime, hasExisted);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdOuUserInfo {\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    expiredTime: ").append(toIndentedString(expiredTime)).append("\n");
        sb.append("    hasExisted: ").append(toIndentedString(hasExisted)).append("\n");
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
