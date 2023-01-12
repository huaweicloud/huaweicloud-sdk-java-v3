package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Information of playbook version
 */
public class CreatePlaybookVersionInfo {

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
    @JsonProperty(value = "actions")

    private List<ActionInfo> actions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataclass_id")

    private String dataclassId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_enable")

    private Boolean ruleEnable;

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

    public CreatePlaybookVersionInfo withDescription(String description) {
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

    public CreatePlaybookVersionInfo withWorkspaceId(String workspaceId) {
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

    public CreatePlaybookVersionInfo withPlaybookId(String playbookId) {
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

    public CreatePlaybookVersionInfo withActions(List<ActionInfo> actions) {
        this.actions = actions;
        return this;
    }

    public CreatePlaybookVersionInfo addActionsItem(ActionInfo actionsItem) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(actionsItem);
        return this;
    }

    public CreatePlaybookVersionInfo withActions(Consumer<List<ActionInfo>> actionsSetter) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        actionsSetter.accept(this.actions);
        return this;
    }

    /**
     * Information of actions.
     * @return actions
     */
    public List<ActionInfo> getActions() {
        return actions;
    }

    public void setActions(List<ActionInfo> actions) {
        this.actions = actions;
    }

    public CreatePlaybookVersionInfo withDataclassId(String dataclassId) {
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

    public CreatePlaybookVersionInfo withRuleEnable(Boolean ruleEnable) {
        this.ruleEnable = ruleEnable;
        return this;
    }

    /**
     * 过滤规则是否启用
     * @return ruleEnable
     */
    public Boolean getRuleEnable() {
        return ruleEnable;
    }

    public void setRuleEnable(Boolean ruleEnable) {
        this.ruleEnable = ruleEnable;
    }

    public CreatePlaybookVersionInfo withRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /**
     * 过滤规则ID
     * @return ruleId
     */
    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public CreatePlaybookVersionInfo withTriggerType(String triggerType) {
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

    public CreatePlaybookVersionInfo withDataobjectCreate(Boolean dataobjectCreate) {
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

    public CreatePlaybookVersionInfo withDataobjectUpdate(Boolean dataobjectUpdate) {
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

    public CreatePlaybookVersionInfo withDataobjectDelete(Boolean dataobjectDelete) {
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

    public CreatePlaybookVersionInfo withActionStrategy(String actionStrategy) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreatePlaybookVersionInfo createPlaybookVersionInfo = (CreatePlaybookVersionInfo) o;
        return Objects.equals(this.description, createPlaybookVersionInfo.description)
            && Objects.equals(this.workspaceId, createPlaybookVersionInfo.workspaceId)
            && Objects.equals(this.playbookId, createPlaybookVersionInfo.playbookId)
            && Objects.equals(this.actions, createPlaybookVersionInfo.actions)
            && Objects.equals(this.dataclassId, createPlaybookVersionInfo.dataclassId)
            && Objects.equals(this.ruleEnable, createPlaybookVersionInfo.ruleEnable)
            && Objects.equals(this.ruleId, createPlaybookVersionInfo.ruleId)
            && Objects.equals(this.triggerType, createPlaybookVersionInfo.triggerType)
            && Objects.equals(this.dataobjectCreate, createPlaybookVersionInfo.dataobjectCreate)
            && Objects.equals(this.dataobjectUpdate, createPlaybookVersionInfo.dataobjectUpdate)
            && Objects.equals(this.dataobjectDelete, createPlaybookVersionInfo.dataobjectDelete)
            && Objects.equals(this.actionStrategy, createPlaybookVersionInfo.actionStrategy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description,
            workspaceId,
            playbookId,
            actions,
            dataclassId,
            ruleEnable,
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
        sb.append("class CreatePlaybookVersionInfo {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    playbookId: ").append(toIndentedString(playbookId)).append("\n");
        sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
        sb.append("    dataclassId: ").append(toIndentedString(dataclassId)).append("\n");
        sb.append("    ruleEnable: ").append(toIndentedString(ruleEnable)).append("\n");
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
