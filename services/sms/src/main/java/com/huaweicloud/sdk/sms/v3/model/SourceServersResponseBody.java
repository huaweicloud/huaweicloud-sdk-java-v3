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

/** 源端服务器列表信息 */
public class SourceServersResponseBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private String ip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "add_date")

    private Long addDate;

    /** 操作系统类型，OS_TYPE (WINDOWS/LINUX) */
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
    @JsonProperty(value = "os_version")

    private String osVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "oem_system")

    private Boolean oemSystem;

    /** 源端服务器状态 */
    public static final class StateEnum {

        /** Enum UNAVAILABLE_ for value: "unavailable:环境校验不通过" */
        public static final StateEnum UNAVAILABLE_ = new StateEnum("unavailable:环境校验不通过");

        /** Enum WAITING_ for value: "waiting:等待" */
        public static final StateEnum WAITING_ = new StateEnum("waiting:等待");

        /** Enum INITIALIZE_ for value: "initialize:初始化" */
        public static final StateEnum INITIALIZE_ = new StateEnum("initialize:初始化");

        /** Enum REPLICATE_ for value: "replicate:复制" */
        public static final StateEnum REPLICATE_ = new StateEnum("replicate:复制");

        /** Enum SYNCING_ for value: "syncing:持续同步" */
        public static final StateEnum SYNCING_ = new StateEnum("syncing:持续同步");

        /** Enum STOPPING_ for value: "stopping:暂停中" */
        public static final StateEnum STOPPING_ = new StateEnum("stopping:暂停中");

        /** Enum STOPPED_ for value: "stopped:已暂停" */
        public static final StateEnum STOPPED_ = new StateEnum("stopped:已暂停");

        /** Enum DELETING_ for value: "deleting:删除中" */
        public static final StateEnum DELETING_ = new StateEnum("deleting:删除中");

        /** Enum ERROR_ for value: "error:错误" */
        public static final StateEnum ERROR_ = new StateEnum("error:错误");

        /** Enum CLONING_ for value: "cloning:等待克隆完成" */
        public static final StateEnum CLONING_ = new StateEnum("cloning:等待克隆完成");

        /** Enum TESTING_ for value: "testing:启动目的端中" */
        public static final StateEnum TESTING_ = new StateEnum("testing:启动目的端中");

        /** Enum _FINISHED_ for value: " finished:启动目的端完成" */
        public static final StateEnum _FINISHED_ = new StateEnum(" finished:启动目的端完成");

        private static final Map<String, StateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StateEnum> createStaticFields() {
            Map<String, StateEnum> map = new HashMap<>();
            map.put("unavailable:环境校验不通过", UNAVAILABLE_);
            map.put("waiting:等待", WAITING_);
            map.put("initialize:初始化", INITIALIZE_);
            map.put("replicate:复制", REPLICATE_);
            map.put("syncing:持续同步", SYNCING_);
            map.put("stopping:暂停中", STOPPING_);
            map.put("stopped:已暂停", STOPPED_);
            map.put("deleting:删除中", DELETING_);
            map.put("error:错误", ERROR_);
            map.put("cloning:等待克隆完成", CLONING_);
            map.put("testing:启动目的端中", TESTING_);
            map.put(" finished:启动目的端完成", _FINISHED_);
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
            StateEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StateEnum(value);
            }
            return result;
        }

        public static StateEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            StateEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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
    @JsonProperty(value = "connected")

    private Boolean connected;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_quantity")

    private Integer cpuQuantity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory")

    private Long memory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_task")

    private TaskByServerSources currentTask;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "checks")

    private List<EnvironmentCheck> checks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "init_target_server")

    private InitTargetServer initTargetServer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replicatesize")

    private Long replicatesize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stage_action_time")

    private Long stageActionTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "totalsize")

    private Long totalsize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_visit_time")

    private Long lastVisitTime;

    /** 迁移周期 */
    public static final class MigrationCycleEnum {

        /** Enum CUTOVERING_ for value: "cutovering:启动目的端中" */
        public static final MigrationCycleEnum CUTOVERING_ = new MigrationCycleEnum("cutovering:启动目的端中");

        /** Enum CUTOVERED_ for value: "cutovered:迁移完成" */
        public static final MigrationCycleEnum CUTOVERED_ = new MigrationCycleEnum("cutovered:迁移完成");

        /** Enum CHECKING_ for value: "checking:源端校验" */
        public static final MigrationCycleEnum CHECKING_ = new MigrationCycleEnum("checking:源端校验");

        /** Enum SETTING_ for value: "setting:设置目的端" */
        public static final MigrationCycleEnum SETTING_ = new MigrationCycleEnum("setting:设置目的端");

        /** Enum REPLICATING_ for value: "replicating:数据复制中" */
        public static final MigrationCycleEnum REPLICATING_ = new MigrationCycleEnum("replicating:数据复制中");

        /** Enum SYNCING_ for value: "syncing:同步中" */
        public static final MigrationCycleEnum SYNCING_ = new MigrationCycleEnum("syncing:同步中");

        private static final Map<String, MigrationCycleEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MigrationCycleEnum> createStaticFields() {
            Map<String, MigrationCycleEnum> map = new HashMap<>();
            map.put("cutovering:启动目的端中", CUTOVERING_);
            map.put("cutovered:迁移完成", CUTOVERED_);
            map.put("checking:源端校验", CHECKING_);
            map.put("setting:设置目的端", SETTING_);
            map.put("replicating:数据复制中", REPLICATING_);
            map.put("syncing:同步中", SYNCING_);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        MigrationCycleEnum(String value) {
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
        public static MigrationCycleEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            MigrationCycleEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new MigrationCycleEnum(value);
            }
            return result;
        }

        public static MigrationCycleEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            MigrationCycleEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof MigrationCycleEnum) {
                return this.value.equals(((MigrationCycleEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migration_cycle")

    private MigrationCycleEnum migrationCycle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state_action_time")

    private Long stateActionTime;

    public SourceServersResponseBody withId(String id) {
        this.id = id;
        return this;
    }

    /** 源端服务器id
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SourceServersResponseBody withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /** 源端服务器的ip地址
     * 
     * @return ip */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public SourceServersResponseBody withName(String name) {
        this.name = name;
        return this;
    }

    /** 源端服务器名称
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SourceServersResponseBody withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /** 企业项目id
     * 
     * @return enterpriseProjectId */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public SourceServersResponseBody withAddDate(Long addDate) {
        this.addDate = addDate;
        return this;
    }

    /** 源端服务器的注册时间 minimum: 0 maximum: 9223372036854775807
     * 
     * @return addDate */
    public Long getAddDate() {
        return addDate;
    }

    public void setAddDate(Long addDate) {
        this.addDate = addDate;
    }

    public SourceServersResponseBody withOsType(OsTypeEnum osType) {
        this.osType = osType;
        return this;
    }

    /** 操作系统类型，OS_TYPE (WINDOWS/LINUX)
     * 
     * @return osType */
    public OsTypeEnum getOsType() {
        return osType;
    }

    public void setOsType(OsTypeEnum osType) {
        this.osType = osType;
    }

    public SourceServersResponseBody withOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    /** 系统详细版本号，如CENTOS7.6等
     * 
     * @return osVersion */
    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public SourceServersResponseBody withOemSystem(Boolean oemSystem) {
        this.oemSystem = oemSystem;
        return this;
    }

    /** 是否是OEM操作系统(Windows)
     * 
     * @return oemSystem */
    public Boolean getOemSystem() {
        return oemSystem;
    }

    public void setOemSystem(Boolean oemSystem) {
        this.oemSystem = oemSystem;
    }

    public SourceServersResponseBody withState(StateEnum state) {
        this.state = state;
        return this;
    }

    /** 源端服务器状态
     * 
     * @return state */
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public SourceServersResponseBody withConnected(Boolean connected) {
        this.connected = connected;
        return this;
    }

    /** 源端服务器与主机迁移服务端是否连接
     * 
     * @return connected */
    public Boolean getConnected() {
        return connected;
    }

    public void setConnected(Boolean connected) {
        this.connected = connected;
    }

    public SourceServersResponseBody withCpuQuantity(Integer cpuQuantity) {
        this.cpuQuantity = cpuQuantity;
        return this;
    }

    /** 源端CPU核心数 minimum: 0 maximum: 2147483647
     * 
     * @return cpuQuantity */
    public Integer getCpuQuantity() {
        return cpuQuantity;
    }

    public void setCpuQuantity(Integer cpuQuantity) {
        this.cpuQuantity = cpuQuantity;
    }

    public SourceServersResponseBody withMemory(Long memory) {
        this.memory = memory;
        return this;
    }

    /** 源端物理内存大小（单位：字节） minimum: 0 maximum: 9223372036854775807
     * 
     * @return memory */
    public Long getMemory() {
        return memory;
    }

    public void setMemory(Long memory) {
        this.memory = memory;
    }

    public SourceServersResponseBody withCurrentTask(TaskByServerSources currentTask) {
        this.currentTask = currentTask;
        return this;
    }

    public SourceServersResponseBody withCurrentTask(Consumer<TaskByServerSources> currentTaskSetter) {
        if (this.currentTask == null) {
            this.currentTask = new TaskByServerSources();
            currentTaskSetter.accept(this.currentTask);
        }

        return this;
    }

    /** Get currentTask
     * 
     * @return currentTask */
    public TaskByServerSources getCurrentTask() {
        return currentTask;
    }

    public void setCurrentTask(TaskByServerSources currentTask) {
        this.currentTask = currentTask;
    }

    public SourceServersResponseBody withChecks(List<EnvironmentCheck> checks) {
        this.checks = checks;
        return this;
    }

    public SourceServersResponseBody addChecksItem(EnvironmentCheck checksItem) {
        if (this.checks == null) {
            this.checks = new ArrayList<>();
        }
        this.checks.add(checksItem);
        return this;
    }

    public SourceServersResponseBody withChecks(Consumer<List<EnvironmentCheck>> checksSetter) {
        if (this.checks == null) {
            this.checks = new ArrayList<>();
        }
        checksSetter.accept(this.checks);
        return this;
    }

    /** 源端校验检查项列表
     * 
     * @return checks */
    public List<EnvironmentCheck> getChecks() {
        return checks;
    }

    public void setChecks(List<EnvironmentCheck> checks) {
        this.checks = checks;
    }

    public SourceServersResponseBody withInitTargetServer(InitTargetServer initTargetServer) {
        this.initTargetServer = initTargetServer;
        return this;
    }

    public SourceServersResponseBody withInitTargetServer(Consumer<InitTargetServer> initTargetServerSetter) {
        if (this.initTargetServer == null) {
            this.initTargetServer = new InitTargetServer();
            initTargetServerSetter.accept(this.initTargetServer);
        }

        return this;
    }

    /** Get initTargetServer
     * 
     * @return initTargetServer */
    public InitTargetServer getInitTargetServer() {
        return initTargetServer;
    }

    public void setInitTargetServer(InitTargetServer initTargetServer) {
        this.initTargetServer = initTargetServer;
    }

    public SourceServersResponseBody withReplicatesize(Long replicatesize) {
        this.replicatesize = replicatesize;
        return this;
    }

    /** 已复制的大小（单位：字节） minimum: 0 maximum: 9223372036854775807
     * 
     * @return replicatesize */
    public Long getReplicatesize() {
        return replicatesize;
    }

    public void setReplicatesize(Long replicatesize) {
        this.replicatesize = replicatesize;
    }

    public SourceServersResponseBody withStageActionTime(Long stageActionTime) {
        this.stageActionTime = stageActionTime;
        return this;
    }

    /** 迁移周期（migration_cycle）上一次变化的时间 minimum: 0 maximum: 9223372036854775807
     * 
     * @return stageActionTime */
    public Long getStageActionTime() {
        return stageActionTime;
    }

    public void setStageActionTime(Long stageActionTime) {
        this.stageActionTime = stageActionTime;
    }

    public SourceServersResponseBody withTotalsize(Long totalsize) {
        this.totalsize = totalsize;
        return this;
    }

    /** 需要迁移的数据量总大小（单位：字节） minimum: 0 maximum: 9223372036854775807
     * 
     * @return totalsize */
    public Long getTotalsize() {
        return totalsize;
    }

    public void setTotalsize(Long totalsize) {
        this.totalsize = totalsize;
    }

    public SourceServersResponseBody withLastVisitTime(Long lastVisitTime) {
        this.lastVisitTime = lastVisitTime;
        return this;
    }

    /** Agent上一次连接状态发生变化的时间 minimum: 0 maximum: 9223372036854775807
     * 
     * @return lastVisitTime */
    public Long getLastVisitTime() {
        return lastVisitTime;
    }

    public void setLastVisitTime(Long lastVisitTime) {
        this.lastVisitTime = lastVisitTime;
    }

    public SourceServersResponseBody withMigrationCycle(MigrationCycleEnum migrationCycle) {
        this.migrationCycle = migrationCycle;
        return this;
    }

    /** 迁移周期
     * 
     * @return migrationCycle */
    public MigrationCycleEnum getMigrationCycle() {
        return migrationCycle;
    }

    public void setMigrationCycle(MigrationCycleEnum migrationCycle) {
        this.migrationCycle = migrationCycle;
    }

    public SourceServersResponseBody withStateActionTime(Long stateActionTime) {
        this.stateActionTime = stateActionTime;
        return this;
    }

    /** 源端状态（state）上次发生变化的时间 minimum: 0 maximum: 9223372036854775807
     * 
     * @return stateActionTime */
    public Long getStateActionTime() {
        return stateActionTime;
    }

    public void setStateActionTime(Long stateActionTime) {
        this.stateActionTime = stateActionTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SourceServersResponseBody sourceServersResponseBody = (SourceServersResponseBody) o;
        return Objects.equals(this.id, sourceServersResponseBody.id)
            && Objects.equals(this.ip, sourceServersResponseBody.ip)
            && Objects.equals(this.name, sourceServersResponseBody.name)
            && Objects.equals(this.enterpriseProjectId, sourceServersResponseBody.enterpriseProjectId)
            && Objects.equals(this.addDate, sourceServersResponseBody.addDate)
            && Objects.equals(this.osType, sourceServersResponseBody.osType)
            && Objects.equals(this.osVersion, sourceServersResponseBody.osVersion)
            && Objects.equals(this.oemSystem, sourceServersResponseBody.oemSystem)
            && Objects.equals(this.state, sourceServersResponseBody.state)
            && Objects.equals(this.connected, sourceServersResponseBody.connected)
            && Objects.equals(this.cpuQuantity, sourceServersResponseBody.cpuQuantity)
            && Objects.equals(this.memory, sourceServersResponseBody.memory)
            && Objects.equals(this.currentTask, sourceServersResponseBody.currentTask)
            && Objects.equals(this.checks, sourceServersResponseBody.checks)
            && Objects.equals(this.initTargetServer, sourceServersResponseBody.initTargetServer)
            && Objects.equals(this.replicatesize, sourceServersResponseBody.replicatesize)
            && Objects.equals(this.stageActionTime, sourceServersResponseBody.stageActionTime)
            && Objects.equals(this.totalsize, sourceServersResponseBody.totalsize)
            && Objects.equals(this.lastVisitTime, sourceServersResponseBody.lastVisitTime)
            && Objects.equals(this.migrationCycle, sourceServersResponseBody.migrationCycle)
            && Objects.equals(this.stateActionTime, sourceServersResponseBody.stateActionTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            ip,
            name,
            enterpriseProjectId,
            addDate,
            osType,
            osVersion,
            oemSystem,
            state,
            connected,
            cpuQuantity,
            memory,
            currentTask,
            checks,
            initTargetServer,
            replicatesize,
            stageActionTime,
            totalsize,
            lastVisitTime,
            migrationCycle,
            stateActionTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SourceServersResponseBody {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    addDate: ").append(toIndentedString(addDate)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
        sb.append("    oemSystem: ").append(toIndentedString(oemSystem)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    connected: ").append(toIndentedString(connected)).append("\n");
        sb.append("    cpuQuantity: ").append(toIndentedString(cpuQuantity)).append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
        sb.append("    currentTask: ").append(toIndentedString(currentTask)).append("\n");
        sb.append("    checks: ").append(toIndentedString(checks)).append("\n");
        sb.append("    initTargetServer: ").append(toIndentedString(initTargetServer)).append("\n");
        sb.append("    replicatesize: ").append(toIndentedString(replicatesize)).append("\n");
        sb.append("    stageActionTime: ").append(toIndentedString(stageActionTime)).append("\n");
        sb.append("    totalsize: ").append(toIndentedString(totalsize)).append("\n");
        sb.append("    lastVisitTime: ").append(toIndentedString(lastVisitTime)).append("\n");
        sb.append("    migrationCycle: ").append(toIndentedString(migrationCycle)).append("\n");
        sb.append("    stateActionTime: ").append(toIndentedString(stateActionTime)).append("\n");
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
