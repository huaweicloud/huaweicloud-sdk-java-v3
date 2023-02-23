package com.huaweicloud.sdk.aom.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.aom.v2.model.SearchKey;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * QueryBodyParam
 */
@JacksonXmlRootElement(localName = "QueryBodyParam")
public class QueryBodyParam  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="category")
    
    @JacksonXmlProperty(localName = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="endTime")
    
    @JacksonXmlProperty(localName = "endTime")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="hideSyslog")
    
    @JacksonXmlProperty(localName = "hideSyslog")

    private Integer hideSyslog;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="keyWord")
    
    @JacksonXmlProperty(localName = "keyWord")

    private String keyWord;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="lineNum")
    
    @JacksonXmlProperty(localName = "lineNum")

    private String lineNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="pageSize/size")
    
    @JacksonXmlProperty(localName = "pageSize/size")

    private String pageSizeSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="searchKey")
    
    @JacksonXmlProperty(localName = "searchKey")

    private SearchKey searchKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="startTime")
    
    @JacksonXmlProperty(localName = "startTime")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    @JacksonXmlProperty(localName = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="isDesc")
    
    @JacksonXmlProperty(localName = "isDesc")

    private Boolean isDesc;

    public QueryBodyParam withCategory(String category) {
        this.category = category;
        return this;
    }

    


    /**
     * 取值范围 app_log,node _log,custom_log 日志类型字段:app_log:应用日志 node_log:主机日志 custom_log:自定义配置路径日志。
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    

    public QueryBodyParam withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    


    /**
     * 搜索结束时间(UTC时间，毫秒级)。
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    

    public QueryBodyParam withHideSyslog(Integer hideSyslog) {
        this.hideSyslog = hideSyslog;
        return this;
    }

    


    /**
     * 取值范围 0、1 。搜索时是否隐藏系统日志，默认0为隐藏1为显示。
     * @return hideSyslog
     */
    public Integer getHideSyslog() {
        return hideSyslog;
    }

    public void setHideSyslog(Integer hideSyslog) {
        this.hideSyslog = hideSyslog;
    }

    

    public QueryBodyParam withKeyWord(String keyWord) {
        this.keyWord = keyWord;
        return this;
    }

    


    /**
     * 1.支持关键词精确搜索。关键词指相邻两个分词符之间的单词。 2.支持关键词模糊匹配搜索，例如输入“RROR”或“ERRO?”或“*ROR*”或“ERR*”或“ER*OR”。 3.支持短语精确搜索，例如输入“Start to refresh alm Statistic”。 4.支持关键词的“与”、“或”组合搜索。格式为“query&&logs”或“query||logs”。 说明： 当前默认分词符有  , '\";=()[]{}@&<>/:\\n\\t\\r
     * @return keyWord
     */
    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    

    public QueryBodyParam withLineNum(String lineNum) {
        this.lineNum = lineNum;
        return this;
    }

    


    /**
     * 日志单行序列号第一次查询时不需要此参数，后续分页查询时需要使用可从上次查询的返回信息中获取.
     * @return lineNum
     */
    public String getLineNum() {
        return lineNum;
    }

    public void setLineNum(String lineNum) {
        this.lineNum = lineNum;
    }

    

    public QueryBodyParam withPageSizeSize(String pageSizeSize) {
        this.pageSizeSize = pageSizeSize;
        return this;
    }

    


    /**
     * 表示每次查询的日志条数不填时默认为5000，建议您设置为100。 第一次查询时使用pageSize 后续分页查询时使用size。
     * @return pageSizeSize
     */
    public String getPageSizeSize() {
        return pageSizeSize;
    }

    public void setPageSizeSize(String pageSizeSize) {
        this.pageSizeSize = pageSizeSize;
    }

    

    public QueryBodyParam withSearchKey(SearchKey searchKey) {
        this.searchKey = searchKey;
        return this;
    }

    public QueryBodyParam withSearchKey(Consumer<SearchKey> searchKeySetter) {
        if(this.searchKey == null ){
            this.searchKey = new SearchKey();
            searchKeySetter.accept(this.searchKey);
        }
        
        return this;
    }


    /**
     * Get searchKey
     * @return searchKey
     */
    public SearchKey getSearchKey() {
        return searchKey;
    }

    public void setSearchKey(SearchKey searchKey) {
        this.searchKey = searchKey;
    }

    

    public QueryBodyParam withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    


    /**
     * 搜索起始时间(UTC时间，毫秒级)。
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    

    public QueryBodyParam withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 表示此次查询为分页查询，第一次查询时不需要此参数，后续分页查询时需要使用。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    public QueryBodyParam withIsDesc(Boolean isDesc) {
        this.isDesc = isDesc;
        return this;
    }

    


    /**
     * 标识按照lineNum升序查询还是降序查询。  true：降序（lineNum由大到小：时间从新到老）。  false：升序（lineNum由小到大：即时间从老到新）。
     * @return isDesc
     */
    public Boolean getIsDesc() {
        return isDesc;
    }

    public void setIsDesc(Boolean isDesc) {
        this.isDesc = isDesc;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryBodyParam queryBodyParam = (QueryBodyParam) o;
        return Objects.equals(this.category, queryBodyParam.category) &&
            Objects.equals(this.endTime, queryBodyParam.endTime) &&
            Objects.equals(this.hideSyslog, queryBodyParam.hideSyslog) &&
            Objects.equals(this.keyWord, queryBodyParam.keyWord) &&
            Objects.equals(this.lineNum, queryBodyParam.lineNum) &&
            Objects.equals(this.pageSizeSize, queryBodyParam.pageSizeSize) &&
            Objects.equals(this.searchKey, queryBodyParam.searchKey) &&
            Objects.equals(this.startTime, queryBodyParam.startTime) &&
            Objects.equals(this.type, queryBodyParam.type) &&
            Objects.equals(this.isDesc, queryBodyParam.isDesc);
    }
    @Override
    public int hashCode() {
        return Objects.hash(category, endTime, hideSyslog, keyWord, lineNum, pageSizeSize, searchKey, startTime, type, isDesc);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryBodyParam {\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    hideSyslog: ").append(toIndentedString(hideSyslog)).append("\n");
        sb.append("    keyWord: ").append(toIndentedString(keyWord)).append("\n");
        sb.append("    lineNum: ").append(toIndentedString(lineNum)).append("\n");
        sb.append("    pageSizeSize: ").append(toIndentedString(pageSizeSize)).append("\n");
        sb.append("    searchKey: ").append(toIndentedString(searchKey)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    isDesc: ").append(toIndentedString(isDesc)).append("\n");
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

