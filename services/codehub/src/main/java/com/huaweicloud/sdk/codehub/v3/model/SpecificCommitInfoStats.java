package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 变更行数
 */
public class SpecificCommitInfoStats {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "additions")

    @JacksonXmlProperty(localName = "additions")

    private Integer additions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deletions")

    @JacksonXmlProperty(localName = "deletions")

    private Integer deletions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    @JacksonXmlProperty(localName = "total")

    private Integer total;

    public SpecificCommitInfoStats withAdditions(Integer additions) {
        this.additions = additions;
        return this;
    }

    /**
     * 变更增加的行数
     * @return additions
     */
    public Integer getAdditions() {
        return additions;
    }

    public void setAdditions(Integer additions) {
        this.additions = additions;
    }

    public SpecificCommitInfoStats withDeletions(Integer deletions) {
        this.deletions = deletions;
        return this;
    }

    /**
     * 变更删除的行数
     * @return deletions
     */
    public Integer getDeletions() {
        return deletions;
    }

    public void setDeletions(Integer deletions) {
        this.deletions = deletions;
    }

    public SpecificCommitInfoStats withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 变更的总行数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SpecificCommitInfoStats specificCommitInfoStats = (SpecificCommitInfoStats) o;
        return Objects.equals(this.additions, specificCommitInfoStats.additions)
            && Objects.equals(this.deletions, specificCommitInfoStats.deletions)
            && Objects.equals(this.total, specificCommitInfoStats.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(additions, deletions, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SpecificCommitInfoStats {\n");
        sb.append("    additions: ").append(toIndentedString(additions)).append("\n");
        sb.append("    deletions: ").append(toIndentedString(deletions)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
