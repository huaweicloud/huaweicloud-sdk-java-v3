package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 授权描述
 */
public class Assignment {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_statement_id")

    private String policyStatementId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attach")

    private String attach;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "attach_type")

    private AttachType attachType;

    public Assignment withPolicyStatementId(String policyStatementId) {
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

    public Assignment withAttach(String attach) {
        this.attach = attach;
        return this;
    }

    /**
     * 目标
     * @return attach
     */
    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public Assignment withAttachType(AttachType attachType) {
        this.attachType = attachType;
        return this;
    }

    /**
     * Get attachType
     * @return attachType
     */
    public AttachType getAttachType() {
        return attachType;
    }

    public void setAttachType(AttachType attachType) {
        this.attachType = attachType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Assignment that = (Assignment) obj;
        return Objects.equals(this.policyStatementId, that.policyStatementId)
            && Objects.equals(this.attach, that.attach) && Objects.equals(this.attachType, that.attachType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyStatementId, attach, attachType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Assignment {\n");
        sb.append("    policyStatementId: ").append(toIndentedString(policyStatementId)).append("\n");
        sb.append("    attach: ").append(toIndentedString(attach)).append("\n");
        sb.append("    attachType: ").append(toIndentedString(attachType)).append("\n");
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
