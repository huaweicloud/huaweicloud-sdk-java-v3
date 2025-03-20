package com.huaweicloud.sdk.coc.v1.model;

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
public class ShowAccountResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_list")

    private List<AccountRsp> accountList = null;

    public ShowAccountResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 数量
     * minimum: 0
     * maximum: 2147483647
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public ShowAccountResponse withAccountList(List<AccountRsp> accountList) {
        this.accountList = accountList;
        return this;
    }

    public ShowAccountResponse addAccountListItem(AccountRsp accountListItem) {
        if (this.accountList == null) {
            this.accountList = new ArrayList<>();
        }
        this.accountList.add(accountListItem);
        return this;
    }

    public ShowAccountResponse withAccountList(Consumer<List<AccountRsp>> accountListSetter) {
        if (this.accountList == null) {
            this.accountList = new ArrayList<>();
        }
        accountListSetter.accept(this.accountList);
        return this;
    }

    /**
     * 账号list
     * @return accountList
     */
    public List<AccountRsp> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<AccountRsp> accountList) {
        this.accountList = accountList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowAccountResponse that = (ShowAccountResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.accountList, that.accountList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, accountList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowAccountResponse {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    accountList: ").append(toIndentedString(accountList)).append("\n");
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
