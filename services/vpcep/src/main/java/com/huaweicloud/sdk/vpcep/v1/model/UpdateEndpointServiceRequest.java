package com.huaweicloud.sdk.vpcep.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateEndpointServiceRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vpc_endpoint_service_id")

    private String vpcEndpointServiceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateEndpointServiceRequestBody body;

    public UpdateEndpointServiceRequest withVpcEndpointServiceId(String vpcEndpointServiceId) {
        this.vpcEndpointServiceId = vpcEndpointServiceId;
        return this;
    }

    /**
     * 终端节点服务的ID
     * @return vpcEndpointServiceId
     */
    public String getVpcEndpointServiceId() {
        return vpcEndpointServiceId;
    }

    public void setVpcEndpointServiceId(String vpcEndpointServiceId) {
        this.vpcEndpointServiceId = vpcEndpointServiceId;
    }

    public UpdateEndpointServiceRequest withBody(UpdateEndpointServiceRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateEndpointServiceRequest withBody(Consumer<UpdateEndpointServiceRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateEndpointServiceRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateEndpointServiceRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateEndpointServiceRequestBody body) {
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
        UpdateEndpointServiceRequest that = (UpdateEndpointServiceRequest) obj;
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
        sb.append("class UpdateEndpointServiceRequest {\n");
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
