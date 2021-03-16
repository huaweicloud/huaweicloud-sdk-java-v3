package com.huaweicloud.sdk.scm.v3.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.scm.v3.model.Authentification;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ShowCertificateResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private String status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="order_id")
    
    private String orderId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="type")
    
    private String type;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="brand")
    
    private String brand;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="push_support")
    
    private String pushSupport;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="revoke_reason")
    
    private String revokeReason;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="signature_algrithm")
    
    private String signatureAlgrithm;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="issue_time")
    
    private String issueTime;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="not_before")
    
    private String notBefore;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="not_after")
    
    private String notAfter;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="validity_period")
    
    private Integer validityPeriod;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="validation_method")
    
    private String validationMethod;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain_type")
    
    private String domainType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain")
    
    private String domain;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="sans")
    
    private String sans;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain_count")
    
    private Integer domainCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="wildcard_count")
    
    private Integer wildcardCount;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="authentification")
    
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

    

    public ShowCertificateResponse withSignatureAlgrithm(String signatureAlgrithm) {
        this.signatureAlgrithm = signatureAlgrithm;
        return this;
    }

    


    /**
     * 签名算法。
     * @return signatureAlgrithm
     */
    public String getSignatureAlgrithm() {
        return signatureAlgrithm;
    }

    public void setSignatureAlgrithm(String signatureAlgrithm) {
        this.signatureAlgrithm = signatureAlgrithm;
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
     * 证书有效期，按月为单位。
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
     * @return wildcardCount
     */
    public Integer getWildcardCount() {
        return wildcardCount;
    }

    public void setWildcardCount(Integer wildcardCount) {
        this.wildcardCount = wildcardCount;
    }

    

    public ShowCertificateResponse withAuthentification(List<Authentification> authentification) {
        this.authentification = authentification;
        return this;
    }

    
    public ShowCertificateResponse addAuthentificationItem(Authentification authentificationItem) {
        this.authentification.add(authentificationItem);
        return this;
    }

    public ShowCertificateResponse withAuthentification(Consumer<List<Authentification>> authentificationSetter) {
        if(this.authentification == null ){
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowCertificateResponse showCertificateResponse = (ShowCertificateResponse) o;
        return Objects.equals(this.id, showCertificateResponse.id) &&
            Objects.equals(this.status, showCertificateResponse.status) &&
            Objects.equals(this.orderId, showCertificateResponse.orderId) &&
            Objects.equals(this.name, showCertificateResponse.name) &&
            Objects.equals(this.type, showCertificateResponse.type) &&
            Objects.equals(this.brand, showCertificateResponse.brand) &&
            Objects.equals(this.pushSupport, showCertificateResponse.pushSupport) &&
            Objects.equals(this.revokeReason, showCertificateResponse.revokeReason) &&
            Objects.equals(this.signatureAlgrithm, showCertificateResponse.signatureAlgrithm) &&
            Objects.equals(this.issueTime, showCertificateResponse.issueTime) &&
            Objects.equals(this.notBefore, showCertificateResponse.notBefore) &&
            Objects.equals(this.notAfter, showCertificateResponse.notAfter) &&
            Objects.equals(this.validityPeriod, showCertificateResponse.validityPeriod) &&
            Objects.equals(this.validationMethod, showCertificateResponse.validationMethod) &&
            Objects.equals(this.domainType, showCertificateResponse.domainType) &&
            Objects.equals(this.domain, showCertificateResponse.domain) &&
            Objects.equals(this.sans, showCertificateResponse.sans) &&
            Objects.equals(this.domainCount, showCertificateResponse.domainCount) &&
            Objects.equals(this.wildcardCount, showCertificateResponse.wildcardCount) &&
            Objects.equals(this.authentification, showCertificateResponse.authentification);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, status, orderId, name, type, brand, pushSupport, revokeReason, signatureAlgrithm, issueTime, notBefore, notAfter, validityPeriod, validationMethod, domainType, domain, sans, domainCount, wildcardCount, authentification);
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
        sb.append("    signatureAlgrithm: ").append(toIndentedString(signatureAlgrithm)).append("\n");
        sb.append("    issueTime: ").append(toIndentedString(issueTime)).append("\n");
        sb.append("    notBefore: ").append(toIndentedString(notBefore)).append("\n");
        sb.append("    notAfter: ").append(toIndentedString(notAfter)).append("\n");
        sb.append("    validityPeriod: ").append(toIndentedString(validityPeriod)).append("\n");
        sb.append("    validationMethod: ").append(toIndentedString(validationMethod)).append("\n");
        sb.append("    domainType: ").append(toIndentedString(domainType)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    sans: ").append(toIndentedString(sans)).append("\n");
        sb.append("    domainCount: ").append(toIndentedString(domainCount)).append("\n");
        sb.append("    wildcardCount: ").append(toIndentedString(wildcardCount)).append("\n");
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

