package com.huaweicloud.sdk.ram.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class AcceptResourceShareInvitationRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_share_invitation_id")

    private String resourceShareInvitationId;

    public AcceptResourceShareInvitationRequest withResourceShareInvitationId(String resourceShareInvitationId) {
        this.resourceShareInvitationId = resourceShareInvitationId;
        return this;
    }

    /**
     * 资源共享邀请的ID。
     * @return resourceShareInvitationId
     */
    public String getResourceShareInvitationId() {
        return resourceShareInvitationId;
    }

    public void setResourceShareInvitationId(String resourceShareInvitationId) {
        this.resourceShareInvitationId = resourceShareInvitationId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AcceptResourceShareInvitationRequest acceptResourceShareInvitationRequest =
            (AcceptResourceShareInvitationRequest) o;
        return Objects.equals(this.resourceShareInvitationId,
            acceptResourceShareInvitationRequest.resourceShareInvitationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceShareInvitationId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AcceptResourceShareInvitationRequest {\n");
        sb.append("    resourceShareInvitationId: ").append(toIndentedString(resourceShareInvitationId)).append("\n");
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
