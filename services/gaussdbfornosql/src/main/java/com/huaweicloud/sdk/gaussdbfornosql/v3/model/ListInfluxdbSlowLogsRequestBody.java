package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 查询Influxdb慢日志请求体
 */
public class ListInfluxdbSlowLogsRequestBody {

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

    private String keywords;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_cost_time")

    private Integer maxCostTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_cost_time")

    private Integer minCostTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database")

    private String database;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "retention_policy")

    private String retentionPolicy;

    public ListInfluxdbSlowLogsRequestBody withStartTime(String startTime) {
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

    public ListInfluxdbSlowLogsRequestBody withEndTime(String endTime) {
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

    public ListInfluxdbSlowLogsRequestBody withLimit(Integer limit) {
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

    public ListInfluxdbSlowLogsRequestBody withLineNum(String lineNum) {
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

    public ListInfluxdbSlowLogsRequestBody withOperateType(String operateType) {
        this.operateType = operateType;
        return this;
    }

    /**
     * 语句类型，取空值，表示查询所有语句类型。 可取值：SELECT、DELETE 、SHOW 、DROP 、CREATE 、ALTER
     * @return operateType
     */
    public String getOperateType() {
        return operateType;
    }

    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }

    public ListInfluxdbSlowLogsRequestBody withNodeId(String nodeId) {
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

    public ListInfluxdbSlowLogsRequestBody withKeywords(String keywords) {
        this.keywords = keywords;
        return this;
    }

    /**
     * 根据多个关键字搜索日志全文，表示同时匹配所有关键字。 - 最多支持10个关键字。 - 每个关键字最大长度不超过512个字符。
     * @return keywords
     */
    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public ListInfluxdbSlowLogsRequestBody withMaxCostTime(Integer maxCostTime) {
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

    public ListInfluxdbSlowLogsRequestBody withMinCostTime(Integer minCostTime) {
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

    public ListInfluxdbSlowLogsRequestBody withDatabase(String database) {
        this.database = database;
        return this;
    }

    /**
     * 数据库名称。
     * @return database
     */
    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public ListInfluxdbSlowLogsRequestBody withRetentionPolicy(String retentionPolicy) {
        this.retentionPolicy = retentionPolicy;
        return this;
    }

    /**
     * 保留策略。
     * @return retentionPolicy
     */
    public String getRetentionPolicy() {
        return retentionPolicy;
    }

    public void setRetentionPolicy(String retentionPolicy) {
        this.retentionPolicy = retentionPolicy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInfluxdbSlowLogsRequestBody that = (ListInfluxdbSlowLogsRequestBody) obj;
        return Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.lineNum, that.lineNum)
            && Objects.equals(this.operateType, that.operateType) && Objects.equals(this.nodeId, that.nodeId)
            && Objects.equals(this.keywords, that.keywords) && Objects.equals(this.maxCostTime, that.maxCostTime)
            && Objects.equals(this.minCostTime, that.minCostTime) && Objects.equals(this.database, that.database)
            && Objects.equals(this.retentionPolicy, that.retentionPolicy);
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
            maxCostTime,
            minCostTime,
            database,
            retentionPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInfluxdbSlowLogsRequestBody {\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    lineNum: ").append(toIndentedString(lineNum)).append("\n");
        sb.append("    operateType: ").append(toIndentedString(operateType)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
        sb.append("    maxCostTime: ").append(toIndentedString(maxCostTime)).append("\n");
        sb.append("    minCostTime: ").append(toIndentedString(minCostTime)).append("\n");
        sb.append("    database: ").append(toIndentedString(database)).append("\n");
        sb.append("    retentionPolicy: ").append(toIndentedString(retentionPolicy)).append("\n");
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
