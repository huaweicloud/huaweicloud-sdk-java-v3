package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** SqlRequest */
public class SqlRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_time_range_relative")

    private Boolean isTimeRangeRelative;

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
    @JsonProperty(value = "sql_request_title")

    private String sqlRequestTitle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_time_range")

    private Integer searchTimeRange;

    /** 查询时间单位 */
    public static final class SearchTimeRangeUnitEnum {

        /** Enum MINUTE for value: "minute" */
        public static final SearchTimeRangeUnitEnum MINUTE = new SearchTimeRangeUnitEnum("minute");

        /** Enum HOUR for value: "hour" */
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
            SearchTimeRangeUnitEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SearchTimeRangeUnitEnum(value);
            }
            return result;
        }

        public static SearchTimeRangeUnitEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            SearchTimeRangeUnitEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    public SqlRequest withIsTimeRangeRelative(Boolean isTimeRangeRelative) {
        this.isTimeRangeRelative = isTimeRangeRelative;
        return this;
    }

    /** 是时间范围相对
     * 
     * @return isTimeRangeRelative */
    public Boolean getIsTimeRangeRelative() {
        return isTimeRangeRelative;
    }

    public void setIsTimeRangeRelative(Boolean isTimeRangeRelative) {
        this.isTimeRangeRelative = isTimeRangeRelative;
    }

    public SqlRequest withLogStreamId(String logStreamId) {
        this.logStreamId = logStreamId;
        return this;
    }

    /** 日志流id
     * 
     * @return logStreamId */
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

    /** 日志流名称
     * 
     * @return logStreamName */
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

    /** 日志组id
     * 
     * @return logGroupId */
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

    /** 日志组名称
     * 
     * @return logGroupName */
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

    /** sql语句
     * 
     * @return sql */
    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public SqlRequest withSqlRequestTitle(String sqlRequestTitle) {
        this.sqlRequestTitle = sqlRequestTitle;
        return this;
    }

    /** 图表名称
     * 
     * @return sqlRequestTitle */
    public String getSqlRequestTitle() {
        return sqlRequestTitle;
    }

    public void setSqlRequestTitle(String sqlRequestTitle) {
        this.sqlRequestTitle = sqlRequestTitle;
    }

    public SqlRequest withSearchTimeRange(Integer searchTimeRange) {
        this.searchTimeRange = searchTimeRange;
        return this;
    }

    /** 查询执行任务时最近数据的时间范围(当search_time_range_unit为minute，则最大值为60;当search_time_range_unit为hour，则最大值为24) minimum: 1
     * maximum: 60
     * 
     * @return searchTimeRange */
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

    /** 查询时间单位
     * 
     * @return searchTimeRangeUnit */
    public SearchTimeRangeUnitEnum getSearchTimeRangeUnit() {
        return searchTimeRangeUnit;
    }

    public void setSearchTimeRangeUnit(SearchTimeRangeUnitEnum searchTimeRangeUnit) {
        this.searchTimeRangeUnit = searchTimeRangeUnit;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SqlRequest sqlRequest = (SqlRequest) o;
        return Objects.equals(this.isTimeRangeRelative, sqlRequest.isTimeRangeRelative)
            && Objects.equals(this.logStreamId, sqlRequest.logStreamId)
            && Objects.equals(this.logStreamName, sqlRequest.logStreamName)
            && Objects.equals(this.logGroupId, sqlRequest.logGroupId)
            && Objects.equals(this.logGroupName, sqlRequest.logGroupName) && Objects.equals(this.sql, sqlRequest.sql)
            && Objects.equals(this.sqlRequestTitle, sqlRequest.sqlRequestTitle)
            && Objects.equals(this.searchTimeRange, sqlRequest.searchTimeRange)
            && Objects.equals(this.searchTimeRangeUnit, sqlRequest.searchTimeRangeUnit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isTimeRangeRelative,
            logStreamId,
            logStreamName,
            logGroupId,
            logGroupName,
            sql,
            sqlRequestTitle,
            searchTimeRange,
            searchTimeRangeUnit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SqlRequest {\n");
        sb.append("    isTimeRangeRelative: ").append(toIndentedString(isTimeRangeRelative)).append("\n");
        sb.append("    logStreamId: ").append(toIndentedString(logStreamId)).append("\n");
        sb.append("    logStreamName: ").append(toIndentedString(logStreamName)).append("\n");
        sb.append("    logGroupId: ").append(toIndentedString(logGroupId)).append("\n");
        sb.append("    logGroupName: ").append(toIndentedString(logGroupName)).append("\n");
        sb.append("    sql: ").append(toIndentedString(sql)).append("\n");
        sb.append("    sqlRequestTitle: ").append(toIndentedString(sqlRequestTitle)).append("\n");
        sb.append("    searchTimeRange: ").append(toIndentedString(searchTimeRange)).append("\n");
        sb.append("    searchTimeRangeUnit: ").append(toIndentedString(searchTimeRangeUnit)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
