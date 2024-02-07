package com.huaweicloud.sdk.eip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建虚拟IGW的请求体
 */
public class CreateTenantVpcIgwRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_igw")

    private CreateTenantVpcIgwRequestBodyVpcIgw vpcIgw;

    public CreateTenantVpcIgwRequestBody withVpcIgw(CreateTenantVpcIgwRequestBodyVpcIgw vpcIgw) {
        this.vpcIgw = vpcIgw;
        return this;
    }

    public CreateTenantVpcIgwRequestBody withVpcIgw(Consumer<CreateTenantVpcIgwRequestBodyVpcIgw> vpcIgwSetter) {
        if (this.vpcIgw == null) {
            this.vpcIgw = new CreateTenantVpcIgwRequestBodyVpcIgw();
            vpcIgwSetter.accept(this.vpcIgw);
        }

        return this;
    }

    /**
     * Get vpcIgw
     * @return vpcIgw
     */
    public CreateTenantVpcIgwRequestBodyVpcIgw getVpcIgw() {
        return vpcIgw;
    }

    public void setVpcIgw(CreateTenantVpcIgwRequestBodyVpcIgw vpcIgw) {
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
        CreateTenantVpcIgwRequestBody that = (CreateTenantVpcIgwRequestBody) obj;
        return Objects.equals(this.vpcIgw, that.vpcIgw);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpcIgw);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTenantVpcIgwRequestBody {\n");
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
