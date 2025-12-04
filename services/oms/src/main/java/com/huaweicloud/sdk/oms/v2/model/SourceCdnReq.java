package com.huaweicloud.sdk.oms.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 源端CDN配置。
 */
public class SourceCdnReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authentication_key")

    private String authenticationKey;

    /**
     * 鉴权类型: NONE：公开访问，无安全限制, QINIU_PRIVATE_AUTHENTICATION：七牛自定义URL签名, ALIYUN_OSS_A：阿里云  URL携带签名，简单通用, ALIYUN_OSS_B：阿里云  Header携带签名，用于API调用, ALIYUN_OSS_C：阿里云  STS临时安全令牌，最安全, KSYUN_PRIVATE_AUTHENTICATION：金山云  金山云自定义URL签名, AZURE_SAS_TOKEN：微软Azure  灵活安全的共享访问签名, TENCENT_COS_A:腾讯云  多次有效签名（不推荐）, TENCENT_COS_B:腾讯云  单次有效签名，安全性最高, TENCENT_COS_C:腾讯云  Header携带签名，用于API调用, TENCENT_COS_D:腾讯云  Header携带签名，用于API调用.
     */
    public static final class AuthenticationTypeEnum {

        /**
         * Enum NONE for value: "NONE"
         */
        public static final AuthenticationTypeEnum NONE = new AuthenticationTypeEnum("NONE");

        /**
         * Enum QINIU_PRIVATE_AUTHENTICATION for value: "QINIU_PRIVATE_AUTHENTICATION"
         */
        public static final AuthenticationTypeEnum QINIU_PRIVATE_AUTHENTICATION =
            new AuthenticationTypeEnum("QINIU_PRIVATE_AUTHENTICATION");

        /**
         * Enum ALIYUN_OSS_A for value: "ALIYUN_OSS_A"
         */
        public static final AuthenticationTypeEnum ALIYUN_OSS_A = new AuthenticationTypeEnum("ALIYUN_OSS_A");

        /**
         * Enum ALIYUN_OSS_B for value: "ALIYUN_OSS_B"
         */
        public static final AuthenticationTypeEnum ALIYUN_OSS_B = new AuthenticationTypeEnum("ALIYUN_OSS_B");

        /**
         * Enum ALIYUN_OSS_C for value: "ALIYUN_OSS_C"
         */
        public static final AuthenticationTypeEnum ALIYUN_OSS_C = new AuthenticationTypeEnum("ALIYUN_OSS_C");

        /**
         * Enum KSYUN_PRIVATE_AUTHENTICATION for value: "KSYUN_PRIVATE_AUTHENTICATION"
         */
        public static final AuthenticationTypeEnum KSYUN_PRIVATE_AUTHENTICATION =
            new AuthenticationTypeEnum("KSYUN_PRIVATE_AUTHENTICATION");

        /**
         * Enum AZURE_SAS_TOKEN for value: "AZURE_SAS_TOKEN"
         */
        public static final AuthenticationTypeEnum AZURE_SAS_TOKEN = new AuthenticationTypeEnum("AZURE_SAS_TOKEN");

        /**
         * Enum TENCENT_COS_A for value: "TENCENT_COS_A"
         */
        public static final AuthenticationTypeEnum TENCENT_COS_A = new AuthenticationTypeEnum("TENCENT_COS_A");

        /**
         * Enum TENCENT_COS_B for value: "TENCENT_COS_B"
         */
        public static final AuthenticationTypeEnum TENCENT_COS_B = new AuthenticationTypeEnum("TENCENT_COS_B");

        /**
         * Enum TENCENT_COS_C for value: "TENCENT_COS_C"
         */
        public static final AuthenticationTypeEnum TENCENT_COS_C = new AuthenticationTypeEnum("TENCENT_COS_C");

        /**
         * Enum TENCENT_COS_D for value: "TENCENT_COS_D"
         */
        public static final AuthenticationTypeEnum TENCENT_COS_D = new AuthenticationTypeEnum("TENCENT_COS_D");

        private static final Map<String, AuthenticationTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AuthenticationTypeEnum> createStaticFields() {
            Map<String, AuthenticationTypeEnum> map = new HashMap<>();
            map.put("NONE", NONE);
            map.put("QINIU_PRIVATE_AUTHENTICATION", QINIU_PRIVATE_AUTHENTICATION);
            map.put("ALIYUN_OSS_A", ALIYUN_OSS_A);
            map.put("ALIYUN_OSS_B", ALIYUN_OSS_B);
            map.put("ALIYUN_OSS_C", ALIYUN_OSS_C);
            map.put("KSYUN_PRIVATE_AUTHENTICATION", KSYUN_PRIVATE_AUTHENTICATION);
            map.put("AZURE_SAS_TOKEN", AZURE_SAS_TOKEN);
            map.put("TENCENT_COS_A", TENCENT_COS_A);
            map.put("TENCENT_COS_B", TENCENT_COS_B);
            map.put("TENCENT_COS_C", TENCENT_COS_C);
            map.put("TENCENT_COS_D", TENCENT_COS_D);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AuthenticationTypeEnum(String value) {
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
        public static AuthenticationTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AuthenticationTypeEnum(value));
        }

        public static AuthenticationTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AuthenticationTypeEnum) {
                return this.value.equals(((AuthenticationTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authentication_type")

    private AuthenticationTypeEnum authenticationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private String domain;

    /**
     * 协议类型，支持http和https协议。
     */
    public static final class ProtocolEnum {

        /**
         * Enum HTTP for value: "http"
         */
        public static final ProtocolEnum HTTP = new ProtocolEnum("http");

        /**
         * Enum HTTPS for value: "https"
         */
        public static final ProtocolEnum HTTPS = new ProtocolEnum("https");

        private static final Map<String, ProtocolEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProtocolEnum> createStaticFields() {
            Map<String, ProtocolEnum> map = new HashMap<>();
            map.put("http", HTTP);
            map.put("https", HTTPS);
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

    public SourceCdnReq withAuthenticationKey(String authenticationKey) {
        this.authenticationKey = authenticationKey;
        return this;
    }

    /**
     * CDN鉴权密钥，如果CDN需要进行鉴权，则此选项为必选。  无需授权：无需配置此项。 Qiniu：无需配置此项。 Aliyun：根据authentication_type指定的鉴权方式配置此项。 KingsoftCloud：无需配置此项。
     * @return authenticationKey
     */
    public String getAuthenticationKey() {
        return authenticationKey;
    }

    public void setAuthenticationKey(String authenticationKey) {
        this.authenticationKey = authenticationKey;
    }

    public SourceCdnReq withAuthenticationType(AuthenticationTypeEnum authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * 鉴权类型: NONE：公开访问，无安全限制, QINIU_PRIVATE_AUTHENTICATION：七牛自定义URL签名, ALIYUN_OSS_A：阿里云  URL携带签名，简单通用, ALIYUN_OSS_B：阿里云  Header携带签名，用于API调用, ALIYUN_OSS_C：阿里云  STS临时安全令牌，最安全, KSYUN_PRIVATE_AUTHENTICATION：金山云  金山云自定义URL签名, AZURE_SAS_TOKEN：微软Azure  灵活安全的共享访问签名, TENCENT_COS_A:腾讯云  多次有效签名（不推荐）, TENCENT_COS_B:腾讯云  单次有效签名，安全性最高, TENCENT_COS_C:腾讯云  Header携带签名，用于API调用, TENCENT_COS_D:腾讯云  Header携带签名，用于API调用.
     * @return authenticationType
     */
    public AuthenticationTypeEnum getAuthenticationType() {
        return authenticationType;
    }

    public void setAuthenticationType(AuthenticationTypeEnum authenticationType) {
        this.authenticationType = authenticationType;
    }

    public SourceCdnReq withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     *   从指定域名获取对象。
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public SourceCdnReq withProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 协议类型，支持http和https协议。
     * @return protocol
     */
    public ProtocolEnum getProtocol() {
        return protocol;
    }

    public void setProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SourceCdnReq that = (SourceCdnReq) obj;
        return Objects.equals(this.authenticationKey, that.authenticationKey)
            && Objects.equals(this.authenticationType, that.authenticationType)
            && Objects.equals(this.domain, that.domain) && Objects.equals(this.protocol, that.protocol);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authenticationKey, authenticationType, domain, protocol);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SourceCdnReq {\n");
        sb.append("    authenticationKey: ").append(toIndentedString(authenticationKey)).append("\n");
        sb.append("    authenticationType: ").append(toIndentedString(authenticationType)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
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
