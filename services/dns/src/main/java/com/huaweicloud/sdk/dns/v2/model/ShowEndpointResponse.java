package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowEndpointResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint")

    private EndpointResp endpoint;

    public ShowEndpointResponse withEndpoint(EndpointResp endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    public ShowEndpointResponse withEndpoint(Consumer<EndpointResp> endpointSetter) {
        if (this.endpoint == null) {
            this.endpoint = new EndpointResp();
            endpointSetter.accept(this.endpoint);
        }

        return this;
    }

    /**
     * Get endpoint
     * @return endpoint
     */
    public EndpointResp getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(EndpointResp endpoint) {
        this.endpoint = endpoint;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowEndpointResponse that = (ShowEndpointResponse) obj;
        return Objects.equals(this.endpoint, that.endpoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endpoint);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowEndpointResponse {\n");
        sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
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
