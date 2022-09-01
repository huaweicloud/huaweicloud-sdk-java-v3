package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 边缘节点参数
 */
public class EdgeNodeResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    @JacksonXmlProperty(localName = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    @JacksonXmlProperty(localName = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    @JacksonXmlProperty(localName = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_key")

    @JacksonXmlProperty(localName = "private_key")

    private String privateKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate")

    @JacksonXmlProperty(localName = "certificate")

    private String certificate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ca")

    @JacksonXmlProperty(localName = "ca")

    private String ca;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    @JacksonXmlProperty(localName = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "package")

    @JacksonXmlProperty(localName = "package")

    private String _package;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "master_addr")

    @JacksonXmlProperty(localName = "master_addr")

    private String masterAddr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cpu")

    @JacksonXmlProperty(localName = "cpu")

    private Integer cpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "memory")

    @JacksonXmlProperty(localName = "memory")

    private Integer memory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_name")

    @JacksonXmlProperty(localName = "os_name")

    private String osName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_version")

    @JacksonXmlProperty(localName = "os_version")

    private String osVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pause_docker_image")

    @JacksonXmlProperty(localName = "pause_docker_image")

    private String pauseDockerImage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "arch")

    @JacksonXmlProperty(localName = "arch")

    private String arch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_type")

    @JacksonXmlProperty(localName = "os_type")

    private String osType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deployment_num")

    @JacksonXmlProperty(localName = "deployment_num")

    private Integer deploymentNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_gpu")

    @JacksonXmlProperty(localName = "enable_gpu")

    private Boolean enableGpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_configs")

    @JacksonXmlProperty(localName = "log_configs")

    private List<LogConfigs> logConfigs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_infos")

    @JacksonXmlProperty(localName = "device_infos")

    private List<DeviceInfos> deviceInfos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edged_version")

    @JacksonXmlProperty(localName = "edged_version")

    private String edgedVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gpu_num")

    @JacksonXmlProperty(localName = "gpu_num")

    private Integer gpuNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_ips")

    @JacksonXmlProperty(localName = "host_ips")

    private List<String> hostIps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relation")

    @JacksonXmlProperty(localName = "relation")

    private String relation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comment")

    @JacksonXmlProperty(localName = "comment")

    private String comment;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gpu_info")

    @JacksonXmlProperty(localName = "gpu_info")

    private List<GpuInfo> gpuInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_num")

    @JacksonXmlProperty(localName = "device_num")

    private Integer deviceNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_npu")

    @JacksonXmlProperty(localName = "enable_npu")

    private Boolean enableNpu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "npu_type")

    @JacksonXmlProperty(localName = "npu_type")

    private String npuType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nics")

    @JacksonXmlProperty(localName = "nics")

    private List<Nics> nics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    @JacksonXmlProperty(localName = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ief_node_version")

    @JacksonXmlProperty(localName = "ief_node_version")

    private String iefNodeVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgrade_flag")

    @JacksonXmlProperty(localName = "upgrade_flag")

    private Boolean upgradeFlag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    @JacksonXmlProperty(localName = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_ids")

    @JacksonXmlProperty(localName = "group_ids")

    private List<String> groupIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upgrade_history")

    @JacksonXmlProperty(localName = "upgrade_history")

    private List<UpgradeHistory> upgradeHistory = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attributes")

    @JacksonXmlProperty(localName = "attributes")

    private List<Attributes> attributes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "docker_enable")

    @JacksonXmlProperty(localName = "docker_enable")

    private Boolean dockerEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mqtt_mode")

    @JacksonXmlProperty(localName = "mqtt_mode")

    private String mqttMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mqtt_external")

    @JacksonXmlProperty(localName = "mqtt_external")

    private String mqttExternal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mqtt_internal")

    @JacksonXmlProperty(localName = "mqtt_internal")

    private String mqttInternal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_type")

    @JacksonXmlProperty(localName = "node_type")

    private String nodeType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ntp_configs")

    @JacksonXmlProperty(localName = "ntp_configs")

    private NtpConfigs ntpConfigs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_reason")

    @JacksonXmlProperty(localName = "error_reason")

    private String errorReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    @JacksonXmlProperty(localName = "tags")

    private List<ResourceTag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "npu_num")

    @JacksonXmlProperty(localName = "npu_num")

    private Integer npuNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "npu_info")

    @JacksonXmlProperty(localName = "npu_info")

    private List<NpuInfo> npuInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_runtime_version")

    @JacksonXmlProperty(localName = "container_runtime_version")

    private String containerRuntimeVersion;

    public EdgeNodeResp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 边缘节点ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EdgeNodeResp withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 边缘节点名称，只允许中文字符、英文字母、数字、下划线、中划线，最大长度64 Name为必填字段，且本帐号中唯一。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EdgeNodeResp withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 边缘节点描述，最大长度255，不允许^ ~ # $ % & * < > ( ) [ ] { } ' \" \\
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EdgeNodeResp withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public EdgeNodeResp withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public EdgeNodeResp withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public EdgeNodeResp withPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }

    /**
     * 私钥
     * @return privateKey
     */
    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public EdgeNodeResp withCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }

    /**
     * 证书
     * @return certificate
     */
    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public EdgeNodeResp withCa(String ca) {
        this.ca = ca;
        return this;
    }

    /**
     * 根证书
     * @return ca
     */
    public String getCa() {
        return ca;
    }

    public void setCa(String ca) {
        this.ca = ca;
    }

    public EdgeNodeResp withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 边缘节点状态 - UNCONNECTED（未注册） - RUNNING（运行中） - FAIL（故障） - STOPPED（停用） - UPGRADING（升级中） - FREEZE（冻结）
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public EdgeNodeResp withPackage(String _package) {
        this._package = _package;
        return this;
    }

    /**
     * 将证书文件certificate/ca/private_key打成.tar.gz包后用base64编码的字符串。 使用时请使用base64解码成.tar.gz包。
     * @return _package
     */
    public String getPackage() {
        return _package;
    }

    public void setPackage(String _package) {
        this._package = _package;
    }

    public EdgeNodeResp withMasterAddr(String masterAddr) {
        this.masterAddr = masterAddr;
        return this;
    }

    /**
     * 云端服务URL
     * @return masterAddr
     */
    public String getMasterAddr() {
        return masterAddr;
    }

    public void setMasterAddr(String masterAddr) {
        this.masterAddr = masterAddr;
    }

    public EdgeNodeResp withCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * 边缘节点CPU核心数
     * @return cpu
     */
    public Integer getCpu() {
        return cpu;
    }

    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }

    public EdgeNodeResp withMemory(Integer memory) {
        this.memory = memory;
        return this;
    }

    /**
     * 边缘节点内存大小，单位M
     * @return memory
     */
    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public EdgeNodeResp withOsName(String osName) {
        this.osName = osName;
        return this;
    }

    /**
     * 边缘节点操作系统名称
     * @return osName
     */
    public String getOsName() {
        return osName;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }

    public EdgeNodeResp withOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }

    /**
     * 边缘节点操作系统版本
     * @return osVersion
     */
    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public EdgeNodeResp withPauseDockerImage(String pauseDockerImage) {
        this.pauseDockerImage = pauseDockerImage;
        return this;
    }

    /**
     * pause容器镜像URL
     * @return pauseDockerImage
     */
    public String getPauseDockerImage() {
        return pauseDockerImage;
    }

    public void setPauseDockerImage(String pauseDockerImage) {
        this.pauseDockerImage = pauseDockerImage;
    }

    public EdgeNodeResp withArch(String arch) {
        this.arch = arch;
        return this;
    }

    /**
     * 边缘节点架构
     * @return arch
     */
    public String getArch() {
        return arch;
    }

    public void setArch(String arch) {
        this.arch = arch;
    }

    public EdgeNodeResp withOsType(String osType) {
        this.osType = osType;
        return this;
    }

    /**
     * 边缘节点操作系统类型
     * @return osType
     */
    public String getOsType() {
        return osType;
    }

    public void setOsType(String osType) {
        this.osType = osType;
    }

    public EdgeNodeResp withDeploymentNum(Integer deploymentNum) {
        this.deploymentNum = deploymentNum;
        return this;
    }

    /**
     * 部署在该边缘节点上的应用实例个数
     * @return deploymentNum
     */
    public Integer getDeploymentNum() {
        return deploymentNum;
    }

    public void setDeploymentNum(Integer deploymentNum) {
        this.deploymentNum = deploymentNum;
    }

    public EdgeNodeResp withEnableGpu(Boolean enableGpu) {
        this.enableGpu = enableGpu;
        return this;
    }

    /**
     * 边缘节点是否开启GPU，默认为false
     * @return enableGpu
     */
    public Boolean getEnableGpu() {
        return enableGpu;
    }

    public void setEnableGpu(Boolean enableGpu) {
        this.enableGpu = enableGpu;
    }

    public EdgeNodeResp withLogConfigs(List<LogConfigs> logConfigs) {
        this.logConfigs = logConfigs;
        return this;
    }

    public EdgeNodeResp addLogConfigsItem(LogConfigs logConfigsItem) {
        if (this.logConfigs == null) {
            this.logConfigs = new ArrayList<>();
        }
        this.logConfigs.add(logConfigsItem);
        return this;
    }

    public EdgeNodeResp withLogConfigs(Consumer<List<LogConfigs>> logConfigsSetter) {
        if (this.logConfigs == null) {
            this.logConfigs = new ArrayList<>();
        }
        logConfigsSetter.accept(this.logConfigs);
        return this;
    }

    /**
     * 边缘节点日志配置
     * @return logConfigs
     */
    public List<LogConfigs> getLogConfigs() {
        return logConfigs;
    }

    public void setLogConfigs(List<LogConfigs> logConfigs) {
        this.logConfigs = logConfigs;
    }

    public EdgeNodeResp withDeviceInfos(List<DeviceInfos> deviceInfos) {
        this.deviceInfos = deviceInfos;
        return this;
    }

    public EdgeNodeResp addDeviceInfosItem(DeviceInfos deviceInfosItem) {
        if (this.deviceInfos == null) {
            this.deviceInfos = new ArrayList<>();
        }
        this.deviceInfos.add(deviceInfosItem);
        return this;
    }

    public EdgeNodeResp withDeviceInfos(Consumer<List<DeviceInfos>> deviceInfosSetter) {
        if (this.deviceInfos == null) {
            this.deviceInfos = new ArrayList<>();
        }
        deviceInfosSetter.accept(this.deviceInfos);
        return this;
    }

    /**
     * 关联设备信息
     * @return deviceInfos
     */
    public List<DeviceInfos> getDeviceInfos() {
        return deviceInfos;
    }

    public void setDeviceInfos(List<DeviceInfos> deviceInfos) {
        this.deviceInfos = deviceInfos;
    }

    public EdgeNodeResp withEdgedVersion(String edgedVersion) {
        this.edgedVersion = edgedVersion;
        return this;
    }

    /**
     * edged版本
     * @return edgedVersion
     */
    public String getEdgedVersion() {
        return edgedVersion;
    }

    public void setEdgedVersion(String edgedVersion) {
        this.edgedVersion = edgedVersion;
    }

    public EdgeNodeResp withGpuNum(Integer gpuNum) {
        this.gpuNum = gpuNum;
        return this;
    }

    /**
     * gpu个数
     * @return gpuNum
     */
    public Integer getGpuNum() {
        return gpuNum;
    }

    public void setGpuNum(Integer gpuNum) {
        this.gpuNum = gpuNum;
    }

    public EdgeNodeResp withHostIps(List<String> hostIps) {
        this.hostIps = hostIps;
        return this;
    }

    public EdgeNodeResp addHostIpsItem(String hostIpsItem) {
        if (this.hostIps == null) {
            this.hostIps = new ArrayList<>();
        }
        this.hostIps.add(hostIpsItem);
        return this;
    }

    public EdgeNodeResp withHostIps(Consumer<List<String>> hostIpsSetter) {
        if (this.hostIps == null) {
            this.hostIps = new ArrayList<>();
        }
        hostIpsSetter.accept(this.hostIps);
        return this;
    }

    /**
     * 主机IP，默认返回eth0网卡的IP。
     * @return hostIps
     */
    public List<String> getHostIps() {
        return hostIps;
    }

    public void setHostIps(List<String> hostIps) {
        this.hostIps = hostIps;
    }

    public EdgeNodeResp withRelation(String relation) {
        this.relation = relation;
        return this;
    }

    /**
     * 与device绑定关系名称（通过device id查询node时有值）
     * @return relation
     */
    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public EdgeNodeResp withComment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * 与device绑定关系描述（通过device id查询node时有值）
     * @return comment
     */
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public EdgeNodeResp withGpuInfo(List<GpuInfo> gpuInfo) {
        this.gpuInfo = gpuInfo;
        return this;
    }

    public EdgeNodeResp addGpuInfoItem(GpuInfo gpuInfoItem) {
        if (this.gpuInfo == null) {
            this.gpuInfo = new ArrayList<>();
        }
        this.gpuInfo.add(gpuInfoItem);
        return this;
    }

    public EdgeNodeResp withGpuInfo(Consumer<List<GpuInfo>> gpuInfoSetter) {
        if (this.gpuInfo == null) {
            this.gpuInfo = new ArrayList<>();
        }
        gpuInfoSetter.accept(this.gpuInfo);
        return this;
    }

    /**
     * gpu型号和gpu memory大小
     * @return gpuInfo
     */
    public List<GpuInfo> getGpuInfo() {
        return gpuInfo;
    }

    public void setGpuInfo(List<GpuInfo> gpuInfo) {
        this.gpuInfo = gpuInfo;
    }

    public EdgeNodeResp withDeviceNum(Integer deviceNum) {
        this.deviceNum = deviceNum;
        return this;
    }

    /**
     * 关联设备数量
     * @return deviceNum
     */
    public Integer getDeviceNum() {
        return deviceNum;
    }

    public void setDeviceNum(Integer deviceNum) {
        this.deviceNum = deviceNum;
    }

    public EdgeNodeResp withEnableNpu(Boolean enableNpu) {
        this.enableNpu = enableNpu;
        return this;
    }

    /**
     * 边缘节点是否开启NPU，true表示开启，false表示不开启，默认为false
     * @return enableNpu
     */
    public Boolean getEnableNpu() {
        return enableNpu;
    }

    public void setEnableNpu(Boolean enableNpu) {
        this.enableNpu = enableNpu;
    }

    public EdgeNodeResp withNpuType(String npuType) {
        this.npuType = npuType;
        return this;
    }

    /**
     * NPU类型，支持D310类型和D910类型。 - D310表示D310类型。 - D910表示D910类型。 - 不填表示为D310类型。
     * @return npuType
     */
    public String getNpuType() {
        return npuType;
    }

    public void setNpuType(String npuType) {
        this.npuType = npuType;
    }

    public EdgeNodeResp withNics(List<Nics> nics) {
        this.nics = nics;
        return this;
    }

    public EdgeNodeResp addNicsItem(Nics nicsItem) {
        if (this.nics == null) {
            this.nics = new ArrayList<>();
        }
        this.nics.add(nicsItem);
        return this;
    }

    public EdgeNodeResp withNics(Consumer<List<Nics>> nicsSetter) {
        if (this.nics == null) {
            this.nics = new ArrayList<>();
        }
        nicsSetter.accept(this.nics);
        return this;
    }

    /**
     * 节点网卡和对应IP地址信息
     * @return nics
     */
    public List<Nics> getNics() {
        return nics;
    }

    public void setNics(List<Nics> nics) {
        this.nics = nics;
    }

    public EdgeNodeResp withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * 边缘节点主机名
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public EdgeNodeResp withIefNodeVersion(String iefNodeVersion) {
        this.iefNodeVersion = iefNodeVersion;
        return this;
    }

    /**
     * 边缘节点版本
     * @return iefNodeVersion
     */
    public String getIefNodeVersion() {
        return iefNodeVersion;
    }

    public void setIefNodeVersion(String iefNodeVersion) {
        this.iefNodeVersion = iefNodeVersion;
    }

    public EdgeNodeResp withUpgradeFlag(Boolean upgradeFlag) {
        this.upgradeFlag = upgradeFlag;
        return this;
    }

    /**
     * 是否能升级的标志 - true：需要升级 - false：不需要升级
     * @return upgradeFlag
     */
    public Boolean getUpgradeFlag() {
        return upgradeFlag;
    }

    public void setUpgradeFlag(Boolean upgradeFlag) {
        this.upgradeFlag = upgradeFlag;
    }

    public EdgeNodeResp withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * 产品ID（通过产品证书方式纳管）
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public EdgeNodeResp withGroupIds(List<String> groupIds) {
        this.groupIds = groupIds;
        return this;
    }

    public EdgeNodeResp addGroupIdsItem(String groupIdsItem) {
        if (this.groupIds == null) {
            this.groupIds = new ArrayList<>();
        }
        this.groupIds.add(groupIdsItem);
        return this;
    }

    public EdgeNodeResp withGroupIds(Consumer<List<String>> groupIdsSetter) {
        if (this.groupIds == null) {
            this.groupIds = new ArrayList<>();
        }
        groupIdsSetter.accept(this.groupIds);
        return this;
    }

    /**
     * 节点组ID（一个节点属于多个节点组）
     * @return groupIds
     */
    public List<String> getGroupIds() {
        return groupIds;
    }

    public void setGroupIds(List<String> groupIds) {
        this.groupIds = groupIds;
    }

    public EdgeNodeResp withUpgradeHistory(List<UpgradeHistory> upgradeHistory) {
        this.upgradeHistory = upgradeHistory;
        return this;
    }

    public EdgeNodeResp addUpgradeHistoryItem(UpgradeHistory upgradeHistoryItem) {
        if (this.upgradeHistory == null) {
            this.upgradeHistory = new ArrayList<>();
        }
        this.upgradeHistory.add(upgradeHistoryItem);
        return this;
    }

    public EdgeNodeResp withUpgradeHistory(Consumer<List<UpgradeHistory>> upgradeHistorySetter) {
        if (this.upgradeHistory == null) {
            this.upgradeHistory = new ArrayList<>();
        }
        upgradeHistorySetter.accept(this.upgradeHistory);
        return this;
    }

    /**
     * 节点安装或升级记录
     * @return upgradeHistory
     */
    public List<UpgradeHistory> getUpgradeHistory() {
        return upgradeHistory;
    }

    public void setUpgradeHistory(List<UpgradeHistory> upgradeHistory) {
        this.upgradeHistory = upgradeHistory;
    }

    public EdgeNodeResp withAttributes(List<Attributes> attributes) {
        this.attributes = attributes;
        return this;
    }

    public EdgeNodeResp addAttributesItem(Attributes attributesItem) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        this.attributes.add(attributesItem);
        return this;
    }

    public EdgeNodeResp withAttributes(Consumer<List<Attributes>> attributesSetter) {
        if (this.attributes == null) {
            this.attributes = new ArrayList<>();
        }
        attributesSetter.accept(this.attributes);
        return this;
    }

    /**
     * 边缘节点属性，关联属性个数最多为32个
     * @return attributes
     */
    public List<Attributes> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attributes> attributes) {
        this.attributes = attributes;
    }

    public EdgeNodeResp withDockerEnable(Boolean dockerEnable) {
        this.dockerEnable = dockerEnable;
        return this;
    }

    /**
     * 节点是否开启Docker
     * @return dockerEnable
     */
    public Boolean getDockerEnable() {
        return dockerEnable;
    }

    public void setDockerEnable(Boolean dockerEnable) {
        this.dockerEnable = dockerEnable;
    }

    public EdgeNodeResp withMqttMode(String mqttMode) {
        this.mqttMode = mqttMode;
        return this;
    }

    /**
     * mqtt集成模式 - internal：edgecore内置mqtt - external：外置开源mqtt
     * @return mqttMode
     */
    public String getMqttMode() {
        return mqttMode;
    }

    public void setMqttMode(String mqttMode) {
        this.mqttMode = mqttMode;
    }

    public EdgeNodeResp withMqttExternal(String mqttExternal) {
        this.mqttExternal = mqttExternal;
        return this;
    }

    /**
     * 外置开源mqtt地址
     * @return mqttExternal
     */
    public String getMqttExternal() {
        return mqttExternal;
    }

    public void setMqttExternal(String mqttExternal) {
        this.mqttExternal = mqttExternal;
    }

    public EdgeNodeResp withMqttInternal(String mqttInternal) {
        this.mqttInternal = mqttInternal;
        return this;
    }

    /**
     * edgecore内置的mqtt地址
     * @return mqttInternal
     */
    public String getMqttInternal() {
        return mqttInternal;
    }

    public void setMqttInternal(String mqttInternal) {
        this.mqttInternal = mqttInternal;
    }

    public EdgeNodeResp withNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }

    /**
     * 节点类型，默认为空，非空时为小站节点
     * @return nodeType
     */
    public String getNodeType() {
        return nodeType;
    }

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    public EdgeNodeResp withNtpConfigs(NtpConfigs ntpConfigs) {
        this.ntpConfigs = ntpConfigs;
        return this;
    }

    public EdgeNodeResp withNtpConfigs(Consumer<NtpConfigs> ntpConfigsSetter) {
        if (this.ntpConfigs == null) {
            this.ntpConfigs = new NtpConfigs();
            ntpConfigsSetter.accept(this.ntpConfigs);
        }

        return this;
    }

    /**
     * Get ntpConfigs
     * @return ntpConfigs
     */
    public NtpConfigs getNtpConfigs() {
        return ntpConfigs;
    }

    public void setNtpConfigs(NtpConfigs ntpConfigs) {
        this.ntpConfigs = ntpConfigs;
    }

    public EdgeNodeResp withErrorReason(String errorReason) {
        this.errorReason = errorReason;
        return this;
    }

    /**
     * 节点故障原因
     * @return errorReason
     */
    public String getErrorReason() {
        return errorReason;
    }

    public void setErrorReason(String errorReason) {
        this.errorReason = errorReason;
    }

    public EdgeNodeResp withTags(List<ResourceTag> tags) {
        this.tags = tags;
        return this;
    }

    public EdgeNodeResp addTagsItem(ResourceTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public EdgeNodeResp withTags(Consumer<List<ResourceTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 边缘节点标签，标签个数最多为20个
     * @return tags
     */
    public List<ResourceTag> getTags() {
        return tags;
    }

    public void setTags(List<ResourceTag> tags) {
        this.tags = tags;
    }

    public EdgeNodeResp withNpuNum(Integer npuNum) {
        this.npuNum = npuNum;
        return this;
    }

    /**
     * NPU数量
     * @return npuNum
     */
    public Integer getNpuNum() {
        return npuNum;
    }

    public void setNpuNum(Integer npuNum) {
        this.npuNum = npuNum;
    }

    public EdgeNodeResp withNpuInfo(List<NpuInfo> npuInfo) {
        this.npuInfo = npuInfo;
        return this;
    }

    public EdgeNodeResp addNpuInfoItem(NpuInfo npuInfoItem) {
        if (this.npuInfo == null) {
            this.npuInfo = new ArrayList<>();
        }
        this.npuInfo.add(npuInfoItem);
        return this;
    }

    public EdgeNodeResp withNpuInfo(Consumer<List<NpuInfo>> npuInfoSetter) {
        if (this.npuInfo == null) {
            this.npuInfo = new ArrayList<>();
        }
        npuInfoSetter.accept(this.npuInfo);
        return this;
    }

    /**
     * NPU型号和NPU Memory大小
     * @return npuInfo
     */
    public List<NpuInfo> getNpuInfo() {
        return npuInfo;
    }

    public void setNpuInfo(List<NpuInfo> npuInfo) {
        this.npuInfo = npuInfo;
    }

    public EdgeNodeResp withContainerRuntimeVersion(String containerRuntimeVersion) {
        this.containerRuntimeVersion = containerRuntimeVersion;
        return this;
    }

    /**
     * 容器运行时版本
     * @return containerRuntimeVersion
     */
    public String getContainerRuntimeVersion() {
        return containerRuntimeVersion;
    }

    public void setContainerRuntimeVersion(String containerRuntimeVersion) {
        this.containerRuntimeVersion = containerRuntimeVersion;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EdgeNodeResp edgeNodeResp = (EdgeNodeResp) o;
        return Objects.equals(this.id, edgeNodeResp.id) && Objects.equals(this.name, edgeNodeResp.name)
            && Objects.equals(this.description, edgeNodeResp.description)
            && Objects.equals(this.createdAt, edgeNodeResp.createdAt)
            && Objects.equals(this.updatedAt, edgeNodeResp.updatedAt)
            && Objects.equals(this.projectId, edgeNodeResp.projectId)
            && Objects.equals(this.privateKey, edgeNodeResp.privateKey)
            && Objects.equals(this.certificate, edgeNodeResp.certificate) && Objects.equals(this.ca, edgeNodeResp.ca)
            && Objects.equals(this.state, edgeNodeResp.state) && Objects.equals(this._package, edgeNodeResp._package)
            && Objects.equals(this.masterAddr, edgeNodeResp.masterAddr) && Objects.equals(this.cpu, edgeNodeResp.cpu)
            && Objects.equals(this.memory, edgeNodeResp.memory) && Objects.equals(this.osName, edgeNodeResp.osName)
            && Objects.equals(this.osVersion, edgeNodeResp.osVersion)
            && Objects.equals(this.pauseDockerImage, edgeNodeResp.pauseDockerImage)
            && Objects.equals(this.arch, edgeNodeResp.arch) && Objects.equals(this.osType, edgeNodeResp.osType)
            && Objects.equals(this.deploymentNum, edgeNodeResp.deploymentNum)
            && Objects.equals(this.enableGpu, edgeNodeResp.enableGpu)
            && Objects.equals(this.logConfigs, edgeNodeResp.logConfigs)
            && Objects.equals(this.deviceInfos, edgeNodeResp.deviceInfos)
            && Objects.equals(this.edgedVersion, edgeNodeResp.edgedVersion)
            && Objects.equals(this.gpuNum, edgeNodeResp.gpuNum) && Objects.equals(this.hostIps, edgeNodeResp.hostIps)
            && Objects.equals(this.relation, edgeNodeResp.relation)
            && Objects.equals(this.comment, edgeNodeResp.comment) && Objects.equals(this.gpuInfo, edgeNodeResp.gpuInfo)
            && Objects.equals(this.deviceNum, edgeNodeResp.deviceNum)
            && Objects.equals(this.enableNpu, edgeNodeResp.enableNpu)
            && Objects.equals(this.npuType, edgeNodeResp.npuType) && Objects.equals(this.nics, edgeNodeResp.nics)
            && Objects.equals(this.hostName, edgeNodeResp.hostName)
            && Objects.equals(this.iefNodeVersion, edgeNodeResp.iefNodeVersion)
            && Objects.equals(this.upgradeFlag, edgeNodeResp.upgradeFlag)
            && Objects.equals(this.productId, edgeNodeResp.productId)
            && Objects.equals(this.groupIds, edgeNodeResp.groupIds)
            && Objects.equals(this.upgradeHistory, edgeNodeResp.upgradeHistory)
            && Objects.equals(this.attributes, edgeNodeResp.attributes)
            && Objects.equals(this.dockerEnable, edgeNodeResp.dockerEnable)
            && Objects.equals(this.mqttMode, edgeNodeResp.mqttMode)
            && Objects.equals(this.mqttExternal, edgeNodeResp.mqttExternal)
            && Objects.equals(this.mqttInternal, edgeNodeResp.mqttInternal)
            && Objects.equals(this.nodeType, edgeNodeResp.nodeType)
            && Objects.equals(this.ntpConfigs, edgeNodeResp.ntpConfigs)
            && Objects.equals(this.errorReason, edgeNodeResp.errorReason)
            && Objects.equals(this.tags, edgeNodeResp.tags) && Objects.equals(this.npuNum, edgeNodeResp.npuNum)
            && Objects.equals(this.npuInfo, edgeNodeResp.npuInfo)
            && Objects.equals(this.containerRuntimeVersion, edgeNodeResp.containerRuntimeVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            createdAt,
            updatedAt,
            projectId,
            privateKey,
            certificate,
            ca,
            state,
            _package,
            masterAddr,
            cpu,
            memory,
            osName,
            osVersion,
            pauseDockerImage,
            arch,
            osType,
            deploymentNum,
            enableGpu,
            logConfigs,
            deviceInfos,
            edgedVersion,
            gpuNum,
            hostIps,
            relation,
            comment,
            gpuInfo,
            deviceNum,
            enableNpu,
            npuType,
            nics,
            hostName,
            iefNodeVersion,
            upgradeFlag,
            productId,
            groupIds,
            upgradeHistory,
            attributes,
            dockerEnable,
            mqttMode,
            mqttExternal,
            mqttInternal,
            nodeType,
            ntpConfigs,
            errorReason,
            tags,
            npuNum,
            npuInfo,
            containerRuntimeVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EdgeNodeResp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
        sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
        sb.append("    ca: ").append(toIndentedString(ca)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    _package: ").append(toIndentedString(_package)).append("\n");
        sb.append("    masterAddr: ").append(toIndentedString(masterAddr)).append("\n");
        sb.append("    cpu: ").append(toIndentedString(cpu)).append("\n");
        sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
        sb.append("    osName: ").append(toIndentedString(osName)).append("\n");
        sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
        sb.append("    pauseDockerImage: ").append(toIndentedString(pauseDockerImage)).append("\n");
        sb.append("    arch: ").append(toIndentedString(arch)).append("\n");
        sb.append("    osType: ").append(toIndentedString(osType)).append("\n");
        sb.append("    deploymentNum: ").append(toIndentedString(deploymentNum)).append("\n");
        sb.append("    enableGpu: ").append(toIndentedString(enableGpu)).append("\n");
        sb.append("    logConfigs: ").append(toIndentedString(logConfigs)).append("\n");
        sb.append("    deviceInfos: ").append(toIndentedString(deviceInfos)).append("\n");
        sb.append("    edgedVersion: ").append(toIndentedString(edgedVersion)).append("\n");
        sb.append("    gpuNum: ").append(toIndentedString(gpuNum)).append("\n");
        sb.append("    hostIps: ").append(toIndentedString(hostIps)).append("\n");
        sb.append("    relation: ").append(toIndentedString(relation)).append("\n");
        sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
        sb.append("    gpuInfo: ").append(toIndentedString(gpuInfo)).append("\n");
        sb.append("    deviceNum: ").append(toIndentedString(deviceNum)).append("\n");
        sb.append("    enableNpu: ").append(toIndentedString(enableNpu)).append("\n");
        sb.append("    npuType: ").append(toIndentedString(npuType)).append("\n");
        sb.append("    nics: ").append(toIndentedString(nics)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    iefNodeVersion: ").append(toIndentedString(iefNodeVersion)).append("\n");
        sb.append("    upgradeFlag: ").append(toIndentedString(upgradeFlag)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    groupIds: ").append(toIndentedString(groupIds)).append("\n");
        sb.append("    upgradeHistory: ").append(toIndentedString(upgradeHistory)).append("\n");
        sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
        sb.append("    dockerEnable: ").append(toIndentedString(dockerEnable)).append("\n");
        sb.append("    mqttMode: ").append(toIndentedString(mqttMode)).append("\n");
        sb.append("    mqttExternal: ").append(toIndentedString(mqttExternal)).append("\n");
        sb.append("    mqttInternal: ").append(toIndentedString(mqttInternal)).append("\n");
        sb.append("    nodeType: ").append(toIndentedString(nodeType)).append("\n");
        sb.append("    ntpConfigs: ").append(toIndentedString(ntpConfigs)).append("\n");
        sb.append("    errorReason: ").append(toIndentedString(errorReason)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    npuNum: ").append(toIndentedString(npuNum)).append("\n");
        sb.append("    npuInfo: ").append(toIndentedString(npuInfo)).append("\n");
        sb.append("    containerRuntimeVersion: ").append(toIndentedString(containerRuntimeVersion)).append("\n");
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
