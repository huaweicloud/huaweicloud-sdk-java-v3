package com.huaweicloud.sdk.image.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 视频合成服务推理参数
 */
public class VideoSynthesisInference {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_config")

    private VideoSynthesisInfo videoConfig;

    public VideoSynthesisInference withVideoConfig(VideoSynthesisInfo videoConfig) {
        this.videoConfig = videoConfig;
        return this;
    }

    public VideoSynthesisInference withVideoConfig(Consumer<VideoSynthesisInfo> videoConfigSetter) {
        if (this.videoConfig == null) {
            this.videoConfig = new VideoSynthesisInfo();
            videoConfigSetter.accept(this.videoConfig);
        }

        return this;
    }

    /**
     * Get videoConfig
     * @return videoConfig
     */
    public VideoSynthesisInfo getVideoConfig() {
        return videoConfig;
    }

    public void setVideoConfig(VideoSynthesisInfo videoConfig) {
        this.videoConfig = videoConfig;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VideoSynthesisInference videoSynthesisInference = (VideoSynthesisInference) o;
        return Objects.equals(this.videoConfig, videoSynthesisInference.videoConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(videoConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoSynthesisInference {\n");
        sb.append("    videoConfig: ").append(toIndentedString(videoConfig)).append("\n");
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
