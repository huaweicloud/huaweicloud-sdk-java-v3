package com.huaweicloud.sdk.servicestage.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * RecordJob
 */
public class RecordJob {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sequence")

    private Integer sequence;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deploy_type")

    private String deployType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_info")

    private RecordJobInfo jobInfo;

    public RecordJob withSequence(Integer sequence) {
        this.sequence = sequence;
        return this;
    }

    /**
     * Get sequence
     * @return sequence
     */
    public Integer getSequence() {
        return sequence;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public RecordJob withDeployType(String deployType) {
        this.deployType = deployType;
        return this;
    }

    /**
     * Get deployType
     * @return deployType
     */
    public String getDeployType() {
        return deployType;
    }

    public void setDeployType(String deployType) {
        this.deployType = deployType;
    }

    public RecordJob withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * Get jobId
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public RecordJob withJobInfo(RecordJobInfo jobInfo) {
        this.jobInfo = jobInfo;
        return this;
    }

    public RecordJob withJobInfo(Consumer<RecordJobInfo> jobInfoSetter) {
        if (this.jobInfo == null) {
            this.jobInfo = new RecordJobInfo();
            jobInfoSetter.accept(this.jobInfo);
        }

        return this;
    }

    /**
     * Get jobInfo
     * @return jobInfo
     */
    public RecordJobInfo getJobInfo() {
        return jobInfo;
    }

    public void setJobInfo(RecordJobInfo jobInfo) {
        this.jobInfo = jobInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RecordJob that = (RecordJob) obj;
        return Objects.equals(this.sequence, that.sequence) && Objects.equals(this.deployType, that.deployType)
            && Objects.equals(this.jobId, that.jobId) && Objects.equals(this.jobInfo, that.jobInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sequence, deployType, jobId, jobInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecordJob {\n");
        sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
        sb.append("    deployType: ").append(toIndentedString(deployType)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    jobInfo: ").append(toIndentedString(jobInfo)).append("\n");
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
