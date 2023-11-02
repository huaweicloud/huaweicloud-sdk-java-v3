package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 设置自动变配策略请求体
 */
public class UpdateAutoScalingPolicyRequestBody {

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
    @JsonProperty(value = "max_read_only_count")

    private Integer maxReadOnlyCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "read_only_weight")

    private Integer readOnlyWeight;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scaling_strategy")

    private ScalingStrategyReqInfo scalingStrategy;

    public UpdateAutoScalingPolicyRequestBody withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 自动变配开关状态。  取值：  - ON：开启。 - OFF：关闭。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public UpdateAutoScalingPolicyRequestBody withMonitorCycle(Integer monitorCycle) {
        this.monitorCycle = monitorCycle;
        return this;
    }

    /**
     * 监测周期（单位：秒）。 在整个观测窗口期内，若CPU平均使用率大于等于设定值，则在观测窗口结束后，进行扩容。  取值范围：300、600、900、1800。  status为ON时必填。
     * @return monitorCycle
     */
    public Integer getMonitorCycle() {
        return monitorCycle;
    }

    public void setMonitorCycle(Integer monitorCycle) {
        this.monitorCycle = monitorCycle;
    }

    public UpdateAutoScalingPolicyRequestBody withSilenceCycle(Integer silenceCycle) {
        this.silenceCycle = silenceCycle;
        return this;
    }

    /**
     * 静默周期（单位：秒）。 两次自动扩容或自动回缩的最小间隔时间。  取值范围：300、600、1800、3600、7200、10800、86400、604800。  status为ON时必填。
     * @return silenceCycle
     */
    public Integer getSilenceCycle() {
        return silenceCycle;
    }

    public void setSilenceCycle(Integer silenceCycle) {
        this.silenceCycle = silenceCycle;
    }

    public UpdateAutoScalingPolicyRequestBody withEnlargeThreshold(Integer enlargeThreshold) {
        this.enlargeThreshold = enlargeThreshold;
        return this;
    }

    /**
     * 扩容阈值（百分比数值）。  取值范围：50-100。  status为ON时必填。
     * @return enlargeThreshold
     */
    public Integer getEnlargeThreshold() {
        return enlargeThreshold;
    }

    public void setEnlargeThreshold(Integer enlargeThreshold) {
        this.enlargeThreshold = enlargeThreshold;
    }

    public UpdateAutoScalingPolicyRequestBody withMaxFlavor(String maxFlavor) {
        this.maxFlavor = maxFlavor;
        return this;
    }

    /**
     * 扩容规格上限。开启扩缩规格时必填。
     * @return maxFlavor
     */
    public String getMaxFlavor() {
        return maxFlavor;
    }

    public void setMaxFlavor(String maxFlavor) {
        this.maxFlavor = maxFlavor;
    }

    public UpdateAutoScalingPolicyRequestBody withReduceEnabled(Boolean reduceEnabled) {
        this.reduceEnabled = reduceEnabled;
        return this;
    }

    /**
     * 是否开启自动回缩。开启自动变配时必填。 - true：是。 - false：否。
     * @return reduceEnabled
     */
    public Boolean getReduceEnabled() {
        return reduceEnabled;
    }

    public void setReduceEnabled(Boolean reduceEnabled) {
        this.reduceEnabled = reduceEnabled;
    }

    public UpdateAutoScalingPolicyRequestBody withMaxReadOnlyCount(Integer maxReadOnlyCount) {
        this.maxReadOnlyCount = maxReadOnlyCount;
        return this;
    }

    /**
     * 只读节点数量上限。开启增删只读节点时必填。
     * @return maxReadOnlyCount
     */
    public Integer getMaxReadOnlyCount() {
        return maxReadOnlyCount;
    }

    public void setMaxReadOnlyCount(Integer maxReadOnlyCount) {
        this.maxReadOnlyCount = maxReadOnlyCount;
    }

    public UpdateAutoScalingPolicyRequestBody withReadOnlyWeight(Integer readOnlyWeight) {
        this.readOnlyWeight = readOnlyWeight;
        return this;
    }

    /**
     * 只读节点读写分离权重。开启增删只读节点时必填。
     * @return readOnlyWeight
     */
    public Integer getReadOnlyWeight() {
        return readOnlyWeight;
    }

    public void setReadOnlyWeight(Integer readOnlyWeight) {
        this.readOnlyWeight = readOnlyWeight;
    }

    public UpdateAutoScalingPolicyRequestBody withScalingStrategy(ScalingStrategyReqInfo scalingStrategy) {
        this.scalingStrategy = scalingStrategy;
        return this;
    }

    public UpdateAutoScalingPolicyRequestBody withScalingStrategy(
        Consumer<ScalingStrategyReqInfo> scalingStrategySetter) {
        if (this.scalingStrategy == null) {
            this.scalingStrategy = new ScalingStrategyReqInfo();
            scalingStrategySetter.accept(this.scalingStrategy);
        }

        return this;
    }

    /**
     * Get scalingStrategy
     * @return scalingStrategy
     */
    public ScalingStrategyReqInfo getScalingStrategy() {
        return scalingStrategy;
    }

    public void setScalingStrategy(ScalingStrategyReqInfo scalingStrategy) {
        this.scalingStrategy = scalingStrategy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateAutoScalingPolicyRequestBody that = (UpdateAutoScalingPolicyRequestBody) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.monitorCycle, that.monitorCycle)
            && Objects.equals(this.silenceCycle, that.silenceCycle)
            && Objects.equals(this.enlargeThreshold, that.enlargeThreshold)
            && Objects.equals(this.maxFlavor, that.maxFlavor) && Objects.equals(this.reduceEnabled, that.reduceEnabled)
            && Objects.equals(this.maxReadOnlyCount, that.maxReadOnlyCount)
            && Objects.equals(this.readOnlyWeight, that.readOnlyWeight)
            && Objects.equals(this.scalingStrategy, that.scalingStrategy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status,
            monitorCycle,
            silenceCycle,
            enlargeThreshold,
            maxFlavor,
            reduceEnabled,
            maxReadOnlyCount,
            readOnlyWeight,
            scalingStrategy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAutoScalingPolicyRequestBody {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    monitorCycle: ").append(toIndentedString(monitorCycle)).append("\n");
        sb.append("    silenceCycle: ").append(toIndentedString(silenceCycle)).append("\n");
        sb.append("    enlargeThreshold: ").append(toIndentedString(enlargeThreshold)).append("\n");
        sb.append("    maxFlavor: ").append(toIndentedString(maxFlavor)).append("\n");
        sb.append("    reduceEnabled: ").append(toIndentedString(reduceEnabled)).append("\n");
        sb.append("    maxReadOnlyCount: ").append(toIndentedString(maxReadOnlyCount)).append("\n");
        sb.append("    readOnlyWeight: ").append(toIndentedString(readOnlyWeight)).append("\n");
        sb.append("    scalingStrategy: ").append(toIndentedString(scalingStrategy)).append("\n");
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
