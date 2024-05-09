package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ExecuteFlinkJobSavepointRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ExecuteFlinkJobSavepointRequestBody body;

    public ExecuteFlinkJobSavepointRequest withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 正在运行的Flink作业的作业ID。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ExecuteFlinkJobSavepointRequest withBody(ExecuteFlinkJobSavepointRequestBody body) {
        this.body = body;
        return this;
    }

    public ExecuteFlinkJobSavepointRequest withBody(Consumer<ExecuteFlinkJobSavepointRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new ExecuteFlinkJobSavepointRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ExecuteFlinkJobSavepointRequestBody getBody() {
        return body;
    }

    public void setBody(ExecuteFlinkJobSavepointRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExecuteFlinkJobSavepointRequest that = (ExecuteFlinkJobSavepointRequest) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecuteFlinkJobSavepointRequest {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
