package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteCustomIngressPortRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ingress_port_id")

    private String ingressPortId;

    public DeleteCustomIngressPortRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID，在API网关控制台的“实例信息”中获取。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public DeleteCustomIngressPortRequest withIngressPortId(String ingressPortId) {
        this.ingressPortId = ingressPortId;
        return this;
    }

    /**
     * 实例自定义入方向端口ID。
     * @return ingressPortId
     */
    public String getIngressPortId() {
        return ingressPortId;
    }

    public void setIngressPortId(String ingressPortId) {
        this.ingressPortId = ingressPortId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteCustomIngressPortRequest that = (DeleteCustomIngressPortRequest) obj;
        return Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.ingressPortId, that.ingressPortId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, ingressPortId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteCustomIngressPortRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    ingressPortId: ").append(toIndentedString(ingressPortId)).append("\n");
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
