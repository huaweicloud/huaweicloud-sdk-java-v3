package com.huaweicloud.sdk.image.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 视频合成参数配置信息
 */
public class VideoSynthesisInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bgm_url")

    private String bgmUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resolution")

    private List<Integer> resolution = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fps")

    private Integer fps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "animation_duration")

    private Float animationDuration;

    public VideoSynthesisInfo withBgmUrl(String bgmUrl) {
        this.bgmUrl = bgmUrl;
        return this;
    }

    /**
     * 背景音乐url
     * @return bgmUrl
     */
    public String getBgmUrl() {
        return bgmUrl;
    }

    public void setBgmUrl(String bgmUrl) {
        this.bgmUrl = bgmUrl;
    }

    public VideoSynthesisInfo withResolution(List<Integer> resolution) {
        this.resolution = resolution;
        return this;
    }

    public VideoSynthesisInfo addResolutionItem(Integer resolutionItem) {
        if (this.resolution == null) {
            this.resolution = new ArrayList<>();
        }
        this.resolution.add(resolutionItem);
        return this;
    }

    public VideoSynthesisInfo withResolution(Consumer<List<Integer>> resolutionSetter) {
        if (this.resolution == null) {
            this.resolution = new ArrayList<>();
        }
        resolutionSetter.accept(this.resolution);
        return this;
    }

    /**
     * 视频分辨率
     * @return resolution
     */
    public List<Integer> getResolution() {
        return resolution;
    }

    public void setResolution(List<Integer> resolution) {
        this.resolution = resolution;
    }

    public VideoSynthesisInfo withFps(Integer fps) {
        this.fps = fps;
        return this;
    }

    /**
     * 视频帧率
     * minimum: 25
     * maximum: 60
     * @return fps
     */
    public Integer getFps() {
        return fps;
    }

    public void setFps(Integer fps) {
        this.fps = fps;
    }

    public VideoSynthesisInfo withAnimationDuration(Float animationDuration) {
        this.animationDuration = animationDuration;
        return this;
    }

    /**
     * 转场动画时间
     * minimum: 0.2
     * maximum: 2
     * @return animationDuration
     */
    public Float getAnimationDuration() {
        return animationDuration;
    }

    public void setAnimationDuration(Float animationDuration) {
        this.animationDuration = animationDuration;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VideoSynthesisInfo videoSynthesisInfo = (VideoSynthesisInfo) o;
        return Objects.equals(this.bgmUrl, videoSynthesisInfo.bgmUrl)
            && Objects.equals(this.resolution, videoSynthesisInfo.resolution)
            && Objects.equals(this.fps, videoSynthesisInfo.fps)
            && Objects.equals(this.animationDuration, videoSynthesisInfo.animationDuration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bgmUrl, resolution, fps, animationDuration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoSynthesisInfo {\n");
        sb.append("    bgmUrl: ").append(toIndentedString(bgmUrl)).append("\n");
        sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
        sb.append("    fps: ").append(toIndentedString(fps)).append("\n");
        sb.append("    animationDuration: ").append(toIndentedString(animationDuration)).append("\n");
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
