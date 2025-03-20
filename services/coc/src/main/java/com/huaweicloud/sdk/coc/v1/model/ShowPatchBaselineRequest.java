package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowPatchBaselineRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "baseline_id")

    private String baselineId;

    public ShowPatchBaselineRequest withBaselineId(String baselineId) {
        this.baselineId = baselineId;
        return this;
    }

    /**
     * 基线id
     * @return baselineId
     */
    public String getBaselineId() {
        return baselineId;
    }

    public void setBaselineId(String baselineId) {
        this.baselineId = baselineId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowPatchBaselineRequest that = (ShowPatchBaselineRequest) obj;
        return Objects.equals(this.baselineId, that.baselineId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(baselineId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPatchBaselineRequest {\n");
        sb.append("    baselineId: ").append(toIndentedString(baselineId)).append("\n");
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
