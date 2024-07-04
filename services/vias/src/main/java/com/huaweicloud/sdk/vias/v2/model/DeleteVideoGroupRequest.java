package com.huaweicloud.sdk.vias.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteVideoGroupRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_group_id")

    private String videoGroupId;

    public DeleteVideoGroupRequest withVideoGroupId(String videoGroupId) {
        this.videoGroupId = videoGroupId;
        return this;
    }

    /**
     * 视频源分组id，只能由小写英文字母(a~z,)、数字(0~9)、中划线(-)、下划线(\\_)长度范围为[4, 36]
     * @return videoGroupId
     */
    public String getVideoGroupId() {
        return videoGroupId;
    }

    public void setVideoGroupId(String videoGroupId) {
        this.videoGroupId = videoGroupId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteVideoGroupRequest that = (DeleteVideoGroupRequest) obj;
        return Objects.equals(this.videoGroupId, that.videoGroupId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(videoGroupId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteVideoGroupRequest {\n");
        sb.append("    videoGroupId: ").append(toIndentedString(videoGroupId)).append("\n");
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
