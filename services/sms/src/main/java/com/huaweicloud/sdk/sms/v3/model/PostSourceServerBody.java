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
 * 源端服务器
 */
public class PostSourceServerBody {

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

    /**
     * 源端服务器的OS类型，分为Windows和Linux，注册必选，更新非必选
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_version")

    private String osVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "virtualization_type")

    private String virtualizationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "linux_block_check")

    private String linuxBlockCheck;

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
    @JsonProperty(value = "cpu_quantity")

    private Integer cpuQuantity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory")

    private Long memory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disks")

    private List<ServerDisk> disks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "btrfs_list")

    private List<BtrfsFileSystem> btrfsList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "networks")

    private List<NetWork> networks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_rsync")

    private Boolean hasRsync;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "paravirtualization")

    private Boolean paravirtualization;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "raw_devices")

    private String rawDevices;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "driver_files")

    private Boolean driverFiles;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "system_services")

    private Boolean systemServices;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_rights")

    private Boolean accountRights;

    /**
     * Linux必选，系统引导类型，BOOT_LOADER(GRUB/LILO)
     */
    public static final class BootLoaderEnum {

        /**
         * Enum GRUB for value: "GRUB"
         */
        public static final BootLoaderEnum GRUB = new BootLoaderEnum("GRUB");

        /**
         * Enum LILO for value: "LILO"
         */
        public static final BootLoaderEnum LILO = new BootLoaderEnum("LILO");

        private static final Map<String, BootLoaderEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, BootLoaderEnum> createStaticFields() {
            Map<String, BootLoaderEnum> map = new HashMap<>();
            map.put("GRUB", GRUB);
            map.put("LILO", LILO);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        BootLoaderEnum(String value) {
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
        public static BootLoaderEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new BootLoaderEnum(value));
        }

        public static BootLoaderEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof BootLoaderEnum) {
                return this.value.equals(((BootLoaderEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "boot_loader")

    private BootLoaderEnum bootLoader;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "system_dir")

    private String systemDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "volume_groups")

    private List<VolumeGroups> volumeGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_version")

    private String agentVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kernel_version")

    private String kernelVersion;

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

    /**
     * 源端服务器状态 unavailable：环境校验不通过 waiting：等待 initialize：初始化 replicate：复制 syncing：持续同步 stopping：暂停中 stopped：已暂停 deleting：删除中 error：错误 cloning：等待克隆完成 cutovering：启动目的端中 finished：启动目的端完成
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
         * Enum DELETING for value: "deleting"
         */
        public static final StateEnum DELETING = new StateEnum("deleting");

        /**
         * Enum ERROR for value: "error"
         */
        public static final StateEnum ERROR = new StateEnum("error");

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
            map.put("deleting", DELETING);
            map.put("error", ERROR);
            map.put("cloning", CLONING);
            map.put("cutovering", CUTOVERING);
            map.put("finished", FINISHED);
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
    @JsonProperty(value = "oem_system")

    private Boolean oemSystem;

    /**
     * 启动方式，可以取值MANUAL、MGC或者空。
     */
    public static final class StartTypeEnum {

        /**
         * Enum MANUAL for value: "MANUAL"
         */
        public static final StartTypeEnum MANUAL = new StartTypeEnum("MANUAL");

        /**
         * Enum MGC for value: "MGC"
         */
        public static final StartTypeEnum MGC = new StartTypeEnum("MGC");

        /**
         * Enum EMPTY for value: ""
         */
        public static final StartTypeEnum EMPTY = new StartTypeEnum("");

        private static final Map<String, StartTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StartTypeEnum> createStaticFields() {
            Map<String, StartTypeEnum> map = new HashMap<>();
            map.put("MANUAL", MANUAL);
            map.put("MGC", MGC);
            map.put("", EMPTY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StartTypeEnum(String value) {
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
        public static StartTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StartTypeEnum(value));
        }

        public static StartTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StartTypeEnum) {
                return this.value.equals(((StartTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_type")

    private StartTypeEnum startType;

    public PostSourceServerBody withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 源端在SMS数据库中的ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PostSourceServerBody withIp(String ip) {
        this.ip = ip;
        return this;
    }

    /**
     * 源端服务器ip，注册源端时必选，更新非必选
     * @return ip
     */
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public PostSourceServerBody withName(String name) {
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

    public PostSourceServerBody withHostname(String hostname) {
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

    public PostSourceServerBody withOsType(OsTypeEnum osType) {
        this.osType = osType;
        return this;
    }

    /**
     * 源端服务器的OS类型，分为Windows和Linux，注册必选，更新非必选
     * @return osType
     */
    public OsTypeEnum getOsType() {
        return osType;
    }

    public void setOsType(OsTypeEnum osType) {
        this.osType = osType;
    }

    public PostSourceServerBody withOsVersion(String osVersion) {
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

    public PostSourceServerBody withVirtualizationType(String virtualizationType) {
        this.virtualizationType = virtualizationType;
        return this;
    }

    /**
     * 操作系统虚拟化方式
     * @return virtualizationType
     */
    public String getVirtualizationType() {
        return virtualizationType;
    }

    public void setVirtualizationType(String virtualizationType) {
        this.virtualizationType = virtualizationType;
    }

    public PostSourceServerBody withLinuxBlockCheck(String linuxBlockCheck) {
        this.linuxBlockCheck = linuxBlockCheck;
        return this;
    }

    /**
     * Linux操作系统块检查
     * @return linuxBlockCheck
     */
    public String getLinuxBlockCheck() {
        return linuxBlockCheck;
    }

    public void setLinuxBlockCheck(String linuxBlockCheck) {
        this.linuxBlockCheck = linuxBlockCheck;
    }

    public PostSourceServerBody withFirmware(FirmwareEnum firmware) {
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

    public PostSourceServerBody withCpuQuantity(Integer cpuQuantity) {
        this.cpuQuantity = cpuQuantity;
        return this;
    }

    /**
     * CPU个数，单位vCPU
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

    public PostSourceServerBody withMemory(Long memory) {
        this.memory = memory;
        return this;
    }

    /**
     * 内存大小，单位MB
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

    public PostSourceServerBody withDisks(List<ServerDisk> disks) {
        this.disks = disks;
        return this;
    }

    public PostSourceServerBody addDisksItem(ServerDisk disksItem) {
        if (this.disks == null) {
            this.disks = new ArrayList<>();
        }
        this.disks.add(disksItem);
        return this;
    }

    public PostSourceServerBody withDisks(Consumer<List<ServerDisk>> disksSetter) {
        if (this.disks == null) {
            this.disks = new ArrayList<>();
        }
        disksSetter.accept(this.disks);
        return this;
    }

    /**
     * 源端服务器的磁盘信息
     * @return disks
     */
    public List<ServerDisk> getDisks() {
        return disks;
    }

    public void setDisks(List<ServerDisk> disks) {
        this.disks = disks;
    }

    public PostSourceServerBody withBtrfsList(List<BtrfsFileSystem> btrfsList) {
        this.btrfsList = btrfsList;
        return this;
    }

    public PostSourceServerBody addBtrfsListItem(BtrfsFileSystem btrfsListItem) {
        if (this.btrfsList == null) {
            this.btrfsList = new ArrayList<>();
        }
        this.btrfsList.add(btrfsListItem);
        return this;
    }

    public PostSourceServerBody withBtrfsList(Consumer<List<BtrfsFileSystem>> btrfsListSetter) {
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

    public PostSourceServerBody withNetworks(List<NetWork> networks) {
        this.networks = networks;
        return this;
    }

    public PostSourceServerBody addNetworksItem(NetWork networksItem) {
        if (this.networks == null) {
            this.networks = new ArrayList<>();
        }
        this.networks.add(networksItem);
        return this;
    }

    public PostSourceServerBody withNetworks(Consumer<List<NetWork>> networksSetter) {
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

    public PostSourceServerBody withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 租户的domainId
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public PostSourceServerBody withHasRsync(Boolean hasRsync) {
        this.hasRsync = hasRsync;
        return this;
    }

    /**
     * 是否安装rsync组件，Linux系统此参数为必选
     * @return hasRsync
     */
    public Boolean getHasRsync() {
        return hasRsync;
    }

    public void setHasRsync(Boolean hasRsync) {
        this.hasRsync = hasRsync;
    }

    public PostSourceServerBody withParavirtualization(Boolean paravirtualization) {
        this.paravirtualization = paravirtualization;
        return this;
    }

    /**
     * Linux场景必选，源端是否是半虚拟化
     * @return paravirtualization
     */
    public Boolean getParavirtualization() {
        return paravirtualization;
    }

    public void setParavirtualization(Boolean paravirtualization) {
        this.paravirtualization = paravirtualization;
    }

    public PostSourceServerBody withRawDevices(String rawDevices) {
        this.rawDevices = rawDevices;
        return this;
    }

    /**
     * Linux必选，裸设备列表
     * @return rawDevices
     */
    public String getRawDevices() {
        return rawDevices;
    }

    public void setRawDevices(String rawDevices) {
        this.rawDevices = rawDevices;
    }

    public PostSourceServerBody withDriverFiles(Boolean driverFiles) {
        this.driverFiles = driverFiles;
        return this;
    }

    /**
     * Windows 必选，是否缺少驱动文件
     * @return driverFiles
     */
    public Boolean getDriverFiles() {
        return driverFiles;
    }

    public void setDriverFiles(Boolean driverFiles) {
        this.driverFiles = driverFiles;
    }

    public PostSourceServerBody withSystemServices(Boolean systemServices) {
        this.systemServices = systemServices;
        return this;
    }

    /**
     * Windows必选，是否存在不正常服务
     * @return systemServices
     */
    public Boolean getSystemServices() {
        return systemServices;
    }

    public void setSystemServices(Boolean systemServices) {
        this.systemServices = systemServices;
    }

    public PostSourceServerBody withAccountRights(Boolean accountRights) {
        this.accountRights = accountRights;
        return this;
    }

    /**
     * Windows必选，权限是否满足要求
     * @return accountRights
     */
    public Boolean getAccountRights() {
        return accountRights;
    }

    public void setAccountRights(Boolean accountRights) {
        this.accountRights = accountRights;
    }

    public PostSourceServerBody withBootLoader(BootLoaderEnum bootLoader) {
        this.bootLoader = bootLoader;
        return this;
    }

    /**
     * Linux必选，系统引导类型，BOOT_LOADER(GRUB/LILO)
     * @return bootLoader
     */
    public BootLoaderEnum getBootLoader() {
        return bootLoader;
    }

    public void setBootLoader(BootLoaderEnum bootLoader) {
        this.bootLoader = bootLoader;
    }

    public PostSourceServerBody withSystemDir(String systemDir) {
        this.systemDir = systemDir;
        return this;
    }

    /**
     * Windows必选，系统目录
     * @return systemDir
     */
    public String getSystemDir() {
        return systemDir;
    }

    public void setSystemDir(String systemDir) {
        this.systemDir = systemDir;
    }

    public PostSourceServerBody withVolumeGroups(List<VolumeGroups> volumeGroups) {
        this.volumeGroups = volumeGroups;
        return this;
    }

    public PostSourceServerBody addVolumeGroupsItem(VolumeGroups volumeGroupsItem) {
        if (this.volumeGroups == null) {
            this.volumeGroups = new ArrayList<>();
        }
        this.volumeGroups.add(volumeGroupsItem);
        return this;
    }

    public PostSourceServerBody withVolumeGroups(Consumer<List<VolumeGroups>> volumeGroupsSetter) {
        if (this.volumeGroups == null) {
            this.volumeGroups = new ArrayList<>();
        }
        volumeGroupsSetter.accept(this.volumeGroups);
        return this;
    }

    /**
     * Linux必选，如果没有卷组，输入[]
     * @return volumeGroups
     */
    public List<VolumeGroups> getVolumeGroups() {
        return volumeGroups;
    }

    public void setVolumeGroups(List<VolumeGroups> volumeGroups) {
        this.volumeGroups = volumeGroups;
    }

    public PostSourceServerBody withAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }

    /**
     * Agent版本
     * @return agentVersion
     */
    public String getAgentVersion() {
        return agentVersion;
    }

    public void setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
    }

    public PostSourceServerBody withKernelVersion(String kernelVersion) {
        this.kernelVersion = kernelVersion;
        return this;
    }

    /**
     * 内核版本信息
     * @return kernelVersion
     */
    public String getKernelVersion() {
        return kernelVersion;
    }

    public void setKernelVersion(String kernelVersion) {
        this.kernelVersion = kernelVersion;
    }

    public PostSourceServerBody withMigrationCycle(MigrationCycleEnum migrationCycle) {
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

    public PostSourceServerBody withState(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * 源端服务器状态 unavailable：环境校验不通过 waiting：等待 initialize：初始化 replicate：复制 syncing：持续同步 stopping：暂停中 stopped：已暂停 deleting：删除中 error：错误 cloning：等待克隆完成 cutovering：启动目的端中 finished：启动目的端完成
     * @return state
     */
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public PostSourceServerBody withOemSystem(Boolean oemSystem) {
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

    public PostSourceServerBody withStartType(StartTypeEnum startType) {
        this.startType = startType;
        return this;
    }

    /**
     * 启动方式，可以取值MANUAL、MGC或者空。
     * @return startType
     */
    public StartTypeEnum getStartType() {
        return startType;
    }

    public void setStartType(StartTypeEnum startType) {
        this.startType = startType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PostSourceServerBody that = (PostSourceServerBody) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.ip, that.ip)
            && Objects.equals(this.name, that.name) && Objects.equals(this.hostname, that.hostname)
            && Objects.equals(this.osType, that.osType) && Objects.equals(this.osVersion, that.osVersion)
            && Objects.equals(this.virtualizationType, that.virtualizationType)
            && Objects.equals(this.linuxBlockCheck, that.linuxBlockCheck)
            && Objects.equals(this.firmware, that.firmware) && Objects.equals(this.cpuQuantity, that.cpuQuantity)
            && Objects.equals(this.memory, that.memory) && Objects.equals(this.disks, that.disks)
            && Objects.equals(this.btrfsList, that.btrfsList) && Objects.equals(this.networks, that.networks)
            && Objects.equals(this.domainId, that.domainId) && Objects.equals(this.hasRsync, that.hasRsync)
            && Objects.equals(this.paravirtualization, that.paravirtualization)
            && Objects.equals(this.rawDevices, that.rawDevices) && Objects.equals(this.driverFiles, that.driverFiles)
            && Objects.equals(this.systemServices, that.systemServices)
            && Objects.equals(this.accountRights, that.accountRights)
            && Objects.equals(this.bootLoader, that.bootLoader) && Objects.equals(this.systemDir, that.systemDir)
            && Objects.equals(this.volumeGroups, that.volumeGroups)
            && Objects.equals(this.agentVersion, that.agentVersion)
            && Objects.equals(this.kernelVersion, that.kernelVersion)
            && Objects.equals(this.migrationCycle, that.migrationCycle) && Objects.equals(this.state, that.state)
            && Objects.equals(this.oemSystem, that.oemSystem) && Objects.equals(this.startType, that.startType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            ip,
            name,
            hostname,
            osType,
            osVersion,
            virtualizationType,
            linuxBlockCheck,
            firmware,
            cpuQuantity,
            memory,
            disks,
            btrfsList,
            networks,
            domainId,
            hasRsync,
            paravirtualization,
            rawDevices,
            driverFiles,
            systemServices,
            accountRights,
            bootLoader,
            systemDir,
            volumeGroups,
            agentVersion,
            kernelVersion,
            migrationCycle,
            state,
            oemSystem,
            startType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostSourceServerBody {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
        sb.append("    virtualizationType: ").append(toIndentedString(virtualizationType)).append("\n");
        sb.append("    linuxBlockCheck: ").append(toIndentedString(linuxBlockCheck)).append("\n");
        sb.append("    firmware: ").append(toIndentedString(firmware)).append("\n");
        sb.append("    cpuQuantity: ").append(toIndentedString(cpuQuantity)).append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
        sb.append("    disks: ").append(toIndentedString(disks)).append("\n");
        sb.append("    btrfsList: ").append(toIndentedString(btrfsList)).append("\n");
        sb.append("    networks: ").append(toIndentedString(networks)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    hasRsync: ").append(toIndentedString(hasRsync)).append("\n");
        sb.append("    paravirtualization: ").append(toIndentedString(paravirtualization)).append("\n");
        sb.append("    rawDevices: ").append(toIndentedString(rawDevices)).append("\n");
        sb.append("    driverFiles: ").append(toIndentedString(driverFiles)).append("\n");
        sb.append("    systemServices: ").append(toIndentedString(systemServices)).append("\n");
        sb.append("    accountRights: ").append(toIndentedString(accountRights)).append("\n");
        sb.append("    bootLoader: ").append(toIndentedString(bootLoader)).append("\n");
        sb.append("    systemDir: ").append(toIndentedString(systemDir)).append("\n");
        sb.append("    volumeGroups: ").append(toIndentedString(volumeGroups)).append("\n");
        sb.append("    agentVersion: ").append(toIndentedString(agentVersion)).append("\n");
        sb.append("    kernelVersion: ").append(toIndentedString(kernelVersion)).append("\n");
        sb.append("    migrationCycle: ").append(toIndentedString(migrationCycle)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    oemSystem: ").append(toIndentedString(oemSystem)).append("\n");
        sb.append("    startType: ").append(toIndentedString(startType)).append("\n");
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
