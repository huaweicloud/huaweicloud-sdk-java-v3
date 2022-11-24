package com.huaweicloud.sdk.elb.v3.model;

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
 * 更新自定义安全策略的请求参数。
 */
public class UpdateSecurityPolicyOption {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocols")

    private List<String> protocols = null;

    /**
    * Gets or Sets ciphers
    */
    public static final class CiphersEnum {

        /**
         * Enum ECDHE_RSA_AES256_GCM_SHA384 for value: "ECDHE-RSA-AES256-GCM-SHA384"
         */
        public static final CiphersEnum ECDHE_RSA_AES256_GCM_SHA384 = new CiphersEnum("ECDHE-RSA-AES256-GCM-SHA384");

        /**
         * Enum ECDHE_RSA_AES128_GCM_SHA256 for value: "ECDHE-RSA-AES128-GCM-SHA256"
         */
        public static final CiphersEnum ECDHE_RSA_AES128_GCM_SHA256 = new CiphersEnum("ECDHE-RSA-AES128-GCM-SHA256");

        /**
         * Enum ECDHE_ECDSA_AES256_GCM_SHA384 for value: "ECDHE-ECDSA-AES256-GCM-SHA384"
         */
        public static final CiphersEnum ECDHE_ECDSA_AES256_GCM_SHA384 =
            new CiphersEnum("ECDHE-ECDSA-AES256-GCM-SHA384");

        /**
         * Enum ECDHE_ECDSA_AES128_GCM_SHA256 for value: "ECDHE-ECDSA-AES128-GCM-SHA256"
         */
        public static final CiphersEnum ECDHE_ECDSA_AES128_GCM_SHA256 =
            new CiphersEnum("ECDHE-ECDSA-AES128-GCM-SHA256");

        /**
         * Enum AES128_GCM_SHA256 for value: "AES128-GCM-SHA256"
         */
        public static final CiphersEnum AES128_GCM_SHA256 = new CiphersEnum("AES128-GCM-SHA256");

        /**
         * Enum AES256_GCM_SHA384 for value: "AES256-GCM-SHA384"
         */
        public static final CiphersEnum AES256_GCM_SHA384 = new CiphersEnum("AES256-GCM-SHA384");

        /**
         * Enum ECDHE_ECDSA_AES128_SHA256 for value: "ECDHE-ECDSA-AES128-SHA256"
         */
        public static final CiphersEnum ECDHE_ECDSA_AES128_SHA256 = new CiphersEnum("ECDHE-ECDSA-AES128-SHA256");

        /**
         * Enum ECDHE_RSA_AES128_SHA256 for value: "ECDHE-RSA-AES128-SHA256"
         */
        public static final CiphersEnum ECDHE_RSA_AES128_SHA256 = new CiphersEnum("ECDHE-RSA-AES128-SHA256");

        /**
         * Enum AES128_SHA256 for value: "AES128-SHA256"
         */
        public static final CiphersEnum AES128_SHA256 = new CiphersEnum("AES128-SHA256");

        /**
         * Enum AES256_SHA256 for value: "AES256-SHA256"
         */
        public static final CiphersEnum AES256_SHA256 = new CiphersEnum("AES256-SHA256");

        /**
         * Enum ECDHE_ECDSA_AES256_SHA384 for value: "ECDHE-ECDSA-AES256-SHA384"
         */
        public static final CiphersEnum ECDHE_ECDSA_AES256_SHA384 = new CiphersEnum("ECDHE-ECDSA-AES256-SHA384");

        /**
         * Enum ECDHE_RSA_AES256_SHA384 for value: "ECDHE-RSA-AES256-SHA384"
         */
        public static final CiphersEnum ECDHE_RSA_AES256_SHA384 = new CiphersEnum("ECDHE-RSA-AES256-SHA384");

        /**
         * Enum ECDHE_ECDSA_AES128_SHA for value: "ECDHE-ECDSA-AES128-SHA"
         */
        public static final CiphersEnum ECDHE_ECDSA_AES128_SHA = new CiphersEnum("ECDHE-ECDSA-AES128-SHA");

        /**
         * Enum ECDHE_RSA_AES128_SHA for value: "ECDHE-RSA-AES128-SHA"
         */
        public static final CiphersEnum ECDHE_RSA_AES128_SHA = new CiphersEnum("ECDHE-RSA-AES128-SHA");

        /**
         * Enum ECDHE_RSA_AES256_SHA for value: "ECDHE-RSA-AES256-SHA"
         */
        public static final CiphersEnum ECDHE_RSA_AES256_SHA = new CiphersEnum("ECDHE-RSA-AES256-SHA");

        /**
         * Enum ECDHE_ECDSA_AES256_SHA for value: "ECDHE-ECDSA-AES256-SHA"
         */
        public static final CiphersEnum ECDHE_ECDSA_AES256_SHA = new CiphersEnum("ECDHE-ECDSA-AES256-SHA");

        /**
         * Enum AES128_SHA for value: "AES128-SHA"
         */
        public static final CiphersEnum AES128_SHA = new CiphersEnum("AES128-SHA");

        /**
         * Enum AES256_SHA for value: "AES256-SHA"
         */
        public static final CiphersEnum AES256_SHA = new CiphersEnum("AES256-SHA");

        /**
         * Enum CAMELLIA128_SHA for value: "CAMELLIA128-SHA"
         */
        public static final CiphersEnum CAMELLIA128_SHA = new CiphersEnum("CAMELLIA128-SHA");

        /**
         * Enum DES_CBC3_SHA for value: "DES-CBC3-SHA"
         */
        public static final CiphersEnum DES_CBC3_SHA = new CiphersEnum("DES-CBC3-SHA");

        /**
         * Enum CAMELLIA256_SHA for value: "CAMELLIA256-SHA"
         */
        public static final CiphersEnum CAMELLIA256_SHA = new CiphersEnum("CAMELLIA256-SHA");

        /**
         * Enum ECDHE_RSA_CHACHA20_POLY1305 for value: "ECDHE-RSA-CHACHA20-POLY1305"
         */
        public static final CiphersEnum ECDHE_RSA_CHACHA20_POLY1305 = new CiphersEnum("ECDHE-RSA-CHACHA20-POLY1305");

        /**
         * Enum ECDHE_ECDSA_CHACHA20_POLY1305 for value: "ECDHE-ECDSA-CHACHA20-POLY1305"
         */
        public static final CiphersEnum ECDHE_ECDSA_CHACHA20_POLY1305 =
            new CiphersEnum("ECDHE-ECDSA-CHACHA20-POLY1305");

        /**
         * Enum TLS_AES_128_GCM_SHA256 for value: "TLS_AES_128_GCM_SHA256"
         */
        public static final CiphersEnum TLS_AES_128_GCM_SHA256 = new CiphersEnum("TLS_AES_128_GCM_SHA256");

        /**
         * Enum TLS_AES_256_GCM_SHA384 for value: "TLS_AES_256_GCM_SHA384"
         */
        public static final CiphersEnum TLS_AES_256_GCM_SHA384 = new CiphersEnum("TLS_AES_256_GCM_SHA384");

        /**
         * Enum TLS_CHACHA20_POLY1305_SHA256 for value: "TLS_CHACHA20_POLY1305_SHA256"
         */
        public static final CiphersEnum TLS_CHACHA20_POLY1305_SHA256 = new CiphersEnum("TLS_CHACHA20_POLY1305_SHA256");

        /**
         * Enum TLS_AES_128_CCM_SHA256 for value: "TLS_AES_128_CCM_SHA256"
         */
        public static final CiphersEnum TLS_AES_128_CCM_SHA256 = new CiphersEnum("TLS_AES_128_CCM_SHA256");

        /**
         * Enum TLS_AES_128_CCM_8_SHA256 for value: "TLS_AES_128_CCM_8_SHA256"
         */
        public static final CiphersEnum TLS_AES_128_CCM_8_SHA256 = new CiphersEnum("TLS_AES_128_CCM_8_SHA256");

        private static final Map<String, CiphersEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CiphersEnum> createStaticFields() {
            Map<String, CiphersEnum> map = new HashMap<>();
            map.put("ECDHE-RSA-AES256-GCM-SHA384", ECDHE_RSA_AES256_GCM_SHA384);
            map.put("ECDHE-RSA-AES128-GCM-SHA256", ECDHE_RSA_AES128_GCM_SHA256);
            map.put("ECDHE-ECDSA-AES256-GCM-SHA384", ECDHE_ECDSA_AES256_GCM_SHA384);
            map.put("ECDHE-ECDSA-AES128-GCM-SHA256", ECDHE_ECDSA_AES128_GCM_SHA256);
            map.put("AES128-GCM-SHA256", AES128_GCM_SHA256);
            map.put("AES256-GCM-SHA384", AES256_GCM_SHA384);
            map.put("ECDHE-ECDSA-AES128-SHA256", ECDHE_ECDSA_AES128_SHA256);
            map.put("ECDHE-RSA-AES128-SHA256", ECDHE_RSA_AES128_SHA256);
            map.put("AES128-SHA256", AES128_SHA256);
            map.put("AES256-SHA256", AES256_SHA256);
            map.put("ECDHE-ECDSA-AES256-SHA384", ECDHE_ECDSA_AES256_SHA384);
            map.put("ECDHE-RSA-AES256-SHA384", ECDHE_RSA_AES256_SHA384);
            map.put("ECDHE-ECDSA-AES128-SHA", ECDHE_ECDSA_AES128_SHA);
            map.put("ECDHE-RSA-AES128-SHA", ECDHE_RSA_AES128_SHA);
            map.put("ECDHE-RSA-AES256-SHA", ECDHE_RSA_AES256_SHA);
            map.put("ECDHE-ECDSA-AES256-SHA", ECDHE_ECDSA_AES256_SHA);
            map.put("AES128-SHA", AES128_SHA);
            map.put("AES256-SHA", AES256_SHA);
            map.put("CAMELLIA128-SHA", CAMELLIA128_SHA);
            map.put("DES-CBC3-SHA", DES_CBC3_SHA);
            map.put("CAMELLIA256-SHA", CAMELLIA256_SHA);
            map.put("ECDHE-RSA-CHACHA20-POLY1305", ECDHE_RSA_CHACHA20_POLY1305);
            map.put("ECDHE-ECDSA-CHACHA20-POLY1305", ECDHE_ECDSA_CHACHA20_POLY1305);
            map.put("TLS_AES_128_GCM_SHA256", TLS_AES_128_GCM_SHA256);
            map.put("TLS_AES_256_GCM_SHA384", TLS_AES_256_GCM_SHA384);
            map.put("TLS_CHACHA20_POLY1305_SHA256", TLS_CHACHA20_POLY1305_SHA256);
            map.put("TLS_AES_128_CCM_SHA256", TLS_AES_128_CCM_SHA256);
            map.put("TLS_AES_128_CCM_8_SHA256", TLS_AES_128_CCM_8_SHA256);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CiphersEnum(String value) {
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
        public static CiphersEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            CiphersEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new CiphersEnum(value);
            }
            return result;
        }

        public static CiphersEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            CiphersEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CiphersEnum) {
                return this.value.equals(((CiphersEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ciphers")

    private List<CiphersEnum> ciphers = null;

    public UpdateSecurityPolicyOption withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 自定义安全策略的名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateSecurityPolicyOption withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 自定义安全策略的描述信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateSecurityPolicyOption withProtocols(List<String> protocols) {
        this.protocols = protocols;
        return this;
    }

    public UpdateSecurityPolicyOption addProtocolsItem(String protocolsItem) {
        if (this.protocols == null) {
            this.protocols = new ArrayList<>();
        }
        this.protocols.add(protocolsItem);
        return this;
    }

    public UpdateSecurityPolicyOption withProtocols(Consumer<List<String>> protocolsSetter) {
        if (this.protocols == null) {
            this.protocols = new ArrayList<>();
        }
        protocolsSetter.accept(this.protocols);
        return this;
    }

    /**
     * 自定义安全策略选择的TLS协议列表。取值：TLSv1, TLSv1.1, TLSv1.2, TLSv1.3
     * @return protocols
     */
    public List<String> getProtocols() {
        return protocols;
    }

    public void setProtocols(List<String> protocols) {
        this.protocols = protocols;
    }

    public UpdateSecurityPolicyOption withCiphers(List<CiphersEnum> ciphers) {
        this.ciphers = ciphers;
        return this;
    }

    public UpdateSecurityPolicyOption addCiphersItem(CiphersEnum ciphersItem) {
        if (this.ciphers == null) {
            this.ciphers = new ArrayList<>();
        }
        this.ciphers.add(ciphersItem);
        return this;
    }

    public UpdateSecurityPolicyOption withCiphers(Consumer<List<CiphersEnum>> ciphersSetter) {
        if (this.ciphers == null) {
            this.ciphers = new ArrayList<>();
        }
        ciphersSetter.accept(this.ciphers);
        return this;
    }

    /**
     * 自定义安全策略的加密套件列表。支持以下加密套件：  ECDHE-RSA-AES256-GCM-SHA384,ECDHE-RSA-AES128-GCM-SHA256, ECDHE-ECDSA-AES256-GCM-SHA384,ECDHE-ECDSA-AES128-GCM-SHA256, AES128-GCM-SHA256,AES256-GCM-SHA384,ECDHE-ECDSA-AES128-SHA256, ECDHE-RSA-AES128-SHA256,AES128-SHA256,AES256-SHA256, ECDHE-ECDSA-AES256-SHA384,ECDHE-RSA-AES256-SHA384, ECDHE-ECDSA-AES128-SHA,ECDHE-RSA-AES128-SHA,ECDHE-RSA-AES256-SHA, ECDHE-ECDSA-AES256-SHA,AES128-SHA,AES256-SHA,CAMELLIA128-SHA, DES-CBC3-SHA,CAMELLIA256-SHA,ECDHE-RSA-CHACHA20-POLY1305, ECDHE-ECDSA-CHACHA20-POLY1305,TLS_AES_128_GCM_SHA256, TLS_AES_256_GCM_SHA384,TLS_CHACHA20_POLY1305_SHA256, TLS_AES_128_CCM_SHA256,TLS_AES_128_CCM_8_SHA256  使用说明： - 协议和加密套件必须匹配，即ciphers中必须至少有一种有与协议匹配的加密套件。  > 协议与加密套件的匹配关系可参考系统安全策略
     * @return ciphers
     */
    public List<CiphersEnum> getCiphers() {
        return ciphers;
    }

    public void setCiphers(List<CiphersEnum> ciphers) {
        this.ciphers = ciphers;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateSecurityPolicyOption updateSecurityPolicyOption = (UpdateSecurityPolicyOption) o;
        return Objects.equals(this.name, updateSecurityPolicyOption.name)
            && Objects.equals(this.description, updateSecurityPolicyOption.description)
            && Objects.equals(this.protocols, updateSecurityPolicyOption.protocols)
            && Objects.equals(this.ciphers, updateSecurityPolicyOption.ciphers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, protocols, ciphers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSecurityPolicyOption {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    protocols: ").append(toIndentedString(protocols)).append("\n");
        sb.append("    ciphers: ").append(toIndentedString(ciphers)).append("\n");
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
