package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpdateJobAuthInfoRequestBody
 */
public class UpdateJobAuthInfoRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_info_name")

    private String authInfoName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "krb5_conf")

    private String krb5Conf;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keytab")

    private String keytab;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "truststore_location")

    private String truststoreLocation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "truststore_password")

    private String truststorePassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keystore_location")

    private String keystoreLocation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "keystore_password")

    private String keystorePassword;

    public UpdateJobAuthInfoRequestBody withAuthInfoName(String authInfoName) {
        this.authInfoName = authInfoName;
        return this;
    }

    /**
     * 证书名
     * @return authInfoName
     */
    public String getAuthInfoName() {
        return authInfoName;
    }

    public void setAuthInfoName(String authInfoName) {
        this.authInfoName = authInfoName;
    }

    public UpdateJobAuthInfoRequestBody withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 用户安全集群的新登录用户名
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public UpdateJobAuthInfoRequestBody withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * 用户安全集群的新登录密码
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UpdateJobAuthInfoRequestBody withKrb5Conf(String krb5Conf) {
        this.krb5Conf = krb5Conf;
        return this;
    }

    /**
     * krb5配置文件obs路径
     * @return krb5Conf
     */
    public String getKrb5Conf() {
        return krb5Conf;
    }

    public void setKrb5Conf(String krb5Conf) {
        this.krb5Conf = krb5Conf;
    }

    public UpdateJobAuthInfoRequestBody withKeytab(String keytab) {
        this.keytab = keytab;
        return this;
    }

    /**
     * keytab配置文件obs路径
     * @return keytab
     */
    public String getKeytab() {
        return keytab;
    }

    public void setKeytab(String keytab) {
        this.keytab = keytab;
    }

    public UpdateJobAuthInfoRequestBody withTruststoreLocation(String truststoreLocation) {
        this.truststoreLocation = truststoreLocation;
        return this;
    }

    /**
     * truststore配置文件obs路径
     * @return truststoreLocation
     */
    public String getTruststoreLocation() {
        return truststoreLocation;
    }

    public void setTruststoreLocation(String truststoreLocation) {
        this.truststoreLocation = truststoreLocation;
    }

    public UpdateJobAuthInfoRequestBody withTruststorePassword(String truststorePassword) {
        this.truststorePassword = truststorePassword;
        return this;
    }

    /**
     * truststore配置文件密码
     * @return truststorePassword
     */
    public String getTruststorePassword() {
        return truststorePassword;
    }

    public void setTruststorePassword(String truststorePassword) {
        this.truststorePassword = truststorePassword;
    }

    public UpdateJobAuthInfoRequestBody withKeystoreLocation(String keystoreLocation) {
        this.keystoreLocation = keystoreLocation;
        return this;
    }

    /**
     * keystore配置文件obs路径
     * @return keystoreLocation
     */
    public String getKeystoreLocation() {
        return keystoreLocation;
    }

    public void setKeystoreLocation(String keystoreLocation) {
        this.keystoreLocation = keystoreLocation;
    }

    public UpdateJobAuthInfoRequestBody withKeystorePassword(String keystorePassword) {
        this.keystorePassword = keystorePassword;
        return this;
    }

    /**
     * keystore配置文件密码
     * @return keystorePassword
     */
    public String getKeystorePassword() {
        return keystorePassword;
    }

    public void setKeystorePassword(String keystorePassword) {
        this.keystorePassword = keystorePassword;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateJobAuthInfoRequestBody that = (UpdateJobAuthInfoRequestBody) obj;
        return Objects.equals(this.authInfoName, that.authInfoName) && Objects.equals(this.userName, that.userName)
            && Objects.equals(this.password, that.password) && Objects.equals(this.krb5Conf, that.krb5Conf)
            && Objects.equals(this.keytab, that.keytab)
            && Objects.equals(this.truststoreLocation, that.truststoreLocation)
            && Objects.equals(this.truststorePassword, that.truststorePassword)
            && Objects.equals(this.keystoreLocation, that.keystoreLocation)
            && Objects.equals(this.keystorePassword, that.keystorePassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authInfoName,
            userName,
            password,
            krb5Conf,
            keytab,
            truststoreLocation,
            truststorePassword,
            keystoreLocation,
            keystorePassword);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateJobAuthInfoRequestBody {\n");
        sb.append("    authInfoName: ").append(toIndentedString(authInfoName)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    krb5Conf: ").append(toIndentedString(krb5Conf)).append("\n");
        sb.append("    keytab: ").append(toIndentedString(keytab)).append("\n");
        sb.append("    truststoreLocation: ").append(toIndentedString(truststoreLocation)).append("\n");
        sb.append("    truststorePassword: ").append(toIndentedString(truststorePassword)).append("\n");
        sb.append("    keystoreLocation: ").append(toIndentedString(keystoreLocation)).append("\n");
        sb.append("    keystorePassword: ").append(toIndentedString(keystorePassword)).append("\n");
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
