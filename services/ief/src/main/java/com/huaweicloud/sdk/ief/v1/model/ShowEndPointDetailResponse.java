package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowEndPointDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint")

    private EndpointObjResp endpoint;

    public ShowEndPointDetailResponse withEndpoint(EndpointObjResp endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    public ShowEndPointDetailResponse withEndpoint(Consumer<EndpointObjResp> endpointSetter) {
        if (this.endpoint == null) {
            this.endpoint = new EndpointObjResp();
            endpointSetter.accept(this.endpoint);
        }

        return this;
    }

    /**
     * Get endpoint
     * @return endpoint
     */
    public EndpointObjResp getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(EndpointObjResp endpoint) {
        this.endpoint = endpoint;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowEndPointDetailResponse showEndPointDetailResponse = (ShowEndPointDetailResponse) o;
        return Objects.equals(this.endpoint, showEndPointDetailResponse.endpoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endpoint);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowEndPointDetailResponse {\n");
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
