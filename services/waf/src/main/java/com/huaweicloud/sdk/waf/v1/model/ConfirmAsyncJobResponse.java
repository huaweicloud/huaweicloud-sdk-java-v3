package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ConfirmAsyncJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    public ConfirmAsyncJobResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 异步任务的状态，如RUNNING（运行中）、SUCCESS（成功）、FAILED（失败） **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ConfirmAsyncJobResponse withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * **参数解释：** 异步任务的描述，说明当前任务的进展或结果 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ConfirmAsyncJobResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * **参数解释：** 异步任务的ID，用于查询任务进度或结果的唯一标识 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConfirmAsyncJobResponse that = (ConfirmAsyncJobResponse) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.message, that.message)
            && Objects.equals(this.jobId, that.jobId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, message, jobId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfirmAsyncJobResponse {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
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
