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
public class ShowSecurityMemberSyncTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

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
    @JsonProperty(value = "data_connection_workspace")

    private String dataConnectionWorkspace;

    /**
     * 集群类型 * MRS集群 * DWS集群
     */
    public static final class ClusterTypeEnum {

        /**
         * Enum MRS for value: "MRS"
         */
        public static final ClusterTypeEnum MRS = new ClusterTypeEnum("MRS");

        /**
         * Enum DWS for value: "DWS"
         */
        public static final ClusterTypeEnum DWS = new ClusterTypeEnum("DWS");

        private static final Map<String, ClusterTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ClusterTypeEnum> createStaticFields() {
            Map<String, ClusterTypeEnum> map = new HashMap<>();
            map.put("MRS", MRS);
            map.put("DWS", DWS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ClusterTypeEnum(String value) {
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
        public static ClusterTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ClusterTypeEnum(value));
        }

        public static ClusterTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ClusterTypeEnum) {
                return this.value.equals(((ClusterTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_type")

    private ClusterTypeEnum clusterType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_connection_id")

    private String dataConnectionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_connection_name")

    private String dataConnectionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_name")

    private String clusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_start_hour")

    private Integer scheduleStartHour;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_end_hour")

    private Integer scheduleEndHour;

    /**
     * 调度周期 * MINUTE  分钟为单位调度 * HOUR    小时为单位调度
     */
    public static final class SchedulePeriodEnum {

        /**
         * Enum MINUTE for value: "MINUTE"
         */
        public static final SchedulePeriodEnum MINUTE = new SchedulePeriodEnum("MINUTE");

        /**
         * Enum HOUR for value: "HOUR"
         */
        public static final SchedulePeriodEnum HOUR = new SchedulePeriodEnum("HOUR");

        private static final Map<String, SchedulePeriodEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SchedulePeriodEnum> createStaticFields() {
            Map<String, SchedulePeriodEnum> map = new HashMap<>();
            map.put("MINUTE", MINUTE);
            map.put("HOUR", HOUR);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SchedulePeriodEnum(String value) {
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
        public static SchedulePeriodEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SchedulePeriodEnum(value));
        }

        public static SchedulePeriodEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SchedulePeriodEnum) {
                return this.value.equals(((SchedulePeriodEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_period")

    private SchedulePeriodEnum schedulePeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_interval")

    private Integer scheduleInterval;

    /**
     * 调度状态 * NOT_SCHEDULE  未启用任务调度 * SCHEDULING    任务调度中
     */
    public static final class ScheduleStatusEnum {

        /**
         * Enum NOT_SCHEDULE for value: "NOT_SCHEDULE"
         */
        public static final ScheduleStatusEnum NOT_SCHEDULE = new ScheduleStatusEnum("NOT_SCHEDULE");

        /**
         * Enum SCHEDULING for value: "SCHEDULING"
         */
        public static final ScheduleStatusEnum SCHEDULING = new ScheduleStatusEnum("SCHEDULING");

        private static final Map<String, ScheduleStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ScheduleStatusEnum> createStaticFields() {
            Map<String, ScheduleStatusEnum> map = new HashMap<>();
            map.put("NOT_SCHEDULE", NOT_SCHEDULE);
            map.put("SCHEDULING", SCHEDULING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ScheduleStatusEnum(String value) {
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
        public static ScheduleStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ScheduleStatusEnum(value));
        }

        public static ScheduleStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ScheduleStatusEnum) {
                return this.value.equals(((ScheduleStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_status")

    private ScheduleStatusEnum scheduleStatus;

    /**
     * 同步状态 * UNKNOWN 未知 * NOT_SYNC 未同步 * SYNCING 同步中 * SYNC_SUCCESS 同步成功 * SYNC_FAIL 同步失败
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

    public ShowSecurityMemberSyncTaskResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 用户同步任务id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowSecurityMemberSyncTaskResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ShowSecurityMemberSyncTaskResponse withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 租户ID。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ShowSecurityMemberSyncTaskResponse withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ShowSecurityMemberSyncTaskResponse withDataConnectionWorkspace(String dataConnectionWorkspace) {
        this.dataConnectionWorkspace = dataConnectionWorkspace;
        return this;
    }

    /**
     * 数据连接工作空间ID。
     * @return dataConnectionWorkspace
     */
    public String getDataConnectionWorkspace() {
        return dataConnectionWorkspace;
    }

    public void setDataConnectionWorkspace(String dataConnectionWorkspace) {
        this.dataConnectionWorkspace = dataConnectionWorkspace;
    }

    public ShowSecurityMemberSyncTaskResponse withClusterType(ClusterTypeEnum clusterType) {
        this.clusterType = clusterType;
        return this;
    }

    /**
     * 集群类型 * MRS集群 * DWS集群
     * @return clusterType
     */
    public ClusterTypeEnum getClusterType() {
        return clusterType;
    }

    public void setClusterType(ClusterTypeEnum clusterType) {
        this.clusterType = clusterType;
    }

    public ShowSecurityMemberSyncTaskResponse withDataConnectionId(String dataConnectionId) {
        this.dataConnectionId = dataConnectionId;
        return this;
    }

    /**
     * 数据连接id。
     * @return dataConnectionId
     */
    public String getDataConnectionId() {
        return dataConnectionId;
    }

    public void setDataConnectionId(String dataConnectionId) {
        this.dataConnectionId = dataConnectionId;
    }

    public ShowSecurityMemberSyncTaskResponse withDataConnectionName(String dataConnectionName) {
        this.dataConnectionName = dataConnectionName;
        return this;
    }

    /**
     * 数据连接名称。
     * @return dataConnectionName
     */
    public String getDataConnectionName() {
        return dataConnectionName;
    }

    public void setDataConnectionName(String dataConnectionName) {
        this.dataConnectionName = dataConnectionName;
    }

    public ShowSecurityMemberSyncTaskResponse withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 集群id。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public ShowSecurityMemberSyncTaskResponse withClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }

    /**
     * 集群名称。
     * @return clusterName
     */
    public String getClusterName() {
        return clusterName;
    }

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    public ShowSecurityMemberSyncTaskResponse withScheduleStartHour(Integer scheduleStartHour) {
        this.scheduleStartHour = scheduleStartHour;
        return this;
    }

    /**
     * 调度开始时间, 单位为小时, 0~23。
     * minimum: 0
     * maximum: 23
     * @return scheduleStartHour
     */
    public Integer getScheduleStartHour() {
        return scheduleStartHour;
    }

    public void setScheduleStartHour(Integer scheduleStartHour) {
        this.scheduleStartHour = scheduleStartHour;
    }

    public ShowSecurityMemberSyncTaskResponse withScheduleEndHour(Integer scheduleEndHour) {
        this.scheduleEndHour = scheduleEndHour;
        return this;
    }

    /**
     * 调度结束时间, 单位为小时, 0~23。
     * minimum: 0
     * maximum: 23
     * @return scheduleEndHour
     */
    public Integer getScheduleEndHour() {
        return scheduleEndHour;
    }

    public void setScheduleEndHour(Integer scheduleEndHour) {
        this.scheduleEndHour = scheduleEndHour;
    }

    public ShowSecurityMemberSyncTaskResponse withSchedulePeriod(SchedulePeriodEnum schedulePeriod) {
        this.schedulePeriod = schedulePeriod;
        return this;
    }

    /**
     * 调度周期 * MINUTE  分钟为单位调度 * HOUR    小时为单位调度
     * @return schedulePeriod
     */
    public SchedulePeriodEnum getSchedulePeriod() {
        return schedulePeriod;
    }

    public void setSchedulePeriod(SchedulePeriodEnum schedulePeriod) {
        this.schedulePeriod = schedulePeriod;
    }

    public ShowSecurityMemberSyncTaskResponse withScheduleInterval(Integer scheduleInterval) {
        this.scheduleInterval = scheduleInterval;
        return this;
    }

    /**
     * 调度间隔。
     * minimum: 0
     * maximum: 2147483647
     * @return scheduleInterval
     */
    public Integer getScheduleInterval() {
        return scheduleInterval;
    }

    public void setScheduleInterval(Integer scheduleInterval) {
        this.scheduleInterval = scheduleInterval;
    }

    public ShowSecurityMemberSyncTaskResponse withScheduleStatus(ScheduleStatusEnum scheduleStatus) {
        this.scheduleStatus = scheduleStatus;
        return this;
    }

    /**
     * 调度状态 * NOT_SCHEDULE  未启用任务调度 * SCHEDULING    任务调度中
     * @return scheduleStatus
     */
    public ScheduleStatusEnum getScheduleStatus() {
        return scheduleStatus;
    }

    public void setScheduleStatus(ScheduleStatusEnum scheduleStatus) {
        this.scheduleStatus = scheduleStatus;
    }

    public ShowSecurityMemberSyncTaskResponse withSyncStatus(SyncStatusEnum syncStatus) {
        this.syncStatus = syncStatus;
        return this;
    }

    /**
     * 同步状态 * UNKNOWN 未知 * NOT_SYNC 未同步 * SYNCING 同步中 * SYNC_SUCCESS 同步成功 * SYNC_FAIL 同步失败
     * @return syncStatus
     */
    public SyncStatusEnum getSyncStatus() {
        return syncStatus;
    }

    public void setSyncStatus(SyncStatusEnum syncStatus) {
        this.syncStatus = syncStatus;
    }

    public ShowSecurityMemberSyncTaskResponse withSyncMsg(String syncMsg) {
        this.syncMsg = syncMsg;
        return this;
    }

    /**
     * 同步日志。
     * @return syncMsg
     */
    public String getSyncMsg() {
        return syncMsg;
    }

    public void setSyncMsg(String syncMsg) {
        this.syncMsg = syncMsg;
    }

    public ShowSecurityMemberSyncTaskResponse withSyncTime(Long syncTime) {
        this.syncTime = syncTime;
        return this;
    }

    /**
     * 同步时间。
     * minimum: 0
     * maximum: 4070880010000
     * @return syncTime
     */
    public Long getSyncTime() {
        return syncTime;
    }

    public void setSyncTime(Long syncTime) {
        this.syncTime = syncTime;
    }

    public ShowSecurityMemberSyncTaskResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间。
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

    public ShowSecurityMemberSyncTaskResponse withCreateUser(String createUser) {
        this.createUser = createUser;
        return this;
    }

    /**
     * 创建者。
     * @return createUser
     */
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public ShowSecurityMemberSyncTaskResponse withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间。
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

    public ShowSecurityMemberSyncTaskResponse withUpdateUser(String updateUser) {
        this.updateUser = updateUser;
        return this;
    }

    /**
     * 更新者。
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
        ShowSecurityMemberSyncTaskResponse that = (ShowSecurityMemberSyncTaskResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.domainId, that.domainId) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.dataConnectionWorkspace, that.dataConnectionWorkspace)
            && Objects.equals(this.clusterType, that.clusterType)
            && Objects.equals(this.dataConnectionId, that.dataConnectionId)
            && Objects.equals(this.dataConnectionName, that.dataConnectionName)
            && Objects.equals(this.clusterId, that.clusterId) && Objects.equals(this.clusterName, that.clusterName)
            && Objects.equals(this.scheduleStartHour, that.scheduleStartHour)
            && Objects.equals(this.scheduleEndHour, that.scheduleEndHour)
            && Objects.equals(this.schedulePeriod, that.schedulePeriod)
            && Objects.equals(this.scheduleInterval, that.scheduleInterval)
            && Objects.equals(this.scheduleStatus, that.scheduleStatus)
            && Objects.equals(this.syncStatus, that.syncStatus) && Objects.equals(this.syncMsg, that.syncMsg)
            && Objects.equals(this.syncTime, that.syncTime) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.createUser, that.createUser) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.updateUser, that.updateUser);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            projectId,
            domainId,
            instanceId,
            dataConnectionWorkspace,
            clusterType,
            dataConnectionId,
            dataConnectionName,
            clusterId,
            clusterName,
            scheduleStartHour,
            scheduleEndHour,
            schedulePeriod,
            scheduleInterval,
            scheduleStatus,
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
        sb.append("class ShowSecurityMemberSyncTaskResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    dataConnectionWorkspace: ").append(toIndentedString(dataConnectionWorkspace)).append("\n");
        sb.append("    clusterType: ").append(toIndentedString(clusterType)).append("\n");
        sb.append("    dataConnectionId: ").append(toIndentedString(dataConnectionId)).append("\n");
        sb.append("    dataConnectionName: ").append(toIndentedString(dataConnectionName)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    clusterName: ").append(toIndentedString(clusterName)).append("\n");
        sb.append("    scheduleStartHour: ").append(toIndentedString(scheduleStartHour)).append("\n");
        sb.append("    scheduleEndHour: ").append(toIndentedString(scheduleEndHour)).append("\n");
        sb.append("    schedulePeriod: ").append(toIndentedString(schedulePeriod)).append("\n");
        sb.append("    scheduleInterval: ").append(toIndentedString(scheduleInterval)).append("\n");
        sb.append("    scheduleStatus: ").append(toIndentedString(scheduleStatus)).append("\n");
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
