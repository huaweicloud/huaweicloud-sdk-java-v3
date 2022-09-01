package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * RestoreToExistingInstanceRequestBody
 */
public class RestoreToExistingInstanceRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    @JacksonXmlProperty(localName = "source")

    private RestoreToExistingInstanceRequestBodySource source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target")

    @JacksonXmlProperty(localName = "target")

    private RestoreToExistingInstanceRequestBodyTarget target;

    public RestoreToExistingInstanceRequestBody withSource(RestoreToExistingInstanceRequestBodySource source) {
        this.source = source;
        return this;
    }

    public RestoreToExistingInstanceRequestBody withSource(
        Consumer<RestoreToExistingInstanceRequestBodySource> sourceSetter) {
        if (this.source == null) {
            this.source = new RestoreToExistingInstanceRequestBodySource();
            sourceSetter.accept(this.source);
        }

        return this;
    }

    /**
     * Get source
     * @return source
     */
    public RestoreToExistingInstanceRequestBodySource getSource() {
        return source;
    }

    public void setSource(RestoreToExistingInstanceRequestBodySource source) {
        this.source = source;
    }

    public RestoreToExistingInstanceRequestBody withTarget(RestoreToExistingInstanceRequestBodyTarget target) {
        this.target = target;
        return this;
    }

    public RestoreToExistingInstanceRequestBody withTarget(
        Consumer<RestoreToExistingInstanceRequestBodyTarget> targetSetter) {
        if (this.target == null) {
            this.target = new RestoreToExistingInstanceRequestBodyTarget();
            targetSetter.accept(this.target);
        }

        return this;
    }

    /**
     * Get target
     * @return target
     */
    public RestoreToExistingInstanceRequestBodyTarget getTarget() {
        return target;
    }

    public void setTarget(RestoreToExistingInstanceRequestBodyTarget target) {
        this.target = target;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RestoreToExistingInstanceRequestBody restoreToExistingInstanceRequestBody =
            (RestoreToExistingInstanceRequestBody) o;
        return Objects.equals(this.source, restoreToExistingInstanceRequestBody.source)
            && Objects.equals(this.target, restoreToExistingInstanceRequestBody.target);
    }

    @Override
    public int hashCode() {
        return Objects.hash(source, target);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestoreToExistingInstanceRequestBody {\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    target: ").append(toIndentedString(target)).append("\n");
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
