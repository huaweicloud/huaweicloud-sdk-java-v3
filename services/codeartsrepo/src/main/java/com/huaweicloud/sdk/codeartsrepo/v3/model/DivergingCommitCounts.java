package com.huaweicloud.sdk.codeartsrepo.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DivergingCommitCounts
 */
public class DivergingCommitCounts {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ahead")

    private Double ahead;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "behind")

    private Double behind;

    public DivergingCommitCounts withAhead(Double ahead) {
        this.ahead = ahead;
        return this;
    }

    /**
     * 领先提交数
     * @return ahead
     */
    public Double getAhead() {
        return ahead;
    }

    public void setAhead(Double ahead) {
        this.ahead = ahead;
    }

    public DivergingCommitCounts withBehind(Double behind) {
        this.behind = behind;
        return this;
    }

    /**
     * 滞后提交数
     * @return behind
     */
    public Double getBehind() {
        return behind;
    }

    public void setBehind(Double behind) {
        this.behind = behind;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DivergingCommitCounts that = (DivergingCommitCounts) obj;
        return Objects.equals(this.ahead, that.ahead) && Objects.equals(this.behind, that.behind);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ahead, behind);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DivergingCommitCounts {\n");
        sb.append("    ahead: ").append(toIndentedString(ahead)).append("\n");
        sb.append("    behind: ").append(toIndentedString(behind)).append("\n");
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
