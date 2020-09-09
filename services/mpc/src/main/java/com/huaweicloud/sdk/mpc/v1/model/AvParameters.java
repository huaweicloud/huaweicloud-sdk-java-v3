package com.huaweicloud.sdk.mpc.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mpc.v1.model.Audio;
import com.huaweicloud.sdk.mpc.v1.model.Common;
import com.huaweicloud.sdk.mpc.v1.model.VideoParameters;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * AvParameters
 */
public class AvParameters  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="video")
    
    private VideoParameters video = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="audio")
    
    private Audio audio = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="common")
    
    private Common common = null;

    public AvParameters withVideo(VideoParameters video) {
        this.video = video;
        return this;
    }

    public AvParameters withVideo(Consumer<VideoParameters> videoSetter) {
        if(this.video == null ){
            this.video = new VideoParameters();
            videoSetter.accept(this.video);
        }
        
        return this;
    }


    /**
     * Get video
     * @return video
     */
    public VideoParameters getVideo() {
        return video;
    }

    public void setVideo(VideoParameters video) {
        this.video = video;
    }

    public AvParameters withAudio(Audio audio) {
        this.audio = audio;
        return this;
    }

    public AvParameters withAudio(Consumer<Audio> audioSetter) {
        if(this.audio == null ){
            this.audio = new Audio();
            audioSetter.accept(this.audio);
        }
        
        return this;
    }


    /**
     * Get audio
     * @return audio
     */
    public Audio getAudio() {
        return audio;
    }

    public void setAudio(Audio audio) {
        this.audio = audio;
    }

    public AvParameters withCommon(Common common) {
        this.common = common;
        return this;
    }

    public AvParameters withCommon(Consumer<Common> commonSetter) {
        if(this.common == null ){
            this.common = new Common();
            commonSetter.accept(this.common);
        }
        
        return this;
    }


    /**
     * Get common
     * @return common
     */
    public Common getCommon() {
        return common;
    }

    public void setCommon(Common common) {
        this.common = common;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AvParameters avParameters = (AvParameters) o;
        return Objects.equals(this.video, avParameters.video) &&
            Objects.equals(this.audio, avParameters.audio) &&
            Objects.equals(this.common, avParameters.common);
    }
    @Override
    public int hashCode() {
        return Objects.hash(video, audio, common);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AvParameters {\n");
        sb.append("    video: ").append(toIndentedString(video)).append("\n");
        sb.append("    audio: ").append(toIndentedString(audio)).append("\n");
        sb.append("    common: ").append(toIndentedString(common)).append("\n");
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

