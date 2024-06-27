package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * DashboardDataQuery
 */
public class DashboardDataQuery {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_num")

    private Integer pageNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_ids")

    private List<String> taskIds = null;

    public DashboardDataQuery withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 查询结束时间
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public DashboardDataQuery withPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }

    /**
     * 分页参数，页码
     * @return pageNum
     */
    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public DashboardDataQuery withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 分页参数，每页大小
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public DashboardDataQuery withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 查询开始时间
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public DashboardDataQuery withTaskIds(List<String> taskIds) {
        this.taskIds = taskIds;
        return this;
    }

    public DashboardDataQuery addTaskIdsItem(String taskIdsItem) {
        if (this.taskIds == null) {
            this.taskIds = new ArrayList<>();
        }
        this.taskIds.add(taskIdsItem);
        return this;
    }

    public DashboardDataQuery withTaskIds(Consumer<List<String>> taskIdsSetter) {
        if (this.taskIds == null) {
            this.taskIds = new ArrayList<>();
        }
        taskIdsSetter.accept(this.taskIds);
        return this;
    }

    /**
     * 任务Id列表
     * @return taskIds
     */
    public List<String> getTaskIds() {
        return taskIds;
    }

    public void setTaskIds(List<String> taskIds) {
        this.taskIds = taskIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DashboardDataQuery that = (DashboardDataQuery) obj;
        return Objects.equals(this.endTime, that.endTime) && Objects.equals(this.pageNum, that.pageNum)
            && Objects.equals(this.pageSize, that.pageSize) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.taskIds, that.taskIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endTime, pageNum, pageSize, startTime, taskIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DashboardDataQuery {\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    pageNum: ").append(toIndentedString(pageNum)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    taskIds: ").append(toIndentedString(taskIds)).append("\n");
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
