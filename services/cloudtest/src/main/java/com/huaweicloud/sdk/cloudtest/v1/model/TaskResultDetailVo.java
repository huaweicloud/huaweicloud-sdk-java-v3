package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TaskResultDetailVo
 */
public class TaskResultDetailVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_result_statics")

    private Object caseResultStatics;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_result")

    private TaskResultVo taskResult;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_result_list")

    private List<TaskResultVo> testResultList = null;

    public TaskResultDetailVo withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 处理人名称
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public TaskResultDetailVo withCaseResultStatics(Object caseResultStatics) {
        this.caseResultStatics = caseResultStatics;
        return this;
    }

    /**
     * 用例结果统计信息
     * @return caseResultStatics
     */
    public Object getCaseResultStatics() {
        return caseResultStatics;
    }

    public void setCaseResultStatics(Object caseResultStatics) {
        this.caseResultStatics = caseResultStatics;
    }

    public TaskResultDetailVo withTaskResult(TaskResultVo taskResult) {
        this.taskResult = taskResult;
        return this;
    }

    public TaskResultDetailVo withTaskResult(Consumer<TaskResultVo> taskResultSetter) {
        if (this.taskResult == null) {
            this.taskResult = new TaskResultVo();
            taskResultSetter.accept(this.taskResult);
        }

        return this;
    }

    /**
     * Get taskResult
     * @return taskResult
     */
    public TaskResultVo getTaskResult() {
        return taskResult;
    }

    public void setTaskResult(TaskResultVo taskResult) {
        this.taskResult = taskResult;
    }

    public TaskResultDetailVo withTestResultList(List<TaskResultVo> testResultList) {
        this.testResultList = testResultList;
        return this;
    }

    public TaskResultDetailVo addTestResultListItem(TaskResultVo testResultListItem) {
        if (this.testResultList == null) {
            this.testResultList = new ArrayList<>();
        }
        this.testResultList.add(testResultListItem);
        return this;
    }

    public TaskResultDetailVo withTestResultList(Consumer<List<TaskResultVo>> testResultListSetter) {
        if (this.testResultList == null) {
            this.testResultList = new ArrayList<>();
        }
        testResultListSetter.accept(this.testResultList);
        return this;
    }

    /**
     * 实际的数据类型：单个对象，集合 或 NULL
     * @return testResultList
     */
    public List<TaskResultVo> getTestResultList() {
        return testResultList;
    }

    public void setTestResultList(List<TaskResultVo> testResultList) {
        this.testResultList = testResultList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TaskResultDetailVo that = (TaskResultDetailVo) obj;
        return Objects.equals(this.owner, that.owner) && Objects.equals(this.caseResultStatics, that.caseResultStatics)
            && Objects.equals(this.taskResult, that.taskResult)
            && Objects.equals(this.testResultList, that.testResultList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(owner, caseResultStatics, taskResult, testResultList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TaskResultDetailVo {\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    caseResultStatics: ").append(toIndentedString(caseResultStatics)).append("\n");
        sb.append("    taskResult: ").append(toIndentedString(taskResult)).append("\n");
        sb.append("    testResultList: ").append(toIndentedString(testResultList)).append("\n");
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
