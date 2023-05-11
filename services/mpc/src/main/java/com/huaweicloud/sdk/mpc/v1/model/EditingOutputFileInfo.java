package com.huaweicloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * EditingOutputFileInfo
 */
public class EditingOutputFileInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Long duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "format")

    private String format;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Long size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size_byte")

    private Long sizeByte;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_info")

    private EditingVideoInfo videoInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_info")

    private List<EditingAudioInfo> audioInfo = null;

    public EditingOutputFileInfo withDuration(Long duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 输出片源时长 单位秒 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return duration
     */
    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }

    public EditingOutputFileInfo withFormat(String format) {
        this.format = format;
        return this;
    }

    /**
     * 输出封装格式 
     * @return format
     */
    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public EditingOutputFileInfo withSize(Long size) {
        this.size = size;
        return this;
    }

    /**
     * 媒体文件大小，单位：KByte。 
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

    public EditingOutputFileInfo withSizeByte(Long sizeByte) {
        this.sizeByte = sizeByte;
        return this;
    }

    /**
     * 媒体文件大小，单位：Byte。 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return sizeByte
     */
    public Long getSizeByte() {
        return sizeByte;
    }

    public void setSizeByte(Long sizeByte) {
        this.sizeByte = sizeByte;
    }

    public EditingOutputFileInfo withVideoInfo(EditingVideoInfo videoInfo) {
        this.videoInfo = videoInfo;
        return this;
    }

    public EditingOutputFileInfo withVideoInfo(Consumer<EditingVideoInfo> videoInfoSetter) {
        if (this.videoInfo == null) {
            this.videoInfo = new EditingVideoInfo();
            videoInfoSetter.accept(this.videoInfo);
        }

        return this;
    }

    /**
     * Get videoInfo
     * @return videoInfo
     */
    public EditingVideoInfo getVideoInfo() {
        return videoInfo;
    }

    public void setVideoInfo(EditingVideoInfo videoInfo) {
        this.videoInfo = videoInfo;
    }

    public EditingOutputFileInfo withAudioInfo(List<EditingAudioInfo> audioInfo) {
        this.audioInfo = audioInfo;
        return this;
    }

    public EditingOutputFileInfo addAudioInfoItem(EditingAudioInfo audioInfoItem) {
        if (this.audioInfo == null) {
            this.audioInfo = new ArrayList<>();
        }
        this.audioInfo.add(audioInfoItem);
        return this;
    }

    public EditingOutputFileInfo withAudioInfo(Consumer<List<EditingAudioInfo>> audioInfoSetter) {
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
    public List<EditingAudioInfo> getAudioInfo() {
        return audioInfo;
    }

    public void setAudioInfo(List<EditingAudioInfo> audioInfo) {
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
        EditingOutputFileInfo editingOutputFileInfo = (EditingOutputFileInfo) o;
        return Objects.equals(this.duration, editingOutputFileInfo.duration)
            && Objects.equals(this.format, editingOutputFileInfo.format)
            && Objects.equals(this.size, editingOutputFileInfo.size)
            && Objects.equals(this.sizeByte, editingOutputFileInfo.sizeByte)
            && Objects.equals(this.videoInfo, editingOutputFileInfo.videoInfo)
            && Objects.equals(this.audioInfo, editingOutputFileInfo.audioInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(duration, format, size, sizeByte, videoInfo, audioInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EditingOutputFileInfo {\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    sizeByte: ").append(toIndentedString(sizeByte)).append("\n");
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
