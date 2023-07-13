package com.huaweicloud.sdk.ga.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * update Endpoint request
 */
public class UpdateEndpointRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint")

    private UpdateEndpointOption endpoint;

    public UpdateEndpointRequestBody withEndpoint(UpdateEndpointOption endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    public UpdateEndpointRequestBody withEndpoint(Consumer<UpdateEndpointOption> endpointSetter) {
        if (this.endpoint == null) {
            this.endpoint = new UpdateEndpointOption();
            endpointSetter.accept(this.endpoint);
        }

        return this;
    }

    /**
     * Get endpoint
     * @return endpoint
     */
    public UpdateEndpointOption getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(UpdateEndpointOption endpoint) {
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
        UpdateEndpointRequestBody that = (UpdateEndpointRequestBody) obj;
        return Objects.equals(this.endpoint, that.endpoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endpoint);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateEndpointRequestBody {\n");
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
