package com.huaweicloud.sdk.mpc.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mpc.v1.model.Audio;
import com.huaweicloud.sdk.mpc.v1.model.Common;
import com.huaweicloud.sdk.mpc.v1.model.VideoAndTemplate;
import com.huaweicloud.sdk.mpc.v1.model.VideoCommon;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * TemplateGroup
 */
public class TemplateGroup  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="group_id")
    
    private String groupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="template_ids")
    
    private List<Integer> templateIds = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="videos")
    
    private List<VideoAndTemplate> videos = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="audio")
    
    private Audio audio;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="video_common")
    
    private VideoCommon videoCommon;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="common")
    
    private Common common;

    public TemplateGroup withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    


    /**
     * 模板组id 
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    

    public TemplateGroup withName(String name) {
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

    

    public TemplateGroup withTemplateIds(List<Integer> templateIds) {
        this.templateIds = templateIds;
        return this;
    }

    
    public TemplateGroup addTemplateIdsItem(Integer templateIdsItem) {
        this.templateIds.add(templateIdsItem);
        return this;
    }

    public TemplateGroup withTemplateIds(Consumer<List<Integer>> templateIdsSetter) {
        if(this.templateIds == null ){
            this.templateIds = new ArrayList<>();
        }
        templateIdsSetter.accept(this.templateIds);
        return this;
    }

    /**
     * 模板组模板ID 
     * @return templateIds
     */
    public List<Integer> getTemplateIds() {
        return templateIds;
    }

    public void setTemplateIds(List<Integer> templateIds) {
        this.templateIds = templateIds;
    }

    

    public TemplateGroup withVideos(List<VideoAndTemplate> videos) {
        this.videos = videos;
        return this;
    }

    
    public TemplateGroup addVideosItem(VideoAndTemplate videosItem) {
        this.videos.add(videosItem);
        return this;
    }

    public TemplateGroup withVideos(Consumer<List<VideoAndTemplate>> videosSetter) {
        if(this.videos == null ){
            this.videos = new ArrayList<>();
        }
        videosSetter.accept(this.videos);
        return this;
    }

    /**
     * 视频信息列表 
     * @return videos
     */
    public List<VideoAndTemplate> getVideos() {
        return videos;
    }

    public void setVideos(List<VideoAndTemplate> videos) {
        this.videos = videos;
    }

    

    public TemplateGroup withAudio(Audio audio) {
        this.audio = audio;
        return this;
    }

    public TemplateGroup withAudio(Consumer<Audio> audioSetter) {
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

    

    public TemplateGroup withVideoCommon(VideoCommon videoCommon) {
        this.videoCommon = videoCommon;
        return this;
    }

    public TemplateGroup withVideoCommon(Consumer<VideoCommon> videoCommonSetter) {
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

    

    public TemplateGroup withCommon(Common common) {
        this.common = common;
        return this;
    }

    public TemplateGroup withCommon(Consumer<Common> commonSetter) {
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
        TemplateGroup templateGroup = (TemplateGroup) o;
        return Objects.equals(this.groupId, templateGroup.groupId) &&
            Objects.equals(this.name, templateGroup.name) &&
            Objects.equals(this.templateIds, templateGroup.templateIds) &&
            Objects.equals(this.videos, templateGroup.videos) &&
            Objects.equals(this.audio, templateGroup.audio) &&
            Objects.equals(this.videoCommon, templateGroup.videoCommon) &&
            Objects.equals(this.common, templateGroup.common);
    }
    @Override
    public int hashCode() {
        return Objects.hash(groupId, name, templateIds, videos, audio, videoCommon, common);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateGroup {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    templateIds: ").append(toIndentedString(templateIds)).append("\n");
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

