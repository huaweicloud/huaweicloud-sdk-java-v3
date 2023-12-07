package com.huaweicloud.sdk.rgc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 账号体系基础设置。
 */
public class OrganizationStructureBaseLine {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organizational_unit_name")

    private String organizationalUnitName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "organizational_unit_type")

    private OrganizationalUnitTypeForSetup organizationalUnitType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "accounts")

    private List<AccountBaseline> accounts = null;

    public OrganizationStructureBaseLine withOrganizationalUnitName(String organizationalUnitName) {
        this.organizationalUnitName = organizationalUnitName;
        return this;
    }

    /**
     * OU名称。
     * @return organizationalUnitName
     */
    public String getOrganizationalUnitName() {
        return organizationalUnitName;
    }

    public void setOrganizationalUnitName(String organizationalUnitName) {
        this.organizationalUnitName = organizationalUnitName;
    }

    public OrganizationStructureBaseLine withOrganizationalUnitType(
        OrganizationalUnitTypeForSetup organizationalUnitType) {
        this.organizationalUnitType = organizationalUnitType;
        return this;
    }

    /**
     * Get organizationalUnitType
     * @return organizationalUnitType
     */
    public OrganizationalUnitTypeForSetup getOrganizationalUnitType() {
        return organizationalUnitType;
    }

    public void setOrganizationalUnitType(OrganizationalUnitTypeForSetup organizationalUnitType) {
        this.organizationalUnitType = organizationalUnitType;
    }

    public OrganizationStructureBaseLine withAccounts(List<AccountBaseline> accounts) {
        this.accounts = accounts;
        return this;
    }

    public OrganizationStructureBaseLine addAccountsItem(AccountBaseline accountsItem) {
        if (this.accounts == null) {
            this.accounts = new ArrayList<>();
        }
        this.accounts.add(accountsItem);
        return this;
    }

    public OrganizationStructureBaseLine withAccounts(Consumer<List<AccountBaseline>> accountsSetter) {
        if (this.accounts == null) {
            this.accounts = new ArrayList<>();
        }
        accountsSetter.accept(this.accounts);
        return this;
    }

    /**
     * 账号基本信息。
     * @return accounts
     */
    public List<AccountBaseline> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<AccountBaseline> accounts) {
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
        OrganizationStructureBaseLine that = (OrganizationStructureBaseLine) obj;
        return Objects.equals(this.organizationalUnitName, that.organizationalUnitName)
            && Objects.equals(this.organizationalUnitType, that.organizationalUnitType)
            && Objects.equals(this.accounts, that.accounts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(organizationalUnitName, organizationalUnitType, accounts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrganizationStructureBaseLine {\n");
        sb.append("    organizationalUnitName: ").append(toIndentedString(organizationalUnitName)).append("\n");
        sb.append("    organizationalUnitType: ").append(toIndentedString(organizationalUnitType)).append("\n");
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
