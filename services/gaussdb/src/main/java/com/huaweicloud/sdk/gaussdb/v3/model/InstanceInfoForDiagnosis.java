package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * InstanceInfoForDiagnosis
 */
public class InstanceInfoForDiagnosis {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "master_node_id")

    private String masterNodeId;

    public InstanceInfoForDiagnosis withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public InstanceInfoForDiagnosis withMasterNodeId(String masterNodeId) {
        this.masterNodeId = masterNodeId;
        return this;
    }

    /**
     * 主节点ID。
     * @return masterNodeId
     */
    public String getMasterNodeId() {
        return masterNodeId;
    }

    public void setMasterNodeId(String masterNodeId) {
        this.masterNodeId = masterNodeId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstanceInfoForDiagnosis that = (InstanceInfoForDiagnosis) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.masterNodeId, that.masterNodeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, masterNodeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceInfoForDiagnosis {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    masterNodeId: ").append(toIndentedString(masterNodeId)).append("\n");
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
