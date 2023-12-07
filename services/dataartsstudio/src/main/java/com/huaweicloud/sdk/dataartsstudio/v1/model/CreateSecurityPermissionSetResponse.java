package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateSecurityPermissionSetResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_id")

    private String parentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    /**
     * 权限集类型, COMMON, MRS_MANAGED
     */
    public static final class TypeEnum {

        /**
         * Enum COMMON for value: "COMMON"
         */
        public static final TypeEnum COMMON = new TypeEnum("COMMON");

        /**
         * Enum MRS_MANAGED for value: "MRS_MANAGED"
         */
        public static final TypeEnum MRS_MANAGED = new TypeEnum("MRS_MANAGED");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("COMMON", COMMON);
            map.put("MRS_MANAGED", MRS_MANAGED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "managed_cluster_id")

    private String managedClusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "managed_cluster_name")

    private String managedClusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manager_id")

    private String managerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manager_name")

    private String managerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manager_type")

    private String managerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datasource_type")

    private String datasourceType;

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
    @JsonProperty(value = "sync_time")

    private Long syncTime;

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

    public CreateSecurityPermissionSetResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 编号
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CreateSecurityPermissionSetResponse withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * 父权限集id
     * @return parentId
     */
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public CreateSecurityPermissionSetResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateSecurityPermissionSetResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateSecurityPermissionSetResponse withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 权限集类型, COMMON, MRS_MANAGED
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public CreateSecurityPermissionSetResponse withManagedClusterId(String managedClusterId) {
        this.managedClusterId = managedClusterId;
        return this;
    }

    /**
     * 纳管角色所在集群id（仅纳管类权限集需要）
     * @return managedClusterId
     */
    public String getManagedClusterId() {
        return managedClusterId;
    }

    public void setManagedClusterId(String managedClusterId) {
        this.managedClusterId = managedClusterId;
    }

    public CreateSecurityPermissionSetResponse withManagedClusterName(String managedClusterName) {
        this.managedClusterName = managedClusterName;
        return this;
    }

    /**
     * 纳管角色所在集群名称（仅纳管类权限集需要）
     * @return managedClusterName
     */
    public String getManagedClusterName() {
        return managedClusterName;
    }

    public void setManagedClusterName(String managedClusterName) {
        this.managedClusterName = managedClusterName;
    }

    public CreateSecurityPermissionSetResponse withProjectId(String projectId) {
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

    public CreateSecurityPermissionSetResponse withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 租户id
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public CreateSecurityPermissionSetResponse withInstanceId(String instanceId) {
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

    public CreateSecurityPermissionSetResponse withManagerId(String managerId) {
        this.managerId = managerId;
        return this;
    }

    /**
     * 管理员id
     * @return managerId
     */
    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public CreateSecurityPermissionSetResponse withManagerName(String managerName) {
        this.managerName = managerName;
        return this;
    }

    /**
     * 管理员名称
     * @return managerName
     */
    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public CreateSecurityPermissionSetResponse withManagerType(String managerType) {
        this.managerType = managerType;
        return this;
    }

    /**
     * 管理员类型
     * @return managerType
     */
    public String getManagerType() {
        return managerType;
    }

    public void setManagerType(String managerType) {
        this.managerType = managerType;
    }

    public CreateSecurityPermissionSetResponse withDatasourceType(String datasourceType) {
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

    public CreateSecurityPermissionSetResponse withSyncStatus(SyncStatusEnum syncStatus) {
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

    public CreateSecurityPermissionSetResponse withSyncMsg(String syncMsg) {
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

    public CreateSecurityPermissionSetResponse withSyncTime(Long syncTime) {
        this.syncTime = syncTime;
        return this;
    }

    /**
     * 同步时间
     * minimum: 0
     * maximum: 2147483647
     * @return syncTime
     */
    public Long getSyncTime() {
        return syncTime;
    }

    public void setSyncTime(Long syncTime) {
        this.syncTime = syncTime;
    }

    public CreateSecurityPermissionSetResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * minimum: 0
     * maximum: 2147483647
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public CreateSecurityPermissionSetResponse withCreateUser(String createUser) {
        this.createUser = createUser;
        return this;
    }

    /**
     * 创建者
     * @return createUser
     */
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public CreateSecurityPermissionSetResponse withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * minimum: 0
     * maximum: 2147483647
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public CreateSecurityPermissionSetResponse withUpdateUser(String updateUser) {
        this.updateUser = updateUser;
        return this;
    }

    /**
     * 更新者
     * @return updateUser
     */
    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateSecurityPermissionSetResponse that = (CreateSecurityPermissionSetResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.parentId, that.parentId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.type, that.type) && Objects.equals(this.managedClusterId, that.managedClusterId)
            && Objects.equals(this.managedClusterName, that.managedClusterName)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.managerId, that.managerId)
            && Objects.equals(this.managerName, that.managerName) && Objects.equals(this.managerType, that.managerType)
            && Objects.equals(this.datasourceType, that.datasourceType)
            && Objects.equals(this.syncStatus, that.syncStatus) && Objects.equals(this.syncMsg, that.syncMsg)
            && Objects.equals(this.syncTime, that.syncTime) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.createUser, that.createUser) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.updateUser, that.updateUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            parentId,
            name,
            description,
            type,
            managedClusterId,
            managedClusterName,
            projectId,
            domainId,
            instanceId,
            managerId,
            managerName,
            managerType,
            datasourceType,
            syncStatus,
            syncMsg,
            syncTime,
            createTime,
            createUser,
            updateTime,
            updateUser);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSecurityPermissionSetResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    managedClusterId: ").append(toIndentedString(managedClusterId)).append("\n");
        sb.append("    managedClusterName: ").append(toIndentedString(managedClusterName)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    managerId: ").append(toIndentedString(managerId)).append("\n");
        sb.append("    managerName: ").append(toIndentedString(managerName)).append("\n");
        sb.append("    managerType: ").append(toIndentedString(managerType)).append("\n");
        sb.append("    datasourceType: ").append(toIndentedString(datasourceType)).append("\n");
        sb.append("    syncStatus: ").append(toIndentedString(syncStatus)).append("\n");
        sb.append("    syncMsg: ").append(toIndentedString(syncMsg)).append("\n");
        sb.append("    syncTime: ").append(toIndentedString(syncTime)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    updateUser: ").append(toIndentedString(updateUser)).append("\n");
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
