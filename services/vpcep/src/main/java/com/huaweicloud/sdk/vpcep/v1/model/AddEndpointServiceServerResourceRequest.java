package com.huaweicloud.sdk.vpcep.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class AddEndpointServiceServerResourceRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_endpoint_service_id")

    private String vpcEndpointServiceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private AddEndpointServiceServerResourceRequestBody body;

    public AddEndpointServiceServerResourceRequest withVpcEndpointServiceId(String vpcEndpointServiceId) {
        this.vpcEndpointServiceId = vpcEndpointServiceId;
        return this;
    }

    /**
     * 终端节点服务的ID。
     * @return vpcEndpointServiceId
     */
    public String getVpcEndpointServiceId() {
        return vpcEndpointServiceId;
    }

    public void setVpcEndpointServiceId(String vpcEndpointServiceId) {
        this.vpcEndpointServiceId = vpcEndpointServiceId;
    }

    public AddEndpointServiceServerResourceRequest withBody(AddEndpointServiceServerResourceRequestBody body) {
        this.body = body;
        return this;
    }

    public AddEndpointServiceServerResourceRequest withBody(
        Consumer<AddEndpointServiceServerResourceRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new AddEndpointServiceServerResourceRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public AddEndpointServiceServerResourceRequestBody getBody() {
        return body;
    }

    public void setBody(AddEndpointServiceServerResourceRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AddEndpointServiceServerResourceRequest that = (AddEndpointServiceServerResourceRequest) obj;
        return Objects.equals(this.vpcEndpointServiceId, that.vpcEndpointServiceId)
            && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vpcEndpointServiceId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddEndpointServiceServerResourceRequest {\n");
        sb.append("    vpcEndpointServiceId: ").append(toIndentedString(vpcEndpointServiceId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
