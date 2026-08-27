package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MysqlVolumeAutoExpandPolicy
 */
public class MysqlVolumeAutoExpandPolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit_size")

    private Integer limitSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_available_percent")

    private Integer triggerAvailablePercent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "step_percent")

    private Integer stepPercent;

    public MysqlVolumeAutoExpandPolicy withLimitSize(Integer limitSize) {
        this.limitSize = limitSize;
        return this;
    }

    /**
     * **参数解释**：  存储自动扩容上限，需要为10的倍数，单位GB。  **约束限制**：  不涉及。  **取值范围**：  10-128000。  **默认取值**：  不涉及。
     * minimum: 10
     * maximum: 128000
     * @return limitSize
     */
    public Integer getLimitSize() {
        return limitSize;
    }

    public void setLimitSize(Integer limitSize) {
        this.limitSize = limitSize;
    }

    public MysqlVolumeAutoExpandPolicy withTriggerAvailablePercent(Integer triggerAvailablePercent) {
        this.triggerAvailablePercent = triggerAvailablePercent;
        return this;
    }

    /**
     * **参数解释**：  可用存储空间率。  **约束限制**：  不涉及。  **取值范围**：  - 1 - 5 - 10 - 15 - 20  **默认取值**：  不涉及。
     * minimum: 10
     * maximum: 20
     * @return triggerAvailablePercent
     */
    public Integer getTriggerAvailablePercent() {
        return triggerAvailablePercent;
    }

    public void setTriggerAvailablePercent(Integer triggerAvailablePercent) {
        this.triggerAvailablePercent = triggerAvailablePercent;
    }

    public MysqlVolumeAutoExpandPolicy withStepPercent(Integer stepPercent) {
        this.stepPercent = stepPercent;
        return this;
    }

    /**
     * **参数解释**：  扩容步长百分比。  **约束限制**：  不涉及。  **取值范围**：  5-50。  **默认取值**：  不涉及。
     * minimum: 5
     * maximum: 50
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
        MysqlVolumeAutoExpandPolicy that = (MysqlVolumeAutoExpandPolicy) obj;
        return Objects.equals(this.limitSize, that.limitSize)
            && Objects.equals(this.triggerAvailablePercent, that.triggerAvailablePercent)
            && Objects.equals(this.stepPercent, that.stepPercent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limitSize, triggerAvailablePercent, stepPercent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MysqlVolumeAutoExpandPolicy {\n");
        sb.append("    limitSize: ").append(toIndentedString(limitSize)).append("\n");
        sb.append("    triggerAvailablePercent: ").append(toIndentedString(triggerAvailablePercent)).append("\n");
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
