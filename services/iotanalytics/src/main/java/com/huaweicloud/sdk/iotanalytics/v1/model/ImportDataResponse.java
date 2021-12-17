package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/** Response Object */
public class ImportDataResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_id")

    private String tableId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "run_id")

    private String runId;

    public ImportDataResponse withTableId(String tableId) {
        this.tableId = tableId;
        return this;
    }

    /** 表ID。
     * 
     * @return tableId */
    public String getTableId() {
        return tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    public ImportDataResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /** 作业ID。
     * 
     * @return jobId */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ImportDataResponse withRunId(String runId) {
        this.runId = runId;
        return this;
    }

    /** 作业运行ID。
     * 
     * @return runId */
    public String getRunId() {
        return runId;
    }

    public void setRunId(String runId) {
        this.runId = runId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ImportDataResponse importDataResponse = (ImportDataResponse) o;
        return Objects.equals(this.tableId, importDataResponse.tableId)
            && Objects.equals(this.jobId, importDataResponse.jobId)
            && Objects.equals(this.runId, importDataResponse.runId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableId, jobId, runId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImportDataResponse {\n");
        sb.append("    tableId: ").append(toIndentedString(tableId)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    runId: ").append(toIndentedString(runId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
