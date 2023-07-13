package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 预检查结果信息体。
 */
public class QueryPreCheckResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private Boolean result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process")

    private String process;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_passed_rate")

    private String totalPassedRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rds_instance_id")

    private String rdsInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_direction")

    private String jobDirection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "precheck_results")

    private List<PrecheckResult> precheckResults = null;

    public QueryPreCheckResult withResult(Boolean result) {
        this.result = result;
        return this;
    }

    /**
     * 返回的预检查结果是否通过。
     * @return result
     */
    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    public QueryPreCheckResult withProcess(String process) {
        this.process = process;
        return this;
    }

    /**
     * 预检查进度百分比。
     * @return process
     */
    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process;
    }

    public QueryPreCheckResult withTotalPassedRate(String totalPassedRate) {
        this.totalPassedRate = totalPassedRate;
        return this;
    }

    /**
     * 预检查通过百分比。
     * @return totalPassedRate
     */
    public String getTotalPassedRate() {
        return totalPassedRate;
    }

    public void setTotalPassedRate(String totalPassedRate) {
        this.totalPassedRate = totalPassedRate;
    }

    public QueryPreCheckResult withRdsInstanceId(String rdsInstanceId) {
        this.rdsInstanceId = rdsInstanceId;
        return this;
    }

    /**
     * 数据库实例ID。
     * @return rdsInstanceId
     */
    public String getRdsInstanceId() {
        return rdsInstanceId;
    }

    public void setRdsInstanceId(String rdsInstanceId) {
        this.rdsInstanceId = rdsInstanceId;
    }

    public QueryPreCheckResult withJobDirection(String jobDirection) {
        this.jobDirection = jobDirection;
        return this;
    }

    /**
     * 迁移方向。
     * @return jobDirection
     */
    public String getJobDirection() {
        return jobDirection;
    }

    public void setJobDirection(String jobDirection) {
        this.jobDirection = jobDirection;
    }

    public QueryPreCheckResult withPrecheckResults(List<PrecheckResult> precheckResults) {
        this.precheckResults = precheckResults;
        return this;
    }

    public QueryPreCheckResult addPrecheckResultsItem(PrecheckResult precheckResultsItem) {
        if (this.precheckResults == null) {
            this.precheckResults = new ArrayList<>();
        }
        this.precheckResults.add(precheckResultsItem);
        return this;
    }

    public QueryPreCheckResult withPrecheckResults(Consumer<List<PrecheckResult>> precheckResultsSetter) {
        if (this.precheckResults == null) {
            this.precheckResults = new ArrayList<>();
        }
        precheckResultsSetter.accept(this.precheckResults);
        return this;
    }

    /**
     * 预检查各项结果。
     * @return precheckResults
     */
    public List<PrecheckResult> getPrecheckResults() {
        return precheckResults;
    }

    public void setPrecheckResults(List<PrecheckResult> precheckResults) {
        this.precheckResults = precheckResults;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueryPreCheckResult that = (QueryPreCheckResult) obj;
        return Objects.equals(this.result, that.result) && Objects.equals(this.process, that.process)
            && Objects.equals(this.totalPassedRate, that.totalPassedRate)
            && Objects.equals(this.rdsInstanceId, that.rdsInstanceId)
            && Objects.equals(this.jobDirection, that.jobDirection)
            && Objects.equals(this.precheckResults, that.precheckResults);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result, process, totalPassedRate, rdsInstanceId, jobDirection, precheckResults);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryPreCheckResult {\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    process: ").append(toIndentedString(process)).append("\n");
        sb.append("    totalPassedRate: ").append(toIndentedString(totalPassedRate)).append("\n");
        sb.append("    rdsInstanceId: ").append(toIndentedString(rdsInstanceId)).append("\n");
        sb.append("    jobDirection: ").append(toIndentedString(jobDirection)).append("\n");
        sb.append("    precheckResults: ").append(toIndentedString(precheckResults)).append("\n");
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
