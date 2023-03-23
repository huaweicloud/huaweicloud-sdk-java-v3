package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * CreateAuthInfoReq
 */
public class CreateAuthInfoReq {

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_location")

    private String certificateLocation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datasource_type")

    private String datasourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_password")

    private String keyPassword;

    public CreateAuthInfoReq withAuthInfoName(String authInfoName) {
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

    public CreateAuthInfoReq withUserName(String userName) {
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

    public CreateAuthInfoReq withPassword(String password) {
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

    public CreateAuthInfoReq withKrb5Conf(String krb5Conf) {
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

    public CreateAuthInfoReq withKeytab(String keytab) {
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

    public CreateAuthInfoReq withTruststoreLocation(String truststoreLocation) {
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

    public CreateAuthInfoReq withTruststorePassword(String truststorePassword) {
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

    public CreateAuthInfoReq withKeystoreLocation(String keystoreLocation) {
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

    public CreateAuthInfoReq withKeystorePassword(String keystorePassword) {
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

    public CreateAuthInfoReq withCertificateLocation(String certificateLocation) {
        this.certificateLocation = certificateLocation;
        return this;
    }

    /**
     * 用户安全集群的证书路径，目前只支持OBS路径，cer类型文件
     * @return certificateLocation
     */
    public String getCertificateLocation() {
        return certificateLocation;
    }

    public void setCertificateLocation(String certificateLocation) {
        this.certificateLocation = certificateLocation;
    }

    public CreateAuthInfoReq withDatasourceType(String datasourceType) {
        this.datasourceType = datasourceType;
        return this;
    }

    /**
     * 数据源类型，目前支持CSS,KRB,passwd,Kafka_SSL
     * @return datasourceType
     */
    public String getDatasourceType() {
        return datasourceType;
    }

    public void setDatasourceType(String datasourceType) {
        this.datasourceType = datasourceType;
    }

    public CreateAuthInfoReq withKeyPassword(String keyPassword) {
        this.keyPassword = keyPassword;
        return this;
    }

    /**
     * key密码
     * @return keyPassword
     */
    public String getKeyPassword() {
        return keyPassword;
    }

    public void setKeyPassword(String keyPassword) {
        this.keyPassword = keyPassword;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateAuthInfoReq createAuthInfoReq = (CreateAuthInfoReq) o;
        return Objects.equals(this.authInfoName, createAuthInfoReq.authInfoName)
            && Objects.equals(this.userName, createAuthInfoReq.userName)
            && Objects.equals(this.password, createAuthInfoReq.password)
            && Objects.equals(this.krb5Conf, createAuthInfoReq.krb5Conf)
            && Objects.equals(this.keytab, createAuthInfoReq.keytab)
            && Objects.equals(this.truststoreLocation, createAuthInfoReq.truststoreLocation)
            && Objects.equals(this.truststorePassword, createAuthInfoReq.truststorePassword)
            && Objects.equals(this.keystoreLocation, createAuthInfoReq.keystoreLocation)
            && Objects.equals(this.keystorePassword, createAuthInfoReq.keystorePassword)
            && Objects.equals(this.certificateLocation, createAuthInfoReq.certificateLocation)
            && Objects.equals(this.datasourceType, createAuthInfoReq.datasourceType)
            && Objects.equals(this.keyPassword, createAuthInfoReq.keyPassword);
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
            keystorePassword,
            certificateLocation,
            datasourceType,
            keyPassword);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAuthInfoReq {\n");
        sb.append("    authInfoName: ").append(toIndentedString(authInfoName)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    krb5Conf: ").append(toIndentedString(krb5Conf)).append("\n");
        sb.append("    keytab: ").append(toIndentedString(keytab)).append("\n");
        sb.append("    truststoreLocation: ").append(toIndentedString(truststoreLocation)).append("\n");
        sb.append("    truststorePassword: ").append(toIndentedString(truststorePassword)).append("\n");
        sb.append("    keystoreLocation: ").append(toIndentedString(keystoreLocation)).append("\n");
        sb.append("    keystorePassword: ").append(toIndentedString(keystorePassword)).append("\n");
        sb.append("    certificateLocation: ").append(toIndentedString(certificateLocation)).append("\n");
        sb.append("    datasourceType: ").append(toIndentedString(datasourceType)).append("\n");
        sb.append("    keyPassword: ").append(toIndentedString(keyPassword)).append("\n");
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
