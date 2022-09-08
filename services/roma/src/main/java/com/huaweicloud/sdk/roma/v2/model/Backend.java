package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 后端服务定义
 */
public class Backend {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip")

    private List<String> ip = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "health_check")

    private HealthCheck healthCheck;

    public Backend withIp(List<String> ip) {
        this.ip = ip;
        return this;
    }

    public Backend addIpItem(String ipItem) {
        if (this.ip == null) {
            this.ip = new ArrayList<>();
        }
        this.ip.add(ipItem);
        return this;
    }

    public Backend withIp(Consumer<List<String>> ipSetter) {
        if (this.ip == null) {
            this.ip = new ArrayList<>();
        }
        ipSetter.accept(this.ip);
        return this;
    }

    /**
     * 后端主机地址列表
     * @return ip
     */
    public List<String> getIp() {
        return ip;
    }

    public void setIp(List<String> ip) {
        this.ip = ip;
    }

    public Backend withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * 后端服务端口，不存在时使用监听器端口
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Backend withHealthCheck(HealthCheck healthCheck) {
        this.healthCheck = healthCheck;
        return this;
    }

    public Backend withHealthCheck(Consumer<HealthCheck> healthCheckSetter) {
        if (this.healthCheck == null) {
            this.healthCheck = new HealthCheck();
            healthCheckSetter.accept(this.healthCheck);
        }

        return this;
    }

    /**
     * Get healthCheck
     * @return healthCheck
     */
    public HealthCheck getHealthCheck() {
        return healthCheck;
    }

    public void setHealthCheck(HealthCheck healthCheck) {
        this.healthCheck = healthCheck;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Backend backend = (Backend) o;
        return Objects.equals(this.ip, backend.ip) && Objects.equals(this.port, backend.port)
            && Objects.equals(this.healthCheck, backend.healthCheck);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ip, port, healthCheck);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Backend {\n");
        sb.append("    ip: ").append(toIndentedString(ip)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    healthCheck: ").append(toIndentedString(healthCheck)).append("\n");
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
