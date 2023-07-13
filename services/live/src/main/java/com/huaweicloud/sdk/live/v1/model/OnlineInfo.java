package com.huaweicloud.sdk.live.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * OnlineInfo
 */
public class OnlineInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publish_domain")

    private String publishDomain;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app")

    private String app;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stream")

    private String stream;

    /**
     * 视频编码方式 - H264 - H265 
     */
    public static final class VideoCodecEnum {

        /**
         * Enum H264 for value: "H264"
         */
        public static final VideoCodecEnum H264 = new VideoCodecEnum("H264");

        /**
         * Enum H265 for value: "H265"
         */
        public static final VideoCodecEnum H265 = new VideoCodecEnum("H265");

        private static final Map<String, VideoCodecEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, VideoCodecEnum> createStaticFields() {
            Map<String, VideoCodecEnum> map = new HashMap<>();
            map.put("H264", H264);
            map.put("H265", H265);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        VideoCodecEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static VideoCodecEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new VideoCodecEnum(value));
        }

        public static VideoCodecEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof VideoCodecEnum) {
                return this.value.equals(((VideoCodecEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_codec")

    private VideoCodecEnum videoCodec;

    /**
     * 音频编码方式 - AAC 
     */
    public static final class AudioCodecEnum {

        /**
         * Enum AAC for value: "AAC"
         */
        public static final AudioCodecEnum AAC = new AudioCodecEnum("AAC");

        private static final Map<String, AudioCodecEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, AudioCodecEnum> createStaticFields() {
            Map<String, AudioCodecEnum> map = new HashMap<>();
            map.put("AAC", AAC);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        AudioCodecEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static AudioCodecEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new AudioCodecEnum(value));
        }

        public static AudioCodecEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof AudioCodecEnum) {
                return this.value.equals(((AudioCodecEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_codec")

    private AudioCodecEnum audioCodec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_frame_rate")

    private Long videoFrameRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_frame_rate")

    private Long audioFrameRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_bitrate")

    private Long videoBitrate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_bitrate")

    private Long audioBitrate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resolution")

    private String resolution;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "client_ip")

    private String clientIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    public OnlineInfo withPublishDomain(String publishDomain) {
        this.publishDomain = publishDomain;
        return this;
    }

    /**
     * 域名
     * @return publishDomain
     */
    public String getPublishDomain() {
        return publishDomain;
    }

    public void setPublishDomain(String publishDomain) {
        this.publishDomain = publishDomain;
    }

    public OnlineInfo withApp(String app) {
        this.app = app;
        return this;
    }

    /**
     * 应用名
     * @return app
     */
    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public OnlineInfo withStream(String stream) {
        this.stream = stream;
        return this;
    }

    /**
     * 流名
     * @return stream
     */
    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public OnlineInfo withVideoCodec(VideoCodecEnum videoCodec) {
        this.videoCodec = videoCodec;
        return this;
    }

    /**
     * 视频编码方式 - H264 - H265 
     * @return videoCodec
     */
    public VideoCodecEnum getVideoCodec() {
        return videoCodec;
    }

    public void setVideoCodec(VideoCodecEnum videoCodec) {
        this.videoCodec = videoCodec;
    }

    public OnlineInfo withAudioCodec(AudioCodecEnum audioCodec) {
        this.audioCodec = audioCodec;
        return this;
    }

    /**
     * 音频编码方式 - AAC 
     * @return audioCodec
     */
    public AudioCodecEnum getAudioCodec() {
        return audioCodec;
    }

    public void setAudioCodec(AudioCodecEnum audioCodec) {
        this.audioCodec = audioCodec;
    }

    public OnlineInfo withVideoFrameRate(Long videoFrameRate) {
        this.videoFrameRate = videoFrameRate;
        return this;
    }

    /**
     * 视频帧率
     * @return videoFrameRate
     */
    public Long getVideoFrameRate() {
        return videoFrameRate;
    }

    public void setVideoFrameRate(Long videoFrameRate) {
        this.videoFrameRate = videoFrameRate;
    }

    public OnlineInfo withAudioFrameRate(Long audioFrameRate) {
        this.audioFrameRate = audioFrameRate;
        return this;
    }

    /**
     * 音频帧率
     * @return audioFrameRate
     */
    public Long getAudioFrameRate() {
        return audioFrameRate;
    }

    public void setAudioFrameRate(Long audioFrameRate) {
        this.audioFrameRate = audioFrameRate;
    }

    public OnlineInfo withVideoBitrate(Long videoBitrate) {
        this.videoBitrate = videoBitrate;
        return this;
    }

    /**
     * 视频码率
     * @return videoBitrate
     */
    public Long getVideoBitrate() {
        return videoBitrate;
    }

    public void setVideoBitrate(Long videoBitrate) {
        this.videoBitrate = videoBitrate;
    }

    public OnlineInfo withAudioBitrate(Long audioBitrate) {
        this.audioBitrate = audioBitrate;
        return this;
    }

    /**
     * 音频码率
     * @return audioBitrate
     */
    public Long getAudioBitrate() {
        return audioBitrate;
    }

    public void setAudioBitrate(Long audioBitrate) {
        this.audioBitrate = audioBitrate;
    }

    public OnlineInfo withResolution(String resolution) {
        this.resolution = resolution;
        return this;
    }

    /**
     * 视频分辨率
     * @return resolution
     */
    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public OnlineInfo withClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }

    /**
     * 推流设备的ip
     * @return clientIp
     */
    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public OnlineInfo withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始推流时刻 UTC格式 2006-01-02T15:04:05Z
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OnlineInfo that = (OnlineInfo) obj;
        return Objects.equals(this.publishDomain, that.publishDomain) && Objects.equals(this.app, that.app)
            && Objects.equals(this.stream, that.stream) && Objects.equals(this.videoCodec, that.videoCodec)
            && Objects.equals(this.audioCodec, that.audioCodec)
            && Objects.equals(this.videoFrameRate, that.videoFrameRate)
            && Objects.equals(this.audioFrameRate, that.audioFrameRate)
            && Objects.equals(this.videoBitrate, that.videoBitrate)
            && Objects.equals(this.audioBitrate, that.audioBitrate) && Objects.equals(this.resolution, that.resolution)
            && Objects.equals(this.clientIp, that.clientIp) && Objects.equals(this.startTime, that.startTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(publishDomain,
            app,
            stream,
            videoCodec,
            audioCodec,
            videoFrameRate,
            audioFrameRate,
            videoBitrate,
            audioBitrate,
            resolution,
            clientIp,
            startTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OnlineInfo {\n");
        sb.append("    publishDomain: ").append(toIndentedString(publishDomain)).append("\n");
        sb.append("    app: ").append(toIndentedString(app)).append("\n");
        sb.append("    stream: ").append(toIndentedString(stream)).append("\n");
        sb.append("    videoCodec: ").append(toIndentedString(videoCodec)).append("\n");
        sb.append("    audioCodec: ").append(toIndentedString(audioCodec)).append("\n");
        sb.append("    videoFrameRate: ").append(toIndentedString(videoFrameRate)).append("\n");
        sb.append("    audioFrameRate: ").append(toIndentedString(audioFrameRate)).append("\n");
        sb.append("    videoBitrate: ").append(toIndentedString(videoBitrate)).append("\n");
        sb.append("    audioBitrate: ").append(toIndentedString(audioBitrate)).append("\n");
        sb.append("    resolution: ").append(toIndentedString(resolution)).append("\n");
        sb.append("    clientIp: ").append(toIndentedString(clientIp)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
