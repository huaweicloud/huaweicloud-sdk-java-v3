package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 数据服务集群访问日志。
 */
public class InstanceAccesslog {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_id")

    private String apiId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_name")

    private String apiName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_time")

    private Long accessTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Long duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_code")

    private String statusCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_message")

    private String errorMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail")

    private String detail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "in_flow_size")

    private Long inFlowSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "out_flow_size")

    private Long outFlowSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "out_total_size")

    private Long outTotalSize;

    public InstanceAccesslog withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 集群ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public InstanceAccesslog withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求ID。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public InstanceAccesslog withApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }

    /**
     * API ID。
     * @return apiId
     */
    public String getApiId() {
        return apiId;
    }

    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    public InstanceAccesslog withApiName(String apiName) {
        this.apiName = apiName;
        return this;
    }

    /**
     * API名称。
     * @return apiName
     */
    public String getApiName() {
        return apiName;
    }

    public void setApiName(String apiName) {
        this.apiName = apiName;
    }

    public InstanceAccesslog withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * APP ID。
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public InstanceAccesslog withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * APP名称。
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public InstanceAccesslog withAccessTime(Long accessTime) {
        this.accessTime = accessTime;
        return this;
    }

    /**
     * 访问时间。
     * @return accessTime
     */
    public Long getAccessTime() {
        return accessTime;
    }

    public void setAccessTime(Long accessTime) {
        this.accessTime = accessTime;
    }

    public InstanceAccesslog withDuration(Long duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 访问时长。
     * @return duration
     */
    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public InstanceAccesslog withStatusCode(String statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * 状态码。
     * @return statusCode
     */
    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public InstanceAccesslog withErrorCode(String errorCode) {
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

    public InstanceAccesslog withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * 错误信息。
     * @return errorMessage
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public InstanceAccesslog withDetail(String detail) {
        this.detail = detail;
        return this;
    }

    /**
     * 日志详情。
     * @return detail
     */
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public InstanceAccesslog withInFlowSize(Long inFlowSize) {
        this.inFlowSize = inFlowSize;
        return this;
    }

    /**
     * 输入流量大小。
     * @return inFlowSize
     */
    public Long getInFlowSize() {
        return inFlowSize;
    }

    public void setInFlowSize(Long inFlowSize) {
        this.inFlowSize = inFlowSize;
    }

    public InstanceAccesslog withOutFlowSize(Long outFlowSize) {
        this.outFlowSize = outFlowSize;
        return this;
    }

    /**
     * 输出流量大小。
     * @return outFlowSize
     */
    public Long getOutFlowSize() {
        return outFlowSize;
    }

    public void setOutFlowSize(Long outFlowSize) {
        this.outFlowSize = outFlowSize;
    }

    public InstanceAccesslog withOutTotalSize(Long outTotalSize) {
        this.outTotalSize = outTotalSize;
        return this;
    }

    /**
     * 输出数据条数。
     * @return outTotalSize
     */
    public Long getOutTotalSize() {
        return outTotalSize;
    }

    public void setOutTotalSize(Long outTotalSize) {
        this.outTotalSize = outTotalSize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstanceAccesslog that = (InstanceAccesslog) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.requestId, that.requestId)
            && Objects.equals(this.apiId, that.apiId) && Objects.equals(this.apiName, that.apiName)
            && Objects.equals(this.appId, that.appId) && Objects.equals(this.appName, that.appName)
            && Objects.equals(this.accessTime, that.accessTime) && Objects.equals(this.duration, that.duration)
            && Objects.equals(this.statusCode, that.statusCode) && Objects.equals(this.errorCode, that.errorCode)
            && Objects.equals(this.errorMessage, that.errorMessage) && Objects.equals(this.detail, that.detail)
            && Objects.equals(this.inFlowSize, that.inFlowSize) && Objects.equals(this.outFlowSize, that.outFlowSize)
            && Objects.equals(this.outTotalSize, that.outTotalSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            requestId,
            apiId,
            apiName,
            appId,
            appName,
            accessTime,
            duration,
            statusCode,
            errorCode,
            errorMessage,
            detail,
            inFlowSize,
            outFlowSize,
            outTotalSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceAccesslog {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    apiId: ").append(toIndentedString(apiId)).append("\n");
        sb.append("    apiName: ").append(toIndentedString(apiName)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    accessTime: ").append(toIndentedString(accessTime)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
        sb.append("    inFlowSize: ").append(toIndentedString(inFlowSize)).append("\n");
        sb.append("    outFlowSize: ").append(toIndentedString(outFlowSize)).append("\n");
        sb.append("    outTotalSize: ").append(toIndentedString(outTotalSize)).append("\n");
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
