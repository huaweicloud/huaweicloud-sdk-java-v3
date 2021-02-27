package com.huaweicloud.sdk.bss.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * BankCardInfoV2
 */
public class BankCardInfoV2  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bank_account")
    
    private String bankAccount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="areacode")
    
    private String areacode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="mobile")
    
    private String mobile;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="verification_code")
    
    private String verificationCode;

    public BankCardInfoV2 withBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
        return this;
    }

    


    /**
     * 银行卡账号。 当identifyType为4时，不能为空。 银行账号输入规则：^[0-9a-zA-Z]，可以包含特殊横杠（-）字符。
     * @return bankAccount
     */
    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public BankCardInfoV2 withAreacode(String areacode) {
        this.areacode = areacode;
        return this;
    }

    


    /**
     * 国家/区号码。 例如：0086：中国大陆区号码。
     * @return areacode
     */
    public String getAreacode() {
        return areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode;
    }

    public BankCardInfoV2 withMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    


    /**
     * 手机号码。
     * @return mobile
     */
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public BankCardInfoV2 withVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
        return this;
    }

    


    /**
     * 验证码。 请调用“发送验证码”接口获取。 如果手机号不存在，则不需要输入验证码。
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
        BankCardInfoV2 bankCardInfoV2 = (BankCardInfoV2) o;
        return Objects.equals(this.bankAccount, bankCardInfoV2.bankAccount) &&
            Objects.equals(this.areacode, bankCardInfoV2.areacode) &&
            Objects.equals(this.mobile, bankCardInfoV2.mobile) &&
            Objects.equals(this.verificationCode, bankCardInfoV2.verificationCode);
    }
    @Override
    public int hashCode() {
        return Objects.hash(bankAccount, areacode, mobile, verificationCode);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BankCardInfoV2 {\n");
        sb.append("    bankAccount: ").append(toIndentedString(bankAccount)).append("\n");
        sb.append("    areacode: ").append(toIndentedString(areacode)).append("\n");
        sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
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

