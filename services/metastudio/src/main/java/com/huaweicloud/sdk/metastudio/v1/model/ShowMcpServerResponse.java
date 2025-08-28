package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowMcpServerResponse extends SdkResponse {

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public ShowMcpServerResponse withMcpServerId(String mcpServerId) {
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

    public ShowMcpServerResponse withName(String name) {
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

    public ShowMcpServerResponse withMcpServerUrl(String mcpServerUrl) {
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

    public ShowMcpServerResponse withAuthHeaderName(String authHeaderName) {
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

    public ShowMcpServerResponse withCreateTime(String createTime) {
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

    public ShowMcpServerResponse withUpdateTime(String updateTime) {
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

    public ShowMcpServerResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowMcpServerResponse that = (ShowMcpServerResponse) obj;
        return Objects.equals(this.mcpServerId, that.mcpServerId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.mcpServerUrl, that.mcpServerUrl)
            && Objects.equals(this.authHeaderName, that.authHeaderName)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mcpServerId, name, mcpServerUrl, authHeaderName, createTime, updateTime, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMcpServerResponse {\n");
        sb.append("    mcpServerId: ").append(toIndentedString(mcpServerId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    mcpServerUrl: ").append(toIndentedString(mcpServerUrl)).append("\n");
        sb.append("    authHeaderName: ").append(toIndentedString(authHeaderName)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
