package com.huaweicloud.sdk.iotedge.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 查询边缘节点列表响应体
 */
public class EdgeNodeDTO  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="edge_node_id")
    
    @JacksonXmlProperty(localName = "edge_node_id")
    
    private String edgeNodeId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    @JacksonXmlProperty(localName = "name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="state")
    
    @JacksonXmlProperty(localName = "state")
    
    private String state;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    @JacksonXmlProperty(localName = "instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="space_id")
    
    @JacksonXmlProperty(localName = "space_id")
    
    private String spaceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    @JacksonXmlProperty(localName = "type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_ids")
    
    @JacksonXmlProperty(localName = "resource_ids")
    
    private List<String> resourceIds = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="resource_spec_types")
    
    @JacksonXmlProperty(localName = "resource_spec_types")
    
    private List<String> resourceSpecTypes = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ips")
    
    @JacksonXmlProperty(localName = "ips")
    
    private List<String> ips = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="create_time")
    
    @JacksonXmlProperty(localName = "create_time")
    
    private String createTime;

    public EdgeNodeDTO withEdgeNodeId(String edgeNodeId) {
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

    

    public EdgeNodeDTO withName(String name) {
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

    

    public EdgeNodeDTO withState(String state) {
        this.state = state;
        return this;
    }

    


    /**
     * 边缘节点状态 UNINSTALLED|INSTALLED|OFFLINE|ONLINE|DELETING|FROZEN
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    

    public EdgeNodeDTO withInstanceId(String instanceId) {
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

    

    public EdgeNodeDTO withSpaceId(String spaceId) {
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

    

    public EdgeNodeDTO withType(String type) {
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

    

    public EdgeNodeDTO withResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }

    
    public EdgeNodeDTO addResourceIdsItem(String resourceIdsItem) {
        if(this.resourceIds == null) {
            this.resourceIds = new ArrayList<>();
        }
        this.resourceIds.add(resourceIdsItem);
        return this;
    }

    public EdgeNodeDTO withResourceIds(Consumer<List<String>> resourceIdsSetter) {
        if(this.resourceIds == null) {
            this.resourceIds = new ArrayList<>();
        }
        resourceIdsSetter.accept(this.resourceIds);
        return this;
    }

    /**
     * 节点所购买的资源类型的列表
     * @return resourceIds
     */
    public List<String> getResourceIds() {
        return resourceIds;
    }

    public void setResourceIds(List<String> resourceIds) {
        this.resourceIds = resourceIds;
    }

    

    public EdgeNodeDTO withResourceSpecTypes(List<String> resourceSpecTypes) {
        this.resourceSpecTypes = resourceSpecTypes;
        return this;
    }

    
    public EdgeNodeDTO addResourceSpecTypesItem(String resourceSpecTypesItem) {
        if(this.resourceSpecTypes == null) {
            this.resourceSpecTypes = new ArrayList<>();
        }
        this.resourceSpecTypes.add(resourceSpecTypesItem);
        return this;
    }

    public EdgeNodeDTO withResourceSpecTypes(Consumer<List<String>> resourceSpecTypesSetter) {
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

    

    public EdgeNodeDTO withIps(List<String> ips) {
        this.ips = ips;
        return this;
    }

    
    public EdgeNodeDTO addIpsItem(String ipsItem) {
        if(this.ips == null) {
            this.ips = new ArrayList<>();
        }
        this.ips.add(ipsItem);
        return this;
    }

    public EdgeNodeDTO withIps(Consumer<List<String>> ipsSetter) {
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

    

    public EdgeNodeDTO withCreateTime(String createTime) {
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EdgeNodeDTO edgeNodeDTO = (EdgeNodeDTO) o;
        return Objects.equals(this.edgeNodeId, edgeNodeDTO.edgeNodeId) &&
            Objects.equals(this.name, edgeNodeDTO.name) &&
            Objects.equals(this.state, edgeNodeDTO.state) &&
            Objects.equals(this.instanceId, edgeNodeDTO.instanceId) &&
            Objects.equals(this.spaceId, edgeNodeDTO.spaceId) &&
            Objects.equals(this.type, edgeNodeDTO.type) &&
            Objects.equals(this.resourceIds, edgeNodeDTO.resourceIds) &&
            Objects.equals(this.resourceSpecTypes, edgeNodeDTO.resourceSpecTypes) &&
            Objects.equals(this.ips, edgeNodeDTO.ips) &&
            Objects.equals(this.createTime, edgeNodeDTO.createTime);
    }
    @Override
    public int hashCode() {
        return Objects.hash(edgeNodeId, name, state, instanceId, spaceId, type, resourceIds, resourceSpecTypes, ips, createTime);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EdgeNodeDTO {\n");
        sb.append("    edgeNodeId: ").append(toIndentedString(edgeNodeId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    resourceIds: ").append(toIndentedString(resourceIds)).append("\n");
        sb.append("    resourceSpecTypes: ").append(toIndentedString(resourceSpecTypes)).append("\n");
        sb.append("    ips: ").append(toIndentedString(ips)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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

