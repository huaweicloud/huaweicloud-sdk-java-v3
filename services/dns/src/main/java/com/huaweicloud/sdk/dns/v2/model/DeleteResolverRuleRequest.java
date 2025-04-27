package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteResolverRuleRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resolverrule_id")

    private String resolverruleId;

    public DeleteResolverRuleRequest withResolverruleId(String resolverruleId) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteResolverRuleRequest that = (DeleteResolverRuleRequest) obj;
        return Objects.equals(this.resolverruleId, that.resolverruleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resolverruleId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteResolverRuleRequest {\n");
        sb.append("    resolverruleId: ").append(toIndentedString(resolverruleId)).append("\n");
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
