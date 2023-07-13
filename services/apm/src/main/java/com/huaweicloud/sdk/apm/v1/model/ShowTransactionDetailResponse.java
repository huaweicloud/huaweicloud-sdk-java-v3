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
public class ShowTransactionDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tx_node_list")

    private List<TxNode> txNodeList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tx_line_list")

    private List<TxLine> txLineList = null;

    public ShowTransactionDetailResponse withTxNodeList(List<TxNode> txNodeList) {
        this.txNodeList = txNodeList;
        return this;
    }

    public ShowTransactionDetailResponse addTxNodeListItem(TxNode txNodeListItem) {
        if (this.txNodeList == null) {
            this.txNodeList = new ArrayList<>();
        }
        this.txNodeList.add(txNodeListItem);
        return this;
    }

    public ShowTransactionDetailResponse withTxNodeList(Consumer<List<TxNode>> txNodeListSetter) {
        if (this.txNodeList == null) {
            this.txNodeList = new ArrayList<>();
        }
        txNodeListSetter.accept(this.txNodeList);
        return this;
    }

    /**
     * 组件节点列表。
     * @return txNodeList
     */
    public List<TxNode> getTxNodeList() {
        return txNodeList;
    }

    public void setTxNodeList(List<TxNode> txNodeList) {
        this.txNodeList = txNodeList;
    }

    public ShowTransactionDetailResponse withTxLineList(List<TxLine> txLineList) {
        this.txLineList = txLineList;
        return this;
    }

    public ShowTransactionDetailResponse addTxLineListItem(TxLine txLineListItem) {
        if (this.txLineList == null) {
            this.txLineList = new ArrayList<>();
        }
        this.txLineList.add(txLineListItem);
        return this;
    }

    public ShowTransactionDetailResponse withTxLineList(Consumer<List<TxLine>> txLineListSetter) {
        if (this.txLineList == null) {
            this.txLineList = new ArrayList<>();
        }
        txLineListSetter.accept(this.txLineList);
        return this;
    }

    /**
     * 组件之间调用指向线列表。
     * @return txLineList
     */
    public List<TxLine> getTxLineList() {
        return txLineList;
    }

    public void setTxLineList(List<TxLine> txLineList) {
        this.txLineList = txLineList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTransactionDetailResponse that = (ShowTransactionDetailResponse) obj;
        return Objects.equals(this.txNodeList, that.txNodeList) && Objects.equals(this.txLineList, that.txLineList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(txNodeList, txLineList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTransactionDetailResponse {\n");
        sb.append("    txNodeList: ").append(toIndentedString(txNodeList)).append("\n");
        sb.append("    txLineList: ").append(toIndentedString(txLineList)).append("\n");
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
