package com.huaweicloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * QualityEnhanceVideo
 */
public class QualityEnhanceVideo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_denoise")

    private VideoDenoise videoDenoise;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_sharp")

    private VideoSharp videoSharp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_contrast")

    private VideoContrast videoContrast;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_superresolution")

    private VideoSuperresolution videoSuperresolution;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_deblock")

    private VideoDeblock videoDeblock;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_saturation")

    private VideoSaturation videoSaturation;

    public QualityEnhanceVideo withVideoDenoise(VideoDenoise videoDenoise) {
        this.videoDenoise = videoDenoise;
        return this;
    }

    public QualityEnhanceVideo withVideoDenoise(Consumer<VideoDenoise> videoDenoiseSetter) {
        if (this.videoDenoise == null) {
            this.videoDenoise = new VideoDenoise();
            videoDenoiseSetter.accept(this.videoDenoise);
        }

        return this;
    }

    /**
     * Get videoDenoise
     * @return videoDenoise
     */
    public VideoDenoise getVideoDenoise() {
        return videoDenoise;
    }

    public void setVideoDenoise(VideoDenoise videoDenoise) {
        this.videoDenoise = videoDenoise;
    }

    public QualityEnhanceVideo withVideoSharp(VideoSharp videoSharp) {
        this.videoSharp = videoSharp;
        return this;
    }

    public QualityEnhanceVideo withVideoSharp(Consumer<VideoSharp> videoSharpSetter) {
        if (this.videoSharp == null) {
            this.videoSharp = new VideoSharp();
            videoSharpSetter.accept(this.videoSharp);
        }

        return this;
    }

    /**
     * Get videoSharp
     * @return videoSharp
     */
    public VideoSharp getVideoSharp() {
        return videoSharp;
    }

    public void setVideoSharp(VideoSharp videoSharp) {
        this.videoSharp = videoSharp;
    }

    public QualityEnhanceVideo withVideoContrast(VideoContrast videoContrast) {
        this.videoContrast = videoContrast;
        return this;
    }

    public QualityEnhanceVideo withVideoContrast(Consumer<VideoContrast> videoContrastSetter) {
        if (this.videoContrast == null) {
            this.videoContrast = new VideoContrast();
            videoContrastSetter.accept(this.videoContrast);
        }

        return this;
    }

    /**
     * Get videoContrast
     * @return videoContrast
     */
    public VideoContrast getVideoContrast() {
        return videoContrast;
    }

    public void setVideoContrast(VideoContrast videoContrast) {
        this.videoContrast = videoContrast;
    }

    public QualityEnhanceVideo withVideoSuperresolution(VideoSuperresolution videoSuperresolution) {
        this.videoSuperresolution = videoSuperresolution;
        return this;
    }

    public QualityEnhanceVideo withVideoSuperresolution(Consumer<VideoSuperresolution> videoSuperresolutionSetter) {
        if (this.videoSuperresolution == null) {
            this.videoSuperresolution = new VideoSuperresolution();
            videoSuperresolutionSetter.accept(this.videoSuperresolution);
        }

        return this;
    }

    /**
     * Get videoSuperresolution
     * @return videoSuperresolution
     */
    public VideoSuperresolution getVideoSuperresolution() {
        return videoSuperresolution;
    }

    public void setVideoSuperresolution(VideoSuperresolution videoSuperresolution) {
        this.videoSuperresolution = videoSuperresolution;
    }

    public QualityEnhanceVideo withVideoDeblock(VideoDeblock videoDeblock) {
        this.videoDeblock = videoDeblock;
        return this;
    }

    public QualityEnhanceVideo withVideoDeblock(Consumer<VideoDeblock> videoDeblockSetter) {
        if (this.videoDeblock == null) {
            this.videoDeblock = new VideoDeblock();
            videoDeblockSetter.accept(this.videoDeblock);
        }

        return this;
    }

    /**
     * Get videoDeblock
     * @return videoDeblock
     */
    public VideoDeblock getVideoDeblock() {
        return videoDeblock;
    }

    public void setVideoDeblock(VideoDeblock videoDeblock) {
        this.videoDeblock = videoDeblock;
    }

    public QualityEnhanceVideo withVideoSaturation(VideoSaturation videoSaturation) {
        this.videoSaturation = videoSaturation;
        return this;
    }

    public QualityEnhanceVideo withVideoSaturation(Consumer<VideoSaturation> videoSaturationSetter) {
        if (this.videoSaturation == null) {
            this.videoSaturation = new VideoSaturation();
            videoSaturationSetter.accept(this.videoSaturation);
        }

        return this;
    }

    /**
     * Get videoSaturation
     * @return videoSaturation
     */
    public VideoSaturation getVideoSaturation() {
        return videoSaturation;
    }

    public void setVideoSaturation(VideoSaturation videoSaturation) {
        this.videoSaturation = videoSaturation;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QualityEnhanceVideo that = (QualityEnhanceVideo) obj;
        return Objects.equals(this.videoDenoise, that.videoDenoise) && Objects.equals(this.videoSharp, that.videoSharp)
            && Objects.equals(this.videoContrast, that.videoContrast)
            && Objects.equals(this.videoSuperresolution, that.videoSuperresolution)
            && Objects.equals(this.videoDeblock, that.videoDeblock)
            && Objects.equals(this.videoSaturation, that.videoSaturation);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(videoDenoise, videoSharp, videoContrast, videoSuperresolution, videoDeblock, videoSaturation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QualityEnhanceVideo {\n");
        sb.append("    videoDenoise: ").append(toIndentedString(videoDenoise)).append("\n");
        sb.append("    videoSharp: ").append(toIndentedString(videoSharp)).append("\n");
        sb.append("    videoContrast: ").append(toIndentedString(videoContrast)).append("\n");
        sb.append("    videoSuperresolution: ").append(toIndentedString(videoSuperresolution)).append("\n");
        sb.append("    videoDeblock: ").append(toIndentedString(videoDeblock)).append("\n");
        sb.append("    videoSaturation: ").append(toIndentedString(videoSaturation)).append("\n");
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
