package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新SQL作业的请求参数。
 */
public class UpdateFlinkSqlRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desc")

    private String desc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_name")

    private String queueName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_body")

    private String sqlBody;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "run_mode")

    private String runMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cu_number")

    private Integer cuNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parallel_number")

    private Integer parallelNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "checkpoint_enabled")

    private Boolean checkpointEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "checkpoint_mode")

    private Integer checkpointMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "checkpoint_interval")

    private Integer checkpointInterval;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_bucket")

    private String obsBucket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "log_enabled")

    private Boolean logEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "smn_topic")

    private String smnTopic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restart_when_exception")

    private Boolean restartWhenException;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "idle_state_retention")

    private Integer idleStateRetention;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edge_group_ids")

    private List<String> edgeGroupIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dirty_data_strategy")

    private String dirtyDataStrategy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "udf_jar_url")

    private String udfJarUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manager_cu_number")

    private Integer managerCuNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tm_cus")

    private Integer tmCus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tm_slot_num")

    private Integer tmSlotNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resume_checkpoint")

    private Boolean resumeCheckpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resume_max_num")

    private Integer resumeMaxNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtime_config")

    private String runtimeConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "operator_config")

    private String operatorConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "static_estimator_config")

    private String staticEstimatorConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flink_version")

    private String flinkVersion;

    public UpdateFlinkSqlRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 作业名称。长度限制：0-57个字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateFlinkSqlRequestBody withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * 作业描述。长度限制：0-2048个字符。
     * @return desc
     */
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public UpdateFlinkSqlRequestBody withQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }

    /**
     * 队列名称。长度限制：1-128个字符。
     * @return queueName
     */
    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public UpdateFlinkSqlRequestBody withSqlBody(String sqlBody) {
        this.sqlBody = sqlBody;
        return this;
    }

    /**
     * Stream SQL语句。长度限制：0-1024*1024个字符。
     * @return sqlBody
     */
    public String getSqlBody() {
        return sqlBody;
    }

    public void setSqlBody(String sqlBody) {
        this.sqlBody = sqlBody;
    }

    public UpdateFlinkSqlRequestBody withRunMode(String runMode) {
        this.runMode = runMode;
        return this;
    }

    /**
     * 作业运行模式： shared_cluster：共享。 exclusive_cluster：独享。 edge_node：边缘节点。 默认值为shared_cluster。
     * @return runMode
     */
    public String getRunMode() {
        return runMode;
    }

    public void setRunMode(String runMode) {
        this.runMode = runMode;
    }

    public UpdateFlinkSqlRequestBody withCuNumber(Integer cuNumber) {
        this.cuNumber = cuNumber;
        return this;
    }

    /**
     * 用户为作业选择的CU数量。默认值为2。
     * @return cuNumber
     */
    public Integer getCuNumber() {
        return cuNumber;
    }

    public void setCuNumber(Integer cuNumber) {
        this.cuNumber = cuNumber;
    }

    public UpdateFlinkSqlRequestBody withParallelNumber(Integer parallelNumber) {
        this.parallelNumber = parallelNumber;
        return this;
    }

    /**
     * 用户设置的作业并行数目。默认值为1。
     * @return parallelNumber
     */
    public Integer getParallelNumber() {
        return parallelNumber;
    }

    public void setParallelNumber(Integer parallelNumber) {
        this.parallelNumber = parallelNumber;
    }

    public UpdateFlinkSqlRequestBody withCheckpointEnabled(Boolean checkpointEnabled) {
        this.checkpointEnabled = checkpointEnabled;
        return this;
    }

    /**
     * 是否开启作业自动快照功能。 开启：true; 关闭：false; 默认：false.
     * @return checkpointEnabled
     */
    public Boolean getCheckpointEnabled() {
        return checkpointEnabled;
    }

    public void setCheckpointEnabled(Boolean checkpointEnabled) {
        this.checkpointEnabled = checkpointEnabled;
    }

    public UpdateFlinkSqlRequestBody withCheckpointMode(Integer checkpointMode) {
        this.checkpointMode = checkpointMode;
        return this;
    }

    /**
     * 快照模式： 1表示ExactlyOnce：数据只被消费一次。 2表示AtLeastOnce：数据至少被消费一次。 默认值为1。
     * @return checkpointMode
     */
    public Integer getCheckpointMode() {
        return checkpointMode;
    }

    public void setCheckpointMode(Integer checkpointMode) {
        this.checkpointMode = checkpointMode;
    }

    public UpdateFlinkSqlRequestBody withCheckpointInterval(Integer checkpointInterval) {
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

    public UpdateFlinkSqlRequestBody withObsBucket(String obsBucket) {
        this.obsBucket = obsBucket;
        return this;
    }

    /**
     * 当checkpoint_enabled为true时，该参数是用户授权保存快照的OBS路径。当log_enabled 为true时，该参数是用户授权保存作业日志的OBS路径。
     * @return obsBucket
     */
    public String getObsBucket() {
        return obsBucket;
    }

    public void setObsBucket(String obsBucket) {
        this.obsBucket = obsBucket;
    }

    public UpdateFlinkSqlRequestBody withLogEnabled(Boolean logEnabled) {
        this.logEnabled = logEnabled;
        return this;
    }

    /**
     * 是否开启作业的日志上传到用户的OBS功能，默认为false。
     * @return logEnabled
     */
    public Boolean getLogEnabled() {
        return logEnabled;
    }

    public void setLogEnabled(Boolean logEnabled) {
        this.logEnabled = logEnabled;
    }

    public UpdateFlinkSqlRequestBody withSmnTopic(String smnTopic) {
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

    public UpdateFlinkSqlRequestBody withRestartWhenException(Boolean restartWhenException) {
        this.restartWhenException = restartWhenException;
        return this;
    }

    /**
     * 是否开启作业异常自动重启，默认为false。
     * @return restartWhenException
     */
    public Boolean getRestartWhenException() {
        return restartWhenException;
    }

    public void setRestartWhenException(Boolean restartWhenException) {
        this.restartWhenException = restartWhenException;
    }

    public UpdateFlinkSqlRequestBody withIdleStateRetention(Integer idleStateRetention) {
        this.idleStateRetention = idleStateRetention;
        return this;
    }

    /**
     * 空闲状态过期周期，单位为秒，默认值为3600。
     * @return idleStateRetention
     */
    public Integer getIdleStateRetention() {
        return idleStateRetention;
    }

    public void setIdleStateRetention(Integer idleStateRetention) {
        this.idleStateRetention = idleStateRetention;
    }

    public UpdateFlinkSqlRequestBody withEdgeGroupIds(List<String> edgeGroupIds) {
        this.edgeGroupIds = edgeGroupIds;
        return this;
    }

    public UpdateFlinkSqlRequestBody addEdgeGroupIdsItem(String edgeGroupIdsItem) {
        if (this.edgeGroupIds == null) {
            this.edgeGroupIds = new ArrayList<>();
        }
        this.edgeGroupIds.add(edgeGroupIdsItem);
        return this;
    }

    public UpdateFlinkSqlRequestBody withEdgeGroupIds(Consumer<List<String>> edgeGroupIdsSetter) {
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

    public UpdateFlinkSqlRequestBody withDirtyDataStrategy(String dirtyDataStrategy) {
        this.dirtyDataStrategy = dirtyDataStrategy;
        return this;
    }

    /**
     * 作业脏数据策略。 “2”：保存； “1”：抛出异常； “0”：忽略； 默认值为“0”。
     * @return dirtyDataStrategy
     */
    public String getDirtyDataStrategy() {
        return dirtyDataStrategy;
    }

    public void setDirtyDataStrategy(String dirtyDataStrategy) {
        this.dirtyDataStrategy = dirtyDataStrategy;
    }

    public UpdateFlinkSqlRequestBody withUdfJarUrl(String udfJarUrl) {
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

    public UpdateFlinkSqlRequestBody withManagerCuNumber(Integer managerCuNumber) {
        this.managerCuNumber = managerCuNumber;
        return this;
    }

    /**
     * 用户为作业选择的管理单元（jobmanager）CU数量，默认值为“1”。
     * @return managerCuNumber
     */
    public Integer getManagerCuNumber() {
        return managerCuNumber;
    }

    public void setManagerCuNumber(Integer managerCuNumber) {
        this.managerCuNumber = managerCuNumber;
    }

    public UpdateFlinkSqlRequestBody withTmCus(Integer tmCus) {
        this.tmCus = tmCus;
        return this;
    }

    /**
     * 每个taskmanager的CU数，默认值为“1”。
     * @return tmCus
     */
    public Integer getTmCus() {
        return tmCus;
    }

    public void setTmCus(Integer tmCus) {
        this.tmCus = tmCus;
    }

    public UpdateFlinkSqlRequestBody withTmSlotNum(Integer tmSlotNum) {
        this.tmSlotNum = tmSlotNum;
        return this;
    }

    /**
     * 每个taskmanager的slot数，默认值为“(parallel_number*tm_cus)/(cu_number-manager_cu_number)”。
     * @return tmSlotNum
     */
    public Integer getTmSlotNum() {
        return tmSlotNum;
    }

    public void setTmSlotNum(Integer tmSlotNum) {
        this.tmSlotNum = tmSlotNum;
    }

    public UpdateFlinkSqlRequestBody withResumeCheckpoint(Boolean resumeCheckpoint) {
        this.resumeCheckpoint = resumeCheckpoint;
        return this;
    }

    /**
     * 异常重启是否从checkpoint恢复。
     * @return resumeCheckpoint
     */
    public Boolean getResumeCheckpoint() {
        return resumeCheckpoint;
    }

    public void setResumeCheckpoint(Boolean resumeCheckpoint) {
        this.resumeCheckpoint = resumeCheckpoint;
    }

    public UpdateFlinkSqlRequestBody withResumeMaxNum(Integer resumeMaxNum) {
        this.resumeMaxNum = resumeMaxNum;
        return this;
    }

    /**
     * 异常重试最大次数，单位：次/小时。取值范围：-1或大于0。默认值为“-1”，表示无限次数。
     * @return resumeMaxNum
     */
    public Integer getResumeMaxNum() {
        return resumeMaxNum;
    }

    public void setResumeMaxNum(Integer resumeMaxNum) {
        this.resumeMaxNum = resumeMaxNum;
    }

    public UpdateFlinkSqlRequestBody withRuntimeConfig(String runtimeConfig) {
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

    public UpdateFlinkSqlRequestBody withOperatorConfig(String operatorConfig) {
        this.operatorConfig = operatorConfig;
        return this;
    }

    /**
     * 算子的并行度配置。
     * @return operatorConfig
     */
    public String getOperatorConfig() {
        return operatorConfig;
    }

    public void setOperatorConfig(String operatorConfig) {
        this.operatorConfig = operatorConfig;
    }

    public UpdateFlinkSqlRequestBody withStaticEstimatorConfig(String staticEstimatorConfig) {
        this.staticEstimatorConfig = staticEstimatorConfig;
        return this;
    }

    /**
     * 每个算子的流量/命中率配置，json格式的字符串。例如： {\"operator_list\":[   {\"id\":\"0a448493b4782967b150582570326227\",\"rate_factor\":0.55},   {\"id\":\"6d2677a0ecc3fd8df0b72ec675edf8f4\",\"rate_factor\":1},   {\"id\":\"ea632d67b7d595e5b851708ae9ad79d6\",\"rate_factor\":0.55},   {\"id\":\"bc764cd8ddf7a0cff126f51c16239658\",\"output_rate\":2000} ]}
     * @return staticEstimatorConfig
     */
    public String getStaticEstimatorConfig() {
        return staticEstimatorConfig;
    }

    public void setStaticEstimatorConfig(String staticEstimatorConfig) {
        this.staticEstimatorConfig = staticEstimatorConfig;
    }

    public UpdateFlinkSqlRequestBody withFlinkVersion(String flinkVersion) {
        this.flinkVersion = flinkVersion;
        return this;
    }

    /**
     * Flink版本。当前只支持1.10和1.12。
     * @return flinkVersion
     */
    public String getFlinkVersion() {
        return flinkVersion;
    }

    public void setFlinkVersion(String flinkVersion) {
        this.flinkVersion = flinkVersion;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateFlinkSqlRequestBody updateFlinkSqlRequestBody = (UpdateFlinkSqlRequestBody) o;
        return Objects.equals(this.name, updateFlinkSqlRequestBody.name)
            && Objects.equals(this.desc, updateFlinkSqlRequestBody.desc)
            && Objects.equals(this.queueName, updateFlinkSqlRequestBody.queueName)
            && Objects.equals(this.sqlBody, updateFlinkSqlRequestBody.sqlBody)
            && Objects.equals(this.runMode, updateFlinkSqlRequestBody.runMode)
            && Objects.equals(this.cuNumber, updateFlinkSqlRequestBody.cuNumber)
            && Objects.equals(this.parallelNumber, updateFlinkSqlRequestBody.parallelNumber)
            && Objects.equals(this.checkpointEnabled, updateFlinkSqlRequestBody.checkpointEnabled)
            && Objects.equals(this.checkpointMode, updateFlinkSqlRequestBody.checkpointMode)
            && Objects.equals(this.checkpointInterval, updateFlinkSqlRequestBody.checkpointInterval)
            && Objects.equals(this.obsBucket, updateFlinkSqlRequestBody.obsBucket)
            && Objects.equals(this.logEnabled, updateFlinkSqlRequestBody.logEnabled)
            && Objects.equals(this.smnTopic, updateFlinkSqlRequestBody.smnTopic)
            && Objects.equals(this.restartWhenException, updateFlinkSqlRequestBody.restartWhenException)
            && Objects.equals(this.idleStateRetention, updateFlinkSqlRequestBody.idleStateRetention)
            && Objects.equals(this.edgeGroupIds, updateFlinkSqlRequestBody.edgeGroupIds)
            && Objects.equals(this.dirtyDataStrategy, updateFlinkSqlRequestBody.dirtyDataStrategy)
            && Objects.equals(this.udfJarUrl, updateFlinkSqlRequestBody.udfJarUrl)
            && Objects.equals(this.managerCuNumber, updateFlinkSqlRequestBody.managerCuNumber)
            && Objects.equals(this.tmCus, updateFlinkSqlRequestBody.tmCus)
            && Objects.equals(this.tmSlotNum, updateFlinkSqlRequestBody.tmSlotNum)
            && Objects.equals(this.resumeCheckpoint, updateFlinkSqlRequestBody.resumeCheckpoint)
            && Objects.equals(this.resumeMaxNum, updateFlinkSqlRequestBody.resumeMaxNum)
            && Objects.equals(this.runtimeConfig, updateFlinkSqlRequestBody.runtimeConfig)
            && Objects.equals(this.operatorConfig, updateFlinkSqlRequestBody.operatorConfig)
            && Objects.equals(this.staticEstimatorConfig, updateFlinkSqlRequestBody.staticEstimatorConfig)
            && Objects.equals(this.flinkVersion, updateFlinkSqlRequestBody.flinkVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            desc,
            queueName,
            sqlBody,
            runMode,
            cuNumber,
            parallelNumber,
            checkpointEnabled,
            checkpointMode,
            checkpointInterval,
            obsBucket,
            logEnabled,
            smnTopic,
            restartWhenException,
            idleStateRetention,
            edgeGroupIds,
            dirtyDataStrategy,
            udfJarUrl,
            managerCuNumber,
            tmCus,
            tmSlotNum,
            resumeCheckpoint,
            resumeMaxNum,
            runtimeConfig,
            operatorConfig,
            staticEstimatorConfig,
            flinkVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateFlinkSqlRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
        sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
        sb.append("    sqlBody: ").append(toIndentedString(sqlBody)).append("\n");
        sb.append("    runMode: ").append(toIndentedString(runMode)).append("\n");
        sb.append("    cuNumber: ").append(toIndentedString(cuNumber)).append("\n");
        sb.append("    parallelNumber: ").append(toIndentedString(parallelNumber)).append("\n");
        sb.append("    checkpointEnabled: ").append(toIndentedString(checkpointEnabled)).append("\n");
        sb.append("    checkpointMode: ").append(toIndentedString(checkpointMode)).append("\n");
        sb.append("    checkpointInterval: ").append(toIndentedString(checkpointInterval)).append("\n");
        sb.append("    obsBucket: ").append(toIndentedString(obsBucket)).append("\n");
        sb.append("    logEnabled: ").append(toIndentedString(logEnabled)).append("\n");
        sb.append("    smnTopic: ").append(toIndentedString(smnTopic)).append("\n");
        sb.append("    restartWhenException: ").append(toIndentedString(restartWhenException)).append("\n");
        sb.append("    idleStateRetention: ").append(toIndentedString(idleStateRetention)).append("\n");
        sb.append("    edgeGroupIds: ").append(toIndentedString(edgeGroupIds)).append("\n");
        sb.append("    dirtyDataStrategy: ").append(toIndentedString(dirtyDataStrategy)).append("\n");
        sb.append("    udfJarUrl: ").append(toIndentedString(udfJarUrl)).append("\n");
        sb.append("    managerCuNumber: ").append(toIndentedString(managerCuNumber)).append("\n");
        sb.append("    tmCus: ").append(toIndentedString(tmCus)).append("\n");
        sb.append("    tmSlotNum: ").append(toIndentedString(tmSlotNum)).append("\n");
        sb.append("    resumeCheckpoint: ").append(toIndentedString(resumeCheckpoint)).append("\n");
        sb.append("    resumeMaxNum: ").append(toIndentedString(resumeMaxNum)).append("\n");
        sb.append("    runtimeConfig: ").append(toIndentedString(runtimeConfig)).append("\n");
        sb.append("    operatorConfig: ").append(toIndentedString(operatorConfig)).append("\n");
        sb.append("    staticEstimatorConfig: ").append(toIndentedString(staticEstimatorConfig)).append("\n");
        sb.append("    flinkVersion: ").append(toIndentedString(flinkVersion)).append("\n");
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
