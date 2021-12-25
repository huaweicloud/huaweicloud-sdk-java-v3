package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 服务需要暴露的端口列表 */
public class SvcPort {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_port")

    private String nodePort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private String port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private String protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_port")

    private String targetPort;

    public SvcPort withName(String name) {
        this.name = name;
        return this;
    }

    /** 服务端口必须进行命名，而且名称只允许是{protocol}-{suffix}这种格式，其中{protocol}可以是tcp、http等，IEF根据在端口上定义的协议来提供对应的路由能力。例如“name:http-0”和“name:tcp-0”是合法的端口名，“name:http2forecast”是非法的端口号。
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SvcPort withNodePort(String nodePort) {
        this.nodePort = nodePort;
        return this;
    }

    /** 当spec.type=NodePort时，指定映射到物理机的端口号
     * 
     * @return nodePort */
    public String getNodePort() {
        return nodePort;
    }

    public void setNodePort(String nodePort) {
        this.nodePort = nodePort;
    }

    public SvcPort withPort(String port) {
        this.port = port;
        return this;
    }

    /** 服务监听的端口号
     * 
     * @return port */
    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public SvcPort withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /** 具体的协议，比如TCP
     * 
     * @return protocol */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public SvcPort withTargetPort(String targetPort) {
        this.targetPort = targetPort;
        return this;
    }

    /** 需要转发到后端Pod的端口号
     * 
     * @return targetPort */
    public String getTargetPort() {
        return targetPort;
    }

    public void setTargetPort(String targetPort) {
        this.targetPort = targetPort;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SvcPort svcPort = (SvcPort) o;
        return Objects.equals(this.name, svcPort.name) && Objects.equals(this.nodePort, svcPort.nodePort)
            && Objects.equals(this.port, svcPort.port) && Objects.equals(this.protocol, svcPort.protocol)
            && Objects.equals(this.targetPort, svcPort.targetPort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, nodePort, port, protocol, targetPort);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SvcPort {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nodePort: ").append(toIndentedString(nodePort)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    targetPort: ").append(toIndentedString(targetPort)).append("\n");
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
