package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 为应用(组)添加(取消)授权的操作，必须为app_group_ids,app_ids同时赋值。 &gt; - 批量操作的应用组或者发布应用的授权模式必须统一，即要么都为应用类型的授权，要么都为应用组类型的授权，否则会直接失败(授权类型在创建应用组时指定)。
 */
public class AppGroupAuthorizeReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_group_ids")

    private List<String> appGroupIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accounts")

    private List<AccountInfo> accounts = null;

    public AppGroupAuthorizeReq withAppGroupIds(List<String> appGroupIds) {
        this.appGroupIds = appGroupIds;
        return this;
    }

    public AppGroupAuthorizeReq addAppGroupIdsItem(String appGroupIdsItem) {
        if (this.appGroupIds == null) {
            this.appGroupIds = new ArrayList<>();
        }
        this.appGroupIds.add(appGroupIdsItem);
        return this;
    }

    public AppGroupAuthorizeReq withAppGroupIds(Consumer<List<String>> appGroupIdsSetter) {
        if (this.appGroupIds == null) {
            this.appGroupIds = new ArrayList<>();
        }
        appGroupIdsSetter.accept(this.appGroupIds);
        return this;
    }

    /**
     * 应用组ID,最多同时操作10个。
     * @return appGroupIds
     */
    public List<String> getAppGroupIds() {
        return appGroupIds;
    }

    public void setAppGroupIds(List<String> appGroupIds) {
        this.appGroupIds = appGroupIds;
    }

    public AppGroupAuthorizeReq withAccounts(List<AccountInfo> accounts) {
        this.accounts = accounts;
        return this;
    }

    public AppGroupAuthorizeReq addAccountsItem(AccountInfo accountsItem) {
        if (this.accounts == null) {
            this.accounts = new ArrayList<>();
        }
        this.accounts.add(accountsItem);
        return this;
    }

    public AppGroupAuthorizeReq withAccounts(Consumer<List<AccountInfo>> accountsSetter) {
        if (this.accounts == null) {
            this.accounts = new ArrayList<>();
        }
        accountsSetter.accept(this.accounts);
        return this;
    }

    /**
     * 用户(组),单次最多允许操作50个用户(组)。
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
        AppGroupAuthorizeReq that = (AppGroupAuthorizeReq) obj;
        return Objects.equals(this.appGroupIds, that.appGroupIds) && Objects.equals(this.accounts, that.accounts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appGroupIds, accounts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppGroupAuthorizeReq {\n");
        sb.append("    appGroupIds: ").append(toIndentedString(appGroupIds)).append("\n");
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
