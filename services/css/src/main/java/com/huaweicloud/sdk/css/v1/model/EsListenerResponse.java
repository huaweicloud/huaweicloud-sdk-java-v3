package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * EsListenerResponse
 */
public class EsListenerResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private String protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol_port")

    private String protocolPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipgroup")

    private EsIpgroupResource ipgroup;

    public EsListenerResponse withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 监听器的监听协议。
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public EsListenerResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 监听器ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EsListenerResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 监听器的名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EsListenerResponse withProtocolPort(String protocolPort) {
        this.protocolPort = protocolPort;
        return this;
    }

    /**
     * 监听器的前端监听端口。
     * @return protocolPort
     */
    public String getProtocolPort() {
        return protocolPort;
    }

    public void setProtocolPort(String protocolPort) {
        this.protocolPort = protocolPort;
    }

    public EsListenerResponse withIpgroup(EsIpgroupResource ipgroup) {
        this.ipgroup = ipgroup;
        return this;
    }

    public EsListenerResponse withIpgroup(Consumer<EsIpgroupResource> ipgroupSetter) {
        if (this.ipgroup == null) {
            this.ipgroup = new EsIpgroupResource();
            ipgroupSetter.accept(this.ipgroup);
        }

        return this;
    }

    /**
     * Get ipgroup
     * @return ipgroup
     */
    public EsIpgroupResource getIpgroup() {
        return ipgroup;
    }

    public void setIpgroup(EsIpgroupResource ipgroup) {
        this.ipgroup = ipgroup;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EsListenerResponse that = (EsListenerResponse) obj;
        return Objects.equals(this.protocol, that.protocol) && Objects.equals(this.id, that.id)
            && Objects.equals(this.name, that.name) && Objects.equals(this.protocolPort, that.protocolPort)
            && Objects.equals(this.ipgroup, that.ipgroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(protocol, id, name, protocolPort, ipgroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EsListenerResponse {\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    protocolPort: ").append(toIndentedString(protocolPort)).append("\n");
        sb.append("    ipgroup: ").append(toIndentedString(ipgroup)).append("\n");
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
