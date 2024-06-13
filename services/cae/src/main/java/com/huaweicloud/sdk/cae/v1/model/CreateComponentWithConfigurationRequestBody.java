package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateComponentWithConfigurationRequestBody
 */
public class CreateComponentWithConfigurationRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_version")

    private ApiVersionObj apiVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private ComponentKindObj kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private CreateComponentWithConfigurationRequestBodyMetadata metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private CreateComponentWithConfigurationRequestBodySpec spec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configurations")

    private List<ConfigurationItem> configurations = null;

    public CreateComponentWithConfigurationRequestBody withApiVersion(ApiVersionObj apiVersion) {
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

    public CreateComponentWithConfigurationRequestBody withKind(ComponentKindObj kind) {
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

    public CreateComponentWithConfigurationRequestBody withMetadata(
        CreateComponentWithConfigurationRequestBodyMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public CreateComponentWithConfigurationRequestBody withMetadata(
        Consumer<CreateComponentWithConfigurationRequestBodyMetadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new CreateComponentWithConfigurationRequestBodyMetadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public CreateComponentWithConfigurationRequestBodyMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(CreateComponentWithConfigurationRequestBodyMetadata metadata) {
        this.metadata = metadata;
    }

    public CreateComponentWithConfigurationRequestBody withSpec(CreateComponentWithConfigurationRequestBodySpec spec) {
        this.spec = spec;
        return this;
    }

    public CreateComponentWithConfigurationRequestBody withSpec(
        Consumer<CreateComponentWithConfigurationRequestBodySpec> specSetter) {
        if (this.spec == null) {
            this.spec = new CreateComponentWithConfigurationRequestBodySpec();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /**
     * Get spec
     * @return spec
     */
    public CreateComponentWithConfigurationRequestBodySpec getSpec() {
        return spec;
    }

    public void setSpec(CreateComponentWithConfigurationRequestBodySpec spec) {
        this.spec = spec;
    }

    public CreateComponentWithConfigurationRequestBody withConfigurations(List<ConfigurationItem> configurations) {
        this.configurations = configurations;
        return this;
    }

    public CreateComponentWithConfigurationRequestBody addConfigurationsItem(ConfigurationItem configurationsItem) {
        if (this.configurations == null) {
            this.configurations = new ArrayList<>();
        }
        this.configurations.add(configurationsItem);
        return this;
    }

    public CreateComponentWithConfigurationRequestBody withConfigurations(
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateComponentWithConfigurationRequestBody that = (CreateComponentWithConfigurationRequestBody) obj;
        return Objects.equals(this.apiVersion, that.apiVersion) && Objects.equals(this.kind, that.kind)
            && Objects.equals(this.metadata, that.metadata) && Objects.equals(this.spec, that.spec)
            && Objects.equals(this.configurations, that.configurations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiVersion, kind, metadata, spec, configurations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateComponentWithConfigurationRequestBody {\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
        sb.append("    configurations: ").append(toIndentedString(configurations)).append("\n");
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
