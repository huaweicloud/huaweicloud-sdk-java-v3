package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建导出应用接入统计任务请求体。
 */
public class ExportAppUserAccessDataRequestBody {

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
    @JsonProperty(value = "sort_field")

    private String sortField;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_type")

    private String sortType;

    public ExportAppUserAccessDataRequestBody withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 查询起始时间，格式为：UTC格式，例如\"2022-05-11T11:45:42Z\"。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ExportAppUserAccessDataRequestBody withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 查询截至时间，格式为：UTC格式，例如\"2022-05-11T11:45:42Z\"。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ExportAppUserAccessDataRequestBody withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * 用户名(模糊匹配)。
     * @return username
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public ExportAppUserAccessDataRequestBody withSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }

    /**
     * 按照指标进行排序。 * `access_failed_count` -  按照接入失败数排序 * `last_access_failed_time` -  按照最近接入失败时间排序
     * @return sortField
     */
    public String getSortField() {
        return sortField;
    }

    public void setSortField(String sortField) {
        this.sortField = sortField;
    }

    public ExportAppUserAccessDataRequestBody withSortType(String sortType) {
        this.sortType = sortType;
        return this;
    }

    /**
     * 按照指标进行排序的方向;需配合sort_field一起使用。 * `DESC` - 降序返回数据 * `ASC` -  升序返回数据
     * @return sortType
     */
    public String getSortType() {
        return sortType;
    }

    public void setSortType(String sortType) {
        this.sortType = sortType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ExportAppUserAccessDataRequestBody that = (ExportAppUserAccessDataRequestBody) obj;
        return Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.username, that.username) && Objects.equals(this.sortField, that.sortField)
            && Objects.equals(this.sortType, that.sortType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime, endTime, username, sortField, sortType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExportAppUserAccessDataRequestBody {\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    sortField: ").append(toIndentedString(sortField)).append("\n");
        sb.append("    sortType: ").append(toIndentedString(sortType)).append("\n");
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
