package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowRunRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "run_id")

    private String runId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "with_details")

    private Boolean withDetails;

    public ShowRunRequest withJobId(String jobId) {
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

    public ShowRunRequest withRunId(String runId) {
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

    public ShowRunRequest withWithDetails(Boolean withDetails) {
        this.withDetails = withDetails;
        return this;
    }

    /**
     * 是否查询作业详情。true：查询；false：不查询。details属性为空。默认为false。
     * @return withDetails
     */
    public Boolean getWithDetails() {
        return withDetails;
    }

    public void setWithDetails(Boolean withDetails) {
        this.withDetails = withDetails;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowRunRequest that = (ShowRunRequest) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.runId, that.runId)
            && Objects.equals(this.withDetails, that.withDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, runId, withDetails);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowRunRequest {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    runId: ").append(toIndentedString(runId)).append("\n");
        sb.append("    withDetails: ").append(toIndentedString(withDetails)).append("\n");
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
