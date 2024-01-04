package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 系统审核结果。
 */
public class AuditResultSystemAuditResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audit_time")

    private Long auditTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "errors")

    private List<AuditResultSystemAuditResultErrors> errors = null;

    public AuditResultSystemAuditResult withAuditTime(Long auditTime) {
        this.auditTime = auditTime;
        return this;
    }

    /**
     * 操作时间。
     * minimum: 0
     * maximum: 2147483647
     * @return auditTime
     */
    public Long getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Long auditTime) {
        this.auditTime = auditTime;
    }

    public AuditResultSystemAuditResult withErrors(List<AuditResultSystemAuditResultErrors> errors) {
        this.errors = errors;
        return this;
    }

    public AuditResultSystemAuditResult addErrorsItem(AuditResultSystemAuditResultErrors errorsItem) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        this.errors.add(errorsItem);
        return this;
    }

    public AuditResultSystemAuditResult withErrors(Consumer<List<AuditResultSystemAuditResultErrors>> errorsSetter) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        errorsSetter.accept(this.errors);
        return this;
    }

    /**
     * 错误列表。
     * @return errors
     */
    public List<AuditResultSystemAuditResultErrors> getErrors() {
        return errors;
    }

    public void setErrors(List<AuditResultSystemAuditResultErrors> errors) {
        this.errors = errors;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AuditResultSystemAuditResult that = (AuditResultSystemAuditResult) obj;
        return Objects.equals(this.auditTime, that.auditTime) && Objects.equals(this.errors, that.errors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(auditTime, errors);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuditResultSystemAuditResult {\n");
        sb.append("    auditTime: ").append(toIndentedString(auditTime)).append("\n");
        sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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
