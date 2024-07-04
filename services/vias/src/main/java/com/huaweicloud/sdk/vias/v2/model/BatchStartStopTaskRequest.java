package com.huaweicloud.sdk.vias.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class BatchStartStopTaskRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "command")

    private String command;

    public BatchStartStopTaskRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 批量配置ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BatchStartStopTaskRequest withCommand(String command) {
        this.command = command;
        return this;
    }

    /**
     * 指定该API要对批量任务配置进行的操作，停止或者启动 枚举值：start|stop
     * @return command
     */
    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchStartStopTaskRequest that = (BatchStartStopTaskRequest) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.command, that.command);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, command);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchStartStopTaskRequest {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    command: ").append(toIndentedString(command)).append("\n");
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
