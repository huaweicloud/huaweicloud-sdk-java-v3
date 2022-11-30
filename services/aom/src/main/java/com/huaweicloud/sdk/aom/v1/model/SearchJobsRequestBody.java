package com.huaweicloud.sdk.aom.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 分页查询作业列表请求参数
 */
public class SearchJobsRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page_num")
    
    
    private Integer pageNum;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="page_size")
    
    
    private Integer pageSize;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="order_by_column")
    
    
    private String orderByColumn;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sort_order")
    
    
    private String sortOrder;

    public SearchJobsRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 查询接收的的参数，版本管理时，name为脚本名称（版本管理查询时name不能为空），页面查询时，name为接收模糊查询的参数，name是null，表示查询所有默认脚本。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public SearchJobsRequestBody withPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }

    


    /**
     * 当前页，查询的当前页，page_num为正整数，不能是0和负数，当输入参数为负数，0和大于1000，自动修正参数为1，默认值是1（用户不传，值是1）。
     * minimum: 1
     * maximum: 9999999
     * @return pageNum
     */
    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    

    public SearchJobsRequestBody withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    


    /**
     * 每页显示的条数，每页查询的总条数，page_size为正整数，不能是0和负数，当输入参数为负数，0和大于101，自动修正参数为10，默认值是10（用户不传时，值是10）。
     * minimum: 1
     * maximum: 100
     * @return pageSize
     */
    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    

    public SearchJobsRequestBody withOrderByColumn(String orderByColumn) {
        this.orderByColumn = orderByColumn;
        return this;
    }

    


    /**
     * 需要排序的字段(默认为更新时间),支持字段有create_time。
     * @return orderByColumn
     */
    public String getOrderByColumn() {
        return orderByColumn;
    }

    public void setOrderByColumn(String orderByColumn) {
        this.orderByColumn = orderByColumn;
    }

    

    public SearchJobsRequestBody withSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    


    /**
     * 排序规则(默认降序) 传入升序或降序，升序：ASC，降序：DESC。
     * @return sortOrder
     */
    public String getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchJobsRequestBody searchJobsRequestBody = (SearchJobsRequestBody) o;
        return Objects.equals(this.name, searchJobsRequestBody.name) &&
            Objects.equals(this.pageNum, searchJobsRequestBody.pageNum) &&
            Objects.equals(this.pageSize, searchJobsRequestBody.pageSize) &&
            Objects.equals(this.orderByColumn, searchJobsRequestBody.orderByColumn) &&
            Objects.equals(this.sortOrder, searchJobsRequestBody.sortOrder);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, pageNum, pageSize, orderByColumn, sortOrder);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchJobsRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    pageNum: ").append(toIndentedString(pageNum)).append("\n");
        sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
        sb.append("    orderByColumn: ").append(toIndentedString(orderByColumn)).append("\n");
        sb.append("    sortOrder: ").append(toIndentedString(sortOrder)).append("\n");
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

