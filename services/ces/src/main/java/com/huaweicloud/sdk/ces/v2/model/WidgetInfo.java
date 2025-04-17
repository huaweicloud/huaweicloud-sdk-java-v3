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
 * WidgetInfo
 */
public class WidgetInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metrics")

    private List<WidgetMetric> metrics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "threshold")

    private Double threshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "threshold_enabled")

    private Boolean thresholdEnabled;

    /**
     * 监控视图图表类型, bar条形图，line折线图，bar_chart柱状图，table表格，circular_bar环形柱状图，area_chart面积图
     */
    public static final class ViewEnum {

        /**
         * Enum BAR for value: "bar"
         */
        public static final ViewEnum BAR = new ViewEnum("bar");

        /**
         * Enum LINE for value: "line"
         */
        public static final ViewEnum LINE = new ViewEnum("line");

        /**
         * Enum BAR_CHART for value: "bar_chart"
         */
        public static final ViewEnum BAR_CHART = new ViewEnum("bar_chart");

        /**
         * Enum TABLE for value: "table"
         */
        public static final ViewEnum TABLE = new ViewEnum("table");

        /**
         * Enum CIRCULAR_BAR for value: "circular_bar"
         */
        public static final ViewEnum CIRCULAR_BAR = new ViewEnum("circular_bar");

        /**
         * Enum AREA_CHART for value: "area_chart"
         */
        public static final ViewEnum AREA_CHART = new ViewEnum("area_chart");

        private static final Map<String, ViewEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ViewEnum> createStaticFields() {
            Map<String, ViewEnum> map = new HashMap<>();
            map.put("bar", BAR);
            map.put("line", LINE);
            map.put("bar_chart", BAR_CHART);
            map.put("table", TABLE);
            map.put("circular_bar", CIRCULAR_BAR);
            map.put("area_chart", AREA_CHART);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ViewEnum(String value) {
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
        public static ViewEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ViewEnum(value));
        }

        public static ViewEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ViewEnum) {
                return this.value.equals(((ViewEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "view")

    private ViewEnum view;

    /**
     * 指标展示类型，single 单指标展示，multiple 多指标展示
     */
    public static final class MetricDisplayModeEnum {

        /**
         * Enum SINGLE for value: "single"
         */
        public static final MetricDisplayModeEnum SINGLE = new MetricDisplayModeEnum("single");

        /**
         * Enum MULTIPLE for value: "multiple"
         */
        public static final MetricDisplayModeEnum MULTIPLE = new MetricDisplayModeEnum("multiple");

        private static final Map<String, MetricDisplayModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MetricDisplayModeEnum> createStaticFields() {
            Map<String, MetricDisplayModeEnum> map = new HashMap<>();
            map.put("single", SINGLE);
            map.put("multiple", MULTIPLE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MetricDisplayModeEnum(String value) {
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
        public static MetricDisplayModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new MetricDisplayModeEnum(value));
        }

        public static MetricDisplayModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MetricDisplayModeEnum) {
                return this.value.equals(((MetricDisplayModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_display_mode")

    private MetricDisplayModeEnum metricDisplayMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "properties")

    private BaseWidgetInfoProperties properties;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location")

    private UpdateWidgetInfoLocation location;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unit")

    private String unit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    public WidgetInfo withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 视图分区id
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public WidgetInfo withMetrics(List<WidgetMetric> metrics) {
        this.metrics = metrics;
        return this;
    }

    public WidgetInfo addMetricsItem(WidgetMetric metricsItem) {
        if (this.metrics == null) {
            this.metrics = new ArrayList<>();
        }
        this.metrics.add(metricsItem);
        return this;
    }

    public WidgetInfo withMetrics(Consumer<List<WidgetMetric>> metricsSetter) {
        if (this.metrics == null) {
            this.metrics = new ArrayList<>();
        }
        metricsSetter.accept(this.metrics);
        return this;
    }

    /**
     * 指标列表
     * @return metrics
     */
    public List<WidgetMetric> getMetrics() {
        return metrics;
    }

    public void setMetrics(List<WidgetMetric> metrics) {
        this.metrics = metrics;
    }

    public WidgetInfo withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 监控视图标题
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public WidgetInfo withThreshold(Double threshold) {
        this.threshold = threshold;
        return this;
    }

    /**
     * 监控视图指标的阈值
     * minimum: 0
     * maximum: 1.7976931348623157E+308
     * @return threshold
     */
    public Double getThreshold() {
        return threshold;
    }

    public void setThreshold(Double threshold) {
        this.threshold = threshold;
    }

    public WidgetInfo withThresholdEnabled(Boolean thresholdEnabled) {
        this.thresholdEnabled = thresholdEnabled;
        return this;
    }

    /**
     * 阈值是否展示，true:展示，false:不展示
     * @return thresholdEnabled
     */
    public Boolean getThresholdEnabled() {
        return thresholdEnabled;
    }

    public void setThresholdEnabled(Boolean thresholdEnabled) {
        this.thresholdEnabled = thresholdEnabled;
    }

    public WidgetInfo withView(ViewEnum view) {
        this.view = view;
        return this;
    }

    /**
     * 监控视图图表类型, bar条形图，line折线图，bar_chart柱状图，table表格，circular_bar环形柱状图，area_chart面积图
     * @return view
     */
    public ViewEnum getView() {
        return view;
    }

    public void setView(ViewEnum view) {
        this.view = view;
    }

    public WidgetInfo withMetricDisplayMode(MetricDisplayModeEnum metricDisplayMode) {
        this.metricDisplayMode = metricDisplayMode;
        return this;
    }

    /**
     * 指标展示类型，single 单指标展示，multiple 多指标展示
     * @return metricDisplayMode
     */
    public MetricDisplayModeEnum getMetricDisplayMode() {
        return metricDisplayMode;
    }

    public void setMetricDisplayMode(MetricDisplayModeEnum metricDisplayMode) {
        this.metricDisplayMode = metricDisplayMode;
    }

    public WidgetInfo withProperties(BaseWidgetInfoProperties properties) {
        this.properties = properties;
        return this;
    }

    public WidgetInfo withProperties(Consumer<BaseWidgetInfoProperties> propertiesSetter) {
        if (this.properties == null) {
            this.properties = new BaseWidgetInfoProperties();
            propertiesSetter.accept(this.properties);
        }

        return this;
    }

    /**
     * Get properties
     * @return properties
     */
    public BaseWidgetInfoProperties getProperties() {
        return properties;
    }

    public void setProperties(BaseWidgetInfoProperties properties) {
        this.properties = properties;
    }

    public WidgetInfo withLocation(UpdateWidgetInfoLocation location) {
        this.location = location;
        return this;
    }

    public WidgetInfo withLocation(Consumer<UpdateWidgetInfoLocation> locationSetter) {
        if (this.location == null) {
            this.location = new UpdateWidgetInfoLocation();
            locationSetter.accept(this.location);
        }

        return this;
    }

    /**
     * Get location
     * @return location
     */
    public UpdateWidgetInfoLocation getLocation() {
        return location;
    }

    public void setLocation(UpdateWidgetInfoLocation location) {
        this.location = location;
    }

    public WidgetInfo withUnit(String unit) {
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

    public WidgetInfo withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 监控看板创建时间
     * minimum: 1111111111111
     * maximum: 9999999999999
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WidgetInfo that = (WidgetInfo) obj;
        return Objects.equals(this.groupId, that.groupId) && Objects.equals(this.metrics, that.metrics)
            && Objects.equals(this.title, that.title) && Objects.equals(this.threshold, that.threshold)
            && Objects.equals(this.thresholdEnabled, that.thresholdEnabled) && Objects.equals(this.view, that.view)
            && Objects.equals(this.metricDisplayMode, that.metricDisplayMode)
            && Objects.equals(this.properties, that.properties) && Objects.equals(this.location, that.location)
            && Objects.equals(this.unit, that.unit) && Objects.equals(this.createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId,
            metrics,
            title,
            threshold,
            thresholdEnabled,
            view,
            metricDisplayMode,
            properties,
            location,
            unit,
            createTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WidgetInfo {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
        sb.append("    thresholdEnabled: ").append(toIndentedString(thresholdEnabled)).append("\n");
        sb.append("    view: ").append(toIndentedString(view)).append("\n");
        sb.append("    metricDisplayMode: ").append(toIndentedString(metricDisplayMode)).append("\n");
        sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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
