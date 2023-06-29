package com.huaweicloud.sdk.hilens.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowNodeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "arch")

    private String arch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory")

    private Long memory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_id")

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_node_state")

    private String clusterNodeState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_node_type")

    private String clusterNodeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firmware_name")

    private String firmwareName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firmware_version")

    private String firmwareVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgrade_firmware_version")

    private String upgradeFirmwareVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firmware_status")

    private String firmwareStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "firmware_upgrade_record")

    private List<FirmwareUpdateRecord> firmwareUpgradeRecord = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active_status")

    private String activeStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu")

    private Integer cpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gpu_num")

    private Integer gpuNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "npu_num")

    private Integer npuNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "npu_type")

    private String npuType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_name")

    private String osName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    private String osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_version")

    private String osVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_container")

    private Boolean enableContainer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_gpu")

    private Boolean enableGpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_npu")

    private Boolean enableNpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_ips")

    private List<String> hostIps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private NodeDetailResponseTags tags;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "npu_info")

    private Object npuInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active_content")

    private List<String> activeContent = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_configs")

    private List<LogConfig> logConfigs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_validity_period")

    private Integer eventValidityPeriod;

    public ShowNodeResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 设备ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowNodeResponse withArch(String arch) {
        this.arch = arch;
        return this;
    }

    /**
     * 设备架构
     * @return arch
     */
    public String getArch() {
        return arch;
    }

    public void setArch(String arch) {
        this.arch = arch;
    }

    public ShowNodeResponse withMemory(Long memory) {
        this.memory = memory;
        return this;
    }

    /**
     * 设备内存
     * @return memory
     */
    public Long getMemory() {
        return memory;
    }

    public void setMemory(Long memory) {
        this.memory = memory;
    }

    public ShowNodeResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 设备名称，只允许中文字符、英文字母、数字、下划线、中划线，最大长度64
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowNodeResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 设备描述，最大长度255，不允许^, ~, ＃, $, %, &, *, <, >, (, ), [, ], {, }, ', \", \\
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowNodeResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 产生时间，如2021-10-15 14:45:22 GMT+08:00
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ShowNodeResponse withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间，如2021-10-15 14:45:22 GMT+08:00
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ShowNodeResponse withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * IAM用户名
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ShowNodeResponse withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    /**
     * 当该设备处于集群时，显示设备所属的集群ID
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public ShowNodeResponse withClusterNodeState(String clusterNodeState) {
        this.clusterNodeState = clusterNodeState;
        return this;
    }

    /**
     * 设备所处集群状态，集群创建（cluster_create）、集群删除（cluster_delete）、添加集群工作节点设备（cluster_add_nodes）、删除集群工作节点设备（cluster_delete_node）、集群节点设备状态更新（cluster_node_state_update）
     * @return clusterNodeState
     */
    public String getClusterNodeState() {
        return clusterNodeState;
    }

    public void setClusterNodeState(String clusterNodeState) {
        this.clusterNodeState = clusterNodeState;
    }

    public ShowNodeResponse withClusterNodeType(String clusterNodeType) {
        this.clusterNodeType = clusterNodeType;
        return this;
    }

    /**
     * 当该设备处于集群时，显示所属的集群设备类型。 - cluster_controller 控制设备 - cluster_worker 工作设备
     * @return clusterNodeType
     */
    public String getClusterNodeType() {
        return clusterNodeType;
    }

    public void setClusterNodeType(String clusterNodeType) {
        this.clusterNodeType = clusterNodeType;
    }

    public ShowNodeResponse withFirmwareName(String firmwareName) {
        this.firmwareName = firmwareName;
        return this;
    }

    /**
     * 固件名称。可包含大小写字母、数字、下划线、中划线,长度不超过60字符。必须以字母开头,字母或数字结尾
     * @return firmwareName
     */
    public String getFirmwareName() {
        return firmwareName;
    }

    public void setFirmwareName(String firmwareName) {
        this.firmwareName = firmwareName;
    }

    public ShowNodeResponse withFirmwareVersion(String firmwareVersion) {
        this.firmwareVersion = firmwareVersion;
        return this;
    }

    /**
     * 固件版本。支持X.Y.Z格式。每一个子版本号不超过三位且为非负整数,禁止在数字前补0
     * @return firmwareVersion
     */
    public String getFirmwareVersion() {
        return firmwareVersion;
    }

    public void setFirmwareVersion(String firmwareVersion) {
        this.firmwareVersion = firmwareVersion;
    }

    public ShowNodeResponse withUpgradeFirmwareVersion(String upgradeFirmwareVersion) {
        this.upgradeFirmwareVersion = upgradeFirmwareVersion;
        return this;
    }

    /**
     * 固件正在升级的版本
     * @return upgradeFirmwareVersion
     */
    public String getUpgradeFirmwareVersion() {
        return upgradeFirmwareVersion;
    }

    public void setUpgradeFirmwareVersion(String upgradeFirmwareVersion) {
        this.upgradeFirmwareVersion = upgradeFirmwareVersion;
    }

    public ShowNodeResponse withFirmwareStatus(String firmwareStatus) {
        this.firmwareStatus = firmwareStatus;
        return this;
    }

    /**
     * 固件升级状态，1、2、3分别代表升级中，升级失败，升级成
     * @return firmwareStatus
     */
    public String getFirmwareStatus() {
        return firmwareStatus;
    }

    public void setFirmwareStatus(String firmwareStatus) {
        this.firmwareStatus = firmwareStatus;
    }

    public ShowNodeResponse withFirmwareUpgradeRecord(List<FirmwareUpdateRecord> firmwareUpgradeRecord) {
        this.firmwareUpgradeRecord = firmwareUpgradeRecord;
        return this;
    }

    public ShowNodeResponse addFirmwareUpgradeRecordItem(FirmwareUpdateRecord firmwareUpgradeRecordItem) {
        if (this.firmwareUpgradeRecord == null) {
            this.firmwareUpgradeRecord = new ArrayList<>();
        }
        this.firmwareUpgradeRecord.add(firmwareUpgradeRecordItem);
        return this;
    }

    public ShowNodeResponse withFirmwareUpgradeRecord(
        Consumer<List<FirmwareUpdateRecord>> firmwareUpgradeRecordSetter) {
        if (this.firmwareUpgradeRecord == null) {
            this.firmwareUpgradeRecord = new ArrayList<>();
        }
        firmwareUpgradeRecordSetter.accept(this.firmwareUpgradeRecord);
        return this;
    }

    /**
     * Get firmwareUpgradeRecord
     * @return firmwareUpgradeRecord
     */
    public List<FirmwareUpdateRecord> getFirmwareUpgradeRecord() {
        return firmwareUpgradeRecord;
    }

    public void setFirmwareUpgradeRecord(List<FirmwareUpdateRecord> firmwareUpgradeRecord) {
        this.firmwareUpgradeRecord = firmwareUpgradeRecord;
    }

    public ShowNodeResponse withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 设备状态：UNCONNECTED(未注册)、RUNNING(运行中)、FAIL(故障)、STOPPED(停用)、UPGRADING(升级中)、FREEZE(冻结)
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public ShowNodeResponse withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 设备类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ShowNodeResponse withActiveStatus(String activeStatus) {
        this.activeStatus = activeStatus;
        return this;
    }

    /**
     * 设备激活状态，未激活（INACTIVE）和已激活（ACTIVATED）
     * @return activeStatus
     */
    public String getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(String activeStatus) {
        this.activeStatus = activeStatus;
    }

    public ShowNodeResponse withCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * 设备CPU个数
     * @return cpu
     */
    public Integer getCpu() {
        return cpu;
    }

    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }

    public ShowNodeResponse withGpuNum(Integer gpuNum) {
        this.gpuNum = gpuNum;
        return this;
    }

    /**
     * 设备GPU个数
     * @return gpuNum
     */
    public Integer getGpuNum() {
        return gpuNum;
    }

    public void setGpuNum(Integer gpuNum) {
        this.gpuNum = gpuNum;
    }

    public ShowNodeResponse withNpuNum(Integer npuNum) {
        this.npuNum = npuNum;
        return this;
    }

    /**
     * 设备NPU个数
     * @return npuNum
     */
    public Integer getNpuNum() {
        return npuNum;
    }

    public void setNpuNum(Integer npuNum) {
        this.npuNum = npuNum;
    }

    public ShowNodeResponse withNpuType(String npuType) {
        this.npuType = npuType;
        return this;
    }

    /**
     * 设备NPU类型
     * @return npuType
     */
    public String getNpuType() {
        return npuType;
    }

    public void setNpuType(String npuType) {
        this.npuType = npuType;
    }

    public ShowNodeResponse withOsName(String osName) {
        this.osName = osName;
        return this;
    }

    /**
     * 设备操作系统名称
     * @return osName
     */
    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }

    public ShowNodeResponse withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * 设备操作系统类型
     * @return osType
     */
    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public ShowNodeResponse withOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    /**
     * 设备操作系统版本
     * @return osVersion
     */
    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public ShowNodeResponse withEnableContainer(Boolean enableContainer) {
        this.enableContainer = enableContainer;
        return this;
    }

    /**
     * 是否启用容器
     * @return enableContainer
     */
    public Boolean getEnableContainer() {
        return enableContainer;
    }

    public void setEnableContainer(Boolean enableContainer) {
        this.enableContainer = enableContainer;
    }

    public ShowNodeResponse withEnableGpu(Boolean enableGpu) {
        this.enableGpu = enableGpu;
        return this;
    }

    /**
     * 是否启用GPU
     * @return enableGpu
     */
    public Boolean getEnableGpu() {
        return enableGpu;
    }

    public void setEnableGpu(Boolean enableGpu) {
        this.enableGpu = enableGpu;
    }

    public ShowNodeResponse withEnableNpu(Boolean enableNpu) {
        this.enableNpu = enableNpu;
        return this;
    }

    /**
     * 是否启用NPU
     * @return enableNpu
     */
    public Boolean getEnableNpu() {
        return enableNpu;
    }

    public void setEnableNpu(Boolean enableNpu) {
        this.enableNpu = enableNpu;
    }

    public ShowNodeResponse withHostIps(List<String> hostIps) {
        this.hostIps = hostIps;
        return this;
    }

    public ShowNodeResponse addHostIpsItem(String hostIpsItem) {
        if (this.hostIps == null) {
            this.hostIps = new ArrayList<>();
        }
        this.hostIps.add(hostIpsItem);
        return this;
    }

    public ShowNodeResponse withHostIps(Consumer<List<String>> hostIpsSetter) {
        if (this.hostIps == null) {
            this.hostIps = new ArrayList<>();
        }
        hostIpsSetter.accept(this.hostIps);
        return this;
    }

    /**
     * 主机IP列表
     * @return hostIps
     */
    public List<String> getHostIps() {
        return hostIps;
    }

    public void setHostIps(List<String> hostIps) {
        this.hostIps = hostIps;
    }

    public ShowNodeResponse withTags(NodeDetailResponseTags tags) {
        this.tags = tags;
        return this;
    }

    public ShowNodeResponse withTags(Consumer<NodeDetailResponseTags> tagsSetter) {
        if (this.tags == null) {
            this.tags = new NodeDetailResponseTags();
            tagsSetter.accept(this.tags);
        }

        return this;
    }

    /**
     * Get tags
     * @return tags
     */
    public NodeDetailResponseTags getTags() {
        return tags;
    }

    public void setTags(NodeDetailResponseTags tags) {
        this.tags = tags;
    }

    public ShowNodeResponse withNpuInfo(Object npuInfo) {
        this.npuInfo = npuInfo;
        return this;
    }

    /**
     * NPU信息
     * @return npuInfo
     */
    public Object getNpuInfo() {
        return npuInfo;
    }

    public void setNpuInfo(Object npuInfo) {
        this.npuInfo = npuInfo;
    }

    public ShowNodeResponse withActiveContent(List<String> activeContent) {
        this.activeContent = activeContent;
        return this;
    }

    public ShowNodeResponse addActiveContentItem(String activeContentItem) {
        if (this.activeContent == null) {
            this.activeContent = new ArrayList<>();
        }
        this.activeContent.add(activeContentItem);
        return this;
    }

    public ShowNodeResponse withActiveContent(Consumer<List<String>> activeContentSetter) {
        if (this.activeContent == null) {
            this.activeContent = new ArrayList<>();
        }
        activeContentSetter.accept(this.activeContent);
        return this;
    }

    /**
     * 激活订单号列表
     * @return activeContent
     */
    public List<String> getActiveContent() {
        return activeContent;
    }

    public void setActiveContent(List<String> activeContent) {
        this.activeContent = activeContent;
    }

    public ShowNodeResponse withLogConfigs(List<LogConfig> logConfigs) {
        this.logConfigs = logConfigs;
        return this;
    }

    public ShowNodeResponse addLogConfigsItem(LogConfig logConfigsItem) {
        if (this.logConfigs == null) {
            this.logConfigs = new ArrayList<>();
        }
        this.logConfigs.add(logConfigsItem);
        return this;
    }

    public ShowNodeResponse withLogConfigs(Consumer<List<LogConfig>> logConfigsSetter) {
        if (this.logConfigs == null) {
            this.logConfigs = new ArrayList<>();
        }
        logConfigsSetter.accept(this.logConfigs);
        return this;
    }

    /**
     * 设备日志配置
     * @return logConfigs
     */
    public List<LogConfig> getLogConfigs() {
        return logConfigs;
    }

    public void setLogConfigs(List<LogConfig> logConfigs) {
        this.logConfigs = logConfigs;
    }

    public ShowNodeResponse withEventValidityPeriod(Integer eventValidityPeriod) {
        this.eventValidityPeriod = eventValidityPeriod;
        return this;
    }

    /**
     * 事件有效时间(单位：分钟)
     * @return eventValidityPeriod
     */
    public Integer getEventValidityPeriod() {
        return eventValidityPeriod;
    }

    public void setEventValidityPeriod(Integer eventValidityPeriod) {
        this.eventValidityPeriod = eventValidityPeriod;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowNodeResponse that = (ShowNodeResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.arch, that.arch)
            && Objects.equals(this.memory, that.memory) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt) && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.clusterId, that.clusterId)
            && Objects.equals(this.clusterNodeState, that.clusterNodeState)
            && Objects.equals(this.clusterNodeType, that.clusterNodeType)
            && Objects.equals(this.firmwareName, that.firmwareName)
            && Objects.equals(this.firmwareVersion, that.firmwareVersion)
            && Objects.equals(this.upgradeFirmwareVersion, that.upgradeFirmwareVersion)
            && Objects.equals(this.firmwareStatus, that.firmwareStatus)
            && Objects.equals(this.firmwareUpgradeRecord, that.firmwareUpgradeRecord)
            && Objects.equals(this.state, that.state) && Objects.equals(this.type, that.type)
            && Objects.equals(this.activeStatus, that.activeStatus) && Objects.equals(this.cpu, that.cpu)
            && Objects.equals(this.gpuNum, that.gpuNum) && Objects.equals(this.npuNum, that.npuNum)
            && Objects.equals(this.npuType, that.npuType) && Objects.equals(this.osName, that.osName)
            && Objects.equals(this.osType, that.osType) && Objects.equals(this.osVersion, that.osVersion)
            && Objects.equals(this.enableContainer, that.enableContainer)
            && Objects.equals(this.enableGpu, that.enableGpu) && Objects.equals(this.enableNpu, that.enableNpu)
            && Objects.equals(this.hostIps, that.hostIps) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.npuInfo, that.npuInfo) && Objects.equals(this.activeContent, that.activeContent)
            && Objects.equals(this.logConfigs, that.logConfigs)
            && Objects.equals(this.eventValidityPeriod, that.eventValidityPeriod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            arch,
            memory,
            name,
            description,
            createdAt,
            updatedAt,
            userName,
            clusterId,
            clusterNodeState,
            clusterNodeType,
            firmwareName,
            firmwareVersion,
            upgradeFirmwareVersion,
            firmwareStatus,
            firmwareUpgradeRecord,
            state,
            type,
            activeStatus,
            cpu,
            gpuNum,
            npuNum,
            npuType,
            osName,
            osType,
            osVersion,
            enableContainer,
            enableGpu,
            enableNpu,
            hostIps,
            tags,
            npuInfo,
            activeContent,
            logConfigs,
            eventValidityPeriod);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowNodeResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    arch: ").append(toIndentedString(arch)).append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    clusterNodeState: ").append(toIndentedString(clusterNodeState)).append("\n");
        sb.append("    clusterNodeType: ").append(toIndentedString(clusterNodeType)).append("\n");
        sb.append("    firmwareName: ").append(toIndentedString(firmwareName)).append("\n");
        sb.append("    firmwareVersion: ").append(toIndentedString(firmwareVersion)).append("\n");
        sb.append("    upgradeFirmwareVersion: ").append(toIndentedString(upgradeFirmwareVersion)).append("\n");
        sb.append("    firmwareStatus: ").append(toIndentedString(firmwareStatus)).append("\n");
        sb.append("    firmwareUpgradeRecord: ").append(toIndentedString(firmwareUpgradeRecord)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    activeStatus: ").append(toIndentedString(activeStatus)).append("\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    gpuNum: ").append(toIndentedString(gpuNum)).append("\n");
        sb.append("    npuNum: ").append(toIndentedString(npuNum)).append("\n");
        sb.append("    npuType: ").append(toIndentedString(npuType)).append("\n");
        sb.append("    osName: ").append(toIndentedString(osName)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
        sb.append("    enableContainer: ").append(toIndentedString(enableContainer)).append("\n");
        sb.append("    enableGpu: ").append(toIndentedString(enableGpu)).append("\n");
        sb.append("    enableNpu: ").append(toIndentedString(enableNpu)).append("\n");
        sb.append("    hostIps: ").append(toIndentedString(hostIps)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    npuInfo: ").append(toIndentedString(npuInfo)).append("\n");
        sb.append("    activeContent: ").append(toIndentedString(activeContent)).append("\n");
        sb.append("    logConfigs: ").append(toIndentedString(logConfigs)).append("\n");
        sb.append("    eventValidityPeriod: ").append(toIndentedString(eventValidityPeriod)).append("\n");
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
