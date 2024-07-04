package com.huaweicloud.sdk.vias.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteVideoSourceRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_source_id")

    private String videoSourceId;

    public DeleteVideoSourceRequest withVideoSourceId(String videoSourceId) {
        this.videoSourceId = videoSourceId;
        return this;
    }

    /**
     * 已创建成功的视频源id，只能由小写英文字母(a~z)、数字(0~9)组成、 中划线(-)、下划线(\\_)长度范围为[4, 36]
     * @return videoSourceId
     */
    public String getVideoSourceId() {
        return videoSourceId;
    }

    public void setVideoSourceId(String videoSourceId) {
        this.videoSourceId = videoSourceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteVideoSourceRequest that = (DeleteVideoSourceRequest) obj;
        return Objects.equals(this.videoSourceId, that.videoSourceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(videoSourceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteVideoSourceRequest {\n");
        sb.append("    videoSourceId: ").append(toIndentedString(videoSourceId)).append("\n");
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
