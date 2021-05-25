package com.huaweicloud.sdk.bss.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bss.v2.model.NvlCostAnalysedBillDetail;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListCustomerBillsMonthlyBreakDownResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="currency")
    
    private String currency;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="total_count")
    
    private Integer totalCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="details")
    
    private List<NvlCostAnalysedBillDetail> details = null;
    
    public ListCustomerBillsMonthlyBreakDownResponse withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    


    /**
     * 货币单位代码： CNY：人民币
     * @return currency
     */
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    

    public ListCustomerBillsMonthlyBreakDownResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    


    /**
     * 结果集数量，只有成功才返回这个参数。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    

    public ListCustomerBillsMonthlyBreakDownResponse withDetails(List<NvlCostAnalysedBillDetail> details) {
        this.details = details;
        return this;
    }

    
    public ListCustomerBillsMonthlyBreakDownResponse addDetailsItem(NvlCostAnalysedBillDetail detailsItem) {
        if(this.details == null) {
            this.details = new ArrayList<>();
        }
        this.details.add(detailsItem);
        return this;
    }

    public ListCustomerBillsMonthlyBreakDownResponse withDetails(Consumer<List<NvlCostAnalysedBillDetail>> detailsSetter) {
        if(this.details == null) {
            this.details = new ArrayList<>();
        }
        detailsSetter.accept(this.details);
        return this;
    }

    /**
     * 分摊成本记录数据。 具体请参见表3。
     * @return details
     */
    public List<NvlCostAnalysedBillDetail> getDetails() {
        return details;
    }

    public void setDetails(List<NvlCostAnalysedBillDetail> details) {
        this.details = details;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListCustomerBillsMonthlyBreakDownResponse listCustomerBillsMonthlyBreakDownResponse = (ListCustomerBillsMonthlyBreakDownResponse) o;
        return Objects.equals(this.currency, listCustomerBillsMonthlyBreakDownResponse.currency) &&
            Objects.equals(this.totalCount, listCustomerBillsMonthlyBreakDownResponse.totalCount) &&
            Objects.equals(this.details, listCustomerBillsMonthlyBreakDownResponse.details);
    }
    @Override
    public int hashCode() {
        return Objects.hash(currency, totalCount, details);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCustomerBillsMonthlyBreakDownResponse {\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

