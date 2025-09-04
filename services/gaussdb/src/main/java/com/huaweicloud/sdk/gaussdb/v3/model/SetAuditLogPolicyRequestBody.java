package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SetAuditLogPolicyRequestBody
 */
public class SetAuditLogPolicyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keep_days")

    private Integer keepDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reserve_audit_logs")

    private Boolean reserveAuditLogs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audit_types")

    private List<String> auditTypes = null;

    public SetAuditLogPolicyRequestBody withKeepDays(Integer keepDays) {
        this.keepDays = keepDays;
        return this;
    }

    /**
     * **参数解释**：  审计日志保存天数，0表示关闭审计日志策略。  **约束限制**：  不涉及。  **取值范围**：  0~732。  **默认取值**：  7。
     * @return keepDays
     */
    public Integer getKeepDays() {
        return keepDays;
    }

    public void setKeepDays(Integer keepDays) {
        this.keepDays = keepDays;
    }

    public SetAuditLogPolicyRequestBody withReserveAuditLogs(Boolean reserveAuditLogs) {
        this.reserveAuditLogs = reserveAuditLogs;
        return this;
    }

    /**
     * **参数解释**：  仅关闭审计日志策略时有效。 - true（默认），表示关闭审计日志策略的同时，保留历史审计日志。 - false，表示关闭审计日志策略的同时，删除已有的历史审计日志。  **约束限制**：  不涉及。  **取值范围**：  true|false。  **默认取值**：  true。
     * @return reserveAuditLogs
     */
    public Boolean getReserveAuditLogs() {
        return reserveAuditLogs;
    }

    public void setReserveAuditLogs(Boolean reserveAuditLogs) {
        this.reserveAuditLogs = reserveAuditLogs;
    }

    public SetAuditLogPolicyRequestBody withAuditTypes(List<String> auditTypes) {
        this.auditTypes = auditTypes;
        return this;
    }

    public SetAuditLogPolicyRequestBody addAuditTypesItem(String auditTypesItem) {
        if (this.auditTypes == null) {
            this.auditTypes = new ArrayList<>();
        }
        this.auditTypes.add(auditTypesItem);
        return this;
    }

    public SetAuditLogPolicyRequestBody withAuditTypes(Consumer<List<String>> auditTypesSetter) {
        if (this.auditTypes == null) {
            this.auditTypes = new ArrayList<>();
        }
        auditTypesSetter.accept(this.auditTypes);
        return this;
    }

    /**
     * **参数解释**：  审计记录的操作类型，动态范围。空表示不过滤任何操作类型。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不涉及。
     * @return auditTypes
     */
    public List<String> getAuditTypes() {
        return auditTypes;
    }

    public void setAuditTypes(List<String> auditTypes) {
        this.auditTypes = auditTypes;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetAuditLogPolicyRequestBody that = (SetAuditLogPolicyRequestBody) obj;
        return Objects.equals(this.keepDays, that.keepDays)
            && Objects.equals(this.reserveAuditLogs, that.reserveAuditLogs)
            && Objects.equals(this.auditTypes, that.auditTypes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keepDays, reserveAuditLogs, auditTypes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetAuditLogPolicyRequestBody {\n");
        sb.append("    keepDays: ").append(toIndentedString(keepDays)).append("\n");
        sb.append("    reserveAuditLogs: ").append(toIndentedString(reserveAuditLogs)).append("\n");
        sb.append("    auditTypes: ").append(toIndentedString(auditTypes)).append("\n");
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
