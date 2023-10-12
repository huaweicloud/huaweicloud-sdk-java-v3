package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 访问方式配置端口、协议、证书等信息。
 */
public class AccessConfigurationPort {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_port")

    private String targetPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port")

    private String port;

    /**
     * 协议。
     */
    public static final class ProtocolEnum {

        /**
         * Enum TCP for value: "TCP"
         */
        public static final ProtocolEnum TCP = new ProtocolEnum("TCP");

        /**
         * Enum HTTP for value: "HTTP"
         */
        public static final ProtocolEnum HTTP = new ProtocolEnum("HTTP");

        /**
         * Enum HTTPS for value: "HTTPS"
         */
        public static final ProtocolEnum HTTPS = new ProtocolEnum("HTTPS");

        private static final Map<String, ProtocolEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProtocolEnum> createStaticFields() {
            Map<String, ProtocolEnum> map = new HashMap<>();
            map.put("TCP", TCP);
            map.put("HTTP", HTTP);
            map.put("HTTPS", HTTPS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ProtocolEnum(String value) {
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
        public static ProtocolEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ProtocolEnum(value));
        }

        public static ProtocolEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ProtocolEnum) {
                return this.value.equals(((ProtocolEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private ProtocolEnum protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_certificate")

    private String defaultCertificate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "certificate")

    private String certificate;

    /**
     * 安全策略。
     */
    public static final class PolicyEnum {

        /**
         * Enum TLS_1_2_STRICT for value: "tls-1-2-strict"
         */
        public static final PolicyEnum TLS_1_2_STRICT = new PolicyEnum("tls-1-2-strict");

        /**
         * Enum TLS_1_2 for value: "tls-1-2"
         */
        public static final PolicyEnum TLS_1_2 = new PolicyEnum("tls-1-2");

        /**
         * Enum TLS_1_1 for value: "tls-1-1"
         */
        public static final PolicyEnum TLS_1_1 = new PolicyEnum("tls-1-1");

        /**
         * Enum TLS_1_0 for value: "tls-1-0"
         */
        public static final PolicyEnum TLS_1_0 = new PolicyEnum("tls-1-0");

        private static final Map<String, PolicyEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PolicyEnum> createStaticFields() {
            Map<String, PolicyEnum> map = new HashMap<>();
            map.put("tls-1-2-strict", TLS_1_2_STRICT);
            map.put("tls-1-2", TLS_1_2);
            map.put("tls-1-1", TLS_1_1);
            map.put("tls-1-0", TLS_1_0);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PolicyEnum(String value) {
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
        public static PolicyEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PolicyEnum(value));
        }

        public static PolicyEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PolicyEnum) {
                return this.value.equals(((PolicyEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy")

    private PolicyEnum policy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private List<AccessConfigurationHttpPath> path = null;

    public AccessConfigurationPort withTargetPort(String targetPort) {
        this.targetPort = targetPort;
        return this;
    }

    /**
     * 监听端口。
     * @return targetPort
     */
    public String getTargetPort() {
        return targetPort;
    }

    public void setTargetPort(String targetPort) {
        this.targetPort = targetPort;
    }

    public AccessConfigurationPort withPort(String port) {
        this.port = port;
        return this;
    }

    /**
     * 访问端口。
     * @return port
     */
    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public AccessConfigurationPort withProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 协议。
     * @return protocol
     */
    public ProtocolEnum getProtocol() {
        return protocol;
    }

    public void setProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
    }

    public AccessConfigurationPort withDefaultCertificate(String defaultCertificate) {
        this.defaultCertificate = defaultCertificate;
        return this;
    }

    /**
     * 默认证书，访问方式配置为转发策略且协议为HTTPS时配置，未配置域名证书对时使用默认证书。
     * @return defaultCertificate
     */
    public String getDefaultCertificate() {
        return defaultCertificate;
    }

    public void setDefaultCertificate(String defaultCertificate) {
        this.defaultCertificate = defaultCertificate;
    }

    public AccessConfigurationPort withCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }

    /**
     * 证书。
     * @return certificate
     */
    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    public AccessConfigurationPort withPolicy(PolicyEnum policy) {
        this.policy = policy;
        return this;
    }

    /**
     * 安全策略。
     * @return policy
     */
    public PolicyEnum getPolicy() {
        return policy;
    }

    public void setPolicy(PolicyEnum policy) {
        this.policy = policy;
    }

    public AccessConfigurationPort withPath(List<AccessConfigurationHttpPath> path) {
        this.path = path;
        return this;
    }

    public AccessConfigurationPort addPathItem(AccessConfigurationHttpPath pathItem) {
        if (this.path == null) {
            this.path = new ArrayList<>();
        }
        this.path.add(pathItem);
        return this;
    }

    public AccessConfigurationPort withPath(Consumer<List<AccessConfigurationHttpPath>> pathSetter) {
        if (this.path == null) {
            this.path = new ArrayList<>();
        }
        pathSetter.accept(this.path);
        return this;
    }

    /**
     * Get path
     * @return path
     */
    public List<AccessConfigurationHttpPath> getPath() {
        return path;
    }

    public void setPath(List<AccessConfigurationHttpPath> path) {
        this.path = path;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AccessConfigurationPort that = (AccessConfigurationPort) obj;
        return Objects.equals(this.targetPort, that.targetPort) && Objects.equals(this.port, that.port)
            && Objects.equals(this.protocol, that.protocol)
            && Objects.equals(this.defaultCertificate, that.defaultCertificate)
            && Objects.equals(this.certificate, that.certificate) && Objects.equals(this.policy, that.policy)
            && Objects.equals(this.path, that.path);
    }

    @Override
    public int hashCode() {
        return Objects.hash(targetPort, port, protocol, defaultCertificate, certificate, policy, path);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessConfigurationPort {\n");
        sb.append("    targetPort: ").append(toIndentedString(targetPort)).append("\n");
        sb.append("    port: ").append(toIndentedString(port)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    defaultCertificate: ").append(toIndentedString(defaultCertificate)).append("\n");
        sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
        sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
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
