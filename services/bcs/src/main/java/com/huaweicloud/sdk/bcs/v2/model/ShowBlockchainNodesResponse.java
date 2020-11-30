package com.huaweicloud.sdk.bcs.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bcs.v2.model.Org;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowBlockchainNodesResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="node_orgs")
    
    private Map<String, Org> nodeOrgs = null;
    
    public ShowBlockchainNodesResponse withNodeOrgs(Map<String, Org> nodeOrgs) {
        this.nodeOrgs = nodeOrgs;
        return this;
    }

    

    public ShowBlockchainNodesResponse putNodeOrgsItem(String key, Org nodeOrgsItem) {
         if (this.nodeOrgs == null) {
            this.nodeOrgs = new HashMap<>();
         }
        this.nodeOrgs.put(key, nodeOrgsItem);
        return this;
    }

    public ShowBlockchainNodesResponse withNodeOrgs(Consumer<Map<String, Org>> nodeOrgsSetter) {
        if(this.nodeOrgs == null ){
            this.nodeOrgs = new HashMap<>();
        }
        nodeOrgsSetter.accept(this.nodeOrgs);
        return this;
    }
    /**
     * key:组织名，value：组织详细信息
     * @return nodeOrgs
     */
    public Map<String, Org> getNodeOrgs() {
        return nodeOrgs;
    }

    public void setNodeOrgs(Map<String, Org> nodeOrgs) {
        this.nodeOrgs = nodeOrgs;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowBlockchainNodesResponse showBlockchainNodesResponse = (ShowBlockchainNodesResponse) o;
        return Objects.equals(this.nodeOrgs, showBlockchainNodesResponse.nodeOrgs);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nodeOrgs);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBlockchainNodesResponse {\n");
        sb.append("    nodeOrgs: ").append(toIndentedString(nodeOrgs)).append("\n");
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

