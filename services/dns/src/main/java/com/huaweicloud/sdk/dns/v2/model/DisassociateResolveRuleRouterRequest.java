package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class DisassociateResolveRuleRouterRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resolverrule_id")

    private String resolverruleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private DisassociaterouterReq body;

    public DisassociateResolveRuleRouterRequest withResolverruleId(String resolverruleId) {
        this.resolverruleId = resolverruleId;
        return this;
    }

    /**
     * 待解关联resolverrule的ID。
     * @return resolverruleId
     */
    public String getResolverruleId() {
        return resolverruleId;
    }

    public void setResolverruleId(String resolverruleId) {
        this.resolverruleId = resolverruleId;
    }

    public DisassociateResolveRuleRouterRequest withBody(DisassociaterouterReq body) {
        this.body = body;
        return this;
    }

    public DisassociateResolveRuleRouterRequest withBody(Consumer<DisassociaterouterReq> bodySetter) {
        if (this.body == null) {
            this.body = new DisassociaterouterReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public DisassociaterouterReq getBody() {
        return body;
    }

    public void setBody(DisassociaterouterReq body) {
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
        DisassociateResolveRuleRouterRequest disassociateResolveRuleRouterRequest =
            (DisassociateResolveRuleRouterRequest) o;
        return Objects.equals(this.resolverruleId, disassociateResolveRuleRouterRequest.resolverruleId)
            && Objects.equals(this.body, disassociateResolveRuleRouterRequest.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resolverruleId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DisassociateResolveRuleRouterRequest {\n");
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
