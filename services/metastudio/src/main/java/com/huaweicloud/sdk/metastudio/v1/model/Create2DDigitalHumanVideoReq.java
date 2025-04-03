package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Create2DDigitalHumanVideoReq
 */
public class Create2DDigitalHumanVideoReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_id")

    private String scriptId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_asset_id")

    private String modelAssetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "voice_config")

    private VoiceConfig voiceConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_config")

    private VideoConfig videoConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shoot_scripts")

    private List<ShootScriptItem> shootScripts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_asset_config")

    private OutputAssetConfig outputAssetConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "background_music_config")

    private BackgroundMusicConfig backgroundMusicConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "review_config")

    private ReviewConfig reviewConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "callback_config")

    private CallBackConfig callbackConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_config")

    private ActionConfig actionConfig;

    public Create2DDigitalHumanVideoReq withScriptId(String scriptId) {
        this.scriptId = scriptId;
        return this;
    }

    /**
     * 剧本ID。 > * 如果填写了script_id，model_asset_id、voice_config、scene_asset_id、video_config、shoot_scripts可以不填，以脚本中的配置为准。 > * 如果填写了script_id，并且同时也填写了model_asset_id、voice_config、scene_asset_id、video_config、shoot_scripts则以本接口中的配置为准。
     * @return scriptId
     */
    public String getScriptId() {
        return scriptId;
    }

    public void setScriptId(String scriptId) {
        this.scriptId = scriptId;
    }

    public Create2DDigitalHumanVideoReq withModelAssetId(String modelAssetId) {
        this.modelAssetId = modelAssetId;
        return this;
    }

    /**
     * 分身数字人模型资产ID，可以从资产库中查询。
     * @return modelAssetId
     */
    public String getModelAssetId() {
        return modelAssetId;
    }

    public void setModelAssetId(String modelAssetId) {
        this.modelAssetId = modelAssetId;
    }

    public Create2DDigitalHumanVideoReq withVoiceConfig(VoiceConfig voiceConfig) {
        this.voiceConfig = voiceConfig;
        return this;
    }

    public Create2DDigitalHumanVideoReq withVoiceConfig(Consumer<VoiceConfig> voiceConfigSetter) {
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

    public Create2DDigitalHumanVideoReq withVideoConfig(VideoConfig videoConfig) {
        this.videoConfig = videoConfig;
        return this;
    }

    public Create2DDigitalHumanVideoReq withVideoConfig(Consumer<VideoConfig> videoConfigSetter) {
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

    public Create2DDigitalHumanVideoReq withShootScripts(List<ShootScriptItem> shootScripts) {
        this.shootScripts = shootScripts;
        return this;
    }

    public Create2DDigitalHumanVideoReq addShootScriptsItem(ShootScriptItem shootScriptsItem) {
        if (this.shootScripts == null) {
            this.shootScripts = new ArrayList<>();
        }
        this.shootScripts.add(shootScriptsItem);
        return this;
    }

    public Create2DDigitalHumanVideoReq withShootScripts(Consumer<List<ShootScriptItem>> shootScriptsSetter) {
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

    public Create2DDigitalHumanVideoReq withOutputAssetConfig(OutputAssetConfig outputAssetConfig) {
        this.outputAssetConfig = outputAssetConfig;
        return this;
    }

    public Create2DDigitalHumanVideoReq withOutputAssetConfig(Consumer<OutputAssetConfig> outputAssetConfigSetter) {
        if (this.outputAssetConfig == null) {
            this.outputAssetConfig = new OutputAssetConfig();
            outputAssetConfigSetter.accept(this.outputAssetConfig);
        }

        return this;
    }

    /**
     * Get outputAssetConfig
     * @return outputAssetConfig
     */
    public OutputAssetConfig getOutputAssetConfig() {
        return outputAssetConfig;
    }

    public void setOutputAssetConfig(OutputAssetConfig outputAssetConfig) {
        this.outputAssetConfig = outputAssetConfig;
    }

    public Create2DDigitalHumanVideoReq withBackgroundMusicConfig(BackgroundMusicConfig backgroundMusicConfig) {
        this.backgroundMusicConfig = backgroundMusicConfig;
        return this;
    }

    public Create2DDigitalHumanVideoReq withBackgroundMusicConfig(
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

    public Create2DDigitalHumanVideoReq withReviewConfig(ReviewConfig reviewConfig) {
        this.reviewConfig = reviewConfig;
        return this;
    }

    public Create2DDigitalHumanVideoReq withReviewConfig(Consumer<ReviewConfig> reviewConfigSetter) {
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

    public Create2DDigitalHumanVideoReq withCallbackConfig(CallBackConfig callbackConfig) {
        this.callbackConfig = callbackConfig;
        return this;
    }

    public Create2DDigitalHumanVideoReq withCallbackConfig(Consumer<CallBackConfig> callbackConfigSetter) {
        if (this.callbackConfig == null) {
            this.callbackConfig = new CallBackConfig();
            callbackConfigSetter.accept(this.callbackConfig);
        }

        return this;
    }

    /**
     * Get callbackConfig
     * @return callbackConfig
     */
    public CallBackConfig getCallbackConfig() {
        return callbackConfig;
    }

    public void setCallbackConfig(CallBackConfig callbackConfig) {
        this.callbackConfig = callbackConfig;
    }

    public Create2DDigitalHumanVideoReq withActionConfig(ActionConfig actionConfig) {
        this.actionConfig = actionConfig;
        return this;
    }

    public Create2DDigitalHumanVideoReq withActionConfig(Consumer<ActionConfig> actionConfigSetter) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Create2DDigitalHumanVideoReq that = (Create2DDigitalHumanVideoReq) obj;
        return Objects.equals(this.scriptId, that.scriptId) && Objects.equals(this.modelAssetId, that.modelAssetId)
            && Objects.equals(this.voiceConfig, that.voiceConfig) && Objects.equals(this.videoConfig, that.videoConfig)
            && Objects.equals(this.shootScripts, that.shootScripts)
            && Objects.equals(this.outputAssetConfig, that.outputAssetConfig)
            && Objects.equals(this.backgroundMusicConfig, that.backgroundMusicConfig)
            && Objects.equals(this.reviewConfig, that.reviewConfig)
            && Objects.equals(this.callbackConfig, that.callbackConfig)
            && Objects.equals(this.actionConfig, that.actionConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scriptId,
            modelAssetId,
            voiceConfig,
            videoConfig,
            shootScripts,
            outputAssetConfig,
            backgroundMusicConfig,
            reviewConfig,
            callbackConfig,
            actionConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Create2DDigitalHumanVideoReq {\n");
        sb.append("    scriptId: ").append(toIndentedString(scriptId)).append("\n");
        sb.append("    modelAssetId: ").append(toIndentedString(modelAssetId)).append("\n");
        sb.append("    voiceConfig: ").append(toIndentedString(voiceConfig)).append("\n");
        sb.append("    videoConfig: ").append(toIndentedString(videoConfig)).append("\n");
        sb.append("    shootScripts: ").append(toIndentedString(shootScripts)).append("\n");
        sb.append("    outputAssetConfig: ").append(toIndentedString(outputAssetConfig)).append("\n");
        sb.append("    backgroundMusicConfig: ").append(toIndentedString(backgroundMusicConfig)).append("\n");
        sb.append("    reviewConfig: ").append(toIndentedString(reviewConfig)).append("\n");
        sb.append("    callbackConfig: ").append(toIndentedString(callbackConfig)).append("\n");
        sb.append("    actionConfig: ").append(toIndentedString(actionConfig)).append("\n");
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
