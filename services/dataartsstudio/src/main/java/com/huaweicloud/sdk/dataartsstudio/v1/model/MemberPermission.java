package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 用户权限详情
 */
public class MemberPermission {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_set_id")

    private String permissionSetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_source")

    private String permissionSource;

    /**
     * 权限类别,ALL,SELECT,UPDATE,CREATE,DROP,ALTER,INDEX,LOCK,READ,WRITE
     */
    public static final class PermissionActionsEnum {

        /**
         * Enum ALL for value: "ALL"
         */
        public static final PermissionActionsEnum ALL = new PermissionActionsEnum("ALL");

        /**
         * Enum SELECT for value: "SELECT"
         */
        public static final PermissionActionsEnum SELECT = new PermissionActionsEnum("SELECT");

        /**
         * Enum UPDATE for value: "UPDATE"
         */
        public static final PermissionActionsEnum UPDATE = new PermissionActionsEnum("UPDATE");

        /**
         * Enum CREATE for value: "CREATE"
         */
        public static final PermissionActionsEnum CREATE = new PermissionActionsEnum("CREATE");

        /**
         * Enum DROP for value: "DROP"
         */
        public static final PermissionActionsEnum DROP = new PermissionActionsEnum("DROP");

        /**
         * Enum ALTER for value: "ALTER"
         */
        public static final PermissionActionsEnum ALTER = new PermissionActionsEnum("ALTER");

        /**
         * Enum INDEX for value: "INDEX"
         */
        public static final PermissionActionsEnum INDEX = new PermissionActionsEnum("INDEX");

        /**
         * Enum LOCK for value: "LOCK"
         */
        public static final PermissionActionsEnum LOCK = new PermissionActionsEnum("LOCK");

        /**
         * Enum READ for value: "READ"
         */
        public static final PermissionActionsEnum READ = new PermissionActionsEnum("READ");

        /**
         * Enum WRITE for value: "WRITE"
         */
        public static final PermissionActionsEnum WRITE = new PermissionActionsEnum("WRITE");

        private static final Map<String, PermissionActionsEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PermissionActionsEnum> createStaticFields() {
            Map<String, PermissionActionsEnum> map = new HashMap<>();
            map.put("ALL", ALL);
            map.put("SELECT", SELECT);
            map.put("UPDATE", UPDATE);
            map.put("CREATE", CREATE);
            map.put("DROP", DROP);
            map.put("ALTER", ALTER);
            map.put("INDEX", INDEX);
            map.put("LOCK", LOCK);
            map.put("READ", READ);
            map.put("WRITE", WRITE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PermissionActionsEnum(String value) {
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
        public static PermissionActionsEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PermissionActionsEnum(value));
        }

        public static PermissionActionsEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PermissionActionsEnum) {
                return this.value.equals(((PermissionActionsEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_actions")

    private PermissionActionsEnum permissionActions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datasource_type")

    private String datasourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    private String databaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema_name")

    private String schemaName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_name")

    private String columnName;

    public MemberPermission withPermissionSetId(String permissionSetId) {
        this.permissionSetId = permissionSetId;
        return this;
    }

    /**
     * 权限集ID
     * @return permissionSetId
     */
    public String getPermissionSetId() {
        return permissionSetId;
    }

    public void setPermissionSetId(String permissionSetId) {
        this.permissionSetId = permissionSetId;
    }

    public MemberPermission withPermissionSource(String permissionSource) {
        this.permissionSource = permissionSource;
        return this;
    }

    /**
     * 权限来源：1、权限集名称。2、权限审批
     * @return permissionSource
     */
    public String getPermissionSource() {
        return permissionSource;
    }

    public void setPermissionSource(String permissionSource) {
        this.permissionSource = permissionSource;
    }

    public MemberPermission withPermissionActions(PermissionActionsEnum permissionActions) {
        this.permissionActions = permissionActions;
        return this;
    }

    /**
     * 权限类别,ALL,SELECT,UPDATE,CREATE,DROP,ALTER,INDEX,LOCK,READ,WRITE
     * @return permissionActions
     */
    public PermissionActionsEnum getPermissionActions() {
        return permissionActions;
    }

    public void setPermissionActions(PermissionActionsEnum permissionActions) {
        this.permissionActions = permissionActions;
    }

    public MemberPermission withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * Hive数据源，指定url权限的策略信息
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public MemberPermission withDatasourceType(String datasourceType) {
        this.datasourceType = datasourceType;
        return this;
    }

    /**
     * 数据源类型
     * @return datasourceType
     */
    public String getDatasourceType() {
        return datasourceType;
    }

    public void setDatasourceType(String datasourceType) {
        this.datasourceType = datasourceType;
    }

    public MemberPermission withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * 集群名
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public MemberPermission withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * 数据库名
     * @return databaseName
     */
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public MemberPermission withSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    /**
     * schema名
     * @return schemaName
     */
    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    public MemberPermission withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * 表名
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public MemberPermission withColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }

    /**
     * 列名
     * @return columnName
     */
    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MemberPermission that = (MemberPermission) obj;
        return Objects.equals(this.permissionSetId, that.permissionSetId)
            && Objects.equals(this.permissionSource, that.permissionSource)
            && Objects.equals(this.permissionActions, that.permissionActions) && Objects.equals(this.url, that.url)
            && Objects.equals(this.datasourceType, that.datasourceType)
            && Objects.equals(this.clusterName, that.clusterName)
            && Objects.equals(this.databaseName, that.databaseName) && Objects.equals(this.schemaName, that.schemaName)
            && Objects.equals(this.tableName, that.tableName) && Objects.equals(this.columnName, that.columnName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(permissionSetId,
            permissionSource,
            permissionActions,
            url,
            datasourceType,
            clusterName,
            databaseName,
            schemaName,
            tableName,
            columnName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MemberPermission {\n");
        sb.append("    permissionSetId: ").append(toIndentedString(permissionSetId)).append("\n");
        sb.append("    permissionSource: ").append(toIndentedString(permissionSource)).append("\n");
        sb.append("    permissionActions: ").append(toIndentedString(permissionActions)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    datasourceType: ").append(toIndentedString(datasourceType)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
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
