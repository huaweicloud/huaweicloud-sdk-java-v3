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
public class UpdatePolicyRuleStatusRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_id")

    private String policyId;

    /**
     * **参数解释：** 规则类型 **约束限制：** 不涉及 **取值范围：** - cc CC防护 - custom 精准防护 - whiteblackip 黑白名单 - geoip 地理位置防护 - ip-reputation 威胁情报 - antitamper 防篡改 - antileakage 防敏感信息泄露 - ignore 全局白名单(原误报屏蔽) - privacy 隐私屏蔽 **默认取值：** 不涉及
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
    @JsonProperty(value = "rule_id")

    private String ruleId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdatePolicyRuleStatusRequestBody body;

    public UpdatePolicyRuleStatusRequest withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * **参数解释：** 您可以通过调用企业项目管理服务（EPS）的查询企业项目列表接口（ListEnterpriseProject）查询企业项目ID。若需要查询当前用户所有企业项目绑定的资源信息，请传参all_granted_eps。 **约束限制：** 不涉及 **取值范围：**  - 0：代表default企业项目  - all_granted_eps：代表所有企业项目  - 其它企业项目ID：长度为36个字符 **默认取值：** 0
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public UpdatePolicyRuleStatusRequest withPolicyId(String policyId) {
        this.policyId = policyId;
        return this;
    }

    /**
     * **参数解释：** 防护策略id，您可以通过调用查询防护策略列表（ListPolicy）获取策略id **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return policyId
     */
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public UpdatePolicyRuleStatusRequest withRuleType(RuleTypeEnum ruleType) {
        this.ruleType = ruleType;
        return this;
    }

    /**
     * **参数解释：** 规则类型 **约束限制：** 不涉及 **取值范围：** - cc CC防护 - custom 精准防护 - whiteblackip 黑白名单 - geoip 地理位置防护 - ip-reputation 威胁情报 - antitamper 防篡改 - antileakage 防敏感信息泄露 - ignore 全局白名单(原误报屏蔽) - privacy 隐私屏蔽 **默认取值：** 不涉及
     * @return ruleType
     */
    public RuleTypeEnum getRuleType() {
        return ruleType;
    }

    public void setRuleType(RuleTypeEnum ruleType) {
        this.ruleType = ruleType;
    }

    public UpdatePolicyRuleStatusRequest withRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /**
     * **参数解释：** 规则id，通过对应规则类型的查询防护规则列表接口获取 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return ruleId
     */
    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId;
    }

    public UpdatePolicyRuleStatusRequest withBody(UpdatePolicyRuleStatusRequestBody body) {
        this.body = body;
        return this;
    }

    public UpdatePolicyRuleStatusRequest withBody(Consumer<UpdatePolicyRuleStatusRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new UpdatePolicyRuleStatusRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdatePolicyRuleStatusRequestBody getBody() {
        return body;
    }

    public void setBody(UpdatePolicyRuleStatusRequestBody body) {
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
        UpdatePolicyRuleStatusRequest that = (UpdatePolicyRuleStatusRequest) obj;
        return Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.policyId, that.policyId) && Objects.equals(this.ruleType, that.ruleType)
            && Objects.equals(this.ruleId, that.ruleId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId, policyId, ruleType, ruleId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePolicyRuleStatusRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    ruleType: ").append(toIndentedString(ruleType)).append("\n");
        sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
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
