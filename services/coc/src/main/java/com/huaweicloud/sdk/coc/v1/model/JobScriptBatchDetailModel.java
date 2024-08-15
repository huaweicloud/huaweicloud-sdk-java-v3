package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 执行批次详情
 */
public class JobScriptBatchDetailModel {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "batch_index")

    private Integer batchIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_instances")

    private Integer totalInstances;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_instances")

    private List<ExectionInstanceModel> executeInstances = null;

    public JobScriptBatchDetailModel withBatchIndex(Integer batchIndex) {
        this.batchIndex = batchIndex;
        return this;
    }

    /**
     * 批次索引，从1开始
     * @return batchIndex
     */
    public Integer getBatchIndex() {
        return batchIndex;
    }

    public void setBatchIndex(Integer batchIndex) {
        this.batchIndex = batchIndex;
    }

    public JobScriptBatchDetailModel withTotalInstances(Integer totalInstances) {
        this.totalInstances = totalInstances;
        return this;
    }

    /**
     * 批次内执行实例数量
     * @return totalInstances
     */
    public Integer getTotalInstances() {
        return totalInstances;
    }

    public void setTotalInstances(Integer totalInstances) {
        this.totalInstances = totalInstances;
    }

    public JobScriptBatchDetailModel withExecuteInstances(List<ExectionInstanceModel> executeInstances) {
        this.executeInstances = executeInstances;
        return this;
    }

    public JobScriptBatchDetailModel addExecuteInstancesItem(ExectionInstanceModel executeInstancesItem) {
        if (this.executeInstances == null) {
            this.executeInstances = new ArrayList<>();
        }
        this.executeInstances.add(executeInstancesItem);
        return this;
    }

    public JobScriptBatchDetailModel withExecuteInstances(
        Consumer<List<ExectionInstanceModel>> executeInstancesSetter) {
        if (this.executeInstances == null) {
            this.executeInstances = new ArrayList<>();
        }
        executeInstancesSetter.accept(this.executeInstances);
        return this;
    }

    /**
     * 执行实例列表，分页
     * @return executeInstances
     */
    public List<ExectionInstanceModel> getExecuteInstances() {
        return executeInstances;
    }

    public void setExecuteInstances(List<ExectionInstanceModel> executeInstances) {
        this.executeInstances = executeInstances;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobScriptBatchDetailModel that = (JobScriptBatchDetailModel) obj;
        return Objects.equals(this.batchIndex, that.batchIndex)
            && Objects.equals(this.totalInstances, that.totalInstances)
            && Objects.equals(this.executeInstances, that.executeInstances);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batchIndex, totalInstances, executeInstances);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobScriptBatchDetailModel {\n");
        sb.append("    batchIndex: ").append(toIndentedString(batchIndex)).append("\n");
        sb.append("    totalInstances: ").append(toIndentedString(totalInstances)).append("\n");
        sb.append("    executeInstances: ").append(toIndentedString(executeInstances)).append("\n");
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
