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
public class ListPartnerBalancesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_balances")

    private List<AccountBalanceV2> accountBalances = null;

    public ListPartnerBalancesResponse withAccountBalances(List<AccountBalanceV2> accountBalances) {
        this.accountBalances = accountBalances;
        return this;
    }

    public ListPartnerBalancesResponse addAccountBalancesItem(AccountBalanceV2 accountBalancesItem) {
        if (this.accountBalances == null) {
            this.accountBalances = new ArrayList<>();
        }
        this.accountBalances.add(accountBalancesItem);
        return this;
    }

    public ListPartnerBalancesResponse withAccountBalances(Consumer<List<AccountBalanceV2>> accountBalancesSetter) {
        if (this.accountBalances == null) {
            this.accountBalances = new ArrayList<>();
        }
        accountBalancesSetter.accept(this.accountBalances);
        return this;
    }

    /**
     * 账户余额列表。 具体请参见表2
     * @return accountBalances
     */
    public List<AccountBalanceV2> getAccountBalances() {
        return accountBalances;
    }

    public void setAccountBalances(List<AccountBalanceV2> accountBalances) {
        this.accountBalances = accountBalances;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPartnerBalancesResponse that = (ListPartnerBalancesResponse) obj;
        return Objects.equals(this.accountBalances, that.accountBalances);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountBalances);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPartnerBalancesResponse {\n");
        sb.append("    accountBalances: ").append(toIndentedString(accountBalances)).append("\n");
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
