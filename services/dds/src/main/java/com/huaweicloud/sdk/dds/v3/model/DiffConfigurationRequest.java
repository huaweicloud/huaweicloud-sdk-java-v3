package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DiffConfigurationRequest
 */
public class DiffConfigurationRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_configuration_id")

    private String sourceConfigurationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_configuration_id")

    private String targetConfigurationId;

    public DiffConfigurationRequest withSourceConfigurationId(String sourceConfigurationId) {
        this.sourceConfigurationId = sourceConfigurationId;
        return this;
    }

    /**
     * 需要进行比较的参数模板ID。
     * @return sourceConfigurationId
     */
    public String getSourceConfigurationId() {
        return sourceConfigurationId;
    }

    public void setSourceConfigurationId(String sourceConfigurationId) {
        this.sourceConfigurationId = sourceConfigurationId;
    }

    public DiffConfigurationRequest withTargetConfigurationId(String targetConfigurationId) {
        this.targetConfigurationId = targetConfigurationId;
        return this;
    }

    /**
     * 需要进行比较的参数模板ID。
     * @return targetConfigurationId
     */
    public String getTargetConfigurationId() {
        return targetConfigurationId;
    }

    public void setTargetConfigurationId(String targetConfigurationId) {
        this.targetConfigurationId = targetConfigurationId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DiffConfigurationRequest diffConfigurationRequest = (DiffConfigurationRequest) o;
        return Objects.equals(this.sourceConfigurationId, diffConfigurationRequest.sourceConfigurationId)
            && Objects.equals(this.targetConfigurationId, diffConfigurationRequest.targetConfigurationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceConfigurationId, targetConfigurationId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DiffConfigurationRequest {\n");
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
