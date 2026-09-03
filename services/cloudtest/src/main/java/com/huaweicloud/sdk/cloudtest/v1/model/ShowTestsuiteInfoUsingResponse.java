package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowTestsuiteInfoUsingResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alertAction")

    private String alertAction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alert_config")

    private AlertConfigVo alertConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build_products")

    private List<BuildProduct> buildProducts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_package_env_name")

    private String casePackageEnvName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_package_id")

    private String casePackageId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_package_name")

    private String casePackageName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_total")

    private Integer caseTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_type")

    private String clientType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloudTestSuite_basicInfo")

    private CloudTestSuiteBasicInfo cloudTestSuiteBasicInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "comments")

    private String comments;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_user")

    private String createUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "env_type")

    private Integer envType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "environment_group_id")

    private String environmentGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executeStrategies")

    private ExecuteStrategiesVo executeStrategies;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executor_type")

    private String executorType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extParams")

    private List<TaskExtParam> extParams = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "favorite")

    private String favorite;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipGroup")

    private IpGroup ipGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ipKey")

    private String ipKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isDebugTask")

    private Integer isDebugTask;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label")

    private String label;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labelName")

    private String labelName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labelType")

    private String labelType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lastStopTime")

    private Long lastStopTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location_ids")

    private List<String> locationIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "planId")

    private String planId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "preTestCaseInfo")

    private PreTestCaseInfo preTestCaseInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resourcePool")

    private ResourcePool resourcePool;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private Integer state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subtask_id")

    private String subtaskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subtaskTotal")

    private Long subtaskTotal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "taskTypeId")

    private String taskTypeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "testCaseAlertGroups")

    private List<TestCaseTemplateVo> testCaseAlertGroups = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "testCases")

    private List<TestCaseBasicInfo> testCases = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_service_id")

    private String testServiceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "testSuiteType")

    private Integer testSuiteType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tip")

    private String tip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_user")

    private String updateUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    public ShowTestsuiteInfoUsingResponse withAlertAction(String alertAction) {
        this.alertAction = alertAction;
        return this;
    }

    /**
     * 智能告警开关：0为置灰，1为可用
     * @return alertAction
     */
    public String getAlertAction() {
        return alertAction;
    }

    public void setAlertAction(String alertAction) {
        this.alertAction = alertAction;
    }

    public ShowTestsuiteInfoUsingResponse withAlertConfig(AlertConfigVo alertConfig) {
        this.alertConfig = alertConfig;
        return this;
    }

    public ShowTestsuiteInfoUsingResponse withAlertConfig(Consumer<AlertConfigVo> alertConfigSetter) {
        if (this.alertConfig == null) {
            this.alertConfig = new AlertConfigVo();
            alertConfigSetter.accept(this.alertConfig);
        }

        return this;
    }

    /**
     * Get alertConfig
     * @return alertConfig
     */
    public AlertConfigVo getAlertConfig() {
        return alertConfig;
    }

    public void setAlertConfig(AlertConfigVo alertConfig) {
        this.alertConfig = alertConfig;
    }

    public ShowTestsuiteInfoUsingResponse withBuildProducts(List<BuildProduct> buildProducts) {
        this.buildProducts = buildProducts;
        return this;
    }

    public ShowTestsuiteInfoUsingResponse addBuildProductsItem(BuildProduct buildProductsItem) {
        if (this.buildProducts == null) {
            this.buildProducts = new ArrayList<>();
        }
        this.buildProducts.add(buildProductsItem);
        return this;
    }

    public ShowTestsuiteInfoUsingResponse withBuildProducts(Consumer<List<BuildProduct>> buildProductsSetter) {
        if (this.buildProducts == null) {
            this.buildProducts = new ArrayList<>();
        }
        buildProductsSetter.accept(this.buildProducts);
        return this;
    }

    /**
     * 流水线启动测试套件，携带构建产物
     * @return buildProducts
     */
    public List<BuildProduct> getBuildProducts() {
        return buildProducts;
    }

    public void setBuildProducts(List<BuildProduct> buildProducts) {
        this.buildProducts = buildProducts;
    }

    public ShowTestsuiteInfoUsingResponse withCasePackageEnvName(String casePackageEnvName) {
        this.casePackageEnvName = casePackageEnvName;
        return this;
    }

    /**
     * 用例环境参数
     * @return casePackageEnvName
     */
    public String getCasePackageEnvName() {
        return casePackageEnvName;
    }

    public void setCasePackageEnvName(String casePackageEnvName) {
        this.casePackageEnvName = casePackageEnvName;
    }

    public ShowTestsuiteInfoUsingResponse withCasePackageId(String casePackageId) {
        this.casePackageId = casePackageId;
        return this;
    }

    /**
     * 用例包ID
     * @return casePackageId
     */
    public String getCasePackageId() {
        return casePackageId;
    }

    public void setCasePackageId(String casePackageId) {
        this.casePackageId = casePackageId;
    }

    public ShowTestsuiteInfoUsingResponse withCasePackageName(String casePackageName) {
        this.casePackageName = casePackageName;
        return this;
    }

    /**
     * 用例包名
     * @return casePackageName
     */
    public String getCasePackageName() {
        return casePackageName;
    }

    public void setCasePackageName(String casePackageName) {
        this.casePackageName = casePackageName;
    }

    public ShowTestsuiteInfoUsingResponse withCaseTotal(Integer caseTotal) {
        this.caseTotal = caseTotal;
        return this;
    }

    /**
     * 用例总数
     * @return caseTotal
     */
    public Integer getCaseTotal() {
        return caseTotal;
    }

    public void setCaseTotal(Integer caseTotal) {
        this.caseTotal = caseTotal;
    }

    public ShowTestsuiteInfoUsingResponse withClientType(String clientType) {
        this.clientType = clientType;
        return this;
    }

    /**
     * 客户端类型，deviceTest使用
     * @return clientType
     */
    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public ShowTestsuiteInfoUsingResponse withCloudTestSuiteBasicInfo(CloudTestSuiteBasicInfo cloudTestSuiteBasicInfo) {
        this.cloudTestSuiteBasicInfo = cloudTestSuiteBasicInfo;
        return this;
    }

    public ShowTestsuiteInfoUsingResponse withCloudTestSuiteBasicInfo(
        Consumer<CloudTestSuiteBasicInfo> cloudTestSuiteBasicInfoSetter) {
        if (this.cloudTestSuiteBasicInfo == null) {
            this.cloudTestSuiteBasicInfo = new CloudTestSuiteBasicInfo();
            cloudTestSuiteBasicInfoSetter.accept(this.cloudTestSuiteBasicInfo);
        }

        return this;
    }

    /**
     * Get cloudTestSuiteBasicInfo
     * @return cloudTestSuiteBasicInfo
     */
    public CloudTestSuiteBasicInfo getCloudTestSuiteBasicInfo() {
        return cloudTestSuiteBasicInfo;
    }

    public void setCloudTestSuiteBasicInfo(CloudTestSuiteBasicInfo cloudTestSuiteBasicInfo) {
        this.cloudTestSuiteBasicInfo = cloudTestSuiteBasicInfo;
    }

    public ShowTestsuiteInfoUsingResponse withComments(String comments) {
        this.comments = comments;
        return this;
    }

    /**
     * 版本
     * @return comments
     */
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public ShowTestsuiteInfoUsingResponse withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public ShowTestsuiteInfoUsingResponse withCreateUser(String createUser) {
        this.createUser = createUser;
        return this;
    }

    /**
     * 创建人
     * @return createUser
     */
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public ShowTestsuiteInfoUsingResponse withEnvType(Integer envType) {
        this.envType = envType;
        return this;
    }

    /**
     * 环境类型（内部工具使用）：0表示用例包环境，1表示全局环境
     * @return envType
     */
    public Integer getEnvType() {
        return envType;
    }

    public void setEnvType(Integer envType) {
        this.envType = envType;
    }

    public ShowTestsuiteInfoUsingResponse withEnvironmentGroupId(String environmentGroupId) {
        this.environmentGroupId = environmentGroupId;
        return this;
    }

    /**
     * environmentId环境信息
     * @return environmentGroupId
     */
    public String getEnvironmentGroupId() {
        return environmentGroupId;
    }

    public void setEnvironmentGroupId(String environmentGroupId) {
        this.environmentGroupId = environmentGroupId;
    }

    public ShowTestsuiteInfoUsingResponse withExecuteStrategies(ExecuteStrategiesVo executeStrategies) {
        this.executeStrategies = executeStrategies;
        return this;
    }

    public ShowTestsuiteInfoUsingResponse withExecuteStrategies(Consumer<ExecuteStrategiesVo> executeStrategiesSetter) {
        if (this.executeStrategies == null) {
            this.executeStrategies = new ExecuteStrategiesVo();
            executeStrategiesSetter.accept(this.executeStrategies);
        }

        return this;
    }

    /**
     * Get executeStrategies
     * @return executeStrategies
     */
    public ExecuteStrategiesVo getExecuteStrategies() {
        return executeStrategies;
    }

    public void setExecuteStrategies(ExecuteStrategiesVo executeStrategies) {
        this.executeStrategies = executeStrategies;
    }

    public ShowTestsuiteInfoUsingResponse withExecutorType(String executorType) {
        this.executorType = executorType;
        return this;
    }

    /**
     * 用例类型
     * @return executorType
     */
    public String getExecutorType() {
        return executorType;
    }

    public void setExecutorType(String executorType) {
        this.executorType = executorType;
    }

    public ShowTestsuiteInfoUsingResponse withExtParams(List<TaskExtParam> extParams) {
        this.extParams = extParams;
        return this;
    }

    public ShowTestsuiteInfoUsingResponse addExtParamsItem(TaskExtParam extParamsItem) {
        if (this.extParams == null) {
            this.extParams = new ArrayList<>();
        }
        this.extParams.add(extParamsItem);
        return this;
    }

    public ShowTestsuiteInfoUsingResponse withExtParams(Consumer<List<TaskExtParam>> extParamsSetter) {
        if (this.extParams == null) {
            this.extParams = new ArrayList<>();
        }
        extParamsSetter.accept(this.extParams);
        return this;
    }

    /**
     * 扩展参数
     * @return extParams
     */
    public List<TaskExtParam> getExtParams() {
        return extParams;
    }

    public void setExtParams(List<TaskExtParam> extParams) {
        this.extParams = extParams;
    }

    public ShowTestsuiteInfoUsingResponse withFavorite(String favorite) {
        this.favorite = favorite;
        return this;
    }

    /**
     * 收藏
     * @return favorite
     */
    public String getFavorite() {
        return favorite;
    }

    public void setFavorite(String favorite) {
        this.favorite = favorite;
    }

    public ShowTestsuiteInfoUsingResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 唯一ID，主键
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowTestsuiteInfoUsingResponse withIpGroup(IpGroup ipGroup) {
        this.ipGroup = ipGroup;
        return this;
    }

    public ShowTestsuiteInfoUsingResponse withIpGroup(Consumer<IpGroup> ipGroupSetter) {
        if (this.ipGroup == null) {
            this.ipGroup = new IpGroup();
            ipGroupSetter.accept(this.ipGroup);
        }

        return this;
    }

    /**
     * Get ipGroup
     * @return ipGroup
     */
    public IpGroup getIpGroup() {
        return ipGroup;
    }

    public void setIpGroup(IpGroup ipGroup) {
        this.ipGroup = ipGroup;
    }

    public ShowTestsuiteInfoUsingResponse withIpKey(String ipKey) {
        this.ipKey = ipKey;
        return this;
    }

    /**
     * 小网拨测替换application的hostIP
     * @return ipKey
     */
    public String getIpKey() {
        return ipKey;
    }

    public void setIpKey(String ipKey) {
        this.ipKey = ipKey;
    }

    public ShowTestsuiteInfoUsingResponse withIsDebugTask(Integer isDebugTask) {
        this.isDebugTask = isDebugTask;
        return this;
    }

    /**
     * 任务类型，是否debug任务
     * @return isDebugTask
     */
    public Integer getIsDebugTask() {
        return isDebugTask;
    }

    public void setIsDebugTask(Integer isDebugTask) {
        this.isDebugTask = isDebugTask;
    }

    public ShowTestsuiteInfoUsingResponse withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * 执行标签
     * @return label
     */
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public ShowTestsuiteInfoUsingResponse withLabelName(String labelName) {
        this.labelName = labelName;
        return this;
    }

    /**
     * 商用资源池名称
     * @return labelName
     */
    public String getLabelName() {
        return labelName;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    public ShowTestsuiteInfoUsingResponse withLabelType(String labelType) {
        this.labelType = labelType;
        return this;
    }

    /**
     * 商用资源池类型
     * @return labelType
     */
    public String getLabelType() {
        return labelType;
    }

    public void setLabelType(String labelType) {
        this.labelType = labelType;
    }

    public ShowTestsuiteInfoUsingResponse withLastStopTime(Long lastStopTime) {
        this.lastStopTime = lastStopTime;
        return this;
    }

    /**
     * 最近一次停止时间 
     * @return lastStopTime
     */
    public Long getLastStopTime() {
        return lastStopTime;
    }

    public void setLastStopTime(Long lastStopTime) {
        this.lastStopTime = lastStopTime;
    }

    public ShowTestsuiteInfoUsingResponse withLocationIds(List<String> locationIds) {
        this.locationIds = locationIds;
        return this;
    }

    public ShowTestsuiteInfoUsingResponse addLocationIdsItem(String locationIdsItem) {
        if (this.locationIds == null) {
            this.locationIds = new ArrayList<>();
        }
        this.locationIds.add(locationIdsItem);
        return this;
    }

    public ShowTestsuiteInfoUsingResponse withLocationIds(Consumer<List<String>> locationIdsSetter) {
        if (this.locationIds == null) {
            this.locationIds = new ArrayList<>();
        }
        locationIdsSetter.accept(this.locationIds);
        return this;
    }

    /**
     * 执行区域，冗余处理，修改更新在执行配置字段
     * @return locationIds
     */
    public List<String> getLocationIds() {
        return locationIds;
    }

    public void setLocationIds(List<String> locationIds) {
        this.locationIds = locationIds;
    }

    public ShowTestsuiteInfoUsingResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 任务名
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowTestsuiteInfoUsingResponse withPlanId(String planId) {
        this.planId = planId;
        return this;
    }

    /**
     * 测试计划Id
     * @return planId
     */
    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public ShowTestsuiteInfoUsingResponse withPreTestCaseInfo(PreTestCaseInfo preTestCaseInfo) {
        this.preTestCaseInfo = preTestCaseInfo;
        return this;
    }

    public ShowTestsuiteInfoUsingResponse withPreTestCaseInfo(Consumer<PreTestCaseInfo> preTestCaseInfoSetter) {
        if (this.preTestCaseInfo == null) {
            this.preTestCaseInfo = new PreTestCaseInfo();
            preTestCaseInfoSetter.accept(this.preTestCaseInfo);
        }

        return this;
    }

    /**
     * Get preTestCaseInfo
     * @return preTestCaseInfo
     */
    public PreTestCaseInfo getPreTestCaseInfo() {
        return preTestCaseInfo;
    }

    public void setPreTestCaseInfo(PreTestCaseInfo preTestCaseInfo) {
        this.preTestCaseInfo = preTestCaseInfo;
    }

    public ShowTestsuiteInfoUsingResponse withResourcePool(ResourcePool resourcePool) {
        this.resourcePool = resourcePool;
        return this;
    }

    public ShowTestsuiteInfoUsingResponse withResourcePool(Consumer<ResourcePool> resourcePoolSetter) {
        if (this.resourcePool == null) {
            this.resourcePool = new ResourcePool();
            resourcePoolSetter.accept(this.resourcePool);
        }

        return this;
    }

    /**
     * Get resourcePool
     * @return resourcePool
     */
    public ResourcePool getResourcePool() {
        return resourcePool;
    }

    public void setResourcePool(ResourcePool resourcePool) {
        this.resourcePool = resourcePool;
    }

    public ShowTestsuiteInfoUsingResponse withState(Integer state) {
        this.state = state;
        return this;
    }

    /**
     * 任务状态
     * @return state
     */
    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public ShowTestsuiteInfoUsingResponse withSubtaskId(String subtaskId) {
        this.subtaskId = subtaskId;
        return this;
    }

    /**
     * 商用apitest冒烟测试使用
     * @return subtaskId
     */
    public String getSubtaskId() {
        return subtaskId;
    }

    public void setSubtaskId(String subtaskId) {
        this.subtaskId = subtaskId;
    }

    public ShowTestsuiteInfoUsingResponse withSubtaskTotal(Long subtaskTotal) {
        this.subtaskTotal = subtaskTotal;
        return this;
    }

    /**
     * 子任务总数
     * @return subtaskTotal
     */
    public Long getSubtaskTotal() {
        return subtaskTotal;
    }

    public void setSubtaskTotal(Long subtaskTotal) {
        this.subtaskTotal = subtaskTotal;
    }

    public ShowTestsuiteInfoUsingResponse withTaskTypeId(String taskTypeId) {
        this.taskTypeId = taskTypeId;
        return this;
    }

    /**
     * 任务类型：{@link TaskType}
     * @return taskTypeId
     */
    public String getTaskTypeId() {
        return taskTypeId;
    }

    public void setTaskTypeId(String taskTypeId) {
        this.taskTypeId = taskTypeId;
    }

    public ShowTestsuiteInfoUsingResponse withTestCaseAlertGroups(List<TestCaseTemplateVo> testCaseAlertGroups) {
        this.testCaseAlertGroups = testCaseAlertGroups;
        return this;
    }

    public ShowTestsuiteInfoUsingResponse addTestCaseAlertGroupsItem(TestCaseTemplateVo testCaseAlertGroupsItem) {
        if (this.testCaseAlertGroups == null) {
            this.testCaseAlertGroups = new ArrayList<>();
        }
        this.testCaseAlertGroups.add(testCaseAlertGroupsItem);
        return this;
    }

    public ShowTestsuiteInfoUsingResponse withTestCaseAlertGroups(
        Consumer<List<TestCaseTemplateVo>> testCaseAlertGroupsSetter) {
        if (this.testCaseAlertGroups == null) {
            this.testCaseAlertGroups = new ArrayList<>();
        }
        testCaseAlertGroupsSetter.accept(this.testCaseAlertGroups);
        return this;
    }

    /**
     * 告警模板列表
     * @return testCaseAlertGroups
     */
    public List<TestCaseTemplateVo> getTestCaseAlertGroups() {
        return testCaseAlertGroups;
    }

    public void setTestCaseAlertGroups(List<TestCaseTemplateVo> testCaseAlertGroups) {
        this.testCaseAlertGroups = testCaseAlertGroups;
    }

    public ShowTestsuiteInfoUsingResponse withTestCases(List<TestCaseBasicInfo> testCases) {
        this.testCases = testCases;
        return this;
    }

    public ShowTestsuiteInfoUsingResponse addTestCasesItem(TestCaseBasicInfo testCasesItem) {
        if (this.testCases == null) {
            this.testCases = new ArrayList<>();
        }
        this.testCases.add(testCasesItem);
        return this;
    }

    public ShowTestsuiteInfoUsingResponse withTestCases(Consumer<List<TestCaseBasicInfo>> testCasesSetter) {
        if (this.testCases == null) {
            this.testCases = new ArrayList<>();
        }
        testCasesSetter.accept(this.testCases);
        return this;
    }

    /**
     * 测试用例列表
     * @return testCases
     */
    public List<TestCaseBasicInfo> getTestCases() {
        return testCases;
    }

    public void setTestCases(List<TestCaseBasicInfo> testCases) {
        this.testCases = testCases;
    }

    public ShowTestsuiteInfoUsingResponse withTestServiceId(String testServiceId) {
        this.testServiceId = testServiceId;
        return this;
    }

    /**
     * 项目id
     * @return testServiceId
     */
    public String getTestServiceId() {
        return testServiceId;
    }

    public void setTestServiceId(String testServiceId) {
        this.testServiceId = testServiceId;
    }

    public ShowTestsuiteInfoUsingResponse withTestSuiteType(Integer testSuiteType) {
        this.testSuiteType = testSuiteType;
        return this;
    }

    /**
     * 测试套类型，商用版本使用
     * @return testSuiteType
     */
    public Integer getTestSuiteType() {
        return testSuiteType;
    }

    public void setTestSuiteType(Integer testSuiteType) {
        this.testSuiteType = testSuiteType;
    }

    public ShowTestsuiteInfoUsingResponse withTip(String tip) {
        this.tip = tip;
        return this;
    }

    /**
     * 提示信息，用于任务操作过程中需要提供给前端的提示信息
     * @return tip
     */
    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public ShowTestsuiteInfoUsingResponse withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 创建时间
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public ShowTestsuiteInfoUsingResponse withUpdateUser(String updateUser) {
        this.updateUser = updateUser;
        return this;
    }

    /**
     * 更新人
     * @return updateUser
     */
    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public ShowTestsuiteInfoUsingResponse withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTestsuiteInfoUsingResponse that = (ShowTestsuiteInfoUsingResponse) obj;
        return Objects.equals(this.alertAction, that.alertAction) && Objects.equals(this.alertConfig, that.alertConfig)
            && Objects.equals(this.buildProducts, that.buildProducts)
            && Objects.equals(this.casePackageEnvName, that.casePackageEnvName)
            && Objects.equals(this.casePackageId, that.casePackageId)
            && Objects.equals(this.casePackageName, that.casePackageName)
            && Objects.equals(this.caseTotal, that.caseTotal) && Objects.equals(this.clientType, that.clientType)
            && Objects.equals(this.cloudTestSuiteBasicInfo, that.cloudTestSuiteBasicInfo)
            && Objects.equals(this.comments, that.comments) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.createUser, that.createUser) && Objects.equals(this.envType, that.envType)
            && Objects.equals(this.environmentGroupId, that.environmentGroupId)
            && Objects.equals(this.executeStrategies, that.executeStrategies)
            && Objects.equals(this.executorType, that.executorType) && Objects.equals(this.extParams, that.extParams)
            && Objects.equals(this.favorite, that.favorite) && Objects.equals(this.id, that.id)
            && Objects.equals(this.ipGroup, that.ipGroup) && Objects.equals(this.ipKey, that.ipKey)
            && Objects.equals(this.isDebugTask, that.isDebugTask) && Objects.equals(this.label, that.label)
            && Objects.equals(this.labelName, that.labelName) && Objects.equals(this.labelType, that.labelType)
            && Objects.equals(this.lastStopTime, that.lastStopTime)
            && Objects.equals(this.locationIds, that.locationIds) && Objects.equals(this.name, that.name)
            && Objects.equals(this.planId, that.planId) && Objects.equals(this.preTestCaseInfo, that.preTestCaseInfo)
            && Objects.equals(this.resourcePool, that.resourcePool) && Objects.equals(this.state, that.state)
            && Objects.equals(this.subtaskId, that.subtaskId) && Objects.equals(this.subtaskTotal, that.subtaskTotal)
            && Objects.equals(this.taskTypeId, that.taskTypeId)
            && Objects.equals(this.testCaseAlertGroups, that.testCaseAlertGroups)
            && Objects.equals(this.testCases, that.testCases) && Objects.equals(this.testServiceId, that.testServiceId)
            && Objects.equals(this.testSuiteType, that.testSuiteType) && Objects.equals(this.tip, that.tip)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.updateUser, that.updateUser)
            && Objects.equals(this.version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(alertAction,
            alertConfig,
            buildProducts,
            casePackageEnvName,
            casePackageId,
            casePackageName,
            caseTotal,
            clientType,
            cloudTestSuiteBasicInfo,
            comments,
            createTime,
            createUser,
            envType,
            environmentGroupId,
            executeStrategies,
            executorType,
            extParams,
            favorite,
            id,
            ipGroup,
            ipKey,
            isDebugTask,
            label,
            labelName,
            labelType,
            lastStopTime,
            locationIds,
            name,
            planId,
            preTestCaseInfo,
            resourcePool,
            state,
            subtaskId,
            subtaskTotal,
            taskTypeId,
            testCaseAlertGroups,
            testCases,
            testServiceId,
            testSuiteType,
            tip,
            updateTime,
            updateUser,
            version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTestsuiteInfoUsingResponse {\n");
        sb.append("    alertAction: ").append(toIndentedString(alertAction)).append("\n");
        sb.append("    alertConfig: ").append(toIndentedString(alertConfig)).append("\n");
        sb.append("    buildProducts: ").append(toIndentedString(buildProducts)).append("\n");
        sb.append("    casePackageEnvName: ").append(toIndentedString(casePackageEnvName)).append("\n");
        sb.append("    casePackageId: ").append(toIndentedString(casePackageId)).append("\n");
        sb.append("    casePackageName: ").append(toIndentedString(casePackageName)).append("\n");
        sb.append("    caseTotal: ").append(toIndentedString(caseTotal)).append("\n");
        sb.append("    clientType: ").append(toIndentedString(clientType)).append("\n");
        sb.append("    cloudTestSuiteBasicInfo: ").append(toIndentedString(cloudTestSuiteBasicInfo)).append("\n");
        sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
        sb.append("    envType: ").append(toIndentedString(envType)).append("\n");
        sb.append("    environmentGroupId: ").append(toIndentedString(environmentGroupId)).append("\n");
        sb.append("    executeStrategies: ").append(toIndentedString(executeStrategies)).append("\n");
        sb.append("    executorType: ").append(toIndentedString(executorType)).append("\n");
        sb.append("    extParams: ").append(toIndentedString(extParams)).append("\n");
        sb.append("    favorite: ").append(toIndentedString(favorite)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    ipGroup: ").append(toIndentedString(ipGroup)).append("\n");
        sb.append("    ipKey: ").append(toIndentedString(ipKey)).append("\n");
        sb.append("    isDebugTask: ").append(toIndentedString(isDebugTask)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    labelName: ").append(toIndentedString(labelName)).append("\n");
        sb.append("    labelType: ").append(toIndentedString(labelType)).append("\n");
        sb.append("    lastStopTime: ").append(toIndentedString(lastStopTime)).append("\n");
        sb.append("    locationIds: ").append(toIndentedString(locationIds)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
        sb.append("    preTestCaseInfo: ").append(toIndentedString(preTestCaseInfo)).append("\n");
        sb.append("    resourcePool: ").append(toIndentedString(resourcePool)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    subtaskId: ").append(toIndentedString(subtaskId)).append("\n");
        sb.append("    subtaskTotal: ").append(toIndentedString(subtaskTotal)).append("\n");
        sb.append("    taskTypeId: ").append(toIndentedString(taskTypeId)).append("\n");
        sb.append("    testCaseAlertGroups: ").append(toIndentedString(testCaseAlertGroups)).append("\n");
        sb.append("    testCases: ").append(toIndentedString(testCases)).append("\n");
        sb.append("    testServiceId: ").append(toIndentedString(testServiceId)).append("\n");
        sb.append("    testSuiteType: ").append(toIndentedString(testSuiteType)).append("\n");
        sb.append("    tip: ").append(toIndentedString(tip)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    updateUser: ").append(toIndentedString(updateUser)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
