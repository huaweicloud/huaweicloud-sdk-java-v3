package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 授权
 */
public class UserAssignment {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attach")

    private String attach;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_statement_id")

    private String policyStatementId;

    public UserAssignment withAttach(String attach) {
        this.attach = attach;
        return this;
    }

    /**
     * 目标用户
     * @return attach
     */
    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public UserAssignment withPolicyStatementId(String policyStatementId) {
        this.policyStatementId = policyStatementId;
        return this;
    }

    /**
     * 策略ID
     * @return policyStatementId
     */
    public String getPolicyStatementId() {
        return policyStatementId;
    }

    public void setPolicyStatementId(String policyStatementId) {
        this.policyStatementId = policyStatementId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UserAssignment that = (UserAssignment) obj;
        return Objects.equals(this.attach, that.attach)
            && Objects.equals(this.policyStatementId, that.policyStatementId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(attach, policyStatementId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserAssignment {\n");
        sb.append("    attach: ").append(toIndentedString(attach)).append("\n");
        sb.append("    policyStatementId: ").append(toIndentedString(policyStatementId)).append("\n");
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
