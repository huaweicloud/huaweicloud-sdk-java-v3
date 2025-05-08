package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ObjectMetaData
 */
public class ObjectMetaData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "bitrate")

    private Long bitrate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container")

    private String container;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "duration")

    private Integer duration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_duration")

    private Float videoDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_duration")

    private Float audioDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "float_duration")

    private Float floatDuration;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "height")

    private Integer height;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "width")

    private Integer width;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "md5")

    private String md5;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rotate")

    private Float rotate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Long size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_stream_list")

    private List<MetaVideoInfo> videoStreamList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio_stream_list")

    private List<MetaAudioInfo> audioStreamList = null;

    public ObjectMetaData withBitrate(Long bitrate) {
        this.bitrate = bitrate;
        return this;
    }

    /**
     * 总码率，单位：bit/秒 
     * @return bitrate
     */
    public Long getBitrate() {
        return bitrate;
    }

    public void setBitrate(Long bitrate) {
        this.bitrate = bitrate;
    }

    public ObjectMetaData withContainer(String container) {
        this.container = container;
        return this;
    }

    /**
     * 封装格式 
     * @return container
     */
    public String getContainer() {
        return container;
    }

    public void setContainer(String container) {
        this.container = container;
    }

    public ObjectMetaData withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    /**
     * 时长，单位：秒 
     * @return duration
     */
    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public ObjectMetaData withVideoDuration(Float videoDuration) {
        this.videoDuration = videoDuration;
        return this;
    }

    /**
     * 时长，单位：秒 
     * @return videoDuration
     */
    public Float getVideoDuration() {
        return videoDuration;
    }

    public void setVideoDuration(Float videoDuration) {
        this.videoDuration = videoDuration;
    }

    public ObjectMetaData withAudioDuration(Float audioDuration) {
        this.audioDuration = audioDuration;
        return this;
    }

    /**
     * 时长，单位：秒 
     * @return audioDuration
     */
    public Float getAudioDuration() {
        return audioDuration;
    }

    public void setAudioDuration(Float audioDuration) {
        this.audioDuration = audioDuration;
    }

    public ObjectMetaData withFloatDuration(Float floatDuration) {
        this.floatDuration = floatDuration;
        return this;
    }

    /**
     * 时长，单位：秒 
     * @return floatDuration
     */
    public Float getFloatDuration() {
        return floatDuration;
    }

    public void setFloatDuration(Float floatDuration) {
        this.floatDuration = floatDuration;
    }

    public ObjectMetaData withHeight(Integer height) {
        this.height = height;
        return this;
    }

    /**
     * 视频高度 
     * @return height
     */
    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public ObjectMetaData withWidth(Integer width) {
        this.width = width;
        return this;
    }

    /**
     * 视频宽度 
     * @return width
     */
    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public ObjectMetaData withMd5(String md5) {
        this.md5 = md5;
        return this;
    }

    /**
     * 视频md5 
     * @return md5
     */
    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public ObjectMetaData withRotate(Float rotate) {
        this.rotate = rotate;
        return this;
    }

    /**
     * 视频拍摄角度 
     * @return rotate
     */
    public Float getRotate() {
        return rotate;
    }

    public void setRotate(Float rotate) {
        this.rotate = rotate;
    }

    public ObjectMetaData withSize(Long size) {
        this.size = size;
        return this;
    }

    /**
     * 文件大小，单位：byte 
     * @return size
     */
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public ObjectMetaData withVideoStreamList(List<MetaVideoInfo> videoStreamList) {
        this.videoStreamList = videoStreamList;
        return this;
    }

    public ObjectMetaData addVideoStreamListItem(MetaVideoInfo videoStreamListItem) {
        if (this.videoStreamList == null) {
            this.videoStreamList = new ArrayList<>();
        }
        this.videoStreamList.add(videoStreamListItem);
        return this;
    }

    public ObjectMetaData withVideoStreamList(Consumer<List<MetaVideoInfo>> videoStreamListSetter) {
        if (this.videoStreamList == null) {
            this.videoStreamList = new ArrayList<>();
        }
        videoStreamListSetter.accept(this.videoStreamList);
        return this;
    }

    /**
     * 视频流元数据 
     * @return videoStreamList
     */
    public List<MetaVideoInfo> getVideoStreamList() {
        return videoStreamList;
    }

    public void setVideoStreamList(List<MetaVideoInfo> videoStreamList) {
        this.videoStreamList = videoStreamList;
    }

    public ObjectMetaData withAudioStreamList(List<MetaAudioInfo> audioStreamList) {
        this.audioStreamList = audioStreamList;
        return this;
    }

    public ObjectMetaData addAudioStreamListItem(MetaAudioInfo audioStreamListItem) {
        if (this.audioStreamList == null) {
            this.audioStreamList = new ArrayList<>();
        }
        this.audioStreamList.add(audioStreamListItem);
        return this;
    }

    public ObjectMetaData withAudioStreamList(Consumer<List<MetaAudioInfo>> audioStreamListSetter) {
        if (this.audioStreamList == null) {
            this.audioStreamList = new ArrayList<>();
        }
        audioStreamListSetter.accept(this.audioStreamList);
        return this;
    }

    /**
     * 音频流元数据 
     * @return audioStreamList
     */
    public List<MetaAudioInfo> getAudioStreamList() {
        return audioStreamList;
    }

    public void setAudioStreamList(List<MetaAudioInfo> audioStreamList) {
        this.audioStreamList = audioStreamList;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ObjectMetaData that = (ObjectMetaData) obj;
        return Objects.equals(this.bitrate, that.bitrate) && Objects.equals(this.container, that.container)
            && Objects.equals(this.duration, that.duration) && Objects.equals(this.videoDuration, that.videoDuration)
            && Objects.equals(this.audioDuration, that.audioDuration)
            && Objects.equals(this.floatDuration, that.floatDuration) && Objects.equals(this.height, that.height)
            && Objects.equals(this.width, that.width) && Objects.equals(this.md5, that.md5)
            && Objects.equals(this.rotate, that.rotate) && Objects.equals(this.size, that.size)
            && Objects.equals(this.videoStreamList, that.videoStreamList)
            && Objects.equals(this.audioStreamList, that.audioStreamList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bitrate,
            container,
            duration,
            videoDuration,
            audioDuration,
            floatDuration,
            height,
            width,
            md5,
            rotate,
            size,
            videoStreamList,
            audioStreamList);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ObjectMetaData {\n");
        sb.append("    bitrate: ").append(toIndentedString(bitrate)).append("\n");
        sb.append("    container: ").append(toIndentedString(container)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    videoDuration: ").append(toIndentedString(videoDuration)).append("\n");
        sb.append("    audioDuration: ").append(toIndentedString(audioDuration)).append("\n");
        sb.append("    floatDuration: ").append(toIndentedString(floatDuration)).append("\n");
        sb.append("    height: ").append(toIndentedString(height)).append("\n");
        sb.append("    width: ").append(toIndentedString(width)).append("\n");
        sb.append("    md5: ").append(toIndentedString(md5)).append("\n");
        sb.append("    rotate: ").append(toIndentedString(rotate)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    videoStreamList: ").append(toIndentedString(videoStreamList)).append("\n");
        sb.append("    audioStreamList: ").append(toIndentedString(audioStreamList)).append("\n");
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
