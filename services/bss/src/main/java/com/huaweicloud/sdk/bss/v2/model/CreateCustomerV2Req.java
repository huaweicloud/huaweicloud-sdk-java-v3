package com.huaweicloud.sdk.bss.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CreateCustomerV2Req
 */
public class CreateCustomerV2Req {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mobile_phone")

    private String mobilePhone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "verification_code")

    private String verificationCode;

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
    @JsonProperty(value = "cooperation_type")

    private String cooperationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "indirect_partner_id")

    private String indirectPartnerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "include_association_result")

    private Boolean includeAssociationResult;

    public CreateCustomerV2Req withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * 客户的华为云账号名。 如果为空，随机生成。 不能以“op_”或“shadow_”开头且不能全为数字。 校验长度（5到32位）和规则^([a-zA-Z_-]([a-zA-Z0-9_-])*)$。 此参数不携带或携带值为空串或携带值为null时，随机生成。
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public CreateCustomerV2Req withMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
        return this;
    }

    /**
     * 手机号。 目前系统只支持中国的手机号。 示例：13XXXXXXXXX 此参数不携带或携带值为null时，不被赋值；携带值为空串时，赋值为空串。
     * @return mobilePhone
     */
    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public CreateCustomerV2Req withVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
        return this;
    }

    /**
     * 验证码。 请调用“发送验证码”接口获取。 如果手机号不存在，则不需要输入验证码。 此参数不携带或携带值为null时，不做处理；不支持携带值为空串。
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
     * 伙伴销售平台的用户唯一标识，该标识的具体值由伙伴分配。
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
     * 华为分给合作伙伴的平台标识。 该标识的具体值由华为分配。获取方法请参见如何获取xaccountType的取值。
     * @return xaccountType
     */
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

    /**
     * 密码规则如下： 至少包含以下四种字符中的两种： 大写字母、小写字母、数字、特殊字符；不能和账号名或倒序的账号名相同；不能包含手机号。 如果为空，用户没有密码，则不能直接在华为云登录，只能通过伙伴系统SSO方式跳转到华为云。 此参数不携带或携带值为null时，密码随机生成；不支持携带值为空串。
     * @return password
     */
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

    /**
     * 是否关闭营销消息的发送。 true：关闭false：不关闭（默认） 此参数不携带或携带值为空串或携带值为null时，赋值为false。
     * @return isCloseMarketMs
     */
    public String getIsCloseMarketMs() {
        return isCloseMarketMs;
    }

    public void setIsCloseMarketMs(String isCloseMarketMs) {
        this.isCloseMarketMs = isCloseMarketMs;
    }

    public CreateCustomerV2Req withCooperationType(String cooperationType) {
        this.cooperationType = cooperationType;
        return this;
    }

    /**
     * 合作类型。 1：顾问销售。 不传递或传递非1的值，默认会创建成代售模式的客户。(字段预下线，新用户不再提供)
     * @return cooperationType
     */
    public String getCooperationType() {
        return cooperationType;
    }

    public void setCooperationType(String cooperationType) {
        this.cooperationType = cooperationType;
    }

    public CreateCustomerV2Req withIndirectPartnerId(String indirectPartnerId) {
        this.indirectPartnerId = indirectPartnerId;
        return this;
    }

    /**
     * 云经销商ID。获取方法请参见[查询云经销商列表](https://support.huaweicloud.com/api-bpconsole/espp_00003.html)。 如果需要创建云经销商的子客户，必须携带该字段。除此之外，此参数不做处理。
     * @return indirectPartnerId
     */
    public String getIndirectPartnerId() {
        return indirectPartnerId;
    }

    public void setIndirectPartnerId(String indirectPartnerId) {
        this.indirectPartnerId = indirectPartnerId;
    }

    public CreateCustomerV2Req withIncludeAssociationResult(Boolean includeAssociationResult) {
        this.includeAssociationResult = includeAssociationResult;
        return this;
    }

    /**
     * 是否返回子客户的关联结果。 true：返回子客户和伙伴的关联结果false：不返回子客户和伙伴的关联结果 默认值为false。 此参数不携带或携带值为空串或携带值为null时，赋值为false。
     * @return includeAssociationResult
     */
    public Boolean getIncludeAssociationResult() {
        return includeAssociationResult;
    }

    public void setIncludeAssociationResult(Boolean includeAssociationResult) {
        this.includeAssociationResult = includeAssociationResult;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateCustomerV2Req that = (CreateCustomerV2Req) obj;
        return Objects.equals(this.domainName, that.domainName) && Objects.equals(this.mobilePhone, that.mobilePhone)
            && Objects.equals(this.verificationCode, that.verificationCode)
            && Objects.equals(this.xaccountId, that.xaccountId) && Objects.equals(this.xaccountType, that.xaccountType)
            && Objects.equals(this.password, that.password)
            && Objects.equals(this.isCloseMarketMs, that.isCloseMarketMs)
            && Objects.equals(this.cooperationType, that.cooperationType)
            && Objects.equals(this.indirectPartnerId, that.indirectPartnerId)
            && Objects.equals(this.includeAssociationResult, that.includeAssociationResult);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainName,
            mobilePhone,
            verificationCode,
            xaccountId,
            xaccountType,
            password,
            isCloseMarketMs,
            cooperationType,
            indirectPartnerId,
            includeAssociationResult);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCustomerV2Req {\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    mobilePhone: ").append(toIndentedString(mobilePhone)).append("\n");
        sb.append("    verificationCode: ").append(toIndentedString(verificationCode)).append("\n");
        sb.append("    xaccountId: ").append(toIndentedString(xaccountId)).append("\n");
        sb.append("    xaccountType: ").append(toIndentedString(xaccountType)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    isCloseMarketMs: ").append(toIndentedString(isCloseMarketMs)).append("\n");
        sb.append("    cooperationType: ").append(toIndentedString(cooperationType)).append("\n");
        sb.append("    indirectPartnerId: ").append(toIndentedString(indirectPartnerId)).append("\n");
        sb.append("    includeAssociationResult: ").append(toIndentedString(includeAssociationResult)).append("\n");
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
