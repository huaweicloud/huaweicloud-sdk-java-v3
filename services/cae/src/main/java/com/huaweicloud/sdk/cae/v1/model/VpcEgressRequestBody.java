package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * VpcEgressRequestBody
 */
public class VpcEgressRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_version")

    private ApiVersionObj apiVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "kind")

    private VpcEgressKindObj kind;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private VpcEgressRequestBodySpec spec;

    public VpcEgressRequestBody withApiVersion(ApiVersionObj apiVersion) {
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

    public VpcEgressRequestBody withKind(VpcEgressKindObj kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get kind
     * @return kind
     */
    public VpcEgressKindObj getKind() {
        return kind;
    }

    public void setKind(VpcEgressKindObj kind) {
        this.kind = kind;
    }

    public VpcEgressRequestBody withSpec(VpcEgressRequestBodySpec spec) {
        this.spec = spec;
        return this;
    }

    public VpcEgressRequestBody withSpec(Consumer<VpcEgressRequestBodySpec> specSetter) {
        if (this.spec == null) {
            this.spec = new VpcEgressRequestBodySpec();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /**
     * Get spec
     * @return spec
     */
    public VpcEgressRequestBodySpec getSpec() {
        return spec;
    }

    public void setSpec(VpcEgressRequestBodySpec spec) {
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
        VpcEgressRequestBody that = (VpcEgressRequestBody) obj;
        return Objects.equals(this.apiVersion, that.apiVersion) && Objects.equals(this.kind, that.kind)
            && Objects.equals(this.spec, that.spec);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apiVersion, kind, spec);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VpcEgressRequestBody {\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
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
