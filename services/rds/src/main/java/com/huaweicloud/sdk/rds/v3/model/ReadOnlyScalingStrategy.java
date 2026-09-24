package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 只读自动变配策略。
 */
public class ReadOnlyScalingStrategy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "read_only_enlarge_enabled")

    private String readOnlyEnlargeEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "read_only_reduce_enabled")

    private String readOnlyReduceEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "read_only_monitor_cycle")

    private String readOnlyMonitorCycle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "read_only_silence_cycle")

    private String readOnlySilenceCycle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_read_only_count")

    private String maxReadOnlyCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "read_only_enlarge_threshold")

    private String readOnlyEnlargeThreshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "read_only_flavor")

    private String readOnlyFlavor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_read_only_count")

    private String minReadOnlyCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "read_only_reduce_threshold")

    private String readOnlyReduceThreshold;

    public ReadOnlyScalingStrategy withReadOnlyEnlargeEnabled(String readOnlyEnlargeEnabled) {
        this.readOnlyEnlargeEnabled = readOnlyEnlargeEnabled;
        return this;
    }

    /**
     * **参数解释**：  只读扩容开关。  **约束限制**：  不涉及。  **取值范围**：  - ON：开启 - OFF：关闭  **默认取值**：  不涉及。
     * @return readOnlyEnlargeEnabled
     */
    public String getReadOnlyEnlargeEnabled() {
        return readOnlyEnlargeEnabled;
    }

    public void setReadOnlyEnlargeEnabled(String readOnlyEnlargeEnabled) {
        this.readOnlyEnlargeEnabled = readOnlyEnlargeEnabled;
    }

    public ReadOnlyScalingStrategy withReadOnlyReduceEnabled(String readOnlyReduceEnabled) {
        this.readOnlyReduceEnabled = readOnlyReduceEnabled;
        return this;
    }

    /**
     * **参数解释**：  只读缩容开关。  **约束限制**：  不涉及。  **取值范围**：  - ON：开启 - OFF：关闭  **默认取值**：  不涉及。
     * @return readOnlyReduceEnabled
     */
    public String getReadOnlyReduceEnabled() {
        return readOnlyReduceEnabled;
    }

    public void setReadOnlyReduceEnabled(String readOnlyReduceEnabled) {
        this.readOnlyReduceEnabled = readOnlyReduceEnabled;
    }

    public ReadOnlyScalingStrategy withReadOnlyMonitorCycle(String readOnlyMonitorCycle) {
        this.readOnlyMonitorCycle = readOnlyMonitorCycle;
        return this;
    }

    /**
     * **参数解释**：  观测窗口时间，单位秒。  **约束限制**：  不涉及。  **取值范围**：  - 120 - 300 - 600 - 900 - 1800  **默认取值**：  不涉及。
     * @return readOnlyMonitorCycle
     */
    public String getReadOnlyMonitorCycle() {
        return readOnlyMonitorCycle;
    }

    public void setReadOnlyMonitorCycle(String readOnlyMonitorCycle) {
        this.readOnlyMonitorCycle = readOnlyMonitorCycle;
    }

    public ReadOnlyScalingStrategy withReadOnlySilenceCycle(String readOnlySilenceCycle) {
        this.readOnlySilenceCycle = readOnlySilenceCycle;
        return this;
    }

    /**
     * **参数解释**：  静默期，单位秒。  **约束限制**：  不涉及。  **取值范围**：  - 300 - 600 - 1800 - 3600 - 7200 - 10800 - 86400 - 604800  **默认取值**：  不涉及。
     * @return readOnlySilenceCycle
     */
    public String getReadOnlySilenceCycle() {
        return readOnlySilenceCycle;
    }

    public void setReadOnlySilenceCycle(String readOnlySilenceCycle) {
        this.readOnlySilenceCycle = readOnlySilenceCycle;
    }

    public ReadOnlyScalingStrategy withMaxReadOnlyCount(String maxReadOnlyCount) {
        this.maxReadOnlyCount = maxReadOnlyCount;
        return this;
    }

    /**
     * **参数解释**：  只读最大节点数。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return maxReadOnlyCount
     */
    public String getMaxReadOnlyCount() {
        return maxReadOnlyCount;
    }

    public void setMaxReadOnlyCount(String maxReadOnlyCount) {
        this.maxReadOnlyCount = maxReadOnlyCount;
    }

    public ReadOnlyScalingStrategy withReadOnlyEnlargeThreshold(String readOnlyEnlargeThreshold) {
        this.readOnlyEnlargeThreshold = readOnlyEnlargeThreshold;
        return this;
    }

    /**
     * **参数解释**：  只读扩容阈值。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return readOnlyEnlargeThreshold
     */
    public String getReadOnlyEnlargeThreshold() {
        return readOnlyEnlargeThreshold;
    }

    public void setReadOnlyEnlargeThreshold(String readOnlyEnlargeThreshold) {
        this.readOnlyEnlargeThreshold = readOnlyEnlargeThreshold;
    }

    public ReadOnlyScalingStrategy withReadOnlyFlavor(String readOnlyFlavor) {
        this.readOnlyFlavor = readOnlyFlavor;
        return this;
    }

    /**
     * **参数解释**：  扩容新增只读规格。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return readOnlyFlavor
     */
    public String getReadOnlyFlavor() {
        return readOnlyFlavor;
    }

    public void setReadOnlyFlavor(String readOnlyFlavor) {
        this.readOnlyFlavor = readOnlyFlavor;
    }

    public ReadOnlyScalingStrategy withMinReadOnlyCount(String minReadOnlyCount) {
        this.minReadOnlyCount = minReadOnlyCount;
        return this;
    }

    /**
     * **参数解释**：  只读最小节点数。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return minReadOnlyCount
     */
    public String getMinReadOnlyCount() {
        return minReadOnlyCount;
    }

    public void setMinReadOnlyCount(String minReadOnlyCount) {
        this.minReadOnlyCount = minReadOnlyCount;
    }

    public ReadOnlyScalingStrategy withReadOnlyReduceThreshold(String readOnlyReduceThreshold) {
        this.readOnlyReduceThreshold = readOnlyReduceThreshold;
        return this;
    }

    /**
     * **参数解释**：  只读缩容阈值。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return readOnlyReduceThreshold
     */
    public String getReadOnlyReduceThreshold() {
        return readOnlyReduceThreshold;
    }

    public void setReadOnlyReduceThreshold(String readOnlyReduceThreshold) {
        this.readOnlyReduceThreshold = readOnlyReduceThreshold;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReadOnlyScalingStrategy that = (ReadOnlyScalingStrategy) obj;
        return Objects.equals(this.readOnlyEnlargeEnabled, that.readOnlyEnlargeEnabled)
            && Objects.equals(this.readOnlyReduceEnabled, that.readOnlyReduceEnabled)
            && Objects.equals(this.readOnlyMonitorCycle, that.readOnlyMonitorCycle)
            && Objects.equals(this.readOnlySilenceCycle, that.readOnlySilenceCycle)
            && Objects.equals(this.maxReadOnlyCount, that.maxReadOnlyCount)
            && Objects.equals(this.readOnlyEnlargeThreshold, that.readOnlyEnlargeThreshold)
            && Objects.equals(this.readOnlyFlavor, that.readOnlyFlavor)
            && Objects.equals(this.minReadOnlyCount, that.minReadOnlyCount)
            && Objects.equals(this.readOnlyReduceThreshold, that.readOnlyReduceThreshold);
    }

    @Override
    public int hashCode() {
        return Objects.hash(readOnlyEnlargeEnabled,
            readOnlyReduceEnabled,
            readOnlyMonitorCycle,
            readOnlySilenceCycle,
            maxReadOnlyCount,
            readOnlyEnlargeThreshold,
            readOnlyFlavor,
            minReadOnlyCount,
            readOnlyReduceThreshold);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReadOnlyScalingStrategy {\n");
        sb.append("    readOnlyEnlargeEnabled: ").append(toIndentedString(readOnlyEnlargeEnabled)).append("\n");
        sb.append("    readOnlyReduceEnabled: ").append(toIndentedString(readOnlyReduceEnabled)).append("\n");
        sb.append("    readOnlyMonitorCycle: ").append(toIndentedString(readOnlyMonitorCycle)).append("\n");
        sb.append("    readOnlySilenceCycle: ").append(toIndentedString(readOnlySilenceCycle)).append("\n");
        sb.append("    maxReadOnlyCount: ").append(toIndentedString(maxReadOnlyCount)).append("\n");
        sb.append("    readOnlyEnlargeThreshold: ").append(toIndentedString(readOnlyEnlargeThreshold)).append("\n");
        sb.append("    readOnlyFlavor: ").append(toIndentedString(readOnlyFlavor)).append("\n");
        sb.append("    minReadOnlyCount: ").append(toIndentedString(minReadOnlyCount)).append("\n");
        sb.append("    readOnlyReduceThreshold: ").append(toIndentedString(readOnlyReduceThreshold)).append("\n");
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
