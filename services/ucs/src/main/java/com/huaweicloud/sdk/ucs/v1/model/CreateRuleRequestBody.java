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
 * CreateRuleRequestBody
 */
public class CreateRuleRequestBody implements SdkFormDataBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private CreateRuleObjectMeta metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private RuleSpec spec;

    public CreateRuleRequestBody withMetadata(CreateRuleObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public CreateRuleRequestBody withMetadata(Consumer<CreateRuleObjectMeta> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new CreateRuleObjectMeta();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public CreateRuleObjectMeta getMetadata() {
        return metadata;
    }

    public void setMetadata(CreateRuleObjectMeta metadata) {
        this.metadata = metadata;
    }

    public CreateRuleRequestBody withSpec(RuleSpec spec) {
        this.spec = spec;
        return this;
    }

    public CreateRuleRequestBody withSpec(Consumer<RuleSpec> specSetter) {
        if (this.spec == null) {
            this.spec = new RuleSpec();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /**
     * Get spec
     * @return spec
     */
    public RuleSpec getSpec() {
        return spec;
    }

    public void setSpec(RuleSpec spec) {
        this.spec = spec;
    }

    @Override
    public Map<String, FormDataPart<?>> buildFormData() {
        return new LinkedHashMap<String, FormDataPart<?>>() {

            private static final long serialVersionUID = 1L;
            {
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
        CreateRuleRequestBody that = (CreateRuleRequestBody) obj;
        return Objects.equals(this.metadata, that.metadata) && Objects.equals(this.spec, that.spec);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metadata, spec);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateRuleRequestBody {\n");
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
