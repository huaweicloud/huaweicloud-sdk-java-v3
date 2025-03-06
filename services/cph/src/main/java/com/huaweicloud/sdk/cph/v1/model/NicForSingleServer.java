package com.huaweicloud.sdk.cph.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * NicForSingleServer
 */
public class NicForSingleServer {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subnet_id")

    private String subnetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_enable")

    private Boolean ipv6Enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipv6_band_width_id")

    private String ipv6BandWidthId;

    public NicForSingleServer withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * 租户自定义的子网 ID，为待创建的云手机裸服务器所属的子网。 需要指定vpc_id对应VPC下已创建的子网（subnet）的网络ID，UUID格式
     * @return subnetId
     */
    public String getSubnetId() {
        return subnetId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public NicForSingleServer withIpv6Enable(Boolean ipv6Enable) {
        this.ipv6Enable = ipv6Enable;
        return this;
    }

    /**
     * 是否支持ipv6，默认不支持ipv6。 false：不支持ipv6 true：支持ipv6
     * @return ipv6Enable
     */
    public Boolean getIpv6Enable() {
        return ipv6Enable;
    }

    public void setIpv6Enable(Boolean ipv6Enable) {
        this.ipv6Enable = ipv6Enable;
    }

    public NicForSingleServer withIpv6BandWidthId(String ipv6BandWidthId) {
        this.ipv6BandWidthId = ipv6BandWidthId;
        return this;
    }

    /**
     * ipv6绑定的共享带宽ID。
     * @return ipv6BandWidthId
     */
    public String getIpv6BandWidthId() {
        return ipv6BandWidthId;
    }

    public void setIpv6BandWidthId(String ipv6BandWidthId) {
        this.ipv6BandWidthId = ipv6BandWidthId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NicForSingleServer that = (NicForSingleServer) obj;
        return Objects.equals(this.subnetId, that.subnetId) && Objects.equals(this.ipv6Enable, that.ipv6Enable)
            && Objects.equals(this.ipv6BandWidthId, that.ipv6BandWidthId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(subnetId, ipv6Enable, ipv6BandWidthId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NicForSingleServer {\n");
        sb.append("    subnetId: ").append(toIndentedString(subnetId)).append("\n");
        sb.append("    ipv6Enable: ").append(toIndentedString(ipv6Enable)).append("\n");
        sb.append("    ipv6BandWidthId: ").append(toIndentedString(ipv6BandWidthId)).append("\n");
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
