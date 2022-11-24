package com.huaweicloud.sdk.vod.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * QualityInfoList
 */
public class QualityInfoList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video")

    private VideoInfo video;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio")

    private AudioInfo audio;

    public QualityInfoList withVideo(VideoInfo video) {
        this.video = video;
        return this;
    }

    public QualityInfoList withVideo(Consumer<VideoInfo> videoSetter) {
        if (this.video == null) {
            this.video = new VideoInfo();
            videoSetter.accept(this.video);
        }

        return this;
    }

    /**
     * Get video
     * @return video
     */
    public VideoInfo getVideo() {
        return video;
    }

    public void setVideo(VideoInfo video) {
        this.video = video;
    }

    public QualityInfoList withAudio(AudioInfo audio) {
        this.audio = audio;
        return this;
    }

    public QualityInfoList withAudio(Consumer<AudioInfo> audioSetter) {
        if (this.audio == null) {
            this.audio = new AudioInfo();
            audioSetter.accept(this.audio);
        }

        return this;
    }

    /**
     * Get audio
     * @return audio
     */
    public AudioInfo getAudio() {
        return audio;
    }

    public void setAudio(AudioInfo audio) {
        this.audio = audio;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QualityInfoList qualityInfoList = (QualityInfoList) o;
        return Objects.equals(this.video, qualityInfoList.video) && Objects.equals(this.audio, qualityInfoList.audio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(video, audio);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QualityInfoList {\n");
        sb.append("    video: ").append(toIndentedString(video)).append("\n");
        sb.append("    audio: ").append(toIndentedString(audio)).append("\n");
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
