package com.huaweicloud.sdk.eihealth.v1.model;

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
public class ShowAutoJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finish_time")

    private String finishTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_id")

    private String databaseId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_column")

    private String databaseColumn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_column_type")

    private String databaseColumnType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clean_database_column")

    private Boolean cleanDatabaseColumn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "database_trigger")

    private List<DatabaseTriggerDto> databaseTrigger = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tool_info")

    private ToolInfoDto toolInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_name")

    private String jobName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_name_type")

    private String jobNameType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_description")

    private String jobDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private List<String> labels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeout")

    private Integer timeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_dir")

    private String outputDir;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_dir_type")

    private String outputDirType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_labels")

    private List<String> nodeLabels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "io_acc_id")

    private String ioAccId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tasks")

    private List<TaskDefinitionDto> tasks = null;

    public ShowAutoJobResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 自动作业ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowAutoJobResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 自动作业的名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowAutoJobResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 自动作业的描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowAutoJobResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 自动作业状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowAutoJobResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 自动作业创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ShowAutoJobResponse withFinishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }

    /**
     * 自动作业结束时间
     * @return finishTime
     */
    public String getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime;
    }

    public ShowAutoJobResponse withDatabaseId(String databaseId) {
        this.databaseId = databaseId;
        return this;
    }

    /**
     * 自动作业依赖的数据库ID
     * @return databaseId
     */
    public String getDatabaseId() {
        return databaseId;
    }

    public void setDatabaseId(String databaseId) {
        this.databaseId = databaseId;
    }

    public ShowAutoJobResponse withDatabaseColumn(String databaseColumn) {
        this.databaseColumn = databaseColumn;
        return this;
    }

    /**
     * 自动作业状态更新列
     * @return databaseColumn
     */
    public String getDatabaseColumn() {
        return databaseColumn;
    }

    public void setDatabaseColumn(String databaseColumn) {
        this.databaseColumn = databaseColumn;
    }

    public ShowAutoJobResponse withDatabaseColumnType(String databaseColumnType) {
        this.databaseColumnType = databaseColumnType;
        return this;
    }

    /**
     * 自动作业状态更新列的类型，不填默认为EXISTED
     * @return databaseColumnType
     */
    public String getDatabaseColumnType() {
        return databaseColumnType;
    }

    public void setDatabaseColumnType(String databaseColumnType) {
        this.databaseColumnType = databaseColumnType;
    }

    public ShowAutoJobResponse withCleanDatabaseColumn(Boolean cleanDatabaseColumn) {
        this.cleanDatabaseColumn = cleanDatabaseColumn;
        return this;
    }

    /**
     * 是否清空作业状态更新列
     * @return cleanDatabaseColumn
     */
    public Boolean getCleanDatabaseColumn() {
        return cleanDatabaseColumn;
    }

    public void setCleanDatabaseColumn(Boolean cleanDatabaseColumn) {
        this.cleanDatabaseColumn = cleanDatabaseColumn;
    }

    public ShowAutoJobResponse withDatabaseTrigger(List<DatabaseTriggerDto> databaseTrigger) {
        this.databaseTrigger = databaseTrigger;
        return this;
    }

    public ShowAutoJobResponse addDatabaseTriggerItem(DatabaseTriggerDto databaseTriggerItem) {
        if (this.databaseTrigger == null) {
            this.databaseTrigger = new ArrayList<>();
        }
        this.databaseTrigger.add(databaseTriggerItem);
        return this;
    }

    public ShowAutoJobResponse withDatabaseTrigger(Consumer<List<DatabaseTriggerDto>> databaseTriggerSetter) {
        if (this.databaseTrigger == null) {
            this.databaseTrigger = new ArrayList<>();
        }
        databaseTriggerSetter.accept(this.databaseTrigger);
        return this;
    }

    /**
     * 自动作业触发器
     * @return databaseTrigger
     */
    public List<DatabaseTriggerDto> getDatabaseTrigger() {
        return databaseTrigger;
    }

    public void setDatabaseTrigger(List<DatabaseTriggerDto> databaseTrigger) {
        this.databaseTrigger = databaseTrigger;
    }

    public ShowAutoJobResponse withToolInfo(ToolInfoDto toolInfo) {
        this.toolInfo = toolInfo;
        return this;
    }

    public ShowAutoJobResponse withToolInfo(Consumer<ToolInfoDto> toolInfoSetter) {
        if (this.toolInfo == null) {
            this.toolInfo = new ToolInfoDto();
            toolInfoSetter.accept(this.toolInfo);
        }

        return this;
    }

    /**
     * Get toolInfo
     * @return toolInfo
     */
    public ToolInfoDto getToolInfo() {
        return toolInfo;
    }

    public void setToolInfo(ToolInfoDto toolInfo) {
        this.toolInfo = toolInfo;
    }

    public ShowAutoJobResponse withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * 作业的名称，取值范围：[1,63]，允许大小写字母、数字、以及特殊字符中划线(-)
     * @return jobName
     */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public ShowAutoJobResponse withJobNameType(String jobNameType) {
        this.jobNameType = jobNameType;
        return this;
    }

    /**
     * 作业的名称类型
     * @return jobNameType
     */
    public String getJobNameType() {
        return jobNameType;
    }

    public void setJobNameType(String jobNameType) {
        this.jobNameType = jobNameType;
    }

    public ShowAutoJobResponse withJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
        return this;
    }

    /**
     * 作业的描述,取值范围：输入字符最大长度为255
     * @return jobDescription
     */
    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public ShowAutoJobResponse withLabels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    public ShowAutoJobResponse addLabelsItem(String labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    public ShowAutoJobResponse withLabels(Consumer<List<String>> labelsSetter) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        labelsSetter.accept(this.labels);
        return this;
    }

    /**
     * 作业标签，取值范围[0,5]，单个标签最大长度32字符，仅仅包含小写字母或数字或大写字母
     * @return labels
     */
    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public ShowAutoJobResponse withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 作业的优先级,取值范围[0,9]，0最低，默认数值0
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public ShowAutoJobResponse withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * 作业执行超时时长，取值范围: [1, 144000]，单位：分钟，默认数值1440
     * @return timeout
     */
    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public ShowAutoJobResponse withOutputDir(String outputDir) {
        this.outputDir = outputDir;
        return this;
    }

    /**
     * job结果存储目录，不指定则在workflow的工作目录下生产job同名子目录，指定则已指定路径为准;
     * @return outputDir
     */
    public String getOutputDir() {
        return outputDir;
    }

    public void setOutputDir(String outputDir) {
        this.outputDir = outputDir;
    }

    public ShowAutoJobResponse withOutputDirType(String outputDirType) {
        this.outputDirType = outputDirType;
        return this;
    }

    /**
     * 输出路径的类型
     * @return outputDirType
     */
    public String getOutputDirType() {
        return outputDirType;
    }

    public void setOutputDirType(String outputDirType) {
        this.outputDirType = outputDirType;
    }

    public ShowAutoJobResponse withNodeLabels(List<String> nodeLabels) {
        this.nodeLabels = nodeLabels;
        return this;
    }

    public ShowAutoJobResponse addNodeLabelsItem(String nodeLabelsItem) {
        if (this.nodeLabels == null) {
            this.nodeLabels = new ArrayList<>();
        }
        this.nodeLabels.add(nodeLabelsItem);
        return this;
    }

    public ShowAutoJobResponse withNodeLabels(Consumer<List<String>> nodeLabelsSetter) {
        if (this.nodeLabels == null) {
            this.nodeLabels = new ArrayList<>();
        }
        nodeLabelsSetter.accept(this.nodeLabels);
        return this;
    }

    /**
     * 节点标签 取值范围[0,1]，单个标签最大长度63字符
     * @return nodeLabels
     */
    public List<String> getNodeLabels() {
        return nodeLabels;
    }

    public void setNodeLabels(List<String> nodeLabels) {
        this.nodeLabels = nodeLabels;
    }

    public ShowAutoJobResponse withIoAccId(String ioAccId) {
        this.ioAccId = ioAccId;
        return this;
    }

    /**
     * 自动作业使用的IO加速实例id，不填表示不使用
     * @return ioAccId
     */
    public String getIoAccId() {
        return ioAccId;
    }

    public void setIoAccId(String ioAccId) {
        this.ioAccId = ioAccId;
    }

    public ShowAutoJobResponse withTasks(List<TaskDefinitionDto> tasks) {
        this.tasks = tasks;
        return this;
    }

    public ShowAutoJobResponse addTasksItem(TaskDefinitionDto tasksItem) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        this.tasks.add(tasksItem);
        return this;
    }

    public ShowAutoJobResponse withTasks(Consumer<List<TaskDefinitionDto>> tasksSetter) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        tasksSetter.accept(this.tasks);
        return this;
    }

    /**
     * 自动作业依赖的流程信息
     * @return tasks
     */
    public List<TaskDefinitionDto> getTasks() {
        return tasks;
    }

    public void setTasks(List<TaskDefinitionDto> tasks) {
        this.tasks = tasks;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAutoJobResponse that = (ShowAutoJobResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.status, that.status)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.finishTime, that.finishTime)
            && Objects.equals(this.databaseId, that.databaseId)
            && Objects.equals(this.databaseColumn, that.databaseColumn)
            && Objects.equals(this.databaseColumnType, that.databaseColumnType)
            && Objects.equals(this.cleanDatabaseColumn, that.cleanDatabaseColumn)
            && Objects.equals(this.databaseTrigger, that.databaseTrigger)
            && Objects.equals(this.toolInfo, that.toolInfo) && Objects.equals(this.jobName, that.jobName)
            && Objects.equals(this.jobNameType, that.jobNameType)
            && Objects.equals(this.jobDescription, that.jobDescription) && Objects.equals(this.labels, that.labels)
            && Objects.equals(this.priority, that.priority) && Objects.equals(this.timeout, that.timeout)
            && Objects.equals(this.outputDir, that.outputDir) && Objects.equals(this.outputDirType, that.outputDirType)
            && Objects.equals(this.nodeLabels, that.nodeLabels) && Objects.equals(this.ioAccId, that.ioAccId)
            && Objects.equals(this.tasks, that.tasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            status,
            createTime,
            finishTime,
            databaseId,
            databaseColumn,
            databaseColumnType,
            cleanDatabaseColumn,
            databaseTrigger,
            toolInfo,
            jobName,
            jobNameType,
            jobDescription,
            labels,
            priority,
            timeout,
            outputDir,
            outputDirType,
            nodeLabels,
            ioAccId,
            tasks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAutoJobResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    finishTime: ").append(toIndentedString(finishTime)).append("\n");
        sb.append("    databaseId: ").append(toIndentedString(databaseId)).append("\n");
        sb.append("    databaseColumn: ").append(toIndentedString(databaseColumn)).append("\n");
        sb.append("    databaseColumnType: ").append(toIndentedString(databaseColumnType)).append("\n");
        sb.append("    cleanDatabaseColumn: ").append(toIndentedString(cleanDatabaseColumn)).append("\n");
        sb.append("    databaseTrigger: ").append(toIndentedString(databaseTrigger)).append("\n");
        sb.append("    toolInfo: ").append(toIndentedString(toolInfo)).append("\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    jobNameType: ").append(toIndentedString(jobNameType)).append("\n");
        sb.append("    jobDescription: ").append(toIndentedString(jobDescription)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
        sb.append("    outputDir: ").append(toIndentedString(outputDir)).append("\n");
        sb.append("    outputDirType: ").append(toIndentedString(outputDirType)).append("\n");
        sb.append("    nodeLabels: ").append(toIndentedString(nodeLabels)).append("\n");
        sb.append("    ioAccId: ").append(toIndentedString(ioAccId)).append("\n");
        sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
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
