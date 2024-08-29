package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 视频元数据，自动提取获得。
 */
public class VideoAssetMeta {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_codec")

    private String videoCodec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "width")

    private Integer width;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "height")

    private Integer height;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frame_rate")

    private String frameRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_bit_rate")

    private Integer videoBitRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Integer duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_codec")

    private String audioCodec;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_bit_rate")

    private Integer audioBitRate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_channels")

    private Integer audioChannels;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sample")

    private Integer sample;

    /**
     * Horizontal=横向；Vertical=纵向
     */
    public static final class ModeEnum {

        /**
         * Enum HORIZONTAL for value: "Horizontal"
         */
        public static final ModeEnum HORIZONTAL = new ModeEnum("Horizontal");

        /**
         * Enum VERTICAL for value: "Vertical"
         */
        public static final ModeEnum VERTICAL = new ModeEnum("Vertical");

        private static final Map<String, ModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, ModeEnum> createStaticFields() {
            Map<String, ModeEnum> map = new HashMap<>();
            map.put("Horizontal", HORIZONTAL);
            map.put("Vertical", VERTICAL);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        ModeEnum(String value) {
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
        public static ModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new ModeEnum(value));
        }

        public static ModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof ModeEnum) {
                return this.value.equals(((ModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mode")

    private ModeEnum mode;

    /**
     * 视频转码状态。 * WAITING：等待 * TRANSCODING：转码中 * FAILED：失败 * SUCCEEDED：成功
     */
    public static final class VideoTranscodingStatusEnum {

        /**
         * Enum WAITING for value: "WAITING"
         */
        public static final VideoTranscodingStatusEnum WAITING = new VideoTranscodingStatusEnum("WAITING");

        /**
         * Enum TRANSCODING for value: "TRANSCODING"
         */
        public static final VideoTranscodingStatusEnum TRANSCODING = new VideoTranscodingStatusEnum("TRANSCODING");

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final VideoTranscodingStatusEnum FAILED = new VideoTranscodingStatusEnum("FAILED");

        /**
         * Enum SUCCEEDED for value: "SUCCEEDED"
         */
        public static final VideoTranscodingStatusEnum SUCCEEDED = new VideoTranscodingStatusEnum("SUCCEEDED");

        private static final Map<String, VideoTranscodingStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, VideoTranscodingStatusEnum> createStaticFields() {
            Map<String, VideoTranscodingStatusEnum> map = new HashMap<>();
            map.put("WAITING", WAITING);
            map.put("TRANSCODING", TRANSCODING);
            map.put("FAILED", FAILED);
            map.put("SUCCEEDED", SUCCEEDED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        VideoTranscodingStatusEnum(String value) {
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
        public static VideoTranscodingStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElse(new VideoTranscodingStatusEnum(value));
        }

        public static VideoTranscodingStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof VideoTranscodingStatusEnum) {
                return this.value.equals(((VideoTranscodingStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_transcoding_status")

    private VideoTranscodingStatusEnum videoTranscodingStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_info")

    private ErrorResponse errorInfo;

    public VideoAssetMeta withVideoCodec(String videoCodec) {
        this.videoCodec = videoCodec;
        return this;
    }

    /**
     * 视频编码格式
     * @return videoCodec
     */
    public String getVideoCodec() {
        return videoCodec;
    }

    public void setVideoCodec(String videoCodec) {
        this.videoCodec = videoCodec;
    }

    public VideoAssetMeta withWidth(Integer width) {
        this.width = width;
        return this;
    }

    /**
     * 视频宽度
     * minimum: 0
     * maximum: 8196
     * @return width
     */
    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public VideoAssetMeta withHeight(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * 视频高度
     * minimum: 0
     * maximum: 8196
     * @return height
     */
    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public VideoAssetMeta withFrameRate(String frameRate) {
        this.frameRate = frameRate;
        return this;
    }

    /**
     * 帧率
     * @return frameRate
     */
    public String getFrameRate() {
        return frameRate;
    }

    public void setFrameRate(String frameRate) {
        this.frameRate = frameRate;
    }

    public VideoAssetMeta withVideoBitRate(Integer videoBitRate) {
        this.videoBitRate = videoBitRate;
        return this;
    }

    /**
     * 视频平均码率,单位kbps
     * minimum: 0
     * maximum: 104857600
     * @return videoBitRate
     */
    public Integer getVideoBitRate() {
        return videoBitRate;
    }

    public void setVideoBitRate(Integer videoBitRate) {
        this.videoBitRate = videoBitRate;
    }

    public VideoAssetMeta withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 时长,单位秒
     * minimum: 0
     * maximum: 86400
     * @return duration
     */
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public VideoAssetMeta withAudioCodec(String audioCodec) {
        this.audioCodec = audioCodec;
        return this;
    }

    /**
     * 音频编码格式
     * @return audioCodec
     */
    public String getAudioCodec() {
        return audioCodec;
    }

    public void setAudioCodec(String audioCodec) {
        this.audioCodec = audioCodec;
    }

    public VideoAssetMeta withAudioBitRate(Integer audioBitRate) {
        this.audioBitRate = audioBitRate;
        return this;
    }

    /**
     * 音频平均码率,单位kbps
     * minimum: 0
     * maximum: 16384
     * @return audioBitRate
     */
    public Integer getAudioBitRate() {
        return audioBitRate;
    }

    public void setAudioBitRate(Integer audioBitRate) {
        this.audioBitRate = audioBitRate;
    }

    public VideoAssetMeta withAudioChannels(Integer audioChannels) {
        this.audioChannels = audioChannels;
        return this;
    }

    /**
     * 音频声道数
     * minimum: 0
     * maximum: 100
     * @return audioChannels
     */
    public Integer getAudioChannels() {
        return audioChannels;
    }

    public void setAudioChannels(Integer audioChannels) {
        this.audioChannels = audioChannels;
    }

    public VideoAssetMeta withSample(Integer sample) {
        this.sample = sample;
        return this;
    }

    /**
     * 采样率,HZ
     * minimum: 0
     * maximum: 100000
     * @return sample
     */
    public Integer getSample() {
        return sample;
    }

    public void setSample(Integer sample) {
        this.sample = sample;
    }

    public VideoAssetMeta withMode(ModeEnum mode) {
        this.mode = mode;
        return this;
    }

    /**
     * Horizontal=横向；Vertical=纵向
     * @return mode
     */
    public ModeEnum getMode() {
        return mode;
    }

    public void setMode(ModeEnum mode) {
        this.mode = mode;
    }

    public VideoAssetMeta withVideoTranscodingStatus(VideoTranscodingStatusEnum videoTranscodingStatus) {
        this.videoTranscodingStatus = videoTranscodingStatus;
        return this;
    }

    /**
     * 视频转码状态。 * WAITING：等待 * TRANSCODING：转码中 * FAILED：失败 * SUCCEEDED：成功
     * @return videoTranscodingStatus
     */
    public VideoTranscodingStatusEnum getVideoTranscodingStatus() {
        return videoTranscodingStatus;
    }

    public void setVideoTranscodingStatus(VideoTranscodingStatusEnum videoTranscodingStatus) {
        this.videoTranscodingStatus = videoTranscodingStatus;
    }

    public VideoAssetMeta withErrorInfo(ErrorResponse errorInfo) {
        this.errorInfo = errorInfo;
        return this;
    }

    public VideoAssetMeta withErrorInfo(Consumer<ErrorResponse> errorInfoSetter) {
        if (this.errorInfo == null) {
            this.errorInfo = new ErrorResponse();
            errorInfoSetter.accept(this.errorInfo);
        }

        return this;
    }

    /**
     * Get errorInfo
     * @return errorInfo
     */
    public ErrorResponse getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(ErrorResponse errorInfo) {
        this.errorInfo = errorInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VideoAssetMeta that = (VideoAssetMeta) obj;
        return Objects.equals(this.videoCodec, that.videoCodec) && Objects.equals(this.width, that.width)
            && Objects.equals(this.height, that.height) && Objects.equals(this.frameRate, that.frameRate)
            && Objects.equals(this.videoBitRate, that.videoBitRate) && Objects.equals(this.duration, that.duration)
            && Objects.equals(this.audioCodec, that.audioCodec) && Objects.equals(this.audioBitRate, that.audioBitRate)
            && Objects.equals(this.audioChannels, that.audioChannels) && Objects.equals(this.sample, that.sample)
            && Objects.equals(this.mode, that.mode)
            && Objects.equals(this.videoTranscodingStatus, that.videoTranscodingStatus)
            && Objects.equals(this.errorInfo, that.errorInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(videoCodec,
            width,
            height,
            frameRate,
            videoBitRate,
            duration,
            audioCodec,
            audioBitRate,
            audioChannels,
            sample,
            mode,
            videoTranscodingStatus,
            errorInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoAssetMeta {\n");
        sb.append("    videoCodec: ").append(toIndentedString(videoCodec)).append("\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    frameRate: ").append(toIndentedString(frameRate)).append("\n");
        sb.append("    videoBitRate: ").append(toIndentedString(videoBitRate)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    audioCodec: ").append(toIndentedString(audioCodec)).append("\n");
        sb.append("    audioBitRate: ").append(toIndentedString(audioBitRate)).append("\n");
        sb.append("    audioChannels: ").append(toIndentedString(audioChannels)).append("\n");
        sb.append("    sample: ").append(toIndentedString(sample)).append("\n");
        sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
        sb.append("    videoTranscodingStatus: ").append(toIndentedString(videoTranscodingStatus)).append("\n");
        sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
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
