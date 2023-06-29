package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 智能信息发送任务。
 */
public class AIMSendTasksMode {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sms_channel")

    private AIMSendTaskSmsChannel smsChannel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resolve_task")

    private AIMResolveTaskMode resolveTask;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_state")

    private String taskState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creation_time")

    private OffsetDateTime creationTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "submission_count")

    private Integer submissionCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "send_count")

    private Integer sendCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resolve_count")

    private Integer resolveCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_resolve_count")

    private Integer supportResolveCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failed_short_chains")

    private List<CreateResolveTaskParamMode> failedShortChains = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "success_number")

    private Integer successNumber;

    public AIMSendTasksMode withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 智能信息发送任务名称。
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public AIMSendTasksMode withSmsChannel(AIMSendTaskSmsChannel smsChannel) {
        this.smsChannel = smsChannel;
        return this;
    }

    public AIMSendTasksMode withSmsChannel(Consumer<AIMSendTaskSmsChannel> smsChannelSetter) {
        if (this.smsChannel == null) {
            this.smsChannel = new AIMSendTaskSmsChannel();
            smsChannelSetter.accept(this.smsChannel);
        }

        return this;
    }

    /**
     * Get smsChannel
     * @return smsChannel
     */
    public AIMSendTaskSmsChannel getSmsChannel() {
        return smsChannel;
    }

    public void setSmsChannel(AIMSendTaskSmsChannel smsChannel) {
        this.smsChannel = smsChannel;
    }

    public AIMSendTasksMode withResolveTask(AIMResolveTaskMode resolveTask) {
        this.resolveTask = resolveTask;
        return this;
    }

    public AIMSendTasksMode withResolveTask(Consumer<AIMResolveTaskMode> resolveTaskSetter) {
        if (this.resolveTask == null) {
            this.resolveTask = new AIMResolveTaskMode();
            resolveTaskSetter.accept(this.resolveTask);
        }

        return this;
    }

    /**
     * Get resolveTask
     * @return resolveTask
     */
    public AIMResolveTaskMode getResolveTask() {
        return resolveTask;
    }

    public void setResolveTask(AIMResolveTaskMode resolveTask) {
        this.resolveTask = resolveTask;
    }

    public AIMSendTasksMode withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务ID。
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public AIMSendTasksMode withTaskState(String taskState) {
        this.taskState = taskState;
        return this;
    }

    /**
     * 任务状态。  - Success：发送成功 - Failed：发送失败  > 此状态仅代表任务提交状态，不代表智能信息发送结果。用户手机接收智能信息结果请以收到的回执结果为准，也可通过查询智能信息发送明细API获取或登录KooMessage控制台查看。 
     * @return taskState
     */
    public String getTaskState() {
        return taskState;
    }

    public void setTaskState(String taskState) {
        this.taskState = taskState;
    }

    public AIMSendTasksMode withCreationTime(OffsetDateTime creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * 创建时间。样例：2019-10-12T07:20:50.522Z。
     * @return creationTime
     */
    public OffsetDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(OffsetDateTime creationTime) {
        this.creationTime = creationTime;
    }

    public AIMSendTasksMode withSubmissionCount(Integer submissionCount) {
        this.submissionCount = submissionCount;
        return this;
    }

    /**
     * 提交的手机号码总数。
     * @return submissionCount
     */
    public Integer getSubmissionCount() {
        return submissionCount;
    }

    public void setSubmissionCount(Integer submissionCount) {
        this.submissionCount = submissionCount;
    }

    public AIMSendTasksMode withSendCount(Integer sendCount) {
        this.sendCount = sendCount;
        return this;
    }

    /**
     * 发送数量。
     * @return sendCount
     */
    public Integer getSendCount() {
        return sendCount;
    }

    public void setSendCount(Integer sendCount) {
        this.sendCount = sendCount;
    }

    public AIMSendTasksMode withResolveCount(Integer resolveCount) {
        this.resolveCount = resolveCount;
        return this;
    }

    /**
     * 智能信息解析成功的手机号码总数。
     * @return resolveCount
     */
    public Integer getResolveCount() {
        return resolveCount;
    }

    public void setResolveCount(Integer resolveCount) {
        this.resolveCount = resolveCount;
    }

    public AIMSendTasksMode withSupportResolveCount(Integer supportResolveCount) {
        this.supportResolveCount = supportResolveCount;
        return this;
    }

    /**
     * 支持智能信息解析的手机号码总数。  >通过API发送的智能信息任务不做解析能力判断，返回-1作为标识。 
     * @return supportResolveCount
     */
    public Integer getSupportResolveCount() {
        return supportResolveCount;
    }

    public void setSupportResolveCount(Integer supportResolveCount) {
        this.supportResolveCount = supportResolveCount;
    }

    public AIMSendTasksMode withFailedShortChains(List<CreateResolveTaskParamMode> failedShortChains) {
        this.failedShortChains = failedShortChains;
        return this;
    }

    public AIMSendTasksMode addFailedShortChainsItem(CreateResolveTaskParamMode failedShortChainsItem) {
        if (this.failedShortChains == null) {
            this.failedShortChains = new ArrayList<>();
        }
        this.failedShortChains.add(failedShortChainsItem);
        return this;
    }

    public AIMSendTasksMode withFailedShortChains(Consumer<List<CreateResolveTaskParamMode>> failedShortChainsSetter) {
        if (this.failedShortChains == null) {
            this.failedShortChains = new ArrayList<>();
        }
        failedShortChainsSetter.accept(this.failedShortChains);
        return this;
    }

    /**
     * 短链生成失败列表。  > 预留字段。 
     * @return failedShortChains
     */
    public List<CreateResolveTaskParamMode> getFailedShortChains() {
        return failedShortChains;
    }

    public void setFailedShortChains(List<CreateResolveTaskParamMode> failedShortChains) {
        this.failedShortChains = failedShortChains;
    }

    public AIMSendTasksMode withSuccessNumber(Integer successNumber) {
        this.successNumber = successNumber;
        return this;
    }

    /**
     * 发送成功的智能信息数。
     * @return successNumber
     */
    public Integer getSuccessNumber() {
        return successNumber;
    }

    public void setSuccessNumber(Integer successNumber) {
        this.successNumber = successNumber;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AIMSendTasksMode that = (AIMSendTasksMode) obj;
        return Objects.equals(this.taskName, that.taskName) && Objects.equals(this.smsChannel, that.smsChannel)
            && Objects.equals(this.resolveTask, that.resolveTask) && Objects.equals(this.taskId, that.taskId)
            && Objects.equals(this.taskState, that.taskState) && Objects.equals(this.creationTime, that.creationTime)
            && Objects.equals(this.submissionCount, that.submissionCount)
            && Objects.equals(this.sendCount, that.sendCount) && Objects.equals(this.resolveCount, that.resolveCount)
            && Objects.equals(this.supportResolveCount, that.supportResolveCount)
            && Objects.equals(this.failedShortChains, that.failedShortChains)
            && Objects.equals(this.successNumber, that.successNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskName,
            smsChannel,
            resolveTask,
            taskId,
            taskState,
            creationTime,
            submissionCount,
            sendCount,
            resolveCount,
            supportResolveCount,
            failedShortChains,
            successNumber);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AIMSendTasksMode {\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    smsChannel: ").append(toIndentedString(smsChannel)).append("\n");
        sb.append("    resolveTask: ").append(toIndentedString(resolveTask)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    taskState: ").append(toIndentedString(taskState)).append("\n");
        sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
        sb.append("    submissionCount: ").append(toIndentedString(submissionCount)).append("\n");
        sb.append("    sendCount: ").append(toIndentedString(sendCount)).append("\n");
        sb.append("    resolveCount: ").append(toIndentedString(resolveCount)).append("\n");
        sb.append("    supportResolveCount: ").append(toIndentedString(supportResolveCount)).append("\n");
        sb.append("    failedShortChains: ").append(toIndentedString(failedShortChains)).append("\n");
        sb.append("    successNumber: ").append(toIndentedString(successNumber)).append("\n");
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
