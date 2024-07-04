package com.huaweicloud.sdk.vias.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class UpdateVideoSourceRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_source_id")

    private String videoSourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateVideoSourceDto body;

    public UpdateVideoSourceRequest withVideoSourceId(String videoSourceId) {
        this.videoSourceId = videoSourceId;
        return this;
    }

    /**
     * 已创建成功的视频源id，只能由小写英文字母(a~z,)、数字(0~9)、中划线(-)、下划线(\\_)长度范围为[4, 36]
     * @return videoSourceId
     */
    public String getVideoSourceId() {
        return videoSourceId;
    }

    public void setVideoSourceId(String videoSourceId) {
        this.videoSourceId = videoSourceId;
    }

    public UpdateVideoSourceRequest withBody(UpdateVideoSourceDto body) {
        this.body = body;
        return this;
    }

    public UpdateVideoSourceRequest withBody(Consumer<UpdateVideoSourceDto> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateVideoSourceDto();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateVideoSourceDto getBody() {
        return body;
    }

    public void setBody(UpdateVideoSourceDto body) {
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
        UpdateVideoSourceRequest that = (UpdateVideoSourceRequest) obj;
        return Objects.equals(this.videoSourceId, that.videoSourceId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(videoSourceId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateVideoSourceRequest {\n");
        sb.append("    videoSourceId: ").append(toIndentedString(videoSourceId)).append("\n");
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
