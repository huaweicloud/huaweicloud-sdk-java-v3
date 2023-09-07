package com.huaweicloud.sdk.drs.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 任务详情响应体。
 */
public class JobDetailResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "master_job_id")

    private String masterJobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "base_info")

    private JobBaseInfo baseInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_endpoint")

    private List<JobEndpointInfo> sourceEndpoint = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_endpoint")

    private List<JobEndpointInfo> targetEndpoint = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alarm_notify")

    private AlarmNotifyConfig alarmNotify;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "speed_limit")

    private List<SpeedLimitInfo> speedLimit = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_migration")

    private UserMigrationInfo userMigration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_config")

    private PolicyConfig policyConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "db_param")

    private DbParamInfo dbParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tuning_params")

    private TuningParamInfo tuningParams;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_order")

    private PeriodOrderInfo periodOrder;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_info")

    private JobNodeInfo nodeInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logs")

    private List<TaskLogInfo> logs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "network_results")

    private List<QueryNetworkResult> networkResults = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "precheck_result")

    private QueryPreCheckResult precheckResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "progress_info")

    private JobProgressInfo progressInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migration_object_progress_info")

    private QueryMigrationObjectProgressInfo migrationObjectProgressInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metrics")

    private QueryMetricResult metrics;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "compare_result")

    private CompareResultInfo compareResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_import_file_resp")

    private SupportImportFileResult supportImportFileResp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_features")

    private Map<String, String> instanceFeatures = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_version")

    private String taskVersion;

    public JobDetailResp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 任务ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public JobDetailResp withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 任务状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public JobDetailResp withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 任务创建时间。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public JobDetailResp withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 列表中的项目总数，与分页无关。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public JobDetailResp withMasterJobId(String masterJobId) {
        this.masterJobId = masterJobId;
        return this;
    }

    /**
     * 多任务主节点的任务ID。
     * @return masterJobId
     */
    public String getMasterJobId() {
        return masterJobId;
    }

    public void setMasterJobId(String masterJobId) {
        this.masterJobId = masterJobId;
    }

    public JobDetailResp withBaseInfo(JobBaseInfo baseInfo) {
        this.baseInfo = baseInfo;
        return this;
    }

    public JobDetailResp withBaseInfo(Consumer<JobBaseInfo> baseInfoSetter) {
        if (this.baseInfo == null) {
            this.baseInfo = new JobBaseInfo();
            baseInfoSetter.accept(this.baseInfo);
        }

        return this;
    }

    /**
     * Get baseInfo
     * @return baseInfo
     */
    public JobBaseInfo getBaseInfo() {
        return baseInfo;
    }

    public void setBaseInfo(JobBaseInfo baseInfo) {
        this.baseInfo = baseInfo;
    }

    public JobDetailResp withSourceEndpoint(List<JobEndpointInfo> sourceEndpoint) {
        this.sourceEndpoint = sourceEndpoint;
        return this;
    }

    public JobDetailResp addSourceEndpointItem(JobEndpointInfo sourceEndpointItem) {
        if (this.sourceEndpoint == null) {
            this.sourceEndpoint = new ArrayList<>();
        }
        this.sourceEndpoint.add(sourceEndpointItem);
        return this;
    }

    public JobDetailResp withSourceEndpoint(Consumer<List<JobEndpointInfo>> sourceEndpointSetter) {
        if (this.sourceEndpoint == null) {
            this.sourceEndpoint = new ArrayList<>();
        }
        sourceEndpointSetter.accept(this.sourceEndpoint);
        return this;
    }

    /**
     * 任务源数据库信息体。
     * @return sourceEndpoint
     */
    public List<JobEndpointInfo> getSourceEndpoint() {
        return sourceEndpoint;
    }

    public void setSourceEndpoint(List<JobEndpointInfo> sourceEndpoint) {
        this.sourceEndpoint = sourceEndpoint;
    }

    public JobDetailResp withTargetEndpoint(List<JobEndpointInfo> targetEndpoint) {
        this.targetEndpoint = targetEndpoint;
        return this;
    }

    public JobDetailResp addTargetEndpointItem(JobEndpointInfo targetEndpointItem) {
        if (this.targetEndpoint == null) {
            this.targetEndpoint = new ArrayList<>();
        }
        this.targetEndpoint.add(targetEndpointItem);
        return this;
    }

    public JobDetailResp withTargetEndpoint(Consumer<List<JobEndpointInfo>> targetEndpointSetter) {
        if (this.targetEndpoint == null) {
            this.targetEndpoint = new ArrayList<>();
        }
        targetEndpointSetter.accept(this.targetEndpoint);
        return this;
    }

    /**
     * 任务目标数据库信息体。
     * @return targetEndpoint
     */
    public List<JobEndpointInfo> getTargetEndpoint() {
        return targetEndpoint;
    }

    public void setTargetEndpoint(List<JobEndpointInfo> targetEndpoint) {
        this.targetEndpoint = targetEndpoint;
    }

    public JobDetailResp withAlarmNotify(AlarmNotifyConfig alarmNotify) {
        this.alarmNotify = alarmNotify;
        return this;
    }

    public JobDetailResp withAlarmNotify(Consumer<AlarmNotifyConfig> alarmNotifySetter) {
        if (this.alarmNotify == null) {
            this.alarmNotify = new AlarmNotifyConfig();
            alarmNotifySetter.accept(this.alarmNotify);
        }

        return this;
    }

    /**
     * Get alarmNotify
     * @return alarmNotify
     */
    public AlarmNotifyConfig getAlarmNotify() {
        return alarmNotify;
    }

    public void setAlarmNotify(AlarmNotifyConfig alarmNotify) {
        this.alarmNotify = alarmNotify;
    }

    public JobDetailResp withSpeedLimit(List<SpeedLimitInfo> speedLimit) {
        this.speedLimit = speedLimit;
        return this;
    }

    public JobDetailResp addSpeedLimitItem(SpeedLimitInfo speedLimitItem) {
        if (this.speedLimit == null) {
            this.speedLimit = new ArrayList<>();
        }
        this.speedLimit.add(speedLimitItem);
        return this;
    }

    public JobDetailResp withSpeedLimit(Consumer<List<SpeedLimitInfo>> speedLimitSetter) {
        if (this.speedLimit == null) {
            this.speedLimit = new ArrayList<>();
        }
        speedLimitSetter.accept(this.speedLimit);
        return this;
    }

    /**
     * 限速信息体。 - 限速：自定义的最大迁移速度，迁移过程中的迁移速度将不会超过该速度。  - 不限速：对迁移速度不进行限制，通常会最大化使用源数据库的出口带宽。该流速模式同时会对源数据库造成读消耗，消耗取决于源数据库的出口带宽。比如：源数据库的出口带宽为100MB/s，假设高速模式使用了80%带宽，则迁移对源数据库将造成80MB/s的读操作IO消耗。
     * @return speedLimit
     */
    public List<SpeedLimitInfo> getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(List<SpeedLimitInfo> speedLimit) {
        this.speedLimit = speedLimit;
    }

    public JobDetailResp withUserMigration(UserMigrationInfo userMigration) {
        this.userMigration = userMigration;
        return this;
    }

    public JobDetailResp withUserMigration(Consumer<UserMigrationInfo> userMigrationSetter) {
        if (this.userMigration == null) {
            this.userMigration = new UserMigrationInfo();
            userMigrationSetter.accept(this.userMigration);
        }

        return this;
    }

    /**
     * Get userMigration
     * @return userMigration
     */
    public UserMigrationInfo getUserMigration() {
        return userMigration;
    }

    public void setUserMigration(UserMigrationInfo userMigration) {
        this.userMigration = userMigration;
    }

    public JobDetailResp withPolicyConfig(PolicyConfig policyConfig) {
        this.policyConfig = policyConfig;
        return this;
    }

    public JobDetailResp withPolicyConfig(Consumer<PolicyConfig> policyConfigSetter) {
        if (this.policyConfig == null) {
            this.policyConfig = new PolicyConfig();
            policyConfigSetter.accept(this.policyConfig);
        }

        return this;
    }

    /**
     * Get policyConfig
     * @return policyConfig
     */
    public PolicyConfig getPolicyConfig() {
        return policyConfig;
    }

    public void setPolicyConfig(PolicyConfig policyConfig) {
        this.policyConfig = policyConfig;
    }

    public JobDetailResp withDbParam(DbParamInfo dbParam) {
        this.dbParam = dbParam;
        return this;
    }

    public JobDetailResp withDbParam(Consumer<DbParamInfo> dbParamSetter) {
        if (this.dbParam == null) {
            this.dbParam = new DbParamInfo();
            dbParamSetter.accept(this.dbParam);
        }

        return this;
    }

    /**
     * Get dbParam
     * @return dbParam
     */
    public DbParamInfo getDbParam() {
        return dbParam;
    }

    public void setDbParam(DbParamInfo dbParam) {
        this.dbParam = dbParam;
    }

    public JobDetailResp withTuningParams(TuningParamInfo tuningParams) {
        this.tuningParams = tuningParams;
        return this;
    }

    public JobDetailResp withTuningParams(Consumer<TuningParamInfo> tuningParamsSetter) {
        if (this.tuningParams == null) {
            this.tuningParams = new TuningParamInfo();
            tuningParamsSetter.accept(this.tuningParams);
        }

        return this;
    }

    /**
     * Get tuningParams
     * @return tuningParams
     */
    public TuningParamInfo getTuningParams() {
        return tuningParams;
    }

    public void setTuningParams(TuningParamInfo tuningParams) {
        this.tuningParams = tuningParams;
    }

    public JobDetailResp withPeriodOrder(PeriodOrderInfo periodOrder) {
        this.periodOrder = periodOrder;
        return this;
    }

    public JobDetailResp withPeriodOrder(Consumer<PeriodOrderInfo> periodOrderSetter) {
        if (this.periodOrder == null) {
            this.periodOrder = new PeriodOrderInfo();
            periodOrderSetter.accept(this.periodOrder);
        }

        return this;
    }

    /**
     * Get periodOrder
     * @return periodOrder
     */
    public PeriodOrderInfo getPeriodOrder() {
        return periodOrder;
    }

    public void setPeriodOrder(PeriodOrderInfo periodOrder) {
        this.periodOrder = periodOrder;
    }

    public JobDetailResp withNodeInfo(JobNodeInfo nodeInfo) {
        this.nodeInfo = nodeInfo;
        return this;
    }

    public JobDetailResp withNodeInfo(Consumer<JobNodeInfo> nodeInfoSetter) {
        if (this.nodeInfo == null) {
            this.nodeInfo = new JobNodeInfo();
            nodeInfoSetter.accept(this.nodeInfo);
        }

        return this;
    }

    /**
     * Get nodeInfo
     * @return nodeInfo
     */
    public JobNodeInfo getNodeInfo() {
        return nodeInfo;
    }

    public void setNodeInfo(JobNodeInfo nodeInfo) {
        this.nodeInfo = nodeInfo;
    }

    public JobDetailResp withLogs(List<TaskLogInfo> logs) {
        this.logs = logs;
        return this;
    }

    public JobDetailResp addLogsItem(TaskLogInfo logsItem) {
        if (this.logs == null) {
            this.logs = new ArrayList<>();
        }
        this.logs.add(logsItem);
        return this;
    }

    public JobDetailResp withLogs(Consumer<List<TaskLogInfo>> logsSetter) {
        if (this.logs == null) {
            this.logs = new ArrayList<>();
        }
        logsSetter.accept(this.logs);
        return this;
    }

    /**
     * 日志查询结果信息体。
     * @return logs
     */
    public List<TaskLogInfo> getLogs() {
        return logs;
    }

    public void setLogs(List<TaskLogInfo> logs) {
        this.logs = logs;
    }

    public JobDetailResp withNetworkResults(List<QueryNetworkResult> networkResults) {
        this.networkResults = networkResults;
        return this;
    }

    public JobDetailResp addNetworkResultsItem(QueryNetworkResult networkResultsItem) {
        if (this.networkResults == null) {
            this.networkResults = new ArrayList<>();
        }
        this.networkResults.add(networkResultsItem);
        return this;
    }

    public JobDetailResp withNetworkResults(Consumer<List<QueryNetworkResult>> networkResultsSetter) {
        if (this.networkResults == null) {
            this.networkResults = new ArrayList<>();
        }
        networkResultsSetter.accept(this.networkResults);
        return this;
    }

    /**
     * 网络打通测试结果信息体。
     * @return networkResults
     */
    public List<QueryNetworkResult> getNetworkResults() {
        return networkResults;
    }

    public void setNetworkResults(List<QueryNetworkResult> networkResults) {
        this.networkResults = networkResults;
    }

    public JobDetailResp withPrecheckResult(QueryPreCheckResult precheckResult) {
        this.precheckResult = precheckResult;
        return this;
    }

    public JobDetailResp withPrecheckResult(Consumer<QueryPreCheckResult> precheckResultSetter) {
        if (this.precheckResult == null) {
            this.precheckResult = new QueryPreCheckResult();
            precheckResultSetter.accept(this.precheckResult);
        }

        return this;
    }

    /**
     * Get precheckResult
     * @return precheckResult
     */
    public QueryPreCheckResult getPrecheckResult() {
        return precheckResult;
    }

    public void setPrecheckResult(QueryPreCheckResult precheckResult) {
        this.precheckResult = precheckResult;
    }

    public JobDetailResp withProgressInfo(JobProgressInfo progressInfo) {
        this.progressInfo = progressInfo;
        return this;
    }

    public JobDetailResp withProgressInfo(Consumer<JobProgressInfo> progressInfoSetter) {
        if (this.progressInfo == null) {
            this.progressInfo = new JobProgressInfo();
            progressInfoSetter.accept(this.progressInfo);
        }

        return this;
    }

    /**
     * Get progressInfo
     * @return progressInfo
     */
    public JobProgressInfo getProgressInfo() {
        return progressInfo;
    }

    public void setProgressInfo(JobProgressInfo progressInfo) {
        this.progressInfo = progressInfo;
    }

    public JobDetailResp withMigrationObjectProgressInfo(QueryMigrationObjectProgressInfo migrationObjectProgressInfo) {
        this.migrationObjectProgressInfo = migrationObjectProgressInfo;
        return this;
    }

    public JobDetailResp withMigrationObjectProgressInfo(
        Consumer<QueryMigrationObjectProgressInfo> migrationObjectProgressInfoSetter) {
        if (this.migrationObjectProgressInfo == null) {
            this.migrationObjectProgressInfo = new QueryMigrationObjectProgressInfo();
            migrationObjectProgressInfoSetter.accept(this.migrationObjectProgressInfo);
        }

        return this;
    }

    /**
     * Get migrationObjectProgressInfo
     * @return migrationObjectProgressInfo
     */
    public QueryMigrationObjectProgressInfo getMigrationObjectProgressInfo() {
        return migrationObjectProgressInfo;
    }

    public void setMigrationObjectProgressInfo(QueryMigrationObjectProgressInfo migrationObjectProgressInfo) {
        this.migrationObjectProgressInfo = migrationObjectProgressInfo;
    }

    public JobDetailResp withMetrics(QueryMetricResult metrics) {
        this.metrics = metrics;
        return this;
    }

    public JobDetailResp withMetrics(Consumer<QueryMetricResult> metricsSetter) {
        if (this.metrics == null) {
            this.metrics = new QueryMetricResult();
            metricsSetter.accept(this.metrics);
        }

        return this;
    }

    /**
     * Get metrics
     * @return metrics
     */
    public QueryMetricResult getMetrics() {
        return metrics;
    }

    public void setMetrics(QueryMetricResult metrics) {
        this.metrics = metrics;
    }

    public JobDetailResp withCompareResult(CompareResultInfo compareResult) {
        this.compareResult = compareResult;
        return this;
    }

    public JobDetailResp withCompareResult(Consumer<CompareResultInfo> compareResultSetter) {
        if (this.compareResult == null) {
            this.compareResult = new CompareResultInfo();
            compareResultSetter.accept(this.compareResult);
        }

        return this;
    }

    /**
     * Get compareResult
     * @return compareResult
     */
    public CompareResultInfo getCompareResult() {
        return compareResult;
    }

    public void setCompareResult(CompareResultInfo compareResult) {
        this.compareResult = compareResult;
    }

    public JobDetailResp withSupportImportFileResp(SupportImportFileResult supportImportFileResp) {
        this.supportImportFileResp = supportImportFileResp;
        return this;
    }

    public JobDetailResp withSupportImportFileResp(Consumer<SupportImportFileResult> supportImportFileRespSetter) {
        if (this.supportImportFileResp == null) {
            this.supportImportFileResp = new SupportImportFileResult();
            supportImportFileRespSetter.accept(this.supportImportFileResp);
        }

        return this;
    }

    /**
     * Get supportImportFileResp
     * @return supportImportFileResp
     */
    public SupportImportFileResult getSupportImportFileResp() {
        return supportImportFileResp;
    }

    public void setSupportImportFileResp(SupportImportFileResult supportImportFileResp) {
        this.supportImportFileResp = supportImportFileResp;
    }

    public JobDetailResp withInstanceFeatures(Map<String, String> instanceFeatures) {
        this.instanceFeatures = instanceFeatures;
        return this;
    }

    public JobDetailResp putInstanceFeaturesItem(String key, String instanceFeaturesItem) {
        if (this.instanceFeatures == null) {
            this.instanceFeatures = new HashMap<>();
        }
        this.instanceFeatures.put(key, instanceFeaturesItem);
        return this;
    }

    public JobDetailResp withInstanceFeatures(Consumer<Map<String, String>> instanceFeaturesSetter) {
        if (this.instanceFeatures == null) {
            this.instanceFeatures = new HashMap<>();
        }
        instanceFeaturesSetter.accept(this.instanceFeatures);
        return this;
    }

    /**
     * 由开关和版本共同控制的任务级别的功能列表。
     * @return instanceFeatures
     */
    public Map<String, String> getInstanceFeatures() {
        return instanceFeatures;
    }

    public void setInstanceFeatures(Map<String, String> instanceFeatures) {
        this.instanceFeatures = instanceFeatures;
    }

    public JobDetailResp withTaskVersion(String taskVersion) {
        this.taskVersion = taskVersion;
        return this;
    }

    /**
     * 任务版本。
     * @return taskVersion
     */
    public String getTaskVersion() {
        return taskVersion;
    }

    public void setTaskVersion(String taskVersion) {
        this.taskVersion = taskVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        JobDetailResp that = (JobDetailResp) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.status, that.status)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.totalCount, that.totalCount)
            && Objects.equals(this.masterJobId, that.masterJobId) && Objects.equals(this.baseInfo, that.baseInfo)
            && Objects.equals(this.sourceEndpoint, that.sourceEndpoint)
            && Objects.equals(this.targetEndpoint, that.targetEndpoint)
            && Objects.equals(this.alarmNotify, that.alarmNotify) && Objects.equals(this.speedLimit, that.speedLimit)
            && Objects.equals(this.userMigration, that.userMigration)
            && Objects.equals(this.policyConfig, that.policyConfig) && Objects.equals(this.dbParam, that.dbParam)
            && Objects.equals(this.tuningParams, that.tuningParams)
            && Objects.equals(this.periodOrder, that.periodOrder) && Objects.equals(this.nodeInfo, that.nodeInfo)
            && Objects.equals(this.logs, that.logs) && Objects.equals(this.networkResults, that.networkResults)
            && Objects.equals(this.precheckResult, that.precheckResult)
            && Objects.equals(this.progressInfo, that.progressInfo)
            && Objects.equals(this.migrationObjectProgressInfo, that.migrationObjectProgressInfo)
            && Objects.equals(this.metrics, that.metrics) && Objects.equals(this.compareResult, that.compareResult)
            && Objects.equals(this.supportImportFileResp, that.supportImportFileResp)
            && Objects.equals(this.instanceFeatures, that.instanceFeatures)
            && Objects.equals(this.taskVersion, that.taskVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            status,
            createTime,
            totalCount,
            masterJobId,
            baseInfo,
            sourceEndpoint,
            targetEndpoint,
            alarmNotify,
            speedLimit,
            userMigration,
            policyConfig,
            dbParam,
            tuningParams,
            periodOrder,
            nodeInfo,
            logs,
            networkResults,
            precheckResult,
            progressInfo,
            migrationObjectProgressInfo,
            metrics,
            compareResult,
            supportImportFileResp,
            instanceFeatures,
            taskVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobDetailResp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    masterJobId: ").append(toIndentedString(masterJobId)).append("\n");
        sb.append("    baseInfo: ").append(toIndentedString(baseInfo)).append("\n");
        sb.append("    sourceEndpoint: ").append(toIndentedString(sourceEndpoint)).append("\n");
        sb.append("    targetEndpoint: ").append(toIndentedString(targetEndpoint)).append("\n");
        sb.append("    alarmNotify: ").append(toIndentedString(alarmNotify)).append("\n");
        sb.append("    speedLimit: ").append(toIndentedString(speedLimit)).append("\n");
        sb.append("    userMigration: ").append(toIndentedString(userMigration)).append("\n");
        sb.append("    policyConfig: ").append(toIndentedString(policyConfig)).append("\n");
        sb.append("    dbParam: ").append(toIndentedString(dbParam)).append("\n");
        sb.append("    tuningParams: ").append(toIndentedString(tuningParams)).append("\n");
        sb.append("    periodOrder: ").append(toIndentedString(periodOrder)).append("\n");
        sb.append("    nodeInfo: ").append(toIndentedString(nodeInfo)).append("\n");
        sb.append("    logs: ").append(toIndentedString(logs)).append("\n");
        sb.append("    networkResults: ").append(toIndentedString(networkResults)).append("\n");
        sb.append("    precheckResult: ").append(toIndentedString(precheckResult)).append("\n");
        sb.append("    progressInfo: ").append(toIndentedString(progressInfo)).append("\n");
        sb.append("    migrationObjectProgressInfo: ")
            .append(toIndentedString(migrationObjectProgressInfo))
            .append("\n");
        sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
        sb.append("    compareResult: ").append(toIndentedString(compareResult)).append("\n");
        sb.append("    supportImportFileResp: ").append(toIndentedString(supportImportFileResp)).append("\n");
        sb.append("    instanceFeatures: ").append(toIndentedString(instanceFeatures)).append("\n");
        sb.append("    taskVersion: ").append(toIndentedString(taskVersion)).append("\n");
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
