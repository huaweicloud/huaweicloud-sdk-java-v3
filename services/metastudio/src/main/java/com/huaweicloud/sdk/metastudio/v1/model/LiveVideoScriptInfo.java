package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创视频制作脚本请求。
 */
public class LiveVideoScriptInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_id")

    private String scriptId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_name")

    private String scriptName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "script_description")

    private String scriptDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dh_id")

    private String dhId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "model_asset_id")

    private String modelAssetId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "voice_config")

    private VoiceConfig voiceConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "background_config")

    private List<BackgroundConfigInfo> backgroundConfig = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "layer_config")

    private List<LayerConfig> layerConfig = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "shoot_scripts")

    private List<LiveShootScriptItem> shootScripts = null;

    public LiveVideoScriptInfo withScriptId(String scriptId) {
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

    public LiveVideoScriptInfo withScriptName(String scriptName) {
        this.scriptName = scriptName;
        return this;
    }

    /**
     * 剧本名称
     * @return scriptName
     */
    public String getScriptName() {
        return scriptName;
    }

    public void setScriptName(String scriptName) {
        this.scriptName = scriptName;
    }

    public LiveVideoScriptInfo withScriptDescription(String scriptDescription) {
        this.scriptDescription = scriptDescription;
        return this;
    }

    /**
     * 剧本描述。
     * @return scriptDescription
     */
    public String getScriptDescription() {
        return scriptDescription;
    }

    public void setScriptDescription(String scriptDescription) {
        this.scriptDescription = scriptDescription;
    }

    public LiveVideoScriptInfo withDhId(String dhId) {
        this.dhId = dhId;
        return this;
    }

    /**
     * 数字人ID。对应形象和音色组合。
     * @return dhId
     */
    public String getDhId() {
        return dhId;
    }

    public void setDhId(String dhId) {
        this.dhId = dhId;
    }

    public LiveVideoScriptInfo withModelAssetId(String modelAssetId) {
        this.modelAssetId = modelAssetId;
        return this;
    }

    /**
     * 数字人模型资产ID。
     * @return modelAssetId
     */
    public String getModelAssetId() {
        return modelAssetId;
    }

    public void setModelAssetId(String modelAssetId) {
        this.modelAssetId = modelAssetId;
    }

    public LiveVideoScriptInfo withVoiceConfig(VoiceConfig voiceConfig) {
        this.voiceConfig = voiceConfig;
        return this;
    }

    public LiveVideoScriptInfo withVoiceConfig(Consumer<VoiceConfig> voiceConfigSetter) {
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

    public LiveVideoScriptInfo withBackgroundConfig(List<BackgroundConfigInfo> backgroundConfig) {
        this.backgroundConfig = backgroundConfig;
        return this;
    }

    public LiveVideoScriptInfo addBackgroundConfigItem(BackgroundConfigInfo backgroundConfigItem) {
        if (this.backgroundConfig == null) {
            this.backgroundConfig = new ArrayList<>();
        }
        this.backgroundConfig.add(backgroundConfigItem);
        return this;
    }

    public LiveVideoScriptInfo withBackgroundConfig(Consumer<List<BackgroundConfigInfo>> backgroundConfigSetter) {
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

    public LiveVideoScriptInfo withLayerConfig(List<LayerConfig> layerConfig) {
        this.layerConfig = layerConfig;
        return this;
    }

    public LiveVideoScriptInfo addLayerConfigItem(LayerConfig layerConfigItem) {
        if (this.layerConfig == null) {
            this.layerConfig = new ArrayList<>();
        }
        this.layerConfig.add(layerConfigItem);
        return this;
    }

    public LiveVideoScriptInfo withLayerConfig(Consumer<List<LayerConfig>> layerConfigSetter) {
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

    public LiveVideoScriptInfo withShootScripts(List<LiveShootScriptItem> shootScripts) {
        this.shootScripts = shootScripts;
        return this;
    }

    public LiveVideoScriptInfo addShootScriptsItem(LiveShootScriptItem shootScriptsItem) {
        if (this.shootScripts == null) {
            this.shootScripts = new ArrayList<>();
        }
        this.shootScripts.add(shootScriptsItem);
        return this;
    }

    public LiveVideoScriptInfo withShootScripts(Consumer<List<LiveShootScriptItem>> shootScriptsSetter) {
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
    public List<LiveShootScriptItem> getShootScripts() {
        return shootScripts;
    }

    public void setShootScripts(List<LiveShootScriptItem> shootScripts) {
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
        LiveVideoScriptInfo that = (LiveVideoScriptInfo) obj;
        return Objects.equals(this.scriptId, that.scriptId) && Objects.equals(this.scriptName, that.scriptName)
            && Objects.equals(this.scriptDescription, that.scriptDescription) && Objects.equals(this.dhId, that.dhId)
            && Objects.equals(this.modelAssetId, that.modelAssetId)
            && Objects.equals(this.voiceConfig, that.voiceConfig)
            && Objects.equals(this.backgroundConfig, that.backgroundConfig)
            && Objects.equals(this.layerConfig, that.layerConfig)
            && Objects.equals(this.shootScripts, that.shootScripts);
    }

    @Override
    public int hashCode() {
        return Objects.hash(scriptId,
            scriptName,
            scriptDescription,
            dhId,
            modelAssetId,
            voiceConfig,
            backgroundConfig,
            layerConfig,
            shootScripts);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LiveVideoScriptInfo {\n");
        sb.append("    scriptId: ").append(toIndentedString(scriptId)).append("\n");
        sb.append("    scriptName: ").append(toIndentedString(scriptName)).append("\n");
        sb.append("    scriptDescription: ").append(toIndentedString(scriptDescription)).append("\n");
        sb.append("    dhId: ").append(toIndentedString(dhId)).append("\n");
        sb.append("    modelAssetId: ").append(toIndentedString(modelAssetId)).append("\n");
        sb.append("    voiceConfig: ").append(toIndentedString(voiceConfig)).append("\n");
        sb.append("    backgroundConfig: ").append(toIndentedString(backgroundConfig)).append("\n");
        sb.append("    layerConfig: ").append(toIndentedString(layerConfig)).append("\n");
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
