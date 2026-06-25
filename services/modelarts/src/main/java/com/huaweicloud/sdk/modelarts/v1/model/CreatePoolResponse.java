package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreatePoolResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apiVersion")

    private String apiVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private String kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private PoolMetadata metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private PoolSpecModel spec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private PoolStatus status;

    public CreatePoolResponse withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * API版本。可选值如下： - v2
     * @return apiVersion
     */
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public CreatePoolResponse withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * 资源类型。可选值如下： - Pool：资源池
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public CreatePoolResponse withMetadata(PoolMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public CreatePoolResponse withMetadata(Consumer<PoolMetadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new PoolMetadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public PoolMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(PoolMetadata metadata) {
        this.metadata = metadata;
    }

    public CreatePoolResponse withSpec(PoolSpecModel spec) {
        this.spec = spec;
        return this;
    }

    public CreatePoolResponse withSpec(Consumer<PoolSpecModel> specSetter) {
        if (this.spec == null) {
            this.spec = new PoolSpecModel();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /**
     * Get spec
     * @return spec
     */
    public PoolSpecModel getSpec() {
        return spec;
    }

    public void setSpec(PoolSpecModel spec) {
        this.spec = spec;
    }

    public CreatePoolResponse withStatus(PoolStatus status) {
        this.status = status;
        return this;
    }

    public CreatePoolResponse withStatus(Consumer<PoolStatus> statusSetter) {
        if (this.status == null) {
            this.status = new PoolStatus();
            statusSetter.accept(this.status);
        }

        return this;
    }

    /**
     * Get status
     * @return status
     */
    public PoolStatus getStatus() {
        return status;
    }

    public void setStatus(PoolStatus status) {
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
        CreatePoolResponse that = (CreatePoolResponse) obj;
        return Objects.equals(this.apiVersion, that.apiVersion) && Objects.equals(this.kind, that.kind)
            && Objects.equals(this.metadata, that.metadata) && Objects.equals(this.spec, that.spec)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiVersion, kind, metadata, spec, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePoolResponse {\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
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
