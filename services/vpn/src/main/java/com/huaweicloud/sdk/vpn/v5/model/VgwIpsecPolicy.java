package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * VgwIpsecPolicy
 */
public class VgwIpsecPolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authentication_algorithm")

    private String authenticationAlgorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encryption_algorithm")

    private String encryptionAlgorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pfs")

    private String pfs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lifetime_seconds")

    private Integer lifetimeSeconds;

    public VgwIpsecPolicy withAuthenticationAlgorithm(String authenticationAlgorithm) {
        this.authenticationAlgorithm = authenticationAlgorithm;
        return this;
    }

    /**
     * 认证算法
     * @return authenticationAlgorithm
     */
    public String getAuthenticationAlgorithm() {
        return authenticationAlgorithm;
    }

    public void setAuthenticationAlgorithm(String authenticationAlgorithm) {
        this.authenticationAlgorithm = authenticationAlgorithm;
    }

    public VgwIpsecPolicy withEncryptionAlgorithm(String encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
        return this;
    }

    /**
     * 加密算法
     * @return encryptionAlgorithm
     */
    public String getEncryptionAlgorithm() {
        return encryptionAlgorithm;
    }

    public void setEncryptionAlgorithm(String encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
    }

    public VgwIpsecPolicy withPfs(String pfs) {
        this.pfs = pfs;
        return this;
    }

    /**
     * DH密钥组
     * @return pfs
     */
    public String getPfs() {
        return pfs;
    }

    public void setPfs(String pfs) {
        this.pfs = pfs;
    }

    public VgwIpsecPolicy withLifetimeSeconds(Integer lifetimeSeconds) {
        this.lifetimeSeconds = lifetimeSeconds;
        return this;
    }

    /**
     * 表示配置IPSec连接建立的隧道以时间为基准的生存周期
     * minimum: 30
     * maximum: 604800
     * @return lifetimeSeconds
     */
    public Integer getLifetimeSeconds() {
        return lifetimeSeconds;
    }

    public void setLifetimeSeconds(Integer lifetimeSeconds) {
        this.lifetimeSeconds = lifetimeSeconds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VgwIpsecPolicy that = (VgwIpsecPolicy) obj;
        return Objects.equals(this.authenticationAlgorithm, that.authenticationAlgorithm)
            && Objects.equals(this.encryptionAlgorithm, that.encryptionAlgorithm) && Objects.equals(this.pfs, that.pfs)
            && Objects.equals(this.lifetimeSeconds, that.lifetimeSeconds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authenticationAlgorithm, encryptionAlgorithm, pfs, lifetimeSeconds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VgwIpsecPolicy {\n");
        sb.append("    authenticationAlgorithm: ").append(toIndentedString(authenticationAlgorithm)).append("\n");
        sb.append("    encryptionAlgorithm: ").append(toIndentedString(encryptionAlgorithm)).append("\n");
        sb.append("    pfs: ").append(toIndentedString(pfs)).append("\n");
        sb.append("    lifetimeSeconds: ").append(toIndentedString(lifetimeSeconds)).append("\n");
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
