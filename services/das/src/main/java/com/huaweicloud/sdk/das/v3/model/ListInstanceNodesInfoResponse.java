package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListInstanceNodesInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_nodes")

    private List<InstanceNodesInfoInstanceNodes> instanceNodes = null;

    public ListInstanceNodesInfoResponse withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListInstanceNodesInfoResponse withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * 实例名称
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public ListInstanceNodesInfoResponse withInstanceNodes(List<InstanceNodesInfoInstanceNodes> instanceNodes) {
        this.instanceNodes = instanceNodes;
        return this;
    }

    public ListInstanceNodesInfoResponse addInstanceNodesItem(InstanceNodesInfoInstanceNodes instanceNodesItem) {
        if (this.instanceNodes == null) {
            this.instanceNodes = new ArrayList<>();
        }
        this.instanceNodes.add(instanceNodesItem);
        return this;
    }

    public ListInstanceNodesInfoResponse withInstanceNodes(
        Consumer<List<InstanceNodesInfoInstanceNodes>> instanceNodesSetter) {
        if (this.instanceNodes == null) {
            this.instanceNodes = new ArrayList<>();
        }
        instanceNodesSetter.accept(this.instanceNodes);
        return this;
    }

    /**
     * 实例节点列表
     * @return instanceNodes
     */
    public List<InstanceNodesInfoInstanceNodes> getInstanceNodes() {
        return instanceNodes;
    }

    public void setInstanceNodes(List<InstanceNodesInfoInstanceNodes> instanceNodes) {
        this.instanceNodes = instanceNodes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInstanceNodesInfoResponse that = (ListInstanceNodesInfoResponse) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.instanceName, that.instanceName)
            && Objects.equals(this.instanceNodes, that.instanceNodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, instanceName, instanceNodes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstanceNodesInfoResponse {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    instanceNodes: ").append(toIndentedString(instanceNodes)).append("\n");
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
