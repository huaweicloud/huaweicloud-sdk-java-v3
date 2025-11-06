package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MergeErrorDto
 */
public class MergeErrorDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merge_user_name")

    private String mergeUserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "merge_start_time")

    private String mergeStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_title")

    private String errorTitle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "http_code_status")

    private String httpCodeStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_message")

    private String errorMessage;

    public MergeErrorDto withMergeUserName(String mergeUserName) {
        this.mergeUserName = mergeUserName;
        return this;
    }

    /**
     * 合并人名字
     * @return mergeUserName
     */
    public String getMergeUserName() {
        return mergeUserName;
    }

    public void setMergeUserName(String mergeUserName) {
        this.mergeUserName = mergeUserName;
    }

    public MergeErrorDto withMergeStartTime(String mergeStartTime) {
        this.mergeStartTime = mergeStartTime;
        return this;
    }

    /**
     * 合入时间
     * @return mergeStartTime
     */
    public String getMergeStartTime() {
        return mergeStartTime;
    }

    public void setMergeStartTime(String mergeStartTime) {
        this.mergeStartTime = mergeStartTime;
    }

    public MergeErrorDto withErrorTitle(String errorTitle) {
        this.errorTitle = errorTitle;
        return this;
    }

    /**
     * 错误标题
     * @return errorTitle
     */
    public String getErrorTitle() {
        return errorTitle;
    }

    public void setErrorTitle(String errorTitle) {
        this.errorTitle = errorTitle;
    }

    public MergeErrorDto withHttpCodeStatus(String httpCodeStatus) {
        this.httpCodeStatus = httpCodeStatus;
        return this;
    }

    /**
     * 状态码
     * @return httpCodeStatus
     */
    public String getHttpCodeStatus() {
        return httpCodeStatus;
    }

    public void setHttpCodeStatus(String httpCodeStatus) {
        this.httpCodeStatus = httpCodeStatus;
    }

    public MergeErrorDto withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 错误码
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public MergeErrorDto withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * 错误信息
     * @return errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MergeErrorDto that = (MergeErrorDto) obj;
        return Objects.equals(this.mergeUserName, that.mergeUserName)
            && Objects.equals(this.mergeStartTime, that.mergeStartTime)
            && Objects.equals(this.errorTitle, that.errorTitle)
            && Objects.equals(this.httpCodeStatus, that.httpCodeStatus)
            && Objects.equals(this.errorCode, that.errorCode) && Objects.equals(this.errorMessage, that.errorMessage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mergeUserName, mergeStartTime, errorTitle, httpCodeStatus, errorCode, errorMessage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MergeErrorDto {\n");
        sb.append("    mergeUserName: ").append(toIndentedString(mergeUserName)).append("\n");
        sb.append("    mergeStartTime: ").append(toIndentedString(mergeStartTime)).append("\n");
        sb.append("    errorTitle: ").append(toIndentedString(errorTitle)).append("\n");
        sb.append("    httpCodeStatus: ").append(toIndentedString(httpCodeStatus)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
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
