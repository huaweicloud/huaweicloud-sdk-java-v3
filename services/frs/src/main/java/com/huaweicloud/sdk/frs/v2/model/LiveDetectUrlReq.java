package com.huaweicloud.sdk.frs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * LiveDetectUrlReq
 */
public class LiveDetectUrlReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_url")

    private String videoUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actions")

    private String actions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_time")

    private String actionTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nod_threshold")

    private Double nodThreshold;

    public LiveDetectUrlReq withVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }

    /**
     * [视频的URL路径，目前仅支持华为云上OBS的URL，且人脸识别服务有权限读取该OBS桶的数据。 开通读取权限的操作请参见[服务授权](https://support.huaweicloud.com/api-face/face_02_0006.html)。视频要求： • 视频Base64编码后大小不超过8MB。 • 限制视频时长1～15秒。 • 建议帧率10fps～30fps。 • 封装格式：mp4、avi、flv、webm、asf、mov。 • 视频编码格式： h261、h263、h264、hevc、vc1、vp8、vp9、wmv3。](tag:hc) [视频的URL路径，目前仅支持华为云上OBS的URL，且人脸识别服务有权限读取该OBS桶的数据。           开通读取权限的操作请参见[服务授权](https://support.huaweicloud.com/intl/zh-cn/api-face/face_02_0006.html)。视频要求：           • 视频Base64编码后大小不超过8MB。           • 限制视频时长1～15秒。           • 建议帧率10fps～30fps。           • 封装格式：mp4、avi、flv、webm、asf、mov。           • 视频编码格式： h261、h263、h264、hevc、vc1、vp8、vp9、wmv3。](tag:hk)
     * @return videoUrl
     */
    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public LiveDetectUrlReq withActions(String actions) {
        this.actions = actions;
        return this;
    }

    /**
     * 动作代码顺序列表，英文逗号（,）分隔。建议单动作，目前支持的动作有： • 1：左摇头 • 2：右摇头 • 3：点头 • 4：嘴部动作 • 5：眨眼
     * @return actions
     */
    public String getActions() {
        return actions;
    }

    public void setActions(String actions) {
        this.actions = actions;
    }

    public LiveDetectUrlReq withActionTime(String actionTime) {
        this.actionTime = actionTime;
        return this;
    }

    /**
     * 该参数为动作时间数组拼接的字符串，数组的长度和actions的数量一致，每一项代表了对应次序动作的起始时间和结束时间，单位为距视频开始的毫秒数。
     * @return actionTime
     */
    public String getActionTime() {
        return actionTime;
    }

    public void setActionTime(String actionTime) {
        this.actionTime = actionTime;
    }

    public LiveDetectUrlReq withNodThreshold(Double nodThreshold) {
        this.nodThreshold = nodThreshold;
        return this;
    }

    /**
     * 该参数为点头动作幅度的判断门限，取值范围：[1,90]，默认为10，单位为度。该值设置越大，则越难判断为点头。
     * @return nodThreshold
     */
    public Double getNodThreshold() {
        return nodThreshold;
    }

    public void setNodThreshold(Double nodThreshold) {
        this.nodThreshold = nodThreshold;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LiveDetectUrlReq that = (LiveDetectUrlReq) obj;
        return Objects.equals(this.videoUrl, that.videoUrl) && Objects.equals(this.actions, that.actions)
            && Objects.equals(this.actionTime, that.actionTime) && Objects.equals(this.nodThreshold, that.nodThreshold);
    }

    @Override
    public int hashCode() {
        return Objects.hash(videoUrl, actions, actionTime, nodThreshold);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LiveDetectUrlReq {\n");
        sb.append("    videoUrl: ").append(toIndentedString(videoUrl)).append("\n");
        sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
        sb.append("    actionTime: ").append(toIndentedString(actionTime)).append("\n");
        sb.append("    nodThreshold: ").append(toIndentedString(nodThreshold)).append("\n");
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
