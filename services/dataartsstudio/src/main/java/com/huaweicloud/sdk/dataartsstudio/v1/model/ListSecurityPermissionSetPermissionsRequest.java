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
 * Request Object
 */
public class ListSecurityPermissionSetPermissionsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_set_id")

    private String permissionSetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace")

    private String workspace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    /**
     * 权限类型,DENY,ALLOW
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
    public static final class PermissionActionEnum {

        /**
         * Enum ALL for value: "ALL"
         */
        public static final PermissionActionEnum ALL = new PermissionActionEnum("ALL");

        /**
         * Enum SELECT for value: "SELECT"
         */
        public static final PermissionActionEnum SELECT = new PermissionActionEnum("SELECT");

        /**
         * Enum UPDATE for value: "UPDATE"
         */
        public static final PermissionActionEnum UPDATE = new PermissionActionEnum("UPDATE");

        /**
         * Enum CREATE for value: "CREATE"
         */
        public static final PermissionActionEnum CREATE = new PermissionActionEnum("CREATE");

        /**
         * Enum DROP for value: "DROP"
         */
        public static final PermissionActionEnum DROP = new PermissionActionEnum("DROP");

        /**
         * Enum ALTER for value: "ALTER"
         */
        public static final PermissionActionEnum ALTER = new PermissionActionEnum("ALTER");

        /**
         * Enum INDEX for value: "INDEX"
         */
        public static final PermissionActionEnum INDEX = new PermissionActionEnum("INDEX");

        /**
         * Enum LOCK for value: "LOCK"
         */
        public static final PermissionActionEnum LOCK = new PermissionActionEnum("LOCK");

        /**
         * Enum READ for value: "READ"
         */
        public static final PermissionActionEnum READ = new PermissionActionEnum("READ");

        /**
         * Enum WRITE for value: "WRITE"
         */
        public static final PermissionActionEnum WRITE = new PermissionActionEnum("WRITE");

        private static final Map<String, PermissionActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PermissionActionEnum> createStaticFields() {
            Map<String, PermissionActionEnum> map = new HashMap<>();
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

        PermissionActionEnum(String value) {
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
        public static PermissionActionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PermissionActionEnum(value));
        }

        public static PermissionActionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PermissionActionEnum) {
                return this.value.equals(((PermissionActionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permission_action")

    private PermissionActionEnum permissionAction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    /**
     * 数据源类型,HIVE
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
    @JsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_name")

    private String columnName;

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

    /**
     * 排序参数, CLUSTER_NAME, DATABASE_NAME
     */
    public static final class OrderByEnum {

        /**
         * Enum CLUSTER_NAME for value: "CLUSTER_NAME"
         */
        public static final OrderByEnum CLUSTER_NAME = new OrderByEnum("CLUSTER_NAME");

        /**
         * Enum DATABASE_NAME for value: "DATABASE_NAME"
         */
        public static final OrderByEnum DATABASE_NAME = new OrderByEnum("DATABASE_NAME");

        private static final Map<String, OrderByEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OrderByEnum> createStaticFields() {
            Map<String, OrderByEnum> map = new HashMap<>();
            map.put("CLUSTER_NAME", CLUSTER_NAME);
            map.put("DATABASE_NAME", DATABASE_NAME);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OrderByEnum(String value) {
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
        public static OrderByEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OrderByEnum(value));
        }

        public static OrderByEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OrderByEnum) {
                return this.value.equals(((OrderByEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_by")

    private OrderByEnum orderBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_by_asc")

    private Boolean orderByAsc;

    public ListSecurityPermissionSetPermissionsRequest withPermissionSetId(String permissionSetId) {
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

    public ListSecurityPermissionSetPermissionsRequest withWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }

    /**
     * workspace 信息
     * @return workspace
     */
    public String getWorkspace() {
        return workspace;
    }

    public void setWorkspace(String workspace) {
        this.workspace = workspace;
    }

    public ListSecurityPermissionSetPermissionsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * limit
     * minimum: 0
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListSecurityPermissionSetPermissionsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * offset
     * minimum: 0
     * maximum: 99999
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListSecurityPermissionSetPermissionsRequest withPermissionType(PermissionTypeEnum permissionType) {
        this.permissionType = permissionType;
        return this;
    }

    /**
     * 权限类型,DENY,ALLOW
     * @return permissionType
     */
    public PermissionTypeEnum getPermissionType() {
        return permissionType;
    }

    public void setPermissionType(PermissionTypeEnum permissionType) {
        this.permissionType = permissionType;
    }

    public ListSecurityPermissionSetPermissionsRequest withPermissionAction(PermissionActionEnum permissionAction) {
        this.permissionAction = permissionAction;
        return this;
    }

    /**
     * 权限操作,ALL,SELECT,UPDATE,CREATE,DROP,ALTER,INDEX,LOCK,READ,WRITE
     * @return permissionAction
     */
    public PermissionActionEnum getPermissionAction() {
        return permissionAction;
    }

    public void setPermissionAction(PermissionActionEnum permissionAction) {
        this.permissionAction = permissionAction;
    }

    public ListSecurityPermissionSetPermissionsRequest withClusterId(String clusterId) {
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

    public ListSecurityPermissionSetPermissionsRequest withClusterName(String clusterName) {
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

    public ListSecurityPermissionSetPermissionsRequest withDatasourceType(DatasourceTypeEnum datasourceType) {
        this.datasourceType = datasourceType;
        return this;
    }

    /**
     * 数据源类型,HIVE
     * @return datasourceType
     */
    public DatasourceTypeEnum getDatasourceType() {
        return datasourceType;
    }

    public void setDatasourceType(DatasourceTypeEnum datasourceType) {
        this.datasourceType = datasourceType;
    }

    public ListSecurityPermissionSetPermissionsRequest withDatabaseName(String databaseName) {
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

    public ListSecurityPermissionSetPermissionsRequest withTableName(String tableName) {
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

    public ListSecurityPermissionSetPermissionsRequest withColumnName(String columnName) {
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

    public ListSecurityPermissionSetPermissionsRequest withSyncStatus(SyncStatusEnum syncStatus) {
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

    public ListSecurityPermissionSetPermissionsRequest withOrderBy(OrderByEnum orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    /**
     * 排序参数, CLUSTER_NAME, DATABASE_NAME
     * @return orderBy
     */
    public OrderByEnum getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(OrderByEnum orderBy) {
        this.orderBy = orderBy;
    }

    public ListSecurityPermissionSetPermissionsRequest withOrderByAsc(Boolean orderByAsc) {
        this.orderByAsc = orderByAsc;
        return this;
    }

    /**
     * 是否升序（仅指定排序参数时有效）
     * @return orderByAsc
     */
    public Boolean getOrderByAsc() {
        return orderByAsc;
    }

    public void setOrderByAsc(Boolean orderByAsc) {
        this.orderByAsc = orderByAsc;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSecurityPermissionSetPermissionsRequest that = (ListSecurityPermissionSetPermissionsRequest) obj;
        return Objects.equals(this.permissionSetId, that.permissionSetId)
            && Objects.equals(this.workspace, that.workspace) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.permissionType, that.permissionType)
            && Objects.equals(this.permissionAction, that.permissionAction)
            && Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.clusterName, that.clusterName)
            && Objects.equals(this.datasourceType, that.datasourceType)
            && Objects.equals(this.databaseName, that.databaseName) && Objects.equals(this.tableName, that.tableName)
            && Objects.equals(this.columnName, that.columnName) && Objects.equals(this.syncStatus, that.syncStatus)
            && Objects.equals(this.orderBy, that.orderBy) && Objects.equals(this.orderByAsc, that.orderByAsc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(permissionSetId,
            workspace,
            limit,
            offset,
            permissionType,
            permissionAction,
            clusterId,
            clusterName,
            datasourceType,
            databaseName,
            tableName,
            columnName,
            syncStatus,
            orderBy,
            orderByAsc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSecurityPermissionSetPermissionsRequest {\n");
        sb.append("    permissionSetId: ").append(toIndentedString(permissionSetId)).append("\n");
        sb.append("    workspace: ").append(toIndentedString(workspace)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    permissionType: ").append(toIndentedString(permissionType)).append("\n");
        sb.append("    permissionAction: ").append(toIndentedString(permissionAction)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    datasourceType: ").append(toIndentedString(datasourceType)).append("\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
        sb.append("    syncStatus: ").append(toIndentedString(syncStatus)).append("\n");
        sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
        sb.append("    orderByAsc: ").append(toIndentedString(orderByAsc)).append("\n");
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
