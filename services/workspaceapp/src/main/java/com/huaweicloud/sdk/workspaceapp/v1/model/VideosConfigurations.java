package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * “视频”文件夹重定向配置
 */
public class VideosConfigurations {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "videos_status")

    private Integer videosStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "videos_redirection_type")

    private Integer videosRedirectionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "videos_storage_path")

    private String videosStoragePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "videos_relative_path")

    private String videosRelativePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "videos_exclusive_rights")

    private Integer videosExclusiveRights;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "videos_move_contents")

    private Integer videosMoveContents;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "videos_move_content_on_policy_removal")

    private Integer videosMoveContentOnPolicyRemoval;

    public VideosConfigurations withVideosStatus(Integer videosStatus) {
        this.videosStatus = videosStatus;
        return this;
    }

    /**
     * 配置文件夹重定向状态： 0: 未选取 1: 已选取
     * minimum: 0
     * maximum: 1
     * @return videosStatus
     */
    public Integer getVideosStatus() {
        return videosStatus;
    }

    public void setVideosStatus(Integer videosStatus) {
        this.videosStatus = videosStatus;
    }

    public VideosConfigurations withVideosRedirectionType(Integer videosRedirectionType) {
        this.videosRedirectionType = videosRedirectionType;
        return this;
    }

    /**
     * 配置文件夹重定向类型： 0: 远程 1: 本地
     * minimum: 0
     * maximum: 1
     * @return videosRedirectionType
     */
    public Integer getVideosRedirectionType() {
        return videosRedirectionType;
    }

    public void setVideosRedirectionType(Integer videosRedirectionType) {
        this.videosRedirectionType = videosRedirectionType;
    }

    public VideosConfigurations withVideosStoragePath(String videosStoragePath) {
        this.videosStoragePath = videosStoragePath;
        return this;
    }

    /**
     * 文件夹重定向(v2)用户存储路径。
     * @return videosStoragePath
     */
    public String getVideosStoragePath() {
        return videosStoragePath;
    }

    public void setVideosStoragePath(String videosStoragePath) {
        this.videosStoragePath = videosStoragePath;
    }

    public VideosConfigurations withVideosRelativePath(String videosRelativePath) {
        this.videosRelativePath = videosRelativePath;
        return this;
    }

    /**
     * 目标文件夹位置。
     * @return videosRelativePath
     */
    public String getVideosRelativePath() {
        return videosRelativePath;
    }

    public void setVideosRelativePath(String videosRelativePath) {
        this.videosRelativePath = videosRelativePath;
    }

    public VideosConfigurations withVideosExclusiveRights(Integer videosExclusiveRights) {
        this.videosExclusiveRights = videosExclusiveRights;
        return this;
    }

    /**
     * 是否开启用户对该文件夹的独占控制权限： 0: 禁用 1: 开启
     * minimum: 0
     * maximum: 1
     * @return videosExclusiveRights
     */
    public Integer getVideosExclusiveRights() {
        return videosExclusiveRights;
    }

    public void setVideosExclusiveRights(Integer videosExclusiveRights) {
        this.videosExclusiveRights = videosExclusiveRights;
    }

    public VideosConfigurations withVideosMoveContents(Integer videosMoveContents) {
        this.videosMoveContents = videosMoveContents;
        return this;
    }

    /**
     * 启用文件夹重定向策略时，是否将现有内容移动到新位置： 0: 否 1: 是
     * minimum: 0
     * maximum: 1
     * @return videosMoveContents
     */
    public Integer getVideosMoveContents() {
        return videosMoveContents;
    }

    public void setVideosMoveContents(Integer videosMoveContents) {
        this.videosMoveContents = videosMoveContents;
    }

    public VideosConfigurations withVideosMoveContentOnPolicyRemoval(Integer videosMoveContentOnPolicyRemoval) {
        this.videosMoveContentOnPolicyRemoval = videosMoveContentOnPolicyRemoval;
        return this;
    }

    /**
     * 禁用或删除策略时，是否将内容移回本地用户配置文件位置： 0: 否 1: 是
     * minimum: 0
     * maximum: 1
     * @return videosMoveContentOnPolicyRemoval
     */
    public Integer getVideosMoveContentOnPolicyRemoval() {
        return videosMoveContentOnPolicyRemoval;
    }

    public void setVideosMoveContentOnPolicyRemoval(Integer videosMoveContentOnPolicyRemoval) {
        this.videosMoveContentOnPolicyRemoval = videosMoveContentOnPolicyRemoval;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VideosConfigurations that = (VideosConfigurations) obj;
        return Objects.equals(this.videosStatus, that.videosStatus)
            && Objects.equals(this.videosRedirectionType, that.videosRedirectionType)
            && Objects.equals(this.videosStoragePath, that.videosStoragePath)
            && Objects.equals(this.videosRelativePath, that.videosRelativePath)
            && Objects.equals(this.videosExclusiveRights, that.videosExclusiveRights)
            && Objects.equals(this.videosMoveContents, that.videosMoveContents)
            && Objects.equals(this.videosMoveContentOnPolicyRemoval, that.videosMoveContentOnPolicyRemoval);
    }

    @Override
    public int hashCode() {
        return Objects.hash(videosStatus,
            videosRedirectionType,
            videosStoragePath,
            videosRelativePath,
            videosExclusiveRights,
            videosMoveContents,
            videosMoveContentOnPolicyRemoval);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VideosConfigurations {\n");
        sb.append("    videosStatus: ").append(toIndentedString(videosStatus)).append("\n");
        sb.append("    videosRedirectionType: ").append(toIndentedString(videosRedirectionType)).append("\n");
        sb.append("    videosStoragePath: ").append(toIndentedString(videosStoragePath)).append("\n");
        sb.append("    videosRelativePath: ").append(toIndentedString(videosRelativePath)).append("\n");
        sb.append("    videosExclusiveRights: ").append(toIndentedString(videosExclusiveRights)).append("\n");
        sb.append("    videosMoveContents: ").append(toIndentedString(videosMoveContents)).append("\n");
        sb.append("    videosMoveContentOnPolicyRemoval: ")
            .append(toIndentedString(videosMoveContentOnPolicyRemoval))
            .append("\n");
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
