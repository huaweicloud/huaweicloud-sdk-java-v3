package com.huaweicloud.sdk.vias.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ListEdgePoolsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_paged")

    private Boolean isPaged;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_size")

    private Integer pageSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_num")

    private Integer pageNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_like")

    private String nameLike;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_by")

    private String orderBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_name")

    private String sortName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    public ListEdgePoolsRequest withIsPaged(Boolean isPaged) {
        this.isPaged = isPaged;
        return this;
    }

    /**
     * 是否分页
     * @return isPaged
     */
    public Boolean getIsPaged() {
        return isPaged;
    }

    public void setIsPaged(Boolean isPaged) {
        this.isPaged = isPaged;
    }

    public ListEdgePoolsRequest withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 第几页
     * minimum: 1
     * maximum: 1000
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public ListEdgePoolsRequest withPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }

    /**
     * 页大小
     * minimum: 1
     * maximum: 10000
     * @return pageNum
     */
    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public ListEdgePoolsRequest withNameLike(String nameLike) {
        this.nameLike = nameLike;
        return this;
    }

    /**
     * 模糊查询名称，满足正则表达式^[a-z0-9-]{1,30}$
     * @return nameLike
     */
    public String getNameLike() {
        return nameLike;
    }

    public void setNameLike(String nameLike) {
        this.nameLike = nameLike;
    }

    public ListEdgePoolsRequest withOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    /**
     * 排序方式，根据传入的sort_name的值进行正序或倒序地排序。asc为正序，desc为倒序。 枚举值： - asc - desc
     * @return orderBy
     */
    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public ListEdgePoolsRequest withSortName(String sortName) {
        this.sortName = sortName;
        return this;
    }

    /**
     * 排序字段。枚举值： - created_at - updated_at
     * @return sortName
     */
    public String getSortName() {
        return sortName;
    }

    public void setSortName(String sortName) {
        this.sortName = sortName;
    }

    public ListEdgePoolsRequest withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 状态筛选，单选。枚举值： - Running - Abnormal
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListEdgePoolsRequest that = (ListEdgePoolsRequest) obj;
        return Objects.equals(this.isPaged, that.isPaged) && Objects.equals(this.pageSize, that.pageSize)
            && Objects.equals(this.pageNum, that.pageNum) && Objects.equals(this.nameLike, that.nameLike)
            && Objects.equals(this.orderBy, that.orderBy) && Objects.equals(this.sortName, that.sortName)
            && Objects.equals(this.state, that.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isPaged, pageSize, pageNum, nameLike, orderBy, sortName, state);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListEdgePoolsRequest {\n");
        sb.append("    isPaged: ").append(toIndentedString(isPaged)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    pageNum: ").append(toIndentedString(pageNum)).append("\n");
        sb.append("    nameLike: ").append(toIndentedString(nameLike)).append("\n");
        sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
        sb.append("    sortName: ").append(toIndentedString(sortName)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
