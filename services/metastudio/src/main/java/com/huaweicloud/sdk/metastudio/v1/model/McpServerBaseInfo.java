package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MCP服务端对接配置基础信息。
 */
public class McpServerBaseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mcp_server_id")

    private String mcpServerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    public McpServerBaseInfo withMcpServerId(String mcpServerId) {
        this.mcpServerId = mcpServerId;
        return this;
    }

    /**
     * MCP服务端对接配置ID。
     * @return mcpServerId
     */
    public String getMcpServerId() {
        return mcpServerId;
    }

    public void setMcpServerId(String mcpServerId) {
        this.mcpServerId = mcpServerId;
    }

    public McpServerBaseInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * MCP服务端对接配置名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        McpServerBaseInfo that = (McpServerBaseInfo) obj;
        return Objects.equals(this.mcpServerId, that.mcpServerId) && Objects.equals(this.name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mcpServerId, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class McpServerBaseInfo {\n");
        sb.append("    mcpServerId: ").append(toIndentedString(mcpServerId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
