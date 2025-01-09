package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 账户详细信息。
 */
public class AccountInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account")

    private String account;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private String domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_type")

    private AccountTypeEnum accountType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "platform_type")

    private PlatformTypeEnum platformType;

    public AccountInfo withAccount(String account) {
        this.account = account;
        return this;
    }

    /**
     * 账户，账户的格式必须为:<i>账户(组)</i>的形式。
     * @return account
     */
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public AccountInfo withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * 域名(用户组必填，不填时使用默认值 local.com)。
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public AccountInfo withAccountType(AccountTypeEnum accountType) {
        this.accountType = accountType;
        return this;
    }

    /**
     * Get accountType
     * @return accountType
     */
    public AccountTypeEnum getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountTypeEnum accountType) {
        this.accountType = accountType;
    }

    public AccountInfo withPlatformType(PlatformTypeEnum platformType) {
        this.platformType = platformType;
        return this;
    }

    /**
     * Get platformType
     * @return platformType
     */
    public PlatformTypeEnum getPlatformType() {
        return platformType;
    }

    public void setPlatformType(PlatformTypeEnum platformType) {
        this.platformType = platformType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AccountInfo that = (AccountInfo) obj;
        return Objects.equals(this.account, that.account) && Objects.equals(this.domain, that.domain)
            && Objects.equals(this.accountType, that.accountType)
            && Objects.equals(this.platformType, that.platformType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(account, domain, accountType, platformType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccountInfo {\n");
        sb.append("    account: ").append(toIndentedString(account)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
        sb.append("    platformType: ").append(toIndentedString(platformType)).append("\n");
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
