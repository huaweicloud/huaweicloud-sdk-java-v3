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
 * 此参数在请求实体中，采用json字符串格式
 */
public class QueryLtsLogParams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private Map<String, String> labels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_count")

    private Boolean isCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keywords")

    private String keywords;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "line_num")

    private String lineNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_desc")

    private Boolean isDesc;

    /**
     * 首次查询为 “init”, 分页查询时为 “forwards”或者“backwards”, 默认为首次查询“init”, 与 is_desc 参数配合进行分页查询。
     */
    public static final class SearchTypeEnum {

        /**
         * Enum FORWARDS for value: "forwards"
         */
        public static final SearchTypeEnum FORWARDS = new SearchTypeEnum("forwards");

        /**
         * Enum BACKWARDS for value: "backwards"
         */
        public static final SearchTypeEnum BACKWARDS = new SearchTypeEnum("backwards");

        private static final Map<String, SearchTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SearchTypeEnum> createStaticFields() {
            Map<String, SearchTypeEnum> map = new HashMap<>();
            map.put("forwards", FORWARDS);
            map.put("backwards", BACKWARDS);
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
            SearchTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SearchTypeEnum(value);
            }
            return result;
        }

        public static SearchTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            SearchTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "highlight")

    private Boolean highlight;

    public QueryLtsLogParams withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 搜索起始时间（UTC时间，毫秒级）。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public QueryLtsLogParams withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 搜索结束时间（UTC时间，毫秒级）。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public QueryLtsLogParams withLabels(Map<String, String> labels) {
        this.labels = labels;
        return this;
    }

    public QueryLtsLogParams putLabelsItem(String key, String labelsItem) {
        if (this.labels == null) {
            this.labels = new HashMap<>();
        }
        this.labels.put(key, labelsItem);
        return this;
    }

    public QueryLtsLogParams withLabels(Consumer<Map<String, String>> labelsSetter) {
        if (this.labels == null) {
            this.labels = new HashMap<>();
        }
        labelsSetter.accept(this.labels);
        return this;
    }

    /**
     * 日志过滤条件集合，不同日志来源所需字段不同。
     * @return labels
     */
    public Map<String, String> getLabels() {
        return labels;
    }

    public void setLabels(Map<String, String> labels) {
        this.labels = labels;
    }

    public QueryLtsLogParams withIsCount(Boolean isCount) {
        this.isCount = isCount;
        return this;
    }

    /**
     * 日志条数统计。默认为false(不统计)，true为统计日志条数。
     * @return isCount
     */
    public Boolean getIsCount() {
        return isCount;
    }

    public void setIsCount(Boolean isCount) {
        this.isCount = isCount;
    }

    public QueryLtsLogParams withKeywords(String keywords) {
        this.keywords = keywords;
        return this;
    }

    /**
     * 支持关键词精确搜索。关键词指相邻两个分词符之间的单词,例：error
     * @return keywords
     */
    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public QueryLtsLogParams withLineNum(String lineNum) {
        this.lineNum = lineNum;
        return this;
    }

    /**
     * 日志单行序列号，第一次查询时不需要此参数，后续分页查询时需要使用，可从上次查询的返回信息中获取。line_num应在start_time 和 end_time 之间。
     * @return lineNum
     */
    public String getLineNum() {
        return lineNum;
    }

    public void setLineNum(String lineNum) {
        this.lineNum = lineNum;
    }

    public QueryLtsLogParams withIsDesc(Boolean isDesc) {
        this.isDesc = isDesc;
        return this;
    }

    /**
     * 顺序或者倒序查询, 默认为false(顺序查询)
     * @return isDesc
     */
    public Boolean getIsDesc() {
        return isDesc;
    }

    public void setIsDesc(Boolean isDesc) {
        this.isDesc = isDesc;
    }

    public QueryLtsLogParams withSearchType(SearchTypeEnum searchType) {
        this.searchType = searchType;
        return this;
    }

    /**
     * 首次查询为 “init”, 分页查询时为 “forwards”或者“backwards”, 默认为首次查询“init”, 与 is_desc 参数配合进行分页查询。
     * @return searchType
     */
    public SearchTypeEnum getSearchType() {
        return searchType;
    }

    public void setSearchType(SearchTypeEnum searchType) {
        this.searchType = searchType;
    }

    public QueryLtsLogParams withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 表示每次查询的日志条数，不填时默认为50，建议您设置为100。
     * minimum: 1
     * maximum: 5000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public QueryLtsLogParams withHighlight(Boolean highlight) {
        this.highlight = highlight;
        return this;
    }

    /**
     * 日志关键词高亮显示，默认为true（高亮显示），false为取消高亮显示。
     * @return highlight
     */
    public Boolean getHighlight() {
        return highlight;
    }

    public void setHighlight(Boolean highlight) {
        this.highlight = highlight;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryLtsLogParams queryLtsLogParams = (QueryLtsLogParams) o;
        return Objects.equals(this.startTime, queryLtsLogParams.startTime)
            && Objects.equals(this.endTime, queryLtsLogParams.endTime)
            && Objects.equals(this.labels, queryLtsLogParams.labels)
            && Objects.equals(this.isCount, queryLtsLogParams.isCount)
            && Objects.equals(this.keywords, queryLtsLogParams.keywords)
            && Objects.equals(this.lineNum, queryLtsLogParams.lineNum)
            && Objects.equals(this.isDesc, queryLtsLogParams.isDesc)
            && Objects.equals(this.searchType, queryLtsLogParams.searchType)
            && Objects.equals(this.limit, queryLtsLogParams.limit)
            && Objects.equals(this.highlight, queryLtsLogParams.highlight);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(startTime, endTime, labels, isCount, keywords, lineNum, isDesc, searchType, limit, highlight);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryLtsLogParams {\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    isCount: ").append(toIndentedString(isCount)).append("\n");
        sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
        sb.append("    lineNum: ").append(toIndentedString(lineNum)).append("\n");
        sb.append("    isDesc: ").append(toIndentedString(isDesc)).append("\n");
        sb.append("    searchType: ").append(toIndentedString(searchType)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    highlight: ").append(toIndentedString(highlight)).append("\n");
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
