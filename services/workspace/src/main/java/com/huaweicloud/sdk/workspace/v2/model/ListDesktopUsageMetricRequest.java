package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListDesktopUsageMetricRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_name")

    private String resourceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "min_idle_days")

    private Integer minIdleDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "max_idle_days")

    private Integer maxIdleDays;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usage_min_hours")

    private Integer usageMinHours;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usage_max_hours")

    private Integer usageMaxHours;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

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

    public ListDesktopUsageMetricRequest withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 查询起始时间(0时区) 云服务每天凌晨02:00进行聚合运算前一天00:00:00~23:59:59的使用时长,并将周期范围内的数据聚合到周期边界上 跨天的记录会按照统计周期进行计算 假设一天内桌面登录多次，09:00~12:00,13:00~21:00,22:00~01:00(次日): 则当天的累计使用时长数据会被汇聚到23:59:59这个点;总使用时长为 3hours(09:00~12:00)+8hours(13:00~21:00)+2hours(22:00~00:00) 如果查询的from-to不足一个周期内，可能造成查询到数据为空；
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ListDesktopUsageMetricRequest withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 查询截至时间(0时区)。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ListDesktopUsageMetricRequest withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * 资源名称(模糊匹配)。
     * @return resourceName
     */
    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public ListDesktopUsageMetricRequest withMinIdleDays(Integer minIdleDays) {
        this.minIdleDays = minIdleDays;
        return this;
    }

    /**
     * 最小空闲天数。
     * minimum: 0
     * maximum: 180
     * @return minIdleDays
     */
    public Integer getMinIdleDays() {
        return minIdleDays;
    }

    public void setMinIdleDays(Integer minIdleDays) {
        this.minIdleDays = minIdleDays;
    }

    public ListDesktopUsageMetricRequest withMaxIdleDays(Integer maxIdleDays) {
        this.maxIdleDays = maxIdleDays;
        return this;
    }

    /**
     * 最大空闲天数 min_idle_days、max_idle_days都非空时,max_idle_days必须大于等于min_idle_days否则可能查询不到数据
     * minimum: 0
     * maximum: 180
     * @return maxIdleDays
     */
    public Integer getMaxIdleDays() {
        return maxIdleDays;
    }

    public void setMaxIdleDays(Integer maxIdleDays) {
        this.maxIdleDays = maxIdleDays;
    }

    public ListDesktopUsageMetricRequest withUsageMinHours(Integer usageMinHours) {
        this.usageMinHours = usageMinHours;
        return this;
    }

    /**
     * 使用时长(hour)最小值。
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

    public ListDesktopUsageMetricRequest withUsageMaxHours(Integer usageMaxHours) {
        this.usageMaxHours = usageMaxHours;
        return this;
    }

    /**
     * 使用时长(hour)最大值(必须大于等于usage_min_hours)。
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

    public ListDesktopUsageMetricRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ListDesktopUsageMetricRequest withSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }

    /**
     * 按照指标进行排序 * `desktop_usage` -  按照桌面使用时长排序 * `desktop_idle_duration` -  按照桌面空闲周期排序
     * @return sortField
     */
    public String getSortField() {
        return sortField;
    }

    public void setSortField(String sortField) {
        this.sortField = sortField;
    }

    public ListDesktopUsageMetricRequest withSortType(String sortType) {
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

    public ListDesktopUsageMetricRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 查询的偏移量,默认值0。
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

    public ListDesktopUsageMetricRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * limit范围[1-100],默认值0。
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
        ListDesktopUsageMetricRequest that = (ListDesktopUsageMetricRequest) obj;
        return Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.resourceName, that.resourceName)
            && Objects.equals(this.minIdleDays, that.minIdleDays) && Objects.equals(this.maxIdleDays, that.maxIdleDays)
            && Objects.equals(this.usageMinHours, that.usageMinHours)
            && Objects.equals(this.usageMaxHours, that.usageMaxHours)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.sortField, that.sortField) && Objects.equals(this.sortType, that.sortType)
            && Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime,
            endTime,
            resourceName,
            minIdleDays,
            maxIdleDays,
            usageMinHours,
            usageMaxHours,
            enterpriseProjectId,
            sortField,
            sortType,
            offset,
            limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDesktopUsageMetricRequest {\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
        sb.append("    minIdleDays: ").append(toIndentedString(minIdleDays)).append("\n");
        sb.append("    maxIdleDays: ").append(toIndentedString(maxIdleDays)).append("\n");
        sb.append("    usageMinHours: ").append(toIndentedString(usageMinHours)).append("\n");
        sb.append("    usageMaxHours: ").append(toIndentedString(usageMaxHours)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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
