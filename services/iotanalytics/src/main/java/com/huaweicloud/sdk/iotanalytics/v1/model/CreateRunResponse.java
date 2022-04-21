package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateRunResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "run_id")

    private String runId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_type")

    private String jobType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private String createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_job")

    private SqlJobRunResponseBody sqlJob;

    public CreateRunResponse withRunId(String runId) {
        this.runId = runId;
        return this;
    }

    /**
     * 作业运行ID。
     * @return runId
     */
    public String getRunId() {
        return runId;
    }

    public void setRunId(String runId) {
        this.runId = runId;
    }

    public CreateRunResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 作业ID。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public CreateRunResponse withJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * 作业类型。
     * @return jobType
     */
    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public CreateRunResponse withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * 创建运行时间。
     * @return createdTime
     */
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public CreateRunResponse withSqlJob(SqlJobRunResponseBody sqlJob) {
        this.sqlJob = sqlJob;
        return this;
    }

    public CreateRunResponse withSqlJob(Consumer<SqlJobRunResponseBody> sqlJobSetter) {
        if (this.sqlJob == null) {
            this.sqlJob = new SqlJobRunResponseBody();
            sqlJobSetter.accept(this.sqlJob);
        }

        return this;
    }

    /**
     * Get sqlJob
     * @return sqlJob
     */
    public SqlJobRunResponseBody getSqlJob() {
        return sqlJob;
    }

    public void setSqlJob(SqlJobRunResponseBody sqlJob) {
        this.sqlJob = sqlJob;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateRunResponse createRunResponse = (CreateRunResponse) o;
        return Objects.equals(this.runId, createRunResponse.runId)
            && Objects.equals(this.jobId, createRunResponse.jobId)
            && Objects.equals(this.jobType, createRunResponse.jobType)
            && Objects.equals(this.createdTime, createRunResponse.createdTime)
            && Objects.equals(this.sqlJob, createRunResponse.sqlJob);
    }

    @Override
    public int hashCode() {
        return Objects.hash(runId, jobId, jobType, createdTime, sqlJob);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRunResponse {\n");
        sb.append("    runId: ").append(toIndentedString(runId)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    sqlJob: ").append(toIndentedString(sqlJob)).append("\n");
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
