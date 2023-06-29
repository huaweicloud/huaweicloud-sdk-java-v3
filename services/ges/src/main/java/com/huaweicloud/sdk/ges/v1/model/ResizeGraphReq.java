package com.huaweicloud.sdk.ges.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ResizeGraphReq
 */
public class ResizeGraphReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resize")

    private GraphSizeTypeIndexReq resize;

    public ResizeGraphReq withResize(GraphSizeTypeIndexReq resize) {
        this.resize = resize;
        return this;
    }

    public ResizeGraphReq withResize(Consumer<GraphSizeTypeIndexReq> resizeSetter) {
        if (this.resize == null) {
            this.resize = new GraphSizeTypeIndexReq();
            resizeSetter.accept(this.resize);
        }

        return this;
    }

    /**
     * Get resize
     * @return resize
     */
    public GraphSizeTypeIndexReq getResize() {
        return resize;
    }

    public void setResize(GraphSizeTypeIndexReq resize) {
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
        ResizeGraphReq that = (ResizeGraphReq) obj;
        return Objects.equals(this.resize, that.resize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResizeGraphReq {\n");
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
