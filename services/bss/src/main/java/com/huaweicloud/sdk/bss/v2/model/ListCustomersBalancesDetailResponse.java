package com.huaweicloud.sdk.bss.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.bss.v2.model.CustomerBalancesV2;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListCustomersBalancesDetailResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="customer_balances")
    
    private List<CustomerBalancesV2> customerBalances = null;
    
    public ListCustomersBalancesDetailResponse withCustomerBalances(List<CustomerBalancesV2> customerBalances) {
        this.customerBalances = customerBalances;
        return this;
    }

    
    public ListCustomersBalancesDetailResponse addCustomerBalancesItem(CustomerBalancesV2 customerBalancesItem) {
        if (this.customerBalances == null) {
            this.customerBalances = new ArrayList<>();
        }
        this.customerBalances.add(customerBalancesItem);
        return this;
    }

    public ListCustomersBalancesDetailResponse withCustomerBalances(Consumer<List<CustomerBalancesV2>> customerBalancesSetter) {
        if(this.customerBalances == null ){
            this.customerBalances = new ArrayList<>();
        }
        customerBalancesSetter.accept(this.customerBalances);
        return this;
    }

    /**
     * 账户余额列表。只有成功的时候才返回。 具体请参见表2。
     * @return customerBalances
     */
    public List<CustomerBalancesV2> getCustomerBalances() {
        return customerBalances;
    }

    public void setCustomerBalances(List<CustomerBalancesV2> customerBalances) {
        this.customerBalances = customerBalances;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListCustomersBalancesDetailResponse listCustomersBalancesDetailResponse = (ListCustomersBalancesDetailResponse) o;
        return Objects.equals(this.customerBalances, listCustomersBalancesDetailResponse.customerBalances);
    }
    @Override
    public int hashCode() {
        return Objects.hash(customerBalances);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCustomersBalancesDetailResponse {\n");
        sb.append("    customerBalances: ").append(toIndentedString(customerBalances)).append("\n");
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

