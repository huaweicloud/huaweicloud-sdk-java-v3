package com.huaweicloud.sdk.roma.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** 监听器 */
public class Listener {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backend")

    private Backend backend;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_version")

    private Integer ipVersion;

    public Listener withName(String name) {
        this.name = name;
        return this;
    }

    /** 监听器名称
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Listener withPort(Integer port) {
        this.port = port;
        return this;
    }

    /** 监听器对外提供服务端口
     * 
     * @return port */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Listener withBackend(Backend backend) {
        this.backend = backend;
        return this;
    }

    public Listener withBackend(Consumer<Backend> backendSetter) {
        if (this.backend == null) {
            this.backend = new Backend();
            backendSetter.accept(this.backend);
        }

        return this;
    }

    /** Get backend
     * 
     * @return backend */
    public Backend getBackend() {
        return backend;
    }

    public void setBackend(Backend backend) {
        this.backend = backend;
    }

    public Listener withIpVersion(Integer ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }

    /** 创建负载均衡器的IP协议类型
     * 
     * @return ipVersion */
    public Integer getIpVersion() {
        return ipVersion;
    }

    public void setIpVersion(Integer ipVersion) {
        this.ipVersion = ipVersion;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Listener listener = (Listener) o;
        return Objects.equals(this.name, listener.name) && Objects.equals(this.port, listener.port)
            && Objects.equals(this.backend, listener.backend) && Objects.equals(this.ipVersion, listener.ipVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, port, backend, ipVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Listener {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    backend: ").append(toIndentedString(backend)).append("\n");
        sb.append("    ipVersion: ").append(toIndentedString(ipVersion)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
