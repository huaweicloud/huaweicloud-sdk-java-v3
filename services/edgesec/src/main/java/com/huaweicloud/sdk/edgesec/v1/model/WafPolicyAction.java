package com.huaweicloud.sdk.edgesec.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 防护动作
 */
public class WafPolicyAction {

    /**
     * web基础防护动作（log为仅记录、block为拦截）
     */
    public static final class CategoryEnum {

        /**
         * Enum BLOCK for value: "block"
         */
        public static final CategoryEnum BLOCK = new CategoryEnum("block");

        /**
         * Enum LOG for value: "log"
         */
        public static final CategoryEnum LOG = new CategoryEnum("log");

        private static final Map<String, CategoryEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CategoryEnum> createStaticFields() {
            Map<String, CategoryEnum> map = new HashMap<>();
            map.put("block", BLOCK);
            map.put("log", LOG);
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
    @JsonProperty(value = "followed_action_id")

    private String followedActionId;

    public WafPolicyAction withCategory(CategoryEnum category) {
        this.category = category;
        return this;
    }

    /**
     * web基础防护动作（log为仅记录、block为拦截）
     * @return category
     */
    public CategoryEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryEnum category) {
        this.category = category;
    }

    public WafPolicyAction withFollowedActionId(String followedActionId) {
        this.followedActionId = followedActionId;
        return this;
    }

    /**
     * 攻击惩罚规则ID
     * @return followedActionId
     */
    public String getFollowedActionId() {
        return followedActionId;
    }

    public void setFollowedActionId(String followedActionId) {
        this.followedActionId = followedActionId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WafPolicyAction that = (WafPolicyAction) obj;
        return Objects.equals(this.category, that.category)
            && Objects.equals(this.followedActionId, that.followedActionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, followedActionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WafPolicyAction {\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    followedActionId: ").append(toIndentedString(followedActionId)).append("\n");
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
