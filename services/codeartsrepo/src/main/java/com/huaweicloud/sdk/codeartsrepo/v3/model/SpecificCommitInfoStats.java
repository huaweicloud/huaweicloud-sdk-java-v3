package com.huaweicloud.sdk.codeartsrepo.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 变更行数
 */
public class SpecificCommitInfoStats {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "additions")

    private Integer additions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deletions")

    private Integer deletions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SpecificCommitInfoStats that = (SpecificCommitInfoStats) obj;
        return Objects.equals(this.additions, that.additions) && Objects.equals(this.deletions, that.deletions)
            && Objects.equals(this.total, that.total);
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
