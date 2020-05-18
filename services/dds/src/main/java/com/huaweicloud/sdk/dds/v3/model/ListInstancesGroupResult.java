package com.huaweicloud.sdk.dds.v3.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dds.v3.model.ListInstancesNodeResult;
import com.huaweicloud.sdk.dds.v3.model.ListInstancesVolumeResult;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * 实例组信息。
 */
public class ListInstancesGroupResult  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="volume")
    
    private ListInstancesVolumeResult volume = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="nodes")
    
    private List<ListInstancesNodeResult> nodes = new ArrayList<>();
    
    public ListInstancesGroupResult withType(String type) {
        this.type = type;
        return this;
    }

    


    /**
     * 节点类型。 取值： - shard - config - mongos - replica - single
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ListInstancesGroupResult withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 组ID。节点类型为shard和config时，该参数有效。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListInstancesGroupResult withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 组名组名称。节点类型为shard和config时，该参数有效。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListInstancesGroupResult withStatus(String status) {
        this.status = status;
        return this;
    }

    


    /**
     * 组状态。节点类型为shard和config时，该参数有效。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListInstancesGroupResult withVolume(ListInstancesVolumeResult volume) {
        this.volume = volume;
        return this;
    }

    public ListInstancesGroupResult withVolume(Consumer<ListInstancesVolumeResult> volumeSetter) {
        if(this.volume == null ){
            this.volume = new ListInstancesVolumeResult();
        }
        volumeSetter.accept(this.volume);
        return this;
    }


    /**
     * Get volume
     * @return volume
     */
    public ListInstancesVolumeResult getVolume() {
        return volume;
    }

    public void setVolume(ListInstancesVolumeResult volume) {
        this.volume = volume;
    }

    public ListInstancesGroupResult withNodes(List<ListInstancesNodeResult> nodes) {
        this.nodes = nodes;
        return this;
    }

    
    public ListInstancesGroupResult addNodesItem(ListInstancesNodeResult nodesItem) {
        this.nodes.add(nodesItem);
        return this;
    }

    public ListInstancesGroupResult withNodes(Consumer<List<ListInstancesNodeResult>> nodesSetter) {
        if(this.nodes == null ){
            this.nodes = new ArrayList<>();
        }
        nodesSetter.accept(this.nodes);
        return this;
    }

    /**
     * 节点信息。
     * @return nodes
     */
    public List<ListInstancesNodeResult> getNodes() {
        return nodes;
    }

    public void setNodes(List<ListInstancesNodeResult> nodes) {
        this.nodes = nodes;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListInstancesGroupResult listInstancesGroupResult = (ListInstancesGroupResult) o;
        return Objects.equals(this.type, listInstancesGroupResult.type) &&
            Objects.equals(this.id, listInstancesGroupResult.id) &&
            Objects.equals(this.name, listInstancesGroupResult.name) &&
            Objects.equals(this.status, listInstancesGroupResult.status) &&
            Objects.equals(this.volume, listInstancesGroupResult.volume) &&
            Objects.equals(this.nodes, listInstancesGroupResult.nodes);
    }
    @Override
    public int hashCode() {
        return Objects.hash(type, id, name, status, volume, nodes);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstancesGroupResult {\n");
            sb.append("    type: ").append(toIndentedString(type)).append("\n");
            sb.append("    id: ").append(toIndentedString(id)).append("\n");
            sb.append("    name: ").append(toIndentedString(name)).append("\n");
            sb.append("    status: ").append(toIndentedString(status)).append("\n");
            sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
            sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
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

