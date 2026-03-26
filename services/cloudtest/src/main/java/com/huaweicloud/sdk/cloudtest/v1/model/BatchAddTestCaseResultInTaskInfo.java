package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchAddTestCaseResultInTaskInfo
 */
public class BatchAddTestCaseResultInTaskInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result")

    private AddTestCaseResultInfo result;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_uri")

    private String taskUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_result_uri")

    private String taskResultUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_case_uris")

    private String testCaseUris;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isAsyn")

    private Boolean isAsyn;

    public BatchAddTestCaseResultInTaskInfo withResult(AddTestCaseResultInfo result) {
        this.result = result;
        return this;
    }

    public BatchAddTestCaseResultInTaskInfo withResult(Consumer<AddTestCaseResultInfo> resultSetter) {
        if (this.result == null) {
            this.result = new AddTestCaseResultInfo();
            resultSetter.accept(this.result);
        }

        return this;
    }

    /**
     * Get result
     * @return result
     */
    public AddTestCaseResultInfo getResult() {
        return result;
    }

    public void setResult(AddTestCaseResultInfo result) {
        this.result = result;
    }

    public BatchAddTestCaseResultInTaskInfo withTaskUri(String taskUri) {
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

    public BatchAddTestCaseResultInTaskInfo withTaskResultUri(String taskResultUri) {
        this.taskResultUri = taskResultUri;
        return this;
    }

    /**
     * 测试套结果URI
     * @return taskResultUri
     */
    public String getTaskResultUri() {
        return taskResultUri;
    }

    public void setTaskResultUri(String taskResultUri) {
        this.taskResultUri = taskResultUri;
    }

    public BatchAddTestCaseResultInTaskInfo withTestCaseUris(String testCaseUris) {
        this.testCaseUris = testCaseUris;
        return this;
    }

    /**
     * 用例uri
     * @return testCaseUris
     */
    public String getTestCaseUris() {
        return testCaseUris;
    }

    public void setTestCaseUris(String testCaseUris) {
        this.testCaseUris = testCaseUris;
    }

    public BatchAddTestCaseResultInTaskInfo withIsAsyn(Boolean isAsyn) {
        this.isAsyn = isAsyn;
        return this;
    }

    /**
     * 是否异步执行
     * @return isAsyn
     */
    public Boolean getIsAsyn() {
        return isAsyn;
    }

    public void setIsAsyn(Boolean isAsyn) {
        this.isAsyn = isAsyn;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchAddTestCaseResultInTaskInfo that = (BatchAddTestCaseResultInTaskInfo) obj;
        return Objects.equals(this.result, that.result) && Objects.equals(this.taskUri, that.taskUri)
            && Objects.equals(this.taskResultUri, that.taskResultUri)
            && Objects.equals(this.testCaseUris, that.testCaseUris) && Objects.equals(this.isAsyn, that.isAsyn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(result, taskUri, taskResultUri, testCaseUris, isAsyn);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchAddTestCaseResultInTaskInfo {\n");
        sb.append("    result: ").append(toIndentedString(result)).append("\n");
        sb.append("    taskUri: ").append(toIndentedString(taskUri)).append("\n");
        sb.append("    taskResultUri: ").append(toIndentedString(taskResultUri)).append("\n");
        sb.append("    testCaseUris: ").append(toIndentedString(testCaseUris)).append("\n");
        sb.append("    isAsyn: ").append(toIndentedString(isAsyn)).append("\n");
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
