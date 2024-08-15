package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SeveritySummary
 */
public class SeveritySummary {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "critical_count")

    private Integer criticalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "high_count")

    private Integer highCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "informational_count")

    private Integer informationalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "low_count")

    private Integer lowCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "medium_count")

    private Integer mediumCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unspecified_count")

    private Integer unspecifiedCount;

    public SeveritySummary withCriticalCount(Integer criticalCount) {
        this.criticalCount = criticalCount;
        return this;
    }

    /**
     * 重大合规性报告数量
     * @return criticalCount
     */
    public Integer getCriticalCount() {
        return criticalCount;
    }

    public void setCriticalCount(Integer criticalCount) {
        this.criticalCount = criticalCount;
    }

    public SeveritySummary withHighCount(Integer highCount) {
        this.highCount = highCount;
        return this;
    }

    /**
     * 高合规性报告数量
     * @return highCount
     */
    public Integer getHighCount() {
        return highCount;
    }

    public void setHighCount(Integer highCount) {
        this.highCount = highCount;
    }

    public SeveritySummary withInformationalCount(Integer informationalCount) {
        this.informationalCount = informationalCount;
        return this;
    }

    /**
     * 信息性合规性报告数量
     * @return informationalCount
     */
    public Integer getInformationalCount() {
        return informationalCount;
    }

    public void setInformationalCount(Integer informationalCount) {
        this.informationalCount = informationalCount;
    }

    public SeveritySummary withLowCount(Integer lowCount) {
        this.lowCount = lowCount;
        return this;
    }

    /**
     * 低合规性报告数量
     * @return lowCount
     */
    public Integer getLowCount() {
        return lowCount;
    }

    public void setLowCount(Integer lowCount) {
        this.lowCount = lowCount;
    }

    public SeveritySummary withMediumCount(Integer mediumCount) {
        this.mediumCount = mediumCount;
        return this;
    }

    /**
     * 中级合规性报告数量
     * @return mediumCount
     */
    public Integer getMediumCount() {
        return mediumCount;
    }

    public void setMediumCount(Integer mediumCount) {
        this.mediumCount = mediumCount;
    }

    public SeveritySummary withUnspecifiedCount(Integer unspecifiedCount) {
        this.unspecifiedCount = unspecifiedCount;
        return this;
    }

    /**
     * 未指定合规性报告数量
     * @return unspecifiedCount
     */
    public Integer getUnspecifiedCount() {
        return unspecifiedCount;
    }

    public void setUnspecifiedCount(Integer unspecifiedCount) {
        this.unspecifiedCount = unspecifiedCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SeveritySummary that = (SeveritySummary) obj;
        return Objects.equals(this.criticalCount, that.criticalCount) && Objects.equals(this.highCount, that.highCount)
            && Objects.equals(this.informationalCount, that.informationalCount)
            && Objects.equals(this.lowCount, that.lowCount) && Objects.equals(this.mediumCount, that.mediumCount)
            && Objects.equals(this.unspecifiedCount, that.unspecifiedCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(criticalCount, highCount, informationalCount, lowCount, mediumCount, unspecifiedCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SeveritySummary {\n");
        sb.append("    criticalCount: ").append(toIndentedString(criticalCount)).append("\n");
        sb.append("    highCount: ").append(toIndentedString(highCount)).append("\n");
        sb.append("    informationalCount: ").append(toIndentedString(informationalCount)).append("\n");
        sb.append("    lowCount: ").append(toIndentedString(lowCount)).append("\n");
        sb.append("    mediumCount: ").append(toIndentedString(mediumCount)).append("\n");
        sb.append("    unspecifiedCount: ").append(toIndentedString(unspecifiedCount)).append("\n");
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
