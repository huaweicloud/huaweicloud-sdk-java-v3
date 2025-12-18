package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ParamGroupParameterDiffV3
 */
public class ParamGroupParameterDiffV3 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_value")

    private String sourceValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_value")

    private String targetValue;

    public ParamGroupParameterDiffV3 withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：  参数名称。  **参数范围**：  不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ParamGroupParameterDiffV3 withSourceValue(String sourceValue) {
        this.sourceValue = sourceValue;
        return this;
    }

    /**
     * **参数解释**：  源参数值。  **参数范围**：  不涉及。
     * @return sourceValue
     */
    public String getSourceValue() {
        return sourceValue;
    }

    public void setSourceValue(String sourceValue) {
        this.sourceValue = sourceValue;
    }

    public ParamGroupParameterDiffV3 withTargetValue(String targetValue) {
        this.targetValue = targetValue;
        return this;
    }

    /**
     * **参数解释**：  目标参数值。  **参数范围**：  不涉及。
     * @return targetValue
     */
    public String getTargetValue() {
        return targetValue;
    }

    public void setTargetValue(String targetValue) {
        this.targetValue = targetValue;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ParamGroupParameterDiffV3 that = (ParamGroupParameterDiffV3) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.sourceValue, that.sourceValue)
            && Objects.equals(this.targetValue, that.targetValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sourceValue, targetValue);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ParamGroupParameterDiffV3 {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    sourceValue: ").append(toIndentedString(sourceValue)).append("\n");
        sb.append("    targetValue: ").append(toIndentedString(targetValue)).append("\n");
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
