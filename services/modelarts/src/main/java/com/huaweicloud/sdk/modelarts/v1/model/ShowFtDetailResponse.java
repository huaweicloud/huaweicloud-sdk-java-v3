package com.huaweicloud.sdk.modelarts.v1.model;

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
public class ShowFtDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_desc")

    private String taskDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private JobMetadataResponse metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spec")

    private SpecResponse spec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_asset_id")

    private String modelAssetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_type")

    private String modelType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_source")

    private String modelSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "train_type")

    private String trainType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "checkpoint_config")

    private String checkpointConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_parameters")

    private String taskParameters;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "train_process")

    private Double trainProcess;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datasets_config")

    private List<DatasetConfig> datasetsConfig = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Status status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_publish_config")

    private String autoPublishConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_code")

    private String assetCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_name")

    private String assetName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_desc")

    private String assetDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_series")

    private String assetSeries;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_version")

    private String assetVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_type")

    private String assetType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_source")

    private String assetSource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_group_id")

    private String assetGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_asset_type")

    private String subAssetType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_version")

    private String apiVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "root_asset_id")

    private String rootAssetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "train_cost_time")

    private Long trainCostTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_type")

    private String poolType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_id")

    private String poolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_node_count")

    private String poolNodeCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavor_id")

    private String flavorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "training_info")

    private String trainingInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "train_output_path")

    private String trainOutputPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "asset_capabilities")

    private List<String> assetCapabilities = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "continue_task")

    private ContinueTask continueTask;

    public ShowFtDetailResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目id。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ShowFtDetailResponse withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 训练任务id。
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public ShowFtDetailResponse withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 训练任务名称。
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public ShowFtDetailResponse withTaskDesc(String taskDesc) {
        this.taskDesc = taskDesc;
        return this;
    }

    /**
     * 训练任务描述信息。
     * @return taskDesc
     */
    public String getTaskDesc() {
        return taskDesc;
    }

    public void setTaskDesc(String taskDesc) {
        this.taskDesc = taskDesc;
    }

    public ShowFtDetailResponse withMetadata(JobMetadataResponse metadata) {
        this.metadata = metadata;
        return this;
    }

    public ShowFtDetailResponse withMetadata(Consumer<JobMetadataResponse> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new JobMetadataResponse();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public JobMetadataResponse getMetadata() {
        return metadata;
    }

    public void setMetadata(JobMetadataResponse metadata) {
        this.metadata = metadata;
    }

    public ShowFtDetailResponse withSpec(SpecResponse spec) {
        this.spec = spec;
        return this;
    }

    public ShowFtDetailResponse withSpec(Consumer<SpecResponse> specSetter) {
        if (this.spec == null) {
            this.spec = new SpecResponse();
            specSetter.accept(this.spec);
        }

        return this;
    }

    /**
     * Get spec
     * @return spec
     */
    public SpecResponse getSpec() {
        return spec;
    }

    public void setSpec(SpecResponse spec) {
        this.spec = spec;
    }

    public ShowFtDetailResponse withModelAssetId(String modelAssetId) {
        this.modelAssetId = modelAssetId;
        return this;
    }

    /**
     * 模型id。
     * @return modelAssetId
     */
    public String getModelAssetId() {
        return modelAssetId;
    }

    public void setModelAssetId(String modelAssetId) {
        this.modelAssetId = modelAssetId;
    }

    public ShowFtDetailResponse withModelType(String modelType) {
        this.modelType = modelType;
        return this;
    }

    /**
     * **参数解释：** 模型类型，取值为TextGeneration|ImageUnderstanding，依次为：文本生成、图像理解。 **约束限制：** 不涉及 **取值范围：** TextGeneration|ImageUnderstanding **默认取值：** 不涉及
     * @return modelType
     */
    public String getModelType() {
        return modelType;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    public ShowFtDetailResponse withModelSource(String modelSource) {
        this.modelSource = modelSource;
        return this;
    }

    /**
     * 模型来源
     * @return modelSource
     */
    public String getModelSource() {
        return modelSource;
    }

    public void setModelSource(String modelSource) {
        this.modelSource = modelSource;
    }

    public ShowFtDetailResponse withTrainType(String trainType) {
        this.trainType = trainType;
        return this;
    }

    /**
     * **参数解释：** 训练类型，支持SFT（全量微调）、PRETRAIN（预训练）、LORA（lora微调）、DPO（dpo强化学习）、RFT（rft强化学习）。 **约束限制：** 不涉及 **取值范围：** SFT（全量微调）、PRETRAIN（预训练）、LORA（lora微调）、DPO（dpo强化学习）、RFT（rft强化学习） 默认取值： SFT
     * @return trainType
     */
    public String getTrainType() {
        return trainType;
    }

    public void setTrainType(String trainType) {
        this.trainType = trainType;
    }

    public ShowFtDetailResponse withCheckpointConfig(String checkpointConfig) {
        this.checkpointConfig = checkpointConfig;
        return this;
    }

    /**
     * 断点续训相关配置。
     * @return checkpointConfig
     */
    public String getCheckpointConfig() {
        return checkpointConfig;
    }

    public void setCheckpointConfig(String checkpointConfig) {
        this.checkpointConfig = checkpointConfig;
    }

    public ShowFtDetailResponse withTaskParameters(String taskParameters) {
        this.taskParameters = taskParameters;
        return this;
    }

    /**
     * 训练任参数信息。
     * @return taskParameters
     */
    public String getTaskParameters() {
        return taskParameters;
    }

    public void setTaskParameters(String taskParameters) {
        this.taskParameters = taskParameters;
    }

    public ShowFtDetailResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间。
     * minimum: 1
     * maximum: 2147483647
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ShowFtDetailResponse withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 训练任务更新时间，当修改、或者训练任务状态发生变化时进行更新。
     * minimum: 1
     * maximum: 2147483647
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public ShowFtDetailResponse withTrainProcess(Double trainProcess) {
        this.trainProcess = trainProcess;
        return this;
    }

    /**
     * 训练任务进度。
     * minimum: 0
     * maximum: 1
     * @return trainProcess
     */
    public Double getTrainProcess() {
        return trainProcess;
    }

    public void setTrainProcess(Double trainProcess) {
        this.trainProcess = trainProcess;
    }

    public ShowFtDetailResponse withDatasetsConfig(List<DatasetConfig> datasetsConfig) {
        this.datasetsConfig = datasetsConfig;
        return this;
    }

    public ShowFtDetailResponse addDatasetsConfigItem(DatasetConfig datasetsConfigItem) {
        if (this.datasetsConfig == null) {
            this.datasetsConfig = new ArrayList<>();
        }
        this.datasetsConfig.add(datasetsConfigItem);
        return this;
    }

    public ShowFtDetailResponse withDatasetsConfig(Consumer<List<DatasetConfig>> datasetsConfigSetter) {
        if (this.datasetsConfig == null) {
            this.datasetsConfig = new ArrayList<>();
        }
        datasetsConfigSetter.accept(this.datasetsConfig);
        return this;
    }

    /**
     * 该训练任务数据集相关的配置。
     * @return datasetsConfig
     */
    public List<DatasetConfig> getDatasetsConfig() {
        return datasetsConfig;
    }

    public void setDatasetsConfig(List<DatasetConfig> datasetsConfig) {
        this.datasetsConfig = datasetsConfig;
    }

    public ShowFtDetailResponse withStatus(Status status) {
        this.status = status;
        return this;
    }

    public ShowFtDetailResponse withStatus(Consumer<Status> statusSetter) {
        if (this.status == null) {
            this.status = new Status();
            statusSetter.accept(this.status);
        }

        return this;
    }

    /**
     * Get status
     * @return status
     */
    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public ShowFtDetailResponse withAutoPublishConfig(String autoPublishConfig) {
        this.autoPublishConfig = autoPublishConfig;
        return this;
    }

    /**
     * 自动发布配置信息
     * @return autoPublishConfig
     */
    public String getAutoPublishConfig() {
        return autoPublishConfig;
    }

    public void setAutoPublishConfig(String autoPublishConfig) {
        this.autoPublishConfig = autoPublishConfig;
    }

    public ShowFtDetailResponse withAssetCode(String assetCode) {
        this.assetCode = assetCode;
        return this;
    }

    /**
     * 模型资产名
     * @return assetCode
     */
    public String getAssetCode() {
        return assetCode;
    }

    public void setAssetCode(String assetCode) {
        this.assetCode = assetCode;
    }

    public ShowFtDetailResponse withAssetName(String assetName) {
        this.assetName = assetName;
        return this;
    }

    /**
     * 资产名称
     * @return assetName
     */
    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public ShowFtDetailResponse withAssetDesc(String assetDesc) {
        this.assetDesc = assetDesc;
        return this;
    }

    /**
     * 模型资产描述信息
     * @return assetDesc
     */
    public String getAssetDesc() {
        return assetDesc;
    }

    public void setAssetDesc(String assetDesc) {
        this.assetDesc = assetDesc;
    }

    public ShowFtDetailResponse withAssetSeries(String assetSeries) {
        this.assetSeries = assetSeries;
        return this;
    }

    /**
     * 模型系列
     * @return assetSeries
     */
    public String getAssetSeries() {
        return assetSeries;
    }

    public void setAssetSeries(String assetSeries) {
        this.assetSeries = assetSeries;
    }

    public ShowFtDetailResponse withAssetVersion(String assetVersion) {
        this.assetVersion = assetVersion;
        return this;
    }

    /**
     * 资产版本
     * @return assetVersion
     */
    public String getAssetVersion() {
        return assetVersion;
    }

    public void setAssetVersion(String assetVersion) {
        this.assetVersion = assetVersion;
    }

    public ShowFtDetailResponse withAssetType(String assetType) {
        this.assetType = assetType;
        return this;
    }

    /**
     * 资产类型
     * @return assetType
     */
    public String getAssetType() {
        return assetType;
    }

    public void setAssetType(String assetType) {
        this.assetType = assetType;
    }

    public ShowFtDetailResponse withAssetSource(String assetSource) {
        this.assetSource = assetSource;
        return this;
    }

    /**
     * 资产来源
     * @return assetSource
     */
    public String getAssetSource() {
        return assetSource;
    }

    public void setAssetSource(String assetSource) {
        this.assetSource = assetSource;
    }

    public ShowFtDetailResponse withAssetGroupId(String assetGroupId) {
        this.assetGroupId = assetGroupId;
        return this;
    }

    /**
     * 资产组id
     * @return assetGroupId
     */
    public String getAssetGroupId() {
        return assetGroupId;
    }

    public void setAssetGroupId(String assetGroupId) {
        this.assetGroupId = assetGroupId;
    }

    public ShowFtDetailResponse withSubAssetType(String subAssetType) {
        this.subAssetType = subAssetType;
        return this;
    }

    /**
     * 资产子类型
     * @return subAssetType
     */
    public String getSubAssetType() {
        return subAssetType;
    }

    public void setSubAssetType(String subAssetType) {
        this.subAssetType = subAssetType;
    }

    public ShowFtDetailResponse withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * 资产类别
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ShowFtDetailResponse withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /**
     * 资产API版本
     * @return apiVersion
     */
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public ShowFtDetailResponse withRootAssetId(String rootAssetId) {
        this.rootAssetId = rootAssetId;
        return this;
    }

    /**
     * 根资产ID
     * @return rootAssetId
     */
    public String getRootAssetId() {
        return rootAssetId;
    }

    public void setRootAssetId(String rootAssetId) {
        this.rootAssetId = rootAssetId;
    }

    public ShowFtDetailResponse withTrainCostTime(Long trainCostTime) {
        this.trainCostTime = trainCostTime;
        return this;
    }

    /**
     * 训练任务耗时
     * minimum: 0
     * maximum: 2147483647
     * @return trainCostTime
     */
    public Long getTrainCostTime() {
        return trainCostTime;
    }

    public void setTrainCostTime(Long trainCostTime) {
        this.trainCostTime = trainCostTime;
    }

    public ShowFtDetailResponse withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 任务所属工作空间名称
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public ShowFtDetailResponse withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 用户id
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ShowFtDetailResponse withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 用户名称
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ShowFtDetailResponse withPoolType(String poolType) {
        this.poolType = poolType;
        return this;
    }

    /**
     * 资源池类型
     * @return poolType
     */
    public String getPoolType() {
        return poolType;
    }

    public void setPoolType(String poolType) {
        this.poolType = poolType;
    }

    public ShowFtDetailResponse withPoolId(String poolId) {
        this.poolId = poolId;
        return this;
    }

    /**
     * 资源池ID
     * @return poolId
     */
    public String getPoolId() {
        return poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    public ShowFtDetailResponse withPoolNodeCount(String poolNodeCount) {
        this.poolNodeCount = poolNodeCount;
        return this;
    }

    /**
     * 使用的资源池实例数
     * @return poolNodeCount
     */
    public String getPoolNodeCount() {
        return poolNodeCount;
    }

    public void setPoolNodeCount(String poolNodeCount) {
        this.poolNodeCount = poolNodeCount;
    }

    public ShowFtDetailResponse withFlavorId(String flavorId) {
        this.flavorId = flavorId;
        return this;
    }

    /**
     * 使用的资源池卡数
     * @return flavorId
     */
    public String getFlavorId() {
        return flavorId;
    }

    public void setFlavorId(String flavorId) {
        this.flavorId = flavorId;
    }

    public ShowFtDetailResponse withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 优先级
     * minimum: 0
     * maximum: 3
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public ShowFtDetailResponse withTrainingInfo(String trainingInfo) {
        this.trainingInfo = trainingInfo;
        return this;
    }

    /**
     * 训练预估时长
     * @return trainingInfo
     */
    public String getTrainingInfo() {
        return trainingInfo;
    }

    public void setTrainingInfo(String trainingInfo) {
        this.trainingInfo = trainingInfo;
    }

    public ShowFtDetailResponse withTrainOutputPath(String trainOutputPath) {
        this.trainOutputPath = trainOutputPath;
        return this;
    }

    /**
     * **参数解释**：训练产物输出路径，如\"obs://yyy/test/\"。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return trainOutputPath
     */
    public String getTrainOutputPath() {
        return trainOutputPath;
    }

    public void setTrainOutputPath(String trainOutputPath) {
        this.trainOutputPath = trainOutputPath;
    }

    public ShowFtDetailResponse withAssetCapabilities(List<String> assetCapabilities) {
        this.assetCapabilities = assetCapabilities;
        return this;
    }

    public ShowFtDetailResponse addAssetCapabilitiesItem(String assetCapabilitiesItem) {
        if (this.assetCapabilities == null) {
            this.assetCapabilities = new ArrayList<>();
        }
        this.assetCapabilities.add(assetCapabilitiesItem);
        return this;
    }

    public ShowFtDetailResponse withAssetCapabilities(Consumer<List<String>> assetCapabilitiesSetter) {
        if (this.assetCapabilities == null) {
            this.assetCapabilities = new ArrayList<>();
        }
        assetCapabilitiesSetter.accept(this.assetCapabilities);
        return this;
    }

    /**
     * 训练模型类型
     * @return assetCapabilities
     */
    public List<String> getAssetCapabilities() {
        return assetCapabilities;
    }

    public void setAssetCapabilities(List<String> assetCapabilities) {
        this.assetCapabilities = assetCapabilities;
    }

    public ShowFtDetailResponse withContinueTask(ContinueTask continueTask) {
        this.continueTask = continueTask;
        return this;
    }

    public ShowFtDetailResponse withContinueTask(Consumer<ContinueTask> continueTaskSetter) {
        if (this.continueTask == null) {
            this.continueTask = new ContinueTask();
            continueTaskSetter.accept(this.continueTask);
        }

        return this;
    }

    /**
     * Get continueTask
     * @return continueTask
     */
    public ContinueTask getContinueTask() {
        return continueTask;
    }

    public void setContinueTask(ContinueTask continueTask) {
        this.continueTask = continueTask;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowFtDetailResponse that = (ShowFtDetailResponse) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.taskId, that.taskId)
            && Objects.equals(this.taskName, that.taskName) && Objects.equals(this.taskDesc, that.taskDesc)
            && Objects.equals(this.metadata, that.metadata) && Objects.equals(this.spec, that.spec)
            && Objects.equals(this.modelAssetId, that.modelAssetId) && Objects.equals(this.modelType, that.modelType)
            && Objects.equals(this.modelSource, that.modelSource) && Objects.equals(this.trainType, that.trainType)
            && Objects.equals(this.checkpointConfig, that.checkpointConfig)
            && Objects.equals(this.taskParameters, that.taskParameters)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.trainProcess, that.trainProcess)
            && Objects.equals(this.datasetsConfig, that.datasetsConfig) && Objects.equals(this.status, that.status)
            && Objects.equals(this.autoPublishConfig, that.autoPublishConfig)
            && Objects.equals(this.assetCode, that.assetCode) && Objects.equals(this.assetName, that.assetName)
            && Objects.equals(this.assetDesc, that.assetDesc) && Objects.equals(this.assetSeries, that.assetSeries)
            && Objects.equals(this.assetVersion, that.assetVersion) && Objects.equals(this.assetType, that.assetType)
            && Objects.equals(this.assetSource, that.assetSource)
            && Objects.equals(this.assetGroupId, that.assetGroupId)
            && Objects.equals(this.subAssetType, that.subAssetType) && Objects.equals(this.category, that.category)
            && Objects.equals(this.apiVersion, that.apiVersion) && Objects.equals(this.rootAssetId, that.rootAssetId)
            && Objects.equals(this.trainCostTime, that.trainCostTime)
            && Objects.equals(this.workspaceId, that.workspaceId) && Objects.equals(this.userId, that.userId)
            && Objects.equals(this.userName, that.userName) && Objects.equals(this.poolType, that.poolType)
            && Objects.equals(this.poolId, that.poolId) && Objects.equals(this.poolNodeCount, that.poolNodeCount)
            && Objects.equals(this.flavorId, that.flavorId) && Objects.equals(this.priority, that.priority)
            && Objects.equals(this.trainingInfo, that.trainingInfo)
            && Objects.equals(this.trainOutputPath, that.trainOutputPath)
            && Objects.equals(this.assetCapabilities, that.assetCapabilities)
            && Objects.equals(this.continueTask, that.continueTask);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId,
            taskId,
            taskName,
            taskDesc,
            metadata,
            spec,
            modelAssetId,
            modelType,
            modelSource,
            trainType,
            checkpointConfig,
            taskParameters,
            createTime,
            updateTime,
            trainProcess,
            datasetsConfig,
            status,
            autoPublishConfig,
            assetCode,
            assetName,
            assetDesc,
            assetSeries,
            assetVersion,
            assetType,
            assetSource,
            assetGroupId,
            subAssetType,
            category,
            apiVersion,
            rootAssetId,
            trainCostTime,
            workspaceId,
            userId,
            userName,
            poolType,
            poolId,
            poolNodeCount,
            flavorId,
            priority,
            trainingInfo,
            trainOutputPath,
            assetCapabilities,
            continueTask);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowFtDetailResponse {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    taskDesc: ").append(toIndentedString(taskDesc)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
        sb.append("    modelAssetId: ").append(toIndentedString(modelAssetId)).append("\n");
        sb.append("    modelType: ").append(toIndentedString(modelType)).append("\n");
        sb.append("    modelSource: ").append(toIndentedString(modelSource)).append("\n");
        sb.append("    trainType: ").append(toIndentedString(trainType)).append("\n");
        sb.append("    checkpointConfig: ").append(toIndentedString(checkpointConfig)).append("\n");
        sb.append("    taskParameters: ").append(toIndentedString(taskParameters)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    trainProcess: ").append(toIndentedString(trainProcess)).append("\n");
        sb.append("    datasetsConfig: ").append(toIndentedString(datasetsConfig)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    autoPublishConfig: ").append(toIndentedString(autoPublishConfig)).append("\n");
        sb.append("    assetCode: ").append(toIndentedString(assetCode)).append("\n");
        sb.append("    assetName: ").append(toIndentedString(assetName)).append("\n");
        sb.append("    assetDesc: ").append(toIndentedString(assetDesc)).append("\n");
        sb.append("    assetSeries: ").append(toIndentedString(assetSeries)).append("\n");
        sb.append("    assetVersion: ").append(toIndentedString(assetVersion)).append("\n");
        sb.append("    assetType: ").append(toIndentedString(assetType)).append("\n");
        sb.append("    assetSource: ").append(toIndentedString(assetSource)).append("\n");
        sb.append("    assetGroupId: ").append(toIndentedString(assetGroupId)).append("\n");
        sb.append("    subAssetType: ").append(toIndentedString(subAssetType)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    rootAssetId: ").append(toIndentedString(rootAssetId)).append("\n");
        sb.append("    trainCostTime: ").append(toIndentedString(trainCostTime)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    poolType: ").append(toIndentedString(poolType)).append("\n");
        sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
        sb.append("    poolNodeCount: ").append(toIndentedString(poolNodeCount)).append("\n");
        sb.append("    flavorId: ").append(toIndentedString(flavorId)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    trainingInfo: ").append(toIndentedString(trainingInfo)).append("\n");
        sb.append("    trainOutputPath: ").append(toIndentedString(trainOutputPath)).append("\n");
        sb.append("    assetCapabilities: ").append(toIndentedString(assetCapabilities)).append("\n");
        sb.append("    continueTask: ").append(toIndentedString(continueTask)).append("\n");
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
