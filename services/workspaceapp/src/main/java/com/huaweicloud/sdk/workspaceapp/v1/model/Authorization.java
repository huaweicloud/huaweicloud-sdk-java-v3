package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * 用户授权信息
 */
public class Authorization {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_id")

    private String accountId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account")

    private String account;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_id")

    private String appId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_name")

    private String appName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_group_id")

    private String appGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_group_name")

    private String appGroupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorization_type")

    private AuthorizationTypeEnum authorizationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_type")

    private AccountTypeEnum accountType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "platform_type")

    private PlatformTypeEnum platformType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private String domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_at")

    private OffsetDateTime createAt;

    public Authorization withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 授权ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Authorization withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * 用户ID(或用户组ID)
     * @return accountId
     */
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public Authorization withAccount(String account) {
        this.account = account;
        return this;
    }

    /**
     * 用户名(或用户组名)
     * @return account
     */
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Authorization withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    /**
     * 应用ID (按照组授权时,该字段为空)
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public Authorization withAppName(String appName) {
        this.appName = appName;
        return this;
    }

    /**
     * 应用名称 (按照组授权时,该字段为空)
     * @return appName
     */
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public Authorization withAppGroupId(String appGroupId) {
        this.appGroupId = appGroupId;
        return this;
    }

    /**
     * 应用组ID
     * @return appGroupId
     */
    public String getAppGroupId() {
        return appGroupId;
    }

    public void setAppGroupId(String appGroupId) {
        this.appGroupId = appGroupId;
    }

    public Authorization withAppGroupName(String appGroupName) {
        this.appGroupName = appGroupName;
        return this;
    }

    /**
     * 应用组名称
     * @return appGroupName
     */
    public String getAppGroupName() {
        return appGroupName;
    }

    public void setAppGroupName(String appGroupName) {
        this.appGroupName = appGroupName;
    }

    public Authorization withAuthorizationType(AuthorizationTypeEnum authorizationType) {
        this.authorizationType = authorizationType;
        return this;
    }

    /**
     * Get authorizationType
     * @return authorizationType
     */
    public AuthorizationTypeEnum getAuthorizationType() {
        return authorizationType;
    }

    public void setAuthorizationType(AuthorizationTypeEnum authorizationType) {
        this.authorizationType = authorizationType;
    }

    public Authorization withAccountType(AccountTypeEnum accountType) {
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

    public Authorization withPlatformType(PlatformTypeEnum platformType) {
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

    public Authorization withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * 域名城
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public Authorization withCreateAt(OffsetDateTime createAt) {
        this.createAt = createAt;
        return this;
    }

    /**
     * 发布时间
     * @return createAt
     */
    public OffsetDateTime getCreateAt() {
        return createAt;
    }

    public void setCreateAt(OffsetDateTime createAt) {
        this.createAt = createAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Authorization that = (Authorization) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.accountId, that.accountId)
            && Objects.equals(this.account, that.account) && Objects.equals(this.appId, that.appId)
            && Objects.equals(this.appName, that.appName) && Objects.equals(this.appGroupId, that.appGroupId)
            && Objects.equals(this.appGroupName, that.appGroupName)
            && Objects.equals(this.authorizationType, that.authorizationType)
            && Objects.equals(this.accountType, that.accountType)
            && Objects.equals(this.platformType, that.platformType) && Objects.equals(this.domain, that.domain)
            && Objects.equals(this.createAt, that.createAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            accountId,
            account,
            appId,
            appName,
            appGroupId,
            appGroupName,
            authorizationType,
            accountType,
            platformType,
            domain,
            createAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Authorization {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    account: ").append(toIndentedString(account)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
        sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
        sb.append("    appGroupId: ").append(toIndentedString(appGroupId)).append("\n");
        sb.append("    appGroupName: ").append(toIndentedString(appGroupName)).append("\n");
        sb.append("    authorizationType: ").append(toIndentedString(authorizationType)).append("\n");
        sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
        sb.append("    platformType: ").append(toIndentedString(platformType)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
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
