package com.huaweicloud.sdk.eip.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListTenantVpcIgwsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_igws")

    private List<VpcIgwsTenantResp> vpcIgws = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    public ListTenantVpcIgwsResponse withVpcIgws(List<VpcIgwsTenantResp> vpcIgws) {
        this.vpcIgws = vpcIgws;
        return this;
    }

    public ListTenantVpcIgwsResponse addVpcIgwsItem(VpcIgwsTenantResp vpcIgwsItem) {
        if (this.vpcIgws == null) {
            this.vpcIgws = new ArrayList<>();
        }
        this.vpcIgws.add(vpcIgwsItem);
        return this;
    }

    public ListTenantVpcIgwsResponse withVpcIgws(Consumer<List<VpcIgwsTenantResp>> vpcIgwsSetter) {
        if (this.vpcIgws == null) {
            this.vpcIgws = new ArrayList<>();
        }
        vpcIgwsSetter.accept(this.vpcIgws);
        return this;
    }

    /**
     * 虚拟IGW列表对象
     * @return vpcIgws
     */
    public List<VpcIgwsTenantResp> getVpcIgws() {
        return vpcIgws;
    }

    public void setVpcIgws(List<VpcIgwsTenantResp> vpcIgws) {
        this.vpcIgws = vpcIgws;
    }

    public ListTenantVpcIgwsResponse withRequestId(String requestId) {
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
        ListTenantVpcIgwsResponse that = (ListTenantVpcIgwsResponse) obj;
        return Objects.equals(this.vpcIgws, that.vpcIgws) && Objects.equals(this.requestId, that.requestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpcIgws, requestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTenantVpcIgwsResponse {\n");
        sb.append("    vpcIgws: ").append(toIndentedString(vpcIgws)).append("\n");
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
