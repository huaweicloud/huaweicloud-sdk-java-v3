package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class NovaAttachInterfaceOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fixed_ips")

    private List<NovaAttachInterfaceFixedIp> fixedIps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "net_id")

    private String netId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_id")

    private String portId;

    public NovaAttachInterfaceOption withFixedIps(List<NovaAttachInterfaceFixedIp> fixedIps) {
        this.fixedIps = fixedIps;
        return this;
    }

    public NovaAttachInterfaceOption addFixedIpsItem(NovaAttachInterfaceFixedIp fixedIpsItem) {
        if (this.fixedIps == null) {
            this.fixedIps = new ArrayList<>();
        }
        this.fixedIps.add(fixedIpsItem);
        return this;
    }

    public NovaAttachInterfaceOption withFixedIps(Consumer<List<NovaAttachInterfaceFixedIp>> fixedIpsSetter) {
        if (this.fixedIps == null) {
            this.fixedIps = new ArrayList<>();
        }
        fixedIpsSetter.accept(this.fixedIps);
        return this;
    }

    /**
     * 私有IP。  有port_id时，该参数不起作用，并且有该参数时，必须有net_id。  只有列表中第一个元素有效。传入两个及以上元素会报错。
     * @return fixedIps
     */
    public List<NovaAttachInterfaceFixedIp> getFixedIps() {
        return fixedIps;
    }

    public void setFixedIps(List<NovaAttachInterfaceFixedIp> fixedIps) {
        this.fixedIps = fixedIps;
    }

    public NovaAttachInterfaceOption withNetId(String netId) {
        this.netId = netId;
        return this;
    }

    /**
     *   Network ID。  有port_id时，该参数不起作用。
     * @return netId
     */
    public String getNetId() {
        return netId;
    }

    public void setNetId(String netId) {
        this.netId = netId;
    }

    public NovaAttachInterfaceOption withPortId(String portId) {
        this.portId = portId;
        return this;
    }

    /**
     *   Port ID。  port_id和net_id不能同时传入。
     * @return portId
     */
    public String getPortId() {
        return portId;
    }

    public void setPortId(String portId) {
        this.portId = portId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NovaAttachInterfaceOption that = (NovaAttachInterfaceOption) obj;
        return Objects.equals(this.fixedIps, that.fixedIps) && Objects.equals(this.netId, that.netId)
            && Objects.equals(this.portId, that.portId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fixedIps, netId, portId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NovaAttachInterfaceOption {\n");
        sb.append("    fixedIps: ").append(toIndentedString(fixedIps)).append("\n");
        sb.append("    netId: ").append(toIndentedString(netId)).append("\n");
        sb.append("    portId: ").append(toIndentedString(portId)).append("\n");
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
