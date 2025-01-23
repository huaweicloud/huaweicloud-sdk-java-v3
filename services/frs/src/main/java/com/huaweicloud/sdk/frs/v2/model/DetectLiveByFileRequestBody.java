package com.huaweicloud.sdk.frs.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.http.FormDataFilePart;
import com.huaweicloud.sdk.core.http.FormDataPart;
import com.huaweicloud.sdk.core.http.SdkFormDataBody;

import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * DetectLiveByFileRequestBody
 */
public class DetectLiveByFileRequestBody implements SdkFormDataBody {

    @JsonProperty(value = "video_file", access = JsonProperty.Access.WRITE_ONLY)

    private FormDataFilePart videoFile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "actions")

    private String actions;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_time")

    private String actionTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nod_threshold")

    private Double nodThreshold;

    public DetectLiveByFileRequestBody withVideoFile(FormDataFilePart videoFile) {
        this.videoFile = videoFile;
        return this;
    }

    /**
     * 本地视频文件。上传文件时，请求格式为multipart。 视频要求： • 视频文件大小不超过8MB，建议客户端压缩到200KB~2MB。 • 限制视频时长1～15秒。 • 建议帧率10fps～30fps。 • 封装格式：mp4、avi、flv、webm、asf、mov。 • 视频编码格式： h261、h263、h264、hevc、vc1、vp8、vp9、wmv3。
     * @return videoFile
     */
    public FormDataFilePart getVideoFile() {
        return videoFile;
    }

    public void setVideoFile(FormDataFilePart videoFile) {
        this.videoFile = videoFile;
    }

    public DetectLiveByFileRequestBody withActions(String actions) {
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

    public DetectLiveByFileRequestBody withActionTime(String actionTime) {
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

    public DetectLiveByFileRequestBody withNodThreshold(Double nodThreshold) {
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

    public DetectLiveByFileRequestBody withVideoFile(InputStream inputStream, String fileName, String contentType) {
        this.videoFile = new FormDataFilePart(inputStream, fileName).withContentType(contentType);
        return this;
    }

    public DetectLiveByFileRequestBody withVideoFile(InputStream inputStream, String fileName) {
        this.videoFile = new FormDataFilePart(inputStream, fileName);
        return this;
    }

    public DetectLiveByFileRequestBody withVideoFile(InputStream inputStream, String fileName,
        Map<String, String> headers) {
        this.videoFile = new FormDataFilePart(inputStream, fileName).withHeaders(headers);
        return this;
    }

    @Override
    public Map<String, FormDataPart<?>> buildFormData() {
        return new LinkedHashMap<String, FormDataPart<?>>() {

            private static final long serialVersionUID = 1L;
            {
                put("video_file", videoFile);
                put("actions", new FormDataPart<>(actions));
                if (actionTime != null) {
                    put("action_time", new FormDataPart<>(actionTime));
                }
                if (nodThreshold != null) {
                    put("nod_threshold", new FormDataPart<>(nodThreshold));
                }
            }
        };
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DetectLiveByFileRequestBody that = (DetectLiveByFileRequestBody) obj;
        return Objects.equals(this.videoFile, that.videoFile) && Objects.equals(this.actions, that.actions)
            && Objects.equals(this.actionTime, that.actionTime) && Objects.equals(this.nodThreshold, that.nodThreshold);
    }

    @Override
    public int hashCode() {
        return Objects.hash(videoFile, actions, actionTime, nodThreshold);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DetectLiveByFileRequestBody {\n");
        sb.append("    videoFile: ").append(toIndentedString("[resource:will-not-print]")).append("\n");
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
