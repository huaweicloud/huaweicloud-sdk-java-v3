package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 作业详细信息。
 */
public class ShowStreamJobDetailJob {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    @JacksonXmlProperty(localName = "job_id")

    private Long jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desc")

    @JacksonXmlProperty(localName = "desc")

    private String desc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_type")

    @JacksonXmlProperty(localName = "job_type")

    private String jobType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    @JacksonXmlProperty(localName = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status_desc")

    @JacksonXmlProperty(localName = "status_desc")

    private String statusDesc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    @JacksonXmlProperty(localName = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    @JacksonXmlProperty(localName = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    @JacksonXmlProperty(localName = "user_id")

    private String userId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "queue_name")

    @JacksonXmlProperty(localName = "queue_name")

    private String queueName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    @JacksonXmlProperty(localName = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_body")

    @JacksonXmlProperty(localName = "sql_body")

    private String sqlBody;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "run_mode")

    @JacksonXmlProperty(localName = "run_mode")

    private String runMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_config")

    @JacksonXmlProperty(localName = "job_config")

    private ShowStreamJobDetailJobConfig jobConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "main_class")

    @JacksonXmlProperty(localName = "main_class")

    private String mainClass;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "entrypoint_args")

    @JacksonXmlProperty(localName = "entrypoint_args")

    private String entrypointArgs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_graph")

    @JacksonXmlProperty(localName = "execution_graph")

    private String executionGraph;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    @JacksonXmlProperty(localName = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "savepoint_path")

    @JacksonXmlProperty(localName = "savepoint_path")

    private String savepointPath;

    public ShowStreamJobDetailJob withJobId(Long jobId) {
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

    public ShowStreamJobDetailJob withName(String name) {
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

    public ShowStreamJobDetailJob withDesc(String desc) {
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

    public ShowStreamJobDetailJob withJobType(String jobType) {
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

    public ShowStreamJobDetailJob withStatus(String status) {
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

    public ShowStreamJobDetailJob withStatusDesc(String statusDesc) {
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

    public ShowStreamJobDetailJob withCreateTime(Long createTime) {
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

    public ShowStreamJobDetailJob withStartTime(Long startTime) {
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

    public ShowStreamJobDetailJob withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 作业所属用户标识。
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ShowStreamJobDetailJob withQueueName(String queueName) {
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

    public ShowStreamJobDetailJob withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 作业所属项目标识。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ShowStreamJobDetailJob withSqlBody(String sqlBody) {
        this.sqlBody = sqlBody;
        return this;
    }

    /**
     * Stream SQL语句。
     * @return sqlBody
     */
    public String getSqlBody() {
        return sqlBody;
    }

    public void setSqlBody(String sqlBody) {
        this.sqlBody = sqlBody;
    }

    public ShowStreamJobDetailJob withRunMode(String runMode) {
        this.runMode = runMode;
        return this;
    }

    /**
     * 作业运行模式： shared_cluster：共享。 exclusive_cluster：独享。 edge_node：边缘节点。
     * @return runMode
     */
    public String getRunMode() {
        return runMode;
    }

    public void setRunMode(String runMode) {
        this.runMode = runMode;
    }

    public ShowStreamJobDetailJob withJobConfig(ShowStreamJobDetailJobConfig jobConfig) {
        this.jobConfig = jobConfig;
        return this;
    }

    public ShowStreamJobDetailJob withJobConfig(Consumer<ShowStreamJobDetailJobConfig> jobConfigSetter) {
        if (this.jobConfig == null) {
            this.jobConfig = new ShowStreamJobDetailJobConfig();
            jobConfigSetter.accept(this.jobConfig);
        }

        return this;
    }

    /**
     * Get jobConfig
     * @return jobConfig
     */
    public ShowStreamJobDetailJobConfig getJobConfig() {
        return jobConfig;
    }

    public void setJobConfig(ShowStreamJobDetailJobConfig jobConfig) {
        this.jobConfig = jobConfig;
    }

    public ShowStreamJobDetailJob withMainClass(String mainClass) {
        this.mainClass = mainClass;
        return this;
    }

    /**
     * jar包主类。
     * @return mainClass
     */
    public String getMainClass() {
        return mainClass;
    }

    public void setMainClass(String mainClass) {
        this.mainClass = mainClass;
    }

    public ShowStreamJobDetailJob withEntrypointArgs(String entrypointArgs) {
        this.entrypointArgs = entrypointArgs;
        return this;
    }

    /**
     * jar包作业运行参数，多个参数之间空格分隔。
     * @return entrypointArgs
     */
    public String getEntrypointArgs() {
        return entrypointArgs;
    }

    public void setEntrypointArgs(String entrypointArgs) {
        this.entrypointArgs = entrypointArgs;
    }

    public ShowStreamJobDetailJob withExecutionGraph(String executionGraph) {
        this.executionGraph = executionGraph;
        return this;
    }

    /**
     * 作业执行计划。
     * @return executionGraph
     */
    public String getExecutionGraph() {
        return executionGraph;
    }

    public void setExecutionGraph(String executionGraph) {
        this.executionGraph = executionGraph;
    }

    public ShowStreamJobDetailJob withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 作业更新时间。
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public ShowStreamJobDetailJob withSavepointPath(String savepointPath) {
        this.savepointPath = savepointPath;
        return this;
    }

    /**
     * 手动产生的Checkpoint的保存路径。
     * @return savepointPath
     */
    public String getSavepointPath() {
        return savepointPath;
    }

    public void setSavepointPath(String savepointPath) {
        this.savepointPath = savepointPath;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowStreamJobDetailJob showStreamJobDetailJob = (ShowStreamJobDetailJob) o;
        return Objects.equals(this.jobId, showStreamJobDetailJob.jobId)
            && Objects.equals(this.name, showStreamJobDetailJob.name)
            && Objects.equals(this.desc, showStreamJobDetailJob.desc)
            && Objects.equals(this.jobType, showStreamJobDetailJob.jobType)
            && Objects.equals(this.status, showStreamJobDetailJob.status)
            && Objects.equals(this.statusDesc, showStreamJobDetailJob.statusDesc)
            && Objects.equals(this.createTime, showStreamJobDetailJob.createTime)
            && Objects.equals(this.startTime, showStreamJobDetailJob.startTime)
            && Objects.equals(this.userId, showStreamJobDetailJob.userId)
            && Objects.equals(this.queueName, showStreamJobDetailJob.queueName)
            && Objects.equals(this.projectId, showStreamJobDetailJob.projectId)
            && Objects.equals(this.sqlBody, showStreamJobDetailJob.sqlBody)
            && Objects.equals(this.runMode, showStreamJobDetailJob.runMode)
            && Objects.equals(this.jobConfig, showStreamJobDetailJob.jobConfig)
            && Objects.equals(this.mainClass, showStreamJobDetailJob.mainClass)
            && Objects.equals(this.entrypointArgs, showStreamJobDetailJob.entrypointArgs)
            && Objects.equals(this.executionGraph, showStreamJobDetailJob.executionGraph)
            && Objects.equals(this.updateTime, showStreamJobDetailJob.updateTime)
            && Objects.equals(this.savepointPath, showStreamJobDetailJob.savepointPath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId,
            name,
            desc,
            jobType,
            status,
            statusDesc,
            createTime,
            startTime,
            userId,
            queueName,
            projectId,
            sqlBody,
            runMode,
            jobConfig,
            mainClass,
            entrypointArgs,
            executionGraph,
            updateTime,
            savepointPath);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowStreamJobDetailJob {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
        sb.append("    jobType: ").append(toIndentedString(jobType)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    statusDesc: ").append(toIndentedString(statusDesc)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    queueName: ").append(toIndentedString(queueName)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    sqlBody: ").append(toIndentedString(sqlBody)).append("\n");
        sb.append("    runMode: ").append(toIndentedString(runMode)).append("\n");
        sb.append("    jobConfig: ").append(toIndentedString(jobConfig)).append("\n");
        sb.append("    mainClass: ").append(toIndentedString(mainClass)).append("\n");
        sb.append("    entrypointArgs: ").append(toIndentedString(entrypointArgs)).append("\n");
        sb.append("    executionGraph: ").append(toIndentedString(executionGraph)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    savepointPath: ").append(toIndentedString(savepointPath)).append("\n");
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
