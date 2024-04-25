package com.huaweicloud.sdk.scm.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PurchaseCertificateRequestBody
 */
public class PurchaseCertificateRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cert_brand")

    private String certBrand;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cert_type")

    private String certType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_type")

    private String domainType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "effective_time")

    private Integer effectiveTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_numbers")

    private Integer domainNumbers;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_number")

    private Integer orderNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agree_privacy_protection")

    private Boolean agreePrivacyProtection;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "primary_domain_type")

    private String primaryDomainType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "single_domain_number")

    private Integer singleDomainNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wildcard_domain_number")

    private Integer wildcardDomainNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_auto_pay")

    private Boolean isAutoPay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    public PurchaseCertificateRequestBody withCertBrand(String certBrand) {
        this.certBrand = certBrand;
        return this;
    }

    /**
     * 证书品牌，取值如下： - GEOTRUST - GLOBALSIGN - SYMANTEC - CFCA - TRUSTASIA - VTRUS
     * @return certBrand
     */
    public String getCertBrand() {
        return certBrand;
    }

    public void setCertBrand(String certBrand) {
        this.certBrand = certBrand;
    }

    public PurchaseCertificateRequestBody withCertType(String certType) {
        this.certType = certType;
        return this;
    }

    /**
     * 证书类型，取值如下： - DV_SSL_CERT - DV_SSL_CERT_BASIC - EV_SSL_CERT - EV_SSL_CERT_PRO - OV_SSL_CERT - OV_SSL_CERT_PRO
     * @return certType
     */
    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType;
    }

    public PurchaseCertificateRequestBody withDomainType(String domainType) {
        this.domainType = domainType;
        return this;
    }

    /**
     * 域名类型，取值如下： - SINGLE_DOMAIN：单域名类型。 - MULTI_DOMAIN：多域名类型。 - WILDCARD：泛域名类型。
     * @return domainType
     */
    public String getDomainType() {
        return domainType;
    }

    public void setDomainType(String domainType) {
        this.domainType = domainType;
    }

    public PurchaseCertificateRequestBody withEffectiveTime(Integer effectiveTime) {
        this.effectiveTime = effectiveTime;
        return this;
    }

    /**
     * 证书有效期（年）。
     * minimum: 1
     * maximum: 3
     * @return effectiveTime
     */
    public Integer getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(Integer effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public PurchaseCertificateRequestBody withDomainNumbers(Integer domainNumbers) {
        this.domainNumbers = domainNumbers;
        return this;
    }

    /**
     * 域名数量。 - 当“domain_type”选择的是“SINGLE_DOMAIN”或“WILDCARD”类型的证书时，域名数量取值为“1”。 - 当“domain_type”选择的是“MULTI_DOMAIN”类型的证书时，域名数量取值范围为“2~100”。
     * minimum: 1
     * maximum: 100
     * @return domainNumbers
     */
    public Integer getDomainNumbers() {
        return domainNumbers;
    }

    public void setDomainNumbers(Integer domainNumbers) {
        this.domainNumbers = domainNumbers;
    }

    public PurchaseCertificateRequestBody withOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
        return this;
    }

    /**
     * 购买的证书数量。取值范围为1~100。
     * minimum: 1
     * maximum: 100
     * @return orderNumber
     */
    public Integer getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Integer orderNumber) {
        this.orderNumber = orderNumber;
    }

    public PurchaseCertificateRequestBody withAgreePrivacyProtection(Boolean agreePrivacyProtection) {
        this.agreePrivacyProtection = agreePrivacyProtection;
        return this;
    }

    /**
     * 是否同意隐私协议，此处仅能设置为true才能成功购买证书。 - true：同意隐私协议。 - false：不同意隐私协议。
     * @return agreePrivacyProtection
     */
    public Boolean getAgreePrivacyProtection() {
        return agreePrivacyProtection;
    }

    public void setAgreePrivacyProtection(Boolean agreePrivacyProtection) {
        this.agreePrivacyProtection = agreePrivacyProtection;
    }

    public PurchaseCertificateRequestBody withPrimaryDomainType(String primaryDomainType) {
        this.primaryDomainType = primaryDomainType;
        return this;
    }

    /**
     * 多域名中的主域名类型 - SINGLE_DOMAIN：主单域名 - WILDCARD_DOMAIN：主泛域名
     * @return primaryDomainType
     */
    public String getPrimaryDomainType() {
        return primaryDomainType;
    }

    public void setPrimaryDomainType(String primaryDomainType) {
        this.primaryDomainType = primaryDomainType;
    }

    public PurchaseCertificateRequestBody withSingleDomainNumber(Integer singleDomainNumber) {
        this.singleDomainNumber = singleDomainNumber;
        return this;
    }

    /**
     * 附加单域名数量。
     * minimum: 1
     * maximum: 100
     * @return singleDomainNumber
     */
    public Integer getSingleDomainNumber() {
        return singleDomainNumber;
    }

    public void setSingleDomainNumber(Integer singleDomainNumber) {
        this.singleDomainNumber = singleDomainNumber;
    }

    public PurchaseCertificateRequestBody withWildcardDomainNumber(Integer wildcardDomainNumber) {
        this.wildcardDomainNumber = wildcardDomainNumber;
        return this;
    }

    /**
     * 附加泛域名数量。
     * minimum: 1
     * maximum: 100
     * @return wildcardDomainNumber
     */
    public Integer getWildcardDomainNumber() {
        return wildcardDomainNumber;
    }

    public void setWildcardDomainNumber(Integer wildcardDomainNumber) {
        this.wildcardDomainNumber = wildcardDomainNumber;
    }

    public PurchaseCertificateRequestBody withIsAutoPay(Boolean isAutoPay) {
        this.isAutoPay = isAutoPay;
        return this;
    }

    /**
     * 是否开启自动支付。 - true：开启自动支付。 - false：不开启自动支付。
     * @return isAutoPay
     */
    public Boolean getIsAutoPay() {
        return isAutoPay;
    }

    public void setIsAutoPay(Boolean isAutoPay) {
        this.isAutoPay = isAutoPay;
    }

    public PurchaseCertificateRequestBody withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业多项目ID。用户未开通企业多项目时，不需要输入该字段。 用户开通企业多项目时，查询资源可以输入该字段。 若用户不输入该字段，默认查询租户所有有权限的企业多项目下的资源。 此时“enterprise_project_id”取值为“all”。 若用户输入该字段，取值满足以下任一条件.  取值为“all”  取值为“0”  满足正则匹配：“^[0-9a-z]{8}-[0-9a-z]{4}-[0-9a-z]{4}-[0-9a-z]{4}-[0-9a-z]{12}$”
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public PurchaseCertificateRequestBody withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 订单号。仅组合购场景使用
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PurchaseCertificateRequestBody that = (PurchaseCertificateRequestBody) obj;
        return Objects.equals(this.certBrand, that.certBrand) && Objects.equals(this.certType, that.certType)
            && Objects.equals(this.domainType, that.domainType)
            && Objects.equals(this.effectiveTime, that.effectiveTime)
            && Objects.equals(this.domainNumbers, that.domainNumbers)
            && Objects.equals(this.orderNumber, that.orderNumber)
            && Objects.equals(this.agreePrivacyProtection, that.agreePrivacyProtection)
            && Objects.equals(this.primaryDomainType, that.primaryDomainType)
            && Objects.equals(this.singleDomainNumber, that.singleDomainNumber)
            && Objects.equals(this.wildcardDomainNumber, that.wildcardDomainNumber)
            && Objects.equals(this.isAutoPay, that.isAutoPay)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.orderId, that.orderId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(certBrand,
            certType,
            domainType,
            effectiveTime,
            domainNumbers,
            orderNumber,
            agreePrivacyProtection,
            primaryDomainType,
            singleDomainNumber,
            wildcardDomainNumber,
            isAutoPay,
            enterpriseProjectId,
            orderId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PurchaseCertificateRequestBody {\n");
        sb.append("    certBrand: ").append(toIndentedString(certBrand)).append("\n");
        sb.append("    certType: ").append(toIndentedString(certType)).append("\n");
        sb.append("    domainType: ").append(toIndentedString(domainType)).append("\n");
        sb.append("    effectiveTime: ").append(toIndentedString(effectiveTime)).append("\n");
        sb.append("    domainNumbers: ").append(toIndentedString(domainNumbers)).append("\n");
        sb.append("    orderNumber: ").append(toIndentedString(orderNumber)).append("\n");
        sb.append("    agreePrivacyProtection: ").append(toIndentedString(agreePrivacyProtection)).append("\n");
        sb.append("    primaryDomainType: ").append(toIndentedString(primaryDomainType)).append("\n");
        sb.append("    singleDomainNumber: ").append(toIndentedString(singleDomainNumber)).append("\n");
        sb.append("    wildcardDomainNumber: ").append(toIndentedString(wildcardDomainNumber)).append("\n");
        sb.append("    isAutoPay: ").append(toIndentedString(isAutoPay)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
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
