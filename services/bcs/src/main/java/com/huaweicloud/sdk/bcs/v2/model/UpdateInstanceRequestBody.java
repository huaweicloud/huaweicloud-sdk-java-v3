package com.huaweicloud.sdk.bcs.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bcs.v2.model.NodeOrgs;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 添加节点和添加组织，添加组织是需要提供pvc_name
 */
public class UpdateInstanceRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="node_orgs")
    
    private List<NodeOrgs> nodeOrgs = new ArrayList<>();
    
    public UpdateInstanceRequestBody withNodeOrgs(List<NodeOrgs> nodeOrgs) {
        this.nodeOrgs = nodeOrgs;
        return this;
    }

    
    public UpdateInstanceRequestBody addNodeOrgsItem(NodeOrgs nodeOrgsItem) {
        this.nodeOrgs.add(nodeOrgsItem);
        return this;
    }

    public UpdateInstanceRequestBody withNodeOrgs(Consumer<List<NodeOrgs>> nodeOrgsSetter) {
        if(this.nodeOrgs == null ){
            this.nodeOrgs = new ArrayList<>();
        }
        nodeOrgsSetter.accept(this.nodeOrgs);
        return this;
    }

    /**
     * 添加节点的组织列表
     * @return nodeOrgs
     */
    public List<NodeOrgs> getNodeOrgs() {
        return nodeOrgs;
    }

    public void setNodeOrgs(List<NodeOrgs> nodeOrgs) {
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
        UpdateInstanceRequestBody updateInstanceRequestBody = (UpdateInstanceRequestBody) o;
        return Objects.equals(this.nodeOrgs, updateInstanceRequestBody.nodeOrgs);
    }
    @Override
    public int hashCode() {
        return Objects.hash(nodeOrgs);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateInstanceRequestBody {\n");
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

