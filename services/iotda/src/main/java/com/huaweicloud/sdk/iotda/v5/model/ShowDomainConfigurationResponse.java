package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowDomainConfigurationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configuration_id")

    private String configurationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_protocol")

    private String accessProtocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_certificate_id")

    private String serverCertificateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_certificate_config")

    private ServerCertificateConfig serverCertificateConfig;

    public ShowDomainConfigurationResponse withConfigurationId(String configurationId) {
        this.configurationId = configurationId;
        return this;
    }

    /**
     * 域配置唯一标识ID
     * @return configurationId
     */
    public String getConfigurationId() {
        return configurationId;
    }

    public void setConfigurationId(String configurationId) {
        this.configurationId = configurationId;
    }

    public ShowDomainConfigurationResponse withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * **参数说明**：自定义域名
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public ShowDomainConfigurationResponse withAccessProtocol(String accessProtocol) {
        this.accessProtocol = accessProtocol;
        return this;
    }

    /**
     * **参数说明**：应用协议场景，当前仅支持Device-MQTTS：设备接入MQTTS场景
     * @return accessProtocol
     */
    public String getAccessProtocol() {
        return accessProtocol;
    }

    public void setAccessProtocol(String accessProtocol) {
        this.accessProtocol = accessProtocol;
    }

    public ShowDomainConfigurationResponse withServerCertificateId(String serverCertificateId) {
        this.serverCertificateId = serverCertificateId;
        return this;
    }

    /**
     * **参数说明**：自定义服务端证书ID
     * @return serverCertificateId
     */
    public String getServerCertificateId() {
        return serverCertificateId;
    }

    public void setServerCertificateId(String serverCertificateId) {
        this.serverCertificateId = serverCertificateId;
    }

    public ShowDomainConfigurationResponse withServerCertificateConfig(
        ServerCertificateConfig serverCertificateConfig) {
        this.serverCertificateConfig = serverCertificateConfig;
        return this;
    }

    public ShowDomainConfigurationResponse withServerCertificateConfig(
        Consumer<ServerCertificateConfig> serverCertificateConfigSetter) {
        if (this.serverCertificateConfig == null) {
            this.serverCertificateConfig = new ServerCertificateConfig();
            serverCertificateConfigSetter.accept(this.serverCertificateConfig);
        }

        return this;
    }

    /**
     * Get serverCertificateConfig
     * @return serverCertificateConfig
     */
    public ServerCertificateConfig getServerCertificateConfig() {
        return serverCertificateConfig;
    }

    public void setServerCertificateConfig(ServerCertificateConfig serverCertificateConfig) {
        this.serverCertificateConfig = serverCertificateConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDomainConfigurationResponse that = (ShowDomainConfigurationResponse) obj;
        return Objects.equals(this.configurationId, that.configurationId)
            && Objects.equals(this.domainName, that.domainName)
            && Objects.equals(this.accessProtocol, that.accessProtocol)
            && Objects.equals(this.serverCertificateId, that.serverCertificateId)
            && Objects.equals(this.serverCertificateConfig, that.serverCertificateConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(configurationId, domainName, accessProtocol, serverCertificateId, serverCertificateConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDomainConfigurationResponse {\n");
        sb.append("    configurationId: ").append(toIndentedString(configurationId)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    accessProtocol: ").append(toIndentedString(accessProtocol)).append("\n");
        sb.append("    serverCertificateId: ").append(toIndentedString(serverCertificateId)).append("\n");
        sb.append("    serverCertificateConfig: ").append(toIndentedString(serverCertificateConfig)).append("\n");
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
