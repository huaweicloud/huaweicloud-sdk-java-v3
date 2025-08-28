package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建MCP服务端对接配置请求。
 */
public class CreateMcpServerReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mcp_server_url")

    private String mcpServerUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_header_name")

    private String authHeaderName;

    public CreateMcpServerReq withName(String name) {
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

    public CreateMcpServerReq withMcpServerUrl(String mcpServerUrl) {
        this.mcpServerUrl = mcpServerUrl;
        return this;
    }

    /**
     * MCP服务端地址。
     * @return mcpServerUrl
     */
    public String getMcpServerUrl() {
        return mcpServerUrl;
    }

    public void setMcpServerUrl(String mcpServerUrl) {
        this.mcpServerUrl = mcpServerUrl;
    }

    public CreateMcpServerReq withAuthHeaderName(String authHeaderName) {
        this.authHeaderName = authHeaderName;
        return this;
    }

    /**
     * 鉴权头域名称。
     * @return authHeaderName
     */
    public String getAuthHeaderName() {
        return authHeaderName;
    }

    public void setAuthHeaderName(String authHeaderName) {
        this.authHeaderName = authHeaderName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateMcpServerReq that = (CreateMcpServerReq) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.mcpServerUrl, that.mcpServerUrl)
            && Objects.equals(this.authHeaderName, that.authHeaderName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, mcpServerUrl, authHeaderName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateMcpServerReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    mcpServerUrl: ").append(toIndentedString(mcpServerUrl)).append("\n");
        sb.append("    authHeaderName: ").append(toIndentedString(authHeaderName)).append("\n");
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
