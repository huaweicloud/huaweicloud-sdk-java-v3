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
 * RegisterClusterGroup
 */
public class RegisterClusterGroup implements SdkFormDataBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private RegisterClusterGroupObjectMeta metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private RegisterClusterGroupSpec spec;

    public RegisterClusterGroup withMetadata(RegisterClusterGroupObjectMeta metadata) {
        this.metadata = metadata;
        return this;
    }

    public RegisterClusterGroup withMetadata(Consumer<RegisterClusterGroupObjectMeta> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new RegisterClusterGroupObjectMeta();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public RegisterClusterGroupObjectMeta getMetadata() {
        return metadata;
    }

    public void setMetadata(RegisterClusterGroupObjectMeta metadata) {
        this.metadata = metadata;
    }

    public RegisterClusterGroup withSpec(RegisterClusterGroupSpec spec) {
        this.spec = spec;
        return this;
    }

    public RegisterClusterGroup withSpec(Consumer<RegisterClusterGroupSpec> specSetter) {
        if (this.spec == null) {
            this.spec = new RegisterClusterGroupSpec();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /**
     * Get spec
     * @return spec
     */
    public RegisterClusterGroupSpec getSpec() {
        return spec;
    }

    public void setSpec(RegisterClusterGroupSpec spec) {
        this.spec = spec;
    }

    @Override
    public Map<String, FormDataPart<?>> buildFormData() {
        return new LinkedHashMap<String, FormDataPart<?>>() {

            private static final long serialVersionUID = 1L;
            {
                put("metadata", new FormDataPart<>(metadata));
                if (spec != null) {
                    put("spec", new FormDataPart<>(spec));
                }
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
        RegisterClusterGroup that = (RegisterClusterGroup) obj;
        return Objects.equals(this.metadata, that.metadata) && Objects.equals(this.spec, that.spec);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metadata, spec);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RegisterClusterGroup {\n");
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
