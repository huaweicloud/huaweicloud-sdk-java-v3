package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 发送任务消息体。
 */
public class AIMSendTaskInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sms_channel")

    private AIMSendTaskSmsChannel smsChannel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resolve_task")

    private AIMResolveTaskMode resolveTask;

    public AIMSendTaskInfo withTaskName(String taskName) {
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

    public AIMSendTaskInfo withSmsChannel(AIMSendTaskSmsChannel smsChannel) {
        this.smsChannel = smsChannel;
        return this;
    }

    public AIMSendTaskInfo withSmsChannel(Consumer<AIMSendTaskSmsChannel> smsChannelSetter) {
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

    public AIMSendTaskInfo withResolveTask(AIMResolveTaskMode resolveTask) {
        this.resolveTask = resolveTask;
        return this;
    }

    public AIMSendTaskInfo withResolveTask(Consumer<AIMResolveTaskMode> resolveTaskSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AIMSendTaskInfo that = (AIMSendTaskInfo) obj;
        return Objects.equals(this.taskName, that.taskName) && Objects.equals(this.smsChannel, that.smsChannel)
            && Objects.equals(this.resolveTask, that.resolveTask);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskName, smsChannel, resolveTask);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AIMSendTaskInfo {\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    smsChannel: ").append(toIndentedString(smsChannel)).append("\n");
        sb.append("    resolveTask: ").append(toIndentedString(resolveTask)).append("\n");
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
