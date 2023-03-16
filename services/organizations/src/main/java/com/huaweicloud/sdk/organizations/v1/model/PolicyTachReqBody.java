package com.huaweicloud.sdk.organizations.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AttachPolicy 和 DetachPolicy 操作的请求体。
 */
public class PolicyTachReqBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entity_id")

    private String entityId;

    public PolicyTachReqBody withEntityId(String entityId) {
        this.entityId = entityId;
        return this;
    }

    /**
     * 根、组织单元或帐号的唯一标识符（ID）。
     * @return entityId
     */
    public String getEntityId() {
        return entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PolicyTachReqBody policyTachReqBody = (PolicyTachReqBody) o;
        return Objects.equals(this.entityId, policyTachReqBody.entityId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(entityId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PolicyTachReqBody {\n");
        sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
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
