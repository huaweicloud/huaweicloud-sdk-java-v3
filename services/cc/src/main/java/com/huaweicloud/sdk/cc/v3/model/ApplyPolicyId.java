package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ApplyPolicyId
 */
public class ApplyPolicyId {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apply_policy_id")

    private String applyPolicyId;

    public ApplyPolicyId withApplyPolicyId(String applyPolicyId) {
        this.applyPolicyId = applyPolicyId;
        return this;
    }

    /**
     * 应用策略ID。
     * @return applyPolicyId
     */
    public String getApplyPolicyId() {
        return applyPolicyId;
    }

    public void setApplyPolicyId(String applyPolicyId) {
        this.applyPolicyId = applyPolicyId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApplyPolicyId that = (ApplyPolicyId) obj;
        return Objects.equals(this.applyPolicyId, that.applyPolicyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(applyPolicyId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplyPolicyId {\n");
        sb.append("    applyPolicyId: ").append(toIndentedString(applyPolicyId)).append("\n");
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
