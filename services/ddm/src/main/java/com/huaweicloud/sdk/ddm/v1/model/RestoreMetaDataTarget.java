package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * RestoreMetaDataTarget
 */
public class RestoreMetaDataTarget {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_nodes")

    private List<String> dataNodes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    public RestoreMetaDataTarget withDataNodes(List<String> dataNodes) {
        this.dataNodes = dataNodes;
        return this;
    }

    public RestoreMetaDataTarget addDataNodesItem(String dataNodesItem) {
        if (this.dataNodes == null) {
            this.dataNodes = new ArrayList<>();
        }
        this.dataNodes.add(dataNodesItem);
        return this;
    }

    public RestoreMetaDataTarget withDataNodes(Consumer<List<String>> dataNodesSetter) {
        if (this.dataNodes == null) {
            this.dataNodes = new ArrayList<>();
        }
        dataNodesSetter.accept(this.dataNodes);
        return this;
    }

    /**
     * metadata恢复目标dn。
     * @return dataNodes
     */
    public List<String> getDataNodes() {
        return dataNodes;
    }

    public void setDataNodes(List<String> dataNodes) {
        this.dataNodes = dataNodes;
    }

    public RestoreMetaDataTarget withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例id。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RestoreMetaDataTarget that = (RestoreMetaDataTarget) obj;
        return Objects.equals(this.dataNodes, that.dataNodes) && Objects.equals(this.instanceId, that.instanceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dataNodes, instanceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestoreMetaDataTarget {\n");
        sb.append("    dataNodes: ").append(toIndentedString(dataNodes)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
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
