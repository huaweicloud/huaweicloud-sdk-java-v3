package com.huaweicloud.sdk.kafka.v2.model;

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
 * 修改Kafka实例的接入方式。
 */
public class PlainSslEnableRequest {

    /**
     * 需要开启或者关闭的接入方式。
     */
    public static final class ProtocolEnum {

        /**
         * Enum PRIVATE_PLAIN_ENABLE for value: "private_plain_enable"
         */
        public static final ProtocolEnum PRIVATE_PLAIN_ENABLE = new ProtocolEnum("private_plain_enable");

        /**
         * Enum PRIVATE_SASL_SSL_ENABLE for value: "private_sasl_ssl_enable"
         */
        public static final ProtocolEnum PRIVATE_SASL_SSL_ENABLE = new ProtocolEnum("private_sasl_ssl_enable");

        /**
         * Enum PRIVATE_SASL_PLAINTEXT_ENABLE for value: "private_sasl_plaintext_enable"
         */
        public static final ProtocolEnum PRIVATE_SASL_PLAINTEXT_ENABLE =
            new ProtocolEnum("private_sasl_plaintext_enable");

        /**
         * Enum PUBLIC_PLAIN_ENABLE for value: "public_plain_enable"
         */
        public static final ProtocolEnum PUBLIC_PLAIN_ENABLE = new ProtocolEnum("public_plain_enable");

        /**
         * Enum PUBLIC_SASL_SSL_ENABLE for value: "public_sasl_ssl_enable"
         */
        public static final ProtocolEnum PUBLIC_SASL_SSL_ENABLE = new ProtocolEnum("public_sasl_ssl_enable");

        /**
         * Enum PUBLIC_SASL_PLAINTEXT_ENABLE for value: "public_sasl_plaintext_enable"
         */
        public static final ProtocolEnum PUBLIC_SASL_PLAINTEXT_ENABLE =
            new ProtocolEnum("public_sasl_plaintext_enable");

        private static final Map<String, ProtocolEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ProtocolEnum> createStaticFields() {
            Map<String, ProtocolEnum> map = new HashMap<>();
            map.put("private_plain_enable", PRIVATE_PLAIN_ENABLE);
            map.put("private_sasl_ssl_enable", PRIVATE_SASL_SSL_ENABLE);
            map.put("private_sasl_plaintext_enable", PRIVATE_SASL_PLAINTEXT_ENABLE);
            map.put("public_plain_enable", PUBLIC_PLAIN_ENABLE);
            map.put("public_sasl_ssl_enable", PUBLIC_SASL_SSL_ENABLE);
            map.put("public_sasl_plaintext_enable", PUBLIC_SASL_PLAINTEXT_ENABLE);
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
    @JsonProperty(value = "enable")

    private Boolean enable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_name")

    private String userName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pass_word")

    private String passWord;

    /**
     * Gets or Sets saslEnabledMechanisms
     */
    public static final class SaslEnabledMechanismsEnum {

        /**
         * Enum SCRAM_SHA_512 for value: "SCRAM-SHA-512"
         */
        public static final SaslEnabledMechanismsEnum SCRAM_SHA_512 = new SaslEnabledMechanismsEnum("SCRAM-SHA-512");

        /**
         * Enum PLAIN for value: "PLAIN"
         */
        public static final SaslEnabledMechanismsEnum PLAIN = new SaslEnabledMechanismsEnum("PLAIN");

        private static final Map<String, SaslEnabledMechanismsEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SaslEnabledMechanismsEnum> createStaticFields() {
            Map<String, SaslEnabledMechanismsEnum> map = new HashMap<>();
            map.put("SCRAM-SHA-512", SCRAM_SHA_512);
            map.put("PLAIN", PLAIN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SaslEnabledMechanismsEnum(String value) {
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
        public static SaslEnabledMechanismsEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SaslEnabledMechanismsEnum(value));
        }

        public static SaslEnabledMechanismsEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SaslEnabledMechanismsEnum) {
                return this.value.equals(((SaslEnabledMechanismsEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sasl_enabled_mechanisms")

    private List<SaslEnabledMechanismsEnum> saslEnabledMechanisms = null;

    public PlainSslEnableRequest withProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * 需要开启或者关闭的接入方式。
     * @return protocol
     */
    public ProtocolEnum getProtocol() {
        return protocol;
    }

    public void setProtocol(ProtocolEnum protocol) {
        this.protocol = protocol;
    }

    public PlainSslEnableRequest withEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }

    /**
     * - true：开启指定的接入方式。 - false：关闭指定的接入方式。
     * @return enable
     */
    public Boolean getEnable() {
        return enable;
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public PlainSslEnableRequest withUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * 首次开启SASL时，需要输入用户名。 实例创建后，关闭SASL并不会删除已经创建的用户，再次开启SASL时无需传入用户名，传入的用户名将无效。
     * @return userName
     */
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public PlainSslEnableRequest withPassWord(String passWord) {
        this.passWord = passWord;
        return this;
    }

    /**
     * 首次开启SASL时，需要输入用户名的密码。
     * @return passWord
     */
    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public PlainSslEnableRequest withSaslEnabledMechanisms(List<SaslEnabledMechanismsEnum> saslEnabledMechanisms) {
        this.saslEnabledMechanisms = saslEnabledMechanisms;
        return this;
    }

    public PlainSslEnableRequest addSaslEnabledMechanismsItem(SaslEnabledMechanismsEnum saslEnabledMechanismsItem) {
        if (this.saslEnabledMechanisms == null) {
            this.saslEnabledMechanisms = new ArrayList<>();
        }
        this.saslEnabledMechanisms.add(saslEnabledMechanismsItem);
        return this;
    }

    public PlainSslEnableRequest withSaslEnabledMechanisms(
        Consumer<List<SaslEnabledMechanismsEnum>> saslEnabledMechanismsSetter) {
        if (this.saslEnabledMechanisms == null) {
            this.saslEnabledMechanisms = new ArrayList<>();
        }
        saslEnabledMechanismsSetter.accept(this.saslEnabledMechanisms);
        return this;
    }

    /**
     * 开启SASL后使用的认证机制。仅在第一次开启SASL时传入生效。生效后再次传入无效。 - PLAIN：简单的用户名密码校验。 - SCRAM-SHA-512：用户凭证校验，安全性比PLAIN机制更高。
     * @return saslEnabledMechanisms
     */
    public List<SaslEnabledMechanismsEnum> getSaslEnabledMechanisms() {
        return saslEnabledMechanisms;
    }

    public void setSaslEnabledMechanisms(List<SaslEnabledMechanismsEnum> saslEnabledMechanisms) {
        this.saslEnabledMechanisms = saslEnabledMechanisms;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PlainSslEnableRequest that = (PlainSslEnableRequest) obj;
        return Objects.equals(this.protocol, that.protocol) && Objects.equals(this.enable, that.enable)
            && Objects.equals(this.userName, that.userName) && Objects.equals(this.passWord, that.passWord)
            && Objects.equals(this.saslEnabledMechanisms, that.saslEnabledMechanisms);
    }

    @Override
    public int hashCode() {
        return Objects.hash(protocol, enable, userName, passWord, saslEnabledMechanisms);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PlainSslEnableRequest {\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    enable: ").append(toIndentedString(enable)).append("\n");
        sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
        sb.append("    passWord: ").append(toIndentedString(passWord)).append("\n");
        sb.append("    saslEnabledMechanisms: ").append(toIndentedString(saslEnabledMechanisms)).append("\n");
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
