package com.huaweicloud.sdk.sdrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 保护实例变更规格请求体
 */
public class ResizeProtectedInstanceRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resize")

    private ResizeProtectedInstanceRequestParams resize;

    public ResizeProtectedInstanceRequestBody withResize(ResizeProtectedInstanceRequestParams resize) {
        this.resize = resize;
        return this;
    }

    public ResizeProtectedInstanceRequestBody withResize(Consumer<ResizeProtectedInstanceRequestParams> resizeSetter) {
        if (this.resize == null) {
            this.resize = new ResizeProtectedInstanceRequestParams();
            resizeSetter.accept(this.resize);
        }

        return this;
    }

    /**
     * Get resize
     * @return resize
     */
    public ResizeProtectedInstanceRequestParams getResize() {
        return resize;
    }

    public void setResize(ResizeProtectedInstanceRequestParams resize) {
        this.resize = resize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResizeProtectedInstanceRequestBody that = (ResizeProtectedInstanceRequestBody) obj;
        return Objects.equals(this.resize, that.resize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResizeProtectedInstanceRequestBody {\n");
        sb.append("    resize: ").append(toIndentedString(resize)).append("\n");
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
