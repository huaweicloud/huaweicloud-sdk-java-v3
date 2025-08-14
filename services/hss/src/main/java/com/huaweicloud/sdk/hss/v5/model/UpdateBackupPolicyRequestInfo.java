package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 备份策略
 */
public class UpdateBackupPolicyRequestInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_id")

    private String policyId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_definition")

    private OperationDefinitionRequestInfo operationDefinition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger")

    private BackupTriggerRequestInfo trigger;

    public UpdateBackupPolicyRequestInfo withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * **参数解释**: 策略是否启用 **约束限制**: 不涉及 **取值范围**: - true ：策略已启用 - false：策略未启用 **默认取值**: true 
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public UpdateBackupPolicyRequestInfo withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * **参数解释**: 策略ID，若开启防护时开启备份防护，该字段必选。您可以通过[2.7 查询HSS存储库绑定的备份策略信息](ShowBackupPolicyInfo.xml)接口获取ID。 **约束限制**: 不涉及 **取值范围**: 字符长度1-256 **默认取值**: 不涉及 
     * @return policyId
     */
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public UpdateBackupPolicyRequestInfo withOperationDefinition(OperationDefinitionRequestInfo operationDefinition) {
        this.operationDefinition = operationDefinition;
        return this;
    }

    public UpdateBackupPolicyRequestInfo withOperationDefinition(
        Consumer<OperationDefinitionRequestInfo> operationDefinitionSetter) {
        if (this.operationDefinition == null) {
            this.operationDefinition = new OperationDefinitionRequestInfo();
            operationDefinitionSetter.accept(this.operationDefinition);
        }

        return this;
    }

    /**
     * Get operationDefinition
     * @return operationDefinition
     */
    public OperationDefinitionRequestInfo getOperationDefinition() {
        return operationDefinition;
    }

    public void setOperationDefinition(OperationDefinitionRequestInfo operationDefinition) {
        this.operationDefinition = operationDefinition;
    }

    public UpdateBackupPolicyRequestInfo withTrigger(BackupTriggerRequestInfo trigger) {
        this.trigger = trigger;
        return this;
    }

    public UpdateBackupPolicyRequestInfo withTrigger(Consumer<BackupTriggerRequestInfo> triggerSetter) {
        if (this.trigger == null) {
            this.trigger = new BackupTriggerRequestInfo();
            triggerSetter.accept(this.trigger);
        }

        return this;
    }

    /**
     * Get trigger
     * @return trigger
     */
    public BackupTriggerRequestInfo getTrigger() {
        return trigger;
    }

    public void setTrigger(BackupTriggerRequestInfo trigger) {
        this.trigger = trigger;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateBackupPolicyRequestInfo that = (UpdateBackupPolicyRequestInfo) obj;
        return Objects.equals(this.enabled, that.enabled) && Objects.equals(this.policyId, that.policyId)
            && Objects.equals(this.operationDefinition, that.operationDefinition)
            && Objects.equals(this.trigger, that.trigger);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabled, policyId, operationDefinition, trigger);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateBackupPolicyRequestInfo {\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    operationDefinition: ").append(toIndentedString(operationDefinition)).append("\n");
        sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
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
