package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowAuditLogPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keep_days")

    private Integer keepDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audit_types")

    private List<String> auditTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "all_audit_log_action")

    private String allAuditLogAction;

    public ShowAuditLogPolicyResponse withKeepDays(Integer keepDays) {
        this.keepDays = keepDays;
        return this;
    }

    /**
     * **参数解释**：  审计日志保存天数，0表示关闭审计日志策略。   **取值范围**：  0~732。
     * @return keepDays
     */
    public Integer getKeepDays() {
        return keepDays;
    }

    public void setKeepDays(Integer keepDays) {
        this.keepDays = keepDays;
    }

    public ShowAuditLogPolicyResponse withAuditTypes(List<String> auditTypes) {
        this.auditTypes = auditTypes;
        return this;
    }

    public ShowAuditLogPolicyResponse addAuditTypesItem(String auditTypesItem) {
        if (this.auditTypes == null) {
            this.auditTypes = new ArrayList<>();
        }
        this.auditTypes.add(auditTypesItem);
        return this;
    }

    public ShowAuditLogPolicyResponse withAuditTypes(Consumer<List<String>> auditTypesSetter) {
        if (this.auditTypes == null) {
            this.auditTypes = new ArrayList<>();
        }
        auditTypesSetter.accept(this.auditTypes);
        return this;
    }

    /**
     * **参数解释**：  审计记录的操作类型。空表示不过滤任何操作类型。  **取值范围**：  动态范围。
     * @return auditTypes
     */
    public List<String> getAuditTypes() {
        return auditTypes;
    }

    public void setAuditTypes(List<String> auditTypes) {
        this.auditTypes = auditTypes;
    }

    public ShowAuditLogPolicyResponse withAllAuditLogAction(String allAuditLogAction) {
        this.allAuditLogAction = allAuditLogAction;
        return this;
    }

    /**
     * **参数解释**：  审计记录的操作类型。空表示不过滤任何操作类型。  **取值范围**：  不涉及
     * @return allAuditLogAction
     */
    public String getAllAuditLogAction() {
        return allAuditLogAction;
    }

    public void setAllAuditLogAction(String allAuditLogAction) {
        this.allAuditLogAction = allAuditLogAction;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAuditLogPolicyResponse that = (ShowAuditLogPolicyResponse) obj;
        return Objects.equals(this.keepDays, that.keepDays) && Objects.equals(this.auditTypes, that.auditTypes)
            && Objects.equals(this.allAuditLogAction, that.allAuditLogAction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keepDays, auditTypes, allAuditLogAction);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAuditLogPolicyResponse {\n");
        sb.append("    keepDays: ").append(toIndentedString(keepDays)).append("\n");
        sb.append("    auditTypes: ").append(toIndentedString(auditTypes)).append("\n");
        sb.append("    allAuditLogAction: ").append(toIndentedString(allAuditLogAction)).append("\n");
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
