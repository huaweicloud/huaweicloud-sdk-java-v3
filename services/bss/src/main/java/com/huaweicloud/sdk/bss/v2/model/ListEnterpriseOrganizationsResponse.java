package com.huaweicloud.sdk.bss.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bss.v2.model.EmChildNodeV2;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListEnterpriseOrganizationsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="root_id")
    
    private String rootId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="root_name")
    
    private String rootName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="child_nodes")
    
    private List<EmChildNodeV2> childNodes = null;
    
    public ListEnterpriseOrganizationsResponse withRootId(String rootId) {
        this.rootId = rootId;
        return this;
    }

    


    /**
     * 根节点ID，如果请求有parent_id，则该参数无值。
     * @return rootId
     */
    public String getRootId() {
        return rootId;
    }

    public void setRootId(String rootId) {
        this.rootId = rootId;
    }

    public ListEnterpriseOrganizationsResponse withRootName(String rootName) {
        this.rootName = rootName;
        return this;
    }

    


    /**
     * 根节点名称，如果请求有parent_id，则该参数无值。  说明： 组织根节点没有设置组织名称时，可能为空。
     * @return rootName
     */
    public String getRootName() {
        return rootName;
    }

    public void setRootName(String rootName) {
        this.rootName = rootName;
    }

    public ListEnterpriseOrganizationsResponse withChildNodes(List<EmChildNodeV2> childNodes) {
        this.childNodes = childNodes;
        return this;
    }

    
    public ListEnterpriseOrganizationsResponse addChildNodesItem(EmChildNodeV2 childNodesItem) {
        if (this.childNodes == null) {
            this.childNodes = new ArrayList<>();
        }
        this.childNodes.add(childNodesItem);
        return this;
    }

    public ListEnterpriseOrganizationsResponse withChildNodes(Consumer<List<EmChildNodeV2>> childNodesSetter) {
        if(this.childNodes == null ){
            this.childNodes = new ArrayList<>();
        }
        childNodesSetter.accept(this.childNodes);
        return this;
    }

    /**
     * 子节点列表。
     * @return childNodes
     */
    public List<EmChildNodeV2> getChildNodes() {
        return childNodes;
    }

    public void setChildNodes(List<EmChildNodeV2> childNodes) {
        this.childNodes = childNodes;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListEnterpriseOrganizationsResponse listEnterpriseOrganizationsResponse = (ListEnterpriseOrganizationsResponse) o;
        return Objects.equals(this.rootId, listEnterpriseOrganizationsResponse.rootId) &&
            Objects.equals(this.rootName, listEnterpriseOrganizationsResponse.rootName) &&
            Objects.equals(this.childNodes, listEnterpriseOrganizationsResponse.childNodes);
    }
    @Override
    public int hashCode() {
        return Objects.hash(rootId, rootName, childNodes);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEnterpriseOrganizationsResponse {\n");
        sb.append("    rootId: ").append(toIndentedString(rootId)).append("\n");
        sb.append("    rootName: ").append(toIndentedString(rootName)).append("\n");
        sb.append("    childNodes: ").append(toIndentedString(childNodes)).append("\n");
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

