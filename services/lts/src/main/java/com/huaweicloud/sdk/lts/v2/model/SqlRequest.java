package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SqlRequest
 */
public class SqlRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_stream_id")

    private String logStreamId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_stream_name")

    private String logStreamName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_group_id")

    private String logGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_group_name")

    private String logGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql")

    private String sql;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_time_range")

    private Integer searchTimeRange;

    /**
     * 查询时间单位
     */
    public static final class SearchTimeRangeUnitEnum {

        /**
         * Enum MINUTE for value: "minute"
         */
        public static final SearchTimeRangeUnitEnum MINUTE = new SearchTimeRangeUnitEnum("minute");

        /**
         * Enum HOUR for value: "hour"
         */
        public static final SearchTimeRangeUnitEnum HOUR = new SearchTimeRangeUnitEnum("hour");

        private static final Map<String, SearchTimeRangeUnitEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SearchTimeRangeUnitEnum> createStaticFields() {
            Map<String, SearchTimeRangeUnitEnum> map = new HashMap<>();
            map.put("minute", MINUTE);
            map.put("hour", HOUR);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SearchTimeRangeUnitEnum(String value) {
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
        public static SearchTimeRangeUnitEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SearchTimeRangeUnitEnum(value));
        }

        public static SearchTimeRangeUnitEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SearchTimeRangeUnitEnum) {
                return this.value.equals(((SearchTimeRangeUnitEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_time_range_unit")

    private SearchTimeRangeUnitEnum searchTimeRangeUnit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_date")

    private CustomDate customDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_time_range_relative")

    private Boolean isTimeRangeRelative;

    public SqlRequest withLogStreamId(String logStreamId) {
        this.logStreamId = logStreamId;
        return this;
    }

    /**
     * 日志流id
     * @return logStreamId
     */
    public String getLogStreamId() {
        return logStreamId;
    }

    public void setLogStreamId(String logStreamId) {
        this.logStreamId = logStreamId;
    }

    public SqlRequest withLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
        return this;
    }

    /**
     * 日志流名称
     * @return logStreamName
     */
    public String getLogStreamName() {
        return logStreamName;
    }

    public void setLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
    }

    public SqlRequest withLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
        return this;
    }

    /**
     * 日志组id
     * @return logGroupId
     */
    public String getLogGroupId() {
        return logGroupId;
    }

    public void setLogGroupId(String logGroupId) {
        this.logGroupId = logGroupId;
    }

    public SqlRequest withLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
        return this;
    }

    /**
     * 日志组名称
     * @return logGroupName
     */
    public String getLogGroupName() {
        return logGroupName;
    }

    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    public SqlRequest withSql(String sql) {
        this.sql = sql;
        return this;
    }

    /**
     * sql语句
     * @return sql
     */
    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public SqlRequest withSearchTimeRange(Integer searchTimeRange) {
        this.searchTimeRange = searchTimeRange;
        return this;
    }

    /**
     * 查询执行任务时最近数据的时间范围(当search_time_range_unit为minute，则最大值为60;当search_time_range_unit为hour，则最大值为24)
     * minimum: 1
     * maximum: 60
     * @return searchTimeRange
     */
    public Integer getSearchTimeRange() {
        return searchTimeRange;
    }

    public void setSearchTimeRange(Integer searchTimeRange) {
        this.searchTimeRange = searchTimeRange;
    }

    public SqlRequest withSearchTimeRangeUnit(SearchTimeRangeUnitEnum searchTimeRangeUnit) {
        this.searchTimeRangeUnit = searchTimeRangeUnit;
        return this;
    }

    /**
     * 查询时间单位
     * @return searchTimeRangeUnit
     */
    public SearchTimeRangeUnitEnum getSearchTimeRangeUnit() {
        return searchTimeRangeUnit;
    }

    public void setSearchTimeRangeUnit(SearchTimeRangeUnitEnum searchTimeRangeUnit) {
        this.searchTimeRangeUnit = searchTimeRangeUnit;
    }

    public SqlRequest withCustomDate(CustomDate customDate) {
        this.customDate = customDate;
        return this;
    }

    public SqlRequest withCustomDate(Consumer<CustomDate> customDateSetter) {
        if (this.customDate == null) {
            this.customDate = new CustomDate();
            customDateSetter.accept(this.customDate);
        }

        return this;
    }

    /**
     * Get customDate
     * @return customDate
     */
    public CustomDate getCustomDate() {
        return customDate;
    }

    public void setCustomDate(CustomDate customDate) {
        this.customDate = customDate;
    }

    public SqlRequest withIsTimeRangeRelative(Boolean isTimeRangeRelative) {
        this.isTimeRangeRelative = isTimeRangeRelative;
        return this;
    }

    /**
     * **参数解释：** 告警查询日志的时间区间为相对时间还是整点时间。（暂不开放，后续aom上线该功能后一起开放） **约束限制：** 不涉及。 **取值范围：** - true: 相对时间。 - false: 整点时间。 **默认取值：** true
     * @return isTimeRangeRelative
     */
    public Boolean getIsTimeRangeRelative() {
        return isTimeRangeRelative;
    }

    public void setIsTimeRangeRelative(Boolean isTimeRangeRelative) {
        this.isTimeRangeRelative = isTimeRangeRelative;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SqlRequest that = (SqlRequest) obj;
        return Objects.equals(this.logStreamId, that.logStreamId)
            && Objects.equals(this.logStreamName, that.logStreamName)
            && Objects.equals(this.logGroupId, that.logGroupId) && Objects.equals(this.logGroupName, that.logGroupName)
            && Objects.equals(this.sql, that.sql) && Objects.equals(this.searchTimeRange, that.searchTimeRange)
            && Objects.equals(this.searchTimeRangeUnit, that.searchTimeRangeUnit)
            && Objects.equals(this.customDate, that.customDate)
            && Objects.equals(this.isTimeRangeRelative, that.isTimeRangeRelative);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logStreamId,
            logStreamName,
            logGroupId,
            logGroupName,
            sql,
            searchTimeRange,
            searchTimeRangeUnit,
            customDate,
            isTimeRangeRelative);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SqlRequest {\n");
        sb.append("    logStreamId: ").append(toIndentedString(logStreamId)).append("\n");
        sb.append("    logStreamName: ").append(toIndentedString(logStreamName)).append("\n");
        sb.append("    logGroupId: ").append(toIndentedString(logGroupId)).append("\n");
        sb.append("    logGroupName: ").append(toIndentedString(logGroupName)).append("\n");
        sb.append("    sql: ").append(toIndentedString(sql)).append("\n");
        sb.append("    searchTimeRange: ").append(toIndentedString(searchTimeRange)).append("\n");
        sb.append("    searchTimeRangeUnit: ").append(toIndentedString(searchTimeRangeUnit)).append("\n");
        sb.append("    customDate: ").append(toIndentedString(customDate)).append("\n");
        sb.append("    isTimeRangeRelative: ").append(toIndentedString(isTimeRangeRelative)).append("\n");
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
