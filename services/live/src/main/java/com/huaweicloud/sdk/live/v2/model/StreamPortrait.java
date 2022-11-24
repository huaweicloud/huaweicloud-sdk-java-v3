package com.huaweicloud.sdk.live.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * StreamPortrait
 */
public class StreamPortrait {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "time")

    private String time;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flow")

    private Long flow;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "play_duration")

    private Long playDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_count")

    private Long requestCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_count")

    private Long userCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peak_user_count")

    private Long peakUserCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "peak_bandwidth")

    private Long peakBandwidth;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "push_duration")

    private Long pushDuration;

    public StreamPortrait withTime(String time) {
        this.time = time;
        return this;
    }

    /**
     * 统计日期，日期格式按照ISO8601表示法，格式：YYYYMMDD，如20200904。统计该统计日期00:00-23:59时段的播放画像信息。
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public StreamPortrait withFlow(Long flow) {
        this.flow = flow;
        return this;
    }

    /**
     * 累计流量，单位为byte。
     * minimum: 0
     * maximum: -1
     * @return flow
     */
    public Long getFlow() {
        return flow;
    }

    public void setFlow(Long flow) {
        this.flow = flow;
    }

    public StreamPortrait withPlayDuration(Long playDuration) {
        this.playDuration = playDuration;
        return this;
    }

    /**
     * 累计播放时长,单位为秒。
     * minimum: 0
     * maximum: -1
     * @return playDuration
     */
    public Long getPlayDuration() {
        return playDuration;
    }

    public void setPlayDuration(Long playDuration) {
        this.playDuration = playDuration;
    }

    public StreamPortrait withRequestCount(Long requestCount) {
        this.requestCount = requestCount;
        return this;
    }

    /**
     * 累计请求次数。
     * minimum: 0
     * maximum: -1
     * @return requestCount
     */
    public Long getRequestCount() {
        return requestCount;
    }

    public void setRequestCount(Long requestCount) {
        this.requestCount = requestCount;
    }

    public StreamPortrait withUserCount(Long userCount) {
        this.userCount = userCount;
        return this;
    }

    /**
     * 累计观看人数,根据IP去重。
     * minimum: 0
     * maximum: -1
     * @return userCount
     */
    public Long getUserCount() {
        return userCount;
    }

    public void setUserCount(Long userCount) {
        this.userCount = userCount;
    }

    public StreamPortrait withPeakUserCount(Long peakUserCount) {
        this.peakUserCount = peakUserCount;
        return this;
    }

    /**
     * 峰值观看人数,flv/rtmp协议是统计Session会话ID，其它协议统计IP,1分钟的采样数据。
     * minimum: 0
     * maximum: -1
     * @return peakUserCount
     */
    public Long getPeakUserCount() {
        return peakUserCount;
    }

    public void setPeakUserCount(Long peakUserCount) {
        this.peakUserCount = peakUserCount;
    }

    public StreamPortrait withPeakBandwidth(Long peakBandwidth) {
        this.peakBandwidth = peakBandwidth;
        return this;
    }

    /**
     * 峰值带宽，单位bps,5分钟的采样数据。
     * minimum: 0
     * maximum: -1
     * @return peakBandwidth
     */
    public Long getPeakBandwidth() {
        return peakBandwidth;
    }

    public void setPeakBandwidth(Long peakBandwidth) {
        this.peakBandwidth = peakBandwidth;
    }

    public StreamPortrait withPushDuration(Long pushDuration) {
        this.pushDuration = pushDuration;
        return this;
    }

    /**
     * 累计直播(推流)时长,单位为秒。
     * minimum: 0
     * maximum: -1
     * @return pushDuration
     */
    public Long getPushDuration() {
        return pushDuration;
    }

    public void setPushDuration(Long pushDuration) {
        this.pushDuration = pushDuration;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StreamPortrait streamPortrait = (StreamPortrait) o;
        return Objects.equals(this.time, streamPortrait.time) && Objects.equals(this.flow, streamPortrait.flow)
            && Objects.equals(this.playDuration, streamPortrait.playDuration)
            && Objects.equals(this.requestCount, streamPortrait.requestCount)
            && Objects.equals(this.userCount, streamPortrait.userCount)
            && Objects.equals(this.peakUserCount, streamPortrait.peakUserCount)
            && Objects.equals(this.peakBandwidth, streamPortrait.peakBandwidth)
            && Objects.equals(this.pushDuration, streamPortrait.pushDuration);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(time, flow, playDuration, requestCount, userCount, peakUserCount, peakBandwidth, pushDuration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StreamPortrait {\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
        sb.append("    flow: ").append(toIndentedString(flow)).append("\n");
        sb.append("    playDuration: ").append(toIndentedString(playDuration)).append("\n");
        sb.append("    requestCount: ").append(toIndentedString(requestCount)).append("\n");
        sb.append("    userCount: ").append(toIndentedString(userCount)).append("\n");
        sb.append("    peakUserCount: ").append(toIndentedString(peakUserCount)).append("\n");
        sb.append("    peakBandwidth: ").append(toIndentedString(peakBandwidth)).append("\n");
        sb.append("    pushDuration: ").append(toIndentedString(pushDuration)).append("\n");
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
