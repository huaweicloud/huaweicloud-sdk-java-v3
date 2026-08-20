package com.huaweicloud.sdk.projectman.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 修改的工作项属性。
 */
public class BatchBaselineIpdIssuesParamAttribute {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "baseline")

    private String baseline;

    public BatchBaselineIpdIssuesParamAttribute withBaseline(String baseline) {
        this.baseline = baseline;
        return this;
    }

    /**
     * 工作项基线标识。
     * @return baseline
     */
    public String getBaseline() {
        return baseline;
    }

    public void setBaseline(String baseline) {
        this.baseline = baseline;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchBaselineIpdIssuesParamAttribute that = (BatchBaselineIpdIssuesParamAttribute) obj;
        return Objects.equals(this.baseline, that.baseline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(baseline);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchBaselineIpdIssuesParamAttribute {\n");
        sb.append("    baseline: ").append(toIndentedString(baseline)).append("\n");
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
