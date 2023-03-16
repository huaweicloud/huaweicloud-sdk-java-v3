package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建作业的请求体
 */
public class JobDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

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
    @JsonProperty(value = "tool_id")

    private String toolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tool_type")

    private String toolType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tasks")

    private List<JobTaskDto> tasks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "io_acc_id")

    private String ioAccId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "io_acc_expected_usage")

    private Integer ioAccExpectedUsage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_labels")

    private List<String> nodeLabels = null;

    public JobDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 作业的名称，取值范围：[1,63]，允许大小写字母、数字、以及特殊字符中划线(-)
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JobDto withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 作业的描述,取值范围：输入字符最大长度为255
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public JobDto withLabels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    public JobDto addLabelsItem(String labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    public JobDto withLabels(Consumer<List<String>> labelsSetter) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        labelsSetter.accept(this.labels);
        return this;
    }

    /**
     * 作业标签，取值范围[0,5]，单个标签最大长度32字符，支持中文、字母、数字、空格、下划线和中划线，且不能以空格开头或者结尾。
     * @return labels
     */
    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public JobDto withPriority(Integer priority) {
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

    public JobDto withTimeout(Integer timeout) {
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

    public JobDto withOutputDir(String outputDir) {
        this.outputDir = outputDir;
        return this;
    }

    /**
     * 作业结果存储目录，不指定则在workflow的工作目录下生产job同名子目录，指定则已指定路径为准;输出路径必须以斜杠（/）开头且不能以斜杠（/）结尾，不能包含两个以上相邻的斜杠（/），不能包含以下特殊字符：\\ : ; * ? < \" > | 。其中单个文件夹名称不能以中划线（-）开头，不能以英文句号（.）或斜杠（/）或空格开头或结尾
     * @return outputDir
     */
    public String getOutputDir() {
        return outputDir;
    }

    public void setOutputDir(String outputDir) {
        this.outputDir = outputDir;
    }

    public JobDto withToolId(String toolId) {
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

    public JobDto withToolType(String toolType) {
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

    public JobDto withTasks(List<JobTaskDto> tasks) {
        this.tasks = tasks;
        return this;
    }

    public JobDto addTasksItem(JobTaskDto tasksItem) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        this.tasks.add(tasksItem);
        return this;
    }

    public JobDto withTasks(Consumer<List<JobTaskDto>> tasksSetter) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        tasksSetter.accept(this.tasks);
        return this;
    }

    /**
     * 基于替换规则压扁后，job实际的运行信息
     * @return tasks
     */
    public List<JobTaskDto> getTasks() {
        return tasks;
    }

    public void setTasks(List<JobTaskDto> tasks) {
        this.tasks = tasks;
    }

    public JobDto withIoAccId(String ioAccId) {
        this.ioAccId = ioAccId;
        return this;
    }

    /**
     * 作业使用的IO加速实例id，不填表示不使用
     * @return ioAccId
     */
    public String getIoAccId() {
        return ioAccId;
    }

    public void setIoAccId(String ioAccId) {
        this.ioAccId = ioAccId;
    }

    public JobDto withIoAccExpectedUsage(Integer ioAccExpectedUsage) {
        this.ioAccExpectedUsage = ioAccExpectedUsage;
        return this;
    }

    /**
     * 作业使用的SFS-Turbo实例预期占用存储量，单位G，用于投递作业时评估当前加速实例余量是否充足
     * minimum: 0
     * maximum: 327680
     * @return ioAccExpectedUsage
     */
    public Integer getIoAccExpectedUsage() {
        return ioAccExpectedUsage;
    }

    public void setIoAccExpectedUsage(Integer ioAccExpectedUsage) {
        this.ioAccExpectedUsage = ioAccExpectedUsage;
    }

    public JobDto withNodeLabels(List<String> nodeLabels) {
        this.nodeLabels = nodeLabels;
        return this;
    }

    public JobDto addNodeLabelsItem(String nodeLabelsItem) {
        if (this.nodeLabels == null) {
            this.nodeLabels = new ArrayList<>();
        }
        this.nodeLabels.add(nodeLabelsItem);
        return this;
    }

    public JobDto withNodeLabels(Consumer<List<String>> nodeLabelsSetter) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JobDto jobDto = (JobDto) o;
        return Objects.equals(this.name, jobDto.name) && Objects.equals(this.description, jobDto.description)
            && Objects.equals(this.labels, jobDto.labels) && Objects.equals(this.priority, jobDto.priority)
            && Objects.equals(this.timeout, jobDto.timeout) && Objects.equals(this.outputDir, jobDto.outputDir)
            && Objects.equals(this.toolId, jobDto.toolId) && Objects.equals(this.toolType, jobDto.toolType)
            && Objects.equals(this.tasks, jobDto.tasks) && Objects.equals(this.ioAccId, jobDto.ioAccId)
            && Objects.equals(this.ioAccExpectedUsage, jobDto.ioAccExpectedUsage)
            && Objects.equals(this.nodeLabels, jobDto.nodeLabels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            description,
            labels,
            priority,
            timeout,
            outputDir,
            toolId,
            toolType,
            tasks,
            ioAccId,
            ioAccExpectedUsage,
            nodeLabels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobDto {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
        sb.append("    outputDir: ").append(toIndentedString(outputDir)).append("\n");
        sb.append("    toolId: ").append(toIndentedString(toolId)).append("\n");
        sb.append("    toolType: ").append(toIndentedString(toolType)).append("\n");
        sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
        sb.append("    ioAccId: ").append(toIndentedString(ioAccId)).append("\n");
        sb.append("    ioAccExpectedUsage: ").append(toIndentedString(ioAccExpectedUsage)).append("\n");
        sb.append("    nodeLabels: ").append(toIndentedString(nodeLabels)).append("\n");
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
