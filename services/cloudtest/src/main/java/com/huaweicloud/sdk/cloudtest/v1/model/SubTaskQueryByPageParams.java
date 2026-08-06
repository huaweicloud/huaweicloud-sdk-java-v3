package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SubTaskQueryByPageParams
 */
public class SubTaskQueryByPageParams {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "more")

    private Boolean more;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "notSetReleaseDev")

    private Boolean notSetReleaseDev;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_number")

    private Integer pageNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_sub_task_id")

    private String parentSubTaskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "plan_id")

    private String planId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "release_dev")

    private List<String> releaseDev = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "results")

    private List<Integer> results = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time_begin")

    private Long startTimeBegin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time_end")

    private Long startTimeEnd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private Integer state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "states")

    private List<Integer> states = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_task_id")

    private String subTaskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suite_type")

    private Integer suiteType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_type_id")

    private String taskTypeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_service_id")

    private String testServiceId;

    public SubTaskQueryByPageParams withMore(Boolean more) {
        this.more = more;
        return this;
    }

    /**
     * Get more
     * @return more
     */
    public Boolean getMore() {
        return more;
    }

    public void setMore(Boolean more) {
        this.more = more;
    }

    public SubTaskQueryByPageParams withNotSetReleaseDev(Boolean notSetReleaseDev) {
        this.notSetReleaseDev = notSetReleaseDev;
        return this;
    }

    /**
     * 未设置发布版本
     * @return notSetReleaseDev
     */
    public Boolean getNotSetReleaseDev() {
        return notSetReleaseDev;
    }

    public void setNotSetReleaseDev(Boolean notSetReleaseDev) {
        this.notSetReleaseDev = notSetReleaseDev;
    }

    public SubTaskQueryByPageParams withPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * 页码
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public SubTaskQueryByPageParams withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 每页大小
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public SubTaskQueryByPageParams withParentSubTaskId(String parentSubTaskId) {
        this.parentSubTaskId = parentSubTaskId;
        return this;
    }

    /**
     * 父任务id
     * @return parentSubTaskId
     */
    public String getParentSubTaskId() {
        return parentSubTaskId;
    }

    public void setParentSubTaskId(String parentSubTaskId) {
        this.parentSubTaskId = parentSubTaskId;
    }

    public SubTaskQueryByPageParams withPlanId(String planId) {
        this.planId = planId;
        return this;
    }

    /**
     * 测试计划id
     * @return planId
     */
    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public SubTaskQueryByPageParams withReleaseDev(List<String> releaseDev) {
        this.releaseDev = releaseDev;
        return this;
    }

    public SubTaskQueryByPageParams addReleaseDevItem(String releaseDevItem) {
        if (this.releaseDev == null) {
            this.releaseDev = new ArrayList<>();
        }
        this.releaseDev.add(releaseDevItem);
        return this;
    }

    public SubTaskQueryByPageParams withReleaseDev(Consumer<List<String>> releaseDevSetter) {
        if (this.releaseDev == null) {
            this.releaseDev = new ArrayList<>();
        }
        releaseDevSetter.accept(this.releaseDev);
        return this;
    }

    /**
     * -| 发布的版本，空数组：代表所有未设置的； null或者无此字段，搜索所有版本 有内容：搜索所有版本
     * @return releaseDev
     */
    public List<String> getReleaseDev() {
        return releaseDev;
    }

    public void setReleaseDev(List<String> releaseDev) {
        this.releaseDev = releaseDev;
    }

    public SubTaskQueryByPageParams withResults(List<Integer> results) {
        this.results = results;
        return this;
    }

    public SubTaskQueryByPageParams addResultsItem(Integer resultsItem) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(resultsItem);
        return this;
    }

    public SubTaskQueryByPageParams withResults(Consumer<List<Integer>> resultsSetter) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        resultsSetter.accept(this.results);
        return this;
    }

    /**
     * Get results
     * @return results
     */
    public List<Integer> getResults() {
        return results;
    }

    public void setResults(List<Integer> results) {
        this.results = results;
    }

    public SubTaskQueryByPageParams withStartTimeBegin(Long startTimeBegin) {
        this.startTimeBegin = startTimeBegin;
        return this;
    }

    /**
     * 任务执行第一次时间
     * @return startTimeBegin
     */
    public Long getStartTimeBegin() {
        return startTimeBegin;
    }

    public void setStartTimeBegin(Long startTimeBegin) {
        this.startTimeBegin = startTimeBegin;
    }

    public SubTaskQueryByPageParams withStartTimeEnd(Long startTimeEnd) {
        this.startTimeEnd = startTimeEnd;
        return this;
    }

    /**
     * 任务执行最后一次时间
     * @return startTimeEnd
     */
    public Long getStartTimeEnd() {
        return startTimeEnd;
    }

    public void setStartTimeEnd(Long startTimeEnd) {
        this.startTimeEnd = startTimeEnd;
    }

    public SubTaskQueryByPageParams withState(Integer state) {
        this.state = state;
        return this;
    }

    /**
     * 状态
     * @return state
     */
    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public SubTaskQueryByPageParams withStates(List<Integer> states) {
        this.states = states;
        return this;
    }

    public SubTaskQueryByPageParams addStatesItem(Integer statesItem) {
        if (this.states == null) {
            this.states = new ArrayList<>();
        }
        this.states.add(statesItem);
        return this;
    }

    public SubTaskQueryByPageParams withStates(Consumer<List<Integer>> statesSetter) {
        if (this.states == null) {
            this.states = new ArrayList<>();
        }
        statesSetter.accept(this.states);
        return this;
    }

    /**
     * 子任务状态列表
     * @return states
     */
    public List<Integer> getStates() {
        return states;
    }

    public void setStates(List<Integer> states) {
        this.states = states;
    }

    public SubTaskQueryByPageParams withSubTaskId(String subTaskId) {
        this.subTaskId = subTaskId;
        return this;
    }

    /**
     * 子任务任务id
     * @return subTaskId
     */
    public String getSubTaskId() {
        return subTaskId;
    }

    public void setSubTaskId(String subTaskId) {
        this.subTaskId = subTaskId;
    }

    public SubTaskQueryByPageParams withSuiteType(Integer suiteType) {
        this.suiteType = suiteType;
        return this;
    }

    /**
     * 测试套类型
     * @return suiteType
     */
    public Integer getSuiteType() {
        return suiteType;
    }

    public void setSuiteType(Integer suiteType) {
        this.suiteType = suiteType;
    }

    public SubTaskQueryByPageParams withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务id
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public SubTaskQueryByPageParams withTaskTypeId(String taskTypeId) {
        this.taskTypeId = taskTypeId;
        return this;
    }

    /**
     * 任务类型，1=拨测，2=冒烟
     * @return taskTypeId
     */
    public String getTaskTypeId() {
        return taskTypeId;
    }

    public void setTaskTypeId(String taskTypeId) {
        this.taskTypeId = taskTypeId;
    }

    public SubTaskQueryByPageParams withTestServiceId(String testServiceId) {
        this.testServiceId = testServiceId;
        return this;
    }

    /**
     * 项目id
     * @return testServiceId
     */
    public String getTestServiceId() {
        return testServiceId;
    }

    public void setTestServiceId(String testServiceId) {
        this.testServiceId = testServiceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubTaskQueryByPageParams that = (SubTaskQueryByPageParams) obj;
        return Objects.equals(this.more, that.more) && Objects.equals(this.notSetReleaseDev, that.notSetReleaseDev)
            && Objects.equals(this.pageNumber, that.pageNumber) && Objects.equals(this.pageSize, that.pageSize)
            && Objects.equals(this.parentSubTaskId, that.parentSubTaskId) && Objects.equals(this.planId, that.planId)
            && Objects.equals(this.releaseDev, that.releaseDev) && Objects.equals(this.results, that.results)
            && Objects.equals(this.startTimeBegin, that.startTimeBegin)
            && Objects.equals(this.startTimeEnd, that.startTimeEnd) && Objects.equals(this.state, that.state)
            && Objects.equals(this.states, that.states) && Objects.equals(this.subTaskId, that.subTaskId)
            && Objects.equals(this.suiteType, that.suiteType) && Objects.equals(this.taskId, that.taskId)
            && Objects.equals(this.taskTypeId, that.taskTypeId)
            && Objects.equals(this.testServiceId, that.testServiceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(more,
            notSetReleaseDev,
            pageNumber,
            pageSize,
            parentSubTaskId,
            planId,
            releaseDev,
            results,
            startTimeBegin,
            startTimeEnd,
            state,
            states,
            subTaskId,
            suiteType,
            taskId,
            taskTypeId,
            testServiceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubTaskQueryByPageParams {\n");
        sb.append("    more: ").append(toIndentedString(more)).append("\n");
        sb.append("    notSetReleaseDev: ").append(toIndentedString(notSetReleaseDev)).append("\n");
        sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    parentSubTaskId: ").append(toIndentedString(parentSubTaskId)).append("\n");
        sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
        sb.append("    releaseDev: ").append(toIndentedString(releaseDev)).append("\n");
        sb.append("    results: ").append(toIndentedString(results)).append("\n");
        sb.append("    startTimeBegin: ").append(toIndentedString(startTimeBegin)).append("\n");
        sb.append("    startTimeEnd: ").append(toIndentedString(startTimeEnd)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    states: ").append(toIndentedString(states)).append("\n");
        sb.append("    subTaskId: ").append(toIndentedString(subTaskId)).append("\n");
        sb.append("    suiteType: ").append(toIndentedString(suiteType)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    taskTypeId: ").append(toIndentedString(taskTypeId)).append("\n");
        sb.append("    testServiceId: ").append(toIndentedString(testServiceId)).append("\n");
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
