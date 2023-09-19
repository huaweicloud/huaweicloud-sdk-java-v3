package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 素材视频图层配置。
 */
public class VideoLayerConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_url")

    private String videoUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_cover_url")

    private String videoCoverUrl;

    public VideoLayerConfig withVideoUrl(String videoUrl) {
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

    public VideoLayerConfig withVideoCoverUrl(String videoCoverUrl) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VideoLayerConfig that = (VideoLayerConfig) obj;
        return Objects.equals(this.videoUrl, that.videoUrl) && Objects.equals(this.videoCoverUrl, that.videoCoverUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(videoUrl, videoCoverUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoLayerConfig {\n");
        sb.append("    videoUrl: ").append(toIndentedString(videoUrl)).append("\n");
        sb.append("    videoCoverUrl: ").append(toIndentedString(videoCoverUrl)).append("\n");
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
