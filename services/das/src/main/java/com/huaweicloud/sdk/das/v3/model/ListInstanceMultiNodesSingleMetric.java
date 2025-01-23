package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListInstanceMultiNodesSingleMetric
 */
public class ListInstanceMultiNodesSingleMetric {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_name")

    private String metricName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_at")

    private Long startAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_at")

    private Long endAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_infos")

    private List<ListInstanceMultiNodesSingleMetricInstanceInfos> instanceInfos = null;

    public ListInstanceMultiNodesSingleMetric withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * 指标名称
     * @return metricName
     */
    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    public ListInstanceMultiNodesSingleMetric withStartAt(Long startAt) {
        this.startAt = startAt;
        return this;
    }

    /**
     * 开始时间
     * @return startAt
     */
    public Long getStartAt() {
        return startAt;
    }

    public void setStartAt(Long startAt) {
        this.startAt = startAt;
    }

    public ListInstanceMultiNodesSingleMetric withEndAt(Long endAt) {
        this.endAt = endAt;
        return this;
    }

    /**
     * 结束时间
     * @return endAt
     */
    public Long getEndAt() {
        return endAt;
    }

    public void setEndAt(Long endAt) {
        this.endAt = endAt;
    }

    public ListInstanceMultiNodesSingleMetric withInstanceInfos(
        List<ListInstanceMultiNodesSingleMetricInstanceInfos> instanceInfos) {
        this.instanceInfos = instanceInfos;
        return this;
    }

    public ListInstanceMultiNodesSingleMetric addInstanceInfosItem(
        ListInstanceMultiNodesSingleMetricInstanceInfos instanceInfosItem) {
        if (this.instanceInfos == null) {
            this.instanceInfos = new ArrayList<>();
        }
        this.instanceInfos.add(instanceInfosItem);
        return this;
    }

    public ListInstanceMultiNodesSingleMetric withInstanceInfos(
        Consumer<List<ListInstanceMultiNodesSingleMetricInstanceInfos>> instanceInfosSetter) {
        if (this.instanceInfos == null) {
            this.instanceInfos = new ArrayList<>();
        }
        instanceInfosSetter.accept(this.instanceInfos);
        return this;
    }

    /**
     * 实例信息列表
     * @return instanceInfos
     */
    public List<ListInstanceMultiNodesSingleMetricInstanceInfos> getInstanceInfos() {
        return instanceInfos;
    }

    public void setInstanceInfos(List<ListInstanceMultiNodesSingleMetricInstanceInfos> instanceInfos) {
        this.instanceInfos = instanceInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInstanceMultiNodesSingleMetric that = (ListInstanceMultiNodesSingleMetric) obj;
        return Objects.equals(this.metricName, that.metricName) && Objects.equals(this.startAt, that.startAt)
            && Objects.equals(this.endAt, that.endAt) && Objects.equals(this.instanceInfos, that.instanceInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metricName, startAt, endAt, instanceInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstanceMultiNodesSingleMetric {\n");
        sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
        sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
        sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
        sb.append("    instanceInfos: ").append(toIndentedString(instanceInfos)).append("\n");
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
