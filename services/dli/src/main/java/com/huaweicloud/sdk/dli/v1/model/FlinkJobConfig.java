package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 作业配置，当“show_detail”为“true”时才有该参数配置。
 */
public class FlinkJobConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "checkpoint_enabled")

    private Boolean checkpointEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "checkpoint_mode")

    private String checkpointMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "checkpoint_interval")

    private Integer checkpointInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_enabled")

    private Boolean logEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_bucket")

    private String obsBucket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smn_topic")

    private String smnTopic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edge_group_ids")

    private List<String> edgeGroupIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "root_id")

    private Integer rootId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manager_cu_number")

    private Integer managerCuNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cu_number")

    private Integer cuNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parallel_number")

    private Integer parallelNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restart_when_exception")

    private Boolean restartWhenException;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "idle_state_retention")

    private Integer idleStateRetention;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "udf_jar_url")

    private String udfJarUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dirty_data_strategy")

    private String dirtyDataStrategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entrypoint")

    private String entrypoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dependency_jars")

    private List<String> dependencyJars = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dependency_files")

    private List<String> dependencyFiles = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executor_number")

    private Integer executorNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executor_cu_number")

    private Integer executorCuNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resume_checkpoint")

    private Boolean resumeCheckpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtime_config")

    private String runtimeConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "graph_editor_enabled")

    private Boolean graphEditorEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "graph_editor_data")

    private String graphEditorData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resume_max_num")

    private Long resumeMaxNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "checkpoint_path")

    private String checkpointPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config_url")

    private String configUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tm_cus")

    private Integer tmCus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tm_slot_num")

    private Integer tmSlotNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image")

    private String image;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "feature")

    private String feature;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flink_version")

    private String flinkVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operator_config")

    private String operatorConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "static_estimator_config")

    private String staticEstimatorConfig;

    public FlinkJobConfig withCheckpointEnabled(Boolean checkpointEnabled) {
        this.checkpointEnabled = checkpointEnabled;
        return this;
    }

    /**
     * 是否开启作业自动快照功能。 开启：true； 关闭：false； 默认：false。
     * @return checkpointEnabled
     */
    public Boolean getCheckpointEnabled() {
        return checkpointEnabled;
    }

    public void setCheckpointEnabled(Boolean checkpointEnabled) {
        this.checkpointEnabled = checkpointEnabled;
    }

    public FlinkJobConfig withCheckpointMode(String checkpointMode) {
        this.checkpointMode = checkpointMode;
        return this;
    }

    /**
     * 快照模式： exactly_once：数据只被消费一次。 at_least_once：数据至少被消费一次。 默认值为exactly_once。
     * @return checkpointMode
     */
    public String getCheckpointMode() {
        return checkpointMode;
    }

    public void setCheckpointMode(String checkpointMode) {
        this.checkpointMode = checkpointMode;
    }

    public FlinkJobConfig withCheckpointInterval(Integer checkpointInterval) {
        this.checkpointInterval = checkpointInterval;
        return this;
    }

    /**
     * 快照时间间隔, 单位为秒，默认值为10。
     * @return checkpointInterval
     */
    public Integer getCheckpointInterval() {
        return checkpointInterval;
    }

    public void setCheckpointInterval(Integer checkpointInterval) {
        this.checkpointInterval = checkpointInterval;
    }

    public FlinkJobConfig withLogEnabled(Boolean logEnabled) {
        this.logEnabled = logEnabled;
        return this;
    }

    /**
     * 是否启用日志存储。默认为false。
     * @return logEnabled
     */
    public Boolean getLogEnabled() {
        return logEnabled;
    }

    public void setLogEnabled(Boolean logEnabled) {
        this.logEnabled = logEnabled;
    }

    public FlinkJobConfig withObsBucket(String obsBucket) {
        this.obsBucket = obsBucket;
        return this;
    }

    /**
     * OBS桶名。
     * @return obsBucket
     */
    public String getObsBucket() {
        return obsBucket;
    }

    public void setObsBucket(String obsBucket) {
        this.obsBucket = obsBucket;
    }

    public FlinkJobConfig withSmnTopic(String smnTopic) {
        this.smnTopic = smnTopic;
        return this;
    }

    /**
     * 当作业异常时，向该SMN主题推送告警信息。
     * @return smnTopic
     */
    public String getSmnTopic() {
        return smnTopic;
    }

    public void setSmnTopic(String smnTopic) {
        this.smnTopic = smnTopic;
    }

    public FlinkJobConfig withEdgeGroupIds(List<String> edgeGroupIds) {
        this.edgeGroupIds = edgeGroupIds;
        return this;
    }

    public FlinkJobConfig addEdgeGroupIdsItem(String edgeGroupIdsItem) {
        if (this.edgeGroupIds == null) {
            this.edgeGroupIds = new ArrayList<>();
        }
        this.edgeGroupIds.add(edgeGroupIdsItem);
        return this;
    }

    public FlinkJobConfig withEdgeGroupIds(Consumer<List<String>> edgeGroupIdsSetter) {
        if (this.edgeGroupIds == null) {
            this.edgeGroupIds = new ArrayList<>();
        }
        edgeGroupIdsSetter.accept(this.edgeGroupIds);
        return this;
    }

    /**
     * 边缘计算组ID列表。
     * @return edgeGroupIds
     */
    public List<String> getEdgeGroupIds() {
        return edgeGroupIds;
    }

    public void setEdgeGroupIds(List<String> edgeGroupIds) {
        this.edgeGroupIds = edgeGroupIds;
    }

    public FlinkJobConfig withRootId(Integer rootId) {
        this.rootId = rootId;
        return this;
    }

    /**
     * 父作业ID。
     * @return rootId
     */
    public Integer getRootId() {
        return rootId;
    }

    public void setRootId(Integer rootId) {
        this.rootId = rootId;
    }

    public FlinkJobConfig withManagerCuNumber(Integer managerCuNumber) {
        this.managerCuNumber = managerCuNumber;
        return this;
    }

    /**
     * 管理单元CU数。默认为1。
     * @return managerCuNumber
     */
    public Integer getManagerCuNumber() {
        return managerCuNumber;
    }

    public void setManagerCuNumber(Integer managerCuNumber) {
        this.managerCuNumber = managerCuNumber;
    }

    public FlinkJobConfig withCuNumber(Integer cuNumber) {
        this.cuNumber = cuNumber;
        return this;
    }

    /**
     * 用户为作业选择的CU数量, “show_detail”。默认为2。
     * minimum: 2
     * maximum: 400
     * @return cuNumber
     */
    public Integer getCuNumber() {
        return cuNumber;
    }

    public void setCuNumber(Integer cuNumber) {
        this.cuNumber = cuNumber;
    }

    public FlinkJobConfig withParallelNumber(Integer parallelNumber) {
        this.parallelNumber = parallelNumber;
        return this;
    }

    /**
     * 用户设置的作业并行数， “show_detail”为“true”时独有。默认值为1。 最小值：1，最大值：2000。 
     * minimum: 1
     * maximum: 2000
     * @return parallelNumber
     */
    public Integer getParallelNumber() {
        return parallelNumber;
    }

    public void setParallelNumber(Integer parallelNumber) {
        this.parallelNumber = parallelNumber;
    }

    public FlinkJobConfig withRestartWhenException(Boolean restartWhenException) {
        this.restartWhenException = restartWhenException;
        return this;
    }

    /**
     * 是否开启异常重启功能。
     * @return restartWhenException
     */
    public Boolean getRestartWhenException() {
        return restartWhenException;
    }

    public void setRestartWhenException(Boolean restartWhenException) {
        this.restartWhenException = restartWhenException;
    }

    public FlinkJobConfig withIdleStateRetention(Integer idleStateRetention) {
        this.idleStateRetention = idleStateRetention;
        return this;
    }

    /**
     * 空闲状态过期周期。
     * @return idleStateRetention
     */
    public Integer getIdleStateRetention() {
        return idleStateRetention;
    }

    public void setIdleStateRetention(Integer idleStateRetention) {
        this.idleStateRetention = idleStateRetention;
    }

    public FlinkJobConfig withUdfJarUrl(String udfJarUrl) {
        this.udfJarUrl = udfJarUrl;
        return this;
    }

    /**
     * 用户已上传到DLI资源管理系统的资源包名，用户sql作业的udf jar通过该参数传入。
     * @return udfJarUrl
     */
    public String getUdfJarUrl() {
        return udfJarUrl;
    }

    public void setUdfJarUrl(String udfJarUrl) {
        this.udfJarUrl = udfJarUrl;
    }

    public FlinkJobConfig withDirtyDataStrategy(String dirtyDataStrategy) {
        this.dirtyDataStrategy = dirtyDataStrategy;
        return this;
    }

    /**
     * 作业脏数据策略。 “2:obs-wan-wulan3/jobs”：保存 “1”：抛出异常 “0”：忽略
     * @return dirtyDataStrategy
     */
    public String getDirtyDataStrategy() {
        return dirtyDataStrategy;
    }

    public void setDirtyDataStrategy(String dirtyDataStrategy) {
        this.dirtyDataStrategy = dirtyDataStrategy;
    }

    public FlinkJobConfig withEntrypoint(String entrypoint) {
        this.entrypoint = entrypoint;
        return this;
    }

    /**
     * 用户已上传到DLI资源管理系统的资源包名，用户自定义作业主类所在的jar包.
     * @return entrypoint
     */
    public String getEntrypoint() {
        return entrypoint;
    }

    public void setEntrypoint(String entrypoint) {
        this.entrypoint = entrypoint;
    }

    public FlinkJobConfig withDependencyJars(List<String> dependencyJars) {
        this.dependencyJars = dependencyJars;
        return this;
    }

    public FlinkJobConfig addDependencyJarsItem(String dependencyJarsItem) {
        if (this.dependencyJars == null) {
            this.dependencyJars = new ArrayList<>();
        }
        this.dependencyJars.add(dependencyJarsItem);
        return this;
    }

    public FlinkJobConfig withDependencyJars(Consumer<List<String>> dependencyJarsSetter) {
        if (this.dependencyJars == null) {
            this.dependencyJars = new ArrayList<>();
        }
        dependencyJarsSetter.accept(this.dependencyJars);
        return this;
    }

    /**
     * 用户已上传到DLI资源管理系统的资源包名，用户自定义作业的其他依赖包
     * @return dependencyJars
     */
    public List<String> getDependencyJars() {
        return dependencyJars;
    }

    public void setDependencyJars(List<String> dependencyJars) {
        this.dependencyJars = dependencyJars;
    }

    public FlinkJobConfig withDependencyFiles(List<String> dependencyFiles) {
        this.dependencyFiles = dependencyFiles;
        return this;
    }

    public FlinkJobConfig addDependencyFilesItem(String dependencyFilesItem) {
        if (this.dependencyFiles == null) {
            this.dependencyFiles = new ArrayList<>();
        }
        this.dependencyFiles.add(dependencyFilesItem);
        return this;
    }

    public FlinkJobConfig withDependencyFiles(Consumer<List<String>> dependencyFilesSetter) {
        if (this.dependencyFiles == null) {
            this.dependencyFiles = new ArrayList<>();
        }
        dependencyFilesSetter.accept(this.dependencyFiles);
        return this;
    }

    /**
     * 用户已上传到DLI资源管理系统的资源包名，用户自定义作业的依赖文件.
     * @return dependencyFiles
     */
    public List<String> getDependencyFiles() {
        return dependencyFiles;
    }

    public void setDependencyFiles(List<String> dependencyFiles) {
        this.dependencyFiles = dependencyFiles;
    }

    public FlinkJobConfig withExecutorNumber(Integer executorNumber) {
        this.executorNumber = executorNumber;
        return this;
    }

    /**
     * 作业使用计算节点个数
     * @return executorNumber
     */
    public Integer getExecutorNumber() {
        return executorNumber;
    }

    public void setExecutorNumber(Integer executorNumber) {
        this.executorNumber = executorNumber;
    }

    public FlinkJobConfig withExecutorCuNumber(Integer executorCuNumber) {
        this.executorCuNumber = executorCuNumber;
        return this;
    }

    /**
     * 计算节点cu数
     * @return executorCuNumber
     */
    public Integer getExecutorCuNumber() {
        return executorCuNumber;
    }

    public void setExecutorCuNumber(Integer executorCuNumber) {
        this.executorCuNumber = executorCuNumber;
    }

    public FlinkJobConfig withResumeCheckpoint(Boolean resumeCheckpoint) {
        this.resumeCheckpoint = resumeCheckpoint;
        return this;
    }

    /**
     * 异常自动重启时，是否从最新checkpoint恢复，默认false
     * @return resumeCheckpoint
     */
    public Boolean getResumeCheckpoint() {
        return resumeCheckpoint;
    }

    public void setResumeCheckpoint(Boolean resumeCheckpoint) {
        this.resumeCheckpoint = resumeCheckpoint;
    }

    public FlinkJobConfig withRuntimeConfig(String runtimeConfig) {
        this.runtimeConfig = runtimeConfig;
        return this;
    }

    /**
     * Flink作业运行时自定义优化参数。
     * @return runtimeConfig
     */
    public String getRuntimeConfig() {
        return runtimeConfig;
    }

    public void setRuntimeConfig(String runtimeConfig) {
        this.runtimeConfig = runtimeConfig;
    }

    public FlinkJobConfig withGraphEditorEnabled(Boolean graphEditorEnabled) {
        this.graphEditorEnabled = graphEditorEnabled;
        return this;
    }

    /**
     * 流图编辑开关。默认为“false。
     * @return graphEditorEnabled
     */
    public Boolean getGraphEditorEnabled() {
        return graphEditorEnabled;
    }

    public void setGraphEditorEnabled(Boolean graphEditorEnabled) {
        this.graphEditorEnabled = graphEditorEnabled;
    }

    public FlinkJobConfig withGraphEditorData(String graphEditorData) {
        this.graphEditorData = graphEditorData;
        return this;
    }

    /**
     * 流图编辑数据。默认为null。
     * @return graphEditorData
     */
    public String getGraphEditorData() {
        return graphEditorData;
    }

    public void setGraphEditorData(String graphEditorData) {
        this.graphEditorData = graphEditorData;
    }

    public FlinkJobConfig withResumeMaxNum(Long resumeMaxNum) {
        this.resumeMaxNum = resumeMaxNum;
        return this;
    }

    /**
     * 异常重试最大次数。-1代表无限。
     * @return resumeMaxNum
     */
    public Long getResumeMaxNum() {
        return resumeMaxNum;
    }

    public void setResumeMaxNum(Long resumeMaxNum) {
        this.resumeMaxNum = resumeMaxNum;
    }

    public FlinkJobConfig withCheckpointPath(String checkpointPath) {
        this.checkpointPath = checkpointPath;
        return this;
    }

    /**
     * 检查点保存路径。
     * @return checkpointPath
     */
    public String getCheckpointPath() {
        return checkpointPath;
    }

    public void setCheckpointPath(String checkpointPath) {
        this.checkpointPath = checkpointPath;
    }

    public FlinkJobConfig withConfigUrl(String configUrl) {
        this.configUrl = configUrl;
        return this;
    }

    /**
     * 用户上传的config包OBS路径。
     * @return configUrl
     */
    public String getConfigUrl() {
        return configUrl;
    }

    public void setConfigUrl(String configUrl) {
        this.configUrl = configUrl;
    }

    public FlinkJobConfig withTmCus(Integer tmCus) {
        this.tmCus = tmCus;
        return this;
    }

    /**
     * 单TM所占CU数。
     * @return tmCus
     */
    public Integer getTmCus() {
        return tmCus;
    }

    public void setTmCus(Integer tmCus) {
        this.tmCus = tmCus;
    }

    public FlinkJobConfig withTmSlotNum(Integer tmSlotNum) {
        this.tmSlotNum = tmSlotNum;
        return this;
    }

    /**
     * 单TM Slot数。
     * @return tmSlotNum
     */
    public Integer getTmSlotNum() {
        return tmSlotNum;
    }

    public void setTmSlotNum(Integer tmSlotNum) {
        this.tmSlotNum = tmSlotNum;
    }

    public FlinkJobConfig withImage(String image) {
        this.image = image;
        return this;
    }

    /**
     * 自定义镜像。格式为：组织名/镜像名:镜像版本。当用户设置“feature”为“custom”时，该参数生效。用户可通过与“feature”参数配合使用，指定作业运行使用自定义的Flink镜像。
     * @return image
     */
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public FlinkJobConfig withFeature(String feature) {
        this.feature = feature;
        return this;
    }

    /**
     * 自定义作业特性。表示用户作业使用的Flink镜像类型。basic：表示使用DLI提供的基础Flink镜像。custom：表示使用用户自定义的Flink镜像。
     * @return feature
     */
    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public FlinkJobConfig withFlinkVersion(String flinkVersion) {
        this.flinkVersion = flinkVersion;
        return this;
    }

    /**
     * Flink版本。当用户设置“feature”为“basic”时，该参数生效。用户可通过与“feature”参数配合使用，指定作业运行使用的DLI基础Flink镜像的版本。
     * @return flinkVersion
     */
    public String getFlinkVersion() {
        return flinkVersion;
    }

    public void setFlinkVersion(String flinkVersion) {
        this.flinkVersion = flinkVersion;
    }

    public FlinkJobConfig withOperatorConfig(String operatorConfig) {
        this.operatorConfig = operatorConfig;
        return this;
    }

    /**
     * 各算子并行度参数，以json的形式展示各算子id和并行度。
     * @return operatorConfig
     */
    public String getOperatorConfig() {
        return operatorConfig;
    }

    public void setOperatorConfig(String operatorConfig) {
        this.operatorConfig = operatorConfig;
    }

    public FlinkJobConfig withStaticEstimatorConfig(String staticEstimatorConfig) {
        this.staticEstimatorConfig = staticEstimatorConfig;
        return this;
    }

    /**
     * 静态流图资源预估参数，以json的形式展示。
     * @return staticEstimatorConfig
     */
    public String getStaticEstimatorConfig() {
        return staticEstimatorConfig;
    }

    public void setStaticEstimatorConfig(String staticEstimatorConfig) {
        this.staticEstimatorConfig = staticEstimatorConfig;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FlinkJobConfig flinkJobConfig = (FlinkJobConfig) o;
        return Objects.equals(this.checkpointEnabled, flinkJobConfig.checkpointEnabled)
            && Objects.equals(this.checkpointMode, flinkJobConfig.checkpointMode)
            && Objects.equals(this.checkpointInterval, flinkJobConfig.checkpointInterval)
            && Objects.equals(this.logEnabled, flinkJobConfig.logEnabled)
            && Objects.equals(this.obsBucket, flinkJobConfig.obsBucket)
            && Objects.equals(this.smnTopic, flinkJobConfig.smnTopic)
            && Objects.equals(this.edgeGroupIds, flinkJobConfig.edgeGroupIds)
            && Objects.equals(this.rootId, flinkJobConfig.rootId)
            && Objects.equals(this.managerCuNumber, flinkJobConfig.managerCuNumber)
            && Objects.equals(this.cuNumber, flinkJobConfig.cuNumber)
            && Objects.equals(this.parallelNumber, flinkJobConfig.parallelNumber)
            && Objects.equals(this.restartWhenException, flinkJobConfig.restartWhenException)
            && Objects.equals(this.idleStateRetention, flinkJobConfig.idleStateRetention)
            && Objects.equals(this.udfJarUrl, flinkJobConfig.udfJarUrl)
            && Objects.equals(this.dirtyDataStrategy, flinkJobConfig.dirtyDataStrategy)
            && Objects.equals(this.entrypoint, flinkJobConfig.entrypoint)
            && Objects.equals(this.dependencyJars, flinkJobConfig.dependencyJars)
            && Objects.equals(this.dependencyFiles, flinkJobConfig.dependencyFiles)
            && Objects.equals(this.executorNumber, flinkJobConfig.executorNumber)
            && Objects.equals(this.executorCuNumber, flinkJobConfig.executorCuNumber)
            && Objects.equals(this.resumeCheckpoint, flinkJobConfig.resumeCheckpoint)
            && Objects.equals(this.runtimeConfig, flinkJobConfig.runtimeConfig)
            && Objects.equals(this.graphEditorEnabled, flinkJobConfig.graphEditorEnabled)
            && Objects.equals(this.graphEditorData, flinkJobConfig.graphEditorData)
            && Objects.equals(this.resumeMaxNum, flinkJobConfig.resumeMaxNum)
            && Objects.equals(this.checkpointPath, flinkJobConfig.checkpointPath)
            && Objects.equals(this.configUrl, flinkJobConfig.configUrl)
            && Objects.equals(this.tmCus, flinkJobConfig.tmCus)
            && Objects.equals(this.tmSlotNum, flinkJobConfig.tmSlotNum)
            && Objects.equals(this.image, flinkJobConfig.image) && Objects.equals(this.feature, flinkJobConfig.feature)
            && Objects.equals(this.flinkVersion, flinkJobConfig.flinkVersion)
            && Objects.equals(this.operatorConfig, flinkJobConfig.operatorConfig)
            && Objects.equals(this.staticEstimatorConfig, flinkJobConfig.staticEstimatorConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(checkpointEnabled,
            checkpointMode,
            checkpointInterval,
            logEnabled,
            obsBucket,
            smnTopic,
            edgeGroupIds,
            rootId,
            managerCuNumber,
            cuNumber,
            parallelNumber,
            restartWhenException,
            idleStateRetention,
            udfJarUrl,
            dirtyDataStrategy,
            entrypoint,
            dependencyJars,
            dependencyFiles,
            executorNumber,
            executorCuNumber,
            resumeCheckpoint,
            runtimeConfig,
            graphEditorEnabled,
            graphEditorData,
            resumeMaxNum,
            checkpointPath,
            configUrl,
            tmCus,
            tmSlotNum,
            image,
            feature,
            flinkVersion,
            operatorConfig,
            staticEstimatorConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlinkJobConfig {\n");
        sb.append("    checkpointEnabled: ").append(toIndentedString(checkpointEnabled)).append("\n");
        sb.append("    checkpointMode: ").append(toIndentedString(checkpointMode)).append("\n");
        sb.append("    checkpointInterval: ").append(toIndentedString(checkpointInterval)).append("\n");
        sb.append("    logEnabled: ").append(toIndentedString(logEnabled)).append("\n");
        sb.append("    obsBucket: ").append(toIndentedString(obsBucket)).append("\n");
        sb.append("    smnTopic: ").append(toIndentedString(smnTopic)).append("\n");
        sb.append("    edgeGroupIds: ").append(toIndentedString(edgeGroupIds)).append("\n");
        sb.append("    rootId: ").append(toIndentedString(rootId)).append("\n");
        sb.append("    managerCuNumber: ").append(toIndentedString(managerCuNumber)).append("\n");
        sb.append("    cuNumber: ").append(toIndentedString(cuNumber)).append("\n");
        sb.append("    parallelNumber: ").append(toIndentedString(parallelNumber)).append("\n");
        sb.append("    restartWhenException: ").append(toIndentedString(restartWhenException)).append("\n");
        sb.append("    idleStateRetention: ").append(toIndentedString(idleStateRetention)).append("\n");
        sb.append("    udfJarUrl: ").append(toIndentedString(udfJarUrl)).append("\n");
        sb.append("    dirtyDataStrategy: ").append(toIndentedString(dirtyDataStrategy)).append("\n");
        sb.append("    entrypoint: ").append(toIndentedString(entrypoint)).append("\n");
        sb.append("    dependencyJars: ").append(toIndentedString(dependencyJars)).append("\n");
        sb.append("    dependencyFiles: ").append(toIndentedString(dependencyFiles)).append("\n");
        sb.append("    executorNumber: ").append(toIndentedString(executorNumber)).append("\n");
        sb.append("    executorCuNumber: ").append(toIndentedString(executorCuNumber)).append("\n");
        sb.append("    resumeCheckpoint: ").append(toIndentedString(resumeCheckpoint)).append("\n");
        sb.append("    runtimeConfig: ").append(toIndentedString(runtimeConfig)).append("\n");
        sb.append("    graphEditorEnabled: ").append(toIndentedString(graphEditorEnabled)).append("\n");
        sb.append("    graphEditorData: ").append(toIndentedString(graphEditorData)).append("\n");
        sb.append("    resumeMaxNum: ").append(toIndentedString(resumeMaxNum)).append("\n");
        sb.append("    checkpointPath: ").append(toIndentedString(checkpointPath)).append("\n");
        sb.append("    configUrl: ").append(toIndentedString(configUrl)).append("\n");
        sb.append("    tmCus: ").append(toIndentedString(tmCus)).append("\n");
        sb.append("    tmSlotNum: ").append(toIndentedString(tmSlotNum)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
        sb.append("    feature: ").append(toIndentedString(feature)).append("\n");
        sb.append("    flinkVersion: ").append(toIndentedString(flinkVersion)).append("\n");
        sb.append("    operatorConfig: ").append(toIndentedString(operatorConfig)).append("\n");
        sb.append("    staticEstimatorConfig: ").append(toIndentedString(staticEstimatorConfig)).append("\n");
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
