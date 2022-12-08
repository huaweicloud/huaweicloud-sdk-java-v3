package com.huaweicloud.sdk.dns.v2.model;

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
public class DisassociateEndpointIpaddressResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoints")

    private List<EndpointResp> endpoints = null;

    public DisassociateEndpointIpaddressResponse withEndpoints(List<EndpointResp> endpoints) {
        this.endpoints = endpoints;
        return this;
    }

    public DisassociateEndpointIpaddressResponse addEndpointsItem(EndpointResp endpointsItem) {
        if (this.endpoints == null) {
            this.endpoints = new ArrayList<>();
        }
        this.endpoints.add(endpointsItem);
        return this;
    }

    public DisassociateEndpointIpaddressResponse withEndpoints(Consumer<List<EndpointResp>> endpointsSetter) {
        if (this.endpoints == null) {
            this.endpoints = new ArrayList<>();
        }
        endpointsSetter.accept(this.endpoints);
        return this;
    }

    /**
     * 查询公网Zone的列表响应。
     * @return endpoints
     */
    public List<EndpointResp> getEndpoints() {
        return endpoints;
    }

    public void setEndpoints(List<EndpointResp> endpoints) {
        this.endpoints = endpoints;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DisassociateEndpointIpaddressResponse disassociateEndpointIpaddressResponse =
            (DisassociateEndpointIpaddressResponse) o;
        return Objects.equals(this.endpoints, disassociateEndpointIpaddressResponse.endpoints);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endpoints);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DisassociateEndpointIpaddressResponse {\n");
        sb.append("    endpoints: ").append(toIndentedString(endpoints)).append("\n");
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