package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CustomerInformation
 */
public class CustomerInformation {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer")

    private String customer;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_name")

    private String accountName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_id")

    private String customerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associated_on")

    private String associatedOn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "association_type")

    private String associationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "label")

    private String label;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "telephone")

    private String telephone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verified_status")

    private String verifiedStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "country_code")

    private String countryCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_type")

    private Integer customerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_frozen")

    private Integer isFrozen;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account_managers")

    private List<AccountManager> accountManagers = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "xaccount_id")

    private String xaccountId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "xaccount_type")

    private String xaccountType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customer_level")

    private String customerLevel;

    public CustomerInformation withCustomer(String customer) {
        this.customer = customer;
        return this;
    }

    /**
     * 实名认证名称。
     * @return customer
     */
    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public CustomerInformation withAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * 客户经理登录名称。
     * @return accountName
     */
    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public CustomerInformation withCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }

    /**
     * 客户账号ID。
     * @return customerId
     */
    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public CustomerInformation withAssociatedOn(String associatedOn) {
        this.associatedOn = associatedOn;
        return this;
    }

    /**
     * 客户和伙伴关联时间。 UTC时间，格式：yyyy-MM-dd'T'HH:mm:ss'Z'，如“2019-05-06T08:05:01Z”，其中，HH范围是0～23，mm和ss范围是0～59。
     * @return associatedOn
     */
    public String getAssociatedOn() {
        return associatedOn;
    }

    public void setAssociatedOn(String associatedOn) {
        this.associatedOn = associatedOn;
    }

    public CustomerInformation withAssociationType(String associationType) {
        this.associationType = associationType;
        return this;
    }

    /**
     * 关联类型： 1：顾问销售3：转售
     * @return associationType
     */
    public String getAssociationType() {
        return associationType;
    }

    public void setAssociationType(String associationType) {
        this.associationType = associationType;
    }

    public CustomerInformation withLabel(String label) {
        this.label = label;
        return this;
    }

    /**
     * 标签。
     * @return label
     */
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public CustomerInformation withTelephone(String telephone) {
        this.telephone = telephone;
        return this;
    }

    /**
     * 客户电话号码。
     * @return telephone
     */
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public CustomerInformation withVerifiedStatus(String verifiedStatus) {
        this.verifiedStatus = verifiedStatus;
        return this;
    }

    /**
     * 实名认证状态： -1：未实名认证0：实名认证审核中1：实名认证不通过2：已实名认证3：实名认证失败
     * @return verifiedStatus
     */
    public String getVerifiedStatus() {
        return verifiedStatus;
    }

    public void setVerifiedStatus(String verifiedStatus) {
        this.verifiedStatus = verifiedStatus;
    }

    public CustomerInformation withCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * 国家码，电话号码的国家码前缀。 例如：中国 0086。
     * @return countryCode
     */
    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public CustomerInformation withCustomerType(Integer customerType) {
        this.customerType = customerType;
        return this;
    }

    /**
     * 客户类型： -1：无类型0：个人1：企业 客户刚注册的时候，没有具体的客户类型，为“-1：无类型”，客户可以在账号中心通过设置客户类型或者在实名认证的时候，选择对应的企业/个人实名认证来决定自己的类型。
     * @return customerType
     */
    public Integer getCustomerType() {
        return customerType;
    }

    public void setCustomerType(Integer customerType) {
        this.customerType = customerType;
    }

    public CustomerInformation withIsFrozen(Integer isFrozen) {
        this.isFrozen = isFrozen;
        return this;
    }

    /**
     * 是否冻结： 0：否1：是
     * @return isFrozen
     */
    public Integer getIsFrozen() {
        return isFrozen;
    }

    public void setIsFrozen(Integer isFrozen) {
        this.isFrozen = isFrozen;
    }

    public CustomerInformation withAccountManagers(List<AccountManager> accountManagers) {
        this.accountManagers = accountManagers;
        return this;
    }

    public CustomerInformation addAccountManagersItem(AccountManager accountManagersItem) {
        if (this.accountManagers == null) {
            this.accountManagers = new ArrayList<>();
        }
        this.accountManagers.add(accountManagersItem);
        return this;
    }

    public CustomerInformation withAccountManagers(Consumer<List<AccountManager>> accountManagersSetter) {
        if (this.accountManagers == null) {
            this.accountManagers = new ArrayList<>();
        }
        accountManagersSetter.accept(this.accountManagers);
        return this;
    }

    /**
     * 该客户对应的客户经理信息，目前只支持1个，具体参见表2。
     * @return accountManagers
     */
    public List<AccountManager> getAccountManagers() {
        return accountManagers;
    }

    public void setAccountManagers(List<AccountManager> accountManagers) {
        this.accountManagers = accountManagers;
    }

    public CustomerInformation withXaccountId(String xaccountId) {
        this.xaccountId = xaccountId;
        return this;
    }

    /**
     * 伙伴销售平台的用户唯一标识，该标识的具体值由伙伴分配。
     * @return xaccountId
     */
    public String getXaccountId() {
        return xaccountId;
    }

    public void setXaccountId(String xaccountId) {
        this.xaccountId = xaccountId;
    }

    public CustomerInformation withXaccountType(String xaccountType) {
        this.xaccountType = xaccountType;
        return this;
    }

    /**
     * 华为分配给合作伙伴的平台标识。 该标识的具体值由华为分配。获取方法请参见如何获取xaccountType的取值。
     * @return xaccountType
     */
    public String getXaccountType() {
        return xaccountType;
    }

    public void setXaccountType(String xaccountType) {
        this.xaccountType = xaccountType;
    }

    public CustomerInformation withCustomerLevel(String customerLevel) {
        this.customerLevel = customerLevel;
        return this;
    }

    /**
     * 客户等级。 V0 V1 V2 V3 V4 V5
     * @return customerLevel
     */
    public String getCustomerLevel() {
        return customerLevel;
    }

    public void setCustomerLevel(String customerLevel) {
        this.customerLevel = customerLevel;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CustomerInformation that = (CustomerInformation) obj;
        return Objects.equals(this.customer, that.customer) && Objects.equals(this.accountName, that.accountName)
            && Objects.equals(this.customerId, that.customerId) && Objects.equals(this.associatedOn, that.associatedOn)
            && Objects.equals(this.associationType, that.associationType) && Objects.equals(this.label, that.label)
            && Objects.equals(this.telephone, that.telephone)
            && Objects.equals(this.verifiedStatus, that.verifiedStatus)
            && Objects.equals(this.countryCode, that.countryCode)
            && Objects.equals(this.customerType, that.customerType) && Objects.equals(this.isFrozen, that.isFrozen)
            && Objects.equals(this.accountManagers, that.accountManagers)
            && Objects.equals(this.xaccountId, that.xaccountId) && Objects.equals(this.xaccountType, that.xaccountType)
            && Objects.equals(this.customerLevel, that.customerLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customer,
            accountName,
            customerId,
            associatedOn,
            associationType,
            label,
            telephone,
            verifiedStatus,
            countryCode,
            customerType,
            isFrozen,
            accountManagers,
            xaccountId,
            xaccountType,
            customerLevel);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CustomerInformation {\n");
        sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
        sb.append("    accountName: ").append(toIndentedString(accountName)).append("\n");
        sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
        sb.append("    associatedOn: ").append(toIndentedString(associatedOn)).append("\n");
        sb.append("    associationType: ").append(toIndentedString(associationType)).append("\n");
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
        sb.append("    telephone: ").append(toIndentedString(telephone)).append("\n");
        sb.append("    verifiedStatus: ").append(toIndentedString(verifiedStatus)).append("\n");
        sb.append("    countryCode: ").append(toIndentedString(countryCode)).append("\n");
        sb.append("    customerType: ").append(toIndentedString(customerType)).append("\n");
        sb.append("    isFrozen: ").append(toIndentedString(isFrozen)).append("\n");
        sb.append("    accountManagers: ").append(toIndentedString(accountManagers)).append("\n");
        sb.append("    xaccountId: ").append(toIndentedString(xaccountId)).append("\n");
        sb.append("    xaccountType: ").append(toIndentedString(xaccountType)).append("\n");
        sb.append("    customerLevel: ").append(toIndentedString(customerLevel)).append("\n");
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
