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
    @JsonProperty(value = "__time__")

    private String time;

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
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "highlight")

    private Boolean highlight;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_iterative")

    private Boolean isIterative;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query")

    private String query;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_analysis_query")

    private Boolean isAnalysisQuery;

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

    public QueryLtsLogParams withTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * 若已开启自定义时间功能，需要使用该字段进行分页查询。
     * @return time
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "__time__")
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
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

    public QueryLtsLogParams withIsIterative(Boolean isIterative) {
        this.isIterative = isIterative;
        return this;
    }

    /**
     * 日志迭代查询，默认为false（不开启迭代），true为开启迭代。
     * @return isIterative
     */
    public Boolean getIsIterative() {
        return isIterative;
    }

    public void setIsIterative(Boolean isIterative) {
        this.isIterative = isIterative;
    }

    public QueryLtsLogParams withQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * 使用带管道符的sql分析语句进行查询，需要query参数is_analysis_query为true时生效。
     * @return query
     */
    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public QueryLtsLogParams withIsAnalysisQuery(Boolean isAnalysisQuery) {
        this.isAnalysisQuery = isAnalysisQuery;
        return this;
    }

    /**
     * 是否为带管道符的sql分析语句。当该参数为true时，将依照body体中的query参数内容进行查询，且body体中除start_time与end_time以外的参数失效，分页、排序、查询结果条数等功能请依照sql语法规则实现。查询结果的响应体不同于未启用时的查询方式，将以默认列存的形式返回查询结果。当前仅对内测用户开放。响应示例：{\"analysisLogs\":[{\"field1\":\"1\",\"field2\":\"2\",\"field3\":\"3\"},{\"field1\":\"1\",\"field2\":\"2\",\"field3\":\"3\"},{\"field1\":\"1\",\"field2\":\"2\",\"field3\":\"3\"}]}
     * @return isAnalysisQuery
     */
    public Boolean getIsAnalysisQuery() {
        return isAnalysisQuery;
    }

    public void setIsAnalysisQuery(Boolean isAnalysisQuery) {
        this.isAnalysisQuery = isAnalysisQuery;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueryLtsLogParams that = (QueryLtsLogParams) obj;
        return Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.labels, that.labels) && Objects.equals(this.isCount, that.isCount)
            && Objects.equals(this.keywords, that.keywords) && Objects.equals(this.lineNum, that.lineNum)
            && Objects.equals(this.time, that.time) && Objects.equals(this.isDesc, that.isDesc)
            && Objects.equals(this.searchType, that.searchType) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.highlight, that.highlight) && Objects.equals(this.isIterative, that.isIterative)
            && Objects.equals(this.query, that.query) && Objects.equals(this.isAnalysisQuery, that.isAnalysisQuery);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime,
            endTime,
            labels,
            isCount,
            keywords,
            lineNum,
            time,
            isDesc,
            searchType,
            limit,
            highlight,
            isIterative,
            query,
            isAnalysisQuery);
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
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    isDesc: ").append(toIndentedString(isDesc)).append("\n");
        sb.append("    searchType: ").append(toIndentedString(searchType)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    highlight: ").append(toIndentedString(highlight)).append("\n");
        sb.append("    isIterative: ").append(toIndentedString(isIterative)).append("\n");
        sb.append("    query: ").append(toIndentedString(query)).append("\n");
        sb.append("    isAnalysisQuery: ").append(toIndentedString(isAnalysisQuery)).append("\n");
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
