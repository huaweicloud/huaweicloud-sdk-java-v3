package com.huaweicloud.sdk.sfsturbo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ExpandShareRequestBody
 */
public class ExpandShareRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extend")

    private Extend extend;

    public ExpandShareRequestBody withExtend(Extend extend) {
        this.extend = extend;
        return this;
    }

    public ExpandShareRequestBody withExtend(Consumer<Extend> extendSetter) {
        if (this.extend == null) {
            this.extend = new Extend();
            extendSetter.accept(this.extend);
        }

        return this;
    }

    /**
     * Get extend
     * @return extend
     */
    public Extend getExtend() {
        return extend;
    }

    public void setExtend(Extend extend) {
        this.extend = extend;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExpandShareRequestBody expandShareRequestBody = (ExpandShareRequestBody) o;
        return Objects.equals(this.extend, expandShareRequestBody.extend);
    }

    @Override
    public int hashCode() {
        return Objects.hash(extend);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExpandShareRequestBody {\n");
        sb.append("    extend: ").append(toIndentedString(extend)).append("\n");
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
