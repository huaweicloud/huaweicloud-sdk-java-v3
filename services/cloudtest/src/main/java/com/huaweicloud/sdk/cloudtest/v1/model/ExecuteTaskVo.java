package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 实际的数据类型：单个对象，集合 或 NULL
 */
public class ExecuteTaskVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flag")

    private Boolean flag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uri")

    private String uri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_result_vo")

    private TaskResultVo taskResultVo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_case_uri_list")

    private List<String> updateCaseUriList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_case_result_list")

    private List<TestResultVo> testCaseResultList = null;

    public ExecuteTaskVo withFlag(Boolean flag) {
        this.flag = flag;
        return this;
    }

    /**
     * 标志
     * @return flag
     */
    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public ExecuteTaskVo withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * URI
     * @return uri
     */
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public ExecuteTaskVo withTaskResultVo(TaskResultVo taskResultVo) {
        this.taskResultVo = taskResultVo;
        return this;
    }

    public ExecuteTaskVo withTaskResultVo(Consumer<TaskResultVo> taskResultVoSetter) {
        if (this.taskResultVo == null) {
            this.taskResultVo = new TaskResultVo();
            taskResultVoSetter.accept(this.taskResultVo);
        }

        return this;
    }

    /**
     * Get taskResultVo
     * @return taskResultVo
     */
    public TaskResultVo getTaskResultVo() {
        return taskResultVo;
    }

    public void setTaskResultVo(TaskResultVo taskResultVo) {
        this.taskResultVo = taskResultVo;
    }

    public ExecuteTaskVo withUpdateCaseUriList(List<String> updateCaseUriList) {
        this.updateCaseUriList = updateCaseUriList;
        return this;
    }

    public ExecuteTaskVo addUpdateCaseUriListItem(String updateCaseUriListItem) {
        if (this.updateCaseUriList == null) {
            this.updateCaseUriList = new ArrayList<>();
        }
        this.updateCaseUriList.add(updateCaseUriListItem);
        return this;
    }

    public ExecuteTaskVo withUpdateCaseUriList(Consumer<List<String>> updateCaseUriListSetter) {
        if (this.updateCaseUriList == null) {
            this.updateCaseUriList = new ArrayList<>();
        }
        updateCaseUriListSetter.accept(this.updateCaseUriList);
        return this;
    }

    /**
     * 更新用例
     * @return updateCaseUriList
     */
    public List<String> getUpdateCaseUriList() {
        return updateCaseUriList;
    }

    public void setUpdateCaseUriList(List<String> updateCaseUriList) {
        this.updateCaseUriList = updateCaseUriList;
    }

    public ExecuteTaskVo withTestCaseResultList(List<TestResultVo> testCaseResultList) {
        this.testCaseResultList = testCaseResultList;
        return this;
    }

    public ExecuteTaskVo addTestCaseResultListItem(TestResultVo testCaseResultListItem) {
        if (this.testCaseResultList == null) {
            this.testCaseResultList = new ArrayList<>();
        }
        this.testCaseResultList.add(testCaseResultListItem);
        return this;
    }

    public ExecuteTaskVo withTestCaseResultList(Consumer<List<TestResultVo>> testCaseResultListSetter) {
        if (this.testCaseResultList == null) {
            this.testCaseResultList = new ArrayList<>();
        }
        testCaseResultListSetter.accept(this.testCaseResultList);
        return this;
    }

    /**
     * 用例结果列表
     * @return testCaseResultList
     */
    public List<TestResultVo> getTestCaseResultList() {
        return testCaseResultList;
    }

    public void setTestCaseResultList(List<TestResultVo> testCaseResultList) {
        this.testCaseResultList = testCaseResultList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExecuteTaskVo that = (ExecuteTaskVo) obj;
        return Objects.equals(this.flag, that.flag) && Objects.equals(this.uri, that.uri)
            && Objects.equals(this.taskResultVo, that.taskResultVo)
            && Objects.equals(this.updateCaseUriList, that.updateCaseUriList)
            && Objects.equals(this.testCaseResultList, that.testCaseResultList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(flag, uri, taskResultVo, updateCaseUriList, testCaseResultList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecuteTaskVo {\n");
        sb.append("    flag: ").append(toIndentedString(flag)).append("\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
        sb.append("    taskResultVo: ").append(toIndentedString(taskResultVo)).append("\n");
        sb.append("    updateCaseUriList: ").append(toIndentedString(updateCaseUriList)).append("\n");
        sb.append("    testCaseResultList: ").append(toIndentedString(testCaseResultList)).append("\n");
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
