package com.huaweicloud.sdk.sms.v3.model;

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

/** 批量查询任务时返回体重返回的任务信息。 */
public class TasksResponseBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /** 任务类型，创建迁移任务时必选，更新迁移任务时可选 */
    public static final class TypeEnum {

        /** Enum MIGRATE_FILE_ for value: "MIGRATE_FILE：文件级迁移" */
        public static final TypeEnum MIGRATE_FILE_ = new TypeEnum("MIGRATE_FILE：文件级迁移");

        /** Enum MIGRATE_BLOCK_ for value: "MIGRATE_BLOCK：块级迁移" */
        public static final TypeEnum MIGRATE_BLOCK_ = new TypeEnum("MIGRATE_BLOCK：块级迁移");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("MIGRATE_FILE：文件级迁移", MIGRATE_FILE_);
            map.put("MIGRATE_BLOCK：块级迁移", MIGRATE_BLOCK_);
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
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    /** 操作系统类型，分为WINDOWS和LINUX，创建时必选，更新时可选 */
    public static final class OsTypeEnum {

        /** Enum WINDOWS for value: "WINDOWS" */
        public static final OsTypeEnum WINDOWS = new OsTypeEnum("WINDOWS");

        /** Enum LINUX for value: "LINUX" */
        public static final OsTypeEnum LINUX = new OsTypeEnum("LINUX");

        private static final Map<String, OsTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OsTypeEnum> createStaticFields() {
            Map<String, OsTypeEnum> map = new HashMap<>();
            map.put("WINDOWS", WINDOWS);
            map.put("LINUX", LINUX);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OsTypeEnum(String value) {
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
        public static OsTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            OsTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OsTypeEnum(value);
            }
            return result;
        }

        public static OsTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            OsTypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof OsTypeEnum) {
                return this.value.equals(((OsTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private OsTypeEnum osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "estimate_complete_time")

    private Long estimateCompleteTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_date")

    private Long createDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "speed_limit")

    private Integer speedLimit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migrate_speed")

    private Double migrateSpeed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compress_rate")

    private Double compressRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_target_server")

    private Boolean startTargetServer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_json")

    private String errorJson;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_time")

    private Long totalTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migration_ip")

    private String migrationIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_tasks")

    private List<SubTaskAssociatedWithTask> subTasks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_server")

    private SourceServerAssociatedWithTask sourceServer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_server")

    private TargetServerAssociatedWithTask targetServer;

    /** 日志收集状态 */
    public static final class LogCollectStatusEnum {

        /** Enum INIT_ for value: "INIT:等待搜集状态" */
        public static final LogCollectStatusEnum INIT_ = new LogCollectStatusEnum("INIT:等待搜集状态");

        /** Enum TELL_AGENT_TO_COLLECT_AGENT_ for value: "TELL_AGENT_TO_COLLECT:通知agent搜集日志" */
        public static final LogCollectStatusEnum TELL_AGENT_TO_COLLECT_AGENT_ =
            new LogCollectStatusEnum("TELL_AGENT_TO_COLLECT:通知agent搜集日志");

        /** Enum WAIT_AGENT_COLLECT_ACK_AGENT_ for value: "WAIT_AGENT_COLLECT_ACK:等待Agent确认搜集确认" */
        public static final LogCollectStatusEnum WAIT_AGENT_COLLECT_ACK_AGENT_ =
            new LogCollectStatusEnum("WAIT_AGENT_COLLECT_ACK:等待Agent确认搜集确认");

        /** Enum AGENT_COLLECT_FAIL_AGENT_ for value: "AGENT_COLLECT_FAIL:Agent搜集失败" */
        public static final LogCollectStatusEnum AGENT_COLLECT_FAIL_AGENT_ =
            new LogCollectStatusEnum("AGENT_COLLECT_FAIL:Agent搜集失败");

        /** Enum AGENT_COLLECT_SUCCESS_AGENT_ for value: "AGENT_COLLECT_SUCCESS：Agent搜集成功" */
        public static final LogCollectStatusEnum AGENT_COLLECT_SUCCESS_AGENT_ =
            new LogCollectStatusEnum("AGENT_COLLECT_SUCCESS：Agent搜集成功");

        /** Enum WAIT_SERVER_COLLECT_SERVER_ for value: "WAIT_SERVER_COLLECT：等待Server端日志搜集" */
        public static final LogCollectStatusEnum WAIT_SERVER_COLLECT_SERVER_ =
            new LogCollectStatusEnum("WAIT_SERVER_COLLECT：等待Server端日志搜集");

        /** Enum SERVER_COLLECT_FAIL_SERVER_ for value: "SERVER_COLLECT_FAIL：Server搜集失败" */
        public static final LogCollectStatusEnum SERVER_COLLECT_FAIL_SERVER_ =
            new LogCollectStatusEnum("SERVER_COLLECT_FAIL：Server搜集失败");

        /** Enum SERVER_COLLECT_SUCCESS_SERVER_ for value: "SERVER_COLLECT_SUCCESS：Server搜集成功" */
        public static final LogCollectStatusEnum SERVER_COLLECT_SUCCESS_SERVER_ =
            new LogCollectStatusEnum("SERVER_COLLECT_SUCCESS：Server搜集成功");

        /** Enum TELL_AGENT_RESET_ACL_AGENT_ for value: "TELL_AGENT_RESET_ACL：通知Agent取消日志授权" */
        public static final LogCollectStatusEnum TELL_AGENT_RESET_ACL_AGENT_ =
            new LogCollectStatusEnum("TELL_AGENT_RESET_ACL：通知Agent取消日志授权");

        /** Enum WAIT_AGENT_RESET_ACL_ACK_AGENT_ for value: "WAIT_AGENT_RESET_ACL_ACK：等待Agent确认" */
        public static final LogCollectStatusEnum WAIT_AGENT_RESET_ACL_ACK_AGENT_ =
            new LogCollectStatusEnum("WAIT_AGENT_RESET_ACL_ACK：等待Agent确认");

        private static final Map<String, LogCollectStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LogCollectStatusEnum> createStaticFields() {
            Map<String, LogCollectStatusEnum> map = new HashMap<>();
            map.put("INIT:等待搜集状态", INIT_);
            map.put("TELL_AGENT_TO_COLLECT:通知agent搜集日志", TELL_AGENT_TO_COLLECT_AGENT_);
            map.put("WAIT_AGENT_COLLECT_ACK:等待Agent确认搜集确认", WAIT_AGENT_COLLECT_ACK_AGENT_);
            map.put("AGENT_COLLECT_FAIL:Agent搜集失败", AGENT_COLLECT_FAIL_AGENT_);
            map.put("AGENT_COLLECT_SUCCESS：Agent搜集成功", AGENT_COLLECT_SUCCESS_AGENT_);
            map.put("WAIT_SERVER_COLLECT：等待Server端日志搜集", WAIT_SERVER_COLLECT_SERVER_);
            map.put("SERVER_COLLECT_FAIL：Server搜集失败", SERVER_COLLECT_FAIL_SERVER_);
            map.put("SERVER_COLLECT_SUCCESS：Server搜集成功", SERVER_COLLECT_SUCCESS_SERVER_);
            map.put("TELL_AGENT_RESET_ACL：通知Agent取消日志授权", TELL_AGENT_RESET_ACL_AGENT_);
            map.put("WAIT_AGENT_RESET_ACL_ACK：等待Agent确认", WAIT_AGENT_RESET_ACL_ACK_AGENT_);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LogCollectStatusEnum(String value) {
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
        public static LogCollectStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            LogCollectStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new LogCollectStatusEnum(value);
            }
            return result;
        }

        public static LogCollectStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            LogCollectStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LogCollectStatusEnum) {
                return this.value.equals(((LogCollectStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_collect_status")

    private LogCollectStatusEnum logCollectStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clone_server")

    private CloneServerBrief cloneServer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "syncing")

    private Boolean syncing;

    public TasksResponseBody withId(String id) {
        this.id = id;
        return this;
    }

    /** 迁移任务id
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TasksResponseBody withName(String name) {
        this.name = name;
        return this;
    }

    /** 任务名称（用户自定义）
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TasksResponseBody withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /** 任务类型，创建迁移任务时必选，更新迁移任务时可选
     * 
     * @return type */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public TasksResponseBody withOsType(OsTypeEnum osType) {
        this.osType = osType;
        return this;
    }

    /** 操作系统类型，分为WINDOWS和LINUX，创建时必选，更新时可选
     * 
     * @return osType */
    public OsTypeEnum getOsType() {
        return osType;
    }

    public void setOsType(OsTypeEnum osType) {
        this.osType = osType;
    }

    public TasksResponseBody withState(String state) {
        this.state = state;
        return this;
    }

    /** 任务状态
     * 
     * @return state */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public TasksResponseBody withEstimateCompleteTime(Long estimateCompleteTime) {
        this.estimateCompleteTime = estimateCompleteTime;
        return this;
    }

    /** 预估完成时间 minimum: 0 maximum: 9223372036854775807
     * 
     * @return estimateCompleteTime */
    public Long getEstimateCompleteTime() {
        return estimateCompleteTime;
    }

    public void setEstimateCompleteTime(Long estimateCompleteTime) {
        this.estimateCompleteTime = estimateCompleteTime;
    }

    public TasksResponseBody withCreateDate(Long createDate) {
        this.createDate = createDate;
        return this;
    }

    /** 任务创建时间 minimum: 0 maximum: 9223372036854775807
     * 
     * @return createDate */
    public Long getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Long createDate) {
        this.createDate = createDate;
    }

    public TasksResponseBody withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /** 进程优先级 0：低 1：标准 2：高 minimum: 0 maximum: 2
     * 
     * @return priority */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public TasksResponseBody withSpeedLimit(Integer speedLimit) {
        this.speedLimit = speedLimit;
        return this;
    }

    /** 迁移限速
     * 
     * @return speedLimit */
    public Integer getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(Integer speedLimit) {
        this.speedLimit = speedLimit;
    }

    public TasksResponseBody withMigrateSpeed(Double migrateSpeed) {
        this.migrateSpeed = migrateSpeed;
        return this;
    }

    /** 迁移速率，单位：MB/S minimum: 0 maximum: 1E+4
     * 
     * @return migrateSpeed */
    public Double getMigrateSpeed() {
        return migrateSpeed;
    }

    public void setMigrateSpeed(Double migrateSpeed) {
        this.migrateSpeed = migrateSpeed;
    }

    public TasksResponseBody withCompressRate(Double compressRate) {
        this.compressRate = compressRate;
        return this;
    }

    /** 压缩率 minimum: 0 maximum: 1E+4
     * 
     * @return compressRate */
    public Double getCompressRate() {
        return compressRate;
    }

    public void setCompressRate(Double compressRate) {
        this.compressRate = compressRate;
    }

    public TasksResponseBody withStartTargetServer(Boolean startTargetServer) {
        this.startTargetServer = startTargetServer;
        return this;
    }

    /** 迁移完成后是否启动目的端服务器 true：启动 false：停止
     * 
     * @return startTargetServer */
    public Boolean getStartTargetServer() {
        return startTargetServer;
    }

    public void setStartTargetServer(Boolean startTargetServer) {
        this.startTargetServer = startTargetServer;
    }

    public TasksResponseBody withErrorJson(String errorJson) {
        this.errorJson = errorJson;
        return this;
    }

    /** 错误信息
     * 
     * @return errorJson */
    public String getErrorJson() {
        return errorJson;
    }

    public void setErrorJson(String errorJson) {
        this.errorJson = errorJson;
    }

    public TasksResponseBody withTotalTime(Long totalTime) {
        this.totalTime = totalTime;
        return this;
    }

    /** 任务总耗时 minimum: 0 maximum: 9223372036854775807
     * 
     * @return totalTime */
    public Long getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(Long totalTime) {
        this.totalTime = totalTime;
    }

    public TasksResponseBody withMigrationIp(String migrationIp) {
        this.migrationIp = migrationIp;
        return this;
    }

    /** 目的端服务器的IP地址。 公网迁移时请填写弹性IP地址 专线迁移时请填写私有IP地址
     * 
     * @return migrationIp */
    public String getMigrationIp() {
        return migrationIp;
    }

    public void setMigrationIp(String migrationIp) {
        this.migrationIp = migrationIp;
    }

    public TasksResponseBody withSubTasks(List<SubTaskAssociatedWithTask> subTasks) {
        this.subTasks = subTasks;
        return this;
    }

    public TasksResponseBody addSubTasksItem(SubTaskAssociatedWithTask subTasksItem) {
        if (this.subTasks == null) {
            this.subTasks = new ArrayList<>();
        }
        this.subTasks.add(subTasksItem);
        return this;
    }

    public TasksResponseBody withSubTasks(Consumer<List<SubTaskAssociatedWithTask>> subTasksSetter) {
        if (this.subTasks == null) {
            this.subTasks = new ArrayList<>();
        }
        subTasksSetter.accept(this.subTasks);
        return this;
    }

    /** 任务关联的子任务信息
     * 
     * @return subTasks */
    public List<SubTaskAssociatedWithTask> getSubTasks() {
        return subTasks;
    }

    public void setSubTasks(List<SubTaskAssociatedWithTask> subTasks) {
        this.subTasks = subTasks;
    }

    public TasksResponseBody withSourceServer(SourceServerAssociatedWithTask sourceServer) {
        this.sourceServer = sourceServer;
        return this;
    }

    public TasksResponseBody withSourceServer(Consumer<SourceServerAssociatedWithTask> sourceServerSetter) {
        if (this.sourceServer == null) {
            this.sourceServer = new SourceServerAssociatedWithTask();
            sourceServerSetter.accept(this.sourceServer);
        }

        return this;
    }

    /** Get sourceServer
     * 
     * @return sourceServer */
    public SourceServerAssociatedWithTask getSourceServer() {
        return sourceServer;
    }

    public void setSourceServer(SourceServerAssociatedWithTask sourceServer) {
        this.sourceServer = sourceServer;
    }

    public TasksResponseBody withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /** 迁移项目id
     * 
     * @return enterpriseProjectId */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public TasksResponseBody withTargetServer(TargetServerAssociatedWithTask targetServer) {
        this.targetServer = targetServer;
        return this;
    }

    public TasksResponseBody withTargetServer(Consumer<TargetServerAssociatedWithTask> targetServerSetter) {
        if (this.targetServer == null) {
            this.targetServer = new TargetServerAssociatedWithTask();
            targetServerSetter.accept(this.targetServer);
        }

        return this;
    }

    /** Get targetServer
     * 
     * @return targetServer */
    public TargetServerAssociatedWithTask getTargetServer() {
        return targetServer;
    }

    public void setTargetServer(TargetServerAssociatedWithTask targetServer) {
        this.targetServer = targetServer;
    }

    public TasksResponseBody withLogCollectStatus(LogCollectStatusEnum logCollectStatus) {
        this.logCollectStatus = logCollectStatus;
        return this;
    }

    /** 日志收集状态
     * 
     * @return logCollectStatus */
    public LogCollectStatusEnum getLogCollectStatus() {
        return logCollectStatus;
    }

    public void setLogCollectStatus(LogCollectStatusEnum logCollectStatus) {
        this.logCollectStatus = logCollectStatus;
    }

    public TasksResponseBody withCloneServer(CloneServerBrief cloneServer) {
        this.cloneServer = cloneServer;
        return this;
    }

    public TasksResponseBody withCloneServer(Consumer<CloneServerBrief> cloneServerSetter) {
        if (this.cloneServer == null) {
            this.cloneServer = new CloneServerBrief();
            cloneServerSetter.accept(this.cloneServer);
        }

        return this;
    }

    /** Get cloneServer
     * 
     * @return cloneServer */
    public CloneServerBrief getCloneServer() {
        return cloneServer;
    }

    public void setCloneServer(CloneServerBrief cloneServer) {
        this.cloneServer = cloneServer;
    }

    public TasksResponseBody withSyncing(Boolean syncing) {
        this.syncing = syncing;
        return this;
    }

    /** 是否同步
     * 
     * @return syncing */
    public Boolean getSyncing() {
        return syncing;
    }

    public void setSyncing(Boolean syncing) {
        this.syncing = syncing;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TasksResponseBody tasksResponseBody = (TasksResponseBody) o;
        return Objects.equals(this.id, tasksResponseBody.id) && Objects.equals(this.name, tasksResponseBody.name)
            && Objects.equals(this.type, tasksResponseBody.type)
            && Objects.equals(this.osType, tasksResponseBody.osType)
            && Objects.equals(this.state, tasksResponseBody.state)
            && Objects.equals(this.estimateCompleteTime, tasksResponseBody.estimateCompleteTime)
            && Objects.equals(this.createDate, tasksResponseBody.createDate)
            && Objects.equals(this.priority, tasksResponseBody.priority)
            && Objects.equals(this.speedLimit, tasksResponseBody.speedLimit)
            && Objects.equals(this.migrateSpeed, tasksResponseBody.migrateSpeed)
            && Objects.equals(this.compressRate, tasksResponseBody.compressRate)
            && Objects.equals(this.startTargetServer, tasksResponseBody.startTargetServer)
            && Objects.equals(this.errorJson, tasksResponseBody.errorJson)
            && Objects.equals(this.totalTime, tasksResponseBody.totalTime)
            && Objects.equals(this.migrationIp, tasksResponseBody.migrationIp)
            && Objects.equals(this.subTasks, tasksResponseBody.subTasks)
            && Objects.equals(this.sourceServer, tasksResponseBody.sourceServer)
            && Objects.equals(this.enterpriseProjectId, tasksResponseBody.enterpriseProjectId)
            && Objects.equals(this.targetServer, tasksResponseBody.targetServer)
            && Objects.equals(this.logCollectStatus, tasksResponseBody.logCollectStatus)
            && Objects.equals(this.cloneServer, tasksResponseBody.cloneServer)
            && Objects.equals(this.syncing, tasksResponseBody.syncing);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            type,
            osType,
            state,
            estimateCompleteTime,
            createDate,
            priority,
            speedLimit,
            migrateSpeed,
            compressRate,
            startTargetServer,
            errorJson,
            totalTime,
            migrationIp,
            subTasks,
            sourceServer,
            enterpriseProjectId,
            targetServer,
            logCollectStatus,
            cloneServer,
            syncing);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TasksResponseBody {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    estimateCompleteTime: ").append(toIndentedString(estimateCompleteTime)).append("\n");
        sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    speedLimit: ").append(toIndentedString(speedLimit)).append("\n");
        sb.append("    migrateSpeed: ").append(toIndentedString(migrateSpeed)).append("\n");
        sb.append("    compressRate: ").append(toIndentedString(compressRate)).append("\n");
        sb.append("    startTargetServer: ").append(toIndentedString(startTargetServer)).append("\n");
        sb.append("    errorJson: ").append(toIndentedString(errorJson)).append("\n");
        sb.append("    totalTime: ").append(toIndentedString(totalTime)).append("\n");
        sb.append("    migrationIp: ").append(toIndentedString(migrationIp)).append("\n");
        sb.append("    subTasks: ").append(toIndentedString(subTasks)).append("\n");
        sb.append("    sourceServer: ").append(toIndentedString(sourceServer)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    targetServer: ").append(toIndentedString(targetServer)).append("\n");
        sb.append("    logCollectStatus: ").append(toIndentedString(logCollectStatus)).append("\n");
        sb.append("    cloneServer: ").append(toIndentedString(cloneServer)).append("\n");
        sb.append("    syncing: ").append(toIndentedString(syncing)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
