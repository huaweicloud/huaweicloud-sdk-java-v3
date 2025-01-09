package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListUserUsageMetricRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "username")

    private String username;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usage_min_hours")

    private Integer usageMinHours;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usage_max_hours")

    private Integer usageMaxHours;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_field")

    private String sortField;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_type")

    private String sortType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public ListUserUsageMetricRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 查询起始时间(0时区)
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ListUserUsageMetricRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 查询截至时间(0时区)
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ListUserUsageMetricRequest withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * 用户名(模糊匹配)
     * @return username
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public ListUserUsageMetricRequest withUsageMinHours(Integer usageMinHours) {
        this.usageMinHours = usageMinHours;
        return this;
    }

    /**
     * 使用时长最小值
     * minimum: 0
     * maximum: 2147483646
     * @return usageMinHours
     */
    public Integer getUsageMinHours() {
        return usageMinHours;
    }

    public void setUsageMinHours(Integer usageMinHours) {
        this.usageMinHours = usageMinHours;
    }

    public ListUserUsageMetricRequest withUsageMaxHours(Integer usageMaxHours) {
        this.usageMaxHours = usageMaxHours;
        return this;
    }

    /**
     * 使用时长最大值 usage_min_hours和usage_max_hours同时存在时,usage_max_hours必须大于等于usage_min_hours
     * minimum: 0
     * maximum: 2147483646
     * @return usageMaxHours
     */
    public Integer getUsageMaxHours() {
        return usageMaxHours;
    }

    public void setUsageMaxHours(Integer usageMaxHours) {
        this.usageMaxHours = usageMaxHours;
    }

    public ListUserUsageMetricRequest withSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }

    /**
     * 按照指标进行排序 * `user_usage` -  按照用户使用时长排序
     * @return sortField
     */
    public String getSortField() {
        return sortField;
    }

    public void setSortField(String sortField) {
        this.sortField = sortField;
    }

    public ListUserUsageMetricRequest withSortType(String sortType) {
        this.sortType = sortType;
        return this;
    }

    /**
     * 按照指标进行排序的方向;需配合sort_field一起使用 * `DESC` - 降序返回数据 * `ASC` -  升序返回数据
     * @return sortType
     */
    public String getSortType() {
        return sortType;
    }

    public void setSortType(String sortType) {
        this.sortType = sortType;
    }

    public ListUserUsageMetricRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 查询的偏移量,默认值0
     * minimum: 0
     * maximum: 2147483646
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListUserUsageMetricRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * limit范围[1-100],默认值0
     * minimum: 1
     * maximum: 100
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListUserUsageMetricRequest that = (ListUserUsageMetricRequest) obj;
        return Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.username, that.username) && Objects.equals(this.usageMinHours, that.usageMinHours)
            && Objects.equals(this.usageMaxHours, that.usageMaxHours) && Objects.equals(this.sortField, that.sortField)
            && Objects.equals(this.sortType, that.sortType) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(startTime, endTime, username, usageMinHours, usageMaxHours, sortField, sortType, offset, limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListUserUsageMetricRequest {\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    usageMinHours: ").append(toIndentedString(usageMinHours)).append("\n");
        sb.append("    usageMaxHours: ").append(toIndentedString(usageMaxHours)).append("\n");
        sb.append("    sortField: ").append(toIndentedString(sortField)).append("\n");
        sb.append("    sortType: ").append(toIndentedString(sortType)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
