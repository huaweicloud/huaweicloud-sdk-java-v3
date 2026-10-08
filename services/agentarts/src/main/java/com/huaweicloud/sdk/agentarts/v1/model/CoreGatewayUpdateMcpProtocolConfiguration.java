package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * MCP网关配置（更新）。
 */
public class CoreGatewayUpdateMcpProtocolConfiguration {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "search_configuration")

    private CoreGatewaySearchConfiguration searchConfiguration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "session_configuration")

    private CoreGatewaySessionConfiguration sessionConfiguration;

    public CoreGatewayUpdateMcpProtocolConfiguration withSearchConfiguration(
        CoreGatewaySearchConfiguration searchConfiguration) {
        this.searchConfiguration = searchConfiguration;
        return this;
    }

    public CoreGatewayUpdateMcpProtocolConfiguration withSearchConfiguration(
        Consumer<CoreGatewaySearchConfiguration> searchConfigurationSetter) {
        if (this.searchConfiguration == null) {
            this.searchConfiguration = new CoreGatewaySearchConfiguration();
            searchConfigurationSetter.accept(this.searchConfiguration);
        }

        return this;
    }

    /**
     * Get searchConfiguration
     * @return searchConfiguration
     */
    public CoreGatewaySearchConfiguration getSearchConfiguration() {
        return searchConfiguration;
    }

    public void setSearchConfiguration(CoreGatewaySearchConfiguration searchConfiguration) {
        this.searchConfiguration = searchConfiguration;
    }

    public CoreGatewayUpdateMcpProtocolConfiguration withSessionConfiguration(
        CoreGatewaySessionConfiguration sessionConfiguration) {
        this.sessionConfiguration = sessionConfiguration;
        return this;
    }

    public CoreGatewayUpdateMcpProtocolConfiguration withSessionConfiguration(
        Consumer<CoreGatewaySessionConfiguration> sessionConfigurationSetter) {
        if (this.sessionConfiguration == null) {
            this.sessionConfiguration = new CoreGatewaySessionConfiguration();
            sessionConfigurationSetter.accept(this.sessionConfiguration);
        }

        return this;
    }

    /**
     * Get sessionConfiguration
     * @return sessionConfiguration
     */
    public CoreGatewaySessionConfiguration getSessionConfiguration() {
        return sessionConfiguration;
    }

    public void setSessionConfiguration(CoreGatewaySessionConfiguration sessionConfiguration) {
        this.sessionConfiguration = sessionConfiguration;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CoreGatewayUpdateMcpProtocolConfiguration that = (CoreGatewayUpdateMcpProtocolConfiguration) obj;
        return Objects.equals(this.searchConfiguration, that.searchConfiguration)
            && Objects.equals(this.sessionConfiguration, that.sessionConfiguration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(searchConfiguration, sessionConfiguration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoreGatewayUpdateMcpProtocolConfiguration {\n");
        sb.append("    searchConfiguration: ").append(toIndentedString(searchConfiguration)).append("\n");
        sb.append("    sessionConfiguration: ").append(toIndentedString(sessionConfiguration)).append("\n");
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
