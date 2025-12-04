package com.huaweicloud.sdk.asm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 网格配置
 */
public class MeshConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxyConfig")

    private ProxyConfig proxyConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "telemetryConfig")

    private TelemetryConfig telemetryConfig;

    public MeshConfig withProxyConfig(ProxyConfig proxyConfig) {
        this.proxyConfig = proxyConfig;
        return this;
    }

    public MeshConfig withProxyConfig(Consumer<ProxyConfig> proxyConfigSetter) {
        if (this.proxyConfig == null) {
            this.proxyConfig = new ProxyConfig();
            proxyConfigSetter.accept(this.proxyConfig);
        }

        return this;
    }

    /**
     * Get proxyConfig
     * @return proxyConfig
     */
    public ProxyConfig getProxyConfig() {
        return proxyConfig;
    }

    public void setProxyConfig(ProxyConfig proxyConfig) {
        this.proxyConfig = proxyConfig;
    }

    public MeshConfig withTelemetryConfig(TelemetryConfig telemetryConfig) {
        this.telemetryConfig = telemetryConfig;
        return this;
    }

    public MeshConfig withTelemetryConfig(Consumer<TelemetryConfig> telemetryConfigSetter) {
        if (this.telemetryConfig == null) {
            this.telemetryConfig = new TelemetryConfig();
            telemetryConfigSetter.accept(this.telemetryConfig);
        }

        return this;
    }

    /**
     * Get telemetryConfig
     * @return telemetryConfig
     */
    public TelemetryConfig getTelemetryConfig() {
        return telemetryConfig;
    }

    public void setTelemetryConfig(TelemetryConfig telemetryConfig) {
        this.telemetryConfig = telemetryConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MeshConfig that = (MeshConfig) obj;
        return Objects.equals(this.proxyConfig, that.proxyConfig)
            && Objects.equals(this.telemetryConfig, that.telemetryConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(proxyConfig, telemetryConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MeshConfig {\n");
        sb.append("    proxyConfig: ").append(toIndentedString(proxyConfig)).append("\n");
        sb.append("    telemetryConfig: ").append(toIndentedString(telemetryConfig)).append("\n");
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
