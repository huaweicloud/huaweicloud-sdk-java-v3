package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class ShowAuditlogPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keep_days")

    private Integer keepDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audit_scope")

    private String auditScope;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audit_types")

    private List<String> auditTypes = null;

    public ShowAuditlogPolicyResponse withKeepDays(Integer keepDays) {
        this.keepDays = keepDays;
        return this;
    }

    /** 审计日志保存天数，审计日志策略关闭时为0。
     * 
     * @return keepDays */
    public Integer getKeepDays() {
        return keepDays;
    }

    public void setKeepDays(Integer keepDays) {
        this.keepDays = keepDays;
    }

    public ShowAuditlogPolicyResponse withAuditScope(String auditScope) {
        this.auditScope = auditScope;
        return this;
    }

    /** 审计范围。
     * 
     * @return auditScope */
    public String getAuditScope() {
        return auditScope;
    }

    public void setAuditScope(String auditScope) {
        this.auditScope = auditScope;
    }

    public ShowAuditlogPolicyResponse withAuditTypes(List<String> auditTypes) {
        this.auditTypes = auditTypes;
        return this;
    }

    public ShowAuditlogPolicyResponse addAuditTypesItem(String auditTypesItem) {
        if (this.auditTypes == null) {
            this.auditTypes = new ArrayList<>();
        }
        this.auditTypes.add(auditTypesItem);
        return this;
    }

    public ShowAuditlogPolicyResponse withAuditTypes(Consumer<List<String>> auditTypesSetter) {
        if (this.auditTypes == null) {
            this.auditTypes = new ArrayList<>();
        }
        auditTypesSetter.accept(this.auditTypes);
        return this;
    }

    /** 审计类型。
     * 
     * @return auditTypes */
    public List<String> getAuditTypes() {
        return auditTypes;
    }

    public void setAuditTypes(List<String> auditTypes) {
        this.auditTypes = auditTypes;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowAuditlogPolicyResponse showAuditlogPolicyResponse = (ShowAuditlogPolicyResponse) o;
        return Objects.equals(this.keepDays, showAuditlogPolicyResponse.keepDays)
            && Objects.equals(this.auditScope, showAuditlogPolicyResponse.auditScope)
            && Objects.equals(this.auditTypes, showAuditlogPolicyResponse.auditTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keepDays, auditScope, auditTypes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAuditlogPolicyResponse {\n");
        sb.append("    keepDays: ").append(toIndentedString(keepDays)).append("\n");
        sb.append("    auditScope: ").append(toIndentedString(auditScope)).append("\n");
        sb.append("    auditTypes: ").append(toIndentedString(auditTypes)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
