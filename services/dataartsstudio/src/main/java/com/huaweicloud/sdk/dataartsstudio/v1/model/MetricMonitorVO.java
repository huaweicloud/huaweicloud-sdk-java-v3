package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * MetricMonitorVO
 */
public class MetricMonitorVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Long id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "other_metric_ids")

    private List<Long> otherMetricIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "other_metric_names")

    private List<String> otherMetricNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expression")

    private String expression;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_id")

    private Long metricId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "front_configs")

    private String frontConfigs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_type")

    private BizTypeEnum metricType;

    public MetricMonitorVO withId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * 编码
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MetricMonitorVO withOtherMetricIds(List<Long> otherMetricIds) {
        this.otherMetricIds = otherMetricIds;
        return this;
    }

    public MetricMonitorVO addOtherMetricIdsItem(Long otherMetricIdsItem) {
        if (this.otherMetricIds == null) {
            this.otherMetricIds = new ArrayList<>();
        }
        this.otherMetricIds.add(otherMetricIdsItem);
        return this;
    }

    public MetricMonitorVO withOtherMetricIds(Consumer<List<Long>> otherMetricIdsSetter) {
        if (this.otherMetricIds == null) {
            this.otherMetricIds = new ArrayList<>();
        }
        otherMetricIdsSetter.accept(this.otherMetricIds);
        return this;
    }

    /**
     * 其他指标id
     * @return otherMetricIds
     */
    public List<Long> getOtherMetricIds() {
        return otherMetricIds;
    }

    public void setOtherMetricIds(List<Long> otherMetricIds) {
        this.otherMetricIds = otherMetricIds;
    }

    public MetricMonitorVO withOtherMetricNames(List<String> otherMetricNames) {
        this.otherMetricNames = otherMetricNames;
        return this;
    }

    public MetricMonitorVO addOtherMetricNamesItem(String otherMetricNamesItem) {
        if (this.otherMetricNames == null) {
            this.otherMetricNames = new ArrayList<>();
        }
        this.otherMetricNames.add(otherMetricNamesItem);
        return this;
    }

    public MetricMonitorVO withOtherMetricNames(Consumer<List<String>> otherMetricNamesSetter) {
        if (this.otherMetricNames == null) {
            this.otherMetricNames = new ArrayList<>();
        }
        otherMetricNamesSetter.accept(this.otherMetricNames);
        return this;
    }

    /**
     * 其他指标名称
     * @return otherMetricNames
     */
    public List<String> getOtherMetricNames() {
        return otherMetricNames;
    }

    public void setOtherMetricNames(List<String> otherMetricNames) {
        this.otherMetricNames = otherMetricNames;
    }

    public MetricMonitorVO withExpression(String expression) {
        this.expression = expression;
        return this;
    }

    /**
     * 告警表达式
     * @return expression
     */
    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public MetricMonitorVO withMetricId(Long metricId) {
        this.metricId = metricId;
        return this;
    }

    /**
     * 挂载指标id
     * @return metricId
     */
    public Long getMetricId() {
        return metricId;
    }

    public void setMetricId(Long metricId) {
        this.metricId = metricId;
    }

    public MetricMonitorVO withFrontConfigs(String frontConfigs) {
        this.frontConfigs = frontConfigs;
        return this;
    }

    /**
     * 前端表达式配置，用于前端数据恢复
     * @return frontConfigs
     */
    public String getFrontConfigs() {
        return frontConfigs;
    }

    public void setFrontConfigs(String frontConfigs) {
        this.frontConfigs = frontConfigs;
    }

    public MetricMonitorVO withMetricType(BizTypeEnum metricType) {
        this.metricType = metricType;
        return this;
    }

    /**
     * Get metricType
     * @return metricType
     */
    public BizTypeEnum getMetricType() {
        return metricType;
    }

    public void setMetricType(BizTypeEnum metricType) {
        this.metricType = metricType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MetricMonitorVO that = (MetricMonitorVO) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.otherMetricIds, that.otherMetricIds)
            && Objects.equals(this.otherMetricNames, that.otherMetricNames)
            && Objects.equals(this.expression, that.expression) && Objects.equals(this.metricId, that.metricId)
            && Objects.equals(this.frontConfigs, that.frontConfigs) && Objects.equals(this.metricType, that.metricType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, otherMetricIds, otherMetricNames, expression, metricId, frontConfigs, metricType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetricMonitorVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    otherMetricIds: ").append(toIndentedString(otherMetricIds)).append("\n");
        sb.append("    otherMetricNames: ").append(toIndentedString(otherMetricNames)).append("\n");
        sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
        sb.append("    metricId: ").append(toIndentedString(metricId)).append("\n");
        sb.append("    frontConfigs: ").append(toIndentedString(frontConfigs)).append("\n");
        sb.append("    metricType: ").append(toIndentedString(metricType)).append("\n");
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
