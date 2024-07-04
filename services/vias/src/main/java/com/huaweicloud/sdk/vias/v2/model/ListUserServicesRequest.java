package com.huaweicloud.sdk.vias.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ListUserServicesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_like")

    private String nameLike;

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
    @JsonProperty(value = "order_by")

    private String orderBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_name")

    private String sortName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "alg_status")

    private List<String> algStatus = null;

    public ListUserServicesRequest withNameLike(String nameLike) {
        this.nameLike = nameLike;
        return this;
    }

    /**
     * 服务名称，支持模糊匹配
     * @return nameLike
     */
    public String getNameLike() {
        return nameLike;
    }

    public void setNameLike(String nameLike) {
        this.nameLike = nameLike;
    }

    public ListUserServicesRequest withIsPaged(Boolean isPaged) {
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

    public ListUserServicesRequest withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    /**
     * 每页的最大条目数
     * minimum: 5
     * maximum: 200
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public ListUserServicesRequest withPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }

    /**
     * 第几页
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

    public ListUserServicesRequest withOrderBy(String orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    /**
     * 排序方式，可选“asc”或“desc”，代表递增排序及递减排序
     * @return orderBy
     */
    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public ListUserServicesRequest withSortName(String sortName) {
        this.sortName = sortName;
        return this;
    }

    /**
     * 排序字段，可选“created_at”或“function_version”
     * @return sortName
     */
    public String getSortName() {
        return sortName;
    }

    public void setSortName(String sortName) {
        this.sortName = sortName;
    }

    public ListUserServicesRequest withAlgStatus(List<String> algStatus) {
        this.algStatus = algStatus;
        return this;
    }

    public ListUserServicesRequest addAlgStatusItem(String algStatusItem) {
        if (this.algStatus == null) {
            this.algStatus = new ArrayList<>();
        }
        this.algStatus.add(algStatusItem);
        return this;
    }

    public ListUserServicesRequest withAlgStatus(Consumer<List<String>> algStatusSetter) {
        if (this.algStatus == null) {
            this.algStatus = new ArrayList<>();
        }
        algStatusSetter.accept(this.algStatus);
        return this;
    }

    /**
     * 服务状态，支持多选。可选“service_running”、“service_deploying”、“service_failed”、“service_stopping”、“service_stopped”、“service_upgrading”、“service_finished”、“service_concerning”、“not_deployed”
     * @return algStatus
     */
    public List<String> getAlgStatus() {
        return algStatus;
    }

    public void setAlgStatus(List<String> algStatus) {
        this.algStatus = algStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListUserServicesRequest that = (ListUserServicesRequest) obj;
        return Objects.equals(this.nameLike, that.nameLike) && Objects.equals(this.isPaged, that.isPaged)
            && Objects.equals(this.pageSize, that.pageSize) && Objects.equals(this.pageNum, that.pageNum)
            && Objects.equals(this.orderBy, that.orderBy) && Objects.equals(this.sortName, that.sortName)
            && Objects.equals(this.algStatus, that.algStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameLike, isPaged, pageSize, pageNum, orderBy, sortName, algStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListUserServicesRequest {\n");
        sb.append("    nameLike: ").append(toIndentedString(nameLike)).append("\n");
        sb.append("    isPaged: ").append(toIndentedString(isPaged)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    pageNum: ").append(toIndentedString(pageNum)).append("\n");
        sb.append("    orderBy: ").append(toIndentedString(orderBy)).append("\n");
        sb.append("    sortName: ").append(toIndentedString(sortName)).append("\n");
        sb.append("    algStatus: ").append(toIndentedString(algStatus)).append("\n");
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
