package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class StartSmartLiveResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_id")

    private String jobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rtc_room_info")

    private RTCRoomInfoList rtcRoomInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "live_event_report_url")

    private String liveEventReportUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Request-Id")

    private String xRequestId;

    public StartSmartLiveResponse withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * 直播任务ID。
     * @return jobId
     */
    public String getJobId() {
        return jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public StartSmartLiveResponse withRtcRoomInfo(RTCRoomInfoList rtcRoomInfo) {
        this.rtcRoomInfo = rtcRoomInfo;
        return this;
    }

    public StartSmartLiveResponse withRtcRoomInfo(Consumer<RTCRoomInfoList> rtcRoomInfoSetter) {
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

    public StartSmartLiveResponse withLiveEventReportUrl(String liveEventReportUrl) {
        this.liveEventReportUrl = liveEventReportUrl;
        return this;
    }

    /**
     * 直播事件上报地址。用户将自行获取的直播间事件上报到此地址，用于触发智能互动，自动回复话术。
     * @return liveEventReportUrl
     */
    public String getLiveEventReportUrl() {
        return liveEventReportUrl;
    }

    public void setLiveEventReportUrl(String liveEventReportUrl) {
        this.liveEventReportUrl = liveEventReportUrl;
    }

    public StartSmartLiveResponse withXRequestId(String xRequestId) {
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
        StartSmartLiveResponse that = (StartSmartLiveResponse) obj;
        return Objects.equals(this.jobId, that.jobId) && Objects.equals(this.rtcRoomInfo, that.rtcRoomInfo)
            && Objects.equals(this.liveEventReportUrl, that.liveEventReportUrl)
            && Objects.equals(this.xRequestId, that.xRequestId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, rtcRoomInfo, liveEventReportUrl, xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartSmartLiveResponse {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    rtcRoomInfo: ").append(toIndentedString(rtcRoomInfo)).append("\n");
        sb.append("    liveEventReportUrl: ").append(toIndentedString(liveEventReportUrl)).append("\n");
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
