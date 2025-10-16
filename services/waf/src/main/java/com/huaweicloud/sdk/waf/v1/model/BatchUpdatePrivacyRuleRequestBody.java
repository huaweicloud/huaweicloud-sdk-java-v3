package com.huaweicloud.sdk.waf.v1.model;

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
 * BatchUpdatePrivacyRuleRequestBody
 */
public class BatchUpdatePrivacyRuleRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    /**
     * 屏蔽字段   - Params：请求参数   - Cookie：根据Cookie区分的Web访问者   - Header：自定义HTTP首部   - Form：表单参数
     */
    public static final class CategoryEnum {

        /**
         * Enum PARAMS for value: "params"
         */
        public static final CategoryEnum PARAMS = new CategoryEnum("params");

        /**
         * Enum COOKIE for value: "cookie"
         */
        public static final CategoryEnum COOKIE = new CategoryEnum("cookie");

        /**
         * Enum HEADER for value: "header"
         */
        public static final CategoryEnum HEADER = new CategoryEnum("header");

        /**
         * Enum FORM for value: "form"
         */
        public static final CategoryEnum FORM = new CategoryEnum("form");

        private static final Map<String, CategoryEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CategoryEnum> createStaticFields() {
            Map<String, CategoryEnum> map = new HashMap<>();
            map.put("params", PARAMS);
            map.put("cookie", COOKIE);
            map.put("header", HEADER);
            map.put("form", FORM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        CategoryEnum(String value) {
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
        public static CategoryEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new CategoryEnum(value));
        }

        public static CategoryEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof CategoryEnum) {
                return this.value.equals(((CategoryEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private CategoryEnum category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "index")

    private String index;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_rule_ids")

    private List<PolicyRuleIdRequestBodyPolicyRuleIds> policyRuleIds = null;

    public BatchUpdatePrivacyRuleRequestBody withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 隐私屏蔽规则防护的url，需要填写标准的url格式，例如/admin/xxx或者/admin/_*,以\"*\"（星号）结尾代表路径前缀
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public BatchUpdatePrivacyRuleRequestBody withCategory(CategoryEnum category) {
        this.category = category;
        return this;
    }

    /**
     * 屏蔽字段   - Params：请求参数   - Cookie：根据Cookie区分的Web访问者   - Header：自定义HTTP首部   - Form：表单参数
     * @return category
     */
    public CategoryEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryEnum category) {
        this.category = category;
    }

    public BatchUpdatePrivacyRuleRequestBody withIndex(String index) {
        this.index = index;
        return this;
    }

    /**
     * 屏蔽字段名，根据“屏蔽字段”设置字段名，被屏蔽的字段将不会出现在日志中。屏蔽字段名长度不能超过2048字节，且只能由数字、字母、下划线和中划线组成
     * @return index
     */
    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public BatchUpdatePrivacyRuleRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 规则描述，可选参数，设置该规则的备注信息。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BatchUpdatePrivacyRuleRequestBody withPolicyRuleIds(
        List<PolicyRuleIdRequestBodyPolicyRuleIds> policyRuleIds) {
        this.policyRuleIds = policyRuleIds;
        return this;
    }

    public BatchUpdatePrivacyRuleRequestBody addPolicyRuleIdsItem(
        PolicyRuleIdRequestBodyPolicyRuleIds policyRuleIdsItem) {
        if (this.policyRuleIds == null) {
            this.policyRuleIds = new ArrayList<>();
        }
        this.policyRuleIds.add(policyRuleIdsItem);
        return this;
    }

    public BatchUpdatePrivacyRuleRequestBody withPolicyRuleIds(
        Consumer<List<PolicyRuleIdRequestBodyPolicyRuleIds>> policyRuleIdsSetter) {
        if (this.policyRuleIds == null) {
            this.policyRuleIds = new ArrayList<>();
        }
        policyRuleIdsSetter.accept(this.policyRuleIds);
        return this;
    }

    /**
     * **参数解释：** 策略和规则id数组，关联防护策略与对应的规则集合 **约束限制：** 不涉及 **取值范围：** 不涉及 **默认取值：** 不涉及
     * @return policyRuleIds
     */
    public List<PolicyRuleIdRequestBodyPolicyRuleIds> getPolicyRuleIds() {
        return policyRuleIds;
    }

    public void setPolicyRuleIds(List<PolicyRuleIdRequestBodyPolicyRuleIds> policyRuleIds) {
        this.policyRuleIds = policyRuleIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchUpdatePrivacyRuleRequestBody that = (BatchUpdatePrivacyRuleRequestBody) obj;
        return Objects.equals(this.url, that.url) && Objects.equals(this.category, that.category)
            && Objects.equals(this.index, that.index) && Objects.equals(this.description, that.description)
            && Objects.equals(this.policyRuleIds, that.policyRuleIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, category, index, description, policyRuleIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUpdatePrivacyRuleRequestBody {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    policyRuleIds: ").append(toIndentedString(policyRuleIds)).append("\n");
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
