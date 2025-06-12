package com.huaweicloud.sdk.codeartsbuild.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 结果
 */
public class JobUpdateRecordListVoResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_update_records")

    private List<JobUpdateRecordListVoResultJobUpdateRecords> jobUpdateRecords = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public JobUpdateRecordListVoResult withJobUpdateRecords(
        List<JobUpdateRecordListVoResultJobUpdateRecords> jobUpdateRecords) {
        this.jobUpdateRecords = jobUpdateRecords;
        return this;
    }

    public JobUpdateRecordListVoResult addJobUpdateRecordsItem(
        JobUpdateRecordListVoResultJobUpdateRecords jobUpdateRecordsItem) {
        if (this.jobUpdateRecords == null) {
            this.jobUpdateRecords = new ArrayList<>();
        }
        this.jobUpdateRecords.add(jobUpdateRecordsItem);
        return this;
    }

    public JobUpdateRecordListVoResult withJobUpdateRecords(
        Consumer<List<JobUpdateRecordListVoResultJobUpdateRecords>> jobUpdateRecordsSetter) {
        if (this.jobUpdateRecords == null) {
            this.jobUpdateRecords = new ArrayList<>();
        }
        jobUpdateRecordsSetter.accept(this.jobUpdateRecords);
        return this;
    }

    /**
     * job_update_records
     * @return jobUpdateRecords
     */
    public List<JobUpdateRecordListVoResultJobUpdateRecords> getJobUpdateRecords() {
        return jobUpdateRecords;
    }

    public void setJobUpdateRecords(List<JobUpdateRecordListVoResultJobUpdateRecords> jobUpdateRecords) {
        this.jobUpdateRecords = jobUpdateRecords;
    }

    public JobUpdateRecordListVoResult withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobUpdateRecordListVoResult that = (JobUpdateRecordListVoResult) obj;
        return Objects.equals(this.jobUpdateRecords, that.jobUpdateRecords) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobUpdateRecords, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobUpdateRecordListVoResult {\n");
        sb.append("    jobUpdateRecords: ").append(toIndentedString(jobUpdateRecords)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
