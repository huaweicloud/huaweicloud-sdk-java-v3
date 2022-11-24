package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreateAutJobReq
 */
public class CreateAutJobReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

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
    @JsonProperty(value = "tool_id")

    private String toolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tool_type")

    private String toolType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_name")

    private String jobName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_name_type")

    private JobNameType jobNameType;

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

    private List<JobTaskDto> tasks = null;

    public CreateAutJobReq withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 自动作业的名称，取值范围：[1,63]，允许大小写字母、数字、以及特殊字符中划线(-)
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateAutJobReq withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 自动作业的描述,取值范围：输入字符最大长度为255
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateAutJobReq withDatabaseId(String databaseId) {
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

    public CreateAutJobReq withDatabaseColumn(String databaseColumn) {
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

    public CreateAutJobReq withDatabaseColumnType(String databaseColumnType) {
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

    public CreateAutJobReq withCleanDatabaseColumn(Boolean cleanDatabaseColumn) {
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

    public CreateAutJobReq withDatabaseTrigger(List<DatabaseTriggerDto> databaseTrigger) {
        this.databaseTrigger = databaseTrigger;
        return this;
    }

    public CreateAutJobReq addDatabaseTriggerItem(DatabaseTriggerDto databaseTriggerItem) {
        if (this.databaseTrigger == null) {
            this.databaseTrigger = new ArrayList<>();
        }
        this.databaseTrigger.add(databaseTriggerItem);
        return this;
    }

    public CreateAutJobReq withDatabaseTrigger(Consumer<List<DatabaseTriggerDto>> databaseTriggerSetter) {
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

    public CreateAutJobReq withToolId(String toolId) {
        this.toolId = toolId;
        return this;
    }

    /**
     * 作业依赖的组件id，组件当前仅支持流程，取值范围[1,135]，支持大小写字母和数字。目前支持两种格式，特殊id：{流程名称}::{流程版本}::{源项目名称}；正常id：流程id
     * @return toolId
     */
    public String getToolId() {
        return toolId;
    }

    public void setToolId(String toolId) {
        this.toolId = toolId;
    }

    public CreateAutJobReq withToolType(String toolType) {
        this.toolType = toolType;
        return this;
    }

    /**
     * 作业依赖的组件类型，仅支持填写workflow
     * @return toolType
     */
    public String getToolType() {
        return toolType;
    }

    public void setToolType(String toolType) {
        this.toolType = toolType;
    }

    public CreateAutJobReq withJobName(String jobName) {
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

    public CreateAutJobReq withJobNameType(JobNameType jobNameType) {
        this.jobNameType = jobNameType;
        return this;
    }

    /**
     * Get jobNameType
     * @return jobNameType
     */
    public JobNameType getJobNameType() {
        return jobNameType;
    }

    public void setJobNameType(JobNameType jobNameType) {
        this.jobNameType = jobNameType;
    }

    public CreateAutJobReq withJobDescription(String jobDescription) {
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

    public CreateAutJobReq withLabels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    public CreateAutJobReq addLabelsItem(String labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    public CreateAutJobReq withLabels(Consumer<List<String>> labelsSetter) {
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

    public CreateAutJobReq withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 作业的优先级,取值范围[0,9]，0最低，默认数值0
     * minimum: 0
     * maximum: 9
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public CreateAutJobReq withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * 作业执行超时时长，取值范围: [1, 144000]，单位：分钟，默认数值1440
     * minimum: 1
     * maximum: 144000
     * @return timeout
     */
    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public CreateAutJobReq withOutputDir(String outputDir) {
        this.outputDir = outputDir;
        return this;
    }

    /**
     * job结果存储目录，不指定则在workflow的工作目录下生产job同名子目录，指定则已指定路径为准;不能包含以下特殊字符\\:*?<\">|。
     * @return outputDir
     */
    public String getOutputDir() {
        return outputDir;
    }

    public void setOutputDir(String outputDir) {
        this.outputDir = outputDir;
    }

    public CreateAutJobReq withOutputDirType(String outputDirType) {
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

    public CreateAutJobReq withNodeLabels(List<String> nodeLabels) {
        this.nodeLabels = nodeLabels;
        return this;
    }

    public CreateAutJobReq addNodeLabelsItem(String nodeLabelsItem) {
        if (this.nodeLabels == null) {
            this.nodeLabels = new ArrayList<>();
        }
        this.nodeLabels.add(nodeLabelsItem);
        return this;
    }

    public CreateAutJobReq withNodeLabels(Consumer<List<String>> nodeLabelsSetter) {
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

    public CreateAutJobReq withIoAccId(String ioAccId) {
        this.ioAccId = ioAccId;
        return this;
    }

    /**
     * 自动作业使用的SFS-Turbo实例id，不填表示不使用
     * @return ioAccId
     */
    public String getIoAccId() {
        return ioAccId;
    }

    public void setIoAccId(String ioAccId) {
        this.ioAccId = ioAccId;
    }

    public CreateAutJobReq withTasks(List<JobTaskDto> tasks) {
        this.tasks = tasks;
        return this;
    }

    public CreateAutJobReq addTasksItem(JobTaskDto tasksItem) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        this.tasks.add(tasksItem);
        return this;
    }

    public CreateAutJobReq withTasks(Consumer<List<JobTaskDto>> tasksSetter) {
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
    public List<JobTaskDto> getTasks() {
        return tasks;
    }

    public void setTasks(List<JobTaskDto> tasks) {
        this.tasks = tasks;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateAutJobReq createAutJobReq = (CreateAutJobReq) o;
        return Objects.equals(this.name, createAutJobReq.name)
            && Objects.equals(this.description, createAutJobReq.description)
            && Objects.equals(this.databaseId, createAutJobReq.databaseId)
            && Objects.equals(this.databaseColumn, createAutJobReq.databaseColumn)
            && Objects.equals(this.databaseColumnType, createAutJobReq.databaseColumnType)
            && Objects.equals(this.cleanDatabaseColumn, createAutJobReq.cleanDatabaseColumn)
            && Objects.equals(this.databaseTrigger, createAutJobReq.databaseTrigger)
            && Objects.equals(this.toolId, createAutJobReq.toolId)
            && Objects.equals(this.toolType, createAutJobReq.toolType)
            && Objects.equals(this.jobName, createAutJobReq.jobName)
            && Objects.equals(this.jobNameType, createAutJobReq.jobNameType)
            && Objects.equals(this.jobDescription, createAutJobReq.jobDescription)
            && Objects.equals(this.labels, createAutJobReq.labels)
            && Objects.equals(this.priority, createAutJobReq.priority)
            && Objects.equals(this.timeout, createAutJobReq.timeout)
            && Objects.equals(this.outputDir, createAutJobReq.outputDir)
            && Objects.equals(this.outputDirType, createAutJobReq.outputDirType)
            && Objects.equals(this.nodeLabels, createAutJobReq.nodeLabels)
            && Objects.equals(this.ioAccId, createAutJobReq.ioAccId)
            && Objects.equals(this.tasks, createAutJobReq.tasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            description,
            databaseId,
            databaseColumn,
            databaseColumnType,
            cleanDatabaseColumn,
            databaseTrigger,
            toolId,
            toolType,
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
        sb.append("class CreateAutJobReq {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    databaseId: ").append(toIndentedString(databaseId)).append("\n");
        sb.append("    databaseColumn: ").append(toIndentedString(databaseColumn)).append("\n");
        sb.append("    databaseColumnType: ").append(toIndentedString(databaseColumnType)).append("\n");
        sb.append("    cleanDatabaseColumn: ").append(toIndentedString(cleanDatabaseColumn)).append("\n");
        sb.append("    databaseTrigger: ").append(toIndentedString(databaseTrigger)).append("\n");
        sb.append("    toolId: ").append(toIndentedString(toolId)).append("\n");
        sb.append("    toolType: ").append(toIndentedString(toolType)).append("\n");
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
