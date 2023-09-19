package com.huaweicloud.sdk.metastudio.v1.model;

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
 * 触发器处理
 */
public class TriggerProcess {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time_window")

    private Integer timeWindow;

    /**
     * 回复类型。 SYSTEM_REPLY：系统自动回复设置的话术
     */
    public static final class ReplyModeEnum {

        /**
         * Enum SYSTEM_REPLY for value: "SYSTEM_REPLY"
         */
        public static final ReplyModeEnum SYSTEM_REPLY = new ReplyModeEnum("SYSTEM_REPLY");

        private static final Map<String, ReplyModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ReplyModeEnum> createStaticFields() {
            Map<String, ReplyModeEnum> map = new HashMap<>();
            map.put("SYSTEM_REPLY", SYSTEM_REPLY);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ReplyModeEnum(String value) {
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
        public static ReplyModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ReplyModeEnum(value));
        }

        public static ReplyModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ReplyModeEnum) {
                return this.value.equals(((ReplyModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reply_mode")

    private ReplyModeEnum replyMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reply_texts")

    private List<String> replyTexts = null;

    /**
     * 回复次序 - RANDOM：随机 - ORDER：顺序循环
     */
    public static final class ReplyOrderEnum {

        /**
         * Enum RANDOM for value: "RANDOM"
         */
        public static final ReplyOrderEnum RANDOM = new ReplyOrderEnum("RANDOM");

        /**
         * Enum ORDER for value: "ORDER"
         */
        public static final ReplyOrderEnum ORDER = new ReplyOrderEnum("ORDER");

        private static final Map<String, ReplyOrderEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ReplyOrderEnum> createStaticFields() {
            Map<String, ReplyOrderEnum> map = new HashMap<>();
            map.put("RANDOM", RANDOM);
            map.put("ORDER", ORDER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ReplyOrderEnum(String value) {
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
        public static ReplyOrderEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ReplyOrderEnum(value));
        }

        public static ReplyOrderEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ReplyOrderEnum) {
                return this.value.equals(((ReplyOrderEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reply_order")

    private ReplyOrderEnum replyOrder;

    public TriggerProcess withTimeWindow(Integer timeWindow) {
        this.timeWindow = timeWindow;
        return this;
    }

    /**
     * 处理抑制时长。单位秒。  -1 表示整场直播 0 表示无抑制，每次都触发
     * minimum: -1
     * maximum: 7200
     * @return timeWindow
     */
    public Integer getTimeWindow() {
        return timeWindow;
    }

    public void setTimeWindow(Integer timeWindow) {
        this.timeWindow = timeWindow;
    }

    public TriggerProcess withReplyMode(ReplyModeEnum replyMode) {
        this.replyMode = replyMode;
        return this;
    }

    /**
     * 回复类型。 SYSTEM_REPLY：系统自动回复设置的话术
     * @return replyMode
     */
    public ReplyModeEnum getReplyMode() {
        return replyMode;
    }

    public void setReplyMode(ReplyModeEnum replyMode) {
        this.replyMode = replyMode;
    }

    public TriggerProcess withReplyTexts(List<String> replyTexts) {
        this.replyTexts = replyTexts;
        return this;
    }

    public TriggerProcess addReplyTextsItem(String replyTextsItem) {
        if (this.replyTexts == null) {
            this.replyTexts = new ArrayList<>();
        }
        this.replyTexts.add(replyTextsItem);
        return this;
    }

    public TriggerProcess withReplyTexts(Consumer<List<String>> replyTextsSetter) {
        if (this.replyTexts == null) {
            this.replyTexts = new ArrayList<>();
        }
        replyTextsSetter.accept(this.replyTexts);
        return this;
    }

    /**
     * 回复话术集
     * @return replyTexts
     */
    public List<String> getReplyTexts() {
        return replyTexts;
    }

    public void setReplyTexts(List<String> replyTexts) {
        this.replyTexts = replyTexts;
    }

    public TriggerProcess withReplyOrder(ReplyOrderEnum replyOrder) {
        this.replyOrder = replyOrder;
        return this;
    }

    /**
     * 回复次序 - RANDOM：随机 - ORDER：顺序循环
     * @return replyOrder
     */
    public ReplyOrderEnum getReplyOrder() {
        return replyOrder;
    }

    public void setReplyOrder(ReplyOrderEnum replyOrder) {
        this.replyOrder = replyOrder;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TriggerProcess that = (TriggerProcess) obj;
        return Objects.equals(this.timeWindow, that.timeWindow) && Objects.equals(this.replyMode, that.replyMode)
            && Objects.equals(this.replyTexts, that.replyTexts) && Objects.equals(this.replyOrder, that.replyOrder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timeWindow, replyMode, replyTexts, replyOrder);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TriggerProcess {\n");
        sb.append("    timeWindow: ").append(toIndentedString(timeWindow)).append("\n");
        sb.append("    replyMode: ").append(toIndentedString(replyMode)).append("\n");
        sb.append("    replyTexts: ").append(toIndentedString(replyTexts)).append("\n");
        sb.append("    replyOrder: ").append(toIndentedString(replyOrder)).append("\n");
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
