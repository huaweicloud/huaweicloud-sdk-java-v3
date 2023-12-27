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
 * 开播风险警告
 */
public class LiveWarningItem {

    /**
     * 告警类型。 - TOO_LESSS_SCRIPT_ITEMS：段落（话术）数量太少。 - TOO_SHORT_SCRIPT_TIME：段落（话术）总时长太短。 - TOO_LESS_DANMAKU_RULES： 弹幕互动规则太少。 - RANDOM_PLAY_CLOSED: 随机播放开关关闭。 - ROTATION_MODEL_CLOSED: 主播轮转未配置。
     */
    public static final class WarningTypeEnum {

        /**
         * Enum TOO_LESSS_SCRIPT_ITEMS for value: "TOO_LESSS_SCRIPT_ITEMS"
         */
        public static final WarningTypeEnum TOO_LESSS_SCRIPT_ITEMS = new WarningTypeEnum("TOO_LESSS_SCRIPT_ITEMS");

        /**
         * Enum TOO_SHORT_SCRIPT_TIME for value: "TOO_SHORT_SCRIPT_TIME"
         */
        public static final WarningTypeEnum TOO_SHORT_SCRIPT_TIME = new WarningTypeEnum("TOO_SHORT_SCRIPT_TIME");

        /**
         * Enum TOO_LESS_DANMAKU_RULES for value: "TOO_LESS_DANMAKU_RULES"
         */
        public static final WarningTypeEnum TOO_LESS_DANMAKU_RULES = new WarningTypeEnum("TOO_LESS_DANMAKU_RULES");

        /**
         * Enum RANDOM_PLAY_CLOSED for value: "RANDOM_PLAY_CLOSED"
         */
        public static final WarningTypeEnum RANDOM_PLAY_CLOSED = new WarningTypeEnum("RANDOM_PLAY_CLOSED");

        /**
         * Enum ROTATION_MODEL_CLOSED for value: "ROTATION_MODEL_CLOSED"
         */
        public static final WarningTypeEnum ROTATION_MODEL_CLOSED = new WarningTypeEnum("ROTATION_MODEL_CLOSED");

        private static final Map<String, WarningTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, WarningTypeEnum> createStaticFields() {
            Map<String, WarningTypeEnum> map = new HashMap<>();
            map.put("TOO_LESSS_SCRIPT_ITEMS", TOO_LESSS_SCRIPT_ITEMS);
            map.put("TOO_SHORT_SCRIPT_TIME", TOO_SHORT_SCRIPT_TIME);
            map.put("TOO_LESS_DANMAKU_RULES", TOO_LESS_DANMAKU_RULES);
            map.put("RANDOM_PLAY_CLOSED", RANDOM_PLAY_CLOSED);
            map.put("ROTATION_MODEL_CLOSED", ROTATION_MODEL_CLOSED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        WarningTypeEnum(String value) {
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
        public static WarningTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new WarningTypeEnum(value));
        }

        public static WarningTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof WarningTypeEnum) {
                return this.value.equals(((WarningTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "warning_type")

    private WarningTypeEnum warningType;

    public LiveWarningItem withWarningType(WarningTypeEnum warningType) {
        this.warningType = warningType;
        return this;
    }

    /**
     * 告警类型。 - TOO_LESSS_SCRIPT_ITEMS：段落（话术）数量太少。 - TOO_SHORT_SCRIPT_TIME：段落（话术）总时长太短。 - TOO_LESS_DANMAKU_RULES： 弹幕互动规则太少。 - RANDOM_PLAY_CLOSED: 随机播放开关关闭。 - ROTATION_MODEL_CLOSED: 主播轮转未配置。
     * @return warningType
     */
    public WarningTypeEnum getWarningType() {
        return warningType;
    }

    public void setWarningType(WarningTypeEnum warningType) {
        this.warningType = warningType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LiveWarningItem that = (LiveWarningItem) obj;
        return Objects.equals(this.warningType, that.warningType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(warningType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LiveWarningItem {\n");
        sb.append("    warningType: ").append(toIndentedString(warningType)).append("\n");
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
