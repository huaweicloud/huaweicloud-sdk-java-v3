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
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_tail")

    private Boolean isTail;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

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

    public ListTtsaDataResponse withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 驱动任务开始时间，格式遵循：RFC 3339， 例 “2020-07-30T10:43:17Z”
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ListTtsaDataResponse withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 驱动任务结束时间，格式遵循：RFC 3339， 例 “2020-07-30T10:45:17Z”
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ListTtsaDataResponse withIsTail(Boolean isTail) {
        this.isTail = isTail;
        return this;
    }

    /**
     * 是否为尾部(任务数据已全部生成，后续没有新的数据)
     * @return isTail
     */
    public Boolean getIsTail() {
        return isTail;
    }

    public void setIsTail(Boolean isTail) {
        this.isTail = isTail;
    }

    public ListTtsaDataResponse withAudio(String audio) {
        this.audio = audio;
        return this;
    }

    /**
     * 音频数据，Base64编码，1秒内的数据。
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

    public ListTtsaDataResponse withXRequestId(String xRequestId) {
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
        ListTtsaDataResponse that = (ListTtsaDataResponse) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.endTime, that.endTime) && Objects.equals(this.isTail, that.isTail)
            && Objects.equals(this.audio, that.audio) && Objects.equals(this.blendshapes, that.blendshapes)
            && Objects.equals(this.animations, that.animations) && Objects.equals(this.motions, that.motions)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, startTime, endTime, isTail, audio, blendshapes, animations, motions, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTtsaDataResponse {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    isTail: ").append(toIndentedString(isTail)).append("\n");
        sb.append("    audio: ").append(toIndentedString(audio)).append("\n");
        sb.append("    blendshapes: ").append(toIndentedString(blendshapes)).append("\n");
        sb.append("    animations: ").append(toIndentedString(animations)).append("\n");
        sb.append("    motions: ").append(toIndentedString(motions)).append("\n");
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
