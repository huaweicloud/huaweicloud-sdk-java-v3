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
 * 视频制作脚本信息。
 */
public class VideoScriptsCreateInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_name")

    private String scriptName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_description")

    private String scriptDescription;

    /**
     * **参数解释**： 横竖屏类型。 **约束限制**： 不涉及。 **取值范围**： * LANDSCAPE：横屏。 * VERTICAL：竖屏。
     */
    public static final class ViewModeEnum {

        /**
         * Enum LANDSCAPE for value: "LANDSCAPE"
         */
        public static final ViewModeEnum LANDSCAPE = new ViewModeEnum("LANDSCAPE");

        /**
         * Enum VERTICAL for value: "VERTICAL"
         */
        public static final ViewModeEnum VERTICAL = new ViewModeEnum("VERTICAL");

        private static final Map<String, ViewModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ViewModeEnum> createStaticFields() {
            Map<String, ViewModeEnum> map = new HashMap<>();
            map.put("LANDSCAPE", LANDSCAPE);
            map.put("VERTICAL", VERTICAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ViewModeEnum(String value) {
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
        public static ViewModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ViewModeEnum(value));
        }

        public static ViewModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ViewModeEnum) {
                return this.value.equals(((ViewModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "view_mode")

    private ViewModeEnum viewMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_asset_id")

    private String modelAssetId;

    /**
     * **参数解释**： 数字人模型类型。 **约束限制**： 不涉及 **取值范围**： * HUMAN_MODEL_2D：分身数字人 * HUMAN_MODEL_3D：3D数字人  **默认取值**： 不涉及
     */
    public static final class ModelAssetTypeEnum {

        /**
         * Enum HUMAN_MODEL_2D for value: "HUMAN_MODEL_2D"
         */
        public static final ModelAssetTypeEnum HUMAN_MODEL_2D = new ModelAssetTypeEnum("HUMAN_MODEL_2D");

        /**
         * Enum HUMAN_MODEL_3D for value: "HUMAN_MODEL_3D"
         */
        public static final ModelAssetTypeEnum HUMAN_MODEL_3D = new ModelAssetTypeEnum("HUMAN_MODEL_3D");

        private static final Map<String, ModelAssetTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ModelAssetTypeEnum> createStaticFields() {
            Map<String, ModelAssetTypeEnum> map = new HashMap<>();
            map.put("HUMAN_MODEL_2D", HUMAN_MODEL_2D);
            map.put("HUMAN_MODEL_3D", HUMAN_MODEL_3D);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ModelAssetTypeEnum(String value) {
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
        public static ModelAssetTypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ModelAssetTypeEnum(value));
        }

        public static ModelAssetTypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ModelAssetTypeEnum) {
                return this.value.equals(((ModelAssetTypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_asset_type")

    private ModelAssetTypeEnum modelAssetType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "voice_config")

    private VoiceConfig voiceConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_config")

    private VideoConfig videoConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scene_asset_id")

    private String sceneAssetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priv_data")

    private String privData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "background_music_config")

    private BackgroundMusicConfig backgroundMusicConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "review_config")

    private ReviewConfig reviewConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_files")

    private ShootScriptAudioFiles audioFiles;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_config")

    private ActionConfig actionConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shoot_scripts")

    private List<ShootScriptItem> shootScripts = null;

    public VideoScriptsCreateInfo withScriptName(String scriptName) {
        this.scriptName = scriptName;
        return this;
    }

    /**
     * **参数解释**： 剧本名称。 **约束限制**： 不涉及。 **取值范围**： 只能使用中英文字符，字符长度1-256位。 **默认取值**： 不涉及。
     * @return scriptName
     */
    public String getScriptName() {
        return scriptName;
    }

    public void setScriptName(String scriptName) {
        this.scriptName = scriptName;
    }

    public VideoScriptsCreateInfo withScriptDescription(String scriptDescription) {
        this.scriptDescription = scriptDescription;
        return this;
    }

    /**
     * **参数解释**： 剧本描述。 **约束限制**： 不涉及。 **取值范围**： 字符长度0-1024位。 **默认取值**： 不涉及。
     * @return scriptDescription
     */
    public String getScriptDescription() {
        return scriptDescription;
    }

    public void setScriptDescription(String scriptDescription) {
        this.scriptDescription = scriptDescription;
    }

    public VideoScriptsCreateInfo withViewMode(ViewModeEnum viewMode) {
        this.viewMode = viewMode;
        return this;
    }

    /**
     * **参数解释**： 横竖屏类型。 **约束限制**： 不涉及。 **取值范围**： * LANDSCAPE：横屏。 * VERTICAL：竖屏。
     * @return viewMode
     */
    public ViewModeEnum getViewMode() {
        return viewMode;
    }

    public void setViewMode(ViewModeEnum viewMode) {
        this.viewMode = viewMode;
    }

    public VideoScriptsCreateInfo withModelAssetId(String modelAssetId) {
        this.modelAssetId = modelAssetId;
        return this;
    }

    /**
     * **参数解释**： 数字人模型资产ID。 **约束限制**： 不涉及 **取值范围**： 字符长度0-64位。 **默认取值**： 不涉及
     * @return modelAssetId
     */
    public String getModelAssetId() {
        return modelAssetId;
    }

    public void setModelAssetId(String modelAssetId) {
        this.modelAssetId = modelAssetId;
    }

    public VideoScriptsCreateInfo withModelAssetType(ModelAssetTypeEnum modelAssetType) {
        this.modelAssetType = modelAssetType;
        return this;
    }

    /**
     * **参数解释**： 数字人模型类型。 **约束限制**： 不涉及 **取值范围**： * HUMAN_MODEL_2D：分身数字人 * HUMAN_MODEL_3D：3D数字人  **默认取值**： 不涉及
     * @return modelAssetType
     */
    public ModelAssetTypeEnum getModelAssetType() {
        return modelAssetType;
    }

    public void setModelAssetType(ModelAssetTypeEnum modelAssetType) {
        this.modelAssetType = modelAssetType;
    }

    public VideoScriptsCreateInfo withVoiceConfig(VoiceConfig voiceConfig) {
        this.voiceConfig = voiceConfig;
        return this;
    }

    public VideoScriptsCreateInfo withVoiceConfig(Consumer<VoiceConfig> voiceConfigSetter) {
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

    public VideoScriptsCreateInfo withVideoConfig(VideoConfig videoConfig) {
        this.videoConfig = videoConfig;
        return this;
    }

    public VideoScriptsCreateInfo withVideoConfig(Consumer<VideoConfig> videoConfigSetter) {
        if (this.videoConfig == null) {
            this.videoConfig = new VideoConfig();
            videoConfigSetter.accept(this.videoConfig);
        }

        return this;
    }

    /**
     * Get videoConfig
     * @return videoConfig
     */
    public VideoConfig getVideoConfig() {
        return videoConfig;
    }

    public void setVideoConfig(VideoConfig videoConfig) {
        this.videoConfig = videoConfig;
    }

    public VideoScriptsCreateInfo withSceneAssetId(String sceneAssetId) {
        this.sceneAssetId = sceneAssetId;
        return this;
    }

    /**
     * **参数解释**： 场景资产ID。 **约束限制**： 分身数字人视频制作不需要填写该参数。 **取值范围**： 字符长度0-64位 **默认取值**： 不涉及
     * @return sceneAssetId
     */
    public String getSceneAssetId() {
        return sceneAssetId;
    }

    public void setSceneAssetId(String sceneAssetId) {
        this.sceneAssetId = sceneAssetId;
    }

    public VideoScriptsCreateInfo withPrivData(String privData) {
        this.privData = privData;
        return this;
    }

    /**
     * **参数解释**： 私有数据，用户填写，原样带回。 **约束限制**： 不涉及 **取值范围**： 字符长度0-8192位 **默认取值**： 不涉及
     * @return privData
     */
    public String getPrivData() {
        return privData;
    }

    public void setPrivData(String privData) {
        this.privData = privData;
    }

    public VideoScriptsCreateInfo withBackgroundMusicConfig(BackgroundMusicConfig backgroundMusicConfig) {
        this.backgroundMusicConfig = backgroundMusicConfig;
        return this;
    }

    public VideoScriptsCreateInfo withBackgroundMusicConfig(
        Consumer<BackgroundMusicConfig> backgroundMusicConfigSetter) {
        if (this.backgroundMusicConfig == null) {
            this.backgroundMusicConfig = new BackgroundMusicConfig();
            backgroundMusicConfigSetter.accept(this.backgroundMusicConfig);
        }

        return this;
    }

    /**
     * Get backgroundMusicConfig
     * @return backgroundMusicConfig
     */
    public BackgroundMusicConfig getBackgroundMusicConfig() {
        return backgroundMusicConfig;
    }

    public void setBackgroundMusicConfig(BackgroundMusicConfig backgroundMusicConfig) {
        this.backgroundMusicConfig = backgroundMusicConfig;
    }

    public VideoScriptsCreateInfo withReviewConfig(ReviewConfig reviewConfig) {
        this.reviewConfig = reviewConfig;
        return this;
    }

    public VideoScriptsCreateInfo withReviewConfig(Consumer<ReviewConfig> reviewConfigSetter) {
        if (this.reviewConfig == null) {
            this.reviewConfig = new ReviewConfig();
            reviewConfigSetter.accept(this.reviewConfig);
        }

        return this;
    }

    /**
     * Get reviewConfig
     * @return reviewConfig
     */
    public ReviewConfig getReviewConfig() {
        return reviewConfig;
    }

    public void setReviewConfig(ReviewConfig reviewConfig) {
        this.reviewConfig = reviewConfig;
    }

    public VideoScriptsCreateInfo withAudioFiles(ShootScriptAudioFiles audioFiles) {
        this.audioFiles = audioFiles;
        return this;
    }

    public VideoScriptsCreateInfo withAudioFiles(Consumer<ShootScriptAudioFiles> audioFilesSetter) {
        if (this.audioFiles == null) {
            this.audioFiles = new ShootScriptAudioFiles();
            audioFilesSetter.accept(this.audioFiles);
        }

        return this;
    }

    /**
     * Get audioFiles
     * @return audioFiles
     */
    public ShootScriptAudioFiles getAudioFiles() {
        return audioFiles;
    }

    public void setAudioFiles(ShootScriptAudioFiles audioFiles) {
        this.audioFiles = audioFiles;
    }

    public VideoScriptsCreateInfo withActionConfig(ActionConfig actionConfig) {
        this.actionConfig = actionConfig;
        return this;
    }

    public VideoScriptsCreateInfo withActionConfig(Consumer<ActionConfig> actionConfigSetter) {
        if (this.actionConfig == null) {
            this.actionConfig = new ActionConfig();
            actionConfigSetter.accept(this.actionConfig);
        }

        return this;
    }

    /**
     * Get actionConfig
     * @return actionConfig
     */
    public ActionConfig getActionConfig() {
        return actionConfig;
    }

    public void setActionConfig(ActionConfig actionConfig) {
        this.actionConfig = actionConfig;
    }

    public VideoScriptsCreateInfo withShootScripts(List<ShootScriptItem> shootScripts) {
        this.shootScripts = shootScripts;
        return this;
    }

    public VideoScriptsCreateInfo addShootScriptsItem(ShootScriptItem shootScriptsItem) {
        if (this.shootScripts == null) {
            this.shootScripts = new ArrayList<>();
        }
        this.shootScripts.add(shootScriptsItem);
        return this;
    }

    public VideoScriptsCreateInfo withShootScripts(Consumer<List<ShootScriptItem>> shootScriptsSetter) {
        if (this.shootScripts == null) {
            this.shootScripts = new ArrayList<>();
        }
        shootScriptsSetter.accept(this.shootScripts);
        return this;
    }

    /**
     * 拍摄脚本列表。
     * @return shootScripts
     */
    public List<ShootScriptItem> getShootScripts() {
        return shootScripts;
    }

    public void setShootScripts(List<ShootScriptItem> shootScripts) {
        this.shootScripts = shootScripts;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VideoScriptsCreateInfo that = (VideoScriptsCreateInfo) obj;
        return Objects.equals(this.scriptName, that.scriptName)
            && Objects.equals(this.scriptDescription, that.scriptDescription)
            && Objects.equals(this.viewMode, that.viewMode) && Objects.equals(this.modelAssetId, that.modelAssetId)
            && Objects.equals(this.modelAssetType, that.modelAssetType)
            && Objects.equals(this.voiceConfig, that.voiceConfig) && Objects.equals(this.videoConfig, that.videoConfig)
            && Objects.equals(this.sceneAssetId, that.sceneAssetId) && Objects.equals(this.privData, that.privData)
            && Objects.equals(this.backgroundMusicConfig, that.backgroundMusicConfig)
            && Objects.equals(this.reviewConfig, that.reviewConfig) && Objects.equals(this.audioFiles, that.audioFiles)
            && Objects.equals(this.actionConfig, that.actionConfig)
            && Objects.equals(this.shootScripts, that.shootScripts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scriptName,
            scriptDescription,
            viewMode,
            modelAssetId,
            modelAssetType,
            voiceConfig,
            videoConfig,
            sceneAssetId,
            privData,
            backgroundMusicConfig,
            reviewConfig,
            audioFiles,
            actionConfig,
            shootScripts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoScriptsCreateInfo {\n");
        sb.append("    scriptName: ").append(toIndentedString(scriptName)).append("\n");
        sb.append("    scriptDescription: ").append(toIndentedString(scriptDescription)).append("\n");
        sb.append("    viewMode: ").append(toIndentedString(viewMode)).append("\n");
        sb.append("    modelAssetId: ").append(toIndentedString(modelAssetId)).append("\n");
        sb.append("    modelAssetType: ").append(toIndentedString(modelAssetType)).append("\n");
        sb.append("    voiceConfig: ").append(toIndentedString(voiceConfig)).append("\n");
        sb.append("    videoConfig: ").append(toIndentedString(videoConfig)).append("\n");
        sb.append("    sceneAssetId: ").append(toIndentedString(sceneAssetId)).append("\n");
        sb.append("    privData: ").append(toIndentedString(privData)).append("\n");
        sb.append("    backgroundMusicConfig: ").append(toIndentedString(backgroundMusicConfig)).append("\n");
        sb.append("    reviewConfig: ").append(toIndentedString(reviewConfig)).append("\n");
        sb.append("    audioFiles: ").append(toIndentedString(audioFiles)).append("\n");
        sb.append("    actionConfig: ").append(toIndentedString(actionConfig)).append("\n");
        sb.append("    shootScripts: ").append(toIndentedString(shootScripts)).append("\n");
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
