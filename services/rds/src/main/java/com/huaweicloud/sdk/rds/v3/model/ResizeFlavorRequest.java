package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 变更实例规格时必填。
 */
public class ResizeFlavorRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resize_flavor")

    private ResizeFlavorObject resizeFlavor;

    public ResizeFlavorRequest withResizeFlavor(ResizeFlavorObject resizeFlavor) {
        this.resizeFlavor = resizeFlavor;
        return this;
    }

    public ResizeFlavorRequest withResizeFlavor(Consumer<ResizeFlavorObject> resizeFlavorSetter) {
        if (this.resizeFlavor == null) {
            this.resizeFlavor = new ResizeFlavorObject();
            resizeFlavorSetter.accept(this.resizeFlavor);
        }

        return this;
    }

    /**
     * Get resizeFlavor
     * @return resizeFlavor
     */
    public ResizeFlavorObject getResizeFlavor() {
        return resizeFlavor;
    }

    public void setResizeFlavor(ResizeFlavorObject resizeFlavor) {
        this.resizeFlavor = resizeFlavor;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResizeFlavorRequest resizeFlavorRequest = (ResizeFlavorRequest) o;
        return Objects.equals(this.resizeFlavor, resizeFlavorRequest.resizeFlavor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resizeFlavor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResizeFlavorRequest {\n");
        sb.append("    resizeFlavor: ").append(toIndentedString(resizeFlavor)).append("\n");
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
