package com.huaweicloud.sdk.vpcep.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** Request Object */
public class AcceptOrRejectEndpointRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_endpoint_service_id")

    private String vpcEndpointServiceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private AcceptOrRejectEndpointRequestBody body;

    public AcceptOrRejectEndpointRequest withVpcEndpointServiceId(String vpcEndpointServiceId) {
        this.vpcEndpointServiceId = vpcEndpointServiceId;
        return this;
    }

    /** 终端节点服务的ID。
     * 
     * @return vpcEndpointServiceId */
    public String getVpcEndpointServiceId() {
        return vpcEndpointServiceId;
    }

    public void setVpcEndpointServiceId(String vpcEndpointServiceId) {
        this.vpcEndpointServiceId = vpcEndpointServiceId;
    }

    public AcceptOrRejectEndpointRequest withBody(AcceptOrRejectEndpointRequestBody body) {
        this.body = body;
        return this;
    }

    public AcceptOrRejectEndpointRequest withBody(Consumer<AcceptOrRejectEndpointRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new AcceptOrRejectEndpointRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /** Get body
     * 
     * @return body */
    public AcceptOrRejectEndpointRequestBody getBody() {
        return body;
    }

    public void setBody(AcceptOrRejectEndpointRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AcceptOrRejectEndpointRequest acceptOrRejectEndpointRequest = (AcceptOrRejectEndpointRequest) o;
        return Objects.equals(this.vpcEndpointServiceId, acceptOrRejectEndpointRequest.vpcEndpointServiceId)
            && Objects.equals(this.body, acceptOrRejectEndpointRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpcEndpointServiceId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AcceptOrRejectEndpointRequest {\n");
        sb.append("    vpcEndpointServiceId: ").append(toIndentedString(vpcEndpointServiceId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
