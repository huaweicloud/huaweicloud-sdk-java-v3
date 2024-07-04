package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CheckStarrocksParamsRequestBody
 */
public class CheckStarrocksParamsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_configuration_id")

    private String sourceConfigurationId;

    public CheckStarrocksParamsRequestBody withSourceConfigurationId(String sourceConfigurationId) {
        this.sourceConfigurationId = sourceConfigurationId;
        return this;
    }

    /**
     * 需要进行比较的源参数模板ID。通过ListStarrocksInstanceInfo接口获得。
     * @return sourceConfigurationId
     */
    public String getSourceConfigurationId() {
        return sourceConfigurationId;
    }

    public void setSourceConfigurationId(String sourceConfigurationId) {
        this.sourceConfigurationId = sourceConfigurationId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckStarrocksParamsRequestBody that = (CheckStarrocksParamsRequestBody) obj;
        return Objects.equals(this.sourceConfigurationId, that.sourceConfigurationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sourceConfigurationId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckStarrocksParamsRequestBody {\n");
        sb.append("    sourceConfigurationId: ").append(toIndentedString(sourceConfigurationId)).append("\n");
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
