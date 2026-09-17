package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PipelineDTO
 */
public class PipelineDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_publish")

    private Boolean isPublish;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sources")

    private List<CodeSource> sources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "variables")

    private List<CustomVariable> variables = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedules")

    private List<PipelineSchedule> schedules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "triggers")

    private List<PipelineTrigger> triggers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manifest_version")

    private String manifestVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "definition")

    private String definition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_name")

    private String projectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "concurrency_control")

    private PipelineConcurrencyMgmt concurrencyControl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_level")

    private Integer securityLevel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disable_release_branch_management")

    private Boolean disableReleaseBranchManagement;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_plans")

    private List<Object> executionPlans = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cancel_strategy")

    private Object cancelStrategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "confidentiality_code")

    private String confidentialityCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_name")

    private String agencyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "variable_group_ids")

    private List<String> variableGroupIds = null;

    public PipelineDTO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 流水线名称。 **约束限制**： 不涉及。 **取值范围**： 仅包含中文、大小写英文字母、数字、'-'和'_'，且长度为[1,128]个字符。 **默认取值**： 不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PipelineDTO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**： 流水线描述。 **约束限制**： 不涉及。 **取值范围**： 不超过1024字符。 **默认取值**： 不涉及。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PipelineDTO withIsPublish(Boolean isPublish) {
        this.isPublish = isPublish;
        return this;
    }

    /**
     * **参数解释**： 是否为变更流水线。 **约束限制**： 不涉及。 **取值范围**： - true：变更流水线。 - false：非变更流水线。 **默认取值**： 不涉及。 
     * @return isPublish
     */
    public Boolean getIsPublish() {
        return isPublish;
    }

    public void setIsPublish(Boolean isPublish) {
        this.isPublish = isPublish;
    }

    public PipelineDTO withSources(List<CodeSource> sources) {
        this.sources = sources;
        return this;
    }

    public PipelineDTO addSourcesItem(CodeSource sourcesItem) {
        if (this.sources == null) {
            this.sources = new ArrayList<>();
        }
        this.sources.add(sourcesItem);
        return this;
    }

    public PipelineDTO withSources(Consumer<List<CodeSource>> sourcesSetter) {
        if (this.sources == null) {
            this.sources = new ArrayList<>();
        }
        sourcesSetter.accept(this.sources);
        return this;
    }

    /**
     * **参数解释**： 流水线源信息。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return sources
     */
    public List<CodeSource> getSources() {
        return sources;
    }

    public void setSources(List<CodeSource> sources) {
        this.sources = sources;
    }

    public PipelineDTO withVariables(List<CustomVariable> variables) {
        this.variables = variables;
        return this;
    }

    public PipelineDTO addVariablesItem(CustomVariable variablesItem) {
        if (this.variables == null) {
            this.variables = new ArrayList<>();
        }
        this.variables.add(variablesItem);
        return this;
    }

    public PipelineDTO withVariables(Consumer<List<CustomVariable>> variablesSetter) {
        if (this.variables == null) {
            this.variables = new ArrayList<>();
        }
        variablesSetter.accept(this.variables);
        return this;
    }

    /**
     * **参数解释**： 流水线自定义全局变量列表。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return variables
     */
    public List<CustomVariable> getVariables() {
        return variables;
    }

    public void setVariables(List<CustomVariable> variables) {
        this.variables = variables;
    }

    public PipelineDTO withSchedules(List<PipelineSchedule> schedules) {
        this.schedules = schedules;
        return this;
    }

    public PipelineDTO addSchedulesItem(PipelineSchedule schedulesItem) {
        if (this.schedules == null) {
            this.schedules = new ArrayList<>();
        }
        this.schedules.add(schedulesItem);
        return this;
    }

    public PipelineDTO withSchedules(Consumer<List<PipelineSchedule>> schedulesSetter) {
        if (this.schedules == null) {
            this.schedules = new ArrayList<>();
        }
        schedulesSetter.accept(this.schedules);
        return this;
    }

    /**
     * **参数解释**： 流水线定时执行配置列表。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return schedules
     */
    public List<PipelineSchedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(List<PipelineSchedule> schedules) {
        this.schedules = schedules;
    }

    public PipelineDTO withTriggers(List<PipelineTrigger> triggers) {
        this.triggers = triggers;
        return this;
    }

    public PipelineDTO addTriggersItem(PipelineTrigger triggersItem) {
        if (this.triggers == null) {
            this.triggers = new ArrayList<>();
        }
        this.triggers.add(triggersItem);
        return this;
    }

    public PipelineDTO withTriggers(Consumer<List<PipelineTrigger>> triggersSetter) {
        if (this.triggers == null) {
            this.triggers = new ArrayList<>();
        }
        triggersSetter.accept(this.triggers);
        return this;
    }

    /**
     * **参数解释**： 流水线代码事件触发配置。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return triggers
     */
    public List<PipelineTrigger> getTriggers() {
        return triggers;
    }

    public void setTriggers(List<PipelineTrigger> triggers) {
        this.triggers = triggers;
    }

    public PipelineDTO withManifestVersion(String manifestVersion) {
        this.manifestVersion = manifestVersion;
        return this;
    }

    /**
     * **参数解释**： 流水线结构定义版本。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 3.0。 
     * @return manifestVersion
     */
    public String getManifestVersion() {
        return manifestVersion;
    }

    public void setManifestVersion(String manifestVersion) {
        this.manifestVersion = manifestVersion;
    }

    public PipelineDTO withDefinition(String definition) {
        this.definition = definition;
        return this;
    }

    /**
     * **参数解释**： 流水线结构定义JSON。该字段结构复杂，建议使用页面编辑流水线后，从[查询流水线详情](ShowPipelineDetail.xml)接口获取。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return definition
     */
    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public PipelineDTO withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * **参数解释**： 项目名称。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return projectName
     */
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public PipelineDTO withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * **参数解释**： 流水线组ID。 **约束限制**： 不涉及。 **取值范围**： 32位字符，仅由数字和字母组成。 **默认取值**： 不涉及。 
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public PipelineDTO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 复制场景使用，为原流水线ID。 **约束限制**： 不涉及。 **取值范围**： 32位字符，仅由数字和字母组成。 **默认取值**： 不涉及。 
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PipelineDTO withConcurrencyControl(PipelineConcurrencyMgmt concurrencyControl) {
        this.concurrencyControl = concurrencyControl;
        return this;
    }

    public PipelineDTO withConcurrencyControl(Consumer<PipelineConcurrencyMgmt> concurrencyControlSetter) {
        if (this.concurrencyControl == null) {
            this.concurrencyControl = new PipelineConcurrencyMgmt();
            concurrencyControlSetter.accept(this.concurrencyControl);
        }

        return this;
    }

    /**
     * Get concurrencyControl
     * @return concurrencyControl
     */
    public PipelineConcurrencyMgmt getConcurrencyControl() {
        return concurrencyControl;
    }

    public void setConcurrencyControl(PipelineConcurrencyMgmt concurrencyControl) {
        this.concurrencyControl = concurrencyControl;
    }

    public PipelineDTO withSecurityLevel(Integer securityLevel) {
        this.securityLevel = securityLevel;
        return this;
    }

    /**
     * **参数解释**： 流水线涉密等级。 **约束限制**： 非涉密场景不涉及，涉密场景必填。 **取值范围**： 正整数（1为最低密级）。 **默认取值**： 不涉及。 
     * @return securityLevel
     */
    public Integer getSecurityLevel() {
        return securityLevel;
    }

    public void setSecurityLevel(Integer securityLevel) {
        this.securityLevel = securityLevel;
    }

    public PipelineDTO withDisableReleaseBranchManagement(Boolean disableReleaseBranchManagement) {
        this.disableReleaseBranchManagement = disableReleaseBranchManagement;
        return this;
    }

    /**
     * **参数解释**： 是否禁用自动生成阶段，仅变更流水线适用。默认值为false，即默认启用自动生成阶段。 **约束限制**： 不涉及。 **取值范围**： - true：禁用自动生成阶段。 - false：启用自动生成阶段。 **默认取值**： false。 
     * @return disableReleaseBranchManagement
     */
    public Boolean getDisableReleaseBranchManagement() {
        return disableReleaseBranchManagement;
    }

    public void setDisableReleaseBranchManagement(Boolean disableReleaseBranchManagement) {
        this.disableReleaseBranchManagement = disableReleaseBranchManagement;
    }

    public PipelineDTO withExecutionPlans(List<Object> executionPlans) {
        this.executionPlans = executionPlans;
        return this;
    }

    public PipelineDTO addExecutionPlansItem(Object executionPlansItem) {
        if (this.executionPlans == null) {
            this.executionPlans = new ArrayList<>();
        }
        this.executionPlans.add(executionPlansItem);
        return this;
    }

    public PipelineDTO withExecutionPlans(Consumer<List<Object>> executionPlansSetter) {
        if (this.executionPlans == null) {
            this.executionPlans = new ArrayList<>();
        }
        executionPlansSetter.accept(this.executionPlans);
        return this;
    }

    /**
     * **参数解释**： 流水线执行计划列表。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return executionPlans
     */
    public List<Object> getExecutionPlans() {
        return executionPlans;
    }

    public void setExecutionPlans(List<Object> executionPlans) {
        this.executionPlans = executionPlans;
    }

    public PipelineDTO withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释**： 项目ID。 **约束限制**： 不涉及。 **取值范围**： 32位字符，仅由数字和字母组成。 **默认取值**： 不涉及。 
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public PipelineDTO withCancelStrategy(Object cancelStrategy) {
        this.cancelStrategy = cancelStrategy;
        return this;
    }

    /**
     * **参数解释**： 流水线取消运行策略。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return cancelStrategy
     */
    public Object getCancelStrategy() {
        return cancelStrategy;
    }

    public void setCancelStrategy(Object cancelStrategy) {
        this.cancelStrategy = cancelStrategy;
    }

    public PipelineDTO withConfidentialityCode(String confidentialityCode) {
        this.confidentialityCode = confidentialityCode;
        return this;
    }

    /**
     * **参数解释**： 流水线密级code。 **约束限制**： 非涉密场景不涉及，涉密场景必填。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return confidentialityCode
     */
    public String getConfidentialityCode() {
        return confidentialityCode;
    }

    public void setConfidentialityCode(String confidentialityCode) {
        this.confidentialityCode = confidentialityCode;
    }

    public PipelineDTO withAgencyName(String agencyName) {
        this.agencyName = agencyName;
        return this;
    }

    /**
     * **参数解释**： 委托名称。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return agencyName
     */
    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public PipelineDTO withVariableGroupIds(List<String> variableGroupIds) {
        this.variableGroupIds = variableGroupIds;
        return this;
    }

    public PipelineDTO addVariableGroupIdsItem(String variableGroupIdsItem) {
        if (this.variableGroupIds == null) {
            this.variableGroupIds = new ArrayList<>();
        }
        this.variableGroupIds.add(variableGroupIdsItem);
        return this;
    }

    public PipelineDTO withVariableGroupIds(Consumer<List<String>> variableGroupIdsSetter) {
        if (this.variableGroupIds == null) {
            this.variableGroupIds = new ArrayList<>();
        }
        variableGroupIdsSetter.accept(this.variableGroupIds);
        return this;
    }

    /**
     * **参数解释**： 关联的通用参数组ID列表。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。 
     * @return variableGroupIds
     */
    public List<String> getVariableGroupIds() {
        return variableGroupIds;
    }

    public void setVariableGroupIds(List<String> variableGroupIds) {
        this.variableGroupIds = variableGroupIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PipelineDTO that = (PipelineDTO) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.isPublish, that.isPublish) && Objects.equals(this.sources, that.sources)
            && Objects.equals(this.variables, that.variables) && Objects.equals(this.schedules, that.schedules)
            && Objects.equals(this.triggers, that.triggers)
            && Objects.equals(this.manifestVersion, that.manifestVersion)
            && Objects.equals(this.definition, that.definition) && Objects.equals(this.projectName, that.projectName)
            && Objects.equals(this.groupId, that.groupId) && Objects.equals(this.id, that.id)
            && Objects.equals(this.concurrencyControl, that.concurrencyControl)
            && Objects.equals(this.securityLevel, that.securityLevel)
            && Objects.equals(this.disableReleaseBranchManagement, that.disableReleaseBranchManagement)
            && Objects.equals(this.executionPlans, that.executionPlans)
            && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.cancelStrategy, that.cancelStrategy)
            && Objects.equals(this.confidentialityCode, that.confidentialityCode)
            && Objects.equals(this.agencyName, that.agencyName)
            && Objects.equals(this.variableGroupIds, that.variableGroupIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            description,
            isPublish,
            sources,
            variables,
            schedules,
            triggers,
            manifestVersion,
            definition,
            projectName,
            groupId,
            id,
            concurrencyControl,
            securityLevel,
            disableReleaseBranchManagement,
            executionPlans,
            projectId,
            cancelStrategy,
            confidentialityCode,
            agencyName,
            variableGroupIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PipelineDTO {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    isPublish: ").append(toIndentedString(isPublish)).append("\n");
        sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
        sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
        sb.append("    schedules: ").append(toIndentedString(schedules)).append("\n");
        sb.append("    triggers: ").append(toIndentedString(triggers)).append("\n");
        sb.append("    manifestVersion: ").append(toIndentedString(manifestVersion)).append("\n");
        sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
        sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    concurrencyControl: ").append(toIndentedString(concurrencyControl)).append("\n");
        sb.append("    securityLevel: ").append(toIndentedString(securityLevel)).append("\n");
        sb.append("    disableReleaseBranchManagement: ")
            .append(toIndentedString(disableReleaseBranchManagement))
            .append("\n");
        sb.append("    executionPlans: ").append(toIndentedString(executionPlans)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    cancelStrategy: ").append(toIndentedString(cancelStrategy)).append("\n");
        sb.append("    confidentialityCode: ").append(toIndentedString(confidentialityCode)).append("\n");
        sb.append("    agencyName: ").append(toIndentedString(agencyName)).append("\n");
        sb.append("    variableGroupIds: ").append(toIndentedString(variableGroupIds)).append("\n");
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
