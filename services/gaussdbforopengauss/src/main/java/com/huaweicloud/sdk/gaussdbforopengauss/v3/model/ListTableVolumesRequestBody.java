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
 * ListTableVolumesRequestBody
 */
public class ListTableVolumesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    private String databaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema_names")

    private List<String> schemaNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    /**
     * **参数解释**: 排序字段。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 不涉及。 
     */
    public static final class SortKeyEnum {

        /**
         * Enum TABLE_SIZE for value: "table_size"
         */
        public static final SortKeyEnum TABLE_SIZE = new SortKeyEnum("table_size");

        /**
         * Enum ID for value: "id"
         */
        public static final SortKeyEnum ID = new SortKeyEnum("id");

        /**
         * Enum TABLE_NAME for value: "table_name"
         */
        public static final SortKeyEnum TABLE_NAME = new SortKeyEnum("table_name");

        /**
         * Enum TABLE_OWNER for value: "table_owner"
         */
        public static final SortKeyEnum TABLE_OWNER = new SortKeyEnum("table_owner");

        /**
         * Enum DATABASE_NAME for value: "database_name"
         */
        public static final SortKeyEnum DATABASE_NAME = new SortKeyEnum("database_name");

        /**
         * Enum SCHEMA_NAME for value: "schema_name"
         */
        public static final SortKeyEnum SCHEMA_NAME = new SortKeyEnum("schema_name");

        /**
         * Enum IS_PART_TYPE for value: "is_part_type"
         */
        public static final SortKeyEnum IS_PART_TYPE = new SortKeyEnum("is_part_type");

        /**
         * Enum IS_HASH_CLUSTER_KEY for value: "is_hash_cluster_key"
         */
        public static final SortKeyEnum IS_HASH_CLUSTER_KEY = new SortKeyEnum("is_hash_cluster_key");

        /**
         * Enum TUPLES for value: "tuples"
         */
        public static final SortKeyEnum TUPLES = new SortKeyEnum("tuples");

        /**
         * Enum CREATE_TIME for value: "create_time"
         */
        public static final SortKeyEnum CREATE_TIME = new SortKeyEnum("create_time");

        /**
         * Enum UPDATE_TIME for value: "update_time"
         */
        public static final SortKeyEnum UPDATE_TIME = new SortKeyEnum("update_time");

        /**
         * Enum AVERAGE_SIZE for value: "average_size"
         */
        public static final SortKeyEnum AVERAGE_SIZE = new SortKeyEnum("average_size");

        /**
         * Enum MAX_RATIO for value: "max_ratio"
         */
        public static final SortKeyEnum MAX_RATIO = new SortKeyEnum("max_ratio");

        /**
         * Enum MIN_RATIO for value: "min_ratio"
         */
        public static final SortKeyEnum MIN_RATIO = new SortKeyEnum("min_ratio");

        /**
         * Enum SKEW_SIZE for value: "skew_size"
         */
        public static final SortKeyEnum SKEW_SIZE = new SortKeyEnum("skew_size");

        /**
         * Enum SKEW_RATIO for value: "skew_ratio"
         */
        public static final SortKeyEnum SKEW_RATIO = new SortKeyEnum("skew_ratio");

        /**
         * Enum SKEW_STDDEV for value: "skew_stddev"
         */
        public static final SortKeyEnum SKEW_STDDEV = new SortKeyEnum("skew_stddev");

        private static final Map<String, SortKeyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SortKeyEnum> createStaticFields() {
            Map<String, SortKeyEnum> map = new HashMap<>();
            map.put("table_size", TABLE_SIZE);
            map.put("id", ID);
            map.put("table_name", TABLE_NAME);
            map.put("table_owner", TABLE_OWNER);
            map.put("database_name", DATABASE_NAME);
            map.put("schema_name", SCHEMA_NAME);
            map.put("is_part_type", IS_PART_TYPE);
            map.put("is_hash_cluster_key", IS_HASH_CLUSTER_KEY);
            map.put("tuples", TUPLES);
            map.put("create_time", CREATE_TIME);
            map.put("update_time", UPDATE_TIME);
            map.put("average_size", AVERAGE_SIZE);
            map.put("max_ratio", MAX_RATIO);
            map.put("min_ratio", MIN_RATIO);
            map.put("skew_size", SKEW_SIZE);
            map.put("skew_ratio", SKEW_RATIO);
            map.put("skew_stddev", SKEW_STDDEV);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SortKeyEnum(String value) {
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
        public static SortKeyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SortKeyEnum(value));
        }

        public static SortKeyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SortKeyEnum) {
                return this.value.equals(((SortKeyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_key")

    private SortKeyEnum sortKey;

    /**
     * **参数解释**: 排序方法。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 不涉及。 
     */
    public static final class SortOrderEnum {

        /**
         * Enum DESC for value: "DESC"
         */
        public static final SortOrderEnum DESC = new SortOrderEnum("DESC");

        /**
         * Enum ASC for value: "ASC"
         */
        public static final SortOrderEnum ASC = new SortOrderEnum("ASC");

        private static final Map<String, SortOrderEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SortOrderEnum> createStaticFields() {
            Map<String, SortOrderEnum> map = new HashMap<>();
            map.put("DESC", DESC);
            map.put("ASC", ASC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SortOrderEnum(String value) {
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
        public static SortOrderEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SortOrderEnum(value));
        }

        public static SortOrderEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SortOrderEnum) {
                return this.value.equals(((SortOrderEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_order")

    private SortOrderEnum sortOrder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    public ListTableVolumesRequestBody withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * **参数解释**: 数据库名称。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 不涉及。 
     * @return databaseName
     */
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public ListTableVolumesRequestBody withSchemaNames(List<String> schemaNames) {
        this.schemaNames = schemaNames;
        return this;
    }

    public ListTableVolumesRequestBody addSchemaNamesItem(String schemaNamesItem) {
        if (this.schemaNames == null) {
            this.schemaNames = new ArrayList<>();
        }
        this.schemaNames.add(schemaNamesItem);
        return this;
    }

    public ListTableVolumesRequestBody withSchemaNames(Consumer<List<String>> schemaNamesSetter) {
        if (this.schemaNames == null) {
            this.schemaNames = new ArrayList<>();
        }
        schemaNamesSetter.accept(this.schemaNames);
        return this;
    }

    /**
     * **参数解释**: schema名称。 **约束限制**: 不涉及。 
     * @return schemaNames
     */
    public List<String> getSchemaNames() {
        return schemaNames;
    }

    public void setSchemaNames(List<String> schemaNames) {
        this.schemaNames = schemaNames;
    }

    public ListTableVolumesRequestBody withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * **参数解释**: 表名称。。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 不涉及。 
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public ListTableVolumesRequestBody withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * **参数解释**: 表所属用户名称。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 不涉及。 
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ListTableVolumesRequestBody withSortKey(SortKeyEnum sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    /**
     * **参数解释**: 排序字段。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 不涉及。 
     * @return sortKey
     */
    public SortKeyEnum getSortKey() {
        return sortKey;
    }

    public void setSortKey(SortKeyEnum sortKey) {
        this.sortKey = sortKey;
    }

    public ListTableVolumesRequestBody withSortOrder(SortOrderEnum sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    /**
     * **参数解释**: 排序方法。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 不涉及。 
     * @return sortOrder
     */
    public SortOrderEnum getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(SortOrderEnum sortOrder) {
        this.sortOrder = sortOrder;
    }

    public ListTableVolumesRequestBody withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * **参数解释**: 查询记录数 **约束限制**: 必须为数字，不能为负数。 **取值范围**: 1 - 100 **默认取值**: 10 
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListTableVolumesRequestBody withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * **参数解释**: 索引位置，偏移量。从第一条数据偏移offset条数据后开始查询。 **约束限制**: 必须为数字，不能为负数。 **取值范围**: 0 - 10000 **默认取值**: 0 
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTableVolumesRequestBody that = (ListTableVolumesRequestBody) obj;
        return Objects.equals(this.databaseName, that.databaseName)
            && Objects.equals(this.schemaNames, that.schemaNames) && Objects.equals(this.tableName, that.tableName)
            && Objects.equals(this.userName, that.userName) && Objects.equals(this.sortKey, that.sortKey)
            && Objects.equals(this.sortOrder, that.sortOrder) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.offset, that.offset);
    }

    @Override
    public int hashCode() {
        return Objects.hash(databaseName, schemaNames, tableName, userName, sortKey, sortOrder, limit, offset);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTableVolumesRequestBody {\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    schemaNames: ").append(toIndentedString(schemaNames)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
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
