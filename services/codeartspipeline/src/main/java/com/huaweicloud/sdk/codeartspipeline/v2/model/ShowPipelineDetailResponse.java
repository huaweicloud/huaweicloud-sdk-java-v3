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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "origin_id")

    private String originId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "disable_release_branch_management")

    private Boolean disableReleaseBranchManagement;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deleted")

    private Boolean deleted;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "banned")

    private Boolean banned;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from_git_code")

    private Boolean fromGitCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from_git_code_repo")

    private Boolean fromGitCodeRepo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "git_code_repo_id")

    private String gitCodeRepoId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "yaml_definition")

    private String yamlDefinition;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pac_repo_relation")

    private Object pacRepoRelation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "yaml_content")

    private String yamlContent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agency_name")

    private String agencyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_plans")

    private List<Object> executionPlans = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "from_source")

    private Integer fromSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_name")

    private String projectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "concurrency_control")

    private PipelineConcurrencyMgmt concurrencyControl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cancel_strategy")

    private Object cancelStrategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_ids")

    private List<String> tagIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "variable_groups")

    private List<String> variableGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_level_code")

    private String securityLevelCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "permissions")

    private Object permissions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subject_id")

    private String subjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail_url")

    private String detailUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modify_url")

    private String modifyUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Object> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_cr_model")

    private Boolean isCrModel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "archive_source")

    private Object archiveSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "yaml_repo_properties")

    private Object yamlRepoProperties;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "variable_group_ids")

    private List<String> variableGroupIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pac_source_alias")

    private String pacSourceAlias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pac_source_repo_https_endpoint")

    private String pacSourceRepoHttpsEndpoint;

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

    public ShowPipelineDetailResponse withOriginId(String originId) {
        this.originId = originId;
        return this;
    }

    /**
     * **参数解释**： 复制流水线场景下，原流水线ID。 **取值范围**： 32位字符，仅由数字和字母组成。 
     * @return originId
     */
    public String getOriginId() {
        return originId;
    }

    public void setOriginId(String originId) {
        this.originId = originId;
    }

    public ShowPipelineDetailResponse withDisableReleaseBranchManagement(Boolean disableReleaseBranchManagement) {
        this.disableReleaseBranchManagement = disableReleaseBranchManagement;
        return this;
    }

    /**
     * **参数解释**： 是否禁用发布分支管理。 **取值范围**： - true：禁用发布分支管理。 - false：不禁用发布分支管理。 
     * @return disableReleaseBranchManagement
     */
    public Boolean getDisableReleaseBranchManagement() {
        return disableReleaseBranchManagement;
    }

    public void setDisableReleaseBranchManagement(Boolean disableReleaseBranchManagement) {
        this.disableReleaseBranchManagement = disableReleaseBranchManagement;
    }

    public ShowPipelineDetailResponse withDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    /**
     * **参数解释**： 流水线是否已被删除。 **取值范围**： - true：已删除。 - false：未删除。 
     * @return deleted
     */
    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public ShowPipelineDetailResponse withBanned(Boolean banned) {
        this.banned = banned;
        return this;
    }

    /**
     * **参数解释**： 流水线是否被禁用。 **取值范围**： - true：已禁用。 - false：未禁用。 
     * @return banned
     */
    public Boolean getBanned() {
        return banned;
    }

    public void setBanned(Boolean banned) {
        this.banned = banned;
    }

    public ShowPipelineDetailResponse withFromGitCode(Boolean fromGitCode) {
        this.fromGitCode = fromGitCode;
        return this;
    }

    /**
     * **参数解释**： 是否来自CodeHub代码仓。 **取值范围**： - true：来自CodeHub代码仓。 - false：非来自CodeHub代码仓。 
     * @return fromGitCode
     */
    public Boolean getFromGitCode() {
        return fromGitCode;
    }

    public void setFromGitCode(Boolean fromGitCode) {
        this.fromGitCode = fromGitCode;
    }

    public ShowPipelineDetailResponse withFromGitCodeRepo(Boolean fromGitCodeRepo) {
        this.fromGitCodeRepo = fromGitCodeRepo;
        return this;
    }

    /**
     * **参数解释**： 是否来自CodeHub代码仓库。 **取值范围**： - true：来自CodeHub代码仓库。 - false：非来自CodeHub代码仓库。 
     * @return fromGitCodeRepo
     */
    public Boolean getFromGitCodeRepo() {
        return fromGitCodeRepo;
    }

    public void setFromGitCodeRepo(Boolean fromGitCodeRepo) {
        this.fromGitCodeRepo = fromGitCodeRepo;
    }

    public ShowPipelineDetailResponse withGitCodeRepoId(String gitCodeRepoId) {
        this.gitCodeRepoId = gitCodeRepoId;
        return this;
    }

    /**
     * **参数解释**： CodeHub代码仓库ID。 **取值范围**： 不涉及。 
     * @return gitCodeRepoId
     */
    public String getGitCodeRepoId() {
        return gitCodeRepoId;
    }

    public void setGitCodeRepoId(String gitCodeRepoId) {
        this.gitCodeRepoId = gitCodeRepoId;
    }

    public ShowPipelineDetailResponse withYamlDefinition(String yamlDefinition) {
        this.yamlDefinition = yamlDefinition;
        return this;
    }

    /**
     * **参数解释**： YAML格式流水线定义。 **取值范围**： 不涉及。 
     * @return yamlDefinition
     */
    public String getYamlDefinition() {
        return yamlDefinition;
    }

    public void setYamlDefinition(String yamlDefinition) {
        this.yamlDefinition = yamlDefinition;
    }

    public ShowPipelineDetailResponse withPacRepoRelation(Object pacRepoRelation) {
        this.pacRepoRelation = pacRepoRelation;
        return this;
    }

    /**
     * **参数解释**： PAC代码仓关联信息。 **取值范围**： 不涉及。 
     * @return pacRepoRelation
     */
    public Object getPacRepoRelation() {
        return pacRepoRelation;
    }

    public void setPacRepoRelation(Object pacRepoRelation) {
        this.pacRepoRelation = pacRepoRelation;
    }

    public ShowPipelineDetailResponse withYamlContent(String yamlContent) {
        this.yamlContent = yamlContent;
        return this;
    }

    /**
     * **参数解释**： YAML流水线文件内容。 **取值范围**： 不涉及。 
     * @return yamlContent
     */
    public String getYamlContent() {
        return yamlContent;
    }

    public void setYamlContent(String yamlContent) {
        this.yamlContent = yamlContent;
    }

    public ShowPipelineDetailResponse withAgencyName(String agencyName) {
        this.agencyName = agencyName;
        return this;
    }

    /**
     * **参数解释**： 委托名称。 **取值范围**： 不涉及。 
     * @return agencyName
     */
    public String getAgencyName() {
        return agencyName;
    }

    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName;
    }

    public ShowPipelineDetailResponse withExecutionPlans(List<Object> executionPlans) {
        this.executionPlans = executionPlans;
        return this;
    }

    public ShowPipelineDetailResponse addExecutionPlansItem(Object executionPlansItem) {
        if (this.executionPlans == null) {
            this.executionPlans = new ArrayList<>();
        }
        this.executionPlans.add(executionPlansItem);
        return this;
    }

    public ShowPipelineDetailResponse withExecutionPlans(Consumer<List<Object>> executionPlansSetter) {
        if (this.executionPlans == null) {
            this.executionPlans = new ArrayList<>();
        }
        executionPlansSetter.accept(this.executionPlans);
        return this;
    }

    /**
     * **参数解释**： 执行计划列表。 **取值范围**： 不涉及。 
     * @return executionPlans
     */
    public List<Object> getExecutionPlans() {
        return executionPlans;
    }

    public void setExecutionPlans(List<Object> executionPlans) {
        this.executionPlans = executionPlans;
    }

    public ShowPipelineDetailResponse withFromSource(Integer fromSource) {
        this.fromSource = fromSource;
        return this;
    }

    /**
     * **参数解释**： 流水线来源。 **取值范围**： - 0：默认。 - 1：普通模板创建。 - 2：老数据转换。 - 3：CloudInit凤凰商城触发模板创建。 - 4：CloudInit其他触发模板创建。 - 5：创建模板。 
     * @return fromSource
     */
    public Integer getFromSource() {
        return fromSource;
    }

    public void setFromSource(Integer fromSource) {
        this.fromSource = fromSource;
    }

    public ShowPipelineDetailResponse withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * **参数解释**： 项目名称。 **取值范围**： 不涉及。 
     * @return projectName
     */
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public ShowPipelineDetailResponse withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * **参数解释**： 流水线所属分组名称。 **取值范围**： 不涉及。 
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public ShowPipelineDetailResponse withConcurrencyControl(PipelineConcurrencyMgmt concurrencyControl) {
        this.concurrencyControl = concurrencyControl;
        return this;
    }

    public ShowPipelineDetailResponse withConcurrencyControl(
        Consumer<PipelineConcurrencyMgmt> concurrencyControlSetter) {
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

    public ShowPipelineDetailResponse withCancelStrategy(Object cancelStrategy) {
        this.cancelStrategy = cancelStrategy;
        return this;
    }

    /**
     * **参数解释**： 流水线取消运行策略。 **取值范围**： 不涉及。 
     * @return cancelStrategy
     */
    public Object getCancelStrategy() {
        return cancelStrategy;
    }

    public void setCancelStrategy(Object cancelStrategy) {
        this.cancelStrategy = cancelStrategy;
    }

    public ShowPipelineDetailResponse withTagIds(List<String> tagIds) {
        this.tagIds = tagIds;
        return this;
    }

    public ShowPipelineDetailResponse addTagIdsItem(String tagIdsItem) {
        if (this.tagIds == null) {
            this.tagIds = new ArrayList<>();
        }
        this.tagIds.add(tagIdsItem);
        return this;
    }

    public ShowPipelineDetailResponse withTagIds(Consumer<List<String>> tagIdsSetter) {
        if (this.tagIds == null) {
            this.tagIds = new ArrayList<>();
        }
        tagIdsSetter.accept(this.tagIds);
        return this;
    }

    /**
     * **参数解释**： 流水线标签ID列表。 **取值范围**： 不涉及。 
     * @return tagIds
     */
    public List<String> getTagIds() {
        return tagIds;
    }

    public void setTagIds(List<String> tagIds) {
        this.tagIds = tagIds;
    }

    public ShowPipelineDetailResponse withVariableGroups(List<String> variableGroups) {
        this.variableGroups = variableGroups;
        return this;
    }

    public ShowPipelineDetailResponse addVariableGroupsItem(String variableGroupsItem) {
        if (this.variableGroups == null) {
            this.variableGroups = new ArrayList<>();
        }
        this.variableGroups.add(variableGroupsItem);
        return this;
    }

    public ShowPipelineDetailResponse withVariableGroups(Consumer<List<String>> variableGroupsSetter) {
        if (this.variableGroups == null) {
            this.variableGroups = new ArrayList<>();
        }
        variableGroupsSetter.accept(this.variableGroups);
        return this;
    }

    /**
     * **参数解释**： 流水线变量组列表。 **取值范围**： 不涉及。 
     * @return variableGroups
     */
    public List<String> getVariableGroups() {
        return variableGroups;
    }

    public void setVariableGroups(List<String> variableGroups) {
        this.variableGroups = variableGroups;
    }

    public ShowPipelineDetailResponse withSecurityLevelCode(String securityLevelCode) {
        this.securityLevelCode = securityLevelCode;
        return this;
    }

    /**
     * **参数解释**： 流水线密级代码。 **取值范围**： 不涉及。 
     * @return securityLevelCode
     */
    public String getSecurityLevelCode() {
        return securityLevelCode;
    }

    public void setSecurityLevelCode(String securityLevelCode) {
        this.securityLevelCode = securityLevelCode;
    }

    public ShowPipelineDetailResponse withPermissions(Object permissions) {
        this.permissions = permissions;
        return this;
    }

    /**
     * **参数解释**： 流水线权限信息。 **取值范围**： 不涉及。 
     * @return permissions
     */
    public Object getPermissions() {
        return permissions;
    }

    public void setPermissions(Object permissions) {
        this.permissions = permissions;
    }

    public ShowPipelineDetailResponse withSubjectId(String subjectId) {
        this.subjectId = subjectId;
        return this;
    }

    /**
     * **参数解释**： 主体ID，即流水线ID。 **取值范围**： 32位字符，仅由数字和字母组成。 
     * @return subjectId
     */
    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public ShowPipelineDetailResponse withDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
        return this;
    }

    /**
     * **参数解释**： 流水线详情页URL。 **取值范围**： 不涉及。 
     * @return detailUrl
     */
    public String getDetailUrl() {
        return detailUrl;
    }

    public void setDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
    }

    public ShowPipelineDetailResponse withModifyUrl(String modifyUrl) {
        this.modifyUrl = modifyUrl;
        return this;
    }

    /**
     * **参数解释**： 流水线编辑页URL。 **取值范围**： 不涉及。 
     * @return modifyUrl
     */
    public String getModifyUrl() {
        return modifyUrl;
    }

    public void setModifyUrl(String modifyUrl) {
        this.modifyUrl = modifyUrl;
    }

    public ShowPipelineDetailResponse withTags(List<Object> tags) {
        this.tags = tags;
        return this;
    }

    public ShowPipelineDetailResponse addTagsItem(Object tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ShowPipelineDetailResponse withTags(Consumer<List<Object>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释**： 流水线标签列表。 **取值范围**： 不涉及。 
     * @return tags
     */
    public List<Object> getTags() {
        return tags;
    }

    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

    public ShowPipelineDetailResponse withIsCrModel(Boolean isCrModel) {
        this.isCrModel = isCrModel;
        return this;
    }

    /**
     * **参数解释**： 是否为CR（变更）模型流水线。 **取值范围**： - true：是CR模型流水线。 - false：非CR模型流水线。 
     * @return isCrModel
     */
    public Boolean getIsCrModel() {
        return isCrModel;
    }

    public void setIsCrModel(Boolean isCrModel) {
        this.isCrModel = isCrModel;
    }

    public ShowPipelineDetailResponse withArchiveSource(Object archiveSource) {
        this.archiveSource = archiveSource;
        return this;
    }

    /**
     * **参数解释**： PAC归档源信息。 **取值范围**： 不涉及。 
     * @return archiveSource
     */
    public Object getArchiveSource() {
        return archiveSource;
    }

    public void setArchiveSource(Object archiveSource) {
        this.archiveSource = archiveSource;
    }

    public ShowPipelineDetailResponse withYamlRepoProperties(Object yamlRepoProperties) {
        this.yamlRepoProperties = yamlRepoProperties;
        return this;
    }

    /**
     * **参数解释**： V2 YAML流水线的代码仓相关信息。 **取值范围**： 不涉及。 
     * @return yamlRepoProperties
     */
    public Object getYamlRepoProperties() {
        return yamlRepoProperties;
    }

    public void setYamlRepoProperties(Object yamlRepoProperties) {
        this.yamlRepoProperties = yamlRepoProperties;
    }

    public ShowPipelineDetailResponse withVariableGroupIds(List<String> variableGroupIds) {
        this.variableGroupIds = variableGroupIds;
        return this;
    }

    public ShowPipelineDetailResponse addVariableGroupIdsItem(String variableGroupIdsItem) {
        if (this.variableGroupIds == null) {
            this.variableGroupIds = new ArrayList<>();
        }
        this.variableGroupIds.add(variableGroupIdsItem);
        return this;
    }

    public ShowPipelineDetailResponse withVariableGroupIds(Consumer<List<String>> variableGroupIdsSetter) {
        if (this.variableGroupIds == null) {
            this.variableGroupIds = new ArrayList<>();
        }
        variableGroupIdsSetter.accept(this.variableGroupIds);
        return this;
    }

    /**
     * **参数解释**： 关联的通用参数组ID列表。 **取值范围**： 不涉及。 
     * @return variableGroupIds
     */
    public List<String> getVariableGroupIds() {
        return variableGroupIds;
    }

    public void setVariableGroupIds(List<String> variableGroupIds) {
        this.variableGroupIds = variableGroupIds;
    }

    public ShowPipelineDetailResponse withPacSourceAlias(String pacSourceAlias) {
        this.pacSourceAlias = pacSourceAlias;
        return this;
    }

    /**
     * **参数解释**： PAC代码源别名。 **取值范围**： 不涉及。 
     * @return pacSourceAlias
     */
    public String getPacSourceAlias() {
        return pacSourceAlias;
    }

    public void setPacSourceAlias(String pacSourceAlias) {
        this.pacSourceAlias = pacSourceAlias;
    }

    public ShowPipelineDetailResponse withPacSourceRepoHttpsEndpoint(String pacSourceRepoHttpsEndpoint) {
        this.pacSourceRepoHttpsEndpoint = pacSourceRepoHttpsEndpoint;
        return this;
    }

    /**
     * **参数解释**： PAC代码源CodeHub仓库的HTTPS端点ID。 **取值范围**： 不涉及。 
     * @return pacSourceRepoHttpsEndpoint
     */
    public String getPacSourceRepoHttpsEndpoint() {
        return pacSourceRepoHttpsEndpoint;
    }

    public void setPacSourceRepoHttpsEndpoint(String pacSourceRepoHttpsEndpoint) {
        this.pacSourceRepoHttpsEndpoint = pacSourceRepoHttpsEndpoint;
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
            && Objects.equals(this.securityLevel, that.securityLevel) && Objects.equals(this.originId, that.originId)
            && Objects.equals(this.disableReleaseBranchManagement, that.disableReleaseBranchManagement)
            && Objects.equals(this.deleted, that.deleted) && Objects.equals(this.banned, that.banned)
            && Objects.equals(this.fromGitCode, that.fromGitCode)
            && Objects.equals(this.fromGitCodeRepo, that.fromGitCodeRepo)
            && Objects.equals(this.gitCodeRepoId, that.gitCodeRepoId)
            && Objects.equals(this.yamlDefinition, that.yamlDefinition)
            && Objects.equals(this.pacRepoRelation, that.pacRepoRelation)
            && Objects.equals(this.yamlContent, that.yamlContent) && Objects.equals(this.agencyName, that.agencyName)
            && Objects.equals(this.executionPlans, that.executionPlans)
            && Objects.equals(this.fromSource, that.fromSource) && Objects.equals(this.projectName, that.projectName)
            && Objects.equals(this.groupName, that.groupName)
            && Objects.equals(this.concurrencyControl, that.concurrencyControl)
            && Objects.equals(this.cancelStrategy, that.cancelStrategy) && Objects.equals(this.tagIds, that.tagIds)
            && Objects.equals(this.variableGroups, that.variableGroups)
            && Objects.equals(this.securityLevelCode, that.securityLevelCode)
            && Objects.equals(this.permissions, that.permissions) && Objects.equals(this.subjectId, that.subjectId)
            && Objects.equals(this.detailUrl, that.detailUrl) && Objects.equals(this.modifyUrl, that.modifyUrl)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.isCrModel, that.isCrModel)
            && Objects.equals(this.archiveSource, that.archiveSource)
            && Objects.equals(this.yamlRepoProperties, that.yamlRepoProperties)
            && Objects.equals(this.variableGroupIds, that.variableGroupIds)
            && Objects.equals(this.pacSourceAlias, that.pacSourceAlias)
            && Objects.equals(this.pacSourceRepoHttpsEndpoint, that.pacSourceRepoHttpsEndpoint);
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
            securityLevel,
            originId,
            disableReleaseBranchManagement,
            deleted,
            banned,
            fromGitCode,
            fromGitCodeRepo,
            gitCodeRepoId,
            yamlDefinition,
            pacRepoRelation,
            yamlContent,
            agencyName,
            executionPlans,
            fromSource,
            projectName,
            groupName,
            concurrencyControl,
            cancelStrategy,
            tagIds,
            variableGroups,
            securityLevelCode,
            permissions,
            subjectId,
            detailUrl,
            modifyUrl,
            tags,
            isCrModel,
            archiveSource,
            yamlRepoProperties,
            variableGroupIds,
            pacSourceAlias,
            pacSourceRepoHttpsEndpoint);
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
        sb.append("    originId: ").append(toIndentedString(originId)).append("\n");
        sb.append("    disableReleaseBranchManagement: ")
            .append(toIndentedString(disableReleaseBranchManagement))
            .append("\n");
        sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
        sb.append("    banned: ").append(toIndentedString(banned)).append("\n");
        sb.append("    fromGitCode: ").append(toIndentedString(fromGitCode)).append("\n");
        sb.append("    fromGitCodeRepo: ").append(toIndentedString(fromGitCodeRepo)).append("\n");
        sb.append("    gitCodeRepoId: ").append(toIndentedString(gitCodeRepoId)).append("\n");
        sb.append("    yamlDefinition: ").append(toIndentedString(yamlDefinition)).append("\n");
        sb.append("    pacRepoRelation: ").append(toIndentedString(pacRepoRelation)).append("\n");
        sb.append("    yamlContent: ").append(toIndentedString(yamlContent)).append("\n");
        sb.append("    agencyName: ").append(toIndentedString(agencyName)).append("\n");
        sb.append("    executionPlans: ").append(toIndentedString(executionPlans)).append("\n");
        sb.append("    fromSource: ").append(toIndentedString(fromSource)).append("\n");
        sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    concurrencyControl: ").append(toIndentedString(concurrencyControl)).append("\n");
        sb.append("    cancelStrategy: ").append(toIndentedString(cancelStrategy)).append("\n");
        sb.append("    tagIds: ").append(toIndentedString(tagIds)).append("\n");
        sb.append("    variableGroups: ").append(toIndentedString(variableGroups)).append("\n");
        sb.append("    securityLevelCode: ").append(toIndentedString(securityLevelCode)).append("\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
        sb.append("    subjectId: ").append(toIndentedString(subjectId)).append("\n");
        sb.append("    detailUrl: ").append(toIndentedString(detailUrl)).append("\n");
        sb.append("    modifyUrl: ").append(toIndentedString(modifyUrl)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    isCrModel: ").append(toIndentedString(isCrModel)).append("\n");
        sb.append("    archiveSource: ").append(toIndentedString(archiveSource)).append("\n");
        sb.append("    yamlRepoProperties: ").append(toIndentedString(yamlRepoProperties)).append("\n");
        sb.append("    variableGroupIds: ").append(toIndentedString(variableGroupIds)).append("\n");
        sb.append("    pacSourceAlias: ").append(toIndentedString(pacSourceAlias)).append("\n");
        sb.append("    pacSourceRepoHttpsEndpoint: ").append(toIndentedString(pacSourceRepoHttpsEndpoint)).append("\n");
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
