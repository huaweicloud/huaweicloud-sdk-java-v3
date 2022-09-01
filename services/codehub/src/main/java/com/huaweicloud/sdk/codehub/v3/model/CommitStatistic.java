package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * CommitStatistic
 */
public class CommitStatistic {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "additions")

    @JacksonXmlProperty(localName = "additions")

    private Integer additions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deletions")

    @JacksonXmlProperty(localName = "deletions")

    private Integer deletions;

    public CommitStatistic withAdditions(Integer additions) {
        this.additions = additions;
        return this;
    }

    /**
     * 增加的行数
     * @return additions
     */
    public Integer getAdditions() {
        return additions;
    }

    public void setAdditions(Integer additions) {
        this.additions = additions;
    }

    public CommitStatistic withDeletions(Integer deletions) {
        this.deletions = deletions;
        return this;
    }

    /**
     * 删除的行数
     * @return deletions
     */
    public Integer getDeletions() {
        return deletions;
    }

    public void setDeletions(Integer deletions) {
        this.deletions = deletions;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CommitStatistic commitStatistic = (CommitStatistic) o;
        return Objects.equals(this.additions, commitStatistic.additions)
            && Objects.equals(this.deletions, commitStatistic.deletions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(additions, deletions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CommitStatistic {\n");
        sb.append("    additions: ").append(toIndentedString(additions)).append("\n");
        sb.append("    deletions: ").append(toIndentedString(deletions)).append("\n");
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
