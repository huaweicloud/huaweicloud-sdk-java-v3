package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 用例及任务信息
 */
public class RelateTaskTestCasesVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_case_num")

    private String testCaseNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_case_name")

    private String testCaseName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_case_uri")

    private String testCaseUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_uri")

    private String taskUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_name")

    private String taskName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_num")

    private String taskNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_creator")

    private String taskCreator;

    public RelateTaskTestCasesVo withTestCaseNum(String testCaseNum) {
        this.testCaseNum = testCaseNum;
        return this;
    }

    /**
     * 用例编号
     * @return testCaseNum
     */
    public String getTestCaseNum() {
        return testCaseNum;
    }

    public void setTestCaseNum(String testCaseNum) {
        this.testCaseNum = testCaseNum;
    }

    public RelateTaskTestCasesVo withTestCaseName(String testCaseName) {
        this.testCaseName = testCaseName;
        return this;
    }

    /**
     * 用例名
     * @return testCaseName
     */
    public String getTestCaseName() {
        return testCaseName;
    }

    public void setTestCaseName(String testCaseName) {
        this.testCaseName = testCaseName;
    }

    public RelateTaskTestCasesVo withTestCaseUri(String testCaseUri) {
        this.testCaseUri = testCaseUri;
        return this;
    }

    /**
     * 用例uri
     * @return testCaseUri
     */
    public String getTestCaseUri() {
        return testCaseUri;
    }

    public void setTestCaseUri(String testCaseUri) {
        this.testCaseUri = testCaseUri;
    }

    public RelateTaskTestCasesVo withTaskUri(String taskUri) {
        this.taskUri = taskUri;
        return this;
    }

    /**
     * 任务uri
     * @return taskUri
     */
    public String getTaskUri() {
        return taskUri;
    }

    public void setTaskUri(String taskUri) {
        this.taskUri = taskUri;
    }

    public RelateTaskTestCasesVo withTaskName(String taskName) {
        this.taskName = taskName;
        return this;
    }

    /**
     * 任务名
     * @return taskName
     */
    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public RelateTaskTestCasesVo withTaskNum(String taskNum) {
        this.taskNum = taskNum;
        return this;
    }

    /**
     * 任务编号
     * @return taskNum
     */
    public String getTaskNum() {
        return taskNum;
    }

    public void setTaskNum(String taskNum) {
        this.taskNum = taskNum;
    }

    public RelateTaskTestCasesVo withTaskCreator(String taskCreator) {
        this.taskCreator = taskCreator;
        return this;
    }

    /**
     * 任务创建人
     * @return taskCreator
     */
    public String getTaskCreator() {
        return taskCreator;
    }

    public void setTaskCreator(String taskCreator) {
        this.taskCreator = taskCreator;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RelateTaskTestCasesVo that = (RelateTaskTestCasesVo) obj;
        return Objects.equals(this.testCaseNum, that.testCaseNum)
            && Objects.equals(this.testCaseName, that.testCaseName)
            && Objects.equals(this.testCaseUri, that.testCaseUri) && Objects.equals(this.taskUri, that.taskUri)
            && Objects.equals(this.taskName, that.taskName) && Objects.equals(this.taskNum, that.taskNum)
            && Objects.equals(this.taskCreator, that.taskCreator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(testCaseNum, testCaseName, testCaseUri, taskUri, taskName, taskNum, taskCreator);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RelateTaskTestCasesVo {\n");
        sb.append("    testCaseNum: ").append(toIndentedString(testCaseNum)).append("\n");
        sb.append("    testCaseName: ").append(toIndentedString(testCaseName)).append("\n");
        sb.append("    testCaseUri: ").append(toIndentedString(testCaseUri)).append("\n");
        sb.append("    taskUri: ").append(toIndentedString(taskUri)).append("\n");
        sb.append("    taskName: ").append(toIndentedString(taskName)).append("\n");
        sb.append("    taskNum: ").append(toIndentedString(taskNum)).append("\n");
        sb.append("    taskCreator: ").append(toIndentedString(taskCreator)).append("\n");
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
