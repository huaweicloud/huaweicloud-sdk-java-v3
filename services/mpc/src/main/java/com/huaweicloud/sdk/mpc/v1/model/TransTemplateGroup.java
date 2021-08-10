package com.huaweicloud.sdk.mpc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** TransTemplateGroup */
public class TransTemplateGroup {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "videos")

    private List<VideoObj> videos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "audio")

    private Audio audio;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "video_common")

    private VideoCommon videoCommon;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "common")

    private Common common;

    public TransTemplateGroup withName(String name) {
        this.name = name;
        return this;
    }

    /** 模板组名称
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TransTemplateGroup withVideos(List<VideoObj> videos) {
        this.videos = videos;
        return this;
    }

    public TransTemplateGroup addVideosItem(VideoObj videosItem) {
        if (this.videos == null) {
            this.videos = new ArrayList<>();
        }
        this.videos.add(videosItem);
        return this;
    }

    public TransTemplateGroup withVideos(Consumer<List<VideoObj>> videosSetter) {
        if (this.videos == null) {
            this.videos = new ArrayList<>();
        }
        videosSetter.accept(this.videos);
        return this;
    }

    /** 视频信息列表
     * 
     * @return videos */
    public List<VideoObj> getVideos() {
        return videos;
    }

    public void setVideos(List<VideoObj> videos) {
        this.videos = videos;
    }

    public TransTemplateGroup withAudio(Audio audio) {
        this.audio = audio;
        return this;
    }

    public TransTemplateGroup withAudio(Consumer<Audio> audioSetter) {
        if (this.audio == null) {
            this.audio = new Audio();
            audioSetter.accept(this.audio);
        }

        return this;
    }

    /** Get audio
     * 
     * @return audio */
    public Audio getAudio() {
        return audio;
    }

    public void setAudio(Audio audio) {
        this.audio = audio;
    }

    public TransTemplateGroup withVideoCommon(VideoCommon videoCommon) {
        this.videoCommon = videoCommon;
        return this;
    }

    public TransTemplateGroup withVideoCommon(Consumer<VideoCommon> videoCommonSetter) {
        if (this.videoCommon == null) {
            this.videoCommon = new VideoCommon();
            videoCommonSetter.accept(this.videoCommon);
        }

        return this;
    }

    /** Get videoCommon
     * 
     * @return videoCommon */
    public VideoCommon getVideoCommon() {
        return videoCommon;
    }

    public void setVideoCommon(VideoCommon videoCommon) {
        this.videoCommon = videoCommon;
    }

    public TransTemplateGroup withCommon(Common common) {
        this.common = common;
        return this;
    }

    public TransTemplateGroup withCommon(Consumer<Common> commonSetter) {
        if (this.common == null) {
            this.common = new Common();
            commonSetter.accept(this.common);
        }

        return this;
    }

    /** Get common
     * 
     * @return common */
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
        TransTemplateGroup transTemplateGroup = (TransTemplateGroup) o;
        return Objects.equals(this.name, transTemplateGroup.name)
            && Objects.equals(this.videos, transTemplateGroup.videos)
            && Objects.equals(this.audio, transTemplateGroup.audio)
            && Objects.equals(this.videoCommon, transTemplateGroup.videoCommon)
            && Objects.equals(this.common, transTemplateGroup.common);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, videos, audio, videoCommon, common);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TransTemplateGroup {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    videos: ").append(toIndentedString(videos)).append("\n");
        sb.append("    audio: ").append(toIndentedString(audio)).append("\n");
        sb.append("    videoCommon: ").append(toIndentedString(videoCommon)).append("\n");
        sb.append("    common: ").append(toIndentedString(common)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
