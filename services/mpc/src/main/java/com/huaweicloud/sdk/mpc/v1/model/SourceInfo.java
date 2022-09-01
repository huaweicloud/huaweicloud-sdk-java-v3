package com.huaweicloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * SourceInfo
 */
public class SourceInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    @JacksonXmlProperty(localName = "duration")

    private Integer duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration_ms")

    @JacksonXmlProperty(localName = "duration_ms")

    private Long durationMs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "format")

    @JacksonXmlProperty(localName = "format")

    private String format;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    @JacksonXmlProperty(localName = "size")

    private Long size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_info")

    @JacksonXmlProperty(localName = "video_info")

    private VideoInfo videoInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_info")

    @JacksonXmlProperty(localName = "audio_info")

    private List<AudioInfo> audioInfo = null;

    public SourceInfo withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 片源时长，单位：秒
     * minimum: 0
     * maximum: 2147483647
     * @return duration
     */
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public SourceInfo withDurationMs(Long durationMs) {
        this.durationMs = durationMs;
        return this;
    }

    /**
     * 片源时长，单位：毫秒
     * minimum: 0
     * maximum: 9223372036854775807
     * @return durationMs
     */
    public Long getDurationMs() {
        return durationMs;
    }

    public void setDurationMs(Long durationMs) {
        this.durationMs = durationMs;
    }

    public SourceInfo withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * 片源格式
     * @return format
     */
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public SourceInfo withSize(Long size) {
        this.size = size;
        return this;
    }

    /**
     * 片源大小
     * minimum: 0
     * maximum: 9223372036854775807
     * @return size
     */
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public SourceInfo withVideoInfo(VideoInfo videoInfo) {
        this.videoInfo = videoInfo;
        return this;
    }

    public SourceInfo withVideoInfo(Consumer<VideoInfo> videoInfoSetter) {
        if (this.videoInfo == null) {
            this.videoInfo = new VideoInfo();
            videoInfoSetter.accept(this.videoInfo);
        }

        return this;
    }

    /**
     * Get videoInfo
     * @return videoInfo
     */
    public VideoInfo getVideoInfo() {
        return videoInfo;
    }

    public void setVideoInfo(VideoInfo videoInfo) {
        this.videoInfo = videoInfo;
    }

    public SourceInfo withAudioInfo(List<AudioInfo> audioInfo) {
        this.audioInfo = audioInfo;
        return this;
    }

    public SourceInfo addAudioInfoItem(AudioInfo audioInfoItem) {
        if (this.audioInfo == null) {
            this.audioInfo = new ArrayList<>();
        }
        this.audioInfo.add(audioInfoItem);
        return this;
    }

    public SourceInfo withAudioInfo(Consumer<List<AudioInfo>> audioInfoSetter) {
        if (this.audioInfo == null) {
            this.audioInfo = new ArrayList<>();
        }
        audioInfoSetter.accept(this.audioInfo);
        return this;
    }

    /**
     * 音频信息
     * @return audioInfo
     */
    public List<AudioInfo> getAudioInfo() {
        return audioInfo;
    }

    public void setAudioInfo(List<AudioInfo> audioInfo) {
        this.audioInfo = audioInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SourceInfo sourceInfo = (SourceInfo) o;
        return Objects.equals(this.duration, sourceInfo.duration)
            && Objects.equals(this.durationMs, sourceInfo.durationMs) && Objects.equals(this.format, sourceInfo.format)
            && Objects.equals(this.size, sourceInfo.size) && Objects.equals(this.videoInfo, sourceInfo.videoInfo)
            && Objects.equals(this.audioInfo, sourceInfo.audioInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(duration, durationMs, format, size, videoInfo, audioInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SourceInfo {\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    durationMs: ").append(toIndentedString(durationMs)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    videoInfo: ").append(toIndentedString(videoInfo)).append("\n");
        sb.append("    audioInfo: ").append(toIndentedString(audioInfo)).append("\n");
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
