package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 插件实例的详细信息。
 */
public class Plugin {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apiVersion")

    private String apiVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private String kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private PluginMetadata metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private PluginSpec spec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private PluginStatus status;

    public Plugin withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * **参数解释**： API版本。 **取值范围**： 可选值如下： - v2
     * @return apiVersion
     */
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public Plugin withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * **参数解释**： 插件实例的类型。 **取值范围**： 可选值如下： - Plugin：插件。
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Plugin withMetadata(PluginMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public Plugin withMetadata(Consumer<PluginMetadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new PluginMetadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public PluginMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(PluginMetadata metadata) {
        this.metadata = metadata;
    }

    public Plugin withSpec(PluginSpec spec) {
        this.spec = spec;
        return this;
    }

    public Plugin withSpec(Consumer<PluginSpec> specSetter) {
        if (this.spec == null) {
            this.spec = new PluginSpec();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /**
     * Get spec
     * @return spec
     */
    public PluginSpec getSpec() {
        return spec;
    }

    public void setSpec(PluginSpec spec) {
        this.spec = spec;
    }

    public Plugin withStatus(PluginStatus status) {
        this.status = status;
        return this;
    }

    public Plugin withStatus(Consumer<PluginStatus> statusSetter) {
        if (this.status == null) {
            this.status = new PluginStatus();
            statusSetter.accept(this.status);
        }

        return this;
    }

    /**
     * Get status
     * @return status
     */
    public PluginStatus getStatus() {
        return status;
    }

    public void setStatus(PluginStatus status) {
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
        Plugin that = (Plugin) obj;
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
        sb.append("class Plugin {\n");
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
