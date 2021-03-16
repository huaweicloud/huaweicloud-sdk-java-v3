package com.huaweicloud.sdk.bss.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bss.v2.model.BillSumInfoV2;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListSubcustomerMonthlyBillsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bill_sums")
    
    private List<BillSumInfoV2> billSums = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="count")
    
    private Integer count;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="currency")
    
    private String currency;

    public ListSubcustomerMonthlyBillsResponse withBillSums(List<BillSumInfoV2> billSums) {
        this.billSums = billSums;
        return this;
    }

    
    public ListSubcustomerMonthlyBillsResponse addBillSumsItem(BillSumInfoV2 billSumsItem) {
        this.billSums.add(billSumsItem);
        return this;
    }

    public ListSubcustomerMonthlyBillsResponse withBillSums(Consumer<List<BillSumInfoV2>> billSumsSetter) {
        if(this.billSums == null ){
            this.billSums = new ArrayList<>();
        }
        billSumsSetter.accept(this.billSums);
        return this;
    }

    /**
     * 账单记录，具体参考表2。
     * @return billSums
     */
    public List<BillSumInfoV2> getBillSums() {
        return billSums;
    }

    public void setBillSums(List<BillSumInfoV2> billSums) {
        this.billSums = billSums;
    }

    

    public ListSubcustomerMonthlyBillsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    


    /**
     * 总记录数。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    

    public ListSubcustomerMonthlyBillsResponse withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    


    /**
     * 货币编码。 CNY：人民币。
     * @return currency
     */
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSubcustomerMonthlyBillsResponse listSubcustomerMonthlyBillsResponse = (ListSubcustomerMonthlyBillsResponse) o;
        return Objects.equals(this.billSums, listSubcustomerMonthlyBillsResponse.billSums) &&
            Objects.equals(this.count, listSubcustomerMonthlyBillsResponse.count) &&
            Objects.equals(this.currency, listSubcustomerMonthlyBillsResponse.currency);
    }
    @Override
    public int hashCode() {
        return Objects.hash(billSums, count, currency);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSubcustomerMonthlyBillsResponse {\n");
        sb.append("    billSums: ").append(toIndentedString(billSums)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

