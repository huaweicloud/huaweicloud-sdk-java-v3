package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Service关联端口列表对象
 */
public class KubernetesServicePortInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_id")

    private String serviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private String protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private Integer port;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_port")

    private String targetPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_port")

    private Integer nodePort;

    public KubernetesServicePortInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public KubernetesServicePortInfo withServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /**
     * 关联服务 ID
     * @return serviceId
     */
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public KubernetesServicePortInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 端口名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public KubernetesServicePortInfo withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 服务协议
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public KubernetesServicePortInfo withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * 端口号
     * minimum: 0
     * maximum: 256
     * @return port
     */
    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public KubernetesServicePortInfo withTargetPort(String targetPort) {
        this.targetPort = targetPort;
        return this;
    }

    /**
     * 后端容器端口
     * @return targetPort
     */
    public String getTargetPort() {
        return targetPort;
    }

    public void setTargetPort(String targetPort) {
        this.targetPort = targetPort;
    }

    public KubernetesServicePortInfo withNodePort(Integer nodePort) {
        this.nodePort = nodePort;
        return this;
    }

    /**
     * 节点端口
     * minimum: 0
     * maximum: 256
     * @return nodePort
     */
    public Integer getNodePort() {
        return nodePort;
    }

    public void setNodePort(Integer nodePort) {
        this.nodePort = nodePort;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        KubernetesServicePortInfo that = (KubernetesServicePortInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.serviceId, that.serviceId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.protocol, that.protocol)
            && Objects.equals(this.port, that.port) && Objects.equals(this.targetPort, that.targetPort)
            && Objects.equals(this.nodePort, that.nodePort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, serviceId, name, protocol, port, targetPort, nodePort);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KubernetesServicePortInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    targetPort: ").append(toIndentedString(targetPort)).append("\n");
        sb.append("    nodePort: ").append(toIndentedString(nodePort)).append("\n");
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
