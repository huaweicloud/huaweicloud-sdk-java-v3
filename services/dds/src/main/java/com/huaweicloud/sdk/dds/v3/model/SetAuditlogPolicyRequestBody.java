package com.huaweicloud.sdk.dds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** SetAuditlogPolicyRequestBody */
public class SetAuditlogPolicyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keep_days")

    private Integer keepDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reserve_auditlogs")

    private String reserveAuditlogs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audit_scope")

    private String auditScope;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audit_types")

    private List<String> auditTypes = null;

    public SetAuditlogPolicyRequestBody withKeepDays(Integer keepDays) {
        this.keepDays = keepDays;
        return this;
    }

    /** 审计日志保存天数，取值范围0，7~732。 - 取值0，表示关闭审计日志策略。 - 取值7~732，表示开启审计日志策略，并设置审计日志保存天数为该值。
     * 
     * @return keepDays */
    public Integer getKeepDays() {
        return keepDays;
    }

    public void setKeepDays(Integer keepDays) {
        this.keepDays = keepDays;
    }

    public SetAuditlogPolicyRequestBody withReserveAuditlogs(String reserveAuditlogs) {
        this.reserveAuditlogs = reserveAuditlogs;
        return this;
    }

    /** 仅关闭审计日志策略时有效。 - true（默认），表示关闭审计日志策略的同时，保留历史审计日志。 - false，表示关闭审计日志策略的同时，删除已有的历史审计日志。
     * 
     * @return reserveAuditlogs */
    public String getReserveAuditlogs() {
        return reserveAuditlogs;
    }

    public void setReserveAuditlogs(String reserveAuditlogs) {
        this.reserveAuditlogs = reserveAuditlogs;
    }

    public SetAuditlogPolicyRequestBody withAuditScope(String auditScope) {
        this.auditScope = auditScope;
        return this;
    }

    /** 仅打开审计日志策略时有效，并且为空时，默认全部。审计范围。请输入数据库或集合名称，多个库或集合请用英文逗号分隔。若名称中有英文逗号，请在逗号前添加“$”符号，用以区分分隔符。
     * 
     * @return auditScope */
    public String getAuditScope() {
        return auditScope;
    }

    public void setAuditScope(String auditScope) {
        this.auditScope = auditScope;
    }

    public SetAuditlogPolicyRequestBody withAuditTypes(List<String> auditTypes) {
        this.auditTypes = auditTypes;
        return this;
    }

    public SetAuditlogPolicyRequestBody addAuditTypesItem(String auditTypesItem) {
        if (this.auditTypes == null) {
            this.auditTypes = new ArrayList<>();
        }
        this.auditTypes.add(auditTypesItem);
        return this;
    }

    public SetAuditlogPolicyRequestBody withAuditTypes(Consumer<List<String>> auditTypesSetter) {
        if (this.auditTypes == null) {
            this.auditTypes = new ArrayList<>();
        }
        auditTypesSetter.accept(this.auditTypes);
        return this;
    }

    /** 仅打开审计日志策略时有效，并且为空时，默认全部。审计类型。支持insert，delete，update，query等。
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
        SetAuditlogPolicyRequestBody setAuditlogPolicyRequestBody = (SetAuditlogPolicyRequestBody) o;
        return Objects.equals(this.keepDays, setAuditlogPolicyRequestBody.keepDays)
            && Objects.equals(this.reserveAuditlogs, setAuditlogPolicyRequestBody.reserveAuditlogs)
            && Objects.equals(this.auditScope, setAuditlogPolicyRequestBody.auditScope)
            && Objects.equals(this.auditTypes, setAuditlogPolicyRequestBody.auditTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keepDays, reserveAuditlogs, auditScope, auditTypes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetAuditlogPolicyRequestBody {\n");
        sb.append("    keepDays: ").append(toIndentedString(keepDays)).append("\n");
        sb.append("    reserveAuditlogs: ").append(toIndentedString(reserveAuditlogs)).append("\n");
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
