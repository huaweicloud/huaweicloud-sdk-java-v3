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
 * **参数解释** 视图展示配置 **约束限制** 不涉及 
 */
public class UpdateWidgetInfoProperties {

    /**
     * **参数解释** 聚合类型 **约束限制** 折线图不支持该参数 **取值范围** 枚举值： - topN topN类型 **默认取值** 不涉及 
     */
    public static final class FilterEnum {

        /**
         * Enum TOPN for value: "topN"
         */
        public static final FilterEnum TOPN = new FilterEnum("topN");

        private static final Map<String, FilterEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FilterEnum> createStaticFields() {
            Map<String, FilterEnum> map = new HashMap<>();
            map.put("topN", TOPN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FilterEnum(String value) {
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
        public static FilterEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FilterEnum(value));
        }

        public static FilterEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FilterEnum) {
                return this.value.equals(((FilterEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter")

    private FilterEnum filter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topN")

    private Integer topN;

    /**
     * **参数解释** 排序字段 **约束限制** 折线图不支持该参数 **取值范围** 枚举值： - asc 正序 - desc 倒序 **默认取值** 不涉及 
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
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_week_compare_enable")

    private Boolean lastWeekCompareEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "yesterday_compare_enable")

    private Boolean yesterdayCompareEnable;

    /**
     * **参数解释** 图例位置标记 **约束限制** 表格不支持该参数 **取值范围** 枚举值： - hide 隐藏图例 - right 图例放在监控视图右侧 - bottom 图例放在监控视图底部 **默认取值** 不涉及 
     */
    public static final class LegendLocationEnum {

        /**
         * Enum HIDE for value: "hide"
         */
        public static final LegendLocationEnum HIDE = new LegendLocationEnum("hide");

        /**
         * Enum RIGHT for value: "right"
         */
        public static final LegendLocationEnum RIGHT = new LegendLocationEnum("right");

        /**
         * Enum BOTTOM for value: "bottom"
         */
        public static final LegendLocationEnum BOTTOM = new LegendLocationEnum("bottom");

        private static final Map<String, LegendLocationEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LegendLocationEnum> createStaticFields() {
            Map<String, LegendLocationEnum> map = new HashMap<>();
            map.put("hide", HIDE);
            map.put("right", RIGHT);
            map.put("bottom", BOTTOM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LegendLocationEnum(String value) {
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
        public static LegendLocationEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LegendLocationEnum(value));
        }

        public static LegendLocationEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LegendLocationEnum) {
                return this.value.equals(((LegendLocationEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "legend_location")

    private LegendLocationEnum legendLocation;

    /**
     * **参数解释** 统计值名称 **约束限制** 不涉及 **取值范围** 枚举值： - last 当前值 - max 最大值 - min 最小值 - avg 平均值 - sum 求和值 **默认取值** 不涉及 
     */
    public static final class LegendValuesEnum {

        /**
         * Enum LAST for value: "last"
         */
        public static final LegendValuesEnum LAST = new LegendValuesEnum("last");

        /**
         * Enum MAX for value: "max"
         */
        public static final LegendValuesEnum MAX = new LegendValuesEnum("max");

        /**
         * Enum MIN for value: "min"
         */
        public static final LegendValuesEnum MIN = new LegendValuesEnum("min");

        /**
         * Enum AVG for value: "avg"
         */
        public static final LegendValuesEnum AVG = new LegendValuesEnum("avg");

        /**
         * Enum SUM for value: "sum"
         */
        public static final LegendValuesEnum SUM = new LegendValuesEnum("sum");

        private static final Map<String, LegendValuesEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LegendValuesEnum> createStaticFields() {
            Map<String, LegendValuesEnum> map = new HashMap<>();
            map.put("last", LAST);
            map.put("max", MAX);
            map.put("min", MIN);
            map.put("avg", AVG);
            map.put("sum", SUM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LegendValuesEnum(String value) {
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
        public static LegendValuesEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LegendValuesEnum(value));
        }

        public static LegendValuesEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LegendValuesEnum) {
                return this.value.equals(((LegendValuesEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "legend_values")

    private List<LegendValuesEnum> legendValues = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thresholds")

    private List<ThresholdInfo> thresholds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_all_compare_enable")

    private Boolean isAllCompareEnable;

    public UpdateWidgetInfoProperties withFilter(FilterEnum filter) {
        this.filter = filter;
        return this;
    }

    /**
     * **参数解释** 聚合类型 **约束限制** 折线图不支持该参数 **取值范围** 枚举值： - topN topN类型 **默认取值** 不涉及 
     * @return filter
     */
    public FilterEnum getFilter() {
        return filter;
    }

    public void setFilter(FilterEnum filter) {
        this.filter = filter;
    }

    public UpdateWidgetInfoProperties withTopN(Integer topN) {
        this.topN = topN;
        return this;
    }

    /**
     * **参数解释** Top值前N个 **约束限制** 折线图时表示随机展示的时序数据条数 **取值范围** Top值为[1,2147483647] **默认取值** 不涉及 
     * minimum: 1
     * maximum: 2147483647
     * @return topN
     */
    public Integer getTopN() {
        return topN;
    }

    public void setTopN(Integer topN) {
        this.topN = topN;
    }

    public UpdateWidgetInfoProperties withOrder(OrderEnum order) {
        this.order = order;
        return this;
    }

    /**
     * **参数解释** 排序字段 **约束限制** 折线图不支持该参数 **取值范围** 枚举值： - asc 正序 - desc 倒序 **默认取值** 不涉及 
     * @return order
     */
    public OrderEnum getOrder() {
        return order;
    }

    public void setOrder(OrderEnum order) {
        this.order = order;
    }

    public UpdateWidgetInfoProperties withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释** 监控视图的描述信息 **约束限制** 不涉及 **取值范围** 信息长度为[0,200]个字符 **默认取值** 不涉及 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateWidgetInfoProperties withLastWeekCompareEnable(Boolean lastWeekCompareEnable) {
        this.lastWeekCompareEnable = lastWeekCompareEnable;
        return this;
    }

    /**
     * **参数解释** 是否展示同比（上周同一时间）数据 **约束限制** 不涉及 **取值范围** - true 展示 - false 不展示 **默认取值** 不涉及 
     * @return lastWeekCompareEnable
     */
    public Boolean getLastWeekCompareEnable() {
        return lastWeekCompareEnable;
    }

    public void setLastWeekCompareEnable(Boolean lastWeekCompareEnable) {
        this.lastWeekCompareEnable = lastWeekCompareEnable;
    }

    public UpdateWidgetInfoProperties withYesterdayCompareEnable(Boolean yesterdayCompareEnable) {
        this.yesterdayCompareEnable = yesterdayCompareEnable;
        return this;
    }

    /**
     * **参数解释** 是否展示环比（昨天同一时间）数据 **约束限制** 不涉及 **取值范围** - true 展示 - false 不展示 **默认取值** 不涉及 
     * @return yesterdayCompareEnable
     */
    public Boolean getYesterdayCompareEnable() {
        return yesterdayCompareEnable;
    }

    public void setYesterdayCompareEnable(Boolean yesterdayCompareEnable) {
        this.yesterdayCompareEnable = yesterdayCompareEnable;
    }

    public UpdateWidgetInfoProperties withLegendLocation(LegendLocationEnum legendLocation) {
        this.legendLocation = legendLocation;
        return this;
    }

    /**
     * **参数解释** 图例位置标记 **约束限制** 表格不支持该参数 **取值范围** 枚举值： - hide 隐藏图例 - right 图例放在监控视图右侧 - bottom 图例放在监控视图底部 **默认取值** 不涉及 
     * @return legendLocation
     */
    public LegendLocationEnum getLegendLocation() {
        return legendLocation;
    }

    public void setLegendLocation(LegendLocationEnum legendLocation) {
        this.legendLocation = legendLocation;
    }

    public UpdateWidgetInfoProperties withLegendValues(List<LegendValuesEnum> legendValues) {
        this.legendValues = legendValues;
        return this;
    }

    public UpdateWidgetInfoProperties addLegendValuesItem(LegendValuesEnum legendValuesItem) {
        if (this.legendValues == null) {
            this.legendValues = new ArrayList<>();
        }
        this.legendValues.add(legendValuesItem);
        return this;
    }

    public UpdateWidgetInfoProperties withLegendValues(Consumer<List<LegendValuesEnum>> legendValuesSetter) {
        if (this.legendValues == null) {
            this.legendValues = new ArrayList<>();
        }
        legendValuesSetter.accept(this.legendValues);
        return this;
    }

    /**
     * **参数解释** 当前时序数据需要在图例中展示的统计值名称列表 **约束限制** 表格不支持该参数，条形图和柱状图仅支持选择当前值 包含的名称对象个数为[0,5] 
     * @return legendValues
     */
    public List<LegendValuesEnum> getLegendValues() {
        return legendValues;
    }

    public void setLegendValues(List<LegendValuesEnum> legendValues) {
        this.legendValues = legendValues;
    }

    public UpdateWidgetInfoProperties withThresholds(List<ThresholdInfo> thresholds) {
        this.thresholds = thresholds;
        return this;
    }

    public UpdateWidgetInfoProperties addThresholdsItem(ThresholdInfo thresholdsItem) {
        if (this.thresholds == null) {
            this.thresholds = new ArrayList<>();
        }
        this.thresholds.add(thresholdsItem);
        return this;
    }

    public UpdateWidgetInfoProperties withThresholds(Consumer<List<ThresholdInfo>> thresholdsSetter) {
        if (this.thresholds == null) {
            this.thresholds = new ArrayList<>();
        }
        thresholdsSetter.accept(this.thresholds);
        return this;
    }

    /**
     * **参数解释**   监控视图的阈值辅助线配置   **约束限制**   包含的配置对象个数为[0,6] 
     * @return thresholds
     */
    public List<ThresholdInfo> getThresholds() {
        return thresholds;
    }

    public void setThresholds(List<ThresholdInfo> thresholds) {
        this.thresholds = thresholds;
    }

    public UpdateWidgetInfoProperties withIsAllCompareEnable(Boolean isAllCompareEnable) {
        this.isAllCompareEnable = isAllCompareEnable;
        return this;
    }

    /**
     * **参数解释** 同比环比总开关是否生效 **约束限制** 不涉及 **取值范围** - true 生效 - false 不生效 **默认取值** 不涉及 
     * @return isAllCompareEnable
     */
    public Boolean getIsAllCompareEnable() {
        return isAllCompareEnable;
    }

    public void setIsAllCompareEnable(Boolean isAllCompareEnable) {
        this.isAllCompareEnable = isAllCompareEnable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateWidgetInfoProperties that = (UpdateWidgetInfoProperties) obj;
        return Objects.equals(this.filter, that.filter) && Objects.equals(this.topN, that.topN)
            && Objects.equals(this.order, that.order) && Objects.equals(this.description, that.description)
            && Objects.equals(this.lastWeekCompareEnable, that.lastWeekCompareEnable)
            && Objects.equals(this.yesterdayCompareEnable, that.yesterdayCompareEnable)
            && Objects.equals(this.legendLocation, that.legendLocation)
            && Objects.equals(this.legendValues, that.legendValues) && Objects.equals(this.thresholds, that.thresholds)
            && Objects.equals(this.isAllCompareEnable, that.isAllCompareEnable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filter,
            topN,
            order,
            description,
            lastWeekCompareEnable,
            yesterdayCompareEnable,
            legendLocation,
            legendValues,
            thresholds,
            isAllCompareEnable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateWidgetInfoProperties {\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    topN: ").append(toIndentedString(topN)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    lastWeekCompareEnable: ").append(toIndentedString(lastWeekCompareEnable)).append("\n");
        sb.append("    yesterdayCompareEnable: ").append(toIndentedString(yesterdayCompareEnable)).append("\n");
        sb.append("    legendLocation: ").append(toIndentedString(legendLocation)).append("\n");
        sb.append("    legendValues: ").append(toIndentedString(legendValues)).append("\n");
        sb.append("    thresholds: ").append(toIndentedString(thresholds)).append("\n");
        sb.append("    isAllCompareEnable: ").append(toIndentedString(isAllCompareEnable)).append("\n");
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
