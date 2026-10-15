package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Kafka安全认证相关参数
 */
public class KafkaSecurity {

    /**
     * **参数解释**：  安全协议类型，安全认证时必填，对应Kafka字段：security.protocol。  **约束限制**：  - 安全认证时必填。  **取值范围**：  - PLAINTEXT：无安全认证方式，仅需输入IP和端口进行连接 - SASL_PLAINTEXT：使用SASL机制连接Kafka，需要设置SASL相关配置 - SSL：使用SSL加密方式连接Kafka，需要设置SSL相关配置 - SASL_SSL：使用SASL及SSL加密认证方式，需要设置SSL及SASL相关参数配置信息  **默认取值**：  不涉及
     */
    public static final class TypeEnum {

        /**
         * Enum PLAINTEXT for value: "PLAINTEXT"
         */
        public static final TypeEnum PLAINTEXT = new TypeEnum("PLAINTEXT");

        /**
         * Enum SASL_PLAINTEXT for value: "SASL_PLAINTEXT"
         */
        public static final TypeEnum SASL_PLAINTEXT = new TypeEnum("SASL_PLAINTEXT");

        /**
         * Enum SASL_SSL for value: "SASL_SSL"
         */
        public static final TypeEnum SASL_SSL = new TypeEnum("SASL_SSL");

        /**
         * Enum SSL for value: "SSL"
         */
        public static final TypeEnum SSL = new TypeEnum("SSL");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("PLAINTEXT", PLAINTEXT);
            map.put("SASL_PLAINTEXT", SASL_PLAINTEXT);
            map.put("SASL_SSL", SASL_SSL);
            map.put("SSL", SSL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trust_store_key_name")

    private String trustStoreKeyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trust_store_key")

    private String trustStoreKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trust_store_password")

    private String trustStorePassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_algorithm")

    private String endpointAlgorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sasl_mechanism")

    private String saslMechanism;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delegation_tokens")

    private Boolean delegationTokens;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_key_store")

    private Boolean enableKeyStore;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_store_key")

    private String keyStoreKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_store_key_name")

    private String keyStoreKeyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_store_password")

    private String keyStorePassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "set_private_key_password")

    private Boolean setPrivateKeyPassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key_password")

    private String keyPassword;

    public KafkaSecurity withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**：  安全协议类型，安全认证时必填，对应Kafka字段：security.protocol。  **约束限制**：  - 安全认证时必填。  **取值范围**：  - PLAINTEXT：无安全认证方式，仅需输入IP和端口进行连接 - SASL_PLAINTEXT：使用SASL机制连接Kafka，需要设置SASL相关配置 - SSL：使用SSL加密方式连接Kafka，需要设置SSL相关配置 - SASL_SSL：使用SASL及SSL加密认证方式，需要设置SSL及SASL相关参数配置信息  **默认取值**：  不涉及
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public KafkaSecurity withTrustStoreKeyName(String trustStoreKeyName) {
        this.trustStoreKeyName = trustStoreKeyName;
        return this;
    }

    /**
     * **参数解释**：  证书名称。  **约束限制**：  - 安全协议为SSL、SASL_SSL时必填。  **取值范围**：  不涉及。  **默认取值**：  不涉及
     * @return trustStoreKeyName
     */
    public String getTrustStoreKeyName() {
        return trustStoreKeyName;
    }

    public void setTrustStoreKeyName(String trustStoreKeyName) {
        this.trustStoreKeyName = trustStoreKeyName;
    }

    public KafkaSecurity withTrustStoreKey(String trustStoreKey) {
        this.trustStoreKey = trustStoreKey;
        return this;
    }

    /**
     * **参数解释**：  安全证书base64转码后的值。  **约束限制**：  - 安全协议为SSL、SASL_SSL时必填。  **取值范围**：  不涉及。  **默认取值**：  不涉及
     * @return trustStoreKey
     */
    public String getTrustStoreKey() {
        return trustStoreKey;
    }

    public void setTrustStoreKey(String trustStoreKey) {
        this.trustStoreKey = trustStoreKey;
    }

    public KafkaSecurity withTrustStorePassword(String trustStorePassword) {
        this.trustStorePassword = trustStorePassword;
        return this;
    }

    /**
     * **参数解释**：  证书密码。  **约束限制**：  - 证书设置了密码时必填。  **取值范围**：  不涉及。  **默认取值**：  不涉及
     * @return trustStorePassword
     */
    public String getTrustStorePassword() {
        return trustStorePassword;
    }

    public void setTrustStorePassword(String trustStorePassword) {
        this.trustStorePassword = trustStorePassword;
    }

    public KafkaSecurity withEndpointAlgorithm(String endpointAlgorithm) {
        this.endpointAlgorithm = endpointAlgorithm;
        return this;
    }

    /**
     * **参数解释**：  主机名端点识别算法，指定通过服务端证书验证服务端主机名的端点识别算法，对应Kafka字段：ssl.endpoint.identification.algorithm。  **约束限制**：  不涉及。  **取值范围**：  不涉及。  **默认取值**：  不填表示禁用主机名验证
     * @return endpointAlgorithm
     */
    public String getEndpointAlgorithm() {
        return endpointAlgorithm;
    }

    public void setEndpointAlgorithm(String endpointAlgorithm) {
        this.endpointAlgorithm = endpointAlgorithm;
    }

    public KafkaSecurity withSaslMechanism(String saslMechanism) {
        this.saslMechanism = saslMechanism;
        return this;
    }

    /**
     * **参数解释**：  SASL机制，用于客户端连接的SASL机制，对应Kafka字段：sasl.mechanism。  **约束限制**：  - 认证类型为SASL_PLAINTEXT、SASL_SSL时必填。  **取值范围**：  - GSSAPI：GSSAPI机制 - PLAIN：PLAIN机制 - SCRAM-SHA-256：SCRAM-SHA-256机制 - SCRAM-SHA-512：SCRAM-SHA-512机制  **默认取值**：  不涉及
     * @return saslMechanism
     */
    public String getSaslMechanism() {
        return saslMechanism;
    }

    public void setSaslMechanism(String saslMechanism) {
        this.saslMechanism = saslMechanism;
    }

    public KafkaSecurity withDelegationTokens(Boolean delegationTokens) {
        this.delegationTokens = delegationTokens;
        return this;
    }

    /**
     * **参数解释**：  是否为委托令牌鉴权。  **约束限制**：  - 安全协议为SASL_SSL和SASL_PLAINTEXT时，SASL机制选择SCRAM-SHA-256或者SCRAM-SHA-512时生效。  **取值范围**：  - true：使用委托令牌鉴权 - false：不使用委托令牌鉴权  **默认取值**：  不涉及
     * @return delegationTokens
     */
    public Boolean getDelegationTokens() {
        return delegationTokens;
    }

    public void setDelegationTokens(Boolean delegationTokens) {
        this.delegationTokens = delegationTokens;
    }

    public KafkaSecurity withEnableKeyStore(Boolean enableKeyStore) {
        this.enableKeyStore = enableKeyStore;
        return this;
    }

    /**
     * **参数解释**：  是否开启SSL双向认证。  **约束限制**：  不涉及。  **取值范围**：  - true：开启SSL双向认证 - false：不开启SSL双向认证  **默认取值**：  不涉及
     * @return enableKeyStore
     */
    public Boolean getEnableKeyStore() {
        return enableKeyStore;
    }

    public void setEnableKeyStore(Boolean enableKeyStore) {
        this.enableKeyStore = enableKeyStore;
    }

    public KafkaSecurity withKeyStoreKey(String keyStoreKey) {
        this.keyStoreKey = keyStoreKey;
        return this;
    }

    /**
     * **参数解释**：  Keystore证书。  **约束限制**：  - 开启SSL双向认证时需要。  **取值范围**：  不涉及。  **默认取值**：  不涉及
     * @return keyStoreKey
     */
    public String getKeyStoreKey() {
        return keyStoreKey;
    }

    public void setKeyStoreKey(String keyStoreKey) {
        this.keyStoreKey = keyStoreKey;
    }

    public KafkaSecurity withKeyStoreKeyName(String keyStoreKeyName) {
        this.keyStoreKeyName = keyStoreKeyName;
        return this;
    }

    /**
     * **参数解释**：  Keystore证书名称。  **约束限制**：  - 开启SSL双向认证时需要。  **取值范围**：  不涉及。  **默认取值**：  不涉及
     * @return keyStoreKeyName
     */
    public String getKeyStoreKeyName() {
        return keyStoreKeyName;
    }

    public void setKeyStoreKeyName(String keyStoreKeyName) {
        this.keyStoreKeyName = keyStoreKeyName;
    }

    public KafkaSecurity withKeyStorePassword(String keyStorePassword) {
        this.keyStorePassword = keyStorePassword;
        return this;
    }

    /**
     * **参数解释**：  Keystore证书密码，对应Kafka字段：ssl.keystore.password。  **约束限制**：  - 证书设置了密码时需要。  **取值范围**：  不涉及。  **默认取值**：  不涉及
     * @return keyStorePassword
     */
    public String getKeyStorePassword() {
        return keyStorePassword;
    }

    public void setKeyStorePassword(String keyStorePassword) {
        this.keyStorePassword = keyStorePassword;
    }

    public KafkaSecurity withSetPrivateKeyPassword(Boolean setPrivateKeyPassword) {
        this.setPrivateKeyPassword = setPrivateKeyPassword;
        return this;
    }

    /**
     * **参数解释**：  是否设置Keystore私钥密码。  **约束限制**：  不涉及。  **取值范围**：  - true：设置Keystore私钥密码 - false：不设置Keystore私钥密码  **默认取值**：  false
     * @return setPrivateKeyPassword
     */
    public Boolean getSetPrivateKeyPassword() {
        return setPrivateKeyPassword;
    }

    public void setSetPrivateKeyPassword(Boolean setPrivateKeyPassword) {
        this.setPrivateKeyPassword = setPrivateKeyPassword;
    }

    public KafkaSecurity withKeyPassword(String keyPassword) {
        this.keyPassword = keyPassword;
        return this;
    }

    /**
     * **参数解释**：  Keystore私钥密码，对应Kafka字段：ssl.key.password。  **约束限制**：  - 开启SSL双向认证时，set_private_key_password为true时必填。  **取值范围**：  不涉及。  **默认取值**：  不涉及
     * @return keyPassword
     */
    public String getKeyPassword() {
        return keyPassword;
    }

    public void setKeyPassword(String keyPassword) {
        this.keyPassword = keyPassword;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        KafkaSecurity that = (KafkaSecurity) obj;
        return Objects.equals(this.type, that.type) && Objects.equals(this.trustStoreKeyName, that.trustStoreKeyName)
            && Objects.equals(this.trustStoreKey, that.trustStoreKey)
            && Objects.equals(this.trustStorePassword, that.trustStorePassword)
            && Objects.equals(this.endpointAlgorithm, that.endpointAlgorithm)
            && Objects.equals(this.saslMechanism, that.saslMechanism)
            && Objects.equals(this.delegationTokens, that.delegationTokens)
            && Objects.equals(this.enableKeyStore, that.enableKeyStore)
            && Objects.equals(this.keyStoreKey, that.keyStoreKey)
            && Objects.equals(this.keyStoreKeyName, that.keyStoreKeyName)
            && Objects.equals(this.keyStorePassword, that.keyStorePassword)
            && Objects.equals(this.setPrivateKeyPassword, that.setPrivateKeyPassword)
            && Objects.equals(this.keyPassword, that.keyPassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type,
            trustStoreKeyName,
            trustStoreKey,
            trustStorePassword,
            endpointAlgorithm,
            saslMechanism,
            delegationTokens,
            enableKeyStore,
            keyStoreKey,
            keyStoreKeyName,
            keyStorePassword,
            setPrivateKeyPassword,
            keyPassword);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KafkaSecurity {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    trustStoreKeyName: ").append(toIndentedString(trustStoreKeyName)).append("\n");
        sb.append("    trustStoreKey: ").append(toIndentedString(trustStoreKey)).append("\n");
        sb.append("    trustStorePassword: ").append(toIndentedString(trustStorePassword)).append("\n");
        sb.append("    endpointAlgorithm: ").append(toIndentedString(endpointAlgorithm)).append("\n");
        sb.append("    saslMechanism: ").append(toIndentedString(saslMechanism)).append("\n");
        sb.append("    delegationTokens: ").append(toIndentedString(delegationTokens)).append("\n");
        sb.append("    enableKeyStore: ").append(toIndentedString(enableKeyStore)).append("\n");
        sb.append("    keyStoreKey: ").append(toIndentedString(keyStoreKey)).append("\n");
        sb.append("    keyStoreKeyName: ").append(toIndentedString(keyStoreKeyName)).append("\n");
        sb.append("    keyStorePassword: ").append(toIndentedString(keyStorePassword)).append("\n");
        sb.append("    setPrivateKeyPassword: ").append(toIndentedString(setPrivateKeyPassword)).append("\n");
        sb.append("    keyPassword: ").append(toIndentedString(keyPassword)).append("\n");
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
