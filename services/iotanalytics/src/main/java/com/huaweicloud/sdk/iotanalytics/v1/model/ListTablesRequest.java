package com.huaweicloud.sdk.iotanalytics.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** Request Object */
public class ListTablesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keyword")

    private String keyword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag")

    private String tag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_by")

    private String orderBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order")

    private String order;

    public ListTablesRequest withKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }

    /** 过滤表名称的关键词。
     * 
     * @return keyword */
    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public ListTablesRequest withTag(String tag) {
        this.tag = tag;
        return this;
    }

    /** 过滤标签的关键字
     * 
     * @return tag */
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public ListTablesRequest withOffset(Integer offset) {
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

    public ListTablesRequest withLimit(Integer limit) {
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

    public ListTablesRequest withOrderBy(String orderBy) {
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

    public ListTablesRequest withOrder(String order) {
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
        ListTablesRequest listTablesRequest = (ListTablesRequest) o;
        return Objects.equals(this.keyword, listTablesRequest.keyword)
            && Objects.equals(this.tag, listTablesRequest.tag) && Objects.equals(this.offset, listTablesRequest.offset)
            && Objects.equals(this.limit, listTablesRequest.limit)
            && Objects.equals(this.orderBy, listTablesRequest.orderBy)
            && Objects.equals(this.order, listTablesRequest.order);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyword, tag, offset, limit, orderBy, order);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTablesRequest {\n");
        sb.append("    keyword: ").append(toIndentedString(keyword)).append("\n");
        sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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
