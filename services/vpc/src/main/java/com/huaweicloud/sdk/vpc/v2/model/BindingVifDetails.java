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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vlan_id")

    private String vlanId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_id")

    private String parentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_device_id")

    private String parentDeviceId;

    public BindingVifDetails withPrimaryInterface(Boolean primaryInterface) {
        this.primaryInterface = primaryInterface;
        return this;
    }

    /**
     * 是否为虚拟机的主网卡。
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
     * 是否提供端口过滤特性, 如安全组和反MAC/IP欺骗。
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
     * 是否为ovs/bridge混合模式。
     * @return ovsHybridPlug
     */
    public Boolean getOvsHybridPlug() {
        return ovsHybridPlug;
    }

    public void setOvsHybridPlug(Boolean ovsHybridPlug) {
        this.ovsHybridPlug = ovsHybridPlug;
    }

    public BindingVifDetails withVlanId(String vlanId) {
        this.vlanId = vlanId;
        return this;
    }

    /**
     * 辅助弹性网卡的vlan ID。
     * @return vlanId
     */
    public String getVlanId() {
        return vlanId;
    }

    public void setVlanId(String vlanId) {
        this.vlanId = vlanId;
    }

    public BindingVifDetails withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * 辅助弹性网卡的宿主网卡ID。
     * @return parentId
     */
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public BindingVifDetails withParentDeviceId(String parentDeviceId) {
        this.parentDeviceId = parentDeviceId;
        return this;
    }

    /**
     * 辅助弹性网卡的宿主网卡所属的设备ID。
     * @return parentDeviceId
     */
    public String getParentDeviceId() {
        return parentDeviceId;
    }

    public void setParentDeviceId(String parentDeviceId) {
        this.parentDeviceId = parentDeviceId;
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
            && Objects.equals(this.ovsHybridPlug, that.ovsHybridPlug) && Objects.equals(this.vlanId, that.vlanId)
            && Objects.equals(this.parentId, that.parentId) && Objects.equals(this.parentDeviceId, that.parentDeviceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(primaryInterface, portFilter, ovsHybridPlug, vlanId, parentId, parentDeviceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BindingVifDetails {\n");
        sb.append("    primaryInterface: ").append(toIndentedString(primaryInterface)).append("\n");
        sb.append("    portFilter: ").append(toIndentedString(portFilter)).append("\n");
        sb.append("    ovsHybridPlug: ").append(toIndentedString(ovsHybridPlug)).append("\n");
        sb.append("    vlanId: ").append(toIndentedString(vlanId)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    parentDeviceId: ").append(toIndentedString(parentDeviceId)).append("\n");
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
