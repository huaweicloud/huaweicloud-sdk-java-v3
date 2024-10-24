package com.huaweicloud.sdk.ram.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class AcceptResourceShareInvitationRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Security-Token")

    private String xSecurityToken;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_share_invitation_id")

    private String resourceShareInvitationId;

    public AcceptResourceShareInvitationRequest withXSecurityToken(String xSecurityToken) {
        this.xSecurityToken = xSecurityToken;
        return this;
    }

    /**
     * 如果正在使用临时安全凭据，则此header是必需的，该值是临时安全凭据的安全令牌（会话令牌）。
     * @return xSecurityToken
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Security-Token")
    public String getXSecurityToken() {
        return xSecurityToken;
    }

    public void setXSecurityToken(String xSecurityToken) {
        this.xSecurityToken = xSecurityToken;
    }

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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AcceptResourceShareInvitationRequest that = (AcceptResourceShareInvitationRequest) obj;
        return Objects.equals(this.xSecurityToken, that.xSecurityToken)
            && Objects.equals(this.resourceShareInvitationId, that.resourceShareInvitationId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xSecurityToken, resourceShareInvitationId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AcceptResourceShareInvitationRequest {\n");
        sb.append("    xSecurityToken: ").append(toIndentedString(xSecurityToken)).append("\n");
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
