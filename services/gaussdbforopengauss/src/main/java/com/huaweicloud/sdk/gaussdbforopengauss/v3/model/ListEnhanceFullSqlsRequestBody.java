package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

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
 * 查询全量SQL列表请求体
 */
public class ListEnhanceFullSqlsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "begin_time")

    private String beginTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "query")

    private String query;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_id")

    private String sqlId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_exec_id")

    private String sqlExecId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transaction_id")

    private String transactionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trace_id")

    private String traceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_name")

    private String dbName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema_name")

    private String schemaName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "username")

    private String username;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_addr")

    private String clientAddr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_port")

    private String clientPort;

    /**
     * **参数解释**: 排序字段。 **约束限制**: 不涉及。 **取值范围**: - begin_time：起始时间。  **默认取值**: begin_time
     */
    public static final class OrderByEnum {

        /**
         * Enum BEGIN_TIME for value: "begin_time"
         */
        public static final OrderByEnum BEGIN_TIME = new OrderByEnum("begin_time");

        private static final Map<String, OrderByEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OrderByEnum> createStaticFields() {
            Map<String, OrderByEnum> map = new HashMap<>();
            map.put("begin_time", BEGIN_TIME);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OrderByEnum(String value) {
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
        public static OrderByEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OrderByEnum(value));
        }

        public static OrderByEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OrderByEnum) {
                return this.value.equals(((OrderByEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_by")

    private OrderByEnum orderBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_slow_sql")

    private Boolean isSlowSql;

    /**
     * **参数解释**: 排序方式，支持升序和降序。 **约束限制**: 不涉及。 **取值范围**: - DESC：降序。 - ASC：升序。  **默认取值**: DESC
     */
    public static final class OrderEnum {

        /**
         * Enum ASC for value: "ASC"
         */
        public static final OrderEnum ASC = new OrderEnum("ASC");

        /**
         * Enum DESC for value: "DESC"
         */
        public static final OrderEnum DESC = new OrderEnum("DESC");

        private static final Map<String, OrderEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OrderEnum> createStaticFields() {
            Map<String, OrderEnum> map = new HashMap<>();
            map.put("ASC", ASC);
            map.put("DESC", DESC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OrderEnum(String value) {
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
        public static OrderEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OrderEnum(value));
        }

        public static OrderEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OrderEnum) {
                return this.value.equals(((OrderEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order")

    private OrderEnum order;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "multi_queries")

    private List<MultiQueryConditionOption> multiQueries = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_conditions")

    private List<CompareConditionOption> compareConditions = null;

    public ListEnhanceFullSqlsRequestBody withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**: 最大查询记录数。例如该参数设定为10，则查询结果最多只显示10条记录。 **约束限制**: 对于公有云25.5.0.1及以上版本，此参数弃用，请勿传值。通过系统系统参数控制最大返回记录数量，默认为200。 **取值范围**: [1, 1000] **默认取值**: 默认为10。
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListEnhanceFullSqlsRequestBody withBeginTime(String beginTime) {
        this.beginTime = beginTime;
        return this;
    }

    /**
     * **参数解释**: 查询开始时间。 **约束限制**: ISO 8601 UTC格式。模式为“yyyy-mm-ddThh:mm:ssZ”。其中，T指某个时间的开始；Z指时区偏移量。 时区中的+号需要进行URL编码，编码为%2B，时区中的-号无需编码。 例如：北京时间偏移显示为+0800，begin_time=2024-03-15T17:20:33+0800，传参时编码为begin_time=2024-03-15T17:20:33%2B0800。 **取值范围**: 时间区间（begin_time ~ end_time）不能超过30天。 **默认取值**: 不涉及。
     * @return beginTime
     */
    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public ListEnhanceFullSqlsRequestBody withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释**: 查询结束时间。 **约束限制**: ISO 8601 UTC格式。模式为“yyyy-mm-ddThh:mm:ssZ”。其中，T指某个时间的开始；Z指时区偏移量。 时区中的+号需要进行URL编码，编码为%2B，时区中的-号无需编码。 例如：北京时间偏移显示为+0800，end_time=2024-03-16T17:20:33+0800，传参时编码为end_time=2024-03-16T17:20:33%2B0800。 **取值范围**: 时间区间（begin_time ~ end_time）不能超过30天。 **默认取值**: 不涉及。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ListEnhanceFullSqlsRequestBody withQuery(String query) {
        this.query = query;
        return this;
    }

    /**
     * **参数解释**: SQL文本。 **约束限制**: 不涉及。 **取值范围**: 长度1-4096。 **默认取值**: 不涉及。
     * @return query
     */
    public String getQuery() {
        return query;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public ListEnhanceFullSqlsRequestBody withSqlId(String sqlId) {
        this.sqlId = sqlId;
        return this;
    }

    /**
     * **参数解释**: 归一化SQL ID。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 不涉及。
     * @return sqlId
     */
    public String getSqlId() {
        return sqlId;
    }

    public void setSqlId(String sqlId) {
        this.sqlId = sqlId;
    }

    public ListEnhanceFullSqlsRequestBody withSqlExecId(String sqlExecId) {
        this.sqlExecId = sqlExecId;
        return this;
    }

    /**
     * **参数解释**: 唯一SQL ID。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 不涉及。
     * @return sqlExecId
     */
    public String getSqlExecId() {
        return sqlExecId;
    }

    public void setSqlExecId(String sqlExecId) {
        this.sqlExecId = sqlExecId;
    }

    public ListEnhanceFullSqlsRequestBody withTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }

    /**
     * **参数解释**: 事务ID。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 不涉及。
     * @return transactionId
     */
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public ListEnhanceFullSqlsRequestBody withTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }

    /**
     * **参数解释**: 链路ID。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 不涉及。
     * @return traceId
     */
    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public ListEnhanceFullSqlsRequestBody withDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }

    /**
     * **参数解释**: 数据库名称。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 不涉及。
     * @return dbName
     */
    public String getDbName() {
        return dbName;
    }

    public void setDbName(String dbName) {
        this.dbName = dbName;
    }

    public ListEnhanceFullSqlsRequestBody withSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    /**
     * **参数解释**: schema名称。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 不涉及。
     * @return schemaName
     */
    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    public ListEnhanceFullSqlsRequestBody withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * **参数解释**: 用户名称。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 不涉及。
     * @return username
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public ListEnhanceFullSqlsRequestBody withClientAddr(String clientAddr) {
        this.clientAddr = clientAddr;
        return this;
    }

    /**
     * **参数解释**: 客户端地址。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 不涉及。
     * @return clientAddr
     */
    public String getClientAddr() {
        return clientAddr;
    }

    public void setClientAddr(String clientAddr) {
        this.clientAddr = clientAddr;
    }

    public ListEnhanceFullSqlsRequestBody withClientPort(String clientPort) {
        this.clientPort = clientPort;
        return this;
    }

    /**
     * **参数解释**: 客户端端口。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 不涉及。
     * @return clientPort
     */
    public String getClientPort() {
        return clientPort;
    }

    public void setClientPort(String clientPort) {
        this.clientPort = clientPort;
    }

    public ListEnhanceFullSqlsRequestBody withOrderBy(OrderByEnum orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    /**
     * **参数解释**: 排序字段。 **约束限制**: 不涉及。 **取值范围**: - begin_time：起始时间。  **默认取值**: begin_time
     * @return orderBy
     */
    public OrderByEnum getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(OrderByEnum orderBy) {
        this.orderBy = orderBy;
    }

    public ListEnhanceFullSqlsRequestBody withIsSlowSql(Boolean isSlowSql) {
        this.isSlowSql = isSlowSql;
        return this;
    }

    /**
     * **参数解释**: 是否为慢SQL。 **约束限制**: 不涉及。 **取值范围**: - true：是慢SQL。 - false：不是慢SQL。  **默认取值**: 不涉及。
     * @return isSlowSql
     */
    public Boolean getIsSlowSql() {
        return isSlowSql;
    }

    public void setIsSlowSql(Boolean isSlowSql) {
        this.isSlowSql = isSlowSql;
    }

    public ListEnhanceFullSqlsRequestBody withOrder(OrderEnum order) {
        this.order = order;
        return this;
    }

    /**
     * **参数解释**: 排序方式，支持升序和降序。 **约束限制**: 不涉及。 **取值范围**: - DESC：降序。 - ASC：升序。  **默认取值**: DESC
     * @return order
     */
    public OrderEnum getOrder() {
        return order;
    }

    public void setOrder(OrderEnum order) {
        this.order = order;
    }

    public ListEnhanceFullSqlsRequestBody withMultiQueries(List<MultiQueryConditionOption> multiQueries) {
        this.multiQueries = multiQueries;
        return this;
    }

    public ListEnhanceFullSqlsRequestBody addMultiQueriesItem(MultiQueryConditionOption multiQueriesItem) {
        if (this.multiQueries == null) {
            this.multiQueries = new ArrayList<>();
        }
        this.multiQueries.add(multiQueriesItem);
        return this;
    }

    public ListEnhanceFullSqlsRequestBody withMultiQueries(
        Consumer<List<MultiQueryConditionOption>> multiQueriesSetter) {
        if (this.multiQueries == null) {
            this.multiQueries = new ArrayList<>();
        }
        multiQueriesSetter.accept(this.multiQueries);
        return this;
    }

    /**
     * **参数解释**: 字段汇聚查询条件列表。默认取值为[]。 **约束限制**: 不涉及。
     * @return multiQueries
     */
    public List<MultiQueryConditionOption> getMultiQueries() {
        return multiQueries;
    }

    public void setMultiQueries(List<MultiQueryConditionOption> multiQueries) {
        this.multiQueries = multiQueries;
    }

    public ListEnhanceFullSqlsRequestBody withCompareConditions(List<CompareConditionOption> compareConditions) {
        this.compareConditions = compareConditions;
        return this;
    }

    public ListEnhanceFullSqlsRequestBody addCompareConditionsItem(CompareConditionOption compareConditionsItem) {
        if (this.compareConditions == null) {
            this.compareConditions = new ArrayList<>();
        }
        this.compareConditions.add(compareConditionsItem);
        return this;
    }

    public ListEnhanceFullSqlsRequestBody withCompareConditions(
        Consumer<List<CompareConditionOption>> compareConditionsSetter) {
        if (this.compareConditions == null) {
            this.compareConditions = new ArrayList<>();
        }
        compareConditionsSetter.accept(this.compareConditions);
        return this;
    }

    /**
     * **参数解释**: 组合比较查询条件，可针对某个给定过滤字段，进行区间范围、大小、小于等条件合并查询。默认取值为[]。 **约束限制**: 不涉及。
     * @return compareConditions
     */
    public List<CompareConditionOption> getCompareConditions() {
        return compareConditions;
    }

    public void setCompareConditions(List<CompareConditionOption> compareConditions) {
        this.compareConditions = compareConditions;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListEnhanceFullSqlsRequestBody that = (ListEnhanceFullSqlsRequestBody) obj;
        return Objects.equals(this.limit, that.limit) && Objects.equals(this.beginTime, that.beginTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.query, that.query)
            && Objects.equals(this.sqlId, that.sqlId) && Objects.equals(this.sqlExecId, that.sqlExecId)
            && Objects.equals(this.transactionId, that.transactionId) && Objects.equals(this.traceId, that.traceId)
            && Objects.equals(this.dbName, that.dbName) && Objects.equals(this.schemaName, that.schemaName)
            && Objects.equals(this.username, that.username) && Objects.equals(this.clientAddr, that.clientAddr)
            && Objects.equals(this.clientPort, that.clientPort) && Objects.equals(this.orderBy, that.orderBy)
            && Objects.equals(this.isSlowSql, that.isSlowSql) && Objects.equals(this.order, that.order)
            && Objects.equals(this.multiQueries, that.multiQueries)
            && Objects.equals(this.compareConditions, that.compareConditions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit,
            beginTime,
            endTime,
            query,
            sqlId,
            sqlExecId,
            transactionId,
            traceId,
            dbName,
            schemaName,
            username,
            clientAddr,
            clientPort,
            orderBy,
            isSlowSql,
            order,
            multiQueries,
            compareConditions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEnhanceFullSqlsRequestBody {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    beginTime: ").append(toIndentedString(beginTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    query: ").append(toIndentedString(query)).append("\n");
        sb.append("    sqlId: ").append(toIndentedString(sqlId)).append("\n");
        sb.append("    sqlExecId: ").append(toIndentedString(sqlExecId)).append("\n");
        sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
        sb.append("    traceId: ").append(toIndentedString(traceId)).append("\n");
        sb.append("    dbName: ").append(toIndentedString(dbName)).append("\n");
        sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    clientAddr: ").append(toIndentedString(clientAddr)).append("\n");
        sb.append("    clientPort: ").append(toIndentedString(clientPort)).append("\n");
        sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
        sb.append("    isSlowSql: ").append(toIndentedString(isSlowSql)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("    multiQueries: ").append(toIndentedString(multiQueries)).append("\n");
        sb.append("    compareConditions: ").append(toIndentedString(compareConditions)).append("\n");
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
