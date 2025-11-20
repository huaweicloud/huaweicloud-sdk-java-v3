package com.huaweicloud.sdk.ddm.v1.model;

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
public class CheckMigrateLogicDbResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pre_check_results")

    private List<PreCheckResult> preCheckResults = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    public CheckMigrateLogicDbResponse withPreCheckResults(List<PreCheckResult> preCheckResults) {
        this.preCheckResults = preCheckResults;
        return this;
    }

    public CheckMigrateLogicDbResponse addPreCheckResultsItem(PreCheckResult preCheckResultsItem) {
        if (this.preCheckResults == null) {
            this.preCheckResults = new ArrayList<>();
        }
        this.preCheckResults.add(preCheckResultsItem);
        return this;
    }

    public CheckMigrateLogicDbResponse withPreCheckResults(Consumer<List<PreCheckResult>> preCheckResultsSetter) {
        if (this.preCheckResults == null) {
            this.preCheckResults = new ArrayList<>();
        }
        preCheckResultsSetter.accept(this.preCheckResults);
        return this;
    }

    /**
     * 关联的后端DN信息。
     * @return preCheckResults
     */
    public List<PreCheckResult> getPreCheckResults() {
        return preCheckResults;
    }

    public void setPreCheckResults(List<PreCheckResult> preCheckResults) {
        this.preCheckResults = preCheckResults;
    }

    public CheckMigrateLogicDbResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 工作流id。
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
        CheckMigrateLogicDbResponse that = (CheckMigrateLogicDbResponse) obj;
        return Objects.equals(this.preCheckResults, that.preCheckResults) && Objects.equals(this.jobId, that.jobId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(preCheckResults, jobId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckMigrateLogicDbResponse {\n");
        sb.append("    preCheckResults: ").append(toIndentedString(preCheckResults)).append("\n");
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
