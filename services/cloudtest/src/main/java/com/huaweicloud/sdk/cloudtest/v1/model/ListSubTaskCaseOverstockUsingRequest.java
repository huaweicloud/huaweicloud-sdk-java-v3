package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListSubTaskCaseOverstockUsingRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "service_id")

    private String serviceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "startTime")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endTime")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executorType")

    private String executorType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label")

    private String label;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "locationId")

    private String locationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pageNum")

    private Integer pageNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pageSize")

    private Integer pageSize;

    public ListSubTaskCaseOverstockUsingRequest withServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    /**
     * 服务id
     * @return serviceId
     */
    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public ListSubTaskCaseOverstockUsingRequest withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 数据开始时间
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ListSubTaskCaseOverstockUsingRequest withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 数据结束时间
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public ListSubTaskCaseOverstockUsingRequest withExecutorType(String executorType) {
        this.executorType = executorType;
        return this;
    }

    /**
     * 执行机类型
     * @return executorType
     */
    public String getExecutorType() {
        return executorType;
    }

    public void setExecutorType(String executorType) {
        this.executorType = executorType;
    }

    public ListSubTaskCaseOverstockUsingRequest withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * 执行机标签
     * @return label
     */
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public ListSubTaskCaseOverstockUsingRequest withLocationId(String locationId) {
        this.locationId = locationId;
        return this;
    }

    /**
     * 执行机所属区域id
     * @return locationId
     */
    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId;
    }

    public ListSubTaskCaseOverstockUsingRequest withPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }

    /**
     * 分页当前页码
     * @return pageNum
     */
    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public ListSubTaskCaseOverstockUsingRequest withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 分页大小(分页参数只要有一个为空即不做分页)
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListSubTaskCaseOverstockUsingRequest that = (ListSubTaskCaseOverstockUsingRequest) obj;
        return Objects.equals(this.serviceId, that.serviceId) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.executorType, that.executorType)
            && Objects.equals(this.label, that.label) && Objects.equals(this.locationId, that.locationId)
            && Objects.equals(this.pageNum, that.pageNum) && Objects.equals(this.pageSize, that.pageSize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serviceId, startTime, endTime, executorType, label, locationId, pageNum, pageSize);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSubTaskCaseOverstockUsingRequest {\n");
        sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    executorType: ").append(toIndentedString(executorType)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    locationId: ").append(toIndentedString(locationId)).append("\n");
        sb.append("    pageNum: ").append(toIndentedString(pageNum)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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
