package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AuthInfos
 */
public class AuthInfos {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_info_name")

    private String authInfoName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate_location")

    private String certificateLocation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datasource_type")

    private String datasourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

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
    @JsonProperty(value = "keystore_location")

    private String keystoreLocation;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "owner")

    private String owner;

    public AuthInfos withAuthInfoName(String authInfoName) {
        this.authInfoName = authInfoName;
        return this;
    }

    /**
     * 用户安全集群的登录用户名
     * @return authInfoName
     */
    public String getAuthInfoName() {
        return authInfoName;
    }

    public void setAuthInfoName(String authInfoName) {
        this.authInfoName = authInfoName;
    }

    public AuthInfos withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 用户安全集群的登录密码
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public AuthInfos withCertificateLocation(String certificateLocation) {
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

    public AuthInfos withDatasourceType(String datasourceType) {
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

    public AuthInfos withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间戳
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public AuthInfos withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间戳
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public AuthInfos withKrb5Conf(String krb5Conf) {
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

    public AuthInfos withKeytab(String keytab) {
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

    public AuthInfos withTruststoreLocation(String truststoreLocation) {
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

    public AuthInfos withKeystoreLocation(String keystoreLocation) {
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

    public AuthInfos withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * 所属用户名
     * @return owner
     */
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AuthInfos authInfos = (AuthInfos) o;
        return Objects.equals(this.authInfoName, authInfos.authInfoName)
            && Objects.equals(this.userName, authInfos.userName)
            && Objects.equals(this.certificateLocation, authInfos.certificateLocation)
            && Objects.equals(this.datasourceType, authInfos.datasourceType)
            && Objects.equals(this.createTime, authInfos.createTime)
            && Objects.equals(this.updateTime, authInfos.updateTime)
            && Objects.equals(this.krb5Conf, authInfos.krb5Conf) && Objects.equals(this.keytab, authInfos.keytab)
            && Objects.equals(this.truststoreLocation, authInfos.truststoreLocation)
            && Objects.equals(this.keystoreLocation, authInfos.keystoreLocation)
            && Objects.equals(this.owner, authInfos.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authInfoName,
            userName,
            certificateLocation,
            datasourceType,
            createTime,
            updateTime,
            krb5Conf,
            keytab,
            truststoreLocation,
            keystoreLocation,
            owner);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AuthInfos {\n");
        sb.append("    authInfoName: ").append(toIndentedString(authInfoName)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    certificateLocation: ").append(toIndentedString(certificateLocation)).append("\n");
        sb.append("    datasourceType: ").append(toIndentedString(datasourceType)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    krb5Conf: ").append(toIndentedString(krb5Conf)).append("\n");
        sb.append("    keytab: ").append(toIndentedString(keytab)).append("\n");
        sb.append("    truststoreLocation: ").append(toIndentedString(truststoreLocation)).append("\n");
        sb.append("    keystoreLocation: ").append(toIndentedString(keystoreLocation)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
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
