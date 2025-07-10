package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * EtlRequestBody
 */
public class EtlRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_name")

    private String tableName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_bak")

    private String isBak;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter_time_field")

    private String filterTimeField;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_field")

    private String sortField;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema_no")

    private String schemaNo;

    public EtlRequestBody withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 分页偏移量
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public EtlRequestBody withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 分页大小，最大值1000
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public EtlRequestBody withTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * 需要同步的表名称
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public EtlRequestBody withIsBak(String isBak) {
        this.isBak = isBak;
        return this;
    }

    /**
     * 是否是bak表数据
     * @return isBak
     */
    public String getIsBak() {
        return isBak;
    }

    public void setIsBak(String isBak) {
        this.isBak = isBak;
    }

    public EtlRequestBody withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 查询时间段起始时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public EtlRequestBody withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 查询时间段截止时间
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public EtlRequestBody withFilterTimeField(String filterTimeField) {
        this.filterTimeField = filterTimeField;
        return this;
    }

    /**
     * 用于时间段过滤的字段
     * @return filterTimeField
     */
    public String getFilterTimeField() {
        return filterTimeField;
    }

    public void setFilterTimeField(String filterTimeField) {
        this.filterTimeField = filterTimeField;
    }

    public EtlRequestBody withSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }

    /**
     * 用于时间排序的字段，不传默认按照更新时间排序
     * @return sortField
     */
    public String getSortField() {
        return sortField;
    }

    public void setSortField(String sortField) {
        this.sortField = sortField;
    }

    public EtlRequestBody withSchemaNo(String schemaNo) {
        this.schemaNo = schemaNo;
        return this;
    }

    /**
     * 分库编号（数字类型）
     * @return schemaNo
     */
    public String getSchemaNo() {
        return schemaNo;
    }

    public void setSchemaNo(String schemaNo) {
        this.schemaNo = schemaNo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EtlRequestBody that = (EtlRequestBody) obj;
        return Objects.equals(this.offset, that.offset) && Objects.equals(this.limit, that.limit)
            && Objects.equals(this.tableName, that.tableName) && Objects.equals(this.isBak, that.isBak)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.filterTimeField, that.filterTimeField)
            && Objects.equals(this.sortField, that.sortField) && Objects.equals(this.schemaNo, that.schemaNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offset, limit, tableName, isBak, startTime, endTime, filterTimeField, sortField, schemaNo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EtlRequestBody {\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
        sb.append("    isBak: ").append(toIndentedString(isBak)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    filterTimeField: ").append(toIndentedString(filterTimeField)).append("\n");
        sb.append("    sortField: ").append(toIndentedString(sortField)).append("\n");
        sb.append("    schemaNo: ").append(toIndentedString(schemaNo)).append("\n");
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
