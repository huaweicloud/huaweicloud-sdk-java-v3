package com.huaweicloud.sdk.gaussdb.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ProxyTransactionSplitRequest
 */
public class ProxyTransactionSplitRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="transaction_split")
    
    
    private String transactionSplit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="proxy_id_list")
    
    
    private List<String> proxyIdList = null;
    
    public ProxyTransactionSplitRequest withTransactionSplit(String transactionSplit) {
        this.transactionSplit = transactionSplit;
        return this;
    }

    


    /**
     * 开启/关闭事务拆分，取值范围是[ON/OFF]
     * @return transactionSplit
     */
    public String getTransactionSplit() {
        return transactionSplit;
    }

    public void setTransactionSplit(String transactionSplit) {
        this.transactionSplit = transactionSplit;
    }

    

    public ProxyTransactionSplitRequest withProxyIdList(List<String> proxyIdList) {
        this.proxyIdList = proxyIdList;
        return this;
    }

    
    public ProxyTransactionSplitRequest addProxyIdListItem(String proxyIdListItem) {
        if(this.proxyIdList == null) {
            this.proxyIdList = new ArrayList<>();
        }
        this.proxyIdList.add(proxyIdListItem);
        return this;
    }

    public ProxyTransactionSplitRequest withProxyIdList(Consumer<List<String>> proxyIdListSetter) {
        if(this.proxyIdList == null) {
            this.proxyIdList = new ArrayList<>();
        }
        proxyIdListSetter.accept(this.proxyIdList);
        return this;
    }

    /**
     * 实例的proxy列表
     * @return proxyIdList
     */
    public List<String> getProxyIdList() {
        return proxyIdList;
    }

    public void setProxyIdList(List<String> proxyIdList) {
        this.proxyIdList = proxyIdList;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProxyTransactionSplitRequest proxyTransactionSplitRequest = (ProxyTransactionSplitRequest) o;
        return Objects.equals(this.transactionSplit, proxyTransactionSplitRequest.transactionSplit) &&
            Objects.equals(this.proxyIdList, proxyTransactionSplitRequest.proxyIdList);
    }
    @Override
    public int hashCode() {
        return Objects.hash(transactionSplit, proxyIdList);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProxyTransactionSplitRequest {\n");
        sb.append("    transactionSplit: ").append(toIndentedString(transactionSplit)).append("\n");
        sb.append("    proxyIdList: ").append(toIndentedString(proxyIdList)).append("\n");
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

