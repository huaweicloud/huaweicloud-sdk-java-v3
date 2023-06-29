package com.huaweicloud.sdk.cloudrtc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RtcHistoryUsage
 */
public class RtcHistoryUsage {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "date")

    private String date;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_sd")

    private Long videoSd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_hd")

    private Long videoHd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_hdp")

    private Long videoHdp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio")

    private Long audio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_duration")

    private Long totalDuration;

    public RtcHistoryUsage withDate(String date) {
        this.date = date;
        return this;
    }

    /**
     * 采样时间。日期格式按照ISO8601表示法，并使用UTC时间。格式为YYYY-MM-DD
     * @return date
     */
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public RtcHistoryUsage withVideoSd(Long videoSd) {
        this.videoSd = videoSd;
        return this;
    }

    /**
     * 标清视频时长，单位秒
     * minimum: 0
     * maximum: 1844674407
     * @return videoSd
     */
    public Long getVideoSd() {
        return videoSd;
    }

    public void setVideoSd(Long videoSd) {
        this.videoSd = videoSd;
    }

    public RtcHistoryUsage withVideoHd(Long videoHd) {
        this.videoHd = videoHd;
        return this;
    }

    /**
     * 高清视频时长，单位秒
     * minimum: 0
     * maximum: 1844674407
     * @return videoHd
     */
    public Long getVideoHd() {
        return videoHd;
    }

    public void setVideoHd(Long videoHd) {
        this.videoHd = videoHd;
    }

    public RtcHistoryUsage withVideoHdp(Long videoHdp) {
        this.videoHdp = videoHdp;
        return this;
    }

    /**
     * 超高清视频时长，单位秒
     * minimum: 0
     * maximum: 1844674407
     * @return videoHdp
     */
    public Long getVideoHdp() {
        return videoHdp;
    }

    public void setVideoHdp(Long videoHdp) {
        this.videoHdp = videoHdp;
    }

    public RtcHistoryUsage withAudio(Long audio) {
        this.audio = audio;
        return this;
    }

    /**
     * 音频时长，单位秒
     * minimum: 0
     * maximum: 1844674407
     * @return audio
     */
    public Long getAudio() {
        return audio;
    }

    public void setAudio(Long audio) {
        this.audio = audio;
    }

    public RtcHistoryUsage withTotalDuration(Long totalDuration) {
        this.totalDuration = totalDuration;
        return this;
    }

    /**
     * 音视频总时长，单位秒
     * minimum: 0
     * maximum: 1844674407
     * @return totalDuration
     */
    public Long getTotalDuration() {
        return totalDuration;
    }

    public void setTotalDuration(Long totalDuration) {
        this.totalDuration = totalDuration;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RtcHistoryUsage that = (RtcHistoryUsage) obj;
        return Objects.equals(this.date, that.date) && Objects.equals(this.videoSd, that.videoSd)
            && Objects.equals(this.videoHd, that.videoHd) && Objects.equals(this.videoHdp, that.videoHdp)
            && Objects.equals(this.audio, that.audio) && Objects.equals(this.totalDuration, that.totalDuration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, videoSd, videoHd, videoHdp, audio, totalDuration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RtcHistoryUsage {\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    videoSd: ").append(toIndentedString(videoSd)).append("\n");
        sb.append("    videoHd: ").append(toIndentedString(videoHd)).append("\n");
        sb.append("    videoHdp: ").append(toIndentedString(videoHdp)).append("\n");
        sb.append("    audio: ").append(toIndentedString(audio)).append("\n");
        sb.append("    totalDuration: ").append(toIndentedString(totalDuration)).append("\n");
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
