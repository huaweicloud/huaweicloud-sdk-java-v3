package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * JobListDto
 */
public class JobListDto {

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
    @JsonProperty(value = "finish_time")

    private String finishTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_message")

    private String failedMessage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_reason")

    private String failedReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tool_info")

    private ToolInfoDto toolInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "io_acc_id")

    private String ioAccId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "io_acc_expected_usage")

    private Integer ioAccExpectedUsage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "still_running_tasks")

    private List<String> stillRunningTasks = null;

    public JobListDto withId(String id) {
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

    public JobListDto withName(String name) {
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

    public JobListDto withDescription(String description) {
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

    public JobListDto withLabels(List<String> labels) {
        this.labels = labels;
        return this;
    }

    public JobListDto addLabelsItem(String labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    public JobListDto withLabels(Consumer<List<String>> labelsSetter) {
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

    public JobListDto withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 作业优先级，[0,9]，0表示最低，默认0
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public JobListDto withTimeout(Integer timeout) {
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

    public JobListDto withOutputDir(String outputDir) {
        this.outputDir = outputDir;
        return this;
    }

    /**
     * job结果存储目录，不指定则在workflow的工作目录下生产job同名子目录，指定则已指定路径为准
     * @return outputDir
     */
    public String getOutputDir() {
        return outputDir;
    }

    public void setOutputDir(String outputDir) {
        this.outputDir = outputDir;
    }

    public JobListDto withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 作业状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public JobListDto withCreateTime(String createTime) {
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

    public JobListDto withFinishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }

    /**
     * 作业结束时间
     * @return finishTime
     */
    public String getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime;
    }

    public JobListDto withFailedMessage(String failedMessage) {
        this.failedMessage = failedMessage;
        return this;
    }

    /**
     * 失败提示，当作业执行失败时会返回
     * @return failedMessage
     */
    public String getFailedMessage() {
        return failedMessage;
    }

    public void setFailedMessage(String failedMessage) {
        this.failedMessage = failedMessage;
    }

    public JobListDto withFailedReason(String failedReason) {
        this.failedReason = failedReason;
        return this;
    }

    /**
     * 失败原因，当作业执行失败时会返回
     * @return failedReason
     */
    public String getFailedReason() {
        return failedReason;
    }

    public void setFailedReason(String failedReason) {
        this.failedReason = failedReason;
    }

    public JobListDto withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 创建任务的用户名称
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public JobListDto withToolInfo(ToolInfoDto toolInfo) {
        this.toolInfo = toolInfo;
        return this;
    }

    public JobListDto withToolInfo(Consumer<ToolInfoDto> toolInfoSetter) {
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

    public JobListDto withIoAccId(String ioAccId) {
        this.ioAccId = ioAccId;
        return this;
    }

    /**
     * 作业使用的IO加速实例id，不填表示不使用；
     * @return ioAccId
     */
    public String getIoAccId() {
        return ioAccId;
    }

    public void setIoAccId(String ioAccId) {
        this.ioAccId = ioAccId;
    }

    public JobListDto withIoAccExpectedUsage(Integer ioAccExpectedUsage) {
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

    public JobListDto withStillRunningTasks(List<String> stillRunningTasks) {
        this.stillRunningTasks = stillRunningTasks;
        return this;
    }

    public JobListDto addStillRunningTasksItem(String stillRunningTasksItem) {
        if (this.stillRunningTasks == null) {
            this.stillRunningTasks = new ArrayList<>();
        }
        this.stillRunningTasks.add(stillRunningTasksItem);
        return this;
    }

    public JobListDto withStillRunningTasks(Consumer<List<String>> stillRunningTasksSetter) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JobListDto jobListDto = (JobListDto) o;
        return Objects.equals(this.id, jobListDto.id) && Objects.equals(this.name, jobListDto.name)
            && Objects.equals(this.description, jobListDto.description)
            && Objects.equals(this.labels, jobListDto.labels) && Objects.equals(this.priority, jobListDto.priority)
            && Objects.equals(this.timeout, jobListDto.timeout) && Objects.equals(this.outputDir, jobListDto.outputDir)
            && Objects.equals(this.status, jobListDto.status) && Objects.equals(this.createTime, jobListDto.createTime)
            && Objects.equals(this.finishTime, jobListDto.finishTime)
            && Objects.equals(this.failedMessage, jobListDto.failedMessage)
            && Objects.equals(this.failedReason, jobListDto.failedReason)
            && Objects.equals(this.userName, jobListDto.userName) && Objects.equals(this.toolInfo, jobListDto.toolInfo)
            && Objects.equals(this.ioAccId, jobListDto.ioAccId)
            && Objects.equals(this.ioAccExpectedUsage, jobListDto.ioAccExpectedUsage)
            && Objects.equals(this.stillRunningTasks, jobListDto.stillRunningTasks);
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
            finishTime,
            failedMessage,
            failedReason,
            userName,
            toolInfo,
            ioAccId,
            ioAccExpectedUsage,
            stillRunningTasks);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobListDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    timeout: ").append(toIndentedString(timeout)).append("\n");
        sb.append("    outputDir: ").append(toIndentedString(outputDir)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    finishTime: ").append(toIndentedString(finishTime)).append("\n");
        sb.append("    failedMessage: ").append(toIndentedString(failedMessage)).append("\n");
        sb.append("    failedReason: ").append(toIndentedString(failedReason)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    toolInfo: ").append(toIndentedString(toolInfo)).append("\n");
        sb.append("    ioAccId: ").append(toIndentedString(ioAccId)).append("\n");
        sb.append("    ioAccExpectedUsage: ").append(toIndentedString(ioAccExpectedUsage)).append("\n");
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
