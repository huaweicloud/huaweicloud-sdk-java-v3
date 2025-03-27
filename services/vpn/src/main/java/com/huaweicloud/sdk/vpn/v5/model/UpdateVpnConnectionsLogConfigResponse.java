package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateVpnConnectionsLogConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_config")

    private ConnectionsLogConfig logConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "header-response-token")

    private String headerResponseToken;

    public UpdateVpnConnectionsLogConfigResponse withLogConfig(ConnectionsLogConfig logConfig) {
        this.logConfig = logConfig;
        return this;
    }

    public UpdateVpnConnectionsLogConfigResponse withLogConfig(Consumer<ConnectionsLogConfig> logConfigSetter) {
        if (this.logConfig == null) {
            this.logConfig = new ConnectionsLogConfig();
            logConfigSetter.accept(this.logConfig);
        }

        return this;
    }

    /**
     * Get logConfig
     * @return logConfig
     */
    public ConnectionsLogConfig getLogConfig() {
        return logConfig;
    }

    public void setLogConfig(ConnectionsLogConfig logConfig) {
        this.logConfig = logConfig;
    }

    public UpdateVpnConnectionsLogConfigResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求id
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public UpdateVpnConnectionsLogConfigResponse withHeaderResponseToken(String headerResponseToken) {
        this.headerResponseToken = headerResponseToken;
        return this;
    }

    /**
     * Get headerResponseToken
     * @return headerResponseToken
     */
    public String getHeaderResponseToken() {
        return headerResponseToken;
    }

    public void setHeaderResponseToken(String headerResponseToken) {
        this.headerResponseToken = headerResponseToken;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateVpnConnectionsLogConfigResponse that = (UpdateVpnConnectionsLogConfigResponse) obj;
        return Objects.equals(this.logConfig, that.logConfig) && Objects.equals(this.requestId, that.requestId)
            && Objects.equals(this.headerResponseToken, that.headerResponseToken);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logConfig, requestId, headerResponseToken);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateVpnConnectionsLogConfigResponse {\n");
        sb.append("    logConfig: ").append(toIndentedString(logConfig)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    headerResponseToken: ").append(toIndentedString(headerResponseToken)).append("\n");
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
