package com.huaweicloud.sdk.eip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 修改虚拟IGW的请求体
 */
public class UpdateTenantVpcIgwRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_igw")

    private UpdateTenantVpcIgwRequestBodyVpcIgw vpcIgw;

    public UpdateTenantVpcIgwRequestBody withVpcIgw(UpdateTenantVpcIgwRequestBodyVpcIgw vpcIgw) {
        this.vpcIgw = vpcIgw;
        return this;
    }

    public UpdateTenantVpcIgwRequestBody withVpcIgw(Consumer<UpdateTenantVpcIgwRequestBodyVpcIgw> vpcIgwSetter) {
        if (this.vpcIgw == null) {
            this.vpcIgw = new UpdateTenantVpcIgwRequestBodyVpcIgw();
            vpcIgwSetter.accept(this.vpcIgw);
        }

        return this;
    }

    /**
     * Get vpcIgw
     * @return vpcIgw
     */
    public UpdateTenantVpcIgwRequestBodyVpcIgw getVpcIgw() {
        return vpcIgw;
    }

    public void setVpcIgw(UpdateTenantVpcIgwRequestBodyVpcIgw vpcIgw) {
        this.vpcIgw = vpcIgw;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateTenantVpcIgwRequestBody that = (UpdateTenantVpcIgwRequestBody) obj;
        return Objects.equals(this.vpcIgw, that.vpcIgw);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpcIgw);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTenantVpcIgwRequestBody {\n");
        sb.append("    vpcIgw: ").append(toIndentedString(vpcIgw)).append("\n");
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
