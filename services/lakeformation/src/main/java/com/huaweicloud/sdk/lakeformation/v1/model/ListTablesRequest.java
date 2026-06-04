package com.huaweicloud.sdk.lakeformation.v1.model;

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
public class ListTablesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "catalog_name")

    private String catalogName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    private String databaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name_pattern")

    private String tableNamePattern;

    /**
     * 表格式。支持HIVE,ICEBERG,LANCE
     */
    public static final class TableFormatEnum {

        /**
         * Enum HIVE for value: "HIVE"
         */
        public static final TableFormatEnum HIVE = new TableFormatEnum("HIVE");

        /**
         * Enum ICEBERG for value: "ICEBERG"
         */
        public static final TableFormatEnum ICEBERG = new TableFormatEnum("ICEBERG");

        /**
         * Enum LANCE for value: "LANCE"
         */
        public static final TableFormatEnum LANCE = new TableFormatEnum("LANCE");

        private static final Map<String, TableFormatEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TableFormatEnum> createStaticFields() {
            Map<String, TableFormatEnum> map = new HashMap<>();
            map.put("HIVE", HIVE);
            map.put("ICEBERG", ICEBERG);
            map.put("LANCE", LANCE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TableFormatEnum(String value) {
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
        public static TableFormatEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TableFormatEnum(value));
        }

        public static TableFormatEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TableFormatEnum) {
                return this.value.equals(((TableFormatEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_format")

    private TableFormatEnum tableFormat;

    /**
     * 表类型：MANAGED_TABLE-内表、EXTERNAL_TABLE-外表、VIRTUAL_VIEW-视图、MATERIALIZED_VIEW-物化视图、DICTIONARY_TABLE字典表、LAKE_TABLE内表。
     */
    public static final class TableTypeEnum {

        /**
         * Enum MANAGED_TABLE for value: "MANAGED_TABLE"
         */
        public static final TableTypeEnum MANAGED_TABLE = new TableTypeEnum("MANAGED_TABLE");

        /**
         * Enum EXTERNAL_TABLE for value: "EXTERNAL_TABLE"
         */
        public static final TableTypeEnum EXTERNAL_TABLE = new TableTypeEnum("EXTERNAL_TABLE");

        /**
         * Enum VIRTUAL_VIEW for value: "VIRTUAL_VIEW"
         */
        public static final TableTypeEnum VIRTUAL_VIEW = new TableTypeEnum("VIRTUAL_VIEW");

        /**
         * Enum MATERIALIZED_VIEW for value: "MATERIALIZED_VIEW"
         */
        public static final TableTypeEnum MATERIALIZED_VIEW = new TableTypeEnum("MATERIALIZED_VIEW");

        /**
         * Enum DICTIONARY_TABLE for value: "DICTIONARY_TABLE"
         */
        public static final TableTypeEnum DICTIONARY_TABLE = new TableTypeEnum("DICTIONARY_TABLE");

        /**
         * Enum LAKE_TABLE for value: "LAKE_TABLE"
         */
        public static final TableTypeEnum LAKE_TABLE = new TableTypeEnum("LAKE_TABLE");

        private static final Map<String, TableTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TableTypeEnum> createStaticFields() {
            Map<String, TableTypeEnum> map = new HashMap<>();
            map.put("MANAGED_TABLE", MANAGED_TABLE);
            map.put("EXTERNAL_TABLE", EXTERNAL_TABLE);
            map.put("VIRTUAL_VIEW", VIRTUAL_VIEW);
            map.put("MATERIALIZED_VIEW", MATERIALIZED_VIEW);
            map.put("DICTIONARY_TABLE", DICTIONARY_TABLE);
            map.put("LAKE_TABLE", LAKE_TABLE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TableTypeEnum(String value) {
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
        public static TableTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TableTypeEnum(value));
        }

        public static TableTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TableTypeEnum) {
                return this.value.equals(((TableTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_type")

    private TableTypeEnum tableType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter")

    private String filter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reverse_page")

    private Boolean reversePage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deleted")

    private Boolean deleted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "include_fields")

    private String includeFields;

    public ListTablesRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * LakeFormation实例ID。创建实例时自动生成。例如：2180518f-42b8-4947-b20b-adfc53981a25。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListTablesRequest withCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }

    /**
     * catalog名称。只能包含字母、数字和下划线，且长度为1~256个字符。
     * @return catalogName
     */
    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public ListTablesRequest withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * 数据库名称。只能包含中文、字母、数字、下划线、中划线，且长度为1~128个字符。
     * @return databaseName
     */
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public ListTablesRequest withTableNamePattern(String tableNamePattern) {
        this.tableNamePattern = tableNamePattern;
        return this;
    }

    /**
     * 表名称通配符。只能包含中文、字母、数字和_|*.-特殊字符，且长度为1~256个字符。
     * @return tableNamePattern
     */
    public String getTableNamePattern() {
        return tableNamePattern;
    }

    public void setTableNamePattern(String tableNamePattern) {
        this.tableNamePattern = tableNamePattern;
    }

    public ListTablesRequest withTableFormat(TableFormatEnum tableFormat) {
        this.tableFormat = tableFormat;
        return this;
    }

    /**
     * 表格式。支持HIVE,ICEBERG,LANCE
     * @return tableFormat
     */
    public TableFormatEnum getTableFormat() {
        return tableFormat;
    }

    public void setTableFormat(TableFormatEnum tableFormat) {
        this.tableFormat = tableFormat;
    }

    public ListTablesRequest withTableType(TableTypeEnum tableType) {
        this.tableType = tableType;
        return this;
    }

    /**
     * 表类型：MANAGED_TABLE-内表、EXTERNAL_TABLE-外表、VIRTUAL_VIEW-视图、MATERIALIZED_VIEW-物化视图、DICTIONARY_TABLE字典表、LAKE_TABLE内表。
     * @return tableType
     */
    public TableTypeEnum getTableType() {
        return tableType;
    }

    public void setTableType(TableTypeEnum tableType) {
        this.tableType = tableType;
    }

    public ListTablesRequest withFilter(String filter) {
        this.filter = filter;
        return this;
    }

    /**
     * 过滤条件字符串，可以按照属性查询表。 支持的属性查找包括： HIVE_FILTER_FIELD_OWNER HIVE_FILTER_FIELD_LAST_ACCESS HIVE_FILTER_FIELD_PARAMS
     * @return filter
     */
    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public ListTablesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询返回条数。默认值为100。最小值为1，最大值为1000。当include_fields只包含name时，最大值可以为5000
     * minimum: 1
     * maximum: 5000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListTablesRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 查询的起始记录ID。最小长度为0，最大长度为256。
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListTablesRequest withReversePage(Boolean reversePage) {
        this.reversePage = reversePage;
        return this;
    }

    /**
     * 是否倒序查询。
     * @return reversePage
     */
    public Boolean getReversePage() {
        return reversePage;
    }

    public void setReversePage(Boolean reversePage) {
        this.reversePage = reversePage;
    }

    public ListTablesRequest withDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    /**
     * 是否查询被删除元数据。
     * @return deleted
     */
    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public ListTablesRequest withIncludeFields(String includeFields) {
        this.includeFields = includeFields;
        return this;
    }

    /**
     * 包含字段，非必填，多个字段使用英文逗号分隔，不填时返回全部字段，当前暂只支持name
     * @return includeFields
     */
    public String getIncludeFields() {
        return includeFields;
    }

    public void setIncludeFields(String includeFields) {
        this.includeFields = includeFields;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTablesRequest that = (ListTablesRequest) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.catalogName, that.catalogName)
            && Objects.equals(this.databaseName, that.databaseName)
            && Objects.equals(this.tableNamePattern, that.tableNamePattern)
            && Objects.equals(this.tableFormat, that.tableFormat) && Objects.equals(this.tableType, that.tableType)
            && Objects.equals(this.filter, that.filter) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.marker, that.marker) && Objects.equals(this.reversePage, that.reversePage)
            && Objects.equals(this.deleted, that.deleted) && Objects.equals(this.includeFields, that.includeFields);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId,
            catalogName,
            databaseName,
            tableNamePattern,
            tableFormat,
            tableType,
            filter,
            limit,
            marker,
            reversePage,
            deleted,
            includeFields);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTablesRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    catalogName: ").append(toIndentedString(catalogName)).append("\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    tableNamePattern: ").append(toIndentedString(tableNamePattern)).append("\n");
        sb.append("    tableFormat: ").append(toIndentedString(tableFormat)).append("\n");
        sb.append("    tableType: ").append(toIndentedString(tableType)).append("\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    reversePage: ").append(toIndentedString(reversePage)).append("\n");
        sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
        sb.append("    includeFields: ").append(toIndentedString(includeFields)).append("\n");
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
