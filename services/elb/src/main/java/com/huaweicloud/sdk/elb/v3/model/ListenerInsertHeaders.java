package com.huaweicloud.sdk.elb.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ListenerInsertHeaders
 */
public class ListenerInsertHeaders {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-ELB-IP")

    private Boolean xForwardedELBIP;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-Port")

    private Boolean xForwardedPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-For-Port")

    private Boolean xForwardedForPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-Host")

    private Boolean xForwardedHost;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-Proto")

    private Boolean xForwardedProto;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Real-IP")

    private Boolean xRealIP;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-ELB-ID")

    private Boolean xForwardedELBID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-TLS-Certificate-ID")

    private Boolean xForwardedTLSCertificateID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-TLS-Protocol")

    private Boolean xForwardedTLSProtocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-TLS-Cipher")

    private Boolean xForwardedTLSCipher;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-TLS-Protocol-alias")

    private String xForwardedTLSProtocolAlias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-TLS-Cipher-alias")

    private String xForwardedTLSCipherAlias;

    /**
     * **参数解释**：处理X-Forwarded-For头字段的模式： 配置 append，将请求发送至后端服务之前把最后一跳 IP 加入X-Forwarded-For头字段； 配置 remove，请求发送至后端服务之前删除X-Forwarded-For标头，无论请求是否携带X-Forwarded-For头字段； 配置preserve，保留请求中已有的X-Forwarded-For标头；  **约束限制**：仅HTTP、HTTPS、TERMINATED_HTTPS、QUIC协议的监听器支持该字段；  **取值范围**：append、remove、preserve  **默认取值**：append
     */
    public static final class XForwardedForProcessingModeEnum {

        /**
         * Enum APPEND_REMOVE_PRESERVE for value: "append、remove、preserve"
         */
        public static final XForwardedForProcessingModeEnum APPEND_REMOVE_PRESERVE =
            new XForwardedForProcessingModeEnum("append、remove、preserve");

        private static final Map<String, XForwardedForProcessingModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, XForwardedForProcessingModeEnum> createStaticFields() {
            Map<String, XForwardedForProcessingModeEnum> map = new HashMap<>();
            map.put("append、remove、preserve", APPEND_REMOVE_PRESERVE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        XForwardedForProcessingModeEnum(String value) {
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
        public static XForwardedForProcessingModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElse(new XForwardedForProcessingModeEnum(value));
        }

        public static XForwardedForProcessingModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof XForwardedForProcessingModeEnum) {
                return this.value.equals(((XForwardedForProcessingModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-For-Processing-Mode")

    private XForwardedForProcessingModeEnum xForwardedForProcessingMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-Clientcert-subjectdn-enable")

    private Boolean xForwardedClientcertSubjectdnEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-Clientcert-subjectdn-alias")

    private String xForwardedClientcertSubjectdnAlias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-Clientcert-issuerdn-enable")

    private Boolean xForwardedClientcertIssuerdnEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-Clientcert-issuerdn-alias")

    private String xForwardedClientcertIssuerdnAlias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-Clientcert-fingerprint-enable")

    private Boolean xForwardedClientcertFingerprintEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-Clientcert-fingerprint-alias")

    private String xForwardedClientcertFingerprintAlias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-Clientcert-clientverify-enable")

    private Boolean xForwardedClientcertClientverifyEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-Clientcert-clientverify-alias")

    private String xForwardedClientcertClientverifyAlias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-Clientcert-serialnumber-enable")

    private Boolean xForwardedClientcertSerialnumberEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-Clientcert-serialnumber-alias")

    private String xForwardedClientcertSerialnumberAlias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-Clientcert-enable")

    private Boolean xForwardedClientcertEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-Clientcert-alias")

    private String xForwardedClientcertAlias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-Clientcert-ciphers-enable")

    private Boolean xForwardedClientcertCiphersEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-Clientcert-ciphers-alias")

    private String xForwardedClientcertCiphersAlias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-Clientcert-end-enable")

    private Boolean xForwardedClientcertEndEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-Clientcert-end-alias")

    private String xForwardedClientcertEndAlias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-Tls-Alpn-Protocol-enable")

    private Boolean xForwardedTlsAlpnProtocolEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-Tls-Alpn-Protocol-alias")

    private String xForwardedTlsAlpnProtocolAlias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-Tls-Sni-enable")

    private Boolean xForwardedTlsSniEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-Tls-Sni-alias")

    private String xForwardedTlsSniAlias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-Tls-Ja3-enable")

    private Boolean xForwardedTlsJa3Enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-Tls-Ja3-alias")

    private String xForwardedTlsJa3Alias;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-Tls-Ja4-enable")

    private Boolean xForwardedTlsJa4Enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-Tls-Ja4-alias")

    private String xForwardedTlsJa4Alias;

    public ListenerInsertHeaders withXForwardedELBIP(Boolean xForwardedELBIP) {
        this.xForwardedELBIP = xForwardedELBIP;
        return this;
    }

    /**
     * **参数解释**：X-Forwarded-ELB-IP设为true可以将ELB实例的eip地址从报文的http头中带到后端服务器。
     * @return xForwardedELBIP
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-ELB-IP")
    public Boolean getXForwardedELBIP() {
        return xForwardedELBIP;
    }

    public void setXForwardedELBIP(Boolean xForwardedELBIP) {
        this.xForwardedELBIP = xForwardedELBIP;
    }

    public ListenerInsertHeaders withXForwardedPort(Boolean xForwardedPort) {
        this.xForwardedPort = xForwardedPort;
        return this;
    }

    /**
     * **参数解释**：X-Forwarded-Port设为true可以将ELB实例的监听端口从报文的http头中带到后端服务器。
     * @return xForwardedPort
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-Port")
    public Boolean getXForwardedPort() {
        return xForwardedPort;
    }

    public void setXForwardedPort(Boolean xForwardedPort) {
        this.xForwardedPort = xForwardedPort;
    }

    public ListenerInsertHeaders withXForwardedForPort(Boolean xForwardedForPort) {
        this.xForwardedForPort = xForwardedForPort;
        return this;
    }

    /**
     * **参数解释**：X-Forwarded-For-Port设为true可以将客户端的源端口从报文的http头中带到后端服务器。
     * @return xForwardedForPort
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-For-Port")
    public Boolean getXForwardedForPort() {
        return xForwardedForPort;
    }

    public void setXForwardedForPort(Boolean xForwardedForPort) {
        this.xForwardedForPort = xForwardedForPort;
    }

    public ListenerInsertHeaders withXForwardedHost(Boolean xForwardedHost) {
        this.xForwardedHost = xForwardedHost;
        return this;
    }

    /**
     * **参数解释**：X-Forwarded-Host设为true可以将客户请求头的X-Forwarded-Host设置为请求头的Host带到后端服务器。
     * @return xForwardedHost
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-Host")
    public Boolean getXForwardedHost() {
        return xForwardedHost;
    }

    public void setXForwardedHost(Boolean xForwardedHost) {
        this.xForwardedHost = xForwardedHost;
    }

    public ListenerInsertHeaders withXForwardedProto(Boolean xForwardedProto) {
        this.xForwardedProto = xForwardedProto;
        return this;
    }

    /**
     * **参数解释**：X-Forwarded-Proto设为true可以将负载均衡器实例的监听协议通过报文的http头带到后端服务器。
     * @return xForwardedProto
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-Proto")
    public Boolean getXForwardedProto() {
        return xForwardedProto;
    }

    public void setXForwardedProto(Boolean xForwardedProto) {
        this.xForwardedProto = xForwardedProto;
    }

    public ListenerInsertHeaders withXRealIP(Boolean xRealIP) {
        this.xRealIP = xRealIP;
        return this;
    }

    /**
     * **参数解释**：X-Real-IP设为true可以将客户端的IP通过报文的http头带到后端服务器。
     * @return xRealIP
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Real-IP")
    public Boolean getXRealIP() {
        return xRealIP;
    }

    public void setXRealIP(Boolean xRealIP) {
        this.xRealIP = xRealIP;
    }

    public ListenerInsertHeaders withXForwardedELBID(Boolean xForwardedELBID) {
        this.xForwardedELBID = xForwardedELBID;
        return this;
    }

    /**
     * **参数解释**：X-Forwarded-ELB-ID设为true可以将负载均衡器实例的ID通过报文的http头带到后端服务器。
     * @return xForwardedELBID
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-ELB-ID")
    public Boolean getXForwardedELBID() {
        return xForwardedELBID;
    }

    public void setXForwardedELBID(Boolean xForwardedELBID) {
        this.xForwardedELBID = xForwardedELBID;
    }

    public ListenerInsertHeaders withXForwardedTLSCertificateID(Boolean xForwardedTLSCertificateID) {
        this.xForwardedTLSCertificateID = xForwardedTLSCertificateID;
        return this;
    }

    /**
     * **参数解释**：X-Forwarded-TLS-Certificate-ID设为true可以将负载均衡器实例的证书ID通过报文的http头带到后端服务器。
     * @return xForwardedTLSCertificateID
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-TLS-Certificate-ID")
    public Boolean getXForwardedTLSCertificateID() {
        return xForwardedTLSCertificateID;
    }

    public void setXForwardedTLSCertificateID(Boolean xForwardedTLSCertificateID) {
        this.xForwardedTLSCertificateID = xForwardedTLSCertificateID;
    }

    public ListenerInsertHeaders withXForwardedTLSProtocol(Boolean xForwardedTLSProtocol) {
        this.xForwardedTLSProtocol = xForwardedTLSProtocol;
        return this;
    }

    /**
     * **参数解释**：X-Forwarded-TLS-Protocol设为true可以将负载均衡器实例的算法协议通过报文的http头带到后端服务器。
     * @return xForwardedTLSProtocol
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-TLS-Protocol")
    public Boolean getXForwardedTLSProtocol() {
        return xForwardedTLSProtocol;
    }

    public void setXForwardedTLSProtocol(Boolean xForwardedTLSProtocol) {
        this.xForwardedTLSProtocol = xForwardedTLSProtocol;
    }

    public ListenerInsertHeaders withXForwardedTLSCipher(Boolean xForwardedTLSCipher) {
        this.xForwardedTLSCipher = xForwardedTLSCipher;
        return this;
    }

    /**
     * **参数解释**：X-Forwarded-TLS-Cipher设为true可以将负载均衡器实例的算法套件通过报文的http头带到后端服务器。
     * @return xForwardedTLSCipher
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-TLS-Cipher")
    public Boolean getXForwardedTLSCipher() {
        return xForwardedTLSCipher;
    }

    public void setXForwardedTLSCipher(Boolean xForwardedTLSCipher) {
        this.xForwardedTLSCipher = xForwardedTLSCipher;
    }

    public ListenerInsertHeaders withXForwardedTLSProtocolAlias(String xForwardedTLSProtocolAlias) {
        this.xForwardedTLSProtocolAlias = xForwardedTLSProtocolAlias;
        return this;
    }

    /**
     * **参数解释**：自定义X-Forwarded-TLS-Protocol头字段名称。  **约束限制**：只有当 X-Forwarded-TLS-Protocol 的值为 true 时，此值才会生效。仅HTTPS、TERMINATED_HTTPS、QUIC协议的监听器支持该字段  **取值范围**：1~40 个字符。支持字母 a~z、短划线（-）、下划线（_）和数字。  **默认取值**：无
     * @return xForwardedTLSProtocolAlias
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-TLS-Protocol-alias")
    public String getXForwardedTLSProtocolAlias() {
        return xForwardedTLSProtocolAlias;
    }

    public void setXForwardedTLSProtocolAlias(String xForwardedTLSProtocolAlias) {
        this.xForwardedTLSProtocolAlias = xForwardedTLSProtocolAlias;
    }

    public ListenerInsertHeaders withXForwardedTLSCipherAlias(String xForwardedTLSCipherAlias) {
        this.xForwardedTLSCipherAlias = xForwardedTLSCipherAlias;
        return this;
    }

    /**
     * **参数解释**：自定义X-Forwarded-TLS-Cipher头字段名称。  **约束限制**：只有当 X-Forwarded-TLS-Cipher 的值为 true 时，此值才会生效。仅HTTPS、TERMINATED_HTTPS、QUIC协议的监听器支持该字段  **取值范围**：1~40 个字符。支持字母 a~z、短划线（-）、下划线（_）和数字。  **默认取值**：无
     * @return xForwardedTLSCipherAlias
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-TLS-Cipher-alias")
    public String getXForwardedTLSCipherAlias() {
        return xForwardedTLSCipherAlias;
    }

    public void setXForwardedTLSCipherAlias(String xForwardedTLSCipherAlias) {
        this.xForwardedTLSCipherAlias = xForwardedTLSCipherAlias;
    }

    public ListenerInsertHeaders withXForwardedForProcessingMode(
        XForwardedForProcessingModeEnum xForwardedForProcessingMode) {
        this.xForwardedForProcessingMode = xForwardedForProcessingMode;
        return this;
    }

    /**
     * **参数解释**：处理X-Forwarded-For头字段的模式： 配置 append，将请求发送至后端服务之前把最后一跳 IP 加入X-Forwarded-For头字段； 配置 remove，请求发送至后端服务之前删除X-Forwarded-For标头，无论请求是否携带X-Forwarded-For头字段； 配置preserve，保留请求中已有的X-Forwarded-For标头；  **约束限制**：仅HTTP、HTTPS、TERMINATED_HTTPS、QUIC协议的监听器支持该字段；  **取值范围**：append、remove、preserve  **默认取值**：append
     * @return xForwardedForProcessingMode
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-For-Processing-Mode")
    public XForwardedForProcessingModeEnum getXForwardedForProcessingMode() {
        return xForwardedForProcessingMode;
    }

    public void setXForwardedForProcessingMode(XForwardedForProcessingModeEnum xForwardedForProcessingMode) {
        this.xForwardedForProcessingMode = xForwardedForProcessingMode;
    }

    public ListenerInsertHeaders withXForwardedClientcertSubjectdnEnable(Boolean xForwardedClientcertSubjectdnEnable) {
        this.xForwardedClientcertSubjectdnEnable = xForwardedClientcertSubjectdnEnable;
        return this;
    }

    /**
     * **参数解释**：是否通过X-Forwarded-Clientcert-subjectdn头字段获取访问负载均衡实例客户端证书的所有者信息。  **约束限制**：仅HTTPS、TERMINATED_HTTPS、QUIC协议的监听器支持该字段  **取值范围**：true、false  **默认取值**：false
     * @return xForwardedClientcertSubjectdnEnable
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-Clientcert-subjectdn-enable")
    public Boolean getXForwardedClientcertSubjectdnEnable() {
        return xForwardedClientcertSubjectdnEnable;
    }

    public void setXForwardedClientcertSubjectdnEnable(Boolean xForwardedClientcertSubjectdnEnable) {
        this.xForwardedClientcertSubjectdnEnable = xForwardedClientcertSubjectdnEnable;
    }

    public ListenerInsertHeaders withXForwardedClientcertSubjectdnAlias(String xForwardedClientcertSubjectdnAlias) {
        this.xForwardedClientcertSubjectdnAlias = xForwardedClientcertSubjectdnAlias;
        return this;
    }

    /**
     * **参数解释**：自定义X-Forwarded-Clientcert-subjectdn头字段名称。  **约束限制**：只有当 X-Forwarded-Clientcert-subjectdn-enable 的值为 true 时，此值才会生效。仅HTTPS、TERMINATED_HTTPS、QUIC协议的监听器支持该字段  **取值范围**：1~40 个字符。支持字母 a~z、短划线（-）、下划线（_）和数字。  **默认取值**：无
     * @return xForwardedClientcertSubjectdnAlias
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-Clientcert-subjectdn-alias")
    public String getXForwardedClientcertSubjectdnAlias() {
        return xForwardedClientcertSubjectdnAlias;
    }

    public void setXForwardedClientcertSubjectdnAlias(String xForwardedClientcertSubjectdnAlias) {
        this.xForwardedClientcertSubjectdnAlias = xForwardedClientcertSubjectdnAlias;
    }

    public ListenerInsertHeaders withXForwardedClientcertIssuerdnEnable(Boolean xForwardedClientcertIssuerdnEnable) {
        this.xForwardedClientcertIssuerdnEnable = xForwardedClientcertIssuerdnEnable;
        return this;
    }

    /**
     * **参数解释**：是否通过X-Forwarded-Clientcert-issuerdn头字段获取访问负载均衡实例客户端证书的发行者信息。  **约束限制**：仅HTTPS、TERMINATED_HTTPS、QUIC协议的监听器支持该字段  **取值范围**：true、false  **默认取值**：false
     * @return xForwardedClientcertIssuerdnEnable
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-Clientcert-issuerdn-enable")
    public Boolean getXForwardedClientcertIssuerdnEnable() {
        return xForwardedClientcertIssuerdnEnable;
    }

    public void setXForwardedClientcertIssuerdnEnable(Boolean xForwardedClientcertIssuerdnEnable) {
        this.xForwardedClientcertIssuerdnEnable = xForwardedClientcertIssuerdnEnable;
    }

    public ListenerInsertHeaders withXForwardedClientcertIssuerdnAlias(String xForwardedClientcertIssuerdnAlias) {
        this.xForwardedClientcertIssuerdnAlias = xForwardedClientcertIssuerdnAlias;
        return this;
    }

    /**
     * **参数解释**：自定义X-Forwarded-Clientcert-issuerdn头字段名称。  **约束限制**：只有当 X-Forwarded-Clientcert-issuerdn-enable 的值为 true 时，此值才会生效。仅HTTPS、TERMINATED_HTTPS、QUIC协议的监听器支持该字段  **取值范围**：1~40 个字符。支持字母 a~z、短划线（-）、下划线（_）和数字。  **默认取值**：无
     * @return xForwardedClientcertIssuerdnAlias
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-Clientcert-issuerdn-alias")
    public String getXForwardedClientcertIssuerdnAlias() {
        return xForwardedClientcertIssuerdnAlias;
    }

    public void setXForwardedClientcertIssuerdnAlias(String xForwardedClientcertIssuerdnAlias) {
        this.xForwardedClientcertIssuerdnAlias = xForwardedClientcertIssuerdnAlias;
    }

    public ListenerInsertHeaders withXForwardedClientcertFingerprintEnable(
        Boolean xForwardedClientcertFingerprintEnable) {
        this.xForwardedClientcertFingerprintEnable = xForwardedClientcertFingerprintEnable;
        return this;
    }

    /**
     * **参数解释**：是否通过X-Forwarded-Clientcert-fingerprint头字段获取访问负载均衡实例客户端证书的指纹取值。  **约束限制**：仅HTTPS、TERMINATED_HTTPS、QUIC协议的监听器支持该字段  **取值范围**：true、false  **默认取值**：false
     * @return xForwardedClientcertFingerprintEnable
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-Clientcert-fingerprint-enable")
    public Boolean getXForwardedClientcertFingerprintEnable() {
        return xForwardedClientcertFingerprintEnable;
    }

    public void setXForwardedClientcertFingerprintEnable(Boolean xForwardedClientcertFingerprintEnable) {
        this.xForwardedClientcertFingerprintEnable = xForwardedClientcertFingerprintEnable;
    }

    public ListenerInsertHeaders withXForwardedClientcertFingerprintAlias(String xForwardedClientcertFingerprintAlias) {
        this.xForwardedClientcertFingerprintAlias = xForwardedClientcertFingerprintAlias;
        return this;
    }

    /**
     * **参数解释**：自定义X-Forwarded-Clientcert-fingerprint头字段名称。  **约束限制**：只有当 X-Forwarded-Clientcert-fingerprint-enable 的值为 true 时，此值才会生效。仅HTTPS、TERMINATED_HTTPS、QUIC协议的监听器支持该字段  **取值范围**：1~40 个字符。支持字母 a~z、短划线（-）、下划线（_）和数字。  **默认取值**：无
     * @return xForwardedClientcertFingerprintAlias
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-Clientcert-fingerprint-alias")
    public String getXForwardedClientcertFingerprintAlias() {
        return xForwardedClientcertFingerprintAlias;
    }

    public void setXForwardedClientcertFingerprintAlias(String xForwardedClientcertFingerprintAlias) {
        this.xForwardedClientcertFingerprintAlias = xForwardedClientcertFingerprintAlias;
    }

    public ListenerInsertHeaders withXForwardedClientcertClientverifyEnable(
        Boolean xForwardedClientcertClientverifyEnable) {
        this.xForwardedClientcertClientverifyEnable = xForwardedClientcertClientverifyEnable;
        return this;
    }

    /**
     * **参数解释**：是否通过X-Forwarded-Clientcert-clientverify头字段获取对访问负载均衡实例客户端证书的校验结果。  **约束限制**：仅HTTPS、TERMINATED_HTTPS、QUIC协议的监听器支持该字段  **取值范围**：true、false  **默认取值**：false
     * @return xForwardedClientcertClientverifyEnable
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-Clientcert-clientverify-enable")
    public Boolean getXForwardedClientcertClientverifyEnable() {
        return xForwardedClientcertClientverifyEnable;
    }

    public void setXForwardedClientcertClientverifyEnable(Boolean xForwardedClientcertClientverifyEnable) {
        this.xForwardedClientcertClientverifyEnable = xForwardedClientcertClientverifyEnable;
    }

    public ListenerInsertHeaders withXForwardedClientcertClientverifyAlias(
        String xForwardedClientcertClientverifyAlias) {
        this.xForwardedClientcertClientverifyAlias = xForwardedClientcertClientverifyAlias;
        return this;
    }

    /**
     * **参数解释**：自定义X-Forwarded-Clientcert-clientverify头字段名称。  **约束限制**：只有当 X-Forwarded-Clientcert-clientverify-enable 的值为 true 时，此值才会生效。仅HTTPS、TERMINATED_HTTPS、QUIC协议的监听器支持该字段  **取值范围**：1~40 个字符。支持字母 a~z、短划线（-）、下划线（_）和数字。  **默认取值**：无
     * @return xForwardedClientcertClientverifyAlias
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-Clientcert-clientverify-alias")
    public String getXForwardedClientcertClientverifyAlias() {
        return xForwardedClientcertClientverifyAlias;
    }

    public void setXForwardedClientcertClientverifyAlias(String xForwardedClientcertClientverifyAlias) {
        this.xForwardedClientcertClientverifyAlias = xForwardedClientcertClientverifyAlias;
    }

    public ListenerInsertHeaders withXForwardedClientcertSerialnumberEnable(
        Boolean xForwardedClientcertSerialnumberEnable) {
        this.xForwardedClientcertSerialnumberEnable = xForwardedClientcertSerialnumberEnable;
        return this;
    }

    /**
     * **参数解释**：是否通过X-Forwarded-Clientcert-serialnumber 头字段获取客户端证书的序列号信息。  **约束限制**：仅HTTPS、TERMINATED_HTTPS、QUIC协议的监听器支持该字段  **取值范围**：true、false  **默认取值**：false
     * @return xForwardedClientcertSerialnumberEnable
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-Clientcert-serialnumber-enable")
    public Boolean getXForwardedClientcertSerialnumberEnable() {
        return xForwardedClientcertSerialnumberEnable;
    }

    public void setXForwardedClientcertSerialnumberEnable(Boolean xForwardedClientcertSerialnumberEnable) {
        this.xForwardedClientcertSerialnumberEnable = xForwardedClientcertSerialnumberEnable;
    }

    public ListenerInsertHeaders withXForwardedClientcertSerialnumberAlias(
        String xForwardedClientcertSerialnumberAlias) {
        this.xForwardedClientcertSerialnumberAlias = xForwardedClientcertSerialnumberAlias;
        return this;
    }

    /**
     * **参数解释**：自定义X-Forwarded-Clientcert-serialnumber头字段名称。  **约束限制**：只有当X-Forwarded-Clientcert-serialnumber-enable 的值为 true 时，此值才会生效。仅HTTPS、TERMINATED_HTTPS、QUIC协议的监听器支持该字段  **取值范围**：1~40 个字符。支持字母 a~z、短划线（-）、下划线（_）和数字。  **默认取值**：无
     * @return xForwardedClientcertSerialnumberAlias
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-Clientcert-serialnumber-alias")
    public String getXForwardedClientcertSerialnumberAlias() {
        return xForwardedClientcertSerialnumberAlias;
    }

    public void setXForwardedClientcertSerialnumberAlias(String xForwardedClientcertSerialnumberAlias) {
        this.xForwardedClientcertSerialnumberAlias = xForwardedClientcertSerialnumberAlias;
    }

    public ListenerInsertHeaders withXForwardedClientcertEnable(Boolean xForwardedClientcertEnable) {
        this.xForwardedClientcertEnable = xForwardedClientcertEnable;
        return this;
    }

    /**
     * **参数解释**：是否通过X-Forwarded-Clientcert 头字段获取客户端证书的内容。  **约束限制**：仅HTTPS、TERMINATED_HTTPS、QUIC协议的监听器支持该字段  **取值范围**：true、false  **默认取值**：false
     * @return xForwardedClientcertEnable
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-Clientcert-enable")
    public Boolean getXForwardedClientcertEnable() {
        return xForwardedClientcertEnable;
    }

    public void setXForwardedClientcertEnable(Boolean xForwardedClientcertEnable) {
        this.xForwardedClientcertEnable = xForwardedClientcertEnable;
    }

    public ListenerInsertHeaders withXForwardedClientcertAlias(String xForwardedClientcertAlias) {
        this.xForwardedClientcertAlias = xForwardedClientcertAlias;
        return this;
    }

    /**
     * **参数解释**：自定义X-Forwarded-Clientcert头字段名称。  **约束限制**：只有当X-Forwarded-Clientcert-enable 的值为 true 时，此值才会生效。仅HTTPS、TERMINATED_HTTPS、QUIC、TLS协议的监听器支持该字段  **取值范围**：1~40 个字符。支持字母 a~z、短划线（-）、下划线（_）和数字。  **默认取值**：无
     * @return xForwardedClientcertAlias
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-Clientcert-alias")
    public String getXForwardedClientcertAlias() {
        return xForwardedClientcertAlias;
    }

    public void setXForwardedClientcertAlias(String xForwardedClientcertAlias) {
        this.xForwardedClientcertAlias = xForwardedClientcertAlias;
    }

    public ListenerInsertHeaders withXForwardedClientcertCiphersEnable(Boolean xForwardedClientcertCiphersEnable) {
        this.xForwardedClientcertCiphersEnable = xForwardedClientcertCiphersEnable;
        return this;
    }

    /**
     * **参数解释**：是否通过X-Forwarded-Clientcert-ciphers 头字段获取客户端支持的TLS加密套件。  **约束限制**：仅HTTPS、TERMINATED_HTTPS、QUIC协议的监听器支持该字段。  **取值范围**：true、false  **默认取值**：false
     * @return xForwardedClientcertCiphersEnable
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-Clientcert-ciphers-enable")
    public Boolean getXForwardedClientcertCiphersEnable() {
        return xForwardedClientcertCiphersEnable;
    }

    public void setXForwardedClientcertCiphersEnable(Boolean xForwardedClientcertCiphersEnable) {
        this.xForwardedClientcertCiphersEnable = xForwardedClientcertCiphersEnable;
    }

    public ListenerInsertHeaders withXForwardedClientcertCiphersAlias(String xForwardedClientcertCiphersAlias) {
        this.xForwardedClientcertCiphersAlias = xForwardedClientcertCiphersAlias;
        return this;
    }

    /**
     * **参数解释**：自定义X-Forwarded-Clientcert-ciphers头字段名称。  **约束限制**：只有当X-Forwarded-Clientcert-ciphers-enable 的值为 true 时，此值才会生效。仅HTTPS、TERMINATED_HTTPS、QUIC协议的监听器支持该字段  **取值范围**：1~40 个字符。支持字母 a~z、短划线（-）、下划线（_）和数字。  **默认取值**：无
     * @return xForwardedClientcertCiphersAlias
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-Clientcert-ciphers-alias")
    public String getXForwardedClientcertCiphersAlias() {
        return xForwardedClientcertCiphersAlias;
    }

    public void setXForwardedClientcertCiphersAlias(String xForwardedClientcertCiphersAlias) {
        this.xForwardedClientcertCiphersAlias = xForwardedClientcertCiphersAlias;
    }

    public ListenerInsertHeaders withXForwardedClientcertEndEnable(Boolean xForwardedClientcertEndEnable) {
        this.xForwardedClientcertEndEnable = xForwardedClientcertEndEnable;
        return this;
    }

    /**
     * **参数解释**：是否通过X-Forwarded-Clientcert-end 头字段获取客户端证书的结束日期。  **约束限制**：仅HTTPS、TERMINATED_HTTPS、QUIC协议的监听器支持该字段。  **取值范围**：true、false  **默认取值**：false
     * @return xForwardedClientcertEndEnable
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-Clientcert-end-enable")
    public Boolean getXForwardedClientcertEndEnable() {
        return xForwardedClientcertEndEnable;
    }

    public void setXForwardedClientcertEndEnable(Boolean xForwardedClientcertEndEnable) {
        this.xForwardedClientcertEndEnable = xForwardedClientcertEndEnable;
    }

    public ListenerInsertHeaders withXForwardedClientcertEndAlias(String xForwardedClientcertEndAlias) {
        this.xForwardedClientcertEndAlias = xForwardedClientcertEndAlias;
        return this;
    }

    /**
     * **参数解释**：自定义X-Forwarded-Clientcert-end头字段名称。  **约束限制**：只有当X-Forwarded-Clientcert-end-enable 的值为 true 时，此值才会生效。仅HTTPS、TERMINATED_HTTPS、QUIC、TLS协议的监听器支持该字段  **取值范围**：1~40 个字符。支持字母 a~z、短划线（-）、下划线（_）和数字。  **默认取值**：无
     * @return xForwardedClientcertEndAlias
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-Clientcert-end-alias")
    public String getXForwardedClientcertEndAlias() {
        return xForwardedClientcertEndAlias;
    }

    public void setXForwardedClientcertEndAlias(String xForwardedClientcertEndAlias) {
        this.xForwardedClientcertEndAlias = xForwardedClientcertEndAlias;
    }

    public ListenerInsertHeaders withXForwardedTlsAlpnProtocolEnable(Boolean xForwardedTlsAlpnProtocolEnable) {
        this.xForwardedTlsAlpnProtocolEnable = xForwardedTlsAlpnProtocolEnable;
        return this;
    }

    /**
     * **参数解释**：是否通过X-Forwarded-Tls-Alpn-Protocol 头字段获取客户端和服务器之间ALPN（Application-Layer Protocol Negotiation）协商的应用层协议。  **约束限制**：仅HTTPS、TERMINATED_HTTPS、QUIC协议的监听器支持该字段。  **取值范围**：true、false  **默认取值**：false
     * @return xForwardedTlsAlpnProtocolEnable
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-Tls-Alpn-Protocol-enable")
    public Boolean getXForwardedTlsAlpnProtocolEnable() {
        return xForwardedTlsAlpnProtocolEnable;
    }

    public void setXForwardedTlsAlpnProtocolEnable(Boolean xForwardedTlsAlpnProtocolEnable) {
        this.xForwardedTlsAlpnProtocolEnable = xForwardedTlsAlpnProtocolEnable;
    }

    public ListenerInsertHeaders withXForwardedTlsAlpnProtocolAlias(String xForwardedTlsAlpnProtocolAlias) {
        this.xForwardedTlsAlpnProtocolAlias = xForwardedTlsAlpnProtocolAlias;
        return this;
    }

    /**
     * **参数解释**：自定义X-Forwarded-Tls-Alpn-Protocol头字段名称。  **约束限制**：只有当X-Forwarded-Tls-Alpn-Protocol-enable 的值为 true 时，此值才会生效。仅HTTPS、TERMINATED_HTTPS、QUIC协议的监听器支持该字段  **取值范围**：1~40 个字符。支持字母 a~z、短划线（-）、下划线（_）和数字。  **默认取值**：无
     * @return xForwardedTlsAlpnProtocolAlias
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-Tls-Alpn-Protocol-alias")
    public String getXForwardedTlsAlpnProtocolAlias() {
        return xForwardedTlsAlpnProtocolAlias;
    }

    public void setXForwardedTlsAlpnProtocolAlias(String xForwardedTlsAlpnProtocolAlias) {
        this.xForwardedTlsAlpnProtocolAlias = xForwardedTlsAlpnProtocolAlias;
    }

    public ListenerInsertHeaders withXForwardedTlsSniEnable(Boolean xForwardedTlsSniEnable) {
        this.xForwardedTlsSniEnable = xForwardedTlsSniEnable;
        return this;
    }

    /**
     * **参数解释**：是否通过X-Forwarded-Tls-Sni 头字段获取客户端访问的sni证书的域名。  **约束限制**：仅HTTPS、TERMINATED_HTTPS、QUIC协议的监听器支持该字段。  **取值范围**：true、false  **默认取值**：false
     * @return xForwardedTlsSniEnable
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-Tls-Sni-enable")
    public Boolean getXForwardedTlsSniEnable() {
        return xForwardedTlsSniEnable;
    }

    public void setXForwardedTlsSniEnable(Boolean xForwardedTlsSniEnable) {
        this.xForwardedTlsSniEnable = xForwardedTlsSniEnable;
    }

    public ListenerInsertHeaders withXForwardedTlsSniAlias(String xForwardedTlsSniAlias) {
        this.xForwardedTlsSniAlias = xForwardedTlsSniAlias;
        return this;
    }

    /**
     * **参数解释**：自定义X-Forwarded-Tls-Sni头字段名称。  **约束限制**：只有当X-Forwarded-Tls-Sni-enable 的值为 true 时，此值才会生效。仅HTTPS、TERMINATED_HTTPS、QUIC协议的监听器支持该字段  **取值范围**：1~40 个字符。支持字母 a~z、短划线（-）、下划线（_）和数字。  **默认取值**：无
     * @return xForwardedTlsSniAlias
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-Tls-Sni-alias")
    public String getXForwardedTlsSniAlias() {
        return xForwardedTlsSniAlias;
    }

    public void setXForwardedTlsSniAlias(String xForwardedTlsSniAlias) {
        this.xForwardedTlsSniAlias = xForwardedTlsSniAlias;
    }

    public ListenerInsertHeaders withXForwardedTlsJa3Enable(Boolean xForwardedTlsJa3Enable) {
        this.xForwardedTlsJa3Enable = xForwardedTlsJa3Enable;
        return this;
    }

    /**
     * **参数解释**：是否通过X-Forwarded-Tls-Ja3头字段获取访问负载均衡实例客户端的ja3指纹。  **约束限制**：仅HTTPS、TERMINATED_HTTPS、QUIC协议的监听器支持该字段。  **取值范围**：true、false  **默认取值**：false
     * @return xForwardedTlsJa3Enable
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-Tls-Ja3-enable")
    public Boolean getXForwardedTlsJa3Enable() {
        return xForwardedTlsJa3Enable;
    }

    public void setXForwardedTlsJa3Enable(Boolean xForwardedTlsJa3Enable) {
        this.xForwardedTlsJa3Enable = xForwardedTlsJa3Enable;
    }

    public ListenerInsertHeaders withXForwardedTlsJa3Alias(String xForwardedTlsJa3Alias) {
        this.xForwardedTlsJa3Alias = xForwardedTlsJa3Alias;
        return this;
    }

    /**
     * **参数解释**：自定义X-Forwarded-Tls-Ja3头字段名称。  **约束限制**：只有当X-Forwarded-Tls-Ja3-enable 的值为 true 时，此值才会生效。仅HTTPS、TERMINATED_HTTPS、QUIC协议的监听器支持该字段  **取值范围**：1~40 个字符。支持字母 a~z、短划线（-）、下划线（_）和数字。  **默认取值**：无
     * @return xForwardedTlsJa3Alias
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-Tls-Ja3-alias")
    public String getXForwardedTlsJa3Alias() {
        return xForwardedTlsJa3Alias;
    }

    public void setXForwardedTlsJa3Alias(String xForwardedTlsJa3Alias) {
        this.xForwardedTlsJa3Alias = xForwardedTlsJa3Alias;
    }

    public ListenerInsertHeaders withXForwardedTlsJa4Enable(Boolean xForwardedTlsJa4Enable) {
        this.xForwardedTlsJa4Enable = xForwardedTlsJa4Enable;
        return this;
    }

    /**
     * **参数解释**：是否通过X-Forwarded-Tls-Ja4头字段获取访问负载均衡实例客户端的ja4指纹。  **约束限制**：仅HTTPS、TERMINATED_HTTPS、QUIC协议的监听器支持该字段。  **取值范围**：true、false  **默认取值**：false
     * @return xForwardedTlsJa4Enable
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-Tls-Ja4-enable")
    public Boolean getXForwardedTlsJa4Enable() {
        return xForwardedTlsJa4Enable;
    }

    public void setXForwardedTlsJa4Enable(Boolean xForwardedTlsJa4Enable) {
        this.xForwardedTlsJa4Enable = xForwardedTlsJa4Enable;
    }

    public ListenerInsertHeaders withXForwardedTlsJa4Alias(String xForwardedTlsJa4Alias) {
        this.xForwardedTlsJa4Alias = xForwardedTlsJa4Alias;
        return this;
    }

    /**
     * **参数解释**：自定义X-Forwarded-Tls-Ja4头字段名称。  **约束限制**：只有当X-Forwarded-Tls-Ja4-enable 的值为 true 时，此值才会生效。仅HTTPS、TERMINATED_HTTPS、QUIC协议的监听器支持该字段  **取值范围**：1~40 个字符。支持字母 a~z、短划线（-）、下划线（_）和数字。  **默认取值**：无
     * @return xForwardedTlsJa4Alias
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Forwarded-Tls-Ja4-alias")
    public String getXForwardedTlsJa4Alias() {
        return xForwardedTlsJa4Alias;
    }

    public void setXForwardedTlsJa4Alias(String xForwardedTlsJa4Alias) {
        this.xForwardedTlsJa4Alias = xForwardedTlsJa4Alias;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListenerInsertHeaders that = (ListenerInsertHeaders) obj;
        return Objects.equals(this.xForwardedELBIP, that.xForwardedELBIP)
            && Objects.equals(this.xForwardedPort, that.xForwardedPort)
            && Objects.equals(this.xForwardedForPort, that.xForwardedForPort)
            && Objects.equals(this.xForwardedHost, that.xForwardedHost)
            && Objects.equals(this.xForwardedProto, that.xForwardedProto) && Objects.equals(this.xRealIP, that.xRealIP)
            && Objects.equals(this.xForwardedELBID, that.xForwardedELBID)
            && Objects.equals(this.xForwardedTLSCertificateID, that.xForwardedTLSCertificateID)
            && Objects.equals(this.xForwardedTLSProtocol, that.xForwardedTLSProtocol)
            && Objects.equals(this.xForwardedTLSCipher, that.xForwardedTLSCipher)
            && Objects.equals(this.xForwardedTLSProtocolAlias, that.xForwardedTLSProtocolAlias)
            && Objects.equals(this.xForwardedTLSCipherAlias, that.xForwardedTLSCipherAlias)
            && Objects.equals(this.xForwardedForProcessingMode, that.xForwardedForProcessingMode)
            && Objects.equals(this.xForwardedClientcertSubjectdnEnable, that.xForwardedClientcertSubjectdnEnable)
            && Objects.equals(this.xForwardedClientcertSubjectdnAlias, that.xForwardedClientcertSubjectdnAlias)
            && Objects.equals(this.xForwardedClientcertIssuerdnEnable, that.xForwardedClientcertIssuerdnEnable)
            && Objects.equals(this.xForwardedClientcertIssuerdnAlias, that.xForwardedClientcertIssuerdnAlias)
            && Objects.equals(this.xForwardedClientcertFingerprintEnable, that.xForwardedClientcertFingerprintEnable)
            && Objects.equals(this.xForwardedClientcertFingerprintAlias, that.xForwardedClientcertFingerprintAlias)
            && Objects.equals(this.xForwardedClientcertClientverifyEnable, that.xForwardedClientcertClientverifyEnable)
            && Objects.equals(this.xForwardedClientcertClientverifyAlias, that.xForwardedClientcertClientverifyAlias)
            && Objects.equals(this.xForwardedClientcertSerialnumberEnable, that.xForwardedClientcertSerialnumberEnable)
            && Objects.equals(this.xForwardedClientcertSerialnumberAlias, that.xForwardedClientcertSerialnumberAlias)
            && Objects.equals(this.xForwardedClientcertEnable, that.xForwardedClientcertEnable)
            && Objects.equals(this.xForwardedClientcertAlias, that.xForwardedClientcertAlias)
            && Objects.equals(this.xForwardedClientcertCiphersEnable, that.xForwardedClientcertCiphersEnable)
            && Objects.equals(this.xForwardedClientcertCiphersAlias, that.xForwardedClientcertCiphersAlias)
            && Objects.equals(this.xForwardedClientcertEndEnable, that.xForwardedClientcertEndEnable)
            && Objects.equals(this.xForwardedClientcertEndAlias, that.xForwardedClientcertEndAlias)
            && Objects.equals(this.xForwardedTlsAlpnProtocolEnable, that.xForwardedTlsAlpnProtocolEnable)
            && Objects.equals(this.xForwardedTlsAlpnProtocolAlias, that.xForwardedTlsAlpnProtocolAlias)
            && Objects.equals(this.xForwardedTlsSniEnable, that.xForwardedTlsSniEnable)
            && Objects.equals(this.xForwardedTlsSniAlias, that.xForwardedTlsSniAlias)
            && Objects.equals(this.xForwardedTlsJa3Enable, that.xForwardedTlsJa3Enable)
            && Objects.equals(this.xForwardedTlsJa3Alias, that.xForwardedTlsJa3Alias)
            && Objects.equals(this.xForwardedTlsJa4Enable, that.xForwardedTlsJa4Enable)
            && Objects.equals(this.xForwardedTlsJa4Alias, that.xForwardedTlsJa4Alias);
    }

    @Override
    public int hashCode() {
        return Objects.hash(xForwardedELBIP,
            xForwardedPort,
            xForwardedForPort,
            xForwardedHost,
            xForwardedProto,
            xRealIP,
            xForwardedELBID,
            xForwardedTLSCertificateID,
            xForwardedTLSProtocol,
            xForwardedTLSCipher,
            xForwardedTLSProtocolAlias,
            xForwardedTLSCipherAlias,
            xForwardedForProcessingMode,
            xForwardedClientcertSubjectdnEnable,
            xForwardedClientcertSubjectdnAlias,
            xForwardedClientcertIssuerdnEnable,
            xForwardedClientcertIssuerdnAlias,
            xForwardedClientcertFingerprintEnable,
            xForwardedClientcertFingerprintAlias,
            xForwardedClientcertClientverifyEnable,
            xForwardedClientcertClientverifyAlias,
            xForwardedClientcertSerialnumberEnable,
            xForwardedClientcertSerialnumberAlias,
            xForwardedClientcertEnable,
            xForwardedClientcertAlias,
            xForwardedClientcertCiphersEnable,
            xForwardedClientcertCiphersAlias,
            xForwardedClientcertEndEnable,
            xForwardedClientcertEndAlias,
            xForwardedTlsAlpnProtocolEnable,
            xForwardedTlsAlpnProtocolAlias,
            xForwardedTlsSniEnable,
            xForwardedTlsSniAlias,
            xForwardedTlsJa3Enable,
            xForwardedTlsJa3Alias,
            xForwardedTlsJa4Enable,
            xForwardedTlsJa4Alias);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListenerInsertHeaders {\n");
        sb.append("    xForwardedELBIP: ").append(toIndentedString(xForwardedELBIP)).append("\n");
        sb.append("    xForwardedPort: ").append(toIndentedString(xForwardedPort)).append("\n");
        sb.append("    xForwardedForPort: ").append(toIndentedString(xForwardedForPort)).append("\n");
        sb.append("    xForwardedHost: ").append(toIndentedString(xForwardedHost)).append("\n");
        sb.append("    xForwardedProto: ").append(toIndentedString(xForwardedProto)).append("\n");
        sb.append("    xRealIP: ").append(toIndentedString(xRealIP)).append("\n");
        sb.append("    xForwardedELBID: ").append(toIndentedString(xForwardedELBID)).append("\n");
        sb.append("    xForwardedTLSCertificateID: ").append(toIndentedString(xForwardedTLSCertificateID)).append("\n");
        sb.append("    xForwardedTLSProtocol: ").append(toIndentedString(xForwardedTLSProtocol)).append("\n");
        sb.append("    xForwardedTLSCipher: ").append(toIndentedString(xForwardedTLSCipher)).append("\n");
        sb.append("    xForwardedTLSProtocolAlias: ").append(toIndentedString(xForwardedTLSProtocolAlias)).append("\n");
        sb.append("    xForwardedTLSCipherAlias: ").append(toIndentedString(xForwardedTLSCipherAlias)).append("\n");
        sb.append("    xForwardedForProcessingMode: ")
            .append(toIndentedString(xForwardedForProcessingMode))
            .append("\n");
        sb.append("    xForwardedClientcertSubjectdnEnable: ")
            .append(toIndentedString(xForwardedClientcertSubjectdnEnable))
            .append("\n");
        sb.append("    xForwardedClientcertSubjectdnAlias: ")
            .append(toIndentedString(xForwardedClientcertSubjectdnAlias))
            .append("\n");
        sb.append("    xForwardedClientcertIssuerdnEnable: ")
            .append(toIndentedString(xForwardedClientcertIssuerdnEnable))
            .append("\n");
        sb.append("    xForwardedClientcertIssuerdnAlias: ")
            .append(toIndentedString(xForwardedClientcertIssuerdnAlias))
            .append("\n");
        sb.append("    xForwardedClientcertFingerprintEnable: ")
            .append(toIndentedString(xForwardedClientcertFingerprintEnable))
            .append("\n");
        sb.append("    xForwardedClientcertFingerprintAlias: ")
            .append(toIndentedString(xForwardedClientcertFingerprintAlias))
            .append("\n");
        sb.append("    xForwardedClientcertClientverifyEnable: ")
            .append(toIndentedString(xForwardedClientcertClientverifyEnable))
            .append("\n");
        sb.append("    xForwardedClientcertClientverifyAlias: ")
            .append(toIndentedString(xForwardedClientcertClientverifyAlias))
            .append("\n");
        sb.append("    xForwardedClientcertSerialnumberEnable: ")
            .append(toIndentedString(xForwardedClientcertSerialnumberEnable))
            .append("\n");
        sb.append("    xForwardedClientcertSerialnumberAlias: ")
            .append(toIndentedString(xForwardedClientcertSerialnumberAlias))
            .append("\n");
        sb.append("    xForwardedClientcertEnable: ").append(toIndentedString(xForwardedClientcertEnable)).append("\n");
        sb.append("    xForwardedClientcertAlias: ").append(toIndentedString(xForwardedClientcertAlias)).append("\n");
        sb.append("    xForwardedClientcertCiphersEnable: ")
            .append(toIndentedString(xForwardedClientcertCiphersEnable))
            .append("\n");
        sb.append("    xForwardedClientcertCiphersAlias: ")
            .append(toIndentedString(xForwardedClientcertCiphersAlias))
            .append("\n");
        sb.append("    xForwardedClientcertEndEnable: ")
            .append(toIndentedString(xForwardedClientcertEndEnable))
            .append("\n");
        sb.append("    xForwardedClientcertEndAlias: ")
            .append(toIndentedString(xForwardedClientcertEndAlias))
            .append("\n");
        sb.append("    xForwardedTlsAlpnProtocolEnable: ")
            .append(toIndentedString(xForwardedTlsAlpnProtocolEnable))
            .append("\n");
        sb.append("    xForwardedTlsAlpnProtocolAlias: ")
            .append(toIndentedString(xForwardedTlsAlpnProtocolAlias))
            .append("\n");
        sb.append("    xForwardedTlsSniEnable: ").append(toIndentedString(xForwardedTlsSniEnable)).append("\n");
        sb.append("    xForwardedTlsSniAlias: ").append(toIndentedString(xForwardedTlsSniAlias)).append("\n");
        sb.append("    xForwardedTlsJa3Enable: ").append(toIndentedString(xForwardedTlsJa3Enable)).append("\n");
        sb.append("    xForwardedTlsJa3Alias: ").append(toIndentedString(xForwardedTlsJa3Alias)).append("\n");
        sb.append("    xForwardedTlsJa4Enable: ").append(toIndentedString(xForwardedTlsJa4Enable)).append("\n");
        sb.append("    xForwardedTlsJa4Alias: ").append(toIndentedString(xForwardedTlsJa4Alias)).append("\n");
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
