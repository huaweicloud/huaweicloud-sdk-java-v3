package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * MasterEIPRequest
 */
public class MasterEIPRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private MasterEIPRequestSpec spec;

    public MasterEIPRequest withSpec(MasterEIPRequestSpec spec) {
        this.spec = spec;
        return this;
    }

    public MasterEIPRequest withSpec(Consumer<MasterEIPRequestSpec> specSetter) {
        if (this.spec == null) {
            this.spec = new MasterEIPRequestSpec();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /**
     * Get spec
     * @return spec
     */
    public MasterEIPRequestSpec getSpec() {
        return spec;
    }

    public void setSpec(MasterEIPRequestSpec spec) {
        this.spec = spec;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MasterEIPRequest masterEIPRequest = (MasterEIPRequest) o;
        return Objects.equals(this.spec, masterEIPRequest.spec);
    }

    @Override
    public int hashCode() {
        return Objects.hash(spec);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MasterEIPRequest {\n");
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
