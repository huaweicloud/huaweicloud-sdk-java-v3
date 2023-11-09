package com.huaweicloud.sdk.vpn.v5.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * UpdateIkePolicy
 */
public class UpdateIkePolicy {

    /**
     * IKE协商版本
     */
    public static final class IkeVersionEnum {

        /**
         * Enum V1 for value: "v1"
         */
        public static final IkeVersionEnum V1 = new IkeVersionEnum("v1");

        /**
         * Enum V2 for value: "v2"
         */
        public static final IkeVersionEnum V2 = new IkeVersionEnum("v2");

        private static final Map<String, IkeVersionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, IkeVersionEnum> createStaticFields() {
            Map<String, IkeVersionEnum> map = new HashMap<>();
            map.put("v1", V1);
            map.put("v2", V2);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        IkeVersionEnum(String value) {
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
        public static IkeVersionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new IkeVersionEnum(value));
        }

        public static IkeVersionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof IkeVersionEnum) {
                return this.value.equals(((IkeVersionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ike_version")

    private IkeVersionEnum ikeVersion;

    /**
     * 协商模式，ike版本为v1时生效
     */
    public static final class Phase1NegotiationModeEnum {

        /**
         * Enum MAIN for value: "main"
         */
        public static final Phase1NegotiationModeEnum MAIN = new Phase1NegotiationModeEnum("main");

        /**
         * Enum AGGRESSIVE for value: "aggressive"
         */
        public static final Phase1NegotiationModeEnum AGGRESSIVE = new Phase1NegotiationModeEnum("aggressive");

        private static final Map<String, Phase1NegotiationModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, Phase1NegotiationModeEnum> createStaticFields() {
            Map<String, Phase1NegotiationModeEnum> map = new HashMap<>();
            map.put("main", MAIN);
            map.put("aggressive", AGGRESSIVE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        Phase1NegotiationModeEnum(String value) {
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
        public static Phase1NegotiationModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new Phase1NegotiationModeEnum(value));
        }

        public static Phase1NegotiationModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof Phase1NegotiationModeEnum) {
                return this.value.equals(((Phase1NegotiationModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phase1_negotiation_mode")

    private Phase1NegotiationModeEnum phase1NegotiationMode;

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
    @JsonProperty(value = "dh_group")

    private String dhGroup;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lifetime_seconds")

    private Integer lifetimeSeconds;

    /**
     * 本端ID类型
     */
    public static final class LocalIdTypeEnum {

        /**
         * Enum IP for value: "ip"
         */
        public static final LocalIdTypeEnum IP = new LocalIdTypeEnum("ip");

        /**
         * Enum FQDN for value: "fqdn"
         */
        public static final LocalIdTypeEnum FQDN = new LocalIdTypeEnum("fqdn");

        private static final Map<String, LocalIdTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, LocalIdTypeEnum> createStaticFields() {
            Map<String, LocalIdTypeEnum> map = new HashMap<>();
            map.put("ip", IP);
            map.put("fqdn", FQDN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        LocalIdTypeEnum(String value) {
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
        public static LocalIdTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new LocalIdTypeEnum(value));
        }

        public static LocalIdTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof LocalIdTypeEnum) {
                return this.value.equals(((LocalIdTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_id_type")

    private LocalIdTypeEnum localIdType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "local_id")

    private String localId;

    /**
     * 对端ID类型
     */
    public static final class PeerIdTypeEnum {

        /**
         * Enum IP for value: "ip"
         */
        public static final PeerIdTypeEnum IP = new PeerIdTypeEnum("ip");

        /**
         * Enum FQDN for value: "fqdn"
         */
        public static final PeerIdTypeEnum FQDN = new PeerIdTypeEnum("fqdn");

        private static final Map<String, PeerIdTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PeerIdTypeEnum> createStaticFields() {
            Map<String, PeerIdTypeEnum> map = new HashMap<>();
            map.put("ip", IP);
            map.put("fqdn", FQDN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PeerIdTypeEnum(String value) {
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
        public static PeerIdTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PeerIdTypeEnum(value));
        }

        public static PeerIdTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PeerIdTypeEnum) {
                return this.value.equals(((PeerIdTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peer_id_type")

    private PeerIdTypeEnum peerIdType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peer_id")

    private String peerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dpd")

    private UpdateDpd dpd;

    public UpdateIkePolicy withIkeVersion(IkeVersionEnum ikeVersion) {
        this.ikeVersion = ikeVersion;
        return this;
    }

    /**
     * IKE协商版本
     * @return ikeVersion
     */
    public IkeVersionEnum getIkeVersion() {
        return ikeVersion;
    }

    public void setIkeVersion(IkeVersionEnum ikeVersion) {
        this.ikeVersion = ikeVersion;
    }

    public UpdateIkePolicy withPhase1NegotiationMode(Phase1NegotiationModeEnum phase1NegotiationMode) {
        this.phase1NegotiationMode = phase1NegotiationMode;
        return this;
    }

    /**
     * 协商模式，ike版本为v1时生效
     * @return phase1NegotiationMode
     */
    public Phase1NegotiationModeEnum getPhase1NegotiationMode() {
        return phase1NegotiationMode;
    }

    public void setPhase1NegotiationMode(Phase1NegotiationModeEnum phase1NegotiationMode) {
        this.phase1NegotiationMode = phase1NegotiationMode;
    }

    public UpdateIkePolicy withAuthenticationAlgorithm(AuthenticationAlgorithmEnum authenticationAlgorithm) {
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

    public UpdateIkePolicy withEncryptionAlgorithm(EncryptionAlgorithmEnum encryptionAlgorithm) {
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

    public UpdateIkePolicy withDhGroup(String dhGroup) {
        this.dhGroup = dhGroup;
        return this;
    }

    /**
     * DH密钥组
     * @return dhGroup
     */
    public String getDhGroup() {
        return dhGroup;
    }

    public void setDhGroup(String dhGroup) {
        this.dhGroup = dhGroup;
    }

    public UpdateIkePolicy withLifetimeSeconds(Integer lifetimeSeconds) {
        this.lifetimeSeconds = lifetimeSeconds;
        return this;
    }

    /**
     * 表示SA的生存周期，当该生存周期超时后IKE SA将自动更新
     * minimum: 60
     * maximum: 604800
     * @return lifetimeSeconds
     */
    public Integer getLifetimeSeconds() {
        return lifetimeSeconds;
    }

    public void setLifetimeSeconds(Integer lifetimeSeconds) {
        this.lifetimeSeconds = lifetimeSeconds;
    }

    public UpdateIkePolicy withLocalIdType(LocalIdTypeEnum localIdType) {
        this.localIdType = localIdType;
        return this;
    }

    /**
     * 本端ID类型
     * @return localIdType
     */
    public LocalIdTypeEnum getLocalIdType() {
        return localIdType;
    }

    public void setLocalIdType(LocalIdTypeEnum localIdType) {
        this.localIdType = localIdType;
    }

    public UpdateIkePolicy withLocalId(String localId) {
        this.localId = localId;
        return this;
    }

    /**
     * 本端ID
     * @return localId
     */
    public String getLocalId() {
        return localId;
    }

    public void setLocalId(String localId) {
        this.localId = localId;
    }

    public UpdateIkePolicy withPeerIdType(PeerIdTypeEnum peerIdType) {
        this.peerIdType = peerIdType;
        return this;
    }

    /**
     * 对端ID类型
     * @return peerIdType
     */
    public PeerIdTypeEnum getPeerIdType() {
        return peerIdType;
    }

    public void setPeerIdType(PeerIdTypeEnum peerIdType) {
        this.peerIdType = peerIdType;
    }

    public UpdateIkePolicy withPeerId(String peerId) {
        this.peerId = peerId;
        return this;
    }

    /**
     * 对端ID
     * @return peerId
     */
    public String getPeerId() {
        return peerId;
    }

    public void setPeerId(String peerId) {
        this.peerId = peerId;
    }

    public UpdateIkePolicy withDpd(UpdateDpd dpd) {
        this.dpd = dpd;
        return this;
    }

    public UpdateIkePolicy withDpd(Consumer<UpdateDpd> dpdSetter) {
        if (this.dpd == null) {
            this.dpd = new UpdateDpd();
            dpdSetter.accept(this.dpd);
        }

        return this;
    }

    /**
     * Get dpd
     * @return dpd
     */
    public UpdateDpd getDpd() {
        return dpd;
    }

    public void setDpd(UpdateDpd dpd) {
        this.dpd = dpd;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateIkePolicy that = (UpdateIkePolicy) obj;
        return Objects.equals(this.ikeVersion, that.ikeVersion)
            && Objects.equals(this.phase1NegotiationMode, that.phase1NegotiationMode)
            && Objects.equals(this.authenticationAlgorithm, that.authenticationAlgorithm)
            && Objects.equals(this.encryptionAlgorithm, that.encryptionAlgorithm)
            && Objects.equals(this.dhGroup, that.dhGroup) && Objects.equals(this.lifetimeSeconds, that.lifetimeSeconds)
            && Objects.equals(this.localIdType, that.localIdType) && Objects.equals(this.localId, that.localId)
            && Objects.equals(this.peerIdType, that.peerIdType) && Objects.equals(this.peerId, that.peerId)
            && Objects.equals(this.dpd, that.dpd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ikeVersion,
            phase1NegotiationMode,
            authenticationAlgorithm,
            encryptionAlgorithm,
            dhGroup,
            lifetimeSeconds,
            localIdType,
            localId,
            peerIdType,
            peerId,
            dpd);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateIkePolicy {\n");
        sb.append("    ikeVersion: ").append(toIndentedString(ikeVersion)).append("\n");
        sb.append("    phase1NegotiationMode: ").append(toIndentedString(phase1NegotiationMode)).append("\n");
        sb.append("    authenticationAlgorithm: ").append(toIndentedString(authenticationAlgorithm)).append("\n");
        sb.append("    encryptionAlgorithm: ").append(toIndentedString(encryptionAlgorithm)).append("\n");
        sb.append("    dhGroup: ").append(toIndentedString(dhGroup)).append("\n");
        sb.append("    lifetimeSeconds: ").append(toIndentedString(lifetimeSeconds)).append("\n");
        sb.append("    localIdType: ").append(toIndentedString(localIdType)).append("\n");
        sb.append("    localId: ").append(toIndentedString(localId)).append("\n");
        sb.append("    peerIdType: ").append(toIndentedString(peerIdType)).append("\n");
        sb.append("    peerId: ").append(toIndentedString(peerId)).append("\n");
        sb.append("    dpd: ").append(toIndentedString(dpd)).append("\n");
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
