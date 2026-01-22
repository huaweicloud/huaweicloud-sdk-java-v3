package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CertInfoResp
 */
public class CertInfoResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "play_domain")

    private String playDomain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tenant_name")

    private String tenantName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    private String expireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cert_type")

    private Integer certType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gm_cert_type")

    private Integer gmCertType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private String source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cert_name")

    private String certName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cert_id")

    private String certId;

    public CertInfoResp withPlayDomain(String playDomain) {
        this.playDomain = playDomain;
        return this;
    }

    /**
     * 播放域名
     * @return playDomain
     */
    public String getPlayDomain() {
        return playDomain;
    }

    public void setPlayDomain(String playDomain) {
        this.playDomain = playDomain;
    }

    public CertInfoResp withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 租户ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public CertInfoResp withTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }

    /**
     * 租户名
     * @return tenantName
     */
    public String getTenantName() {
        return tenantName;
    }

    public void setTenantName(String tenantName) {
        this.tenantName = tenantName;
    }

    public CertInfoResp withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 证书开始时间，格式：YYYY-MM-DDTHH:mm:ssZ，UTC时间
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public CertInfoResp withExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * 证书过期时间，格式：YYYY-MM-DDTHH:mm:ssZ，UTC时间
     * @return expireTime
     */
    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }

    public CertInfoResp withCertType(Integer certType) {
        this.certType = certType;
        return this;
    }

    /**
     * 证书类型, 1：国密证书， 0:默认，标准国际证书
     * @return certType
     */
    public Integer getCertType() {
        return certType;
    }

    public void setCertType(Integer certType) {
        this.certType = certType;
    }

    public CertInfoResp withGmCertType(Integer gmCertType) {
        this.gmCertType = gmCertType;
        return this;
    }

    /**
     * 国密证书类型, 1：签名证书， 2:加密证书
     * @return gmCertType
     */
    public Integer getGmCertType() {
        return gmCertType;
    }

    public void setGmCertType(Integer gmCertType) {
        this.gmCertType = gmCertType;
    }

    public CertInfoResp withSource(String source) {
        this.source = source;
        return this;
    }

    /**
     * 证书来源。 - scm：云证书与管理服务CCM。 - user：自有证书。
     * @return source
     */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public CertInfoResp withCertName(String certName) {
        this.certName = certName;
        return this;
    }

    /**
     * scm来源的证书名, 自有证书为空
     * @return certName
     */
    public String getCertName() {
        return certName;
    }

    public void setCertName(String certName) {
        this.certName = certName;
    }

    public CertInfoResp withCertId(String certId) {
        this.certId = certId;
        return this;
    }

    /**
     * scm来源的证书ID, 自有证书为空
     * @return certId
     */
    public String getCertId() {
        return certId;
    }

    public void setCertId(String certId) {
        this.certId = certId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CertInfoResp that = (CertInfoResp) obj;
        return Objects.equals(this.playDomain, that.playDomain) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.tenantName, that.tenantName) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.expireTime, that.expireTime) && Objects.equals(this.certType, that.certType)
            && Objects.equals(this.gmCertType, that.gmCertType) && Objects.equals(this.source, that.source)
            && Objects.equals(this.certName, that.certName) && Objects.equals(this.certId, that.certId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playDomain,
            projectId,
            tenantName,
            startTime,
            expireTime,
            certType,
            gmCertType,
            source,
            certName,
            certId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CertInfoResp {\n");
        sb.append("    playDomain: ").append(toIndentedString(playDomain)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    tenantName: ").append(toIndentedString(tenantName)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    certType: ").append(toIndentedString(certType)).append("\n");
        sb.append("    gmCertType: ").append(toIndentedString(gmCertType)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    certName: ").append(toIndentedString(certName)).append("\n");
        sb.append("    certId: ").append(toIndentedString(certId)).append("\n");
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
