package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * SmartConnectValidateEntity
 */
public class SmartConnectValidateEntity {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task")

    private SmartConnectTaskRespSourceConfig task;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    public SmartConnectValidateEntity withTask(SmartConnectTaskRespSourceConfig task) {
        this.task = task;
        return this;
    }

    public SmartConnectValidateEntity withTask(Consumer<SmartConnectTaskRespSourceConfig> taskSetter) {
        if (this.task == null) {
            this.task = new SmartConnectTaskRespSourceConfig();
            taskSetter.accept(this.task);
        }

        return this;
    }

    /**
     * Get task
     * @return task
     */
    public SmartConnectTaskRespSourceConfig getTask() {
        return task;
    }

    public void setTask(SmartConnectTaskRespSourceConfig task) {
        this.task = task;
    }

    public SmartConnectValidateEntity withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： Smart Connect任务类型。 **取值范围**： - OBS_SINK：转储。 - KAFKA_REPLICATOR_SOURCE：Kafka数据复制。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SmartConnectValidateEntity that = (SmartConnectValidateEntity) obj;
        return Objects.equals(this.task, that.task) && Objects.equals(this.type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(task, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmartConnectValidateEntity {\n");
        sb.append("    task: ").append(toIndentedString(task)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
