package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CommitStatsDto
 */
public class CommitStatsDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "additions")

    private Integer additions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deletions")

    private Integer deletions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public CommitStatsDto withAdditions(Integer additions) {
        this.additions = additions;
        return this;
    }

    /**
     * **参数解释：** 增加行数。 **取值范围：** 不涉及。
     * @return additions
     */
    public Integer getAdditions() {
        return additions;
    }

    public void setAdditions(Integer additions) {
        this.additions = additions;
    }

    public CommitStatsDto withDeletions(Integer deletions) {
        this.deletions = deletions;
        return this;
    }

    /**
     * **参数解释：** 删除行数。 **取值范围：** 不涉及。
     * @return deletions
     */
    public Integer getDeletions() {
        return deletions;
    }

    public void setDeletions(Integer deletions) {
        this.deletions = deletions;
    }

    public CommitStatsDto withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释：** 变更行数。 **取值范围：** 不涉及。
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
        CommitStatsDto that = (CommitStatsDto) obj;
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
        sb.append("class CommitStatsDto {\n");
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
