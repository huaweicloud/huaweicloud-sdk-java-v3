package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 网络创建信息，最终用户不感知子网。
 */
public class NetworkCreationRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apiVersion")

    private String apiVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private String kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private NetworkMetadataCreation metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private NetworkSpec spec;

    public NetworkCreationRequest withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * **参数解释**：API版本。 **约束限制**：不涉及。 **取值范围**：可选值如下： - v1 **默认取值**：不涉及。
     * @return apiVersion
     */
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public NetworkCreationRequest withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * **参数解释**：资源类型。 **约束限制**：不涉及。 **取值范围**：可选值如下： - Network：网络 **默认取值**：不涉及。
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public NetworkCreationRequest withMetadata(NetworkMetadataCreation metadata) {
        this.metadata = metadata;
        return this;
    }

    public NetworkCreationRequest withMetadata(Consumer<NetworkMetadataCreation> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new NetworkMetadataCreation();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public NetworkMetadataCreation getMetadata() {
        return metadata;
    }

    public void setMetadata(NetworkMetadataCreation metadata) {
        this.metadata = metadata;
    }

    public NetworkCreationRequest withSpec(NetworkSpec spec) {
        this.spec = spec;
        return this;
    }

    public NetworkCreationRequest withSpec(Consumer<NetworkSpec> specSetter) {
        if (this.spec == null) {
            this.spec = new NetworkSpec();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /**
     * Get spec
     * @return spec
     */
    public NetworkSpec getSpec() {
        return spec;
    }

    public void setSpec(NetworkSpec spec) {
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
        NetworkCreationRequest that = (NetworkCreationRequest) obj;
        return Objects.equals(this.apiVersion, that.apiVersion) && Objects.equals(this.kind, that.kind)
            && Objects.equals(this.metadata, that.metadata) && Objects.equals(this.spec, that.spec);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiVersion, kind, metadata, spec);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NetworkCreationRequest {\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
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
