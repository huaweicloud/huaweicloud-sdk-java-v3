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
 * ListLtsSlowLogsRequestBody
 */
public class ListLtsSlowLogsRequestBody {

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
     * 语句类型，取空值，表示查询所有语句类型。
     */
    public static final class OperateTypeEnum {

        /**
         * Enum INSERT for value: "insert"
         */
        public static final OperateTypeEnum INSERT = new OperateTypeEnum("insert");

        /**
         * Enum QUERY for value: "query"
         */
        public static final OperateTypeEnum QUERY = new OperateTypeEnum("query");

        /**
         * Enum UPDATE for value: "update"
         */
        public static final OperateTypeEnum UPDATE = new OperateTypeEnum("update");

        /**
         * Enum REMOVE for value: "remove"
         */
        public static final OperateTypeEnum REMOVE = new OperateTypeEnum("remove");

        /**
         * Enum GETMORE for value: "getmore"
         */
        public static final OperateTypeEnum GETMORE = new OperateTypeEnum("getmore");

        /**
         * Enum COMMAND for value: "command"
         */
        public static final OperateTypeEnum COMMAND = new OperateTypeEnum("command");

        /**
         * Enum KILLCURSORS for value: "killcursors"
         */
        public static final OperateTypeEnum KILLCURSORS = new OperateTypeEnum("killcursors");

        private static final Map<String, OperateTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OperateTypeEnum> createStaticFields() {
            Map<String, OperateTypeEnum> map = new HashMap<>();
            map.put("insert", INSERT);
            map.put("query", QUERY);
            map.put("update", UPDATE);
            map.put("remove", REMOVE);
            map.put("getmore", GETMORE);
            map.put("command", COMMAND);
            map.put("killcursors", KILLCURSORS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OperateTypeEnum(String value) {
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
        public static OperateTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OperateTypeEnum(value));
        }

        public static OperateTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OperateTypeEnum) {
                return this.value.equals(((OperateTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operate_type")

    private OperateTypeEnum operateType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keywords")

    private List<String> keywords = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_keywords")

    private List<String> databaseKeywords = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collection_keywords")

    private List<String> collectionKeywords = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_cost_time")

    private Integer maxCostTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_cost_time")

    private Integer minCostTime;

    public ListLtsSlowLogsRequestBody withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间，格式为“yyyy-mm-ddThh:mm:ssZ”。 其中，T指某个时间的开始；Z指时区偏移量，例如北京时间偏移显示为+0800。 **注意：** 开始时间不得早于当前时间30天。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ListLtsSlowLogsRequestBody withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间，格式为“yyyy-mm-ddThh:mm:ssZ”。 其中，T指某个时间的开始；Z指时区偏移量，例如北京时间偏移显示为+0800。 **说明：** 结束时间不能晚于当前时间。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ListLtsSlowLogsRequestBody withLimit(Integer limit) {
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

    public ListLtsSlowLogsRequestBody withLineNum(String lineNum) {
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

    public ListLtsSlowLogsRequestBody withOperateType(OperateTypeEnum operateType) {
        this.operateType = operateType;
        return this;
    }

    /**
     * 语句类型，取空值，表示查询所有语句类型。
     * @return operateType
     */
    public OperateTypeEnum getOperateType() {
        return operateType;
    }

    public void setOperateType(OperateTypeEnum operateType) {
        this.operateType = operateType;
    }

    public ListLtsSlowLogsRequestBody withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * 节点ID，取空值，表示查询实例下所有允许查询的节点。 使用请参考《DDS API参考》的“查询实例列表和详情”响应消息表“nodes 数据结构说明”的“id”。 允许查询的节点如下： - 集群实例下面的 shard节点 - 副本集、单节点实例下面的所有节点
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public ListLtsSlowLogsRequestBody withKeywords(List<String> keywords) {
        this.keywords = keywords;
        return this;
    }

    public ListLtsSlowLogsRequestBody addKeywordsItem(String keywordsItem) {
        if (this.keywords == null) {
            this.keywords = new ArrayList<>();
        }
        this.keywords.add(keywordsItem);
        return this;
    }

    public ListLtsSlowLogsRequestBody withKeywords(Consumer<List<String>> keywordsSetter) {
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

    public ListLtsSlowLogsRequestBody withDatabaseKeywords(List<String> databaseKeywords) {
        this.databaseKeywords = databaseKeywords;
        return this;
    }

    public ListLtsSlowLogsRequestBody addDatabaseKeywordsItem(String databaseKeywordsItem) {
        if (this.databaseKeywords == null) {
            this.databaseKeywords = new ArrayList<>();
        }
        this.databaseKeywords.add(databaseKeywordsItem);
        return this;
    }

    public ListLtsSlowLogsRequestBody withDatabaseKeywords(Consumer<List<String>> databaseKeywordsSetter) {
        if (this.databaseKeywords == null) {
            this.databaseKeywords = new ArrayList<>();
        }
        databaseKeywordsSetter.accept(this.databaseKeywords);
        return this;
    }

    /**
     * 根据多个数据库表名关键字模糊搜索日志，表示匹配至少一个关键字。 - 只支持关键字前缀模糊搜索，最多支持10个关键字。 - 每个关键字最大长度不超过64个字符。
     * @return databaseKeywords
     */
    public List<String> getDatabaseKeywords() {
        return databaseKeywords;
    }

    public void setDatabaseKeywords(List<String> databaseKeywords) {
        this.databaseKeywords = databaseKeywords;
    }

    public ListLtsSlowLogsRequestBody withCollectionKeywords(List<String> collectionKeywords) {
        this.collectionKeywords = collectionKeywords;
        return this;
    }

    public ListLtsSlowLogsRequestBody addCollectionKeywordsItem(String collectionKeywordsItem) {
        if (this.collectionKeywords == null) {
            this.collectionKeywords = new ArrayList<>();
        }
        this.collectionKeywords.add(collectionKeywordsItem);
        return this;
    }

    public ListLtsSlowLogsRequestBody withCollectionKeywords(Consumer<List<String>> collectionKeywordsSetter) {
        if (this.collectionKeywords == null) {
            this.collectionKeywords = new ArrayList<>();
        }
        collectionKeywordsSetter.accept(this.collectionKeywords);
        return this;
    }

    /**
     * 根据多个数据库表名关键字模糊搜索日志，表示匹配至少一个关键字。 - 只支持关键字前缀模糊搜索，最多支持10个关键字。 - 每个关键字最大长度不超过128个字符。
     * @return collectionKeywords
     */
    public List<String> getCollectionKeywords() {
        return collectionKeywords;
    }

    public void setCollectionKeywords(List<String> collectionKeywords) {
        this.collectionKeywords = collectionKeywords;
    }

    public ListLtsSlowLogsRequestBody withMaxCostTime(Integer maxCostTime) {
        this.maxCostTime = maxCostTime;
        return this;
    }

    /**
     * 支持根据最大执行时间范围查找日志。 单位：ms
     * @return maxCostTime
     */
    public Integer getMaxCostTime() {
        return maxCostTime;
    }

    public void setMaxCostTime(Integer maxCostTime) {
        this.maxCostTime = maxCostTime;
    }

    public ListLtsSlowLogsRequestBody withMinCostTime(Integer minCostTime) {
        this.minCostTime = minCostTime;
        return this;
    }

    /**
     * 支持根据最小执行时间范围查找日志。 单位：ms
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
        ListLtsSlowLogsRequestBody that = (ListLtsSlowLogsRequestBody) obj;
        return Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.lineNum, that.lineNum)
            && Objects.equals(this.operateType, that.operateType) && Objects.equals(this.nodeId, that.nodeId)
            && Objects.equals(this.keywords, that.keywords)
            && Objects.equals(this.databaseKeywords, that.databaseKeywords)
            && Objects.equals(this.collectionKeywords, that.collectionKeywords)
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
            databaseKeywords,
            collectionKeywords,
            maxCostTime,
            minCostTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLtsSlowLogsRequestBody {\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    lineNum: ").append(toIndentedString(lineNum)).append("\n");
        sb.append("    operateType: ").append(toIndentedString(operateType)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
        sb.append("    databaseKeywords: ").append(toIndentedString(databaseKeywords)).append("\n");
        sb.append("    collectionKeywords: ").append(toIndentedString(collectionKeywords)).append("\n");
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
