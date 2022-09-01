package com.huaweicloud.sdk.as.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowScalingConfigRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scaling_configuration_id")

    @JacksonXmlProperty(localName = "scaling_configuration_id")

    private String scalingConfigurationId;

    public ShowScalingConfigRequest withScalingConfigurationId(String scalingConfigurationId) {
        this.scalingConfigurationId = scalingConfigurationId;
        return this;
    }

    /**
     * 伸缩配置ID，查询唯一配置。
     * @return scalingConfigurationId
     */
    public String getScalingConfigurationId() {
        return scalingConfigurationId;
    }

    public void setScalingConfigurationId(String scalingConfigurationId) {
        this.scalingConfigurationId = scalingConfigurationId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowScalingConfigRequest showScalingConfigRequest = (ShowScalingConfigRequest) o;
        return Objects.equals(this.scalingConfigurationId, showScalingConfigRequest.scalingConfigurationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scalingConfigurationId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowScalingConfigRequest {\n");
        sb.append("    scalingConfigurationId: ").append(toIndentedString(scalingConfigurationId)).append("\n");
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
