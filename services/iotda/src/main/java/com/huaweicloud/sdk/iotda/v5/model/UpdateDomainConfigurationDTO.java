package com.huaweicloud.sdk.iotda.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 修改域配置请求体。
 */
public class UpdateDomainConfigurationDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_certificate_id")

    private String serverCertificateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_certificate_config")

    private ServerCertificateConfig serverCertificateConfig;

    public UpdateDomainConfigurationDTO withServerCertificateId(String serverCertificateId) {
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

    public UpdateDomainConfigurationDTO withServerCertificateConfig(ServerCertificateConfig serverCertificateConfig) {
        this.serverCertificateConfig = serverCertificateConfig;
        return this;
    }

    public UpdateDomainConfigurationDTO withServerCertificateConfig(
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
        UpdateDomainConfigurationDTO that = (UpdateDomainConfigurationDTO) obj;
        return Objects.equals(this.serverCertificateId, that.serverCertificateId)
            && Objects.equals(this.serverCertificateConfig, that.serverCertificateConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverCertificateId, serverCertificateConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDomainConfigurationDTO {\n");
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
