package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ListBatchJobsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "has_schedule")

    private Boolean hasSchedule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_name")

    private String jobName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schedule_status")

    private String scheduleStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_by")

    private String orderBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order")

    private String order;

    public ListBatchJobsRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /** 当前偏移量，默认为0。
     * 
     * @return offset */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListBatchJobsRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /** 每页显示的最大作业个数，范围: [1, 100]。默认值：10。 minimum: 1 maximum: 100
     * 
     * @return limit */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListBatchJobsRequest withHasSchedule(Boolean hasSchedule) {
        this.hasSchedule = hasSchedule;
        return this;
    }

    /** 是否定时作业。true：定时作业：false：不是定时作业。为空时：所有作业。
     * 
     * @return hasSchedule */
    public Boolean getHasSchedule() {
        return hasSchedule;
    }

    public void setHasSchedule(Boolean hasSchedule) {
        this.hasSchedule = hasSchedule;
    }

    public ListBatchJobsRequest withJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }

    /** 作业名称
     * 
     * @return jobName */
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public ListBatchJobsRequest withScheduleStatus(String scheduleStatus) {
        this.scheduleStatus = scheduleStatus;
        return this;
    }

    /** 调度状态。1:NORMAL, 2:PAUSED, 3:COMPLETE, 4:ERROR, 5:BLOCKED
     * 
     * @return scheduleStatus */
    public String getScheduleStatus() {
        return scheduleStatus;
    }

    public void setScheduleStatus(String scheduleStatus) {
        this.scheduleStatus = scheduleStatus;
    }

    public ListBatchJobsRequest withOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    /** 指定作业排序字段，默认为created_time（作业创建时间），支持created_time(作业创建时间)、modified_time（作业更新时间） 、job_name（作业名称）三种排序字段。
     * 
     * @return orderBy */
    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public ListBatchJobsRequest withOrder(String order) {
        this.order = order;
        return this;
    }

    /** 指定作业排序的升降序，默认为desc（降序），支持asc（升序）、desc（降序）两种排序方式。
     * 
     * @return order */
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
        ListBatchJobsRequest listBatchJobsRequest = (ListBatchJobsRequest) o;
        return Objects.equals(this.offset, listBatchJobsRequest.offset)
            && Objects.equals(this.limit, listBatchJobsRequest.limit)
            && Objects.equals(this.hasSchedule, listBatchJobsRequest.hasSchedule)
            && Objects.equals(this.jobName, listBatchJobsRequest.jobName)
            && Objects.equals(this.scheduleStatus, listBatchJobsRequest.scheduleStatus)
            && Objects.equals(this.orderBy, listBatchJobsRequest.orderBy)
            && Objects.equals(this.order, listBatchJobsRequest.order);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offset, limit, hasSchedule, jobName, scheduleStatus, orderBy, order);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListBatchJobsRequest {\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    hasSchedule: ").append(toIndentedString(hasSchedule)).append("\n");
        sb.append("    jobName: ").append(toIndentedString(jobName)).append("\n");
        sb.append("    scheduleStatus: ").append(toIndentedString(scheduleStatus)).append("\n");
        sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
