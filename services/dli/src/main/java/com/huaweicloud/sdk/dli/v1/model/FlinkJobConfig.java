package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 作业配置，当“show_detail”为“true”时才有该参数配置。
 */
public class FlinkJobConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "checkpoint_enabled")

    private Boolean checkpointEnabled;

    /**
     * 参数解释:  快照模式 示例: exactly_once 约束限制:  无 取值范围: exactly_once（数据只被消费一次） at_least_once（数据至少被消费一次） 默认取值: 无
     */
    public static final class CheckpointModeEnum {

        /**
         * Enum EXACTLY_ONCE for value: "exactly_once"
         */
        public static final CheckpointModeEnum EXACTLY_ONCE = new CheckpointModeEnum("exactly_once");

        /**
         * Enum AT_LEAST_ONCE for value: "at_least_once"
         */
        public static final CheckpointModeEnum AT_LEAST_ONCE = new CheckpointModeEnum("at_least_once");

        private static final Map<String, CheckpointModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CheckpointModeEnum> createStaticFields() {
            Map<String, CheckpointModeEnum> map = new HashMap<>();
            map.put("exactly_once", EXACTLY_ONCE);
            map.put("at_least_once", AT_LEAST_ONCE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CheckpointModeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static CheckpointModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CheckpointModeEnum(value));
        }

        public static CheckpointModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CheckpointModeEnum) {
                return this.value.equals(((CheckpointModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "checkpoint_mode")

    private CheckpointModeEnum checkpointMode;

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

    private Long rootId;

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
    @JsonProperty(value = "execution_agency_urn")

    private String executionAgencyUrn;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "real_cu_number")

    private Integer realCuNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_config")

    private ResourceConfig resourceConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_config_version")

    private String resourceConfigVersion;

    public FlinkJobConfig withCheckpointEnabled(Boolean checkpointEnabled) {
        this.checkpointEnabled = checkpointEnabled;
        return this;
    }

    /**
     * 参数解释:  是否开启作业自动快照功能 示例: false 约束限制:  无 取值范围: true,false 默认取值: false
     * @return checkpointEnabled
     */
    public Boolean getCheckpointEnabled() {
        return checkpointEnabled;
    }

    public void setCheckpointEnabled(Boolean checkpointEnabled) {
        this.checkpointEnabled = checkpointEnabled;
    }

    public FlinkJobConfig withCheckpointMode(CheckpointModeEnum checkpointMode) {
        this.checkpointMode = checkpointMode;
        return this;
    }

    /**
     * 参数解释:  快照模式 示例: exactly_once 约束限制:  无 取值范围: exactly_once（数据只被消费一次） at_least_once（数据至少被消费一次） 默认取值: 无
     * @return checkpointMode
     */
    public CheckpointModeEnum getCheckpointMode() {
        return checkpointMode;
    }

    public void setCheckpointMode(CheckpointModeEnum checkpointMode) {
        this.checkpointMode = checkpointMode;
    }

    public FlinkJobConfig withCheckpointInterval(Integer checkpointInterval) {
        this.checkpointInterval = checkpointInterval;
        return this;
    }

    /**
     * 参数解释:  快照时间间隔, 单位为秒 示例: 10 约束限制:  无 取值范围: 无 默认取值: 10
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
     * 参数解释:  是否启用日志存储 示例: false 约束限制:  无 取值范围: true,false 默认取值: false
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
     * 参数解释:  OBS桶名 示例: obs-demo 约束限制:  无 取值范围: 无 默认取值: 无
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
     * 参数解释:  当作业异常时，向该SMN主题推送告警信息 示例: cs_job_exception 约束限制:  无 取值范围: 无 默认取值: 无
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
     * 参数解释:  边缘计算组ID列表 示例: 62de1e1c-066e-48a8-a79d-f461a31b2ee1,2eb00f85-99f2-4144-bcb7-d39ff47f9002 约束限制:  无 取值范围: 无 默认取值: 无
     * @return edgeGroupIds
     */
    public List<String> getEdgeGroupIds() {
        return edgeGroupIds;
    }

    public void setEdgeGroupIds(List<String> edgeGroupIds) {
        this.edgeGroupIds = edgeGroupIds;
    }

    public FlinkJobConfig withRootId(Long rootId) {
        this.rootId = rootId;
        return this;
    }

    /**
     * 参数解释:  父作业ID 示例: 11 约束限制:  无 取值范围: 无 默认取值: 无
     * @return rootId
     */
    public Long getRootId() {
        return rootId;
    }

    public void setRootId(Long rootId) {
        this.rootId = rootId;
    }

    public FlinkJobConfig withManagerCuNumber(Integer managerCuNumber) {
        this.managerCuNumber = managerCuNumber;
        return this;
    }

    /**
     * 参数解释:  管理单元CU数 示例: 1 约束限制:  无 取值范围: 大于等于0的整数 默认取值: 无
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
     * 参数解释:  用户为作业选择的CU数量 示例: 2 约束限制:  无 取值范围: [2,400] 默认取值: 2
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
     * 参数解释:  用户设置的作业并行数， “show_detail”为“true”时独有 示例: 1 约束限制:  无 取值范围: [1,2000] 默认取值: 1
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
     * 参数解释:  是否开启异常重启功能 示例: false 约束限制:  无 取值范围: true,false 默认取值: 无
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
     * 参数解释:  空闲状态过期周期 示例: 3600 约束限制:  无 取值范围: 大于等于0的整数 默认取值: 无
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
     * 参数解释:  用户已上传到DLI资源管理系统的资源包名，用户sql作业的udf jar通过该参数传入 示例: obs://cs-append/jar/udf/flink-1.13-demo-1.0-udf.jar obs://onlyci-7/flink/udx.jar 约束限制:  无 取值范围: 无 默认取值: 无
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
     * 参数解释:  作业脏数据策略 示例: 0 约束限制:  无 取值范围: 0（忽略） 1（抛出异常） 2:obsDir（保存，obsDir表示脏数据存储路径） 默认取值: 无
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
     * 参数解释:  用户已上传到DLI资源管理系统的资源包名，用户自定义作业主类所在的jar包 示例: obs://test/demo/WindowJoin.jar 约束限制:  无 取值范围: 无 默认取值: 无
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
     * 参数解释:  用户已上传到DLI资源管理系统的资源包名，用户自定义作业的其他依赖包 示例: [\"zsdas/wordcount.jar\",\"ygj/flink-dis-to-kafka-v5.jar\"] 约束限制:  无 取值范围: 无 默认取值: 无
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
     * 参数解释:  用户已上传到DLI资源管理系统的资源包名，用户自定义作业的依赖文件 示例: [\"zsdas/wordcount.jar\",\"ygj/flink-dis-to-kafka-v5.jar\"] 约束限制:  无 取值范围: 无 默认取值: 无
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
     * 参数解释:  作业使用计算节点个数 示例: 0 约束限制:  无 取值范围: 大于等于0的整数 默认取值: 无
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
     * 参数解释:  计算节点cu数 示例: 0 约束限制:  无 取值范围: 大于等于0的整数 默认取值: 无
     * @return executorCuNumber
     */
    public Integer getExecutorCuNumber() {
        return executorCuNumber;
    }

    public void setExecutorCuNumber(Integer executorCuNumber) {
        this.executorCuNumber = executorCuNumber;
    }

    public FlinkJobConfig withExecutionAgencyUrn(String executionAgencyUrn) {
        this.executionAgencyUrn = executionAgencyUrn;
        return this;
    }

    /**
     * 参数解释:  授权给DLI的委托名。Flink1.15版本时支持配置该参数。 示例: agency 约束限制:  无 取值范围: 无 默认取值: 无
     * @return executionAgencyUrn
     */
    public String getExecutionAgencyUrn() {
        return executionAgencyUrn;
    }

    public void setExecutionAgencyUrn(String executionAgencyUrn) {
        this.executionAgencyUrn = executionAgencyUrn;
    }

    public FlinkJobConfig withResumeCheckpoint(Boolean resumeCheckpoint) {
        this.resumeCheckpoint = resumeCheckpoint;
        return this;
    }

    /**
     * 参数解释:  异常自动重启时，是否从最新checkpoint恢复，默认false 示例: 0 约束限制:  无 取值范围: true,false 默认取值: false
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
     * 参数解释: Flink作业运行时自定义优化参数 示例: [{\\\"key\\\":\\\"high-availability\\\",\\\"value\\\":\\\"org.apache.flink.kubernetes.highavailability.KubernetesHaServicesFactory\\\" },{ \\\"key\\\":\\\"kubernetes.jobmanager.replicas\\\",\\\"value\\\":\\\"2\\\" },{ \\\"key\\\":\\\"high-availability.storageDir\\\",\\\"value\\\":\\\"obs://fz-test/test\\\"}] 约束限制:  无 取值范围: 无 默认取值: 无
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
     * 参数解释: 流图编辑开关 示例: false 约束限制:  无 取值范围: 无 默认取值: false
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
     * 参数解释: 流图编辑数据 约束限制:  无 取值范围: 无 默认取值: 无
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
     * 参数解释: 异常重试最大次数。-1代表无限 示例: -1 约束限制:  无 取值范围: 无 默认取值: 无
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
     * 参数解释: 检查点保存路径 示例: obs://cwk/checkpoint/ 约束限制:  无 取值范围: 无 默认取值: 无
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
     * 参数解释: 用户上传的config包OBS路径。 示例: obs://bucket-62099355b894428e8916573ae635f1f9/di-flink/lib/client.jks,obs://bucket-62099355b894428e8916573ae635f1f9/di-flink/lib/client.jks 约束限制:  无 取值范围: 无 默认取值: 无
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
     * 参数解释: 单TM所占CU数 示例: 1 约束限制:  无 取值范围: 大于等于0的整数 默认取值: 无
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
     * 参数解释: 单TM Slot数 示例: 1 约束限制:  无 取值范围: 大于等于0的整数 默认取值: 无
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
     * 参数解释: 自定义镜像。格式为：组织名/镜像名:镜像版本。当用户设置“feature”为“custom”时，该参数生效。用户可通过与“feature”参数配合使用，指定作业运行使用自定义的Flink镜像 示例: dli/spark:2.4.8 约束限制:  无 取值范围: 无 默认取值: 无
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
     * 参数解释: 自定义作业特性。表示用户作业使用的Flink镜像类型。basic：表示使用DLI提供的基础Flink镜像。custom：表示使用用户自定义的Flink镜像 示例: basic 约束限制:  无 取值范围: basic：表示使用DLI提供的基础Flink镜像 custom：表示使用用户自定义的Flink镜像 默认取值: 无
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
     * 参数解释: Flink版本。当用户设置“feature”为“basic”时，该参数生效。用户可通过与“feature”参数配合使用，指定作业运行使用的DLI基础Flink镜像的版本 示例: 1.17 约束限制:  无 取值范围: 无 默认取值: 无
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
     * 参数解释: 各算子并行度参数，以json的形式展示各算子id和并行度 示例: '{\"operator_list\":[{\"id\":\"0a448493b4782967b150582570326227\",\"parallelism\":1},{\"id\":\"6d2677a0ecc3fd8df0b72ec675edf8f4\",\"parallelism\":1},{\"id\":\"ea632d67b7d595e5b851708ae9ad79d6\",\"parallelism\":1},{\"id\":\"ddb598ad156ed281023ba4eebbe487e3\",\"parallelism\":1},{\"id\":\"bc764cd8ddf7a0cff126f51c16239658\",\"parallelism\":1}]}' 约束限制:  符合Json格式的字符串 取值范围: 无 默认取值: 无
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
     * 参数解释: 静态流图资源预估参数，以json的形式展示 示例: '{\"operator_list\":[{\"id\":\"0a448493b4782967b150582570326227\",\"parallelism\":1},{\"id\":\"6d2677a0ecc3fd8df0b72ec675edf8f4\",\"parallelism\":1},{\"id\":\"ea632d67b7d595e5b851708ae9ad79d6\",\"parallelism\":1},{\"id\":\"ddb598ad156ed281023ba4eebbe487e3\",\"parallelism\":1},{\"id\":\"bc764cd8ddf7a0cff126f51c16239658\",\"parallelism\":1}]}' 约束限制:  符合Json格式的字符串 取值范围: 无 默认取值: 无
     * @return staticEstimatorConfig
     */
    public String getStaticEstimatorConfig() {
        return staticEstimatorConfig;
    }

    public void setStaticEstimatorConfig(String staticEstimatorConfig) {
        this.staticEstimatorConfig = staticEstimatorConfig;
    }

    public FlinkJobConfig withRealCuNumber(Integer realCuNumber) {
        this.realCuNumber = realCuNumber;
        return this;
    }

    /**
     * 参数解释: 实际使用的CU数 示例: 0 约束限制:  无 取值范围: 大于等于0的整数 默认取值: 0
     * @return realCuNumber
     */
    public Integer getRealCuNumber() {
        return realCuNumber;
    }

    public void setRealCuNumber(Integer realCuNumber) {
        this.realCuNumber = realCuNumber;
    }

    public FlinkJobConfig withResourceConfig(ResourceConfig resourceConfig) {
        this.resourceConfig = resourceConfig;
        return this;
    }

    public FlinkJobConfig withResourceConfig(Consumer<ResourceConfig> resourceConfigSetter) {
        if (this.resourceConfig == null) {
            this.resourceConfig = new ResourceConfig();
            resourceConfigSetter.accept(this.resourceConfig);
        }

        return this;
    }

    /**
     * Get resourceConfig
     * @return resourceConfig
     */
    public ResourceConfig getResourceConfig() {
        return resourceConfig;
    }

    public void setResourceConfig(ResourceConfig resourceConfig) {
        this.resourceConfig = resourceConfig;
    }

    public FlinkJobConfig withResourceConfigVersion(String resourceConfigVersion) {
        this.resourceConfigVersion = resourceConfigVersion;
        return this;
    }

    /**
     * 资源配置版本。可选值 \"v1\" ,\"v2\".默认为“v1”。
     * @return resourceConfigVersion
     */
    public String getResourceConfigVersion() {
        return resourceConfigVersion;
    }

    public void setResourceConfigVersion(String resourceConfigVersion) {
        this.resourceConfigVersion = resourceConfigVersion;
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
            && Objects.equals(this.executionAgencyUrn, that.executionAgencyUrn)
            && Objects.equals(this.resumeCheckpoint, that.resumeCheckpoint)
            && Objects.equals(this.runtimeConfig, that.runtimeConfig)
            && Objects.equals(this.graphEditorEnabled, that.graphEditorEnabled)
            && Objects.equals(this.graphEditorData, that.graphEditorData)
            && Objects.equals(this.resumeMaxNum, that.resumeMaxNum)
            && Objects.equals(this.checkpointPath, that.checkpointPath)
            && Objects.equals(this.configUrl, that.configUrl) && Objects.equals(this.tmCus, that.tmCus)
            && Objects.equals(this.tmSlotNum, that.tmSlotNum) && Objects.equals(this.image, that.image)
            && Objects.equals(this.feature, that.feature) && Objects.equals(this.flinkVersion, that.flinkVersion)
            && Objects.equals(this.operatorConfig, that.operatorConfig)
            && Objects.equals(this.staticEstimatorConfig, that.staticEstimatorConfig)
            && Objects.equals(this.realCuNumber, that.realCuNumber)
            && Objects.equals(this.resourceConfig, that.resourceConfig)
            && Objects.equals(this.resourceConfigVersion, that.resourceConfigVersion);
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
            executionAgencyUrn,
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
            staticEstimatorConfig,
            realCuNumber,
            resourceConfig,
            resourceConfigVersion);
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
        sb.append("    executionAgencyUrn: ").append(toIndentedString(executionAgencyUrn)).append("\n");
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
        sb.append("    realCuNumber: ").append(toIndentedString(realCuNumber)).append("\n");
        sb.append("    resourceConfig: ").append(toIndentedString(resourceConfig)).append("\n");
        sb.append("    resourceConfigVersion: ").append(toIndentedString(resourceConfigVersion)).append("\n");
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
