package com.huaweicloud.sdk.ga.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteEndpointGroupRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_group_id")

    private String endpointGroupId;

    public DeleteEndpointGroupRequest withEndpointGroupId(String endpointGroupId) {
        this.endpointGroupId = endpointGroupId;
        return this;
    }

    /**
     * 终端节点组ID。
     * @return endpointGroupId
     */
    public String getEndpointGroupId() {
        return endpointGroupId;
    }

    public void setEndpointGroupId(String endpointGroupId) {
        this.endpointGroupId = endpointGroupId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteEndpointGroupRequest that = (DeleteEndpointGroupRequest) obj;
        return Objects.equals(this.endpointGroupId, that.endpointGroupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endpointGroupId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteEndpointGroupRequest {\n");
        sb.append("    endpointGroupId: ").append(toIndentedString(endpointGroupId)).append("\n");
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
