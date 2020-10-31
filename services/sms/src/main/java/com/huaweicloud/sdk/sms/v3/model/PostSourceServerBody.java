package com.huaweicloud.sdk.sms.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.sms.v3.model.BtrfsFileSystem;
import com.huaweicloud.sdk.sms.v3.model.Disk;
import com.huaweicloud.sdk.sms.v3.model.NetWork;
import com.huaweicloud.sdk.sms.v3.model.Server;
import com.huaweicloud.sdk.sms.v3.model.VolumeGroups;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 源端服务器信息
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


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="os_type")
    
    private String osType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="os_version")
    
    private String osVersion;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="firmware")
    
    private String firmware;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cpu_quantity")
    
    private Integer cpuQuantity;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="memory")
    
    private Integer memory;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="disks")
    
    private List<Disk> disks = new ArrayList<>();
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="btrfs_list")
    
    private List<BtrfsFileSystem> btrfsList = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="network")
    
    private List<NetWork> network = null;
    

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


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="boot_loader")
    
    private String bootLoader;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="system_dir")
    
    private String systemDir;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="volume_groups")
    
    private List<VolumeGroups> volumeGroups = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="oem_system")
    
    private String oemSystem;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="agent_version")
    
    private String agentVersion;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="boot_dir_normal")
    
    private String bootDirNormal;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="linux_block_check")
    
    private String linuxBlockCheck;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="abnormal_components")
    
    private String abnormalComponents;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="lost_system_files")
    
    private String lostSystemFiles;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="kernel_version")
    
    private String kernelVersion;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="virtualization_type")
    
    private String virtualizationType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="networks")
    
    private NetWork networks = null;

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
     * 源端ip
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
     * 主机名
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

    public PostSourceServerBody withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    


    /**
     * 系统类型
     * @return osType
     */
    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public PostSourceServerBody withOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    


    /**
     * 系统版本
     * @return osVersion
     */
    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public PostSourceServerBody withFirmware(String firmware) {
        this.firmware = firmware;
        return this;
    }

    


    /**
     * 引导方式
     * @return firmware
     */
    public String getFirmware() {
        return firmware;
    }

    public void setFirmware(String firmware) {
        this.firmware = firmware;
    }

    public PostSourceServerBody withCpuQuantity(Integer cpuQuantity) {
        this.cpuQuantity = cpuQuantity;
        return this;
    }

    


    /**
     * cpu
     * @return cpuQuantity
     */
    public Integer getCpuQuantity() {
        return cpuQuantity;
    }

    public void setCpuQuantity(Integer cpuQuantity) {
        this.cpuQuantity = cpuQuantity;
    }

    public PostSourceServerBody withMemory(Integer memory) {
        this.memory = memory;
        return this;
    }

    


    /**
     * 内存
     * @return memory
     */
    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public PostSourceServerBody withDisks(List<Disk> disks) {
        this.disks = disks;
        return this;
    }

    
    public PostSourceServerBody addDisksItem(Disk disksItem) {
        this.disks.add(disksItem);
        return this;
    }

    public PostSourceServerBody withDisks(Consumer<List<Disk>> disksSetter) {
        if(this.disks == null ){
            this.disks = new ArrayList<>();
        }
        disksSetter.accept(this.disks);
        return this;
    }

    /**
     * 磁盘信息
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
        if (this.btrfsList == null) {
            this.btrfsList = new ArrayList<>();
        }
        this.btrfsList.add(btrfsListItem);
        return this;
    }

    public PostSourceServerBody withBtrfsList(Consumer<List<BtrfsFileSystem>> btrfsListSetter) {
        if(this.btrfsList == null ){
            this.btrfsList = new ArrayList<>();
        }
        btrfsListSetter.accept(this.btrfsList);
        return this;
    }

    /**
     * btrfs列表
     * @return btrfsList
     */
    public List<BtrfsFileSystem> getBtrfsList() {
        return btrfsList;
    }

    public void setBtrfsList(List<BtrfsFileSystem> btrfsList) {
        this.btrfsList = btrfsList;
    }

    public PostSourceServerBody withNetwork(List<NetWork> network) {
        this.network = network;
        return this;
    }

    
    public PostSourceServerBody addNetworkItem(NetWork networkItem) {
        if (this.network == null) {
            this.network = new ArrayList<>();
        }
        this.network.add(networkItem);
        return this;
    }

    public PostSourceServerBody withNetwork(Consumer<List<NetWork>> networkSetter) {
        if(this.network == null ){
            this.network = new ArrayList<>();
        }
        networkSetter.accept(this.network);
        return this;
    }

    /**
     * 源端服务器的网卡信息
     * @return network
     */
    public List<NetWork> getNetwork() {
        return network;
    }

    public void setNetwork(List<NetWork> network) {
        this.network = network;
    }

    public PostSourceServerBody withDomainId(String domainId) {
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

    public PostSourceServerBody withHasRsync(Boolean hasRsync) {
        this.hasRsync = hasRsync;
        return this;
    }

    


    /**
     * 是否安装rsync，Linux必选
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
     * 是否是半虚拟化，Linux必选
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
     * 是否是裸设备，Linux必选
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
     * 是否缺少驱动文件，Windows必选
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
     * 是否有不正常的服务，Windows必选
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
     * 是否是管理员权限，Windows必须
     * @return accountRights
     */
    public Boolean getAccountRights() {
        return accountRights;
    }

    public void setAccountRights(Boolean accountRights) {
        this.accountRights = accountRights;
    }

    public PostSourceServerBody withBootLoader(String bootLoader) {
        this.bootLoader = bootLoader;
        return this;
    }

    


    /**
     * linux引导方式
     * @return bootLoader
     */
    public String getBootLoader() {
        return bootLoader;
    }

    public void setBootLoader(String bootLoader) {
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
        if(this.volumeGroups == null ){
            this.volumeGroups = new ArrayList<>();
        }
        volumeGroupsSetter.accept(this.volumeGroups);
        return this;
    }

    /**
     * 卷组列表
     * @return volumeGroups
     */
    public List<VolumeGroups> getVolumeGroups() {
        return volumeGroups;
    }

    public void setVolumeGroups(List<VolumeGroups> volumeGroups) {
        this.volumeGroups = volumeGroups;
    }

    public PostSourceServerBody withOemSystem(String oemSystem) {
        this.oemSystem = oemSystem;
        return this;
    }

    


    /**
     * 是否是OEM操作系统(Windows)
     * @return oemSystem
     */
    public String getOemSystem() {
        return oemSystem;
    }

    public void setOemSystem(String oemSystem) {
        this.oemSystem = oemSystem;
    }

    public PostSourceServerBody withAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }

    


    /**
     * Agent版本号，上报信息时必须，版本号为pass则跳过版本校验
     * @return agentVersion
     */
    public String getAgentVersion() {
        return agentVersion;
    }

    public void setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
    }

    public PostSourceServerBody withBootDirNormal(String bootDirNormal) {
        this.bootDirNormal = bootDirNormal;
        return this;
    }

    


    /**
     * boot目录是否正常(Linux)
     * @return bootDirNormal
     */
    public String getBootDirNormal() {
        return bootDirNormal;
    }

    public void setBootDirNormal(String bootDirNormal) {
        this.bootDirNormal = bootDirNormal;
    }

    public PostSourceServerBody withLinuxBlockCheck(String linuxBlockCheck) {
        this.linuxBlockCheck = linuxBlockCheck;
        return this;
    }

    


    /**
     * Linux块迁移校验信息
     * @return linuxBlockCheck
     */
    public String getLinuxBlockCheck() {
        return linuxBlockCheck;
    }

    public void setLinuxBlockCheck(String linuxBlockCheck) {
        this.linuxBlockCheck = linuxBlockCheck;
    }

    public PostSourceServerBody withAbnormalComponents(String abnormalComponents) {
        this.abnormalComponents = abnormalComponents;
        return this;
    }

    


    /**
     * 不满足要求的组件，多个组件之间用分号分号
     * @return abnormalComponents
     */
    public String getAbnormalComponents() {
        return abnormalComponents;
    }

    public void setAbnormalComponents(String abnormalComponents) {
        this.abnormalComponents = abnormalComponents;
    }

    public PostSourceServerBody withLostSystemFiles(String lostSystemFiles) {
        this.lostSystemFiles = lostSystemFiles;
        return this;
    }

    


    /**
     * 缺少的系统文件(Linux)，多个系统文件之间用分号分隔
     * @return lostSystemFiles
     */
    public String getLostSystemFiles() {
        return lostSystemFiles;
    }

    public void setLostSystemFiles(String lostSystemFiles) {
        this.lostSystemFiles = lostSystemFiles;
    }

    public PostSourceServerBody withKernelVersion(String kernelVersion) {
        this.kernelVersion = kernelVersion;
        return this;
    }

    


    /**
     * linux 内核
     * @return kernelVersion
     */
    public String getKernelVersion() {
        return kernelVersion;
    }

    public void setKernelVersion(String kernelVersion) {
        this.kernelVersion = kernelVersion;
    }

    public PostSourceServerBody withVirtualizationType(String virtualizationType) {
        this.virtualizationType = virtualizationType;
        return this;
    }

    


    /**
     * 虚拟化类型
     * @return virtualizationType
     */
    public String getVirtualizationType() {
        return virtualizationType;
    }

    public void setVirtualizationType(String virtualizationType) {
        this.virtualizationType = virtualizationType;
    }

    public PostSourceServerBody withNetworks(NetWork networks) {
        this.networks = networks;
        return this;
    }

    public PostSourceServerBody withNetworks(Consumer<NetWork> networksSetter) {
        if(this.networks == null ){
            this.networks = new NetWork();
            networksSetter.accept(this.networks);
        }
        
        return this;
    }


    /**
     * Get networks
     * @return networks
     */
    public NetWork getNetworks() {
        return networks;
    }

    public void setNetworks(NetWork networks) {
        this.networks = networks;
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
            Objects.equals(this.network, postSourceServerBody.network) &&
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
            Objects.equals(this.oemSystem, postSourceServerBody.oemSystem) &&
            Objects.equals(this.agentVersion, postSourceServerBody.agentVersion) &&
            Objects.equals(this.bootDirNormal, postSourceServerBody.bootDirNormal) &&
            Objects.equals(this.linuxBlockCheck, postSourceServerBody.linuxBlockCheck) &&
            Objects.equals(this.abnormalComponents, postSourceServerBody.abnormalComponents) &&
            Objects.equals(this.lostSystemFiles, postSourceServerBody.lostSystemFiles) &&
            Objects.equals(this.kernelVersion, postSourceServerBody.kernelVersion) &&
            Objects.equals(this.virtualizationType, postSourceServerBody.virtualizationType) &&
            Objects.equals(this.networks, postSourceServerBody.networks);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, ip, name, hostname, osType, osVersion, firmware, cpuQuantity, memory, disks, btrfsList, network, domainId, hasRsync, paravirtualization, rawDevices, driverFiles, systemServices, accountRights, bootLoader, systemDir, volumeGroups, oemSystem, agentVersion, bootDirNormal, linuxBlockCheck, abnormalComponents, lostSystemFiles, kernelVersion, virtualizationType, networks);
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
        sb.append("    network: ").append(toIndentedString(network)).append("\n");
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
        sb.append("    oemSystem: ").append(toIndentedString(oemSystem)).append("\n");
        sb.append("    agentVersion: ").append(toIndentedString(agentVersion)).append("\n");
        sb.append("    bootDirNormal: ").append(toIndentedString(bootDirNormal)).append("\n");
        sb.append("    linuxBlockCheck: ").append(toIndentedString(linuxBlockCheck)).append("\n");
        sb.append("    abnormalComponents: ").append(toIndentedString(abnormalComponents)).append("\n");
        sb.append("    lostSystemFiles: ").append(toIndentedString(lostSystemFiles)).append("\n");
        sb.append("    kernelVersion: ").append(toIndentedString(kernelVersion)).append("\n");
        sb.append("    virtualizationType: ").append(toIndentedString(virtualizationType)).append("\n");
        sb.append("    networks: ").append(toIndentedString(networks)).append("\n");
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

