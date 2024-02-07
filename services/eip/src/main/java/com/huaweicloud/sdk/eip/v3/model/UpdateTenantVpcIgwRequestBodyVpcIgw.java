package com.huaweicloud.sdk.eip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 修改虚拟IGW的请求体
 */
public class UpdateTenantVpcIgwRequestBodyVpcIgw {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_ipv6")

    private Boolean enableIpv6;

    public UpdateTenantVpcIgwRequestBodyVpcIgw withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 虚拟IGW的名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateTenantVpcIgwRequestBodyVpcIgw withEnableIpv6(Boolean enableIpv6) {
        this.enableIpv6 = enableIpv6;
        return this;
    }

    /**
     * 是否使能ipv6
     * @return enableIpv6
     */
    public Boolean getEnableIpv6() {
        return enableIpv6;
    }

    public void setEnableIpv6(Boolean enableIpv6) {
        this.enableIpv6 = enableIpv6;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateTenantVpcIgwRequestBodyVpcIgw that = (UpdateTenantVpcIgwRequestBodyVpcIgw) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.enableIpv6, that.enableIpv6);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, enableIpv6);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTenantVpcIgwRequestBodyVpcIgw {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    enableIpv6: ").append(toIndentedString(enableIpv6)).append("\n");
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
