package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 配额信息
 */
public class ListUserQuotaDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modeling_count_2d_model")

    private Integer modelingCount2dModel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modeling_count_2d_model_flexus")

    private Integer modelingCount2dModelFlexus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_time_2d_model")

    private Float videoTime2dModel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_time_flexus_2d_model")

    private Float videoTimeFlexus2dModel;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "voice_clone_basic")

    private Integer voiceCloneBasic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "voice_clone_middle")

    private Integer voiceCloneMiddle;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "voice_clone_advance")

    private Integer voiceCloneAdvance;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "voice_clone_flexus")

    private Integer voiceCloneFlexus;

    public ListUserQuotaDetail withModelingCount2dModel(Integer modelingCount2dModel) {
        this.modelingCount2dModel = modelingCount2dModel;
        return this;
    }

    /**
     * 分身数字人训练模型数量。-1表示无限制。
     * minimum: -1
     * maximum: 10000000
     * @return modelingCount2dModel
     */
    public Integer getModelingCount2dModel() {
        return modelingCount2dModel;
    }

    public void setModelingCount2dModel(Integer modelingCount2dModel) {
        this.modelingCount2dModel = modelingCount2dModel;
    }

    public ListUserQuotaDetail withModelingCount2dModelFlexus(Integer modelingCount2dModelFlexus) {
        this.modelingCount2dModelFlexus = modelingCount2dModelFlexus;
        return this;
    }

    /**
     * 分身数字人flexus版训练模型数量。-1表示无限制。
     * minimum: -1
     * maximum: 10000000
     * @return modelingCount2dModelFlexus
     */
    public Integer getModelingCount2dModelFlexus() {
        return modelingCount2dModelFlexus;
    }

    public void setModelingCount2dModelFlexus(Integer modelingCount2dModelFlexus) {
        this.modelingCount2dModelFlexus = modelingCount2dModelFlexus;
    }

    public ListUserQuotaDetail withVideoTime2dModel(Float videoTime2dModel) {
        this.videoTime2dModel = videoTime2dModel;
        return this;
    }

    /**
     * 分身数字人视频制作内容时间，单位分钟。-1表示无限制。
     * minimum: -1
     * maximum: 999999999
     * @return videoTime2dModel
     */
    public Float getVideoTime2dModel() {
        return videoTime2dModel;
    }

    public void setVideoTime2dModel(Float videoTime2dModel) {
        this.videoTime2dModel = videoTime2dModel;
    }

    public ListUserQuotaDetail withVideoTimeFlexus2dModel(Float videoTimeFlexus2dModel) {
        this.videoTimeFlexus2dModel = videoTimeFlexus2dModel;
        return this;
    }

    /**
     * 分身数字人视频制作flexus版内容时间，单位分钟。-1表示无限制。
     * minimum: -1
     * maximum: 999999999
     * @return videoTimeFlexus2dModel
     */
    public Float getVideoTimeFlexus2dModel() {
        return videoTimeFlexus2dModel;
    }

    public void setVideoTimeFlexus2dModel(Float videoTimeFlexus2dModel) {
        this.videoTimeFlexus2dModel = videoTimeFlexus2dModel;
    }

    public ListUserQuotaDetail withVoiceCloneBasic(Integer voiceCloneBasic) {
        this.voiceCloneBasic = voiceCloneBasic;
        return this;
    }

    /**
     * 声音克隆基础版。-1表示无限制。
     * minimum: -1
     * maximum: 10000000
     * @return voiceCloneBasic
     */
    public Integer getVoiceCloneBasic() {
        return voiceCloneBasic;
    }

    public void setVoiceCloneBasic(Integer voiceCloneBasic) {
        this.voiceCloneBasic = voiceCloneBasic;
    }

    public ListUserQuotaDetail withVoiceCloneMiddle(Integer voiceCloneMiddle) {
        this.voiceCloneMiddle = voiceCloneMiddle;
        return this;
    }

    /**
     * 声音克隆进阶版。-1表示无限制。
     * minimum: -1
     * maximum: 10000000
     * @return voiceCloneMiddle
     */
    public Integer getVoiceCloneMiddle() {
        return voiceCloneMiddle;
    }

    public void setVoiceCloneMiddle(Integer voiceCloneMiddle) {
        this.voiceCloneMiddle = voiceCloneMiddle;
    }

    public ListUserQuotaDetail withVoiceCloneAdvance(Integer voiceCloneAdvance) {
        this.voiceCloneAdvance = voiceCloneAdvance;
        return this;
    }

    /**
     * 声音克隆高级版。-1表示无限制。
     * minimum: -1
     * maximum: 10000000
     * @return voiceCloneAdvance
     */
    public Integer getVoiceCloneAdvance() {
        return voiceCloneAdvance;
    }

    public void setVoiceCloneAdvance(Integer voiceCloneAdvance) {
        this.voiceCloneAdvance = voiceCloneAdvance;
    }

    public ListUserQuotaDetail withVoiceCloneFlexus(Integer voiceCloneFlexus) {
        this.voiceCloneFlexus = voiceCloneFlexus;
        return this;
    }

    /**
     * 声音克隆flexus版。-1表示无限制。
     * minimum: -1
     * maximum: 10000000
     * @return voiceCloneFlexus
     */
    public Integer getVoiceCloneFlexus() {
        return voiceCloneFlexus;
    }

    public void setVoiceCloneFlexus(Integer voiceCloneFlexus) {
        this.voiceCloneFlexus = voiceCloneFlexus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListUserQuotaDetail that = (ListUserQuotaDetail) obj;
        return Objects.equals(this.modelingCount2dModel, that.modelingCount2dModel)
            && Objects.equals(this.modelingCount2dModelFlexus, that.modelingCount2dModelFlexus)
            && Objects.equals(this.videoTime2dModel, that.videoTime2dModel)
            && Objects.equals(this.videoTimeFlexus2dModel, that.videoTimeFlexus2dModel)
            && Objects.equals(this.voiceCloneBasic, that.voiceCloneBasic)
            && Objects.equals(this.voiceCloneMiddle, that.voiceCloneMiddle)
            && Objects.equals(this.voiceCloneAdvance, that.voiceCloneAdvance)
            && Objects.equals(this.voiceCloneFlexus, that.voiceCloneFlexus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(modelingCount2dModel,
            modelingCount2dModelFlexus,
            videoTime2dModel,
            videoTimeFlexus2dModel,
            voiceCloneBasic,
            voiceCloneMiddle,
            voiceCloneAdvance,
            voiceCloneFlexus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListUserQuotaDetail {\n");
        sb.append("    modelingCount2dModel: ").append(toIndentedString(modelingCount2dModel)).append("\n");
        sb.append("    modelingCount2dModelFlexus: ").append(toIndentedString(modelingCount2dModelFlexus)).append("\n");
        sb.append("    videoTime2dModel: ").append(toIndentedString(videoTime2dModel)).append("\n");
        sb.append("    videoTimeFlexus2dModel: ").append(toIndentedString(videoTimeFlexus2dModel)).append("\n");
        sb.append("    voiceCloneBasic: ").append(toIndentedString(voiceCloneBasic)).append("\n");
        sb.append("    voiceCloneMiddle: ").append(toIndentedString(voiceCloneMiddle)).append("\n");
        sb.append("    voiceCloneAdvance: ").append(toIndentedString(voiceCloneAdvance)).append("\n");
        sb.append("    voiceCloneFlexus: ").append(toIndentedString(voiceCloneFlexus)).append("\n");
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
