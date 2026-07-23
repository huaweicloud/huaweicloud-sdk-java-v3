package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 网关协议的自定义设置（更新）。
 */
public class CoreGatewayUpdateProtocolConfiguration {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mcp")

    private CoreGatewayUpdateMcpProtocolConfiguration mcp;

    public CoreGatewayUpdateProtocolConfiguration withMcp(CoreGatewayUpdateMcpProtocolConfiguration mcp) {
        this.mcp = mcp;
        return this;
    }

    public CoreGatewayUpdateProtocolConfiguration withMcp(
        Consumer<CoreGatewayUpdateMcpProtocolConfiguration> mcpSetter) {
        if (this.mcp == null) {
            this.mcp = new CoreGatewayUpdateMcpProtocolConfiguration();
            mcpSetter.accept(this.mcp);
        }

        return this;
    }

    /**
     * Get mcp
     * @return mcp
     */
    public CoreGatewayUpdateMcpProtocolConfiguration getMcp() {
        return mcp;
    }

    public void setMcp(CoreGatewayUpdateMcpProtocolConfiguration mcp) {
        this.mcp = mcp;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CoreGatewayUpdateProtocolConfiguration that = (CoreGatewayUpdateProtocolConfiguration) obj;
        return Objects.equals(this.mcp, that.mcp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mcp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoreGatewayUpdateProtocolConfiguration {\n");
        sb.append("    mcp: ").append(toIndentedString(mcp)).append("\n");
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
