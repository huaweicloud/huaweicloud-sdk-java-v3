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
 * 直播使用互动配置信息
 */
public class LiveRoomInteractionConfig {

    /**
     * 播放类型。 - APPEND：追加，放置在场景播放队列尾部 - INSERT： 插入，在两个音频文件，或者文本句末添加。 - PLAY_NOW : 立即插入，收到指令后，立即播放，无需等待句末。
     */
    public static final class PlayTypeEnum {

        /**
         * Enum APPEND for value: "APPEND"
         */
        public static final PlayTypeEnum APPEND = new PlayTypeEnum("APPEND");

        /**
         * Enum INSERT for value: "INSERT"
         */
        public static final PlayTypeEnum INSERT = new PlayTypeEnum("INSERT");

        /**
         * Enum PLAY_NOW for value: "PLAY_NOW"
         */
        public static final PlayTypeEnum PLAY_NOW = new PlayTypeEnum("PLAY_NOW");

        private static final Map<String, PlayTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PlayTypeEnum> createStaticFields() {
            Map<String, PlayTypeEnum> map = new HashMap<>();
            map.put("APPEND", APPEND);
            map.put("INSERT", INSERT);
            map.put("PLAY_NOW", PLAY_NOW);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PlayTypeEnum(String value) {
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
        public static PlayTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PlayTypeEnum(value));
        }

        public static PlayTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PlayTypeEnum) {
                return this.value.equals(((PlayTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "play_type")

    private PlayTypeEnum playType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ignore_current_sentence")

    private Boolean ignoreCurrentSentence;

    public LiveRoomInteractionConfig withPlayType(PlayTypeEnum playType) {
        this.playType = playType;
        return this;
    }

    /**
     * 播放类型。 - APPEND：追加，放置在场景播放队列尾部 - INSERT： 插入，在两个音频文件，或者文本句末添加。 - PLAY_NOW : 立即插入，收到指令后，立即播放，无需等待句末。
     * @return playType
     */
    public PlayTypeEnum getPlayType() {
        return playType;
    }

    public void setPlayType(PlayTypeEnum playType) {
        this.playType = playType;
    }

    public LiveRoomInteractionConfig withIgnoreCurrentSentence(Boolean ignoreCurrentSentence) {
        this.ignoreCurrentSentence = ignoreCurrentSentence;
        return this;
    }

    /**
     * 忽略互动回复中断句子后半句不再播放。用于立即中断场景。默认不忽略。
     * @return ignoreCurrentSentence
     */
    public Boolean getIgnoreCurrentSentence() {
        return ignoreCurrentSentence;
    }

    public void setIgnoreCurrentSentence(Boolean ignoreCurrentSentence) {
        this.ignoreCurrentSentence = ignoreCurrentSentence;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LiveRoomInteractionConfig that = (LiveRoomInteractionConfig) obj;
        return Objects.equals(this.playType, that.playType)
            && Objects.equals(this.ignoreCurrentSentence, that.ignoreCurrentSentence);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playType, ignoreCurrentSentence);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LiveRoomInteractionConfig {\n");
        sb.append("    playType: ").append(toIndentedString(playType)).append("\n");
        sb.append("    ignoreCurrentSentence: ").append(toIndentedString(ignoreCurrentSentence)).append("\n");
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
