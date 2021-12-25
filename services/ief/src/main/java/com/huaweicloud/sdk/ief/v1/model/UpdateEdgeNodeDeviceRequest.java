package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class UpdateEdgeNodeDeviceRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_id")

    private String nodeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ief-instance-id")

    private String iefInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private Devices body;

    public UpdateEdgeNodeDeviceRequest withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /** 节点ID
     * 
     * @return nodeId */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public UpdateEdgeNodeDeviceRequest withIefInstanceId(String iefInstanceId) {
        this.iefInstanceId = iefInstanceId;
        return this;
    }

    /** 铂金版实例ID，专业版实例为空值
     * 
     * @return iefInstanceId */
    public String getIefInstanceId() {
        return iefInstanceId;
    }

    public void setIefInstanceId(String iefInstanceId) {
        this.iefInstanceId = iefInstanceId;
    }

    public UpdateEdgeNodeDeviceRequest withBody(Devices body) {
        this.body = body;
        return this;
    }

    public UpdateEdgeNodeDeviceRequest withBody(Consumer<Devices> bodySetter) {
        if (this.body == null) {
            this.body = new Devices();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public Devices getBody() {
        return body;
    }

    public void setBody(Devices body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateEdgeNodeDeviceRequest updateEdgeNodeDeviceRequest = (UpdateEdgeNodeDeviceRequest) o;
        return Objects.equals(this.nodeId, updateEdgeNodeDeviceRequest.nodeId)
            && Objects.equals(this.iefInstanceId, updateEdgeNodeDeviceRequest.iefInstanceId)
            && Objects.equals(this.body, updateEdgeNodeDeviceRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nodeId, iefInstanceId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateEdgeNodeDeviceRequest {\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    iefInstanceId: ").append(toIndentedString(iefInstanceId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
