package com.huaweicloud.sdk.dsc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListRelationTableResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_page")

    private Integer currentPage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_list")

    private List<RelationSimpleInfo> tableList = null;

    public ListRelationTableResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 关系信息总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListRelationTableResponse withCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }

    /**
     * 当前页
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public ListRelationTableResponse withTableList(List<RelationSimpleInfo> tableList) {
        this.tableList = tableList;
        return this;
    }

    public ListRelationTableResponse addTableListItem(RelationSimpleInfo tableListItem) {
        if (this.tableList == null) {
            this.tableList = new ArrayList<>();
        }
        this.tableList.add(tableListItem);
        return this;
    }

    public ListRelationTableResponse withTableList(Consumer<List<RelationSimpleInfo>> tableListSetter) {
        if (this.tableList == null) {
            this.tableList = new ArrayList<>();
        }
        tableListSetter.accept(this.tableList);
        return this;
    }

    /**
     * 关系信息列表
     * @return tableList
     */
    public List<RelationSimpleInfo> getTableList() {
        return tableList;
    }

    public void setTableList(List<RelationSimpleInfo> tableList) {
        this.tableList = tableList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListRelationTableResponse that = (ListRelationTableResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.currentPage, that.currentPage)
            && Objects.equals(this.tableList, that.tableList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, currentPage, tableList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRelationTableResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    currentPage: ").append(toIndentedString(currentPage)).append("\n");
        sb.append("    tableList: ").append(toIndentedString(tableList)).append("\n");
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
