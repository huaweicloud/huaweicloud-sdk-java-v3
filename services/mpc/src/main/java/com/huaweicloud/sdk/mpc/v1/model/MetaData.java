package com.huaweicloud.sdk.mpc.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mpc.v1.model.AudioInfo;
import com.huaweicloud.sdk.mpc.v1.model.VideoInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * MetaData
 */
public class MetaData  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="size")
    
    private Long size;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="duration")
    
    private Integer duration;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="format")
    
    private String format;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="bitrate")
    
    private Integer bitrate;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="video")
    
    private List<VideoInfo> video = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="audio")
    
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

    public MetaData withDuration(Integer duration) {
        this.duration = duration;
        return this;
    }

    


    /**
     * 视频时长。单位：秒。 
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

    public MetaData withBitrate(Integer bitrate) {
        this.bitrate = bitrate;
        return this;
    }

    


    /**
     * 总码率。 
     * minimum: 0
     * maximum: 2147483647
     * @return bitrate
     */
    public Integer getBitrate() {
        return bitrate;
    }

    public void setBitrate(Integer bitrate) {
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
        if(this.video == null ){
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
        if(this.audio == null ){
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
        return Objects.equals(this.size, metaData.size) &&
            Objects.equals(this.duration, metaData.duration) &&
            Objects.equals(this.format, metaData.format) &&
            Objects.equals(this.bitrate, metaData.bitrate) &&
            Objects.equals(this.video, metaData.video) &&
            Objects.equals(this.audio, metaData.audio);
    }
    @Override
    public int hashCode() {
        return Objects.hash(size, duration, format, bitrate, video, audio);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MetaData {\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

