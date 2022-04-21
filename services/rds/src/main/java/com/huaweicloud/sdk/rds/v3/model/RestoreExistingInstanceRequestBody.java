package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * RestoreExistingInstanceRequestBody
 */
public class RestoreExistingInstanceRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private RestoreExistingInstanceRequestBodySource source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target")

    private RestoreToExistingInstanceRequestBodyTarget target;

    public RestoreExistingInstanceRequestBody withSource(RestoreExistingInstanceRequestBodySource source) {
        this.source = source;
        return this;
    }

    public RestoreExistingInstanceRequestBody withSource(
        Consumer<RestoreExistingInstanceRequestBodySource> sourceSetter) {
        if (this.source == null) {
            this.source = new RestoreExistingInstanceRequestBodySource();
            sourceSetter.accept(this.source);
        }

        return this;
    }

    /**
     * Get source
     * @return source
     */
    public RestoreExistingInstanceRequestBodySource getSource() {
        return source;
    }

    public void setSource(RestoreExistingInstanceRequestBodySource source) {
        this.source = source;
    }

    public RestoreExistingInstanceRequestBody withTarget(RestoreToExistingInstanceRequestBodyTarget target) {
        this.target = target;
        return this;
    }

    public RestoreExistingInstanceRequestBody withTarget(
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
        RestoreExistingInstanceRequestBody restoreExistingInstanceRequestBody = (RestoreExistingInstanceRequestBody) o;
        return Objects.equals(this.source, restoreExistingInstanceRequestBody.source)
            && Objects.equals(this.target, restoreExistingInstanceRequestBody.target);
    }

    @Override
    public int hashCode() {
        return Objects.hash(source, target);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestoreExistingInstanceRequestBody {\n");
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
