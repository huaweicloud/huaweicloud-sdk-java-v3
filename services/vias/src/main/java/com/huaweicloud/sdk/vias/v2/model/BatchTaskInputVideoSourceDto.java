package com.huaweicloud.sdk.vias.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BatchTaskInputVideoSourceDto
 */
public class BatchTaskInputVideoSourceDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_source_id")

    private String videoSourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_roi")

    private String targetRoi;

    public BatchTaskInputVideoSourceDto withVideoSourceId(String videoSourceId) {
        this.videoSourceId = videoSourceId;
        return this;
    }

    /**
     * 视频源id
     * @return videoSourceId
     */
    public String getVideoSourceId() {
        return videoSourceId;
    }

    public void setVideoSourceId(String videoSourceId) {
        this.videoSourceId = videoSourceId;
    }

    public BatchTaskInputVideoSourceDto withTargetRoi(String targetRoi) {
        this.targetRoi = targetRoi;
        return this;
    }

    /**
     * roi区域
     * @return targetRoi
     */
    public String getTargetRoi() {
        return targetRoi;
    }

    public void setTargetRoi(String targetRoi) {
        this.targetRoi = targetRoi;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchTaskInputVideoSourceDto that = (BatchTaskInputVideoSourceDto) obj;
        return Objects.equals(this.videoSourceId, that.videoSourceId) && Objects.equals(this.targetRoi, that.targetRoi);
    }

    @Override
    public int hashCode() {
        return Objects.hash(videoSourceId, targetRoi);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchTaskInputVideoSourceDto {\n");
        sb.append("    videoSourceId: ").append(toIndentedString(videoSourceId)).append("\n");
        sb.append("    targetRoi: ").append(toIndentedString(targetRoi)).append("\n");
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
