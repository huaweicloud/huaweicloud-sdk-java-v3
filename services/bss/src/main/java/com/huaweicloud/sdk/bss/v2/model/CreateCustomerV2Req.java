package com.huaweicloud.sdk.bss.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CreateCustomerV2Req
 */
public class CreateCustomerV2Req  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cooperation_type")
    
    private String cooperationType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain_name")
    
    private String domainName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="indirect_partner_id")
    
    private String indirectPartnerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_close_market_ms")
    
    private String isCloseMarketMs = "false";


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="mobile_phone")
    
    private String mobilePhone;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="password")
    
    private String password;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="verification_code")
    
    private String verificationCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="xaccount_id")
    
    private String xaccountId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="xaccount_type")
    
    private String xaccountType;

    public CreateCustomerV2Req withCooperationType(String cooperationType) {
        this.cooperationType = cooperationType;
        return this;
    }

    


    /**
     * |合作类型| |参数的约束及描述：该参数选填。1：推荐。仅仅支持1|
     * @return cooperationType
     */
    public String getCooperationType() {
        return cooperationType;
    }

    public void setCooperationType(String cooperationType) {
        this.cooperationType = cooperationType;
    }

    public CreateCustomerV2Req withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    


    /**
     * |参数名称：客户的华为云账号名| |参数的约束及描述：该参数非必填，不能以“op_”或“shadow_”开头且不能全为数字。且只允许最大长度64的字符串,如果为空，随机生成。校验规则^[a-zA-Z0-9\\u00c0-\\u00ff-._ ]{0,64}$|
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public CreateCustomerV2Req withIndirectPartnerId(String indirectPartnerId) {
        this.indirectPartnerId = indirectPartnerId;
        return this;
    }

    


    /**
     * |参数名称：二级渠道ID| |参数的约束及描述：该参数非必填，二级渠道ID，最大长度64|
     * @return indirectPartnerId
     */
    public String getIndirectPartnerId() {
        return indirectPartnerId;
    }

    public void setIndirectPartnerId(String indirectPartnerId) {
        this.indirectPartnerId = indirectPartnerId;
    }

    public CreateCustomerV2Req withIsCloseMarketMs(String isCloseMarketMs) {
        this.isCloseMarketMs = isCloseMarketMs;
        return this;
    }

    


    /**
     * |是否关闭营销消息| |参数的约束及描述：该参数选填。false：不关闭，True：关闭，默认不关闭|
     * @return isCloseMarketMs
     */
    public String getIsCloseMarketMs() {
        return isCloseMarketMs;
    }

    public void setIsCloseMarketMs(String isCloseMarketMs) {
        this.isCloseMarketMs = isCloseMarketMs;
    }

    public CreateCustomerV2Req withMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
        return this;
    }

    


    /**
     * |参数名称：手机号| |参数的约束及描述：如果接入的是华北站点，该字段必填，否则该字段忽略目前系统只支持中国手机，必须全部是数字。示例：13XXXXXXXXX|
     * @return mobilePhone
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public CreateCustomerV2Req withPassword(String password) {
        this.password = password;
        return this;
    }

    


    /**
     * |参数名称：密码| |参数的约束及描述：该参数选填，长度6~32位字符，至少包含以下四种字符中的两种： 大写字母、小写字母、数字、特殊字符，不能和账号名或倒序的账号名相同，不能包含手机号，不能包含邮箱|
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public CreateCustomerV2Req withVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
        return this;
    }

    


    /**
     * |参数名称：验证码| |参数的约束及描述：该参数必填，如果输入的是手机，就是手机验证码，如果输入的是邮箱，就是邮箱验证码|
     * @return verificationCode
     */
    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }

    public CreateCustomerV2Req withXaccountId(String xaccountId) {
        this.xaccountId = xaccountId;
        return this;
    }

    


    /**
     * |参数名称：第3方系统的用户唯一标识| |参数的约束及描述：该参数必填，且只允许最大长度128的字符串|
     * @return xaccountId
     */
    public String getXaccountId() {
        return xaccountId;
    }

    public void setXaccountId(String xaccountId) {
        this.xaccountId = xaccountId;
    }

    public CreateCustomerV2Req withXaccountType(String xaccountType) {
        this.xaccountType = xaccountType;
        return this;
    }

    


    /**
     * |参数名称：华为分给合作伙伴的平台标识| |参数的约束及描述：该参数必填，且只允许最大长度30的字符串,该标识的具体值由华为分配|
     * @return xaccountType
     */
    public String getXaccountType() {
        return xaccountType;
    }

    public void setXaccountType(String xaccountType) {
        this.xaccountType = xaccountType;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateCustomerV2Req createCustomerV2Req = (CreateCustomerV2Req) o;
        return Objects.equals(this.cooperationType, createCustomerV2Req.cooperationType) &&
            Objects.equals(this.domainName, createCustomerV2Req.domainName) &&
            Objects.equals(this.indirectPartnerId, createCustomerV2Req.indirectPartnerId) &&
            Objects.equals(this.isCloseMarketMs, createCustomerV2Req.isCloseMarketMs) &&
            Objects.equals(this.mobilePhone, createCustomerV2Req.mobilePhone) &&
            Objects.equals(this.password, createCustomerV2Req.password) &&
            Objects.equals(this.verificationCode, createCustomerV2Req.verificationCode) &&
            Objects.equals(this.xaccountId, createCustomerV2Req.xaccountId) &&
            Objects.equals(this.xaccountType, createCustomerV2Req.xaccountType);
    }
    @Override
    public int hashCode() {
        return Objects.hash(cooperationType, domainName, indirectPartnerId, isCloseMarketMs, mobilePhone, password, verificationCode, xaccountId, xaccountType);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCustomerV2Req {\n");
        sb.append("    cooperationType: ").append(toIndentedString(cooperationType)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    indirectPartnerId: ").append(toIndentedString(indirectPartnerId)).append("\n");
        sb.append("    isCloseMarketMs: ").append(toIndentedString(isCloseMarketMs)).append("\n");
        sb.append("    mobilePhone: ").append(toIndentedString(mobilePhone)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    verificationCode: ").append(toIndentedString(verificationCode)).append("\n");
        sb.append("    xaccountId: ").append(toIndentedString(xaccountId)).append("\n");
        sb.append("    xaccountType: ").append(toIndentedString(xaccountType)).append("\n");
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

