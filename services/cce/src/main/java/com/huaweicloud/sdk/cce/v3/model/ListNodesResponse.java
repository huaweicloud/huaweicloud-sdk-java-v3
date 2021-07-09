package com.huaweicloud.sdk.cce.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cce.v3.model.Node;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListNodesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="kind")
    
    private String kind;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="apiVersion")
    
    private String apiVersion;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="items")
    
    private List<Node> items = null;
    
    public ListNodesResponse withKind(String kind) {
        this.kind = kind;
        return this;
    }

    


    /**
     * API类型，固定值“List”
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    

    public ListNodesResponse withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    


    /**
     * API版本，固定值“v3”
     * @return apiVersion
     */
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    

    public ListNodesResponse withItems(List<Node> items) {
        this.items = items;
        return this;
    }

    
    public ListNodesResponse addItemsItem(Node itemsItem) {
        if(this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(itemsItem);
        return this;
    }

    public ListNodesResponse withItems(Consumer<List<Node>> itemsSetter) {
        if(this.items == null) {
            this.items = new ArrayList<>();
        }
        itemsSetter.accept(this.items);
        return this;
    }

    /**
     * 节点对象列表，包含了当前集群下所有节点的详细信息。可通过items.metadata.name下的值来找到对应的节点。
     * @return items
     */
    public List<Node> getItems() {
        return items;
    }

    public void setItems(List<Node> items) {
        this.items = items;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListNodesResponse listNodesResponse = (ListNodesResponse) o;
        return Objects.equals(this.kind, listNodesResponse.kind) &&
            Objects.equals(this.apiVersion, listNodesResponse.apiVersion) &&
            Objects.equals(this.items, listNodesResponse.items);
    }
    @Override
    public int hashCode() {
        return Objects.hash(kind, apiVersion, items);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNodesResponse {\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

