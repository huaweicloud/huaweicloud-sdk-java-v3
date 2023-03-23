package com.huaweicloud.sdk.ram.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class AssociateResourceSharePermissionRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_share_id")

    private String resourceShareId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private AssociatePermissionReqBody body;

    public AssociateResourceSharePermissionRequest withResourceShareId(String resourceShareId) {
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

    public AssociateResourceSharePermissionRequest withBody(AssociatePermissionReqBody body) {
        this.body = body;
        return this;
    }

    public AssociateResourceSharePermissionRequest withBody(Consumer<AssociatePermissionReqBody> bodySetter) {
        if (this.body == null) {
            this.body = new AssociatePermissionReqBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public AssociatePermissionReqBody getBody() {
        return body;
    }

    public void setBody(AssociatePermissionReqBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AssociateResourceSharePermissionRequest associateResourceSharePermissionRequest =
            (AssociateResourceSharePermissionRequest) o;
        return Objects.equals(this.resourceShareId, associateResourceSharePermissionRequest.resourceShareId)
            && Objects.equals(this.body, associateResourceSharePermissionRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceShareId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssociateResourceSharePermissionRequest {\n");
        sb.append("    resourceShareId: ").append(toIndentedString(resourceShareId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
