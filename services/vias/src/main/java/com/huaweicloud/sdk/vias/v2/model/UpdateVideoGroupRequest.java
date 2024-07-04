package com.huaweicloud.sdk.vias.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateVideoGroupRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_group_id")

    private String videoGroupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateVideoGroupDto body;

    public UpdateVideoGroupRequest withVideoGroupId(String videoGroupId) {
        this.videoGroupId = videoGroupId;
        return this;
    }

    /**
     * 已创建成功的视频源分组id。只能由小写英文字母(a~z)、数字(0~9)、中划线(-)、下划线(\\_)组成长度范围是[4,36]
     * @return videoGroupId
     */
    public String getVideoGroupId() {
        return videoGroupId;
    }

    public void setVideoGroupId(String videoGroupId) {
        this.videoGroupId = videoGroupId;
    }

    public UpdateVideoGroupRequest withBody(UpdateVideoGroupDto body) {
        this.body = body;
        return this;
    }

    public UpdateVideoGroupRequest withBody(Consumer<UpdateVideoGroupDto> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateVideoGroupDto();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateVideoGroupDto getBody() {
        return body;
    }

    public void setBody(UpdateVideoGroupDto body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateVideoGroupRequest that = (UpdateVideoGroupRequest) obj;
        return Objects.equals(this.videoGroupId, that.videoGroupId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(videoGroupId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateVideoGroupRequest {\n");
        sb.append("    videoGroupId: ").append(toIndentedString(videoGroupId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
