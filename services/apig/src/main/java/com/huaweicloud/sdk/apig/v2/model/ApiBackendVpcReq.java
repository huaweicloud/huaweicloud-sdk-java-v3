package com.huaweicloud.sdk.apig.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * VPC通道详情。vpc_channel_status &#x3D; 1，则这个object类型为必填信息
 */
public class ApiBackendVpcReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_channel_proxy_host")

    private String vpcChannelProxyHost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_channel_id")

    private String vpcChannelId;

    public ApiBackendVpcReq withVpcChannelProxyHost(String vpcChannelProxyHost) {
        this.vpcChannelProxyHost = vpcChannelProxyHost;
        return this;
    }

    /**
     * 代理主机
     * @return vpcChannelProxyHost
     */
    public String getVpcChannelProxyHost() {
        return vpcChannelProxyHost;
    }

    public void setVpcChannelProxyHost(String vpcChannelProxyHost) {
        this.vpcChannelProxyHost = vpcChannelProxyHost;
    }

    public ApiBackendVpcReq withVpcChannelId(String vpcChannelId) {
        this.vpcChannelId = vpcChannelId;
        return this;
    }

    /**
     * VPC通道编号
     * @return vpcChannelId
     */
    public String getVpcChannelId() {
        return vpcChannelId;
    }

    public void setVpcChannelId(String vpcChannelId) {
        this.vpcChannelId = vpcChannelId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiBackendVpcReq apiBackendVpcReq = (ApiBackendVpcReq) o;
        return Objects.equals(this.vpcChannelProxyHost, apiBackendVpcReq.vpcChannelProxyHost)
            && Objects.equals(this.vpcChannelId, apiBackendVpcReq.vpcChannelId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpcChannelProxyHost, vpcChannelId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiBackendVpcReq {\n");
        sb.append("    vpcChannelProxyHost: ").append(toIndentedString(vpcChannelProxyHost)).append("\n");
        sb.append("    vpcChannelId: ").append(toIndentedString(vpcChannelId)).append("\n");
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
