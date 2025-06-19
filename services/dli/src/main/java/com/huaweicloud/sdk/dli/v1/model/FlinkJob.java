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
 * 作业列表信息。
 */
public class FlinkJob {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private Long jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desc")

    private String desc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    /**
     * 参数解释:  作业类型 示例: flink_jar_job 约束限制:  无 取值范围: flink_sql_job（flink sql作业） flink_opensource_sql_job（flink opensource sql作业） flink_sql_edge_job（flink sql边缘作业） flink_jar_job（flink自定义作业） 默认取值: 无
     */
    public static final class JobTypeEnum {

        /**
         * Enum FLINK_SQL_JOB for value: "flink_sql_job"
         */
        public static final JobTypeEnum FLINK_SQL_JOB = new JobTypeEnum("flink_sql_job");

        /**
         * Enum FLINK_OPENSOURCE_SQL_JOB for value: "flink_opensource_sql_job"
         */
        public static final JobTypeEnum FLINK_OPENSOURCE_SQL_JOB = new JobTypeEnum("flink_opensource_sql_job");

        /**
         * Enum FLINK_SQL_EDGE_JOB for value: "flink_sql_edge_job"
         */
        public static final JobTypeEnum FLINK_SQL_EDGE_JOB = new JobTypeEnum("flink_sql_edge_job");

        /**
         * Enum FLINK_JAR_JOB for value: "flink_jar_job"
         */
        public static final JobTypeEnum FLINK_JAR_JOB = new JobTypeEnum("flink_jar_job");

        private static final Map<String, JobTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, JobTypeEnum> createStaticFields() {
            Map<String, JobTypeEnum> map = new HashMap<>();
            map.put("flink_sql_job", FLINK_SQL_JOB);
            map.put("flink_opensource_sql_job", FLINK_OPENSOURCE_SQL_JOB);
            map.put("flink_sql_edge_job", FLINK_SQL_EDGE_JOB);
            map.put("flink_jar_job", FLINK_JAR_JOB);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        JobTypeEnum(String value) {
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
        public static JobTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new JobTypeEnum(value));
        }

        public static JobTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof JobTypeEnum) {
                return this.value.equals(((JobTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_type")

    private JobTypeEnum jobType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_desc")

    private String statusDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Long duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "root_id")

    private Long rootId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_body")

    private String sqlBody;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "run_mode")

    private String runMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "main_class")

    private String mainClass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entrypoint_args")

    private String entrypointArgs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_graph")

    private String executionGraph;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "graph_editor_enabled")

    private Boolean graphEditorEnabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_savepoint")

    private Boolean hasSavepoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_name")

    private String queueName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "edge_group_ids")

    private List<String> edgeGroupIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restart_times")

    private Long restartTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "savepoint_path")

    private String savepointPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_config")

    private FlinkJobConfig jobConfig;

    public FlinkJob withJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 参数解释:  作业ID 示例: 50320 约束限制:  无 取值范围: 无 默认取值: 无
     * @return jobId
     */
    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public FlinkJob withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 参数解释:  作业名称 示例: test 约束限制:  长度在[0,57]范围内的字符串 取值范围: 无 默认取值: 无
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FlinkJob withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * 参数解释:  作业描述 示例: 作业描述 约束限制:  长度在[0,2048]范围内的字符串 取值范围: 无 默认取值: 无
     * @return desc
     */
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public FlinkJob withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 参数解释:  用户名称 示例: testuser 约束限制:  长度在[1,128]范围内的字符串 取值范围: 无 默认取值: 无
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public FlinkJob withJobType(JobTypeEnum jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * 参数解释:  作业类型 示例: flink_jar_job 约束限制:  无 取值范围: flink_sql_job（flink sql作业） flink_opensource_sql_job（flink opensource sql作业） flink_sql_edge_job（flink sql边缘作业） flink_jar_job（flink自定义作业） 默认取值: 无
     * @return jobType
     */
    public JobTypeEnum getJobType() {
        return jobType;
    }

    public void setJobType(JobTypeEnum jobType) {
        this.jobType = jobType;
    }

    public FlinkJob withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 参数解释:  作业状态 示例: job_running 约束限制:  无 取值范围: job_init（草稿） job_submitting（提交中） job_submit_fail（提交失败） job_running（运行中） job_running_exception（运行异常） job_downloading（下载中） job_idle（空闲） job_canceling（停止中） job_cancel_success（已停止） job_cancel_fail（停止失败） job_savepointing（保存点创建中） job_arrearage_stopped（因欠费被停止） job_arrearage_recovering（欠费作业恢复中） job_finish（已完成） 默认取值: 无
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public FlinkJob withStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
        return this;
    }

    /**
     * 参数解释:  用户名称 示例: 作业状态描述 约束限制:  无 取值范围: 无 默认取值: 无
     * @return statusDesc
     */
    public String getStatusDesc() {
        return statusDesc;
    }

    public void setStatusDesc(String statusDesc) {
        this.statusDesc = statusDesc;
    }

    public FlinkJob withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 参数解释:  作业创建时间 示例: 1516952770835 约束限制:  无 取值范围: 大于等于0的整数 默认取值: 无
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public FlinkJob withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 参数解释:  作业开始时间 示例: 1516952710740 约束限制:  无 取值范围: 大于等于0的整数 默认取值: 无
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public FlinkJob withDuration(Long duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 参数解释:  作业运行时长，单位ms，当“show_detail”为“false”时独有 示例: 30000 约束限制:  无 取值范围: 大于等于0的整数 默认取值: 无
     * @return duration
     */
    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public FlinkJob withRootId(Long rootId) {
        this.rootId = rootId;
        return this;
    }

    /**
     * 参数解释:  父作业ID，“show_detail”为“false”时独有 示例: -1 约束限制:  无 取值范围: 无 默认取值: 无
     * @return rootId
     */
    public Long getRootId() {
        return rootId;
    }

    public void setRootId(Long rootId) {
        this.rootId = rootId;
    }

    public FlinkJob withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 参数解释:  作业所属用户标识，“show_detail”为“true”时独有 示例: ac4eaa303639409c8ab099d55eb1538e 约束限制:  无 取值范围: 无 默认取值: 无
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public FlinkJob withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 参数解释:  作业所属用户标识，“show_detail”为“true”时独有 示例: 48cc2c48765f481480c7db940d6409d1 约束限制:  无 取值范围: 无 默认取值: 无
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public FlinkJob withSqlBody(String sqlBody) {
        this.sqlBody = sqlBody;
        return this;
    }

    /**
     * 参数解释:  Stream SQL语句，“show_detail”为“false”时独有 示例: select * from source_table 约束限制:  无 取值范围: 无 默认取值: 无
     * @return sqlBody
     */
    public String getSqlBody() {
        return sqlBody;
    }

    public void setSqlBody(String sqlBody) {
        this.sqlBody = sqlBody;
    }

    public FlinkJob withRunMode(String runMode) {
        this.runMode = runMode;
        return this;
    }

    /**
     * 参数解释:  作业运行模式，show_detail为true时独有 示例: shared_cluster 约束限制:  无 取值范围: shared_cluster（共享） exclusive_cluster（独享） edge_node（边缘节点） 默认取值: 无
     * @return runMode
     */
    public String getRunMode() {
        return runMode;
    }

    public void setRunMode(String runMode) {
        this.runMode = runMode;
    }

    public FlinkJob withMainClass(String mainClass) {
        this.mainClass = mainClass;
        return this;
    }

    /**
     * 参数解释:  jar包主类，“show_detail”为“false”时独有 示例: org.apache.spark.examples.streaming.JavaQueueStream 约束限制:  无 取值范围: 无 默认取值: 无
     * @return mainClass
     */
    public String getMainClass() {
        return mainClass;
    }

    public void setMainClass(String mainClass) {
        this.mainClass = mainClass;
    }

    public FlinkJob withEntrypointArgs(String entrypointArgs) {
        this.entrypointArgs = entrypointArgs;
        return this;
    }

    /**
     * 参数解释:  jar包作业运行参数，多个参数之间用空格分隔。show_detail为true时独有的 示例: custom.dir=/usr custom.prefix=dli 约束限制:  无 取值范围: 无 默认取值: 无
     * @return entrypointArgs
     */
    public String getEntrypointArgs() {
        return entrypointArgs;
    }

    public void setEntrypointArgs(String entrypointArgs) {
        this.entrypointArgs = entrypointArgs;
    }

    public FlinkJob withExecutionGraph(String executionGraph) {
        this.executionGraph = executionGraph;
        return this;
    }

    /**
     * 参数解释:  作业执行计划，“show_detail”为“false”时独有 约束限制:  无 取值范围: 无 默认取值: 无
     * @return executionGraph
     */
    public String getExecutionGraph() {
        return executionGraph;
    }

    public void setExecutionGraph(String executionGraph) {
        this.executionGraph = executionGraph;
    }

    public FlinkJob withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 参数解释:  作业更新时间，“show_detail”为“false”时独有 示例: 1516952770835 约束限制:  无 取值范围: 大于等于0的整数 默认取值: 无
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public FlinkJob withGraphEditorEnabled(Boolean graphEditorEnabled) {
        this.graphEditorEnabled = graphEditorEnabled;
        return this;
    }

    /**
     * 参数解释:  作业的流图是否可编辑。“true”表示作业的流图可以编辑，“false”表示作业的流图不可以编辑 示例: false 约束限制:  无 取值范围: true,false 默认取值: 无
     * @return graphEditorEnabled
     */
    public Boolean getGraphEditorEnabled() {
        return graphEditorEnabled;
    }

    public void setGraphEditorEnabled(Boolean graphEditorEnabled) {
        this.graphEditorEnabled = graphEditorEnabled;
    }

    public FlinkJob withHasSavepoint(Boolean hasSavepoint) {
        this.hasSavepoint = hasSavepoint;
        return this;
    }

    /**
     * 参数解释:  作业是否有保存点。“true”表示作业有保存点，“false”表示作业没有保存点 示例: false 约束限制:  无 取值范围: true,false 默认取值: 无
     * @return hasSavepoint
     */
    public Boolean getHasSavepoint() {
        return hasSavepoint;
    }

    public void setHasSavepoint(Boolean hasSavepoint) {
        this.hasSavepoint = hasSavepoint;
    }

    public FlinkJob withQueueName(String queueName) {
        this.queueName = queueName;
        return this;
    }

    /**
     * 参数解释:  队列名称 示例: flink_17_queue 约束限制:  无 取值范围: 无 默认取值: 无
     * @return queueName
     */
    public String getQueueName() {
        return queueName;
    }

    public void setQueueName(String queueName) {
        this.queueName = queueName;
    }

    public FlinkJob withEdgeGroupIds(List<String> edgeGroupIds) {
        this.edgeGroupIds = edgeGroupIds;
        return this;
    }

    public FlinkJob addEdgeGroupIdsItem(String edgeGroupIdsItem) {
        if (this.edgeGroupIds == null) {
            this.edgeGroupIds = new ArrayList<>();
        }
        this.edgeGroupIds.add(edgeGroupIdsItem);
        return this;
    }

    public FlinkJob withEdgeGroupIds(Consumer<List<String>> edgeGroupIdsSetter) {
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

    public FlinkJob withRestartTimes(Long restartTimes) {
        this.restartTimes = restartTimes;
        return this;
    }

    /**
     * 参数解释:  重启次数 示例: 0 约束限制:  无 取值范围: 大于等于0的整数 默认取值: 无
     * @return restartTimes
     */
    public Long getRestartTimes() {
        return restartTimes;
    }

    public void setRestartTimes(Long restartTimes) {
        this.restartTimes = restartTimes;
    }

    public FlinkJob withSavepointPath(String savepointPath) {
        this.savepointPath = savepointPath;
        return this;
    }

    /**
     * 参数解释:  保存点路径 示例: obs://cwk/savepoint/ 约束限制:  无 取值范围: 无 默认取值: 无
     * @return savepointPath
     */
    public String getSavepointPath() {
        return savepointPath;
    }

    public void setSavepointPath(String savepointPath) {
        this.savepointPath = savepointPath;
    }

    public FlinkJob withJobConfig(FlinkJobConfig jobConfig) {
        this.jobConfig = jobConfig;
        return this;
    }

    public FlinkJob withJobConfig(Consumer<FlinkJobConfig> jobConfigSetter) {
        if (this.jobConfig == null) {
            this.jobConfig = new FlinkJobConfig();
            jobConfigSetter.accept(this.jobConfig);
        }

        return this;
    }

    /**
     * Get jobConfig
     * @return jobConfig
     */
    public FlinkJobConfig getJobConfig() {
        return jobConfig;
    }

    public void setJobConfig(FlinkJobConfig jobConfig) {
        this.jobConfig = jobConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FlinkJob that = (FlinkJob) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.desc, that.desc) && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.jobType, that.jobType) && Objects.equals(this.status, that.status)
            && Objects.equals(this.statusDesc, that.statusDesc) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.duration, that.duration)
            && Objects.equals(this.rootId, that.rootId) && Objects.equals(this.userId, that.userId)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.sqlBody, that.sqlBody)
            && Objects.equals(this.runMode, that.runMode) && Objects.equals(this.mainClass, that.mainClass)
            && Objects.equals(this.entrypointArgs, that.entrypointArgs)
            && Objects.equals(this.executionGraph, that.executionGraph)
            && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.graphEditorEnabled, that.graphEditorEnabled)
            && Objects.equals(this.hasSavepoint, that.hasSavepoint) && Objects.equals(this.queueName, that.queueName)
            && Objects.equals(this.edgeGroupIds, that.edgeGroupIds)
            && Objects.equals(this.restartTimes, that.restartTimes)
            && Objects.equals(this.savepointPath, that.savepointPath) && Objects.equals(this.jobConfig, that.jobConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId,
            name,
            desc,
            userName,
            jobType,
            status,
            statusDesc,
            createTime,
            startTime,
            duration,
            rootId,
            userId,
            projectId,
            sqlBody,
            runMode,
            mainClass,
            entrypointArgs,
            executionGraph,
            updateTime,
            graphEditorEnabled,
            hasSavepoint,
            queueName,
            edgeGroupIds,
            restartTimes,
            savepointPath,
            jobConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlinkJob {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusDesc: ").append(toIndentedString(statusDesc)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    rootId: ").append(toIndentedString(rootId)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    sqlBody: ").append(toIndentedString(sqlBody)).append("\n");
        sb.append("    runMode: ").append(toIndentedString(runMode)).append("\n");
        sb.append("    mainClass: ").append(toIndentedString(mainClass)).append("\n");
        sb.append("    entrypointArgs: ").append(toIndentedString(entrypointArgs)).append("\n");
        sb.append("    executionGraph: ").append(toIndentedString(executionGraph)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    graphEditorEnabled: ").append(toIndentedString(graphEditorEnabled)).append("\n");
        sb.append("    hasSavepoint: ").append(toIndentedString(hasSavepoint)).append("\n");
        sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
        sb.append("    edgeGroupIds: ").append(toIndentedString(edgeGroupIds)).append("\n");
        sb.append("    restartTimes: ").append(toIndentedString(restartTimes)).append("\n");
        sb.append("    savepointPath: ").append(toIndentedString(savepointPath)).append("\n");
        sb.append("    jobConfig: ").append(toIndentedString(jobConfig)).append("\n");
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
