package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * UpdateIpsecPolicy
 */
public class UpdateIpsecPolicy {

    /**
     * 认证算法，SHA1和MD5安全性较低，请慎用
     */
    public static final class AuthenticationAlgorithmEnum {

        /**
         * Enum SHA1 for value: "sha1"
         */
        public static final AuthenticationAlgorithmEnum SHA1 = new AuthenticationAlgorithmEnum("sha1");

        /**
         * Enum MD5 for value: "md5"
         */
        public static final AuthenticationAlgorithmEnum MD5 = new AuthenticationAlgorithmEnum("md5");

        /**
         * Enum SHA2_256 for value: "sha2-256"
         */
        public static final AuthenticationAlgorithmEnum SHA2_256 = new AuthenticationAlgorithmEnum("sha2-256");

        /**
         * Enum SHA2_384 for value: "sha2-384"
         */
        public static final AuthenticationAlgorithmEnum SHA2_384 = new AuthenticationAlgorithmEnum("sha2-384");

        /**
         * Enum SHA2_512 for value: "sha2-512"
         */
        public static final AuthenticationAlgorithmEnum SHA2_512 = new AuthenticationAlgorithmEnum("sha2-512");

        private static final Map<String, AuthenticationAlgorithmEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AuthenticationAlgorithmEnum> createStaticFields() {
            Map<String, AuthenticationAlgorithmEnum> map = new HashMap<>();
            map.put("sha1", SHA1);
            map.put("md5", MD5);
            map.put("sha2-256", SHA2_256);
            map.put("sha2-384", SHA2_384);
            map.put("sha2-512", SHA2_512);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AuthenticationAlgorithmEnum(String value) {
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
        public static AuthenticationAlgorithmEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElse(new AuthenticationAlgorithmEnum(value));
        }

        public static AuthenticationAlgorithmEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AuthenticationAlgorithmEnum) {
                return this.value.equals(((AuthenticationAlgorithmEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authentication_algorithm")

    private AuthenticationAlgorithmEnum authenticationAlgorithm;

    /**
     * 加密算法，3DES安全性较低，请慎用
     */
    public static final class EncryptionAlgorithmEnum {

        /**
         * Enum _3DES for value: "3des"
         */
        public static final EncryptionAlgorithmEnum _3DES = new EncryptionAlgorithmEnum("3des");

        /**
         * Enum AES_128 for value: "aes-128"
         */
        public static final EncryptionAlgorithmEnum AES_128 = new EncryptionAlgorithmEnum("aes-128");

        /**
         * Enum AES_192 for value: "aes-192"
         */
        public static final EncryptionAlgorithmEnum AES_192 = new EncryptionAlgorithmEnum("aes-192");

        /**
         * Enum AES_256 for value: "aes-256"
         */
        public static final EncryptionAlgorithmEnum AES_256 = new EncryptionAlgorithmEnum("aes-256");

        /**
         * Enum AES_128_GCM_16 for value: "aes-128-gcm-16"
         */
        public static final EncryptionAlgorithmEnum AES_128_GCM_16 = new EncryptionAlgorithmEnum("aes-128-gcm-16");

        /**
         * Enum AES_256_GCM_16 for value: "aes-256-gcm-16"
         */
        public static final EncryptionAlgorithmEnum AES_256_GCM_16 = new EncryptionAlgorithmEnum("aes-256-gcm-16");

        /**
         * Enum AES_128_GCM_128 for value: "aes-128-gcm-128"
         */
        public static final EncryptionAlgorithmEnum AES_128_GCM_128 = new EncryptionAlgorithmEnum("aes-128-gcm-128");

        /**
         * Enum AES_256_GCM_128 for value: "aes-256-gcm-128"
         */
        public static final EncryptionAlgorithmEnum AES_256_GCM_128 = new EncryptionAlgorithmEnum("aes-256-gcm-128");

        private static final Map<String, EncryptionAlgorithmEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EncryptionAlgorithmEnum> createStaticFields() {
            Map<String, EncryptionAlgorithmEnum> map = new HashMap<>();
            map.put("3des", _3DES);
            map.put("aes-128", AES_128);
            map.put("aes-192", AES_192);
            map.put("aes-256", AES_256);
            map.put("aes-128-gcm-16", AES_128_GCM_16);
            map.put("aes-256-gcm-16", AES_256_GCM_16);
            map.put("aes-128-gcm-128", AES_128_GCM_128);
            map.put("aes-256-gcm-128", AES_256_GCM_128);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EncryptionAlgorithmEnum(String value) {
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
        public static EncryptionAlgorithmEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EncryptionAlgorithmEnum(value));
        }

        public static EncryptionAlgorithmEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EncryptionAlgorithmEnum) {
                return this.value.equals(((EncryptionAlgorithmEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encryption_algorithm")

    private EncryptionAlgorithmEnum encryptionAlgorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pfs")

    private String pfs;

    /**
     * 传输模式
     */
    public static final class TransformProtocolEnum {

        /**
         * Enum ESP for value: "esp"
         */
        public static final TransformProtocolEnum ESP = new TransformProtocolEnum("esp");

        private static final Map<String, TransformProtocolEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TransformProtocolEnum> createStaticFields() {
            Map<String, TransformProtocolEnum> map = new HashMap<>();
            map.put("esp", ESP);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TransformProtocolEnum(String value) {
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
        public static TransformProtocolEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TransformProtocolEnum(value));
        }

        public static TransformProtocolEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TransformProtocolEnum) {
                return this.value.equals(((TransformProtocolEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "transform_protocol")

    private TransformProtocolEnum transformProtocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lifetime_seconds")

    private Integer lifetimeSeconds;

    /**
     * 封装模式，当前只有tunnel模式
     */
    public static final class EncapsulationModeEnum {

        /**
         * Enum TUNNEL for value: "tunnel"
         */
        public static final EncapsulationModeEnum TUNNEL = new EncapsulationModeEnum("tunnel");

        private static final Map<String, EncapsulationModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EncapsulationModeEnum> createStaticFields() {
            Map<String, EncapsulationModeEnum> map = new HashMap<>();
            map.put("tunnel", TUNNEL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EncapsulationModeEnum(String value) {
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
        public static EncapsulationModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EncapsulationModeEnum(value));
        }

        public static EncapsulationModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EncapsulationModeEnum) {
                return this.value.equals(((EncapsulationModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "encapsulation_mode")

    private EncapsulationModeEnum encapsulationMode;

    public UpdateIpsecPolicy withAuthenticationAlgorithm(AuthenticationAlgorithmEnum authenticationAlgorithm) {
        this.authenticationAlgorithm = authenticationAlgorithm;
        return this;
    }

    /**
     * 认证算法，SHA1和MD5安全性较低，请慎用
     * @return authenticationAlgorithm
     */
    public AuthenticationAlgorithmEnum getAuthenticationAlgorithm() {
        return authenticationAlgorithm;
    }

    public void setAuthenticationAlgorithm(AuthenticationAlgorithmEnum authenticationAlgorithm) {
        this.authenticationAlgorithm = authenticationAlgorithm;
    }

    public UpdateIpsecPolicy withEncryptionAlgorithm(EncryptionAlgorithmEnum encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
        return this;
    }

    /**
     * 加密算法，3DES安全性较低，请慎用
     * @return encryptionAlgorithm
     */
    public EncryptionAlgorithmEnum getEncryptionAlgorithm() {
        return encryptionAlgorithm;
    }

    public void setEncryptionAlgorithm(EncryptionAlgorithmEnum encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
    }

    public UpdateIpsecPolicy withPfs(String pfs) {
        this.pfs = pfs;
        return this;
    }

    /**
     * PFS使用的DH密钥组
     * @return pfs
     */
    public String getPfs() {
        return pfs;
    }

    public void setPfs(String pfs) {
        this.pfs = pfs;
    }

    public UpdateIpsecPolicy withTransformProtocol(TransformProtocolEnum transformProtocol) {
        this.transformProtocol = transformProtocol;
        return this;
    }

    /**
     * 传输模式
     * @return transformProtocol
     */
    public TransformProtocolEnum getTransformProtocol() {
        return transformProtocol;
    }

    public void setTransformProtocol(TransformProtocolEnum transformProtocol) {
        this.transformProtocol = transformProtocol;
    }

    public UpdateIpsecPolicy withLifetimeSeconds(Integer lifetimeSeconds) {
        this.lifetimeSeconds = lifetimeSeconds;
        return this;
    }

    /**
     * 表示配置IPSec连接建立的隧道以时间为基准的生存周期
     * minimum: 30
     * maximum: 604800
     * @return lifetimeSeconds
     */
    public Integer getLifetimeSeconds() {
        return lifetimeSeconds;
    }

    public void setLifetimeSeconds(Integer lifetimeSeconds) {
        this.lifetimeSeconds = lifetimeSeconds;
    }

    public UpdateIpsecPolicy withEncapsulationMode(EncapsulationModeEnum encapsulationMode) {
        this.encapsulationMode = encapsulationMode;
        return this;
    }

    /**
     * 封装模式，当前只有tunnel模式
     * @return encapsulationMode
     */
    public EncapsulationModeEnum getEncapsulationMode() {
        return encapsulationMode;
    }

    public void setEncapsulationMode(EncapsulationModeEnum encapsulationMode) {
        this.encapsulationMode = encapsulationMode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateIpsecPolicy that = (UpdateIpsecPolicy) obj;
        return Objects.equals(this.authenticationAlgorithm, that.authenticationAlgorithm)
            && Objects.equals(this.encryptionAlgorithm, that.encryptionAlgorithm) && Objects.equals(this.pfs, that.pfs)
            && Objects.equals(this.transformProtocol, that.transformProtocol)
            && Objects.equals(this.lifetimeSeconds, that.lifetimeSeconds)
            && Objects.equals(this.encapsulationMode, that.encapsulationMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authenticationAlgorithm,
            encryptionAlgorithm,
            pfs,
            transformProtocol,
            lifetimeSeconds,
            encapsulationMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateIpsecPolicy {\n");
        sb.append("    authenticationAlgorithm: ").append(toIndentedString(authenticationAlgorithm)).append("\n");
        sb.append("    encryptionAlgorithm: ").append(toIndentedString(encryptionAlgorithm)).append("\n");
        sb.append("    pfs: ").append(toIndentedString(pfs)).append("\n");
        sb.append("    transformProtocol: ").append(toIndentedString(transformProtocol)).append("\n");
        sb.append("    lifetimeSeconds: ").append(toIndentedString(lifetimeSeconds)).append("\n");
        sb.append("    encapsulationMode: ").append(toIndentedString(encapsulationMode)).append("\n");
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
