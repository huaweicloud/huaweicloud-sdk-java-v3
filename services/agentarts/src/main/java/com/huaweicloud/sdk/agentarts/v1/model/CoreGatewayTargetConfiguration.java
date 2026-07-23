package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 目标服务配置，支持多种目标服务类型。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。 
 */
public class CoreGatewayTargetConfiguration {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mcp_server")

    private CoreGatewayMcpServerTargetConfiguration mcpServer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "openapi")

    private CoreGatewayOpenApiTargetConfiguration openapi;

    public CoreGatewayTargetConfiguration withMcpServer(CoreGatewayMcpServerTargetConfiguration mcpServer) {
        this.mcpServer = mcpServer;
        return this;
    }

    public CoreGatewayTargetConfiguration withMcpServer(
        Consumer<CoreGatewayMcpServerTargetConfiguration> mcpServerSetter) {
        if (this.mcpServer == null) {
            this.mcpServer = new CoreGatewayMcpServerTargetConfiguration();
            mcpServerSetter.accept(this.mcpServer);
        }

        return this;
    }

    /**
     * Get mcpServer
     * @return mcpServer
     */
    public CoreGatewayMcpServerTargetConfiguration getMcpServer() {
        return mcpServer;
    }

    public void setMcpServer(CoreGatewayMcpServerTargetConfiguration mcpServer) {
        this.mcpServer = mcpServer;
    }

    public CoreGatewayTargetConfiguration withOpenapi(CoreGatewayOpenApiTargetConfiguration openapi) {
        this.openapi = openapi;
        return this;
    }

    public CoreGatewayTargetConfiguration withOpenapi(Consumer<CoreGatewayOpenApiTargetConfiguration> openapiSetter) {
        if (this.openapi == null) {
            this.openapi = new CoreGatewayOpenApiTargetConfiguration();
            openapiSetter.accept(this.openapi);
        }

        return this;
    }

    /**
     * Get openapi
     * @return openapi
     */
    public CoreGatewayOpenApiTargetConfiguration getOpenapi() {
        return openapi;
    }

    public void setOpenapi(CoreGatewayOpenApiTargetConfiguration openapi) {
        this.openapi = openapi;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CoreGatewayTargetConfiguration that = (CoreGatewayTargetConfiguration) obj;
        return Objects.equals(this.mcpServer, that.mcpServer) && Objects.equals(this.openapi, that.openapi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mcpServer, openapi);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoreGatewayTargetConfiguration {\n");
        sb.append("    mcpServer: ").append(toIndentedString(mcpServer)).append("\n");
        sb.append("    openapi: ").append(toIndentedString(openapi)).append("\n");
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
