package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.Nodes;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListComponentInfosResponse extends SdkResponse {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="nodes")
    
    private List<Nodes> nodes = null;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_count")
    

    private Integer totalCount;

    public ListComponentInfosResponse withNodes(List<Nodes> nodes) {
        this.nodes = nodes;
        return this;
    }

    
    public ListComponentInfosResponse addNodesItem(Nodes nodesItem) {
        if(this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        this.nodes.add(nodesItem);
        return this;
    }

    public ListComponentInfosResponse withNodes(Consumer<List<Nodes>> nodesSetter) {
        if(this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        nodesSetter.accept(this.nodes);
        return this;
    }

    /**
     * 组件信息。
     * @return nodes
     */
    public List<Nodes> getNodes() {
        return nodes;
    }

    public void setNodes(List<Nodes> nodes) {
        this.nodes = nodes;
    }

    

    public ListComponentInfosResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    


    /**
     * 总记录数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListComponentInfosResponse listComponentInfosResponse = (ListComponentInfosResponse) o;
        return Objects.equals(this.nodes, listComponentInfosResponse.nodes) &&
            Objects.equals(this.totalCount, listComponentInfosResponse.totalCount);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nodes, totalCount);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListComponentInfosResponse {\n");
        sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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

