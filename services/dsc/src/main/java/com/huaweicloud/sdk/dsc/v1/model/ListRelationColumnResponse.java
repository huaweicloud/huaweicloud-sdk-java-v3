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
public class ListRelationColumnResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "column_list")

    private List<RelationSimpleInfo> columnList = null;

    public ListRelationColumnResponse withTotal(Integer total) {
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

    public ListRelationColumnResponse withColumnList(List<RelationSimpleInfo> columnList) {
        this.columnList = columnList;
        return this;
    }

    public ListRelationColumnResponse addColumnListItem(RelationSimpleInfo columnListItem) {
        if (this.columnList == null) {
            this.columnList = new ArrayList<>();
        }
        this.columnList.add(columnListItem);
        return this;
    }

    public ListRelationColumnResponse withColumnList(Consumer<List<RelationSimpleInfo>> columnListSetter) {
        if (this.columnList == null) {
            this.columnList = new ArrayList<>();
        }
        columnListSetter.accept(this.columnList);
        return this;
    }

    /**
     * 关系信息列表
     * @return columnList
     */
    public List<RelationSimpleInfo> getColumnList() {
        return columnList;
    }

    public void setColumnList(List<RelationSimpleInfo> columnList) {
        this.columnList = columnList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListRelationColumnResponse that = (ListRelationColumnResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.columnList, that.columnList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, columnList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRelationColumnResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    columnList: ").append(toIndentedString(columnList)).append("\n");
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
