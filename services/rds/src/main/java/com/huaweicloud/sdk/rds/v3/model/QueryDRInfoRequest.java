package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * QueryDRInfoRequest
 */
public class QueryDRInfoRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "master_instance_id")

    private String masterInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "master_region")

    private String masterRegion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slave_instance_id")

    private String slaveInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slave_region")

    private String slaveRegion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_at_start")

    private Long createAtStart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_at_end")

    private Long createAtEnd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order")

    private String order;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_field")

    private String sortField;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    public QueryDRInfoRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 容灾关系id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public QueryDRInfoRequest withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 容灾搭建状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public QueryDRInfoRequest withMasterInstanceId(String masterInstanceId) {
        this.masterInstanceId = masterInstanceId;
        return this;
    }

    /**
     * 灾备实例id
     * @return masterInstanceId
     */
    public String getMasterInstanceId() {
        return masterInstanceId;
    }

    public void setMasterInstanceId(String masterInstanceId) {
        this.masterInstanceId = masterInstanceId;
    }

    public QueryDRInfoRequest withMasterRegion(String masterRegion) {
        this.masterRegion = masterRegion;
        return this;
    }

    /**
     * 主实例region
     * @return masterRegion
     */
    public String getMasterRegion() {
        return masterRegion;
    }

    public void setMasterRegion(String masterRegion) {
        this.masterRegion = masterRegion;
    }

    public QueryDRInfoRequest withSlaveInstanceId(String slaveInstanceId) {
        this.slaveInstanceId = slaveInstanceId;
        return this;
    }

    /**
     * 灾备实例id
     * @return slaveInstanceId
     */
    public String getSlaveInstanceId() {
        return slaveInstanceId;
    }

    public void setSlaveInstanceId(String slaveInstanceId) {
        this.slaveInstanceId = slaveInstanceId;
    }

    public QueryDRInfoRequest withSlaveRegion(String slaveRegion) {
        this.slaveRegion = slaveRegion;
        return this;
    }

    /**
     * 灾备实例region
     * @return slaveRegion
     */
    public String getSlaveRegion() {
        return slaveRegion;
    }

    public void setSlaveRegion(String slaveRegion) {
        this.slaveRegion = slaveRegion;
    }

    public QueryDRInfoRequest withCreateAtStart(Long createAtStart) {
        this.createAtStart = createAtStart;
        return this;
    }

    /**
     * 创建起始时间
     * @return createAtStart
     */
    public Long getCreateAtStart() {
        return createAtStart;
    }

    public void setCreateAtStart(Long createAtStart) {
        this.createAtStart = createAtStart;
    }

    public QueryDRInfoRequest withCreateAtEnd(Long createAtEnd) {
        this.createAtEnd = createAtEnd;
        return this;
    }

    /**
     * 创建结束时间
     * @return createAtEnd
     */
    public Long getCreateAtEnd() {
        return createAtEnd;
    }

    public void setCreateAtEnd(Long createAtEnd) {
        this.createAtEnd = createAtEnd;
    }

    public QueryDRInfoRequest withOrder(String order) {
        this.order = order;
        return this;
    }

    /**
     * 排序方式。 DESC，降序。 ASC，升序。 默认降序。
     * @return order
     */
    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public QueryDRInfoRequest withSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }

    /**
     * 排序字段。 status 容灾搭建状态。 time 容灾搭建时间。 master_region 主实例region。 slave_region 灾备实例region 默认容灾搭建时间。
     * @return sortField
     */
    public String getSortField() {
        return sortField;
    }

    public void setSortField(String sortField) {
        this.sortField = sortField;
    }

    public QueryDRInfoRequest withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 索引位置，偏移量。从第一条数据偏移offset条数据后开始查询，默认为0（偏移0条数据，表示从第一条数据开始查询），必须为数字，不能为负数。
     * @return offset
     */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public QueryDRInfoRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询记录数。默认为10，不能为负数，最小值为1，最大值为100。
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
        QueryDRInfoRequest that = (QueryDRInfoRequest) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.status, that.status)
            && Objects.equals(this.masterInstanceId, that.masterInstanceId)
            && Objects.equals(this.masterRegion, that.masterRegion)
            && Objects.equals(this.slaveInstanceId, that.slaveInstanceId)
            && Objects.equals(this.slaveRegion, that.slaveRegion)
            && Objects.equals(this.createAtStart, that.createAtStart)
            && Objects.equals(this.createAtEnd, that.createAtEnd) && Objects.equals(this.order, that.order)
            && Objects.equals(this.sortField, that.sortField) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.limit, that.limit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            status,
            masterInstanceId,
            masterRegion,
            slaveInstanceId,
            slaveRegion,
            createAtStart,
            createAtEnd,
            order,
            sortField,
            offset,
            limit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryDRInfoRequest {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    masterInstanceId: ").append(toIndentedString(masterInstanceId)).append("\n");
        sb.append("    masterRegion: ").append(toIndentedString(masterRegion)).append("\n");
        sb.append("    slaveInstanceId: ").append(toIndentedString(slaveInstanceId)).append("\n");
        sb.append("    slaveRegion: ").append(toIndentedString(slaveRegion)).append("\n");
        sb.append("    createAtStart: ").append(toIndentedString(createAtStart)).append("\n");
        sb.append("    createAtEnd: ").append(toIndentedString(createAtEnd)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("    sortField: ").append(toIndentedString(sortField)).append("\n");
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
