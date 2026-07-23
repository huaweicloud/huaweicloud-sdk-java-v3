package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 网关协议的自定义设置。
 */
public class CoreGatewayProtocolConfiguration {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mcp")

    private CoreGatewayMcpProtocolConfiguration mcp;

    public CoreGatewayProtocolConfiguration withMcp(CoreGatewayMcpProtocolConfiguration mcp) {
        this.mcp = mcp;
        return this;
    }

    public CoreGatewayProtocolConfiguration withMcp(Consumer<CoreGatewayMcpProtocolConfiguration> mcpSetter) {
        if (this.mcp == null) {
            this.mcp = new CoreGatewayMcpProtocolConfiguration();
            mcpSetter.accept(this.mcp);
        }

        return this;
    }

    /**
     * Get mcp
     * @return mcp
     */
    public CoreGatewayMcpProtocolConfiguration getMcp() {
        return mcp;
    }

    public void setMcp(CoreGatewayMcpProtocolConfiguration mcp) {
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
        CoreGatewayProtocolConfiguration that = (CoreGatewayProtocolConfiguration) obj;
        return Objects.equals(this.mcp, that.mcp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mcp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoreGatewayProtocolConfiguration {\n");
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
