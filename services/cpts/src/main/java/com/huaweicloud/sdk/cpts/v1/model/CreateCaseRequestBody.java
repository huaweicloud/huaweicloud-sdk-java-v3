package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CreateCaseRequestBody
 */
public class CreateCaseRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private Integer type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private Integer taskId;

    public CreateCaseRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateCaseRequestBody withType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * type（0-常规用例，1-视频流用例，2-预制用例）
     * minimum: 0
     * maximum: 2
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public CreateCaseRequestBody withTaskId(Integer taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * task_id
     * minimum: 0
     * maximum: 2147483647
     * @return taskId
     */
    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateCaseRequestBody createCaseRequestBody = (CreateCaseRequestBody) o;
        return Objects.equals(this.name, createCaseRequestBody.name)
            && Objects.equals(this.type, createCaseRequestBody.type)
            && Objects.equals(this.taskId, createCaseRequestBody.taskId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, taskId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCaseRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
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
