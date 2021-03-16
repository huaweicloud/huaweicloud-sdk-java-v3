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
    @JsonProperty(value="domain_name")
    
    private String domainName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="mobile_phone")
    
    private String mobilePhone;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="verification_code")
    
    private String verificationCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="xaccount_id")
    
    private String xaccountId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="xaccount_type")
    
    private String xaccountType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="password")
    
    private String password;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_close_market_ms")
    
    private String isCloseMarketMs;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cooperation_type")
    
    private String cooperationType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="indirect_partner_id")
    
    private String indirectPartnerId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="include_association_result")
    
    private Boolean includeAssociationResult;

    public CreateCustomerV2Req withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    


    /**
     * 客户的华为云账号名。 如果为空，随机生成。 不能以“op_”或“shadow_”开头且不能全为数字。 校验长度（5到32位）和规则^([a-zA-Z_-]([a-zA-Z0-9_-])*)$。
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
     * 手机号。 目前系统只支持中国的手机号。 示例：13XXXXXXXXX
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
     * 验证码。 请调用“发送验证码”接口获取。 如果手机号不存在，则不需要输入验证码。
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
     * 密码规则如下： 至少包含以下四种字符中的两种： 大写字母、小写字母、数字、特殊字符；不能和账号名或倒序的账号名相同；不能包含手机号。 如果为空，用户没有密码，则不能直接在华为云登录，只能通过伙伴系统SSO方式跳转到华为云。
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

    

    public CreateCustomerV2Req withCooperationType(String cooperationType) {
        this.cooperationType = cooperationType;
        return this;
    }

    


    /**
     * 合作类型。 1：推荐。 仅仅支持1，如果不传递，默认会创建成垫付模式的客户。
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
     * 精英服务商ID。
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateCustomerV2Req createCustomerV2Req = (CreateCustomerV2Req) o;
        return Objects.equals(this.domainName, createCustomerV2Req.domainName) &&
            Objects.equals(this.mobilePhone, createCustomerV2Req.mobilePhone) &&
            Objects.equals(this.verificationCode, createCustomerV2Req.verificationCode) &&
            Objects.equals(this.xaccountId, createCustomerV2Req.xaccountId) &&
            Objects.equals(this.xaccountType, createCustomerV2Req.xaccountType) &&
            Objects.equals(this.password, createCustomerV2Req.password) &&
            Objects.equals(this.isCloseMarketMs, createCustomerV2Req.isCloseMarketMs) &&
            Objects.equals(this.cooperationType, createCustomerV2Req.cooperationType) &&
            Objects.equals(this.indirectPartnerId, createCustomerV2Req.indirectPartnerId) &&
            Objects.equals(this.includeAssociationResult, createCustomerV2Req.includeAssociationResult);
    }
    @Override
    public int hashCode() {
        return Objects.hash(domainName, mobilePhone, verificationCode, xaccountId, xaccountType, password, isCloseMarketMs, cooperationType, indirectPartnerId, includeAssociationResult);
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

