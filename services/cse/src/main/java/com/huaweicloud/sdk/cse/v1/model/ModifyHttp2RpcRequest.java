package com.huaweicloud.sdk.cse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ModifyHttp2RpcRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gateway_id")

    private String gatewayId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "http2Rpc_id")

    private String http2RpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Accept")

    private String accept;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private Http2Rpc body;

    public ModifyHttp2RpcRequest withGatewayId(String gatewayId) {
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

    public ModifyHttp2RpcRequest withHttp2RpcId(String http2RpcId) {
        this.http2RpcId = http2RpcId;
        return this;
    }

    /**
     * http2Rpc id
     * @return http2RpcId
     */
    public String getHttp2RpcId() {
        return http2RpcId;
    }

    public void setHttp2RpcId(String http2RpcId) {
        this.http2RpcId = http2RpcId;
    }

    public ModifyHttp2RpcRequest withAccept(String accept) {
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

    public ModifyHttp2RpcRequest withBody(Http2Rpc body) {
        this.body = body;
        return this;
    }

    public ModifyHttp2RpcRequest withBody(Consumer<Http2Rpc> bodySetter) {
        if (this.body == null) {
            this.body = new Http2Rpc();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public Http2Rpc getBody() {
        return body;
    }

    public void setBody(Http2Rpc body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModifyHttp2RpcRequest that = (ModifyHttp2RpcRequest) obj;
        return Objects.equals(this.gatewayId, that.gatewayId) && Objects.equals(this.http2RpcId, that.http2RpcId)
            && Objects.equals(this.accept, that.accept) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gatewayId, http2RpcId, accept, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyHttp2RpcRequest {\n");
        sb.append("    gatewayId: ").append(toIndentedString(gatewayId)).append("\n");
        sb.append("    http2RpcId: ").append(toIndentedString(http2RpcId)).append("\n");
        sb.append("    accept: ").append(toIndentedString(accept)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
