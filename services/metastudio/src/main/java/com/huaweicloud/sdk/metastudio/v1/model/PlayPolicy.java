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
 * 剧本播放策略
 */
public class PlayPolicy {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repeat_count")

    private Integer repeatCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_play_script")

    private Boolean autoPlayScript;

    /**
     * **参数解释**： 驱动方式。 **约束限制**： 不涉及。 **取值范围**： * TEXT：文本驱动，即通过TTS合成语音。 * AUDIO：语音驱动。 * NO_PRESET：无预置剧本，人工控制模式。
     */
    public static final class PlayModeEnum {

        /**
         * Enum TEXT for value: "TEXT"
         */
        public static final PlayModeEnum TEXT = new PlayModeEnum("TEXT");

        /**
         * Enum AUDIO for value: "AUDIO"
         */
        public static final PlayModeEnum AUDIO = new PlayModeEnum("AUDIO");

        /**
         * Enum NO_PRESET for value: "NO_PRESET"
         */
        public static final PlayModeEnum NO_PRESET = new PlayModeEnum("NO_PRESET");

        private static final Map<String, PlayModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PlayModeEnum> createStaticFields() {
            Map<String, PlayModeEnum> map = new HashMap<>();
            map.put("TEXT", TEXT);
            map.put("AUDIO", AUDIO);
            map.put("NO_PRESET", NO_PRESET);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PlayModeEnum(String value) {
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
        public static PlayModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PlayModeEnum(value));
        }

        public static PlayModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PlayModeEnum) {
                return this.value.equals(((PlayModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "play_mode")

    private PlayModeEnum playMode;

    /**
     * **参数解释**： 随机播报模式。 **约束限制**： 从第二轮播报开始随机。 **取值范围**： * NONE：不启动随机播报。 * SCENE：按场景随机播报。场景内段落按顺序播报。 * SCRIPT_ITEM：按段落随机播报。场景按顺序播报。 * SCENE_AND_SCRIPT_ITEM：场景和段落都随机播报。
     */
    public static final class RandomPlayModeEnum {

        /**
         * Enum NONE for value: "NONE"
         */
        public static final RandomPlayModeEnum NONE = new RandomPlayModeEnum("NONE");

        /**
         * Enum SCENE for value: "SCENE"
         */
        public static final RandomPlayModeEnum SCENE = new RandomPlayModeEnum("SCENE");

        /**
         * Enum SCRIPT_ITEM for value: "SCRIPT_ITEM"
         */
        public static final RandomPlayModeEnum SCRIPT_ITEM = new RandomPlayModeEnum("SCRIPT_ITEM");

        /**
         * Enum SCENE_AND_SCRIPT_ITEM for value: "SCENE_AND_SCRIPT_ITEM"
         */
        public static final RandomPlayModeEnum SCENE_AND_SCRIPT_ITEM = new RandomPlayModeEnum("SCENE_AND_SCRIPT_ITEM");

        private static final Map<String, RandomPlayModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, RandomPlayModeEnum> createStaticFields() {
            Map<String, RandomPlayModeEnum> map = new HashMap<>();
            map.put("NONE", NONE);
            map.put("SCENE", SCENE);
            map.put("SCRIPT_ITEM", SCRIPT_ITEM);
            map.put("SCENE_AND_SCRIPT_ITEM", SCENE_AND_SCRIPT_ITEM);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        RandomPlayModeEnum(String value) {
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
        public static RandomPlayModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new RandomPlayModeEnum(value));
        }

        public static RandomPlayModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof RandomPlayModeEnum) {
                return this.value.equals(((RandomPlayModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "random_play_mode")

    private RandomPlayModeEnum randomPlayMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "need_independent_capture_client")

    private Boolean needIndependentCaptureClient;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "live_exit_config")

    private LiveExitConfig liveExitConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_rewrite_delay")

    private Boolean isRewriteDelay;

    public PlayPolicy withRepeatCount(Integer repeatCount) {
        this.repeatCount = repeatCount;
        return this;
    }

    /**
     * **参数解释**： 剧本重复播放次数。 * -1：表示持续重复，直至人工停止。 * 0：表示不重复，仅执行一次。 * 其他值n：实际运行次数为n+1次。  **约束限制**： 不涉及。
     * minimum: -1
     * maximum: 100
     * @return repeatCount
     */
    public Integer getRepeatCount() {
        return repeatCount;
    }

    public void setRepeatCount(Integer repeatCount) {
        this.repeatCount = repeatCount;
    }

    public PlayPolicy withAutoPlayScript(Boolean autoPlayScript) {
        this.autoPlayScript = autoPlayScript;
        return this;
    }

    /**
     * **参数解释**： 是否自动播放剧本。 **约束限制**： 不涉及。 **取值范围**： * true：服务完成任务初始化后，自动播放剧本。 * false：服务完成任务初始化后，等待信号后再开始播放剧本。
     * @return autoPlayScript
     */
    public Boolean getAutoPlayScript() {
        return autoPlayScript;
    }

    public void setAutoPlayScript(Boolean autoPlayScript) {
        this.autoPlayScript = autoPlayScript;
    }

    public PlayPolicy withPlayMode(PlayModeEnum playMode) {
        this.playMode = playMode;
        return this;
    }

    /**
     * **参数解释**： 驱动方式。 **约束限制**： 不涉及。 **取值范围**： * TEXT：文本驱动，即通过TTS合成语音。 * AUDIO：语音驱动。 * NO_PRESET：无预置剧本，人工控制模式。
     * @return playMode
     */
    public PlayModeEnum getPlayMode() {
        return playMode;
    }

    public void setPlayMode(PlayModeEnum playMode) {
        this.playMode = playMode;
    }

    public PlayPolicy withRandomPlayMode(RandomPlayModeEnum randomPlayMode) {
        this.randomPlayMode = randomPlayMode;
        return this;
    }

    /**
     * **参数解释**： 随机播报模式。 **约束限制**： 从第二轮播报开始随机。 **取值范围**： * NONE：不启动随机播报。 * SCENE：按场景随机播报。场景内段落按顺序播报。 * SCRIPT_ITEM：按段落随机播报。场景按顺序播报。 * SCENE_AND_SCRIPT_ITEM：场景和段落都随机播报。
     * @return randomPlayMode
     */
    public RandomPlayModeEnum getRandomPlayMode() {
        return randomPlayMode;
    }

    public void setRandomPlayMode(RandomPlayModeEnum randomPlayMode) {
        this.randomPlayMode = randomPlayMode;
    }

    public PlayPolicy withNeedIndependentCaptureClient(Boolean needIndependentCaptureClient) {
        this.needIndependentCaptureClient = needIndependentCaptureClient;
        return this;
    }

    /**
     * **参数解释**： 是否需要独立采集端。用于客户端播放与命令分离场景。 **约束限制**： 不涉及。 **取值范围**： * true：分配CAPTURE、PLAYER两个RTC用户。 * false：仅分配PLAYER一个RTC用户。
     * @return needIndependentCaptureClient
     */
    public Boolean getNeedIndependentCaptureClient() {
        return needIndependentCaptureClient;
    }

    public void setNeedIndependentCaptureClient(Boolean needIndependentCaptureClient) {
        this.needIndependentCaptureClient = needIndependentCaptureClient;
    }

    public PlayPolicy withLiveExitConfig(LiveExitConfig liveExitConfig) {
        this.liveExitConfig = liveExitConfig;
        return this;
    }

    public PlayPolicy withLiveExitConfig(Consumer<LiveExitConfig> liveExitConfigSetter) {
        if (this.liveExitConfig == null) {
            this.liveExitConfig = new LiveExitConfig();
            liveExitConfigSetter.accept(this.liveExitConfig);
        }

        return this;
    }

    /**
     * Get liveExitConfig
     * @return liveExitConfig
     */
    public LiveExitConfig getLiveExitConfig() {
        return liveExitConfig;
    }

    public void setLiveExitConfig(LiveExitConfig liveExitConfig) {
        this.liveExitConfig = liveExitConfig;
    }

    public PlayPolicy withIsRewriteDelay(Boolean isRewriteDelay) {
        this.isRewriteDelay = isRewriteDelay;
        return this;
    }

    /**
     * **参数解释**： 动态编辑未播放剧本是否需要下一轮生效。 **约束限制**： 不涉及。 **取值范围**： * true：下一轮生效。 * false：马上生效。 **默认取值**： false
     * @return isRewriteDelay
     */
    public Boolean getIsRewriteDelay() {
        return isRewriteDelay;
    }

    public void setIsRewriteDelay(Boolean isRewriteDelay) {
        this.isRewriteDelay = isRewriteDelay;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PlayPolicy that = (PlayPolicy) obj;
        return Objects.equals(this.repeatCount, that.repeatCount)
            && Objects.equals(this.autoPlayScript, that.autoPlayScript) && Objects.equals(this.playMode, that.playMode)
            && Objects.equals(this.randomPlayMode, that.randomPlayMode)
            && Objects.equals(this.needIndependentCaptureClient, that.needIndependentCaptureClient)
            && Objects.equals(this.liveExitConfig, that.liveExitConfig)
            && Objects.equals(this.isRewriteDelay, that.isRewriteDelay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repeatCount,
            autoPlayScript,
            playMode,
            randomPlayMode,
            needIndependentCaptureClient,
            liveExitConfig,
            isRewriteDelay);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PlayPolicy {\n");
        sb.append("    repeatCount: ").append(toIndentedString(repeatCount)).append("\n");
        sb.append("    autoPlayScript: ").append(toIndentedString(autoPlayScript)).append("\n");
        sb.append("    playMode: ").append(toIndentedString(playMode)).append("\n");
        sb.append("    randomPlayMode: ").append(toIndentedString(randomPlayMode)).append("\n");
        sb.append("    needIndependentCaptureClient: ")
            .append(toIndentedString(needIndependentCaptureClient))
            .append("\n");
        sb.append("    liveExitConfig: ").append(toIndentedString(liveExitConfig)).append("\n");
        sb.append("    isRewriteDelay: ").append(toIndentedString(isRewriteDelay)).append("\n");
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
