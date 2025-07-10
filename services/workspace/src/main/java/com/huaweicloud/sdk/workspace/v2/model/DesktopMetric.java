package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DesktopMetric
 */
public class DesktopMetric {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_pool_id")

    private String resourcePoolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric")

    private List<Metric> metric = null;

    public DesktopMetric withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 桌面ID。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public DesktopMetric withResourcePoolId(String resourcePoolId) {
        this.resourcePoolId = resourcePoolId;
        return this;
    }

    /**
     * 桌面池ID(仅桌面池中的桌面存在该字段)。
     * @return resourcePoolId
     */
    public String getResourcePoolId() {
        return resourcePoolId;
    }

    public void setResourcePoolId(String resourcePoolId) {
        this.resourcePoolId = resourcePoolId;
    }

    public DesktopMetric withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * 桌面名称。
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public DesktopMetric withMetric(List<Metric> metric) {
        this.metric = metric;
        return this;
    }

    public DesktopMetric addMetricItem(Metric metricItem) {
        if (this.metric == null) {
            this.metric = new ArrayList<>();
        }
        this.metric.add(metricItem);
        return this;
    }

    public DesktopMetric withMetric(Consumer<List<Metric>> metricSetter) {
        if (this.metric == null) {
            this.metric = new ArrayList<>();
        }
        metricSetter.accept(this.metric);
        return this;
    }

    /**
     * 统计信息 * `desktop_usage` -  桌面使用时长(单位:秒) * `desktop_idle_duration` -  桌面空闲时长(单位:秒)
     * @return metric
     */
    public List<Metric> getMetric() {
        return metric;
    }

    public void setMetric(List<Metric> metric) {
        this.metric = metric;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DesktopMetric that = (DesktopMetric) obj;
        return Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.resourcePoolId, that.resourcePoolId)
            && Objects.equals(this.resourceName, that.resourceName) && Objects.equals(this.metric, that.metric);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceId, resourcePoolId, resourceName, metric);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DesktopMetric {\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    resourcePoolId: ").append(toIndentedString(resourcePoolId)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
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
