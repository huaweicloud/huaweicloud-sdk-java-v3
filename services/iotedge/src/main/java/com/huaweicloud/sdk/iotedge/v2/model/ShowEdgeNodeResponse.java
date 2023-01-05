package com.huaweicloud.sdk.iotedge.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotedge.v2.model.BasePathDTO;
import com.huaweicloud.sdk.iotedge.v2.model.DeviceAuthInfoDisplayDTO;
import com.huaweicloud.sdk.iotedge.v2.model.HaConfigDTO;
import com.huaweicloud.sdk.iotedge.v2.model.LogConfigDTO;
import com.huaweicloud.sdk.iotedge.v2.model.Nic;
import com.huaweicloud.sdk.iotedge.v2.model.OfflineCacheConfigsDTO;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowEdgeNodeResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="log_configs")
    
    
    private List<LogConfigDTO> logConfigs = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ha_config")
    
    
    private HaConfigDTO haConfig;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="edge_node_id")
    
    
    private String edgeNodeId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_id")
    
    
    private String productId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_name")
    
    
    private String productName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="space_id")
    
    
    private String spaceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_spec_types")
    
    
    private List<String> resourceSpecTypes = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_ids")
    
    
    private List<String> resourceIds = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ips")
    
    
    private List<String> ips = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="state")
    
    
    private String state;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="software_version")
    
    
    private String softwareVersion;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    
    
    private String createTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="update_time")
    
    
    private String updateTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="os_name")
    
    
    private String osName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="arch")
    
    
    private String arch;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="host_name")
    
    
    private String hostName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="nics")
    
    
    private List<Nic> nics = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="specification")
    
    
    private String specification;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ai_card_type")
    
    
    private String aiCardType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="container_version")
    
    
    private String containerVersion;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="security_level")
    
    
    private String securityLevel;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="reliability_level")
    
    
    private String reliabilityLevel;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="storage_period")
    
    
    private Integer storagePeriod;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="base_path")
    
    
    private BasePathDTO basePath;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="hardware_model")
    
    
    private String hardwareModel;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offline_cache_configs")
    
    
    private OfflineCacheConfigsDTO offlineCacheConfigs;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="device_auth_info")
    
    
    private DeviceAuthInfoDisplayDTO deviceAuthInfo;

    public ShowEdgeNodeResponse withLogConfigs(List<LogConfigDTO> logConfigs) {
        this.logConfigs = logConfigs;
        return this;
    }

    
    public ShowEdgeNodeResponse addLogConfigsItem(LogConfigDTO logConfigsItem) {
        if(this.logConfigs == null) {
            this.logConfigs = new ArrayList<>();
        }
        this.logConfigs.add(logConfigsItem);
        return this;
    }

    public ShowEdgeNodeResponse withLogConfigs(Consumer<List<LogConfigDTO>> logConfigsSetter) {
        if(this.logConfigs == null) {
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
        if(this.haConfig == null ){
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
        if(this.resourceSpecTypes == null) {
            this.resourceSpecTypes = new ArrayList<>();
        }
        this.resourceSpecTypes.add(resourceSpecTypesItem);
        return this;
    }

    public ShowEdgeNodeResponse withResourceSpecTypes(Consumer<List<String>> resourceSpecTypesSetter) {
        if(this.resourceSpecTypes == null) {
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
        if(this.resourceIds == null) {
            this.resourceIds = new ArrayList<>();
        }
        this.resourceIds.add(resourceIdsItem);
        return this;
    }

    public ShowEdgeNodeResponse withResourceIds(Consumer<List<String>> resourceIdsSetter) {
        if(this.resourceIds == null) {
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
        if(this.ips == null) {
            this.ips = new ArrayList<>();
        }
        this.ips.add(ipsItem);
        return this;
    }

    public ShowEdgeNodeResponse withIps(Consumer<List<String>> ipsSetter) {
        if(this.ips == null) {
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
        if(this.nics == null) {
            this.nics = new ArrayList<>();
        }
        this.nics.add(nicsItem);
        return this;
    }

    public ShowEdgeNodeResponse withNics(Consumer<List<Nic>> nicsSetter) {
        if(this.nics == null) {
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
     * 华为AI加速卡类型，如NPU、GPU、unEquipped
     * @return aiCardType
     */
    public String getAiCardType() {
        return aiCardType;
    }

    public void setAiCardType(String aiCardType) {
        this.aiCardType = aiCardType;
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
        if(this.basePath == null ){
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
        if(this.offlineCacheConfigs == null ){
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
        if(this.deviceAuthInfo == null ){
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowEdgeNodeResponse showEdgeNodeResponse = (ShowEdgeNodeResponse) o;
        return Objects.equals(this.logConfigs, showEdgeNodeResponse.logConfigs) &&
            Objects.equals(this.haConfig, showEdgeNodeResponse.haConfig) &&
            Objects.equals(this.edgeNodeId, showEdgeNodeResponse.edgeNodeId) &&
            Objects.equals(this.instanceId, showEdgeNodeResponse.instanceId) &&
            Objects.equals(this.productId, showEdgeNodeResponse.productId) &&
            Objects.equals(this.productName, showEdgeNodeResponse.productName) &&
            Objects.equals(this.spaceId, showEdgeNodeResponse.spaceId) &&
            Objects.equals(this.resourceSpecTypes, showEdgeNodeResponse.resourceSpecTypes) &&
            Objects.equals(this.resourceIds, showEdgeNodeResponse.resourceIds) &&
            Objects.equals(this.ips, showEdgeNodeResponse.ips) &&
            Objects.equals(this.name, showEdgeNodeResponse.name) &&
            Objects.equals(this.state, showEdgeNodeResponse.state) &&
            Objects.equals(this.softwareVersion, showEdgeNodeResponse.softwareVersion) &&
            Objects.equals(this.createTime, showEdgeNodeResponse.createTime) &&
            Objects.equals(this.updateTime, showEdgeNodeResponse.updateTime) &&
            Objects.equals(this.osName, showEdgeNodeResponse.osName) &&
            Objects.equals(this.arch, showEdgeNodeResponse.arch) &&
            Objects.equals(this.hostName, showEdgeNodeResponse.hostName) &&
            Objects.equals(this.nics, showEdgeNodeResponse.nics) &&
            Objects.equals(this.specification, showEdgeNodeResponse.specification) &&
            Objects.equals(this.aiCardType, showEdgeNodeResponse.aiCardType) &&
            Objects.equals(this.containerVersion, showEdgeNodeResponse.containerVersion) &&
            Objects.equals(this.type, showEdgeNodeResponse.type) &&
            Objects.equals(this.securityLevel, showEdgeNodeResponse.securityLevel) &&
            Objects.equals(this.reliabilityLevel, showEdgeNodeResponse.reliabilityLevel) &&
            Objects.equals(this.storagePeriod, showEdgeNodeResponse.storagePeriod) &&
            Objects.equals(this.basePath, showEdgeNodeResponse.basePath) &&
            Objects.equals(this.hardwareModel, showEdgeNodeResponse.hardwareModel) &&
            Objects.equals(this.offlineCacheConfigs, showEdgeNodeResponse.offlineCacheConfigs) &&
            Objects.equals(this.deviceAuthInfo, showEdgeNodeResponse.deviceAuthInfo);
    }
    @Override
    public int hashCode() {
        return Objects.hash(logConfigs, haConfig, edgeNodeId, instanceId, productId, productName, spaceId, resourceSpecTypes, resourceIds, ips, name, state, softwareVersion, createTime, updateTime, osName, arch, hostName, nics, specification, aiCardType, containerVersion, type, securityLevel, reliabilityLevel, storagePeriod, basePath, hardwareModel, offlineCacheConfigs, deviceAuthInfo);
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
        sb.append("    containerVersion: ").append(toIndentedString(containerVersion)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    securityLevel: ").append(toIndentedString(securityLevel)).append("\n");
        sb.append("    reliabilityLevel: ").append(toIndentedString(reliabilityLevel)).append("\n");
        sb.append("    storagePeriod: ").append(toIndentedString(storagePeriod)).append("\n");
        sb.append("    basePath: ").append(toIndentedString(basePath)).append("\n");
        sb.append("    hardwareModel: ").append(toIndentedString(hardwareModel)).append("\n");
        sb.append("    offlineCacheConfigs: ").append(toIndentedString(offlineCacheConfigs)).append("\n");
        sb.append("    deviceAuthInfo: ").append(toIndentedString(deviceAuthInfo)).append("\n");
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

