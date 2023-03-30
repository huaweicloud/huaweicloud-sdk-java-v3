package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 资产元数据。根据资产类型选择其中一个填写。
 */
public class AssetExtraMeta {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "human_model_meta")

    private HumanModelAssetMeta humanModelMeta;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "voice_model_meta")

    private VoiceModelAssetMeta voiceModelMeta;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ppt_meta")

    private PPTAssetMeta pptMeta;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "animation_meta")

    private AnimationAssetMeta animationMeta;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "scene_meta")

    private SceneAssetMeta sceneMeta;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "material_meta")

    private MaterialAssetMeta materialMeta;

    public AssetExtraMeta withHumanModelMeta(HumanModelAssetMeta humanModelMeta) {
        this.humanModelMeta = humanModelMeta;
        return this;
    }

    public AssetExtraMeta withHumanModelMeta(Consumer<HumanModelAssetMeta> humanModelMetaSetter) {
        if (this.humanModelMeta == null) {
            this.humanModelMeta = new HumanModelAssetMeta();
            humanModelMetaSetter.accept(this.humanModelMeta);
        }

        return this;
    }

    /**
     * Get humanModelMeta
     * @return humanModelMeta
     */
    public HumanModelAssetMeta getHumanModelMeta() {
        return humanModelMeta;
    }

    public void setHumanModelMeta(HumanModelAssetMeta humanModelMeta) {
        this.humanModelMeta = humanModelMeta;
    }

    public AssetExtraMeta withVoiceModelMeta(VoiceModelAssetMeta voiceModelMeta) {
        this.voiceModelMeta = voiceModelMeta;
        return this;
    }

    public AssetExtraMeta withVoiceModelMeta(Consumer<VoiceModelAssetMeta> voiceModelMetaSetter) {
        if (this.voiceModelMeta == null) {
            this.voiceModelMeta = new VoiceModelAssetMeta();
            voiceModelMetaSetter.accept(this.voiceModelMeta);
        }

        return this;
    }

    /**
     * Get voiceModelMeta
     * @return voiceModelMeta
     */
    public VoiceModelAssetMeta getVoiceModelMeta() {
        return voiceModelMeta;
    }

    public void setVoiceModelMeta(VoiceModelAssetMeta voiceModelMeta) {
        this.voiceModelMeta = voiceModelMeta;
    }

    public AssetExtraMeta withPptMeta(PPTAssetMeta pptMeta) {
        this.pptMeta = pptMeta;
        return this;
    }

    public AssetExtraMeta withPptMeta(Consumer<PPTAssetMeta> pptMetaSetter) {
        if (this.pptMeta == null) {
            this.pptMeta = new PPTAssetMeta();
            pptMetaSetter.accept(this.pptMeta);
        }

        return this;
    }

    /**
     * Get pptMeta
     * @return pptMeta
     */
    public PPTAssetMeta getPptMeta() {
        return pptMeta;
    }

    public void setPptMeta(PPTAssetMeta pptMeta) {
        this.pptMeta = pptMeta;
    }

    public AssetExtraMeta withAnimationMeta(AnimationAssetMeta animationMeta) {
        this.animationMeta = animationMeta;
        return this;
    }

    public AssetExtraMeta withAnimationMeta(Consumer<AnimationAssetMeta> animationMetaSetter) {
        if (this.animationMeta == null) {
            this.animationMeta = new AnimationAssetMeta();
            animationMetaSetter.accept(this.animationMeta);
        }

        return this;
    }

    /**
     * Get animationMeta
     * @return animationMeta
     */
    public AnimationAssetMeta getAnimationMeta() {
        return animationMeta;
    }

    public void setAnimationMeta(AnimationAssetMeta animationMeta) {
        this.animationMeta = animationMeta;
    }

    public AssetExtraMeta withSceneMeta(SceneAssetMeta sceneMeta) {
        this.sceneMeta = sceneMeta;
        return this;
    }

    public AssetExtraMeta withSceneMeta(Consumer<SceneAssetMeta> sceneMetaSetter) {
        if (this.sceneMeta == null) {
            this.sceneMeta = new SceneAssetMeta();
            sceneMetaSetter.accept(this.sceneMeta);
        }

        return this;
    }

    /**
     * Get sceneMeta
     * @return sceneMeta
     */
    public SceneAssetMeta getSceneMeta() {
        return sceneMeta;
    }

    public void setSceneMeta(SceneAssetMeta sceneMeta) {
        this.sceneMeta = sceneMeta;
    }

    public AssetExtraMeta withMaterialMeta(MaterialAssetMeta materialMeta) {
        this.materialMeta = materialMeta;
        return this;
    }

    public AssetExtraMeta withMaterialMeta(Consumer<MaterialAssetMeta> materialMetaSetter) {
        if (this.materialMeta == null) {
            this.materialMeta = new MaterialAssetMeta();
            materialMetaSetter.accept(this.materialMeta);
        }

        return this;
    }

    /**
     * Get materialMeta
     * @return materialMeta
     */
    public MaterialAssetMeta getMaterialMeta() {
        return materialMeta;
    }

    public void setMaterialMeta(MaterialAssetMeta materialMeta) {
        this.materialMeta = materialMeta;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AssetExtraMeta assetExtraMeta = (AssetExtraMeta) o;
        return Objects.equals(this.humanModelMeta, assetExtraMeta.humanModelMeta)
            && Objects.equals(this.voiceModelMeta, assetExtraMeta.voiceModelMeta)
            && Objects.equals(this.pptMeta, assetExtraMeta.pptMeta)
            && Objects.equals(this.animationMeta, assetExtraMeta.animationMeta)
            && Objects.equals(this.sceneMeta, assetExtraMeta.sceneMeta)
            && Objects.equals(this.materialMeta, assetExtraMeta.materialMeta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(humanModelMeta, voiceModelMeta, pptMeta, animationMeta, sceneMeta, materialMeta);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssetExtraMeta {\n");
        sb.append("    humanModelMeta: ").append(toIndentedString(humanModelMeta)).append("\n");
        sb.append("    voiceModelMeta: ").append(toIndentedString(voiceModelMeta)).append("\n");
        sb.append("    pptMeta: ").append(toIndentedString(pptMeta)).append("\n");
        sb.append("    animationMeta: ").append(toIndentedString(animationMeta)).append("\n");
        sb.append("    sceneMeta: ").append(toIndentedString(sceneMeta)).append("\n");
        sb.append("    materialMeta: ").append(toIndentedString(materialMeta)).append("\n");
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
