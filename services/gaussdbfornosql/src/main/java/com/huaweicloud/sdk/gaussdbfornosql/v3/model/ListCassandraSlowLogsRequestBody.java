package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListCassandraSlowLogsRequestBody
 */
public class ListCassandraSlowLogsRequestBody {

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_type")

    private String operateType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keywords")

    private List<String> keywords = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keyspace_keywords")

    private List<String> keyspaceKeywords = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_keywords")

    private List<String> tableKeywords = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_cost_time")

    private Integer maxCostTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_cost_time")

    private Integer minCostTime;

    public ListCassandraSlowLogsRequestBody withStartTime(String startTime) {
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

    public ListCassandraSlowLogsRequestBody withEndTime(String endTime) {
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

    public ListCassandraSlowLogsRequestBody withLimit(Integer limit) {
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

    public ListCassandraSlowLogsRequestBody withLineNum(String lineNum) {
        this.lineNum = lineNum;
        return this;
    }

    /**
     * 日志单行序列号，第一次查询时不需要此参数，下一次查询时需要使用，可从上一次查询的返回信息中获取。 说明：当次查询从line_num的下一条日志开始查询，不包含当前line_num日志。
     * @return lineNum
     */
    public String getLineNum() {
        return lineNum;
    }

    public void setLineNum(String lineNum) {
        this.lineNum = lineNum;
    }

    public ListCassandraSlowLogsRequestBody withOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }

    /**
     * 语句类型，取空值，表示查询所有语句类型。 取值：select
     * @return operateType
     */
    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }

    public ListCassandraSlowLogsRequestBody withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 节点ID，取空值，表示查询实例下所有允许查询的节点。 具体取值请参考查询实例列表和详情接口\"ListInstances\"中nodes字段数据结构说明的“id”。
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public ListCassandraSlowLogsRequestBody withKeywords(List<String> keywords) {
        this.keywords = keywords;
        return this;
    }

    public ListCassandraSlowLogsRequestBody addKeywordsItem(String keywordsItem) {
        if (this.keywords == null) {
            this.keywords = new ArrayList<>();
        }
        this.keywords.add(keywordsItem);
        return this;
    }

    public ListCassandraSlowLogsRequestBody withKeywords(Consumer<List<String>> keywordsSetter) {
        if (this.keywords == null) {
            this.keywords = new ArrayList<>();
        }
        keywordsSetter.accept(this.keywords);
        return this;
    }

    /**
     * 根据多个关键字搜索日志全文，表示同时匹配所有关键字。 - 最多支持10个关键字。 - 每个关键字最大长度不超过512个字符。
     * @return keywords
     */
    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    public ListCassandraSlowLogsRequestBody withKeyspaceKeywords(List<String> keyspaceKeywords) {
        this.keyspaceKeywords = keyspaceKeywords;
        return this;
    }

    public ListCassandraSlowLogsRequestBody addKeyspaceKeywordsItem(String keyspaceKeywordsItem) {
        if (this.keyspaceKeywords == null) {
            this.keyspaceKeywords = new ArrayList<>();
        }
        this.keyspaceKeywords.add(keyspaceKeywordsItem);
        return this;
    }

    public ListCassandraSlowLogsRequestBody withKeyspaceKeywords(Consumer<List<String>> keyspaceKeywordsSetter) {
        if (this.keyspaceKeywords == null) {
            this.keyspaceKeywords = new ArrayList<>();
        }
        keyspaceKeywordsSetter.accept(this.keyspaceKeywords);
        return this;
    }

    /**
     * 根据多个键空间关键字模糊搜索日志，表示匹配至少一个关键字。 - 只支持关键字前缀模糊搜索，最多支持10个关键字。 - 每个关键字最大长度不超过48个字符。
     * @return keyspaceKeywords
     */
    public List<String> getKeyspaceKeywords() {
        return keyspaceKeywords;
    }

    public void setKeyspaceKeywords(List<String> keyspaceKeywords) {
        this.keyspaceKeywords = keyspaceKeywords;
    }

    public ListCassandraSlowLogsRequestBody withTableKeywords(List<String> tableKeywords) {
        this.tableKeywords = tableKeywords;
        return this;
    }

    public ListCassandraSlowLogsRequestBody addTableKeywordsItem(String tableKeywordsItem) {
        if (this.tableKeywords == null) {
            this.tableKeywords = new ArrayList<>();
        }
        this.tableKeywords.add(tableKeywordsItem);
        return this;
    }

    public ListCassandraSlowLogsRequestBody withTableKeywords(Consumer<List<String>> tableKeywordsSetter) {
        if (this.tableKeywords == null) {
            this.tableKeywords = new ArrayList<>();
        }
        tableKeywordsSetter.accept(this.tableKeywords);
        return this;
    }

    /**
     * 根据多个数据库表名关键字模糊搜索日志，表示匹配至少一个关键字。 - 只支持关键字前缀模糊搜索，最多支持10个关键字。 - 每个关键字最大长度不超过48个字符。
     * @return tableKeywords
     */
    public List<String> getTableKeywords() {
        return tableKeywords;
    }

    public void setTableKeywords(List<String> tableKeywords) {
        this.tableKeywords = tableKeywords;
    }

    public ListCassandraSlowLogsRequestBody withMaxCostTime(Integer maxCostTime) {
        this.maxCostTime = maxCostTime;
        return this;
    }

    /**
     * 支持根据最大执行时间范围查找日志。单位：ms
     * @return maxCostTime
     */
    public Integer getMaxCostTime() {
        return maxCostTime;
    }

    public void setMaxCostTime(Integer maxCostTime) {
        this.maxCostTime = maxCostTime;
    }

    public ListCassandraSlowLogsRequestBody withMinCostTime(Integer minCostTime) {
        this.minCostTime = minCostTime;
        return this;
    }

    /**
     * 支持根据最小执行时间范围查找日志。单位：ms
     * @return minCostTime
     */
    public Integer getMinCostTime() {
        return minCostTime;
    }

    public void setMinCostTime(Integer minCostTime) {
        this.minCostTime = minCostTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCassandraSlowLogsRequestBody that = (ListCassandraSlowLogsRequestBody) obj;
        return Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.lineNum, that.lineNum)
            && Objects.equals(this.operateType, that.operateType) && Objects.equals(this.nodeId, that.nodeId)
            && Objects.equals(this.keywords, that.keywords)
            && Objects.equals(this.keyspaceKeywords, that.keyspaceKeywords)
            && Objects.equals(this.tableKeywords, that.tableKeywords)
            && Objects.equals(this.maxCostTime, that.maxCostTime) && Objects.equals(this.minCostTime, that.minCostTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime,
            endTime,
            limit,
            lineNum,
            operateType,
            nodeId,
            keywords,
            keyspaceKeywords,
            tableKeywords,
            maxCostTime,
            minCostTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCassandraSlowLogsRequestBody {\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    lineNum: ").append(toIndentedString(lineNum)).append("\n");
        sb.append("    operateType: ").append(toIndentedString(operateType)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
        sb.append("    keyspaceKeywords: ").append(toIndentedString(keyspaceKeywords)).append("\n");
        sb.append("    tableKeywords: ").append(toIndentedString(tableKeywords)).append("\n");
        sb.append("    maxCostTime: ").append(toIndentedString(maxCostTime)).append("\n");
        sb.append("    minCostTime: ").append(toIndentedString(minCostTime)).append("\n");
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
