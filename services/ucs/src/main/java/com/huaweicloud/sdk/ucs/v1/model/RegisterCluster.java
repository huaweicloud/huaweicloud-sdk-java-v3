package com.huaweicloud.sdk.ucs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.http.FormDataPart;
import com.huaweicloud.sdk.core.http.SdkFormDataBody;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 集群信息，包括期望状态（例如同步模式），和集群状态（例如版本、Node状态信息及资源统计信息等）。
 */
public class RegisterCluster implements SdkFormDataBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private String kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apiVersion")

    private String apiVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private RegisterClusterMetadata metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private RegisterClusterSpec spec;

    public RegisterCluster withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * 资源类型。注册集群必须填写为Cluster。
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public RegisterCluster withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * API版本信息。现版本仅为v1。
     * @return apiVersion
     */
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public RegisterCluster withMetadata(RegisterClusterMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public RegisterCluster withMetadata(Consumer<RegisterClusterMetadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new RegisterClusterMetadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public RegisterClusterMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(RegisterClusterMetadata metadata) {
        this.metadata = metadata;
    }

    public RegisterCluster withSpec(RegisterClusterSpec spec) {
        this.spec = spec;
        return this;
    }

    public RegisterCluster withSpec(Consumer<RegisterClusterSpec> specSetter) {
        if (this.spec == null) {
            this.spec = new RegisterClusterSpec();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /**
     * Get spec
     * @return spec
     */
    public RegisterClusterSpec getSpec() {
        return spec;
    }

    public void setSpec(RegisterClusterSpec spec) {
        this.spec = spec;
    }

    @Override
    public Map<String, FormDataPart<?>> buildFormData() {
        return new LinkedHashMap<String, FormDataPart<?>>() {

            private static final long serialVersionUID = 1L;
            {
                put("kind", new FormDataPart<>(kind));
                put("apiVersion", new FormDataPart<>(apiVersion));
                put("metadata", new FormDataPart<>(metadata));
                put("spec", new FormDataPart<>(spec));
            }
        };
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RegisterCluster that = (RegisterCluster) obj;
        return Objects.equals(this.kind, that.kind) && Objects.equals(this.apiVersion, that.apiVersion)
            && Objects.equals(this.metadata, that.metadata) && Objects.equals(this.spec, that.spec);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kind, apiVersion, metadata, spec);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RegisterCluster {\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
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
