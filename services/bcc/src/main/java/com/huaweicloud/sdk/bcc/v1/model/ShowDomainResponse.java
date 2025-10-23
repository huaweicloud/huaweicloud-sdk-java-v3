package com.huaweicloud.sdk.bcc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowDomainResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_sync_finished")

    private Boolean dataSyncFinished;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_sync_percent")

    private Integer dataSyncPercent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_level_created")

    private Boolean resourceLevelCreated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_compliance_rule_created")

    private Boolean backupComplianceRuleCreated;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "backup_compliance_rule_bound")

    private Boolean backupComplianceRuleBound;

    public ShowDomainResponse withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 是否完成启用
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public ShowDomainResponse withDataSyncFinished(Boolean dataSyncFinished) {
        this.dataSyncFinished = dataSyncFinished;
        return this;
    }

    /**
     * 数据是否同步完成
     * @return dataSyncFinished
     */
    public Boolean getDataSyncFinished() {
        return dataSyncFinished;
    }

    public void setDataSyncFinished(Boolean dataSyncFinished) {
        this.dataSyncFinished = dataSyncFinished;
    }

    public ShowDomainResponse withDataSyncPercent(Integer dataSyncPercent) {
        this.dataSyncPercent = dataSyncPercent;
        return this;
    }

    /**
     * 数据同步进度百分比，只有data_sync_finished为false时才有值
     * minimum: 0
     * maximum: 100
     * @return dataSyncPercent
     */
    public Integer getDataSyncPercent() {
        return dataSyncPercent;
    }

    public void setDataSyncPercent(Integer dataSyncPercent) {
        this.dataSyncPercent = dataSyncPercent;
    }

    public ShowDomainResponse withResourceLevelCreated(Boolean resourceLevelCreated) {
        this.resourceLevelCreated = resourceLevelCreated;
        return this;
    }

    /**
     * 是否创建资源等级
     * @return resourceLevelCreated
     */
    public Boolean getResourceLevelCreated() {
        return resourceLevelCreated;
    }

    public void setResourceLevelCreated(Boolean resourceLevelCreated) {
        this.resourceLevelCreated = resourceLevelCreated;
    }

    public ShowDomainResponse withBackupComplianceRuleCreated(Boolean backupComplianceRuleCreated) {
        this.backupComplianceRuleCreated = backupComplianceRuleCreated;
        return this;
    }

    /**
     * 是否创建合规规则
     * @return backupComplianceRuleCreated
     */
    public Boolean getBackupComplianceRuleCreated() {
        return backupComplianceRuleCreated;
    }

    public void setBackupComplianceRuleCreated(Boolean backupComplianceRuleCreated) {
        this.backupComplianceRuleCreated = backupComplianceRuleCreated;
    }

    public ShowDomainResponse withBackupComplianceRuleBound(Boolean backupComplianceRuleBound) {
        this.backupComplianceRuleBound = backupComplianceRuleBound;
        return this;
    }

    /**
     * 是否绑定合规规则
     * @return backupComplianceRuleBound
     */
    public Boolean getBackupComplianceRuleBound() {
        return backupComplianceRuleBound;
    }

    public void setBackupComplianceRuleBound(Boolean backupComplianceRuleBound) {
        this.backupComplianceRuleBound = backupComplianceRuleBound;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDomainResponse that = (ShowDomainResponse) obj;
        return Objects.equals(this.enabled, that.enabled)
            && Objects.equals(this.dataSyncFinished, that.dataSyncFinished)
            && Objects.equals(this.dataSyncPercent, that.dataSyncPercent)
            && Objects.equals(this.resourceLevelCreated, that.resourceLevelCreated)
            && Objects.equals(this.backupComplianceRuleCreated, that.backupComplianceRuleCreated)
            && Objects.equals(this.backupComplianceRuleBound, that.backupComplianceRuleBound);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabled,
            dataSyncFinished,
            dataSyncPercent,
            resourceLevelCreated,
            backupComplianceRuleCreated,
            backupComplianceRuleBound);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDomainResponse {\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    dataSyncFinished: ").append(toIndentedString(dataSyncFinished)).append("\n");
        sb.append("    dataSyncPercent: ").append(toIndentedString(dataSyncPercent)).append("\n");
        sb.append("    resourceLevelCreated: ").append(toIndentedString(resourceLevelCreated)).append("\n");
        sb.append("    backupComplianceRuleCreated: ")
            .append(toIndentedString(backupComplianceRuleCreated))
            .append("\n");
        sb.append("    backupComplianceRuleBound: ").append(toIndentedString(backupComplianceRuleBound)).append("\n");
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
