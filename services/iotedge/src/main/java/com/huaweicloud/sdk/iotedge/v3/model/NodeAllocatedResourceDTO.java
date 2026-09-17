package com.huaweicloud.sdk.iotedge.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 节点已分配资源详情
 */
public class NodeAllocatedResourceDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request")

    private NodeResourceDTO request;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private NodeResourceDTO limit;

    public NodeAllocatedResourceDTO withRequest(NodeResourceDTO request) {
        this.request = request;
        return this;
    }

    public NodeAllocatedResourceDTO withRequest(Consumer<NodeResourceDTO> requestSetter) {
        if (this.request == null) {
            this.request = new NodeResourceDTO();
            requestSetter.accept(this.request);
        }

        return this;
    }

    /**
     * Get request
     * @return request
     */
    public NodeResourceDTO getRequest() {
        return request;
    }

    public void setRequest(NodeResourceDTO request) {
        this.request = request;
    }

    public NodeAllocatedResourceDTO withLimit(NodeResourceDTO limit) {
        this.limit = limit;
        return this;
    }

    public NodeAllocatedResourceDTO withLimit(Consumer<NodeResourceDTO> limitSetter) {
        if (this.limit == null) {
            this.limit = new NodeResourceDTO();
            limitSetter.accept(this.limit);
        }

        return this;
    }

    /**
     * Get limit
     * @return limit
     */
    public NodeResourceDTO getLimit() {
        return limit;
    }

    public void setLimit(NodeResourceDTO limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeAllocatedResourceDTO that = (NodeAllocatedResourceDTO) obj;
        return Objects.equals(this.request, that.request) && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(request, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeAllocatedResourceDTO {\n");
        sb.append("    request: ").append(toIndentedString(request)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
