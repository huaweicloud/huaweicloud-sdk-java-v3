package com.huaweicloud.sdk.cpts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListTaskCasesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_suit_id")

    private Integer testSuitId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private Integer taskId;

    public ListTaskCasesRequest withTestSuitId(Integer testSuitId) {
        this.testSuitId = testSuitId;
        return this;
    }

    /**
     * 工程id
     * minimum: 0
     * maximum: 2147483647
     * @return testSuitId
     */
    public Integer getTestSuitId() {
        return testSuitId;
    }

    public void setTestSuitId(Integer testSuitId) {
        this.testSuitId = testSuitId;
    }

    public ListTaskCasesRequest withTaskId(Integer taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务id
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
        ListTaskCasesRequest listTaskCasesRequest = (ListTaskCasesRequest) o;
        return Objects.equals(this.testSuitId, listTaskCasesRequest.testSuitId)
            && Objects.equals(this.taskId, listTaskCasesRequest.taskId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(testSuitId, taskId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTaskCasesRequest {\n");
        sb.append("    testSuitId: ").append(toIndentedString(testSuitId)).append("\n");
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
