package com.huaweicloud.sdk.live.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowStreamPortraitRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="play_domain")
    
    private String playDomain;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="stream")
    
    private String stream;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="time")
    
    private String time;

    public ShowStreamPortraitRequest withPlayDomain(String playDomain) {
        this.playDomain = playDomain;
        return this;
    }

    


    /**
     * Get playDomain
     * @return playDomain
     */
    public String getPlayDomain() {
        return playDomain;
    }

    public void setPlayDomain(String playDomain) {
        this.playDomain = playDomain;
    }

    

    public ShowStreamPortraitRequest withStream(String stream) {
        this.stream = stream;
        return this;
    }

    


    /**
     * Get stream
     * @return stream
     */
    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    

    public ShowStreamPortraitRequest withTime(String time) {
        this.time = time;
        return this;
    }

    


    /**
     * Get time
     * @return time
     */
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowStreamPortraitRequest showStreamPortraitRequest = (ShowStreamPortraitRequest) o;
        return Objects.equals(this.playDomain, showStreamPortraitRequest.playDomain) &&
            Objects.equals(this.stream, showStreamPortraitRequest.stream) &&
            Objects.equals(this.time, showStreamPortraitRequest.time);
    }
    @Override
    public int hashCode() {
        return Objects.hash(playDomain, stream, time);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowStreamPortraitRequest {\n");
        sb.append("    playDomain: ").append(toIndentedString(playDomain)).append("\n");
        sb.append("    stream: ").append(toIndentedString(stream)).append("\n");
        sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

