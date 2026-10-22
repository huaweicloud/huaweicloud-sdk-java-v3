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
 * UpdateBotMRuleActionRequestBody
 */
public class UpdateBotMRuleActionRequestBody {

    /**
     * 防护动作对应的数字
     */
    public static final class DefenseActionEnum {

        /**
         * Enum NUMBER_101 for value: 101
         */
        public static final DefenseActionEnum NUMBER_101 = new DefenseActionEnum(101);

        /**
         * Enum NUMBER_102 for value: 102
         */
        public static final DefenseActionEnum NUMBER_102 = new DefenseActionEnum(102);

        /**
         * Enum NUMBER_103 for value: 103
         */
        public static final DefenseActionEnum NUMBER_103 = new DefenseActionEnum(103);

        /**
         * Enum NUMBER_104 for value: 104
         */
        public static final DefenseActionEnum NUMBER_104 = new DefenseActionEnum(104);

        /**
         * Enum NUMBER_201 for value: 201
         */
        public static final DefenseActionEnum NUMBER_201 = new DefenseActionEnum(201);

        /**
         * Enum NUMBER_202 for value: 202
         */
        public static final DefenseActionEnum NUMBER_202 = new DefenseActionEnum(202);

        /**
         * Enum NUMBER_301 for value: 301
         */
        public static final DefenseActionEnum NUMBER_301 = new DefenseActionEnum(301);

        private static final Map<Integer, DefenseActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<Integer, DefenseActionEnum> createStaticFields() {
            Map<Integer, DefenseActionEnum> map = new HashMap<>();
            map.put(101, NUMBER_101);
            map.put(102, NUMBER_102);
            map.put(103, NUMBER_103);
            map.put(104, NUMBER_104);
            map.put(201, NUMBER_201);
            map.put(202, NUMBER_202);
            map.put(301, NUMBER_301);
            return Collections.unmodifiableMap(map);
        }

        private Integer value;

        DefenseActionEnum(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static DefenseActionEnum fromValue(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new DefenseActionEnum(value));
        }

        public static DefenseActionEnum valueOf(Integer value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof DefenseActionEnum) {
                return this.value.equals(((DefenseActionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "defense_action")

    private DefenseActionEnum defenseAction;

    public UpdateBotMRuleActionRequestBody withDefenseAction(DefenseActionEnum defenseAction) {
        this.defenseAction = defenseAction;
        return this;
    }

    /**
     * 防护动作对应的数字
     * @return defenseAction
     */
    public DefenseActionEnum getDefenseAction() {
        return defenseAction;
    }

    public void setDefenseAction(DefenseActionEnum defenseAction) {
        this.defenseAction = defenseAction;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateBotMRuleActionRequestBody that = (UpdateBotMRuleActionRequestBody) obj;
        return Objects.equals(this.defenseAction, that.defenseAction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(defenseAction);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateBotMRuleActionRequestBody {\n");
        sb.append("    defenseAction: ").append(toIndentedString(defenseAction)).append("\n");
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
