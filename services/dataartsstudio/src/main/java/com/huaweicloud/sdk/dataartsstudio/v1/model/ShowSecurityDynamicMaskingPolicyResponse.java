package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowSecurityDynamicMaskingPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 数据源类型 - HIVE数据源 - DWS数据源 - [DLI数据源](tag:nohcs)
     */
    public static final class DatasourceTypeEnum {

        /**
         * Enum HIVE for value: "HIVE"
         */
        public static final DatasourceTypeEnum HIVE = new DatasourceTypeEnum("HIVE");

        /**
         * Enum DWS for value: "DWS"
         */
        public static final DatasourceTypeEnum DWS = new DatasourceTypeEnum("DWS");

        /**
         * Enum DLI for value: "DLI"
         */
        public static final DatasourceTypeEnum DLI = new DatasourceTypeEnum("DLI");

        private static final Map<String, DatasourceTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, DatasourceTypeEnum> createStaticFields() {
            Map<String, DatasourceTypeEnum> map = new HashMap<>();
            map.put("HIVE", HIVE);
            map.put("DWS", DWS);
            map.put("DLI", DLI);
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
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_name")

    private String databaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_id")

    private String tableId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_groups")

    private String userGroups;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "users")

    private String users;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conn_name")

    private String connName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conn_id")

    private String connId;

    /**
     * 同步状态： - UNKNOWN 未知状态 - NOT_SYNC 未同步 - SYNCING 同步中 - SYNC_SUCCESS 同步成功 - SYNC_FAIL 同步失败 - SYNC_PARTIAL_FAIL 存在失败 - DELETE_FAIL 删除失败 - DELETING 删除中 - UPDATING 更新中 - DATA_UPDATED 数据存在更新
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

        /**
         * Enum SYNC_PARTIAL_FAIL for value: "SYNC_PARTIAL_FAIL"
         */
        public static final SyncStatusEnum SYNC_PARTIAL_FAIL = new SyncStatusEnum("SYNC_PARTIAL_FAIL");

        /**
         * Enum DELETE_FAIL for value: "DELETE_FAIL"
         */
        public static final SyncStatusEnum DELETE_FAIL = new SyncStatusEnum("DELETE_FAIL");

        /**
         * Enum DELETING for value: "DELETING"
         */
        public static final SyncStatusEnum DELETING = new SyncStatusEnum("DELETING");

        /**
         * Enum UPDATING for value: "UPDATING"
         */
        public static final SyncStatusEnum UPDATING = new SyncStatusEnum("UPDATING");

        /**
         * Enum DATA_UPDATED for value: "DATA_UPDATED"
         */
        public static final SyncStatusEnum DATA_UPDATED = new SyncStatusEnum("DATA_UPDATED");

        private static final Map<String, SyncStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SyncStatusEnum> createStaticFields() {
            Map<String, SyncStatusEnum> map = new HashMap<>();
            map.put("UNKNOWN", UNKNOWN);
            map.put("NOT_SYNC", NOT_SYNC);
            map.put("SYNCING", SYNCING);
            map.put("SYNC_SUCCESS", SYNC_SUCCESS);
            map.put("SYNC_FAIL", SYNC_FAIL);
            map.put("SYNC_PARTIAL_FAIL", SYNC_PARTIAL_FAIL);
            map.put("DELETE_FAIL", DELETE_FAIL);
            map.put("DELETING", DELETING);
            map.put("UPDATING", UPDATING);
            map.put("DATA_UPDATED", DATA_UPDATED);
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
    @JsonProperty(value = "sync_log")

    private String syncLog;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_user")

    private String createUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_user")

    private String updateUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema_name")

    private String schemaName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_list")

    private List<DynamicMaskingPolicy> policyList = null;

    public ShowSecurityDynamicMaskingPolicyResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 策略id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowSecurityDynamicMaskingPolicyResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 策略名称。英文和汉字开头, 支持英文、汉字、数字、下划线, 2-64字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowSecurityDynamicMaskingPolicyResponse withDatasourceType(DatasourceTypeEnum datasourceType) {
        this.datasourceType = datasourceType;
        return this;
    }

    /**
     * 数据源类型 - HIVE数据源 - DWS数据源 - [DLI数据源](tag:nohcs)
     * @return datasourceType
     */
    public DatasourceTypeEnum getDatasourceType() {
        return datasourceType;
    }

    public void setDatasourceType(DatasourceTypeEnum datasourceType) {
        this.datasourceType = datasourceType;
    }

    public ShowSecurityDynamicMaskingPolicyResponse withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 集群id。请于集群管理页面查看集群ID信息。[当数据源类型为DLI时，该参数需要填写为DLI](tag:nohcs)。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public ShowSecurityDynamicMaskingPolicyResponse withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * 集群名称。请于集群管理页面查看集群名称信息。[当数据源类型为DLI时，该参数需要填写为DLI](tag:nohcs)。
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public ShowSecurityDynamicMaskingPolicyResponse withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * 数据库名称。获取方法请参见[获取数据源中的表](getDataTables.html)。
     * @return databaseName
     */
    public String getDatabaseName() {
        return databaseName;
    }

    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public ShowSecurityDynamicMaskingPolicyResponse withTableId(String tableId) {
        this.tableId = tableId;
        return this;
    }

    /**
     * 数据表id，获取方法请参见[获取数据源中的表](getDataTables.html)。
     * @return tableId
     */
    public String getTableId() {
        return tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    public ShowSecurityDynamicMaskingPolicyResponse withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * 数据表名称, 获取方法请参见[获取数据源中的表](getDataTables.html)。
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public ShowSecurityDynamicMaskingPolicyResponse withUserGroups(String userGroups) {
        this.userGroups = userGroups;
        return this;
    }

    /**
     * 用户组列表，用户组名称逗号分隔（非必填项，但用户、用户组必须二选其一进行配置）。例如：\"userGroup1,userGroup2\"。
     * @return userGroups
     */
    public String getUserGroups() {
        return userGroups;
    }

    public void setUserGroups(String userGroups) {
        this.userGroups = userGroups;
    }

    public ShowSecurityDynamicMaskingPolicyResponse withUsers(String users) {
        this.users = users;
        return this;
    }

    /**
     * 用户列表，用户名称逗号分隔（非必填项，但用户、用户组必须二选其一进行配置），例如：\"user1,user2\"。
     * @return users
     */
    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
    }

    public ShowSecurityDynamicMaskingPolicyResponse withConnName(String connName) {
        this.connName = connName;
        return this;
    }

    /**
     * 数据连接名称，获取方法请参见[查询数据连接列表](ListDataconnections.html)。
     * @return connName
     */
    public String getConnName() {
        return connName;
    }

    public void setConnName(String connName) {
        this.connName = connName;
    }

    public ShowSecurityDynamicMaskingPolicyResponse withConnId(String connId) {
        this.connId = connId;
        return this;
    }

    /**
     * 数据连接id，获取方法请参见[查询数据连接列表](ListDataconnections.html)。
     * @return connId
     */
    public String getConnId() {
        return connId;
    }

    public void setConnId(String connId) {
        this.connId = connId;
    }

    public ShowSecurityDynamicMaskingPolicyResponse withSyncStatus(SyncStatusEnum syncStatus) {
        this.syncStatus = syncStatus;
        return this;
    }

    /**
     * 同步状态： - UNKNOWN 未知状态 - NOT_SYNC 未同步 - SYNCING 同步中 - SYNC_SUCCESS 同步成功 - SYNC_FAIL 同步失败 - SYNC_PARTIAL_FAIL 存在失败 - DELETE_FAIL 删除失败 - DELETING 删除中 - UPDATING 更新中 - DATA_UPDATED 数据存在更新
     * @return syncStatus
     */
    public SyncStatusEnum getSyncStatus() {
        return syncStatus;
    }

    public void setSyncStatus(SyncStatusEnum syncStatus) {
        this.syncStatus = syncStatus;
    }

    public ShowSecurityDynamicMaskingPolicyResponse withSyncMsg(String syncMsg) {
        this.syncMsg = syncMsg;
        return this;
    }

    /**
     * 策略同步信息。
     * @return syncMsg
     */
    public String getSyncMsg() {
        return syncMsg;
    }

    public void setSyncMsg(String syncMsg) {
        this.syncMsg = syncMsg;
    }

    public ShowSecurityDynamicMaskingPolicyResponse withSyncLog(String syncLog) {
        this.syncLog = syncLog;
        return this;
    }

    /**
     * 同步运行日志, 格式为 字段同步信息+换行符。
     * @return syncLog
     */
    public String getSyncLog() {
        return syncLog;
    }

    public void setSyncLog(String syncLog) {
        this.syncLog = syncLog;
    }

    public ShowSecurityDynamicMaskingPolicyResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 策略创建时间。
     * minimum: 0
     * maximum: 4070880010000
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ShowSecurityDynamicMaskingPolicyResponse withCreateUser(String createUser) {
        this.createUser = createUser;
        return this;
    }

    /**
     * 策略创建者。
     * @return createUser
     */
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public ShowSecurityDynamicMaskingPolicyResponse withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 策略更新时间。
     * minimum: 0
     * maximum: 4070880010000
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public ShowSecurityDynamicMaskingPolicyResponse withUpdateUser(String updateUser) {
        this.updateUser = updateUser;
        return this;
    }

    /**
     * 策略更新者。
     * @return updateUser
     */
    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public ShowSecurityDynamicMaskingPolicyResponse withSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    /**
     * DWS数据源的模式名称。
     * @return schemaName
     */
    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    public ShowSecurityDynamicMaskingPolicyResponse withPolicyList(List<DynamicMaskingPolicy> policyList) {
        this.policyList = policyList;
        return this;
    }

    public ShowSecurityDynamicMaskingPolicyResponse addPolicyListItem(DynamicMaskingPolicy policyListItem) {
        if (this.policyList == null) {
            this.policyList = new ArrayList<>();
        }
        this.policyList.add(policyListItem);
        return this;
    }

    public ShowSecurityDynamicMaskingPolicyResponse withPolicyList(
        Consumer<List<DynamicMaskingPolicy>> policyListSetter) {
        if (this.policyList == null) {
            this.policyList = new ArrayList<>();
        }
        policyListSetter.accept(this.policyList);
        return this;
    }

    /**
     * 动态数据脱敏策略列表。
     * @return policyList
     */
    public List<DynamicMaskingPolicy> getPolicyList() {
        return policyList;
    }

    public void setPolicyList(List<DynamicMaskingPolicy> policyList) {
        this.policyList = policyList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowSecurityDynamicMaskingPolicyResponse that = (ShowSecurityDynamicMaskingPolicyResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.datasourceType, that.datasourceType)
            && Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.clusterName, that.clusterName)
            && Objects.equals(this.databaseName, that.databaseName) && Objects.equals(this.tableId, that.tableId)
            && Objects.equals(this.tableName, that.tableName) && Objects.equals(this.userGroups, that.userGroups)
            && Objects.equals(this.users, that.users) && Objects.equals(this.connName, that.connName)
            && Objects.equals(this.connId, that.connId) && Objects.equals(this.syncStatus, that.syncStatus)
            && Objects.equals(this.syncMsg, that.syncMsg) && Objects.equals(this.syncLog, that.syncLog)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.createUser, that.createUser)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.updateUser, that.updateUser)
            && Objects.equals(this.schemaName, that.schemaName) && Objects.equals(this.policyList, that.policyList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            datasourceType,
            clusterId,
            clusterName,
            databaseName,
            tableId,
            tableName,
            userGroups,
            users,
            connName,
            connId,
            syncStatus,
            syncMsg,
            syncLog,
            createTime,
            createUser,
            updateTime,
            updateUser,
            schemaName,
            policyList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSecurityDynamicMaskingPolicyResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    datasourceType: ").append(toIndentedString(datasourceType)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    databaseName: ").append(toIndentedString(databaseName)).append("\n");
        sb.append("    tableId: ").append(toIndentedString(tableId)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    userGroups: ").append(toIndentedString(userGroups)).append("\n");
        sb.append("    users: ").append(toIndentedString(users)).append("\n");
        sb.append("    connName: ").append(toIndentedString(connName)).append("\n");
        sb.append("    connId: ").append(toIndentedString(connId)).append("\n");
        sb.append("    syncStatus: ").append(toIndentedString(syncStatus)).append("\n");
        sb.append("    syncMsg: ").append(toIndentedString(syncMsg)).append("\n");
        sb.append("    syncLog: ").append(toIndentedString(syncLog)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    updateUser: ").append(toIndentedString(updateUser)).append("\n");
        sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
        sb.append("    policyList: ").append(toIndentedString(policyList)).append("\n");
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
