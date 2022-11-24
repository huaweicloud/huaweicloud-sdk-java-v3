package com.huaweicloud.sdk.er.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 关联
 */
public class AssociationRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attachment_id")

    private String attachmentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "route_policy")

    private ExportRoutePolicy routePolicy;

    public AssociationRequestBody withAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
        return this;
    }

    /**
     * 连接唯一标识
     * @return attachmentId
     */
    public String getAttachmentId() {
        return attachmentId;
    }

    public void setAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
    }

    public AssociationRequestBody withRoutePolicy(ExportRoutePolicy routePolicy) {
        this.routePolicy = routePolicy;
        return this;
    }

    public AssociationRequestBody withRoutePolicy(Consumer<ExportRoutePolicy> routePolicySetter) {
        if (this.routePolicy == null) {
            this.routePolicy = new ExportRoutePolicy();
            routePolicySetter.accept(this.routePolicy);
        }

        return this;
    }

    /**
     * Get routePolicy
     * @return routePolicy
     */
    public ExportRoutePolicy getRoutePolicy() {
        return routePolicy;
    }

    public void setRoutePolicy(ExportRoutePolicy routePolicy) {
        this.routePolicy = routePolicy;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AssociationRequestBody associationRequestBody = (AssociationRequestBody) o;
        return Objects.equals(this.attachmentId, associationRequestBody.attachmentId)
            && Objects.equals(this.routePolicy, associationRequestBody.routePolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attachmentId, routePolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssociationRequestBody {\n");
        sb.append("    attachmentId: ").append(toIndentedString(attachmentId)).append("\n");
        sb.append("    routePolicy: ").append(toIndentedString(routePolicy)).append("\n");
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
