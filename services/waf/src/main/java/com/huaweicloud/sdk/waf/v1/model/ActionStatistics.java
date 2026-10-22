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
 * 处置动作统计数据
 */
public class ActionStatistics {

    /**
     * 处置动作类型
     */
    public static final class ActionTypeEnum {

        /**
         * Enum ALLOW for value: "ALLOW"
         */
        public static final ActionTypeEnum ALLOW = new ActionTypeEnum("ALLOW");

        /**
         * Enum BLOCK for value: "BLOCK"
         */
        public static final ActionTypeEnum BLOCK = new ActionTypeEnum("BLOCK");

        /**
         * Enum OBSERVE for value: "OBSERVE"
         */
        public static final ActionTypeEnum OBSERVE = new ActionTypeEnum("OBSERVE");

        /**
         * Enum MASK for value: "MASK"
         */
        public static final ActionTypeEnum MASK = new ActionTypeEnum("MASK");

        /**
         * Enum SAFE_ANSWER for value: "SAFE_ANSWER"
         */
        public static final ActionTypeEnum SAFE_ANSWER = new ActionTypeEnum("SAFE_ANSWER");

        private static final Map<String, ActionTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionTypeEnum> createStaticFields() {
            Map<String, ActionTypeEnum> map = new HashMap<>();
            map.put("ALLOW", ALLOW);
            map.put("BLOCK", BLOCK);
            map.put("OBSERVE", OBSERVE);
            map.put("MASK", MASK);
            map.put("SAFE_ANSWER", SAFE_ANSWER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ActionTypeEnum(String value) {
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
        public static ActionTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ActionTypeEnum(value));
        }

        public static ActionTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ActionTypeEnum) {
                return this.value.equals(((ActionTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_type")

    private ActionTypeEnum actionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    public ActionStatistics withActionType(ActionTypeEnum actionType) {
        this.actionType = actionType;
        return this;
    }

    /**
     * 处置动作类型
     * @return actionType
     */
    public ActionTypeEnum getActionType() {
        return actionType;
    }

    public void setActionType(ActionTypeEnum actionType) {
        this.actionType = actionType;
    }

    public ActionStatistics withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 数量
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ActionStatistics that = (ActionStatistics) obj;
        return Objects.equals(this.actionType, that.actionType) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actionType, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionStatistics {\n");
        sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
