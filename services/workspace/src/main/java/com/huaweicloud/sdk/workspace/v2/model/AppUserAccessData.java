package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AppUserAccessData
 */
public class AppUserAccessData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "username")

    private String username;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_failed_count")

    private Integer accessFailedCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_access_failed_time")

    private String lastAccessFailedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    public AppUserAccessData withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * 用户名称。
     * @return username
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public AppUserAccessData withAccessFailedCount(Integer accessFailedCount) {
        this.accessFailedCount = accessFailedCount;
        return this;
    }

    /**
     * 接入失败数。
     * @return accessFailedCount
     */
    public Integer getAccessFailedCount() {
        return accessFailedCount;
    }

    public void setAccessFailedCount(Integer accessFailedCount) {
        this.accessFailedCount = accessFailedCount;
    }

    public AppUserAccessData withLastAccessFailedTime(String lastAccessFailedTime) {
        this.lastAccessFailedTime = lastAccessFailedTime;
        return this;
    }

    /**
     * 最近一次接入失败时间，UTC时间，格式为：2022-05-11T11:45:42Z。
     * @return lastAccessFailedTime
     */
    public String getLastAccessFailedTime() {
        return lastAccessFailedTime;
    }

    public void setLastAccessFailedTime(String lastAccessFailedTime) {
        this.lastAccessFailedTime = lastAccessFailedTime;
    }

    public AppUserAccessData withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 错误码。
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public AppUserAccessData withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * 错误信息。
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AppUserAccessData that = (AppUserAccessData) obj;
        return Objects.equals(this.username, that.username)
            && Objects.equals(this.accessFailedCount, that.accessFailedCount)
            && Objects.equals(this.lastAccessFailedTime, that.lastAccessFailedTime)
            && Objects.equals(this.errorCode, that.errorCode) && Objects.equals(this.errorMsg, that.errorMsg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, accessFailedCount, lastAccessFailedTime, errorCode, errorMsg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppUserAccessData {\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    accessFailedCount: ").append(toIndentedString(accessFailedCount)).append("\n");
        sb.append("    lastAccessFailedTime: ").append(toIndentedString(lastAccessFailedTime)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
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
