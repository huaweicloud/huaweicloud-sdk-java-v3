package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ListInstancesResourceMetricsRequest {

    /**
     * 引擎类型
     */
    public static final class EngineEnum {

        /**
         * Enum MYSQL for value: "mysql"
         */
        public static final EngineEnum MYSQL = new EngineEnum("mysql");

        /**
         * Enum POSTGRESQL for value: "postgresql"
         */
        public static final EngineEnum POSTGRESQL = new EngineEnum("postgresql");

        /**
         * Enum SQLSERVER for value: "sqlserver"
         */
        public static final EngineEnum SQLSERVER = new EngineEnum("sqlserver");

        private static final Map<String, EngineEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EngineEnum> createStaticFields() {
            Map<String, EngineEnum> map = new HashMap<>();
            map.put("mysql", MYSQL);
            map.put("postgresql", POSTGRESQL);
            map.put("sqlserver", SQLSERVER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EngineEnum(String value) {
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
        public static EngineEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EngineEnum(value));
        }

        public static EngineEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EngineEnum) {
                return this.value.equals(((EngineEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "engine")

    private EngineEnum engine;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_field")

    private String searchField;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private String offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private String limit;

    /**
     * 排序方式
     */
    public static final class OrderEnum {

        /**
         * Enum DESC for value: "DESC"
         */
        public static final OrderEnum DESC = new OrderEnum("DESC");

        /**
         * Enum ASC for value: "ASC"
         */
        public static final OrderEnum ASC = new OrderEnum("ASC");

        private static final Map<String, OrderEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OrderEnum> createStaticFields() {
            Map<String, OrderEnum> map = new HashMap<>();
            map.put("DESC", DESC);
            map.put("ASC", ASC);
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

    /**
     * 排序字段
     */
    public static final class SortFieldEnum {

        /**
         * Enum INSTANCE_NAME for value: "instance_name"
         */
        public static final SortFieldEnum INSTANCE_NAME = new SortFieldEnum("instance_name");

        /**
         * Enum STATUS for value: "status"
         */
        public static final SortFieldEnum STATUS = new SortFieldEnum("status");

        /**
         * Enum TYPE for value: "type"
         */
        public static final SortFieldEnum TYPE = new SortFieldEnum("type");

        /**
         * Enum CPU_USAGE for value: "cpu_usage"
         */
        public static final SortFieldEnum CPU_USAGE = new SortFieldEnum("cpu_usage");

        /**
         * Enum MEMORY_USAGE for value: "memory_usage"
         */
        public static final SortFieldEnum MEMORY_USAGE = new SortFieldEnum("memory_usage");

        /**
         * Enum DISK_USAGE for value: "disk_usage"
         */
        public static final SortFieldEnum DISK_USAGE = new SortFieldEnum("disk_usage");

        /**
         * Enum TPS for value: "tps"
         */
        public static final SortFieldEnum TPS = new SortFieldEnum("tps");

        /**
         * Enum QPS for value: "qps"
         */
        public static final SortFieldEnum QPS = new SortFieldEnum("qps");

        /**
         * Enum IOPS for value: "iops"
         */
        public static final SortFieldEnum IOPS = new SortFieldEnum("iops");

        /**
         * Enum ACTIVE_CONNECTIONS for value: "active_connections"
         */
        public static final SortFieldEnum ACTIVE_CONNECTIONS = new SortFieldEnum("active_connections");

        /**
         * Enum SLOW_SQL for value: "slow_sql"
         */
        public static final SortFieldEnum SLOW_SQL = new SortFieldEnum("slow_sql");

        private static final Map<String, SortFieldEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SortFieldEnum> createStaticFields() {
            Map<String, SortFieldEnum> map = new HashMap<>();
            map.put("instance_name", INSTANCE_NAME);
            map.put("status", STATUS);
            map.put("type", TYPE);
            map.put("cpu_usage", CPU_USAGE);
            map.put("memory_usage", MEMORY_USAGE);
            map.put("disk_usage", DISK_USAGE);
            map.put("tps", TPS);
            map.put("qps", QPS);
            map.put("iops", IOPS);
            map.put("active_connections", ACTIVE_CONNECTIONS);
            map.put("slow_sql", SLOW_SQL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SortFieldEnum(String value) {
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
        public static SortFieldEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SortFieldEnum(value));
        }

        public static SortFieldEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SortFieldEnum) {
                return this.value.equals(((SortFieldEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_field")

    private SortFieldEnum sortField;

    public ListInstancesResourceMetricsRequest withEngine(EngineEnum engine) {
        this.engine = engine;
        return this;
    }

    /**
     * 引擎类型
     * @return engine
     */
    public EngineEnum getEngine() {
        return engine;
    }

    public void setEngine(EngineEnum engine) {
        this.engine = engine;
    }

    public ListInstancesResourceMetricsRequest withSearchField(String searchField) {
        this.searchField = searchField;
        return this;
    }

    /**
     * 搜索字段
     * @return searchField
     */
    public String getSearchField() {
        return searchField;
    }

    public void setSearchField(String searchField) {
        this.searchField = searchField;
    }

    public ListInstancesResourceMetricsRequest withOffset(String offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 索引位置，偏移量
     * @return offset
     */
    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public ListInstancesResourceMetricsRequest withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询数据条数
     * @return limit
     */
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public ListInstancesResourceMetricsRequest withOrder(OrderEnum order) {
        this.order = order;
        return this;
    }

    /**
     * 排序方式
     * @return order
     */
    public OrderEnum getOrder() {
        return order;
    }

    public void setOrder(OrderEnum order) {
        this.order = order;
    }

    public ListInstancesResourceMetricsRequest withSortField(SortFieldEnum sortField) {
        this.sortField = sortField;
        return this;
    }

    /**
     * 排序字段
     * @return sortField
     */
    public SortFieldEnum getSortField() {
        return sortField;
    }

    public void setSortField(SortFieldEnum sortField) {
        this.sortField = sortField;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInstancesResourceMetricsRequest that = (ListInstancesResourceMetricsRequest) obj;
        return Objects.equals(this.engine, that.engine) && Objects.equals(this.searchField, that.searchField)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.order, that.order) && Objects.equals(this.sortField, that.sortField);
    }

    @Override
    public int hashCode() {
        return Objects.hash(engine, searchField, offset, limit, order, sortField);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstancesResourceMetricsRequest {\n");
        sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
        sb.append("    searchField: ").append(toIndentedString(searchField)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("    sortField: ").append(toIndentedString(sortField)).append("\n");
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
