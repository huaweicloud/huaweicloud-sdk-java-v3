package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListHistoryTransactionsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_at")

    private Long startAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_at")

    private Long endAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_num")

    private Integer pageNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order")

    private String order;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_by")

    private String orderBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_sec_min")

    private Long lastSecMin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_sec_max")

    private Long lastSecMax;

    public ListHistoryTransactionsRequest withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * 实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public ListHistoryTransactionsRequest withStartAt(Long startAt) {
        this.startAt = startAt;
        return this;
    }

    /**
     * 采集开始时间（Unix timestamp，毫秒）
     * @return startAt
     */
    public Long getStartAt() {
        return startAt;
    }

    public void setStartAt(Long startAt) {
        this.startAt = startAt;
    }

    public ListHistoryTransactionsRequest withEndAt(Long endAt) {
        this.endAt = endAt;
        return this;
    }

    /**
     * 采集结束时间（Unix timestamp，毫秒）
     * @return endAt
     */
    public Long getEndAt() {
        return endAt;
    }

    public void setEndAt(Long endAt) {
        this.endAt = endAt;
    }

    public ListHistoryTransactionsRequest withPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }

    /**
     * 页数
     * @return pageNum
     */
    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public ListHistoryTransactionsRequest withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 页大小
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public ListHistoryTransactionsRequest withOrder(String order) {
        this.order = order;
        return this;
    }

    /**
     * 排序字段
     * @return order
     */
    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public ListHistoryTransactionsRequest withOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    /**
     * 升序|降序
     * @return orderBy
     */
    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public ListHistoryTransactionsRequest withLastSecMin(Long lastSecMin) {
        this.lastSecMin = lastSecMin;
        return this;
    }

    /**
     * 持续时间下限
     * @return lastSecMin
     */
    public Long getLastSecMin() {
        return lastSecMin;
    }

    public void setLastSecMin(Long lastSecMin) {
        this.lastSecMin = lastSecMin;
    }

    public ListHistoryTransactionsRequest withLastSecMax(Long lastSecMax) {
        this.lastSecMax = lastSecMax;
        return this;
    }

    /**
     * 持续时间上限
     * @return lastSecMax
     */
    public Long getLastSecMax() {
        return lastSecMax;
    }

    public void setLastSecMax(Long lastSecMax) {
        this.lastSecMax = lastSecMax;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListHistoryTransactionsRequest that = (ListHistoryTransactionsRequest) obj;
        return Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.startAt, that.startAt)
            && Objects.equals(this.endAt, that.endAt) && Objects.equals(this.pageNum, that.pageNum)
            && Objects.equals(this.pageSize, that.pageSize) && Objects.equals(this.order, that.order)
            && Objects.equals(this.orderBy, that.orderBy) && Objects.equals(this.lastSecMin, that.lastSecMin)
            && Objects.equals(this.lastSecMax, that.lastSecMax);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instanceId, startAt, endAt, pageNum, pageSize, order, orderBy, lastSecMin, lastSecMax);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListHistoryTransactionsRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
        sb.append("    endAt: ").append(toIndentedString(endAt)).append("\n");
        sb.append("    pageNum: ").append(toIndentedString(pageNum)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    order: ").append(toIndentedString(order)).append("\n");
        sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
        sb.append("    lastSecMin: ").append(toIndentedString(lastSecMin)).append("\n");
        sb.append("    lastSecMax: ").append(toIndentedString(lastSecMax)).append("\n");
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
