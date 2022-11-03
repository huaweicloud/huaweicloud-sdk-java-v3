package com.huaweicloud.sdk.ga.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 更新健康检查的详细信息。
 */
public class UpdateHealthCheckOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private HealthCheckProtocol protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interval")

    private Integer interval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeout")

    private Integer timeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_retries")

    private Integer maxRetries;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    public UpdateHealthCheckOption withProtocol(HealthCheckProtocol protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * Get protocol
     * @return protocol
     */
    public HealthCheckProtocol getProtocol() {
        return protocol;
    }

    public void setProtocol(HealthCheckProtocol protocol) {
        this.protocol = protocol;
    }

    public UpdateHealthCheckOption withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * 健康检查的端口。
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

    public UpdateHealthCheckOption withInterval(Integer interval) {
        this.interval = interval;
        return this;
    }

    /**
     * 健康检查的时间间隔，单位为秒。
     * minimum: 1
     * maximum: 60
     * @return interval
     */
    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    public UpdateHealthCheckOption withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * 健康检查的超时时间，单位为秒。建议该值小于interval的值。
     * minimum: 1
     * maximum: 60
     * @return timeout
     */
    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public UpdateHealthCheckOption withMaxRetries(Integer maxRetries) {
        this.maxRetries = maxRetries;
        return this;
    }

    /**
     * 最大重试次数。将终端节点的状态从“健康”设置为“不健康”或从“不健康”设置为“健康”所需的连续健康检查次数。
     * minimum: 1
     * maximum: 10
     * @return maxRetries
     */
    public Integer getMaxRetries() {
        return maxRetries;
    }

    public void setMaxRetries(Integer maxRetries) {
        this.maxRetries = maxRetries;
    }

    public UpdateHealthCheckOption withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 是否开启健康检查。
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateHealthCheckOption updateHealthCheckOption = (UpdateHealthCheckOption) o;
        return Objects.equals(this.protocol, updateHealthCheckOption.protocol)
            && Objects.equals(this.port, updateHealthCheckOption.port)
            && Objects.equals(this.interval, updateHealthCheckOption.interval)
            && Objects.equals(this.timeout, updateHealthCheckOption.timeout)
            && Objects.equals(this.maxRetries, updateHealthCheckOption.maxRetries)
            && Objects.equals(this.enabled, updateHealthCheckOption.enabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(protocol, port, interval, timeout, maxRetries, enabled);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateHealthCheckOption {\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
        sb.append("    maxRetries: ").append(toIndentedString(maxRetries)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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
