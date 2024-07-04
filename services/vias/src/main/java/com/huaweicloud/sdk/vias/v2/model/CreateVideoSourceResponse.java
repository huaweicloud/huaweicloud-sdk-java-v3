package com.huaweicloud.sdk.vias.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CreateVideoSourceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_source_id")

    private String videoSourceId;

    public CreateVideoSourceResponse withVideoSourceId(String videoSourceId) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateVideoSourceResponse that = (CreateVideoSourceResponse) obj;
        return Objects.equals(this.videoSourceId, that.videoSourceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(videoSourceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateVideoSourceResponse {\n");
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
