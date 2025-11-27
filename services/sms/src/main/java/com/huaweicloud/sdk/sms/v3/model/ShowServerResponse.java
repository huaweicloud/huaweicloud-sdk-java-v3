package com.huaweicloud.sdk.sms.v3.model;

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
public class ShowServerResponse extends SdkResponse {

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
    @JsonProperty(value = "hostname")

    private String hostname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "add_date")

    private Long addDate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private String osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_version")

    private String osVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "oem_system")

    private Boolean oemSystem;

    /**
     * 源端服务器状态 unavailable：环境校验不通过 waiting：等待 initialize：初始化 replicate：复制 syncing：持续同步 stopping：暂停中 stopped：已暂停 skipping：跳过中 deleting：删除中 clearing: 清理快照资源中 cleared：清理快照资源完成 clearfailed：清理快照资源失败 premigready：迁移演练就绪 premiged：迁移演练完成 premigfailed：迁移演练失败 cloning：等待克隆完成 cutovering：启动目的端中 finished：启动目的端完成 error：错误
     */
    public static final class StateEnum {

        /**
         * Enum UNAVAILABLE for value: "unavailable"
         */
        public static final StateEnum UNAVAILABLE = new StateEnum("unavailable");

        /**
         * Enum WAITING for value: "waiting"
         */
        public static final StateEnum WAITING = new StateEnum("waiting");

        /**
         * Enum INITIALIZE for value: "initialize"
         */
        public static final StateEnum INITIALIZE = new StateEnum("initialize");

        /**
         * Enum REPLICATE for value: "replicate"
         */
        public static final StateEnum REPLICATE = new StateEnum("replicate");

        /**
         * Enum SYNCING for value: "syncing"
         */
        public static final StateEnum SYNCING = new StateEnum("syncing");

        /**
         * Enum STOPPING for value: "stopping"
         */
        public static final StateEnum STOPPING = new StateEnum("stopping");

        /**
         * Enum STOPPED for value: "stopped"
         */
        public static final StateEnum STOPPED = new StateEnum("stopped");

        /**
         * Enum SKIPPING for value: "skipping"
         */
        public static final StateEnum SKIPPING = new StateEnum("skipping");

        /**
         * Enum DELETING for value: "deleting"
         */
        public static final StateEnum DELETING = new StateEnum("deleting");

        /**
         * Enum CLEARING for value: "clearing"
         */
        public static final StateEnum CLEARING = new StateEnum("clearing");

        /**
         * Enum CLEARED for value: "cleared"
         */
        public static final StateEnum CLEARED = new StateEnum("cleared");

        /**
         * Enum CLEARFAILED for value: "clearfailed"
         */
        public static final StateEnum CLEARFAILED = new StateEnum("clearfailed");

        /**
         * Enum PREMIGREADY for value: "premigready"
         */
        public static final StateEnum PREMIGREADY = new StateEnum("premigready");

        /**
         * Enum PREMIGED for value: "premiged"
         */
        public static final StateEnum PREMIGED = new StateEnum("premiged");

        /**
         * Enum PREMIGFAILED for value: "premigfailed"
         */
        public static final StateEnum PREMIGFAILED = new StateEnum("premigfailed");

        /**
         * Enum CLONING for value: "cloning"
         */
        public static final StateEnum CLONING = new StateEnum("cloning");

        /**
         * Enum CUTOVERING for value: "cutovering"
         */
        public static final StateEnum CUTOVERING = new StateEnum("cutovering");

        /**
         * Enum FINISHED for value: "finished"
         */
        public static final StateEnum FINISHED = new StateEnum("finished");

        /**
         * Enum ERROR for value: "error"
         */
        public static final StateEnum ERROR = new StateEnum("error");

        private static final Map<String, StateEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StateEnum> createStaticFields() {
            Map<String, StateEnum> map = new HashMap<>();
            map.put("unavailable", UNAVAILABLE);
            map.put("waiting", WAITING);
            map.put("initialize", INITIALIZE);
            map.put("replicate", REPLICATE);
            map.put("syncing", SYNCING);
            map.put("stopping", STOPPING);
            map.put("stopped", STOPPED);
            map.put("skipping", SKIPPING);
            map.put("deleting", DELETING);
            map.put("clearing", CLEARING);
            map.put("cleared", CLEARED);
            map.put("clearfailed", CLEARFAILED);
            map.put("premigready", PREMIGREADY);
            map.put("premiged", PREMIGED);
            map.put("premigfailed", PREMIGFAILED);
            map.put("cloning", CLONING);
            map.put("cutovering", CUTOVERING);
            map.put("finished", FINISHED);
            map.put("error", ERROR);
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
    @JsonProperty(value = "connected")

    private Boolean connected;

    /**
     * 源端服务器启动类型，如BIOS或者UEFI
     */
    public static final class FirmwareEnum {

        /**
         * Enum BIOS for value: "BIOS"
         */
        public static final FirmwareEnum BIOS = new FirmwareEnum("BIOS");

        /**
         * Enum UEFI for value: "UEFI"
         */
        public static final FirmwareEnum UEFI = new FirmwareEnum("UEFI");

        private static final Map<String, FirmwareEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, FirmwareEnum> createStaticFields() {
            Map<String, FirmwareEnum> map = new HashMap<>();
            map.put("BIOS", BIOS);
            map.put("UEFI", UEFI);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        FirmwareEnum(String value) {
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
        public static FirmwareEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new FirmwareEnum(value));
        }

        public static FirmwareEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof FirmwareEnum) {
                return this.value.equals(((FirmwareEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firmware")

    private FirmwareEnum firmware;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "init_target_server")

    private InitTargetServer initTargetServer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu_quantity")

    private Integer cpuQuantity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory")

    private Long memory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_task")

    private TaskByServerSource currentTask;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disks")

    private List<ServerDisk> disks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_groups")

    private List<VolumeGroups> volumeGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "btrfs_list")

    private List<BtrfsFileSystem> btrfsList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "networks")

    private List<NetWork> networks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "checks")

    private List<EnvironmentCheck> checks = null;

    /**
     * 迁移周期 cutovering:启动目的端中 cutovered:启动目的端完成 checking:检查中 setting:设置中 replicating:复制中 syncing:同步中
     */
    public static final class MigrationCycleEnum {

        /**
         * Enum CUTOVERING for value: "cutovering"
         */
        public static final MigrationCycleEnum CUTOVERING = new MigrationCycleEnum("cutovering");

        /**
         * Enum CUTOVERED for value: "cutovered"
         */
        public static final MigrationCycleEnum CUTOVERED = new MigrationCycleEnum("cutovered");

        /**
         * Enum CHECKING for value: "checking"
         */
        public static final MigrationCycleEnum CHECKING = new MigrationCycleEnum("checking");

        /**
         * Enum SETTING for value: "setting"
         */
        public static final MigrationCycleEnum SETTING = new MigrationCycleEnum("setting");

        /**
         * Enum REPLICATING for value: "replicating"
         */
        public static final MigrationCycleEnum REPLICATING = new MigrationCycleEnum("replicating");

        /**
         * Enum SYNCING for value: "syncing"
         */
        public static final MigrationCycleEnum SYNCING = new MigrationCycleEnum("syncing");

        private static final Map<String, MigrationCycleEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, MigrationCycleEnum> createStaticFields() {
            Map<String, MigrationCycleEnum> map = new HashMap<>();
            map.put("cutovering", CUTOVERING);
            map.put("cutovered", CUTOVERED);
            map.put("checking", CHECKING);
            map.put("setting", SETTING);
            map.put("replicating", REPLICATING);
            map.put("syncing", SYNCING);
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
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new MigrationCycleEnum(value));
        }

        public static MigrationCycleEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replicatesize")

    private Long replicatesize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "totalsize")

    private Long totalsize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_visit_time")

    private Long lastVisitTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stage_action_time")

    private Long stageActionTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_version")

    private String agentVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_tc")

    private Boolean hasTc;

    public ShowServerResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 源端服务器ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowServerResponse withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * 源端服务器的IP
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public ShowServerResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 用来区分不同源端服务器的名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowServerResponse withHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * 源端主机名，注册源端必选，更新非必选
     * @return hostname
     */
    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public ShowServerResponse withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ShowServerResponse withAddDate(Long addDate) {
        this.addDate = addDate;
        return this;
    }

    /**
     * 源端服务器注册的时间
     * minimum: 0
     * maximum: 9223372036854775807
     * @return addDate
     */
    public Long getAddDate() {
        return addDate;
    }

    public void setAddDate(Long addDate) {
        this.addDate = addDate;
    }

    public ShowServerResponse withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * 源端服务器的OS类型，分为Windows和Linux，注册必选，更新非必选
     * @return osType
     */
    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public ShowServerResponse withOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    /**
     * 操作系统版本，注册必选，更新非必选
     * @return osVersion
     */
    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public ShowServerResponse withOemSystem(Boolean oemSystem) {
        this.oemSystem = oemSystem;
        return this;
    }

    /**
     * 是否是OEM操作系统(Windows)
     * @return oemSystem
     */
    public Boolean getOemSystem() {
        return oemSystem;
    }

    public void setOemSystem(Boolean oemSystem) {
        this.oemSystem = oemSystem;
    }

    public ShowServerResponse withState(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * 源端服务器状态 unavailable：环境校验不通过 waiting：等待 initialize：初始化 replicate：复制 syncing：持续同步 stopping：暂停中 stopped：已暂停 skipping：跳过中 deleting：删除中 clearing: 清理快照资源中 cleared：清理快照资源完成 clearfailed：清理快照资源失败 premigready：迁移演练就绪 premiged：迁移演练完成 premigfailed：迁移演练失败 cloning：等待克隆完成 cutovering：启动目的端中 finished：启动目的端完成 error：错误
     * @return state
     */
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public ShowServerResponse withConnected(Boolean connected) {
        this.connected = connected;
        return this;
    }

    /**
     * 与Agent连接状态
     * @return connected
     */
    public Boolean getConnected() {
        return connected;
    }

    public void setConnected(Boolean connected) {
        this.connected = connected;
    }

    public ShowServerResponse withFirmware(FirmwareEnum firmware) {
        this.firmware = firmware;
        return this;
    }

    /**
     * 源端服务器启动类型，如BIOS或者UEFI
     * @return firmware
     */
    public FirmwareEnum getFirmware() {
        return firmware;
    }

    public void setFirmware(FirmwareEnum firmware) {
        this.firmware = firmware;
    }

    public ShowServerResponse withInitTargetServer(InitTargetServer initTargetServer) {
        this.initTargetServer = initTargetServer;
        return this;
    }

    public ShowServerResponse withInitTargetServer(Consumer<InitTargetServer> initTargetServerSetter) {
        if (this.initTargetServer == null) {
            this.initTargetServer = new InitTargetServer();
            initTargetServerSetter.accept(this.initTargetServer);
        }

        return this;
    }

    /**
     * Get initTargetServer
     * @return initTargetServer
     */
    public InitTargetServer getInitTargetServer() {
        return initTargetServer;
    }

    public void setInitTargetServer(InitTargetServer initTargetServer) {
        this.initTargetServer = initTargetServer;
    }

    public ShowServerResponse withCpuQuantity(Integer cpuQuantity) {
        this.cpuQuantity = cpuQuantity;
        return this;
    }

    /**
     * 源端CPU核心数
     * minimum: 0
     * maximum: 65535
     * @return cpuQuantity
     */
    public Integer getCpuQuantity() {
        return cpuQuantity;
    }

    public void setCpuQuantity(Integer cpuQuantity) {
        this.cpuQuantity = cpuQuantity;
    }

    public ShowServerResponse withMemory(Long memory) {
        this.memory = memory;
        return this;
    }

    /**
     * 源端服务器物理内存大小，单位MB
     * minimum: 0
     * maximum: 9223372036854775807
     * @return memory
     */
    public Long getMemory() {
        return memory;
    }

    public void setMemory(Long memory) {
        this.memory = memory;
    }

    public ShowServerResponse withCurrentTask(TaskByServerSource currentTask) {
        this.currentTask = currentTask;
        return this;
    }

    public ShowServerResponse withCurrentTask(Consumer<TaskByServerSource> currentTaskSetter) {
        if (this.currentTask == null) {
            this.currentTask = new TaskByServerSource();
            currentTaskSetter.accept(this.currentTask);
        }

        return this;
    }

    /**
     * Get currentTask
     * @return currentTask
     */
    public TaskByServerSource getCurrentTask() {
        return currentTask;
    }

    public void setCurrentTask(TaskByServerSource currentTask) {
        this.currentTask = currentTask;
    }

    public ShowServerResponse withDisks(List<ServerDisk> disks) {
        this.disks = disks;
        return this;
    }

    public ShowServerResponse addDisksItem(ServerDisk disksItem) {
        if (this.disks == null) {
            this.disks = new ArrayList<>();
        }
        this.disks.add(disksItem);
        return this;
    }

    public ShowServerResponse withDisks(Consumer<List<ServerDisk>> disksSetter) {
        if (this.disks == null) {
            this.disks = new ArrayList<>();
        }
        disksSetter.accept(this.disks);
        return this;
    }

    /**
     * 源端服务器磁盘信息
     * @return disks
     */
    public List<ServerDisk> getDisks() {
        return disks;
    }

    public void setDisks(List<ServerDisk> disks) {
        this.disks = disks;
    }

    public ShowServerResponse withVolumeGroups(List<VolumeGroups> volumeGroups) {
        this.volumeGroups = volumeGroups;
        return this;
    }

    public ShowServerResponse addVolumeGroupsItem(VolumeGroups volumeGroupsItem) {
        if (this.volumeGroups == null) {
            this.volumeGroups = new ArrayList<>();
        }
        this.volumeGroups.add(volumeGroupsItem);
        return this;
    }

    public ShowServerResponse withVolumeGroups(Consumer<List<VolumeGroups>> volumeGroupsSetter) {
        if (this.volumeGroups == null) {
            this.volumeGroups = new ArrayList<>();
        }
        volumeGroupsSetter.accept(this.volumeGroups);
        return this;
    }

    /**
     * 源端服务器的卷组信息，Linux必选，如果没有卷组，输入[]
     * @return volumeGroups
     */
    public List<VolumeGroups> getVolumeGroups() {
        return volumeGroups;
    }

    public void setVolumeGroups(List<VolumeGroups> volumeGroups) {
        this.volumeGroups = volumeGroups;
    }

    public ShowServerResponse withBtrfsList(List<BtrfsFileSystem> btrfsList) {
        this.btrfsList = btrfsList;
        return this;
    }

    public ShowServerResponse addBtrfsListItem(BtrfsFileSystem btrfsListItem) {
        if (this.btrfsList == null) {
            this.btrfsList = new ArrayList<>();
        }
        this.btrfsList.add(btrfsListItem);
        return this;
    }

    public ShowServerResponse withBtrfsList(Consumer<List<BtrfsFileSystem>> btrfsListSetter) {
        if (this.btrfsList == null) {
            this.btrfsList = new ArrayList<>();
        }
        btrfsListSetter.accept(this.btrfsList);
        return this;
    }

    /**
     * Linux 必选，源端的Btrfs信息。如果源端不存在Btrfs，则为[]
     * @return btrfsList
     */
    public List<BtrfsFileSystem> getBtrfsList() {
        return btrfsList;
    }

    public void setBtrfsList(List<BtrfsFileSystem> btrfsList) {
        this.btrfsList = btrfsList;
    }

    public ShowServerResponse withNetworks(List<NetWork> networks) {
        this.networks = networks;
        return this;
    }

    public ShowServerResponse addNetworksItem(NetWork networksItem) {
        if (this.networks == null) {
            this.networks = new ArrayList<>();
        }
        this.networks.add(networksItem);
        return this;
    }

    public ShowServerResponse withNetworks(Consumer<List<NetWork>> networksSetter) {
        if (this.networks == null) {
            this.networks = new ArrayList<>();
        }
        networksSetter.accept(this.networks);
        return this;
    }

    /**
     * 源端服务器的网卡信息
     * @return networks
     */
    public List<NetWork> getNetworks() {
        return networks;
    }

    public void setNetworks(List<NetWork> networks) {
        this.networks = networks;
    }

    public ShowServerResponse withChecks(List<EnvironmentCheck> checks) {
        this.checks = checks;
        return this;
    }

    public ShowServerResponse addChecksItem(EnvironmentCheck checksItem) {
        if (this.checks == null) {
            this.checks = new ArrayList<>();
        }
        this.checks.add(checksItem);
        return this;
    }

    public ShowServerResponse withChecks(Consumer<List<EnvironmentCheck>> checksSetter) {
        if (this.checks == null) {
            this.checks = new ArrayList<>();
        }
        checksSetter.accept(this.checks);
        return this;
    }

    /**
     * 源端环境校验信息
     * @return checks
     */
    public List<EnvironmentCheck> getChecks() {
        return checks;
    }

    public void setChecks(List<EnvironmentCheck> checks) {
        this.checks = checks;
    }

    public ShowServerResponse withMigrationCycle(MigrationCycleEnum migrationCycle) {
        this.migrationCycle = migrationCycle;
        return this;
    }

    /**
     * 迁移周期 cutovering:启动目的端中 cutovered:启动目的端完成 checking:检查中 setting:设置中 replicating:复制中 syncing:同步中
     * @return migrationCycle
     */
    public MigrationCycleEnum getMigrationCycle() {
        return migrationCycle;
    }

    public void setMigrationCycle(MigrationCycleEnum migrationCycle) {
        this.migrationCycle = migrationCycle;
    }

    public ShowServerResponse withStateActionTime(Long stateActionTime) {
        this.stateActionTime = stateActionTime;
        return this;
    }

    /**
     * 源端状态（state）上次发生变化的时间戳
     * minimum: 0
     * maximum: 9223372036854775807
     * @return stateActionTime
     */
    public Long getStateActionTime() {
        return stateActionTime;
    }

    public void setStateActionTime(Long stateActionTime) {
        this.stateActionTime = stateActionTime;
    }

    public ShowServerResponse withReplicatesize(Long replicatesize) {
        this.replicatesize = replicatesize;
        return this;
    }

    /**
     * 已经完成迁移的大小（B）
     * minimum: 0
     * maximum: 9223372036854775807
     * @return replicatesize
     */
    public Long getReplicatesize() {
        return replicatesize;
    }

    public void setReplicatesize(Long replicatesize) {
        this.replicatesize = replicatesize;
    }

    public ShowServerResponse withTotalsize(Long totalsize) {
        this.totalsize = totalsize;
        return this;
    }

    /**
     * 需要迁移的数据量总大小（B）
     * minimum: 0
     * maximum: 9223372036854775807
     * @return totalsize
     */
    public Long getTotalsize() {
        return totalsize;
    }

    public void setTotalsize(Long totalsize) {
        this.totalsize = totalsize;
    }

    public ShowServerResponse withLastVisitTime(Long lastVisitTime) {
        this.lastVisitTime = lastVisitTime;
        return this;
    }

    /**
     * agent上一次连接状态发生变化的时间戳
     * minimum: 0
     * maximum: 9223372036854775807
     * @return lastVisitTime
     */
    public Long getLastVisitTime() {
        return lastVisitTime;
    }

    public void setLastVisitTime(Long lastVisitTime) {
        this.lastVisitTime = lastVisitTime;
    }

    public ShowServerResponse withStageActionTime(Long stageActionTime) {
        this.stageActionTime = stageActionTime;
        return this;
    }

    /**
     * 迁移周期（migration_cycle）上一次变化的时间戳
     * minimum: 0
     * maximum: 9223372036854775807
     * @return stageActionTime
     */
    public Long getStageActionTime() {
        return stageActionTime;
    }

    public void setStageActionTime(Long stageActionTime) {
        this.stageActionTime = stageActionTime;
    }

    public ShowServerResponse withAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }

    /**
     * Agent版本信息
     * @return agentVersion
     */
    public String getAgentVersion() {
        return agentVersion;
    }

    public void setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
    }

    public ShowServerResponse withHasTc(Boolean hasTc) {
        this.hasTc = hasTc;
        return this;
    }

    /**
     * 是否安装tc组件，Linux系统此参数为必选
     * @return hasTc
     */
    public Boolean getHasTc() {
        return hasTc;
    }

    public void setHasTc(Boolean hasTc) {
        this.hasTc = hasTc;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowServerResponse that = (ShowServerResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.ip, that.ip)
            && Objects.equals(this.name, that.name) && Objects.equals(this.hostname, that.hostname)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.addDate, that.addDate) && Objects.equals(this.osType, that.osType)
            && Objects.equals(this.osVersion, that.osVersion) && Objects.equals(this.oemSystem, that.oemSystem)
            && Objects.equals(this.state, that.state) && Objects.equals(this.connected, that.connected)
            && Objects.equals(this.firmware, that.firmware)
            && Objects.equals(this.initTargetServer, that.initTargetServer)
            && Objects.equals(this.cpuQuantity, that.cpuQuantity) && Objects.equals(this.memory, that.memory)
            && Objects.equals(this.currentTask, that.currentTask) && Objects.equals(this.disks, that.disks)
            && Objects.equals(this.volumeGroups, that.volumeGroups) && Objects.equals(this.btrfsList, that.btrfsList)
            && Objects.equals(this.networks, that.networks) && Objects.equals(this.checks, that.checks)
            && Objects.equals(this.migrationCycle, that.migrationCycle)
            && Objects.equals(this.stateActionTime, that.stateActionTime)
            && Objects.equals(this.replicatesize, that.replicatesize) && Objects.equals(this.totalsize, that.totalsize)
            && Objects.equals(this.lastVisitTime, that.lastVisitTime)
            && Objects.equals(this.stageActionTime, that.stageActionTime)
            && Objects.equals(this.agentVersion, that.agentVersion) && Objects.equals(this.hasTc, that.hasTc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            ip,
            name,
            hostname,
            enterpriseProjectId,
            addDate,
            osType,
            osVersion,
            oemSystem,
            state,
            connected,
            firmware,
            initTargetServer,
            cpuQuantity,
            memory,
            currentTask,
            disks,
            volumeGroups,
            btrfsList,
            networks,
            checks,
            migrationCycle,
            stateActionTime,
            replicatesize,
            totalsize,
            lastVisitTime,
            stageActionTime,
            agentVersion,
            hasTc);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowServerResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    addDate: ").append(toIndentedString(addDate)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
        sb.append("    oemSystem: ").append(toIndentedString(oemSystem)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    connected: ").append(toIndentedString(connected)).append("\n");
        sb.append("    firmware: ").append(toIndentedString(firmware)).append("\n");
        sb.append("    initTargetServer: ").append(toIndentedString(initTargetServer)).append("\n");
        sb.append("    cpuQuantity: ").append(toIndentedString(cpuQuantity)).append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
        sb.append("    currentTask: ").append(toIndentedString(currentTask)).append("\n");
        sb.append("    disks: ").append(toIndentedString(disks)).append("\n");
        sb.append("    volumeGroups: ").append(toIndentedString(volumeGroups)).append("\n");
        sb.append("    btrfsList: ").append(toIndentedString(btrfsList)).append("\n");
        sb.append("    networks: ").append(toIndentedString(networks)).append("\n");
        sb.append("    checks: ").append(toIndentedString(checks)).append("\n");
        sb.append("    migrationCycle: ").append(toIndentedString(migrationCycle)).append("\n");
        sb.append("    stateActionTime: ").append(toIndentedString(stateActionTime)).append("\n");
        sb.append("    replicatesize: ").append(toIndentedString(replicatesize)).append("\n");
        sb.append("    totalsize: ").append(toIndentedString(totalsize)).append("\n");
        sb.append("    lastVisitTime: ").append(toIndentedString(lastVisitTime)).append("\n");
        sb.append("    stageActionTime: ").append(toIndentedString(stageActionTime)).append("\n");
        sb.append("    agentVersion: ").append(toIndentedString(agentVersion)).append("\n");
        sb.append("    hasTc: ").append(toIndentedString(hasTc)).append("\n");
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
