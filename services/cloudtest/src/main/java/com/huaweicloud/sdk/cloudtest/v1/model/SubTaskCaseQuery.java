package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SubTaskCaseQuery
 */
public class SubTaskCaseQuery {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_user")

    private String createUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endTime")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keyWord")

    private String keyWord;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location_id")

    private String locationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "more")

    private Boolean more;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_num")

    private Integer pageNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pid")

    private String pid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "results")

    private List<Integer> results = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sortBy")

    private String sortBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stage")

    private Integer stage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "startTime")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subtask_ids")

    private List<String> subtaskIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subtask_id")

    private String subtaskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "suiteType")

    private Integer suiteType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_id")

    private String taskId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_ids")

    private List<String> taskIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "taskTypeId")

    private String taskTypeId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "test_service_id")

    private String testServiceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "testcase_id")

    private String testcaseId;

    public SubTaskCaseQuery withCreateUser(String createUser) {
        this.createUser = createUser;
        return this;
    }

    /**
     * 用例创建者
     * @return createUser
     */
    public String getCreateUser() {
        return createUser;
    }

    public void setCreateUser(String createUser) {
        this.createUser = createUser;
    }

    public SubTaskCaseQuery withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 用例结束时间
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public SubTaskCaseQuery withKeyWord(String keyWord) {
        this.keyWord = keyWord;
        return this;
    }

    /**
     * Get keyWord
     * @return keyWord
     */
    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public SubTaskCaseQuery withLocationId(String locationId) {
        this.locationId = locationId;
        return this;
    }

    /**
     * 执行机区域ID
     * @return locationId
     */
    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public SubTaskCaseQuery withMore(Boolean more) {
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

    public SubTaskCaseQuery withPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }

    /**
     * 分页时页码
     * @return pageNum
     */
    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public SubTaskCaseQuery withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 分页时每页大小
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public SubTaskCaseQuery withPid(String pid) {
        this.pid = pid;
        return this;
    }

    /**
     * 告警策略选择失败后重试时有值
     * @return pid
     */
    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public SubTaskCaseQuery withResults(List<Integer> results) {
        this.results = results;
        return this;
    }

    public SubTaskCaseQuery addResultsItem(Integer resultsItem) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(resultsItem);
        return this;
    }

    public SubTaskCaseQuery withResults(Consumer<List<Integer>> resultsSetter) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        resultsSetter.accept(this.results);
        return this;
    }

    /**
     * cloudTest任务执行结果列表
     * @return results
     */
    public List<Integer> getResults() {
        return results;
    }

    public void setResults(List<Integer> results) {
        this.results = results;
    }

    public SubTaskCaseQuery withSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }

    /**
     * 排序字段
     * @return sortBy
     */
    public String getSortBy() {
        return sortBy;
    }

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    public SubTaskCaseQuery withStage(Integer stage) {
        this.stage = stage;
        return this;
    }

    /**
     * 用例所处的阶段 0：前置， 1：测试用例 2：后置用例
     * @return stage
     */
    public Integer getStage() {
        return stage;
    }

    public void setStage(Integer stage) {
        this.stage = stage;
    }

    public SubTaskCaseQuery withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 用例开始时间
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public SubTaskCaseQuery withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 状态
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public SubTaskCaseQuery withSubtaskIds(List<String> subtaskIds) {
        this.subtaskIds = subtaskIds;
        return this;
    }

    public SubTaskCaseQuery addSubtaskIdsItem(String subtaskIdsItem) {
        if (this.subtaskIds == null) {
            this.subtaskIds = new ArrayList<>();
        }
        this.subtaskIds.add(subtaskIdsItem);
        return this;
    }

    public SubTaskCaseQuery withSubtaskIds(Consumer<List<String>> subtaskIdsSetter) {
        if (this.subtaskIds == null) {
            this.subtaskIds = new ArrayList<>();
        }
        subtaskIdsSetter.accept(this.subtaskIds);
        return this;
    }

    /**
     * 子任务ID列表
     * @return subtaskIds
     */
    public List<String> getSubtaskIds() {
        return subtaskIds;
    }

    public void setSubtaskIds(List<String> subtaskIds) {
        this.subtaskIds = subtaskIds;
    }

    public SubTaskCaseQuery withSubtaskId(String subtaskId) {
        this.subtaskId = subtaskId;
        return this;
    }

    /**
     * 子任务ID
     * @return subtaskId
     */
    public String getSubtaskId() {
        return subtaskId;
    }

    public void setSubtaskId(String subtaskId) {
        this.subtaskId = subtaskId;
    }

    public SubTaskCaseQuery withSuiteType(Integer suiteType) {
        this.suiteType = suiteType;
        return this;
    }

    /**
     * Get suiteType
     * @return suiteType
     */
    public Integer getSuiteType() {
        return suiteType;
    }

    public void setSuiteType(Integer suiteType) {
        this.suiteType = suiteType;
    }

    public SubTaskCaseQuery withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * 任务ID
     * @return taskId
     */
    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public SubTaskCaseQuery withTaskIds(List<String> taskIds) {
        this.taskIds = taskIds;
        return this;
    }

    public SubTaskCaseQuery addTaskIdsItem(String taskIdsItem) {
        if (this.taskIds == null) {
            this.taskIds = new ArrayList<>();
        }
        this.taskIds.add(taskIdsItem);
        return this;
    }

    public SubTaskCaseQuery withTaskIds(Consumer<List<String>> taskIdsSetter) {
        if (this.taskIds == null) {
            this.taskIds = new ArrayList<>();
        }
        taskIdsSetter.accept(this.taskIds);
        return this;
    }

    /**
     * 任务ID列表
     * @return taskIds
     */
    public List<String> getTaskIds() {
        return taskIds;
    }

    public void setTaskIds(List<String> taskIds) {
        this.taskIds = taskIds;
    }

    public SubTaskCaseQuery withTaskTypeId(String taskTypeId) {
        this.taskTypeId = taskTypeId;
        return this;
    }

    /**
     * 任务类型
     * @return taskTypeId
     */
    public String getTaskTypeId() {
        return taskTypeId;
    }

    public void setTaskTypeId(String taskTypeId) {
        this.taskTypeId = taskTypeId;
    }

    public SubTaskCaseQuery withTestServiceId(String testServiceId) {
        this.testServiceId = testServiceId;
        return this;
    }

    /**
     * 服务ID
     * @return testServiceId
     */
    public String getTestServiceId() {
        return testServiceId;
    }

    public void setTestServiceId(String testServiceId) {
        this.testServiceId = testServiceId;
    }

    public SubTaskCaseQuery withTestcaseId(String testcaseId) {
        this.testcaseId = testcaseId;
        return this;
    }

    /**
     * 用例ID
     * @return testcaseId
     */
    public String getTestcaseId() {
        return testcaseId;
    }

    public void setTestcaseId(String testcaseId) {
        this.testcaseId = testcaseId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SubTaskCaseQuery that = (SubTaskCaseQuery) obj;
        return Objects.equals(this.createUser, that.createUser) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.keyWord, that.keyWord) && Objects.equals(this.locationId, that.locationId)
            && Objects.equals(this.more, that.more) && Objects.equals(this.pageNum, that.pageNum)
            && Objects.equals(this.pageSize, that.pageSize) && Objects.equals(this.pid, that.pid)
            && Objects.equals(this.results, that.results) && Objects.equals(this.sortBy, that.sortBy)
            && Objects.equals(this.stage, that.stage) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.state, that.state) && Objects.equals(this.subtaskIds, that.subtaskIds)
            && Objects.equals(this.subtaskId, that.subtaskId) && Objects.equals(this.suiteType, that.suiteType)
            && Objects.equals(this.taskId, that.taskId) && Objects.equals(this.taskIds, that.taskIds)
            && Objects.equals(this.taskTypeId, that.taskTypeId)
            && Objects.equals(this.testServiceId, that.testServiceId)
            && Objects.equals(this.testcaseId, that.testcaseId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createUser,
            endTime,
            keyWord,
            locationId,
            more,
            pageNum,
            pageSize,
            pid,
            results,
            sortBy,
            stage,
            startTime,
            state,
            subtaskIds,
            subtaskId,
            suiteType,
            taskId,
            taskIds,
            taskTypeId,
            testServiceId,
            testcaseId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SubTaskCaseQuery {\n");
        sb.append("    createUser: ").append(toIndentedString(createUser)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    keyWord: ").append(toIndentedString(keyWord)).append("\n");
        sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
        sb.append("    more: ").append(toIndentedString(more)).append("\n");
        sb.append("    pageNum: ").append(toIndentedString(pageNum)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
        sb.append("    results: ").append(toIndentedString(results)).append("\n");
        sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
        sb.append("    stage: ").append(toIndentedString(stage)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    subtaskIds: ").append(toIndentedString(subtaskIds)).append("\n");
        sb.append("    subtaskId: ").append(toIndentedString(subtaskId)).append("\n");
        sb.append("    suiteType: ").append(toIndentedString(suiteType)).append("\n");
        sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
        sb.append("    taskIds: ").append(toIndentedString(taskIds)).append("\n");
        sb.append("    taskTypeId: ").append(toIndentedString(taskTypeId)).append("\n");
        sb.append("    testServiceId: ").append(toIndentedString(testServiceId)).append("\n");
        sb.append("    testcaseId: ").append(toIndentedString(testcaseId)).append("\n");
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
