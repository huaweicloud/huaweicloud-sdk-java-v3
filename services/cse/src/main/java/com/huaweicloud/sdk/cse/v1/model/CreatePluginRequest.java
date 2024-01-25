package com.huaweicloud.sdk.cse.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class CreatePluginRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gateway_id")

    private String gatewayId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Accept")

    private String accept;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private WasmPlugin body;

    public CreatePluginRequest withGatewayId(String gatewayId) {
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

    public CreatePluginRequest withAccept(String accept) {
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

    public CreatePluginRequest withBody(WasmPlugin body) {
        this.body = body;
        return this;
    }

    public CreatePluginRequest withBody(Consumer<WasmPlugin> bodySetter) {
        if (this.body == null) {
            this.body = new WasmPlugin();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public WasmPlugin getBody() {
        return body;
    }

    public void setBody(WasmPlugin body) {
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
        CreatePluginRequest that = (CreatePluginRequest) obj;
        return Objects.equals(this.gatewayId, that.gatewayId) && Objects.equals(this.accept, that.accept)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gatewayId, accept, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePluginRequest {\n");
        sb.append("    gatewayId: ").append(toIndentedString(gatewayId)).append("\n");
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
