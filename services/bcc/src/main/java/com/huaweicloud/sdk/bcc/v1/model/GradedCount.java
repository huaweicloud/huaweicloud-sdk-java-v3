package com.huaweicloud.sdk.bcc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 已保护已定级的资源统计
 */
public class GradedCount {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "complete_match")

    private Integer completeMatch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partial_match")

    private Integer partialMatch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "no_match")

    private Integer noMatch;

    public GradedCount withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总数
     * minimum: 0
     * maximum: 2147483647
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public GradedCount withCompleteMatch(Integer completeMatch) {
        this.completeMatch = completeMatch;
        return this;
    }

    /**
     * 合规资源数
     * minimum: 0
     * maximum: 2147483647
     * @return completeMatch
     */
    public Integer getCompleteMatch() {
        return completeMatch;
    }

    public void setCompleteMatch(Integer completeMatch) {
        this.completeMatch = completeMatch;
    }

    public GradedCount withPartialMatch(Integer partialMatch) {
        this.partialMatch = partialMatch;
        return this;
    }

    /**
     * 部分合规资源数
     * minimum: 0
     * maximum: 2147483647
     * @return partialMatch
     */
    public Integer getPartialMatch() {
        return partialMatch;
    }

    public void setPartialMatch(Integer partialMatch) {
        this.partialMatch = partialMatch;
    }

    public GradedCount withNoMatch(Integer noMatch) {
        this.noMatch = noMatch;
        return this;
    }

    /**
     * 不合规资源数
     * minimum: 0
     * maximum: 2147483647
     * @return noMatch
     */
    public Integer getNoMatch() {
        return noMatch;
    }

    public void setNoMatch(Integer noMatch) {
        this.noMatch = noMatch;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GradedCount that = (GradedCount) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.completeMatch, that.completeMatch)
            && Objects.equals(this.partialMatch, that.partialMatch) && Objects.equals(this.noMatch, that.noMatch);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, completeMatch, partialMatch, noMatch);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GradedCount {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    completeMatch: ").append(toIndentedString(completeMatch)).append("\n");
        sb.append("    partialMatch: ").append(toIndentedString(partialMatch)).append("\n");
        sb.append("    noMatch: ").append(toIndentedString(noMatch)).append("\n");
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
