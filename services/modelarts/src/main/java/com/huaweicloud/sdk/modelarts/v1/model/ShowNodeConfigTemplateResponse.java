package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowNodeConfigTemplateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apiVersion")

    private String apiVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private String kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private NodeConfigTemplateMeta metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private NodeConfigTemplateSpec spec;

    public ShowNodeConfigTemplateResponse withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * **参数解释**： API版本。 **取值范围**： 可选值如下： - v1
     * @return apiVersion
     */
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public ShowNodeConfigTemplateResponse withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * **参数解释**： 资源类型。 **取值范围**： 可选值如下： - NodeConfigTemplate：节点配置模板
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public ShowNodeConfigTemplateResponse withMetadata(NodeConfigTemplateMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public ShowNodeConfigTemplateResponse withMetadata(Consumer<NodeConfigTemplateMeta> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new NodeConfigTemplateMeta();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public NodeConfigTemplateMeta getMetadata() {
        return metadata;
    }

    public void setMetadata(NodeConfigTemplateMeta metadata) {
        this.metadata = metadata;
    }

    public ShowNodeConfigTemplateResponse withSpec(NodeConfigTemplateSpec spec) {
        this.spec = spec;
        return this;
    }

    public ShowNodeConfigTemplateResponse withSpec(Consumer<NodeConfigTemplateSpec> specSetter) {
        if (this.spec == null) {
            this.spec = new NodeConfigTemplateSpec();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /**
     * Get spec
     * @return spec
     */
    public NodeConfigTemplateSpec getSpec() {
        return spec;
    }

    public void setSpec(NodeConfigTemplateSpec spec) {
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
        ShowNodeConfigTemplateResponse that = (ShowNodeConfigTemplateResponse) obj;
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
        sb.append("class ShowNodeConfigTemplateResponse {\n");
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
