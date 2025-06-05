package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 备份策略
 */
public class UpdateBackupPolicyRequestInfo1 {

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

    private BackupTriggerRequestInfo1 trigger;

    public UpdateBackupPolicyRequestInfo1 withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * **参数解释**: 策略是否启用，缺省值：true **约束限制**: 不涉及 **取值范围**: true或者false **默认取值**: true 
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public UpdateBackupPolicyRequestInfo1 withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * **参数解释**: 策略ID,若开启防护时开启备份防护，该字段必选 **约束限制**: 不涉及 **取值范围**: 字符长度1-256 **默认取值**: 不涉及 
     * @return policyId
     */
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public UpdateBackupPolicyRequestInfo1 withOperationDefinition(OperationDefinitionRequestInfo operationDefinition) {
        this.operationDefinition = operationDefinition;
        return this;
    }

    public UpdateBackupPolicyRequestInfo1 withOperationDefinition(
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

    public UpdateBackupPolicyRequestInfo1 withTrigger(BackupTriggerRequestInfo1 trigger) {
        this.trigger = trigger;
        return this;
    }

    public UpdateBackupPolicyRequestInfo1 withTrigger(Consumer<BackupTriggerRequestInfo1> triggerSetter) {
        if (this.trigger == null) {
            this.trigger = new BackupTriggerRequestInfo1();
            triggerSetter.accept(this.trigger);
        }

        return this;
    }

    /**
     * Get trigger
     * @return trigger
     */
    public BackupTriggerRequestInfo1 getTrigger() {
        return trigger;
    }

    public void setTrigger(BackupTriggerRequestInfo1 trigger) {
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
        UpdateBackupPolicyRequestInfo1 that = (UpdateBackupPolicyRequestInfo1) obj;
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
        sb.append("class UpdateBackupPolicyRequestInfo1 {\n");
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
