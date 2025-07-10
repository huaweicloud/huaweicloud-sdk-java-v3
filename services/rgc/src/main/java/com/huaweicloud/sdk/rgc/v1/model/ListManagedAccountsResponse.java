package com.huaweicloud.sdk.rgc.v1.model;

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
public class ListManagedAccountsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "managed_accounts")

    private List<ManagedAccount> managedAccounts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfoDto pageInfo;

    public ListManagedAccountsResponse withManagedAccounts(List<ManagedAccount> managedAccounts) {
        this.managedAccounts = managedAccounts;
        return this;
    }

    public ListManagedAccountsResponse addManagedAccountsItem(ManagedAccount managedAccountsItem) {
        if (this.managedAccounts == null) {
            this.managedAccounts = new ArrayList<>();
        }
        this.managedAccounts.add(managedAccountsItem);
        return this;
    }

    public ListManagedAccountsResponse withManagedAccounts(Consumer<List<ManagedAccount>> managedAccountsSetter) {
        if (this.managedAccounts == null) {
            this.managedAccounts = new ArrayList<>();
        }
        managedAccountsSetter.accept(this.managedAccounts);
        return this;
    }

    /**
     * 纳管的账号信息。
     * @return managedAccounts
     */
    public List<ManagedAccount> getManagedAccounts() {
        return managedAccounts;
    }

    public void setManagedAccounts(List<ManagedAccount> managedAccounts) {
        this.managedAccounts = managedAccounts;
    }

    public ListManagedAccountsResponse withPageInfo(PageInfoDto pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListManagedAccountsResponse withPageInfo(Consumer<PageInfoDto> pageInfoSetter) {
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
        ListManagedAccountsResponse that = (ListManagedAccountsResponse) obj;
        return Objects.equals(this.managedAccounts, that.managedAccounts)
            && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(managedAccounts, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListManagedAccountsResponse {\n");
        sb.append("    managedAccounts: ").append(toIndentedString(managedAccounts)).append("\n");
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
