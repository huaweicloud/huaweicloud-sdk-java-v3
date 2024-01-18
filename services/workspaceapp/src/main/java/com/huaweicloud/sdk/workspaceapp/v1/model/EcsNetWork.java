package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 服务器网络信息。
 */
public class EcsNetWork {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addr")

    private String addr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private Integer version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-EXT-IPS-MAC:mac_addr")

    private String osEXTIPSMACMacAddr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-EXT-IPS:type")

    private String osEXTIPSType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "OS-EXT-IPS:port_id")

    private String osEXTIPSPortId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_type")

    private String tenantType;

    public EcsNetWork withAddr(String addr) {
        this.addr = addr;
        return this;
    }

    /**
     * IP地址信息。
     * @return addr
     */
    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public EcsNetWork withVersion(Integer version) {
        this.version = version;
        return this;
    }

    /**
     * IP地址类型： `4` - IPV4 `6` - IPV6
     * @return version
     */
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public EcsNetWork withOsEXTIPSMACMacAddr(String osEXTIPSMACMacAddr) {
        this.osEXTIPSMACMacAddr = osEXTIPSMACMacAddr;
        return this;
    }

    /**
     * MAC地址。
     * @return osEXTIPSMACMacAddr
     */
    public String getOsEXTIPSMACMacAddr() {
        return osEXTIPSMACMacAddr;
    }

    public void setOsEXTIPSMACMacAddr(String osEXTIPSMACMacAddr) {
        this.osEXTIPSMACMacAddr = osEXTIPSMACMacAddr;
    }

    public EcsNetWork withOsEXTIPSType(String osEXTIPSType) {
        this.osEXTIPSType = osEXTIPSType;
        return this;
    }

    /**
     * IP地址分配方式，字符串是大小写不敏感格式。 * `fixed` - 代表私有IP地址。 * `floating` - 代表浮动IP地址。
     * @return osEXTIPSType
     */
    public String getOsEXTIPSType() {
        return osEXTIPSType;
    }

    public void setOsEXTIPSType(String osEXTIPSType) {
        this.osEXTIPSType = osEXTIPSType;
    }

    public EcsNetWork withOsEXTIPSPortId(String osEXTIPSPortId) {
        this.osEXTIPSPortId = osEXTIPSPortId;
        return this;
    }

    /**
     * IP地址对应的端口ID。
     * @return osEXTIPSPortId
     */
    public String getOsEXTIPSPortId() {
        return osEXTIPSPortId;
    }

    public void setOsEXTIPSPortId(String osEXTIPSPortId) {
        this.osEXTIPSPortId = osEXTIPSPortId;
    }

    public EcsNetWork withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * 虚拟私有云ID。
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public EcsNetWork withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * 子网id。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public EcsNetWork withTenantType(String tenantType) {
        this.tenantType = tenantType;
        return this;
    }

    /**
     * 租户类别: - tenant: 租户 - resource_tenant: 资源租户
     * @return tenantType
     */
    public String getTenantType() {
        return tenantType;
    }

    public void setTenantType(String tenantType) {
        this.tenantType = tenantType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EcsNetWork that = (EcsNetWork) obj;
        return Objects.equals(this.addr, that.addr) && Objects.equals(this.version, that.version)
            && Objects.equals(this.osEXTIPSMACMacAddr, that.osEXTIPSMACMacAddr)
            && Objects.equals(this.osEXTIPSType, that.osEXTIPSType)
            && Objects.equals(this.osEXTIPSPortId, that.osEXTIPSPortId) && Objects.equals(this.vpcId, that.vpcId)
            && Objects.equals(this.subnetId, that.subnetId) && Objects.equals(this.tenantType, that.tenantType);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(addr, version, osEXTIPSMACMacAddr, osEXTIPSType, osEXTIPSPortId, vpcId, subnetId, tenantType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EcsNetWork {\n");
        sb.append("    addr: ").append(toIndentedString(addr)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    osEXTIPSMACMacAddr: ").append(toIndentedString(osEXTIPSMACMacAddr)).append("\n");
        sb.append("    osEXTIPSType: ").append(toIndentedString(osEXTIPSType)).append("\n");
        sb.append("    osEXTIPSPortId: ").append(toIndentedString(osEXTIPSPortId)).append("\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    tenantType: ").append(toIndentedString(tenantType)).append("\n");
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
