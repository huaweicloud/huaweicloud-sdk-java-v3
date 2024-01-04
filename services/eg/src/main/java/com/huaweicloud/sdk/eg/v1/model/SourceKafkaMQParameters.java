package com.huaweicloud.sdk.eg.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * SourceKafkaMQParameters
 */
public class SourceKafkaMQParameters {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "addr")

    private String addr;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group")

    private String group;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_name")

    private String instanceName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security_protocol")

    private String securityProtocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instance_id")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "topic")

    private String topic;

    /**
     * 消费点位
     */
    public static final class SeekToEnum {

        /**
         * Enum LATEST for value: "latest"
         */
        public static final SeekToEnum LATEST = new SeekToEnum("latest");

        /**
         * Enum EARLIEST for value: "earliest"
         */
        public static final SeekToEnum EARLIEST = new SeekToEnum("earliest");

        private static final Map<String, SeekToEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SeekToEnum> createStaticFields() {
            Map<String, SeekToEnum> map = new HashMap<>();
            map.put("latest", LATEST);
            map.put("earliest", EARLIEST);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SeekToEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static SeekToEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SeekToEnum(value));
        }

        public static SeekToEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SeekToEnum) {
                return this.value.equals(((SeekToEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "seek_to")

    private SeekToEnum seekTo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_sasl_ssl")

    private Boolean enableSaslSsl;

    /**
     * SASL认证机制
     */
    public static final class SaslMechanismEnum {

        /**
         * Enum SCRAM_SHA_512 for value: "SCRAM-SHA-512"
         */
        public static final SaslMechanismEnum SCRAM_SHA_512 = new SaslMechanismEnum("SCRAM-SHA-512");

        /**
         * Enum PLAIN for value: "PLAIN"
         */
        public static final SaslMechanismEnum PLAIN = new SaslMechanismEnum("PLAIN");

        private static final Map<String, SaslMechanismEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SaslMechanismEnum> createStaticFields() {
            Map<String, SaslMechanismEnum> map = new HashMap<>();
            map.put("SCRAM-SHA-512", SCRAM_SHA_512);
            map.put("PLAIN", PLAIN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SaslMechanismEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static SaslMechanismEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SaslMechanismEnum(value));
        }

        public static SaslMechanismEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SaslMechanismEnum) {
                return this.value.equals(((SaslMechanismEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sasl_mechanism")

    private SaslMechanismEnum saslMechanism;

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

    public SourceKafkaMQParameters withAddr(String addr) {
        this.addr = addr;
        return this;
    }

    /**
     * kafka连接地址
     * @return addr
     */
    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

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

    public SourceKafkaMQParameters withSecurityProtocol(String securityProtocol) {
        this.securityProtocol = securityProtocol;
        return this;
    }

    /**
     * 安全协议
     * @return securityProtocol
     */
    public String getSecurityProtocol() {
        return securityProtocol;
    }

    public void setSecurityProtocol(String securityProtocol) {
        this.securityProtocol = securityProtocol;
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

    public SourceKafkaMQParameters withSeekTo(SeekToEnum seekTo) {
        this.seekTo = seekTo;
        return this;
    }

    /**
     * 消费点位
     * @return seekTo
     */
    public SeekToEnum getSeekTo() {
        return seekTo;
    }

    public void setSeekTo(SeekToEnum seekTo) {
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

    public SourceKafkaMQParameters withSaslMechanism(SaslMechanismEnum saslMechanism) {
        this.saslMechanism = saslMechanism;
        return this;
    }

    /**
     * SASL认证机制
     * @return saslMechanism
     */
    public SaslMechanismEnum getSaslMechanism() {
        return saslMechanism;
    }

    public void setSaslMechanism(SaslMechanismEnum saslMechanism) {
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
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SourceKafkaMQParameters that = (SourceKafkaMQParameters) obj;
        return Objects.equals(this.addr, that.addr) && Objects.equals(this.group, that.group)
            && Objects.equals(this.instanceName, that.instanceName)
            && Objects.equals(this.securityProtocol, that.securityProtocol)
            && Objects.equals(this.instanceId, that.instanceId) && Objects.equals(this.topic, that.topic)
            && Objects.equals(this.seekTo, that.seekTo) && Objects.equals(this.enableSaslSsl, that.enableSaslSsl)
            && Objects.equals(this.saslMechanism, that.saslMechanism)
            && Objects.equals(this.sslCertificateUrl, that.sslCertificateUrl)
            && Objects.equals(this.sslCertificatePwd, that.sslCertificatePwd)
            && Objects.equals(this.userName, that.userName) && Objects.equals(this.password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addr,
            group,
            instanceName,
            securityProtocol,
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
        sb.append("    addr: ").append(toIndentedString(addr)).append("\n");
        sb.append("    group: ").append(toIndentedString(group)).append("\n");
        sb.append("    instanceName: ").append(toIndentedString(instanceName)).append("\n");
        sb.append("    securityProtocol: ").append(toIndentedString(securityProtocol)).append("\n");
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
