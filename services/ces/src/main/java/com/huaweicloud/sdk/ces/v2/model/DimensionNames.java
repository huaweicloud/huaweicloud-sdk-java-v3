package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 启用一键告警关联告警规则的维度列表，包括指标告警&amp;事件告警，且至少开启一个
 */
public class DimensionNames {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric")

    private List<String> metric = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event")

    private List<String> event = null;

    public DimensionNames withMetric(List<String> metric) {
        this.metric = metric;
        return this;
    }

    public DimensionNames addMetricItem(String metricItem) {
        if (this.metric == null) {
            this.metric = new ArrayList<>();
        }
        this.metric.add(metricItem);
        return this;
    }

    public DimensionNames withMetric(Consumer<List<String>> metricSetter) {
        if (this.metric == null) {
            this.metric = new ArrayList<>();
        }
        metricSetter.accept(this.metric);
        return this;
    }

    /**
     * 启用一键告警关联指标告警规则的维度列表，未指定的维度默认不开启
     * @return metric
     */
    public List<String> getMetric() {
        return metric;
    }

    public void setMetric(List<String> metric) {
        this.metric = metric;
    }

    public DimensionNames withEvent(List<String> event) {
        this.event = event;
        return this;
    }

    public DimensionNames addEventItem(String eventItem) {
        if (this.event == null) {
            this.event = new ArrayList<>();
        }
        this.event.add(eventItem);
        return this;
    }

    public DimensionNames withEvent(Consumer<List<String>> eventSetter) {
        if (this.event == null) {
            this.event = new ArrayList<>();
        }
        eventSetter.accept(this.event);
        return this;
    }

    /**
     * 启用一键告警关联事件告警规则的维度列表，未指定的维度默认不开启，其中\"\"代表全部资源
     * @return event
     */
    public List<String> getEvent() {
        return event;
    }

    public void setEvent(List<String> event) {
        this.event = event;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DimensionNames that = (DimensionNames) obj;
        return Objects.equals(this.metric, that.metric) && Objects.equals(this.event, that.event);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metric, event);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DimensionNames {\n");
        sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
        sb.append("    event: ").append(toIndentedString(event)).append("\n");
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
