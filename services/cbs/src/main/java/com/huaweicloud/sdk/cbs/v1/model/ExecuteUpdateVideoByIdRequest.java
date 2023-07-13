package com.huaweicloud.sdk.cbs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ExecuteUpdateVideoByIdRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_id")

    private String videoId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private UpdateReq body;

    public ExecuteUpdateVideoByIdRequest withVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }

    /**
     * 视频id
     * @return videoId
     */
    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }

    public ExecuteUpdateVideoByIdRequest withBody(UpdateReq body) {
        this.body = body;
        return this;
    }

    public ExecuteUpdateVideoByIdRequest withBody(Consumer<UpdateReq> bodySetter) {
        if (this.body == null) {
            this.body = new UpdateReq();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public UpdateReq getBody() {
        return body;
    }

    public void setBody(UpdateReq body) {
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
        ExecuteUpdateVideoByIdRequest that = (ExecuteUpdateVideoByIdRequest) obj;
        return Objects.equals(this.videoId, that.videoId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(videoId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecuteUpdateVideoByIdRequest {\n");
        sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
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
