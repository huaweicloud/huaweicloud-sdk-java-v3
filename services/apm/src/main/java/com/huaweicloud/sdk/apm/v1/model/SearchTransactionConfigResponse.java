package com.huaweicloud.sdk.apm.v1.model;

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
public class SearchTransactionConfigResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transaction_config_item_list")

    private List<TransactionConfigItem> transactionConfigItemList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_page")

    private Integer totalPage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    public SearchTransactionConfigResponse withTransactionConfigItemList(
        List<TransactionConfigItem> transactionConfigItemList) {
        this.transactionConfigItemList = transactionConfigItemList;
        return this;
    }

    public SearchTransactionConfigResponse addTransactionConfigItemListItem(
        TransactionConfigItem transactionConfigItemListItem) {
        if (this.transactionConfigItemList == null) {
            this.transactionConfigItemList = new ArrayList<>();
        }
        this.transactionConfigItemList.add(transactionConfigItemListItem);
        return this;
    }

    public SearchTransactionConfigResponse withTransactionConfigItemList(
        Consumer<List<TransactionConfigItem>> transactionConfigItemListSetter) {
        if (this.transactionConfigItemList == null) {
            this.transactionConfigItemList = new ArrayList<>();
        }
        transactionConfigItemListSetter.accept(this.transactionConfigItemList);
        return this;
    }

    /**
     * URL跟踪视图配置列表。
     * @return transactionConfigItemList
     */
    public List<TransactionConfigItem> getTransactionConfigItemList() {
        return transactionConfigItemList;
    }

    public void setTransactionConfigItemList(List<TransactionConfigItem> transactionConfigItemList) {
        this.transactionConfigItemList = transactionConfigItemList;
    }

    public SearchTransactionConfigResponse withTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }

    /**
     * 总页数。
     * @return totalPage
     */
    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public SearchTransactionConfigResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总配置数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchTransactionConfigResponse searchTransactionConfigResponse = (SearchTransactionConfigResponse) o;
        return Objects.equals(this.transactionConfigItemList, searchTransactionConfigResponse.transactionConfigItemList)
            && Objects.equals(this.totalPage, searchTransactionConfigResponse.totalPage)
            && Objects.equals(this.totalCount, searchTransactionConfigResponse.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transactionConfigItemList, totalPage, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchTransactionConfigResponse {\n");
        sb.append("    transactionConfigItemList: ").append(toIndentedString(transactionConfigItemList)).append("\n");
        sb.append("    totalPage: ").append(toIndentedString(totalPage)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
