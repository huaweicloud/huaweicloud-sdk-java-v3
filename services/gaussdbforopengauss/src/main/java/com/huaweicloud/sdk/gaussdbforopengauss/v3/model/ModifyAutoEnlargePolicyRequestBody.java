package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ModifyAutoEnlargePolicyRequestBody
 */
public class ModifyAutoEnlargePolicyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "switch_option")

    private Boolean switchOption;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit_volume_size")

    private Integer limitVolumeSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_available_percent")

    private Integer triggerAvailablePercent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step_size")

    private Integer stepSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step_percent")

    private Integer stepPercent;

    public ModifyAutoEnlargePolicyRequestBody withSwitchOption(Boolean switchOption) {
        this.switchOption = switchOption;
        return this;
    }

    /**
     * **参数解释**: 磁盘自动扩容开关。 **约束限制**: 不涉及。 **取值范围**: - true：开启磁盘自动扩容。 - false：关闭磁盘自动扩容。  **默认取值**: 不涉及。
     * @return switchOption
     */
    public Boolean getSwitchOption() {
        return switchOption;
    }

    public void setSwitchOption(Boolean switchOption) {
        this.switchOption = switchOption;
    }

    public ModifyAutoEnlargePolicyRequestBody withLimitVolumeSize(Integer limitVolumeSize) {
        this.limitVolumeSize = limitVolumeSize;
        return this;
    }

    /**
     * **参数解释**: 存储自动扩容上限。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 不涉及。
     * @return limitVolumeSize
     */
    public Integer getLimitVolumeSize() {
        return limitVolumeSize;
    }

    public void setLimitVolumeSize(Integer limitVolumeSize) {
        this.limitVolumeSize = limitVolumeSize;
    }

    public ModifyAutoEnlargePolicyRequestBody withTriggerAvailablePercent(Integer triggerAvailablePercent) {
        this.triggerAvailablePercent = triggerAvailablePercent;
        return this;
    }

    /**
     * **参数解释**: 可用存储空间率。 **约束限制**: 不涉及。 **取值范围**: 0-100。 **默认取值**: 20。
     * @return triggerAvailablePercent
     */
    public Integer getTriggerAvailablePercent() {
        return triggerAvailablePercent;
    }

    public void setTriggerAvailablePercent(Integer triggerAvailablePercent) {
        this.triggerAvailablePercent = triggerAvailablePercent;
    }

    public ModifyAutoEnlargePolicyRequestBody withStepSize(Integer stepSize) {
        this.stepSize = stepSize;
        return this;
    }

    /**
     * **参数解释**: 扩容步长，固定大小扩容方式。 **约束限制**: 40的倍数。 **取值范围**: 不涉及。 **默认取值**: 40。
     * @return stepSize
     */
    public Integer getStepSize() {
        return stepSize;
    }

    public void setStepSize(Integer stepSize) {
        this.stepSize = stepSize;
    }

    public ModifyAutoEnlargePolicyRequestBody withStepPercent(Integer stepPercent) {
        this.stepPercent = stepPercent;
        return this;
    }

    /**
     * **参数解释**: 扩容步长，百分比扩容方式。 **约束限制**: 不能小于1。 **取值范围**: 不涉及。 **默认取值**: 20。
     * @return stepPercent
     */
    public Integer getStepPercent() {
        return stepPercent;
    }

    public void setStepPercent(Integer stepPercent) {
        this.stepPercent = stepPercent;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModifyAutoEnlargePolicyRequestBody that = (ModifyAutoEnlargePolicyRequestBody) obj;
        return Objects.equals(this.switchOption, that.switchOption)
            && Objects.equals(this.limitVolumeSize, that.limitVolumeSize)
            && Objects.equals(this.triggerAvailablePercent, that.triggerAvailablePercent)
            && Objects.equals(this.stepSize, that.stepSize) && Objects.equals(this.stepPercent, that.stepPercent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(switchOption, limitVolumeSize, triggerAvailablePercent, stepSize, stepPercent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyAutoEnlargePolicyRequestBody {\n");
        sb.append("    switchOption: ").append(toIndentedString(switchOption)).append("\n");
        sb.append("    limitVolumeSize: ").append(toIndentedString(limitVolumeSize)).append("\n");
        sb.append("    triggerAvailablePercent: ").append(toIndentedString(triggerAvailablePercent)).append("\n");
        sb.append("    stepSize: ").append(toIndentedString(stepSize)).append("\n");
        sb.append("    stepPercent: ").append(toIndentedString(stepPercent)).append("\n");
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
