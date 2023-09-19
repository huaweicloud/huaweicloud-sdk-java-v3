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
 * 情感标签配置。
 */
public class EmotionConfig {

    /**
     * 情感标签配置。 * HAPPY：开心 * SAD：悲伤 * CALM：平静 * ANGER：愤怒  默认HAPPY。
     */
    public static final class EmotionEnum {

        /**
         * Enum HAPPY for value: "HAPPY"
         */
        public static final EmotionEnum HAPPY = new EmotionEnum("HAPPY");

        /**
         * Enum SAD for value: "SAD"
         */
        public static final EmotionEnum SAD = new EmotionEnum("SAD");

        /**
         * Enum CALM for value: "CALM"
         */
        public static final EmotionEnum CALM = new EmotionEnum("CALM");

        /**
         * Enum ANGER for value: "ANGER"
         */
        public static final EmotionEnum ANGER = new EmotionEnum("ANGER");

        private static final Map<String, EmotionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EmotionEnum> createStaticFields() {
            Map<String, EmotionEnum> map = new HashMap<>();
            map.put("HAPPY", HAPPY);
            map.put("SAD", SAD);
            map.put("CALM", CALM);
            map.put("ANGER", ANGER);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EmotionEnum(String value) {
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
        public static EmotionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new EmotionEnum(value));
        }

        public static EmotionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EmotionEnum) {
                return this.value.equals(((EmotionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "emotion")

    private EmotionEnum emotion;

    public EmotionConfig withEmotion(EmotionEnum emotion) {
        this.emotion = emotion;
        return this;
    }

    /**
     * 情感标签配置。 * HAPPY：开心 * SAD：悲伤 * CALM：平静 * ANGER：愤怒  默认HAPPY。
     * @return emotion
     */
    public EmotionEnum getEmotion() {
        return emotion;
    }

    public void setEmotion(EmotionEnum emotion) {
        this.emotion = emotion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        EmotionConfig that = (EmotionConfig) obj;
        return Objects.equals(this.emotion, that.emotion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(emotion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EmotionConfig {\n");
        sb.append("    emotion: ").append(toIndentedString(emotion)).append("\n");
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
