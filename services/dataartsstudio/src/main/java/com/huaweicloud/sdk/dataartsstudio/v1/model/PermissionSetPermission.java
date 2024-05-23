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
 * PermissionSetPermission
 */
public class PermissionSetPermission {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_set_id")

    private String permissionSetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_action")

    private String permissionAction;

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
    @JsonProperty(value = "permission_action_code")

    private Integer permissionActionCode;

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

    /**
     * 同步状态,UNKNOWN,NOT_SYNC,SYNCING,SYNC_SUCCESS,SYNC_FAIL
     */
    public static final class SyncStatusEnum {

        /**
         * Enum UNKNOWN for value: "UNKNOWN"
         */
        public static final SyncStatusEnum UNKNOWN = new SyncStatusEnum("UNKNOWN");

        /**
         * Enum NOT_SYNC for value: "NOT_SYNC"
         */
        public static final SyncStatusEnum NOT_SYNC = new SyncStatusEnum("NOT_SYNC");

        /**
         * Enum SYNCING for value: "SYNCING"
         */
        public static final SyncStatusEnum SYNCING = new SyncStatusEnum("SYNCING");

        /**
         * Enum SYNC_SUCCESS for value: "SYNC_SUCCESS"
         */
        public static final SyncStatusEnum SYNC_SUCCESS = new SyncStatusEnum("SYNC_SUCCESS");

        /**
         * Enum SYNC_FAIL for value: "SYNC_FAIL"
         */
        public static final SyncStatusEnum SYNC_FAIL = new SyncStatusEnum("SYNC_FAIL");

        private static final Map<String, SyncStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SyncStatusEnum> createStaticFields() {
            Map<String, SyncStatusEnum> map = new HashMap<>();
            map.put("UNKNOWN", UNKNOWN);
            map.put("NOT_SYNC", NOT_SYNC);
            map.put("SYNCING", SYNCING);
            map.put("SYNC_SUCCESS", SYNC_SUCCESS);
            map.put("SYNC_FAIL", SYNC_FAIL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SyncStatusEnum(String value) {
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
        public static SyncStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SyncStatusEnum(value));
        }

        public static SyncStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SyncStatusEnum) {
                return this.value.equals(((SyncStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sync_status")

    private SyncStatusEnum syncStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sync_msg")

    private String syncMsg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    public PermissionSetPermission withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PermissionSetPermission withPermissionSetId(String permissionSetId) {
        this.permissionSetId = permissionSetId;
        return this;
    }

    /**
     * 权限集id
     * @return permissionSetId
     */
    public String getPermissionSetId() {
        return permissionSetId;
    }

    public void setPermissionSetId(String permissionSetId) {
        this.permissionSetId = permissionSetId;
    }

    public PermissionSetPermission withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public PermissionSetPermission withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例id
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public PermissionSetPermission withPermissionType(PermissionTypeEnum permissionType) {
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

    public PermissionSetPermission withPermissionAction(String permissionAction) {
        this.permissionAction = permissionAction;
        return this;
    }

    /**
     * 权限操作列表
     * @return permissionAction
     */
    public String getPermissionAction() {
        return permissionAction;
    }

    public void setPermissionAction(String permissionAction) {
        this.permissionAction = permissionAction;
    }

    public PermissionSetPermission withPermissionActions(List<PermissionActionsEnum> permissionActions) {
        this.permissionActions = permissionActions;
        return this;
    }

    public PermissionSetPermission addPermissionActionsItem(PermissionActionsEnum permissionActionsItem) {
        if (this.permissionActions == null) {
            this.permissionActions = new ArrayList<>();
        }
        this.permissionActions.add(permissionActionsItem);
        return this;
    }

    public PermissionSetPermission withPermissionActions(
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

    public PermissionSetPermission withPermissionActionCode(Integer permissionActionCode) {
        this.permissionActionCode = permissionActionCode;
        return this;
    }

    /**
     * 权限操作编码, 位图
     * minimum: 0
     * maximum: 2147483647
     * @return permissionActionCode
     */
    public Integer getPermissionActionCode() {
        return permissionActionCode;
    }

    public void setPermissionActionCode(Integer permissionActionCode) {
        this.permissionActionCode = permissionActionCode;
    }

    public PermissionSetPermission withClusterId(String clusterId) {
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

    public PermissionSetPermission withClusterName(String clusterName) {
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

    public PermissionSetPermission withDatasourceType(DatasourceTypeEnum datasourceType) {
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

    public PermissionSetPermission withDatabaseName(String databaseName) {
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

    public PermissionSetPermission withSchemaName(String schemaName) {
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

    public PermissionSetPermission withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * 命名空间
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public PermissionSetPermission withTableName(String tableName) {
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

    public PermissionSetPermission withColumnName(String columnName) {
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

    public PermissionSetPermission withRowLevelSecurity(String rowLevelSecurity) {
        this.rowLevelSecurity = rowLevelSecurity;
        return this;
    }

    /**
     * 行级策略
     * @return rowLevelSecurity
     */
    public String getRowLevelSecurity() {
        return rowLevelSecurity;
    }

    public void setRowLevelSecurity(String rowLevelSecurity) {
        this.rowLevelSecurity = rowLevelSecurity;
    }

    public PermissionSetPermission withSyncStatus(SyncStatusEnum syncStatus) {
        this.syncStatus = syncStatus;
        return this;
    }

    /**
     * 同步状态,UNKNOWN,NOT_SYNC,SYNCING,SYNC_SUCCESS,SYNC_FAIL
     * @return syncStatus
     */
    public SyncStatusEnum getSyncStatus() {
        return syncStatus;
    }

    public void setSyncStatus(SyncStatusEnum syncStatus) {
        this.syncStatus = syncStatus;
    }

    public PermissionSetPermission withSyncMsg(String syncMsg) {
        this.syncMsg = syncMsg;
        return this;
    }

    /**
     * 同步信息
     * @return syncMsg
     */
    public String getSyncMsg() {
        return syncMsg;
    }

    public void setSyncMsg(String syncMsg) {
        this.syncMsg = syncMsg;
    }

    public PermissionSetPermission withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * url路径名称。
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
        PermissionSetPermission that = (PermissionSetPermission) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.permissionSetId, that.permissionSetId)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.permissionType, that.permissionType)
            && Objects.equals(this.permissionAction, that.permissionAction)
            && Objects.equals(this.permissionActions, that.permissionActions)
            && Objects.equals(this.permissionActionCode, that.permissionActionCode)
            && Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.clusterName, that.clusterName)
            && Objects.equals(this.datasourceType, that.datasourceType)
            && Objects.equals(this.databaseName, that.databaseName) && Objects.equals(this.schemaName, that.schemaName)
            && Objects.equals(this.namespace, that.namespace) && Objects.equals(this.tableName, that.tableName)
            && Objects.equals(this.columnName, that.columnName)
            && Objects.equals(this.rowLevelSecurity, that.rowLevelSecurity)
            && Objects.equals(this.syncStatus, that.syncStatus) && Objects.equals(this.syncMsg, that.syncMsg)
            && Objects.equals(this.url, that.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            permissionSetId,
            projectId,
            instanceId,
            permissionType,
            permissionAction,
            permissionActions,
            permissionActionCode,
            clusterId,
            clusterName,
            datasourceType,
            databaseName,
            schemaName,
            namespace,
            tableName,
            columnName,
            rowLevelSecurity,
            syncStatus,
            syncMsg,
            url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PermissionSetPermission {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    permissionSetId: ").append(toIndentedString(permissionSetId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    permissionType: ").append(toIndentedString(permissionType)).append("\n");
        sb.append("    permissionAction: ").append(toIndentedString(permissionAction)).append("\n");
        sb.append("    permissionActions: ").append(toIndentedString(permissionActions)).append("\n");
        sb.append("    permissionActionCode: ").append(toIndentedString(permissionActionCode)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    datasourceType: ").append(toIndentedString(datasourceType)).append("\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
        sb.append("    rowLevelSecurity: ").append(toIndentedString(rowLevelSecurity)).append("\n");
        sb.append("    syncStatus: ").append(toIndentedString(syncStatus)).append("\n");
        sb.append("    syncMsg: ").append(toIndentedString(syncMsg)).append("\n");
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
