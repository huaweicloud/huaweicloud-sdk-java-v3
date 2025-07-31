package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 端点关联端口列表对象
 */
public class KubernetesEndpointPortInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_id")

    private String endpointId;

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
    @JsonProperty(value = "app_protocol")

    private String appProtocol;

    public KubernetesEndpointPortInfo withId(String id) {
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

    public KubernetesEndpointPortInfo withEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }

    /**
     * 关联端点 ID
     * @return endpointId
     */
    public String getEndpointId() {
        return endpointId;
    }

    public void setEndpointId(String endpointId) {
        this.endpointId = endpointId;
    }

    public KubernetesEndpointPortInfo withName(String name) {
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

    public KubernetesEndpointPortInfo withProtocol(String protocol) {
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

    public KubernetesEndpointPortInfo withPort(Integer port) {
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

    public KubernetesEndpointPortInfo withAppProtocol(String appProtocol) {
        this.appProtocol = appProtocol;
        return this;
    }

    /**
     * 应用协议
     * @return appProtocol
     */
    public String getAppProtocol() {
        return appProtocol;
    }

    public void setAppProtocol(String appProtocol) {
        this.appProtocol = appProtocol;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        KubernetesEndpointPortInfo that = (KubernetesEndpointPortInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.endpointId, that.endpointId)
            && Objects.equals(this.name, that.name) && Objects.equals(this.protocol, that.protocol)
            && Objects.equals(this.port, that.port) && Objects.equals(this.appProtocol, that.appProtocol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, endpointId, name, protocol, port, appProtocol);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KubernetesEndpointPortInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    endpointId: ").append(toIndentedString(endpointId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    appProtocol: ").append(toIndentedString(appProtocol)).append("\n");
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
