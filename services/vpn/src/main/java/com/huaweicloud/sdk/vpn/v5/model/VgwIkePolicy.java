package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * VgwIkePolicy
 */
public class VgwIkePolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encryption_algorithm")

    private String encryptionAlgorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dh_group")

    private String dhGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authentication_algorithm")

    private String authenticationAlgorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lifetime_seconds")

    private Integer lifetimeSeconds;

    public VgwIkePolicy withEncryptionAlgorithm(String encryptionAlgorithm) {
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

    public VgwIkePolicy withDhGroup(String dhGroup) {
        this.dhGroup = dhGroup;
        return this;
    }

    /**
     * DH密钥组
     * @return dhGroup
     */
    public String getDhGroup() {
        return dhGroup;
    }

    public void setDhGroup(String dhGroup) {
        this.dhGroup = dhGroup;
    }

    public VgwIkePolicy withAuthenticationAlgorithm(String authenticationAlgorithm) {
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

    public VgwIkePolicy withLifetimeSeconds(Integer lifetimeSeconds) {
        this.lifetimeSeconds = lifetimeSeconds;
        return this;
    }

    /**
     * 表示SA的生存周期，当该生存周期超时后IKE SA将自动更新
     * minimum: 60
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
        VgwIkePolicy that = (VgwIkePolicy) obj;
        return Objects.equals(this.encryptionAlgorithm, that.encryptionAlgorithm)
            && Objects.equals(this.dhGroup, that.dhGroup)
            && Objects.equals(this.authenticationAlgorithm, that.authenticationAlgorithm)
            && Objects.equals(this.lifetimeSeconds, that.lifetimeSeconds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(encryptionAlgorithm, dhGroup, authenticationAlgorithm, lifetimeSeconds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VgwIkePolicy {\n");
        sb.append("    encryptionAlgorithm: ").append(toIndentedString(encryptionAlgorithm)).append("\n");
        sb.append("    dhGroup: ").append(toIndentedString(dhGroup)).append("\n");
        sb.append("    authenticationAlgorithm: ").append(toIndentedString(authenticationAlgorithm)).append("\n");
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
