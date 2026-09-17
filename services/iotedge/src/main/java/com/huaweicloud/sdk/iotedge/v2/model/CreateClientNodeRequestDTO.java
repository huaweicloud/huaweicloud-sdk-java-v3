package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 分配推送路由到边缘节点请求结构体
 */
public class CreateClientNodeRequestDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_node_id")

    private String clientNodeId;

    public CreateClientNodeRequestDTO withClientNodeId(String clientNodeId) {
        this.clientNodeId = clientNodeId;
        return this;
    }

    /**
     * 客户端节点ID，即边缘节点ID
     * @return clientNodeId
     */
    public String getClientNodeId() {
        return clientNodeId;
    }

    public void setClientNodeId(String clientNodeId) {
        this.clientNodeId = clientNodeId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateClientNodeRequestDTO that = (CreateClientNodeRequestDTO) obj;
        return Objects.equals(this.clientNodeId, that.clientNodeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientNodeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateClientNodeRequestDTO {\n");
        sb.append("    clientNodeId: ").append(toIndentedString(clientNodeId)).append("\n");
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
