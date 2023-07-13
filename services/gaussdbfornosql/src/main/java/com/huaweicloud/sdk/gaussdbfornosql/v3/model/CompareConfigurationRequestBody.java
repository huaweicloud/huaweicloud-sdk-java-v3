package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CompareConfigurationRequestBody
 */
public class CompareConfigurationRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_configuration_id")

    private String sourceConfigurationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_configuration_id")

    private String targetConfigurationId;

    public CompareConfigurationRequestBody withSourceConfigurationId(String sourceConfigurationId) {
        this.sourceConfigurationId = sourceConfigurationId;
        return this;
    }

    /**
     * 需要进行比较的源参数模板ID。
     * @return sourceConfigurationId
     */
    public String getSourceConfigurationId() {
        return sourceConfigurationId;
    }

    public void setSourceConfigurationId(String sourceConfigurationId) {
        this.sourceConfigurationId = sourceConfigurationId;
    }

    public CompareConfigurationRequestBody withTargetConfigurationId(String targetConfigurationId) {
        this.targetConfigurationId = targetConfigurationId;
        return this;
    }

    /**
     * 需要进行比较的目标参数模板ID。
     * @return targetConfigurationId
     */
    public String getTargetConfigurationId() {
        return targetConfigurationId;
    }

    public void setTargetConfigurationId(String targetConfigurationId) {
        this.targetConfigurationId = targetConfigurationId;
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
        return Objects.equals(this.sourceConfigurationId, that.sourceConfigurationId)
            && Objects.equals(this.targetConfigurationId, that.targetConfigurationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceConfigurationId, targetConfigurationId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompareConfigurationRequestBody {\n");
        sb.append("    sourceConfigurationId: ").append(toIndentedString(sourceConfigurationId)).append("\n");
        sb.append("    targetConfigurationId: ").append(toIndentedString(targetConfigurationId)).append("\n");
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
