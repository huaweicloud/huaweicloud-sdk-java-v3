package com.huaweicloud.sdk.waf.v1.model;

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
 * Request Object
 */
public class BatchDeleteRulesRequest {

    /**
     * **参数解释：** 需要删除的规则类型,目前支持cc,custom,whiteblackip,privacy,ignore,geoip,antitamper,antileakage,ip-reputation,llm-guards **约束限制：** 需要购买“大模型防火墙”服务后才可使用llm-guards **取值范围：** - cc CC防护 - custom 精准防护 - whiteblackip 黑白名单 - geoip 地理位置防护 - ip-reputation 威胁情报 - antitamper 防篡改 - antileakage 防敏感信息泄露 - ignore 全局白名单(原误报屏蔽) - privacy 隐私屏蔽 - llm-guards 大模型防火墙 **默认取值：** 不涉及
     */
    public static final class RuleTypeEnum {

        /**
         * Enum CC for value: "cc"
         */
        public static final RuleTypeEnum CC = new RuleTypeEnum("cc");

        /**
         * Enum CUSTOM for value: "custom"
         */
        public static final RuleTypeEnum CUSTOM = new RuleTypeEnum("custom");

        /**
         * Enum WHITEBLACKIP for value: "whiteblackip"
         */
        public static final RuleTypeEnum WHITEBLACKIP = new RuleTypeEnum("whiteblackip");

        /**
         * Enum PRIVACY for value: "privacy"
         */
        public static final RuleTypeEnum PRIVACY = new RuleTypeEnum("privacy");

        /**
         * Enum IGNORE for value: "ignore"
         */
        public static final RuleTypeEnum IGNORE = new RuleTypeEnum("ignore");

        /**
         * Enum GEOIP for value: "geoip"
         */
        public static final RuleTypeEnum GEOIP = new RuleTypeEnum("geoip");

        /**
         * Enum ANTITAMPER for value: "antitamper"
         */
        public static final RuleTypeEnum ANTITAMPER = new RuleTypeEnum("antitamper");

        /**
         * Enum ANTILEAKAGE for value: "antileakage"
         */
        public static final RuleTypeEnum ANTILEAKAGE = new RuleTypeEnum("antileakage");

        /**
         * Enum IP_REPUTATION for value: "ip-reputation"
         */
        public static final RuleTypeEnum IP_REPUTATION = new RuleTypeEnum("ip-reputation");

        /**
         * Enum LLM_GUARDS for value: "llm-guards"
         */
        public static final RuleTypeEnum LLM_GUARDS = new RuleTypeEnum("llm-guards");

        private static final Map<String, RuleTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RuleTypeEnum> createStaticFields() {
            Map<String, RuleTypeEnum> map = new HashMap<>();
            map.put("cc", CC);
            map.put("custom", CUSTOM);
            map.put("whiteblackip", WHITEBLACKIP);
            map.put("privacy", PRIVACY);
            map.put("ignore", IGNORE);
            map.put("geoip", GEOIP);
            map.put("antitamper", ANTITAMPER);
            map.put("antileakage", ANTILEAKAGE);
            map.put("ip-reputation", IP_REPUTATION);
            map.put("llm-guards", LLM_GUARDS);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RuleTypeEnum(String value) {
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
        public static RuleTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RuleTypeEnum(value));
        }

        public static RuleTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RuleTypeEnum) {
                return this.value.equals(((RuleTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_type")

    private RuleTypeEnum ruleType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private PolicyRuleIdRequestBody body;

    public BatchDeleteRulesRequest withRuleType(RuleTypeEnum ruleType) {
        this.ruleType = ruleType;
        return this;
    }

    /**
     * **参数解释：** 需要删除的规则类型,目前支持cc,custom,whiteblackip,privacy,ignore,geoip,antitamper,antileakage,ip-reputation,llm-guards **约束限制：** 需要购买“大模型防火墙”服务后才可使用llm-guards **取值范围：** - cc CC防护 - custom 精准防护 - whiteblackip 黑白名单 - geoip 地理位置防护 - ip-reputation 威胁情报 - antitamper 防篡改 - antileakage 防敏感信息泄露 - ignore 全局白名单(原误报屏蔽) - privacy 隐私屏蔽 - llm-guards 大模型防火墙 **默认取值：** 不涉及
     * @return ruleType
     */
    public RuleTypeEnum getRuleType() {
        return ruleType;
    }

    public void setRuleType(RuleTypeEnum ruleType) {
        this.ruleType = ruleType;
    }

    public BatchDeleteRulesRequest withBody(PolicyRuleIdRequestBody body) {
        this.body = body;
        return this;
    }

    public BatchDeleteRulesRequest withBody(Consumer<PolicyRuleIdRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new PolicyRuleIdRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public PolicyRuleIdRequestBody getBody() {
        return body;
    }

    public void setBody(PolicyRuleIdRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDeleteRulesRequest that = (BatchDeleteRulesRequest) obj;
        return Objects.equals(this.ruleType, that.ruleType) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ruleType, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDeleteRulesRequest {\n");
        sb.append("    ruleType: ").append(toIndentedString(ruleType)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
