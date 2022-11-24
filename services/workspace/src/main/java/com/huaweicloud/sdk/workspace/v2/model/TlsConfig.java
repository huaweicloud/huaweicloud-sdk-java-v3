package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * TLS信息。
 */
public class TlsConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cert_pem")

    private String certPem;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cert_start_time")

    private String certStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cert_end_time")

    private String certEndTime;

    public TlsConfig withCertPem(String certPem) {
        this.certPem = certPem;
        return this;
    }

    /**
     * pem内容, 有则更新，无则上传。查询不返回。
     * @return certPem
     */
    public String getCertPem() {
        return certPem;
    }

    public void setCertPem(String certPem) {
        this.certPem = certPem;
    }

    public TlsConfig withCertStartTime(String certStartTime) {
        this.certStartTime = certStartTime;
        return this;
    }

    /**
     * 证书生效开始时间，时间参考样例 2022-01-25T09:24:27。
     * @return certStartTime
     */
    public String getCertStartTime() {
        return certStartTime;
    }

    public void setCertStartTime(String certStartTime) {
        this.certStartTime = certStartTime;
    }

    public TlsConfig withCertEndTime(String certEndTime) {
        this.certEndTime = certEndTime;
        return this;
    }

    /**
     * 证书生效截止时间，时间参考样例 2022-01-25T09:24:27。
     * @return certEndTime
     */
    public String getCertEndTime() {
        return certEndTime;
    }

    public void setCertEndTime(String certEndTime) {
        this.certEndTime = certEndTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TlsConfig tlsConfig = (TlsConfig) o;
        return Objects.equals(this.certPem, tlsConfig.certPem)
            && Objects.equals(this.certStartTime, tlsConfig.certStartTime)
            && Objects.equals(this.certEndTime, tlsConfig.certEndTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(certPem, certStartTime, certEndTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TlsConfig {\n");
        sb.append("    certPem: ").append(toIndentedString(certPem)).append("\n");
        sb.append("    certStartTime: ").append(toIndentedString(certStartTime)).append("\n");
        sb.append("    certEndTime: ").append(toIndentedString(certEndTime)).append("\n");
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
