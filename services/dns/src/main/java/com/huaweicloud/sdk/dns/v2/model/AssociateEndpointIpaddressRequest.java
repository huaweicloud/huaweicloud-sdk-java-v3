package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class AssociateEndpointIpaddressRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_id")

    private String endpointId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private Ipaddresses body;

    public AssociateEndpointIpaddressRequest withEndpointId(String endpointId) {
        this.endpointId = endpointId;
        return this;
    }

    /**
     * endpoint的ID。
     * @return endpointId
     */
    public String getEndpointId() {
        return endpointId;
    }

    public void setEndpointId(String endpointId) {
        this.endpointId = endpointId;
    }

    public AssociateEndpointIpaddressRequest withBody(Ipaddresses body) {
        this.body = body;
        return this;
    }

    public AssociateEndpointIpaddressRequest withBody(Consumer<Ipaddresses> bodySetter) {
        if (this.body == null) {
            this.body = new Ipaddresses();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public Ipaddresses getBody() {
        return body;
    }

    public void setBody(Ipaddresses body) {
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
        AssociateEndpointIpaddressRequest associateEndpointIpaddressRequest = (AssociateEndpointIpaddressRequest) o;
        return Objects.equals(this.endpointId, associateEndpointIpaddressRequest.endpointId)
            && Objects.equals(this.body, associateEndpointIpaddressRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endpointId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssociateEndpointIpaddressRequest {\n");
        sb.append("    endpointId: ").append(toIndentedString(endpointId)).append("\n");
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
