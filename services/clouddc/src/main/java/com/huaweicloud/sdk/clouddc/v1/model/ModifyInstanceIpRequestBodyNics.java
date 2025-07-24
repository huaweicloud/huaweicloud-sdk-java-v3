package com.huaweicloud.sdk.clouddc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ModifyInstanceIpRequestBodyNics
 */
public class ModifyInstanceIpRequestBodyNics {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_address")

    private String ipAddress;

    public ModifyInstanceIpRequestBodyNics withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * 创建网卡所属 CloudDCN 子网 ID，可通过 CloudDCN API 查询：https://support.huaweicloud.com/api-vpc/vpc_subnet01_0003.html。
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public ModifyInstanceIpRequestBodyNics withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * 创建网卡指定静态IP，批量安装时，该参数不生效。不填或空字符串，默认在子网（subnet）中自动分配一个未使用的IP作网卡的IP地址。若指定IP地址，该IP地址必须在子网（subnet）对应的网段内，且未被使用。
     * @return ipAddress
     */
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModifyInstanceIpRequestBodyNics that = (ModifyInstanceIpRequestBodyNics) obj;
        return Objects.equals(this.subnetId, that.subnetId) && Objects.equals(this.ipAddress, that.ipAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subnetId, ipAddress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyInstanceIpRequestBodyNics {\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
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
