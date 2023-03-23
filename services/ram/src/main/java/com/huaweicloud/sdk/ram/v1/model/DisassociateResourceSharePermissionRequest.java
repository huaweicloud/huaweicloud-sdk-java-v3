package com.huaweicloud.sdk.ram.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class DisassociateResourceSharePermissionRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_share_id")

    private String resourceShareId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private DisassociatePermissionReqBody body;

    public DisassociateResourceSharePermissionRequest withResourceShareId(String resourceShareId) {
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

    public DisassociateResourceSharePermissionRequest withBody(DisassociatePermissionReqBody body) {
        this.body = body;
        return this;
    }

    public DisassociateResourceSharePermissionRequest withBody(Consumer<DisassociatePermissionReqBody> bodySetter) {
        if (this.body == null) {
            this.body = new DisassociatePermissionReqBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public DisassociatePermissionReqBody getBody() {
        return body;
    }

    public void setBody(DisassociatePermissionReqBody body) {
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
        DisassociateResourceSharePermissionRequest disassociateResourceSharePermissionRequest =
            (DisassociateResourceSharePermissionRequest) o;
        return Objects.equals(this.resourceShareId, disassociateResourceSharePermissionRequest.resourceShareId)
            && Objects.equals(this.body, disassociateResourceSharePermissionRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceShareId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DisassociateResourceSharePermissionRequest {\n");
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
