package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private String beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone_id")

    private String phoneId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_id")

    private String serverId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_msg")

    private String errorMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_code")

    private String errorCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_msg")

    private String executeMsg;

    public ShowJobResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求的唯一标识ID。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public ShowJobResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 任务的唯一标识。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ShowJobResponse withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * 任务处理开始时间，时间格式为UTC，YYYY-MM-DDTHH:MM:SSZ。
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public ShowJobResponse withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 任务处理结束时间，时间格式为UTC，YYYY-MM-DDTHH:MM:SSZ。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ShowJobResponse withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 任务状态。 - 1： 运行中 - 2： 成功 - -1： 失败
     * minimum: -128
     * maximum: 128
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public ShowJobResponse withPhoneId(String phoneId) {
        this.phoneId = phoneId;
        return this;
    }

    /**
     * 云手机的唯一标识，云手机相关任务包含此字段。
     * @return phoneId
     */
    public String getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(String phoneId) {
        this.phoneId = phoneId;
    }

    public ShowJobResponse withServerId(String serverId) {
        this.serverId = serverId;
        return this;
    }

    /**
     * 云手机服务器的唯一标识ID，云手机服务器相关任务包含此字段。
     * @return serverId
     */
    public String getServerId() {
        return serverId;
    }

    public void setServerId(String serverId) {
        this.serverId = serverId;
    }

    public ShowJobResponse withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    /**
     * 任务错误码说明。
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public ShowJobResponse withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * 任务错误码。
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public ShowJobResponse withExecuteMsg(String executeMsg) {
        this.executeMsg = executeMsg;
        return this;
    }

    /**
     * 任务执行返回内容，最长1024个字节。
     * @return executeMsg
     */
    public String getExecuteMsg() {
        return executeMsg;
    }

    public void setExecuteMsg(String executeMsg) {
        this.executeMsg = executeMsg;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowJobResponse that = (ShowJobResponse) obj;
        return Objects.equals(this.requestId, that.requestId) && Objects.equals(this.jobId, that.jobId)
            && Objects.equals(this.beginTime, that.beginTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.status, that.status) && Objects.equals(this.phoneId, that.phoneId)
            && Objects.equals(this.serverId, that.serverId) && Objects.equals(this.errorMsg, that.errorMsg)
            && Objects.equals(this.errorCode, that.errorCode) && Objects.equals(this.executeMsg, that.executeMsg);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(requestId, jobId, beginTime, endTime, status, phoneId, serverId, errorMsg, errorCode, executeMsg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowJobResponse {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    phoneId: ").append(toIndentedString(phoneId)).append("\n");
        sb.append("    serverId: ").append(toIndentedString(serverId)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    executeMsg: ").append(toIndentedString(executeMsg)).append("\n");
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
