package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** CreateCaseResultJson */
public class CreateCaseResultJson {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_case_id")

    private Integer taskCaseId;

    public CreateCaseResultJson withTaskCaseId(Integer taskCaseId) {
        this.taskCaseId = taskCaseId;
        return this;
    }

    /** task_case_id minimum: 0 maximum: 2147483647
     * 
     * @return taskCaseId */
    public Integer getTaskCaseId() {
        return taskCaseId;
    }

    public void setTaskCaseId(Integer taskCaseId) {
        this.taskCaseId = taskCaseId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateCaseResultJson createCaseResultJson = (CreateCaseResultJson) o;
        return Objects.equals(this.taskCaseId, createCaseResultJson.taskCaseId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskCaseId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCaseResultJson {\n");
        sb.append("    taskCaseId: ").append(toIndentedString(taskCaseId)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
