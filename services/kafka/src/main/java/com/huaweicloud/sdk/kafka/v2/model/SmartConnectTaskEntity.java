package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * SmartConnectTaskEntity
 */
public class SmartConnectTaskEntity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topics")

    private String topics;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topics_regex")

    private String topicsRegex;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_type")

    private String sourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_task")

    private SmartConnectTaskRespSourceConfig sourceTask;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sink_type")

    private String sinkType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sink_task")

    private SmartConnectTaskRespSinkConfig sinkTask;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    public SmartConnectTaskEntity withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * **参数解释**： Smart Connect任务名称。 **取值范围**： 不涉及。
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public SmartConnectTaskEntity withTopics(String topics) {
        this.topics = topics;
        return this;
    }

    /**
     * **参数解释**： Smart Connect任务配置的Topic。 **取值范围**： 不涉及。
     * @return topics
     */
    public String getTopics() {
        return topics;
    }

    public void setTopics(String topics) {
        this.topics = topics;
    }

    public SmartConnectTaskEntity withTopicsRegex(String topicsRegex) {
        this.topicsRegex = topicsRegex;
        return this;
    }

    /**
     * **参数解释**： Smart Connect任务配置的Topic正则表达式。 **取值范围**： 不涉及。
     * @return topicsRegex
     */
    public String getTopicsRegex() {
        return topicsRegex;
    }

    public void setTopicsRegex(String topicsRegex) {
        this.topicsRegex = topicsRegex;
    }

    public SmartConnectTaskEntity withSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * **参数解释**： Smart Connect任务的源端类型。 **取值范围**： - NONE：不配置。 - KAFKA_REPLICATOR_SOURCE：Kafka数据复制。
     * @return sourceType
     */
    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public SmartConnectTaskEntity withSourceTask(SmartConnectTaskRespSourceConfig sourceTask) {
        this.sourceTask = sourceTask;
        return this;
    }

    public SmartConnectTaskEntity withSourceTask(Consumer<SmartConnectTaskRespSourceConfig> sourceTaskSetter) {
        if (this.sourceTask == null) {
            this.sourceTask = new SmartConnectTaskRespSourceConfig();
            sourceTaskSetter.accept(this.sourceTask);
        }

        return this;
    }

    /**
     * Get sourceTask
     * @return sourceTask
     */
    public SmartConnectTaskRespSourceConfig getSourceTask() {
        return sourceTask;
    }

    public void setSourceTask(SmartConnectTaskRespSourceConfig sourceTask) {
        this.sourceTask = sourceTask;
    }

    public SmartConnectTaskEntity withSinkType(String sinkType) {
        this.sinkType = sinkType;
        return this;
    }

    /**
     * **参数解释**： Smart Connect任务的目标端类型。 **取值范围**： - NONE：不配置。 - OBS_SINK：转储。
     * @return sinkType
     */
    public String getSinkType() {
        return sinkType;
    }

    public void setSinkType(String sinkType) {
        this.sinkType = sinkType;
    }

    public SmartConnectTaskEntity withSinkTask(SmartConnectTaskRespSinkConfig sinkTask) {
        this.sinkTask = sinkTask;
        return this;
    }

    public SmartConnectTaskEntity withSinkTask(Consumer<SmartConnectTaskRespSinkConfig> sinkTaskSetter) {
        if (this.sinkTask == null) {
            this.sinkTask = new SmartConnectTaskRespSinkConfig();
            sinkTaskSetter.accept(this.sinkTask);
        }

        return this;
    }

    /**
     * Get sinkTask
     * @return sinkTask
     */
    public SmartConnectTaskRespSinkConfig getSinkTask() {
        return sinkTask;
    }

    public void setSinkTask(SmartConnectTaskRespSinkConfig sinkTask) {
        this.sinkTask = sinkTask;
    }

    public SmartConnectTaskEntity withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： Smart Connect任务的id。 **取值范围**： 不涉及。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SmartConnectTaskEntity withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**： Smart Connect任务的状态。 **取值范围**： 不涉及。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public SmartConnectTaskEntity withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释**： Smart Connect任务的创建时间。 **取值范围**： 不涉及。
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SmartConnectTaskEntity that = (SmartConnectTaskEntity) obj;
        return Objects.equals(this.taskName, that.taskName) && Objects.equals(this.topics, that.topics)
            && Objects.equals(this.topicsRegex, that.topicsRegex) && Objects.equals(this.sourceType, that.sourceType)
            && Objects.equals(this.sourceTask, that.sourceTask) && Objects.equals(this.sinkType, that.sinkType)
            && Objects.equals(this.sinkTask, that.sinkTask) && Objects.equals(this.id, that.id)
            && Objects.equals(this.status, that.status) && Objects.equals(this.createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(taskName, topics, topicsRegex, sourceType, sourceTask, sinkType, sinkTask, id, status, createTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmartConnectTaskEntity {\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    topics: ").append(toIndentedString(topics)).append("\n");
        sb.append("    topicsRegex: ").append(toIndentedString(topicsRegex)).append("\n");
        sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
        sb.append("    sourceTask: ").append(toIndentedString(sourceTask)).append("\n");
        sb.append("    sinkType: ").append(toIndentedString(sinkType)).append("\n");
        sb.append("    sinkTask: ").append(toIndentedString(sinkTask)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
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
