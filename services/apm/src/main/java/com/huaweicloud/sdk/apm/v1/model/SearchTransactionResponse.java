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
public class SearchTransactionResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tx_item_list")

    private List<TxItemVo> txItemList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_time")

    private Long latestTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_id")

    private String resultId;

    public SearchTransactionResponse withTxItemList(List<TxItemVo> txItemList) {
        this.txItemList = txItemList;
        return this;
    }

    public SearchTransactionResponse addTxItemListItem(TxItemVo txItemListItem) {
        if (this.txItemList == null) {
            this.txItemList = new ArrayList<>();
        }
        this.txItemList.add(txItemListItem);
        return this;
    }

    public SearchTransactionResponse withTxItemList(Consumer<List<TxItemVo>> txItemListSetter) {
        if (this.txItemList == null) {
            this.txItemList = new ArrayList<>();
        }
        txItemListSetter.accept(this.txItemList);
        return this;
    }

    /**
     * URL跟踪视图列表。
     * @return txItemList
     */
    public List<TxItemVo> getTxItemList() {
        return txItemList;
    }

    public void setTxItemList(List<TxItemVo> txItemList) {
        this.txItemList = txItemList;
    }

    public SearchTransactionResponse withLatestTime(Long latestTime) {
        this.latestTime = latestTime;
        return this;
    }

    /**
     * 最后响应时间。
     * @return latestTime
     */
    public Long getLatestTime() {
        return latestTime;
    }

    public void setLatestTime(Long latestTime) {
        this.latestTime = latestTime;
    }

    public SearchTransactionResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总数据条数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public SearchTransactionResponse withResultId(String resultId) {
        this.resultId = resultId;
        return this;
    }

    /**
     * 请求id。
     * @return resultId
     */
    public String getResultId() {
        return resultId;
    }

    public void setResultId(String resultId) {
        this.resultId = resultId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SearchTransactionResponse searchTransactionResponse = (SearchTransactionResponse) o;
        return Objects.equals(this.txItemList, searchTransactionResponse.txItemList)
            && Objects.equals(this.latestTime, searchTransactionResponse.latestTime)
            && Objects.equals(this.totalCount, searchTransactionResponse.totalCount)
            && Objects.equals(this.resultId, searchTransactionResponse.resultId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(txItemList, latestTime, totalCount, resultId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SearchTransactionResponse {\n");
        sb.append("    txItemList: ").append(toIndentedString(txItemList)).append("\n");
        sb.append("    latestTime: ").append(toIndentedString(latestTime)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    resultId: ").append(toIndentedString(resultId)).append("\n");
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
