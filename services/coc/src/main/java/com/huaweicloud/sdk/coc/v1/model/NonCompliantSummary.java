package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 不合规总结
 */
public class NonCompliantSummary {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "non_compliant_count")

    private Integer nonCompliantCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity_summary")

    private SeveritySummary severitySummary;

    public NonCompliantSummary withNonCompliantCount(Integer nonCompliantCount) {
        this.nonCompliantCount = nonCompliantCount;
        return this;
    }

    /**
     * 不合规补丁数量
     * @return nonCompliantCount
     */
    public Integer getNonCompliantCount() {
        return nonCompliantCount;
    }

    public void setNonCompliantCount(Integer nonCompliantCount) {
        this.nonCompliantCount = nonCompliantCount;
    }

    public NonCompliantSummary withSeveritySummary(SeveritySummary severitySummary) {
        this.severitySummary = severitySummary;
        return this;
    }

    public NonCompliantSummary withSeveritySummary(Consumer<SeveritySummary> severitySummarySetter) {
        if (this.severitySummary == null) {
            this.severitySummary = new SeveritySummary();
            severitySummarySetter.accept(this.severitySummary);
        }

        return this;
    }

    /**
     * Get severitySummary
     * @return severitySummary
     */
    public SeveritySummary getSeveritySummary() {
        return severitySummary;
    }

    public void setSeveritySummary(SeveritySummary severitySummary) {
        this.severitySummary = severitySummary;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NonCompliantSummary that = (NonCompliantSummary) obj;
        return Objects.equals(this.nonCompliantCount, that.nonCompliantCount)
            && Objects.equals(this.severitySummary, that.severitySummary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nonCompliantCount, severitySummary);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NonCompliantSummary {\n");
        sb.append("    nonCompliantCount: ").append(toIndentedString(nonCompliantCount)).append("\n");
        sb.append("    severitySummary: ").append(toIndentedString(severitySummary)).append("\n");
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
