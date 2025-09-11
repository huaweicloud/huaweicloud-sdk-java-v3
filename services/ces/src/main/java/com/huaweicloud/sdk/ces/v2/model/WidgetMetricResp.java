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
 * WidgetMetricResp
 */
public class WidgetMetricResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dimensions")

    private DimensionInfoResp dimensions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_name")

    private String metricName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alias")

    private List<String> alias = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extra_info")

    private ExtraInfoResp extraInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rollup_enable")

    private Boolean rollupEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rollup_filter")

    private RollupFilterResp rollupFilter;

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
     * **参数解释** 排序字段               **取值范围** - asc:正序 - desc:倒序 
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

    public WidgetMetricResp withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * **参数解释** 查询服务的命名空间，各服务命名空间请参考“[服务命名空间](ces_03_0059.xml)” **取值范围** 格式为service.item；service和item必须是字符串，必须以字母开头，只能包含0-9/a-z/A-Z/_。字符串的长度必须在 3 到 32个字符之间。 
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public WidgetMetricResp withDimensions(DimensionInfoResp dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    public WidgetMetricResp withDimensions(Consumer<DimensionInfoResp> dimensionsSetter) {
        if (this.dimensions == null) {
            this.dimensions = new DimensionInfoResp();
            dimensionsSetter.accept(this.dimensions);
        }

        return this;
    }

    /**
     * Get dimensions
     * @return dimensions
     */
    public DimensionInfoResp getDimensions() {
        return dimensions;
    }

    public void setDimensions(DimensionInfoResp dimensions) {
        this.dimensions = dimensions;
    }

    public WidgetMetricResp withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * **参数解释** 多个指标名称 **取值范围** 长度为[1,1080]个字符，多个指标名称之间用逗号隔开 
     * @return metricName
     */
    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    public WidgetMetricResp withAlias(List<String> alias) {
        this.alias = alias;
        return this;
    }

    public WidgetMetricResp addAliasItem(String aliasItem) {
        if (this.alias == null) {
            this.alias = new ArrayList<>();
        }
        this.alias.add(aliasItem);
        return this;
    }

    public WidgetMetricResp withAlias(Consumer<List<String>> aliasSetter) {
        if (this.alias == null) {
            this.alias = new ArrayList<>();
        }
        aliasSetter.accept(this.alias);
        return this;
    }

    /**
     * **参数解释** 监控视图的指标别名列表 
     * @return alias
     */
    public List<String> getAlias() {
        return alias;
    }

    public void setAlias(List<String> alias) {
        this.alias = alias;
    }

    public WidgetMetricResp withExtraInfo(ExtraInfoResp extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }

    public WidgetMetricResp withExtraInfo(Consumer<ExtraInfoResp> extraInfoSetter) {
        if (this.extraInfo == null) {
            this.extraInfo = new ExtraInfoResp();
            extraInfoSetter.accept(this.extraInfo);
        }

        return this;
    }

    /**
     * Get extraInfo
     * @return extraInfo
     */
    public ExtraInfoResp getExtraInfo() {
        return extraInfo;
    }

    public void setExtraInfo(ExtraInfoResp extraInfo) {
        this.extraInfo = extraInfo;
    }

    public WidgetMetricResp withRollupEnable(Boolean rollupEnable) {
        this.rollupEnable = rollupEnable;
        return this;
    }

    /**
     * **参数解释** 是否开启聚合 **取值范围** - true：表示开启聚合 - false：表示不开启聚合 
     * @return rollupEnable
     */
    public Boolean getRollupEnable() {
        return rollupEnable;
    }

    public void setRollupEnable(Boolean rollupEnable) {
        this.rollupEnable = rollupEnable;
    }

    public WidgetMetricResp withRollupFilter(RollupFilterResp rollupFilter) {
        this.rollupFilter = rollupFilter;
        return this;
    }

    /**
     * Get rollupFilter
     * @return rollupFilter
     */
    public RollupFilterResp getRollupFilter() {
        return rollupFilter;
    }

    public void setRollupFilter(RollupFilterResp rollupFilter) {
        this.rollupFilter = rollupFilter;
    }

    public WidgetMetricResp withRollupDimension(String rollupDimension) {
        this.rollupDimension = rollupDimension;
        return this;
    }

    /**
     * **参数解释** 聚合维度 **取值范围** 长度为[1,32]个字符 
     * @return rollupDimension
     */
    public String getRollupDimension() {
        return rollupDimension;
    }

    public void setRollupDimension(String rollupDimension) {
        this.rollupDimension = rollupDimension;
    }

    public WidgetMetricResp withLastWeekCompareEnable(Boolean lastWeekCompareEnable) {
        this.lastWeekCompareEnable = lastWeekCompareEnable;
        return this;
    }

    /**
     * **参数解释** 是否展示同比（上周同一时间）数据 **取值范围** - true:展示 - false:不展示 
     * @return lastWeekCompareEnable
     */
    public Boolean getLastWeekCompareEnable() {
        return lastWeekCompareEnable;
    }

    public void setLastWeekCompareEnable(Boolean lastWeekCompareEnable) {
        this.lastWeekCompareEnable = lastWeekCompareEnable;
    }

    public WidgetMetricResp withYesterdayCompareEnable(Boolean yesterdayCompareEnable) {
        this.yesterdayCompareEnable = yesterdayCompareEnable;
        return this;
    }

    /**
     * **参数解释** 是否展示环比（昨天同一时间）数据 **取值范围** - true:展示 - false:不展示 
     * @return yesterdayCompareEnable
     */
    public Boolean getYesterdayCompareEnable() {
        return yesterdayCompareEnable;
    }

    public void setYesterdayCompareEnable(Boolean yesterdayCompareEnable) {
        this.yesterdayCompareEnable = yesterdayCompareEnable;
    }

    public WidgetMetricResp withMetricDimension(String metricDimension) {
        this.metricDimension = metricDimension;
        return this;
    }

    /**
     * **参数解释** 维度名称，多维度用逗号分隔，各服务支持的维度可参考：“[服务维度名称](ces_03_0059.xml)”          **取值范围** 必须以字母开头，只能包含0-9/a-z/A-Z/_/-，多维度用\",\"分隔，每个维度的最大长度为32。总长度为[1,131]个字符。目前最大支持4个维度。举例：单维度场景：instance_id；多维度场景：instance_id,disk 
     * @return metricDimension
     */
    public String getMetricDimension() {
        return metricDimension;
    }

    public void setMetricDimension(String metricDimension) {
        this.metricDimension = metricDimension;
    }

    public WidgetMetricResp withTopNum(Integer topNum) {
        this.topNum = topNum;
        return this;
    }

    /**
     * **参数解释** 展示数据数量               **取值范围** 最小值为1，最大值为200 
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

    public WidgetMetricResp withUnit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * **参数解释** 单位 **取值范围** 长度为[0,32]个字符 
     * @return unit
     */
    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public WidgetMetricResp withOrder(OrderEnum order) {
        this.order = order;
        return this;
    }

    /**
     * **参数解释** 排序字段               **取值范围** - asc:正序 - desc:倒序 
     * @return order
     */
    public OrderEnum getOrder() {
        return order;
    }

    public void setOrder(OrderEnum order) {
        this.order = order;
    }

    public WidgetMetricResp withTopnMetricName(String topnMetricName) {
        this.topnMetricName = topnMetricName;
        return this;
    }

    /**
     * **参数解释** 资源的监控指标名称，必须以字母开头，只能包含0-9/a-z/A-Z/_，字符长度最短为1，最大为64；如：弹性云服务器中的监控指标cpu_util，表示弹性服务器的CPU使用率；文档数据库中的指标mongo001_command_ps，表示command执行频率；各服务的指标名称可查看：“[服务指标名称](ces_03_0059.xml)”。 **取值范围** 长度为[1,96]个字符 
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
        WidgetMetricResp that = (WidgetMetricResp) obj;
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
        sb.append("class WidgetMetricResp {\n");
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
