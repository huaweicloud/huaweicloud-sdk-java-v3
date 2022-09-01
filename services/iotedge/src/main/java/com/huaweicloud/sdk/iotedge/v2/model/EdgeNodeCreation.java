package com.huaweicloud.sdk.iotedge.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotedge.v2.model.BasePathDTO;
import com.huaweicloud.sdk.iotedge.v2.model.EdgeAppInstanceDTO;
import com.huaweicloud.sdk.iotedge.v2.model.LogConfigDTO;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 创建边缘节点请求结构体。
 */
public class EdgeNodeCreation  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="edge_node_id")
    
    @JacksonXmlProperty(localName = "edge_node_id")
    
    private String edgeNodeId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    @JacksonXmlProperty(localName = "name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    @JacksonXmlProperty(localName = "type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="verify_code")
    
    @JacksonXmlProperty(localName = "verify_code")
    
    private String verifyCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="time_out")
    
    @JacksonXmlProperty(localName = "time_out")
    
    private Integer timeOut;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="arch")
    
    @JacksonXmlProperty(localName = "arch")
    
    private String arch;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    @JacksonXmlProperty(localName = "instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="space_id")
    
    @JacksonXmlProperty(localName = "space_id")
    
    private String spaceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_ids")
    
    @JacksonXmlProperty(localName = "resource_ids")
    
    private List<String> resourceIds = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="security_level")
    
    @JacksonXmlProperty(localName = "security_level")
    
    private String securityLevel;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="storage_period")
    
    @JacksonXmlProperty(localName = "storage_period")
    
    private Integer storagePeriod;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ai_card_type")
    
    @JacksonXmlProperty(localName = "ai_card_type")
    
    private String aiCardType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="base_path")
    
    @JacksonXmlProperty(localName = "base_path")
    
    private BasePathDTO basePath;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="log_configs")
    
    @JacksonXmlProperty(localName = "log_configs")
    
    private List<LogConfigDTO> logConfigs = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="apps")
    
    @JacksonXmlProperty(localName = "apps")
    
    private List<EdgeAppInstanceDTO> apps = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="hardware_model")
    
    @JacksonXmlProperty(localName = "hardware_model")
    
    private String hardwareModel;

    public EdgeNodeCreation withEdgeNodeId(String edgeNodeId) {
        this.edgeNodeId = edgeNodeId;
        return this;
    }

    


    /**
     * 边缘节点ID
     * @return edgeNodeId
     */
    public String getEdgeNodeId() {
        return edgeNodeId;
    }

    public void setEdgeNodeId(String edgeNodeId) {
        this.edgeNodeId = edgeNodeId;
    }

    

    public EdgeNodeCreation withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 边缘节点名称，只允许中、数字、英文大小写、中划线、下划线
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public EdgeNodeCreation withType(String type) {
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

    

    public EdgeNodeCreation withVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
        return this;
    }

    


    /**
     * 边缘节点注册使用的验证码，如果不输入则平台随机生成。
     * @return verifyCode
     */
    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

    

    public EdgeNodeCreation withTimeOut(Integer timeOut) {
        this.timeOut = timeOut;
        return this;
    }

    


    /**
     * 验证码的有效时间单位秒，默认1800秒，范围为1~864000，过期后平台会随机生成。
     * minimum: 1
     * maximum: 864000
     * @return timeOut
     */
    public Integer getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(Integer timeOut) {
        this.timeOut = timeOut;
    }

    

    public EdgeNodeCreation withArch(String arch) {
        this.arch = arch;
        return this;
    }

    


    /**
     * 系统架构。包括：arm64，arm32，x86_64。
     * @return arch
     */
    public String getArch() {
        return arch;
    }

    public void setArch(String arch) {
        this.arch = arch;
    }

    

    public EdgeNodeCreation withInstanceId(String instanceId) {
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

    

    public EdgeNodeCreation withSpaceId(String spaceId) {
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

    

    public EdgeNodeCreation withResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }

    
    public EdgeNodeCreation addResourceIdsItem(String resourceIdsItem) {
        if(this.resourceIds == null) {
            this.resourceIds = new ArrayList<>();
        }
        this.resourceIds.add(resourceIdsItem);
        return this;
    }

    public EdgeNodeCreation withResourceIds(Consumer<List<String>> resourceIdsSetter) {
        if(this.resourceIds == null) {
            this.resourceIds = new ArrayList<>();
        }
        resourceIdsSetter.accept(this.resourceIds);
        return this;
    }

    /**
     * 资源id列表，创建节点时需绑定已购买的资源包，资源可叠加。
     * @return resourceIds
     */
    public List<String> getResourceIds() {
        return resourceIds;
    }

    public void setResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
    }

    

    public EdgeNodeCreation withSecurityLevel(String securityLevel) {
        this.securityLevel = securityLevel;
        return this;
    }

    


    /**
     * 节点的安全等级，MEDIUM表示本地明文存储，HIGH表示本地加密存储。
     * @return securityLevel
     */
    public String getSecurityLevel() {
        return securityLevel;
    }

    public void setSecurityLevel(String securityLevel) {
        this.securityLevel = securityLevel;
    }

    

    public EdgeNodeCreation withStoragePeriod(Integer storagePeriod) {
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

    

    public EdgeNodeCreation withAiCardType(String aiCardType) {
        this.aiCardType = aiCardType;
        return this;
    }

    


    /**
     * 华为AI加速卡类型，如NPU、GPU。
     * @return aiCardType
     */
    public String getAiCardType() {
        return aiCardType;
    }

    public void setAiCardType(String aiCardType) {
        this.aiCardType = aiCardType;
    }

    

    public EdgeNodeCreation withBasePath(BasePathDTO basePath) {
        this.basePath = basePath;
        return this;
    }

    public EdgeNodeCreation withBasePath(Consumer<BasePathDTO> basePathSetter) {
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

    

    public EdgeNodeCreation withLogConfigs(List<LogConfigDTO> logConfigs) {
        this.logConfigs = logConfigs;
        return this;
    }

    
    public EdgeNodeCreation addLogConfigsItem(LogConfigDTO logConfigsItem) {
        if(this.logConfigs == null) {
            this.logConfigs = new ArrayList<>();
        }
        this.logConfigs.add(logConfigsItem);
        return this;
    }

    public EdgeNodeCreation withLogConfigs(Consumer<List<LogConfigDTO>> logConfigsSetter) {
        if(this.logConfigs == null) {
            this.logConfigs = new ArrayList<>();
        }
        logConfigsSetter.accept(this.logConfigs);
        return this;
    }

    /**
     * 边缘节点在IEF日志配置参数，仅高级版支持。
     * @return logConfigs
     */
    public List<LogConfigDTO> getLogConfigs() {
        return logConfigs;
    }

    public void setLogConfigs(List<LogConfigDTO> logConfigs) {
        this.logConfigs = logConfigs;
    }

    

    public EdgeNodeCreation withApps(List<EdgeAppInstanceDTO> apps) {
        this.apps = apps;
        return this;
    }

    
    public EdgeNodeCreation addAppsItem(EdgeAppInstanceDTO appsItem) {
        if(this.apps == null) {
            this.apps = new ArrayList<>();
        }
        this.apps.add(appsItem);
        return this;
    }

    public EdgeNodeCreation withApps(Consumer<List<EdgeAppInstanceDTO>> appsSetter) {
        if(this.apps == null) {
            this.apps = new ArrayList<>();
        }
        appsSetter.accept(this.apps);
        return this;
    }

    /**
     * 用户预置第三方边缘应用
     * @return apps
     */
    public List<EdgeAppInstanceDTO> getApps() {
        return apps;
    }

    public void setApps(List<EdgeAppInstanceDTO> apps) {
        this.apps = apps;
    }

    

    public EdgeNodeCreation withHardwareModel(String hardwareModel) {
        this.hardwareModel = hardwareModel;
        return this;
    }

    


    /**
     * 网关型号
     * @return hardwareModel
     */
    public String getHardwareModel() {
        return hardwareModel;
    }

    public void setHardwareModel(String hardwareModel) {
        this.hardwareModel = hardwareModel;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EdgeNodeCreation edgeNodeCreation = (EdgeNodeCreation) o;
        return Objects.equals(this.edgeNodeId, edgeNodeCreation.edgeNodeId) &&
            Objects.equals(this.name, edgeNodeCreation.name) &&
            Objects.equals(this.type, edgeNodeCreation.type) &&
            Objects.equals(this.verifyCode, edgeNodeCreation.verifyCode) &&
            Objects.equals(this.timeOut, edgeNodeCreation.timeOut) &&
            Objects.equals(this.arch, edgeNodeCreation.arch) &&
            Objects.equals(this.instanceId, edgeNodeCreation.instanceId) &&
            Objects.equals(this.spaceId, edgeNodeCreation.spaceId) &&
            Objects.equals(this.resourceIds, edgeNodeCreation.resourceIds) &&
            Objects.equals(this.securityLevel, edgeNodeCreation.securityLevel) &&
            Objects.equals(this.storagePeriod, edgeNodeCreation.storagePeriod) &&
            Objects.equals(this.aiCardType, edgeNodeCreation.aiCardType) &&
            Objects.equals(this.basePath, edgeNodeCreation.basePath) &&
            Objects.equals(this.logConfigs, edgeNodeCreation.logConfigs) &&
            Objects.equals(this.apps, edgeNodeCreation.apps) &&
            Objects.equals(this.hardwareModel, edgeNodeCreation.hardwareModel);
    }
    @Override
    public int hashCode() {
        return Objects.hash(edgeNodeId, name, type, verifyCode, timeOut, arch, instanceId, spaceId, resourceIds, securityLevel, storagePeriod, aiCardType, basePath, logConfigs, apps, hardwareModel);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EdgeNodeCreation {\n");
        sb.append("    edgeNodeId: ").append(toIndentedString(edgeNodeId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    verifyCode: ").append(toIndentedString(verifyCode)).append("\n");
        sb.append("    timeOut: ").append(toIndentedString(timeOut)).append("\n");
        sb.append("    arch: ").append(toIndentedString(arch)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
        sb.append("    resourceIds: ").append(toIndentedString(resourceIds)).append("\n");
        sb.append("    securityLevel: ").append(toIndentedString(securityLevel)).append("\n");
        sb.append("    storagePeriod: ").append(toIndentedString(storagePeriod)).append("\n");
        sb.append("    aiCardType: ").append(toIndentedString(aiCardType)).append("\n");
        sb.append("    basePath: ").append(toIndentedString(basePath)).append("\n");
        sb.append("    logConfigs: ").append(toIndentedString(logConfigs)).append("\n");
        sb.append("    apps: ").append(toIndentedString(apps)).append("\n");
        sb.append("    hardwareModel: ").append(toIndentedString(hardwareModel)).append("\n");
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

