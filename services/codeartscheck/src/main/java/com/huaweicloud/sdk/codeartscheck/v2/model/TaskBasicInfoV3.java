package com.huaweicloud.sdk.codeartscheck.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 任务信息。
 */
public class TaskBasicInfoV3 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "avastarType")

    private String avastarType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "branchName")

    private String branchName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "canChangeIgnoreMode")

    private Boolean canChangeIgnoreMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "canDelete")

    private Boolean canDelete;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "canEdit")

    private Boolean canEdit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "canEditTemplateSwitch")

    private Boolean canEditTemplateSwitch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "canExecute")

    private Boolean canExecute;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "canRead")

    private Boolean canRead;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "checkParamList")

    private List<CustomParameter> checkParamList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "checkParamMap")

    private TaskBasicInfoV3CheckParamMap checkParamMap;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "configTemplateId")

    private String configTemplateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "createTime")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "criterionSets")

    private List<ConfigTemplateRuleSetInfo> criterionSets = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customParams")

    private List<CustomParameter> customParams = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "defaultBranchName")

    private String defaultBranchName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fileEncoding")

    private String fileEncoding;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hwCloudRegion")

    private String hwCloudRegion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "includePaths")

    private String includePaths;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isSetMrWebhook")

    private Boolean isSetMrWebhook;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isSetPushWebhook")

    private Boolean isSetPushWebhook;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isSetWebhook")

    private Boolean isSetWebhook;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isTemplateTask")

    private Boolean isTemplateTask;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobId")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobTimeout")

    private String jobTimeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lastFinishedFullJobId")

    private String lastFinishedFullJobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lastJob")

    private JobBasicInfoV3 lastJob;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lastReviser")

    private String lastReviser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lastUpdateTime")

    private String lastUpdateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modelSets")

    private List<String> modelSets = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mrCheckBranchStrategy")

    private Integer mrCheckBranchStrategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notificationConfig")

    private String notificationConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ownerId")

    private String ownerId;

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
    @JsonProperty(value = "repoId")

    private String repoId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repoUrl")

    private String repoUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reviewData")

    private List<String> reviewData = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ruleSets")

    private List<String> ruleSets = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private String source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "taskGroupId")

    private String taskGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "taskIds")

    private List<String> taskIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenantId")

    private String tenantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "useCache")

    private Boolean useCache;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "useWorkspaceNotificationConfig")

    private Integer useWorkspaceNotificationConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "versionUpdateDelayDays")

    private List<String> versionUpdateDelayDays = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "webhookCheckMode")

    private Integer webhookCheckMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "zone")

    private String zone;

    public TaskBasicInfoV3 withAvastarType(String avastarType) {
        this.avastarType = avastarType;
        return this;
    }

    /**
     * **参数解释：** 头像颜色。 **取值范围：** - pure-blue：蓝色。 - pure-purple：紫色。 - pure-tomato：红色。 - pure-green：绿色。 - pure-orange：橙色。 - pure-pink：粉色。
     * @return avastarType
     */
    public String getAvastarType() {
        return avastarType;
    }

    public void setAvastarType(String avastarType) {
        this.avastarType = avastarType;
    }

    public TaskBasicInfoV3 withBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }

    /**
     * **参数解释：** 分支名称。 **取值范围：** 长度为[1~200]个字符。
     * @return branchName
     */
    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
    }

    public TaskBasicInfoV3 withCanChangeIgnoreMode(Boolean canChangeIgnoreMode) {
        this.canChangeIgnoreMode = canChangeIgnoreMode;
        return this;
    }

    /**
     * **参数解释：** 是否可以更新忽略文件模式。 **取值范围：** - true：能更新忽略文件模式。 - false：不能更新忽略文件模式。
     * @return canChangeIgnoreMode
     */
    public Boolean getCanChangeIgnoreMode() {
        return canChangeIgnoreMode;
    }

    public void setCanChangeIgnoreMode(Boolean canChangeIgnoreMode) {
        this.canChangeIgnoreMode = canChangeIgnoreMode;
    }

    public TaskBasicInfoV3 withCanDelete(Boolean canDelete) {
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

    public TaskBasicInfoV3 withCanEdit(Boolean canEdit) {
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

    public TaskBasicInfoV3 withCanEditTemplateSwitch(Boolean canEditTemplateSwitch) {
        this.canEditTemplateSwitch = canEditTemplateSwitch;
        return this;
    }

    /**
     * **参数解释：** 是否有切换任务模板的权限。 **取值范围：** - true：有切换任务模板的权限。 - false：没有切换任务模板的权限。
     * @return canEditTemplateSwitch
     */
    public Boolean getCanEditTemplateSwitch() {
        return canEditTemplateSwitch;
    }

    public void setCanEditTemplateSwitch(Boolean canEditTemplateSwitch) {
        this.canEditTemplateSwitch = canEditTemplateSwitch;
    }

    public TaskBasicInfoV3 withCanExecute(Boolean canExecute) {
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

    public TaskBasicInfoV3 withCanRead(Boolean canRead) {
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

    public TaskBasicInfoV3 withCheckParamList(List<CustomParameter> checkParamList) {
        this.checkParamList = checkParamList;
        return this;
    }

    public TaskBasicInfoV3 addCheckParamListItem(CustomParameter checkParamListItem) {
        if (this.checkParamList == null) {
            this.checkParamList = new ArrayList<>();
        }
        this.checkParamList.add(checkParamListItem);
        return this;
    }

    public TaskBasicInfoV3 withCheckParamList(Consumer<List<CustomParameter>> checkParamListSetter) {
        if (this.checkParamList == null) {
            this.checkParamList = new ArrayList<>();
        }
        checkParamListSetter.accept(this.checkParamList);
        return this;
    }

    /**
     * **参数解释：** 自定义参数列表。
     * @return checkParamList
     */
    public List<CustomParameter> getCheckParamList() {
        return checkParamList;
    }

    public void setCheckParamList(List<CustomParameter> checkParamList) {
        this.checkParamList = checkParamList;
    }

    public TaskBasicInfoV3 withCheckParamMap(TaskBasicInfoV3CheckParamMap checkParamMap) {
        this.checkParamMap = checkParamMap;
        return this;
    }

    public TaskBasicInfoV3 withCheckParamMap(Consumer<TaskBasicInfoV3CheckParamMap> checkParamMapSetter) {
        if (this.checkParamMap == null) {
            this.checkParamMap = new TaskBasicInfoV3CheckParamMap();
            checkParamMapSetter.accept(this.checkParamMap);
        }

        return this;
    }

    /**
     * Get checkParamMap
     * @return checkParamMap
     */
    public TaskBasicInfoV3CheckParamMap getCheckParamMap() {
        return checkParamMap;
    }

    public void setCheckParamMap(TaskBasicInfoV3CheckParamMap checkParamMap) {
        this.checkParamMap = checkParamMap;
    }

    public TaskBasicInfoV3 withConfigTemplateId(String configTemplateId) {
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

    public TaskBasicInfoV3 withCreateTime(String createTime) {
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

    public TaskBasicInfoV3 withCriterionSets(List<ConfigTemplateRuleSetInfo> criterionSets) {
        this.criterionSets = criterionSets;
        return this;
    }

    public TaskBasicInfoV3 addCriterionSetsItem(ConfigTemplateRuleSetInfo criterionSetsItem) {
        if (this.criterionSets == null) {
            this.criterionSets = new ArrayList<>();
        }
        this.criterionSets.add(criterionSetsItem);
        return this;
    }

    public TaskBasicInfoV3 withCriterionSets(Consumer<List<ConfigTemplateRuleSetInfo>> criterionSetsSetter) {
        if (this.criterionSets == null) {
            this.criterionSets = new ArrayList<>();
        }
        criterionSetsSetter.accept(this.criterionSets);
        return this;
    }

    /**
     * **参数解释：** 规则集列表，该字段一般返回空数组[]。
     * @return criterionSets
     */
    public List<ConfigTemplateRuleSetInfo> getCriterionSets() {
        return criterionSets;
    }

    public void setCriterionSets(List<ConfigTemplateRuleSetInfo> criterionSets) {
        this.criterionSets = criterionSets;
    }

    public TaskBasicInfoV3 withCustomParams(List<CustomParameter> customParams) {
        this.customParams = customParams;
        return this;
    }

    public TaskBasicInfoV3 addCustomParamsItem(CustomParameter customParamsItem) {
        if (this.customParams == null) {
            this.customParams = new ArrayList<>();
        }
        this.customParams.add(customParamsItem);
        return this;
    }

    public TaskBasicInfoV3 withCustomParams(Consumer<List<CustomParameter>> customParamsSetter) {
        if (this.customParams == null) {
            this.customParams = new ArrayList<>();
        }
        customParamsSetter.accept(this.customParams);
        return this;
    }

    /**
     * **参数解释：** 自定义参数列表，该字段一般返回空数组[]。
     * @return customParams
     */
    public List<CustomParameter> getCustomParams() {
        return customParams;
    }

    public void setCustomParams(List<CustomParameter> customParams) {
        this.customParams = customParams;
    }

    public TaskBasicInfoV3 withDefaultBranchName(String defaultBranchName) {
        this.defaultBranchName = defaultBranchName;
        return this;
    }

    /**
     * **参数解释：** 默认分支的分支名。 **取值范围：** 长度为[1~200]个字符。
     * @return defaultBranchName
     */
    public String getDefaultBranchName() {
        return defaultBranchName;
    }

    public void setDefaultBranchName(String defaultBranchName) {
        this.defaultBranchName = defaultBranchName;
    }

    public TaskBasicInfoV3 withFileEncoding(String fileEncoding) {
        this.fileEncoding = fileEncoding;
        return this;
    }

    /**
     * **参数解释：** 文件编码。 **取值范围：** - UTF-8：UTF-8格式。 - GBK：GBK格式。
     * @return fileEncoding
     */
    public String getFileEncoding() {
        return fileEncoding;
    }

    public void setFileEncoding(String fileEncoding) {
        this.fileEncoding = fileEncoding;
    }

    public TaskBasicInfoV3 withHwCloudRegion(String hwCloudRegion) {
        this.hwCloudRegion = hwCloudRegion;
        return this;
    }

    /**
     * **参数解释：** 华为云地域。 **取值范围：** 长度为[1~32]个字符。
     * @return hwCloudRegion
     */
    public String getHwCloudRegion() {
        return hwCloudRegion;
    }

    public void setHwCloudRegion(String hwCloudRegion) {
        this.hwCloudRegion = hwCloudRegion;
    }

    public TaskBasicInfoV3 withId(String id) {
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

    public TaskBasicInfoV3 withIncludePaths(String includePaths) {
        this.includePaths = includePaths;
        return this;
    }

    /**
     * **参数解释：** 检查目录。 不配置检查目录时，检查代码仓中所有目录下的代码文件； 配置检查目录时，只检查配置目录中的代码文件。 **取值范围：** 长度为[1~200]个字符。
     * @return includePaths
     */
    public String getIncludePaths() {
        return includePaths;
    }

    public void setIncludePaths(String includePaths) {
        this.includePaths = includePaths;
    }

    public TaskBasicInfoV3 withIsSetMrWebhook(Boolean isSetMrWebhook) {
        this.isSetMrWebhook = isSetMrWebhook;
        return this;
    }

    /**
     * **参数解释：** 是否打开合并请求时触发。 **取值范围：** - true：打开。 - false：关闭。
     * @return isSetMrWebhook
     */
    public Boolean getIsSetMrWebhook() {
        return isSetMrWebhook;
    }

    public void setIsSetMrWebhook(Boolean isSetMrWebhook) {
        this.isSetMrWebhook = isSetMrWebhook;
    }

    public TaskBasicInfoV3 withIsSetPushWebhook(Boolean isSetPushWebhook) {
        this.isSetPushWebhook = isSetPushWebhook;
        return this;
    }

    /**
     * **参数解释：** 是否打开代码提交时触发。 **取值范围：** - true：打开。 - false：关闭。
     * @return isSetPushWebhook
     */
    public Boolean getIsSetPushWebhook() {
        return isSetPushWebhook;
    }

    public void setIsSetPushWebhook(Boolean isSetPushWebhook) {
        this.isSetPushWebhook = isSetPushWebhook;
    }

    public TaskBasicInfoV3 withIsSetWebhook(Boolean isSetWebhook) {
        this.isSetWebhook = isSetWebhook;
        return this;
    }

    /**
     * **参数解释：** 是否打开合并请求时触发。 **取值范围：** - true：打开。 - false：关闭。
     * @return isSetWebhook
     */
    public Boolean getIsSetWebhook() {
        return isSetWebhook;
    }

    public void setIsSetWebhook(Boolean isSetWebhook) {
        this.isSetWebhook = isSetWebhook;
    }

    public TaskBasicInfoV3 withIsTemplateTask(Boolean isTemplateTask) {
        this.isTemplateTask = isTemplateTask;
        return this;
    }

    /**
     * **参数解释：** 是否是任务模板。 **取值范围：** - true：是任务模板。 - false：不是任务模板。
     * @return isTemplateTask
     */
    public Boolean getIsTemplateTask() {
        return isTemplateTask;
    }

    public void setIsTemplateTask(Boolean isTemplateTask) {
        this.isTemplateTask = isTemplateTask;
    }

    public TaskBasicInfoV3 withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * **参数解释：** 执行ID，来自代码检查执行任务接口的返回值，每次执行代码检查任务都有唯一的执行ID。 **取值范围：** 长度为[1~128]个字符。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public TaskBasicInfoV3 withJobTimeout(String jobTimeout) {
        this.jobTimeout = jobTimeout;
        return this;
    }

    /**
     * **参数解释:** 超时时间，以分钟为单位，格式固定为\"xxx min\"，其中xxx为整数，0 ＜ xxx ≤ 1200。 **取值范围：** 不涉及。
     * @return jobTimeout
     */
    public String getJobTimeout() {
        return jobTimeout;
    }

    public void setJobTimeout(String jobTimeout) {
        this.jobTimeout = jobTimeout;
    }

    public TaskBasicInfoV3 withLastFinishedFullJobId(String lastFinishedFullJobId) {
        this.lastFinishedFullJobId = lastFinishedFullJobId;
        return this;
    }

    /**
     * **参数解释：** 最后一次检查完成的任务的执行ID。 **取值范围：** 长度为[1~128]个字符。
     * @return lastFinishedFullJobId
     */
    public String getLastFinishedFullJobId() {
        return lastFinishedFullJobId;
    }

    public void setLastFinishedFullJobId(String lastFinishedFullJobId) {
        this.lastFinishedFullJobId = lastFinishedFullJobId;
    }

    public TaskBasicInfoV3 withLastJob(JobBasicInfoV3 lastJob) {
        this.lastJob = lastJob;
        return this;
    }

    public TaskBasicInfoV3 withLastJob(Consumer<JobBasicInfoV3> lastJobSetter) {
        if (this.lastJob == null) {
            this.lastJob = new JobBasicInfoV3();
            lastJobSetter.accept(this.lastJob);
        }

        return this;
    }

    /**
     * Get lastJob
     * @return lastJob
     */
    public JobBasicInfoV3 getLastJob() {
        return lastJob;
    }

    public void setLastJob(JobBasicInfoV3 lastJob) {
        this.lastJob = lastJob;
    }

    public TaskBasicInfoV3 withLastReviser(String lastReviser) {
        this.lastReviser = lastReviser;
        return this;
    }

    /**
     * **参数解释：** 任务的最后修改人。 **取值范围：** 不涉及。
     * @return lastReviser
     */
    public String getLastReviser() {
        return lastReviser;
    }

    public void setLastReviser(String lastReviser) {
        this.lastReviser = lastReviser;
    }

    public TaskBasicInfoV3 withLastUpdateTime(String lastUpdateTime) {
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

    public TaskBasicInfoV3 withModelSets(List<String> modelSets) {
        this.modelSets = modelSets;
        return this;
    }

    public TaskBasicInfoV3 addModelSetsItem(String modelSetsItem) {
        if (this.modelSets == null) {
            this.modelSets = new ArrayList<>();
        }
        this.modelSets.add(modelSetsItem);
        return this;
    }

    public TaskBasicInfoV3 withModelSets(Consumer<List<String>> modelSetsSetter) {
        if (this.modelSets == null) {
            this.modelSets = new ArrayList<>();
        }
        modelSetsSetter.accept(this.modelSets);
        return this;
    }

    /**
     * **参数解释：** 模型集列表，该字段一般返回空数组[]。
     * @return modelSets
     */
    public List<String> getModelSets() {
        return modelSets;
    }

    public void setModelSets(List<String> modelSets) {
        this.modelSets = modelSets;
    }

    public TaskBasicInfoV3 withMrCheckBranchStrategy(Integer mrCheckBranchStrategy) {
        this.mrCheckBranchStrategy = mrCheckBranchStrategy;
        return this;
    }

    /**
     * **参数解释：** mr检查分支门禁策略。 **取值范围：** - 0：白名单。
     * @return mrCheckBranchStrategy
     */
    public Integer getMrCheckBranchStrategy() {
        return mrCheckBranchStrategy;
    }

    public void setMrCheckBranchStrategy(Integer mrCheckBranchStrategy) {
        this.mrCheckBranchStrategy = mrCheckBranchStrategy;
    }

    public TaskBasicInfoV3 withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 代码检查任务名。 **取值范围：** 长度为[1~128]个字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TaskBasicInfoV3 withNotificationConfig(String notificationConfig) {
        this.notificationConfig = notificationConfig;
        return this;
    }

    /**
     * **参数解释：** 消息通知是否使用项目通知设置的配置项，格式为x,x,x,x,x,x，其中x的取值为0或者1。 x为0时代表使用任务的通知设置，x为1时代表使用项目通知设置。 从左到右依次为站内消息通知、邮件通知、企业微信、钉钉、飞书、通用webhook的消息通知配置。 **取值范围：** 格式为x,x,x,x,x,x，其中x的取值为0或者1。
     * @return notificationConfig
     */
    public String getNotificationConfig() {
        return notificationConfig;
    }

    public void setNotificationConfig(String notificationConfig) {
        this.notificationConfig = notificationConfig;
    }

    public TaskBasicInfoV3 withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * **参数解释：** 代码检查任务所有者。 **取值范围：** 长度为[1~255]个字符。
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public TaskBasicInfoV3 withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * **参数解释：** 代码检查任务所有者的用户ID。 **取值范围：** 长度为[1~64]个字符。
     * @return ownerId
     */
    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public TaskBasicInfoV3 withProjectId(String projectId) {
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

    public TaskBasicInfoV3 withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * **参数解释：** 项目名。 **取值范围：** 长度为[1~128]个字符。
     * @return projectName
     */
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public TaskBasicInfoV3 withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * **参数解释：** 地域，此字段固定为\"suzhou\"。 **取值范围：** suzhou。
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public TaskBasicInfoV3 withRepoId(String repoId) {
        this.repoId = repoId;
        return this;
    }

    /**
     * **参数解释：** 代码仓地址对应的CodeartsRepo仓的RepoId。 **取值范围：** 长度为[1~128]个字符。
     * @return repoId
     */
    public String getRepoId() {
        return repoId;
    }

    public void setRepoId(String repoId) {
        this.repoId = repoId;
    }

    public TaskBasicInfoV3 withRepoUrl(String repoUrl) {
        this.repoUrl = repoUrl;
        return this;
    }

    /**
     * **参数解释：** 代码仓地址。 **取值范围：** 长度为[1~1024]个字符。
     * @return repoUrl
     */
    public String getRepoUrl() {
        return repoUrl;
    }

    public void setRepoUrl(String repoUrl) {
        this.repoUrl = repoUrl;
    }

    public TaskBasicInfoV3 withReviewData(List<String> reviewData) {
        this.reviewData = reviewData;
        return this;
    }

    public TaskBasicInfoV3 addReviewDataItem(String reviewDataItem) {
        if (this.reviewData == null) {
            this.reviewData = new ArrayList<>();
        }
        this.reviewData.add(reviewDataItem);
        return this;
    }

    public TaskBasicInfoV3 withReviewData(Consumer<List<String>> reviewDataSetter) {
        if (this.reviewData == null) {
            this.reviewData = new ArrayList<>();
        }
        reviewDataSetter.accept(this.reviewData);
        return this;
    }

    /**
     * **参数解释：** 门禁配置，该字段一般返回空数组[]。
     * @return reviewData
     */
    public List<String> getReviewData() {
        return reviewData;
    }

    public void setReviewData(List<String> reviewData) {
        this.reviewData = reviewData;
    }

    public TaskBasicInfoV3 withRuleSets(List<String> ruleSets) {
        this.ruleSets = ruleSets;
        return this;
    }

    public TaskBasicInfoV3 addRuleSetsItem(String ruleSetsItem) {
        if (this.ruleSets == null) {
            this.ruleSets = new ArrayList<>();
        }
        this.ruleSets.add(ruleSetsItem);
        return this;
    }

    public TaskBasicInfoV3 withRuleSets(Consumer<List<String>> ruleSetsSetter) {
        if (this.ruleSets == null) {
            this.ruleSets = new ArrayList<>();
        }
        ruleSetsSetter.accept(this.ruleSets);
        return this;
    }

    /**
     * **参数解释：** 规则集配置，该字段一般返回空数组[]。
     * @return ruleSets
     */
    public List<String> getRuleSets() {
        return ruleSets;
    }

    public void setRuleSets(List<String> ruleSets) {
        this.ruleSets = ruleSets;
    }

    public TaskBasicInfoV3 withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * **参数解释：** 任务来源，一般为\"customer\"。 **取值范围：** customer。
     * @return source
     */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public TaskBasicInfoV3 withTaskGroupId(String taskGroupId) {
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

    public TaskBasicInfoV3 withTaskIds(List<String> taskIds) {
        this.taskIds = taskIds;
        return this;
    }

    public TaskBasicInfoV3 addTaskIdsItem(String taskIdsItem) {
        if (this.taskIds == null) {
            this.taskIds = new ArrayList<>();
        }
        this.taskIds.add(taskIdsItem);
        return this;
    }

    public TaskBasicInfoV3 withTaskIds(Consumer<List<String>> taskIdsSetter) {
        if (this.taskIds == null) {
            this.taskIds = new ArrayList<>();
        }
        taskIdsSetter.accept(this.taskIds);
        return this;
    }

    /**
     * **参数解释：** 任务ID列表，该字段一般返回空数组[]。
     * @return taskIds
     */
    public List<String> getTaskIds() {
        return taskIds;
    }

    public void setTaskIds(List<String> taskIds) {
        this.taskIds = taskIds;
    }

    public TaskBasicInfoV3 withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * **参数解释：** 任务所属的租户的租户ID，租户ID的值来源于IAM的租户ID。 **取值范围：** 长度为[1~32]个字符。
     * @return tenantId
     */
    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public TaskBasicInfoV3 withUseCache(Boolean useCache) {
        this.useCache = useCache;
        return this;
    }

    /**
     * **参数解释：** 查询任务信息是否使用缓存。 **取值范围：** - true：使用缓存。 - false：不使用缓存。
     * @return useCache
     */
    public Boolean getUseCache() {
        return useCache;
    }

    public void setUseCache(Boolean useCache) {
        this.useCache = useCache;
    }

    public TaskBasicInfoV3 withUseWorkspaceNotificationConfig(Integer useWorkspaceNotificationConfig) {
        this.useWorkspaceNotificationConfig = useWorkspaceNotificationConfig;
        return this;
    }

    /**
     * **参数解释：** 消息通知是否使用项目通知设置的配置项，来自notificationConfig的对应的二进制的取反转化成十进制。 例如，notificationConfig配置为1,1,0,1,0,0，则二进制为110100，取反为001011，转化为10进制时该值为11，最终useWorkspaceNotificationConfig的值为11。 **取值范围：** 0-31
     * @return useWorkspaceNotificationConfig
     */
    public Integer getUseWorkspaceNotificationConfig() {
        return useWorkspaceNotificationConfig;
    }

    public void setUseWorkspaceNotificationConfig(Integer useWorkspaceNotificationConfig) {
        this.useWorkspaceNotificationConfig = useWorkspaceNotificationConfig;
    }

    public TaskBasicInfoV3 withVersionUpdateDelayDays(List<String> versionUpdateDelayDays) {
        this.versionUpdateDelayDays = versionUpdateDelayDays;
        return this;
    }

    public TaskBasicInfoV3 addVersionUpdateDelayDaysItem(String versionUpdateDelayDaysItem) {
        if (this.versionUpdateDelayDays == null) {
            this.versionUpdateDelayDays = new ArrayList<>();
        }
        this.versionUpdateDelayDays.add(versionUpdateDelayDaysItem);
        return this;
    }

    public TaskBasicInfoV3 withVersionUpdateDelayDays(Consumer<List<String>> versionUpdateDelayDaysSetter) {
        if (this.versionUpdateDelayDays == null) {
            this.versionUpdateDelayDays = new ArrayList<>();
        }
        versionUpdateDelayDaysSetter.accept(this.versionUpdateDelayDays);
        return this;
    }

    /**
     * **参数解释：** 版本升级缓冲期，该字段一般返回空数组[]。
     * @return versionUpdateDelayDays
     */
    public List<String> getVersionUpdateDelayDays() {
        return versionUpdateDelayDays;
    }

    public void setVersionUpdateDelayDays(List<String> versionUpdateDelayDays) {
        this.versionUpdateDelayDays = versionUpdateDelayDays;
    }

    public TaskBasicInfoV3 withWebhookCheckMode(Integer webhookCheckMode) {
        this.webhookCheckMode = webhookCheckMode;
        return this;
    }

    /**
     * **参数解释：** webhook检查模式，一般为0，代表禁止来自其它代码仓的MR。 **取值范围：** 0
     * @return webhookCheckMode
     */
    public Integer getWebhookCheckMode() {
        return webhookCheckMode;
    }

    public void setWebhookCheckMode(Integer webhookCheckMode) {
        this.webhookCheckMode = webhookCheckMode;
    }

    public TaskBasicInfoV3 withZone(String zone) {
        this.zone = zone;
        return this;
    }

    /**
     * **参数解释：** 区域，一般为green。 **取值范围：** green。
     * @return zone
     */
    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskBasicInfoV3 that = (TaskBasicInfoV3) obj;
        return Objects.equals(this.avastarType, that.avastarType) && Objects.equals(this.branchName, that.branchName)
            && Objects.equals(this.canChangeIgnoreMode, that.canChangeIgnoreMode)
            && Objects.equals(this.canDelete, that.canDelete) && Objects.equals(this.canEdit, that.canEdit)
            && Objects.equals(this.canEditTemplateSwitch, that.canEditTemplateSwitch)
            && Objects.equals(this.canExecute, that.canExecute) && Objects.equals(this.canRead, that.canRead)
            && Objects.equals(this.checkParamList, that.checkParamList)
            && Objects.equals(this.checkParamMap, that.checkParamMap)
            && Objects.equals(this.configTemplateId, that.configTemplateId)
            && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.criterionSets, that.criterionSets)
            && Objects.equals(this.customParams, that.customParams)
            && Objects.equals(this.defaultBranchName, that.defaultBranchName)
            && Objects.equals(this.fileEncoding, that.fileEncoding)
            && Objects.equals(this.hwCloudRegion, that.hwCloudRegion) && Objects.equals(this.id, that.id)
            && Objects.equals(this.includePaths, that.includePaths)
            && Objects.equals(this.isSetMrWebhook, that.isSetMrWebhook)
            && Objects.equals(this.isSetPushWebhook, that.isSetPushWebhook)
            && Objects.equals(this.isSetWebhook, that.isSetWebhook)
            && Objects.equals(this.isTemplateTask, that.isTemplateTask) && Objects.equals(this.jobId, that.jobId)
            && Objects.equals(this.jobTimeout, that.jobTimeout)
            && Objects.equals(this.lastFinishedFullJobId, that.lastFinishedFullJobId)
            && Objects.equals(this.lastJob, that.lastJob) && Objects.equals(this.lastReviser, that.lastReviser)
            && Objects.equals(this.lastUpdateTime, that.lastUpdateTime)
            && Objects.equals(this.modelSets, that.modelSets)
            && Objects.equals(this.mrCheckBranchStrategy, that.mrCheckBranchStrategy)
            && Objects.equals(this.name, that.name) && Objects.equals(this.notificationConfig, that.notificationConfig)
            && Objects.equals(this.owner, that.owner) && Objects.equals(this.ownerId, that.ownerId)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.projectName, that.projectName)
            && Objects.equals(this.region, that.region) && Objects.equals(this.repoId, that.repoId)
            && Objects.equals(this.repoUrl, that.repoUrl) && Objects.equals(this.reviewData, that.reviewData)
            && Objects.equals(this.ruleSets, that.ruleSets) && Objects.equals(this.source, that.source)
            && Objects.equals(this.taskGroupId, that.taskGroupId) && Objects.equals(this.taskIds, that.taskIds)
            && Objects.equals(this.tenantId, that.tenantId) && Objects.equals(this.useCache, that.useCache)
            && Objects.equals(this.useWorkspaceNotificationConfig, that.useWorkspaceNotificationConfig)
            && Objects.equals(this.versionUpdateDelayDays, that.versionUpdateDelayDays)
            && Objects.equals(this.webhookCheckMode, that.webhookCheckMode) && Objects.equals(this.zone, that.zone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(avastarType,
            branchName,
            canChangeIgnoreMode,
            canDelete,
            canEdit,
            canEditTemplateSwitch,
            canExecute,
            canRead,
            checkParamList,
            checkParamMap,
            configTemplateId,
            createTime,
            criterionSets,
            customParams,
            defaultBranchName,
            fileEncoding,
            hwCloudRegion,
            id,
            includePaths,
            isSetMrWebhook,
            isSetPushWebhook,
            isSetWebhook,
            isTemplateTask,
            jobId,
            jobTimeout,
            lastFinishedFullJobId,
            lastJob,
            lastReviser,
            lastUpdateTime,
            modelSets,
            mrCheckBranchStrategy,
            name,
            notificationConfig,
            owner,
            ownerId,
            projectId,
            projectName,
            region,
            repoId,
            repoUrl,
            reviewData,
            ruleSets,
            source,
            taskGroupId,
            taskIds,
            tenantId,
            useCache,
            useWorkspaceNotificationConfig,
            versionUpdateDelayDays,
            webhookCheckMode,
            zone);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskBasicInfoV3 {\n");
        sb.append("    avastarType: ").append(toIndentedString(avastarType)).append("\n");
        sb.append("    branchName: ").append(toIndentedString(branchName)).append("\n");
        sb.append("    canChangeIgnoreMode: ").append(toIndentedString(canChangeIgnoreMode)).append("\n");
        sb.append("    canDelete: ").append(toIndentedString(canDelete)).append("\n");
        sb.append("    canEdit: ").append(toIndentedString(canEdit)).append("\n");
        sb.append("    canEditTemplateSwitch: ").append(toIndentedString(canEditTemplateSwitch)).append("\n");
        sb.append("    canExecute: ").append(toIndentedString(canExecute)).append("\n");
        sb.append("    canRead: ").append(toIndentedString(canRead)).append("\n");
        sb.append("    checkParamList: ").append(toIndentedString(checkParamList)).append("\n");
        sb.append("    checkParamMap: ").append(toIndentedString(checkParamMap)).append("\n");
        sb.append("    configTemplateId: ").append(toIndentedString(configTemplateId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    criterionSets: ").append(toIndentedString(criterionSets)).append("\n");
        sb.append("    customParams: ").append(toIndentedString(customParams)).append("\n");
        sb.append("    defaultBranchName: ").append(toIndentedString(defaultBranchName)).append("\n");
        sb.append("    fileEncoding: ").append(toIndentedString(fileEncoding)).append("\n");
        sb.append("    hwCloudRegion: ").append(toIndentedString(hwCloudRegion)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    includePaths: ").append(toIndentedString(includePaths)).append("\n");
        sb.append("    isSetMrWebhook: ").append(toIndentedString(isSetMrWebhook)).append("\n");
        sb.append("    isSetPushWebhook: ").append(toIndentedString(isSetPushWebhook)).append("\n");
        sb.append("    isSetWebhook: ").append(toIndentedString(isSetWebhook)).append("\n");
        sb.append("    isTemplateTask: ").append(toIndentedString(isTemplateTask)).append("\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    jobTimeout: ").append(toIndentedString(jobTimeout)).append("\n");
        sb.append("    lastFinishedFullJobId: ").append(toIndentedString(lastFinishedFullJobId)).append("\n");
        sb.append("    lastJob: ").append(toIndentedString(lastJob)).append("\n");
        sb.append("    lastReviser: ").append(toIndentedString(lastReviser)).append("\n");
        sb.append("    lastUpdateTime: ").append(toIndentedString(lastUpdateTime)).append("\n");
        sb.append("    modelSets: ").append(toIndentedString(modelSets)).append("\n");
        sb.append("    mrCheckBranchStrategy: ").append(toIndentedString(mrCheckBranchStrategy)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    notificationConfig: ").append(toIndentedString(notificationConfig)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    repoId: ").append(toIndentedString(repoId)).append("\n");
        sb.append("    repoUrl: ").append(toIndentedString(repoUrl)).append("\n");
        sb.append("    reviewData: ").append(toIndentedString(reviewData)).append("\n");
        sb.append("    ruleSets: ").append(toIndentedString(ruleSets)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    taskGroupId: ").append(toIndentedString(taskGroupId)).append("\n");
        sb.append("    taskIds: ").append(toIndentedString(taskIds)).append("\n");
        sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
        sb.append("    useCache: ").append(toIndentedString(useCache)).append("\n");
        sb.append("    useWorkspaceNotificationConfig: ")
            .append(toIndentedString(useWorkspaceNotificationConfig))
            .append("\n");
        sb.append("    versionUpdateDelayDays: ").append(toIndentedString(versionUpdateDelayDays)).append("\n");
        sb.append("    webhookCheckMode: ").append(toIndentedString(webhookCheckMode)).append("\n");
        sb.append("    zone: ").append(toIndentedString(zone)).append("\n");
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
