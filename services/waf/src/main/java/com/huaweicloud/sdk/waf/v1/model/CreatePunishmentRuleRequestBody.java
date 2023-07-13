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
 * CreatePunishmentRuleRequestBody
 */
public class CreatePunishmentRuleRequestBody {

    /**
     * 攻击惩罚类别
     */
    public static final class CategoryEnum {

        /**
         * Enum LONG_IP_BLOCK for value: "long_ip_block"
         */
        public static final CategoryEnum LONG_IP_BLOCK = new CategoryEnum("long_ip_block");

        /**
         * Enum LONG_COOKIE_BLOCK for value: "long_cookie_block"
         */
        public static final CategoryEnum LONG_COOKIE_BLOCK = new CategoryEnum("long_cookie_block");

        /**
         * Enum LONG_PARAMS_BLOCK for value: "long_params_block"
         */
        public static final CategoryEnum LONG_PARAMS_BLOCK = new CategoryEnum("long_params_block");

        /**
         * Enum SHORT_IP_BLOCK for value: "short_ip_block"
         */
        public static final CategoryEnum SHORT_IP_BLOCK = new CategoryEnum("short_ip_block");

        /**
         * Enum SHORT_COOKIE_BLOCK for value: "short_cookie_block"
         */
        public static final CategoryEnum SHORT_COOKIE_BLOCK = new CategoryEnum("short_cookie_block");

        /**
         * Enum SHORT_PARAMS_BLOCK for value: "short_params_block"
         */
        public static final CategoryEnum SHORT_PARAMS_BLOCK = new CategoryEnum("short_params_block");

        private static final Map<String, CategoryEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CategoryEnum> createStaticFields() {
            Map<String, CategoryEnum> map = new HashMap<>();
            map.put("long_ip_block", LONG_IP_BLOCK);
            map.put("long_cookie_block", LONG_COOKIE_BLOCK);
            map.put("long_params_block", LONG_PARAMS_BLOCK);
            map.put("short_ip_block", SHORT_IP_BLOCK);
            map.put("short_cookie_block", SHORT_COOKIE_BLOCK);
            map.put("short_params_block", SHORT_PARAMS_BLOCK);
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
    @JsonProperty(value = "block_time")

    private Integer blockTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public CreatePunishmentRuleRequestBody withCategory(CategoryEnum category) {
        this.category = category;
        return this;
    }

    /**
     * 攻击惩罚类别
     * @return category
     */
    public CategoryEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryEnum category) {
        this.category = category;
    }

    public CreatePunishmentRuleRequestBody withBlockTime(Integer blockTime) {
        this.blockTime = blockTime;
        return this;
    }

    /**
     * 拦截时间，如果选择前缀为long的攻击惩罚类别，则block_time时长范围设置为301-1800;选择前缀为short的攻击惩罚类别，则block_time时长范围为0-300之间
     * @return blockTime
     */
    public Integer getBlockTime() {
        return blockTime;
    }

    public void setBlockTime(Integer blockTime) {
        this.blockTime = blockTime;
    }

    public CreatePunishmentRuleRequestBody withDescription(String description) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreatePunishmentRuleRequestBody that = (CreatePunishmentRuleRequestBody) obj;
        return Objects.equals(this.category, that.category) && Objects.equals(this.blockTime, that.blockTime)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, blockTime, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePunishmentRuleRequestBody {\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    blockTime: ").append(toIndentedString(blockTime)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
