package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowJobAuditResultResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "system_audit_result")

    private AuditResultSystemAuditResult systemAuditResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_audit_result")

    private AuditResultAdminAuditResult adminAuditResult;

    public ShowJobAuditResultResponse withSystemAuditResult(AuditResultSystemAuditResult systemAuditResult) {
        this.systemAuditResult = systemAuditResult;
        return this;
    }

    public ShowJobAuditResultResponse withSystemAuditResult(
        Consumer<AuditResultSystemAuditResult> systemAuditResultSetter) {
        if (this.systemAuditResult == null) {
            this.systemAuditResult = new AuditResultSystemAuditResult();
            systemAuditResultSetter.accept(this.systemAuditResult);
        }

        return this;
    }

    /**
     * Get systemAuditResult
     * @return systemAuditResult
     */
    public AuditResultSystemAuditResult getSystemAuditResult() {
        return systemAuditResult;
    }

    public void setSystemAuditResult(AuditResultSystemAuditResult systemAuditResult) {
        this.systemAuditResult = systemAuditResult;
    }

    public ShowJobAuditResultResponse withAdminAuditResult(AuditResultAdminAuditResult adminAuditResult) {
        this.adminAuditResult = adminAuditResult;
        return this;
    }

    public ShowJobAuditResultResponse withAdminAuditResult(
        Consumer<AuditResultAdminAuditResult> adminAuditResultSetter) {
        if (this.adminAuditResult == null) {
            this.adminAuditResult = new AuditResultAdminAuditResult();
            adminAuditResultSetter.accept(this.adminAuditResult);
        }

        return this;
    }

    /**
     * Get adminAuditResult
     * @return adminAuditResult
     */
    public AuditResultAdminAuditResult getAdminAuditResult() {
        return adminAuditResult;
    }

    public void setAdminAuditResult(AuditResultAdminAuditResult adminAuditResult) {
        this.adminAuditResult = adminAuditResult;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowJobAuditResultResponse that = (ShowJobAuditResultResponse) obj;
        return Objects.equals(this.systemAuditResult, that.systemAuditResult)
            && Objects.equals(this.adminAuditResult, that.adminAuditResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(systemAuditResult, adminAuditResult);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowJobAuditResultResponse {\n");
        sb.append("    systemAuditResult: ").append(toIndentedString(systemAuditResult)).append("\n");
        sb.append("    adminAuditResult: ").append(toIndentedString(adminAuditResult)).append("\n");
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
