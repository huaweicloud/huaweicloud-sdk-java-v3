package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowClusterEndpointsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    @JacksonXmlProperty(localName = "metadata")

    private Metadata metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    @JacksonXmlProperty(localName = "spec")

    private OpenAPIResponseSpec spec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    @JacksonXmlProperty(localName = "status")

    private MasterEIPResponseStatus status;

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

    public ShowClusterEndpointsResponse withSpec(OpenAPIResponseSpec spec) {
        this.spec = spec;
        return this;
    }

    public ShowClusterEndpointsResponse withSpec(Consumer<OpenAPIResponseSpec> specSetter) {
        if (this.spec == null) {
            this.spec = new OpenAPIResponseSpec();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /**
     * Get spec
     * @return spec
     */
    public OpenAPIResponseSpec getSpec() {
        return spec;
    }

    public void setSpec(OpenAPIResponseSpec spec) {
        this.spec = spec;
    }

    public ShowClusterEndpointsResponse withStatus(MasterEIPResponseStatus status) {
        this.status = status;
        return this;
    }

    public ShowClusterEndpointsResponse withStatus(Consumer<MasterEIPResponseStatus> statusSetter) {
        if (this.status == null) {
            this.status = new MasterEIPResponseStatus();
            statusSetter.accept(this.status);
        }

        return this;
    }

    /**
     * Get status
     * @return status
     */
    public MasterEIPResponseStatus getStatus() {
        return status;
    }

    public void setStatus(MasterEIPResponseStatus status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowClusterEndpointsResponse showClusterEndpointsResponse = (ShowClusterEndpointsResponse) o;
        return Objects.equals(this.metadata, showClusterEndpointsResponse.metadata)
            && Objects.equals(this.spec, showClusterEndpointsResponse.spec)
            && Objects.equals(this.status, showClusterEndpointsResponse.status);
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
