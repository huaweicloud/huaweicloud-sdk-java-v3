package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * IndirectPartnerInfo
 */
public class IndirectPartnerInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "indirect_partner_id")

    private String indirectPartnerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mobile_phone")

    private String mobilePhone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email")

    private String email;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_name")

    private String accountName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associated_on")

    private String associatedOn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_manager_id")

    private String accountManagerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_manager_name")

    private String accountManagerName;

    public IndirectPartnerInfo withIndirectPartnerId(String indirectPartnerId) {
        this.indirectPartnerId = indirectPartnerId;
        return this;
    }

    /**
     * 精英服务商ID。
     * @return indirectPartnerId
     */
    public String getIndirectPartnerId() {
        return indirectPartnerId;
    }

    public void setIndirectPartnerId(String indirectPartnerId) {
        this.indirectPartnerId = indirectPartnerId;
    }

    public IndirectPartnerInfo withMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
        return this;
    }

    /**
     * 精英服务商的手机号码。
     * @return mobilePhone
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public IndirectPartnerInfo withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * 精英服务商的邮箱。
     * @return email
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public IndirectPartnerInfo withAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * 精英服务商的账户名。
     * @return accountName
     */
    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public IndirectPartnerInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 精英服务商的名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IndirectPartnerInfo withAssociatedOn(String associatedOn) {
        this.associatedOn = associatedOn;
        return this;
    }

    /**
     * 精英服务商关联华为云伙伴能力中心的时间。 UTC时间（包括时区），例如2016-03-28T00:00:00Z。
     * @return associatedOn
     */
    public String getAssociatedOn() {
        return associatedOn;
    }

    public void setAssociatedOn(String associatedOn) {
        this.associatedOn = associatedOn;
    }

    public IndirectPartnerInfo withAccountManagerId(String accountManagerId) {
        this.accountManagerId = accountManagerId;
        return this;
    }

    /**
     * 客户经理登录账户名。
     * @return accountManagerId
     */
    public String getAccountManagerId() {
        return accountManagerId;
    }

    public void setAccountManagerId(String accountManagerId) {
        this.accountManagerId = accountManagerId;
    }

    public IndirectPartnerInfo withAccountManagerName(String accountManagerName) {
        this.accountManagerName = accountManagerName;
        return this;
    }

    /**
     * 客户经理的名称。
     * @return accountManagerName
     */
    public String getAccountManagerName() {
        return accountManagerName;
    }

    public void setAccountManagerName(String accountManagerName) {
        this.accountManagerName = accountManagerName;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IndirectPartnerInfo indirectPartnerInfo = (IndirectPartnerInfo) o;
        return Objects.equals(this.indirectPartnerId, indirectPartnerInfo.indirectPartnerId)
            && Objects.equals(this.mobilePhone, indirectPartnerInfo.mobilePhone)
            && Objects.equals(this.email, indirectPartnerInfo.email)
            && Objects.equals(this.accountName, indirectPartnerInfo.accountName)
            && Objects.equals(this.name, indirectPartnerInfo.name)
            && Objects.equals(this.associatedOn, indirectPartnerInfo.associatedOn)
            && Objects.equals(this.accountManagerId, indirectPartnerInfo.accountManagerId)
            && Objects.equals(this.accountManagerName, indirectPartnerInfo.accountManagerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(indirectPartnerId,
            mobilePhone,
            email,
            accountName,
            name,
            associatedOn,
            accountManagerId,
            accountManagerName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class IndirectPartnerInfo {\n");
        sb.append("    indirectPartnerId: ").append(toIndentedString(indirectPartnerId)).append("\n");
        sb.append("    mobilePhone: ").append(toIndentedString(mobilePhone)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    associatedOn: ").append(toIndentedString(associatedOn)).append("\n");
        sb.append("    accountManagerId: ").append(toIndentedString(accountManagerId)).append("\n");
        sb.append("    accountManagerName: ").append(toIndentedString(accountManagerName)).append("\n");
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
