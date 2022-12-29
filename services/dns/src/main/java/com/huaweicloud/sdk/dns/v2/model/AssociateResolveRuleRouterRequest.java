package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class AssociateResolveRuleRouterRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resolverrule_id")

    private String resolverruleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private AssociateRouterReq body;

    public AssociateResolveRuleRouterRequest withResolverruleId(String resolverruleId) {
        this.resolverruleId = resolverruleId;
        return this;
    }

    /**
     * 关联VPC的resolverrule的ID。
     * @return resolverruleId
     */
    public String getResolverruleId() {
        return resolverruleId;
    }

    public void setResolverruleId(String resolverruleId) {
        this.resolverruleId = resolverruleId;
    }

    public AssociateResolveRuleRouterRequest withBody(AssociateRouterReq body) {
        this.body = body;
        return this;
    }

    public AssociateResolveRuleRouterRequest withBody(Consumer<AssociateRouterReq> bodySetter) {
        if (this.body == null) {
            this.body = new AssociateRouterReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public AssociateRouterReq getBody() {
        return body;
    }

    public void setBody(AssociateRouterReq body) {
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
        AssociateResolveRuleRouterRequest associateResolveRuleRouterRequest = (AssociateResolveRuleRouterRequest) o;
        return Objects.equals(this.resolverruleId, associateResolveRuleRouterRequest.resolverruleId)
            && Objects.equals(this.body, associateResolveRuleRouterRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resolverruleId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssociateResolveRuleRouterRequest {\n");
        sb.append("    resolverruleId: ").append(toIndentedString(resolverruleId)).append("\n");
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
