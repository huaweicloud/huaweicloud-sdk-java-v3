package com.huaweicloud.sdk.dataartsstudio.v1.model;

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
 * DatasourceConfig
 */
public class DatasourceConfig {

    /**
     * 数据源的类型
     */
    public static final class TypeEnum {

        /**
         * Enum MYSQL for value: "MYSQL"
         */
        public static final TypeEnum MYSQL = new TypeEnum("MYSQL");

        /**
         * Enum DLI for value: "DLI"
         */
        public static final TypeEnum DLI = new TypeEnum("DLI");

        /**
         * Enum DWS for value: "DWS"
         */
        public static final TypeEnum DWS = new TypeEnum("DWS");

        /**
         * Enum HIVE for value: "HIVE"
         */
        public static final TypeEnum HIVE = new TypeEnum("HIVE");

        /**
         * Enum HBASE for value: "HBASE"
         */
        public static final TypeEnum HBASE = new TypeEnum("HBASE");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("MYSQL", MYSQL);
            map.put("DLI", DLI);
            map.put("DWS", DWS);
            map.put("HIVE", HIVE);
            map.put("HBASE", HBASE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_name")

    private String connectionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_id")

    private String connectionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database")

    private String database;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datatable")

    private String datatable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_id")

    private String tableId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue")

    private String queue;

    /**
     * 取数方式
     */
    public static final class AccessTypeEnum {

        /**
         * Enum SCRIPT for value: "SCRIPT"
         */
        public static final AccessTypeEnum SCRIPT = new AccessTypeEnum("SCRIPT");

        /**
         * Enum CONFIGURAITON for value: "CONFIGURAITON"
         */
        public static final AccessTypeEnum CONFIGURAITON = new AccessTypeEnum("CONFIGURAITON");

        private static final Map<String, AccessTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AccessTypeEnum> createStaticFields() {
            Map<String, AccessTypeEnum> map = new HashMap<>();
            map.put("SCRIPT", SCRIPT);
            map.put("CONFIGURAITON", CONFIGURAITON);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AccessTypeEnum(String value) {
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
        public static AccessTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AccessTypeEnum(value));
        }

        public static AccessTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AccessTypeEnum) {
                return this.value.equals(((AccessTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_type")

    private AccessTypeEnum accessType;

    /**
     * 获取数据的模式
     */
    public static final class AccessModeEnum {

        /**
         * Enum SQL for value: "SQL"
         */
        public static final AccessModeEnum SQL = new AccessModeEnum("SQL");

        /**
         * Enum ROW_KEY for value: "ROW_KEY"
         */
        public static final AccessModeEnum ROW_KEY = new AccessModeEnum("ROW_KEY");

        /**
         * Enum PREFIX_FILTER for value: "PREFIX_FILTER"
         */
        public static final AccessModeEnum PREFIX_FILTER = new AccessModeEnum("PREFIX_FILTER");

        private static final Map<String, AccessModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AccessModeEnum> createStaticFields() {
            Map<String, AccessModeEnum> map = new HashMap<>();
            map.put("SQL", SQL);
            map.put("ROW_KEY", ROW_KEY);
            map.put("PREFIX_FILTER", PREFIX_FILTER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AccessModeEnum(String value) {
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
        public static AccessModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AccessModeEnum(value));
        }

        public static AccessModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AccessModeEnum) {
                return this.value.equals(((AccessModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_mode")

    private AccessModeEnum accessMode;

    /**
     * Gets or Sets pagination
     */
    public static final class PaginationEnum {

        /**
         * Enum DEFAULT for value: "DEFAULT"
         */
        public static final PaginationEnum DEFAULT = new PaginationEnum("DEFAULT");

        /**
         * Enum CUSTOM for value: "CUSTOM"
         */
        public static final PaginationEnum CUSTOM = new PaginationEnum("CUSTOM");

        private static final Map<String, PaginationEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PaginationEnum> createStaticFields() {
            Map<String, PaginationEnum> map = new HashMap<>();
            map.put("DEFAULT", DEFAULT);
            map.put("CUSTOM", CUSTOM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PaginationEnum(String value) {
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
        public static PaginationEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PaginationEnum(value));
        }

        public static PaginationEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PaginationEnum) {
                return this.value.equals(((PaginationEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pagination")

    private PaginationEnum pagination;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql")

    private String sql;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backend_paras")

    private List<ApiRequestPara> backendParas = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "response_paras")

    private List<ApiResponsePara> responseParas = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_paras")

    private List<DatasourceOrderPara> orderParas = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_size_sql")

    private String totalSizeSql;

    public DatasourceConfig withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 数据源的类型
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public DatasourceConfig withConnectionName(String connectionName) {
        this.connectionName = connectionName;
        return this;
    }

    /**
     * 数据连接名称
     * @return connectionName
     */
    public String getConnectionName() {
        return connectionName;
    }

    public void setConnectionName(String connectionName) {
        this.connectionName = connectionName;
    }

    public DatasourceConfig withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    /**
     * 数据连接ID
     * @return connectionId
     */
    public String getConnectionId() {
        return connectionId;
    }

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    public DatasourceConfig withDatabase(String database) {
        this.database = database;
        return this;
    }

    /**
     * 数据库名
     * @return database
     */
    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public DatasourceConfig withDatatable(String datatable) {
        this.datatable = datatable;
        return this;
    }

    /**
     * 数据表名称
     * @return datatable
     */
    public String getDatatable() {
        return datatable;
    }

    public void setDatatable(String datatable) {
        this.datatable = datatable;
    }

    public DatasourceConfig withTableId(String tableId) {
        this.tableId = tableId;
        return this;
    }

    /**
     * 数据表ID
     * @return tableId
     */
    public String getTableId() {
        return tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    public DatasourceConfig withQueue(String queue) {
        this.queue = queue;
        return this;
    }

    /**
     * DLI的队列名称
     * @return queue
     */
    public String getQueue() {
        return queue;
    }

    public void setQueue(String queue) {
        this.queue = queue;
    }

    public DatasourceConfig withAccessType(AccessTypeEnum accessType) {
        this.accessType = accessType;
        return this;
    }

    /**
     * 取数方式
     * @return accessType
     */
    public AccessTypeEnum getAccessType() {
        return accessType;
    }

    public void setAccessType(AccessTypeEnum accessType) {
        this.accessType = accessType;
    }

    public DatasourceConfig withAccessMode(AccessModeEnum accessMode) {
        this.accessMode = accessMode;
        return this;
    }

    /**
     * 获取数据的模式
     * @return accessMode
     */
    public AccessModeEnum getAccessMode() {
        return accessMode;
    }

    public void setAccessMode(AccessModeEnum accessMode) {
        this.accessMode = accessMode;
    }

    public DatasourceConfig withPagination(PaginationEnum pagination) {
        this.pagination = pagination;
        return this;
    }

    /**
     * Get pagination
     * @return pagination
     */
    public PaginationEnum getPagination() {
        return pagination;
    }

    public void setPagination(PaginationEnum pagination) {
        this.pagination = pagination;
    }

    public DatasourceConfig withSql(String sql) {
        this.sql = sql;
        return this;
    }

    /**
     * 脚本模式下的sql语句
     * @return sql
     */
    public String getSql() {
        return sql;
    }

    public void setSql(String sql) {
        this.sql = sql;
    }

    public DatasourceConfig withBackendParas(List<ApiRequestPara> backendParas) {
        this.backendParas = backendParas;
        return this;
    }

    public DatasourceConfig addBackendParasItem(ApiRequestPara backendParasItem) {
        if (this.backendParas == null) {
            this.backendParas = new ArrayList<>();
        }
        this.backendParas.add(backendParasItem);
        return this;
    }

    public DatasourceConfig withBackendParas(Consumer<List<ApiRequestPara>> backendParasSetter) {
        if (this.backendParas == null) {
            this.backendParas = new ArrayList<>();
        }
        backendParasSetter.accept(this.backendParas);
        return this;
    }

    /**
     * API后端参数
     * @return backendParas
     */
    public List<ApiRequestPara> getBackendParas() {
        return backendParas;
    }

    public void setBackendParas(List<ApiRequestPara> backendParas) {
        this.backendParas = backendParas;
    }

    public DatasourceConfig withResponseParas(List<ApiResponsePara> responseParas) {
        this.responseParas = responseParas;
        return this;
    }

    public DatasourceConfig addResponseParasItem(ApiResponsePara responseParasItem) {
        if (this.responseParas == null) {
            this.responseParas = new ArrayList<>();
        }
        this.responseParas.add(responseParasItem);
        return this;
    }

    public DatasourceConfig withResponseParas(Consumer<List<ApiResponsePara>> responseParasSetter) {
        if (this.responseParas == null) {
            this.responseParas = new ArrayList<>();
        }
        responseParasSetter.accept(this.responseParas);
        return this;
    }

    /**
     * 配置类API返回参数
     * @return responseParas
     */
    public List<ApiResponsePara> getResponseParas() {
        return responseParas;
    }

    public void setResponseParas(List<ApiResponsePara> responseParas) {
        this.responseParas = responseParas;
    }

    public DatasourceConfig withOrderParas(List<DatasourceOrderPara> orderParas) {
        this.orderParas = orderParas;
        return this;
    }

    public DatasourceConfig addOrderParasItem(DatasourceOrderPara orderParasItem) {
        if (this.orderParas == null) {
            this.orderParas = new ArrayList<>();
        }
        this.orderParas.add(orderParasItem);
        return this;
    }

    public DatasourceConfig withOrderParas(Consumer<List<DatasourceOrderPara>> orderParasSetter) {
        if (this.orderParas == null) {
            this.orderParas = new ArrayList<>();
        }
        orderParasSetter.accept(this.orderParas);
        return this;
    }

    /**
     * 排序参数
     * @return orderParas
     */
    public List<DatasourceOrderPara> getOrderParas() {
        return orderParas;
    }

    public void setOrderParas(List<DatasourceOrderPara> orderParas) {
        this.orderParas = orderParas;
    }

    public DatasourceConfig withTotalSizeSql(String totalSizeSql) {
        this.totalSizeSql = totalSizeSql;
        return this;
    }

    /**
     * 总条数计算脚本SQL。
     * @return totalSizeSql
     */
    public String getTotalSizeSql() {
        return totalSizeSql;
    }

    public void setTotalSizeSql(String totalSizeSql) {
        this.totalSizeSql = totalSizeSql;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DatasourceConfig that = (DatasourceConfig) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.connectionName, that.connectionName)
            && Objects.equals(this.connectionId, that.connectionId) && Objects.equals(this.database, that.database)
            && Objects.equals(this.datatable, that.datatable) && Objects.equals(this.tableId, that.tableId)
            && Objects.equals(this.queue, that.queue) && Objects.equals(this.accessType, that.accessType)
            && Objects.equals(this.accessMode, that.accessMode) && Objects.equals(this.pagination, that.pagination)
            && Objects.equals(this.sql, that.sql) && Objects.equals(this.backendParas, that.backendParas)
            && Objects.equals(this.responseParas, that.responseParas)
            && Objects.equals(this.orderParas, that.orderParas) && Objects.equals(this.totalSizeSql, that.totalSizeSql);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type,
            connectionName,
            connectionId,
            database,
            datatable,
            tableId,
            queue,
            accessType,
            accessMode,
            pagination,
            sql,
            backendParas,
            responseParas,
            orderParas,
            totalSizeSql);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DatasourceConfig {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    connectionName: ").append(toIndentedString(connectionName)).append("\n");
        sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
        sb.append("    database: ").append(toIndentedString(database)).append("\n");
        sb.append("    datatable: ").append(toIndentedString(datatable)).append("\n");
        sb.append("    tableId: ").append(toIndentedString(tableId)).append("\n");
        sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
        sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
        sb.append("    accessMode: ").append(toIndentedString(accessMode)).append("\n");
        sb.append("    pagination: ").append(toIndentedString(pagination)).append("\n");
        sb.append("    sql: ").append(toIndentedString(sql)).append("\n");
        sb.append("    backendParas: ").append(toIndentedString(backendParas)).append("\n");
        sb.append("    responseParas: ").append(toIndentedString(responseParas)).append("\n");
        sb.append("    orderParas: ").append(toIndentedString(orderParas)).append("\n");
        sb.append("    totalSizeSql: ").append(toIndentedString(totalSizeSql)).append("\n");
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
