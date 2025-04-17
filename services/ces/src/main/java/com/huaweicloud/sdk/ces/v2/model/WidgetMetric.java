package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rollup_enable")

    private Boolean rollupEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rollup_filter")

    private RollupFilter rollupFilter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rollup_dimension")

    private String rollupDimension;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_week_compare_enable")

    private Boolean lastWeekCompareEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "yesterday_compare_enable")

    private Boolean yesterdayCompareEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_dimension")

    private String metricDimension;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_num")

    private Integer topNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit")

    private String unit;

    /**
     * 排序字段，asc正序，desc倒序
     */
    public static final class OrderEnum {

        /**
         * Enum ASC for value: "asc"
         */
        public static final OrderEnum ASC = new OrderEnum("asc");

        /**
         * Enum DESC for value: "desc"
         */
        public static final OrderEnum DESC = new OrderEnum("desc");

        private static final Map<String, OrderEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OrderEnum> createStaticFields() {
            Map<String, OrderEnum> map = new HashMap<>();
            map.put("asc", ASC);
            map.put("desc", DESC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OrderEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static OrderEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OrderEnum(value));
        }

        public static OrderEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OrderEnum) {
                return this.value.equals(((OrderEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order")

    private OrderEnum order;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topn_metric_name")

    private String topnMetricName;

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
     * 多个指标名称，用逗号隔开
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

    public WidgetMetric withRollupEnable(Boolean rollupEnable) {
        this.rollupEnable = rollupEnable;
        return this;
    }

    /**
     * 是否开启聚合
     * @return rollupEnable
     */
    public Boolean getRollupEnable() {
        return rollupEnable;
    }

    public void setRollupEnable(Boolean rollupEnable) {
        this.rollupEnable = rollupEnable;
    }

    public WidgetMetric withRollupFilter(RollupFilter rollupFilter) {
        this.rollupFilter = rollupFilter;
        return this;
    }

    /**
     * Get rollupFilter
     * @return rollupFilter
     */
    public RollupFilter getRollupFilter() {
        return rollupFilter;
    }

    public void setRollupFilter(RollupFilter rollupFilter) {
        this.rollupFilter = rollupFilter;
    }

    public WidgetMetric withRollupDimension(String rollupDimension) {
        this.rollupDimension = rollupDimension;
        return this;
    }

    /**
     * 聚合维度
     * @return rollupDimension
     */
    public String getRollupDimension() {
        return rollupDimension;
    }

    public void setRollupDimension(String rollupDimension) {
        this.rollupDimension = rollupDimension;
    }

    public WidgetMetric withLastWeekCompareEnable(Boolean lastWeekCompareEnable) {
        this.lastWeekCompareEnable = lastWeekCompareEnable;
        return this;
    }

    /**
     * 是否展示同比（上周同一时间）数据，true:展示，false:不展示
     * @return lastWeekCompareEnable
     */
    public Boolean getLastWeekCompareEnable() {
        return lastWeekCompareEnable;
    }

    public void setLastWeekCompareEnable(Boolean lastWeekCompareEnable) {
        this.lastWeekCompareEnable = lastWeekCompareEnable;
    }

    public WidgetMetric withYesterdayCompareEnable(Boolean yesterdayCompareEnable) {
        this.yesterdayCompareEnable = yesterdayCompareEnable;
        return this;
    }

    /**
     * 是否展示环比（昨天同一时间）数据，true:展示，false:不展示
     * @return yesterdayCompareEnable
     */
    public Boolean getYesterdayCompareEnable() {
        return yesterdayCompareEnable;
    }

    public void setYesterdayCompareEnable(Boolean yesterdayCompareEnable) {
        this.yesterdayCompareEnable = yesterdayCompareEnable;
    }

    public WidgetMetric withMetricDimension(String metricDimension) {
        this.metricDimension = metricDimension;
        return this;
    }

    /**
     * 维度名称，多维度用逗号分隔，各服务支持的维度可参考：“[服务维度名称](ces_03_0059.xml)”
     * @return metricDimension
     */
    public String getMetricDimension() {
        return metricDimension;
    }

    public void setMetricDimension(String metricDimension) {
        this.metricDimension = metricDimension;
    }

    public WidgetMetric withTopNum(Integer topNum) {
        this.topNum = topNum;
        return this;
    }

    /**
     * 展示数据数量
     * minimum: 1
     * maximum: 200
     * @return topNum
     */
    public Integer getTopNum() {
        return topNum;
    }

    public void setTopNum(Integer topNum) {
        this.topNum = topNum;
    }

    public WidgetMetric withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * 单位
     * @return unit
     */
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public WidgetMetric withOrder(OrderEnum order) {
        this.order = order;
        return this;
    }

    /**
     * 排序字段，asc正序，desc倒序
     * @return order
     */
    public OrderEnum getOrder() {
        return order;
    }

    public void setOrder(OrderEnum order) {
        this.order = order;
    }

    public WidgetMetric withTopnMetricName(String topnMetricName) {
        this.topnMetricName = topnMetricName;
        return this;
    }

    /**
     * 资源的监控指标名称，必须以字母开头，只能包含0-9/a-z/A-Z/_，字符长度最短为1，最大为64；如：弹性云服务器中的监控指标cpu_util，表示弹性服务器的CPU使用率；文档数据库中的指标mongo001_command_ps，表示command执行频率；各服务的指标名称可查看：“[服务指标名称](ces_03_0059.xml)”。
     * @return topnMetricName
     */
    public String getTopnMetricName() {
        return topnMetricName;
    }

    public void setTopnMetricName(String topnMetricName) {
        this.topnMetricName = topnMetricName;
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
            && Objects.equals(this.extraInfo, that.extraInfo) && Objects.equals(this.rollupEnable, that.rollupEnable)
            && Objects.equals(this.rollupFilter, that.rollupFilter)
            && Objects.equals(this.rollupDimension, that.rollupDimension)
            && Objects.equals(this.lastWeekCompareEnable, that.lastWeekCompareEnable)
            && Objects.equals(this.yesterdayCompareEnable, that.yesterdayCompareEnable)
            && Objects.equals(this.metricDimension, that.metricDimension) && Objects.equals(this.topNum, that.topNum)
            && Objects.equals(this.unit, that.unit) && Objects.equals(this.order, that.order)
            && Objects.equals(this.topnMetricName, that.topnMetricName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namespace,
            dimensions,
            metricName,
            alias,
            extraInfo,
            rollupEnable,
            rollupFilter,
            rollupDimension,
            lastWeekCompareEnable,
            yesterdayCompareEnable,
            metricDimension,
            topNum,
            unit,
            order,
            topnMetricName);
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
        sb.append("    rollupEnable: ").append(toIndentedString(rollupEnable)).append("\n");
        sb.append("    rollupFilter: ").append(toIndentedString(rollupFilter)).append("\n");
        sb.append("    rollupDimension: ").append(toIndentedString(rollupDimension)).append("\n");
        sb.append("    lastWeekCompareEnable: ").append(toIndentedString(lastWeekCompareEnable)).append("\n");
        sb.append("    yesterdayCompareEnable: ").append(toIndentedString(yesterdayCompareEnable)).append("\n");
        sb.append("    metricDimension: ").append(toIndentedString(metricDimension)).append("\n");
        sb.append("    topNum: ").append(toIndentedString(topNum)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("    topnMetricName: ").append(toIndentedString(topnMetricName)).append("\n");
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
