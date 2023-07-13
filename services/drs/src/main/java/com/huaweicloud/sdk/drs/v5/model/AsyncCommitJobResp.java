package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 提交异步任务响应体。
 */
public class AsyncCommitJobResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "async_job_id")

    private String asyncJobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "msg")

    private String msg;

    public AsyncCommitJobResp withAsyncJobId(String asyncJobId) {
        this.asyncJobId = asyncJobId;
        return this;
    }

    /**
     * 批量异步任务ID。
     * @return asyncJobId
     */
    public String getAsyncJobId() {
        return asyncJobId;
    }

    public void setAsyncJobId(String asyncJobId) {
        this.asyncJobId = asyncJobId;
    }

    public AsyncCommitJobResp withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 批量异步任务状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public AsyncCommitJobResp withMsg(String msg) {
        this.msg = msg;
        return this;
    }

    /**
     * 提交指定ID批量异步任务结果信息。
     * @return msg
     */
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AsyncCommitJobResp that = (AsyncCommitJobResp) obj;
        return Objects.equals(this.asyncJobId, that.asyncJobId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.msg, that.msg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(asyncJobId, status, msg);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AsyncCommitJobResp {\n");
        sb.append("    asyncJobId: ").append(toIndentedString(asyncJobId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    msg: ").append(toIndentedString(msg)).append("\n");
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
