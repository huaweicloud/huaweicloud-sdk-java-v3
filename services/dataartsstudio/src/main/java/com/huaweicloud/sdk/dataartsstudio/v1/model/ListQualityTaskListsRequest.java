package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListQualityTaskListsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start")

    private Long start;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Long pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category_id")

    private Long categoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_name")

    private String ruleName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_status")

    private Integer scheduleStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_period")

    private Integer schedulePeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_status")

    private Integer resultStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort")

    private String sort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order")

    private String order;

    public ListQualityTaskListsRequest withStart(Long start) {
        this.start = start;
        return this;
    }

    /**
     * start number
     * @return start
     */
    public Long getStart() {
        return start;
    }

    public void setStart(Long start) {
        this.start = start;
    }

    public ListQualityTaskListsRequest withPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * page size
     * @return pageSize
     */
    public Long getPageSize() {
        return pageSize;
    }

    public void setPageSize(Long pageSize) {
        this.pageSize = pageSize;
    }

    public ListQualityTaskListsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 分页查询偏移量
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListQualityTaskListsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 每页显示的条目数量
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListQualityTaskListsRequest withCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }

    /**
     * category id
     * @return categoryId
     */
    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public ListQualityTaskListsRequest withRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * rule name
     * @return ruleName
     */
    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    public ListQualityTaskListsRequest withScheduleStatus(Integer scheduleStatus) {
        this.scheduleStatus = scheduleStatus;
        return this;
    }

    /**
     * schedule status
     * @return scheduleStatus
     */
    public Integer getScheduleStatus() {
        return scheduleStatus;
    }

    public void setScheduleStatus(Integer scheduleStatus) {
        this.scheduleStatus = scheduleStatus;
    }

    public ListQualityTaskListsRequest withSchedulePeriod(Integer schedulePeriod) {
        this.schedulePeriod = schedulePeriod;
        return this;
    }

    /**
     * schedule period
     * @return schedulePeriod
     */
    public Integer getSchedulePeriod() {
        return schedulePeriod;
    }

    public void setSchedulePeriod(Integer schedulePeriod) {
        this.schedulePeriod = schedulePeriod;
    }

    public ListQualityTaskListsRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间(搜索)
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ListQualityTaskListsRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间(搜索)
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ListQualityTaskListsRequest withResultStatus(Integer resultStatus) {
        this.resultStatus = resultStatus;
        return this;
    }

    /**
     * 最近运行结果 0：运行中 1：异常 2：告警 3：正常
     * @return resultStatus
     */
    public Integer getResultStatus() {
        return resultStatus;
    }

    public void setResultStatus(Integer resultStatus) {
        this.resultStatus = resultStatus;
    }

    public ListQualityTaskListsRequest withSort(String sort) {
        this.sort = sort;
        return this;
    }

    /**
     * 排序字段
     * @return sort
     */
    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public ListQualityTaskListsRequest withOrder(String order) {
        this.order = order;
        return this;
    }

    /**
     * 排序方式
     * @return order
     */
    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListQualityTaskListsRequest listQualityTaskListsRequest = (ListQualityTaskListsRequest) o;
        return Objects.equals(this.start, listQualityTaskListsRequest.start)
            && Objects.equals(this.pageSize, listQualityTaskListsRequest.pageSize)
            && Objects.equals(this.offset, listQualityTaskListsRequest.offset)
            && Objects.equals(this.limit, listQualityTaskListsRequest.limit)
            && Objects.equals(this.categoryId, listQualityTaskListsRequest.categoryId)
            && Objects.equals(this.ruleName, listQualityTaskListsRequest.ruleName)
            && Objects.equals(this.scheduleStatus, listQualityTaskListsRequest.scheduleStatus)
            && Objects.equals(this.schedulePeriod, listQualityTaskListsRequest.schedulePeriod)
            && Objects.equals(this.startTime, listQualityTaskListsRequest.startTime)
            && Objects.equals(this.endTime, listQualityTaskListsRequest.endTime)
            && Objects.equals(this.resultStatus, listQualityTaskListsRequest.resultStatus)
            && Objects.equals(this.sort, listQualityTaskListsRequest.sort)
            && Objects.equals(this.order, listQualityTaskListsRequest.order);
    }

    @Override
    public int hashCode() {
        return Objects.hash(start,
            pageSize,
            offset,
            limit,
            categoryId,
            ruleName,
            scheduleStatus,
            schedulePeriod,
            startTime,
            endTime,
            resultStatus,
            sort,
            order);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListQualityTaskListsRequest {\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
        sb.append("    ruleName: ").append(toIndentedString(ruleName)).append("\n");
        sb.append("    scheduleStatus: ").append(toIndentedString(scheduleStatus)).append("\n");
        sb.append("    schedulePeriod: ").append(toIndentedString(schedulePeriod)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    resultStatus: ").append(toIndentedString(resultStatus)).append("\n");
        sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
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
