package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowSingleBackupPolicyInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_type")

    private String operationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operation_definition")

    private OperationDefinitionInfo operationDefinition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger")

    private BackupTriggerInfo trigger;

    public ShowSingleBackupPolicyInfoResponse withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 策略是否启用
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public ShowSingleBackupPolicyInfoResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 策略ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowSingleBackupPolicyInfoResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 策略名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowSingleBackupPolicyInfoResponse withOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }

    /**
     * 备份类型。当前包含如下1种。   - backup ：备份
     * @return operationType
     */
    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public ShowSingleBackupPolicyInfoResponse withOperationDefinition(OperationDefinitionInfo operationDefinition) {
        this.operationDefinition = operationDefinition;
        return this;
    }

    public ShowSingleBackupPolicyInfoResponse withOperationDefinition(
        Consumer<OperationDefinitionInfo> operationDefinitionSetter) {
        if (this.operationDefinition == null) {
            this.operationDefinition = new OperationDefinitionInfo();
            operationDefinitionSetter.accept(this.operationDefinition);
        }

        return this;
    }

    /**
     * Get operationDefinition
     * @return operationDefinition
     */
    public OperationDefinitionInfo getOperationDefinition() {
        return operationDefinition;
    }

    public void setOperationDefinition(OperationDefinitionInfo operationDefinition) {
        this.operationDefinition = operationDefinition;
    }

    public ShowSingleBackupPolicyInfoResponse withTrigger(BackupTriggerInfo trigger) {
        this.trigger = trigger;
        return this;
    }

    public ShowSingleBackupPolicyInfoResponse withTrigger(Consumer<BackupTriggerInfo> triggerSetter) {
        if (this.trigger == null) {
            this.trigger = new BackupTriggerInfo();
            triggerSetter.accept(this.trigger);
        }

        return this;
    }

    /**
     * Get trigger
     * @return trigger
     */
    public BackupTriggerInfo getTrigger() {
        return trigger;
    }

    public void setTrigger(BackupTriggerInfo trigger) {
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
        ShowSingleBackupPolicyInfoResponse that = (ShowSingleBackupPolicyInfoResponse) obj;
        return Objects.equals(this.enabled, that.enabled) && Objects.equals(this.id, that.id)
            && Objects.equals(this.name, that.name) && Objects.equals(this.operationType, that.operationType)
            && Objects.equals(this.operationDefinition, that.operationDefinition)
            && Objects.equals(this.trigger, that.trigger);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enabled, id, name, operationType, operationDefinition, trigger);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowSingleBackupPolicyInfoResponse {\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    operationType: ").append(toIndentedString(operationType)).append("\n");
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
