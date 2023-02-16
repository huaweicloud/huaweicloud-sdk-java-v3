package com.huaweicloud.sdk.iotedge.v2.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListEdgeNodesRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="state")
    
    
    private String state;


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
    @JsonProperty(value="node_ids")
    
    
    private List<String> nodeIds = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="offset")
    
    
    private Integer offset;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    
    private Integer limit;

    public ListEdgeNodesRequest withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 节点名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public ListEdgeNodesRequest withState(String state) {
        this.state = state;
        return this;
    }

    


    /**
     * 节点状态,OFFLINE|ONLINE|UNINSTALLED|INSTALLED|DELETING|UPGRADING
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    

    public ListEdgeNodesRequest withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 节点所属资源类型，advanced|standard
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    

    public ListEdgeNodesRequest withInstanceId(String instanceId) {
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

    

    public ListEdgeNodesRequest withSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }

    


    /**
     * 资源空间ID。此参数为非必选参数，存在多资源空间的用户需要使用该接口时，可以携带该参数查询指定资源空间下的设备列表，不携带该参数则会查询该用户下所有设备列表。
     * @return spaceId
     */
    public String getSpaceId() {
        return spaceId;
    }

    public void setSpaceId(String spaceId) {
        this.spaceId = spaceId;
    }

    

    public ListEdgeNodesRequest withNodeIds(List<String> nodeIds) {
        this.nodeIds = nodeIds;
        return this;
    }

    
    public ListEdgeNodesRequest addNodeIdsItem(String nodeIdsItem) {
        if(this.nodeIds == null) {
            this.nodeIds = new ArrayList<>();
        }
        this.nodeIds.add(nodeIdsItem);
        return this;
    }

    public ListEdgeNodesRequest withNodeIds(Consumer<List<String>> nodeIdsSetter) {
        if(this.nodeIds == null) {
            this.nodeIds = new ArrayList<>();
        }
        nodeIdsSetter.accept(this.nodeIds);
        return this;
    }

    /**
     * 节点id列表,查询ID在给的节点ID列表内的节点信息
     * @return nodeIds
     */
    public List<String> getNodeIds() {
        return nodeIds;
    }

    public void setNodeIds(List<String> nodeIds) {
        this.nodeIds = nodeIds;
    }

    

    public ListEdgeNodesRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    


    /**
     * 查询的起始位置，取值范围为非负整数，默认为0
     * minimum: 0
     * maximum: 1000000
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    

    public ListEdgeNodesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * 每页记录数，默认值为10，取值区间为1-1000
     * minimum: 1
     * maximum: 1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListEdgeNodesRequest listEdgeNodesRequest = (ListEdgeNodesRequest) o;
        return Objects.equals(this.name, listEdgeNodesRequest.name) &&
            Objects.equals(this.state, listEdgeNodesRequest.state) &&
            Objects.equals(this.type, listEdgeNodesRequest.type) &&
            Objects.equals(this.instanceId, listEdgeNodesRequest.instanceId) &&
            Objects.equals(this.spaceId, listEdgeNodesRequest.spaceId) &&
            Objects.equals(this.nodeIds, listEdgeNodesRequest.nodeIds) &&
            Objects.equals(this.offset, listEdgeNodesRequest.offset) &&
            Objects.equals(this.limit, listEdgeNodesRequest.limit);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, state, type, instanceId, spaceId, nodeIds, offset, limit);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEdgeNodesRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    spaceId: ").append(toIndentedString(spaceId)).append("\n");
        sb.append("    nodeIds: ").append(toIndentedString(nodeIds)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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

