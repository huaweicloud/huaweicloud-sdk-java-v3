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
 * 源端CDN配置返回值。
 */
public class SourceCdnResp {

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

    /**
     * 鉴权类型: NONE, QINIU_PRIVATE_AUTHENTICATION, ALIYUN_OSS_A, ALIYUN_OSS_B, ALIYUN_OSS_C, KSYUN_PRIVATE_AUTHENTICATION, AZURE_SAS_TOKEN
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

    public SourceCdnResp withDomain(String domain) {
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

    public SourceCdnResp withProtocol(ProtocolEnum protocol) {
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

    public SourceCdnResp withAuthenticationType(AuthenticationTypeEnum authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * 鉴权类型: NONE, QINIU_PRIVATE_AUTHENTICATION, ALIYUN_OSS_A, ALIYUN_OSS_B, ALIYUN_OSS_C, KSYUN_PRIVATE_AUTHENTICATION, AZURE_SAS_TOKEN
     * @return authenticationType
     */
    public AuthenticationTypeEnum getAuthenticationType() {
        return authenticationType;
    }

    public void setAuthenticationType(AuthenticationTypeEnum authenticationType) {
        this.authenticationType = authenticationType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SourceCdnResp that = (SourceCdnResp) obj;
        return Objects.equals(this.domain, that.domain) && Objects.equals(this.protocol, that.protocol)
            && Objects.equals(this.authenticationType, that.authenticationType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domain, protocol, authenticationType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SourceCdnResp {\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    authenticationType: ").append(toIndentedString(authenticationType)).append("\n");
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
