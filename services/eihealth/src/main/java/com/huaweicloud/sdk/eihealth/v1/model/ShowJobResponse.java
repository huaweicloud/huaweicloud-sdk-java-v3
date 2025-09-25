package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowJobResponse extends SdkResponse {

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
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finish_time")

    private String finishTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_message")

    private String failedMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_reason")

    private String failedReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tool_info")

    private ToolInfoDto toolInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tasks")

    private List<TaskDefinitionDto> tasks = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_runtime_info")

    private List<TaskRuntimeDto> taskRuntimeInfo = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dag")

    private Map<String, Map<String, String>> dag = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "io_acc_expected_usage")

    private Integer ioAccExpectedUsage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "io_acc_info")

    private IoAccInfoDto ioAccInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_labels")

    private List<String> nodeLabels = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "still_running_tasks")

    private List<String> stillRunningTasks = null;

    public ShowJobResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 作业id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowJobResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 作业的名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowJobResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 作业的描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowJobResponse withLabels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    public ShowJobResponse addLabelsItem(String labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    public ShowJobResponse withLabels(Consumer<List<String>> labelsSetter) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        labelsSetter.accept(this.labels);
        return this;
    }

    /**
     * 作业标签
     * @return labels
     */
    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public ShowJobResponse withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 作业的优先级
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public ShowJobResponse withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * 作业执行超时时长
     * @return timeout
     */
    public Integer getTimeout() {
        return timeout;
    }

    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    public ShowJobResponse withOutputDir(String outputDir) {
        this.outputDir = outputDir;
        return this;
    }

    /**
     * 压扁后的效果，即job运行的实际配置
     * @return outputDir
     */
    public String getOutputDir() {
        return outputDir;
    }

    public void setOutputDir(String outputDir) {
        this.outputDir = outputDir;
    }

    public ShowJobResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 作业运行状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowJobResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 作业创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ShowJobResponse withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释**： 作业开始时间。 **约束限制**： 不涉及 **取值范围**： 不涉及 **默认取值**： 不涉及 
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ShowJobResponse withFinishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }

    /**
     * 作业完成时间
     * @return finishTime
     */
    public String getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime;
    }

    public ShowJobResponse withFailedMessage(String failedMessage) {
        this.failedMessage = failedMessage;
        return this;
    }

    /**
     * 作业运行失败描述信息，当作业执行失败时会返回
     * @return failedMessage
     */
    public String getFailedMessage() {
        return failedMessage;
    }

    public void setFailedMessage(String failedMessage) {
        this.failedMessage = failedMessage;
    }

    public ShowJobResponse withFailedReason(String failedReason) {
        this.failedReason = failedReason;
        return this;
    }

    /**
     * 作业运行失败原因，当作业执行失败时会返回
     * @return failedReason
     */
    public String getFailedReason() {
        return failedReason;
    }

    public void setFailedReason(String failedReason) {
        this.failedReason = failedReason;
    }

    public ShowJobResponse withToolInfo(ToolInfoDto toolInfo) {
        this.toolInfo = toolInfo;
        return this;
    }

    public ShowJobResponse withToolInfo(Consumer<ToolInfoDto> toolInfoSetter) {
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

    public ShowJobResponse withTasks(List<TaskDefinitionDto> tasks) {
        this.tasks = tasks;
        return this;
    }

    public ShowJobResponse addTasksItem(TaskDefinitionDto tasksItem) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        this.tasks.add(tasksItem);
        return this;
    }

    public ShowJobResponse withTasks(Consumer<List<TaskDefinitionDto>> tasksSetter) {
        if (this.tasks == null) {
            this.tasks = new ArrayList<>();
        }
        tasksSetter.accept(this.tasks);
        return this;
    }

    /**
     * 基于替换规则压扁后的效果，即job运行的实际配置
     * @return tasks
     */
    public List<TaskDefinitionDto> getTasks() {
        return tasks;
    }

    public void setTasks(List<TaskDefinitionDto> tasks) {
        this.tasks = tasks;
    }

    public ShowJobResponse withTaskRuntimeInfo(List<TaskRuntimeDto> taskRuntimeInfo) {
        this.taskRuntimeInfo = taskRuntimeInfo;
        return this;
    }

    public ShowJobResponse addTaskRuntimeInfoItem(TaskRuntimeDto taskRuntimeInfoItem) {
        if (this.taskRuntimeInfo == null) {
            this.taskRuntimeInfo = new ArrayList<>();
        }
        this.taskRuntimeInfo.add(taskRuntimeInfoItem);
        return this;
    }

    public ShowJobResponse withTaskRuntimeInfo(Consumer<List<TaskRuntimeDto>> taskRuntimeInfoSetter) {
        if (this.taskRuntimeInfo == null) {
            this.taskRuntimeInfo = new ArrayList<>();
        }
        taskRuntimeInfoSetter.accept(this.taskRuntimeInfo);
        return this;
    }

    /**
     * 作业子步骤的运行信息
     * @return taskRuntimeInfo
     */
    public List<TaskRuntimeDto> getTaskRuntimeInfo() {
        return taskRuntimeInfo;
    }

    public void setTaskRuntimeInfo(List<TaskRuntimeDto> taskRuntimeInfo) {
        this.taskRuntimeInfo = taskRuntimeInfo;
    }

    public ShowJobResponse withDag(Map<String, Map<String, String>> dag) {
        this.dag = dag;
        return this;
    }

    public ShowJobResponse putDagItem(String key, Map<String, String> dagItem) {
        if (this.dag == null) {
            this.dag = new HashMap<>();
        }
        this.dag.put(key, dagItem);
        return this;
    }

    public ShowJobResponse withDag(Consumer<Map<String, Map<String, String>>> dagSetter) {
        if (this.dag == null) {
            this.dag = new HashMap<>();
        }
        dagSetter.accept(this.dag);
        return this;
    }

    /**
     * 作业子步骤的依赖关系
     * @return dag
     */
    public Map<String, Map<String, String>> getDag() {
        return dag;
    }

    public void setDag(Map<String, Map<String, String>> dag) {
        this.dag = dag;
    }

    public ShowJobResponse withIoAccExpectedUsage(Integer ioAccExpectedUsage) {
        this.ioAccExpectedUsage = ioAccExpectedUsage;
        return this;
    }

    /**
     * 作业使用的SFS-Turbo实例预期占用存储量，单位G，用于投递作业时评估当前加速实例余量是否充足
     * @return ioAccExpectedUsage
     */
    public Integer getIoAccExpectedUsage() {
        return ioAccExpectedUsage;
    }

    public void setIoAccExpectedUsage(Integer ioAccExpectedUsage) {
        this.ioAccExpectedUsage = ioAccExpectedUsage;
    }

    public ShowJobResponse withIoAccInfo(IoAccInfoDto ioAccInfo) {
        this.ioAccInfo = ioAccInfo;
        return this;
    }

    public ShowJobResponse withIoAccInfo(Consumer<IoAccInfoDto> ioAccInfoSetter) {
        if (this.ioAccInfo == null) {
            this.ioAccInfo = new IoAccInfoDto();
            ioAccInfoSetter.accept(this.ioAccInfo);
        }

        return this;
    }

    /**
     * Get ioAccInfo
     * @return ioAccInfo
     */
    public IoAccInfoDto getIoAccInfo() {
        return ioAccInfo;
    }

    public void setIoAccInfo(IoAccInfoDto ioAccInfo) {
        this.ioAccInfo = ioAccInfo;
    }

    public ShowJobResponse withNodeLabels(List<String> nodeLabels) {
        this.nodeLabels = nodeLabels;
        return this;
    }

    public ShowJobResponse addNodeLabelsItem(String nodeLabelsItem) {
        if (this.nodeLabels == null) {
            this.nodeLabels = new ArrayList<>();
        }
        this.nodeLabels.add(nodeLabelsItem);
        return this;
    }

    public ShowJobResponse withNodeLabels(Consumer<List<String>> nodeLabelsSetter) {
        if (this.nodeLabels == null) {
            this.nodeLabels = new ArrayList<>();
        }
        nodeLabelsSetter.accept(this.nodeLabels);
        return this;
    }

    /**
     * 计算节点标签
     * @return nodeLabels
     */
    public List<String> getNodeLabels() {
        return nodeLabels;
    }

    public void setNodeLabels(List<String> nodeLabels) {
        this.nodeLabels = nodeLabels;
    }

    public ShowJobResponse withStillRunningTasks(List<String> stillRunningTasks) {
        this.stillRunningTasks = stillRunningTasks;
        return this;
    }

    public ShowJobResponse addStillRunningTasksItem(String stillRunningTasksItem) {
        if (this.stillRunningTasks == null) {
            this.stillRunningTasks = new ArrayList<>();
        }
        this.stillRunningTasks.add(stillRunningTasksItem);
        return this;
    }

    public ShowJobResponse withStillRunningTasks(Consumer<List<String>> stillRunningTasksSetter) {
        if (this.stillRunningTasks == null) {
            this.stillRunningTasks = new ArrayList<>();
        }
        stillRunningTasksSetter.accept(this.stillRunningTasks);
        return this;
    }

    /**
     * 仍在运行中的子任务
     * @return stillRunningTasks
     */
    public List<String> getStillRunningTasks() {
        return stillRunningTasks;
    }

    public void setStillRunningTasks(List<String> stillRunningTasks) {
        this.stillRunningTasks = stillRunningTasks;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowJobResponse that = (ShowJobResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.labels, that.labels)
            && Objects.equals(this.priority, that.priority) && Objects.equals(this.timeout, that.timeout)
            && Objects.equals(this.outputDir, that.outputDir) && Objects.equals(this.status, that.status)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.finishTime, that.finishTime)
            && Objects.equals(this.failedMessage, that.failedMessage)
            && Objects.equals(this.failedReason, that.failedReason) && Objects.equals(this.toolInfo, that.toolInfo)
            && Objects.equals(this.tasks, that.tasks) && Objects.equals(this.taskRuntimeInfo, that.taskRuntimeInfo)
            && Objects.equals(this.dag, that.dag) && Objects.equals(this.ioAccExpectedUsage, that.ioAccExpectedUsage)
            && Objects.equals(this.ioAccInfo, that.ioAccInfo) && Objects.equals(this.nodeLabels, that.nodeLabels)
            && Objects.equals(this.stillRunningTasks, that.stillRunningTasks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            labels,
            priority,
            timeout,
            outputDir,
            status,
            createTime,
            startTime,
            finishTime,
            failedMessage,
            failedReason,
            toolInfo,
            tasks,
            taskRuntimeInfo,
            dag,
            ioAccExpectedUsage,
            ioAccInfo,
            nodeLabels,
            stillRunningTasks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowJobResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
        sb.append("    outputDir: ").append(toIndentedString(outputDir)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    finishTime: ").append(toIndentedString(finishTime)).append("\n");
        sb.append("    failedMessage: ").append(toIndentedString(failedMessage)).append("\n");
        sb.append("    failedReason: ").append(toIndentedString(failedReason)).append("\n");
        sb.append("    toolInfo: ").append(toIndentedString(toolInfo)).append("\n");
        sb.append("    tasks: ").append(toIndentedString(tasks)).append("\n");
        sb.append("    taskRuntimeInfo: ").append(toIndentedString(taskRuntimeInfo)).append("\n");
        sb.append("    dag: ").append(toIndentedString(dag)).append("\n");
        sb.append("    ioAccExpectedUsage: ").append(toIndentedString(ioAccExpectedUsage)).append("\n");
        sb.append("    ioAccInfo: ").append(toIndentedString(ioAccInfo)).append("\n");
        sb.append("    nodeLabels: ").append(toIndentedString(nodeLabels)).append("\n");
        sb.append("    stillRunningTasks: ").append(toIndentedString(stillRunningTasks)).append("\n");
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
