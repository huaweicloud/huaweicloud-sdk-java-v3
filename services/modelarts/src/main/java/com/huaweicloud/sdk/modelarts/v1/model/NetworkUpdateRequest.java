package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新网络资源的请求体。
 */
public class NetworkUpdateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private NetworkMetadataUpdate metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private NetworkSpecUpdate spec;

    public NetworkUpdateRequest withMetadata(NetworkMetadataUpdate metadata) {
        this.metadata = metadata;
        return this;
    }

    public NetworkUpdateRequest withMetadata(Consumer<NetworkMetadataUpdate> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new NetworkMetadataUpdate();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public NetworkMetadataUpdate getMetadata() {
        return metadata;
    }

    public void setMetadata(NetworkMetadataUpdate metadata) {
        this.metadata = metadata;
    }

    public NetworkUpdateRequest withSpec(NetworkSpecUpdate spec) {
        this.spec = spec;
        return this;
    }

    public NetworkUpdateRequest withSpec(Consumer<NetworkSpecUpdate> specSetter) {
        if (this.spec == null) {
            this.spec = new NetworkSpecUpdate();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /**
     * Get spec
     * @return spec
     */
    public NetworkSpecUpdate getSpec() {
        return spec;
    }

    public void setSpec(NetworkSpecUpdate spec) {
        this.spec = spec;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NetworkUpdateRequest that = (NetworkUpdateRequest) obj;
        return Objects.equals(this.metadata, that.metadata) && Objects.equals(this.spec, that.spec);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metadata, spec);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NetworkUpdateRequest {\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
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
