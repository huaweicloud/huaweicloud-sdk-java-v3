package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 获取分批结果返回体
 */
public class InstancesBatchResultMode {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "batch_index")

    private Integer batchIndex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_instances")

    private List<ResourceInstance> targetInstances = null;

    public InstancesBatchResultMode withBatchIndex(Integer batchIndex) {
        this.batchIndex = batchIndex;
        return this;
    }

    /**
     * 批次Id
     * minimum: 1
     * maximum: 20
     * @return batchIndex
     */
    public Integer getBatchIndex() {
        return batchIndex;
    }

    public void setBatchIndex(Integer batchIndex) {
        this.batchIndex = batchIndex;
    }

    public InstancesBatchResultMode withTargetInstances(List<ResourceInstance> targetInstances) {
        this.targetInstances = targetInstances;
        return this;
    }

    public InstancesBatchResultMode addTargetInstancesItem(ResourceInstance targetInstancesItem) {
        if (this.targetInstances == null) {
            this.targetInstances = new ArrayList<>();
        }
        this.targetInstances.add(targetInstancesItem);
        return this;
    }

    public InstancesBatchResultMode withTargetInstances(Consumer<List<ResourceInstance>> targetInstancesSetter) {
        if (this.targetInstances == null) {
            this.targetInstances = new ArrayList<>();
        }
        targetInstancesSetter.accept(this.targetInstances);
        return this;
    }

    /**
     * 当前批次内机器
     * @return targetInstances
     */
    public List<ResourceInstance> getTargetInstances() {
        return targetInstances;
    }

    public void setTargetInstances(List<ResourceInstance> targetInstances) {
        this.targetInstances = targetInstances;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstancesBatchResultMode that = (InstancesBatchResultMode) obj;
        return Objects.equals(this.batchIndex, that.batchIndex)
            && Objects.equals(this.targetInstances, that.targetInstances);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batchIndex, targetInstances);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstancesBatchResultMode {\n");
        sb.append("    batchIndex: ").append(toIndentedString(batchIndex)).append("\n");
        sb.append("    targetInstances: ").append(toIndentedString(targetInstances)).append("\n");
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
