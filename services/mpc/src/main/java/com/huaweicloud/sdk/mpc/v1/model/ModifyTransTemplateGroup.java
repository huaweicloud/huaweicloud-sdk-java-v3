package com.huaweicloud.sdk.mpc.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mpc.v1.model.Audio;
import com.huaweicloud.sdk.mpc.v1.model.Common;
import com.huaweicloud.sdk.mpc.v1.model.VideoCommon;
import com.huaweicloud.sdk.mpc.v1.model.VideoObj;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ModifyTransTemplateGroup
 */
public class ModifyTransTemplateGroup  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="group_id")
    
    private String groupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="videos")
    
    private List<VideoObj> videos = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="audio")
    
    private Audio audio;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="video_common")
    
    private VideoCommon videoCommon;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="common")
    
    private Common common;

    public ModifyTransTemplateGroup withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    


    /**
     * 模板组ID 
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    

    public ModifyTransTemplateGroup withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 模板组名称 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public ModifyTransTemplateGroup withVideos(List<VideoObj> videos) {
        this.videos = videos;
        return this;
    }

    
    public ModifyTransTemplateGroup addVideosItem(VideoObj videosItem) {
        if(this.videos == null) {
            this.videos = new ArrayList<>();
        }
        this.videos.add(videosItem);
        return this;
    }

    public ModifyTransTemplateGroup withVideos(Consumer<List<VideoObj>> videosSetter) {
        if(this.videos == null) {
            this.videos = new ArrayList<>();
        }
        videosSetter.accept(this.videos);
        return this;
    }

    /**
     * 视频信息列表 
     * @return videos
     */
    public List<VideoObj> getVideos() {
        return videos;
    }

    public void setVideos(List<VideoObj> videos) {
        this.videos = videos;
    }

    

    public ModifyTransTemplateGroup withAudio(Audio audio) {
        this.audio = audio;
        return this;
    }

    public ModifyTransTemplateGroup withAudio(Consumer<Audio> audioSetter) {
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

    

    public ModifyTransTemplateGroup withVideoCommon(VideoCommon videoCommon) {
        this.videoCommon = videoCommon;
        return this;
    }

    public ModifyTransTemplateGroup withVideoCommon(Consumer<VideoCommon> videoCommonSetter) {
        if(this.videoCommon == null ){
            this.videoCommon = new VideoCommon();
            videoCommonSetter.accept(this.videoCommon);
        }
        
        return this;
    }


    /**
     * Get videoCommon
     * @return videoCommon
     */
    public VideoCommon getVideoCommon() {
        return videoCommon;
    }

    public void setVideoCommon(VideoCommon videoCommon) {
        this.videoCommon = videoCommon;
    }

    

    public ModifyTransTemplateGroup withCommon(Common common) {
        this.common = common;
        return this;
    }

    public ModifyTransTemplateGroup withCommon(Consumer<Common> commonSetter) {
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
        ModifyTransTemplateGroup modifyTransTemplateGroup = (ModifyTransTemplateGroup) o;
        return Objects.equals(this.groupId, modifyTransTemplateGroup.groupId) &&
            Objects.equals(this.name, modifyTransTemplateGroup.name) &&
            Objects.equals(this.videos, modifyTransTemplateGroup.videos) &&
            Objects.equals(this.audio, modifyTransTemplateGroup.audio) &&
            Objects.equals(this.videoCommon, modifyTransTemplateGroup.videoCommon) &&
            Objects.equals(this.common, modifyTransTemplateGroup.common);
    }
    @Override
    public int hashCode() {
        return Objects.hash(groupId, name, videos, audio, videoCommon, common);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyTransTemplateGroup {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    videos: ").append(toIndentedString(videos)).append("\n");
        sb.append("    audio: ").append(toIndentedString(audio)).append("\n");
        sb.append("    videoCommon: ").append(toIndentedString(videoCommon)).append("\n");
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

