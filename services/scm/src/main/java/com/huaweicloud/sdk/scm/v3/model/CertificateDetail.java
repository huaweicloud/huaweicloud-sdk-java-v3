package com.huaweicloud.sdk.scm.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CertificateDetail
 */
public class CertificateDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private String domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sans")

    private String sans;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signature_algorithm")

    private String signatureAlgorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "deploy_support")

    private Boolean deploySupport;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "brand")

    private String brand;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    private String expireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_type")

    private String domainType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "validity_period")

    private Integer validityPeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_count")

    private Integer domainCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wildcard_count")

    private Integer wildcardCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    public CertificateDetail withId(String id) {
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

    public CertificateDetail withName(String name) {
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

    public CertificateDetail withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * 证书绑定的域名。
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public CertificateDetail withSans(String sans) {
        this.sans = sans;
        return this;
    }

    /**
     * 多域名证书绑定的附加域名。
     * @return sans
     */
    public String getSans() {
        return sans;
    }

    public void setSans(String sans) {
        this.sans = sans;
    }

    public CertificateDetail withSignatureAlgorithm(String signatureAlgorithm) {
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

    public CertificateDetail withDeploySupport(Boolean deploySupport) {
        this.deploySupport = deploySupport;
        return this;
    }

    /**
     * 是否支持部署。
     * @return deploySupport
     */
    public Boolean getDeploySupport() {
        return deploySupport;
    }

    public void setDeploySupport(Boolean deploySupport) {
        this.deploySupport = deploySupport;
    }

    public CertificateDetail withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 证书类型。取值如下： DV_SSL_CERT、DV_SSL_CERT_BASIC、EV_SSL_CERT、 EV_SSL_CERT_PRO、OV_SSL_CERT、OV_SSL_CERT_PRO
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CertificateDetail withBrand(String brand) {
        this.brand = brand;
        return this;
    }

    /**
     * 证书品牌。取值如下：GLOBALSIGN、SYMANTEC、GEOTRUST、CFCA
     * @return brand
     */
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public CertificateDetail withExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * 证书过期时间。
     * @return expireTime
     */
    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public CertificateDetail withDomainType(String domainType) {
        this.domainType = domainType;
        return this;
    }

    /**
     * 域名类型。取值如下： - SINGLE_DOMAIN：单域名 - WILDCARD：通配符 - MULTI_DOMAIN：多域名
     * @return domainType
     */
    public String getDomainType() {
        return domainType;
    }

    public void setDomainType(String domainType) {
        this.domainType = domainType;
    }

    public CertificateDetail withValidityPeriod(Integer validityPeriod) {
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

    public CertificateDetail withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 证书状态，取值如下： - PAID：证书已支付；待申请证书。 - ISSUED：证书已签发。 - CHECKING：证书申请审核中。 - CANCELCHECKING：取消证书申请审核中。 - UNPASSED：证书申请未通过。 - EXPIRED：证书已过期。 - REVOKING：证书吊销申请审核中。 - CANCLEREVOKING：证书取消吊销申请审核中。 - REVOKED：证书已吊销。 - UPLOAD：证书托管中。 - SUPPLEMENTCHECKING：多域名证书新增附加域名审核中。 - CANCELSUPPLEMENTING：取消新增附加域名审核中。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public CertificateDetail withDomainCount(Integer domainCount) {
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

    public CertificateDetail withWildcardCount(Integer wildcardCount) {
        this.wildcardCount = wildcardCount;
        return this;
    }

    /**
     * 证书可绑定泛域名个数。
     * minimum: 0
     * maximum: 100
     * @return wildcardCount
     */
    public Integer getWildcardCount() {
        return wildcardCount;
    }

    public void setWildcardCount(Integer wildcardCount) {
        this.wildcardCount = wildcardCount;
    }

    public CertificateDetail withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 证书描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CertificateDetail withEnterpriseProjectId(String enterpriseProjectId) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CertificateDetail that = (CertificateDetail) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.domain, that.domain) && Objects.equals(this.sans, that.sans)
            && Objects.equals(this.signatureAlgorithm, that.signatureAlgorithm)
            && Objects.equals(this.deploySupport, that.deploySupport) && Objects.equals(this.type, that.type)
            && Objects.equals(this.brand, that.brand) && Objects.equals(this.expireTime, that.expireTime)
            && Objects.equals(this.domainType, that.domainType)
            && Objects.equals(this.validityPeriod, that.validityPeriod) && Objects.equals(this.status, that.status)
            && Objects.equals(this.domainCount, that.domainCount)
            && Objects.equals(this.wildcardCount, that.wildcardCount)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            domain,
            sans,
            signatureAlgorithm,
            deploySupport,
            type,
            brand,
            expireTime,
            domainType,
            validityPeriod,
            status,
            domainCount,
            wildcardCount,
            description,
            enterpriseProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CertificateDetail {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    sans: ").append(toIndentedString(sans)).append("\n");
        sb.append("    signatureAlgorithm: ").append(toIndentedString(signatureAlgorithm)).append("\n");
        sb.append("    deploySupport: ").append(toIndentedString(deploySupport)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    domainType: ").append(toIndentedString(domainType)).append("\n");
        sb.append("    validityPeriod: ").append(toIndentedString(validityPeriod)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    domainCount: ").append(toIndentedString(domainCount)).append("\n");
        sb.append("    wildcardCount: ").append(toIndentedString(wildcardCount)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
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
