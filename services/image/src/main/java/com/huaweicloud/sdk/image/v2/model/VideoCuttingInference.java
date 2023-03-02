package com.huaweicloud.sdk.image.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 视频剪切服务推理分段参数
 */
public class VideoCuttingInference {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "segment_info")

    private List<VideoSegmentInfo> segmentInfo = null;

    public VideoCuttingInference withSegmentInfo(List<VideoSegmentInfo> segmentInfo) {
        this.segmentInfo = segmentInfo;
        return this;
    }

    public VideoCuttingInference addSegmentInfoItem(VideoSegmentInfo segmentInfoItem) {
        if (this.segmentInfo == null) {
            this.segmentInfo = new ArrayList<>();
        }
        this.segmentInfo.add(segmentInfoItem);
        return this;
    }

    public VideoCuttingInference withSegmentInfo(Consumer<List<VideoSegmentInfo>> segmentInfoSetter) {
        if (this.segmentInfo == null) {
            this.segmentInfo = new ArrayList<>();
        }
        segmentInfoSetter.accept(this.segmentInfo);
        return this;
    }

    /**
     * 视频剪切服务推理分段参数
     * @return segmentInfo
     */
    public List<VideoSegmentInfo> getSegmentInfo() {
        return segmentInfo;
    }

    public void setSegmentInfo(List<VideoSegmentInfo> segmentInfo) {
        this.segmentInfo = segmentInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        VideoCuttingInference videoCuttingInference = (VideoCuttingInference) o;
        return Objects.equals(this.segmentInfo, videoCuttingInference.segmentInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(segmentInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideoCuttingInference {\n");
        sb.append("    segmentInfo: ").append(toIndentedString(segmentInfo)).append("\n");
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
