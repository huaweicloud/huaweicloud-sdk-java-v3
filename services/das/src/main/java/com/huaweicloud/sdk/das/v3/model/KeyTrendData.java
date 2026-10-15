package com.huaweicloud.sdk.das.v3.model;

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
 * KeyTrendData
 */
public class KeyTrendData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 统计维度。size/storage/qps/traffic
     */
    public static final class StatTypeEnum {

        /**
         * Enum SIZE for value: "size"
         */
        public static final StatTypeEnum SIZE = new StatTypeEnum("size");

        /**
         * Enum STORAGE for value: "storage"
         */
        public static final StatTypeEnum STORAGE = new StatTypeEnum("storage");

        /**
         * Enum QPS for value: "qps"
         */
        public static final StatTypeEnum QPS = new StatTypeEnum("qps");

        /**
         * Enum TRAFFIC for value: "traffic"
         */
        public static final StatTypeEnum TRAFFIC = new StatTypeEnum("traffic");

        private static final Map<String, StatTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StatTypeEnum> createStaticFields() {
            Map<String, StatTypeEnum> map = new HashMap<>();
            map.put("size", SIZE);
            map.put("storage", STORAGE);
            map.put("qps", QPS);
            map.put("traffic", TRAFFIC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StatTypeEnum(String value) {
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
        public static StatTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StatTypeEnum(value));
        }

        public static StatTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StatTypeEnum) {
                return this.value.equals(((StatTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stat_type")

    private StatTypeEnum statType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interval")

    private Long interval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trend_list")

    private List<TrendPoint> trendList = null;

    public KeyTrendData withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * key名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public KeyTrendData withStatType(StatTypeEnum statType) {
        this.statType = statType;
        return this;
    }

    /**
     * 统计维度。size/storage/qps/traffic
     * @return statType
     */
    public StatTypeEnum getStatType() {
        return statType;
    }

    public void setStatType(StatTypeEnum statType) {
        this.statType = statType;
    }

    public KeyTrendData withInterval(Long interval) {
        this.interval = interval;
        return this;
    }

    /**
     * 时间粒度（毫秒）
     * minimum: 1
     * maximum: 9999999999999
     * @return interval
     */
    public Long getInterval() {
        return interval;
    }

    public void setInterval(Long interval) {
        this.interval = interval;
    }

    public KeyTrendData withTrendList(List<TrendPoint> trendList) {
        this.trendList = trendList;
        return this;
    }

    public KeyTrendData addTrendListItem(TrendPoint trendListItem) {
        if (this.trendList == null) {
            this.trendList = new ArrayList<>();
        }
        this.trendList.add(trendListItem);
        return this;
    }

    public KeyTrendData withTrendList(Consumer<List<TrendPoint>> trendListSetter) {
        if (this.trendList == null) {
            this.trendList = new ArrayList<>();
        }
        trendListSetter.accept(this.trendList);
        return this;
    }

    /**
     * 趋势数据点列表
     * @return trendList
     */
    public List<TrendPoint> getTrendList() {
        return trendList;
    }

    public void setTrendList(List<TrendPoint> trendList) {
        this.trendList = trendList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        KeyTrendData that = (KeyTrendData) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.statType, that.statType)
            && Objects.equals(this.interval, that.interval) && Objects.equals(this.trendList, that.trendList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, statType, interval, trendList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeyTrendData {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    statType: ").append(toIndentedString(statType)).append("\n");
        sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
        sb.append("    trendList: ").append(toIndentedString(trendList)).append("\n");
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
