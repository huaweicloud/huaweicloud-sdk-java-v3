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
public class ListTransactionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transaction_info_list")

    private List<GetTransactionListRespTransactionInfoList> transactionInfoList = null;

    public ListTransactionsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 历史事务总数
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListTransactionsResponse withTransactionInfoList(
        List<GetTransactionListRespTransactionInfoList> transactionInfoList) {
        this.transactionInfoList = transactionInfoList;
        return this;
    }

    public ListTransactionsResponse addTransactionInfoListItem(
        GetTransactionListRespTransactionInfoList transactionInfoListItem) {
        if (this.transactionInfoList == null) {
            this.transactionInfoList = new ArrayList<>();
        }
        this.transactionInfoList.add(transactionInfoListItem);
        return this;
    }

    public ListTransactionsResponse withTransactionInfoList(
        Consumer<List<GetTransactionListRespTransactionInfoList>> transactionInfoListSetter) {
        if (this.transactionInfoList == null) {
            this.transactionInfoList = new ArrayList<>();
        }
        transactionInfoListSetter.accept(this.transactionInfoList);
        return this;
    }

    /**
     * 历史事务信息列表
     * @return transactionInfoList
     */
    public List<GetTransactionListRespTransactionInfoList> getTransactionInfoList() {
        return transactionInfoList;
    }

    public void setTransactionInfoList(List<GetTransactionListRespTransactionInfoList> transactionInfoList) {
        this.transactionInfoList = transactionInfoList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTransactionsResponse that = (ListTransactionsResponse) obj;
        return Objects.equals(this.total, that.total)
            && Objects.equals(this.transactionInfoList, that.transactionInfoList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, transactionInfoList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTransactionsResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    transactionInfoList: ").append(toIndentedString(transactionInfoList)).append("\n");
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
