package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Action info
 */
public class ActionInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_type")

    private String actionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_id")

    private String actionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_order")

    private Integer sortOrder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "playbook_id")

    private String playbookId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "playbook_version_id")

    private String playbookVersionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    public ActionInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Id value
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ActionInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name, display only
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ActionInfo withDescription(String description) {
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

    public ActionInfo withActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }

    /**
     * Type of action, aopworkflow, Script, Task and so on.
     * @return actionType
     */
    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public ActionInfo withActionId(String actionId) {
        this.actionId = actionId;
        return this;
    }

    /**
     * action id
     * @return actionId
     */
    public String getActionId() {
        return actionId;
    }

    public void setActionId(String actionId) {
        this.actionId = actionId;
    }

    public ActionInfo withSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    /**
     * sort_order
     * minimum: 0
     * maximum: 21312312312
     * @return sortOrder
     */
    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public ActionInfo withPlaybookId(String playbookId) {
        this.playbookId = playbookId;
        return this;
    }

    /**
     * 剧本ID
     * @return playbookId
     */
    public String getPlaybookId() {
        return playbookId;
    }

    public void setPlaybookId(String playbookId) {
        this.playbookId = playbookId;
    }

    public ActionInfo withPlaybookVersionId(String playbookVersionId) {
        this.playbookVersionId = playbookVersionId;
        return this;
    }

    /**
     * 剧本版本ID
     * @return playbookVersionId
     */
    public String getPlaybookVersionId() {
        return playbookVersionId;
    }

    public void setPlaybookVersionId(String playbookVersionId) {
        this.playbookVersionId = playbookVersionId;
    }

    public ActionInfo withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * project_id
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActionInfo actionInfo = (ActionInfo) o;
        return Objects.equals(this.id, actionInfo.id) && Objects.equals(this.name, actionInfo.name)
            && Objects.equals(this.description, actionInfo.description)
            && Objects.equals(this.actionType, actionInfo.actionType)
            && Objects.equals(this.actionId, actionInfo.actionId)
            && Objects.equals(this.sortOrder, actionInfo.sortOrder)
            && Objects.equals(this.playbookId, actionInfo.playbookId)
            && Objects.equals(this.playbookVersionId, actionInfo.playbookVersionId)
            && Objects.equals(this.projectId, actionInfo.projectId);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(id, name, description, actionType, actionId, sortOrder, playbookId, playbookVersionId, projectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
        sb.append("    actionId: ").append(toIndentedString(actionId)).append("\n");
        sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
        sb.append("    playbookId: ").append(toIndentedString(playbookId)).append("\n");
        sb.append("    playbookVersionId: ").append(toIndentedString(playbookVersionId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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
