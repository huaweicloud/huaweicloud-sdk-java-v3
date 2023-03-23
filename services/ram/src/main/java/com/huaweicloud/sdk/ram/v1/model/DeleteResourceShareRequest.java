package com.huaweicloud.sdk.ram.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteResourceShareRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_share_id")

    private String resourceShareId;

    public DeleteResourceShareRequest withResourceShareId(String resourceShareId) {
        this.resourceShareId = resourceShareId;
        return this;
    }

    /**
     * 资源共享实例的ID。
     * @return resourceShareId
     */
    public String getResourceShareId() {
        return resourceShareId;
    }

    public void setResourceShareId(String resourceShareId) {
        this.resourceShareId = resourceShareId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteResourceShareRequest deleteResourceShareRequest = (DeleteResourceShareRequest) o;
        return Objects.equals(this.resourceShareId, deleteResourceShareRequest.resourceShareId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceShareId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteResourceShareRequest {\n");
        sb.append("    resourceShareId: ").append(toIndentedString(resourceShareId)).append("\n");
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
