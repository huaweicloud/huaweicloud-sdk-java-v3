package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowPoolNodeConfigTemplateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apiversion")

    private String apiversion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private String kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private NodeconfigtemplateMeta metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private NodeconfigtemplatesSpec spec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public ShowPoolNodeConfigTemplateResponse withApiversion(String apiversion) {
        this.apiversion = apiversion;
        return this;
    }

    /**
     * **参数解释**：API版本。 **取值范围**：固定为v2。
     * @return apiversion
     */
    public String getApiversion() {
        return apiversion;
    }

    public void setApiversion(String apiversion) {
        this.apiversion = apiversion;
    }

    public ShowPoolNodeConfigTemplateResponse withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * **参数解释**：配置类型。 **取值范围**：固定为NodeConfigTemplate。
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public ShowPoolNodeConfigTemplateResponse withMetadata(NodeconfigtemplateMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public ShowPoolNodeConfigTemplateResponse withMetadata(Consumer<NodeconfigtemplateMeta> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new NodeconfigtemplateMeta();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public NodeconfigtemplateMeta getMetadata() {
        return metadata;
    }

    public void setMetadata(NodeconfigtemplateMeta metadata) {
        this.metadata = metadata;
    }

    public ShowPoolNodeConfigTemplateResponse withSpec(NodeconfigtemplatesSpec spec) {
        this.spec = spec;
        return this;
    }

    public ShowPoolNodeConfigTemplateResponse withSpec(Consumer<NodeconfigtemplatesSpec> specSetter) {
        if (this.spec == null) {
            this.spec = new NodeconfigtemplatesSpec();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /**
     * Get spec
     * @return spec
     */
    public NodeconfigtemplatesSpec getSpec() {
        return spec;
    }

    public void setSpec(NodeconfigtemplatesSpec spec) {
        this.spec = spec;
    }

    public ShowPoolNodeConfigTemplateResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowPoolNodeConfigTemplateResponse that = (ShowPoolNodeConfigTemplateResponse) obj;
        return Objects.equals(this.apiversion, that.apiversion) && Objects.equals(this.kind, that.kind)
            && Objects.equals(this.metadata, that.metadata) && Objects.equals(this.spec, that.spec)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiversion, kind, metadata, spec, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPoolNodeConfigTemplateResponse {\n");
        sb.append("    apiversion: ").append(toIndentedString(apiversion)).append("\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
