package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowNodePoolConfigurationsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apiVersion")

    private String apiVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private String kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private ConfigurationMetadata metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private ClusterConfigurationsSpec spec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Object status;

    public ShowNodePoolConfigurationsResponse withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * API版本
     * @return apiVersion
     */
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public ShowNodePoolConfigurationsResponse withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * API类型，固定值**Configuration**
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public ShowNodePoolConfigurationsResponse withMetadata(ConfigurationMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public ShowNodePoolConfigurationsResponse withMetadata(Consumer<ConfigurationMetadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new ConfigurationMetadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public ConfigurationMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(ConfigurationMetadata metadata) {
        this.metadata = metadata;
    }

    public ShowNodePoolConfigurationsResponse withSpec(ClusterConfigurationsSpec spec) {
        this.spec = spec;
        return this;
    }

    public ShowNodePoolConfigurationsResponse withSpec(Consumer<ClusterConfigurationsSpec> specSetter) {
        if (this.spec == null) {
            this.spec = new ClusterConfigurationsSpec();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /**
     * Get spec
     * @return spec
     */
    public ClusterConfigurationsSpec getSpec() {
        return spec;
    }

    public void setSpec(ClusterConfigurationsSpec spec) {
        this.spec = spec;
    }

    public ShowNodePoolConfigurationsResponse withStatus(Object status) {
        this.status = status;
        return this;
    }

    /**
     * Configuration的状态信息
     * @return status
     */
    public Object getStatus() {
        return status;
    }

    public void setStatus(Object status) {
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
        ShowNodePoolConfigurationsResponse that = (ShowNodePoolConfigurationsResponse) obj;
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
        sb.append("class ShowNodePoolConfigurationsResponse {\n");
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
