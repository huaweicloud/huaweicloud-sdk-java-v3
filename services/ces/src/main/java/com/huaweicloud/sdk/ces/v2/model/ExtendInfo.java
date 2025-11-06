package com.huaweicloud.sdk.ces.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 看板相关拓展信息
 */
public class ExtendInfo {

    /**
     * 表示指标聚合方式，average表示平均值，min表示最小值，max表示最大值，sum表示求合
     */
    public static final class FilterEnum {

        /**
         * Enum AVERAGE for value: "average"
         */
        public static final FilterEnum AVERAGE = new FilterEnum("average");

        /**
         * Enum MIN for value: "min"
         */
        public static final FilterEnum MIN = new FilterEnum("min");

        /**
         * Enum MAX for value: "max"
         */
        public static final FilterEnum MAX = new FilterEnum("max");

        /**
         * Enum SUM for value: "sum"
         */
        public static final FilterEnum SUM = new FilterEnum("sum");

        private static final Map<String, FilterEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FilterEnum> createStaticFields() {
            Map<String, FilterEnum> map = new HashMap<>();
            map.put("average", AVERAGE);
            map.put("min", MIN);
            map.put("max", MAX);
            map.put("sum", SUM);
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
    @JsonProperty(value = "period")

    private String period;

    /**
     * 展示时间，0表示使用自定义时间展示， 5分钟，15分钟，30分钟，1小时，2小时，3小时，12小时，24小时，7天，30天
     */
    public static final class DisplayTimeEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final DisplayTimeEnum NUMBER_0 = new DisplayTimeEnum(0);

        /**
         * Enum NUMBER_5 for value: 5
         */
        public static final DisplayTimeEnum NUMBER_5 = new DisplayTimeEnum(5);

        /**
         * Enum NUMBER_15 for value: 15
         */
        public static final DisplayTimeEnum NUMBER_15 = new DisplayTimeEnum(15);

        /**
         * Enum NUMBER_30 for value: 30
         */
        public static final DisplayTimeEnum NUMBER_30 = new DisplayTimeEnum(30);

        /**
         * Enum NUMBER_60 for value: 60
         */
        public static final DisplayTimeEnum NUMBER_60 = new DisplayTimeEnum(60);

        /**
         * Enum NUMBER_120 for value: 120
         */
        public static final DisplayTimeEnum NUMBER_120 = new DisplayTimeEnum(120);

        /**
         * Enum NUMBER_180 for value: 180
         */
        public static final DisplayTimeEnum NUMBER_180 = new DisplayTimeEnum(180);

        /**
         * Enum NUMBER_720 for value: 720
         */
        public static final DisplayTimeEnum NUMBER_720 = new DisplayTimeEnum(720);

        /**
         * Enum NUMBER_1440 for value: 1440
         */
        public static final DisplayTimeEnum NUMBER_1440 = new DisplayTimeEnum(1440);

        /**
         * Enum NUMBER_10080 for value: 10080
         */
        public static final DisplayTimeEnum NUMBER_10080 = new DisplayTimeEnum(10080);

        /**
         * Enum NUMBER_43200 for value: 43200
         */
        public static final DisplayTimeEnum NUMBER_43200 = new DisplayTimeEnum(43200);

        private static final Map<Integer, DisplayTimeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, DisplayTimeEnum> createStaticFields() {
            Map<Integer, DisplayTimeEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(5, NUMBER_5);
            map.put(15, NUMBER_15);
            map.put(30, NUMBER_30);
            map.put(60, NUMBER_60);
            map.put(120, NUMBER_120);
            map.put(180, NUMBER_180);
            map.put(720, NUMBER_720);
            map.put(1440, NUMBER_1440);
            map.put(10080, NUMBER_10080);
            map.put(43200, NUMBER_43200);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        DisplayTimeEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static DisplayTimeEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DisplayTimeEnum(value));
        }

        public static DisplayTimeEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DisplayTimeEnum) {
                return this.value.equals(((DisplayTimeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_time")

    private DisplayTimeEnum displayTime;

    /**
     * 刷新时间 0秒表示不刷新,10秒，1分钟，5分钟，20分钟
     */
    public static final class RefreshTimeEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final RefreshTimeEnum NUMBER_0 = new RefreshTimeEnum(0);

        /**
         * Enum NUMBER_10 for value: 10
         */
        public static final RefreshTimeEnum NUMBER_10 = new RefreshTimeEnum(10);

        /**
         * Enum NUMBER_60 for value: 60
         */
        public static final RefreshTimeEnum NUMBER_60 = new RefreshTimeEnum(60);

        /**
         * Enum NUMBER_300 for value: 300
         */
        public static final RefreshTimeEnum NUMBER_300 = new RefreshTimeEnum(300);

        /**
         * Enum NUMBER_1200 for value: 1200
         */
        public static final RefreshTimeEnum NUMBER_1200 = new RefreshTimeEnum(1200);

        private static final Map<Integer, RefreshTimeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, RefreshTimeEnum> createStaticFields() {
            Map<Integer, RefreshTimeEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(10, NUMBER_10);
            map.put(60, NUMBER_60);
            map.put(300, NUMBER_300);
            map.put(1200, NUMBER_1200);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        RefreshTimeEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static RefreshTimeEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RefreshTimeEnum(value));
        }

        public static RefreshTimeEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RefreshTimeEnum) {
                return this.value.equals(((RefreshTimeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "refresh_time")

    private RefreshTimeEnum refreshTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from")

    private Long from;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to")

    private Long to;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "screen_color")

    private String screenColor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_screen_auto_play")

    private Boolean enableScreenAutoPlay;

    /**
     * 监控大屏自动切换时间间隔，10000代表10s，30000代表30s，60000代表1min
     */
    public static final class TimeIntervalEnum {

        /**
         * Enum NUMBER_10000 for value: 10000
         */
        public static final TimeIntervalEnum NUMBER_10000 = new TimeIntervalEnum(10000);

        /**
         * Enum NUMBER_30000 for value: 30000
         */
        public static final TimeIntervalEnum NUMBER_30000 = new TimeIntervalEnum(30000);

        /**
         * Enum NUMBER_60000 for value: 60000
         */
        public static final TimeIntervalEnum NUMBER_60000 = new TimeIntervalEnum(60000);

        private static final Map<Integer, TimeIntervalEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, TimeIntervalEnum> createStaticFields() {
            Map<Integer, TimeIntervalEnum> map = new HashMap<>();
            map.put(10000, NUMBER_10000);
            map.put(30000, NUMBER_30000);
            map.put(60000, NUMBER_60000);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        TimeIntervalEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TimeIntervalEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TimeIntervalEnum(value));
        }

        public static TimeIntervalEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TimeIntervalEnum) {
                return this.value.equals(((TimeIntervalEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_interval")

    private TimeIntervalEnum timeInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_legend")

    private Boolean enableLegend;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "full_screen_widget_num")

    private Integer fullScreenWidgetNum;

    public ExtendInfo withFilter(FilterEnum filter) {
        this.filter = filter;
        return this;
    }

    /**
     * 表示指标聚合方式，average表示平均值，min表示最小值，max表示最大值，sum表示求合
     * @return filter
     */
    public FilterEnum getFilter() {
        return filter;
    }

    public void setFilter(FilterEnum filter) {
        this.filter = filter;
    }

    public ExtendInfo withPeriod(String period) {
        this.period = period;
        return this;
    }

    /**
     * '表示指标聚合周期，{1:表示原始值，60:表示一分钟，300:表示5分钟，1200:表示20分钟，3600:表示1小时，14400:表示4小时，86400:表示1天}'' 
     * @return period
     */
    public String getPeriod() {
        return period;
    }

    public void setPeriod(String period) {
        this.period = period;
    }

    public ExtendInfo withDisplayTime(DisplayTimeEnum displayTime) {
        this.displayTime = displayTime;
        return this;
    }

    /**
     * 展示时间，0表示使用自定义时间展示， 5分钟，15分钟，30分钟，1小时，2小时，3小时，12小时，24小时，7天，30天
     * @return displayTime
     */
    public DisplayTimeEnum getDisplayTime() {
        return displayTime;
    }

    public void setDisplayTime(DisplayTimeEnum displayTime) {
        this.displayTime = displayTime;
    }

    public ExtendInfo withRefreshTime(RefreshTimeEnum refreshTime) {
        this.refreshTime = refreshTime;
        return this;
    }

    /**
     * 刷新时间 0秒表示不刷新,10秒，1分钟，5分钟，20分钟
     * @return refreshTime
     */
    public RefreshTimeEnum getRefreshTime() {
        return refreshTime;
    }

    public void setRefreshTime(RefreshTimeEnum refreshTime) {
        this.refreshTime = refreshTime;
    }

    public ExtendInfo withFrom(Long from) {
        this.from = from;
        return this;
    }

    /**
     * 开始时间
     * minimum: 0
     * maximum: 9999999999999
     * @return from
     */
    public Long getFrom() {
        return from;
    }

    public void setFrom(Long from) {
        this.from = from;
    }

    public ExtendInfo withTo(Long to) {
        this.to = to;
        return this;
    }

    /**
     * 结束时间
     * minimum: 0
     * maximum: 9999999999999
     * @return to
     */
    public Long getTo() {
        return to;
    }

    public void setTo(Long to) {
        this.to = to;
    }

    public ExtendInfo withScreenColor(String screenColor) {
        this.screenColor = screenColor;
        return this;
    }

    /**
     * 监控大屏背景颜色
     * @return screenColor
     */
    public String getScreenColor() {
        return screenColor;
    }

    public void setScreenColor(String screenColor) {
        this.screenColor = screenColor;
    }

    public ExtendInfo withEnableScreenAutoPlay(Boolean enableScreenAutoPlay) {
        this.enableScreenAutoPlay = enableScreenAutoPlay;
        return this;
    }

    /**
     * 监控大屏是否自动切换
     * @return enableScreenAutoPlay
     */
    public Boolean getEnableScreenAutoPlay() {
        return enableScreenAutoPlay;
    }

    public void setEnableScreenAutoPlay(Boolean enableScreenAutoPlay) {
        this.enableScreenAutoPlay = enableScreenAutoPlay;
    }

    public ExtendInfo withTimeInterval(TimeIntervalEnum timeInterval) {
        this.timeInterval = timeInterval;
        return this;
    }

    /**
     * 监控大屏自动切换时间间隔，10000代表10s，30000代表30s，60000代表1min
     * @return timeInterval
     */
    public TimeIntervalEnum getTimeInterval() {
        return timeInterval;
    }

    public void setTimeInterval(TimeIntervalEnum timeInterval) {
        this.timeInterval = timeInterval;
    }

    public ExtendInfo withEnableLegend(Boolean enableLegend) {
        this.enableLegend = enableLegend;
        return this;
    }

    /**
     * 是否开启图例
     * @return enableLegend
     */
    public Boolean getEnableLegend() {
        return enableLegend;
    }

    public void setEnableLegend(Boolean enableLegend) {
        this.enableLegend = enableLegend;
    }

    public ExtendInfo withFullScreenWidgetNum(Integer fullScreenWidgetNum) {
        this.fullScreenWidgetNum = fullScreenWidgetNum;
        return this;
    }

    /**
     * 大屏展示视图数量, 可以取的值必须与console页面可选值保持一致
     * minimum: 0
     * maximum: 65535
     * @return fullScreenWidgetNum
     */
    public Integer getFullScreenWidgetNum() {
        return fullScreenWidgetNum;
    }

    public void setFullScreenWidgetNum(Integer fullScreenWidgetNum) {
        this.fullScreenWidgetNum = fullScreenWidgetNum;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExtendInfo that = (ExtendInfo) obj;
        return Objects.equals(this.filter, that.filter) && Objects.equals(this.period, that.period)
            && Objects.equals(this.displayTime, that.displayTime) && Objects.equals(this.refreshTime, that.refreshTime)
            && Objects.equals(this.from, that.from) && Objects.equals(this.to, that.to)
            && Objects.equals(this.screenColor, that.screenColor)
            && Objects.equals(this.enableScreenAutoPlay, that.enableScreenAutoPlay)
            && Objects.equals(this.timeInterval, that.timeInterval)
            && Objects.equals(this.enableLegend, that.enableLegend)
            && Objects.equals(this.fullScreenWidgetNum, that.fullScreenWidgetNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filter,
            period,
            displayTime,
            refreshTime,
            from,
            to,
            screenColor,
            enableScreenAutoPlay,
            timeInterval,
            enableLegend,
            fullScreenWidgetNum);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExtendInfo {\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    period: ").append(toIndentedString(period)).append("\n");
        sb.append("    displayTime: ").append(toIndentedString(displayTime)).append("\n");
        sb.append("    refreshTime: ").append(toIndentedString(refreshTime)).append("\n");
        sb.append("    from: ").append(toIndentedString(from)).append("\n");
        sb.append("    to: ").append(toIndentedString(to)).append("\n");
        sb.append("    screenColor: ").append(toIndentedString(screenColor)).append("\n");
        sb.append("    enableScreenAutoPlay: ").append(toIndentedString(enableScreenAutoPlay)).append("\n");
        sb.append("    timeInterval: ").append(toIndentedString(timeInterval)).append("\n");
        sb.append("    enableLegend: ").append(toIndentedString(enableLegend)).append("\n");
        sb.append("    fullScreenWidgetNum: ").append(toIndentedString(fullScreenWidgetNum)).append("\n");
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
