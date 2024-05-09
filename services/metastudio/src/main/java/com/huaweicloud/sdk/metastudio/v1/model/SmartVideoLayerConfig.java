package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 素材视频图层配置。
 */
public class SmartVideoLayerConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_url")

    private String videoUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_cover_url")

    private String videoCoverUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_duration")

    private Integer displayDuration;

    public SmartVideoLayerConfig withVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }

    /**
     * 视频文件的URL。
     * @return videoUrl
     */
    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public SmartVideoLayerConfig withVideoCoverUrl(String videoCoverUrl) {
        this.videoCoverUrl = videoCoverUrl;
        return this;
    }

    /**
     * 视频封面文件的URL。
     * @return videoCoverUrl
     */
    public String getVideoCoverUrl() {
        return videoCoverUrl;
    }

    public void setVideoCoverUrl(String videoCoverUrl) {
        this.videoCoverUrl = videoCoverUrl;
    }

    public SmartVideoLayerConfig withDisplayDuration(Integer displayDuration) {
        this.displayDuration = displayDuration;
        return this;
    }

    /**
     * 视频显示时长。单位s * 0 显示时长规则：若携带reply_texts，reply_audios，与播放语音内容时长保持一致； 未携带场景，与匹配的关键词语音内容时长保持一致
     * minimum: 0
     * maximum: 3600
     * @return displayDuration
     */
    public Integer getDisplayDuration() {
        return displayDuration;
    }

    public void setDisplayDuration(Integer displayDuration) {
        this.displayDuration = displayDuration;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SmartVideoLayerConfig that = (SmartVideoLayerConfig) obj;
        return Objects.equals(this.videoUrl, that.videoUrl) && Objects.equals(this.videoCoverUrl, that.videoCoverUrl)
            && Objects.equals(this.displayDuration, that.displayDuration);
    }

    @Override
    public int hashCode() {
        return Objects.hash(videoUrl, videoCoverUrl, displayDuration);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmartVideoLayerConfig {\n");
        sb.append("    videoUrl: ").append(toIndentedString(videoUrl)).append("\n");
        sb.append("    videoCoverUrl: ").append(toIndentedString(videoCoverUrl)).append("\n");
        sb.append("    displayDuration: ").append(toIndentedString(displayDuration)).append("\n");
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
