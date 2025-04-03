package com.huaweicloud.sdk.identitycenterportalapi.v1.model;

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
public class ListAccountsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_list")

    private List<AccountInfo> accountList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfoDto pageInfo;

    public ListAccountsResponse withAccountList(List<AccountInfo> accountList) {
        this.accountList = accountList;
        return this;
    }

    public ListAccountsResponse addAccountListItem(AccountInfo accountListItem) {
        if (this.accountList == null) {
            this.accountList = new ArrayList<>();
        }
        this.accountList.add(accountListItem);
        return this;
    }

    public ListAccountsResponse withAccountList(Consumer<List<AccountInfo>> accountListSetter) {
        if (this.accountList == null) {
            this.accountList = new ArrayList<>();
        }
        accountListSetter.accept(this.accountList);
        return this;
    }

    /**
     * 满足查询条件的账号对象列表
     * @return accountList
     */
    public List<AccountInfo> getAccountList() {
        return accountList;
    }

    public void setAccountList(List<AccountInfo> accountList) {
        this.accountList = accountList;
    }

    public ListAccountsResponse withPageInfo(PageInfoDto pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListAccountsResponse withPageInfo(Consumer<PageInfoDto> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfoDto();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfoDto getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfoDto pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAccountsResponse that = (ListAccountsResponse) obj;
        return Objects.equals(this.accountList, that.accountList) && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountList, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAccountsResponse {\n");
        sb.append("    accountList: ").append(toIndentedString(accountList)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
