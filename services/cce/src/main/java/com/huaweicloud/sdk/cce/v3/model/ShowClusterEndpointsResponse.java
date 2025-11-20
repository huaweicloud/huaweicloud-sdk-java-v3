package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowClusterEndpointsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private Metadata metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private OpenAPISpec spec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private OpenAPIResponseStatus status;

    public ShowClusterEndpointsResponse withMetadata(Metadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public ShowClusterEndpointsResponse withMetadata(Consumer<Metadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new Metadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public Metadata getMetadata() {
        return metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public ShowClusterEndpointsResponse withSpec(OpenAPISpec spec) {
        this.spec = spec;
        return this;
    }

    public ShowClusterEndpointsResponse withSpec(Consumer<OpenAPISpec> specSetter) {
        if (this.spec == null) {
            this.spec = new OpenAPISpec();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /**
     * Get spec
     * @return spec
     */
    public OpenAPISpec getSpec() {
        return spec;
    }

    public void setSpec(OpenAPISpec spec) {
        this.spec = spec;
    }

    public ShowClusterEndpointsResponse withStatus(OpenAPIResponseStatus status) {
        this.status = status;
        return this;
    }

    public ShowClusterEndpointsResponse withStatus(Consumer<OpenAPIResponseStatus> statusSetter) {
        if (this.status == null) {
            this.status = new OpenAPIResponseStatus();
            statusSetter.accept(this.status);
        }

        return this;
    }

    /**
     * Get status
     * @return status
     */
    public OpenAPIResponseStatus getStatus() {
        return status;
    }

    public void setStatus(OpenAPIResponseStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowClusterEndpointsResponse that = (ShowClusterEndpointsResponse) obj;
        return Objects.equals(this.metadata, that.metadata) && Objects.equals(this.spec, that.spec)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metadata, spec, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowClusterEndpointsResponse {\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
