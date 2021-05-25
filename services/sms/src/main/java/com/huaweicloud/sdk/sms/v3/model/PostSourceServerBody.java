package com.huaweicloud.sdk.sms.v3.model;




import java.util.Collections;

import java.util.Collections;

import java.util.Collections;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.sms.v3.model.BtrfsFileSystem;
import com.huaweicloud.sdk.sms.v3.model.Disk;
import com.huaweicloud.sdk.sms.v3.model.NetWork;
import com.huaweicloud.sdk.sms.v3.model.VolumeGroups;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 源端服务器
 */
public class PostSourceServerBody  {



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
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static OsTypeEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            OsTypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OsTypeEnum(value);
            }
            return result;
        }

        public static OsTypeEnum valueOf(String value) {
            if( value == null ){
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
            if (obj != null && obj instanceof OsTypeEnum) {
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
    @JsonProperty(value="os_type")
    
    private OsTypeEnum osType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="os_version")
    
    private String osVersion;
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
    @JsonProperty(value="cpu_quantity")
    
    private Integer cpuQuantity;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="memory")
    
    private Long memory;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="disks")
    
    private List<Disk> disks = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="btrfs_list")
    
    private List<BtrfsFileSystem> btrfsList = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="networks")
    
    private List<NetWork> networks = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain_id")
    
    private String domainId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="has_rsync")
    
    private Boolean hasRsync;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="paravirtualization")
    
    private Boolean paravirtualization;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="raw_devices")
    
    private Boolean rawDevices;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="driver_files")
    
    private Boolean driverFiles;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="system_services")
    
    private Boolean systemServices;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="account_rights")
    
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
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static BootLoaderEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            BootLoaderEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new BootLoaderEnum(value);
            }
            return result;
        }

        public static BootLoaderEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            BootLoaderEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof BootLoaderEnum) {
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
    @JsonProperty(value="boot_loader")
    
    private BootLoaderEnum bootLoader;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="system_dir")
    
    private String systemDir;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="volume_groups")
    
    private List<VolumeGroups> volumeGroups = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="agent_version")
    
    private String agentVersion;

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

    

    public PostSourceServerBody withDisks(List<Disk> disks) {
        this.disks = disks;
        return this;
    }

    
    public PostSourceServerBody addDisksItem(Disk disksItem) {
        if(this.disks == null) {
            this.disks = new ArrayList<>();
        }
        this.disks.add(disksItem);
        return this;
    }

    public PostSourceServerBody withDisks(Consumer<List<Disk>> disksSetter) {
        if(this.disks == null) {
            this.disks = new ArrayList<>();
        }
        disksSetter.accept(this.disks);
        return this;
    }

    /**
     * 源端服务器的磁盘信息
     * @return disks
     */
    public List<Disk> getDisks() {
        return disks;
    }

    public void setDisks(List<Disk> disks) {
        this.disks = disks;
    }

    

    public PostSourceServerBody withBtrfsList(List<BtrfsFileSystem> btrfsList) {
        this.btrfsList = btrfsList;
        return this;
    }

    
    public PostSourceServerBody addBtrfsListItem(BtrfsFileSystem btrfsListItem) {
        if(this.btrfsList == null) {
            this.btrfsList = new ArrayList<>();
        }
        this.btrfsList.add(btrfsListItem);
        return this;
    }

    public PostSourceServerBody withBtrfsList(Consumer<List<BtrfsFileSystem>> btrfsListSetter) {
        if(this.btrfsList == null) {
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
        if(this.networks == null) {
            this.networks = new ArrayList<>();
        }
        this.networks.add(networksItem);
        return this;
    }

    public PostSourceServerBody withNetworks(Consumer<List<NetWork>> networksSetter) {
        if(this.networks == null) {
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

    

    public PostSourceServerBody withRawDevices(Boolean rawDevices) {
        this.rawDevices = rawDevices;
        return this;
    }

    


    /**
     * Linux必选，裸设备列表
     * @return rawDevices
     */
    public Boolean getRawDevices() {
        return rawDevices;
    }

    public void setRawDevices(Boolean rawDevices) {
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
        if(this.volumeGroups == null) {
            this.volumeGroups = new ArrayList<>();
        }
        this.volumeGroups.add(volumeGroupsItem);
        return this;
    }

    public PostSourceServerBody withVolumeGroups(Consumer<List<VolumeGroups>> volumeGroupsSetter) {
        if(this.volumeGroups == null) {
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PostSourceServerBody postSourceServerBody = (PostSourceServerBody) o;
        return Objects.equals(this.id, postSourceServerBody.id) &&
            Objects.equals(this.ip, postSourceServerBody.ip) &&
            Objects.equals(this.name, postSourceServerBody.name) &&
            Objects.equals(this.hostname, postSourceServerBody.hostname) &&
            Objects.equals(this.osType, postSourceServerBody.osType) &&
            Objects.equals(this.osVersion, postSourceServerBody.osVersion) &&
            Objects.equals(this.firmware, postSourceServerBody.firmware) &&
            Objects.equals(this.cpuQuantity, postSourceServerBody.cpuQuantity) &&
            Objects.equals(this.memory, postSourceServerBody.memory) &&
            Objects.equals(this.disks, postSourceServerBody.disks) &&
            Objects.equals(this.btrfsList, postSourceServerBody.btrfsList) &&
            Objects.equals(this.networks, postSourceServerBody.networks) &&
            Objects.equals(this.domainId, postSourceServerBody.domainId) &&
            Objects.equals(this.hasRsync, postSourceServerBody.hasRsync) &&
            Objects.equals(this.paravirtualization, postSourceServerBody.paravirtualization) &&
            Objects.equals(this.rawDevices, postSourceServerBody.rawDevices) &&
            Objects.equals(this.driverFiles, postSourceServerBody.driverFiles) &&
            Objects.equals(this.systemServices, postSourceServerBody.systemServices) &&
            Objects.equals(this.accountRights, postSourceServerBody.accountRights) &&
            Objects.equals(this.bootLoader, postSourceServerBody.bootLoader) &&
            Objects.equals(this.systemDir, postSourceServerBody.systemDir) &&
            Objects.equals(this.volumeGroups, postSourceServerBody.volumeGroups) &&
            Objects.equals(this.agentVersion, postSourceServerBody.agentVersion);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, ip, name, hostname, osType, osVersion, firmware, cpuQuantity, memory, disks, btrfsList, networks, domainId, hasRsync, paravirtualization, rawDevices, driverFiles, systemServices, accountRights, bootLoader, systemDir, volumeGroups, agentVersion);
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

