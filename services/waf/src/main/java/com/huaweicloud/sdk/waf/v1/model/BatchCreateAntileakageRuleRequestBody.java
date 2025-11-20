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
 * BatchCreateAntileakageRuleRequestBody
 */
public class BatchCreateAntileakageRuleRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    /**
     * 类别（响应码：code，敏感信息：sensitive）
     */
    public static final class CategoryEnum {

        /**
         * Enum CODE for value: "code"
         */
        public static final CategoryEnum CODE = new CategoryEnum("code");

        /**
         * Enum SENSITIVE for value: "sensitive"
         */
        public static final CategoryEnum SENSITIVE = new CategoryEnum("sensitive");

        private static final Map<String, CategoryEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CategoryEnum> createStaticFields() {
            Map<String, CategoryEnum> map = new HashMap<>();
            map.put("code", CODE);
            map.put("sensitive", SENSITIVE);
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
    @JsonProperty(value = "contents")

    private List<String> contents = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private LeakageListInfoAction action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "policy_ids")

    private List<String> policyIds = null;

    public BatchCreateAntileakageRuleRequestBody withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 规则应用的url
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public BatchCreateAntileakageRuleRequestBody withCategory(CategoryEnum category) {
        this.category = category;
        return this;
    }

    /**
     * 类别（响应码：code，敏感信息：sensitive）
     * @return category
     */
    public CategoryEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryEnum category) {
        this.category = category;
    }

    public BatchCreateAntileakageRuleRequestBody withContents(List<String> contents) {
        this.contents = contents;
        return this;
    }

    public BatchCreateAntileakageRuleRequestBody addContentsItem(String contentsItem) {
        if (this.contents == null) {
            this.contents = new ArrayList<>();
        }
        this.contents.add(contentsItem);
        return this;
    }

    public BatchCreateAntileakageRuleRequestBody withContents(Consumer<List<String>> contentsSetter) {
        if (this.contents == null) {
            this.contents = new ArrayList<>();
        }
        contentsSetter.accept(this.contents);
        return this;
    }

    /**
     * 规则内容（http状态码：400 、401、402 、 403 、404 、 405 、500 、501 、502 、503、 504 、507；手机：phone、身份证号：id_card、邮箱：email）
     * @return contents
     */
    public List<String> getContents() {
        return contents;
    }

    public void setContents(List<String> contents) {
        this.contents = contents;
    }

    public BatchCreateAntileakageRuleRequestBody withAction(LeakageListInfoAction action) {
        this.action = action;
        return this;
    }

    public BatchCreateAntileakageRuleRequestBody withAction(Consumer<LeakageListInfoAction> actionSetter) {
        if (this.action == null) {
            this.action = new LeakageListInfoAction();
            actionSetter.accept(this.action);
        }

        return this;
    }

    /**
     * Get action
     * @return action
     */
    public LeakageListInfoAction getAction() {
        return action;
    }

    public void setAction(LeakageListInfoAction action) {
        this.action = action;
    }

    public BatchCreateAntileakageRuleRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 规则描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BatchCreateAntileakageRuleRequestBody withPolicyIds(List<String> policyIds) {
        this.policyIds = policyIds;
        return this;
    }

    public BatchCreateAntileakageRuleRequestBody addPolicyIdsItem(String policyIdsItem) {
        if (this.policyIds == null) {
            this.policyIds = new ArrayList<>();
        }
        this.policyIds.add(policyIdsItem);
        return this;
    }

    public BatchCreateAntileakageRuleRequestBody withPolicyIds(Consumer<List<String>> policyIdsSetter) {
        if (this.policyIds == null) {
            this.policyIds = new ArrayList<>();
        }
        policyIdsSetter.accept(this.policyIds);
        return this;
    }

    /**
     * 添加规则的策略id列表。策略id从\"查询防护策略列表\"(ListPolicy)接口获取，多个策略之间用“,”隔开
     * @return policyIds
     */
    public List<String> getPolicyIds() {
        return policyIds;
    }

    public void setPolicyIds(List<String> policyIds) {
        this.policyIds = policyIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchCreateAntileakageRuleRequestBody that = (BatchCreateAntileakageRuleRequestBody) obj;
        return Objects.equals(this.url, that.url) && Objects.equals(this.category, that.category)
            && Objects.equals(this.contents, that.contents) && Objects.equals(this.action, that.action)
            && Objects.equals(this.description, that.description) && Objects.equals(this.policyIds, that.policyIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, category, contents, action, description, policyIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateAntileakageRuleRequestBody {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    contents: ").append(toIndentedString(contents)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    policyIds: ").append(toIndentedString(policyIds)).append("\n");
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
