package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class CancelDrugJobRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eihealth_project_id")

    private String eihealthProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    public CancelDrugJobRequest withEihealthProjectId(String eihealthProjectId) {
        this.eihealthProjectId = eihealthProjectId;
        return this;
    }

    /**
     * 盘古辅助制药平台项目ID。
     * @return eihealthProjectId
     */
    public String getEihealthProjectId() {
        return eihealthProjectId;
    }

    public void setEihealthProjectId(String eihealthProjectId) {
        this.eihealthProjectId = eihealthProjectId;
    }

    public CancelDrugJobRequest withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 作业id
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
        CancelDrugJobRequest that = (CancelDrugJobRequest) obj;
        return Objects.equals(this.eihealthProjectId, that.eihealthProjectId) && Objects.equals(this.jobId, that.jobId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eihealthProjectId, jobId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CancelDrugJobRequest {\n");
        sb.append("    eihealthProjectId: ").append(toIndentedString(eihealthProjectId)).append("\n");
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
