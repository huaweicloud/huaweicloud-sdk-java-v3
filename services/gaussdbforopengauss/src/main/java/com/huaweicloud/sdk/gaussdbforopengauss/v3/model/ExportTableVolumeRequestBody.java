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
 * ExportTableVolumeRequestBody
 */
public class ExportTableVolumeRequestBody {

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
     * **参数解释**: 排序字段。 **约束限制**: 不涉及。 **取值范围**: - table_size：表的大小。 - id：表ID。 - table_name：表名称。 - table_owner：表所属用户名称。 - database_name：数据库名称。 - schema_name：schema名称。 - is_part_type：表或者索引是否具有分区表的性质。 - is_hash_cluster_key：是否包含hash分区列信息。 - tuples：表中行的数目。 - create_time：创建时间。 - update_time：修改时间。 - average_size：表大小平均值(totalsize/DN个数，该值为平均分布的理想情况下，表在各DN占用空间大小)。 - max_ratio：单DN表大小最大值占比（表在各DN占用空间的最大值/totalsize）。 - min_ratio：单DN表大小最小值占比（表在各DN占用空间的最小值/totalsize）。 - skew_size：表分布倾斜值（单DN表大小最大值 - 单DN表大小最小值）。 - skew_ratio：表分布倾斜率（skewsize/totalsize）。 - skew_stddev：表分布标准方差（在表大小一定的情况下，该值越大表明表的整体分布情况越倾斜）。  **默认取值** 不涉及。 
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
     * **参数解释** 实时会话统计排序方式。 **约束限制**: 不涉及。 **取值范围** - ASC：根据sort_key值升序。 - DESC：根据sort_key值降序。  **默认取值** ASC 
     */
    public static final class SortOrderEnum {

        /**
         * Enum ASC for value: "ASC"
         */
        public static final SortOrderEnum ASC = new SortOrderEnum("ASC");

        /**
         * Enum DESC for value: "DESC"
         */
        public static final SortOrderEnum DESC = new SortOrderEnum("DESC");

        private static final Map<String, SortOrderEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SortOrderEnum> createStaticFields() {
            Map<String, SortOrderEnum> map = new HashMap<>();
            map.put("ASC", ASC);
            map.put("DESC", DESC);
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

    public ExportTableVolumeRequestBody withDatabaseName(String databaseName) {
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

    public ExportTableVolumeRequestBody withSchemaNames(List<String> schemaNames) {
        this.schemaNames = schemaNames;
        return this;
    }

    public ExportTableVolumeRequestBody addSchemaNamesItem(String schemaNamesItem) {
        if (this.schemaNames == null) {
            this.schemaNames = new ArrayList<>();
        }
        this.schemaNames.add(schemaNamesItem);
        return this;
    }

    public ExportTableVolumeRequestBody withSchemaNames(Consumer<List<String>> schemaNamesSetter) {
        if (this.schemaNames == null) {
            this.schemaNames = new ArrayList<>();
        }
        schemaNamesSetter.accept(this.schemaNames);
        return this;
    }

    /**
     * **参数解释**: schema名称。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 不涉及。
     * @return schemaNames
     */
    public List<String> getSchemaNames() {
        return schemaNames;
    }

    public void setSchemaNames(List<String> schemaNames) {
        this.schemaNames = schemaNames;
    }

    public ExportTableVolumeRequestBody withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * **参数解释**: 表名称。 **约束限制**: 不涉及。 **取值范围**: 不涉及。 **默认取值**: 不涉及。
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public ExportTableVolumeRequestBody withUserName(String userName) {
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

    public ExportTableVolumeRequestBody withSortKey(SortKeyEnum sortKey) {
        this.sortKey = sortKey;
        return this;
    }

    /**
     * **参数解释**: 排序字段。 **约束限制**: 不涉及。 **取值范围**: - table_size：表的大小。 - id：表ID。 - table_name：表名称。 - table_owner：表所属用户名称。 - database_name：数据库名称。 - schema_name：schema名称。 - is_part_type：表或者索引是否具有分区表的性质。 - is_hash_cluster_key：是否包含hash分区列信息。 - tuples：表中行的数目。 - create_time：创建时间。 - update_time：修改时间。 - average_size：表大小平均值(totalsize/DN个数，该值为平均分布的理想情况下，表在各DN占用空间大小)。 - max_ratio：单DN表大小最大值占比（表在各DN占用空间的最大值/totalsize）。 - min_ratio：单DN表大小最小值占比（表在各DN占用空间的最小值/totalsize）。 - skew_size：表分布倾斜值（单DN表大小最大值 - 单DN表大小最小值）。 - skew_ratio：表分布倾斜率（skewsize/totalsize）。 - skew_stddev：表分布标准方差（在表大小一定的情况下，该值越大表明表的整体分布情况越倾斜）。  **默认取值** 不涉及。 
     * @return sortKey
     */
    public SortKeyEnum getSortKey() {
        return sortKey;
    }

    public void setSortKey(SortKeyEnum sortKey) {
        this.sortKey = sortKey;
    }

    public ExportTableVolumeRequestBody withSortOrder(SortOrderEnum sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    /**
     * **参数解释** 实时会话统计排序方式。 **约束限制**: 不涉及。 **取值范围** - ASC：根据sort_key值升序。 - DESC：根据sort_key值降序。  **默认取值** ASC 
     * @return sortOrder
     */
    public SortOrderEnum getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(SortOrderEnum sortOrder) {
        this.sortOrder = sortOrder;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExportTableVolumeRequestBody that = (ExportTableVolumeRequestBody) obj;
        return Objects.equals(this.databaseName, that.databaseName)
            && Objects.equals(this.schemaNames, that.schemaNames) && Objects.equals(this.tableName, that.tableName)
            && Objects.equals(this.userName, that.userName) && Objects.equals(this.sortKey, that.sortKey)
            && Objects.equals(this.sortOrder, that.sortOrder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(databaseName, schemaNames, tableName, userName, sortKey, sortOrder);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportTableVolumeRequestBody {\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    schemaNames: ").append(toIndentedString(schemaNames)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    sortKey: ").append(toIndentedString(sortKey)).append("\n");
        sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
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
