package com.huaweicloud.sdk.moderation.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 创建作业时传的data参数
 */
public class VideoModerationResultRequestParamsData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frame_interval")

    private Integer frameInterval;

    public VideoModerationResultRequestParamsData withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 创建作业时传的url参数
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public VideoModerationResultRequestParamsData withFrameInterval(Integer frameInterval) {
        this.frameInterval = frameInterval;
        return this;
    }

    /**
     * 创建作业时传的frame_interval参数，默认为5秒截取一帧
     * @return frameInterval
     */
    public Integer getFrameInterval() {
        return frameInterval;
    }

    public void setFrameInterval(Integer frameInterval) {
        this.frameInterval = frameInterval;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VideoModerationResultRequestParamsData videoModerationResultRequestParamsData =
            (VideoModerationResultRequestParamsData) o;
        return Objects.equals(this.url, videoModerationResultRequestParamsData.url)
            && Objects.equals(this.frameInterval, videoModerationResultRequestParamsData.frameInterval);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, frameInterval);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoModerationResultRequestParamsData {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    frameInterval: ").append(toIndentedString(frameInterval)).append("\n");
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
