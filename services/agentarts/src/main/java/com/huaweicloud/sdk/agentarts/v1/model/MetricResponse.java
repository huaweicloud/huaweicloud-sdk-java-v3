package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MetricResponse
 */
public class MetricResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_name")

    private String metricName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "draft_total")

    private Integer draftTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "release_total")

    private Integer releaseTotal;

    public MetricResponse withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * 指标名
     * @return metricName
     */
    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    public MetricResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 总数
     * minimum: 0
     * maximum: 1000000
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public MetricResponse withDraftTotal(Integer draftTotal) {
        this.draftTotal = draftTotal;
        return this;
    }

    /**
     * 草稿类型的总数
     * minimum: 0
     * maximum: 1000000
     * @return draftTotal
     */
    public Integer getDraftTotal() {
        return draftTotal;
    }

    public void setDraftTotal(Integer draftTotal) {
        this.draftTotal = draftTotal;
    }

    public MetricResponse withReleaseTotal(Integer releaseTotal) {
        this.releaseTotal = releaseTotal;
        return this;
    }

    /**
     * 已发布版本总数
     * minimum: 0
     * maximum: 1000000
     * @return releaseTotal
     */
    public Integer getReleaseTotal() {
        return releaseTotal;
    }

    public void setReleaseTotal(Integer releaseTotal) {
        this.releaseTotal = releaseTotal;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MetricResponse that = (MetricResponse) obj;
        return Objects.equals(this.metricName, that.metricName) && Objects.equals(this.total, that.total)
            && Objects.equals(this.draftTotal, that.draftTotal) && Objects.equals(this.releaseTotal, that.releaseTotal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metricName, total, draftTotal, releaseTotal);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetricResponse {\n");
        sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    draftTotal: ").append(toIndentedString(draftTotal)).append("\n");
        sb.append("    releaseTotal: ").append(toIndentedString(releaseTotal)).append("\n");
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
