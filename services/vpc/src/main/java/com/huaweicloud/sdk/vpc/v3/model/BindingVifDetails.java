package com.huaweicloud.sdk.vpc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BindingVifDetails
 */
public class BindingVifDetails {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "primary_interface")

    private Boolean primaryInterface;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_filter")

    private Boolean portFilter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ovs_hybrid_plug")

    private Boolean ovsHybridPlug;

    public BindingVifDetails withPrimaryInterface(Boolean primaryInterface) {
        this.primaryInterface = primaryInterface;
        return this;
    }

    /**
     * **参数解释**： 表示该网卡是否为云服务器的主网卡。 **取值范围**： - true：该网卡是云服务器的主网卡。 - false：该网卡不是云服务器的主网卡。
     * @return primaryInterface
     */
    public Boolean getPrimaryInterface() {
        return primaryInterface;
    }

    public void setPrimaryInterface(Boolean primaryInterface) {
        this.primaryInterface = primaryInterface;
    }

    public BindingVifDetails withPortFilter(Boolean portFilter) {
        this.portFilter = portFilter;
        return this;
    }

    /**
     * **参数解释**： 表示该网络服务提供端口过滤特性，如安全组和反MAC/IP欺骗。 **取值范围**： - true：提供端口过滤特性。 - false：未提供端口过滤特性。
     * @return portFilter
     */
    public Boolean getPortFilter() {
        return portFilter;
    }

    public void setPortFilter(Boolean portFilter) {
        this.portFilter = portFilter;
    }

    public BindingVifDetails withOvsHybridPlug(Boolean ovsHybridPlug) {
        this.ovsHybridPlug = ovsHybridPlug;
        return this;
    }

    /**
     * **参数解释**： 是否为ovs/bridge混合模式。 **取值范围**： - true：ovs/bridge混合模式。 - false：非ovs/bridge混合模式。
     * @return ovsHybridPlug
     */
    public Boolean getOvsHybridPlug() {
        return ovsHybridPlug;
    }

    public void setOvsHybridPlug(Boolean ovsHybridPlug) {
        this.ovsHybridPlug = ovsHybridPlug;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BindingVifDetails that = (BindingVifDetails) obj;
        return Objects.equals(this.primaryInterface, that.primaryInterface)
            && Objects.equals(this.portFilter, that.portFilter)
            && Objects.equals(this.ovsHybridPlug, that.ovsHybridPlug);
    }

    @Override
    public int hashCode() {
        return Objects.hash(primaryInterface, portFilter, ovsHybridPlug);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BindingVifDetails {\n");
        sb.append("    primaryInterface: ").append(toIndentedString(primaryInterface)).append("\n");
        sb.append("    portFilter: ").append(toIndentedString(portFilter)).append("\n");
        sb.append("    ovsHybridPlug: ").append(toIndentedString(ovsHybridPlug)).append("\n");
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
