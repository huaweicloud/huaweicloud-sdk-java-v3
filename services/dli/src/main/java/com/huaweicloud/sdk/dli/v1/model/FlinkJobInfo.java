package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 作业列表信息。
 */
public class FlinkJobInfo {

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
    @JsonProperty(value = "job_config")

    private ShowStreamJobListJobConfig jobConfig;

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

    public FlinkJobInfo withJobId(Long jobId) {
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

    public FlinkJobInfo withName(String name) {
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

    public FlinkJobInfo withDesc(String desc) {
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

    public FlinkJobInfo withUserName(String userName) {
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

    public FlinkJobInfo withJobType(String jobType) {
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

    public FlinkJobInfo withStatus(String status) {
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

    public FlinkJobInfo withStatusDesc(String statusDesc) {
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

    public FlinkJobInfo withCreateTime(Long createTime) {
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

    public FlinkJobInfo withStartTime(Long startTime) {
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

    public FlinkJobInfo withDuration(Long duration) {
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

    public FlinkJobInfo withRootId(Long rootId) {
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

    public FlinkJobInfo withUserId(String userId) {
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

    public FlinkJobInfo withProjectId(String projectId) {
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

    public FlinkJobInfo withSqlBody(String sqlBody) {
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

    public FlinkJobInfo withRunMode(String runMode) {
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

    public FlinkJobInfo withJobConfig(ShowStreamJobListJobConfig jobConfig) {
        this.jobConfig = jobConfig;
        return this;
    }

    public FlinkJobInfo withJobConfig(Consumer<ShowStreamJobListJobConfig> jobConfigSetter) {
        if (this.jobConfig == null) {
            this.jobConfig = new ShowStreamJobListJobConfig();
            jobConfigSetter.accept(this.jobConfig);
        }

        return this;
    }

    /**
     * Get jobConfig
     * @return jobConfig
     */
    public ShowStreamJobListJobConfig getJobConfig() {
        return jobConfig;
    }

    public void setJobConfig(ShowStreamJobListJobConfig jobConfig) {
        this.jobConfig = jobConfig;
    }

    public FlinkJobInfo withMainClass(String mainClass) {
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

    public FlinkJobInfo withEntrypointArgs(String entrypointArgs) {
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

    public FlinkJobInfo withExecutionGraph(String executionGraph) {
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

    public FlinkJobInfo withUpdateTime(Long updateTime) {
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

    public FlinkJobInfo withGraphEditorEnabled(Boolean graphEditorEnabled) {
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

    public FlinkJobInfo withHasSavepoint(Boolean hasSavepoint) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FlinkJobInfo flinkJobInfo = (FlinkJobInfo) o;
        return Objects.equals(this.jobId, flinkJobInfo.jobId) && Objects.equals(this.name, flinkJobInfo.name)
            && Objects.equals(this.desc, flinkJobInfo.desc) && Objects.equals(this.userName, flinkJobInfo.userName)
            && Objects.equals(this.jobType, flinkJobInfo.jobType) && Objects.equals(this.status, flinkJobInfo.status)
            && Objects.equals(this.statusDesc, flinkJobInfo.statusDesc)
            && Objects.equals(this.createTime, flinkJobInfo.createTime)
            && Objects.equals(this.startTime, flinkJobInfo.startTime)
            && Objects.equals(this.duration, flinkJobInfo.duration) && Objects.equals(this.rootId, flinkJobInfo.rootId)
            && Objects.equals(this.userId, flinkJobInfo.userId)
            && Objects.equals(this.projectId, flinkJobInfo.projectId)
            && Objects.equals(this.sqlBody, flinkJobInfo.sqlBody) && Objects.equals(this.runMode, flinkJobInfo.runMode)
            && Objects.equals(this.jobConfig, flinkJobInfo.jobConfig)
            && Objects.equals(this.mainClass, flinkJobInfo.mainClass)
            && Objects.equals(this.entrypointArgs, flinkJobInfo.entrypointArgs)
            && Objects.equals(this.executionGraph, flinkJobInfo.executionGraph)
            && Objects.equals(this.updateTime, flinkJobInfo.updateTime)
            && Objects.equals(this.graphEditorEnabled, flinkJobInfo.graphEditorEnabled)
            && Objects.equals(this.hasSavepoint, flinkJobInfo.hasSavepoint);
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
            jobConfig,
            mainClass,
            entrypointArgs,
            executionGraph,
            updateTime,
            graphEditorEnabled,
            hasSavepoint);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FlinkJobInfo {\n");
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
        sb.append("    jobConfig: ").append(toIndentedString(jobConfig)).append("\n");
        sb.append("    mainClass: ").append(toIndentedString(mainClass)).append("\n");
        sb.append("    entrypointArgs: ").append(toIndentedString(entrypointArgs)).append("\n");
        sb.append("    executionGraph: ").append(toIndentedString(executionGraph)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    graphEditorEnabled: ").append(toIndentedString(graphEditorEnabled)).append("\n");
        sb.append("    hasSavepoint: ").append(toIndentedString(hasSavepoint)).append("\n");
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
