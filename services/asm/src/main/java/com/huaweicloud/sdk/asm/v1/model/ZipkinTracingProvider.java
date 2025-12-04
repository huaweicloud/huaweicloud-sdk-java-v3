package com.huaweicloud.sdk.asm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ZipkinTracingProvider
 */
public class ZipkinTracingProvider {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service")

    private String service;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    public ZipkinTracingProvider withService(String service) {
        this.service = service;
        return this;
    }

    /**
     * zipkin服务地址
     * @return service
     */
    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public ZipkinTracingProvider withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * zipkin服务端口
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ZipkinTracingProvider that = (ZipkinTracingProvider) obj;
        return Objects.equals(this.service, that.service) && Objects.equals(this.port, that.port);
    }

    @Override
    public int hashCode() {
        return Objects.hash(service, port);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ZipkinTracingProvider {\n");
        sb.append("    service: ").append(toIndentedString(service)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
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
