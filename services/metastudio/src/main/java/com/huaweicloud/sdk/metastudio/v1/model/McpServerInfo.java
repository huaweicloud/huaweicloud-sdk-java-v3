package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * MCP服务端对接配置基本信息。
 */
public class McpServerInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mcp_server_id")

    private String mcpServerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mcp_server_url")

    private String mcpServerUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_header_name")

    private String authHeaderName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    public McpServerInfo withMcpServerId(String mcpServerId) {
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

    public McpServerInfo withName(String name) {
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

    public McpServerInfo withMcpServerUrl(String mcpServerUrl) {
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

    public McpServerInfo withAuthHeaderName(String authHeaderName) {
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

    public McpServerInfo withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间，格式遵循：RFC 3339 如\"2021-01-10T08:43:17Z\"。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public McpServerInfo withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间，格式遵循：RFC 3339 如\"2021-01-10T08:43:17Z\"。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        McpServerInfo that = (McpServerInfo) obj;
        return Objects.equals(this.mcpServerId, that.mcpServerId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.mcpServerUrl, that.mcpServerUrl)
            && Objects.equals(this.authHeaderName, that.authHeaderName)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mcpServerId, name, mcpServerUrl, authHeaderName, createTime, updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class McpServerInfo {\n");
        sb.append("    mcpServerId: ").append(toIndentedString(mcpServerId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    mcpServerUrl: ").append(toIndentedString(mcpServerUrl)).append("\n");
        sb.append("    authHeaderName: ").append(toIndentedString(authHeaderName)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
