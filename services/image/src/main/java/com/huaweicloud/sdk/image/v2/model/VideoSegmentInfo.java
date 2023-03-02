package com.huaweicloud.sdk.image.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 视频剪切分段参数信息
 */
public class VideoSegmentInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Float startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Float duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "to_gif")

    private Integer toGif;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "speed")

    private Float speed;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gif_compress")

    private Float gifCompress;

    public VideoSegmentInfo withStartTime(Float startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 视频分段起始时间
     * minimum: 0
     * maximum: 1E+4
     * @return startTime
     */
    public Float getStartTime() {
        return startTime;
    }

    public void setStartTime(Float startTime) {
        this.startTime = startTime;
    }

    public VideoSegmentInfo withDuration(Float duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 视频分段持续时间
     * minimum: 0
     * maximum: 1E+4
     * @return duration
     */
    public Float getDuration() {
        return duration;
    }

    public void setDuration(Float duration) {
        this.duration = duration;
    }

    public VideoSegmentInfo withToGif(Integer toGif) {
        this.toGif = toGif;
        return this;
    }

    /**
     * 视频剪切服务生成视频或gif开关，1生成gif，0生成视频，默认为视频
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

    public VideoSegmentInfo withSpeed(Float speed) {
        this.speed = speed;
        return this;
    }

    /**
     * 视频或gif倍速，默认1
     * minimum: 0
     * maximum: 16
     * @return speed
     */
    public Float getSpeed() {
        return speed;
    }

    public void setSpeed(Float speed) {
        this.speed = speed;
    }

    public VideoSegmentInfo withGifCompress(Float gifCompress) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VideoSegmentInfo videoSegmentInfo = (VideoSegmentInfo) o;
        return Objects.equals(this.startTime, videoSegmentInfo.startTime)
            && Objects.equals(this.duration, videoSegmentInfo.duration)
            && Objects.equals(this.toGif, videoSegmentInfo.toGif) && Objects.equals(this.speed, videoSegmentInfo.speed)
            && Objects.equals(this.gifCompress, videoSegmentInfo.gifCompress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime, duration, toGif, speed, gifCompress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoSegmentInfo {\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    toGif: ").append(toIndentedString(toGif)).append("\n");
        sb.append("    speed: ").append(toIndentedString(speed)).append("\n");
        sb.append("    gifCompress: ").append(toIndentedString(gifCompress)).append("\n");
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
