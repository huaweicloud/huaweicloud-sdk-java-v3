package com.huaweicloud.sdk.iotedge.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotedge.v2.model.BasePathDTO;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateEdgeNodeResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="edge_node_id")
    
    @JacksonXmlProperty(localName = "edge_node_id")
    
    private String edgeNodeId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    @JacksonXmlProperty(localName = "name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    @JacksonXmlProperty(localName = "instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="space_id")
    
    @JacksonXmlProperty(localName = "space_id")
    
    private String spaceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_id")
    
    @JacksonXmlProperty(localName = "product_id")
    
    private String productId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="product_name")
    
    @JacksonXmlProperty(localName = "product_name")
    
    private String productName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="state")
    
    @JacksonXmlProperty(localName = "state")
    
    private String state;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    @JacksonXmlProperty(localName = "type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="installer_version")
    
    @JacksonXmlProperty(localName = "installer_version")
    
    private String installerVersion;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="base_path")
    
    @JacksonXmlProperty(localName = "base_path")
    
    private BasePathDTO basePath;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_ids")
    
    @JacksonXmlProperty(localName = "resource_ids")
    
    private List<String> resourceIds = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ips")
    
    @JacksonXmlProperty(localName = "ips")
    
    private List<String> ips = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    
    @JacksonXmlProperty(localName = "create_time")
    
    private String createTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="hardware_model")
    
    @JacksonXmlProperty(localName = "hardware_model")
    
    private String hardwareModel;

    public CreateEdgeNodeResponse withEdgeNodeId(String edgeNodeId) {
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

    

    public CreateEdgeNodeResponse withName(String name) {
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

    

    public CreateEdgeNodeResponse withInstanceId(String instanceId) {
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

    

    public CreateEdgeNodeResponse withSpaceId(String spaceId) {
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

    

    public CreateEdgeNodeResponse withProductId(String productId) {
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

    

    public CreateEdgeNodeResponse withProductName(String productName) {
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

    

    public CreateEdgeNodeResponse withState(String state) {
        this.state = state;
        return this;
    }

    


    /**
     * 边缘节点状态UNINSTALLED|INSTALLED|OFFLINE|ONLINE|DELETING|FROZEN
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    

    public CreateEdgeNodeResponse withType(String type) {
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

    

    public CreateEdgeNodeResponse withInstallerVersion(String installerVersion) {
        this.installerVersion = installerVersion;
        return this;
    }

    


    /**
     * 安装文件版本
     * @return installerVersion
     */
    public String getInstallerVersion() {
        return installerVersion;
    }

    public void setInstallerVersion(String installerVersion) {
        this.installerVersion = installerVersion;
    }

    

    public CreateEdgeNodeResponse withBasePath(BasePathDTO basePath) {
        this.basePath = basePath;
        return this;
    }

    public CreateEdgeNodeResponse withBasePath(Consumer<BasePathDTO> basePathSetter) {
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

    

    public CreateEdgeNodeResponse withResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }

    
    public CreateEdgeNodeResponse addResourceIdsItem(String resourceIdsItem) {
        if(this.resourceIds == null) {
            this.resourceIds = new ArrayList<>();
        }
        this.resourceIds.add(resourceIdsItem);
        return this;
    }

    public CreateEdgeNodeResponse withResourceIds(Consumer<List<String>> resourceIdsSetter) {
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

    

    public CreateEdgeNodeResponse withIps(List<String> ips) {
        this.ips = ips;
        return this;
    }

    
    public CreateEdgeNodeResponse addIpsItem(String ipsItem) {
        if(this.ips == null) {
            this.ips = new ArrayList<>();
        }
        this.ips.add(ipsItem);
        return this;
    }

    public CreateEdgeNodeResponse withIps(Consumer<List<String>> ipsSetter) {
        if(this.ips == null) {
            this.ips = new ArrayList<>();
        }
        ipsSetter.accept(this.ips);
        return this;
    }

    /**
     * 边缘节点ip列表
     * @return ips
     */
    public List<String> getIps() {
        return ips;
    }

    public void setIps(List<String> ips) {
        this.ips = ips;
    }

    

    public CreateEdgeNodeResponse withCreateTime(String createTime) {
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

    

    public CreateEdgeNodeResponse withHardwareModel(String hardwareModel) {
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateEdgeNodeResponse createEdgeNodeResponse = (CreateEdgeNodeResponse) o;
        return Objects.equals(this.edgeNodeId, createEdgeNodeResponse.edgeNodeId) &&
            Objects.equals(this.name, createEdgeNodeResponse.name) &&
            Objects.equals(this.instanceId, createEdgeNodeResponse.instanceId) &&
            Objects.equals(this.spaceId, createEdgeNodeResponse.spaceId) &&
            Objects.equals(this.productId, createEdgeNodeResponse.productId) &&
            Objects.equals(this.productName, createEdgeNodeResponse.productName) &&
            Objects.equals(this.state, createEdgeNodeResponse.state) &&
            Objects.equals(this.type, createEdgeNodeResponse.type) &&
            Objects.equals(this.installerVersion, createEdgeNodeResponse.installerVersion) &&
            Objects.equals(this.basePath, createEdgeNodeResponse.basePath) &&
            Objects.equals(this.resourceIds, createEdgeNodeResponse.resourceIds) &&
            Objects.equals(this.ips, createEdgeNodeResponse.ips) &&
            Objects.equals(this.createTime, createEdgeNodeResponse.createTime) &&
            Objects.equals(this.hardwareModel, createEdgeNodeResponse.hardwareModel);
    }
    @Override
    public int hashCode() {
        return Objects.hash(edgeNodeId, name, instanceId, spaceId, productId, productName, state, type, installerVersion, basePath, resourceIds, ips, createTime, hardwareModel);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateEdgeNodeResponse {\n");
        sb.append("    edgeNodeId: ").append(toIndentedString(edgeNodeId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
        sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
        sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    installerVersion: ").append(toIndentedString(installerVersion)).append("\n");
        sb.append("    basePath: ").append(toIndentedString(basePath)).append("\n");
        sb.append("    resourceIds: ").append(toIndentedString(resourceIds)).append("\n");
        sb.append("    ips: ").append(toIndentedString(ips)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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

