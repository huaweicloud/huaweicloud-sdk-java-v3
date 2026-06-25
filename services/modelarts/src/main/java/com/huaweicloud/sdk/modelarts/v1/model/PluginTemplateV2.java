package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 插件模板的详细信息。
 */
public class PluginTemplateV2 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apiVersion")

    private String apiVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private String kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private PluginTemplateMetadata metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private PluginTemplateSpecV2 spec;

    public PluginTemplateV2 withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * **参数解释**：API版本。 **取值范围**：可选值如下： - v2
     * @return apiVersion
     */
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public PluginTemplateV2 withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * **参数解释**：资源类型。 **取值范围**：可选值如下： - PluginTemplate：插件模板
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public PluginTemplateV2 withMetadata(PluginTemplateMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public PluginTemplateV2 withMetadata(Consumer<PluginTemplateMetadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new PluginTemplateMetadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public PluginTemplateMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(PluginTemplateMetadata metadata) {
        this.metadata = metadata;
    }

    public PluginTemplateV2 withSpec(PluginTemplateSpecV2 spec) {
        this.spec = spec;
        return this;
    }

    public PluginTemplateV2 withSpec(Consumer<PluginTemplateSpecV2> specSetter) {
        if (this.spec == null) {
            this.spec = new PluginTemplateSpecV2();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /**
     * Get spec
     * @return spec
     */
    public PluginTemplateSpecV2 getSpec() {
        return spec;
    }

    public void setSpec(PluginTemplateSpecV2 spec) {
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
        PluginTemplateV2 that = (PluginTemplateV2) obj;
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
        sb.append("class PluginTemplateV2 {\n");
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
