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
public class ShowClusterResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    @JacksonXmlProperty(localName = "kind")

    private String kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apiVersion")

    @JacksonXmlProperty(localName = "apiVersion")

    private String apiVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    @JacksonXmlProperty(localName = "metadata")

    private ClusterMetadata metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    @JacksonXmlProperty(localName = "spec")

    private ClusterSpec spec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    @JacksonXmlProperty(localName = "status")

    private ClusterStatus status;

    public ShowClusterResponse withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * API类型，固定值“Cluster”或“cluster”，该值不可修改。  
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public ShowClusterResponse withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * API版本，固定值“v3”，该值不可修改。  
     * @return apiVersion
     */
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public ShowClusterResponse withMetadata(ClusterMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public ShowClusterResponse withMetadata(Consumer<ClusterMetadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new ClusterMetadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public ClusterMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(ClusterMetadata metadata) {
        this.metadata = metadata;
    }

    public ShowClusterResponse withSpec(ClusterSpec spec) {
        this.spec = spec;
        return this;
    }

    public ShowClusterResponse withSpec(Consumer<ClusterSpec> specSetter) {
        if (this.spec == null) {
            this.spec = new ClusterSpec();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /**
     * Get spec
     * @return spec
     */
    public ClusterSpec getSpec() {
        return spec;
    }

    public void setSpec(ClusterSpec spec) {
        this.spec = spec;
    }

    public ShowClusterResponse withStatus(ClusterStatus status) {
        this.status = status;
        return this;
    }

    public ShowClusterResponse withStatus(Consumer<ClusterStatus> statusSetter) {
        if (this.status == null) {
            this.status = new ClusterStatus();
            statusSetter.accept(this.status);
        }

        return this;
    }

    /**
     * Get status
     * @return status
     */
    public ClusterStatus getStatus() {
        return status;
    }

    public void setStatus(ClusterStatus status) {
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
        ShowClusterResponse showClusterResponse = (ShowClusterResponse) o;
        return Objects.equals(this.kind, showClusterResponse.kind)
            && Objects.equals(this.apiVersion, showClusterResponse.apiVersion)
            && Objects.equals(this.metadata, showClusterResponse.metadata)
            && Objects.equals(this.spec, showClusterResponse.spec)
            && Objects.equals(this.status, showClusterResponse.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kind, apiVersion, metadata, spec, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowClusterResponse {\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
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
