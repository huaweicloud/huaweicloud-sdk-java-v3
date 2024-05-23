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
 * PermissionSetPermissionCreateDTO
 */
public class PermissionSetPermissionCreateDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dw_id")

    private String dwId;

    /**
     * 权限类型, DENY, ALLOW
     */
    public static final class PermissionTypeEnum {

        /**
         * Enum DENY for value: "DENY"
         */
        public static final PermissionTypeEnum DENY = new PermissionTypeEnum("DENY");

        /**
         * Enum ALLOW for value: "ALLOW"
         */
        public static final PermissionTypeEnum ALLOW = new PermissionTypeEnum("ALLOW");

        private static final Map<String, PermissionTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PermissionTypeEnum> createStaticFields() {
            Map<String, PermissionTypeEnum> map = new HashMap<>();
            map.put("DENY", DENY);
            map.put("ALLOW", ALLOW);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PermissionTypeEnum(String value) {
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
        public static PermissionTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PermissionTypeEnum(value));
        }

        public static PermissionTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PermissionTypeEnum) {
                return this.value.equals(((PermissionTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_type")

    private PermissionTypeEnum permissionType;

    /**
     * 权限操作,ALL,SELECT,UPDATE,CREATE,DROP,ALTER,INDEX,LOCK,READ,WRITE
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

    private List<PermissionActionsEnum> permissionActions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

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
    @JsonProperty(value = "database_name")

    private String databaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema_name")

    private String schemaName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_name")

    private String columnName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "row_level_security")

    private String rowLevelSecurity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    public PermissionSetPermissionCreateDTO withDwId(String dwId) {
        this.dwId = dwId;
        return this;
    }

    /**
     * 数据连接id
     * @return dwId
     */
    public String getDwId() {
        return dwId;
    }

    public void setDwId(String dwId) {
        this.dwId = dwId;
    }

    public PermissionSetPermissionCreateDTO withPermissionType(PermissionTypeEnum permissionType) {
        this.permissionType = permissionType;
        return this;
    }

    /**
     * 权限类型, DENY, ALLOW
     * @return permissionType
     */
    public PermissionTypeEnum getPermissionType() {
        return permissionType;
    }

    public void setPermissionType(PermissionTypeEnum permissionType) {
        this.permissionType = permissionType;
    }

    public PermissionSetPermissionCreateDTO withPermissionActions(List<PermissionActionsEnum> permissionActions) {
        this.permissionActions = permissionActions;
        return this;
    }

    public PermissionSetPermissionCreateDTO addPermissionActionsItem(PermissionActionsEnum permissionActionsItem) {
        if (this.permissionActions == null) {
            this.permissionActions = new ArrayList<>();
        }
        this.permissionActions.add(permissionActionsItem);
        return this;
    }

    public PermissionSetPermissionCreateDTO withPermissionActions(
        Consumer<List<PermissionActionsEnum>> permissionActionsSetter) {
        if (this.permissionActions == null) {
            this.permissionActions = new ArrayList<>();
        }
        permissionActionsSetter.accept(this.permissionActions);
        return this;
    }

    /**
     * 权限操作列表
     * @return permissionActions
     */
    public List<PermissionActionsEnum> getPermissionActions() {
        return permissionActions;
    }

    public void setPermissionActions(List<PermissionActionsEnum> permissionActions) {
        this.permissionActions = permissionActions;
    }

    public PermissionSetPermissionCreateDTO withClusterId(String clusterId) {
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

    public PermissionSetPermissionCreateDTO withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * 集群名称
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public PermissionSetPermissionCreateDTO withDatasourceType(DatasourceTypeEnum datasourceType) {
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

    public PermissionSetPermissionCreateDTO withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * 数据库名称
     * @return databaseName
     */
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public PermissionSetPermissionCreateDTO withSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    /**
     * 模式名称
     * @return schemaName
     */
    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    public PermissionSetPermissionCreateDTO withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * 命名空间。无效参数，待下线。
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public PermissionSetPermissionCreateDTO withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * 表名称
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public PermissionSetPermissionCreateDTO withColumnName(String columnName) {
        this.columnName = columnName;
        return this;
    }

    /**
     * 列名称
     * @return columnName
     */
    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public PermissionSetPermissionCreateDTO withRowLevelSecurity(String rowLevelSecurity) {
        this.rowLevelSecurity = rowLevelSecurity;
        return this;
    }

    /**
     * 行级策略。无效参数，待下线。
     * @return rowLevelSecurity
     */
    public String getRowLevelSecurity() {
        return rowLevelSecurity;
    }

    public void setRowLevelSecurity(String rowLevelSecurity) {
        this.rowLevelSecurity = rowLevelSecurity;
    }

    public PermissionSetPermissionCreateDTO withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * url路径名称, MRS存算分离或者HIVE指定location场景下使用。
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PermissionSetPermissionCreateDTO that = (PermissionSetPermissionCreateDTO) obj;
        return Objects.equals(this.dwId, that.dwId) && Objects.equals(this.permissionType, that.permissionType)
            && Objects.equals(this.permissionActions, that.permissionActions)
            && Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.clusterName, that.clusterName)
            && Objects.equals(this.datasourceType, that.datasourceType)
            && Objects.equals(this.databaseName, that.databaseName) && Objects.equals(this.schemaName, that.schemaName)
            && Objects.equals(this.namespace, that.namespace) && Objects.equals(this.tableName, that.tableName)
            && Objects.equals(this.columnName, that.columnName)
            && Objects.equals(this.rowLevelSecurity, that.rowLevelSecurity) && Objects.equals(this.url, that.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dwId,
            permissionType,
            permissionActions,
            clusterId,
            clusterName,
            datasourceType,
            databaseName,
            schemaName,
            namespace,
            tableName,
            columnName,
            rowLevelSecurity,
            url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PermissionSetPermissionCreateDTO {\n");
        sb.append("    dwId: ").append(toIndentedString(dwId)).append("\n");
        sb.append("    permissionType: ").append(toIndentedString(permissionType)).append("\n");
        sb.append("    permissionActions: ").append(toIndentedString(permissionActions)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    datasourceType: ").append(toIndentedString(datasourceType)).append("\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
        sb.append("    rowLevelSecurity: ").append(toIndentedString(rowLevelSecurity)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
