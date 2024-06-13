package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateComponentWithConfigurationResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_version")

    private ApiVersionObj apiVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private ComponentKindObj kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private MetadataResponse metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private CreateComponentSpec spec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configurations")

    private List<ConfigurationItem> configurations = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private CreateComponentWithConfigurationResponseBodyStatus status;

    public CreateComponentWithConfigurationResponse withApiVersion(ApiVersionObj apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * Get apiVersion
     * @return apiVersion
     */
    public ApiVersionObj getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(ApiVersionObj apiVersion) {
        this.apiVersion = apiVersion;
    }

    public CreateComponentWithConfigurationResponse withKind(ComponentKindObj kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get kind
     * @return kind
     */
    public ComponentKindObj getKind() {
        return kind;
    }

    public void setKind(ComponentKindObj kind) {
        this.kind = kind;
    }

    public CreateComponentWithConfigurationResponse withMetadata(MetadataResponse metadata) {
        this.metadata = metadata;
        return this;
    }

    public CreateComponentWithConfigurationResponse withMetadata(Consumer<MetadataResponse> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new MetadataResponse();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public MetadataResponse getMetadata() {
        return metadata;
    }

    public void setMetadata(MetadataResponse metadata) {
        this.metadata = metadata;
    }

    public CreateComponentWithConfigurationResponse withSpec(CreateComponentSpec spec) {
        this.spec = spec;
        return this;
    }

    public CreateComponentWithConfigurationResponse withSpec(Consumer<CreateComponentSpec> specSetter) {
        if (this.spec == null) {
            this.spec = new CreateComponentSpec();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /**
     * Get spec
     * @return spec
     */
    public CreateComponentSpec getSpec() {
        return spec;
    }

    public void setSpec(CreateComponentSpec spec) {
        this.spec = spec;
    }

    public CreateComponentWithConfigurationResponse withConfigurations(List<ConfigurationItem> configurations) {
        this.configurations = configurations;
        return this;
    }

    public CreateComponentWithConfigurationResponse addConfigurationsItem(ConfigurationItem configurationsItem) {
        if (this.configurations == null) {
            this.configurations = new ArrayList<>();
        }
        this.configurations.add(configurationsItem);
        return this;
    }

    public CreateComponentWithConfigurationResponse withConfigurations(
        Consumer<List<ConfigurationItem>> configurationsSetter) {
        if (this.configurations == null) {
            this.configurations = new ArrayList<>();
        }
        configurationsSetter.accept(this.configurations);
        return this;
    }

    /**
     * 配置项列表。
     * @return configurations
     */
    public List<ConfigurationItem> getConfigurations() {
        return configurations;
    }

    public void setConfigurations(List<ConfigurationItem> configurations) {
        this.configurations = configurations;
    }

    public CreateComponentWithConfigurationResponse withStatus(
        CreateComponentWithConfigurationResponseBodyStatus status) {
        this.status = status;
        return this;
    }

    public CreateComponentWithConfigurationResponse withStatus(
        Consumer<CreateComponentWithConfigurationResponseBodyStatus> statusSetter) {
        if (this.status == null) {
            this.status = new CreateComponentWithConfigurationResponseBodyStatus();
            statusSetter.accept(this.status);
        }

        return this;
    }

    /**
     * Get status
     * @return status
     */
    public CreateComponentWithConfigurationResponseBodyStatus getStatus() {
        return status;
    }

    public void setStatus(CreateComponentWithConfigurationResponseBodyStatus status) {
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
        CreateComponentWithConfigurationResponse that = (CreateComponentWithConfigurationResponse) obj;
        return Objects.equals(this.apiVersion, that.apiVersion) && Objects.equals(this.kind, that.kind)
            && Objects.equals(this.metadata, that.metadata) && Objects.equals(this.spec, that.spec)
            && Objects.equals(this.configurations, that.configurations) && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiVersion, kind, metadata, spec, configurations, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateComponentWithConfigurationResponse {\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
        sb.append("    configurations: ").append(toIndentedString(configurations)).append("\n");
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
