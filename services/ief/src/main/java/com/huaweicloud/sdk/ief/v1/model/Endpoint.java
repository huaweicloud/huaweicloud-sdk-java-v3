package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 端点详情
 */
public class Endpoint {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint")

    @JacksonXmlProperty(localName = "endpoint")

    private EndpointObj endpoint;

    public Endpoint withEndpoint(EndpointObj endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    public Endpoint withEndpoint(Consumer<EndpointObj> endpointSetter) {
        if (this.endpoint == null) {
            this.endpoint = new EndpointObj();
            endpointSetter.accept(this.endpoint);
        }

        return this;
    }

    /**
     * Get endpoint
     * @return endpoint
     */
    public EndpointObj getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(EndpointObj endpoint) {
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
        Endpoint endpoint = (Endpoint) o;
        return Objects.equals(this.endpoint, endpoint.endpoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endpoint);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Endpoint {\n");
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
