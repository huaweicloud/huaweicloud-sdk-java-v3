package com.huaweicloud.sdk.sdrs.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 查询保护组数据结构
 */
public class ShowProtectionGroupParams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress")

    private Integer progress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_availability_zone")

    private String sourceAvailabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_availability_zone")

    private String targetAvailabilityZone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority_station")

    private String priorityStation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protected_instance_num")

    private Integer protectedInstanceNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replication_num")

    private Integer replicationNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disaster_recovery_drill_num")

    private Integer disasterRecoveryDrillNum;

    /**
     * 保护状态。started：表示该保护组开始保护。stopped：表示该保护组停止保护。 说明:系统近期进行了升级，对于升级后创建的保护组，该字段值为null，无实际意义。
     */
    public static final class ProtectedStatusEnum {

        /**
         * Enum STARTED for value: "started"
         */
        public static final ProtectedStatusEnum STARTED = new ProtectedStatusEnum("started");

        /**
         * Enum STOPPED for value: "stopped"
         */
        public static final ProtectedStatusEnum STOPPED = new ProtectedStatusEnum("stopped");

        private static final Map<String, ProtectedStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProtectedStatusEnum> createStaticFields() {
            Map<String, ProtectedStatusEnum> map = new HashMap<>();
            map.put("started", STARTED);
            map.put("stopped", STOPPED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProtectedStatusEnum(String value) {
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
        public static ProtectedStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ProtectedStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ProtectedStatusEnum(value);
            }
            return result;
        }

        public static ProtectedStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ProtectedStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProtectedStatusEnum) {
                return this.value.equals(((ProtectedStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protected_status")

    private ProtectedStatusEnum protectedStatus;

    /**
     * 数据同步状态。 active：表示数据已同步完成。 inactive：表示数据未同步。 copying：表示数据正在同步。 active-stopped：表示数据已停止同步。  说明:系统近期进行了升级，对于升级后创建的保护组，该字段值为null，无实际意义。
     */
    public static final class ReplicationStatusEnum {

        /**
         * Enum ACTIVE for value: "active"
         */
        public static final ReplicationStatusEnum ACTIVE = new ReplicationStatusEnum("active");

        /**
         * Enum INACTIVE for value: "inactive"
         */
        public static final ReplicationStatusEnum INACTIVE = new ReplicationStatusEnum("inactive");

        /**
         * Enum COPYING for value: "copying"
         */
        public static final ReplicationStatusEnum COPYING = new ReplicationStatusEnum("copying");

        /**
         * Enum ACTIVE_STOPPED for value: "active-stopped"
         */
        public static final ReplicationStatusEnum ACTIVE_STOPPED = new ReplicationStatusEnum("active-stopped");

        private static final Map<String, ReplicationStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ReplicationStatusEnum> createStaticFields() {
            Map<String, ReplicationStatusEnum> map = new HashMap<>();
            map.put("active", ACTIVE);
            map.put("inactive", INACTIVE);
            map.put("copying", COPYING);
            map.put("active-stopped", ACTIVE_STOPPED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ReplicationStatusEnum(String value) {
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
        public static ReplicationStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ReplicationStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ReplicationStatusEnum(value);
            }
            return result;
        }

        public static ReplicationStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ReplicationStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ReplicationStatusEnum) {
                return this.value.equals(((ReplicationStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replication_status")

    private ReplicationStatusEnum replicationStatus;

    /**
     * 健康状态。 normal：表示该保护组处于正常状态。 abnormal：表示该保护组处于非正常状态。  说明:系统近期进行了升级，对于升级后创建的保护组，该字段值为null，无实际意义。
     */
    public static final class HealthStatusEnum {

        /**
         * Enum NORMAL for value: "normal"
         */
        public static final HealthStatusEnum NORMAL = new HealthStatusEnum("normal");

        /**
         * Enum ABNORMAL for value: "abnormal"
         */
        public static final HealthStatusEnum ABNORMAL = new HealthStatusEnum("abnormal");

        /**
         * Enum NULL for value: "null"
         */
        public static final HealthStatusEnum NULL = new HealthStatusEnum("null");

        private static final Map<String, HealthStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, HealthStatusEnum> createStaticFields() {
            Map<String, HealthStatusEnum> map = new HashMap<>();
            map.put("normal", NORMAL);
            map.put("abnormal", ABNORMAL);
            map.put("null", NULL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        HealthStatusEnum(String value) {
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
        public static HealthStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            HealthStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new HealthStatusEnum(value);
            }
            return result;
        }

        public static HealthStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            HealthStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof HealthStatusEnum) {
                return this.value.equals(((HealthStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "health_status")

    private HealthStatusEnum healthStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_vpc_id")

    private String sourceVpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_vpc_id")

    private String targetVpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_vpc_id")

    private String testVpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dr_type")

    private String drType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    /**
     * 保护模式。 replication-pair：表示以复制对为单位进行数据同步。 null：表示将保护组中的所有复制对作为一个整体进行数据同步。  说明:当保护组中的所有复制对作为一个整体进行数据同步时，如果数据同步失败，保护组中的所有复制对都会受到影响。因此，SDRS服务对系统做了优化升级： 对于升级后创建的资源，默认以复制对为单位进行数据同步，返回值为replication-pair； 对于已有资源，仍以一个整体进行数据同步，返回值为null。
     */
    public static final class ProtectionTypeEnum {

        /**
         * Enum REPLICATION_PAIR for value: "replication-pair"
         */
        public static final ProtectionTypeEnum REPLICATION_PAIR = new ProtectionTypeEnum("replication-pair");

        /**
         * Enum NULL for value: "null"
         */
        public static final ProtectionTypeEnum NULL = new ProtectionTypeEnum("null");

        private static final Map<String, ProtectionTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProtectionTypeEnum> createStaticFields() {
            Map<String, ProtectionTypeEnum> map = new HashMap<>();
            map.put("replication-pair", REPLICATION_PAIR);
            map.put("null", NULL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProtectionTypeEnum(String value) {
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
        public static ProtectionTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            ProtectionTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new ProtectionTypeEnum(value);
            }
            return result;
        }

        public static ProtectionTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            ProtectionTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProtectionTypeEnum) {
                return this.value.equals(((ProtectionTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protection_type")

    private ProtectionTypeEnum protectionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replication_model")

    private String replicationModel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_type")

    private String serverType;

    public ShowProtectionGroupParams withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 保护组的ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowProtectionGroupParams withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 保护组的名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowProtectionGroupParams withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 保护组的描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowProtectionGroupParams withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 保护组的状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowProtectionGroupParams withProgress(Integer progress) {
        this.progress = progress;
        return this;
    }

    /**
     * 保护组的同步进度。单位：百分比（%）。
     * minimum: 0
     * maximum: 100
     * @return progress
     */
    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public ShowProtectionGroupParams withSourceAvailabilityZone(String sourceAvailabilityZone) {
        this.sourceAvailabilityZone = sourceAvailabilityZone;
        return this;
    }

    /**
     * 保护组创建时的生产站点可用区名称。注意：保护组切换、故障切换后，该值不变。
     * @return sourceAvailabilityZone
     */
    public String getSourceAvailabilityZone() {
        return sourceAvailabilityZone;
    }

    public void setSourceAvailabilityZone(String sourceAvailabilityZone) {
        this.sourceAvailabilityZone = sourceAvailabilityZone;
    }

    public ShowProtectionGroupParams withTargetAvailabilityZone(String targetAvailabilityZone) {
        this.targetAvailabilityZone = targetAvailabilityZone;
        return this;
    }

    /**
     * 保护组创建时的容灾站点可用区名称。注意：保护组切换、故障切换后，该值不变。
     * @return targetAvailabilityZone
     */
    public String getTargetAvailabilityZone() {
        return targetAvailabilityZone;
    }

    public void setTargetAvailabilityZone(String targetAvailabilityZone) {
        this.targetAvailabilityZone = targetAvailabilityZone;
    }

    public ShowProtectionGroupParams withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 双活域ID。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ShowProtectionGroupParams withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * 双活域名称。
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public ShowProtectionGroupParams withPriorityStation(String priorityStation) {
        this.priorityStation = priorityStation;
        return this;
    }

    /**
     * 用于标识保护组的当前生产站点。 source：表示当前生产站点可用区为source_availability_zone的值。 target：表示当前生产站点可用区为target_availability_zone的值。
     * @return priorityStation
     */
    public String getPriorityStation() {
        return priorityStation;
    }

    public void setPriorityStation(String priorityStation) {
        this.priorityStation = priorityStation;
    }

    public ShowProtectionGroupParams withProtectedInstanceNum(Integer protectedInstanceNum) {
        this.protectedInstanceNum = protectedInstanceNum;
        return this;
    }

    /**
     * 该保护组中保护实例的个数。
     * @return protectedInstanceNum
     */
    public Integer getProtectedInstanceNum() {
        return protectedInstanceNum;
    }

    public void setProtectedInstanceNum(Integer protectedInstanceNum) {
        this.protectedInstanceNum = protectedInstanceNum;
    }

    public ShowProtectionGroupParams withReplicationNum(Integer replicationNum) {
        this.replicationNum = replicationNum;
        return this;
    }

    /**
     * 该保护组中复制对的个数。
     * @return replicationNum
     */
    public Integer getReplicationNum() {
        return replicationNum;
    }

    public void setReplicationNum(Integer replicationNum) {
        this.replicationNum = replicationNum;
    }

    public ShowProtectionGroupParams withDisasterRecoveryDrillNum(Integer disasterRecoveryDrillNum) {
        this.disasterRecoveryDrillNum = disasterRecoveryDrillNum;
        return this;
    }

    /**
     * 该保护组中容灾演练的个数。
     * @return disasterRecoveryDrillNum
     */
    public Integer getDisasterRecoveryDrillNum() {
        return disasterRecoveryDrillNum;
    }

    public void setDisasterRecoveryDrillNum(Integer disasterRecoveryDrillNum) {
        this.disasterRecoveryDrillNum = disasterRecoveryDrillNum;
    }

    public ShowProtectionGroupParams withProtectedStatus(ProtectedStatusEnum protectedStatus) {
        this.protectedStatus = protectedStatus;
        return this;
    }

    /**
     * 保护状态。started：表示该保护组开始保护。stopped：表示该保护组停止保护。 说明:系统近期进行了升级，对于升级后创建的保护组，该字段值为null，无实际意义。
     * @return protectedStatus
     */
    public ProtectedStatusEnum getProtectedStatus() {
        return protectedStatus;
    }

    public void setProtectedStatus(ProtectedStatusEnum protectedStatus) {
        this.protectedStatus = protectedStatus;
    }

    public ShowProtectionGroupParams withReplicationStatus(ReplicationStatusEnum replicationStatus) {
        this.replicationStatus = replicationStatus;
        return this;
    }

    /**
     * 数据同步状态。 active：表示数据已同步完成。 inactive：表示数据未同步。 copying：表示数据正在同步。 active-stopped：表示数据已停止同步。  说明:系统近期进行了升级，对于升级后创建的保护组，该字段值为null，无实际意义。
     * @return replicationStatus
     */
    public ReplicationStatusEnum getReplicationStatus() {
        return replicationStatus;
    }

    public void setReplicationStatus(ReplicationStatusEnum replicationStatus) {
        this.replicationStatus = replicationStatus;
    }

    public ShowProtectionGroupParams withHealthStatus(HealthStatusEnum healthStatus) {
        this.healthStatus = healthStatus;
        return this;
    }

    /**
     * 健康状态。 normal：表示该保护组处于正常状态。 abnormal：表示该保护组处于非正常状态。  说明:系统近期进行了升级，对于升级后创建的保护组，该字段值为null，无实际意义。
     * @return healthStatus
     */
    public HealthStatusEnum getHealthStatus() {
        return healthStatus;
    }

    public void setHealthStatus(HealthStatusEnum healthStatus) {
        this.healthStatus = healthStatus;
    }

    public ShowProtectionGroupParams withSourceVpcId(String sourceVpcId) {
        this.sourceVpcId = sourceVpcId;
        return this;
    }

    /**
     * 生产站点虚拟私有云ID。
     * @return sourceVpcId
     */
    public String getSourceVpcId() {
        return sourceVpcId;
    }

    public void setSourceVpcId(String sourceVpcId) {
        this.sourceVpcId = sourceVpcId;
    }

    public ShowProtectionGroupParams withTargetVpcId(String targetVpcId) {
        this.targetVpcId = targetVpcId;
        return this;
    }

    /**
     * 容灾站点虚拟私有云ID。
     * @return targetVpcId
     */
    public String getTargetVpcId() {
        return targetVpcId;
    }

    public void setTargetVpcId(String targetVpcId) {
        this.targetVpcId = targetVpcId;
    }

    public ShowProtectionGroupParams withTestVpcId(String testVpcId) {
        this.testVpcId = testVpcId;
        return this;
    }

    /**
     * 容灾演练虚拟私有云ID。（该参数暂未使用）
     * @return testVpcId
     */
    public String getTestVpcId() {
        return testVpcId;
    }

    public void setTestVpcId(String testVpcId) {
        this.testVpcId = testVpcId;
    }

    public ShowProtectionGroupParams withDrType(String drType) {
        this.drType = drType;
        return this;
    }

    /**
     * 部署模式。默认值为“migration”，migration表示VPC内迁移。
     * @return drType
     */
    public String getDrType() {
        return drType;
    }

    public void setDrType(String drType) {
        this.drType = drType;
    }

    public ShowProtectionGroupParams withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间。默认格式为：\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\"，例：\"2019-04-01T12:00:00.000Z\"。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ShowProtectionGroupParams withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间。默认格式为：\"yyyy-MM-dd'T'HH:mm:ss.SSSZ\"，例：\"2019-04-01T12:00:00.000Z\"。
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ShowProtectionGroupParams withProtectionType(ProtectionTypeEnum protectionType) {
        this.protectionType = protectionType;
        return this;
    }

    /**
     * 保护模式。 replication-pair：表示以复制对为单位进行数据同步。 null：表示将保护组中的所有复制对作为一个整体进行数据同步。  说明:当保护组中的所有复制对作为一个整体进行数据同步时，如果数据同步失败，保护组中的所有复制对都会受到影响。因此，SDRS服务对系统做了优化升级： 对于升级后创建的资源，默认以复制对为单位进行数据同步，返回值为replication-pair； 对于已有资源，仍以一个整体进行数据同步，返回值为null。
     * @return protectionType
     */
    public ProtectionTypeEnum getProtectionType() {
        return protectionType;
    }

    public void setProtectionType(ProtectionTypeEnum protectionType) {
        this.protectionType = protectionType;
    }

    public ShowProtectionGroupParams withReplicationModel(String replicationModel) {
        this.replicationModel = replicationModel;
        return this;
    }

    /**
     * 复制类型。 说明:预留参数，暂未启用。
     * @return replicationModel
     */
    public String getReplicationModel() {
        return replicationModel;
    }

    public void setReplicationModel(String replicationModel) {
        this.replicationModel = replicationModel;
    }

    public ShowProtectionGroupParams withServerType(String serverType) {
        this.serverType = serverType;
        return this;
    }

    /**
     * 管理的服务器类型 ECS：表示管理的服务器类型为云服务器。
     * @return serverType
     */
    public String getServerType() {
        return serverType;
    }

    public void setServerType(String serverType) {
        this.serverType = serverType;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowProtectionGroupParams showProtectionGroupParams = (ShowProtectionGroupParams) o;
        return Objects.equals(this.id, showProtectionGroupParams.id)
            && Objects.equals(this.name, showProtectionGroupParams.name)
            && Objects.equals(this.description, showProtectionGroupParams.description)
            && Objects.equals(this.status, showProtectionGroupParams.status)
            && Objects.equals(this.progress, showProtectionGroupParams.progress)
            && Objects.equals(this.sourceAvailabilityZone, showProtectionGroupParams.sourceAvailabilityZone)
            && Objects.equals(this.targetAvailabilityZone, showProtectionGroupParams.targetAvailabilityZone)
            && Objects.equals(this.domainId, showProtectionGroupParams.domainId)
            && Objects.equals(this.domainName, showProtectionGroupParams.domainName)
            && Objects.equals(this.priorityStation, showProtectionGroupParams.priorityStation)
            && Objects.equals(this.protectedInstanceNum, showProtectionGroupParams.protectedInstanceNum)
            && Objects.equals(this.replicationNum, showProtectionGroupParams.replicationNum)
            && Objects.equals(this.disasterRecoveryDrillNum, showProtectionGroupParams.disasterRecoveryDrillNum)
            && Objects.equals(this.protectedStatus, showProtectionGroupParams.protectedStatus)
            && Objects.equals(this.replicationStatus, showProtectionGroupParams.replicationStatus)
            && Objects.equals(this.healthStatus, showProtectionGroupParams.healthStatus)
            && Objects.equals(this.sourceVpcId, showProtectionGroupParams.sourceVpcId)
            && Objects.equals(this.targetVpcId, showProtectionGroupParams.targetVpcId)
            && Objects.equals(this.testVpcId, showProtectionGroupParams.testVpcId)
            && Objects.equals(this.drType, showProtectionGroupParams.drType)
            && Objects.equals(this.createdAt, showProtectionGroupParams.createdAt)
            && Objects.equals(this.updatedAt, showProtectionGroupParams.updatedAt)
            && Objects.equals(this.protectionType, showProtectionGroupParams.protectionType)
            && Objects.equals(this.replicationModel, showProtectionGroupParams.replicationModel)
            && Objects.equals(this.serverType, showProtectionGroupParams.serverType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            status,
            progress,
            sourceAvailabilityZone,
            targetAvailabilityZone,
            domainId,
            domainName,
            priorityStation,
            protectedInstanceNum,
            replicationNum,
            disasterRecoveryDrillNum,
            protectedStatus,
            replicationStatus,
            healthStatus,
            sourceVpcId,
            targetVpcId,
            testVpcId,
            drType,
            createdAt,
            updatedAt,
            protectionType,
            replicationModel,
            serverType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowProtectionGroupParams {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
        sb.append("    sourceAvailabilityZone: ").append(toIndentedString(sourceAvailabilityZone)).append("\n");
        sb.append("    targetAvailabilityZone: ").append(toIndentedString(targetAvailabilityZone)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    priorityStation: ").append(toIndentedString(priorityStation)).append("\n");
        sb.append("    protectedInstanceNum: ").append(toIndentedString(protectedInstanceNum)).append("\n");
        sb.append("    replicationNum: ").append(toIndentedString(replicationNum)).append("\n");
        sb.append("    disasterRecoveryDrillNum: ").append(toIndentedString(disasterRecoveryDrillNum)).append("\n");
        sb.append("    protectedStatus: ").append(toIndentedString(protectedStatus)).append("\n");
        sb.append("    replicationStatus: ").append(toIndentedString(replicationStatus)).append("\n");
        sb.append("    healthStatus: ").append(toIndentedString(healthStatus)).append("\n");
        sb.append("    sourceVpcId: ").append(toIndentedString(sourceVpcId)).append("\n");
        sb.append("    targetVpcId: ").append(toIndentedString(targetVpcId)).append("\n");
        sb.append("    testVpcId: ").append(toIndentedString(testVpcId)).append("\n");
        sb.append("    drType: ").append(toIndentedString(drType)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    protectionType: ").append(toIndentedString(protectionType)).append("\n");
        sb.append("    replicationModel: ").append(toIndentedString(replicationModel)).append("\n");
        sb.append("    serverType: ").append(toIndentedString(serverType)).append("\n");
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
