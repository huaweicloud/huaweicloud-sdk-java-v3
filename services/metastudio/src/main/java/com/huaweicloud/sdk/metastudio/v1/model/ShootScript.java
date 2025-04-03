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
 * 表演脚本。
 */
public class ShootScript {

    /**
     * **参数解释**： 脚本类型，即视频制作的驱动方式 **约束限制**： 不涉及 **取值范围** * TEXT: 文本驱动，即通过TTS合成语音 * AUDIO: 语音驱动
     */
    public static final class ScriptTypeEnum {

        /**
         * Enum TEXT for value: "TEXT"
         */
        public static final ScriptTypeEnum TEXT = new ScriptTypeEnum("TEXT");

        /**
         * Enum AUDIO for value: "AUDIO"
         */
        public static final ScriptTypeEnum AUDIO = new ScriptTypeEnum("AUDIO");

        private static final Map<String, ScriptTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ScriptTypeEnum> createStaticFields() {
            Map<String, ScriptTypeEnum> map = new HashMap<>();
            map.put("TEXT", TEXT);
            map.put("AUDIO", AUDIO);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ScriptTypeEnum(String value) {
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
        public static ScriptTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ScriptTypeEnum(value));
        }

        public static ScriptTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ScriptTypeEnum) {
                return this.value.equals(((ScriptTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_type")

    private ScriptTypeEnum scriptType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "text_config")

    private TextConfig textConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_duration")

    private Float audioDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_drive_action_config")

    private List<AudioDriveActionConfig> audioDriveActionConfig = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_drive_file_external_url")

    private String audioDriveFileExternalUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "background_config")

    private List<BackgroundConfigInfo> backgroundConfig = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "layer_config")

    private List<LayerConfig> layerConfig = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_config")

    private AudioInfo audioConfig;

    public ShootScript withScriptType(ScriptTypeEnum scriptType) {
        this.scriptType = scriptType;
        return this;
    }

    /**
     * **参数解释**： 脚本类型，即视频制作的驱动方式 **约束限制**： 不涉及 **取值范围** * TEXT: 文本驱动，即通过TTS合成语音 * AUDIO: 语音驱动
     * @return scriptType
     */
    public ScriptTypeEnum getScriptType() {
        return scriptType;
    }

    public void setScriptType(ScriptTypeEnum scriptType) {
        this.scriptType = scriptType;
    }

    public ShootScript withTextConfig(TextConfig textConfig) {
        this.textConfig = textConfig;
        return this;
    }

    public ShootScript withTextConfig(Consumer<TextConfig> textConfigSetter) {
        if (this.textConfig == null) {
            this.textConfig = new TextConfig();
            textConfigSetter.accept(this.textConfig);
        }

        return this;
    }

    /**
     * Get textConfig
     * @return textConfig
     */
    public TextConfig getTextConfig() {
        return textConfig;
    }

    public void setTextConfig(TextConfig textConfig) {
        this.textConfig = textConfig;
    }

    public ShootScript withAudioDuration(Float audioDuration) {
        this.audioDuration = audioDuration;
        return this;
    }

    /**
     * 语音驱动时，音频时长，单位秒。 > * 创建剧本时此参数可以不设置，音频文件上传成功后，通过更新剧本接口设置 > * 查询剧本详情时，返回音频时长，用于预估视频时长
     * minimum: 0
     * maximum: 3.6E+4
     * @return audioDuration
     */
    public Float getAudioDuration() {
        return audioDuration;
    }

    public void setAudioDuration(Float audioDuration) {
        this.audioDuration = audioDuration;
    }

    public ShootScript withAudioDriveActionConfig(List<AudioDriveActionConfig> audioDriveActionConfig) {
        this.audioDriveActionConfig = audioDriveActionConfig;
        return this;
    }

    public ShootScript addAudioDriveActionConfigItem(AudioDriveActionConfig audioDriveActionConfigItem) {
        if (this.audioDriveActionConfig == null) {
            this.audioDriveActionConfig = new ArrayList<>();
        }
        this.audioDriveActionConfig.add(audioDriveActionConfigItem);
        return this;
    }

    public ShootScript withAudioDriveActionConfig(Consumer<List<AudioDriveActionConfig>> audioDriveActionConfigSetter) {
        if (this.audioDriveActionConfig == null) {
            this.audioDriveActionConfig = new ArrayList<>();
        }
        audioDriveActionConfigSetter.accept(this.audioDriveActionConfig);
        return this;
    }

    /**
     * 语音驱动时的动作配置。
     * @return audioDriveActionConfig
     */
    public List<AudioDriveActionConfig> getAudioDriveActionConfig() {
        return audioDriveActionConfig;
    }

    public void setAudioDriveActionConfig(List<AudioDriveActionConfig> audioDriveActionConfig) {
        this.audioDriveActionConfig = audioDriveActionConfig;
    }

    public ShootScript withAudioDriveFileExternalUrl(String audioDriveFileExternalUrl) {
        this.audioDriveFileExternalUrl = audioDriveFileExternalUrl;
        return this;
    }

    /**
     * 语音驱动音频文件外部下载URL。  > * 需要先申请开通白名单后，才允许通过外部URL的音频文件来驱动分身数字人视频。
     * @return audioDriveFileExternalUrl
     */
    public String getAudioDriveFileExternalUrl() {
        return audioDriveFileExternalUrl;
    }

    public void setAudioDriveFileExternalUrl(String audioDriveFileExternalUrl) {
        this.audioDriveFileExternalUrl = audioDriveFileExternalUrl;
    }

    public ShootScript withBackgroundConfig(List<BackgroundConfigInfo> backgroundConfig) {
        this.backgroundConfig = backgroundConfig;
        return this;
    }

    public ShootScript addBackgroundConfigItem(BackgroundConfigInfo backgroundConfigItem) {
        if (this.backgroundConfig == null) {
            this.backgroundConfig = new ArrayList<>();
        }
        this.backgroundConfig.add(backgroundConfigItem);
        return this;
    }

    public ShootScript withBackgroundConfig(Consumer<List<BackgroundConfigInfo>> backgroundConfigSetter) {
        if (this.backgroundConfig == null) {
            this.backgroundConfig = new ArrayList<>();
        }
        backgroundConfigSetter.accept(this.backgroundConfig);
        return this;
    }

    /**
     * 背景配置。
     * @return backgroundConfig
     */
    public List<BackgroundConfigInfo> getBackgroundConfig() {
        return backgroundConfig;
    }

    public void setBackgroundConfig(List<BackgroundConfigInfo> backgroundConfig) {
        this.backgroundConfig = backgroundConfig;
    }

    public ShootScript withLayerConfig(List<LayerConfig> layerConfig) {
        this.layerConfig = layerConfig;
        return this;
    }

    public ShootScript addLayerConfigItem(LayerConfig layerConfigItem) {
        if (this.layerConfig == null) {
            this.layerConfig = new ArrayList<>();
        }
        this.layerConfig.add(layerConfigItem);
        return this;
    }

    public ShootScript withLayerConfig(Consumer<List<LayerConfig>> layerConfigSetter) {
        if (this.layerConfig == null) {
            this.layerConfig = new ArrayList<>();
        }
        layerConfigSetter.accept(this.layerConfig);
        return this;
    }

    /**
     * 图层配置。
     * @return layerConfig
     */
    public List<LayerConfig> getLayerConfig() {
        return layerConfig;
    }

    public void setLayerConfig(List<LayerConfig> layerConfig) {
        this.layerConfig = layerConfig;
    }

    public ShootScript withAudioConfig(AudioInfo audioConfig) {
        this.audioConfig = audioConfig;
        return this;
    }

    public ShootScript withAudioConfig(Consumer<AudioInfo> audioConfigSetter) {
        if (this.audioConfig == null) {
            this.audioConfig = new AudioInfo();
            audioConfigSetter.accept(this.audioConfig);
        }

        return this;
    }

    /**
     * Get audioConfig
     * @return audioConfig
     */
    public AudioInfo getAudioConfig() {
        return audioConfig;
    }

    public void setAudioConfig(AudioInfo audioConfig) {
        this.audioConfig = audioConfig;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShootScript that = (ShootScript) obj;
        return Objects.equals(this.scriptType, that.scriptType) && Objects.equals(this.textConfig, that.textConfig)
            && Objects.equals(this.audioDuration, that.audioDuration)
            && Objects.equals(this.audioDriveActionConfig, that.audioDriveActionConfig)
            && Objects.equals(this.audioDriveFileExternalUrl, that.audioDriveFileExternalUrl)
            && Objects.equals(this.backgroundConfig, that.backgroundConfig)
            && Objects.equals(this.layerConfig, that.layerConfig) && Objects.equals(this.audioConfig, that.audioConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scriptType,
            textConfig,
            audioDuration,
            audioDriveActionConfig,
            audioDriveFileExternalUrl,
            backgroundConfig,
            layerConfig,
            audioConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShootScript {\n");
        sb.append("    scriptType: ").append(toIndentedString(scriptType)).append("\n");
        sb.append("    textConfig: ").append(toIndentedString(textConfig)).append("\n");
        sb.append("    audioDuration: ").append(toIndentedString(audioDuration)).append("\n");
        sb.append("    audioDriveActionConfig: ").append(toIndentedString(audioDriveActionConfig)).append("\n");
        sb.append("    audioDriveFileExternalUrl: ").append(toIndentedString(audioDriveFileExternalUrl)).append("\n");
        sb.append("    backgroundConfig: ").append(toIndentedString(backgroundConfig)).append("\n");
        sb.append("    layerConfig: ").append(toIndentedString(layerConfig)).append("\n");
        sb.append("    audioConfig: ").append(toIndentedString(audioConfig)).append("\n");
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
