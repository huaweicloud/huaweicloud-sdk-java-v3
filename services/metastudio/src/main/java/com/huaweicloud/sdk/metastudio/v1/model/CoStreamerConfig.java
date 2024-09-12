package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 助播配置
 */
public class CoStreamerConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "voice_config")

    private VoiceConfig voiceConfig;

    /**
     * **参数解释**： 助播出声时主播行为设置。 **约束限制**： 不涉及 **取值范围**： * SILENCE：静默 * VOLUME_DOWN：音量降低  **默认取值**： 不涉及。
     */
    public static final class StreamerActionEnum {

        /**
         * Enum SILENCE for value: "SILENCE"
         */
        public static final StreamerActionEnum SILENCE = new StreamerActionEnum("SILENCE");

        /**
         * Enum VOLUME_DOWN for value: "VOLUME_DOWN"
         */
        public static final StreamerActionEnum VOLUME_DOWN = new StreamerActionEnum("VOLUME_DOWN");

        private static final Map<String, StreamerActionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, StreamerActionEnum> createStaticFields() {
            Map<String, StreamerActionEnum> map = new HashMap<>();
            map.put("SILENCE", SILENCE);
            map.put("VOLUME_DOWN", VOLUME_DOWN);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        StreamerActionEnum(String value) {
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
        public static StreamerActionEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new StreamerActionEnum(value));
        }

        public static StreamerActionEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof StreamerActionEnum) {
                return this.value.equals(((StreamerActionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "streamer_action")

    private StreamerActionEnum streamerAction;

    public CoStreamerConfig withVoiceConfig(VoiceConfig voiceConfig) {
        this.voiceConfig = voiceConfig;
        return this;
    }

    public CoStreamerConfig withVoiceConfig(Consumer<VoiceConfig> voiceConfigSetter) {
        if (this.voiceConfig == null) {
            this.voiceConfig = new VoiceConfig();
            voiceConfigSetter.accept(this.voiceConfig);
        }

        return this;
    }

    /**
     * Get voiceConfig
     * @return voiceConfig
     */
    public VoiceConfig getVoiceConfig() {
        return voiceConfig;
    }

    public void setVoiceConfig(VoiceConfig voiceConfig) {
        this.voiceConfig = voiceConfig;
    }

    public CoStreamerConfig withStreamerAction(StreamerActionEnum streamerAction) {
        this.streamerAction = streamerAction;
        return this;
    }

    /**
     * **参数解释**： 助播出声时主播行为设置。 **约束限制**： 不涉及 **取值范围**： * SILENCE：静默 * VOLUME_DOWN：音量降低  **默认取值**： 不涉及。
     * @return streamerAction
     */
    public StreamerActionEnum getStreamerAction() {
        return streamerAction;
    }

    public void setStreamerAction(StreamerActionEnum streamerAction) {
        this.streamerAction = streamerAction;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CoStreamerConfig that = (CoStreamerConfig) obj;
        return Objects.equals(this.voiceConfig, that.voiceConfig)
            && Objects.equals(this.streamerAction, that.streamerAction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(voiceConfig, streamerAction);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoStreamerConfig {\n");
        sb.append("    voiceConfig: ").append(toIndentedString(voiceConfig)).append("\n");
        sb.append("    streamerAction: ").append(toIndentedString(streamerAction)).append("\n");
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
