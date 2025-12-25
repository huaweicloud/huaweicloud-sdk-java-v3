package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 等级统计详情
 */
public class ListAlertRuleTemplateMetricsResponseBodySeverityMetric {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "HIGH")

    private Integer high;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "TIPS")

    private Integer tips;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "FATAL")

    private Integer fatal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "LOW")

    private Integer low;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "MEDIUM")

    private Integer medium;

    public ListAlertRuleTemplateMetricsResponseBodySeverityMetric withHigh(Integer high) {
        this.high = high;
        return this;
    }

    /**
     * HIGH等级数量
     * minimum: 0
     * maximum: 10000
     * @return high
     */
    public Integer getHigh() {
        return high;
    }

    public void setHigh(Integer high) {
        this.high = high;
    }

    public ListAlertRuleTemplateMetricsResponseBodySeverityMetric withTips(Integer tips) {
        this.tips = tips;
        return this;
    }

    /**
     * TIPS等级数量
     * minimum: 0
     * maximum: 10000
     * @return tips
     */
    public Integer getTips() {
        return tips;
    }

    public void setTips(Integer tips) {
        this.tips = tips;
    }

    public ListAlertRuleTemplateMetricsResponseBodySeverityMetric withFatal(Integer fatal) {
        this.fatal = fatal;
        return this;
    }

    /**
     * FATAL等级数量
     * minimum: 0
     * maximum: 10000
     * @return fatal
     */
    public Integer getFatal() {
        return fatal;
    }

    public void setFatal(Integer fatal) {
        this.fatal = fatal;
    }

    public ListAlertRuleTemplateMetricsResponseBodySeverityMetric withLow(Integer low) {
        this.low = low;
        return this;
    }

    /**
     * LOW等级数量
     * minimum: 0
     * maximum: 10000
     * @return low
     */
    public Integer getLow() {
        return low;
    }

    public void setLow(Integer low) {
        this.low = low;
    }

    public ListAlertRuleTemplateMetricsResponseBodySeverityMetric withMedium(Integer medium) {
        this.medium = medium;
        return this;
    }

    /**
     * MEDIUM等级数量
     * minimum: 0
     * maximum: 10000
     * @return medium
     */
    public Integer getMedium() {
        return medium;
    }

    public void setMedium(Integer medium) {
        this.medium = medium;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAlertRuleTemplateMetricsResponseBodySeverityMetric that =
            (ListAlertRuleTemplateMetricsResponseBodySeverityMetric) obj;
        return Objects.equals(this.high, that.high) && Objects.equals(this.tips, that.tips)
            && Objects.equals(this.fatal, that.fatal) && Objects.equals(this.low, that.low)
            && Objects.equals(this.medium, that.medium);
    }

    @Override
    public int hashCode() {
        return Objects.hash(high, tips, fatal, low, medium);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAlertRuleTemplateMetricsResponseBodySeverityMetric {\n");
        sb.append("    high: ").append(toIndentedString(high)).append("\n");
        sb.append("    tips: ").append(toIndentedString(tips)).append("\n");
        sb.append("    fatal: ").append(toIndentedString(fatal)).append("\n");
        sb.append("    low: ").append(toIndentedString(low)).append("\n");
        sb.append("    medium: ").append(toIndentedString(medium)).append("\n");
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
