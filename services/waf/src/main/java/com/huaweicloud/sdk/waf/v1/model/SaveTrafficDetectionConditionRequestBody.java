package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * SaveTrafficDetectionConditionRequestBody
 */
public class SaveTrafficDetectionConditionRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition")

    private TrafficDetectionConditionDTO condition;

    public SaveTrafficDetectionConditionRequestBody withCondition(TrafficDetectionConditionDTO condition) {
        this.condition = condition;
        return this;
    }

    public SaveTrafficDetectionConditionRequestBody withCondition(
        Consumer<TrafficDetectionConditionDTO> conditionSetter) {
        if (this.condition == null) {
            this.condition = new TrafficDetectionConditionDTO();
            conditionSetter.accept(this.condition);
        }

        return this;
    }

    /**
     * Get condition
     * @return condition
     */
    public TrafficDetectionConditionDTO getCondition() {
        return condition;
    }

    public void setCondition(TrafficDetectionConditionDTO condition) {
        this.condition = condition;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SaveTrafficDetectionConditionRequestBody that = (SaveTrafficDetectionConditionRequestBody) obj;
        return Objects.equals(this.condition, that.condition);
    }

    @Override
    public int hashCode() {
        return Objects.hash(condition);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SaveTrafficDetectionConditionRequestBody {\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
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
