package com.huaweicloud.sdk.moderation.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class RunQueryDocumentModerationJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private DocumentQueryResponseResult result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_params")

    private DocumentQueryResponseRequestParams requestParams;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public RunQueryDocumentModerationJobResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 作业id
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public RunQueryDocumentModerationJobResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 作业状态，可取值有： running: 正在运行 succeeded: 运行成功 failed: 运行失败
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public RunQueryDocumentModerationJobResponse withResult(DocumentQueryResponseResult result) {
        this.result = result;
        return this;
    }

    public RunQueryDocumentModerationJobResponse withResult(Consumer<DocumentQueryResponseResult> resultSetter) {
        if (this.result == null) {
            this.result = new DocumentQueryResponseResult();
            resultSetter.accept(this.result);
        }

        return this;
    }

    /**
     * Get result
     * @return result
     */
    public DocumentQueryResponseResult getResult() {
        return result;
    }

    public void setResult(DocumentQueryResponseResult result) {
        this.result = result;
    }

    public RunQueryDocumentModerationJobResponse withRequestParams(DocumentQueryResponseRequestParams requestParams) {
        this.requestParams = requestParams;
        return this;
    }

    public RunQueryDocumentModerationJobResponse withRequestParams(
        Consumer<DocumentQueryResponseRequestParams> requestParamsSetter) {
        if (this.requestParams == null) {
            this.requestParams = new DocumentQueryResponseRequestParams();
            requestParamsSetter.accept(this.requestParams);
        }

        return this;
    }

    /**
     * Get requestParams
     * @return requestParams
     */
    public DocumentQueryResponseRequestParams getRequestParams() {
        return requestParams;
    }

    public void setRequestParams(DocumentQueryResponseRequestParams requestParams) {
        this.requestParams = requestParams;
    }

    public RunQueryDocumentModerationJobResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 作业创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public RunQueryDocumentModerationJobResponse withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 作业更新时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public RunQueryDocumentModerationJobResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 本次请求的唯⼀标识，⽤于问题排查，建议保存。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RunQueryDocumentModerationJobResponse that = (RunQueryDocumentModerationJobResponse) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.result, that.result) && Objects.equals(this.requestParams, that.requestParams)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, status, result, requestParams, createTime, updateTime, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunQueryDocumentModerationJobResponse {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    requestParams: ").append(toIndentedString(requestParams)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
