package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 剧本版本详情信息
 */
public class PlaybookVersionInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_id")

    private String creatorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modifier_id")

    private String modifierId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "playbook_id")

    private String playbookId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_strategy")

    private String actionStrategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actions")

    private List<ActionInfo> actions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_enable")

    private Boolean ruleEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rules")

    private RuleInfo rules;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataclass_id")

    private String dataclassId;

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
    @JsonProperty(value = "version_type")

    private Integer versionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_id")

    private String ruleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataclass_name")

    private String dataclassName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "approve_name")

    private String approveName;

    public PlaybookVersionInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 剧本版本ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PlaybookVersionInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PlaybookVersionInfo withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public PlaybookVersionInfo withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public PlaybookVersionInfo withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public PlaybookVersionInfo withCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    /**
     * 创建者ID
     * @return creatorId
     */
    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public PlaybookVersionInfo withModifierId(String modifierId) {
        this.modifierId = modifierId;
        return this;
    }

    /**
     * 修改者ID
     * @return modifierId
     */
    public String getModifierId() {
        return modifierId;
    }

    public void setModifierId(String modifierId) {
        this.modifierId = modifierId;
    }

    public PlaybookVersionInfo withPlaybookId(String playbookId) {
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

    public PlaybookVersionInfo withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 版本号
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public PlaybookVersionInfo withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 是否启用。（true--已启用，false-未启用）
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public PlaybookVersionInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 剧本版本状态，编辑中：EDITING  审核中：APPROVING  不通过：UNPASSED 已发布：PUBLISHED
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public PlaybookVersionInfo withActionStrategy(String actionStrategy) {
        this.actionStrategy = actionStrategy;
        return this;
    }

    /**
     * 执行策略. 目前仅支持异步并发执行，对应值为ASYNC
     * @return actionStrategy
     */
    public String getActionStrategy() {
        return actionStrategy;
    }

    public void setActionStrategy(String actionStrategy) {
        this.actionStrategy = actionStrategy;
    }

    public PlaybookVersionInfo withActions(List<ActionInfo> actions) {
        this.actions = actions;
        return this;
    }

    public PlaybookVersionInfo addActionsItem(ActionInfo actionsItem) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(actionsItem);
        return this;
    }

    public PlaybookVersionInfo withActions(Consumer<List<ActionInfo>> actionsSetter) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        actionsSetter.accept(this.actions);
        return this;
    }

    /**
     * 剧本关联流程列表信息
     * @return actions
     */
    public List<ActionInfo> getActions() {
        return actions;
    }

    public void setActions(List<ActionInfo> actions) {
        this.actions = actions;
    }

    public PlaybookVersionInfo withRuleEnable(Boolean ruleEnable) {
        this.ruleEnable = ruleEnable;
        return this;
    }

    /**
     * 是否启用触发条件过滤器
     * @return ruleEnable
     */
    public Boolean getRuleEnable() {
        return ruleEnable;
    }

    public void setRuleEnable(Boolean ruleEnable) {
        this.ruleEnable = ruleEnable;
    }

    public PlaybookVersionInfo withRules(RuleInfo rules) {
        this.rules = rules;
        return this;
    }

    public PlaybookVersionInfo withRules(Consumer<RuleInfo> rulesSetter) {
        if (this.rules == null) {
            this.rules = new RuleInfo();
            rulesSetter.accept(this.rules);
        }

        return this;
    }

    /**
     * Get rules
     * @return rules
     */
    public RuleInfo getRules() {
        return rules;
    }

    public void setRules(RuleInfo rules) {
        this.rules = rules;
    }

    public PlaybookVersionInfo withDataclassId(String dataclassId) {
        this.dataclassId = dataclassId;
        return this;
    }

    /**
     * 数据类ID
     * @return dataclassId
     */
    public String getDataclassId() {
        return dataclassId;
    }

    public void setDataclassId(String dataclassId) {
        this.dataclassId = dataclassId;
    }

    public PlaybookVersionInfo withTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }

    /**
     * 剧本触发方式(EVENT--事件触发，TIMER--定时触发)
     * @return triggerType
     */
    public String getTriggerType() {
        return triggerType;
    }

    public void setTriggerType(String triggerType) {
        this.triggerType = triggerType;
    }

    public PlaybookVersionInfo withDataobjectCreate(Boolean dataobjectCreate) {
        this.dataobjectCreate = dataobjectCreate;
        return this;
    }

    /**
     * 标识数据对象是否创建时触发剧本
     * @return dataobjectCreate
     */
    public Boolean getDataobjectCreate() {
        return dataobjectCreate;
    }

    public void setDataobjectCreate(Boolean dataobjectCreate) {
        this.dataobjectCreate = dataobjectCreate;
    }

    public PlaybookVersionInfo withDataobjectUpdate(Boolean dataobjectUpdate) {
        this.dataobjectUpdate = dataobjectUpdate;
        return this;
    }

    /**
     * 标识数据对象是否更新时触发剧本
     * @return dataobjectUpdate
     */
    public Boolean getDataobjectUpdate() {
        return dataobjectUpdate;
    }

    public void setDataobjectUpdate(Boolean dataobjectUpdate) {
        this.dataobjectUpdate = dataobjectUpdate;
    }

    public PlaybookVersionInfo withDataobjectDelete(Boolean dataobjectDelete) {
        this.dataobjectDelete = dataobjectDelete;
        return this;
    }

    /**
     * 标识数据对象是否删除时触发剧本
     * @return dataobjectDelete
     */
    public Boolean getDataobjectDelete() {
        return dataobjectDelete;
    }

    public void setDataobjectDelete(Boolean dataobjectDelete) {
        this.dataobjectDelete = dataobjectDelete;
    }

    public PlaybookVersionInfo withVersionType(Integer versionType) {
        this.versionType = versionType;
        return this;
    }

    /**
     * 版本类型（0--草稿版本，1--正式版本)
     * minimum: 0
     * maximum: 1
     * @return versionType
     */
    public Integer getVersionType() {
        return versionType;
    }

    public void setVersionType(Integer versionType) {
        this.versionType = versionType;
    }

    public PlaybookVersionInfo withRuleId(String ruleId) {
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

    public PlaybookVersionInfo withDataclassName(String dataclassName) {
        this.dataclassName = dataclassName;
        return this;
    }

    /**
     * 数据类名称
     * @return dataclassName
     */
    public String getDataclassName() {
        return dataclassName;
    }

    public void setDataclassName(String dataclassName) {
        this.dataclassName = dataclassName;
    }

    public PlaybookVersionInfo withApproveName(String approveName) {
        this.approveName = approveName;
        return this;
    }

    /**
     * 审核者
     * @return approveName
     */
    public String getApproveName() {
        return approveName;
    }

    public void setApproveName(String approveName) {
        this.approveName = approveName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PlaybookVersionInfo that = (PlaybookVersionInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.description, that.description)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.creatorId, that.creatorId)
            && Objects.equals(this.modifierId, that.modifierId) && Objects.equals(this.playbookId, that.playbookId)
            && Objects.equals(this.version, that.version) && Objects.equals(this.enabled, that.enabled)
            && Objects.equals(this.status, that.status) && Objects.equals(this.actionStrategy, that.actionStrategy)
            && Objects.equals(this.actions, that.actions) && Objects.equals(this.ruleEnable, that.ruleEnable)
            && Objects.equals(this.rules, that.rules) && Objects.equals(this.dataclassId, that.dataclassId)
            && Objects.equals(this.triggerType, that.triggerType)
            && Objects.equals(this.dataobjectCreate, that.dataobjectCreate)
            && Objects.equals(this.dataobjectUpdate, that.dataobjectUpdate)
            && Objects.equals(this.dataobjectDelete, that.dataobjectDelete)
            && Objects.equals(this.versionType, that.versionType) && Objects.equals(this.ruleId, that.ruleId)
            && Objects.equals(this.dataclassName, that.dataclassName)
            && Objects.equals(this.approveName, that.approveName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            description,
            createTime,
            updateTime,
            projectId,
            creatorId,
            modifierId,
            playbookId,
            version,
            enabled,
            status,
            actionStrategy,
            actions,
            ruleEnable,
            rules,
            dataclassId,
            triggerType,
            dataobjectCreate,
            dataobjectUpdate,
            dataobjectDelete,
            versionType,
            ruleId,
            dataclassName,
            approveName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PlaybookVersionInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
        sb.append("    modifierId: ").append(toIndentedString(modifierId)).append("\n");
        sb.append("    playbookId: ").append(toIndentedString(playbookId)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    actionStrategy: ").append(toIndentedString(actionStrategy)).append("\n");
        sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
        sb.append("    ruleEnable: ").append(toIndentedString(ruleEnable)).append("\n");
        sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
        sb.append("    dataclassId: ").append(toIndentedString(dataclassId)).append("\n");
        sb.append("    triggerType: ").append(toIndentedString(triggerType)).append("\n");
        sb.append("    dataobjectCreate: ").append(toIndentedString(dataobjectCreate)).append("\n");
        sb.append("    dataobjectUpdate: ").append(toIndentedString(dataobjectUpdate)).append("\n");
        sb.append("    dataobjectDelete: ").append(toIndentedString(dataobjectDelete)).append("\n");
        sb.append("    versionType: ").append(toIndentedString(versionType)).append("\n");
        sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
        sb.append("    dataclassName: ").append(toIndentedString(dataclassName)).append("\n");
        sb.append("    approveName: ").append(toIndentedString(approveName)).append("\n");
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
