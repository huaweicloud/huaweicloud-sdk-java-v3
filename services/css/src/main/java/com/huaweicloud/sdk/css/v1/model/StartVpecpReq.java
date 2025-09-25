package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * StartVpecpReq
 */
public class StartVpecpReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_with_dns_name")

    private Boolean endpointWithDnsName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "profession_vpcep")

    private Boolean professionVpcep;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dualstack_enable")

    private Boolean dualstackEnable;

    public StartVpecpReq withEndpointWithDnsName(Boolean endpointWithDnsName) {
        this.endpointWithDnsName = endpointWithDnsName;
        return this;
    }

    /**
     * 是否开启内网域名。 - true：开启。 - false：不开启。
     * @return endpointWithDnsName
     */
    public Boolean getEndpointWithDnsName() {
        return endpointWithDnsName;
    }

    public void setEndpointWithDnsName(Boolean endpointWithDnsName) {
        this.endpointWithDnsName = endpointWithDnsName;
    }

    public StartVpecpReq withProfessionVpcep(Boolean professionVpcep) {
        this.professionVpcep = professionVpcep;
        return this;
    }

    /**
     * 创建专业型终端节点。 - true：开启。 - false：不开启。
     * @return professionVpcep
     */
    public Boolean getProfessionVpcep() {
        return professionVpcep;
    }

    public void setProfessionVpcep(Boolean professionVpcep) {
        this.professionVpcep = professionVpcep;
    }

    public StartVpecpReq withDualstackEnable(Boolean dualstackEnable) {
        this.dualstackEnable = dualstackEnable;
        return this;
    }

    /**
     * 是否开启IPv4/IPv6双栈网络，仅支持在创建专业型终端节点时开启双栈网络，且集群的VPC子网支持IPv6。 - true：开启。 - false：不开启。
     * @return dualstackEnable
     */
    public Boolean getDualstackEnable() {
        return dualstackEnable;
    }

    public void setDualstackEnable(Boolean dualstackEnable) {
        this.dualstackEnable = dualstackEnable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StartVpecpReq that = (StartVpecpReq) obj;
        return Objects.equals(this.endpointWithDnsName, that.endpointWithDnsName)
            && Objects.equals(this.professionVpcep, that.professionVpcep)
            && Objects.equals(this.dualstackEnable, that.dualstackEnable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endpointWithDnsName, professionVpcep, dualstackEnable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartVpecpReq {\n");
        sb.append("    endpointWithDnsName: ").append(toIndentedString(endpointWithDnsName)).append("\n");
        sb.append("    professionVpcep: ").append(toIndentedString(professionVpcep)).append("\n");
        sb.append("    dualstackEnable: ").append(toIndentedString(dualstackEnable)).append("\n");
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
