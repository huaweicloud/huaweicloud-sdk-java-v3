package com.huaweicloud.sdk.ecs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * EventResponse
 */
public class EventResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publish_time")

    private String publishTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finish_time")

    private String finishTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_before")

    private String notBefore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_after")

    private String notAfter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_before_deadline")

    private String notBeforeDeadline;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execute_options")

    private EventResponseExecuteOptions executeOptions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private EventResponseSource source;

    public EventResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 事件ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public EventResponse withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 事件类型
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public EventResponse withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 事件状态
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public EventResponse withPublishTime(String publishTime) {
        this.publishTime = publishTime;
        return this;
    }

    /**
     * 事件发布时间
     * @return publishTime
     */
    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    public EventResponse withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 事件开始时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public EventResponse withFinishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }

    /**
     * 事件完成时间
     * @return finishTime
     */
    public String getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime;
    }

    public EventResponse withNotBefore(String notBefore) {
        this.notBefore = notBefore;
        return this;
    }

    /**
     * 事件计划执行开始时间
     * @return notBefore
     */
    public String getNotBefore() {
        return notBefore;
    }

    public void setNotBefore(String notBefore) {
        this.notBefore = notBefore;
    }

    public EventResponse withNotAfter(String notAfter) {
        this.notAfter = notAfter;
        return this;
    }

    /**
     * 事件计划执行完成时间
     * @return notAfter
     */
    public String getNotAfter() {
        return notAfter;
    }

    public void setNotAfter(String notAfter) {
        this.notAfter = notAfter;
    }

    public EventResponse withNotBeforeDeadline(String notBeforeDeadline) {
        this.notBeforeDeadline = notBeforeDeadline;
        return this;
    }

    /**
     * 事件计划执行开始时间deadline
     * @return notBeforeDeadline
     */
    public String getNotBeforeDeadline() {
        return notBeforeDeadline;
    }

    public void setNotBeforeDeadline(String notBeforeDeadline) {
        this.notBeforeDeadline = notBeforeDeadline;
    }

    public EventResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 事件描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EventResponse withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public EventResponse withExecuteOptions(EventResponseExecuteOptions executeOptions) {
        this.executeOptions = executeOptions;
        return this;
    }

    public EventResponse withExecuteOptions(Consumer<EventResponseExecuteOptions> executeOptionsSetter) {
        if (this.executeOptions == null) {
            this.executeOptions = new EventResponseExecuteOptions();
            executeOptionsSetter.accept(this.executeOptions);
        }

        return this;
    }

    /**
     * Get executeOptions
     * @return executeOptions
     */
    public EventResponseExecuteOptions getExecuteOptions() {
        return executeOptions;
    }

    public void setExecuteOptions(EventResponseExecuteOptions executeOptions) {
        this.executeOptions = executeOptions;
    }

    public EventResponse withSource(EventResponseSource source) {
        this.source = source;
        return this;
    }

    public EventResponse withSource(Consumer<EventResponseSource> sourceSetter) {
        if (this.source == null) {
            this.source = new EventResponseSource();
            sourceSetter.accept(this.source);
        }

        return this;
    }

    /**
     * Get source
     * @return source
     */
    public EventResponseSource getSource() {
        return source;
    }

    public void setSource(EventResponseSource source) {
        this.source = source;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EventResponse that = (EventResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.type, that.type)
            && Objects.equals(this.state, that.state) && Objects.equals(this.publishTime, that.publishTime)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.finishTime, that.finishTime)
            && Objects.equals(this.notBefore, that.notBefore) && Objects.equals(this.notAfter, that.notAfter)
            && Objects.equals(this.notBeforeDeadline, that.notBeforeDeadline)
            && Objects.equals(this.description, that.description) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.executeOptions, that.executeOptions) && Objects.equals(this.source, that.source);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            type,
            state,
            publishTime,
            startTime,
            finishTime,
            notBefore,
            notAfter,
            notBeforeDeadline,
            description,
            instanceId,
            executeOptions,
            source);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EventResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    publishTime: ").append(toIndentedString(publishTime)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    finishTime: ").append(toIndentedString(finishTime)).append("\n");
        sb.append("    notBefore: ").append(toIndentedString(notBefore)).append("\n");
        sb.append("    notAfter: ").append(toIndentedString(notAfter)).append("\n");
        sb.append("    notBeforeDeadline: ").append(toIndentedString(notBeforeDeadline)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    executeOptions: ").append(toIndentedString(executeOptions)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
