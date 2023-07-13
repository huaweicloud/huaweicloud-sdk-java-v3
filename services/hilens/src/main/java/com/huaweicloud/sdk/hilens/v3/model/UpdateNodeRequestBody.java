package com.huaweicloud.sdk.hilens.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateNodeRequestBody
 */
public class UpdateNodeRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node")

    private UpdateNodeReqDetail node;

    public UpdateNodeRequestBody withNode(UpdateNodeReqDetail node) {
        this.node = node;
        return this;
    }

    public UpdateNodeRequestBody withNode(Consumer<UpdateNodeReqDetail> nodeSetter) {
        if (this.node == null) {
            this.node = new UpdateNodeReqDetail();
            nodeSetter.accept(this.node);
        }

        return this;
    }

    /**
     * Get node
     * @return node
     */
    public UpdateNodeReqDetail getNode() {
        return node;
    }

    public void setNode(UpdateNodeReqDetail node) {
        this.node = node;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateNodeRequestBody that = (UpdateNodeRequestBody) obj;
        return Objects.equals(this.node, that.node);
    }

    @Override
    public int hashCode() {
        return Objects.hash(node);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateNodeRequestBody {\n");
        sb.append("    node: ").append(toIndentedString(node)).append("\n");
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
