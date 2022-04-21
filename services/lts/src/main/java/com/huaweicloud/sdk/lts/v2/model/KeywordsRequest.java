package com.huaweicloud.sdk.lts.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * KeywordsRequest
 */
public class KeywordsRequest {

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
    @JsonProperty(value = "keywords")

    private String keywords;

    /**
     * 条件
     */
    public static final class ConditionEnum {

        /**
         * Enum GREATER_THAN_OR_EQUAL_TO for value: ">="
         */
        public static final ConditionEnum GREATER_THAN_OR_EQUAL_TO = new ConditionEnum(">=");

        /**
         * Enum LESS_THAN_OR_EQUAL_TO for value: "<="
         */
        public static final ConditionEnum LESS_THAN_OR_EQUAL_TO = new ConditionEnum("<=");

        /**
         * Enum LESS_THAN for value: "<"
         */
        public static final ConditionEnum LESS_THAN = new ConditionEnum("<");

        /**
         * Enum GREATER_THAN for value: ">"
         */
        public static final ConditionEnum GREATER_THAN = new ConditionEnum(">");

        private static final Map<String, ConditionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ConditionEnum> createStaticFields() {
            Map<String, ConditionEnum> map = new HashMap<>();
            map.put(">=", GREATER_THAN_OR_EQUAL_TO);
            map.put("<=", LESS_THAN_OR_EQUAL_TO);
            map.put("<", LESS_THAN);
            map.put(">", GREATER_THAN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ConditionEnum(String value) {
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
        public static ConditionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ConditionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ConditionEnum(value);
            }
            return result;
        }

        public static ConditionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ConditionEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ConditionEnum) {
                return this.value.equals(((ConditionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "condition")

    private ConditionEnum condition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "number")

    private Integer number;

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

        private static final Map<String, SearchTimeRangeUnitEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SearchTimeRangeUnitEnum> createStaticFields() {
            Map<String, SearchTimeRangeUnitEnum> map = new HashMap<>();
            map.put("minute", MINUTE);
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

    public KeywordsRequest withLogStreamId(String logStreamId) {
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

    public KeywordsRequest withLogStreamName(String logStreamName) {
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

    public KeywordsRequest withLogGroupId(String logGroupId) {
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

    public KeywordsRequest withLogGroupName(String logGroupName) {
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

    public KeywordsRequest withKeywords(String keywords) {
        this.keywords = keywords;
        return this;
    }

    /**
     * 关键词
     * @return keywords
     */
    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public KeywordsRequest withCondition(ConditionEnum condition) {
        this.condition = condition;
        return this;
    }

    /**
     * 条件
     * @return condition
     */
    public ConditionEnum getCondition() {
        return condition;
    }

    public void setCondition(ConditionEnum condition) {
        this.condition = condition;
    }

    public KeywordsRequest withNumber(Integer number) {
        this.number = number;
        return this;
    }

    /**
     * 行数
     * minimum: 1
     * maximum: 2147483647
     * @return number
     */
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public KeywordsRequest withSearchTimeRange(Integer searchTimeRange) {
        this.searchTimeRange = searchTimeRange;
        return this;
    }

    /**
     * 查询执行任务时最近数据的时间范围，最大值为60
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

    public KeywordsRequest withSearchTimeRangeUnit(SearchTimeRangeUnitEnum searchTimeRangeUnit) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeywordsRequest keywordsRequest = (KeywordsRequest) o;
        return Objects.equals(this.logStreamId, keywordsRequest.logStreamId)
            && Objects.equals(this.logStreamName, keywordsRequest.logStreamName)
            && Objects.equals(this.logGroupId, keywordsRequest.logGroupId)
            && Objects.equals(this.logGroupName, keywordsRequest.logGroupName)
            && Objects.equals(this.keywords, keywordsRequest.keywords)
            && Objects.equals(this.condition, keywordsRequest.condition)
            && Objects.equals(this.number, keywordsRequest.number)
            && Objects.equals(this.searchTimeRange, keywordsRequest.searchTimeRange)
            && Objects.equals(this.searchTimeRangeUnit, keywordsRequest.searchTimeRangeUnit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logStreamId,
            logStreamName,
            logGroupId,
            logGroupName,
            keywords,
            condition,
            number,
            searchTimeRange,
            searchTimeRangeUnit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeywordsRequest {\n");
        sb.append("    logStreamId: ").append(toIndentedString(logStreamId)).append("\n");
        sb.append("    logStreamName: ").append(toIndentedString(logStreamName)).append("\n");
        sb.append("    logGroupId: ").append(toIndentedString(logGroupId)).append("\n");
        sb.append("    logGroupName: ").append(toIndentedString(logGroupName)).append("\n");
        sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
        sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    searchTimeRange: ").append(toIndentedString(searchTimeRange)).append("\n");
        sb.append("    searchTimeRangeUnit: ").append(toIndentedString(searchTimeRangeUnit)).append("\n");
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
