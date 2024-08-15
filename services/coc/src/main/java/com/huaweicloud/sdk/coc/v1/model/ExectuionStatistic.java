package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 执行实例状态和批次统计
 */
public class ExectuionStatistic {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_status")

    private String instanceStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_count")

    private Integer instanceCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "batch_indexes")

    private List<Integer> batchIndexes = null;

    public ExectuionStatistic withInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
        return this;
    }

    /**
     * 执行实例状态
     * @return instanceStatus
     */
    public String getInstanceStatus() {
        return instanceStatus;
    }

    public void setInstanceStatus(String instanceStatus) {
        this.instanceStatus = instanceStatus;
    }

    public ExectuionStatistic withInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }

    /**
     * 该状态下执行实例个数
     * @return instanceCount
     */
    public Integer getInstanceCount() {
        return instanceCount;
    }

    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    public ExectuionStatistic withBatchIndexes(List<Integer> batchIndexes) {
        this.batchIndexes = batchIndexes;
        return this;
    }

    public ExectuionStatistic addBatchIndexesItem(Integer batchIndexesItem) {
        if (this.batchIndexes == null) {
            this.batchIndexes = new ArrayList<>();
        }
        this.batchIndexes.add(batchIndexesItem);
        return this;
    }

    public ExectuionStatistic withBatchIndexes(Consumer<List<Integer>> batchIndexesSetter) {
        if (this.batchIndexes == null) {
            this.batchIndexes = new ArrayList<>();
        }
        batchIndexesSetter.accept(this.batchIndexes);
        return this;
    }

    /**
     * 该状态下批次index列表
     * @return batchIndexes
     */
    public List<Integer> getBatchIndexes() {
        return batchIndexes;
    }

    public void setBatchIndexes(List<Integer> batchIndexes) {
        this.batchIndexes = batchIndexes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExectuionStatistic that = (ExectuionStatistic) obj;
        return Objects.equals(this.instanceStatus, that.instanceStatus)
            && Objects.equals(this.instanceCount, that.instanceCount)
            && Objects.equals(this.batchIndexes, that.batchIndexes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceStatus, instanceCount, batchIndexes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExectuionStatistic {\n");
        sb.append("    instanceStatus: ").append(toIndentedString(instanceStatus)).append("\n");
        sb.append("    instanceCount: ").append(toIndentedString(instanceCount)).append("\n");
        sb.append("    batchIndexes: ").append(toIndentedString(batchIndexes)).append("\n");
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
