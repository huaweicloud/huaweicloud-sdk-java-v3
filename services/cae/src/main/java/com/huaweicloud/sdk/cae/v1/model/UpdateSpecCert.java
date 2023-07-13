package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * UpdateSpecCert
 */
public class UpdateSpecCert {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "crt")

    private String crt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    /**
     * 安全策略。 - tls-1-2-strict - tls-1-2 - tls-1-1 - tls-1-0
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

    public UpdateSpecCert withCrt(String crt) {
        this.crt = crt;
        return this;
    }

    /**
     * 证书内容。
     * @return crt
     */
    public String getCrt() {
        return crt;
    }

    public void setCrt(String crt) {
        this.crt = crt;
    }

    public UpdateSpecCert withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * 私钥内容。
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public UpdateSpecCert withPolicy(PolicyEnum policy) {
        this.policy = policy;
        return this;
    }

    /**
     * 安全策略。 - tls-1-2-strict - tls-1-2 - tls-1-1 - tls-1-0
     * @return policy
     */
    public PolicyEnum getPolicy() {
        return policy;
    }

    public void setPolicy(PolicyEnum policy) {
        this.policy = policy;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateSpecCert that = (UpdateSpecCert) obj;
        return Objects.equals(this.crt, that.crt) && Objects.equals(this.key, that.key)
            && Objects.equals(this.policy, that.policy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(crt, key, policy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSpecCert {\n");
        sb.append("    crt: ").append(toIndentedString(crt)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
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
