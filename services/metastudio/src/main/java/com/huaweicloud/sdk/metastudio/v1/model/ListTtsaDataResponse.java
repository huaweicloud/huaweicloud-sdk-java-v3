package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListTtsaDataResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobId")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio")

    private String audio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blendshapes")

    private List<String> blendshapes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "animations")

    private List<AnimationItem> animations = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "motions")

    private List<MotionItem> motions = null;

    public ListTtsaDataResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 任务ID。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public ListTtsaDataResponse withAudio(String audio) {
        this.audio = audio;
        return this;
    }

    /**
     * 音频数据，Base64编码，1s内的数据。
     * @return audio
     */
    public String getAudio() {
        return audio;
    }

    public void setAudio(String audio) {
        this.audio = audio;
    }

    public ListTtsaDataResponse withBlendshapes(List<String> blendshapes) {
        this.blendshapes = blendshapes;
        return this;
    }

    public ListTtsaDataResponse addBlendshapesItem(String blendshapesItem) {
        if (this.blendshapes == null) {
            this.blendshapes = new ArrayList<>();
        }
        this.blendshapes.add(blendshapesItem);
        return this;
    }

    public ListTtsaDataResponse withBlendshapes(Consumer<List<String>> blendshapesSetter) {
        if (this.blendshapes == null) {
            this.blendshapes = new ArrayList<>();
        }
        blendshapesSetter.accept(this.blendshapes);
        return this;
    }

    /**
     * 语音驱动的表情基数据。
     * @return blendshapes
     */
    public List<String> getBlendshapes() {
        return blendshapes;
    }

    public void setBlendshapes(List<String> blendshapes) {
        this.blendshapes = blendshapes;
    }

    public ListTtsaDataResponse withAnimations(List<AnimationItem> animations) {
        this.animations = animations;
        return this;
    }

    public ListTtsaDataResponse addAnimationsItem(AnimationItem animationsItem) {
        if (this.animations == null) {
            this.animations = new ArrayList<>();
        }
        this.animations.add(animationsItem);
        return this;
    }

    public ListTtsaDataResponse withAnimations(Consumer<List<AnimationItem>> animationsSetter) {
        if (this.animations == null) {
            this.animations = new ArrayList<>();
        }
        animationsSetter.accept(this.animations);
        return this;
    }

    /**
     * 手工指定的动作库动作数据。
     * @return animations
     */
    public List<AnimationItem> getAnimations() {
        return animations;
    }

    public void setAnimations(List<AnimationItem> animations) {
        this.animations = animations;
    }

    public ListTtsaDataResponse withMotions(List<MotionItem> motions) {
        this.motions = motions;
        return this;
    }

    public ListTtsaDataResponse addMotionsItem(MotionItem motionsItem) {
        if (this.motions == null) {
            this.motions = new ArrayList<>();
        }
        this.motions.add(motionsItem);
        return this;
    }

    public ListTtsaDataResponse withMotions(Consumer<List<MotionItem>> motionsSetter) {
        if (this.motions == null) {
            this.motions = new ArrayList<>();
        }
        motionsSetter.accept(this.motions);
        return this;
    }

    /**
     * 语义驱动的智能动作数据。
     * @return motions
     */
    public List<MotionItem> getMotions() {
        return motions;
    }

    public void setMotions(List<MotionItem> motions) {
        this.motions = motions;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListTtsaDataResponse listTtsaDataResponse = (ListTtsaDataResponse) o;
        return Objects.equals(this.jobId, listTtsaDataResponse.jobId)
            && Objects.equals(this.audio, listTtsaDataResponse.audio)
            && Objects.equals(this.blendshapes, listTtsaDataResponse.blendshapes)
            && Objects.equals(this.animations, listTtsaDataResponse.animations)
            && Objects.equals(this.motions, listTtsaDataResponse.motions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, audio, blendshapes, animations, motions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTtsaDataResponse {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    audio: ").append(toIndentedString(audio)).append("\n");
        sb.append("    blendshapes: ").append(toIndentedString(blendshapes)).append("\n");
        sb.append("    animations: ").append(toIndentedString(animations)).append("\n");
        sb.append("    motions: ").append(toIndentedString(motions)).append("\n");
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
