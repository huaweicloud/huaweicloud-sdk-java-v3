package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * SourceKafkaMQParameters
 */
public class SourceKafkaMQParameters {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group")

    private String group;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic")

    private String topic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "seek_to")

    private String seekTo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_sasl_ssl")

    private Boolean enableSaslSsl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sasl_mechanism")

    private String saslMechanism;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl_certificate_url")

    private String sslCertificateUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ssl_certificate_pwd")

    private String sslCertificatePwd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    public SourceKafkaMQParameters withGroup(String group) {
        this.group = group;
        return this;
    }

    /**
     * kafka消费组
     * @return group
     */
    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public SourceKafkaMQParameters withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * kafka实例名称
     * @return instanceName
     */
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public SourceKafkaMQParameters withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * kafka实例ID
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public SourceKafkaMQParameters withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    /**
     * kafka topic名称
     * @return topic
     */
    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public SourceKafkaMQParameters withSeekTo(String seekTo) {
        this.seekTo = seekTo;
        return this;
    }

    /**
     * 消费点位
     * @return seekTo
     */
    public String getSeekTo() {
        return seekTo;
    }

    public void setSeekTo(String seekTo) {
        this.seekTo = seekTo;
    }

    public SourceKafkaMQParameters withEnableSaslSsl(Boolean enableSaslSsl) {
        this.enableSaslSsl = enableSaslSsl;
        return this;
    }

    /**
     * SASL_SSL是否开启
     * @return enableSaslSsl
     */
    public Boolean getEnableSaslSsl() {
        return enableSaslSsl;
    }

    public void setEnableSaslSsl(Boolean enableSaslSsl) {
        this.enableSaslSsl = enableSaslSsl;
    }

    public SourceKafkaMQParameters withSaslMechanism(String saslMechanism) {
        this.saslMechanism = saslMechanism;
        return this;
    }

    /**
     * SASL认证机制
     * @return saslMechanism
     */
    public String getSaslMechanism() {
        return saslMechanism;
    }

    public void setSaslMechanism(String saslMechanism) {
        this.saslMechanism = saslMechanism;
    }

    public SourceKafkaMQParameters withSslCertificateUrl(String sslCertificateUrl) {
        this.sslCertificateUrl = sslCertificateUrl;
        return this;
    }

    /**
     * SASL证书地址，配置的obs地址
     * @return sslCertificateUrl
     */
    public String getSslCertificateUrl() {
        return sslCertificateUrl;
    }

    public void setSslCertificateUrl(String sslCertificateUrl) {
        this.sslCertificateUrl = sslCertificateUrl;
    }

    public SourceKafkaMQParameters withSslCertificatePwd(String sslCertificatePwd) {
        this.sslCertificatePwd = sslCertificatePwd;
        return this;
    }

    /**
     * SASL证书密码
     * @return sslCertificatePwd
     */
    public String getSslCertificatePwd() {
        return sslCertificatePwd;
    }

    public void setSslCertificatePwd(String sslCertificatePwd) {
        this.sslCertificatePwd = sslCertificatePwd;
    }

    public SourceKafkaMQParameters withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 用户名
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public SourceKafkaMQParameters withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * 用户密码
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SourceKafkaMQParameters sourceKafkaMQParameters = (SourceKafkaMQParameters) o;
        return Objects.equals(this.group, sourceKafkaMQParameters.group)
            && Objects.equals(this.instanceName, sourceKafkaMQParameters.instanceName)
            && Objects.equals(this.instanceId, sourceKafkaMQParameters.instanceId)
            && Objects.equals(this.topic, sourceKafkaMQParameters.topic)
            && Objects.equals(this.seekTo, sourceKafkaMQParameters.seekTo)
            && Objects.equals(this.enableSaslSsl, sourceKafkaMQParameters.enableSaslSsl)
            && Objects.equals(this.saslMechanism, sourceKafkaMQParameters.saslMechanism)
            && Objects.equals(this.sslCertificateUrl, sourceKafkaMQParameters.sslCertificateUrl)
            && Objects.equals(this.sslCertificatePwd, sourceKafkaMQParameters.sslCertificatePwd)
            && Objects.equals(this.userName, sourceKafkaMQParameters.userName)
            && Objects.equals(this.password, sourceKafkaMQParameters.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(group,
            instanceName,
            instanceId,
            topic,
            seekTo,
            enableSaslSsl,
            saslMechanism,
            sslCertificateUrl,
            sslCertificatePwd,
            userName,
            password);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SourceKafkaMQParameters {\n");
        sb.append("    group: ").append(toIndentedString(group)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    topic: ").append(toIndentedString(topic)).append("\n");
        sb.append("    seekTo: ").append(toIndentedString(seekTo)).append("\n");
        sb.append("    enableSaslSsl: ").append(toIndentedString(enableSaslSsl)).append("\n");
        sb.append("    saslMechanism: ").append(toIndentedString(saslMechanism)).append("\n");
        sb.append("    sslCertificateUrl: ").append(toIndentedString(sslCertificateUrl)).append("\n");
        sb.append("    sslCertificatePwd: ").append(toIndentedString(sslCertificatePwd)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
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
