package com.huaweicloud.sdk.sdrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** 保护实例添加网卡请求体 */
public class ProtectedInstanceAddNicRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_groups")

    private List<SecurityGroupsParams> securityGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_address")

    private String ipAddress;

    public ProtectedInstanceAddNicRequestBody withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /** 添加网卡的子网ID。该参数是子网的network_id，和neutron_network_id的值保持一致。
     * 
     * @return subnetId */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public ProtectedInstanceAddNicRequestBody withSecurityGroups(List<SecurityGroupsParams> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    public ProtectedInstanceAddNicRequestBody addSecurityGroupsItem(SecurityGroupsParams securityGroupsItem) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        this.securityGroups.add(securityGroupsItem);
        return this;
    }

    public ProtectedInstanceAddNicRequestBody withSecurityGroups(
        Consumer<List<SecurityGroupsParams>> securityGroupsSetter) {
        if (this.securityGroups == null) {
            this.securityGroups = new ArrayList<>();
        }
        securityGroupsSetter.accept(this.securityGroups);
        return this;
    }

    /** 添加网卡的安全组信息。默认为Sys-default安全组。
     * 
     * @return securityGroups */
    public List<SecurityGroupsParams> getSecurityGroups() {
        return securityGroups;
    }

    public void setSecurityGroups(List<SecurityGroupsParams> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public ProtectedInstanceAddNicRequestBody withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /** IP地址，若无该参数表示自动分配IP地址。
     * 
     * @return ipAddress */
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProtectedInstanceAddNicRequestBody protectedInstanceAddNicRequestBody = (ProtectedInstanceAddNicRequestBody) o;
        return Objects.equals(this.subnetId, protectedInstanceAddNicRequestBody.subnetId)
            && Objects.equals(this.securityGroups, protectedInstanceAddNicRequestBody.securityGroups)
            && Objects.equals(this.ipAddress, protectedInstanceAddNicRequestBody.ipAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subnetId, securityGroups, ipAddress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProtectedInstanceAddNicRequestBody {\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    securityGroups: ").append(toIndentedString(securityGroups)).append("\n");
        sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
