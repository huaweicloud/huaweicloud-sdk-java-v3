package com.huaweicloud.sdk.live.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * UpStreamDetail
 */
public class UpStreamDetail {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private String time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "fps")

    private Long fps;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rate")

    private Long rate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "delay")

    private Long delay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "gop_duration")

    private Long gopDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_video_pts")

    private Long lastVideoPts;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_audio_pts")

    private Long lastAudioPts;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_video_audio_pts_diff")

    private Long lastVideoAudioPtsDiff;

    public UpStreamDetail withTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * 采样时间。日期格式按照ISO8601表示法，并使用UTC时间。 格式为：YYYY-MM-DDThh:mm:ssZ。
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public UpStreamDetail withFps(Long fps) {
        this.fps = fps;
        return this;
    }

    /**
     * 帧率，单位为fps
     * minimum: 0
     * maximum: 9223372036854775807
     * @return fps
     */
    public Long getFps() {
        return fps;
    }

    public void setFps(Long fps) {
        this.fps = fps;
    }

    public UpStreamDetail withRate(Long rate) {
        this.rate = rate;
        return this;
    }

    /**
     * 码率，单位为Kbps
     * minimum: 0
     * maximum: 9223372036854775807
     * @return rate
     */
    public Long getRate() {
        return rate;
    }

    public void setRate(Long rate) {
        this.rate = rate;
    }

    public UpStreamDetail withDelay(Long delay) {
        this.delay = delay;
        return this;
    }

    /**
     * 时延 单位ms
     * minimum: 0
     * maximum: 9223372036854775807
     * @return delay
     */
    public Long getDelay() {
        return delay;
    }

    public void setDelay(Long delay) {
        this.delay = delay;
    }

    public UpStreamDetail withGopDuration(Long gopDuration) {
        this.gopDuration = gopDuration;
        return this;
    }

    /**
     * 最近一次gop的时长 单位ms
     * minimum: 0
     * maximum: 9223372036854775807
     * @return gopDuration
     */
    public Long getGopDuration() {
        return gopDuration;
    }

    public void setGopDuration(Long gopDuration) {
        this.gopDuration = gopDuration;
    }

    public UpStreamDetail withLastVideoPts(Long lastVideoPts) {
        this.lastVideoPts = lastVideoPts;
        return this;
    }

    /**
     * 视频DTS 单位ms
     * minimum: 0
     * maximum: 9223372036854775807
     * @return lastVideoPts
     */
    public Long getLastVideoPts() {
        return lastVideoPts;
    }

    public void setLastVideoPts(Long lastVideoPts) {
        this.lastVideoPts = lastVideoPts;
    }

    public UpStreamDetail withLastAudioPts(Long lastAudioPts) {
        this.lastAudioPts = lastAudioPts;
        return this;
    }

    /**
     * 音频DTS 单位ms
     * minimum: 0
     * maximum: 9223372036854775807
     * @return lastAudioPts
     */
    public Long getLastAudioPts() {
        return lastAudioPts;
    }

    public void setLastAudioPts(Long lastAudioPts) {
        this.lastAudioPts = lastAudioPts;
    }

    public UpStreamDetail withLastVideoAudioPtsDiff(Long lastVideoAudioPtsDiff) {
        this.lastVideoAudioPtsDiff = lastVideoAudioPtsDiff;
        return this;
    }

    /**
     * 音视频DTS差值 单位ms
     * minimum: 0
     * maximum: 9223372036854775807
     * @return lastVideoAudioPtsDiff
     */
    public Long getLastVideoAudioPtsDiff() {
        return lastVideoAudioPtsDiff;
    }

    public void setLastVideoAudioPtsDiff(Long lastVideoAudioPtsDiff) {
        this.lastVideoAudioPtsDiff = lastVideoAudioPtsDiff;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpStreamDetail that = (UpStreamDetail) obj;
        return Objects.equals(this.time, that.time) && Objects.equals(this.fps, that.fps)
            && Objects.equals(this.rate, that.rate) && Objects.equals(this.delay, that.delay)
            && Objects.equals(this.gopDuration, that.gopDuration)
            && Objects.equals(this.lastVideoPts, that.lastVideoPts)
            && Objects.equals(this.lastAudioPts, that.lastAudioPts)
            && Objects.equals(this.lastVideoAudioPtsDiff, that.lastVideoAudioPtsDiff);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time, fps, rate, delay, gopDuration, lastVideoPts, lastAudioPts, lastVideoAudioPtsDiff);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpStreamDetail {\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    fps: ").append(toIndentedString(fps)).append("\n");
        sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
        sb.append("    delay: ").append(toIndentedString(delay)).append("\n");
        sb.append("    gopDuration: ").append(toIndentedString(gopDuration)).append("\n");
        sb.append("    lastVideoPts: ").append(toIndentedString(lastVideoPts)).append("\n");
        sb.append("    lastAudioPts: ").append(toIndentedString(lastAudioPts)).append("\n");
        sb.append("    lastVideoAudioPtsDiff: ").append(toIndentedString(lastVideoAudioPtsDiff)).append("\n");
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
