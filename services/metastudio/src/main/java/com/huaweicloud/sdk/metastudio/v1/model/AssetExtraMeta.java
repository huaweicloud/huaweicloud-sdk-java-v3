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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "human_model_2d_meta")

    private HumanModel2DAssetMeta humanModel2dMeta;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_meta")

    private ImageAssetMeta imageMeta;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_meta")

    private VideoAssetMeta videoMeta;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_meta")

    private AudioAssetMeta audioMeta;

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

    public AssetExtraMeta withHumanModel2dMeta(HumanModel2DAssetMeta humanModel2dMeta) {
        this.humanModel2dMeta = humanModel2dMeta;
        return this;
    }

    public AssetExtraMeta withHumanModel2dMeta(Consumer<HumanModel2DAssetMeta> humanModel2dMetaSetter) {
        if (this.humanModel2dMeta == null) {
            this.humanModel2dMeta = new HumanModel2DAssetMeta();
            humanModel2dMetaSetter.accept(this.humanModel2dMeta);
        }

        return this;
    }

    /**
     * Get humanModel2dMeta
     * @return humanModel2dMeta
     */
    public HumanModel2DAssetMeta getHumanModel2dMeta() {
        return humanModel2dMeta;
    }

    public void setHumanModel2dMeta(HumanModel2DAssetMeta humanModel2dMeta) {
        this.humanModel2dMeta = humanModel2dMeta;
    }

    public AssetExtraMeta withImageMeta(ImageAssetMeta imageMeta) {
        this.imageMeta = imageMeta;
        return this;
    }

    public AssetExtraMeta withImageMeta(Consumer<ImageAssetMeta> imageMetaSetter) {
        if (this.imageMeta == null) {
            this.imageMeta = new ImageAssetMeta();
            imageMetaSetter.accept(this.imageMeta);
        }

        return this;
    }

    /**
     * Get imageMeta
     * @return imageMeta
     */
    public ImageAssetMeta getImageMeta() {
        return imageMeta;
    }

    public void setImageMeta(ImageAssetMeta imageMeta) {
        this.imageMeta = imageMeta;
    }

    public AssetExtraMeta withVideoMeta(VideoAssetMeta videoMeta) {
        this.videoMeta = videoMeta;
        return this;
    }

    public AssetExtraMeta withVideoMeta(Consumer<VideoAssetMeta> videoMetaSetter) {
        if (this.videoMeta == null) {
            this.videoMeta = new VideoAssetMeta();
            videoMetaSetter.accept(this.videoMeta);
        }

        return this;
    }

    /**
     * Get videoMeta
     * @return videoMeta
     */
    public VideoAssetMeta getVideoMeta() {
        return videoMeta;
    }

    public void setVideoMeta(VideoAssetMeta videoMeta) {
        this.videoMeta = videoMeta;
    }

    public AssetExtraMeta withAudioMeta(AudioAssetMeta audioMeta) {
        this.audioMeta = audioMeta;
        return this;
    }

    public AssetExtraMeta withAudioMeta(Consumer<AudioAssetMeta> audioMetaSetter) {
        if (this.audioMeta == null) {
            this.audioMeta = new AudioAssetMeta();
            audioMetaSetter.accept(this.audioMeta);
        }

        return this;
    }

    /**
     * Get audioMeta
     * @return audioMeta
     */
    public AudioAssetMeta getAudioMeta() {
        return audioMeta;
    }

    public void setAudioMeta(AudioAssetMeta audioMeta) {
        this.audioMeta = audioMeta;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AssetExtraMeta that = (AssetExtraMeta) obj;
        return Objects.equals(this.humanModelMeta, that.humanModelMeta)
            && Objects.equals(this.voiceModelMeta, that.voiceModelMeta) && Objects.equals(this.pptMeta, that.pptMeta)
            && Objects.equals(this.animationMeta, that.animationMeta) && Objects.equals(this.sceneMeta, that.sceneMeta)
            && Objects.equals(this.materialMeta, that.materialMeta)
            && Objects.equals(this.humanModel2dMeta, that.humanModel2dMeta)
            && Objects.equals(this.imageMeta, that.imageMeta) && Objects.equals(this.videoMeta, that.videoMeta)
            && Objects.equals(this.audioMeta, that.audioMeta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(humanModelMeta,
            voiceModelMeta,
            pptMeta,
            animationMeta,
            sceneMeta,
            materialMeta,
            humanModel2dMeta,
            imageMeta,
            videoMeta,
            audioMeta);
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
        sb.append("    humanModel2dMeta: ").append(toIndentedString(humanModel2dMeta)).append("\n");
        sb.append("    imageMeta: ").append(toIndentedString(imageMeta)).append("\n");
        sb.append("    videoMeta: ").append(toIndentedString(videoMeta)).append("\n");
        sb.append("    audioMeta: ").append(toIndentedString(audioMeta)).append("\n");
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
