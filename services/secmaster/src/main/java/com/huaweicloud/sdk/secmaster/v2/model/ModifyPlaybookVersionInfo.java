package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Information of playbook version
 */
public class ModifyPlaybookVersionInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "playbook_id")

    private String playbookId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataclass_id")

    private String dataclassId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_enable")

    private Boolean ruleEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_id")

    private String ruleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_type")

    private String triggerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataobject_create")

    private Boolean dataobjectCreate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataobject_update")

    private Boolean dataobjectUpdate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataobject_delete")

    private Boolean dataobjectDelete;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_strategy")

    private String actionStrategy;

    public ModifyPlaybookVersionInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * The description, display only
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ModifyPlaybookVersionInfo withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 工作空间id
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public ModifyPlaybookVersionInfo withPlaybookId(String playbookId) {
        this.playbookId = playbookId;
        return this;
    }

    /**
     * Playbook id.
     * @return playbookId
     */
    public String getPlaybookId() {
        return playbookId;
    }

    public void setPlaybookId(String playbookId) {
        this.playbookId = playbookId;
    }

    public ModifyPlaybookVersionInfo withDataclassId(String dataclassId) {
        this.dataclassId = dataclassId;
        return this;
    }

    /**
     * dataclass id.
     * @return dataclassId
     */
    public String getDataclassId() {
        return dataclassId;
    }

    public void setDataclassId(String dataclassId) {
        this.dataclassId = dataclassId;
    }

    public ModifyPlaybookVersionInfo withRuleEnable(Boolean ruleEnable) {
        this.ruleEnable = ruleEnable;
        return this;
    }

    /**
     * If the condition filter is enabled.
     * @return ruleEnable
     */
    public Boolean getRuleEnable() {
        return ruleEnable;
    }

    public void setRuleEnable(Boolean ruleEnable) {
        this.ruleEnable = ruleEnable;
    }

    public ModifyPlaybookVersionInfo withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * If is enabled, false for disenabled, true for enabled
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public ModifyPlaybookVersionInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ModifyPlaybookVersionInfo withRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /**
     * 规则ID
     * @return ruleId
     */
    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public ModifyPlaybookVersionInfo withTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }

    /**
     * Strategy of action. event, timer
     * @return triggerType
     */
    public String getTriggerType() {
        return triggerType;
    }

    public void setTriggerType(String triggerType) {
        this.triggerType = triggerType;
    }

    public ModifyPlaybookVersionInfo withDataobjectCreate(Boolean dataobjectCreate) {
        this.dataobjectCreate = dataobjectCreate;
        return this;
    }

    /**
     * if trigger when dataobject is created
     * @return dataobjectCreate
     */
    public Boolean getDataobjectCreate() {
        return dataobjectCreate;
    }

    public void setDataobjectCreate(Boolean dataobjectCreate) {
        this.dataobjectCreate = dataobjectCreate;
    }

    public ModifyPlaybookVersionInfo withDataobjectUpdate(Boolean dataobjectUpdate) {
        this.dataobjectUpdate = dataobjectUpdate;
        return this;
    }

    /**
     * if trigger when dataobject is updated
     * @return dataobjectUpdate
     */
    public Boolean getDataobjectUpdate() {
        return dataobjectUpdate;
    }

    public void setDataobjectUpdate(Boolean dataobjectUpdate) {
        this.dataobjectUpdate = dataobjectUpdate;
    }

    public ModifyPlaybookVersionInfo withDataobjectDelete(Boolean dataobjectDelete) {
        this.dataobjectDelete = dataobjectDelete;
        return this;
    }

    /**
     * if trigger when dataobject is deleted
     * @return dataobjectDelete
     */
    public Boolean getDataobjectDelete() {
        return dataobjectDelete;
    }

    public void setDataobjectDelete(Boolean dataobjectDelete) {
        this.dataobjectDelete = dataobjectDelete;
    }

    public ModifyPlaybookVersionInfo withActionStrategy(String actionStrategy) {
        this.actionStrategy = actionStrategy;
        return this;
    }

    /**
     * Strategy of action. sync or async
     * @return actionStrategy
     */
    public String getActionStrategy() {
        return actionStrategy;
    }

    public void setActionStrategy(String actionStrategy) {
        this.actionStrategy = actionStrategy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModifyPlaybookVersionInfo that = (ModifyPlaybookVersionInfo) obj;
        return Objects.equals(this.description, that.description) && Objects.equals(this.workspaceId, that.workspaceId)
            && Objects.equals(this.playbookId, that.playbookId) && Objects.equals(this.dataclassId, that.dataclassId)
            && Objects.equals(this.ruleEnable, that.ruleEnable) && Objects.equals(this.enabled, that.enabled)
            && Objects.equals(this.status, that.status) && Objects.equals(this.ruleId, that.ruleId)
            && Objects.equals(this.triggerType, that.triggerType)
            && Objects.equals(this.dataobjectCreate, that.dataobjectCreate)
            && Objects.equals(this.dataobjectUpdate, that.dataobjectUpdate)
            && Objects.equals(this.dataobjectDelete, that.dataobjectDelete)
            && Objects.equals(this.actionStrategy, that.actionStrategy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description,
            workspaceId,
            playbookId,
            dataclassId,
            ruleEnable,
            enabled,
            status,
            ruleId,
            triggerType,
            dataobjectCreate,
            dataobjectUpdate,
            dataobjectDelete,
            actionStrategy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyPlaybookVersionInfo {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    playbookId: ").append(toIndentedString(playbookId)).append("\n");
        sb.append("    dataclassId: ").append(toIndentedString(dataclassId)).append("\n");
        sb.append("    ruleEnable: ").append(toIndentedString(ruleEnable)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
        sb.append("    triggerType: ").append(toIndentedString(triggerType)).append("\n");
        sb.append("    dataobjectCreate: ").append(toIndentedString(dataobjectCreate)).append("\n");
        sb.append("    dataobjectUpdate: ").append(toIndentedString(dataobjectUpdate)).append("\n");
        sb.append("    dataobjectDelete: ").append(toIndentedString(dataobjectDelete)).append("\n");
        sb.append("    actionStrategy: ").append(toIndentedString(actionStrategy)).append("\n");
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
