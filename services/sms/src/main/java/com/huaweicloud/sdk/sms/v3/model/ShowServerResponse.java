package com.huaweicloud.sdk.sms.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;

import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.sms.v3.model.BtrfsFileSystem;
import com.huaweicloud.sdk.sms.v3.model.Disk;
import com.huaweicloud.sdk.sms.v3.model.EnvironmentCheck;
import com.huaweicloud.sdk.sms.v3.model.InitTargetServer;
import com.huaweicloud.sdk.sms.v3.model.NetWork;
import com.huaweicloud.sdk.sms.v3.model.TaskByServerSource;
import com.huaweicloud.sdk.sms.v3.model.VolumeGroups;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowServerResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ip")
    
    private String ip;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="hostname")
    
    private String hostname;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="add_date")
    
    private Long addDate;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="os_type")
    
    private String osType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="os_version")
    
    private String osVersion;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="oem_system")
    
    private Boolean oemSystem;
    /**
     * 当前源端服务器状态
     */
    public static final class StateEnum {

        
        /**
         * Enum UNAVAILABLE_ for value: "unavailable:环境校验不通过"
         */
        public static final StateEnum UNAVAILABLE_ = new StateEnum("unavailable:环境校验不通过");
        
        /**
         * Enum WAITING_ for value: "waiting:等待"
         */
        public static final StateEnum WAITING_ = new StateEnum("waiting:等待");
        
        /**
         * Enum INITIALIZE_ for value: "initialize:初始化"
         */
        public static final StateEnum INITIALIZE_ = new StateEnum("initialize:初始化");
        
        /**
         * Enum REPLICATE_ for value: "replicate:复制"
         */
        public static final StateEnum REPLICATE_ = new StateEnum("replicate:复制");
        
        /**
         * Enum SYNCING_ for value: "syncing:持续同步"
         */
        public static final StateEnum SYNCING_ = new StateEnum("syncing:持续同步");
        
        /**
         * Enum STOPPING_ for value: "stopping:暂停中"
         */
        public static final StateEnum STOPPING_ = new StateEnum("stopping:暂停中");
        
        /**
         * Enum STOPPED_ for value: "stopped:已暂停"
         */
        public static final StateEnum STOPPED_ = new StateEnum("stopped:已暂停");
        
        /**
         * Enum DELETING_ for value: "deleting:删除中"
         */
        public static final StateEnum DELETING_ = new StateEnum("deleting:删除中");
        
        /**
         * Enum ERROR_ for value: "error:错误"
         */
        public static final StateEnum ERROR_ = new StateEnum("error:错误");
        
        /**
         * Enum CLONING_ for value: "cloning:等待克隆完成"
         */
        public static final StateEnum CLONING_ = new StateEnum("cloning:等待克隆完成");
        
        /**
         * Enum TESTING_ for value: "testing:启动目的端中"
         */
        public static final StateEnum TESTING_ = new StateEnum("testing:启动目的端中");
        
        /**
         * Enum _FINISHED_ for value: " finished:启动目的端完成"
         */
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
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StateEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            StateEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new StateEnum(value);
            }
            return result;
        }

        public static StateEnum valueOf(String value) {
            if( value == null ){
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
            if (obj != null && obj instanceof StateEnum) {
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
    @JsonProperty(value="state")
    
    private StateEnum state;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="connected")
    
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
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static FirmwareEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            FirmwareEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new FirmwareEnum(value);
            }
            return result;
        }

        public static FirmwareEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            FirmwareEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof FirmwareEnum) {
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
    @JsonProperty(value="firmware")
    
    private FirmwareEnum firmware;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="init_target_server")
    
    private InitTargetServer initTargetServer = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cpu_quantity")
    
    private Integer cpuQuantity;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="memory")
    
    private Long memory;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="current_task")
    
    private TaskByServerSource currentTask = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="disks")
    
    private List<Disk> disks = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="volume_groups")
    
    private List<VolumeGroups> volumeGroups = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="btrfs_list")
    
    private List<BtrfsFileSystem> btrfsList = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="networks")
    
    private List<NetWork> networks = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="checks")
    
    private List<EnvironmentCheck> checks = null;
        /**
     * 迁移周期
     */
    public static final class MigrationCycleEnum {

        
        /**
         * Enum CUTOVERING_ for value: "cutovering:启动目的端中"
         */
        public static final MigrationCycleEnum CUTOVERING_ = new MigrationCycleEnum("cutovering:启动目的端中");
        
        /**
         * Enum CUTOVERED_ for value: "cutovered:迁移完成"
         */
        public static final MigrationCycleEnum CUTOVERED_ = new MigrationCycleEnum("cutovered:迁移完成");
        
        /**
         * Enum CHECKING_ for value: "checking:源端校验"
         */
        public static final MigrationCycleEnum CHECKING_ = new MigrationCycleEnum("checking:源端校验");
        
        /**
         * Enum SETTING_ for value: "setting:设置目的端"
         */
        public static final MigrationCycleEnum SETTING_ = new MigrationCycleEnum("setting:设置目的端");
        
        /**
         * Enum REPLICATING_ for value: "replicating:数据复制中"
         */
        public static final MigrationCycleEnum REPLICATING_ = new MigrationCycleEnum("replicating:数据复制中");
        
        /**
         * Enum SYNCING_ for value: "syncing:同步中"
         */
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
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static MigrationCycleEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            MigrationCycleEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new MigrationCycleEnum(value);
            }
            return result;
        }

        public static MigrationCycleEnum valueOf(String value) {
            if( value == null ){
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
            if (obj != null && obj instanceof MigrationCycleEnum) {
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
    @JsonProperty(value="migration_cycle")
    
    private MigrationCycleEnum migrationCycle;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="state_action_time")
    
    private Long stateActionTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="replicatesize")
    
    private Long replicatesize;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="totalsize")
    
    private Long totalsize;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="last_visit_time")
    
    private Long lastVisitTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="stage_action_time")
    
    private Long stageActionTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="agent_version")
    
    private String agentVersion;

    public ShowServerResponse withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 源端服务器id
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
     * 源端服务器的ip
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
     * 当前源端服务器状态
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
        if(this.initTargetServer == null ){
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
        if(this.currentTask == null ){
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

    public ShowServerResponse withDisks(List<Disk> disks) {
        this.disks = disks;
        return this;
    }

    
    public ShowServerResponse addDisksItem(Disk disksItem) {
        if (this.disks == null) {
            this.disks = new ArrayList<>();
        }
        this.disks.add(disksItem);
        return this;
    }

    public ShowServerResponse withDisks(Consumer<List<Disk>> disksSetter) {
        if(this.disks == null ){
            this.disks = new ArrayList<>();
        }
        disksSetter.accept(this.disks);
        return this;
    }

    /**
     * 源端服务器磁盘信息
     * @return disks
     */
    public List<Disk> getDisks() {
        return disks;
    }

    public void setDisks(List<Disk> disks) {
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
        if(this.volumeGroups == null ){
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
        if(this.btrfsList == null ){
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
        if(this.networks == null ){
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
        if(this.checks == null ){
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
     * 迁移周期
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
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowServerResponse showServerResponse = (ShowServerResponse) o;
        return Objects.equals(this.id, showServerResponse.id) &&
            Objects.equals(this.ip, showServerResponse.ip) &&
            Objects.equals(this.name, showServerResponse.name) &&
            Objects.equals(this.hostname, showServerResponse.hostname) &&
            Objects.equals(this.addDate, showServerResponse.addDate) &&
            Objects.equals(this.osType, showServerResponse.osType) &&
            Objects.equals(this.osVersion, showServerResponse.osVersion) &&
            Objects.equals(this.oemSystem, showServerResponse.oemSystem) &&
            Objects.equals(this.state, showServerResponse.state) &&
            Objects.equals(this.connected, showServerResponse.connected) &&
            Objects.equals(this.firmware, showServerResponse.firmware) &&
            Objects.equals(this.initTargetServer, showServerResponse.initTargetServer) &&
            Objects.equals(this.cpuQuantity, showServerResponse.cpuQuantity) &&
            Objects.equals(this.memory, showServerResponse.memory) &&
            Objects.equals(this.currentTask, showServerResponse.currentTask) &&
            Objects.equals(this.disks, showServerResponse.disks) &&
            Objects.equals(this.volumeGroups, showServerResponse.volumeGroups) &&
            Objects.equals(this.btrfsList, showServerResponse.btrfsList) &&
            Objects.equals(this.networks, showServerResponse.networks) &&
            Objects.equals(this.checks, showServerResponse.checks) &&
            Objects.equals(this.migrationCycle, showServerResponse.migrationCycle) &&
            Objects.equals(this.stateActionTime, showServerResponse.stateActionTime) &&
            Objects.equals(this.replicatesize, showServerResponse.replicatesize) &&
            Objects.equals(this.totalsize, showServerResponse.totalsize) &&
            Objects.equals(this.lastVisitTime, showServerResponse.lastVisitTime) &&
            Objects.equals(this.stageActionTime, showServerResponse.stageActionTime) &&
            Objects.equals(this.agentVersion, showServerResponse.agentVersion);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, ip, name, hostname, addDate, osType, osVersion, oemSystem, state, connected, firmware, initTargetServer, cpuQuantity, memory, currentTask, disks, volumeGroups, btrfsList, networks, checks, migrationCycle, stateActionTime, replicatesize, totalsize, lastVisitTime, stageActionTime, agentVersion);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowServerResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
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

