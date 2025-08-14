package com.huaweicloud.sdk.identitycenter.v1.model;

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
public class ListAccountsForProvisionedPermissionSetResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_ids")

    private List<String> accountIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfoDto pageInfo;

    public ListAccountsForProvisionedPermissionSetResponse withAccountIds(List<String> accountIds) {
        this.accountIds = accountIds;
        return this;
    }

    public ListAccountsForProvisionedPermissionSetResponse addAccountIdsItem(String accountIdsItem) {
        if (this.accountIds == null) {
            this.accountIds = new ArrayList<>();
        }
        this.accountIds.add(accountIdsItem);
        return this;
    }

    public ListAccountsForProvisionedPermissionSetResponse withAccountIds(Consumer<List<String>> accountIdsSetter) {
        if (this.accountIds == null) {
            this.accountIds = new ArrayList<>();
        }
        accountIdsSetter.accept(this.accountIds);
        return this;
    }

    /**
     * 账户ID列表
     * @return accountIds
     */
    public List<String> getAccountIds() {
        return accountIds;
    }

    public void setAccountIds(List<String> accountIds) {
        this.accountIds = accountIds;
    }

    public ListAccountsForProvisionedPermissionSetResponse withPageInfo(PageInfoDto pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ListAccountsForProvisionedPermissionSetResponse withPageInfo(Consumer<PageInfoDto> pageInfoSetter) {
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
        ListAccountsForProvisionedPermissionSetResponse that = (ListAccountsForProvisionedPermissionSetResponse) obj;
        return Objects.equals(this.accountIds, that.accountIds) && Objects.equals(this.pageInfo, that.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountIds, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAccountsForProvisionedPermissionSetResponse {\n");
        sb.append("    accountIds: ").append(toIndentedString(accountIds)).append("\n");
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
