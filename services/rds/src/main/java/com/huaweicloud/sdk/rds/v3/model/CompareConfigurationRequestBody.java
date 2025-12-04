package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CompareConfigurationRequestBody
 */
public class CompareConfigurationRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_id")

    private String sourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_id")

    private String targetId;

    public CompareConfigurationRequestBody withSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /**
     * **参数解释**：  源参数模板id。  **约束限制**：  不涉及。
     * @return sourceId
     */
    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public CompareConfigurationRequestBody withTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }

    /**
     * **参数解释**：  目标参数模板id。  **约束限制**：  不涉及。
     * @return targetId
     */
    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CompareConfigurationRequestBody that = (CompareConfigurationRequestBody) obj;
        return Objects.equals(this.sourceId, that.sourceId) && Objects.equals(this.targetId, that.targetId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceId, targetId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompareConfigurationRequestBody {\n");
        sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
        sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
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
