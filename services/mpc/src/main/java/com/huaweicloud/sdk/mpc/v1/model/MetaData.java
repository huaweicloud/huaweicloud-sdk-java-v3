package com.huaweicloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * MetaData
 */
public class MetaData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    @JacksonXmlProperty(localName = "size")

    private Long size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration_ms")

    @JacksonXmlProperty(localName = "duration_ms")

    private Double durationMs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    @JacksonXmlProperty(localName = "duration")

    private Long duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "format")

    @JacksonXmlProperty(localName = "format")

    private String format;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bitrate")

    @JacksonXmlProperty(localName = "bitrate")

    private Long bitrate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video")

    @JacksonXmlProperty(localName = "video")

    private List<VideoInfo> video = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio")

    @JacksonXmlProperty(localName = "audio")

    private List<AudioInfo> audio = null;

    public MetaData withSize(Long size) {
        this.size = size;
        return this;
    }

    /**
     * 文件大小。 
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

    public MetaData withDurationMs(Double durationMs) {
        this.durationMs = durationMs;
        return this;
    }

    /**
     * 视频时长，带小数位显示。单位：秒。 
     * minimum: 0
     * maximum: 2147483647
     * @return durationMs
     */
    public Double getDurationMs() {
        return durationMs;
    }

    public void setDurationMs(Double durationMs) {
        this.durationMs = durationMs;
    }

    public MetaData withDuration(Long duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 视频时长。单位：秒。 
     * minimum: 0
     * maximum: 2147483647
     * @return duration
     */
    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public MetaData withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * 文件封装格式。 
     * @return format
     */
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public MetaData withBitrate(Long bitrate) {
        this.bitrate = bitrate;
        return this;
    }

    /**
     * 总码率。单位：bit/秒 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return bitrate
     */
    public Long getBitrate() {
        return bitrate;
    }

    public void setBitrate(Long bitrate) {
        this.bitrate = bitrate;
    }

    public MetaData withVideo(List<VideoInfo> video) {
        this.video = video;
        return this;
    }

    public MetaData addVideoItem(VideoInfo videoItem) {
        if (this.video == null) {
            this.video = new ArrayList<>();
        }
        this.video.add(videoItem);
        return this;
    }

    public MetaData withVideo(Consumer<List<VideoInfo>> videoSetter) {
        if (this.video == null) {
            this.video = new ArrayList<>();
        }
        videoSetter.accept(this.video);
        return this;
    }

    /**
     * 视频流元数据。 
     * @return video
     */
    public List<VideoInfo> getVideo() {
        return video;
    }

    public void setVideo(List<VideoInfo> video) {
        this.video = video;
    }

    public MetaData withAudio(List<AudioInfo> audio) {
        this.audio = audio;
        return this;
    }

    public MetaData addAudioItem(AudioInfo audioItem) {
        if (this.audio == null) {
            this.audio = new ArrayList<>();
        }
        this.audio.add(audioItem);
        return this;
    }

    public MetaData withAudio(Consumer<List<AudioInfo>> audioSetter) {
        if (this.audio == null) {
            this.audio = new ArrayList<>();
        }
        audioSetter.accept(this.audio);
        return this;
    }

    /**
     * 音频流元数据。 
     * @return audio
     */
    public List<AudioInfo> getAudio() {
        return audio;
    }

    public void setAudio(List<AudioInfo> audio) {
        this.audio = audio;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MetaData metaData = (MetaData) o;
        return Objects.equals(this.size, metaData.size) && Objects.equals(this.durationMs, metaData.durationMs)
            && Objects.equals(this.duration, metaData.duration) && Objects.equals(this.format, metaData.format)
            && Objects.equals(this.bitrate, metaData.bitrate) && Objects.equals(this.video, metaData.video)
            && Objects.equals(this.audio, metaData.audio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, durationMs, duration, format, bitrate, video, audio);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetaData {\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    durationMs: ").append(toIndentedString(durationMs)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    bitrate: ").append(toIndentedString(bitrate)).append("\n");
        sb.append("    video: ").append(toIndentedString(video)).append("\n");
        sb.append("    audio: ").append(toIndentedString(audio)).append("\n");
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
