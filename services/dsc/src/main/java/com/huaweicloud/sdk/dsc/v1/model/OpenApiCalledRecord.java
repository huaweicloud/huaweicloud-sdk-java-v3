package com.huaweicloud.sdk.dsc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * OpenApi调用记录
 */
public class OpenApiCalledRecord {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_url")

    private String requestUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_method")

    private String requestMethod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response_code")

    private String responseCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_reason")

    private String failReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp")

    private Long timestamp;

    public OpenApiCalledRecord withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 调用API的user_name
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public OpenApiCalledRecord withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 调用API的user_id
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public OpenApiCalledRecord withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * 调用API的domain_name
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public OpenApiCalledRecord withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 调用API的domain_id
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public OpenApiCalledRecord withRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
        return this;
    }

    /**
     * 调用API的URL
     * @return requestUrl
     */
    public String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    public OpenApiCalledRecord withRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
        return this;
    }

    /**
     * http请求方法
     * @return requestMethod
     */
    public String getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    public OpenApiCalledRecord withResponseCode(String responseCode) {
        this.responseCode = responseCode;
        return this;
    }

    /**
     * http状态码
     * @return responseCode
     */
    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public OpenApiCalledRecord withFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }

    /**
     * 调用API失败原因
     * @return failReason
     */
    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }

    public OpenApiCalledRecord withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * 调用API的时间（Unix timestamp），单位：毫秒
     * @return timestamp
     */
    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OpenApiCalledRecord openApiCalledRecord = (OpenApiCalledRecord) o;
        return Objects.equals(this.userName, openApiCalledRecord.userName)
            && Objects.equals(this.userId, openApiCalledRecord.userId)
            && Objects.equals(this.domainName, openApiCalledRecord.domainName)
            && Objects.equals(this.domainId, openApiCalledRecord.domainId)
            && Objects.equals(this.requestUrl, openApiCalledRecord.requestUrl)
            && Objects.equals(this.requestMethod, openApiCalledRecord.requestMethod)
            && Objects.equals(this.responseCode, openApiCalledRecord.responseCode)
            && Objects.equals(this.failReason, openApiCalledRecord.failReason)
            && Objects.equals(this.timestamp, openApiCalledRecord.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName,
            userId,
            domainName,
            domainId,
            requestUrl,
            requestMethod,
            responseCode,
            failReason,
            timestamp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpenApiCalledRecord {\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    requestUrl: ").append(toIndentedString(requestUrl)).append("\n");
        sb.append("    requestMethod: ").append(toIndentedString(requestMethod)).append("\n");
        sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
        sb.append("    failReason: ").append(toIndentedString(failReason)).append("\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
