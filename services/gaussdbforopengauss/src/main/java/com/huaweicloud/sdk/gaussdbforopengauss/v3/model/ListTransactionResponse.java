package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

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
public class ListTransactionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rows_info")

    private List<ListTransactionResponseBodyRowsInfo> rowsInfo = null;

    public ListTransactionResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**: 查到的事务数量。 **取值范围**: 不涉及。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListTransactionResponse withRowsInfo(List<ListTransactionResponseBodyRowsInfo> rowsInfo) {
        this.rowsInfo = rowsInfo;
        return this;
    }

    public ListTransactionResponse addRowsInfoItem(ListTransactionResponseBodyRowsInfo rowsInfoItem) {
        if (this.rowsInfo == null) {
            this.rowsInfo = new ArrayList<>();
        }
        this.rowsInfo.add(rowsInfoItem);
        return this;
    }

    public ListTransactionResponse withRowsInfo(Consumer<List<ListTransactionResponseBodyRowsInfo>> rowsInfoSetter) {
        if (this.rowsInfo == null) {
            this.rowsInfo = new ArrayList<>();
        }
        rowsInfoSetter.accept(this.rowsInfo);
        return this;
    }

    /**
     * **参数解释**: 事务信息列表。
     * @return rowsInfo
     */
    public List<ListTransactionResponseBodyRowsInfo> getRowsInfo() {
        return rowsInfo;
    }

    public void setRowsInfo(List<ListTransactionResponseBodyRowsInfo> rowsInfo) {
        this.rowsInfo = rowsInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTransactionResponse that = (ListTransactionResponse) obj;
        return Objects.equals(this.total, that.total) && Objects.equals(this.rowsInfo, that.rowsInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, rowsInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTransactionResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    rowsInfo: ").append(toIndentedString(rowsInfo)).append("\n");
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
