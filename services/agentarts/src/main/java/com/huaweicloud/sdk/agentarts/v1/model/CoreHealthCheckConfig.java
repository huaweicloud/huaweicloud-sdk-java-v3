package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**: 运行时自定义预热和健康检查配置。
 */
public class CoreHealthCheckConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "warm_up_probe")

    private CoreRunWarmUpProbeConfig warmUpProbe;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "liveness_probe")

    private CoreRunLivenessProbeConfig livenessProbe;

    public CoreHealthCheckConfig withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * **参数解释**: 是否开启自定义的预热和健康检查配置。
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public CoreHealthCheckConfig withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * **参数解释**: 健康检查探测的端口号。 
     * minimum: 1
     * maximum: 65535
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public CoreHealthCheckConfig withWarmUpProbe(CoreRunWarmUpProbeConfig warmUpProbe) {
        this.warmUpProbe = warmUpProbe;
        return this;
    }

    public CoreHealthCheckConfig withWarmUpProbe(Consumer<CoreRunWarmUpProbeConfig> warmUpProbeSetter) {
        if (this.warmUpProbe == null) {
            this.warmUpProbe = new CoreRunWarmUpProbeConfig();
            warmUpProbeSetter.accept(this.warmUpProbe);
        }

        return this;
    }

    /**
     * Get warmUpProbe
     * @return warmUpProbe
     */
    public CoreRunWarmUpProbeConfig getWarmUpProbe() {
        return warmUpProbe;
    }

    public void setWarmUpProbe(CoreRunWarmUpProbeConfig warmUpProbe) {
        this.warmUpProbe = warmUpProbe;
    }

    public CoreHealthCheckConfig withLivenessProbe(CoreRunLivenessProbeConfig livenessProbe) {
        this.livenessProbe = livenessProbe;
        return this;
    }

    public CoreHealthCheckConfig withLivenessProbe(Consumer<CoreRunLivenessProbeConfig> livenessProbeSetter) {
        if (this.livenessProbe == null) {
            this.livenessProbe = new CoreRunLivenessProbeConfig();
            livenessProbeSetter.accept(this.livenessProbe);
        }

        return this;
    }

    /**
     * Get livenessProbe
     * @return livenessProbe
     */
    public CoreRunLivenessProbeConfig getLivenessProbe() {
        return livenessProbe;
    }

    public void setLivenessProbe(CoreRunLivenessProbeConfig livenessProbe) {
        this.livenessProbe = livenessProbe;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CoreHealthCheckConfig that = (CoreHealthCheckConfig) obj;
        return Objects.equals(this.enabled, that.enabled) && Objects.equals(this.port, that.port)
            && Objects.equals(this.warmUpProbe, that.warmUpProbe)
            && Objects.equals(this.livenessProbe, that.livenessProbe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabled, port, warmUpProbe, livenessProbe);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoreHealthCheckConfig {\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    warmUpProbe: ").append(toIndentedString(warmUpProbe)).append("\n");
        sb.append("    livenessProbe: ").append(toIndentedString(livenessProbe)).append("\n");
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
