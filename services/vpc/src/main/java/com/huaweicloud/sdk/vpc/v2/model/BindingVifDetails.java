package com.huaweicloud.sdk.vpc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 
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
     * 功能说明：取值为true，表示是虚拟机的主网卡。
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
     * 功能说明：表示该网络服务提供端口过滤特性，如安全组和反MAC/IP欺骗。
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
     * 用于通知像nova这样的API消费者，应该使用OVS的混合插入策略。
     * @return ovsHybridPlug
     */
    public Boolean getOvsHybridPlug() {
        return ovsHybridPlug;
    }

    public void setOvsHybridPlug(Boolean ovsHybridPlug) {
        this.ovsHybridPlug = ovsHybridPlug;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BindingVifDetails bindingVifDetails = (BindingVifDetails) o;
        return Objects.equals(this.primaryInterface, bindingVifDetails.primaryInterface)
            && Objects.equals(this.portFilter, bindingVifDetails.portFilter)
            && Objects.equals(this.ovsHybridPlug, bindingVifDetails.ovsHybridPlug);
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
