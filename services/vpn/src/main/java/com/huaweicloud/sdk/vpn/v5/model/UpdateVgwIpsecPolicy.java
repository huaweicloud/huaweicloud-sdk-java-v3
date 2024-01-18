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
 * UpdateVgwIpsecPolicy
 */
public class UpdateVgwIpsecPolicy {

    /**
     * 加密算法
     */
    public static final class AuthenticationAlgorithmEnum {

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
     * 加密算法
     */
    public static final class EncryptionAlgorithmEnum {

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

        private static final Map<String, EncryptionAlgorithmEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EncryptionAlgorithmEnum> createStaticFields() {
            Map<String, EncryptionAlgorithmEnum> map = new HashMap<>();
            map.put("aes-128", AES_128);
            map.put("aes-192", AES_192);
            map.put("aes-256", AES_256);
            map.put("aes-128-gcm-16", AES_128_GCM_16);
            map.put("aes-256-gcm-16", AES_256_GCM_16);
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

    /**
     * PFS使用的DH密钥组
     */
    public static final class PfsEnum {

        /**
         * Enum GROUP14 for value: "group14"
         */
        public static final PfsEnum GROUP14 = new PfsEnum("group14");

        /**
         * Enum GROUP15 for value: "group15"
         */
        public static final PfsEnum GROUP15 = new PfsEnum("group15");

        /**
         * Enum GROUP16 for value: "group16"
         */
        public static final PfsEnum GROUP16 = new PfsEnum("group16");

        /**
         * Enum GROUP19 for value: "group19"
         */
        public static final PfsEnum GROUP19 = new PfsEnum("group19");

        /**
         * Enum GROUP20 for value: "group20"
         */
        public static final PfsEnum GROUP20 = new PfsEnum("group20");

        /**
         * Enum GROUP21 for value: "group21"
         */
        public static final PfsEnum GROUP21 = new PfsEnum("group21");

        /**
         * Enum DISABLE for value: "disable"
         */
        public static final PfsEnum DISABLE = new PfsEnum("disable");

        private static final Map<String, PfsEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PfsEnum> createStaticFields() {
            Map<String, PfsEnum> map = new HashMap<>();
            map.put("group14", GROUP14);
            map.put("group15", GROUP15);
            map.put("group16", GROUP16);
            map.put("group19", GROUP19);
            map.put("group20", GROUP20);
            map.put("group21", GROUP21);
            map.put("disable", DISABLE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PfsEnum(String value) {
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
        public static PfsEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PfsEnum(value));
        }

        public static PfsEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PfsEnum) {
                return this.value.equals(((PfsEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pfs")

    private PfsEnum pfs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lifetime_seconds")

    private Integer lifetimeSeconds;

    public UpdateVgwIpsecPolicy withAuthenticationAlgorithm(AuthenticationAlgorithmEnum authenticationAlgorithm) {
        this.authenticationAlgorithm = authenticationAlgorithm;
        return this;
    }

    /**
     * 加密算法
     * @return authenticationAlgorithm
     */
    public AuthenticationAlgorithmEnum getAuthenticationAlgorithm() {
        return authenticationAlgorithm;
    }

    public void setAuthenticationAlgorithm(AuthenticationAlgorithmEnum authenticationAlgorithm) {
        this.authenticationAlgorithm = authenticationAlgorithm;
    }

    public UpdateVgwIpsecPolicy withEncryptionAlgorithm(EncryptionAlgorithmEnum encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
        return this;
    }

    /**
     * 加密算法
     * @return encryptionAlgorithm
     */
    public EncryptionAlgorithmEnum getEncryptionAlgorithm() {
        return encryptionAlgorithm;
    }

    public void setEncryptionAlgorithm(EncryptionAlgorithmEnum encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
    }

    public UpdateVgwIpsecPolicy withPfs(PfsEnum pfs) {
        this.pfs = pfs;
        return this;
    }

    /**
     * PFS使用的DH密钥组
     * @return pfs
     */
    public PfsEnum getPfs() {
        return pfs;
    }

    public void setPfs(PfsEnum pfs) {
        this.pfs = pfs;
    }

    public UpdateVgwIpsecPolicy withLifetimeSeconds(Integer lifetimeSeconds) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateVgwIpsecPolicy that = (UpdateVgwIpsecPolicy) obj;
        return Objects.equals(this.authenticationAlgorithm, that.authenticationAlgorithm)
            && Objects.equals(this.encryptionAlgorithm, that.encryptionAlgorithm) && Objects.equals(this.pfs, that.pfs)
            && Objects.equals(this.lifetimeSeconds, that.lifetimeSeconds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authenticationAlgorithm, encryptionAlgorithm, pfs, lifetimeSeconds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateVgwIpsecPolicy {\n");
        sb.append("    authenticationAlgorithm: ").append(toIndentedString(authenticationAlgorithm)).append("\n");
        sb.append("    encryptionAlgorithm: ").append(toIndentedString(encryptionAlgorithm)).append("\n");
        sb.append("    pfs: ").append(toIndentedString(pfs)).append("\n");
        sb.append("    lifetimeSeconds: ").append(toIndentedString(lifetimeSeconds)).append("\n");
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
