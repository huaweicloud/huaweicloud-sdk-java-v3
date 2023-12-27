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
 * ShootScriptDetail
 */
public class ShootScriptDetail {

    /**
     * 脚本类型，即视频制作的驱动方式。默认TEXT * TEXT: 文本驱动，即通过TTS合成语音 * AUDIO: 语音驱动
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
    @JsonProperty(value = "animation_config")

    private List<AnimationConfig> animationConfig = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "background_config")

    private List<BackgroundConfigInfo> backgroundConfig = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "emotion_config")

    private List<EmotionConfig> emotionConfig = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "layer_config")

    private List<LayerConfig> layerConfig = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "thumbnail_url")

    private String thumbnailUrl;

    public ShootScriptDetail withScriptType(ScriptTypeEnum scriptType) {
        this.scriptType = scriptType;
        return this;
    }

    /**
     * 脚本类型，即视频制作的驱动方式。默认TEXT * TEXT: 文本驱动，即通过TTS合成语音 * AUDIO: 语音驱动
     * @return scriptType
     */
    public ScriptTypeEnum getScriptType() {
        return scriptType;
    }

    public void setScriptType(ScriptTypeEnum scriptType) {
        this.scriptType = scriptType;
    }

    public ShootScriptDetail withTextConfig(TextConfig textConfig) {
        this.textConfig = textConfig;
        return this;
    }

    public ShootScriptDetail withTextConfig(Consumer<TextConfig> textConfigSetter) {
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

    public ShootScriptDetail withAnimationConfig(List<AnimationConfig> animationConfig) {
        this.animationConfig = animationConfig;
        return this;
    }

    public ShootScriptDetail addAnimationConfigItem(AnimationConfig animationConfigItem) {
        if (this.animationConfig == null) {
            this.animationConfig = new ArrayList<>();
        }
        this.animationConfig.add(animationConfigItem);
        return this;
    }

    public ShootScriptDetail withAnimationConfig(Consumer<List<AnimationConfig>> animationConfigSetter) {
        if (this.animationConfig == null) {
            this.animationConfig = new ArrayList<>();
        }
        animationConfigSetter.accept(this.animationConfig);
        return this;
    }

    /**
     * 动作配置。 > * 推荐使用text_config中插入动作标签，不配置animation_config。 > * 使用animation_config方式配置动作，在整个讲解过程中动作循环播放。 > * 分身数字人视频制作时此参数不生效。
     * @return animationConfig
     */
    public List<AnimationConfig> getAnimationConfig() {
        return animationConfig;
    }

    public void setAnimationConfig(List<AnimationConfig> animationConfig) {
        this.animationConfig = animationConfig;
    }

    public ShootScriptDetail withBackgroundConfig(List<BackgroundConfigInfo> backgroundConfig) {
        this.backgroundConfig = backgroundConfig;
        return this;
    }

    public ShootScriptDetail addBackgroundConfigItem(BackgroundConfigInfo backgroundConfigItem) {
        if (this.backgroundConfig == null) {
            this.backgroundConfig = new ArrayList<>();
        }
        this.backgroundConfig.add(backgroundConfigItem);
        return this;
    }

    public ShootScriptDetail withBackgroundConfig(Consumer<List<BackgroundConfigInfo>> backgroundConfigSetter) {
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

    public ShootScriptDetail withEmotionConfig(List<EmotionConfig> emotionConfig) {
        this.emotionConfig = emotionConfig;
        return this;
    }

    public ShootScriptDetail addEmotionConfigItem(EmotionConfig emotionConfigItem) {
        if (this.emotionConfig == null) {
            this.emotionConfig = new ArrayList<>();
        }
        this.emotionConfig.add(emotionConfigItem);
        return this;
    }

    public ShootScriptDetail withEmotionConfig(Consumer<List<EmotionConfig>> emotionConfigSetter) {
        if (this.emotionConfig == null) {
            this.emotionConfig = new ArrayList<>();
        }
        emotionConfigSetter.accept(this.emotionConfig);
        return this;
    }

    /**
     * 情感标签配置。  > * 分身数字人视频制作时此参数不生效。  > * 推荐在text_config中插入情感标签，此参数将被废弃。
     * @return emotionConfig
     */
    public List<EmotionConfig> getEmotionConfig() {
        return emotionConfig;
    }

    public void setEmotionConfig(List<EmotionConfig> emotionConfig) {
        this.emotionConfig = emotionConfig;
    }

    public ShootScriptDetail withLayerConfig(List<LayerConfig> layerConfig) {
        this.layerConfig = layerConfig;
        return this;
    }

    public ShootScriptDetail addLayerConfigItem(LayerConfig layerConfigItem) {
        if (this.layerConfig == null) {
            this.layerConfig = new ArrayList<>();
        }
        this.layerConfig.add(layerConfigItem);
        return this;
    }

    public ShootScriptDetail withLayerConfig(Consumer<List<LayerConfig>> layerConfigSetter) {
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

    public ShootScriptDetail withThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
        return this;
    }

    /**
     * 剧本场景缩略图url。
     * @return thumbnailUrl
     */
    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShootScriptDetail that = (ShootScriptDetail) obj;
        return Objects.equals(this.scriptType, that.scriptType) && Objects.equals(this.textConfig, that.textConfig)
            && Objects.equals(this.animationConfig, that.animationConfig)
            && Objects.equals(this.backgroundConfig, that.backgroundConfig)
            && Objects.equals(this.emotionConfig, that.emotionConfig)
            && Objects.equals(this.layerConfig, that.layerConfig)
            && Objects.equals(this.thumbnailUrl, that.thumbnailUrl);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(scriptType, textConfig, animationConfig, backgroundConfig, emotionConfig, layerConfig, thumbnailUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShootScriptDetail {\n");
        sb.append("    scriptType: ").append(toIndentedString(scriptType)).append("\n");
        sb.append("    textConfig: ").append(toIndentedString(textConfig)).append("\n");
        sb.append("    animationConfig: ").append(toIndentedString(animationConfig)).append("\n");
        sb.append("    backgroundConfig: ").append(toIndentedString(backgroundConfig)).append("\n");
        sb.append("    emotionConfig: ").append(toIndentedString(emotionConfig)).append("\n");
        sb.append("    layerConfig: ").append(toIndentedString(layerConfig)).append("\n");
        sb.append("    thumbnailUrl: ").append(toIndentedString(thumbnailUrl)).append("\n");
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
