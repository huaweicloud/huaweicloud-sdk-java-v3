package com.huaweicloud.sdk.aad.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CertInfo
 */
public class CertInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cert_name")

    private String certName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "apply_domain")

    private String applyDomain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_time")

    private Long expireTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "expire_status")

    private Integer expireStatus;

    public CertInfo withCertName(String certName) {
        this.certName = certName;
        return this;
    }

    /**
     * 证书名称
     * @return certName
     */
    public String getCertName() {
        return certName;
    }

    public void setCertName(String certName) {
        this.certName = certName;
    }

    public CertInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 证书id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CertInfo withApplyDomain(String applyDomain) {
        this.applyDomain = applyDomain;
        return this;
    }

    /**
     * 适用域名
     * @return applyDomain
     */
    public String getApplyDomain() {
        return applyDomain;
    }

    public void setApplyDomain(String applyDomain) {
        this.applyDomain = applyDomain;
    }

    public CertInfo withExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    /**
     * 过期时间
     * @return expireTime
     */
    public Long getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
    }

    public CertInfo withExpireStatus(Integer expireStatus) {
        this.expireStatus = expireStatus;
        return this;
    }

    /**
     * 过期状态
     * @return expireStatus
     */
    public Integer getExpireStatus() {
        return expireStatus;
    }

    public void setExpireStatus(Integer expireStatus) {
        this.expireStatus = expireStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CertInfo that = (CertInfo) obj;
        return Objects.equals(this.certName, that.certName) && Objects.equals(this.id, that.id)
            && Objects.equals(this.applyDomain, that.applyDomain) && Objects.equals(this.expireTime, that.expireTime)
            && Objects.equals(this.expireStatus, that.expireStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(certName, id, applyDomain, expireTime, expireStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CertInfo {\n");
        sb.append("    certName: ").append(toIndentedString(certName)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    applyDomain: ").append(toIndentedString(applyDomain)).append("\n");
        sb.append("    expireTime: ").append(toIndentedString(expireTime)).append("\n");
        sb.append("    expireStatus: ").append(toIndentedString(expireStatus)).append("\n");
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
