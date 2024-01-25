package com.huaweicloud.sdk.cse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteHttp2RpcRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gateway_id")

    private String gatewayId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "http2Rpc_id")

    private String http2RpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Accept")

    private String accept;

    public DeleteHttp2RpcRequest withGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }

    /**
     * 网关实例id
     * @return gatewayId
     */
    public String getGatewayId() {
        return gatewayId;
    }

    public void setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
    }

    public DeleteHttp2RpcRequest withHttp2RpcId(String http2RpcId) {
        this.http2RpcId = http2RpcId;
        return this;
    }

    /**
     * 插件id
     * @return http2RpcId
     */
    public String getHttp2RpcId() {
        return http2RpcId;
    }

    public void setHttp2RpcId(String http2RpcId) {
        this.http2RpcId = http2RpcId;
    }

    public DeleteHttp2RpcRequest withAccept(String accept) {
        this.accept = accept;
        return this;
    }

    /**
     * 该字段内容填为 \"application/json\"
     * @return accept
     */
    public String getAccept() {
        return accept;
    }

    public void setAccept(String accept) {
        this.accept = accept;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteHttp2RpcRequest that = (DeleteHttp2RpcRequest) obj;
        return Objects.equals(this.gatewayId, that.gatewayId) && Objects.equals(this.http2RpcId, that.http2RpcId)
            && Objects.equals(this.accept, that.accept);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gatewayId, http2RpcId, accept);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteHttp2RpcRequest {\n");
        sb.append("    gatewayId: ").append(toIndentedString(gatewayId)).append("\n");
        sb.append("    http2RpcId: ").append(toIndentedString(http2RpcId)).append("\n");
        sb.append("    accept: ").append(toIndentedString(accept)).append("\n");
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
