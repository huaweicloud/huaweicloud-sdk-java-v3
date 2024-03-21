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
 * RoleActionQueryDTO
 */
public class RoleActionQueryDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_permission_set_id")

    private String parentPermissionSetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    /**
     * 数据源类型, HIVE
     */
    public static final class DatasourceTypeEnum {

        /**
         * Enum HIVE for value: "HIVE"
         */
        public static final DatasourceTypeEnum HIVE = new DatasourceTypeEnum("HIVE");

        private static final Map<String, DatasourceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DatasourceTypeEnum> createStaticFields() {
            Map<String, DatasourceTypeEnum> map = new HashMap<>();
            map.put("HIVE", HIVE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        DatasourceTypeEnum(String value) {
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
        public static DatasourceTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DatasourceTypeEnum(value));
        }

        public static DatasourceTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DatasourceTypeEnum) {
                return this.value.equals(((DatasourceTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datasource_type")

    private DatasourceTypeEnum datasourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_names")

    private List<String> databaseNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schemas")

    private List<String> schemas = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_names")

    private List<String> tableNames = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_names")

    private List<String> columnNames = null;

    public RoleActionQueryDTO withParentPermissionSetId(String parentPermissionSetId) {
        this.parentPermissionSetId = parentPermissionSetId;
        return this;
    }

    /**
     * 父权限集id
     * @return parentPermissionSetId
     */
    public String getParentPermissionSetId() {
        return parentPermissionSetId;
    }

    public void setParentPermissionSetId(String parentPermissionSetId) {
        this.parentPermissionSetId = parentPermissionSetId;
    }

    public RoleActionQueryDTO withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 集群id
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public RoleActionQueryDTO withDatasourceType(DatasourceTypeEnum datasourceType) {
        this.datasourceType = datasourceType;
        return this;
    }

    /**
     * 数据源类型, HIVE
     * @return datasourceType
     */
    public DatasourceTypeEnum getDatasourceType() {
        return datasourceType;
    }

    public void setDatasourceType(DatasourceTypeEnum datasourceType) {
        this.datasourceType = datasourceType;
    }

    public RoleActionQueryDTO withDatabaseNames(List<String> databaseNames) {
        this.databaseNames = databaseNames;
        return this;
    }

    public RoleActionQueryDTO addDatabaseNamesItem(String databaseNamesItem) {
        if (this.databaseNames == null) {
            this.databaseNames = new ArrayList<>();
        }
        this.databaseNames.add(databaseNamesItem);
        return this;
    }

    public RoleActionQueryDTO withDatabaseNames(Consumer<List<String>> databaseNamesSetter) {
        if (this.databaseNames == null) {
            this.databaseNames = new ArrayList<>();
        }
        databaseNamesSetter.accept(this.databaseNames);
        return this;
    }

    /**
     * 目前批量授权只支持单库下的多表授权，或同一集群下个多库授权，区分这两类可通过 传参中tables是否为空来判断
     * @return databaseNames
     */
    public List<String> getDatabaseNames() {
        return databaseNames;
    }

    public void setDatabaseNames(List<String> databaseNames) {
        this.databaseNames = databaseNames;
    }

    public RoleActionQueryDTO withSchemas(List<String> schemas) {
        this.schemas = schemas;
        return this;
    }

    public RoleActionQueryDTO addSchemasItem(String schemasItem) {
        if (this.schemas == null) {
            this.schemas = new ArrayList<>();
        }
        this.schemas.add(schemasItem);
        return this;
    }

    public RoleActionQueryDTO withSchemas(Consumer<List<String>> schemasSetter) {
        if (this.schemas == null) {
            this.schemas = new ArrayList<>();
        }
        schemasSetter.accept(this.schemas);
        return this;
    }

    /**
     * dws权限涉及 schema，预留字段，在做DWS批量授权时应保持单schema下的批量授权，或者对单库下schema批量授权
     * @return schemas
     */
    public List<String> getSchemas() {
        return schemas;
    }

    public void setSchemas(List<String> schemas) {
        this.schemas = schemas;
    }

    public RoleActionQueryDTO withTableNames(List<String> tableNames) {
        this.tableNames = tableNames;
        return this;
    }

    public RoleActionQueryDTO addTableNamesItem(String tableNamesItem) {
        if (this.tableNames == null) {
            this.tableNames = new ArrayList<>();
        }
        this.tableNames.add(tableNamesItem);
        return this;
    }

    public RoleActionQueryDTO withTableNames(Consumer<List<String>> tableNamesSetter) {
        if (this.tableNames == null) {
            this.tableNames = new ArrayList<>();
        }
        tableNamesSetter.accept(this.tableNames);
        return this;
    }

    /**
     * 数据表列表
     * @return tableNames
     */
    public List<String> getTableNames() {
        return tableNames;
    }

    public void setTableNames(List<String> tableNames) {
        this.tableNames = tableNames;
    }

    public RoleActionQueryDTO withColumnNames(List<String> columnNames) {
        this.columnNames = columnNames;
        return this;
    }

    public RoleActionQueryDTO addColumnNamesItem(String columnNamesItem) {
        if (this.columnNames == null) {
            this.columnNames = new ArrayList<>();
        }
        this.columnNames.add(columnNamesItem);
        return this;
    }

    public RoleActionQueryDTO withColumnNames(Consumer<List<String>> columnNamesSetter) {
        if (this.columnNames == null) {
            this.columnNames = new ArrayList<>();
        }
        columnNamesSetter.accept(this.columnNames);
        return this;
    }

    /**
     * 数据字段列表
     * @return columnNames
     */
    public List<String> getColumnNames() {
        return columnNames;
    }

    public void setColumnNames(List<String> columnNames) {
        this.columnNames = columnNames;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RoleActionQueryDTO that = (RoleActionQueryDTO) obj;
        return Objects.equals(this.parentPermissionSetId, that.parentPermissionSetId)
            && Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.datasourceType, that.datasourceType)
            && Objects.equals(this.databaseNames, that.databaseNames) && Objects.equals(this.schemas, that.schemas)
            && Objects.equals(this.tableNames, that.tableNames) && Objects.equals(this.columnNames, that.columnNames);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(parentPermissionSetId, clusterId, datasourceType, databaseNames, schemas, tableNames, columnNames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RoleActionQueryDTO {\n");
        sb.append("    parentPermissionSetId: ").append(toIndentedString(parentPermissionSetId)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    datasourceType: ").append(toIndentedString(datasourceType)).append("\n");
        sb.append("    databaseNames: ").append(toIndentedString(databaseNames)).append("\n");
        sb.append("    schemas: ").append(toIndentedString(schemas)).append("\n");
        sb.append("    tableNames: ").append(toIndentedString(tableNames)).append("\n");
        sb.append("    columnNames: ").append(toIndentedString(columnNames)).append("\n");
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
