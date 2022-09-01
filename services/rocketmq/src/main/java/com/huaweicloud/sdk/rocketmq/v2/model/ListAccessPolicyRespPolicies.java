package com.huaweicloud.sdk.rocketmq.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * ListAccessPolicyRespPolicies
 */
public class ListAccessPolicyRespPolicies {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_key")

    @JacksonXmlProperty(localName = "access_key")

    private String accessKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "white_remote_address")

    @JacksonXmlProperty(localName = "white_remote_address")

    private String whiteRemoteAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin")

    @JacksonXmlProperty(localName = "admin")

    private Boolean admin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "perm")

    @JacksonXmlProperty(localName = "perm")

    private String perm;

    public ListAccessPolicyRespPolicies withAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }

    /**
     * 秘钥。
     * @return accessKey
     */
    public String getAccessKey() {
        return accessKey;
    }

    public void setAccessKey(String accessKey) {
        this.accessKey = accessKey;
    }

    public ListAccessPolicyRespPolicies withWhiteRemoteAddress(String whiteRemoteAddress) {
        this.whiteRemoteAddress = whiteRemoteAddress;
        return this;
    }

    /**
     * IP白名单。
     * @return whiteRemoteAddress
     */
    public String getWhiteRemoteAddress() {
        return whiteRemoteAddress;
    }

    public void setWhiteRemoteAddress(String whiteRemoteAddress) {
        this.whiteRemoteAddress = whiteRemoteAddress;
    }

    public ListAccessPolicyRespPolicies withAdmin(Boolean admin) {
        this.admin = admin;
        return this;
    }

    /**
     * 是否为管理员。
     * @return admin
     */
    public Boolean getAdmin() {
        return admin;
    }

    public void setAdmin(Boolean admin) {
        this.admin = admin;
    }

    public ListAccessPolicyRespPolicies withPerm(String perm) {
        this.perm = perm;
        return this;
    }

    /**
     * 权限。
     * @return perm
     */
    public String getPerm() {
        return perm;
    }

    public void setPerm(String perm) {
        this.perm = perm;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListAccessPolicyRespPolicies listAccessPolicyRespPolicies = (ListAccessPolicyRespPolicies) o;
        return Objects.equals(this.accessKey, listAccessPolicyRespPolicies.accessKey)
            && Objects.equals(this.whiteRemoteAddress, listAccessPolicyRespPolicies.whiteRemoteAddress)
            && Objects.equals(this.admin, listAccessPolicyRespPolicies.admin)
            && Objects.equals(this.perm, listAccessPolicyRespPolicies.perm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accessKey, whiteRemoteAddress, admin, perm);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAccessPolicyRespPolicies {\n");
        sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
        sb.append("    whiteRemoteAddress: ").append(toIndentedString(whiteRemoteAddress)).append("\n");
        sb.append("    admin: ").append(toIndentedString(admin)).append("\n");
        sb.append("    perm: ").append(toIndentedString(perm)).append("\n");
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
