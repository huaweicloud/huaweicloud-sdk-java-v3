package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateResolverRuleRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resolverrule_id")

    private String resolverruleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateResolverRuleRequestBody body;

    public UpdateResolverRuleRequest withResolverruleId(String resolverruleId) {
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

    public UpdateResolverRuleRequest withBody(UpdateResolverRuleRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdateResolverRuleRequest withBody(Consumer<UpdateResolverRuleRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateResolverRuleRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateResolverRuleRequestBody getBody() {
        return body;
    }

    public void setBody(UpdateResolverRuleRequestBody body) {
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
        UpdateResolverRuleRequest that = (UpdateResolverRuleRequest) obj;
        return Objects.equals(this.resolverruleId, that.resolverruleId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resolverruleId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateResolverRuleRequest {\n");
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
