package com.huaweicloud.sdk.servicestage.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RecordJobInfo
 */
public class RecordJobInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deploy_type")

    private String deployType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_url")

    private String sourceUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "first_batch_weight")

    private Integer firstBatchWeight;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "first_batch_replica")

    private Integer firstBatchReplica;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replica")

    private Integer replica;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remaining_batch")

    private Integer remainingBatch;

    public RecordJobInfo withDeployType(String deployType) {
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

    public RecordJobInfo withSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
        return this;
    }

    /**
     * 组件来源的url
     * @return sourceUrl
     */
    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public RecordJobInfo withFirstBatchWeight(Integer firstBatchWeight) {
        this.firstBatchWeight = firstBatchWeight;
        return this;
    }

    /**
     * Get firstBatchWeight
     * @return firstBatchWeight
     */
    public Integer getFirstBatchWeight() {
        return firstBatchWeight;
    }

    public void setFirstBatchWeight(Integer firstBatchWeight) {
        this.firstBatchWeight = firstBatchWeight;
    }

    public RecordJobInfo withFirstBatchReplica(Integer firstBatchReplica) {
        this.firstBatchReplica = firstBatchReplica;
        return this;
    }

    /**
     * Get firstBatchReplica
     * @return firstBatchReplica
     */
    public Integer getFirstBatchReplica() {
        return firstBatchReplica;
    }

    public void setFirstBatchReplica(Integer firstBatchReplica) {
        this.firstBatchReplica = firstBatchReplica;
    }

    public RecordJobInfo withReplica(Integer replica) {
        this.replica = replica;
        return this;
    }

    /**
     * Get replica
     * @return replica
     */
    public Integer getReplica() {
        return replica;
    }

    public void setReplica(Integer replica) {
        this.replica = replica;
    }

    public RecordJobInfo withRemainingBatch(Integer remainingBatch) {
        this.remainingBatch = remainingBatch;
        return this;
    }

    /**
     * Get remainingBatch
     * @return remainingBatch
     */
    public Integer getRemainingBatch() {
        return remainingBatch;
    }

    public void setRemainingBatch(Integer remainingBatch) {
        this.remainingBatch = remainingBatch;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RecordJobInfo recordJobInfo = (RecordJobInfo) o;
        return Objects.equals(this.deployType, recordJobInfo.deployType)
            && Objects.equals(this.sourceUrl, recordJobInfo.sourceUrl)
            && Objects.equals(this.firstBatchWeight, recordJobInfo.firstBatchWeight)
            && Objects.equals(this.firstBatchReplica, recordJobInfo.firstBatchReplica)
            && Objects.equals(this.replica, recordJobInfo.replica)
            && Objects.equals(this.remainingBatch, recordJobInfo.remainingBatch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deployType, sourceUrl, firstBatchWeight, firstBatchReplica, replica, remainingBatch);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecordJobInfo {\n");
        sb.append("    deployType: ").append(toIndentedString(deployType)).append("\n");
        sb.append("    sourceUrl: ").append(toIndentedString(sourceUrl)).append("\n");
        sb.append("    firstBatchWeight: ").append(toIndentedString(firstBatchWeight)).append("\n");
        sb.append("    firstBatchReplica: ").append(toIndentedString(firstBatchReplica)).append("\n");
        sb.append("    replica: ").append(toIndentedString(replica)).append("\n");
        sb.append("    remainingBatch: ").append(toIndentedString(remainingBatch)).append("\n");
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
