package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * CreatePhotoDigitalHumanVideoReq
 */
public class CreatePhotoDigitalHumanVideoReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_id")

    private String scriptId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "human_image")

    private String humanImage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "voice_config")

    private VoiceConfig voiceConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_config")

    private PhotoVideoConfig videoConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shoot_scripts")

    private List<ShootScriptItem> shootScripts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "output_asset_config")

    private OutputAssetConfig outputAssetConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "background_music_config")

    private BackgroundMusicConfig backgroundMusicConfig;

    public CreatePhotoDigitalHumanVideoReq withScriptId(String scriptId) {
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

    public CreatePhotoDigitalHumanVideoReq withHumanImage(String humanImage) {
        this.humanImage = humanImage;
        return this;
    }

    /**
     * 人物照片，需要Base64编码。照片分辨率不超过1080P。
     * @return humanImage
     */
    public String getHumanImage() {
        return humanImage;
    }

    public void setHumanImage(String humanImage) {
        this.humanImage = humanImage;
    }

    public CreatePhotoDigitalHumanVideoReq withVoiceConfig(VoiceConfig voiceConfig) {
        this.voiceConfig = voiceConfig;
        return this;
    }

    public CreatePhotoDigitalHumanVideoReq withVoiceConfig(Consumer<VoiceConfig> voiceConfigSetter) {
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

    public CreatePhotoDigitalHumanVideoReq withVideoConfig(PhotoVideoConfig videoConfig) {
        this.videoConfig = videoConfig;
        return this;
    }

    public CreatePhotoDigitalHumanVideoReq withVideoConfig(Consumer<PhotoVideoConfig> videoConfigSetter) {
        if (this.videoConfig == null) {
            this.videoConfig = new PhotoVideoConfig();
            videoConfigSetter.accept(this.videoConfig);
        }

        return this;
    }

    /**
     * Get videoConfig
     * @return videoConfig
     */
    public PhotoVideoConfig getVideoConfig() {
        return videoConfig;
    }

    public void setVideoConfig(PhotoVideoConfig videoConfig) {
        this.videoConfig = videoConfig;
    }

    public CreatePhotoDigitalHumanVideoReq withShootScripts(List<ShootScriptItem> shootScripts) {
        this.shootScripts = shootScripts;
        return this;
    }

    public CreatePhotoDigitalHumanVideoReq addShootScriptsItem(ShootScriptItem shootScriptsItem) {
        if (this.shootScripts == null) {
            this.shootScripts = new ArrayList<>();
        }
        this.shootScripts.add(shootScriptsItem);
        return this;
    }

    public CreatePhotoDigitalHumanVideoReq withShootScripts(Consumer<List<ShootScriptItem>> shootScriptsSetter) {
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

    public CreatePhotoDigitalHumanVideoReq withOutputAssetConfig(OutputAssetConfig outputAssetConfig) {
        this.outputAssetConfig = outputAssetConfig;
        return this;
    }

    public CreatePhotoDigitalHumanVideoReq withOutputAssetConfig(Consumer<OutputAssetConfig> outputAssetConfigSetter) {
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

    public CreatePhotoDigitalHumanVideoReq withBackgroundMusicConfig(BackgroundMusicConfig backgroundMusicConfig) {
        this.backgroundMusicConfig = backgroundMusicConfig;
        return this;
    }

    public CreatePhotoDigitalHumanVideoReq withBackgroundMusicConfig(
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreatePhotoDigitalHumanVideoReq that = (CreatePhotoDigitalHumanVideoReq) obj;
        return Objects.equals(this.scriptId, that.scriptId) && Objects.equals(this.humanImage, that.humanImage)
            && Objects.equals(this.voiceConfig, that.voiceConfig) && Objects.equals(this.videoConfig, that.videoConfig)
            && Objects.equals(this.shootScripts, that.shootScripts)
            && Objects.equals(this.outputAssetConfig, that.outputAssetConfig)
            && Objects.equals(this.backgroundMusicConfig, that.backgroundMusicConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scriptId,
            humanImage,
            voiceConfig,
            videoConfig,
            shootScripts,
            outputAssetConfig,
            backgroundMusicConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreatePhotoDigitalHumanVideoReq {\n");
        sb.append("    scriptId: ").append(toIndentedString(scriptId)).append("\n");
        sb.append("    humanImage: ").append(toIndentedString(humanImage)).append("\n");
        sb.append("    voiceConfig: ").append(toIndentedString(voiceConfig)).append("\n");
        sb.append("    videoConfig: ").append(toIndentedString(videoConfig)).append("\n");
        sb.append("    shootScripts: ").append(toIndentedString(shootScripts)).append("\n");
        sb.append("    outputAssetConfig: ").append(toIndentedString(outputAssetConfig)).append("\n");
        sb.append("    backgroundMusicConfig: ").append(toIndentedString(backgroundMusicConfig)).append("\n");
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
