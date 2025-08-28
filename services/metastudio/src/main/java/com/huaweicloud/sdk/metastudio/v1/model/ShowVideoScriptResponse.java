package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowVideoScriptResponse extends SdkResponse {

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
     * **参数解释**： 数字人模型类型。 **约束限制**： 不涉及 **取值范围**： * HUMAN_MODEL_2D：分身数字人  **默认取值**： 不涉及
     */
    public static final class ModelAssetTypeEnum {

        /**
         * Enum HUMAN_MODEL_2D for value: "HUMAN_MODEL_2D"
         */
        public static final ModelAssetTypeEnum HUMAN_MODEL_2D = new ModelAssetTypeEnum("HUMAN_MODEL_2D");

        private static final Map<String, ModelAssetTypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ModelAssetTypeEnum> createStaticFields() {
            Map<String, ModelAssetTypeEnum> map = new HashMap<>();
            map.put("HUMAN_MODEL_2D", HUMAN_MODEL_2D);
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

    private List<ShootScriptShowItem> shootScripts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_id")

    private String scriptId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_cover_url")

    private String scriptCoverUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public ShowVideoScriptResponse withScriptName(String scriptName) {
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

    public ShowVideoScriptResponse withScriptDescription(String scriptDescription) {
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

    public ShowVideoScriptResponse withViewMode(ViewModeEnum viewMode) {
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

    public ShowVideoScriptResponse withModelAssetId(String modelAssetId) {
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

    public ShowVideoScriptResponse withModelAssetType(ModelAssetTypeEnum modelAssetType) {
        this.modelAssetType = modelAssetType;
        return this;
    }

    /**
     * **参数解释**： 数字人模型类型。 **约束限制**： 不涉及 **取值范围**： * HUMAN_MODEL_2D：分身数字人  **默认取值**： 不涉及
     * @return modelAssetType
     */
    public ModelAssetTypeEnum getModelAssetType() {
        return modelAssetType;
    }

    public void setModelAssetType(ModelAssetTypeEnum modelAssetType) {
        this.modelAssetType = modelAssetType;
    }

    public ShowVideoScriptResponse withVoiceConfig(VoiceConfig voiceConfig) {
        this.voiceConfig = voiceConfig;
        return this;
    }

    public ShowVideoScriptResponse withVoiceConfig(Consumer<VoiceConfig> voiceConfigSetter) {
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

    public ShowVideoScriptResponse withVideoConfig(VideoConfig videoConfig) {
        this.videoConfig = videoConfig;
        return this;
    }

    public ShowVideoScriptResponse withVideoConfig(Consumer<VideoConfig> videoConfigSetter) {
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

    public ShowVideoScriptResponse withPrivData(String privData) {
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

    public ShowVideoScriptResponse withBackgroundMusicConfig(BackgroundMusicConfig backgroundMusicConfig) {
        this.backgroundMusicConfig = backgroundMusicConfig;
        return this;
    }

    public ShowVideoScriptResponse withBackgroundMusicConfig(
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

    public ShowVideoScriptResponse withReviewConfig(ReviewConfig reviewConfig) {
        this.reviewConfig = reviewConfig;
        return this;
    }

    public ShowVideoScriptResponse withReviewConfig(Consumer<ReviewConfig> reviewConfigSetter) {
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

    public ShowVideoScriptResponse withAudioFiles(ShootScriptAudioFiles audioFiles) {
        this.audioFiles = audioFiles;
        return this;
    }

    public ShowVideoScriptResponse withAudioFiles(Consumer<ShootScriptAudioFiles> audioFilesSetter) {
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

    public ShowVideoScriptResponse withActionConfig(ActionConfig actionConfig) {
        this.actionConfig = actionConfig;
        return this;
    }

    public ShowVideoScriptResponse withActionConfig(Consumer<ActionConfig> actionConfigSetter) {
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

    public ShowVideoScriptResponse withShootScripts(List<ShootScriptShowItem> shootScripts) {
        this.shootScripts = shootScripts;
        return this;
    }

    public ShowVideoScriptResponse addShootScriptsItem(ShootScriptShowItem shootScriptsItem) {
        if (this.shootScripts == null) {
            this.shootScripts = new ArrayList<>();
        }
        this.shootScripts.add(shootScriptsItem);
        return this;
    }

    public ShowVideoScriptResponse withShootScripts(Consumer<List<ShootScriptShowItem>> shootScriptsSetter) {
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
    public List<ShootScriptShowItem> getShootScripts() {
        return shootScripts;
    }

    public void setShootScripts(List<ShootScriptShowItem> shootScripts) {
        this.shootScripts = shootScripts;
    }

    public ShowVideoScriptResponse withScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }

    /**
     * 剧本ID。
     * @return scriptId
     */
    public String getScriptId() {
        return scriptId;
    }

    public void setScriptId(String scriptId) {
        this.scriptId = scriptId;
    }

    public ShowVideoScriptResponse withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间，格式遵循：RFC 3339 如\"2021-01-10T08:43:17Z\"。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ShowVideoScriptResponse withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间，格式遵循：RFC 3339 如\"2021-01-10T08:43:17Z\"。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public ShowVideoScriptResponse withScriptCoverUrl(String scriptCoverUrl) {
        this.scriptCoverUrl = scriptCoverUrl;
        return this;
    }

    /**
     * 剧本封面下载url。
     * @return scriptCoverUrl
     */
    public String getScriptCoverUrl() {
        return scriptCoverUrl;
    }

    public void setScriptCoverUrl(String scriptCoverUrl) {
        this.scriptCoverUrl = scriptCoverUrl;
    }

    public ShowVideoScriptResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowVideoScriptResponse that = (ShowVideoScriptResponse) obj;
        return Objects.equals(this.scriptName, that.scriptName)
            && Objects.equals(this.scriptDescription, that.scriptDescription)
            && Objects.equals(this.viewMode, that.viewMode) && Objects.equals(this.modelAssetId, that.modelAssetId)
            && Objects.equals(this.modelAssetType, that.modelAssetType)
            && Objects.equals(this.voiceConfig, that.voiceConfig) && Objects.equals(this.videoConfig, that.videoConfig)
            && Objects.equals(this.privData, that.privData)
            && Objects.equals(this.backgroundMusicConfig, that.backgroundMusicConfig)
            && Objects.equals(this.reviewConfig, that.reviewConfig) && Objects.equals(this.audioFiles, that.audioFiles)
            && Objects.equals(this.actionConfig, that.actionConfig)
            && Objects.equals(this.shootScripts, that.shootScripts) && Objects.equals(this.scriptId, that.scriptId)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.scriptCoverUrl, that.scriptCoverUrl)
            && Objects.equals(this.xRequestId, that.xRequestId);
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
            privData,
            backgroundMusicConfig,
            reviewConfig,
            audioFiles,
            actionConfig,
            shootScripts,
            scriptId,
            createTime,
            updateTime,
            scriptCoverUrl,
            xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowVideoScriptResponse {\n");
        sb.append("    scriptName: ").append(toIndentedString(scriptName)).append("\n");
        sb.append("    scriptDescription: ").append(toIndentedString(scriptDescription)).append("\n");
        sb.append("    viewMode: ").append(toIndentedString(viewMode)).append("\n");
        sb.append("    modelAssetId: ").append(toIndentedString(modelAssetId)).append("\n");
        sb.append("    modelAssetType: ").append(toIndentedString(modelAssetType)).append("\n");
        sb.append("    voiceConfig: ").append(toIndentedString(voiceConfig)).append("\n");
        sb.append("    videoConfig: ").append(toIndentedString(videoConfig)).append("\n");
        sb.append("    privData: ").append(toIndentedString(privData)).append("\n");
        sb.append("    backgroundMusicConfig: ").append(toIndentedString(backgroundMusicConfig)).append("\n");
        sb.append("    reviewConfig: ").append(toIndentedString(reviewConfig)).append("\n");
        sb.append("    audioFiles: ").append(toIndentedString(audioFiles)).append("\n");
        sb.append("    actionConfig: ").append(toIndentedString(actionConfig)).append("\n");
        sb.append("    shootScripts: ").append(toIndentedString(shootScripts)).append("\n");
        sb.append("    scriptId: ").append(toIndentedString(scriptId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    scriptCoverUrl: ").append(toIndentedString(scriptCoverUrl)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
