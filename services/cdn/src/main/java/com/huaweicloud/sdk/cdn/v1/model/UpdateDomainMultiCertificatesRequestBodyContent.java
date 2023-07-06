package com.huaweicloud.sdk.cdn.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateDomainMultiCertificatesRequestBodyContent
 */
public class UpdateDomainMultiCertificatesRequestBodyContent {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "https_switch")

    private Integer httpsSwitch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_origin_way")

    private Integer accessOriginWay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "force_redirect_https")

    private Integer forceRedirectHttps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "force_redirect_config")

    private ForceRedirect forceRedirectConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "http2")

    private Integer http2;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cert_name")

    private String certName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate")

    private String certificate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_key")

    private String privateKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_type")

    private Integer certificateType;

    public UpdateDomainMultiCertificatesRequestBodyContent withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * 域名列表,逗号分割，上限50个域名
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public UpdateDomainMultiCertificatesRequestBodyContent withHttpsSwitch(Integer httpsSwitch) {
        this.httpsSwitch = httpsSwitch;
        return this;
    }

    /**
     * https开关(0：\"关闭\"；1：\"设置证书\")。
     * @return httpsSwitch
     */
    public Integer getHttpsSwitch() {
        return httpsSwitch;
    }

    public void setHttpsSwitch(Integer httpsSwitch) {
        this.httpsSwitch = httpsSwitch;
    }

    public UpdateDomainMultiCertificatesRequestBodyContent withAccessOriginWay(Integer accessOriginWay) {
        this.accessOriginWay = accessOriginWay;
        return this;
    }

    /**
     * 回源方式:1：\"回源跟随\"；2：\"HTTP\"(默认)，3：https（自建）。
     * @return accessOriginWay
     */
    public Integer getAccessOriginWay() {
        return accessOriginWay;
    }

    public void setAccessOriginWay(Integer accessOriginWay) {
        this.accessOriginWay = accessOriginWay;
    }

    public UpdateDomainMultiCertificatesRequestBodyContent withForceRedirectHttps(Integer forceRedirectHttps) {
        this.forceRedirectHttps = forceRedirectHttps;
        return this;
    }

    /**
     * 强制跳转HTTPS（0：不强制；1：强制） 为空值时默认设置为关闭。（此参数即将下线，建议使用force_redirect_config修改配置）.
     * @return forceRedirectHttps
     */
    public Integer getForceRedirectHttps() {
        return forceRedirectHttps;
    }

    public void setForceRedirectHttps(Integer forceRedirectHttps) {
        this.forceRedirectHttps = forceRedirectHttps;
    }

    public UpdateDomainMultiCertificatesRequestBodyContent withForceRedirectConfig(ForceRedirect forceRedirectConfig) {
        this.forceRedirectConfig = forceRedirectConfig;
        return this;
    }

    public UpdateDomainMultiCertificatesRequestBodyContent withForceRedirectConfig(
        Consumer<ForceRedirect> forceRedirectConfigSetter) {
        if (this.forceRedirectConfig == null) {
            this.forceRedirectConfig = new ForceRedirect();
            forceRedirectConfigSetter.accept(this.forceRedirectConfig);
        }

        return this;
    }

    /**
     * Get forceRedirectConfig
     * @return forceRedirectConfig
     */
    public ForceRedirect getForceRedirectConfig() {
        return forceRedirectConfig;
    }

    public void setForceRedirectConfig(ForceRedirect forceRedirectConfig) {
        this.forceRedirectConfig = forceRedirectConfig;
    }

    public UpdateDomainMultiCertificatesRequestBodyContent withHttp2(Integer http2) {
        this.http2 = http2;
        return this;
    }

    /**
     * http2.0（0：关闭；1：开启） 为空值时默认设置为关闭
     * @return http2
     */
    public Integer getHttp2() {
        return http2;
    }

    public void setHttp2(Integer http2) {
        this.http2 = http2;
    }

    public UpdateDomainMultiCertificatesRequestBodyContent withCertName(String certName) {
        this.certName = certName;
        return this;
    }

    /**
     * 证书名称（设置证书必填）（长度限制为3-64字符）。
     * @return certName
     */
    public String getCertName() {
        return certName;
    }

    public void setCertName(String certName) {
        this.certName = certName;
    }

    public UpdateDomainMultiCertificatesRequestBodyContent withCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }

    /**
     * HTTPS协议使用的SSL证书内容，仅支持PEM编码格式。不启用证书则无需输入。初次配置证书时必传。
     * @return certificate
     */
    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public UpdateDomainMultiCertificatesRequestBodyContent withPrivateKey(String privateKey) {
        this.privateKey = privateKey;
        return this;
    }

    /**
     * HTTPS协议使用的SSL证书私钥内容，仅支持PEM编码格式。不启用证书则无需输入。初次配置证书时必传。
     * @return privateKey
     */
    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public UpdateDomainMultiCertificatesRequestBodyContent withCertificateType(Integer certificateType) {
        this.certificateType = certificateType;
        return this;
    }

    /**
     * 证书类型（0为自有证书 ；1为托管证书，此时不必不传入证书内容和私钥，自动根据证书名称匹配；不传默认为自有证书）
     * @return certificateType
     */
    public Integer getCertificateType() {
        return certificateType;
    }

    public void setCertificateType(Integer certificateType) {
        this.certificateType = certificateType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateDomainMultiCertificatesRequestBodyContent that = (UpdateDomainMultiCertificatesRequestBodyContent) obj;
        return Objects.equals(this.domainName, that.domainName) && Objects.equals(this.httpsSwitch, that.httpsSwitch)
            && Objects.equals(this.accessOriginWay, that.accessOriginWay)
            && Objects.equals(this.forceRedirectHttps, that.forceRedirectHttps)
            && Objects.equals(this.forceRedirectConfig, that.forceRedirectConfig)
            && Objects.equals(this.http2, that.http2) && Objects.equals(this.certName, that.certName)
            && Objects.equals(this.certificate, that.certificate) && Objects.equals(this.privateKey, that.privateKey)
            && Objects.equals(this.certificateType, that.certificateType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainName,
            httpsSwitch,
            accessOriginWay,
            forceRedirectHttps,
            forceRedirectConfig,
            http2,
            certName,
            certificate,
            privateKey,
            certificateType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDomainMultiCertificatesRequestBodyContent {\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    httpsSwitch: ").append(toIndentedString(httpsSwitch)).append("\n");
        sb.append("    accessOriginWay: ").append(toIndentedString(accessOriginWay)).append("\n");
        sb.append("    forceRedirectHttps: ").append(toIndentedString(forceRedirectHttps)).append("\n");
        sb.append("    forceRedirectConfig: ").append(toIndentedString(forceRedirectConfig)).append("\n");
        sb.append("    http2: ").append(toIndentedString(http2)).append("\n");
        sb.append("    certName: ").append(toIndentedString(certName)).append("\n");
        sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
        sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
        sb.append("    certificateType: ").append(toIndentedString(certificateType)).append("\n");
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
