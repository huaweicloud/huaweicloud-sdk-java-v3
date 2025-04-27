package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class DisassociateResolverRuleRouterRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resolverrule_id")

    private String resolverruleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private AssociateOrDisassociateRouterWithRuleRequestBody body;

    public DisassociateResolverRuleRouterRequest withResolverruleId(String resolverruleId) {
        this.resolverruleId = resolverruleId;
        return this;
    }

    /**
     * 转发规则ID。
     * @return resolverruleId
     */
    public String getResolverruleId() {
        return resolverruleId;
    }

    public void setResolverruleId(String resolverruleId) {
        this.resolverruleId = resolverruleId;
    }

    public DisassociateResolverRuleRouterRequest withBody(AssociateOrDisassociateRouterWithRuleRequestBody body) {
        this.body = body;
        return this;
    }

    public DisassociateResolverRuleRouterRequest withBody(
        Consumer<AssociateOrDisassociateRouterWithRuleRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new AssociateOrDisassociateRouterWithRuleRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public AssociateOrDisassociateRouterWithRuleRequestBody getBody() {
        return body;
    }

    public void setBody(AssociateOrDisassociateRouterWithRuleRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DisassociateResolverRuleRouterRequest that = (DisassociateResolverRuleRouterRequest) obj;
        return Objects.equals(this.resolverruleId, that.resolverruleId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resolverruleId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DisassociateResolverRuleRouterRequest {\n");
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
