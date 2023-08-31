package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * WidgetMetric
 */
public class WidgetMetric {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dimensions")

    private DimensionInfo dimensions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_name")

    private String metricName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alias")

    private List<String> alias = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extra_info")

    private ExtraInfo extraInfo;

    public WidgetMetric withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * 服务维度
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public WidgetMetric withDimensions(DimensionInfo dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    public WidgetMetric withDimensions(Consumer<DimensionInfo> dimensionsSetter) {
        if (this.dimensions == null) {
            this.dimensions = new DimensionInfo();
            dimensionsSetter.accept(this.dimensions);
        }

        return this;
    }

    /**
     * Get dimensions
     * @return dimensions
     */
    public DimensionInfo getDimensions() {
        return dimensions;
    }

    public void setDimensions(DimensionInfo dimensions) {
        this.dimensions = dimensions;
    }

    public WidgetMetric withMetricName(String metricName) {
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

    public WidgetMetric withAlias(List<String> alias) {
        this.alias = alias;
        return this;
    }

    public WidgetMetric addAliasItem(String aliasItem) {
        if (this.alias == null) {
            this.alias = new ArrayList<>();
        }
        this.alias.add(aliasItem);
        return this;
    }

    public WidgetMetric withAlias(Consumer<List<String>> aliasSetter) {
        if (this.alias == null) {
            this.alias = new ArrayList<>();
        }
        aliasSetter.accept(this.alias);
        return this;
    }

    /**
     * 监控视图的指标别名列表
     * @return alias
     */
    public List<String> getAlias() {
        return alias;
    }

    public void setAlias(List<String> alias) {
        this.alias = alias;
    }

    public WidgetMetric withExtraInfo(ExtraInfo extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }

    public WidgetMetric withExtraInfo(Consumer<ExtraInfo> extraInfoSetter) {
        if (this.extraInfo == null) {
            this.extraInfo = new ExtraInfo();
            extraInfoSetter.accept(this.extraInfo);
        }

        return this;
    }

    /**
     * Get extraInfo
     * @return extraInfo
     */
    public ExtraInfo getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(ExtraInfo extraInfo) {
        this.extraInfo = extraInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WidgetMetric that = (WidgetMetric) obj;
        return Objects.equals(this.namespace, that.namespace) && Objects.equals(this.dimensions, that.dimensions)
            && Objects.equals(this.metricName, that.metricName) && Objects.equals(this.alias, that.alias)
            && Objects.equals(this.extraInfo, that.extraInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namespace, dimensions, metricName, alias, extraInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WidgetMetric {\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
        sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
        sb.append("    alias: ").append(toIndentedString(alias)).append("\n");
        sb.append("    extraInfo: ").append(toIndentedString(extraInfo)).append("\n");
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
