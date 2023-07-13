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
     * 策略类型
     */
    public static final class RuletypeEnum {

        /**
         * Enum WHITEBLACKIP for value: "whiteblackip"
         */
        public static final RuletypeEnum WHITEBLACKIP = new RuletypeEnum("whiteblackip");

        /**
         * Enum GEOIP for value: "geoip"
         */
        public static final RuletypeEnum GEOIP = new RuletypeEnum("geoip");

        /**
         * Enum PRIVACY for value: "privacy"
         */
        public static final RuletypeEnum PRIVACY = new RuletypeEnum("privacy");

        /**
         * Enum ANTITAMPER for value: "antitamper"
         */
        public static final RuletypeEnum ANTITAMPER = new RuletypeEnum("antitamper");

        /**
         * Enum CUSTOM for value: "custom"
         */
        public static final RuletypeEnum CUSTOM = new RuletypeEnum("custom");

        /**
         * Enum IGNORE for value: "ignore"
         */
        public static final RuletypeEnum IGNORE = new RuletypeEnum("ignore");

        private static final Map<String, RuletypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RuletypeEnum> createStaticFields() {
            Map<String, RuletypeEnum> map = new HashMap<>();
            map.put("whiteblackip", WHITEBLACKIP);
            map.put("geoip", GEOIP);
            map.put("privacy", PRIVACY);
            map.put("antitamper", ANTITAMPER);
            map.put("custom", CUSTOM);
            map.put("ignore", IGNORE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RuletypeEnum(String value) {
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
        public static RuletypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RuletypeEnum(value));
        }

        public static RuletypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RuletypeEnum) {
                return this.value.equals(((RuletypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ruletype")

    private RuletypeEnum ruletype;

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
     * 您可以通过调用企业项目管理服务（EPS）的查询企业项目列表接口（ListEnterpriseProject）查询企业项目id
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
     * 策略id（策略id从查询防护策略列表接口获取）
     * @return policyId
     */
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public UpdatePolicyRuleStatusRequest withRuletype(RuletypeEnum ruletype) {
        this.ruletype = ruletype;
        return this;
    }

    /**
     * 策略类型
     * @return ruletype
     */
    public RuletypeEnum getRuletype() {
        return ruletype;
    }

    public void setRuletype(RuletypeEnum ruletype) {
        this.ruletype = ruletype;
    }

    public UpdatePolicyRuleStatusRequest withRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }

    /**
     * 规则id，根据不同的规则类型（ruletype）调用规则列表接口获取规则id，例如黑白名单（whiteblackip）规则id，您可以通过调用查询黑白名单规则列表（ListWhiteblackipRule）获取规则id
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
            && Objects.equals(this.policyId, that.policyId) && Objects.equals(this.ruletype, that.ruletype)
            && Objects.equals(this.ruleId, that.ruleId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enterpriseProjectId, policyId, ruletype, ruleId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdatePolicyRuleStatusRequest {\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
        sb.append("    ruletype: ").append(toIndentedString(ruletype)).append("\n");
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
