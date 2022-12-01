package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 发送智能信息响应。
 */
public class AIMSendTaskRequestMode {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sms_channel")

    private SmsChannel smsChannel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resolve_task")

    private AIMResolveTaskRequestMode resolveTask;

    public AIMSendTaskRequestMode withTaskName(String taskName) {
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

    public AIMSendTaskRequestMode withSmsChannel(SmsChannel smsChannel) {
        this.smsChannel = smsChannel;
        return this;
    }

    public AIMSendTaskRequestMode withSmsChannel(Consumer<SmsChannel> smsChannelSetter) {
        if (this.smsChannel == null) {
            this.smsChannel = new SmsChannel();
            smsChannelSetter.accept(this.smsChannel);
        }

        return this;
    }

    /**
     * Get smsChannel
     * @return smsChannel
     */
    public SmsChannel getSmsChannel() {
        return smsChannel;
    }

    public void setSmsChannel(SmsChannel smsChannel) {
        this.smsChannel = smsChannel;
    }

    public AIMSendTaskRequestMode withResolveTask(AIMResolveTaskRequestMode resolveTask) {
        this.resolveTask = resolveTask;
        return this;
    }

    public AIMSendTaskRequestMode withResolveTask(Consumer<AIMResolveTaskRequestMode> resolveTaskSetter) {
        if (this.resolveTask == null) {
            this.resolveTask = new AIMResolveTaskRequestMode();
            resolveTaskSetter.accept(this.resolveTask);
        }

        return this;
    }

    /**
     * Get resolveTask
     * @return resolveTask
     */
    public AIMResolveTaskRequestMode getResolveTask() {
        return resolveTask;
    }

    public void setResolveTask(AIMResolveTaskRequestMode resolveTask) {
        this.resolveTask = resolveTask;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AIMSendTaskRequestMode aiMSendTaskRequestMode = (AIMSendTaskRequestMode) o;
        return Objects.equals(this.taskName, aiMSendTaskRequestMode.taskName)
            && Objects.equals(this.smsChannel, aiMSendTaskRequestMode.smsChannel)
            && Objects.equals(this.resolveTask, aiMSendTaskRequestMode.resolveTask);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskName, smsChannel, resolveTask);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AIMSendTaskRequestMode {\n");
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
