package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TaskBasicInfoVo
 */
public class TaskBasicInfoVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_reason")

    private String errorReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_state")

    private Integer taskState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_suite_type")

    private Integer testSuiteType;

    public TaskBasicInfoVo withErrorReason(String errorReason) {
        this.errorReason = errorReason;
        return this;
    }

    /**
     * 任务状态
     * @return errorReason
     */
    public String getErrorReason() {
        return errorReason;
    }

    public void setErrorReason(String errorReason) {
        this.errorReason = errorReason;
    }

    public TaskBasicInfoVo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 任务ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public TaskBasicInfoVo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 任务名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TaskBasicInfoVo withTaskState(Integer taskState) {
        this.taskState = taskState;
        return this;
    }

    /**
     * 任务类型
     * @return taskState
     */
    public Integer getTaskState() {
        return taskState;
    }

    public void setTaskState(Integer taskState) {
        this.taskState = taskState;
    }

    public TaskBasicInfoVo withTestSuiteType(Integer testSuiteType) {
        this.testSuiteType = testSuiteType;
        return this;
    }

    /**
     * 测试套类型
     * @return testSuiteType
     */
    public Integer getTestSuiteType() {
        return testSuiteType;
    }

    public void setTestSuiteType(Integer testSuiteType) {
        this.testSuiteType = testSuiteType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskBasicInfoVo that = (TaskBasicInfoVo) obj;
        return Objects.equals(this.errorReason, that.errorReason) && Objects.equals(this.id, that.id)
            && Objects.equals(this.name, that.name) && Objects.equals(this.taskState, that.taskState)
            && Objects.equals(this.testSuiteType, that.testSuiteType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(errorReason, id, name, taskState, testSuiteType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskBasicInfoVo {\n");
        sb.append("    errorReason: ").append(toIndentedString(errorReason)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    taskState: ").append(toIndentedString(taskState)).append("\n");
        sb.append("    testSuiteType: ").append(toIndentedString(testSuiteType)).append("\n");
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
