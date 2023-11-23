package com.huaweicloud.sdk.dds.v3.model;

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
 * ListLtsErrorLogsRequestBody
 */
public class ListLtsErrorLogsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "line_num")

    private String lineNum;

    /**
     * 日志级别，取空值表示查询所有日志级别。
     */
    public static final class SeverityEnum {

        /**
         * Enum WARNING for value: "Warning"
         */
        public static final SeverityEnum WARNING = new SeverityEnum("Warning");

        /**
         * Enum ERROR for value: "Error"
         */
        public static final SeverityEnum ERROR = new SeverityEnum("Error");

        private static final Map<String, SeverityEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SeverityEnum> createStaticFields() {
            Map<String, SeverityEnum> map = new HashMap<>();
            map.put("Warning", WARNING);
            map.put("Error", ERROR);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SeverityEnum(String value) {
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
        public static SeverityEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SeverityEnum(value));
        }

        public static SeverityEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SeverityEnum) {
                return this.value.equals(((SeverityEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "severity")

    private SeverityEnum severity;

    /**
     * 日志查询方式，需结合line_num使用, 以line_num的日志为起始点: - 取值\"backwards\"时，表示查询上一页limit大小的日志 - 取值\"forwards\"时，表示查询下一页limit大小的日志 - 不传默认\"forwards\"
     */
    public static final class SearchTypeEnum {

        /**
         * Enum BACKWARDS for value: "backwards"
         */
        public static final SearchTypeEnum BACKWARDS = new SearchTypeEnum("backwards");

        /**
         * Enum FORWARDS for value: "forwards"
         */
        public static final SearchTypeEnum FORWARDS = new SearchTypeEnum("forwards");

        private static final Map<String, SearchTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SearchTypeEnum> createStaticFields() {
            Map<String, SearchTypeEnum> map = new HashMap<>();
            map.put("backwards", BACKWARDS);
            map.put("forwards", FORWARDS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SearchTypeEnum(String value) {
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
        public static SearchTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SearchTypeEnum(value));
        }

        public static SearchTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SearchTypeEnum) {
                return this.value.equals(((SearchTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_type")

    private SearchTypeEnum searchType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keywords")

    private List<String> keywords = null;

    public ListLtsErrorLogsRequestBody withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间，格式为“yyyy-mm-ddThh:mm:ssZ”。 其中，T指某个时间的开始；Z指时区偏移量，例如北京时间偏移显示为+0800。注：开始时间不得早于当前时间30天。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ListLtsErrorLogsRequestBody withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间，格式为“yyyy-mm-ddThh:mm:ssZ”。 其中，T指某个时间的开始；Z指时区偏移量，例如北京时间偏移显示为+0800。注：结束时间不能晚于当前时间。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ListLtsErrorLogsRequestBody withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 表示每次查询的日志条数，最大限制100条。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListLtsErrorLogsRequestBody withLineNum(String lineNum) {
        this.lineNum = lineNum;
        return this;
    }

    /**
     * 日志单行序列号，第一次查询时不需要此参数，下一页查询时需要使用，可从上一次查询的返回信息中获取。 说明：当次查询从line_num的下一条日志开始查询，不包含当前line_num日志。
     * @return lineNum
     */
    public String getLineNum() {
        return lineNum;
    }

    public void setLineNum(String lineNum) {
        this.lineNum = lineNum;
    }

    public ListLtsErrorLogsRequestBody withSeverity(SeverityEnum severity) {
        this.severity = severity;
        return this;
    }

    /**
     * 日志级别，取空值表示查询所有日志级别。
     * @return severity
     */
    public SeverityEnum getSeverity() {
        return severity;
    }

    public void setSeverity(SeverityEnum severity) {
        this.severity = severity;
    }

    public ListLtsErrorLogsRequestBody withSearchType(SearchTypeEnum searchType) {
        this.searchType = searchType;
        return this;
    }

    /**
     * 日志查询方式，需结合line_num使用, 以line_num的日志为起始点: - 取值\"backwards\"时，表示查询上一页limit大小的日志 - 取值\"forwards\"时，表示查询下一页limit大小的日志 - 不传默认\"forwards\"
     * @return searchType
     */
    public SearchTypeEnum getSearchType() {
        return searchType;
    }

    public void setSearchType(SearchTypeEnum searchType) {
        this.searchType = searchType;
    }

    public ListLtsErrorLogsRequestBody withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 节点ID，取空值，表示查询实例下所有允许查询的节点。 使用请参考《DDS API参考》的“查询实例列表和详情”响应消息表“nodes 数据结构说明”的“id”。允许查询的节点如下： - 集群实例下面的 shard节点 - 副本集、单节点实例下面的所有节点
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public ListLtsErrorLogsRequestBody withKeywords(List<String> keywords) {
        this.keywords = keywords;
        return this;
    }

    public ListLtsErrorLogsRequestBody addKeywordsItem(String keywordsItem) {
        if (this.keywords == null) {
            this.keywords = new ArrayList<>();
        }
        this.keywords.add(keywordsItem);
        return this;
    }

    public ListLtsErrorLogsRequestBody withKeywords(Consumer<List<String>> keywordsSetter) {
        if (this.keywords == null) {
            this.keywords = new ArrayList<>();
        }
        keywordsSetter.accept(this.keywords);
        return this;
    }

    /**
     * 根据多个关键字搜索日志全文，表示同时匹配所有关键字。 - 只支持关键字前缀模糊搜索，最多支持10个关键字。 - 每个关键字最大长度不超过512个字符。
     * @return keywords
     */
    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListLtsErrorLogsRequestBody that = (ListLtsErrorLogsRequestBody) obj;
        return Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.lineNum, that.lineNum)
            && Objects.equals(this.severity, that.severity) && Objects.equals(this.searchType, that.searchType)
            && Objects.equals(this.nodeId, that.nodeId) && Objects.equals(this.keywords, that.keywords);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime, endTime, limit, lineNum, severity, searchType, nodeId, keywords);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLtsErrorLogsRequestBody {\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    lineNum: ").append(toIndentedString(lineNum)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    searchType: ").append(toIndentedString(searchType)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
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
