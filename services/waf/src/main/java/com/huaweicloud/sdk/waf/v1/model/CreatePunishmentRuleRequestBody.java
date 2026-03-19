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
     * **参数解释：** 攻击惩罚类别 **约束限制：** 创建后不可修改，单个类别只能存在一个规则 **取值范围：**  - long_ip_block  - long_cookie_block  - long_params_block  - long_header_block  - short_ip_block  - short_cookie_block  - short_params_block  - short_header_block **默认取值：** 不涉及
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
         * Enum LONG_HEADER_BLOCK for value: "long_header_block"
         */
        public static final CategoryEnum LONG_HEADER_BLOCK = new CategoryEnum("long_header_block");

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

        /**
         * Enum SHORT_HEADER_BLOCK for value: "short_header_block"
         */
        public static final CategoryEnum SHORT_HEADER_BLOCK = new CategoryEnum("short_header_block");

        private static final Map<String, CategoryEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, CategoryEnum> createStaticFields() {
            Map<String, CategoryEnum> map = new HashMap<>();
            map.put("long_ip_block", LONG_IP_BLOCK);
            map.put("long_cookie_block", LONG_COOKIE_BLOCK);
            map.put("long_params_block", LONG_PARAMS_BLOCK);
            map.put("long_header_block", LONG_HEADER_BLOCK);
            map.put("short_ip_block", SHORT_IP_BLOCK);
            map.put("short_cookie_block", SHORT_COOKIE_BLOCK);
            map.put("short_params_block", SHORT_PARAMS_BLOCK);
            map.put("short_header_block", SHORT_HEADER_BLOCK);
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

    /**
     * **参数解释：** 时间单位，会影响“拦截时间”参数的取值范围 **约束限制：** 不涉及 **取值范围：**  - SECOND  - MINUTE  - HOUR  - DAY  - MONTH **默认取值：** SECOND
     */
    public static final class TimeUnitEnum {

        /**
         * Enum SECOND for value: "SECOND"
         */
        public static final TimeUnitEnum SECOND = new TimeUnitEnum("SECOND");

        /**
         * Enum MINUTE for value: "MINUTE"
         */
        public static final TimeUnitEnum MINUTE = new TimeUnitEnum("MINUTE");

        /**
         * Enum HOUR for value: "HOUR"
         */
        public static final TimeUnitEnum HOUR = new TimeUnitEnum("HOUR");

        /**
         * Enum DAY for value: "DAY"
         */
        public static final TimeUnitEnum DAY = new TimeUnitEnum("DAY");

        /**
         * Enum MONTH for value: "MONTH"
         */
        public static final TimeUnitEnum MONTH = new TimeUnitEnum("MONTH");

        private static final Map<String, TimeUnitEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TimeUnitEnum> createStaticFields() {
            Map<String, TimeUnitEnum> map = new HashMap<>();
            map.put("SECOND", SECOND);
            map.put("MINUTE", MINUTE);
            map.put("HOUR", HOUR);
            map.put("DAY", DAY);
            map.put("MONTH", MONTH);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TimeUnitEnum(String value) {
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
        public static TimeUnitEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TimeUnitEnum(value));
        }

        public static TimeUnitEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TimeUnitEnum) {
                return this.value.equals(((TimeUnitEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_unit")

    private TimeUnitEnum timeUnit;

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
     * **参数解释：** 攻击惩罚类别 **约束限制：** 创建后不可修改，单个类别只能存在一个规则 **取值范围：**  - long_ip_block  - long_cookie_block  - long_params_block  - long_header_block  - short_ip_block  - short_cookie_block  - short_params_block  - short_header_block **默认取值：** 不涉及
     * @return category
     */
    public CategoryEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryEnum category) {
        this.category = category;
    }

    public CreatePunishmentRuleRequestBody withTimeUnit(TimeUnitEnum timeUnit) {
        this.timeUnit = timeUnit;
        return this;
    }

    /**
     * **参数解释：** 时间单位，会影响“拦截时间”参数的取值范围 **约束限制：** 不涉及 **取值范围：**  - SECOND  - MINUTE  - HOUR  - DAY  - MONTH **默认取值：** SECOND
     * @return timeUnit
     */
    public TimeUnitEnum getTimeUnit() {
        return timeUnit;
    }

    public void setTimeUnit(TimeUnitEnum timeUnit) {
        this.timeUnit = timeUnit;
    }

    public CreatePunishmentRuleRequestBody withBlockTime(Integer blockTime) {
        this.blockTime = blockTime;
        return this;
    }

    /**
     * **参数解释：** 拦截时间 **约束限制：** 取值范围取决于惩罚类别和时间单位 **取值范围：** - short_xxx   - SECOND  [1, 300] - long_xxx   - SECOND [301, 7776000]   - MINUTE [6, 129600]   - HOUR [1, 2160]   - DAY [1, 90]   - MONTH [1, 3] **默认取值：** 不涉及
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
        return Objects.equals(this.category, that.category) && Objects.equals(this.timeUnit, that.timeUnit)
            && Objects.equals(this.blockTime, that.blockTime) && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, timeUnit, blockTime, description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePunishmentRuleRequestBody {\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    timeUnit: ").append(toIndentedString(timeUnit)).append("\n");
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
