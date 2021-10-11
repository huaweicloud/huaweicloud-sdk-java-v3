package com.huaweicloud.sdk.iotedge.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotedge.v2.model.EdgeAppInstanceDTO;
import com.huaweicloud.sdk.iotedge.v2.model.LogConfigDTO;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 创建边缘节点请求结构体。
 */
public class EdgeNodeCreation  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="space_id")
    
    
    private String spaceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_ids")
    
    
    private List<String> resourceIds = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="security_level")
    
    
    private String securityLevel;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="storage_period")
    
    
    private Integer storagePeriod;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ai_card_type")
    
    
    private String aiCardType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="log_configs")
    
    
    private List<LogConfigDTO> logConfigs = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="apps")
    
    
    private List<EdgeAppInstanceDTO> apps = null;
    
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
     * 资源id列表，创建节点时需绑定已购买的资源包，可以叠加节点功能。
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
     * 节点的安全等级，MEDIUM边缘节数据上报不进行加密，HIGH对数据上报进行加密。
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
     * 华为AI加速卡类型，如NPU、GPU
     * @return aiCardType
     */
    public String getAiCardType() {
        return aiCardType;
    }

    public void setAiCardType(String aiCardType) {
        this.aiCardType = aiCardType;
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
     * 边缘节点在IEF日志配置参数
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EdgeNodeCreation edgeNodeCreation = (EdgeNodeCreation) o;
        return Objects.equals(this.name, edgeNodeCreation.name) &&
            Objects.equals(this.type, edgeNodeCreation.type) &&
            Objects.equals(this.instanceId, edgeNodeCreation.instanceId) &&
            Objects.equals(this.spaceId, edgeNodeCreation.spaceId) &&
            Objects.equals(this.resourceIds, edgeNodeCreation.resourceIds) &&
            Objects.equals(this.securityLevel, edgeNodeCreation.securityLevel) &&
            Objects.equals(this.storagePeriod, edgeNodeCreation.storagePeriod) &&
            Objects.equals(this.aiCardType, edgeNodeCreation.aiCardType) &&
            Objects.equals(this.logConfigs, edgeNodeCreation.logConfigs) &&
            Objects.equals(this.apps, edgeNodeCreation.apps);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, type, instanceId, spaceId, resourceIds, securityLevel, storagePeriod, aiCardType, logConfigs, apps);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EdgeNodeCreation {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
        sb.append("    resourceIds: ").append(toIndentedString(resourceIds)).append("\n");
        sb.append("    securityLevel: ").append(toIndentedString(securityLevel)).append("\n");
        sb.append("    storagePeriod: ").append(toIndentedString(storagePeriod)).append("\n");
        sb.append("    aiCardType: ").append(toIndentedString(aiCardType)).append("\n");
        sb.append("    logConfigs: ").append(toIndentedString(logConfigs)).append("\n");
        sb.append("    apps: ").append(toIndentedString(apps)).append("\n");
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

