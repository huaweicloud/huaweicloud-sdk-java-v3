package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 差异提交数量
 */
public class DivergingCommitCounts {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "behind")

    private Integer behind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ahead")

    private Integer ahead;

    public DivergingCommitCounts withBehind(Integer behind) {
        this.behind = behind;
        return this;
    }

    /**
     * 落后默认分支提交数量
     * @return behind
     */
    public Integer getBehind() {
        return behind;
    }

    public void setBehind(Integer behind) {
        this.behind = behind;
    }

    public DivergingCommitCounts withAhead(Integer ahead) {
        this.ahead = ahead;
        return this;
    }

    /**
     * 领先默认分支提交数量
     * @return ahead
     */
    public Integer getAhead() {
        return ahead;
    }

    public void setAhead(Integer ahead) {
        this.ahead = ahead;
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
        return Objects.equals(this.behind, that.behind) && Objects.equals(this.ahead, that.ahead);
    }

    @Override
    public int hashCode() {
        return Objects.hash(behind, ahead);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DivergingCommitCounts {\n");
        sb.append("    behind: ").append(toIndentedString(behind)).append("\n");
        sb.append("    ahead: ").append(toIndentedString(ahead)).append("\n");
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
