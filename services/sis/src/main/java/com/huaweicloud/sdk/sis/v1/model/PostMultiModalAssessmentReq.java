package com.huaweicloud.sdk.sis.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class PostMultiModalAssessmentReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "config")

    private MultiModalConfig config;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_data")

    private String videoData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ref_text")

    private String refText;

    public PostMultiModalAssessmentReq withConfig(MultiModalConfig config) {
        this.config = config;
        return this;
    }

    public PostMultiModalAssessmentReq withConfig(Consumer<MultiModalConfig> configSetter) {
        if (this.config == null) {
            this.config = new MultiModalConfig();
            configSetter.accept(this.config);
        }

        return this;
    }

    /** Get config
     * 
     * @return config */
    public MultiModalConfig getConfig() {
        return config;
    }

    public void setConfig(MultiModalConfig config) {
        this.config = config;
    }

    public PostMultiModalAssessmentReq withVideoData(String videoData) {
        this.videoData = videoData;
        return this;
    }

    /** 视频数据，Base64编码，要求Base64编码后大小不超过10M。 注意评测接口使用次数定义为：每8秒的视频作为一次，不足8秒按一次计算。例如传入4秒或8秒的视频，都算作使用一次，传入9秒的视频则视为调用2次。
     * 
     * @return videoData */
    public String getVideoData() {
        return videoData;
    }

    public void setVideoData(String videoData) {
        this.videoData = videoData;
    }

    public PostMultiModalAssessmentReq withRefText(String refText) {
        this.refText = refText;
        return this;
    }

    /** 被评估视频和语音数据对应的试题文本，长度不可超过256字节。
     * 
     * @return refText */
    public String getRefText() {
        return refText;
    }

    public void setRefText(String refText) {
        this.refText = refText;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PostMultiModalAssessmentReq postMultiModalAssessmentReq = (PostMultiModalAssessmentReq) o;
        return Objects.equals(this.config, postMultiModalAssessmentReq.config)
            && Objects.equals(this.videoData, postMultiModalAssessmentReq.videoData)
            && Objects.equals(this.refText, postMultiModalAssessmentReq.refText);
    }

    @Override
    public int hashCode() {
        return Objects.hash(config, videoData, refText);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PostMultiModalAssessmentReq {\n");
        sb.append("    config: ").append(toIndentedString(config)).append("\n");
        sb.append("    videoData: ").append(toIndentedString(videoData)).append("\n");
        sb.append("    refText: ").append(toIndentedString(refText)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
