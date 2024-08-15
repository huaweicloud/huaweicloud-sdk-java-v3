package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AuthorizableTicketBody
 */
public class AuthorizableTicketBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope_id")

    private String scopeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_id")

    private String targetId;

    public AuthorizableTicketBody withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 可授权单类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public AuthorizableTicketBody withScopeId(String scopeId) {
        this.scopeId = scopeId;
        return this;
    }

    /**
     * scope ID，一般为region id
     * @return scopeId
     */
    public String getScopeId() {
        return scopeId;
    }

    public void setScopeId(String scopeId) {
        this.scopeId = scopeId;
    }

    public AuthorizableTicketBody withTargetId(String targetId) {
        this.targetId = targetId;
        return this;
    }

    /**
     * 目标 ID，一般为应用id
     * @return targetId
     */
    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetId) {
        this.targetId = targetId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AuthorizableTicketBody that = (AuthorizableTicketBody) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.scopeId, that.scopeId)
            && Objects.equals(this.targetId, that.targetId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, scopeId, targetId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuthorizableTicketBody {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    scopeId: ").append(toIndentedString(scopeId)).append("\n");
        sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
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
