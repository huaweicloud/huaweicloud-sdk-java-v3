package com.huaweicloud.sdk.aom.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 根据作业id分页查询方案集合
 */
public class ListTemplateByJobIdRequestBody  {


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

    public ListTemplateByJobIdRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 方案名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public ListTemplateByJobIdRequestBody withPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }

    


    /**
     * page_num为正整数
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

    

    public ListTemplateByJobIdRequestBody withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    


    /**
     * 每页显示的条数
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

    

    public ListTemplateByJobIdRequestBody withOrderByColumn(String orderByColumn) {
        this.orderByColumn = orderByColumn;
        return this;
    }

    


    /**
     * 需要排序的字段(默认为更新时间),支持字段有name，create_time，update_time。
     * @return orderByColumn
     */
    public String getOrderByColumn() {
        return orderByColumn;
    }

    public void setOrderByColumn(String orderByColumn) {
        this.orderByColumn = orderByColumn;
    }

    

    public ListTemplateByJobIdRequestBody withSortOrder(String sortOrder) {
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
        ListTemplateByJobIdRequestBody listTemplateByJobIdRequestBody = (ListTemplateByJobIdRequestBody) o;
        return Objects.equals(this.name, listTemplateByJobIdRequestBody.name) &&
            Objects.equals(this.pageNum, listTemplateByJobIdRequestBody.pageNum) &&
            Objects.equals(this.pageSize, listTemplateByJobIdRequestBody.pageSize) &&
            Objects.equals(this.orderByColumn, listTemplateByJobIdRequestBody.orderByColumn) &&
            Objects.equals(this.sortOrder, listTemplateByJobIdRequestBody.sortOrder);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, pageNum, pageSize, orderByColumn, sortOrder);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTemplateByJobIdRequestBody {\n");
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

