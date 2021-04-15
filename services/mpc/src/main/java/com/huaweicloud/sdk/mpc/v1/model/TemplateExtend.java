package com.huaweicloud.sdk.mpc.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mpc.v1.model.AudioExtendSettings;
import com.huaweicloud.sdk.mpc.v1.model.VideoExtendSettings;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * TemplateExtend
 */
public class TemplateExtend  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="audio")
    
    private AudioExtendSettings audio;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="video")
    
    private VideoExtendSettings video;

    public TemplateExtend withAudio(AudioExtendSettings audio) {
        this.audio = audio;
        return this;
    }

    public TemplateExtend withAudio(Consumer<AudioExtendSettings> audioSetter) {
        if(this.audio == null ){
            this.audio = new AudioExtendSettings();
            audioSetter.accept(this.audio);
        }
        
        return this;
    }


    /**
     * Get audio
     * @return audio
     */
    public AudioExtendSettings getAudio() {
        return audio;
    }

    public void setAudio(AudioExtendSettings audio) {
        this.audio = audio;
    }

    

    public TemplateExtend withVideo(VideoExtendSettings video) {
        this.video = video;
        return this;
    }

    public TemplateExtend withVideo(Consumer<VideoExtendSettings> videoSetter) {
        if(this.video == null ){
            this.video = new VideoExtendSettings();
            videoSetter.accept(this.video);
        }
        
        return this;
    }


    /**
     * Get video
     * @return video
     */
    public VideoExtendSettings getVideo() {
        return video;
    }

    public void setVideo(VideoExtendSettings video) {
        this.video = video;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TemplateExtend templateExtend = (TemplateExtend) o;
        return Objects.equals(this.audio, templateExtend.audio) &&
            Objects.equals(this.video, templateExtend.video);
    }
    @Override
    public int hashCode() {
        return Objects.hash(audio, video);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateExtend {\n");
        sb.append("    audio: ").append(toIndentedString(audio)).append("\n");
        sb.append("    video: ").append(toIndentedString(video)).append("\n");
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

