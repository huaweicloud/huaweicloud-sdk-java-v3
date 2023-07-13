package com.huaweicloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class NeutronListPortsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ports")

    private List<NeutronPort> ports = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ports_links")

    private List<NeutronPageLink> portsLinks = null;

    public NeutronListPortsResponse withPorts(List<NeutronPort> ports) {
        this.ports = ports;
        return this;
    }

    public NeutronListPortsResponse addPortsItem(NeutronPort portsItem) {
        if (this.ports == null) {
            this.ports = new ArrayList<>();
        }
        this.ports.add(portsItem);
        return this;
    }

    public NeutronListPortsResponse withPorts(Consumer<List<NeutronPort>> portsSetter) {
        if (this.ports == null) {
            this.ports = new ArrayList<>();
        }
        portsSetter.accept(this.ports);
        return this;
    }

    /**
     * port对象列表
     * @return ports
     */
    public List<NeutronPort> getPorts() {
        return ports;
    }

    public void setPorts(List<NeutronPort> ports) {
        this.ports = ports;
    }

    public NeutronListPortsResponse withPortsLinks(List<NeutronPageLink> portsLinks) {
        this.portsLinks = portsLinks;
        return this;
    }

    public NeutronListPortsResponse addPortsLinksItem(NeutronPageLink portsLinksItem) {
        if (this.portsLinks == null) {
            this.portsLinks = new ArrayList<>();
        }
        this.portsLinks.add(portsLinksItem);
        return this;
    }

    public NeutronListPortsResponse withPortsLinks(Consumer<List<NeutronPageLink>> portsLinksSetter) {
        if (this.portsLinks == null) {
            this.portsLinks = new ArrayList<>();
        }
        portsLinksSetter.accept(this.portsLinks);
        return this;
    }

    /**
     * 分页信息
     * @return portsLinks
     */
    public List<NeutronPageLink> getPortsLinks() {
        return portsLinks;
    }

    public void setPortsLinks(List<NeutronPageLink> portsLinks) {
        this.portsLinks = portsLinks;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NeutronListPortsResponse that = (NeutronListPortsResponse) obj;
        return Objects.equals(this.ports, that.ports) && Objects.equals(this.portsLinks, that.portsLinks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ports, portsLinks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NeutronListPortsResponse {\n");
        sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
        sb.append("    portsLinks: ").append(toIndentedString(portsLinks)).append("\n");
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
