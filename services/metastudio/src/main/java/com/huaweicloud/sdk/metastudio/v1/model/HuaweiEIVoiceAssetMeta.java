package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 华为云EI TTS音色元数据。此参数仅内部使用，不对外开放。
 */
public class HuaweiEIVoiceAssetMeta {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "property")

    private String property;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_cloned_voice")

    private Boolean isClonedVoice;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "training_job_id")

    private String trainingJobId;

    public HuaweiEIVoiceAssetMeta withProperty(String property) {
        this.property = property;
        return this;
    }

    /**
     * 音色属性。
     * @return property
     */
    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public HuaweiEIVoiceAssetMeta withIsClonedVoice(Boolean isClonedVoice) {
        this.isClonedVoice = isClonedVoice;
        return this;
    }

    /**
     * 是否是克隆音色，默认是false。
     * @return isClonedVoice
     */
    public Boolean getIsClonedVoice() {
        return isClonedVoice;
    }

    public void setIsClonedVoice(Boolean isClonedVoice) {
        this.isClonedVoice = isClonedVoice;
    }

    public HuaweiEIVoiceAssetMeta withTrainingJobId(String trainingJobId) {
        this.trainingJobId = trainingJobId;
        return this;
    }

    /**
     * 音色克隆时的训练任务ID。当is_cloned_voice=true时需要填写。
     * @return trainingJobId
     */
    public String getTrainingJobId() {
        return trainingJobId;
    }

    public void setTrainingJobId(String trainingJobId) {
        this.trainingJobId = trainingJobId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HuaweiEIVoiceAssetMeta that = (HuaweiEIVoiceAssetMeta) obj;
        return Objects.equals(this.property, that.property) && Objects.equals(this.isClonedVoice, that.isClonedVoice)
            && Objects.equals(this.trainingJobId, that.trainingJobId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(property, isClonedVoice, trainingJobId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HuaweiEIVoiceAssetMeta {\n");
        sb.append("    property: ").append(toIndentedString(property)).append("\n");
        sb.append("    isClonedVoice: ").append(toIndentedString(isClonedVoice)).append("\n");
        sb.append("    trainingJobId: ").append(toIndentedString(trainingJobId)).append("\n");
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
