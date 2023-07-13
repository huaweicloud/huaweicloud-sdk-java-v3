package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 查询实例的错误日志对象
 */
public class ErrorlogForLtsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    /**
     * 日志级别，默认为ALL。
     */
    public static final class LevelEnum {

        /**
         * Enum ALL for value: "ALL"
         */
        public static final LevelEnum ALL = new LevelEnum("ALL");

        /**
         * Enum INFO for value: "INFO"
         */
        public static final LevelEnum INFO = new LevelEnum("INFO");

        /**
         * Enum LOG for value: "LOG"
         */
        public static final LevelEnum LOG = new LevelEnum("LOG");

        /**
         * Enum WARNING for value: "WARNING"
         */
        public static final LevelEnum WARNING = new LevelEnum("WARNING");

        /**
         * Enum ERROR for value: "ERROR"
         */
        public static final LevelEnum ERROR = new LevelEnum("ERROR");

        /**
         * Enum FATAL for value: "FATAL"
         */
        public static final LevelEnum FATAL = new LevelEnum("FATAL");

        /**
         * Enum PANIC for value: "PANIC"
         */
        public static final LevelEnum PANIC = new LevelEnum("PANIC");

        /**
         * Enum NOTE for value: "NOTE"
         */
        public static final LevelEnum NOTE = new LevelEnum("NOTE");

        private static final Map<String, LevelEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LevelEnum> createStaticFields() {
            Map<String, LevelEnum> map = new HashMap<>();
            map.put("ALL", ALL);
            map.put("INFO", INFO);
            map.put("LOG", LOG);
            map.put("WARNING", WARNING);
            map.put("ERROR", ERROR);
            map.put("FATAL", FATAL);
            map.put("PANIC", PANIC);
            map.put("NOTE", NOTE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LevelEnum(String value) {
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
        public static LevelEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LevelEnum(value));
        }

        public static LevelEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LevelEnum) {
                return this.value.equals(((LevelEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "level")

    private LevelEnum level;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "line_num")

    private String lineNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_type")

    private String searchType;

    public ErrorlogForLtsRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始日期，格式为“yyyy-mm-ddThh:mm:ssZ”。 其中，T指某个时间的开始；Z指时区偏移量，例如北京时间偏移显示为+0800。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ErrorlogForLtsRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间，格式为“yyyy-mm-ddThh:mm:ssZ”。 其中，T指某个时间的开始；Z指时区偏移量，例如北京时间偏移显示为+0800。只能查询当前时间前一个月内的慢日志。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ErrorlogForLtsRequest withLevel(LevelEnum level) {
        this.level = level;
        return this;
    }

    /**
     * 日志级别，默认为ALL。
     * @return level
     */
    public LevelEnum getLevel() {
        return level;
    }

    public void setLevel(LevelEnum level) {
        this.level = level;
    }

    public ErrorlogForLtsRequest withLineNum(String lineNum) {
        this.lineNum = lineNum;
        return this;
    }

    /**
     * 日志单行序列号，第一次查询时不需要此参数，后续分页查询时需要使用，可从上次查询的返回信息中获取。line_num应在start_time和end_time之间。
     * @return lineNum
     */
    public String getLineNum() {
        return lineNum;
    }

    public void setLineNum(String lineNum) {
        this.lineNum = lineNum;
    }

    public ErrorlogForLtsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页多少条记录（查询结果），取值范围是1~100，不填时默认为10。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ErrorlogForLtsRequest withSearchType(String searchType) {
        this.searchType = searchType;
        return this;
    }

    /**
     * 搜索方式。默认forwards。配合line_num使用，以line_num为起点，向前搜索或向后搜索。
     * @return searchType
     */
    public String getSearchType() {
        return searchType;
    }

    public void setSearchType(String searchType) {
        this.searchType = searchType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ErrorlogForLtsRequest that = (ErrorlogForLtsRequest) obj;
        return Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.level, that.level) && Objects.equals(this.lineNum, that.lineNum)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.searchType, that.searchType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime, endTime, level, lineNum, limit, searchType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ErrorlogForLtsRequest {\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    level: ").append(toIndentedString(level)).append("\n");
        sb.append("    lineNum: ").append(toIndentedString(lineNum)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    searchType: ").append(toIndentedString(searchType)).append("\n");
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
