package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 分身数字人推理预处理视频标记信息。
 */
public class InferenceVideoMarkInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_start_time")

    private String videoStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_end_time")

    private String videoEndTime;

    public InferenceVideoMarkInfo withVideoStartTime(String videoStartTime) {
        this.videoStartTime = videoStartTime;
        return this;
    }

    /**
     * 选取推理数据预处理视频起始时间。格式：“HH:MM:SS.mmm”。
     * @return videoStartTime
     */
    public String getVideoStartTime() {
        return videoStartTime;
    }

    public void setVideoStartTime(String videoStartTime) {
        this.videoStartTime = videoStartTime;
    }

    public InferenceVideoMarkInfo withVideoEndTime(String videoEndTime) {
        this.videoEndTime = videoEndTime;
        return this;
    }

    /**
     * 选取推理数据预处理视频结束时间。格式：“HH:MM:SS.mmm”。
     * @return videoEndTime
     */
    public String getVideoEndTime() {
        return videoEndTime;
    }

    public void setVideoEndTime(String videoEndTime) {
        this.videoEndTime = videoEndTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InferenceVideoMarkInfo that = (InferenceVideoMarkInfo) obj;
        return Objects.equals(this.videoStartTime, that.videoStartTime)
            && Objects.equals(this.videoEndTime, that.videoEndTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(videoStartTime, videoEndTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InferenceVideoMarkInfo {\n");
        sb.append("    videoStartTime: ").append(toIndentedString(videoStartTime)).append("\n");
        sb.append("    videoEndTime: ").append(toIndentedString(videoEndTime)).append("\n");
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
