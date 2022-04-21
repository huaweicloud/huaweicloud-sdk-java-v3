package com.huaweicloud.sdk.cloudrtc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RtcHistoryQualityTimeValue
 */
public class RtcHistoryQualityTimeValue {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "date")

    private String date;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "join_success_rate")

    private Double joinSuccessRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "join_success_in5secs_rate")

    private Double joinSuccessIn5secsRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_freeze_rate")

    private Double videoFreezeRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_freeze_rate")

    private Double audioFreezeRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "first_video_recv_time")

    private Long firstVideoRecvTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "first_audio_recv_time")

    private Long firstAudioRecvTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pull_stream_success_rate")

    private Double pullStreamSuccessRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "push_stream_success_rate")

    private Double pushStreamSuccessRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_upstream_excellent_trans_rate")

    private Double videoUpstreamExcellentTransRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_upstream_excellent_trans_rate")

    private Double audioUpstreamExcellentTransRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_excellent_trans_rate")

    private Double videoExcellentTransRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_excellent_trans_rate")

    private Double audioExcellentTransRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_trans_delay")

    private Double videoTransDelay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_trans_delay")

    private Double audioTransDelay;

    public RtcHistoryQualityTimeValue withDate(String date) {
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

    public RtcHistoryQualityTimeValue withJoinSuccessRate(Double joinSuccessRate) {
        this.joinSuccessRate = joinSuccessRate;
        return this;
    }

    /**
     * 加入房间成功率参数取值，取值为1代表成功率100%
     * minimum: 0
     * maximum: 1
     * @return joinSuccessRate
     */
    public Double getJoinSuccessRate() {
        return joinSuccessRate;
    }

    public void setJoinSuccessRate(Double joinSuccessRate) {
        this.joinSuccessRate = joinSuccessRate;
    }

    public RtcHistoryQualityTimeValue withJoinSuccessIn5secsRate(Double joinSuccessIn5secsRate) {
        this.joinSuccessIn5secsRate = joinSuccessIn5secsRate;
        return this;
    }

    /**
     * 5s内加入房间成功率参数取值，取值为1代表成功率100%
     * minimum: 0
     * maximum: 1
     * @return joinSuccessIn5secsRate
     */
    public Double getJoinSuccessIn5secsRate() {
        return joinSuccessIn5secsRate;
    }

    public void setJoinSuccessIn5secsRate(Double joinSuccessIn5secsRate) {
        this.joinSuccessIn5secsRate = joinSuccessIn5secsRate;
    }

    public RtcHistoryQualityTimeValue withVideoFreezeRate(Double videoFreezeRate) {
        this.videoFreezeRate = videoFreezeRate;
        return this;
    }

    /**
     * 视频卡顿率参数取值，取值为1代表卡顿率100%
     * minimum: 0
     * maximum: 1
     * @return videoFreezeRate
     */
    public Double getVideoFreezeRate() {
        return videoFreezeRate;
    }

    public void setVideoFreezeRate(Double videoFreezeRate) {
        this.videoFreezeRate = videoFreezeRate;
    }

    public RtcHistoryQualityTimeValue withAudioFreezeRate(Double audioFreezeRate) {
        this.audioFreezeRate = audioFreezeRate;
        return this;
    }

    /**
     * 音频卡顿率参数取值，取值为1代表卡顿率100%
     * minimum: 0
     * maximum: 1
     * @return audioFreezeRate
     */
    public Double getAudioFreezeRate() {
        return audioFreezeRate;
    }

    public void setAudioFreezeRate(Double audioFreezeRate) {
        this.audioFreezeRate = audioFreezeRate;
    }

    public RtcHistoryQualityTimeValue withFirstVideoRecvTime(Long firstVideoRecvTime) {
        this.firstVideoRecvTime = firstVideoRecvTime;
        return this;
    }

    /**
     * 首帧视频接收耗时，单位毫秒
     * minimum: 0
     * maximum: 1
     * @return firstVideoRecvTime
     */
    public Long getFirstVideoRecvTime() {
        return firstVideoRecvTime;
    }

    public void setFirstVideoRecvTime(Long firstVideoRecvTime) {
        this.firstVideoRecvTime = firstVideoRecvTime;
    }

    public RtcHistoryQualityTimeValue withFirstAudioRecvTime(Long firstAudioRecvTime) {
        this.firstAudioRecvTime = firstAudioRecvTime;
        return this;
    }

    /**
     * 首帧音频接收耗时，单位毫秒
     * minimum: 0
     * maximum: 1
     * @return firstAudioRecvTime
     */
    public Long getFirstAudioRecvTime() {
        return firstAudioRecvTime;
    }

    public void setFirstAudioRecvTime(Long firstAudioRecvTime) {
        this.firstAudioRecvTime = firstAudioRecvTime;
    }

    public RtcHistoryQualityTimeValue withPullStreamSuccessRate(Double pullStreamSuccessRate) {
        this.pullStreamSuccessRate = pullStreamSuccessRate;
        return this;
    }

    /**
     * 拉流成功率参数取值，取值为1代表成功率100%
     * minimum: 0
     * maximum: 1
     * @return pullStreamSuccessRate
     */
    public Double getPullStreamSuccessRate() {
        return pullStreamSuccessRate;
    }

    public void setPullStreamSuccessRate(Double pullStreamSuccessRate) {
        this.pullStreamSuccessRate = pullStreamSuccessRate;
    }

    public RtcHistoryQualityTimeValue withPushStreamSuccessRate(Double pushStreamSuccessRate) {
        this.pushStreamSuccessRate = pushStreamSuccessRate;
        return this;
    }

    /**
     * 推流成功率参数取值，取值为1代表成功率100%
     * minimum: 0
     * maximum: 1
     * @return pushStreamSuccessRate
     */
    public Double getPushStreamSuccessRate() {
        return pushStreamSuccessRate;
    }

    public void setPushStreamSuccessRate(Double pushStreamSuccessRate) {
        this.pushStreamSuccessRate = pushStreamSuccessRate;
    }

    public RtcHistoryQualityTimeValue withVideoUpstreamExcellentTransRate(Double videoUpstreamExcellentTransRate) {
        this.videoUpstreamExcellentTransRate = videoUpstreamExcellentTransRate;
        return this;
    }

    /**
     * 客户端视频上行优质传输率，取值为1代表传输率100%
     * minimum: 0
     * maximum: 1844674407
     * @return videoUpstreamExcellentTransRate
     */
    public Double getVideoUpstreamExcellentTransRate() {
        return videoUpstreamExcellentTransRate;
    }

    public void setVideoUpstreamExcellentTransRate(Double videoUpstreamExcellentTransRate) {
        this.videoUpstreamExcellentTransRate = videoUpstreamExcellentTransRate;
    }

    public RtcHistoryQualityTimeValue withAudioUpstreamExcellentTransRate(Double audioUpstreamExcellentTransRate) {
        this.audioUpstreamExcellentTransRate = audioUpstreamExcellentTransRate;
        return this;
    }

    /**
     * 客户端音频上行优质传输率，取值为1代表传输率100%
     * minimum: 0
     * maximum: 1
     * @return audioUpstreamExcellentTransRate
     */
    public Double getAudioUpstreamExcellentTransRate() {
        return audioUpstreamExcellentTransRate;
    }

    public void setAudioUpstreamExcellentTransRate(Double audioUpstreamExcellentTransRate) {
        this.audioUpstreamExcellentTransRate = audioUpstreamExcellentTransRate;
    }

    public RtcHistoryQualityTimeValue withVideoExcellentTransRate(Double videoExcellentTransRate) {
        this.videoExcellentTransRate = videoExcellentTransRate;
        return this;
    }

    /**
     * 端到端视频优质传输率，取值为1代表传输率100%
     * minimum: 0
     * maximum: 1
     * @return videoExcellentTransRate
     */
    public Double getVideoExcellentTransRate() {
        return videoExcellentTransRate;
    }

    public void setVideoExcellentTransRate(Double videoExcellentTransRate) {
        this.videoExcellentTransRate = videoExcellentTransRate;
    }

    public RtcHistoryQualityTimeValue withAudioExcellentTransRate(Double audioExcellentTransRate) {
        this.audioExcellentTransRate = audioExcellentTransRate;
        return this;
    }

    /**
     * 端到端音频优质传输率，取值为1代表传输率100%
     * minimum: 0
     * maximum: 1
     * @return audioExcellentTransRate
     */
    public Double getAudioExcellentTransRate() {
        return audioExcellentTransRate;
    }

    public void setAudioExcellentTransRate(Double audioExcellentTransRate) {
        this.audioExcellentTransRate = audioExcellentTransRate;
    }

    public RtcHistoryQualityTimeValue withVideoTransDelay(Double videoTransDelay) {
        this.videoTransDelay = videoTransDelay;
        return this;
    }

    /**
     * 端到端视频网络时延，单位为毫秒，取当天所有用户网络延迟的中位数。
     * minimum: 0
     * maximum: 1
     * @return videoTransDelay
     */
    public Double getVideoTransDelay() {
        return videoTransDelay;
    }

    public void setVideoTransDelay(Double videoTransDelay) {
        this.videoTransDelay = videoTransDelay;
    }

    public RtcHistoryQualityTimeValue withAudioTransDelay(Double audioTransDelay) {
        this.audioTransDelay = audioTransDelay;
        return this;
    }

    /**
     * 端到端音频网络时延，单位为毫秒，取当天所有用户网络延迟的中位数。
     * minimum: 0
     * maximum: 1
     * @return audioTransDelay
     */
    public Double getAudioTransDelay() {
        return audioTransDelay;
    }

    public void setAudioTransDelay(Double audioTransDelay) {
        this.audioTransDelay = audioTransDelay;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RtcHistoryQualityTimeValue rtcHistoryQualityTimeValue = (RtcHistoryQualityTimeValue) o;
        return Objects.equals(this.date, rtcHistoryQualityTimeValue.date)
            && Objects.equals(this.joinSuccessRate, rtcHistoryQualityTimeValue.joinSuccessRate)
            && Objects.equals(this.joinSuccessIn5secsRate, rtcHistoryQualityTimeValue.joinSuccessIn5secsRate)
            && Objects.equals(this.videoFreezeRate, rtcHistoryQualityTimeValue.videoFreezeRate)
            && Objects.equals(this.audioFreezeRate, rtcHistoryQualityTimeValue.audioFreezeRate)
            && Objects.equals(this.firstVideoRecvTime, rtcHistoryQualityTimeValue.firstVideoRecvTime)
            && Objects.equals(this.firstAudioRecvTime, rtcHistoryQualityTimeValue.firstAudioRecvTime)
            && Objects.equals(this.pullStreamSuccessRate, rtcHistoryQualityTimeValue.pullStreamSuccessRate)
            && Objects.equals(this.pushStreamSuccessRate, rtcHistoryQualityTimeValue.pushStreamSuccessRate)
            && Objects.equals(this.videoUpstreamExcellentTransRate,
                rtcHistoryQualityTimeValue.videoUpstreamExcellentTransRate)
            && Objects.equals(this.audioUpstreamExcellentTransRate,
                rtcHistoryQualityTimeValue.audioUpstreamExcellentTransRate)
            && Objects.equals(this.videoExcellentTransRate, rtcHistoryQualityTimeValue.videoExcellentTransRate)
            && Objects.equals(this.audioExcellentTransRate, rtcHistoryQualityTimeValue.audioExcellentTransRate)
            && Objects.equals(this.videoTransDelay, rtcHistoryQualityTimeValue.videoTransDelay)
            && Objects.equals(this.audioTransDelay, rtcHistoryQualityTimeValue.audioTransDelay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date,
            joinSuccessRate,
            joinSuccessIn5secsRate,
            videoFreezeRate,
            audioFreezeRate,
            firstVideoRecvTime,
            firstAudioRecvTime,
            pullStreamSuccessRate,
            pushStreamSuccessRate,
            videoUpstreamExcellentTransRate,
            audioUpstreamExcellentTransRate,
            videoExcellentTransRate,
            audioExcellentTransRate,
            videoTransDelay,
            audioTransDelay);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RtcHistoryQualityTimeValue {\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    joinSuccessRate: ").append(toIndentedString(joinSuccessRate)).append("\n");
        sb.append("    joinSuccessIn5secsRate: ").append(toIndentedString(joinSuccessIn5secsRate)).append("\n");
        sb.append("    videoFreezeRate: ").append(toIndentedString(videoFreezeRate)).append("\n");
        sb.append("    audioFreezeRate: ").append(toIndentedString(audioFreezeRate)).append("\n");
        sb.append("    firstVideoRecvTime: ").append(toIndentedString(firstVideoRecvTime)).append("\n");
        sb.append("    firstAudioRecvTime: ").append(toIndentedString(firstAudioRecvTime)).append("\n");
        sb.append("    pullStreamSuccessRate: ").append(toIndentedString(pullStreamSuccessRate)).append("\n");
        sb.append("    pushStreamSuccessRate: ").append(toIndentedString(pushStreamSuccessRate)).append("\n");
        sb.append("    videoUpstreamExcellentTransRate: ")
            .append(toIndentedString(videoUpstreamExcellentTransRate))
            .append("\n");
        sb.append("    audioUpstreamExcellentTransRate: ")
            .append(toIndentedString(audioUpstreamExcellentTransRate))
            .append("\n");
        sb.append("    videoExcellentTransRate: ").append(toIndentedString(videoExcellentTransRate)).append("\n");
        sb.append("    audioExcellentTransRate: ").append(toIndentedString(audioExcellentTransRate)).append("\n");
        sb.append("    videoTransDelay: ").append(toIndentedString(videoTransDelay)).append("\n");
        sb.append("    audioTransDelay: ").append(toIndentedString(audioTransDelay)).append("\n");
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
