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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FlinkJobConfig that = (FlinkJobConfig) obj;
        return Objects.equals(this.checkpointEnabled, that.checkpointEnabled)
            && Objects.equals(this.checkpointMode, that.checkpointMode)
            && Objects.equals(this.checkpointInterval, that.checkpointInterval)
            && Objects.equals(this.logEnabled, that.logEnabled) && Objects.equals(this.obsBucket, that.obsBucket)
            && Objects.equals(this.smnTopic, that.smnTopic) && Objects.equals(this.edgeGroupIds, that.edgeGroupIds)
            && Objects.equals(this.rootId, that.rootId) && Objects.equals(this.managerCuNumber, that.managerCuNumber)
            && Objects.equals(this.cuNumber, that.cuNumber) && Objects.equals(this.parallelNumber, that.parallelNumber)
            && Objects.equals(this.restartWhenException, that.restartWhenException)
            && Objects.equals(this.idleStateRetention, that.idleStateRetention)
            && Objects.equals(this.udfJarUrl, that.udfJarUrl)
            && Objects.equals(this.dirtyDataStrategy, that.dirtyDataStrategy)
            && Objects.equals(this.entrypoint, that.entrypoint)
            && Objects.equals(this.dependencyJars, that.dependencyJars)
            && Objects.equals(this.dependencyFiles, that.dependencyFiles)
            && Objects.equals(this.executorNumber, that.executorNumber)
            && Objects.equals(this.executorCuNumber, that.executorCuNumber)
            && Objects.equals(this.resumeCheckpoint, that.resumeCheckpoint);
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
            resumeCheckpoint);
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
