package com.huaweicloud.sdk.dsc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ShowScanJobResultsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_name")

    private String jobName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_scan_result")

    private DbScanResult dbScanResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_scan_result")

    private ObsScanResult obsScanResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "es_scan_result")

    private EsScanResult esScanResult;

    public ShowScanJobResultsResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /** 任务ID
     * 
     * @return jobId */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ShowScanJobResultsResponse withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /** 任务名
     * 
     * @return jobName */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public ShowScanJobResultsResponse withType(String type) {
        this.type = type;
        return this;
    }

    /** 查询资产类型
     * 
     * @return type */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ShowScanJobResultsResponse withDbScanResult(DbScanResult dbScanResult) {
        this.dbScanResult = dbScanResult;
        return this;
    }

    public ShowScanJobResultsResponse withDbScanResult(Consumer<DbScanResult> dbScanResultSetter) {
        if (this.dbScanResult == null) {
            this.dbScanResult = new DbScanResult();
            dbScanResultSetter.accept(this.dbScanResult);
        }

        return this;
    }

    /** Get dbScanResult
     * 
     * @return dbScanResult */
    public DbScanResult getDbScanResult() {
        return dbScanResult;
    }

    public void setDbScanResult(DbScanResult dbScanResult) {
        this.dbScanResult = dbScanResult;
    }

    public ShowScanJobResultsResponse withObsScanResult(ObsScanResult obsScanResult) {
        this.obsScanResult = obsScanResult;
        return this;
    }

    public ShowScanJobResultsResponse withObsScanResult(Consumer<ObsScanResult> obsScanResultSetter) {
        if (this.obsScanResult == null) {
            this.obsScanResult = new ObsScanResult();
            obsScanResultSetter.accept(this.obsScanResult);
        }

        return this;
    }

    /** Get obsScanResult
     * 
     * @return obsScanResult */
    public ObsScanResult getObsScanResult() {
        return obsScanResult;
    }

    public void setObsScanResult(ObsScanResult obsScanResult) {
        this.obsScanResult = obsScanResult;
    }

    public ShowScanJobResultsResponse withEsScanResult(EsScanResult esScanResult) {
        this.esScanResult = esScanResult;
        return this;
    }

    public ShowScanJobResultsResponse withEsScanResult(Consumer<EsScanResult> esScanResultSetter) {
        if (this.esScanResult == null) {
            this.esScanResult = new EsScanResult();
            esScanResultSetter.accept(this.esScanResult);
        }

        return this;
    }

    /** Get esScanResult
     * 
     * @return esScanResult */
    public EsScanResult getEsScanResult() {
        return esScanResult;
    }

    public void setEsScanResult(EsScanResult esScanResult) {
        this.esScanResult = esScanResult;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowScanJobResultsResponse showScanJobResultsResponse = (ShowScanJobResultsResponse) o;
        return Objects.equals(this.jobId, showScanJobResultsResponse.jobId)
            && Objects.equals(this.jobName, showScanJobResultsResponse.jobName)
            && Objects.equals(this.type, showScanJobResultsResponse.type)
            && Objects.equals(this.dbScanResult, showScanJobResultsResponse.dbScanResult)
            && Objects.equals(this.obsScanResult, showScanJobResultsResponse.obsScanResult)
            && Objects.equals(this.esScanResult, showScanJobResultsResponse.esScanResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, jobName, type, dbScanResult, obsScanResult, esScanResult);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowScanJobResultsResponse {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    dbScanResult: ").append(toIndentedString(dbScanResult)).append("\n");
        sb.append("    obsScanResult: ").append(toIndentedString(obsScanResult)).append("\n");
        sb.append("    esScanResult: ").append(toIndentedString(esScanResult)).append("\n");
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
