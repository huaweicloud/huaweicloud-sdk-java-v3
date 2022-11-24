package com.huaweicloud.sdk.koomessage.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 发送AIM消息体。
 */
public class CreateAimSendTaskRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sms_channel")

    private SmsChannel smsChannel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resolve_task")

    private AIMResolveTask resolveTask;

    public CreateAimSendTaskRequestBody withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 短信任务名称。
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public CreateAimSendTaskRequestBody withSmsChannel(SmsChannel smsChannel) {
        this.smsChannel = smsChannel;
        return this;
    }

    public CreateAimSendTaskRequestBody withSmsChannel(Consumer<SmsChannel> smsChannelSetter) {
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

    public CreateAimSendTaskRequestBody withResolveTask(AIMResolveTask resolveTask) {
        this.resolveTask = resolveTask;
        return this;
    }

    public CreateAimSendTaskRequestBody withResolveTask(Consumer<AIMResolveTask> resolveTaskSetter) {
        if (this.resolveTask == null) {
            this.resolveTask = new AIMResolveTask();
            resolveTaskSetter.accept(this.resolveTask);
        }

        return this;
    }

    /**
     * Get resolveTask
     * @return resolveTask
     */
    public AIMResolveTask getResolveTask() {
        return resolveTask;
    }

    public void setResolveTask(AIMResolveTask resolveTask) {
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
        CreateAimSendTaskRequestBody createAimSendTaskRequestBody = (CreateAimSendTaskRequestBody) o;
        return Objects.equals(this.taskName, createAimSendTaskRequestBody.taskName)
            && Objects.equals(this.smsChannel, createAimSendTaskRequestBody.smsChannel)
            && Objects.equals(this.resolveTask, createAimSendTaskRequestBody.resolveTask);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskName, smsChannel, resolveTask);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAimSendTaskRequestBody {\n");
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
