package com.huaweicloud.sdk.bssintl.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** CreateCustomerV2Req */
public class CreateCustomerV2Req {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email")

    private String email;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verification_code")

    private String verificationCode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_area")

    private String domainArea;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "xaccount_id")

    private String xaccountId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "xaccount_type")

    private String xaccountType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_close_market_ms")

    private String isCloseMarketMs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "include_association_result")

    private Boolean includeAssociationResult;

    public CreateCustomerV2Req withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /** |参数名称：客户的华为云账号名|
     * |参数的约束及描述：该参数非必填，不能以“op_”或“shadow_”开头且不能全为数字。且只允许最大长度64的字符串,如果为空，随机生成。校验规则^[a-zA-Z0-9\\u00c0-\\u00ff-._ ]{0,64}$|
     * 
     * @return domainName */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public CreateCustomerV2Req withEmail(String email) {
        this.email = email;
        return this;
    }

    /** |参数名称：邮箱| |参数的约束及描述：该参数非必填，且只允许最大长度64的字符串,必须含有@,如果接入的是香港站的网关，则该字段必填，否则该字段忽略|
     * 
     * @return email */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public CreateCustomerV2Req withVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
        return this;
    }

    /** |参数名称：验证码| |参数的约束及描述：该参数必填，如果输入的是手机，就是手机验证码，如果输入的是邮箱，就是邮箱验证码|
     * 
     * @return verificationCode */
    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }

    public CreateCustomerV2Req withDomainArea(String domainArea) {
        this.domainArea = domainArea;
        return this;
    }

    /** |国家地区编码| |2位字母|
     * 
     * @return domainArea */
    public String getDomainArea() {
        return domainArea;
    }

    public void setDomainArea(String domainArea) {
        this.domainArea = domainArea;
    }

    public CreateCustomerV2Req withXaccountId(String xaccountId) {
        this.xaccountId = xaccountId;
        return this;
    }

    /** |参数名称：第3方系统的用户唯一标识| |参数的约束及描述：该参数必填，且只允许最大长度128的字符串|
     * 
     * @return xaccountId */
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

    /** |参数名称：华为分给合作伙伴的平台标识| |参数的约束及描述：该参数必填，且只允许最大长度30的字符串,该标识的具体值由华为分配|
     * 
     * @return xaccountType */
    public String getXaccountType() {
        return xaccountType;
    }

    public void setXaccountType(String xaccountType) {
        this.xaccountType = xaccountType;
    }

    public CreateCustomerV2Req withPassword(String password) {
        this.password = password;
        return this;
    }

    /** |参数名称：密码| |参数的约束及描述：该参数选填，长度6~32位字符，至少包含以下四种字符中的两种： 大写字母、小写字母、数字、特殊字符，不能和账号名或倒序的账号名相同，不能包含手机号，不能包含邮箱|
     * 
     * @return password */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public CreateCustomerV2Req withIsCloseMarketMs(String isCloseMarketMs) {
        this.isCloseMarketMs = isCloseMarketMs;
        return this;
    }

    /** |是否关闭营销消息| |参数的约束及描述：该参数选填。false：不关闭，True：关闭，默认不关闭|
     * 
     * @return isCloseMarketMs */
    public String getIsCloseMarketMs() {
        return isCloseMarketMs;
    }

    public void setIsCloseMarketMs(String isCloseMarketMs) {
        this.isCloseMarketMs = isCloseMarketMs;
    }

    public CreateCustomerV2Req withIncludeAssociationResult(Boolean includeAssociationResult) {
        this.includeAssociationResult = includeAssociationResult;
        return this;
    }

    /** |参数名称：是否返回关联结果| |参数的约束及描述：该参数非必填|
     * 
     * @return includeAssociationResult */
    public Boolean getIncludeAssociationResult() {
        return includeAssociationResult;
    }

    public void setIncludeAssociationResult(Boolean includeAssociationResult) {
        this.includeAssociationResult = includeAssociationResult;
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
        return Objects.equals(this.domainName, createCustomerV2Req.domainName)
            && Objects.equals(this.email, createCustomerV2Req.email)
            && Objects.equals(this.verificationCode, createCustomerV2Req.verificationCode)
            && Objects.equals(this.domainArea, createCustomerV2Req.domainArea)
            && Objects.equals(this.xaccountId, createCustomerV2Req.xaccountId)
            && Objects.equals(this.xaccountType, createCustomerV2Req.xaccountType)
            && Objects.equals(this.password, createCustomerV2Req.password)
            && Objects.equals(this.isCloseMarketMs, createCustomerV2Req.isCloseMarketMs)
            && Objects.equals(this.includeAssociationResult, createCustomerV2Req.includeAssociationResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainName,
            email,
            verificationCode,
            domainArea,
            xaccountId,
            xaccountType,
            password,
            isCloseMarketMs,
            includeAssociationResult);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCustomerV2Req {\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    verificationCode: ").append(toIndentedString(verificationCode)).append("\n");
        sb.append("    domainArea: ").append(toIndentedString(domainArea)).append("\n");
        sb.append("    xaccountId: ").append(toIndentedString(xaccountId)).append("\n");
        sb.append("    xaccountType: ").append(toIndentedString(xaccountType)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    isCloseMarketMs: ").append(toIndentedString(isCloseMarketMs)).append("\n");
        sb.append("    includeAssociationResult: ").append(toIndentedString(includeAssociationResult)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
