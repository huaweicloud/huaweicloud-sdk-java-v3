package com.huaweicloud.sdk.iotedge.v2.model;

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
public class ShowEdgeNodeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_configs")

    private List<LogConfigDTO> logConfigs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ha_config")

    private HaConfigDTO haConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edge_node_id")

    private String edgeNodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_id")

    private String productId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "product_name")

    private String productName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "space_id")

    private String spaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_spec_types")

    private List<String> resourceSpecTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_ids")

    private List<String> resourceIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ips")

    private List<String> ips = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "software_version")

    private String softwareVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os_name")

    private String osName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "arch")

    private String arch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nics")

    private List<Nic> nics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "specification")

    private String specification;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ai_card_type")

    private String aiCardType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "npu_library_path")

    private String npuLibraryPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_version")

    private String containerVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_level")

    private String securityLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reliability_level")

    private String reliabilityLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "storage_period")

    private Integer storagePeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "base_path")

    private BasePathDTO basePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hardware_model")

    private String hardwareModel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offline_cache_configs")

    private OfflineCacheConfigsDTO offlineCacheConfigs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_auth_info")

    private DeviceAuthInfoDisplayDTO deviceAuthInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_data_format")

    private String deviceDataFormat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "automatic_upgrade")

    private String automaticUpgrade;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "device_data_record")

    private DeviceDataRecord deviceDataRecord;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_report")

    private String metricReport;

    public ShowEdgeNodeResponse withLogConfigs(List<LogConfigDTO> logConfigs) {
        this.logConfigs = logConfigs;
        return this;
    }

    public ShowEdgeNodeResponse addLogConfigsItem(LogConfigDTO logConfigsItem) {
        if (this.logConfigs == null) {
            this.logConfigs = new ArrayList<>();
        }
        this.logConfigs.add(logConfigsItem);
        return this;
    }

    public ShowEdgeNodeResponse withLogConfigs(Consumer<List<LogConfigDTO>> logConfigsSetter) {
        if (this.logConfigs == null) {
            this.logConfigs = new ArrayList<>();
        }
        logConfigsSetter.accept(this.logConfigs);
        return this;
    }

    /**
     * 边缘节点在IEF的日志配置
     * @return logConfigs
     */
    public List<LogConfigDTO> getLogConfigs() {
        return logConfigs;
    }

    public void setLogConfigs(List<LogConfigDTO> logConfigs) {
        this.logConfigs = logConfigs;
    }

    public ShowEdgeNodeResponse withHaConfig(HaConfigDTO haConfig) {
        this.haConfig = haConfig;
        return this;
    }

    public ShowEdgeNodeResponse withHaConfig(Consumer<HaConfigDTO> haConfigSetter) {
        if (this.haConfig == null) {
            this.haConfig = new HaConfigDTO();
            haConfigSetter.accept(this.haConfig);
        }

        return this;
    }

    /**
     * Get haConfig
     * @return haConfig
     */
    public HaConfigDTO getHaConfig() {
        return haConfig;
    }

    public void setHaConfig(HaConfigDTO haConfig) {
        this.haConfig = haConfig;
    }

    public ShowEdgeNodeResponse withEdgeNodeId(String edgeNodeId) {
        this.edgeNodeId = edgeNodeId;
        return this;
    }

    /**
     * 边缘节点Id
     * @return edgeNodeId
     */
    public String getEdgeNodeId() {
        return edgeNodeId;
    }

    public void setEdgeNodeId(String edgeNodeId) {
        this.edgeNodeId = edgeNodeId;
    }

    public ShowEdgeNodeResponse withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID。物理多租下各实例的唯一标识，一般华为云租户无需携带该参数，仅在物理多租场景下从管理面访问API时需要携带该参数。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ShowEdgeNodeResponse withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    /**
     * 边缘节点关联的产品ID，用于唯一标识一个产品模型。
     * @return productId
     */
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public ShowEdgeNodeResponse withProductName(String productName) {
        this.productName = productName;
        return this;
    }

    /**
     * 边缘节点关联的产品名称。
     * @return productName
     */
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public ShowEdgeNodeResponse withSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }

    /**
     * 资源空间id，对应IOTDA云服务接口参数中的app_id。
     * @return spaceId
     */
    public String getSpaceId() {
        return spaceId;
    }

    public void setSpaceId(String spaceId) {
        this.spaceId = spaceId;
    }

    public ShowEdgeNodeResponse withResourceSpecTypes(List<String> resourceSpecTypes) {
        this.resourceSpecTypes = resourceSpecTypes;
        return this;
    }

    public ShowEdgeNodeResponse addResourceSpecTypesItem(String resourceSpecTypesItem) {
        if (this.resourceSpecTypes == null) {
            this.resourceSpecTypes = new ArrayList<>();
        }
        this.resourceSpecTypes.add(resourceSpecTypesItem);
        return this;
    }

    public ShowEdgeNodeResponse withResourceSpecTypes(Consumer<List<String>> resourceSpecTypesSetter) {
        if (this.resourceSpecTypes == null) {
            this.resourceSpecTypes = new ArrayList<>();
        }
        resourceSpecTypesSetter.accept(this.resourceSpecTypes);
        return this;
    }

    /**
     * 节点所购买的资源类型的列表
     * @return resourceSpecTypes
     */
    public List<String> getResourceSpecTypes() {
        return resourceSpecTypes;
    }

    public void setResourceSpecTypes(List<String> resourceSpecTypes) {
        this.resourceSpecTypes = resourceSpecTypes;
    }

    public ShowEdgeNodeResponse withResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }

    public ShowEdgeNodeResponse addResourceIdsItem(String resourceIdsItem) {
        if (this.resourceIds == null) {
            this.resourceIds = new ArrayList<>();
        }
        this.resourceIds.add(resourceIdsItem);
        return this;
    }

    public ShowEdgeNodeResponse withResourceIds(Consumer<List<String>> resourceIdsSetter) {
        if (this.resourceIds == null) {
            this.resourceIds = new ArrayList<>();
        }
        resourceIdsSetter.accept(this.resourceIds);
        return this;
    }

    /**
     * 资源id列表，创建节点时需绑定已购买的资源包，可以叠加节点功能。
     * @return resourceIds
     */
    public List<String> getResourceIds() {
        return resourceIds;
    }

    public void setResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
    }

    public ShowEdgeNodeResponse withIps(List<String> ips) {
        this.ips = ips;
        return this;
    }

    public ShowEdgeNodeResponse addIpsItem(String ipsItem) {
        if (this.ips == null) {
            this.ips = new ArrayList<>();
        }
        this.ips.add(ipsItem);
        return this;
    }

    public ShowEdgeNodeResponse withIps(Consumer<List<String>> ipsSetter) {
        if (this.ips == null) {
            this.ips = new ArrayList<>();
        }
        ipsSetter.accept(this.ips);
        return this;
    }

    /**
     * 边缘节点主机ip
     * @return ips
     */
    public List<String> getIps() {
        return ips;
    }

    public void setIps(List<String> ips) {
        this.ips = ips;
    }

    public ShowEdgeNodeResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 边缘节点名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowEdgeNodeResponse withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 边缘节点状态
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public ShowEdgeNodeResponse withSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
        return this;
    }

    /**
     * 边缘应用id，只允许数字、英文小写、中划线，切必须以字母或数字结尾
     * @return softwareVersion
     */
    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    public ShowEdgeNodeResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 边缘节点创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ShowEdgeNodeResponse withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 边缘节点更新时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public ShowEdgeNodeResponse withOsName(String osName) {
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

    public ShowEdgeNodeResponse withArch(String arch) {
        this.arch = arch;
        return this;
    }

    /**
     * 边缘节点操作系统架构
     * @return arch
     */
    public String getArch() {
        return arch;
    }

    public void setArch(String arch) {
        this.arch = arch;
    }

    public ShowEdgeNodeResponse withHostName(String hostName) {
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

    public ShowEdgeNodeResponse withNics(List<Nic> nics) {
        this.nics = nics;
        return this;
    }

    public ShowEdgeNodeResponse addNicsItem(Nic nicsItem) {
        if (this.nics == null) {
            this.nics = new ArrayList<>();
        }
        this.nics.add(nicsItem);
        return this;
    }

    public ShowEdgeNodeResponse withNics(Consumer<List<Nic>> nicsSetter) {
        if (this.nics == null) {
            this.nics = new ArrayList<>();
        }
        nicsSetter.accept(this.nics);
        return this;
    }

    /**
     * 边缘节点网络网卡信息
     * @return nics
     */
    public List<Nic> getNics() {
        return nics;
    }

    public void setNics(List<Nic> nics) {
        this.nics = nics;
    }

    public ShowEdgeNodeResponse withSpecification(String specification) {
        this.specification = specification;
        return this;
    }

    /**
     * 网络规格，如4 cores | 3867 MB
     * @return specification
     */
    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public ShowEdgeNodeResponse withAiCardType(String aiCardType) {
        this.aiCardType = aiCardType;
        return this;
    }

    /**
     * AI加速卡类型，如华为昇腾AI加速卡NPU、图像处理加速卡GPU。
     * @return aiCardType
     */
    public String getAiCardType() {
        return aiCardType;
    }

    public void setAiCardType(String aiCardType) {
        this.aiCardType = aiCardType;
    }

    public ShowEdgeNodeResponse withNpuLibraryPath(String npuLibraryPath) {
        this.npuLibraryPath = npuLibraryPath;
        return this;
    }

    /**
     * npu驱动动态库路径
     * @return npuLibraryPath
     */
    public String getNpuLibraryPath() {
        return npuLibraryPath;
    }

    public void setNpuLibraryPath(String npuLibraryPath) {
        this.npuLibraryPath = npuLibraryPath;
    }

    public ShowEdgeNodeResponse withContainerVersion(String containerVersion) {
        this.containerVersion = containerVersion;
        return this;
    }

    /**
     * 容器运行时版本
     * @return containerVersion
     */
    public String getContainerVersion() {
        return containerVersion;
    }

    public void setContainerVersion(String containerVersion) {
        this.containerVersion = containerVersion;
    }

    public ShowEdgeNodeResponse withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 节点所属资源类型：advanced|standard
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ShowEdgeNodeResponse withSecurityLevel(String securityLevel) {
        this.securityLevel = securityLevel;
        return this;
    }

    /**
     * 节点的安全等级，MEDIUM边缘节数据上报不进行加密，HIGH对数据上报进行加密。
     * @return securityLevel
     */
    public String getSecurityLevel() {
        return securityLevel;
    }

    public void setSecurityLevel(String securityLevel) {
        this.securityLevel = securityLevel;
    }

    public ShowEdgeNodeResponse withReliabilityLevel(String reliabilityLevel) {
        this.reliabilityLevel = reliabilityLevel;
        return this;
    }

    /**
     * 节点的可靠性等级。
     * @return reliabilityLevel
     */
    public String getReliabilityLevel() {
        return reliabilityLevel;
    }

    public void setReliabilityLevel(String reliabilityLevel) {
        this.reliabilityLevel = reliabilityLevel;
    }

    public ShowEdgeNodeResponse withStoragePeriod(Integer storagePeriod) {
        this.storagePeriod = storagePeriod;
        return this;
    }

    /**
     * 节点的存储周期，默认0天，取值范围0~7天，0天则不存储。
     * minimum: 0
     * maximum: 7
     * @return storagePeriod
     */
    public Integer getStoragePeriod() {
        return storagePeriod;
    }

    public void setStoragePeriod(Integer storagePeriod) {
        this.storagePeriod = storagePeriod;
    }

    public ShowEdgeNodeResponse withBasePath(BasePathDTO basePath) {
        this.basePath = basePath;
        return this;
    }

    public ShowEdgeNodeResponse withBasePath(Consumer<BasePathDTO> basePathSetter) {
        if (this.basePath == null) {
            this.basePath = new BasePathDTO();
            basePathSetter.accept(this.basePath);
        }

        return this;
    }

    /**
     * Get basePath
     * @return basePath
     */
    public BasePathDTO getBasePath() {
        return basePath;
    }

    public void setBasePath(BasePathDTO basePath) {
        this.basePath = basePath;
    }

    public ShowEdgeNodeResponse withHardwareModel(String hardwareModel) {
        this.hardwareModel = hardwareModel;
        return this;
    }

    /**
     * 注册节点网关配置
     * @return hardwareModel
     */
    public String getHardwareModel() {
        return hardwareModel;
    }

    public void setHardwareModel(String hardwareModel) {
        this.hardwareModel = hardwareModel;
    }

    public ShowEdgeNodeResponse withOfflineCacheConfigs(OfflineCacheConfigsDTO offlineCacheConfigs) {
        this.offlineCacheConfigs = offlineCacheConfigs;
        return this;
    }

    public ShowEdgeNodeResponse withOfflineCacheConfigs(Consumer<OfflineCacheConfigsDTO> offlineCacheConfigsSetter) {
        if (this.offlineCacheConfigs == null) {
            this.offlineCacheConfigs = new OfflineCacheConfigsDTO();
            offlineCacheConfigsSetter.accept(this.offlineCacheConfigs);
        }

        return this;
    }

    /**
     * Get offlineCacheConfigs
     * @return offlineCacheConfigs
     */
    public OfflineCacheConfigsDTO getOfflineCacheConfigs() {
        return offlineCacheConfigs;
    }

    public void setOfflineCacheConfigs(OfflineCacheConfigsDTO offlineCacheConfigs) {
        this.offlineCacheConfigs = offlineCacheConfigs;
    }

    public ShowEdgeNodeResponse withDeviceAuthInfo(DeviceAuthInfoDisplayDTO deviceAuthInfo) {
        this.deviceAuthInfo = deviceAuthInfo;
        return this;
    }

    public ShowEdgeNodeResponse withDeviceAuthInfo(Consumer<DeviceAuthInfoDisplayDTO> deviceAuthInfoSetter) {
        if (this.deviceAuthInfo == null) {
            this.deviceAuthInfo = new DeviceAuthInfoDisplayDTO();
            deviceAuthInfoSetter.accept(this.deviceAuthInfo);
        }

        return this;
    }

    /**
     * Get deviceAuthInfo
     * @return deviceAuthInfo
     */
    public DeviceAuthInfoDisplayDTO getDeviceAuthInfo() {
        return deviceAuthInfo;
    }

    public void setDeviceAuthInfo(DeviceAuthInfoDisplayDTO deviceAuthInfo) {
        this.deviceAuthInfo = deviceAuthInfo;
    }

    public ShowEdgeNodeResponse withDeviceDataFormat(String deviceDataFormat) {
        this.deviceDataFormat = deviceDataFormat;
        return this;
    }

    /**
     * 节点使用的数据格式，默认为iotda物模型1.0格式，可以选择属性平铺数据格式flat_json
     * @return deviceDataFormat
     */
    public String getDeviceDataFormat() {
        return deviceDataFormat;
    }

    public void setDeviceDataFormat(String deviceDataFormat) {
        this.deviceDataFormat = deviceDataFormat;
    }

    public ShowEdgeNodeResponse withAutomaticUpgrade(String automaticUpgrade) {
        this.automaticUpgrade = automaticUpgrade;
        return this;
    }

    /**
     * 自动升级系统应用的节点开关，默认为关闭：OFF，IMMEDIATE表示节点开关打开
     * @return automaticUpgrade
     */
    public String getAutomaticUpgrade() {
        return automaticUpgrade;
    }

    public void setAutomaticUpgrade(String automaticUpgrade) {
        this.automaticUpgrade = automaticUpgrade;
    }

    public ShowEdgeNodeResponse withDeviceDataRecord(DeviceDataRecord deviceDataRecord) {
        this.deviceDataRecord = deviceDataRecord;
        return this;
    }

    public ShowEdgeNodeResponse withDeviceDataRecord(Consumer<DeviceDataRecord> deviceDataRecordSetter) {
        if (this.deviceDataRecord == null) {
            this.deviceDataRecord = new DeviceDataRecord();
            deviceDataRecordSetter.accept(this.deviceDataRecord);
        }

        return this;
    }

    /**
     * Get deviceDataRecord
     * @return deviceDataRecord
     */
    public DeviceDataRecord getDeviceDataRecord() {
        return deviceDataRecord;
    }

    public void setDeviceDataRecord(DeviceDataRecord deviceDataRecord) {
        this.deviceDataRecord = deviceDataRecord;
    }

    public ShowEdgeNodeResponse withMetricReport(String metricReport) {
        this.metricReport = metricReport;
        return this;
    }

    /**
     * omagent监控运维工具是否上报指标
     * @return metricReport
     */
    public String getMetricReport() {
        return metricReport;
    }

    public void setMetricReport(String metricReport) {
        this.metricReport = metricReport;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowEdgeNodeResponse that = (ShowEdgeNodeResponse) obj;
        return Objects.equals(this.logConfigs, that.logConfigs) && Objects.equals(this.haConfig, that.haConfig)
            && Objects.equals(this.edgeNodeId, that.edgeNodeId) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.productId, that.productId) && Objects.equals(this.productName, that.productName)
            && Objects.equals(this.spaceId, that.spaceId)
            && Objects.equals(this.resourceSpecTypes, that.resourceSpecTypes)
            && Objects.equals(this.resourceIds, that.resourceIds) && Objects.equals(this.ips, that.ips)
            && Objects.equals(this.name, that.name) && Objects.equals(this.state, that.state)
            && Objects.equals(this.softwareVersion, that.softwareVersion)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.osName, that.osName) && Objects.equals(this.arch, that.arch)
            && Objects.equals(this.hostName, that.hostName) && Objects.equals(this.nics, that.nics)
            && Objects.equals(this.specification, that.specification)
            && Objects.equals(this.aiCardType, that.aiCardType)
            && Objects.equals(this.npuLibraryPath, that.npuLibraryPath)
            && Objects.equals(this.containerVersion, that.containerVersion) && Objects.equals(this.type, that.type)
            && Objects.equals(this.securityLevel, that.securityLevel)
            && Objects.equals(this.reliabilityLevel, that.reliabilityLevel)
            && Objects.equals(this.storagePeriod, that.storagePeriod) && Objects.equals(this.basePath, that.basePath)
            && Objects.equals(this.hardwareModel, that.hardwareModel)
            && Objects.equals(this.offlineCacheConfigs, that.offlineCacheConfigs)
            && Objects.equals(this.deviceAuthInfo, that.deviceAuthInfo)
            && Objects.equals(this.deviceDataFormat, that.deviceDataFormat)
            && Objects.equals(this.automaticUpgrade, that.automaticUpgrade)
            && Objects.equals(this.deviceDataRecord, that.deviceDataRecord)
            && Objects.equals(this.metricReport, that.metricReport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logConfigs,
            haConfig,
            edgeNodeId,
            instanceId,
            productId,
            productName,
            spaceId,
            resourceSpecTypes,
            resourceIds,
            ips,
            name,
            state,
            softwareVersion,
            createTime,
            updateTime,
            osName,
            arch,
            hostName,
            nics,
            specification,
            aiCardType,
            npuLibraryPath,
            containerVersion,
            type,
            securityLevel,
            reliabilityLevel,
            storagePeriod,
            basePath,
            hardwareModel,
            offlineCacheConfigs,
            deviceAuthInfo,
            deviceDataFormat,
            automaticUpgrade,
            deviceDataRecord,
            metricReport);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowEdgeNodeResponse {\n");
        sb.append("    logConfigs: ").append(toIndentedString(logConfigs)).append("\n");
        sb.append("    haConfig: ").append(toIndentedString(haConfig)).append("\n");
        sb.append("    edgeNodeId: ").append(toIndentedString(edgeNodeId)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
        sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
        sb.append("    resourceSpecTypes: ").append(toIndentedString(resourceSpecTypes)).append("\n");
        sb.append("    resourceIds: ").append(toIndentedString(resourceIds)).append("\n");
        sb.append("    ips: ").append(toIndentedString(ips)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    softwareVersion: ").append(toIndentedString(softwareVersion)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    osName: ").append(toIndentedString(osName)).append("\n");
        sb.append("    arch: ").append(toIndentedString(arch)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    nics: ").append(toIndentedString(nics)).append("\n");
        sb.append("    specification: ").append(toIndentedString(specification)).append("\n");
        sb.append("    aiCardType: ").append(toIndentedString(aiCardType)).append("\n");
        sb.append("    npuLibraryPath: ").append(toIndentedString(npuLibraryPath)).append("\n");
        sb.append("    containerVersion: ").append(toIndentedString(containerVersion)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    securityLevel: ").append(toIndentedString(securityLevel)).append("\n");
        sb.append("    reliabilityLevel: ").append(toIndentedString(reliabilityLevel)).append("\n");
        sb.append("    storagePeriod: ").append(toIndentedString(storagePeriod)).append("\n");
        sb.append("    basePath: ").append(toIndentedString(basePath)).append("\n");
        sb.append("    hardwareModel: ").append(toIndentedString(hardwareModel)).append("\n");
        sb.append("    offlineCacheConfigs: ").append(toIndentedString(offlineCacheConfigs)).append("\n");
        sb.append("    deviceAuthInfo: ").append(toIndentedString(deviceAuthInfo)).append("\n");
        sb.append("    deviceDataFormat: ").append(toIndentedString(deviceDataFormat)).append("\n");
        sb.append("    automaticUpgrade: ").append(toIndentedString(automaticUpgrade)).append("\n");
        sb.append("    deviceDataRecord: ").append(toIndentedString(deviceDataRecord)).append("\n");
        sb.append("    metricReport: ").append(toIndentedString(metricReport)).append("\n");
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
