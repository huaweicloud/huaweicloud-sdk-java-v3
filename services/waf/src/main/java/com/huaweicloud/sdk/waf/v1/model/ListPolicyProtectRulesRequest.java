package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Request Object
 */
public class ListPolicyProtectRulesRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policyids")

    private String policyids;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page")

    private Integer page;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pagesize")

    private Integer pagesize;

    /**
     * **参数解释：** 需要查询的规则类型 **约束限制：** 不涉及 **取值范围：** - cc CC防护 - custom 精准防护 - whiteblackip 黑白名单 - geoip 地理位置防护 - ip-reputation 威胁情报 - antitamper 防篡改 - antileakage 防敏感信息泄露 - ignore 全局白名单(原误报屏蔽) - privacy 隐私屏蔽 **默认取值：** 不涉及
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

    public ListPolicyProtectRulesRequest withPolicyids(String policyids) {
        this.policyids = policyids;
        return this;
    }

    /**
     * **参数解释：** 策略id列表。策略id从\"查询防护策略列表\"(ListPolicy)接口获取，多个策略之间用“,”隔开 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return policyids
     */
    public String getPolicyids() {
        return policyids;
    }

    public void setPolicyids(String policyids) {
        this.policyids = policyids;
    }

    public ListPolicyProtectRulesRequest withEnterpriseProjectId(String enterpriseProjectId) {
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

    public ListPolicyProtectRulesRequest withPage(Integer page) {
        this.page = page;
        return this;
    }

    /**
     * **参数解释：** 分页查询时，返回第几页数据 **约束限制：** 不涉及 **取值范围：** page参数的实际有效范围取决于总数据量和pagesize的取值，不能大于总页数 **默认取值：** 1
     * @return page
     */
    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public ListPolicyProtectRulesRequest withPagesize(Integer pagesize) {
        this.pagesize = pagesize;
        return this;
    }

    /**
     * **参数解释：** 分页查询时，每页包含的结果条数 **约束限制：** 不涉及 **取值范围：** [0, 总数据量] **默认取值：** 1000
     * @return pagesize
     */
    public Integer getPagesize() {
        return pagesize;
    }

    public void setPagesize(Integer pagesize) {
        this.pagesize = pagesize;
    }

    public ListPolicyProtectRulesRequest withRuleType(RuleTypeEnum ruleType) {
        this.ruleType = ruleType;
        return this;
    }

    /**
     * **参数解释：** 需要查询的规则类型 **约束限制：** 不涉及 **取值范围：** - cc CC防护 - custom 精准防护 - whiteblackip 黑白名单 - geoip 地理位置防护 - ip-reputation 威胁情报 - antitamper 防篡改 - antileakage 防敏感信息泄露 - ignore 全局白名单(原误报屏蔽) - privacy 隐私屏蔽 **默认取值：** 不涉及
     * @return ruleType
     */
    public RuleTypeEnum getRuleType() {
        return ruleType;
    }

    public void setRuleType(RuleTypeEnum ruleType) {
        this.ruleType = ruleType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPolicyProtectRulesRequest that = (ListPolicyProtectRulesRequest) obj;
        return Objects.equals(this.policyids, that.policyids)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.page, that.page) && Objects.equals(this.pagesize, that.pagesize)
            && Objects.equals(this.ruleType, that.ruleType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policyids, enterpriseProjectId, page, pagesize, ruleType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPolicyProtectRulesRequest {\n");
        sb.append("    policyids: ").append(toIndentedString(policyids)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    page: ").append(toIndentedString(page)).append("\n");
        sb.append("    pagesize: ").append(toIndentedString(pagesize)).append("\n");
        sb.append("    ruleType: ").append(toIndentedString(ruleType)).append("\n");
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
