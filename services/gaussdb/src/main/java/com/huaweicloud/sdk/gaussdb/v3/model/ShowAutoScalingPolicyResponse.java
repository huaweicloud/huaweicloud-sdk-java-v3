package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowAutoScalingPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "monitor_cycle")

    private Integer monitorCycle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "silence_cycle")

    private Integer silenceCycle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enlarge_threshold")

    private Integer enlargeThreshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_flavor")

    private String maxFlavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reduce_enabled")

    private Boolean reduceEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_flavor")

    private String minFlavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "silence_start_at")

    private String silenceStartAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scaling_strategy")

    private ScalingStrategyInfo scalingStrategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_read_only_count")

    private Integer maxReadOnlyCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_read_only_count")

    private Integer minReadOnlyCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "read_only_weight")

    private Integer readOnlyWeight;

    public ShowAutoScalingPolicyResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 自动变配策略ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowAutoScalingPolicyResponse withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ShowAutoScalingPolicyResponse withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * 实例名称。
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public ShowAutoScalingPolicyResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 自动变配开关状态。  取值：  - ON：已开启 - OFF：已关闭
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowAutoScalingPolicyResponse withMonitorCycle(Integer monitorCycle) {
        this.monitorCycle = monitorCycle;
        return this;
    }

    /**
     * 监测周期（单位：秒）。 在整个观测窗口期内，若CPU平均使用率大于等于设定值，则在观测窗口结束后，进行扩容。
     * @return monitorCycle
     */
    public Integer getMonitorCycle() {
        return monitorCycle;
    }

    public void setMonitorCycle(Integer monitorCycle) {
        this.monitorCycle = monitorCycle;
    }

    public ShowAutoScalingPolicyResponse withSilenceCycle(Integer silenceCycle) {
        this.silenceCycle = silenceCycle;
        return this;
    }

    /**
     * 静默周期（单位：秒）。 两次自动扩容或自动回缩的最小间隔时间。
     * @return silenceCycle
     */
    public Integer getSilenceCycle() {
        return silenceCycle;
    }

    public void setSilenceCycle(Integer silenceCycle) {
        this.silenceCycle = silenceCycle;
    }

    public ShowAutoScalingPolicyResponse withEnlargeThreshold(Integer enlargeThreshold) {
        this.enlargeThreshold = enlargeThreshold;
        return this;
    }

    /**
     * 扩容阈值（百分比数值），指CPU平均使用率。
     * @return enlargeThreshold
     */
    public Integer getEnlargeThreshold() {
        return enlargeThreshold;
    }

    public void setEnlargeThreshold(Integer enlargeThreshold) {
        this.enlargeThreshold = enlargeThreshold;
    }

    public ShowAutoScalingPolicyResponse withMaxFlavor(String maxFlavor) {
        this.maxFlavor = maxFlavor;
        return this;
    }

    /**
     * 扩容规格上限。
     * @return maxFlavor
     */
    public String getMaxFlavor() {
        return maxFlavor;
    }

    public void setMaxFlavor(String maxFlavor) {
        this.maxFlavor = maxFlavor;
    }

    public ShowAutoScalingPolicyResponse withReduceEnabled(Boolean reduceEnabled) {
        this.reduceEnabled = reduceEnabled;
        return this;
    }

    /**
     * 自动回缩开关状态。  取值：  - true：已开启 - false：已关闭
     * @return reduceEnabled
     */
    public Boolean getReduceEnabled() {
        return reduceEnabled;
    }

    public void setReduceEnabled(Boolean reduceEnabled) {
        this.reduceEnabled = reduceEnabled;
    }

    public ShowAutoScalingPolicyResponse withMinFlavor(String minFlavor) {
        this.minFlavor = minFlavor;
        return this;
    }

    /**
     * 缩容规格下限。
     * @return minFlavor
     */
    public String getMinFlavor() {
        return minFlavor;
    }

    public void setMinFlavor(String minFlavor) {
        this.minFlavor = minFlavor;
    }

    public ShowAutoScalingPolicyResponse withSilenceStartAt(String silenceStartAt) {
        this.silenceStartAt = silenceStartAt;
        return this;
    }

    /**
     * 静默期开始时间（上一次变更结束时间）。  格式为\"yyyy-mm-ddThh:mm:ssZ\"。 其中，T指某个时间的开始；Z指时区偏移量，例如北京时间偏移显示为+0800。
     * @return silenceStartAt
     */
    public String getSilenceStartAt() {
        return silenceStartAt;
    }

    public void setSilenceStartAt(String silenceStartAt) {
        this.silenceStartAt = silenceStartAt;
    }

    public ShowAutoScalingPolicyResponse withScalingStrategy(ScalingStrategyInfo scalingStrategy) {
        this.scalingStrategy = scalingStrategy;
        return this;
    }

    public ShowAutoScalingPolicyResponse withScalingStrategy(Consumer<ScalingStrategyInfo> scalingStrategySetter) {
        if (this.scalingStrategy == null) {
            this.scalingStrategy = new ScalingStrategyInfo();
            scalingStrategySetter.accept(this.scalingStrategy);
        }

        return this;
    }

    /**
     * Get scalingStrategy
     * @return scalingStrategy
     */
    public ScalingStrategyInfo getScalingStrategy() {
        return scalingStrategy;
    }

    public void setScalingStrategy(ScalingStrategyInfo scalingStrategy) {
        this.scalingStrategy = scalingStrategy;
    }

    public ShowAutoScalingPolicyResponse withMaxReadOnlyCount(Integer maxReadOnlyCount) {
        this.maxReadOnlyCount = maxReadOnlyCount;
        return this;
    }

    /**
     * 只读节点数量上限。
     * @return maxReadOnlyCount
     */
    public Integer getMaxReadOnlyCount() {
        return maxReadOnlyCount;
    }

    public void setMaxReadOnlyCount(Integer maxReadOnlyCount) {
        this.maxReadOnlyCount = maxReadOnlyCount;
    }

    public ShowAutoScalingPolicyResponse withMinReadOnlyCount(Integer minReadOnlyCount) {
        this.minReadOnlyCount = minReadOnlyCount;
        return this;
    }

    /**
     * 只读节点数量下限。
     * @return minReadOnlyCount
     */
    public Integer getMinReadOnlyCount() {
        return minReadOnlyCount;
    }

    public void setMinReadOnlyCount(Integer minReadOnlyCount) {
        this.minReadOnlyCount = minReadOnlyCount;
    }

    public ShowAutoScalingPolicyResponse withReadOnlyWeight(Integer readOnlyWeight) {
        this.readOnlyWeight = readOnlyWeight;
        return this;
    }

    /**
     * 只读节点读写分离权重。
     * @return readOnlyWeight
     */
    public Integer getReadOnlyWeight() {
        return readOnlyWeight;
    }

    public void setReadOnlyWeight(Integer readOnlyWeight) {
        this.readOnlyWeight = readOnlyWeight;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAutoScalingPolicyResponse that = (ShowAutoScalingPolicyResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.instanceName, that.instanceName) && Objects.equals(this.status, that.status)
            && Objects.equals(this.monitorCycle, that.monitorCycle)
            && Objects.equals(this.silenceCycle, that.silenceCycle)
            && Objects.equals(this.enlargeThreshold, that.enlargeThreshold)
            && Objects.equals(this.maxFlavor, that.maxFlavor) && Objects.equals(this.reduceEnabled, that.reduceEnabled)
            && Objects.equals(this.minFlavor, that.minFlavor)
            && Objects.equals(this.silenceStartAt, that.silenceStartAt)
            && Objects.equals(this.scalingStrategy, that.scalingStrategy)
            && Objects.equals(this.maxReadOnlyCount, that.maxReadOnlyCount)
            && Objects.equals(this.minReadOnlyCount, that.minReadOnlyCount)
            && Objects.equals(this.readOnlyWeight, that.readOnlyWeight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            instanceId,
            instanceName,
            status,
            monitorCycle,
            silenceCycle,
            enlargeThreshold,
            maxFlavor,
            reduceEnabled,
            minFlavor,
            silenceStartAt,
            scalingStrategy,
            maxReadOnlyCount,
            minReadOnlyCount,
            readOnlyWeight);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAutoScalingPolicyResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    monitorCycle: ").append(toIndentedString(monitorCycle)).append("\n");
        sb.append("    silenceCycle: ").append(toIndentedString(silenceCycle)).append("\n");
        sb.append("    enlargeThreshold: ").append(toIndentedString(enlargeThreshold)).append("\n");
        sb.append("    maxFlavor: ").append(toIndentedString(maxFlavor)).append("\n");
        sb.append("    reduceEnabled: ").append(toIndentedString(reduceEnabled)).append("\n");
        sb.append("    minFlavor: ").append(toIndentedString(minFlavor)).append("\n");
        sb.append("    silenceStartAt: ").append(toIndentedString(silenceStartAt)).append("\n");
        sb.append("    scalingStrategy: ").append(toIndentedString(scalingStrategy)).append("\n");
        sb.append("    maxReadOnlyCount: ").append(toIndentedString(maxReadOnlyCount)).append("\n");
        sb.append("    minReadOnlyCount: ").append(toIndentedString(minReadOnlyCount)).append("\n");
        sb.append("    readOnlyWeight: ").append(toIndentedString(readOnlyWeight)).append("\n");
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
