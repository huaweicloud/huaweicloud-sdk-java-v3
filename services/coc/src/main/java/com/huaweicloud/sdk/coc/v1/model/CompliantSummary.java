package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * CompliantSummary
 */
public class CompliantSummary {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compliant_count")

    private Integer compliantCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity_summary")

    private SeveritySummary severitySummary;

    public CompliantSummary withCompliantCount(Integer compliantCount) {
        this.compliantCount = compliantCount;
        return this;
    }

    /**
     * 合规补丁数量
     * @return compliantCount
     */
    public Integer getCompliantCount() {
        return compliantCount;
    }

    public void setCompliantCount(Integer compliantCount) {
        this.compliantCount = compliantCount;
    }

    public CompliantSummary withSeveritySummary(SeveritySummary severitySummary) {
        this.severitySummary = severitySummary;
        return this;
    }

    public CompliantSummary withSeveritySummary(Consumer<SeveritySummary> severitySummarySetter) {
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
        CompliantSummary that = (CompliantSummary) obj;
        return Objects.equals(this.compliantCount, that.compliantCount)
            && Objects.equals(this.severitySummary, that.severitySummary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(compliantCount, severitySummary);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CompliantSummary {\n");
        sb.append("    compliantCount: ").append(toIndentedString(compliantCount)).append("\n");
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
