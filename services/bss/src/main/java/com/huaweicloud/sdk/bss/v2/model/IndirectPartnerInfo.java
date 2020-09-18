package com.huaweicloud.sdk.bss.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * IndirectPartnerInfo
 */
public class IndirectPartnerInfo  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="indirect_partner_id")
    
    private String indirectPartnerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="mobile_phone")
    
    private String mobilePhone;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="email")
    
    private String email;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="account_name")
    
    private String accountName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="associated_on")
    
    private String associatedOn;

    public IndirectPartnerInfo withIndirectPartnerId(String indirectPartnerId) {
        this.indirectPartnerId = indirectPartnerId;
        return this;
    }

    


    /**
     * |参数名称：二级经销商ID| |参数约束及描述：二级经销商ID|
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
     * |参数名称：手机号码| |参数约束及描述：手机号码|
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
     * |参数名称：邮箱| |参数约束及描述：邮箱|
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
     * |参数名称：二级经销商的账户名| |参数约束及描述：二级经销商的账户名|
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
     * |参数名称：二级经销商名称| |参数约束及描述：二级经销商名称|
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
     * |参数名称：关联时间，UTC时间（包括时区），比如2016-03-28T00:00:00Z| |参数约束及描述：关联时间，UTC时间（包括时区），比如2016-03-28T00:00:00Z|
     * @return associatedOn
     */
    public String getAssociatedOn() {
        return associatedOn;
    }

    public void setAssociatedOn(String associatedOn) {
        this.associatedOn = associatedOn;
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
        return Objects.equals(this.indirectPartnerId, indirectPartnerInfo.indirectPartnerId) &&
            Objects.equals(this.mobilePhone, indirectPartnerInfo.mobilePhone) &&
            Objects.equals(this.email, indirectPartnerInfo.email) &&
            Objects.equals(this.accountName, indirectPartnerInfo.accountName) &&
            Objects.equals(this.name, indirectPartnerInfo.name) &&
            Objects.equals(this.associatedOn, indirectPartnerInfo.associatedOn);
    }
    @Override
    public int hashCode() {
        return Objects.hash(indirectPartnerId, mobilePhone, email, accountName, name, associatedOn);
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

