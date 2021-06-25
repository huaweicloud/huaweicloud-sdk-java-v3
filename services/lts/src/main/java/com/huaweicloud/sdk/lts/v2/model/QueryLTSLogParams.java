package com.huaweicloud.sdk.lts.v2.model;




import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 此参数在请求实体中，采用json字符串格式
 */
public class QueryLTSLogParams  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="start_time")
    
    private String startTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="end_time")
    
    private String endTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="labels")
    
    private Object labels;
    /**
     * 支持关键词精确搜索。关键词指相邻两个分词符之间的单词。
     */
    public static final class KeywordsEnum {

        
        /**
         * Enum ERROR for value: "error"
         */
        public static final KeywordsEnum ERROR = new KeywordsEnum("error");
        

        private static final Map<String, KeywordsEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, KeywordsEnum> createStaticFields() {
            Map<String, KeywordsEnum> map = new HashMap<>();
            map.put("error", ERROR);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        KeywordsEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static KeywordsEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            KeywordsEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new KeywordsEnum(value);
            }
            return result;
        }

        public static KeywordsEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            KeywordsEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof KeywordsEnum) {
                return this.value.equals(((KeywordsEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="keywords")
    
    private KeywordsEnum keywords;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="line_num")
    
    private String lineNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_desc")
    
    private Boolean isDesc;
    /**
     * 首次查询为 “init”, 分页查询时为 “forwards”或者“backwards”, 默认为首次查询“init”, 与 is_desc 参数配合进行分页查询。
     */
    public static final class SearchTypeEnum {

        
        /**
         * Enum FORWARDS for value: "forwards"
         */
        public static final SearchTypeEnum FORWARDS = new SearchTypeEnum("forwards");
        

        private static final Map<String, SearchTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SearchTypeEnum> createStaticFields() {
            Map<String, SearchTypeEnum> map = new HashMap<>();
            map.put("forwards", FORWARDS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SearchTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static SearchTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            SearchTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new SearchTypeEnum(value);
            }
            return result;
        }

        public static SearchTypeEnum valueOf(String value) {
            if( value == null ){
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
            if (obj != null && obj instanceof SearchTypeEnum) {
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
    @JsonProperty(value="search_type")
    
    private SearchTypeEnum searchType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;

    public QueryLTSLogParams withStartTime(String startTime) {
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

    

    public QueryLTSLogParams withEndTime(String endTime) {
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

    

    public QueryLTSLogParams withLabels(Object labels) {
        this.labels = labels;
        return this;
    }

    


    /**
     * 日志过滤条件集合，不同日志来源所需字段不同。
     * @return labels
     */
    public Object getLabels() {
        return labels;
    }

    public void setLabels(Object labels) {
        this.labels = labels;
    }

    

    public QueryLTSLogParams withKeywords(KeywordsEnum keywords) {
        this.keywords = keywords;
        return this;
    }

    


    /**
     * 支持关键词精确搜索。关键词指相邻两个分词符之间的单词。
     * @return keywords
     */
    public KeywordsEnum getKeywords() {
        return keywords;
    }

    public void setKeywords(KeywordsEnum keywords) {
        this.keywords = keywords;
    }

    

    public QueryLTSLogParams withLineNum(String lineNum) {
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

    

    public QueryLTSLogParams withIsDesc(Boolean isDesc) {
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

    

    public QueryLTSLogParams withSearchType(SearchTypeEnum searchType) {
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

    

    public QueryLTSLogParams withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * 表示每次查询的日志条数，不填时默认为5000，建议您设置为100。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryLTSLogParams queryLTSLogParams = (QueryLTSLogParams) o;
        return Objects.equals(this.startTime, queryLTSLogParams.startTime) &&
            Objects.equals(this.endTime, queryLTSLogParams.endTime) &&
            Objects.equals(this.labels, queryLTSLogParams.labels) &&
            Objects.equals(this.keywords, queryLTSLogParams.keywords) &&
            Objects.equals(this.lineNum, queryLTSLogParams.lineNum) &&
            Objects.equals(this.isDesc, queryLTSLogParams.isDesc) &&
            Objects.equals(this.searchType, queryLTSLogParams.searchType) &&
            Objects.equals(this.limit, queryLTSLogParams.limit);
    }
    @Override
    public int hashCode() {
        return Objects.hash(startTime, endTime, labels, keywords, lineNum, isDesc, searchType, limit);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryLTSLogParams {\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
        sb.append("    lineNum: ").append(toIndentedString(lineNum)).append("\n");
        sb.append("    isDesc: ").append(toIndentedString(isDesc)).append("\n");
        sb.append("    searchType: ").append(toIndentedString(searchType)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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

