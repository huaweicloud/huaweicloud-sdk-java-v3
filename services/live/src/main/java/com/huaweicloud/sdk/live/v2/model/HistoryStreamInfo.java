package com.huaweicloud.sdk.live.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * HistoryStreamInfo
 */
public class HistoryStreamInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain")

    private String domain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app")

    private String app;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream")

    private String stream;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private Integer type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_codec")

    private String videoCodec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_codec")

    private String audioCodec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_ip")

    private String clientIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private String endTime;

    public HistoryStreamInfo withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * 推流域名。  - type为0表主播推流域名。  - type为1表示第三方推流域名 
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public HistoryStreamInfo withApp(String app) {
        this.app = app;
        return this;
    }

    /**
     * 应用名称。
     * @return app
     */
    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public HistoryStreamInfo withStream(String stream) {
        this.stream = stream;
        return this;
    }

    /**
     * 流名。
     * @return stream
     */
    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public HistoryStreamInfo withType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * 推流类型，取值如下：  - 0：表示主播推流  - 1：表示第三方推流 
     * minimum: 0
     * maximum: 1
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public HistoryStreamInfo withVideoCodec(String videoCodec) {
        this.videoCodec = videoCodec;
        return this;
    }

    /**
     * 视频编码格式。
     * @return videoCodec
     */
    public String getVideoCodec() {
        return videoCodec;
    }

    public void setVideoCodec(String videoCodec) {
        this.videoCodec = videoCodec;
    }

    public HistoryStreamInfo withAudioCodec(String audioCodec) {
        this.audioCodec = audioCodec;
        return this;
    }

    /**
     * 音频编码格式。
     * @return audioCodec
     */
    public String getAudioCodec() {
        return audioCodec;
    }

    public void setAudioCodec(String audioCodec) {
        this.audioCodec = audioCodec;
    }

    public HistoryStreamInfo withClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }

    /**
     * 主播ip。
     * @return clientIp
     */
    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public HistoryStreamInfo withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 采样开始时间。日期格式按照ISO8601表示法，并使用UTC时间。 格式为：YYYY-MM-DDThh:mm:ssZ。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public HistoryStreamInfo withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 采样结束时间。日期格式按照ISO8601表示法，并使用UTC时间。 格式为：YYYY-MM-DDThh:mm:ssZ。
     * @return endTime
     */
    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HistoryStreamInfo historyStreamInfo = (HistoryStreamInfo) o;
        return Objects.equals(this.domain, historyStreamInfo.domain) && Objects.equals(this.app, historyStreamInfo.app)
            && Objects.equals(this.stream, historyStreamInfo.stream)
            && Objects.equals(this.type, historyStreamInfo.type)
            && Objects.equals(this.videoCodec, historyStreamInfo.videoCodec)
            && Objects.equals(this.audioCodec, historyStreamInfo.audioCodec)
            && Objects.equals(this.clientIp, historyStreamInfo.clientIp)
            && Objects.equals(this.startTime, historyStreamInfo.startTime)
            && Objects.equals(this.endTime, historyStreamInfo.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domain, app, stream, type, videoCodec, audioCodec, clientIp, startTime, endTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HistoryStreamInfo {\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
        sb.append("    app: ").append(toIndentedString(app)).append("\n");
        sb.append("    stream: ").append(toIndentedString(stream)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    videoCodec: ").append(toIndentedString(videoCodec)).append("\n");
        sb.append("    audioCodec: ").append(toIndentedString(audioCodec)).append("\n");
        sb.append("    clientIp: ").append(toIndentedString(clientIp)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
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
