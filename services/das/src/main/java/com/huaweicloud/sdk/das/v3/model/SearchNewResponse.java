package com.huaweicloud.sdk.das.v3.model;

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
public class SearchNewResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sql_item_dto_list")

    private List<SqlItemDto> sqlItemDtoList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Long total;

    public SearchNewResponse withSqlItemDtoList(List<SqlItemDto> sqlItemDtoList) {
        this.sqlItemDtoList = sqlItemDtoList;
        return this;
    }

    public SearchNewResponse addSqlItemDtoListItem(SqlItemDto sqlItemDtoListItem) {
        if (this.sqlItemDtoList == null) {
            this.sqlItemDtoList = new ArrayList<>();
        }
        this.sqlItemDtoList.add(sqlItemDtoListItem);
        return this;
    }

    public SearchNewResponse withSqlItemDtoList(Consumer<List<SqlItemDto>> sqlItemDtoListSetter) {
        if (this.sqlItemDtoList == null) {
            this.sqlItemDtoList = new ArrayList<>();
        }
        sqlItemDtoListSetter.accept(this.sqlItemDtoList);
        return this;
    }

    /**
     * SQL列表
     * @return sqlItemDtoList
     */
    public List<SqlItemDto> getSqlItemDtoList() {
        return sqlItemDtoList;
    }

    public void setSqlItemDtoList(List<SqlItemDto> sqlItemDtoList) {
        this.sqlItemDtoList = sqlItemDtoList;
    }

    public SearchNewResponse withTotal(Long total) {
        this.total = total;
        return this;
    }

    /**
     * 总数
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SearchNewResponse that = (SearchNewResponse) obj;
        return Objects.equals(this.sqlItemDtoList, that.sqlItemDtoList) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sqlItemDtoList, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchNewResponse {\n");
        sb.append("    sqlItemDtoList: ").append(toIndentedString(sqlItemDtoList)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
