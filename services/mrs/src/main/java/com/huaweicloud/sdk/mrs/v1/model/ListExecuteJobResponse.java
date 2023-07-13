package com.huaweicloud.sdk.mrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListExecuteJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "totalRecord")

    private Integer totalRecord;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_executions")

    private List<JobExeResult> jobExecutions = null;

    public ListExecuteJobResponse withTotalRecord(Integer totalRecord) {
        this.totalRecord = totalRecord;
        return this;
    }

    /**
     * 作业列表总数。
     * @return totalRecord
     */
    public Integer getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(Integer totalRecord) {
        this.totalRecord = totalRecord;
    }

    public ListExecuteJobResponse withJobExecutions(List<JobExeResult> jobExecutions) {
        this.jobExecutions = jobExecutions;
        return this;
    }

    public ListExecuteJobResponse addJobExecutionsItem(JobExeResult jobExecutionsItem) {
        if (this.jobExecutions == null) {
            this.jobExecutions = new ArrayList<>();
        }
        this.jobExecutions.add(jobExecutionsItem);
        return this;
    }

    public ListExecuteJobResponse withJobExecutions(Consumer<List<JobExeResult>> jobExecutionsSetter) {
        if (this.jobExecutions == null) {
            this.jobExecutions = new ArrayList<>();
        }
        jobExecutionsSetter.accept(this.jobExecutions);
        return this;
    }

    /**
     * 作业列表。
     * @return jobExecutions
     */
    public List<JobExeResult> getJobExecutions() {
        return jobExecutions;
    }

    public void setJobExecutions(List<JobExeResult> jobExecutions) {
        this.jobExecutions = jobExecutions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListExecuteJobResponse that = (ListExecuteJobResponse) obj;
        return Objects.equals(this.totalRecord, that.totalRecord)
            && Objects.equals(this.jobExecutions, that.jobExecutions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalRecord, jobExecutions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListExecuteJobResponse {\n");
        sb.append("    totalRecord: ").append(toIndentedString(totalRecord)).append("\n");
        sb.append("    jobExecutions: ").append(toIndentedString(jobExecutions)).append("\n");
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
