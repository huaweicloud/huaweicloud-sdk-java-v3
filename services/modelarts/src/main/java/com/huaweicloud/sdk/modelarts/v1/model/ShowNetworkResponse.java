package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowNetworkResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apiVersion")

    private String apiVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private String kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private NetworkMetadata metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private NetworkSpec spec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private NetworkStatus status;

    public ShowNetworkResponse withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * **参数解释**：资源的API版本。 **取值范围**：可选值如下： - v1：当前资源版本为v1。
     * @return apiVersion
     */
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public ShowNetworkResponse withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * **参数解释**：资源的类型。 **取值范围**：可选值如下： - Network：网络。
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public ShowNetworkResponse withMetadata(NetworkMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public ShowNetworkResponse withMetadata(Consumer<NetworkMetadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new NetworkMetadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public NetworkMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(NetworkMetadata metadata) {
        this.metadata = metadata;
    }

    public ShowNetworkResponse withSpec(NetworkSpec spec) {
        this.spec = spec;
        return this;
    }

    public ShowNetworkResponse withSpec(Consumer<NetworkSpec> specSetter) {
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

    public ShowNetworkResponse withStatus(NetworkStatus status) {
        this.status = status;
        return this;
    }

    public ShowNetworkResponse withStatus(Consumer<NetworkStatus> statusSetter) {
        if (this.status == null) {
            this.status = new NetworkStatus();
            statusSetter.accept(this.status);
        }

        return this;
    }

    /**
     * Get status
     * @return status
     */
    public NetworkStatus getStatus() {
        return status;
    }

    public void setStatus(NetworkStatus status) {
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
        ShowNetworkResponse that = (ShowNetworkResponse) obj;
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
        sb.append("class ShowNetworkResponse {\n");
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
