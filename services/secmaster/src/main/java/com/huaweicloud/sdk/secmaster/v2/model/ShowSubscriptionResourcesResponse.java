package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowSubscriptionResourcesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sku")

    private SkuEnum sku;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upper_limit")

    private Double upperLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit")

    private String unit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step")

    private Double step;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_amount")

    private Double usedAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unused_amount")

    private Double unusedAmount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private Long version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index_storage_upper_limit")

    private Long indexStorageUpperLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index_shards_upper_limit")

    private Long indexShardsUpperLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index_shards_unused")

    private Long indexShardsUnused;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partitions_unused")

    private Long partitionsUnused;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partition_upper_limit")

    private Long partitionUpperLimit;

    public ShowSubscriptionResourcesResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ShowSubscriptionResourcesResponse withSku(SkuEnum sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get sku
     * @return sku
     */
    public SkuEnum getSku() {
        return sku;
    }

    public void setSku(SkuEnum sku) {
        this.sku = sku;
    }

    public ShowSubscriptionResourcesResponse withUpperLimit(Double upperLimit) {
        this.upperLimit = upperLimit;
        return this;
    }

    /**
     * 资源上限值
     * minimum: 0
     * maximum: 1E+2
     * @return upperLimit
     */
    public Double getUpperLimit() {
        return upperLimit;
    }

    public void setUpperLimit(Double upperLimit) {
        this.upperLimit = upperLimit;
    }

    public ShowSubscriptionResourcesResponse withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * 配额单位（如 GB、条、分片等）
     * @return unit
     */
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public ShowSubscriptionResourcesResponse withStep(Double step) {
        this.step = step;
        return this;
    }

    /**
     * 配额步长
     * minimum: 0
     * maximum: 1E+2
     * @return step
     */
    public Double getStep() {
        return step;
    }

    public void setStep(Double step) {
        this.step = step;
    }

    public ShowSubscriptionResourcesResponse withUsedAmount(Double usedAmount) {
        this.usedAmount = usedAmount;
        return this;
    }

    /**
     * 已使用的资源数量
     * minimum: 0
     * maximum: 65535
     * @return usedAmount
     */
    public Double getUsedAmount() {
        return usedAmount;
    }

    public void setUsedAmount(Double usedAmount) {
        this.usedAmount = usedAmount;
    }

    public ShowSubscriptionResourcesResponse withUnusedAmount(Double unusedAmount) {
        this.unusedAmount = unusedAmount;
        return this;
    }

    /**
     * 剩余可用的资源数量
     * minimum: 0
     * maximum: 2147483647
     * @return unusedAmount
     */
    public Double getUnusedAmount() {
        return unusedAmount;
    }

    public void setUnusedAmount(Double unusedAmount) {
        this.unusedAmount = unusedAmount;
    }

    public ShowSubscriptionResourcesResponse withVersion(Long version) {
        this.version = version;
        return this;
    }

    /**
     * 版本号
     * minimum: 0
     * maximum: 2
     * @return version
     */
    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public ShowSubscriptionResourcesResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 毫秒时间戳
     * minimum: 0
     * maximum: 2366841600000
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ShowSubscriptionResourcesResponse withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 毫秒时间戳
     * minimum: 0
     * maximum: 2366841600000
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public ShowSubscriptionResourcesResponse withIndexStorageUpperLimit(Long indexStorageUpperLimit) {
        this.indexStorageUpperLimit = indexStorageUpperLimit;
        return this;
    }

    /**
     * 索引存储上限
     * minimum: 0
     * maximum: 2147483647
     * @return indexStorageUpperLimit
     */
    public Long getIndexStorageUpperLimit() {
        return indexStorageUpperLimit;
    }

    public void setIndexStorageUpperLimit(Long indexStorageUpperLimit) {
        this.indexStorageUpperLimit = indexStorageUpperLimit;
    }

    public ShowSubscriptionResourcesResponse withIndexShardsUpperLimit(Long indexShardsUpperLimit) {
        this.indexShardsUpperLimit = indexShardsUpperLimit;
        return this;
    }

    /**
     * 索引分片上限
     * minimum: 0
     * maximum: 2147483647
     * @return indexShardsUpperLimit
     */
    public Long getIndexShardsUpperLimit() {
        return indexShardsUpperLimit;
    }

    public void setIndexShardsUpperLimit(Long indexShardsUpperLimit) {
        this.indexShardsUpperLimit = indexShardsUpperLimit;
    }

    public ShowSubscriptionResourcesResponse withIndexShardsUnused(Long indexShardsUnused) {
        this.indexShardsUnused = indexShardsUnused;
        return this;
    }

    /**
     * 剩余可用索引分片数量
     * minimum: 0
     * maximum: 2147483647
     * @return indexShardsUnused
     */
    public Long getIndexShardsUnused() {
        return indexShardsUnused;
    }

    public void setIndexShardsUnused(Long indexShardsUnused) {
        this.indexShardsUnused = indexShardsUnused;
    }

    public ShowSubscriptionResourcesResponse withPartitionsUnused(Long partitionsUnused) {
        this.partitionsUnused = partitionsUnused;
        return this;
    }

    /**
     * 剩余可用分区数量
     * minimum: 0
     * maximum: 2147483647
     * @return partitionsUnused
     */
    public Long getPartitionsUnused() {
        return partitionsUnused;
    }

    public void setPartitionsUnused(Long partitionsUnused) {
        this.partitionsUnused = partitionsUnused;
    }

    public ShowSubscriptionResourcesResponse withPartitionUpperLimit(Long partitionUpperLimit) {
        this.partitionUpperLimit = partitionUpperLimit;
        return this;
    }

    /**
     * 分区上限
     * minimum: 0
     * maximum: 2147483647
     * @return partitionUpperLimit
     */
    public Long getPartitionUpperLimit() {
        return partitionUpperLimit;
    }

    public void setPartitionUpperLimit(Long partitionUpperLimit) {
        this.partitionUpperLimit = partitionUpperLimit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSubscriptionResourcesResponse that = (ShowSubscriptionResourcesResponse) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.sku, that.sku)
            && Objects.equals(this.upperLimit, that.upperLimit) && Objects.equals(this.unit, that.unit)
            && Objects.equals(this.step, that.step) && Objects.equals(this.usedAmount, that.usedAmount)
            && Objects.equals(this.unusedAmount, that.unusedAmount) && Objects.equals(this.version, that.version)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.indexStorageUpperLimit, that.indexStorageUpperLimit)
            && Objects.equals(this.indexShardsUpperLimit, that.indexShardsUpperLimit)
            && Objects.equals(this.indexShardsUnused, that.indexShardsUnused)
            && Objects.equals(this.partitionsUnused, that.partitionsUnused)
            && Objects.equals(this.partitionUpperLimit, that.partitionUpperLimit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId,
            sku,
            upperLimit,
            unit,
            step,
            usedAmount,
            unusedAmount,
            version,
            createTime,
            updateTime,
            indexStorageUpperLimit,
            indexShardsUpperLimit,
            indexShardsUnused,
            partitionsUnused,
            partitionUpperLimit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSubscriptionResourcesResponse {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
        sb.append("    upperLimit: ").append(toIndentedString(upperLimit)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
        sb.append("    step: ").append(toIndentedString(step)).append("\n");
        sb.append("    usedAmount: ").append(toIndentedString(usedAmount)).append("\n");
        sb.append("    unusedAmount: ").append(toIndentedString(unusedAmount)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    indexStorageUpperLimit: ").append(toIndentedString(indexStorageUpperLimit)).append("\n");
        sb.append("    indexShardsUpperLimit: ").append(toIndentedString(indexShardsUpperLimit)).append("\n");
        sb.append("    indexShardsUnused: ").append(toIndentedString(indexShardsUnused)).append("\n");
        sb.append("    partitionsUnused: ").append(toIndentedString(partitionsUnused)).append("\n");
        sb.append("    partitionUpperLimit: ").append(toIndentedString(partitionUpperLimit)).append("\n");
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
