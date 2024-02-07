package com.huaweicloud.sdk.eip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建虚拟IGW的请求体
 */
public class CreateTenantVpcIgwRequestBodyVpcIgw {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_id")

    private String vpcId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_id")

    private String networkId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "add_route")

    private Boolean addRoute;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_ipv6")

    private Boolean enableIpv6;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    public CreateTenantVpcIgwRequestBodyVpcIgw withVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }

    /**
     * vpcid
     * @return vpcId
     */
    public String getVpcId() {
        return vpcId;
    }

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    public CreateTenantVpcIgwRequestBodyVpcIgw withNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }

    /**
     * 创建VPC IGW的network id
     * @return networkId
     */
    public String getNetworkId() {
        return networkId;
    }

    public void setNetworkId(String networkId) {
        this.networkId = networkId;
    }

    public CreateTenantVpcIgwRequestBodyVpcIgw withAddRoute(Boolean addRoute) {
        this.addRoute = addRoute;
        return this;
    }

    /**
     * 是否添加默认路由
     * @return addRoute
     */
    public Boolean getAddRoute() {
        return addRoute;
    }

    public void setAddRoute(Boolean addRoute) {
        this.addRoute = addRoute;
    }

    public CreateTenantVpcIgwRequestBodyVpcIgw withEnableIpv6(Boolean enableIpv6) {
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

    public CreateTenantVpcIgwRequestBodyVpcIgw withName(String name) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateTenantVpcIgwRequestBodyVpcIgw that = (CreateTenantVpcIgwRequestBodyVpcIgw) obj;
        return Objects.equals(this.vpcId, that.vpcId) && Objects.equals(this.networkId, that.networkId)
            && Objects.equals(this.addRoute, that.addRoute) && Objects.equals(this.enableIpv6, that.enableIpv6)
            && Objects.equals(this.name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpcId, networkId, addRoute, enableIpv6, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTenantVpcIgwRequestBodyVpcIgw {\n");
        sb.append("    vpcId: ").append(toIndentedString(vpcId)).append("\n");
        sb.append("    networkId: ").append(toIndentedString(networkId)).append("\n");
        sb.append("    addRoute: ").append(toIndentedString(addRoute)).append("\n");
        sb.append("    enableIpv6: ").append(toIndentedString(enableIpv6)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
