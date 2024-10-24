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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "loop_count")

    private Integer loopCount;

    public VideoLayerConfig withVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }

    /**
     * **参数解释**： 视频文件的URL。 **约束限制**： * 仅直播支持外部URL，其他业务通过资产库查询获取，不支持外部URL。 **取值范围**： 字符长度1-2048位。 **默认取值**： 不涉及。
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
     * **参数解释**： 视频封面文件的URL。 **约束限制**： * 仅直播支持外部URL，其他业务通过资产库查询获取，不支持外部URL。 **取值范围**： 字符长度1-2048位。 **默认取值**： 不涉及。
     * @return videoCoverUrl
     */
    public String getVideoCoverUrl() {
        return videoCoverUrl;
    }

    public void setVideoCoverUrl(String videoCoverUrl) {
        this.videoCoverUrl = videoCoverUrl;
    }

    public VideoLayerConfig withLoopCount(Integer loopCount) {
        this.loopCount = loopCount;
        return this;
    }

    /**
     * **参数解释**： 循环播放视频次数。  特殊取值： * 0：表示不播放 * -1：表示持续循环播放  **约束限制**： 不涉及。
     * minimum: -1
     * maximum: 100
     * @return loopCount
     */
    public Integer getLoopCount() {
        return loopCount;
    }

    public void setLoopCount(Integer loopCount) {
        this.loopCount = loopCount;
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
        return Objects.equals(this.videoUrl, that.videoUrl) && Objects.equals(this.videoCoverUrl, that.videoCoverUrl)
            && Objects.equals(this.loopCount, that.loopCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(videoUrl, videoCoverUrl, loopCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoLayerConfig {\n");
        sb.append("    videoUrl: ").append(toIndentedString(videoUrl)).append("\n");
        sb.append("    videoCoverUrl: ").append(toIndentedString(videoCoverUrl)).append("\n");
        sb.append("    loopCount: ").append(toIndentedString(loopCount)).append("\n");
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
