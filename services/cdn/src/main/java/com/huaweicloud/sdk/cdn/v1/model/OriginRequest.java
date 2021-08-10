package com.huaweicloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** OriginRequest */
public class OriginRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "origin")

    private ResourceBody origin;

    public OriginRequest withOrigin(ResourceBody origin) {
        this.origin = origin;
        return this;
    }

    public OriginRequest withOrigin(Consumer<ResourceBody> originSetter) {
        if (this.origin == null) {
            this.origin = new ResourceBody();
            originSetter.accept(this.origin);
        }

        return this;
    }

    /** Get origin
     * 
     * @return origin */
    public ResourceBody getOrigin() {
        return origin;
    }

    public void setOrigin(ResourceBody origin) {
        this.origin = origin;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OriginRequest originRequest = (OriginRequest) o;
        return Objects.equals(this.origin, originRequest.origin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(origin);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OriginRequest {\n");
        sb.append("    origin: ").append(toIndentedString(origin)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
