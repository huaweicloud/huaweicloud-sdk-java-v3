package com.huaweicloud.sdk.eip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateTenantVpcIgwResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_igw")

    private VpcIgwsTenantResp vpcIgw;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public CreateTenantVpcIgwResponse withVpcIgw(VpcIgwsTenantResp vpcIgw) {
        this.vpcIgw = vpcIgw;
        return this;
    }

    public CreateTenantVpcIgwResponse withVpcIgw(Consumer<VpcIgwsTenantResp> vpcIgwSetter) {
        if (this.vpcIgw == null) {
            this.vpcIgw = new VpcIgwsTenantResp();
            vpcIgwSetter.accept(this.vpcIgw);
        }

        return this;
    }

    /**
     * Get vpcIgw
     * @return vpcIgw
     */
    public VpcIgwsTenantResp getVpcIgw() {
        return vpcIgw;
    }

    public void setVpcIgw(VpcIgwsTenantResp vpcIgw) {
        this.vpcIgw = vpcIgw;
    }

    public CreateTenantVpcIgwResponse withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 本次请求编号
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateTenantVpcIgwResponse that = (CreateTenantVpcIgwResponse) obj;
        return Objects.equals(this.vpcIgw, that.vpcIgw) && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpcIgw, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTenantVpcIgwResponse {\n");
        sb.append("    vpcIgw: ").append(toIndentedString(vpcIgw)).append("\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
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
