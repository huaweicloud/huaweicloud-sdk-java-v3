package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * OpenAPIResponseSpec
 */
public class OpenAPIResponseSpec {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private OpenAPIResponseSpecSpec spec;

    public OpenAPIResponseSpec withSpec(OpenAPIResponseSpecSpec spec) {
        this.spec = spec;
        return this;
    }

    public OpenAPIResponseSpec withSpec(Consumer<OpenAPIResponseSpecSpec> specSetter) {
        if (this.spec == null) {
            this.spec = new OpenAPIResponseSpecSpec();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /**
     * Get spec
     * @return spec
     */
    public OpenAPIResponseSpecSpec getSpec() {
        return spec;
    }

    public void setSpec(OpenAPIResponseSpecSpec spec) {
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
        OpenAPIResponseSpec that = (OpenAPIResponseSpec) obj;
        return Objects.equals(this.spec, that.spec);
    }

    @Override
    public int hashCode() {
        return Objects.hash(spec);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OpenAPIResponseSpec {\n");
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
