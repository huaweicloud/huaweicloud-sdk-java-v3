package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowPipelineDetailResponse extends SdkResponse {

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
    @JsonProperty(value = "manifest_version")

    private String manifestVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_id")

    private String componentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_publish")

    private Boolean isPublish;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_id")

    private String creatorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_name")

    private String creatorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updater_id")

    private String updaterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_collect")

    private Boolean isCollect;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sources")

    private List<PipelineSource> sources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "variables")

    private List<PipelineVariable> variables = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedules")

    private List<PipelineSchedule> schedules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "triggers")

    private List<PipelineTrigger> triggers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "definition")

    private String definition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_level")

    private Integer securityLevel;

    public ShowPipelineDetailResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 流水线ID，可以通过[查询流水线列表](ListPipelines.xml)接口，其中pipelines.pipelineId即为流水线ID。 **取值范围**： 32位字符，仅由数字和字母组成。 
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowPipelineDetailResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 流水线名称。 **取值范围**： 仅包含中文、大小写英文字母、数字、'-'和'_'，且长度为[1,128]个字符。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowPipelineDetailResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**： 对流水线的补充描述。 **取值范围**： 不超过1024字符。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowPipelineDetailResponse withManifestVersion(String manifestVersion) {
        this.manifestVersion = manifestVersion;
        return this;
    }

    /**
     * **参数解释**： 流水线版本，默认为3.0。 **取值范围**： 不涉及。 
     * @return manifestVersion
     */
    public String getManifestVersion() {
        return manifestVersion;
    }

    public void setManifestVersion(String manifestVersion) {
        this.manifestVersion = manifestVersion;
    }

    public ShowPipelineDetailResponse withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * **参数解释**： 当前环境所属局点。 **取值范围**： 不涉及。 
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ShowPipelineDetailResponse withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * **参数解释**： 所属租户ID。 **取值范围**： 32位字符，仅由数字和字母组成。 
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ShowPipelineDetailResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释**： 项目ID。 **取值范围**： 32位字符，仅由数字和字母组成。 
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ShowPipelineDetailResponse withComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }

    /**
     * **参数解释**： 所属微服务ID。可以通过[查询微服务列表](ListMicroservice.xml)接口获取，其中data.id即为微服务ID。 **取值范围**： 不涉及。 
     * @return componentId
     */
    public String getComponentId() {
        return componentId;
    }

    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    public ShowPipelineDetailResponse withIsPublish(Boolean isPublish) {
        this.isPublish = isPublish;
        return this;
    }

    /**
     * **参数解释**： 是否为变更流水线。 **取值范围**： - true：是变更流水线。 - false：不是变更流水线。 
     * @return isPublish
     */
    public Boolean getIsPublish() {
        return isPublish;
    }

    public void setIsPublish(Boolean isPublish) {
        this.isPublish = isPublish;
    }

    public ShowPipelineDetailResponse withCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    /**
     * **参数解释**： 流水线创建人ID。 **取值范围**： 32位字符，仅由数字和字母组成。 
     * @return creatorId
     */
    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public ShowPipelineDetailResponse withCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }

    /**
     * **参数解释**： 流水线创建人名称。 **取值范围**： 不涉及。 
     * @return creatorName
     */
    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public ShowPipelineDetailResponse withUpdaterId(String updaterId) {
        this.updaterId = updaterId;
        return this;
    }

    /**
     * **参数解释**： 流水线上次更新人ID。 **取值范围**： 32位字符，仅由数字和字母组成。 
     * @return updaterId
     */
    public String getUpdaterId() {
        return updaterId;
    }

    public void setUpdaterId(String updaterId) {
        this.updaterId = updaterId;
    }

    public ShowPipelineDetailResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释**： 流水线创建时间。 **取值范围**： 不涉及。 
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ShowPipelineDetailResponse withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * **参数解释**： 流水线更新时间。 **取值范围**： 不涉及。 
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public ShowPipelineDetailResponse withIsCollect(Boolean isCollect) {
        this.isCollect = isCollect;
        return this;
    }

    /**
     * **参数解释**： 流水线是否被当前用户收藏。 **取值范围**： - true：流水线已被收藏。 - false：流水线未被收藏。 
     * @return isCollect
     */
    public Boolean getIsCollect() {
        return isCollect;
    }

    public void setIsCollect(Boolean isCollect) {
        this.isCollect = isCollect;
    }

    public ShowPipelineDetailResponse withSources(List<PipelineSource> sources) {
        this.sources = sources;
        return this;
    }

    public ShowPipelineDetailResponse addSourcesItem(PipelineSource sourcesItem) {
        if (this.sources == null) {
            this.sources = new ArrayList<>();
        }
        this.sources.add(sourcesItem);
        return this;
    }

    public ShowPipelineDetailResponse withSources(Consumer<List<PipelineSource>> sourcesSetter) {
        if (this.sources == null) {
            this.sources = new ArrayList<>();
        }
        sourcesSetter.accept(this.sources);
        return this;
    }

    /**
     * **参数解释**： 流水线源列表。 **取值范围**： 不涉及。 
     * @return sources
     */
    public List<PipelineSource> getSources() {
        return sources;
    }

    public void setSources(List<PipelineSource> sources) {
        this.sources = sources;
    }

    public ShowPipelineDetailResponse withVariables(List<PipelineVariable> variables) {
        this.variables = variables;
        return this;
    }

    public ShowPipelineDetailResponse addVariablesItem(PipelineVariable variablesItem) {
        if (this.variables == null) {
            this.variables = new ArrayList<>();
        }
        this.variables.add(variablesItem);
        return this;
    }

    public ShowPipelineDetailResponse withVariables(Consumer<List<PipelineVariable>> variablesSetter) {
        if (this.variables == null) {
            this.variables = new ArrayList<>();
        }
        variablesSetter.accept(this.variables);
        return this;
    }

    /**
     * **参数解释**： 流水线自定义参数。 **取值范围**： 不涉及。 
     * @return variables
     */
    public List<PipelineVariable> getVariables() {
        return variables;
    }

    public void setVariables(List<PipelineVariable> variables) {
        this.variables = variables;
    }

    public ShowPipelineDetailResponse withSchedules(List<PipelineSchedule> schedules) {
        this.schedules = schedules;
        return this;
    }

    public ShowPipelineDetailResponse addSchedulesItem(PipelineSchedule schedulesItem) {
        if (this.schedules == null) {
            this.schedules = new ArrayList<>();
        }
        this.schedules.add(schedulesItem);
        return this;
    }

    public ShowPipelineDetailResponse withSchedules(Consumer<List<PipelineSchedule>> schedulesSetter) {
        if (this.schedules == null) {
            this.schedules = new ArrayList<>();
        }
        schedulesSetter.accept(this.schedules);
        return this;
    }

    /**
     * **参数解释**： 流水线定时任务设置。 **取值范围**： 不涉及。 
     * @return schedules
     */
    public List<PipelineSchedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(List<PipelineSchedule> schedules) {
        this.schedules = schedules;
    }

    public ShowPipelineDetailResponse withTriggers(List<PipelineTrigger> triggers) {
        this.triggers = triggers;
        return this;
    }

    public ShowPipelineDetailResponse addTriggersItem(PipelineTrigger triggersItem) {
        if (this.triggers == null) {
            this.triggers = new ArrayList<>();
        }
        this.triggers.add(triggersItem);
        return this;
    }

    public ShowPipelineDetailResponse withTriggers(Consumer<List<PipelineTrigger>> triggersSetter) {
        if (this.triggers == null) {
            this.triggers = new ArrayList<>();
        }
        triggersSetter.accept(this.triggers);
        return this;
    }

    /**
     * **参数解释**： 流水线事件触发设置。 **取值范围**： 不涉及。 
     * @return triggers
     */
    public List<PipelineTrigger> getTriggers() {
        return triggers;
    }

    public void setTriggers(List<PipelineTrigger> triggers) {
        this.triggers = triggers;
    }

    public ShowPipelineDetailResponse withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * **参数解释**： 流水线所属分组ID。 **取值范围**： 不涉及。 
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public ShowPipelineDetailResponse withDefinition(String definition) {
        this.definition = definition;
        return this;
    }

    /**
     * **参数解释**： 流水线定义JSON。 **取值范围**： 不涉及。 
     * @return definition
     */
    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public ShowPipelineDetailResponse withSecurityLevel(Integer securityLevel) {
        this.securityLevel = securityLevel;
        return this;
    }

    /**
     * **参数解释**： 流水线涉密等级。 **取值范围**： 不涉及。 
     * @return securityLevel
     */
    public Integer getSecurityLevel() {
        return securityLevel;
    }

    public void setSecurityLevel(Integer securityLevel) {
        this.securityLevel = securityLevel;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowPipelineDetailResponse that = (ShowPipelineDetailResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.manifestVersion, that.manifestVersion) && Objects.equals(this.region, that.region)
            && Objects.equals(this.domainId, that.domainId) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.componentId, that.componentId) && Objects.equals(this.isPublish, that.isPublish)
            && Objects.equals(this.creatorId, that.creatorId) && Objects.equals(this.creatorName, that.creatorName)
            && Objects.equals(this.updaterId, that.updaterId) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.isCollect, that.isCollect)
            && Objects.equals(this.sources, that.sources) && Objects.equals(this.variables, that.variables)
            && Objects.equals(this.schedules, that.schedules) && Objects.equals(this.triggers, that.triggers)
            && Objects.equals(this.groupId, that.groupId) && Objects.equals(this.definition, that.definition)
            && Objects.equals(this.securityLevel, that.securityLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            manifestVersion,
            region,
            domainId,
            projectId,
            componentId,
            isPublish,
            creatorId,
            creatorName,
            updaterId,
            createTime,
            updateTime,
            isCollect,
            sources,
            variables,
            schedules,
            triggers,
            groupId,
            definition,
            securityLevel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPipelineDetailResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    manifestVersion: ").append(toIndentedString(manifestVersion)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
        sb.append("    isPublish: ").append(toIndentedString(isPublish)).append("\n");
        sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
        sb.append("    creatorName: ").append(toIndentedString(creatorName)).append("\n");
        sb.append("    updaterId: ").append(toIndentedString(updaterId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    isCollect: ").append(toIndentedString(isCollect)).append("\n");
        sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
        sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
        sb.append("    schedules: ").append(toIndentedString(schedules)).append("\n");
        sb.append("    triggers: ").append(toIndentedString(triggers)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
        sb.append("    securityLevel: ").append(toIndentedString(securityLevel)).append("\n");
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
