package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_type")

    private String jobType;

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
     * 作业ID。
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
     * 作业名称。长度限制：0-57个字符。
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
     * 作业描述。长度限制：0-2048个字符。
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
     * 用户名，当“show_detail”为“false”时独有。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public FlinkJob withJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }

    /**
     * 作业类型。
     * @return jobType
     */
    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public FlinkJob withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 作业状态。
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
     * 作业状态描述。
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
     * 作业创建时间。
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
     * 作业开始时间。
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
     * 作业运行时长, 单位ms，当“show_detail”为“false”时独有。
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
     * 父作业ID，“show_detail”为“false”时独有。
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
     * 作业所属用户标识，“show_detail”为“true”时独有。
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
     * 作业所属项目标识，“show_detail”为“true”时独有。
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
     * Stream SQL语句，“show_detail”为“false”时独有。
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
     * 作业运行模式： shared_cluster：共享。 exclusive_cluster：独享。 edge_node：边缘节点。 show_detail为true时独有.
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
     * jar包主类，“show_detail”为“false”时独有。
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
     * jar包作业运行参数，多个参数之间用空格分隔。show_detail为true时独有的。
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
     * 作业执行计划，“show_detail”为“false”时独有。
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
     * 作业更新时间，“show_detail”为“false”时独有。
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
     * 作业的流图是否可编辑。“true”表示作业的流图可以编辑，“false”表示作业的流图不可以编辑。
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
     * 作业是否有保存点。“true”表示作业有保存点，“false”表示作业没有保存点。
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
     * 队列名字。
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
     * 边缘计算组ID列表。
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
     * 重启次数。
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
     * 保存点路径。
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
