package com.huaweicloud.sdk.cfw.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AccountDto
 */
public class AccountDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accounts")

    private List<AccountInfo> accounts = null;

    public AccountDto withAccounts(List<AccountInfo> accounts) {
        this.accounts = accounts;
        return this;
    }

    public AccountDto addAccountsItem(AccountInfo accountsItem) {
        if (this.accounts == null) {
            this.accounts = new ArrayList<>();
        }
        this.accounts.add(accountsItem);
        return this;
    }

    public AccountDto withAccounts(Consumer<List<AccountInfo>> accountsSetter) {
        if (this.accounts == null) {
            this.accounts = new ArrayList<>();
        }
        accountsSetter.accept(this.accounts);
        return this;
    }

    /**
     * **参数解释**： 账号列表 **约束限制**： 不涉及 **默认取值**： 不涉及
     * @return accounts
     */
    public List<AccountInfo> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<AccountInfo> accounts) {
        this.accounts = accounts;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AccountDto that = (AccountDto) obj;
        return Objects.equals(this.accounts, that.accounts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accounts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccountDto {\n");
        sb.append("    accounts: ").append(toIndentedString(accounts)).append("\n");
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
