package com.huaweicloud.sdk.scm.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowCertificateResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "order_id")

    private String orderId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "brand")

    private String brand;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "push_support")

    private String pushSupport;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "revoke_reason")

    private String revokeReason;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signature_algorithm")

    private String signatureAlgorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "issue_time")

    private String issueTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_before")

    private String notBefore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_after")

    private String notAfter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "validity_period")

    private Integer validityPeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "validation_method")

    private String validationMethod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_type")

    private String domainType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "multi_domain_type")

    private String multiDomainType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private String domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sans")

    private String sans;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_count")

    private Integer domainCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wildcard_count")

    private Integer wildcardCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fingerprint")

    private String fingerprint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shared")

    private Boolean shared;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_info")

    private ShowCertificateResponseBodyApplicationInfo applicationInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authentification")

    private List<Authentification> authentification = null;

    public ShowCertificateResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 证书id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowCertificateResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 证书状态。取值如下： - PAID：证书已支付，待申请证书。 - ISSUED：证书已签发。 - CHECKING：证书申请审核中。 - CANCELCHECKING：取消证书申请审核中。 - UNPASSED：证书申请未通过。 - EXPIRED：证书已过期。 - REVOKING：证书吊销申请审核中。 - REVOKED：证书已吊销。 - UPLOAD：证书托管中。 - SUPPLEMENTCHECKING：多域名证书新增附加域名审核中。 - CANCELSUPPLEMENTING：取消新增附加域名审核中。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowCertificateResponse withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    /**
     * 订单id。
     * @return orderId
     */
    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public ShowCertificateResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 证书名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowCertificateResponse withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 证书类型。取值如下： DV_SSL_CERT、DV_SSL_CERT_BASIC、EV_SSL_CERT、 EV_SSL_CERT_PRO、OV_SSL_CERT、OV_SSL_CERT_PRO。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ShowCertificateResponse withBrand(String brand) {
        this.brand = brand;
        return this;
    }

    /**
     * 证书品牌。取值如下： GLOBALSIGN、SYMANTEC、GEOTRUST、CFCA。
     * @return brand
     */
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public ShowCertificateResponse withPushSupport(String pushSupport) {
        this.pushSupport = pushSupport;
        return this;
    }

    /**
     * 证书是否支持推送。
     * @return pushSupport
     */
    public String getPushSupport() {
        return pushSupport;
    }

    public void setPushSupport(String pushSupport) {
        this.pushSupport = pushSupport;
    }

    public ShowCertificateResponse withRevokeReason(String revokeReason) {
        this.revokeReason = revokeReason;
        return this;
    }

    /**
     * 证书吊销原因。
     * @return revokeReason
     */
    public String getRevokeReason() {
        return revokeReason;
    }

    public void setRevokeReason(String revokeReason) {
        this.revokeReason = revokeReason;
    }

    public ShowCertificateResponse withSignatureAlgorithm(String signatureAlgorithm) {
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

    public ShowCertificateResponse withIssueTime(String issueTime) {
        this.issueTime = issueTime;
        return this;
    }

    /**
     * 证书签发时间，没有获取到有效值时为空。
     * @return issueTime
     */
    public String getIssueTime() {
        return issueTime;
    }

    public void setIssueTime(String issueTime) {
        this.issueTime = issueTime;
    }

    public ShowCertificateResponse withNotBefore(String notBefore) {
        this.notBefore = notBefore;
        return this;
    }

    /**
     * 证书生效时间，没有获取到有效值时为空。
     * @return notBefore
     */
    public String getNotBefore() {
        return notBefore;
    }

    public void setNotBefore(String notBefore) {
        this.notBefore = notBefore;
    }

    public ShowCertificateResponse withNotAfter(String notAfter) {
        this.notAfter = notAfter;
        return this;
    }

    /**
     * 证书失效时间，没有获取到有效值时为空。
     * @return notAfter
     */
    public String getNotAfter() {
        return notAfter;
    }

    public void setNotAfter(String notAfter) {
        this.notAfter = notAfter;
    }

    public ShowCertificateResponse withValidityPeriod(Integer validityPeriod) {
        this.validityPeriod = validityPeriod;
        return this;
    }

    /**
     * 证书有效期，按月为单位。[云证书管理服务提供了一种购买多年有效期证书的解决方案，这种多年有效期证书生效方式为多张有效期为1年的SSL证书叠加生效，例如：有效期为“3年”的证书实际包含3张有效期为1年且规格相同的SSL证书，在第一张证书到期前30天，系统自动以第一张证书的信息申请第二张证书，在第二张证书到期前30天，系统自动以第一张证书的信息申请第三张证书。](tag:hws)
     * minimum: 12
     * maximum: 12
     * @return validityPeriod
     */
    public Integer getValidityPeriod() {
        return validityPeriod;
    }

    public void setValidityPeriod(Integer validityPeriod) {
        this.validityPeriod = validityPeriod;
    }

    public ShowCertificateResponse withValidationMethod(String validationMethod) {
        this.validationMethod = validationMethod;
        return this;
    }

    /**
     * 域名认证方式，取值如下：DNS、FILE、EMAIL。
     * @return validationMethod
     */
    public String getValidationMethod() {
        return validationMethod;
    }

    public void setValidationMethod(String validationMethod) {
        this.validationMethod = validationMethod;
    }

    public ShowCertificateResponse withDomainType(String domainType) {
        this.domainType = domainType;
        return this;
    }

    /**
     * 域名类型，取值如下： - SINGLE_DOMAIN：单域名 - WILDCARD：通配符 - MULTI_DOMAIN：多域名
     * @return domainType
     */
    public String getDomainType() {
        return domainType;
    }

    public void setDomainType(String domainType) {
        this.domainType = domainType;
    }

    public ShowCertificateResponse withMultiDomainType(String multiDomainType) {
        this.multiDomainType = multiDomainType;
        return this;
    }

    /**
     * 多域名类型，取值如下： - primary_single：主单域名 - primary_wildcard：主泛域名
     * @return multiDomainType
     */
    public String getMultiDomainType() {
        return multiDomainType;
    }

    public void setMultiDomainType(String multiDomainType) {
        this.multiDomainType = multiDomainType;
    }

    public ShowCertificateResponse withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * 证书绑定域名。
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public ShowCertificateResponse withSans(String sans) {
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

    public ShowCertificateResponse withDomainCount(Integer domainCount) {
        this.domainCount = domainCount;
        return this;
    }

    /**
     * 证书可绑定域名个数。
     * minimum: 1
     * maximum: 100
     * @return domainCount
     */
    public Integer getDomainCount() {
        return domainCount;
    }

    public void setDomainCount(Integer domainCount) {
        this.domainCount = domainCount;
    }

    public ShowCertificateResponse withWildcardCount(Integer wildcardCount) {
        this.wildcardCount = wildcardCount;
        return this;
    }

    /**
     * 证书可绑定附加域名个数。
     * minimum: 0
     * maximum: 99
     * @return wildcardCount
     */
    public Integer getWildcardCount() {
        return wildcardCount;
    }

    public void setWildcardCount(Integer wildcardCount) {
        this.wildcardCount = wildcardCount;
    }

    public ShowCertificateResponse withFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
        return this;
    }

    /**
     * 证书的SHA-1指纹。
     * @return fingerprint
     */
    public String getFingerprint() {
        return fingerprint;
    }

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    public ShowCertificateResponse withShared(Boolean shared) {
        this.shared = shared;
        return this;
    }

    /**
     * 是否是共享资源。
     * @return shared
     */
    public Boolean getShared() {
        return shared;
    }

    public void setShared(Boolean shared) {
        this.shared = shared;
    }

    public ShowCertificateResponse withApplicationInfo(ShowCertificateResponseBodyApplicationInfo applicationInfo) {
        this.applicationInfo = applicationInfo;
        return this;
    }

    public ShowCertificateResponse withApplicationInfo(
        Consumer<ShowCertificateResponseBodyApplicationInfo> applicationInfoSetter) {
        if (this.applicationInfo == null) {
            this.applicationInfo = new ShowCertificateResponseBodyApplicationInfo();
            applicationInfoSetter.accept(this.applicationInfo);
        }

        return this;
    }

    /**
     * Get applicationInfo
     * @return applicationInfo
     */
    public ShowCertificateResponseBodyApplicationInfo getApplicationInfo() {
        return applicationInfo;
    }

    public void setApplicationInfo(ShowCertificateResponseBodyApplicationInfo applicationInfo) {
        this.applicationInfo = applicationInfo;
    }

    public ShowCertificateResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 证书的描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowCertificateResponse withEnterpriseProjectId(String enterpriseProjectId) {
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

    public ShowCertificateResponse withAuthentification(List<Authentification> authentification) {
        this.authentification = authentification;
        return this;
    }

    public ShowCertificateResponse addAuthentificationItem(Authentification authentificationItem) {
        if (this.authentification == null) {
            this.authentification = new ArrayList<>();
        }
        this.authentification.add(authentificationItem);
        return this;
    }

    public ShowCertificateResponse withAuthentification(Consumer<List<Authentification>> authentificationSetter) {
        if (this.authentification == null) {
            this.authentification = new ArrayList<>();
        }
        authentificationSetter.accept(this.authentification);
        return this;
    }

    /**
     * 域名所有权认证信息，详情请参见Authentification字段数据结构说明。
     * @return authentification
     */
    public List<Authentification> getAuthentification() {
        return authentification;
    }

    public void setAuthentification(List<Authentification> authentification) {
        this.authentification = authentification;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowCertificateResponse that = (ShowCertificateResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.status, that.status)
            && Objects.equals(this.orderId, that.orderId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.type, that.type) && Objects.equals(this.brand, that.brand)
            && Objects.equals(this.pushSupport, that.pushSupport)
            && Objects.equals(this.revokeReason, that.revokeReason)
            && Objects.equals(this.signatureAlgorithm, that.signatureAlgorithm)
            && Objects.equals(this.issueTime, that.issueTime) && Objects.equals(this.notBefore, that.notBefore)
            && Objects.equals(this.notAfter, that.notAfter) && Objects.equals(this.validityPeriod, that.validityPeriod)
            && Objects.equals(this.validationMethod, that.validationMethod)
            && Objects.equals(this.domainType, that.domainType)
            && Objects.equals(this.multiDomainType, that.multiDomainType) && Objects.equals(this.domain, that.domain)
            && Objects.equals(this.sans, that.sans) && Objects.equals(this.domainCount, that.domainCount)
            && Objects.equals(this.wildcardCount, that.wildcardCount)
            && Objects.equals(this.fingerprint, that.fingerprint) && Objects.equals(this.shared, that.shared)
            && Objects.equals(this.applicationInfo, that.applicationInfo)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.authentification, that.authentification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            status,
            orderId,
            name,
            type,
            brand,
            pushSupport,
            revokeReason,
            signatureAlgorithm,
            issueTime,
            notBefore,
            notAfter,
            validityPeriod,
            validationMethod,
            domainType,
            multiDomainType,
            domain,
            sans,
            domainCount,
            wildcardCount,
            fingerprint,
            shared,
            applicationInfo,
            description,
            enterpriseProjectId,
            authentification);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowCertificateResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
        sb.append("    pushSupport: ").append(toIndentedString(pushSupport)).append("\n");
        sb.append("    revokeReason: ").append(toIndentedString(revokeReason)).append("\n");
        sb.append("    signatureAlgorithm: ").append(toIndentedString(signatureAlgorithm)).append("\n");
        sb.append("    issueTime: ").append(toIndentedString(issueTime)).append("\n");
        sb.append("    notBefore: ").append(toIndentedString(notBefore)).append("\n");
        sb.append("    notAfter: ").append(toIndentedString(notAfter)).append("\n");
        sb.append("    validityPeriod: ").append(toIndentedString(validityPeriod)).append("\n");
        sb.append("    validationMethod: ").append(toIndentedString(validationMethod)).append("\n");
        sb.append("    domainType: ").append(toIndentedString(domainType)).append("\n");
        sb.append("    multiDomainType: ").append(toIndentedString(multiDomainType)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    sans: ").append(toIndentedString(sans)).append("\n");
        sb.append("    domainCount: ").append(toIndentedString(domainCount)).append("\n");
        sb.append("    wildcardCount: ").append(toIndentedString(wildcardCount)).append("\n");
        sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
        sb.append("    shared: ").append(toIndentedString(shared)).append("\n");
        sb.append("    applicationInfo: ").append(toIndentedString(applicationInfo)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    authentification: ").append(toIndentedString(authentification)).append("\n");
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
