package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowUpgradeClusterTaskResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apiVersion")

    private String apiVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private String kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private UpgradeTaskMetadata metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private UpgradeTaskSpec spec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private UpgradeTaskStatus status;

    public ShowUpgradeClusterTaskResponse withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * api版本，默认为v3
     * @return apiVersion
     */
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public ShowUpgradeClusterTaskResponse withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * 资源类型，默认为UpgradeTask
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public ShowUpgradeClusterTaskResponse withMetadata(UpgradeTaskMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public ShowUpgradeClusterTaskResponse withMetadata(Consumer<UpgradeTaskMetadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new UpgradeTaskMetadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public UpgradeTaskMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(UpgradeTaskMetadata metadata) {
        this.metadata = metadata;
    }

    public ShowUpgradeClusterTaskResponse withSpec(UpgradeTaskSpec spec) {
        this.spec = spec;
        return this;
    }

    public ShowUpgradeClusterTaskResponse withSpec(Consumer<UpgradeTaskSpec> specSetter) {
        if (this.spec == null) {
            this.spec = new UpgradeTaskSpec();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /**
     * Get spec
     * @return spec
     */
    public UpgradeTaskSpec getSpec() {
        return spec;
    }

    public void setSpec(UpgradeTaskSpec spec) {
        this.spec = spec;
    }

    public ShowUpgradeClusterTaskResponse withStatus(UpgradeTaskStatus status) {
        this.status = status;
        return this;
    }

    public ShowUpgradeClusterTaskResponse withStatus(Consumer<UpgradeTaskStatus> statusSetter) {
        if (this.status == null) {
            this.status = new UpgradeTaskStatus();
            statusSetter.accept(this.status);
        }

        return this;
    }

    /**
     * Get status
     * @return status
     */
    public UpgradeTaskStatus getStatus() {
        return status;
    }

    public void setStatus(UpgradeTaskStatus status) {
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
        ShowUpgradeClusterTaskResponse that = (ShowUpgradeClusterTaskResponse) obj;
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
        sb.append("class ShowUpgradeClusterTaskResponse {\n");
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
