package com.huaweicloud.sdk.modelarts.v1.model;

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
 * 创建自动扩缩容策略的请求体。
 */
public class CreateAutoScalingPolicyReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_name")

    private String policyName;

    /**
     * 自动扩缩容策略类型。可选值如下： - cron：定时扩缩容策略
     */
    public static final class PolicyTypeEnum {

        /**
         * Enum CRON for value: "cron"
         */
        public static final PolicyTypeEnum CRON = new PolicyTypeEnum("cron");

        private static final Map<String, PolicyTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PolicyTypeEnum> createStaticFields() {
            Map<String, PolicyTypeEnum> map = new HashMap<>();
            map.put("cron", CRON);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PolicyTypeEnum(String value) {
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
        public static PolicyTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PolicyTypeEnum(value));
        }

        public static PolicyTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PolicyTypeEnum) {
                return this.value.equals(((PolicyTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_type")

    private PolicyTypeEnum policyType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rules")

    private List<AutoScalingRuleReq> rules = null;

    public CreateAutoScalingPolicyReq withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * 自动扩缩容策略名称。支持1-64位字符，只能由小写字母、数字、“-”或“.”组成，且必须由字母或数字开头和结尾。
     * @return policyName
     */
    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public CreateAutoScalingPolicyReq withPolicyType(PolicyTypeEnum policyType) {
        this.policyType = policyType;
        return this;
    }

    /**
     * 自动扩缩容策略类型。可选值如下： - cron：定时扩缩容策略
     * @return policyType
     */
    public PolicyTypeEnum getPolicyType() {
        return policyType;
    }

    public void setPolicyType(PolicyTypeEnum policyType) {
        this.policyType = policyType;
    }

    public CreateAutoScalingPolicyReq withRules(List<AutoScalingRuleReq> rules) {
        this.rules = rules;
        return this;
    }

    public CreateAutoScalingPolicyReq addRulesItem(AutoScalingRuleReq rulesItem) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        this.rules.add(rulesItem);
        return this;
    }

    public CreateAutoScalingPolicyReq withRules(Consumer<List<AutoScalingRuleReq>> rulesSetter) {
        if (this.rules == null) {
            this.rules = new ArrayList<>();
        }
        rulesSetter.accept(this.rules);
        return this;
    }

    /**
     * 自动扩缩容规则，一条策略可添加多条规则。
     * @return rules
     */
    public List<AutoScalingRuleReq> getRules() {
        return rules;
    }

    public void setRules(List<AutoScalingRuleReq> rules) {
        this.rules = rules;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateAutoScalingPolicyReq that = (CreateAutoScalingPolicyReq) obj;
        return Objects.equals(this.policyName, that.policyName) && Objects.equals(this.policyType, that.policyType)
            && Objects.equals(this.rules, that.rules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyName, policyType, rules);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAutoScalingPolicyReq {\n");
        sb.append("    policyName: ").append(toIndentedString(policyName)).append("\n");
        sb.append("    policyType: ").append(toIndentedString(policyType)).append("\n");
        sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
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
