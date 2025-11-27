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

/**
 * 批量查询任务时返回体重返回的任务信息。
 */
public class TasksResponseBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 任务类型，创建时必选，更新时可选 MIGRATE_FILE:文件级迁移 MIGRATE_BLOCK:块级迁移
     */
    public static final class TypeEnum {

        /**
         * Enum MIGRATE_FILE for value: "MIGRATE_FILE"
         */
        public static final TypeEnum MIGRATE_FILE = new TypeEnum("MIGRATE_FILE");

        /**
         * Enum MIGRATE_BLOCK for value: "MIGRATE_BLOCK"
         */
        public static final TypeEnum MIGRATE_BLOCK = new TypeEnum("MIGRATE_BLOCK");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("MIGRATE_FILE", MIGRATE_FILE);
            map.put("MIGRATE_BLOCK", MIGRATE_BLOCK);
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

    /**
     * 操作系统类型，分为WINDOWS和LINUX，创建时必选，更新时可选
     */
    public static final class OsTypeEnum {

        /**
         * Enum WINDOWS for value: "WINDOWS"
         */
        public static final OsTypeEnum WINDOWS = new OsTypeEnum("WINDOWS");

        /**
         * Enum LINUX for value: "LINUX"
         */
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new OsTypeEnum(value));
        }

        public static OsTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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

    /**
     * 迁移任务状态 READY: 准备就绪 RUNNING: 迁移中 SYNCING: 同步中 MIGRATE_SUCCESS: 迁移成功 SYNC_SUCCESS: 同步成功 MIGRATE_FAIL: 失败 SYNC_FAIL: 同步失败 ABORTING: 中止中 ABORT: 中止 SKIPPING: 跳过中 DELETING: 删除中 RESETING: 回滚中
     */
    public static final class StateEnum {

        /**
         * Enum READY for value: "READY"
         */
        public static final StateEnum READY = new StateEnum("READY");

        /**
         * Enum RUNNING for value: "RUNNING"
         */
        public static final StateEnum RUNNING = new StateEnum("RUNNING");

        /**
         * Enum SYNCING for value: "SYNCING"
         */
        public static final StateEnum SYNCING = new StateEnum("SYNCING");

        /**
         * Enum MIGRATE_SUCCESS for value: "MIGRATE_SUCCESS"
         */
        public static final StateEnum MIGRATE_SUCCESS = new StateEnum("MIGRATE_SUCCESS");

        /**
         * Enum SYNC_SUCCESS for value: "SYNC_SUCCESS"
         */
        public static final StateEnum SYNC_SUCCESS = new StateEnum("SYNC_SUCCESS");

        /**
         * Enum MIGRATE_FAIL for value: "MIGRATE_FAIL"
         */
        public static final StateEnum MIGRATE_FAIL = new StateEnum("MIGRATE_FAIL");

        /**
         * Enum SYNC_FAIL for value: "SYNC_FAIL"
         */
        public static final StateEnum SYNC_FAIL = new StateEnum("SYNC_FAIL");

        /**
         * Enum ABORTING for value: "ABORTING"
         */
        public static final StateEnum ABORTING = new StateEnum("ABORTING");

        /**
         * Enum ABORT for value: "ABORT"
         */
        public static final StateEnum ABORT = new StateEnum("ABORT");

        /**
         * Enum SKIPPING for value: "SKIPPING"
         */
        public static final StateEnum SKIPPING = new StateEnum("SKIPPING");

        /**
         * Enum DELETING for value: "DELETING"
         */
        public static final StateEnum DELETING = new StateEnum("DELETING");

        /**
         * Enum RESETING for value: "RESETING"
         */
        public static final StateEnum RESETING = new StateEnum("RESETING");

        private static final Map<String, StateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StateEnum> createStaticFields() {
            Map<String, StateEnum> map = new HashMap<>();
            map.put("READY", READY);
            map.put("RUNNING", RUNNING);
            map.put("SYNCING", SYNCING);
            map.put("MIGRATE_SUCCESS", MIGRATE_SUCCESS);
            map.put("SYNC_SUCCESS", SYNC_SUCCESS);
            map.put("MIGRATE_FAIL", MIGRATE_FAIL);
            map.put("SYNC_FAIL", SYNC_FAIL);
            map.put("ABORTING", ABORTING);
            map.put("ABORT", ABORT);
            map.put("SKIPPING", SKIPPING);
            map.put("DELETING", DELETING);
            map.put("RESETING", RESETING);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StateEnum(String value) {
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
        public static StateEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StateEnum(value));
        }

        public static StateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StateEnum) {
                return this.value.equals(((StateEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private StateEnum state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "estimate_complete_time")

    private Long estimateCompleteTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_date")

    private Long createDate;

    /**
     * 进程优先级 0：低 1：标准 2：高
     */
    public static final class PriorityEnum {

        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final PriorityEnum NUMBER_0 = new PriorityEnum(0);

        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final PriorityEnum NUMBER_1 = new PriorityEnum(1);

        /**
         * Enum NUMBER_2 for value: 2
         */
        public static final PriorityEnum NUMBER_2 = new PriorityEnum(2);

        private static final Map<Integer, PriorityEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, PriorityEnum> createStaticFields() {
            Map<Integer, PriorityEnum> map = new HashMap<>();
            map.put(0, NUMBER_0);
            map.put(1, NUMBER_1);
            map.put(2, NUMBER_2);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        PriorityEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static PriorityEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PriorityEnum(value));
        }

        public static PriorityEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PriorityEnum) {
                return this.value.equals(((PriorityEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private PriorityEnum priority;

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

    /**
     * 日志收集状态 INIT:就绪 UPLOADING:上传中 UPLOAD_FAIL:上传失败 UPLOADED:已上传
     */
    public static final class LogCollectStatusEnum {

        /**
         * Enum INIT for value: "INIT"
         */
        public static final LogCollectStatusEnum INIT = new LogCollectStatusEnum("INIT");

        /**
         * Enum UPLOADING for value: "UPLOADING"
         */
        public static final LogCollectStatusEnum UPLOADING = new LogCollectStatusEnum("UPLOADING");

        /**
         * Enum UPLOAD_FAIL for value: "UPLOAD_FAIL"
         */
        public static final LogCollectStatusEnum UPLOAD_FAIL = new LogCollectStatusEnum("UPLOAD_FAIL");

        /**
         * Enum UPLOADED for value: "UPLOADED"
         */
        public static final LogCollectStatusEnum UPLOADED = new LogCollectStatusEnum("UPLOADED");

        private static final Map<String, LogCollectStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LogCollectStatusEnum> createStaticFields() {
            Map<String, LogCollectStatusEnum> map = new HashMap<>();
            map.put("INIT", INIT);
            map.put("UPLOADING", UPLOADING);
            map.put("UPLOAD_FAIL", UPLOAD_FAIL);
            map.put("UPLOADED", UPLOADED);
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LogCollectStatusEnum(value));
        }

        public static LogCollectStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_check_info")

    private NetworkCheckInfoRequestBody networkCheckInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "special_config")

    private List<ConfigBody> specialConfig = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_cpu_usage")

    private Double totalCpuUsage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_cpu_usage")

    private Double agentCpuUsage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_mem_usage")

    private Double totalMemUsage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_mem_usage")

    private Double agentMemUsage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_disk_io")

    private Double totalDiskIo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_disk_io")

    private Double agentDiskIo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "need_migration_test")

    private Boolean needMigrationTest;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subtask_info")

    private String subtaskInfo;

    public TasksResponseBody withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 迁移任务ID
     * @return id
     */
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

    /**
     * 任务名称（用户自定义）
     * @return name
     */
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

    /**
     * 任务类型，创建时必选，更新时可选 MIGRATE_FILE:文件级迁移 MIGRATE_BLOCK:块级迁移
     * @return type
     */
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

    /**
     * 操作系统类型，分为WINDOWS和LINUX，创建时必选，更新时可选
     * @return osType
     */
    public OsTypeEnum getOsType() {
        return osType;
    }

    public void setOsType(OsTypeEnum osType) {
        this.osType = osType;
    }

    public TasksResponseBody withState(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * 迁移任务状态 READY: 准备就绪 RUNNING: 迁移中 SYNCING: 同步中 MIGRATE_SUCCESS: 迁移成功 SYNC_SUCCESS: 同步成功 MIGRATE_FAIL: 失败 SYNC_FAIL: 同步失败 ABORTING: 中止中 ABORT: 中止 SKIPPING: 跳过中 DELETING: 删除中 RESETING: 回滚中
     * @return state
     */
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public TasksResponseBody withEstimateCompleteTime(Long estimateCompleteTime) {
        this.estimateCompleteTime = estimateCompleteTime;
        return this;
    }

    /**
     * 预估完成时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return estimateCompleteTime
     */
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

    /**
     * 任务创建时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return createDate
     */
    public Long getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Long createDate) {
        this.createDate = createDate;
    }

    public TasksResponseBody withPriority(PriorityEnum priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 进程优先级 0：低 1：标准 2：高
     * minimum: 0
     * maximum: 2
     * @return priority
     */
    public PriorityEnum getPriority() {
        return priority;
    }

    public void setPriority(PriorityEnum priority) {
        this.priority = priority;
    }

    public TasksResponseBody withSpeedLimit(Integer speedLimit) {
        this.speedLimit = speedLimit;
        return this;
    }

    /**
     * 迁移限速
     * minimum: 0
     * maximum: 65535
     * @return speedLimit
     */
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

    /**
     * 迁移速率，单位：Mbit/s
     * minimum: 0
     * maximum: 1E+4
     * @return migrateSpeed
     */
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

    /**
     * 压缩率
     * minimum: 0
     * maximum: 1E+4
     * @return compressRate
     */
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

    /**
     * 迁移完成后是否启动目的端服务器 true：启动 false：停止
     * @return startTargetServer
     */
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

    /**
     * 错误信息
     * @return errorJson
     */
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

    /**
     * 任务总耗时
     * minimum: 0
     * maximum: 9223372036854775807
     * @return totalTime
     */
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

    /**
     * 目的端服务器的IP地址。 公网迁移时请填写弹性IP地址 专线迁移时请填写私有IP地址
     * @return migrationIp
     */
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

    /**
     * 任务关联的子任务信息
     * @return subTasks
     */
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

    /**
     * Get sourceServer
     * @return sourceServer
     */
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

    /**
     * 迁移项目ID
     * @return enterpriseProjectId
     */
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

    /**
     * Get targetServer
     * @return targetServer
     */
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

    /**
     * 日志收集状态 INIT:就绪 UPLOADING:上传中 UPLOAD_FAIL:上传失败 UPLOADED:已上传
     * @return logCollectStatus
     */
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

    /**
     * Get cloneServer
     * @return cloneServer
     */
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

    /**
     * 是否同步
     * @return syncing
     */
    public Boolean getSyncing() {
        return syncing;
    }

    public void setSyncing(Boolean syncing) {
        this.syncing = syncing;
    }

    public TasksResponseBody withNetworkCheckInfo(NetworkCheckInfoRequestBody networkCheckInfo) {
        this.networkCheckInfo = networkCheckInfo;
        return this;
    }

    public TasksResponseBody withNetworkCheckInfo(Consumer<NetworkCheckInfoRequestBody> networkCheckInfoSetter) {
        if (this.networkCheckInfo == null) {
            this.networkCheckInfo = new NetworkCheckInfoRequestBody();
            networkCheckInfoSetter.accept(this.networkCheckInfo);
        }

        return this;
    }

    /**
     * Get networkCheckInfo
     * @return networkCheckInfo
     */
    public NetworkCheckInfoRequestBody getNetworkCheckInfo() {
        return networkCheckInfo;
    }

    public void setNetworkCheckInfo(NetworkCheckInfoRequestBody networkCheckInfo) {
        this.networkCheckInfo = networkCheckInfo;
    }

    public TasksResponseBody withSpecialConfig(List<ConfigBody> specialConfig) {
        this.specialConfig = specialConfig;
        return this;
    }

    public TasksResponseBody addSpecialConfigItem(ConfigBody specialConfigItem) {
        if (this.specialConfig == null) {
            this.specialConfig = new ArrayList<>();
        }
        this.specialConfig.add(specialConfigItem);
        return this;
    }

    public TasksResponseBody withSpecialConfig(Consumer<List<ConfigBody>> specialConfigSetter) {
        if (this.specialConfig == null) {
            this.specialConfig = new ArrayList<>();
        }
        specialConfigSetter.accept(this.specialConfig);
        return this;
    }

    /**
     * 特殊配置项配置信息
     * @return specialConfig
     */
    public List<ConfigBody> getSpecialConfig() {
        return specialConfig;
    }

    public void setSpecialConfig(List<ConfigBody> specialConfig) {
        this.specialConfig = specialConfig;
    }

    public TasksResponseBody withTotalCpuUsage(Double totalCpuUsage) {
        this.totalCpuUsage = totalCpuUsage;
        return this;
    }

    /**
     * 主机的CPU使用率，单位是百分比
     * minimum: 0
     * maximum: 1E+2
     * @return totalCpuUsage
     */
    public Double getTotalCpuUsage() {
        return totalCpuUsage;
    }

    public void setTotalCpuUsage(Double totalCpuUsage) {
        this.totalCpuUsage = totalCpuUsage;
    }

    public TasksResponseBody withAgentCpuUsage(Double agentCpuUsage) {
        this.agentCpuUsage = agentCpuUsage;
        return this;
    }

    /**
     * Agent的CPU使用率，单位是百分比
     * minimum: 0
     * maximum: 1E+2
     * @return agentCpuUsage
     */
    public Double getAgentCpuUsage() {
        return agentCpuUsage;
    }

    public void setAgentCpuUsage(Double agentCpuUsage) {
        this.agentCpuUsage = agentCpuUsage;
    }

    public TasksResponseBody withTotalMemUsage(Double totalMemUsage) {
        this.totalMemUsage = totalMemUsage;
        return this;
    }

    /**
     * 主机的内存使用值，单位是MB
     * minimum: 0
     * maximum: 1048576
     * @return totalMemUsage
     */
    public Double getTotalMemUsage() {
        return totalMemUsage;
    }

    public void setTotalMemUsage(Double totalMemUsage) {
        this.totalMemUsage = totalMemUsage;
    }

    public TasksResponseBody withAgentMemUsage(Double agentMemUsage) {
        this.agentMemUsage = agentMemUsage;
        return this;
    }

    /**
     * Agent的内存使用值，单位是MB
     * minimum: 0
     * maximum: 1048576
     * @return agentMemUsage
     */
    public Double getAgentMemUsage() {
        return agentMemUsage;
    }

    public void setAgentMemUsage(Double agentMemUsage) {
        this.agentMemUsage = agentMemUsage;
    }

    public TasksResponseBody withTotalDiskIo(Double totalDiskIo) {
        this.totalDiskIo = totalDiskIo;
        return this;
    }

    /**
     * 主机的磁盘I/O值，单位是Mbit/s
     * minimum: 0
     * maximum: 1E+4
     * @return totalDiskIo
     */
    public Double getTotalDiskIo() {
        return totalDiskIo;
    }

    public void setTotalDiskIo(Double totalDiskIo) {
        this.totalDiskIo = totalDiskIo;
    }

    public TasksResponseBody withAgentDiskIo(Double agentDiskIo) {
        this.agentDiskIo = agentDiskIo;
        return this;
    }

    /**
     * Agent的磁盘I/O值，单位是Mbit/s
     * minimum: 0
     * maximum: 1E+4
     * @return agentDiskIo
     */
    public Double getAgentDiskIo() {
        return agentDiskIo;
    }

    public void setAgentDiskIo(Double agentDiskIo) {
        this.agentDiskIo = agentDiskIo;
    }

    public TasksResponseBody withNeedMigrationTest(Boolean needMigrationTest) {
        this.needMigrationTest = needMigrationTest;
        return this;
    }

    /**
     * 是否开启迁移演练
     * @return needMigrationTest
     */
    public Boolean getNeedMigrationTest() {
        return needMigrationTest;
    }

    public void setNeedMigrationTest(Boolean needMigrationTest) {
        this.needMigrationTest = needMigrationTest;
    }

    public TasksResponseBody withSubtaskInfo(String subtaskInfo) {
        this.subtaskInfo = subtaskInfo;
        return this;
    }

    /**
     * 当前子任务及进度
     * @return subtaskInfo
     */
    public String getSubtaskInfo() {
        return subtaskInfo;
    }

    public void setSubtaskInfo(String subtaskInfo) {
        this.subtaskInfo = subtaskInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TasksResponseBody that = (TasksResponseBody) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.type, that.type) && Objects.equals(this.osType, that.osType)
            && Objects.equals(this.state, that.state)
            && Objects.equals(this.estimateCompleteTime, that.estimateCompleteTime)
            && Objects.equals(this.createDate, that.createDate) && Objects.equals(this.priority, that.priority)
            && Objects.equals(this.speedLimit, that.speedLimit) && Objects.equals(this.migrateSpeed, that.migrateSpeed)
            && Objects.equals(this.compressRate, that.compressRate)
            && Objects.equals(this.startTargetServer, that.startTargetServer)
            && Objects.equals(this.errorJson, that.errorJson) && Objects.equals(this.totalTime, that.totalTime)
            && Objects.equals(this.migrationIp, that.migrationIp) && Objects.equals(this.subTasks, that.subTasks)
            && Objects.equals(this.sourceServer, that.sourceServer)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.targetServer, that.targetServer)
            && Objects.equals(this.logCollectStatus, that.logCollectStatus)
            && Objects.equals(this.cloneServer, that.cloneServer) && Objects.equals(this.syncing, that.syncing)
            && Objects.equals(this.networkCheckInfo, that.networkCheckInfo)
            && Objects.equals(this.specialConfig, that.specialConfig)
            && Objects.equals(this.totalCpuUsage, that.totalCpuUsage)
            && Objects.equals(this.agentCpuUsage, that.agentCpuUsage)
            && Objects.equals(this.totalMemUsage, that.totalMemUsage)
            && Objects.equals(this.agentMemUsage, that.agentMemUsage)
            && Objects.equals(this.totalDiskIo, that.totalDiskIo) && Objects.equals(this.agentDiskIo, that.agentDiskIo)
            && Objects.equals(this.needMigrationTest, that.needMigrationTest)
            && Objects.equals(this.subtaskInfo, that.subtaskInfo);
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
            syncing,
            networkCheckInfo,
            specialConfig,
            totalCpuUsage,
            agentCpuUsage,
            totalMemUsage,
            agentMemUsage,
            totalDiskIo,
            agentDiskIo,
            needMigrationTest,
            subtaskInfo);
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
        sb.append("    networkCheckInfo: ").append(toIndentedString(networkCheckInfo)).append("\n");
        sb.append("    specialConfig: ").append(toIndentedString(specialConfig)).append("\n");
        sb.append("    totalCpuUsage: ").append(toIndentedString(totalCpuUsage)).append("\n");
        sb.append("    agentCpuUsage: ").append(toIndentedString(agentCpuUsage)).append("\n");
        sb.append("    totalMemUsage: ").append(toIndentedString(totalMemUsage)).append("\n");
        sb.append("    agentMemUsage: ").append(toIndentedString(agentMemUsage)).append("\n");
        sb.append("    totalDiskIo: ").append(toIndentedString(totalDiskIo)).append("\n");
        sb.append("    agentDiskIo: ").append(toIndentedString(agentDiskIo)).append("\n");
        sb.append("    needMigrationTest: ").append(toIndentedString(needMigrationTest)).append("\n");
        sb.append("    subtaskInfo: ").append(toIndentedString(subtaskInfo)).append("\n");
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
