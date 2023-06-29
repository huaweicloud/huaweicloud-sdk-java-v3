package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateEdgeNodeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node")

    private EdgeNodeResp node;

    public UpdateEdgeNodeResponse withNode(EdgeNodeResp node) {
        this.node = node;
        return this;
    }

    public UpdateEdgeNodeResponse withNode(Consumer<EdgeNodeResp> nodeSetter) {
        if (this.node == null) {
            this.node = new EdgeNodeResp();
            nodeSetter.accept(this.node);
        }

        return this;
    }

    /**
     * Get node
     * @return node
     */
    public EdgeNodeResp getNode() {
        return node;
    }

    public void setNode(EdgeNodeResp node) {
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
        UpdateEdgeNodeResponse that = (UpdateEdgeNodeResponse) obj;
        return Objects.equals(this.node, that.node);
    }

    @Override
    public int hashCode() {
        return Objects.hash(node);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateEdgeNodeResponse {\n");
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
