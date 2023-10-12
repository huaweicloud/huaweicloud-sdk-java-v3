package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * EsHealthmonitorsResource
 */
public class EsHealthmonitorsResource {

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

    private EsHealthIpgroupResource ipgroup;

    public EsHealthmonitorsResource withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 后端服务器ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EsHealthmonitorsResource withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 后端服务器的名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EsHealthmonitorsResource withProtocolPort(String protocolPort) {
        this.protocolPort = protocolPort;
        return this;
    }

    /**
     * 后端服务的前端监听端口。
     * @return protocolPort
     */
    public String getProtocolPort() {
        return protocolPort;
    }

    public void setProtocolPort(String protocolPort) {
        this.protocolPort = protocolPort;
    }

    public EsHealthmonitorsResource withIpgroup(EsHealthIpgroupResource ipgroup) {
        this.ipgroup = ipgroup;
        return this;
    }

    public EsHealthmonitorsResource withIpgroup(Consumer<EsHealthIpgroupResource> ipgroupSetter) {
        if (this.ipgroup == null) {
            this.ipgroup = new EsHealthIpgroupResource();
            ipgroupSetter.accept(this.ipgroup);
        }

        return this;
    }

    /**
     * Get ipgroup
     * @return ipgroup
     */
    public EsHealthIpgroupResource getIpgroup() {
        return ipgroup;
    }

    public void setIpgroup(EsHealthIpgroupResource ipgroup) {
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
        EsHealthmonitorsResource that = (EsHealthmonitorsResource) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.protocolPort, that.protocolPort) && Objects.equals(this.ipgroup, that.ipgroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, protocolPort, ipgroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EsHealthmonitorsResource {\n");
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
