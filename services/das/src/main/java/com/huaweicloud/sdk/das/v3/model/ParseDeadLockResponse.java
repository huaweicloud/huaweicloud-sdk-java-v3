package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ParseDeadLockResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_insight_job_id")

    private Long sqlInsightJobId;

    public ParseDeadLockResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 一键分析死锁日志任务唯一标识符
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ParseDeadLockResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 任务状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ParseDeadLockResponse withSqlInsightJobId(Long sqlInsightJobId) {
        this.sqlInsightJobId = sqlInsightJobId;
        return this;
    }

    /**
     * SQL洞察任务唯一标识符
     * @return sqlInsightJobId
     */
    public Long getSqlInsightJobId() {
        return sqlInsightJobId;
    }

    public void setSqlInsightJobId(Long sqlInsightJobId) {
        this.sqlInsightJobId = sqlInsightJobId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ParseDeadLockResponse that = (ParseDeadLockResponse) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.sqlInsightJobId, that.sqlInsightJobId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, status, sqlInsightJobId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ParseDeadLockResponse {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    sqlInsightJobId: ").append(toIndentedString(sqlInsightJobId)).append("\n");
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
