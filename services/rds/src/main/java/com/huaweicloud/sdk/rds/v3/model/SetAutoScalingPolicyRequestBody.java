package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 设置自动变配策略请求体。
 */
public class SetAutoScalingPolicyRequestBody {

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

    private String reduceEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reduce_threshold")

    private Integer reduceThreshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_flavor")

    private String minFlavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "read_only_scaling_strategy")

    private ReadOnlyScalingStrategy readOnlyScalingStrategy;

    public SetAutoScalingPolicyRequestBody withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**：  是否开启自动变配。  **约束限制**：  不涉及。  **取值范围**：  - ON：开启自动变配 - OFF：关闭自动变配  **默认取值**：  不涉及。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public SetAutoScalingPolicyRequestBody withMonitorCycle(Integer monitorCycle) {
        this.monitorCycle = monitorCycle;
        return this;
    }

    /**
     * **参数解释**：  观察窗口，单位秒。  **约束限制**：  不涉及。  **取值范围**：  300-1800  **默认取值**：  不涉及。
     * @return monitorCycle
     */
    public Integer getMonitorCycle() {
        return monitorCycle;
    }

    public void setMonitorCycle(Integer monitorCycle) {
        this.monitorCycle = monitorCycle;
    }

    public SetAutoScalingPolicyRequestBody withSilenceCycle(Integer silenceCycle) {
        this.silenceCycle = silenceCycle;
        return this;
    }

    /**
     * **参数解释**：  静默期，单位秒。  **约束限制**：  不涉及。  **取值范围**：  300-604800  **默认取值**：  不涉及。
     * @return silenceCycle
     */
    public Integer getSilenceCycle() {
        return silenceCycle;
    }

    public void setSilenceCycle(Integer silenceCycle) {
        this.silenceCycle = silenceCycle;
    }

    public SetAutoScalingPolicyRequestBody withEnlargeThreshold(Integer enlargeThreshold) {
        this.enlargeThreshold = enlargeThreshold;
        return this;
    }

    /**
     * **参数解释**：  自动升配触发阈值，单位百分比。  **约束限制**：  不涉及。  **取值范围**：  50-100  **默认取值**：  不涉及。
     * @return enlargeThreshold
     */
    public Integer getEnlargeThreshold() {
        return enlargeThreshold;
    }

    public void setEnlargeThreshold(Integer enlargeThreshold) {
        this.enlargeThreshold = enlargeThreshold;
    }

    public SetAutoScalingPolicyRequestBody withMaxFlavor(String maxFlavor) {
        this.maxFlavor = maxFlavor;
        return this;
    }

    /**
     * **参数解释**：  最大变配规格上限。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return maxFlavor
     */
    public String getMaxFlavor() {
        return maxFlavor;
    }

    public void setMaxFlavor(String maxFlavor) {
        this.maxFlavor = maxFlavor;
    }

    public SetAutoScalingPolicyRequestBody withReduceEnabled(String reduceEnabled) {
        this.reduceEnabled = reduceEnabled;
        return this;
    }

    /**
     * **参数解释**：  自动降配状态。  **约束限制**：  不涉及。  **取值范围**：  - ON：自动降配开启 - OFF：自动降配关闭  **默认取值**：  不涉及。
     * @return reduceEnabled
     */
    public String getReduceEnabled() {
        return reduceEnabled;
    }

    public void setReduceEnabled(String reduceEnabled) {
        this.reduceEnabled = reduceEnabled;
    }

    public SetAutoScalingPolicyRequestBody withReduceThreshold(Integer reduceThreshold) {
        this.reduceThreshold = reduceThreshold;
        return this;
    }

    /**
     * **参数解释**：  自动降配触发阈值。  **约束限制**：  不涉及。  **取值范围**：  10-30  **默认取值**：  不涉及。
     * @return reduceThreshold
     */
    public Integer getReduceThreshold() {
        return reduceThreshold;
    }

    public void setReduceThreshold(Integer reduceThreshold) {
        this.reduceThreshold = reduceThreshold;
    }

    public SetAutoScalingPolicyRequestBody withMinFlavor(String minFlavor) {
        this.minFlavor = minFlavor;
        return this;
    }

    /**
     * **参数解释**：  最小变配规格下限。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return minFlavor
     */
    public String getMinFlavor() {
        return minFlavor;
    }

    public void setMinFlavor(String minFlavor) {
        this.minFlavor = minFlavor;
    }

    public SetAutoScalingPolicyRequestBody withReadOnlyScalingStrategy(
        ReadOnlyScalingStrategy readOnlyScalingStrategy) {
        this.readOnlyScalingStrategy = readOnlyScalingStrategy;
        return this;
    }

    public SetAutoScalingPolicyRequestBody withReadOnlyScalingStrategy(
        Consumer<ReadOnlyScalingStrategy> readOnlyScalingStrategySetter) {
        if (this.readOnlyScalingStrategy == null) {
            this.readOnlyScalingStrategy = new ReadOnlyScalingStrategy();
            readOnlyScalingStrategySetter.accept(this.readOnlyScalingStrategy);
        }

        return this;
    }

    /**
     * Get readOnlyScalingStrategy
     * @return readOnlyScalingStrategy
     */
    public ReadOnlyScalingStrategy getReadOnlyScalingStrategy() {
        return readOnlyScalingStrategy;
    }

    public void setReadOnlyScalingStrategy(ReadOnlyScalingStrategy readOnlyScalingStrategy) {
        this.readOnlyScalingStrategy = readOnlyScalingStrategy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetAutoScalingPolicyRequestBody that = (SetAutoScalingPolicyRequestBody) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.monitorCycle, that.monitorCycle)
            && Objects.equals(this.silenceCycle, that.silenceCycle)
            && Objects.equals(this.enlargeThreshold, that.enlargeThreshold)
            && Objects.equals(this.maxFlavor, that.maxFlavor) && Objects.equals(this.reduceEnabled, that.reduceEnabled)
            && Objects.equals(this.reduceThreshold, that.reduceThreshold)
            && Objects.equals(this.minFlavor, that.minFlavor)
            && Objects.equals(this.readOnlyScalingStrategy, that.readOnlyScalingStrategy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status,
            monitorCycle,
            silenceCycle,
            enlargeThreshold,
            maxFlavor,
            reduceEnabled,
            reduceThreshold,
            minFlavor,
            readOnlyScalingStrategy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetAutoScalingPolicyRequestBody {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    monitorCycle: ").append(toIndentedString(monitorCycle)).append("\n");
        sb.append("    silenceCycle: ").append(toIndentedString(silenceCycle)).append("\n");
        sb.append("    enlargeThreshold: ").append(toIndentedString(enlargeThreshold)).append("\n");
        sb.append("    maxFlavor: ").append(toIndentedString(maxFlavor)).append("\n");
        sb.append("    reduceEnabled: ").append(toIndentedString(reduceEnabled)).append("\n");
        sb.append("    reduceThreshold: ").append(toIndentedString(reduceThreshold)).append("\n");
        sb.append("    minFlavor: ").append(toIndentedString(minFlavor)).append("\n");
        sb.append("    readOnlyScalingStrategy: ").append(toIndentedString(readOnlyScalingStrategy)).append("\n");
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
