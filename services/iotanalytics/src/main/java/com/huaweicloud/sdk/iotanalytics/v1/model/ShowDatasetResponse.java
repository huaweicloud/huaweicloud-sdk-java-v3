package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowDatasetResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    @JacksonXmlProperty(localName = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "run_id")

    @JacksonXmlProperty(localName = "run_id")

    private String runId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_type")

    @JacksonXmlProperty(localName = "job_type")

    private String jobType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_job")

    @JacksonXmlProperty(localName = "sql_job")

    private SqlJobQueryDataset sqlJob;

    public ShowDatasetResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 作业结果总个数。
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public ShowDatasetResponse withRunId(String runId) {
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

    public ShowDatasetResponse withJobType(String jobType) {
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

    public ShowDatasetResponse withSqlJob(SqlJobQueryDataset sqlJob) {
        this.sqlJob = sqlJob;
        return this;
    }

    public ShowDatasetResponse withSqlJob(Consumer<SqlJobQueryDataset> sqlJobSetter) {
        if (this.sqlJob == null) {
            this.sqlJob = new SqlJobQueryDataset();
            sqlJobSetter.accept(this.sqlJob);
        }

        return this;
    }

    /**
     * Get sqlJob
     * @return sqlJob
     */
    public SqlJobQueryDataset getSqlJob() {
        return sqlJob;
    }

    public void setSqlJob(SqlJobQueryDataset sqlJob) {
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
        ShowDatasetResponse showDatasetResponse = (ShowDatasetResponse) o;
        return Objects.equals(this.count, showDatasetResponse.count)
            && Objects.equals(this.runId, showDatasetResponse.runId)
            && Objects.equals(this.jobType, showDatasetResponse.jobType)
            && Objects.equals(this.sqlJob, showDatasetResponse.sqlJob);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, runId, jobType, sqlJob);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDatasetResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    runId: ").append(toIndentedString(runId)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
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
