package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * PreUpgradeProbeDTO
 */
public class PreUpgradeProbeDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interval")

    private Integer interval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private String protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeout_config")

    private UpgradeProbeTimeoutConfigDTO timeoutConfig;

    public PreUpgradeProbeDTO withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * 端口
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

    public PreUpgradeProbeDTO withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * 请求路径
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public PreUpgradeProbeDTO withInterval(Integer interval) {
        this.interval = interval;
        return this;
    }

    /**
     * 轮询间隔
     * minimum: 1
     * maximum: 300
     * @return interval
     */
    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    public PreUpgradeProbeDTO withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 协议类型
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public PreUpgradeProbeDTO withTimeoutConfig(UpgradeProbeTimeoutConfigDTO timeoutConfig) {
        this.timeoutConfig = timeoutConfig;
        return this;
    }

    public PreUpgradeProbeDTO withTimeoutConfig(Consumer<UpgradeProbeTimeoutConfigDTO> timeoutConfigSetter) {
        if (this.timeoutConfig == null) {
            this.timeoutConfig = new UpgradeProbeTimeoutConfigDTO();
            timeoutConfigSetter.accept(this.timeoutConfig);
        }

        return this;
    }

    /**
     * Get timeoutConfig
     * @return timeoutConfig
     */
    public UpgradeProbeTimeoutConfigDTO getTimeoutConfig() {
        return timeoutConfig;
    }

    public void setTimeoutConfig(UpgradeProbeTimeoutConfigDTO timeoutConfig) {
        this.timeoutConfig = timeoutConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PreUpgradeProbeDTO that = (PreUpgradeProbeDTO) obj;
        return Objects.equals(this.port, that.port) && Objects.equals(this.path, that.path)
            && Objects.equals(this.interval, that.interval) && Objects.equals(this.protocol, that.protocol)
            && Objects.equals(this.timeoutConfig, that.timeoutConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(port, path, interval, protocol, timeoutConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PreUpgradeProbeDTO {\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    timeoutConfig: ").append(toIndentedString(timeoutConfig)).append("\n");
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
