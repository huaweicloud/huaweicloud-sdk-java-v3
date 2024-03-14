package com.huaweicloud.sdk.organizations.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * 包含有关委托管理员的信息。
 */
public class DelegatedAdministratorDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delegation_enabled_at")

    private OffsetDateTime delegationEnabledAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_id")

    private String accountId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_urn")

    private String accountUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "join_method")

    private String joinMethod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "joined_at")

    private OffsetDateTime joinedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_name")

    private String accountName;

    public DelegatedAdministratorDto withDelegationEnabledAt(OffsetDateTime delegationEnabledAt) {
        this.delegationEnabledAt = delegationEnabledAt;
        return this;
    }

    /**
     * 将账号设置为委托管理员的日期。
     * @return delegationEnabledAt
     */
    public OffsetDateTime getDelegationEnabledAt() {
        return delegationEnabledAt;
    }

    public void setDelegationEnabledAt(OffsetDateTime delegationEnabledAt) {
        this.delegationEnabledAt = delegationEnabledAt;
    }

    public DelegatedAdministratorDto withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    /**
     * 账号的唯一标识符（ID）。
     * @return accountId
     */
    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public DelegatedAdministratorDto withAccountUrn(String accountUrn) {
        this.accountUrn = accountUrn;
        return this;
    }

    /**
     * 账号的统一资源名称。
     * @return accountUrn
     */
    public String getAccountUrn() {
        return accountUrn;
    }

    public void setAccountUrn(String accountUrn) {
        this.accountUrn = accountUrn;
    }

    public DelegatedAdministratorDto withJoinMethod(String joinMethod) {
        this.joinMethod = joinMethod;
        return this;
    }

    /**
     * 账号加入组织的方式,invited：邀请加入，created：创建加入。
     * @return joinMethod
     */
    public String getJoinMethod() {
        return joinMethod;
    }

    public void setJoinMethod(String joinMethod) {
        this.joinMethod = joinMethod;
    }

    public DelegatedAdministratorDto withJoinedAt(OffsetDateTime joinedAt) {
        this.joinedAt = joinedAt;
        return this;
    }

    /**
     * 账号成为组织一部分的日期。
     * @return joinedAt
     */
    public OffsetDateTime getJoinedAt() {
        return joinedAt;
    }

    public void setJoinedAt(OffsetDateTime joinedAt) {
        this.joinedAt = joinedAt;
    }

    public DelegatedAdministratorDto withAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * 账号名称
     * @return accountName
     */
    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DelegatedAdministratorDto that = (DelegatedAdministratorDto) obj;
        return Objects.equals(this.delegationEnabledAt, that.delegationEnabledAt)
            && Objects.equals(this.accountId, that.accountId) && Objects.equals(this.accountUrn, that.accountUrn)
            && Objects.equals(this.joinMethod, that.joinMethod) && Objects.equals(this.joinedAt, that.joinedAt)
            && Objects.equals(this.accountName, that.accountName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(delegationEnabledAt, accountId, accountUrn, joinMethod, joinedAt, accountName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DelegatedAdministratorDto {\n");
        sb.append("    delegationEnabledAt: ").append(toIndentedString(delegationEnabledAt)).append("\n");
        sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
        sb.append("    accountUrn: ").append(toIndentedString(accountUrn)).append("\n");
        sb.append("    joinMethod: ").append(toIndentedString(joinMethod)).append("\n");
        sb.append("    joinedAt: ").append(toIndentedString(joinedAt)).append("\n");
        sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
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
