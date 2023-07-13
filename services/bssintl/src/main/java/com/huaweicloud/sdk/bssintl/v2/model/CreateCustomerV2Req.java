package com.huaweicloud.sdk.bssintl.v2.model;

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
     * 客户的华为云账号名。 如果为空，随机生成。 不能以“op_”或“shadow_”开头且不能全为数字。 校验长度（5到32位）和规则^\\(\\[a-zA-Z_-\\]\\(\\[a-zA-Z0-9_-\\]\\)\\*\\)$。
     * @return domainName
     */
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

    /**
     * 邮箱地址。 格式：必须含有@。
     * @return email
     */
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

    /**
     * 验证码。 请调用“发送验证码”接口获取。 如果邮箱不存在，不需要输入验证码。
     * @return verificationCode
     */
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

    /**
     * 客户所属国家地区的两位字母编号。该字母编号遵循ISO 3166标准。 例如：墨西哥 MX
     * @return domainArea
     */
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
     * 华为分给合作伙伴的平台标识。 该标识的具体值由华为分配。获取方法请参见[如何获取xaccountType的取值](https://support.huaweicloud.com/intl/zh-cn/api-bpconsole/bpconsole_apifaq_00002.html)。
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
     * 密码规则如下： 至少包含以下四种字符中的两种： 大写字母、小写字母、数字、特殊字符；不能和账号名或倒序的账号名相同；不能包含邮箱。 如果为空，用户没有密码，则不能直接在华为云登录，只能通过伙伴系统SSO方式跳转到华为云。
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
     * 是否关闭营销消息的发送： true：关闭false：不关闭（默认）
     * @return isCloseMarketMs
     */
    public String getIsCloseMarketMs() {
        return isCloseMarketMs;
    }

    public void setIsCloseMarketMs(String isCloseMarketMs) {
        this.isCloseMarketMs = isCloseMarketMs;
    }

    public CreateCustomerV2Req withIndirectPartnerId(String indirectPartnerId) {
        this.indirectPartnerId = indirectPartnerId;
        return this;
    }

    /**
     * 云经销商ID。获取方法请参见查询云经销商列表。 如果需要创建云经销商的子客户，必须携带该字段。除此之外，此参数不做处理。
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
     * 是否返回子客户的关联结果。 true：返回子客户和伙伴的关联结果false：不返回子客户和伙伴的关联结果 默认值为false。
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
        return Objects.equals(this.domainName, that.domainName) && Objects.equals(this.email, that.email)
            && Objects.equals(this.verificationCode, that.verificationCode)
            && Objects.equals(this.domainArea, that.domainArea) && Objects.equals(this.xaccountId, that.xaccountId)
            && Objects.equals(this.xaccountType, that.xaccountType) && Objects.equals(this.password, that.password)
            && Objects.equals(this.isCloseMarketMs, that.isCloseMarketMs)
            && Objects.equals(this.indirectPartnerId, that.indirectPartnerId)
            && Objects.equals(this.includeAssociationResult, that.includeAssociationResult);
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
            indirectPartnerId,
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
