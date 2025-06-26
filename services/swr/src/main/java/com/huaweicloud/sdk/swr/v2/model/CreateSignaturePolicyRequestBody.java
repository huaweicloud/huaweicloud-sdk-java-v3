package com.huaweicloud.sdk.swr.v2.model;

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
 * CreateSignaturePolicyRequestBody
 */
public class CreateSignaturePolicyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    /**
     * 加签方式，可选KMS
     */
    public static final class SignatureMethodEnum {

        /**
         * Enum KMS for value: "KMS"
         */
        public static final SignatureMethodEnum KMS = new SignatureMethodEnum("KMS");

        private static final Map<String, SignatureMethodEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SignatureMethodEnum> createStaticFields() {
            Map<String, SignatureMethodEnum> map = new HashMap<>();
            map.put("KMS", KMS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SignatureMethodEnum(String value) {
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
        public static SignatureMethodEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SignatureMethodEnum(value));
        }

        public static SignatureMethodEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SignatureMethodEnum) {
                return this.value.equals(((SignatureMethodEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signature_method")

    private SignatureMethodEnum signatureMethod;

    /**
     * 加签算法，KMS的密钥算法EC_P256对应着ECDSA_SHA_256，EC_P384对应着ECDSA_SHA_384，SM2对应着SM2DSA_SM3
     */
    public static final class SignatureAlgorithmEnum {

        /**
         * Enum ECDSA_SHA_384 for value: "ECDSA_SHA_384"
         */
        public static final SignatureAlgorithmEnum ECDSA_SHA_384 = new SignatureAlgorithmEnum("ECDSA_SHA_384");

        /**
         * Enum SM2DSA_SM3 for value: "SM2DSA_SM3"
         */
        public static final SignatureAlgorithmEnum SM2DSA_SM3 = new SignatureAlgorithmEnum("SM2DSA_SM3");

        /**
         * Enum ECDSA_SHA_256 for value: "ECDSA_SHA_256"
         */
        public static final SignatureAlgorithmEnum ECDSA_SHA_256 = new SignatureAlgorithmEnum("ECDSA_SHA_256");

        private static final Map<String, SignatureAlgorithmEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SignatureAlgorithmEnum> createStaticFields() {
            Map<String, SignatureAlgorithmEnum> map = new HashMap<>();
            map.put("ECDSA_SHA_384", ECDSA_SHA_384);
            map.put("SM2DSA_SM3", SM2DSA_SM3);
            map.put("ECDSA_SHA_256", ECDSA_SHA_256);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SignatureAlgorithmEnum(String value) {
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
        public static SignatureAlgorithmEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SignatureAlgorithmEnum(value));
        }

        public static SignatureAlgorithmEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SignatureAlgorithmEnum) {
                return this.value.equals(((SignatureAlgorithmEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signature_algorithm")

    private SignatureAlgorithmEnum signatureAlgorithm;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "signature_key")

    private String signatureKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger")

    private TriggerConfig trigger;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scope_rules")

    private List<SignScopeRule> scopeRules = null;

    public CreateSignaturePolicyRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 签名策略名称，由字母、汉字、数字、下划线（_）、中划线 (-)组成，1-256个字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateSignaturePolicyRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 签名策略描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateSignaturePolicyRequestBody withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 是否开启
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public CreateSignaturePolicyRequestBody withSignatureMethod(SignatureMethodEnum signatureMethod) {
        this.signatureMethod = signatureMethod;
        return this;
    }

    /**
     * 加签方式，可选KMS
     * @return signatureMethod
     */
    public SignatureMethodEnum getSignatureMethod() {
        return signatureMethod;
    }

    public void setSignatureMethod(SignatureMethodEnum signatureMethod) {
        this.signatureMethod = signatureMethod;
    }

    public CreateSignaturePolicyRequestBody withSignatureAlgorithm(SignatureAlgorithmEnum signatureAlgorithm) {
        this.signatureAlgorithm = signatureAlgorithm;
        return this;
    }

    /**
     * 加签算法，KMS的密钥算法EC_P256对应着ECDSA_SHA_256，EC_P384对应着ECDSA_SHA_384，SM2对应着SM2DSA_SM3
     * @return signatureAlgorithm
     */
    public SignatureAlgorithmEnum getSignatureAlgorithm() {
        return signatureAlgorithm;
    }

    public void setSignatureAlgorithm(SignatureAlgorithmEnum signatureAlgorithm) {
        this.signatureAlgorithm = signatureAlgorithm;
    }

    public CreateSignaturePolicyRequestBody withSignatureKey(String signatureKey) {
        this.signatureKey = signatureKey;
        return this;
    }

    /**
     * 加签Key
     * @return signatureKey
     */
    public String getSignatureKey() {
        return signatureKey;
    }

    public void setSignatureKey(String signatureKey) {
        this.signatureKey = signatureKey;
    }

    public CreateSignaturePolicyRequestBody withTrigger(TriggerConfig trigger) {
        this.trigger = trigger;
        return this;
    }

    public CreateSignaturePolicyRequestBody withTrigger(Consumer<TriggerConfig> triggerSetter) {
        if (this.trigger == null) {
            this.trigger = new TriggerConfig();
            triggerSetter.accept(this.trigger);
        }

        return this;
    }

    /**
     * Get trigger
     * @return trigger
     */
    public TriggerConfig getTrigger() {
        return trigger;
    }

    public void setTrigger(TriggerConfig trigger) {
        this.trigger = trigger;
    }

    public CreateSignaturePolicyRequestBody withScopeRules(List<SignScopeRule> scopeRules) {
        this.scopeRules = scopeRules;
        return this;
    }

    public CreateSignaturePolicyRequestBody addScopeRulesItem(SignScopeRule scopeRulesItem) {
        if (this.scopeRules == null) {
            this.scopeRules = new ArrayList<>();
        }
        this.scopeRules.add(scopeRulesItem);
        return this;
    }

    public CreateSignaturePolicyRequestBody withScopeRules(Consumer<List<SignScopeRule>> scopeRulesSetter) {
        if (this.scopeRules == null) {
            this.scopeRules = new ArrayList<>();
        }
        scopeRulesSetter.accept(this.scopeRules);
        return this;
    }

    /**
     * 作用范围规则
     * @return scopeRules
     */
    public List<SignScopeRule> getScopeRules() {
        return scopeRules;
    }

    public void setScopeRules(List<SignScopeRule> scopeRules) {
        this.scopeRules = scopeRules;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateSignaturePolicyRequestBody that = (CreateSignaturePolicyRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.enabled, that.enabled) && Objects.equals(this.signatureMethod, that.signatureMethod)
            && Objects.equals(this.signatureAlgorithm, that.signatureAlgorithm)
            && Objects.equals(this.signatureKey, that.signatureKey) && Objects.equals(this.trigger, that.trigger)
            && Objects.equals(this.scopeRules, that.scopeRules);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(name, description, enabled, signatureMethod, signatureAlgorithm, signatureKey, trigger, scopeRules);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSignaturePolicyRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    signatureMethod: ").append(toIndentedString(signatureMethod)).append("\n");
        sb.append("    signatureAlgorithm: ").append(toIndentedString(signatureAlgorithm)).append("\n");
        sb.append("    signatureKey: ").append(toIndentedString(signatureKey)).append("\n");
        sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
        sb.append("    scopeRules: ").append(toIndentedString(scopeRules)).append("\n");
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
