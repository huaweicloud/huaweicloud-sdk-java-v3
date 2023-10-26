package com.huaweicloud.sdk.moderation.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 视频流数据输入
 */
public class VideoStreamCreateRequestData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "frame_interval")

    private Integer frameInterval;

    public VideoStreamCreateRequestData withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 视频流url，支持rtmp、rtmps、hls、http、https等主流协议。
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public VideoStreamCreateRequestData withFrameInterval(Integer frameInterval) {
        this.frameInterval = frameInterval;
        return this;
    }

    /**
     * 截帧频率间隔，单位为秒，取值范围为1~60s；若不传递默认5s截帧一次
     * @return frameInterval
     */
    public Integer getFrameInterval() {
        return frameInterval;
    }

    public void setFrameInterval(Integer frameInterval) {
        this.frameInterval = frameInterval;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VideoStreamCreateRequestData that = (VideoStreamCreateRequestData) obj;
        return Objects.equals(this.url, that.url) && Objects.equals(this.frameInterval, that.frameInterval);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, frameInterval);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoStreamCreateRequestData {\n");
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
