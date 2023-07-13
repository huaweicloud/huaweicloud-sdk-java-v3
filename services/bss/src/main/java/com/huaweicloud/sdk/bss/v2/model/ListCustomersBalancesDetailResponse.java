package com.huaweicloud.sdk.bss.v2.model;

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
public class ListCustomersBalancesDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_balances")

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

    public ListCustomersBalancesDetailResponse withCustomerBalances(
        Consumer<List<CustomerBalancesV2>> customerBalancesSetter) {
        if (this.customerBalances == null) {
            this.customerBalances = new ArrayList<>();
        }
        customerBalancesSetter.accept(this.customerBalances);
        return this;
    }

    /**
     * 账户余额列表。只有成功的时候才返回。 此列表不包含非代售类子客户的数据。批量查询客户余额时，若入参携带了非代售类子客户，会被过滤。 具体请参见表2。
     * @return customerBalances
     */
    public List<CustomerBalancesV2> getCustomerBalances() {
        return customerBalances;
    }

    public void setCustomerBalances(List<CustomerBalancesV2> customerBalances) {
        this.customerBalances = customerBalances;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCustomersBalancesDetailResponse that = (ListCustomersBalancesDetailResponse) obj;
        return Objects.equals(this.customerBalances, that.customerBalances);
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
