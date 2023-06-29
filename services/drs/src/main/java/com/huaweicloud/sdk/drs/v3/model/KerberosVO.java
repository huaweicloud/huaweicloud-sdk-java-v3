package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * kerberos认证需要的信息
 */
public class KerberosVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "krb5_conf_file")

    private String krb5ConfFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_tab_file")

    private String keyTabFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_principal")

    private String userPrincipal;

    public KerberosVO withKrb5ConfFile(String krb5ConfFile) {
        this.krb5ConfFile = krb5ConfFile;
        return this;
    }

    /**
     * krb5配置文件
     * @return krb5ConfFile
     */
    public String getKrb5ConfFile() {
        return krb5ConfFile;
    }

    public void setKrb5ConfFile(String krb5ConfFile) {
        this.krb5ConfFile = krb5ConfFile;
    }

    public KerberosVO withKeyTabFile(String keyTabFile) {
        this.keyTabFile = keyTabFile;
        return this;
    }

    /**
     * key文件
     * @return keyTabFile
     */
    public String getKeyTabFile() {
        return keyTabFile;
    }

    public void setKeyTabFile(String keyTabFile) {
        this.keyTabFile = keyTabFile;
    }

    public KerberosVO withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * 域名
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public KerberosVO withUserPrincipal(String userPrincipal) {
        this.userPrincipal = userPrincipal;
        return this;
    }

    /**
     * Kerberos用户对象
     * @return userPrincipal
     */
    public String getUserPrincipal() {
        return userPrincipal;
    }

    public void setUserPrincipal(String userPrincipal) {
        this.userPrincipal = userPrincipal;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        KerberosVO that = (KerberosVO) obj;
        return Objects.equals(this.krb5ConfFile, that.krb5ConfFile) && Objects.equals(this.keyTabFile, that.keyTabFile)
            && Objects.equals(this.domainName, that.domainName)
            && Objects.equals(this.userPrincipal, that.userPrincipal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(krb5ConfFile, keyTabFile, domainName, userPrincipal);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KerberosVO {\n");
        sb.append("    krb5ConfFile: ").append(toIndentedString(krb5ConfFile)).append("\n");
        sb.append("    keyTabFile: ").append(toIndentedString(keyTabFile)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
        sb.append("    userPrincipal: ").append(toIndentedString(userPrincipal)).append("\n");
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
