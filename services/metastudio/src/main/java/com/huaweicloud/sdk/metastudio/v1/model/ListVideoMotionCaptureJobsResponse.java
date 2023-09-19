package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListVideoMotionCaptureJobsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_motion_capture_jobs")

    private List<VideoMotionCaptureInfo> videoMotionCaptureJobs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public ListVideoMotionCaptureJobsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 视频驱动任务总数。
     * minimum: 0
     * maximum: 2147483647
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public ListVideoMotionCaptureJobsResponse withVideoMotionCaptureJobs(
        List<VideoMotionCaptureInfo> videoMotionCaptureJobs) {
        this.videoMotionCaptureJobs = videoMotionCaptureJobs;
        return this;
    }

    public ListVideoMotionCaptureJobsResponse addVideoMotionCaptureJobsItem(
        VideoMotionCaptureInfo videoMotionCaptureJobsItem) {
        if (this.videoMotionCaptureJobs == null) {
            this.videoMotionCaptureJobs = new ArrayList<>();
        }
        this.videoMotionCaptureJobs.add(videoMotionCaptureJobsItem);
        return this;
    }

    public ListVideoMotionCaptureJobsResponse withVideoMotionCaptureJobs(
        Consumer<List<VideoMotionCaptureInfo>> videoMotionCaptureJobsSetter) {
        if (this.videoMotionCaptureJobs == null) {
            this.videoMotionCaptureJobs = new ArrayList<>();
        }
        videoMotionCaptureJobsSetter.accept(this.videoMotionCaptureJobs);
        return this;
    }

    /**
     * 视频驱动任务列表。
     * @return videoMotionCaptureJobs
     */
    public List<VideoMotionCaptureInfo> getVideoMotionCaptureJobs() {
        return videoMotionCaptureJobs;
    }

    public void setVideoMotionCaptureJobs(List<VideoMotionCaptureInfo> videoMotionCaptureJobs) {
        this.videoMotionCaptureJobs = videoMotionCaptureJobs;
    }

    public ListVideoMotionCaptureJobsResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListVideoMotionCaptureJobsResponse that = (ListVideoMotionCaptureJobsResponse) obj;
        return Objects.equals(this.total, that.total)
            && Objects.equals(this.videoMotionCaptureJobs, that.videoMotionCaptureJobs)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(total, videoMotionCaptureJobs, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListVideoMotionCaptureJobsResponse {\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    videoMotionCaptureJobs: ").append(toIndentedString(videoMotionCaptureJobs)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
