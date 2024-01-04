package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * 标注的动作信息。
 */
public class ActionMarkItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_start_time")

    private String actionStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_end_time")

    private String actionEndTime;

    /**
     * 动作类型。 * SILENCE: 静默 * ACTION：动作
     */
    public static final class ActionTypeEnum {

        /**
         * Enum SILENCE for value: "SILENCE"
         */
        public static final ActionTypeEnum SILENCE = new ActionTypeEnum("SILENCE");

        /**
         * Enum ACTION for value: "ACTION"
         */
        public static final ActionTypeEnum ACTION = new ActionTypeEnum("ACTION");

        private static final Map<String, ActionTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ActionTypeEnum> createStaticFields() {
            Map<String, ActionTypeEnum> map = new HashMap<>();
            map.put("SILENCE", SILENCE);
            map.put("ACTION", ACTION);
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

    public ActionMarkItem withActionStartTime(String actionStartTime) {
        this.actionStartTime = actionStartTime;
        return this;
    }

    /**
     * 选取推理数据预处理视频起始时间。格式：“HH:MM:SS.mmm”。
     * @return actionStartTime
     */
    public String getActionStartTime() {
        return actionStartTime;
    }

    public void setActionStartTime(String actionStartTime) {
        this.actionStartTime = actionStartTime;
    }

    public ActionMarkItem withActionEndTime(String actionEndTime) {
        this.actionEndTime = actionEndTime;
        return this;
    }

    /**
     * 选取推理数据预处理视频结束时间。格式：“HH:MM:SS.mmm”。
     * @return actionEndTime
     */
    public String getActionEndTime() {
        return actionEndTime;
    }

    public void setActionEndTime(String actionEndTime) {
        this.actionEndTime = actionEndTime;
    }

    public ActionMarkItem withActionType(ActionTypeEnum actionType) {
        this.actionType = actionType;
        return this;
    }

    /**
     * 动作类型。 * SILENCE: 静默 * ACTION：动作
     * @return actionType
     */
    public ActionTypeEnum getActionType() {
        return actionType;
    }

    public void setActionType(ActionTypeEnum actionType) {
        this.actionType = actionType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ActionMarkItem that = (ActionMarkItem) obj;
        return Objects.equals(this.actionStartTime, that.actionStartTime)
            && Objects.equals(this.actionEndTime, that.actionEndTime)
            && Objects.equals(this.actionType, that.actionType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actionStartTime, actionEndTime, actionType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionMarkItem {\n");
        sb.append("    actionStartTime: ").append(toIndentedString(actionStartTime)).append("\n");
        sb.append("    actionEndTime: ").append(toIndentedString(actionEndTime)).append("\n");
        sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
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
