package com.huaweicloud.sdk.bss.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * NewCustomerV2
 */
public class NewCustomerV2  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="customer_name")
    
    private String customerName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="mobile_phone")
    
    private String mobilePhone;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="use_pri_mobile_phone")
    
    private String usePriMobilePhone;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="password")
    
    private String password;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="verification_code")
    
    private String verificationCode;

    public NewCustomerV2 withCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }

    


    /**
     * 企业子账号登录名。
     * @return customerName
     */
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public NewCustomerV2 withMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
        return this;
    }

    


    /**
     * 企业管理员的手机号码。如果use_pri_mobile_phone取值为Y，则这个参数无效，否则必选。
     * @return mobilePhone
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public NewCustomerV2 withUsePriMobilePhone(String usePriMobilePhone) {
        this.usePriMobilePhone = usePriMobilePhone;
        return this;
    }

    


    /**
     * 是否使用企业主账号手机号码作为子账号手机号码： Y：是N：否（默认值） 当为Y时，mobile_phone输入无效。
     * @return usePriMobilePhone
     */
    public String getUsePriMobilePhone() {
        return usePriMobilePhone;
    }

    public void setUsePriMobilePhone(String usePriMobilePhone) {
        this.usePriMobilePhone = usePriMobilePhone;
    }

    public NewCustomerV2 withPassword(String password) {
        this.password = password;
        return this;
    }

    


    /**
     * 企业子账号的登录密码。
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public NewCustomerV2 withVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
        return this;
    }

    


    /**
     * 验证码，只有输入企业子账号的手机号的情况下，才需要填写该字段。 具体请参见发送短信验证码。
     * @return verificationCode
     */
    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        NewCustomerV2 newCustomerV2 = (NewCustomerV2) o;
        return Objects.equals(this.customerName, newCustomerV2.customerName) &&
            Objects.equals(this.mobilePhone, newCustomerV2.mobilePhone) &&
            Objects.equals(this.usePriMobilePhone, newCustomerV2.usePriMobilePhone) &&
            Objects.equals(this.password, newCustomerV2.password) &&
            Objects.equals(this.verificationCode, newCustomerV2.verificationCode);
    }
    @Override
    public int hashCode() {
        return Objects.hash(customerName, mobilePhone, usePriMobilePhone, password, verificationCode);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NewCustomerV2 {\n");
        sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
        sb.append("    mobilePhone: ").append(toIndentedString(mobilePhone)).append("\n");
        sb.append("    usePriMobilePhone: ").append(toIndentedString(usePriMobilePhone)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    verificationCode: ").append(toIndentedString(verificationCode)).append("\n");
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

