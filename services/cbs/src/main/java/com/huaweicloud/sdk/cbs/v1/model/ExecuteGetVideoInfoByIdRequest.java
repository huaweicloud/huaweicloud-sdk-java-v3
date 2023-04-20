package com.huaweicloud.sdk.cbs.v1.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ExecuteGetVideoInfoByIdRequest  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="video_id")
    

    private String videoId;

    public ExecuteGetVideoInfoByIdRequest withVideoId(String videoId) {
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ExecuteGetVideoInfoByIdRequest executeGetVideoInfoByIdRequest = (ExecuteGetVideoInfoByIdRequest) o;
        return Objects.equals(this.videoId, executeGetVideoInfoByIdRequest.videoId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(videoId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ExecuteGetVideoInfoByIdRequest {\n");
        sb.append("    videoId: ").append(toIndentedString(videoId)).append("\n");
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

