package com.huaweicloud.sdk.scm.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 证书资源详情。
 */
public class TagResourceResourceDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cert_id")

    private String certId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cert_name")

    private String certName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private String domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cert_type")

    private String certType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cert_brand")

    private String certBrand;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_type")

    private String domainType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "purchase_period")

    private Integer purchasePeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expired_time")

    private String expiredTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_status")

    private String orderStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_num")

    private Integer domainNum;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wildcard_number")

    private Integer wildcardNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sans")

    private String sans;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cert_des")

    private String certDes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signature_algorithm")

    private String signatureAlgorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fail_reason")

    private String failReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "partner_order_id")

    private String partnerOrderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "push_support")

    private Boolean pushSupport;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cert_issued_time")

    private String certIssuedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unsubscribe_support")

    private Boolean unsubscribeSupport;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "origin_cert_id")

    private String originCertId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "renewal_cert_id")

    private String renewalCertId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_renew_status")

    private Integer autoRenewStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "remain_cert_number")

    private Integer remainCertNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_deploy_support")

    private Boolean autoDeploySupport;

    public TagResourceResourceDetail withCertId(String certId) {
        this.certId = certId;
        return this;
    }

    /**
     * 证书ID。
     * @return certId
     */
    public String getCertId() {
        return certId;
    }

    public void setCertId(String certId) {
        this.certId = certId;
    }

    public TagResourceResourceDetail withCertName(String certName) {
        this.certName = certName;
        return this;
    }

    /**
     * 证书名称。字符长度为3~63位。
     * @return certName
     */
    public String getCertName() {
        return certName;
    }

    public void setCertName(String certName) {
        this.certName = certName;
    }

    public TagResourceResourceDetail withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * 该证书绑定的域名。 - 当购买的证书为“单域名”或“泛域名”类型的证书时，请直接填写单域名或泛域名即可。 - 当购买的证书为“多域名”类型的证书时，需要选择1个域名作为主域名。 示例：www.example.com
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public TagResourceResourceDetail withCertType(String certType) {
        this.certType = certType;
        return this;
    }

    /**
     * 证书类型。 - OV_SSL_CERT：企业型SSL证书。 - EV_SSL_CERT：增强型SSL证书。
     * @return certType
     */
    public String getCertType() {
        return certType;
    }

    public void setCertType(String certType) {
        this.certType = certType;
    }

    public TagResourceResourceDetail withCertBrand(String certBrand) {
        this.certBrand = certBrand;
        return this;
    }

    /**
     * 证书品牌。GLOBALSIGN：GlobalSign品牌。
     * @return certBrand
     */
    public String getCertBrand() {
        return certBrand;
    }

    public void setCertBrand(String certBrand) {
        this.certBrand = certBrand;
    }

    public TagResourceResourceDetail withDomainType(String domainType) {
        this.domainType = domainType;
        return this;
    }

    /**
     * 域名类型。 - SINGLE_DOMAIN：单域名类型。 - MULTI_DOMAIN：多域名类型。 - WILDCARD：泛域名类型。
     * @return domainType
     */
    public String getDomainType() {
        return domainType;
    }

    public void setDomainType(String domainType) {
        this.domainType = domainType;
    }

    public TagResourceResourceDetail withPurchasePeriod(Integer purchasePeriod) {
        this.purchasePeriod = purchasePeriod;
        return this;
    }

    /**
     * 证书有效期（年）。
     * minimum: 0
     * maximum: 1000
     * @return purchasePeriod
     */
    public Integer getPurchasePeriod() {
        return purchasePeriod;
    }

    public void setPurchasePeriod(Integer purchasePeriod) {
        this.purchasePeriod = purchasePeriod;
    }

    public TagResourceResourceDetail withExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
        return this;
    }

    /**
     * 证书到期时间，毫秒级时间戳。
     * @return expiredTime
     */
    public String getExpiredTime() {
        return expiredTime;
    }

    public void setExpiredTime(String expiredTime) {
        this.expiredTime = expiredTime;
    }

    public TagResourceResourceDetail withOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
        return this;
    }

    /**
     * 订单状态。
     * @return orderStatus
     */
    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public TagResourceResourceDetail withDomainNum(Integer domainNum) {
        this.domainNum = domainNum;
        return this;
    }

    /**
     * 域名数量。 - 当“domain_type”选择的是“SINGLE_DOMAIN”或“WILDCARD”类型的证书时，域名数量取值为“1”。 - 当“domain_type”选择的是“MULTI_DOMAIN”类型的证书时，域名数量取值范围为“2~250”。
     * minimum: 1
     * maximum: 250
     * @return domainNum
     */
    public Integer getDomainNum() {
        return domainNum;
    }

    public void setDomainNum(Integer domainNum) {
        this.domainNum = domainNum;
    }

    public TagResourceResourceDetail withWildcardNumber(Integer wildcardNumber) {
        this.wildcardNumber = wildcardNumber;
        return this;
    }

    /**
     * 泛域名数量。
     * minimum: 1
     * maximum: 100
     * @return wildcardNumber
     */
    public Integer getWildcardNumber() {
        return wildcardNumber;
    }

    public void setWildcardNumber(Integer wildcardNumber) {
        this.wildcardNumber = wildcardNumber;
    }

    public TagResourceResourceDetail withSans(String sans) {
        this.sans = sans;
        return this;
    }

    /**
     * 证书绑定的附加域名信息。
     * @return sans
     */
    public String getSans() {
        return sans;
    }

    public void setSans(String sans) {
        this.sans = sans;
    }

    public TagResourceResourceDetail withCertDes(String certDes) {
        this.certDes = certDes;
        return this;
    }

    /**
     * 证书描述。
     * @return certDes
     */
    public String getCertDes() {
        return certDes;
    }

    public void setCertDes(String certDes) {
        this.certDes = certDes;
    }

    public TagResourceResourceDetail withSignatureAlgorithm(String signatureAlgorithm) {
        this.signatureAlgorithm = signatureAlgorithm;
        return this;
    }

    /**
     * 签名算法。
     * @return signatureAlgorithm
     */
    public String getSignatureAlgorithm() {
        return signatureAlgorithm;
    }

    public void setSignatureAlgorithm(String signatureAlgorithm) {
        this.signatureAlgorithm = signatureAlgorithm;
    }

    public TagResourceResourceDetail withFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }

    /**
     * 失败原因。
     * @return failReason
     */
    public String getFailReason() {
        return failReason;
    }

    public void setFailReason(String failReason) {
        this.failReason = failReason;
    }

    public TagResourceResourceDetail withPartnerOrderId(String partnerOrderId) {
        this.partnerOrderId = partnerOrderId;
        return this;
    }

    /**
     * 订单流水号。
     * @return partnerOrderId
     */
    public String getPartnerOrderId() {
        return partnerOrderId;
    }

    public void setPartnerOrderId(String partnerOrderId) {
        this.partnerOrderId = partnerOrderId;
    }

    public TagResourceResourceDetail withPushSupport(Boolean pushSupport) {
        this.pushSupport = pushSupport;
        return this;
    }

    /**
     * 证书是否支持推送。
     * @return pushSupport
     */
    public Boolean getPushSupport() {
        return pushSupport;
    }

    public void setPushSupport(Boolean pushSupport) {
        this.pushSupport = pushSupport;
    }

    public TagResourceResourceDetail withCertIssuedTime(String certIssuedTime) {
        this.certIssuedTime = certIssuedTime;
        return this;
    }

    /**
     * 证书签发时间，毫秒级时间戳。
     * @return certIssuedTime
     */
    public String getCertIssuedTime() {
        return certIssuedTime;
    }

    public void setCertIssuedTime(String certIssuedTime) {
        this.certIssuedTime = certIssuedTime;
    }

    public TagResourceResourceDetail withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源id。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public TagResourceResourceDetail withUnsubscribeSupport(Boolean unsubscribeSupport) {
        this.unsubscribeSupport = unsubscribeSupport;
        return this;
    }

    /**
     * 证书是否支持退订。
     * @return unsubscribeSupport
     */
    public Boolean getUnsubscribeSupport() {
        return unsubscribeSupport;
    }

    public void setUnsubscribeSupport(Boolean unsubscribeSupport) {
        this.unsubscribeSupport = unsubscribeSupport;
    }

    public TagResourceResourceDetail withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID，默认为“0”。 对于开通企业项目的用户，表示资源处于默认企业项目下。 对于未开通企业项目的用户，表示资源未处于企业项目下。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public TagResourceResourceDetail withOriginCertId(String originCertId) {
        this.originCertId = originCertId;
        return this;
    }

    /**
     * 初始证书id。
     * @return originCertId
     */
    public String getOriginCertId() {
        return originCertId;
    }

    public void setOriginCertId(String originCertId) {
        this.originCertId = originCertId;
    }

    public TagResourceResourceDetail withRenewalCertId(String renewalCertId) {
        this.renewalCertId = renewalCertId;
        return this;
    }

    /**
     * 续费购买证书id。
     * @return renewalCertId
     */
    public String getRenewalCertId() {
        return renewalCertId;
    }

    public void setRenewalCertId(String renewalCertId) {
        this.renewalCertId = renewalCertId;
    }

    public TagResourceResourceDetail withAutoRenewStatus(Integer autoRenewStatus) {
        this.autoRenewStatus = autoRenewStatus;
        return this;
    }

    /**
     * 自动续费状态。
     * minimum: 0
     * maximum: 100
     * @return autoRenewStatus
     */
    public Integer getAutoRenewStatus() {
        return autoRenewStatus;
    }

    public void setAutoRenewStatus(Integer autoRenewStatus) {
        this.autoRenewStatus = autoRenewStatus;
    }

    public TagResourceResourceDetail withRemainCertNumber(Integer remainCertNumber) {
        this.remainCertNumber = remainCertNumber;
        return this;
    }

    /**
     * 剩余证书有效个数。
     * minimum: 0
     * maximum: 100
     * @return remainCertNumber
     */
    public Integer getRemainCertNumber() {
        return remainCertNumber;
    }

    public void setRemainCertNumber(Integer remainCertNumber) {
        this.remainCertNumber = remainCertNumber;
    }

    public TagResourceResourceDetail withAutoDeploySupport(Boolean autoDeploySupport) {
        this.autoDeploySupport = autoDeploySupport;
        return this;
    }

    /**
     * 证书是否支持自动部署。
     * @return autoDeploySupport
     */
    public Boolean getAutoDeploySupport() {
        return autoDeploySupport;
    }

    public void setAutoDeploySupport(Boolean autoDeploySupport) {
        this.autoDeploySupport = autoDeploySupport;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TagResourceResourceDetail that = (TagResourceResourceDetail) obj;
        return Objects.equals(this.certId, that.certId) && Objects.equals(this.certName, that.certName)
            && Objects.equals(this.domain, that.domain) && Objects.equals(this.certType, that.certType)
            && Objects.equals(this.certBrand, that.certBrand) && Objects.equals(this.domainType, that.domainType)
            && Objects.equals(this.purchasePeriod, that.purchasePeriod)
            && Objects.equals(this.expiredTime, that.expiredTime) && Objects.equals(this.orderStatus, that.orderStatus)
            && Objects.equals(this.domainNum, that.domainNum)
            && Objects.equals(this.wildcardNumber, that.wildcardNumber) && Objects.equals(this.sans, that.sans)
            && Objects.equals(this.certDes, that.certDes)
            && Objects.equals(this.signatureAlgorithm, that.signatureAlgorithm)
            && Objects.equals(this.failReason, that.failReason)
            && Objects.equals(this.partnerOrderId, that.partnerOrderId)
            && Objects.equals(this.pushSupport, that.pushSupport)
            && Objects.equals(this.certIssuedTime, that.certIssuedTime)
            && Objects.equals(this.resourceId, that.resourceId)
            && Objects.equals(this.unsubscribeSupport, that.unsubscribeSupport)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.originCertId, that.originCertId)
            && Objects.equals(this.renewalCertId, that.renewalCertId)
            && Objects.equals(this.autoRenewStatus, that.autoRenewStatus)
            && Objects.equals(this.remainCertNumber, that.remainCertNumber)
            && Objects.equals(this.autoDeploySupport, that.autoDeploySupport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(certId,
            certName,
            domain,
            certType,
            certBrand,
            domainType,
            purchasePeriod,
            expiredTime,
            orderStatus,
            domainNum,
            wildcardNumber,
            sans,
            certDes,
            signatureAlgorithm,
            failReason,
            partnerOrderId,
            pushSupport,
            certIssuedTime,
            resourceId,
            unsubscribeSupport,
            enterpriseProjectId,
            originCertId,
            renewalCertId,
            autoRenewStatus,
            remainCertNumber,
            autoDeploySupport);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TagResourceResourceDetail {\n");
        sb.append("    certId: ").append(toIndentedString(certId)).append("\n");
        sb.append("    certName: ").append(toIndentedString(certName)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    certType: ").append(toIndentedString(certType)).append("\n");
        sb.append("    certBrand: ").append(toIndentedString(certBrand)).append("\n");
        sb.append("    domainType: ").append(toIndentedString(domainType)).append("\n");
        sb.append("    purchasePeriod: ").append(toIndentedString(purchasePeriod)).append("\n");
        sb.append("    expiredTime: ").append(toIndentedString(expiredTime)).append("\n");
        sb.append("    orderStatus: ").append(toIndentedString(orderStatus)).append("\n");
        sb.append("    domainNum: ").append(toIndentedString(domainNum)).append("\n");
        sb.append("    wildcardNumber: ").append(toIndentedString(wildcardNumber)).append("\n");
        sb.append("    sans: ").append(toIndentedString(sans)).append("\n");
        sb.append("    certDes: ").append(toIndentedString(certDes)).append("\n");
        sb.append("    signatureAlgorithm: ").append(toIndentedString(signatureAlgorithm)).append("\n");
        sb.append("    failReason: ").append(toIndentedString(failReason)).append("\n");
        sb.append("    partnerOrderId: ").append(toIndentedString(partnerOrderId)).append("\n");
        sb.append("    pushSupport: ").append(toIndentedString(pushSupport)).append("\n");
        sb.append("    certIssuedTime: ").append(toIndentedString(certIssuedTime)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    unsubscribeSupport: ").append(toIndentedString(unsubscribeSupport)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    originCertId: ").append(toIndentedString(originCertId)).append("\n");
        sb.append("    renewalCertId: ").append(toIndentedString(renewalCertId)).append("\n");
        sb.append("    autoRenewStatus: ").append(toIndentedString(autoRenewStatus)).append("\n");
        sb.append("    remainCertNumber: ").append(toIndentedString(remainCertNumber)).append("\n");
        sb.append("    autoDeploySupport: ").append(toIndentedString(autoDeploySupport)).append("\n");
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
