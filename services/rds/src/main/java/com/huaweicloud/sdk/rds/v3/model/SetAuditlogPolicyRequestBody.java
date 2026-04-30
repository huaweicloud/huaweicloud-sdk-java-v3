package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SetAuditlogPolicyRequestBody
 */
public class SetAuditlogPolicyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keep_days")

    private Integer keepDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reserve_auditlogs")

    private Boolean reserveAuditlogs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audit_types")

    private List<String> auditTypes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "databases")

    private List<String> databases = null;

    public SetAuditlogPolicyRequestBody withKeepDays(Integer keepDays) {
        this.keepDays = keepDays;
        return this;
    }

    /**
     * 审计日志保存天数，取值范围0~3660。0表示关闭审计日志策略。
     * @return keepDays
     */
    public Integer getKeepDays() {
        return keepDays;
    }

    public void setKeepDays(Integer keepDays) {
        this.keepDays = keepDays;
    }

    public SetAuditlogPolicyRequestBody withReserveAuditlogs(Boolean reserveAuditlogs) {
        this.reserveAuditlogs = reserveAuditlogs;
        return this;
    }

    /**
     * 仅关闭审计日志策略时有效。  - true（默认），表示关闭审计日志策略的同时，延迟删除已有的历史审计日志。 - false，表示关闭审计日志策略的同时，删除已有的历史审计日志。
     * @return reserveAuditlogs
     */
    public Boolean getReserveAuditlogs() {
        return reserveAuditlogs;
    }

    public void setReserveAuditlogs(Boolean reserveAuditlogs) {
        this.reserveAuditlogs = reserveAuditlogs;
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

    /**
     * 审计记录的操作类型，动态范围。空表示不过滤任何操作类型。该参数仅针对RDS for MySQL实例。
     * @return auditTypes
     */
    public List<String> getAuditTypes() {
        return auditTypes;
    }

    public void setAuditTypes(List<String> auditTypes) {
        this.auditTypes = auditTypes;
    }

    public SetAuditlogPolicyRequestBody withDatabases(List<String> databases) {
        this.databases = databases;
        return this;
    }

    public SetAuditlogPolicyRequestBody addDatabasesItem(String databasesItem) {
        if (this.databases == null) {
            this.databases = new ArrayList<>();
        }
        this.databases.add(databasesItem);
        return this;
    }

    public SetAuditlogPolicyRequestBody withDatabases(Consumer<List<String>> databasesSetter) {
        if (this.databases == null) {
            this.databases = new ArrayList<>();
        }
        databasesSetter.accept(this.databases);
        return this;
    }

    /**
     * 仅打开审计日志策略时有效。内容为打开审计日志时需自动安装pg_audit插件的数据库名称。空表示不自动安装。该参数仅针对RDS for PostgreSQL实例。
     * @return databases
     */
    public List<String> getDatabases() {
        return databases;
    }

    public void setDatabases(List<String> databases) {
        this.databases = databases;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SetAuditlogPolicyRequestBody that = (SetAuditlogPolicyRequestBody) obj;
        return Objects.equals(this.keepDays, that.keepDays)
            && Objects.equals(this.reserveAuditlogs, that.reserveAuditlogs)
            && Objects.equals(this.auditTypes, that.auditTypes) && Objects.equals(this.databases, that.databases);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keepDays, reserveAuditlogs, auditTypes, databases);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetAuditlogPolicyRequestBody {\n");
        sb.append("    keepDays: ").append(toIndentedString(keepDays)).append("\n");
        sb.append("    reserveAuditlogs: ").append(toIndentedString(reserveAuditlogs)).append("\n");
        sb.append("    auditTypes: ").append(toIndentedString(auditTypes)).append("\n");
        sb.append("    databases: ").append(toIndentedString(databases)).append("\n");
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
