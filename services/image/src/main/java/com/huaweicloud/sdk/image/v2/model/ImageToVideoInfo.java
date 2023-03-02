package com.huaweicloud.sdk.image.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 图像合成视频参数配置信息
 */
public class ImageToVideoInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bgm_url")

    private String bgmUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to_gif")

    private Integer toGif;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gif_compress")

    private Float gifCompress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "image_durations")

    private List<Float> imageDurations = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resolution")

    private List<Integer> resolution = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fps")

    private Integer fps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "animation_duration")

    private Float animationDuration;

    public ImageToVideoInfo withBgmUrl(String bgmUrl) {
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

    public ImageToVideoInfo withToGif(Integer toGif) {
        this.toGif = toGif;
        return this;
    }

    /**
     * 生成视频或gif开关，1生成gif，0生成视频，默认为视频
     * minimum: 0
     * maximum: 1
     * @return toGif
     */
    public Integer getToGif() {
        return toGif;
    }

    public void setToGif(Integer toGif) {
        this.toGif = toGif;
    }

    public ImageToVideoInfo withGifCompress(Float gifCompress) {
        this.gifCompress = gifCompress;
        return this;
    }

    /**
     * gif分辨率压缩率，gif最终分辨率为最终合成视频分辨率*gif_compress
     * minimum: 0
     * maximum: 1
     * @return gifCompress
     */
    public Float getGifCompress() {
        return gifCompress;
    }

    public void setGifCompress(Float gifCompress) {
        this.gifCompress = gifCompress;
    }

    public ImageToVideoInfo withImageDurations(List<Float> imageDurations) {
        this.imageDurations = imageDurations;
        return this;
    }

    public ImageToVideoInfo addImageDurationsItem(Float imageDurationsItem) {
        if (this.imageDurations == null) {
            this.imageDurations = new ArrayList<>();
        }
        this.imageDurations.add(imageDurationsItem);
        return this;
    }

    public ImageToVideoInfo withImageDurations(Consumer<List<Float>> imageDurationsSetter) {
        if (this.imageDurations == null) {
            this.imageDurations = new ArrayList<>();
        }
        imageDurationsSetter.accept(this.imageDurations);
        return this;
    }

    /**
     * 图像展示时间List
     * @return imageDurations
     */
    public List<Float> getImageDurations() {
        return imageDurations;
    }

    public void setImageDurations(List<Float> imageDurations) {
        this.imageDurations = imageDurations;
    }

    public ImageToVideoInfo withResolution(List<Integer> resolution) {
        this.resolution = resolution;
        return this;
    }

    public ImageToVideoInfo addResolutionItem(Integer resolutionItem) {
        if (this.resolution == null) {
            this.resolution = new ArrayList<>();
        }
        this.resolution.add(resolutionItem);
        return this;
    }

    public ImageToVideoInfo withResolution(Consumer<List<Integer>> resolutionSetter) {
        if (this.resolution == null) {
            this.resolution = new ArrayList<>();
        }
        resolutionSetter.accept(this.resolution);
        return this;
    }

    /**
     * 分辨率
     * @return resolution
     */
    public List<Integer> getResolution() {
        return resolution;
    }

    public void setResolution(List<Integer> resolution) {
        this.resolution = resolution;
    }

    public ImageToVideoInfo withFps(Integer fps) {
        this.fps = fps;
        return this;
    }

    /**
     * 视频帧率，默认30
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

    public ImageToVideoInfo withAnimationDuration(Float animationDuration) {
        this.animationDuration = animationDuration;
        return this;
    }

    /**
     * 动画转场时间，默认1s
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
        ImageToVideoInfo imageToVideoInfo = (ImageToVideoInfo) o;
        return Objects.equals(this.bgmUrl, imageToVideoInfo.bgmUrl)
            && Objects.equals(this.toGif, imageToVideoInfo.toGif)
            && Objects.equals(this.gifCompress, imageToVideoInfo.gifCompress)
            && Objects.equals(this.imageDurations, imageToVideoInfo.imageDurations)
            && Objects.equals(this.resolution, imageToVideoInfo.resolution)
            && Objects.equals(this.fps, imageToVideoInfo.fps)
            && Objects.equals(this.animationDuration, imageToVideoInfo.animationDuration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bgmUrl, toGif, gifCompress, imageDurations, resolution, fps, animationDuration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ImageToVideoInfo {\n");
        sb.append("    bgmUrl: ").append(toIndentedString(bgmUrl)).append("\n");
        sb.append("    toGif: ").append(toIndentedString(toGif)).append("\n");
        sb.append("    gifCompress: ").append(toIndentedString(gifCompress)).append("\n");
        sb.append("    imageDurations: ").append(toIndentedString(imageDurations)).append("\n");
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
