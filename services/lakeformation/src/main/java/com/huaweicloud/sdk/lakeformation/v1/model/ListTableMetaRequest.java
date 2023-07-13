package com.huaweicloud.sdk.lakeformation.v1.model;

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
 * Request Object
 */
public class ListTableMetaRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "catalog_name")

    private String catalogName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name_pattern")

    private String databaseNamePattern;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name_pattern")

    private String tableNamePattern;

    /**
     * Gets or Sets tableTypes
     */
    public static final class TableTypesEnum {

        /**
         * Enum MANAGED_TABLE for value: "MANAGED_TABLE"
         */
        public static final TableTypesEnum MANAGED_TABLE = new TableTypesEnum("MANAGED_TABLE");

        /**
         * Enum EXTERNAL_TABLE for value: "EXTERNAL_TABLE"
         */
        public static final TableTypesEnum EXTERNAL_TABLE = new TableTypesEnum("EXTERNAL_TABLE");

        /**
         * Enum VIRTUAL_VIEW for value: "VIRTUAL_VIEW"
         */
        public static final TableTypesEnum VIRTUAL_VIEW = new TableTypesEnum("VIRTUAL_VIEW");

        /**
         * Enum MATERIALIZED_VIEW for value: "MATERIALIZED_VIEW"
         */
        public static final TableTypesEnum MATERIALIZED_VIEW = new TableTypesEnum("MATERIALIZED_VIEW");

        private static final Map<String, TableTypesEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TableTypesEnum> createStaticFields() {
            Map<String, TableTypesEnum> map = new HashMap<>();
            map.put("MANAGED_TABLE", MANAGED_TABLE);
            map.put("EXTERNAL_TABLE", EXTERNAL_TABLE);
            map.put("VIRTUAL_VIEW", VIRTUAL_VIEW);
            map.put("MATERIALIZED_VIEW", MATERIALIZED_VIEW);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TableTypesEnum(String value) {
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
        public static TableTypesEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TableTypesEnum(value));
        }

        public static TableTypesEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TableTypesEnum) {
                return this.value.equals(((TableTypesEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_types")

    private List<TableTypesEnum> tableTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "marker")

    private String marker;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reverse_page")

    private Boolean reversePage;

    public ListTableMetaRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例Id
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListTableMetaRequest withCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }

    /**
     * catalog名字
     * @return catalogName
     */
    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public ListTableMetaRequest withDatabaseNamePattern(String databaseNamePattern) {
        this.databaseNamePattern = databaseNamePattern;
        return this;
    }

    /**
     * 数据库通配符
     * @return databaseNamePattern
     */
    public String getDatabaseNamePattern() {
        return databaseNamePattern;
    }

    public void setDatabaseNamePattern(String databaseNamePattern) {
        this.databaseNamePattern = databaseNamePattern;
    }

    public ListTableMetaRequest withTableNamePattern(String tableNamePattern) {
        this.tableNamePattern = tableNamePattern;
        return this;
    }

    /**
     * 表名通配符
     * @return tableNamePattern
     */
    public String getTableNamePattern() {
        return tableNamePattern;
    }

    public void setTableNamePattern(String tableNamePattern) {
        this.tableNamePattern = tableNamePattern;
    }

    public ListTableMetaRequest withTableTypes(List<TableTypesEnum> tableTypes) {
        this.tableTypes = tableTypes;
        return this;
    }

    public ListTableMetaRequest addTableTypesItem(TableTypesEnum tableTypesItem) {
        if (this.tableTypes == null) {
            this.tableTypes = new ArrayList<>();
        }
        this.tableTypes.add(tableTypesItem);
        return this;
    }

    public ListTableMetaRequest withTableTypes(Consumer<List<TableTypesEnum>> tableTypesSetter) {
        if (this.tableTypes == null) {
            this.tableTypes = new ArrayList<>();
        }
        tableTypesSetter.accept(this.tableTypes);
        return this;
    }

    /**
     * 查询的表类型
     * @return tableTypes
     */
    public List<TableTypesEnum> getTableTypes() {
        return tableTypes;
    }

    public void setTableTypes(List<TableTypesEnum> tableTypes) {
        this.tableTypes = tableTypes;
    }

    public ListTableMetaRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 返回的条目数量
     * minimum: 1
     * maximum: 2000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListTableMetaRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * 查询的起始记录ID
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListTableMetaRequest withReversePage(Boolean reversePage) {
        this.reversePage = reversePage;
        return this;
    }

    /**
     * 是否查询上一页
     * @return reversePage
     */
    public Boolean getReversePage() {
        return reversePage;
    }

    public void setReversePage(Boolean reversePage) {
        this.reversePage = reversePage;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTableMetaRequest that = (ListTableMetaRequest) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.catalogName, that.catalogName)
            && Objects.equals(this.databaseNamePattern, that.databaseNamePattern)
            && Objects.equals(this.tableNamePattern, that.tableNamePattern)
            && Objects.equals(this.tableTypes, that.tableTypes) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.marker, that.marker) && Objects.equals(this.reversePage, that.reversePage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId,
            catalogName,
            databaseNamePattern,
            tableNamePattern,
            tableTypes,
            limit,
            marker,
            reversePage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTableMetaRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    catalogName: ").append(toIndentedString(catalogName)).append("\n");
        sb.append("    databaseNamePattern: ").append(toIndentedString(databaseNamePattern)).append("\n");
        sb.append("    tableNamePattern: ").append(toIndentedString(tableNamePattern)).append("\n");
        sb.append("    tableTypes: ").append(toIndentedString(tableTypes)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    reversePage: ").append(toIndentedString(reversePage)).append("\n");
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
