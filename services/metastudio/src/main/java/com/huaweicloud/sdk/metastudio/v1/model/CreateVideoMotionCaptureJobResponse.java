package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateVideoMotionCaptureJobResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rtc_room_info")

    private RTCRoomInfoList rtcRoomInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public CreateVideoMotionCaptureJobResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 视频驱动动作任务ID
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public CreateVideoMotionCaptureJobResponse withRtcRoomInfo(RTCRoomInfoList rtcRoomInfo) {
        this.rtcRoomInfo = rtcRoomInfo;
        return this;
    }

    public CreateVideoMotionCaptureJobResponse withRtcRoomInfo(Consumer<RTCRoomInfoList> rtcRoomInfoSetter) {
        if (this.rtcRoomInfo == null) {
            this.rtcRoomInfo = new RTCRoomInfoList();
            rtcRoomInfoSetter.accept(this.rtcRoomInfo);
        }

        return this;
    }

    /**
     * Get rtcRoomInfo
     * @return rtcRoomInfo
     */
    public RTCRoomInfoList getRtcRoomInfo() {
        return rtcRoomInfo;
    }

    public void setRtcRoomInfo(RTCRoomInfoList rtcRoomInfo) {
        this.rtcRoomInfo = rtcRoomInfo;
    }

    public CreateVideoMotionCaptureJobResponse withXRequestId(String xRequestId) {
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
        CreateVideoMotionCaptureJobResponse that = (CreateVideoMotionCaptureJobResponse) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.rtcRoomInfo, that.rtcRoomInfo)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, rtcRoomInfo, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVideoMotionCaptureJobResponse {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    rtcRoomInfo: ").append(toIndentedString(rtcRoomInfo)).append("\n");
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
