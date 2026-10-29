package com.huaweicloud.sdk.codeartscheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 任务信息。 **取值范围：** 不涉及。
 */
public class TaskBasicInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branchName")

    private String branchName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "canDelete")

    private Boolean canDelete;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "canEdit")

    private Boolean canEdit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "canExecute")

    private Boolean canExecute;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "canRead")

    private Boolean canRead;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configTemplate")

    private ConfigTemplateBasicInfo configTemplate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configTemplateId")

    private String configTemplateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "createTime")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isFollowed")

    private Boolean isFollowed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobResult")

    private JobResultInfo jobResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lastJob")

    private JobBasicInfo lastJob;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lastUpdateTime")

    private String lastUpdateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "projectId")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "projectName")

    private String projectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repoUrl")

    private String repoUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ruleSets")

    private List<ConfigTemplateRuleSetInfo> ruleSets = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ruleType")

    private String ruleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "taskGroupId")

    private String taskGroupId;

    public TaskBasicInfo withBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }

    /**
     * **参数解释：** 分支名称。 **取值范围：** 不涉及。
     * @return branchName
     */
    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public TaskBasicInfo withCanDelete(Boolean canDelete) {
        this.canDelete = canDelete;
        return this;
    }

    /**
     * **参数解释：** 是否有删除任务的权限。 **取值范围：** - true：有删除的权限。 - false：没有删除的权限。
     * @return canDelete
     */
    public Boolean getCanDelete() {
        return canDelete;
    }

    public void setCanDelete(Boolean canDelete) {
        this.canDelete = canDelete;
    }

    public TaskBasicInfo withCanEdit(Boolean canEdit) {
        this.canEdit = canEdit;
        return this;
    }

    /**
     * **参数解释：** 是否有编辑的权限。 **取值范围：** - true：有编辑的权限。 - false：没有编辑的权限。
     * @return canEdit
     */
    public Boolean getCanEdit() {
        return canEdit;
    }

    public void setCanEdit(Boolean canEdit) {
        this.canEdit = canEdit;
    }

    public TaskBasicInfo withCanExecute(Boolean canExecute) {
        this.canExecute = canExecute;
        return this;
    }

    /**
     * **参数解释：** 是否有执行的权限。 **取值范围：** - true：有执行的权限。 - false：没有执行的权限。
     * @return canExecute
     */
    public Boolean getCanExecute() {
        return canExecute;
    }

    public void setCanExecute(Boolean canExecute) {
        this.canExecute = canExecute;
    }

    public TaskBasicInfo withCanRead(Boolean canRead) {
        this.canRead = canRead;
        return this;
    }

    /**
     * **参数解释：** 是否有读的权限。 **取值范围：** - true：有读的权限。 - false：没有读的权限。
     * @return canRead
     */
    public Boolean getCanRead() {
        return canRead;
    }

    public void setCanRead(Boolean canRead) {
        this.canRead = canRead;
    }

    public TaskBasicInfo withConfigTemplate(ConfigTemplateBasicInfo configTemplate) {
        this.configTemplate = configTemplate;
        return this;
    }

    public TaskBasicInfo withConfigTemplate(Consumer<ConfigTemplateBasicInfo> configTemplateSetter) {
        if (this.configTemplate == null) {
            this.configTemplate = new ConfigTemplateBasicInfo();
            configTemplateSetter.accept(this.configTemplate);
        }

        return this;
    }

    /**
     * Get configTemplate
     * @return configTemplate
     */
    public ConfigTemplateBasicInfo getConfigTemplate() {
        return configTemplate;
    }

    public void setConfigTemplate(ConfigTemplateBasicInfo configTemplate) {
        this.configTemplate = configTemplate;
    }

    public TaskBasicInfo withConfigTemplateId(String configTemplateId) {
        this.configTemplateId = configTemplateId;
        return this;
    }

    /**
     * **参数解释：** 任务的配置模板的ID。 **取值范围：** 长度为[1~128]个字符。
     * @return configTemplateId
     */
    public String getConfigTemplateId() {
        return configTemplateId;
    }

    public void setConfigTemplateId(String configTemplateId) {
        this.configTemplateId = configTemplateId;
    }

    public TaskBasicInfo withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释：** 任务的创建时间，使用UTC时间，格式为yyyy-MM-ddTHH:mm:ssZ，例如\"2025-11-28T06:55:41Z\"。 **取值范围：** 不涉及。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public TaskBasicInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 任务ID，即新建检查任务接口的返回值，每个代码检查任务及其下的分支任务、通过API创建的增量任务都有唯一的任务ID。即[[查询任务列表](https://support.huaweicloud.com/api-codecheck/ShowTasksList.html)](tag:hws)[[查询任务列表](https://support.huaweicloud.com/intl/zh-cn/api-codecheck/ShowTasksList.html)](tag:hws_hk)[查询任务列表](tag:hcs,hcs_sm)接口响应中的id字段。 **取值范围：** 长度为[1~128]个字符。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TaskBasicInfo withIsFollowed(Boolean isFollowed) {
        this.isFollowed = isFollowed;
        return this;
    }

    /**
     * **参数解释：** 任务是否被关注。 **取值范围：** - true：任务被关注。 - false：任务未被关注。
     * @return isFollowed
     */
    public Boolean getIsFollowed() {
        return isFollowed;
    }

    public void setIsFollowed(Boolean isFollowed) {
        this.isFollowed = isFollowed;
    }

    public TaskBasicInfo withJobResult(JobResultInfo jobResult) {
        this.jobResult = jobResult;
        return this;
    }

    public TaskBasicInfo withJobResult(Consumer<JobResultInfo> jobResultSetter) {
        if (this.jobResult == null) {
            this.jobResult = new JobResultInfo();
            jobResultSetter.accept(this.jobResult);
        }

        return this;
    }

    /**
     * Get jobResult
     * @return jobResult
     */
    public JobResultInfo getJobResult() {
        return jobResult;
    }

    public void setJobResult(JobResultInfo jobResult) {
        this.jobResult = jobResult;
    }

    public TaskBasicInfo withLastJob(JobBasicInfo lastJob) {
        this.lastJob = lastJob;
        return this;
    }

    public TaskBasicInfo withLastJob(Consumer<JobBasicInfo> lastJobSetter) {
        if (this.lastJob == null) {
            this.lastJob = new JobBasicInfo();
            lastJobSetter.accept(this.lastJob);
        }

        return this;
    }

    /**
     * Get lastJob
     * @return lastJob
     */
    public JobBasicInfo getLastJob() {
        return lastJob;
    }

    public void setLastJob(JobBasicInfo lastJob) {
        this.lastJob = lastJob;
    }

    public TaskBasicInfo withLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
        return this;
    }

    /**
     * **参数解释：** 任务的上一次更新时间，使用UTC时间，格式为yyyy-MM-ddTHH:mm:ssZ，例如\"2025-11-28T06:55:41Z\"。 **取值范围：** 不涉及。
     * @return lastUpdateTime
     */
    public String getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(String lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public TaskBasicInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 代码检查任务名。 **取值范围：** 不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TaskBasicInfo withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * **参数解释：** 代码检查任务所有者。 **取值范围：** 不涉及。
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public TaskBasicInfo withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释：** 项目的32位UUID，项目唯一标识，通过[[查询项目列表](https://support.huaweicloud.com/api-projectman/ListProjectsV4.html)](tag:hws)[[查询项目列表](https://support.huaweicloud.com/intl/zh-cn/api-projectman/ListProjectsV4.html)](tag:hws_hk)[查询项目列表](tag:hcs,hcs_sm,hcs_site,hcs_sitesm,fcs)接口获取。 **取值范围：** 长度为[1~32]个字符。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public TaskBasicInfo withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * **参数解释：** 项目名。 **取值范围：** 不涉及。
     * @return projectName
     */
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public TaskBasicInfo withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * **参数解释：** 华为云地域。 **取值范围：** 不涉及。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public TaskBasicInfo withRepoUrl(String repoUrl) {
        this.repoUrl = repoUrl;
        return this;
    }

    /**
     * **参数解释：** 代码仓地址。 **取值范围：** 不涉及。
     * @return repoUrl
     */
    public String getRepoUrl() {
        return repoUrl;
    }

    public void setRepoUrl(String repoUrl) {
        this.repoUrl = repoUrl;
    }

    public TaskBasicInfo withRuleSets(List<ConfigTemplateRuleSetInfo> ruleSets) {
        this.ruleSets = ruleSets;
        return this;
    }

    public TaskBasicInfo addRuleSetsItem(ConfigTemplateRuleSetInfo ruleSetsItem) {
        if (this.ruleSets == null) {
            this.ruleSets = new ArrayList<>();
        }
        this.ruleSets.add(ruleSetsItem);
        return this;
    }

    public TaskBasicInfo withRuleSets(Consumer<List<ConfigTemplateRuleSetInfo>> ruleSetsSetter) {
        if (this.ruleSets == null) {
            this.ruleSets = new ArrayList<>();
        }
        ruleSetsSetter.accept(this.ruleSets);
        return this;
    }

    /**
     * **参数解释：** 规则集配置列表。
     * @return ruleSets
     */
    public List<ConfigTemplateRuleSetInfo> getRuleSets() {
        return ruleSets;
    }

    public void setRuleSets(List<ConfigTemplateRuleSetInfo> ruleSets) {
        this.ruleSets = ruleSets;
    }

    public TaskBasicInfo withRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }

    /**
     * **参数解释：** 任务类型。 **取值范围：** - basic：普通任务。 - security：安全增强包任务。
     * @return ruleType
     */
    public String getRuleType() {
        return ruleType;
    }

    public void setRuleType(String ruleType) {
        this.ruleType = ruleType;
    }

    public TaskBasicInfo withTaskGroupId(String taskGroupId) {
        this.taskGroupId = taskGroupId;
        return this;
    }

    /**
     * **参数解释：** 任务分组的ID。 **取值范围：** 长度为[1~128]个字符。
     * @return taskGroupId
     */
    public String getTaskGroupId() {
        return taskGroupId;
    }

    public void setTaskGroupId(String taskGroupId) {
        this.taskGroupId = taskGroupId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskBasicInfo that = (TaskBasicInfo) obj;
        return Objects.equals(this.branchName, that.branchName) && Objects.equals(this.canDelete, that.canDelete)
            && Objects.equals(this.canEdit, that.canEdit) && Objects.equals(this.canExecute, that.canExecute)
            && Objects.equals(this.canRead, that.canRead) && Objects.equals(this.configTemplate, that.configTemplate)
            && Objects.equals(this.configTemplateId, that.configTemplateId)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.id, that.id)
            && Objects.equals(this.isFollowed, that.isFollowed) && Objects.equals(this.jobResult, that.jobResult)
            && Objects.equals(this.lastJob, that.lastJob) && Objects.equals(this.lastUpdateTime, that.lastUpdateTime)
            && Objects.equals(this.name, that.name) && Objects.equals(this.owner, that.owner)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.projectName, that.projectName)
            && Objects.equals(this.region, that.region) && Objects.equals(this.repoUrl, that.repoUrl)
            && Objects.equals(this.ruleSets, that.ruleSets) && Objects.equals(this.ruleType, that.ruleType)
            && Objects.equals(this.taskGroupId, that.taskGroupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(branchName,
            canDelete,
            canEdit,
            canExecute,
            canRead,
            configTemplate,
            configTemplateId,
            createTime,
            id,
            isFollowed,
            jobResult,
            lastJob,
            lastUpdateTime,
            name,
            owner,
            projectId,
            projectName,
            region,
            repoUrl,
            ruleSets,
            ruleType,
            taskGroupId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskBasicInfo {\n");
        sb.append("    branchName: ").append(toIndentedString(branchName)).append("\n");
        sb.append("    canDelete: ").append(toIndentedString(canDelete)).append("\n");
        sb.append("    canEdit: ").append(toIndentedString(canEdit)).append("\n");
        sb.append("    canExecute: ").append(toIndentedString(canExecute)).append("\n");
        sb.append("    canRead: ").append(toIndentedString(canRead)).append("\n");
        sb.append("    configTemplate: ").append(toIndentedString(configTemplate)).append("\n");
        sb.append("    configTemplateId: ").append(toIndentedString(configTemplateId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    isFollowed: ").append(toIndentedString(isFollowed)).append("\n");
        sb.append("    jobResult: ").append(toIndentedString(jobResult)).append("\n");
        sb.append("    lastJob: ").append(toIndentedString(lastJob)).append("\n");
        sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    repoUrl: ").append(toIndentedString(repoUrl)).append("\n");
        sb.append("    ruleSets: ").append(toIndentedString(ruleSets)).append("\n");
        sb.append("    ruleType: ").append(toIndentedString(ruleType)).append("\n");
        sb.append("    taskGroupId: ").append(toIndentedString(taskGroupId)).append("\n");
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
