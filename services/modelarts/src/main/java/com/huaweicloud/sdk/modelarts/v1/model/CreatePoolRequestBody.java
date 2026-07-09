package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 资源池创建请求体。
 */
public class CreatePoolRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apiVersion")

    private String apiVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private String kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private PoolMetadataCreation metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private PoolSpecCreation spec;

    public CreatePoolRequestBody withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * **参数解释**：API版本。 **约束限制**：不涉及。 **取值范围**：可选值如下： - v2 **默认取值**：不涉及。
     * @return apiVersion
     */
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public CreatePoolRequestBody withKind(String kind) {
        this.kind = kind;
        return this;
    }

    /**
     * **参数解释**：资源类型。 **约束限制**：不涉及。 **取值范围**：可选值如下： - Pool：资源池 **默认取值**：不涉及。
     * @return kind
     */
    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public CreatePoolRequestBody withMetadata(PoolMetadataCreation metadata) {
        this.metadata = metadata;
        return this;
    }

    public CreatePoolRequestBody withMetadata(Consumer<PoolMetadataCreation> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new PoolMetadataCreation();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public PoolMetadataCreation getMetadata() {
        return metadata;
    }

    public void setMetadata(PoolMetadataCreation metadata) {
        this.metadata = metadata;
    }

    public CreatePoolRequestBody withSpec(PoolSpecCreation spec) {
        this.spec = spec;
        return this;
    }

    public CreatePoolRequestBody withSpec(Consumer<PoolSpecCreation> specSetter) {
        if (this.spec == null) {
            this.spec = new PoolSpecCreation();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /**
     * Get spec
     * @return spec
     */
    public PoolSpecCreation getSpec() {
        return spec;
    }

    public void setSpec(PoolSpecCreation spec) {
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
        CreatePoolRequestBody that = (CreatePoolRequestBody) obj;
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
        sb.append("class CreatePoolRequestBody {\n");
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
