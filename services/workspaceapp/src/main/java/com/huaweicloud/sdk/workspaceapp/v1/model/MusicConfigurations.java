package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * “音乐”文件夹重定向配置
 */
public class MusicConfigurations {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "music_status")

    private Integer musicStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "music_redirection_type")

    private Integer musicRedirectionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "music_storage_path")

    private String musicStoragePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "music_relative_path")

    private String musicRelativePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "music_exclusive_rights")

    private Integer musicExclusiveRights;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "music_move_contents")

    private Integer musicMoveContents;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "music_move_content_on_policy_removal")

    private Integer musicMoveContentOnPolicyRemoval;

    public MusicConfigurations withMusicStatus(Integer musicStatus) {
        this.musicStatus = musicStatus;
        return this;
    }

    /**
     * 配置文件夹重定向状态： 0: 未选取 1: 已选取
     * minimum: 0
     * maximum: 1
     * @return musicStatus
     */
    public Integer getMusicStatus() {
        return musicStatus;
    }

    public void setMusicStatus(Integer musicStatus) {
        this.musicStatus = musicStatus;
    }

    public MusicConfigurations withMusicRedirectionType(Integer musicRedirectionType) {
        this.musicRedirectionType = musicRedirectionType;
        return this;
    }

    /**
     * 配置文件夹重定向类型： 0: 远程 1: 本地
     * minimum: 0
     * maximum: 1
     * @return musicRedirectionType
     */
    public Integer getMusicRedirectionType() {
        return musicRedirectionType;
    }

    public void setMusicRedirectionType(Integer musicRedirectionType) {
        this.musicRedirectionType = musicRedirectionType;
    }

    public MusicConfigurations withMusicStoragePath(String musicStoragePath) {
        this.musicStoragePath = musicStoragePath;
        return this;
    }

    /**
     * 文件夹重定向(v2)用户存储路径。
     * @return musicStoragePath
     */
    public String getMusicStoragePath() {
        return musicStoragePath;
    }

    public void setMusicStoragePath(String musicStoragePath) {
        this.musicStoragePath = musicStoragePath;
    }

    public MusicConfigurations withMusicRelativePath(String musicRelativePath) {
        this.musicRelativePath = musicRelativePath;
        return this;
    }

    /**
     * 目标文件夹位置。
     * @return musicRelativePath
     */
    public String getMusicRelativePath() {
        return musicRelativePath;
    }

    public void setMusicRelativePath(String musicRelativePath) {
        this.musicRelativePath = musicRelativePath;
    }

    public MusicConfigurations withMusicExclusiveRights(Integer musicExclusiveRights) {
        this.musicExclusiveRights = musicExclusiveRights;
        return this;
    }

    /**
     * 是否开启用户对该文件夹的独占控制权限： 0: 禁用 1: 开启
     * minimum: 0
     * maximum: 1
     * @return musicExclusiveRights
     */
    public Integer getMusicExclusiveRights() {
        return musicExclusiveRights;
    }

    public void setMusicExclusiveRights(Integer musicExclusiveRights) {
        this.musicExclusiveRights = musicExclusiveRights;
    }

    public MusicConfigurations withMusicMoveContents(Integer musicMoveContents) {
        this.musicMoveContents = musicMoveContents;
        return this;
    }

    /**
     * 启用文件夹重定向策略时，是否将现有内容移动到新位置： 0: 否 1: 是
     * minimum: 0
     * maximum: 1
     * @return musicMoveContents
     */
    public Integer getMusicMoveContents() {
        return musicMoveContents;
    }

    public void setMusicMoveContents(Integer musicMoveContents) {
        this.musicMoveContents = musicMoveContents;
    }

    public MusicConfigurations withMusicMoveContentOnPolicyRemoval(Integer musicMoveContentOnPolicyRemoval) {
        this.musicMoveContentOnPolicyRemoval = musicMoveContentOnPolicyRemoval;
        return this;
    }

    /**
     * 禁用或删除策略时，是否将内容移回本地用户配置文件位置： 0: 否 1: 是
     * minimum: 0
     * maximum: 1
     * @return musicMoveContentOnPolicyRemoval
     */
    public Integer getMusicMoveContentOnPolicyRemoval() {
        return musicMoveContentOnPolicyRemoval;
    }

    public void setMusicMoveContentOnPolicyRemoval(Integer musicMoveContentOnPolicyRemoval) {
        this.musicMoveContentOnPolicyRemoval = musicMoveContentOnPolicyRemoval;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MusicConfigurations that = (MusicConfigurations) obj;
        return Objects.equals(this.musicStatus, that.musicStatus)
            && Objects.equals(this.musicRedirectionType, that.musicRedirectionType)
            && Objects.equals(this.musicStoragePath, that.musicStoragePath)
            && Objects.equals(this.musicRelativePath, that.musicRelativePath)
            && Objects.equals(this.musicExclusiveRights, that.musicExclusiveRights)
            && Objects.equals(this.musicMoveContents, that.musicMoveContents)
            && Objects.equals(this.musicMoveContentOnPolicyRemoval, that.musicMoveContentOnPolicyRemoval);
    }

    @Override
    public int hashCode() {
        return Objects.hash(musicStatus,
            musicRedirectionType,
            musicStoragePath,
            musicRelativePath,
            musicExclusiveRights,
            musicMoveContents,
            musicMoveContentOnPolicyRemoval);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MusicConfigurations {\n");
        sb.append("    musicStatus: ").append(toIndentedString(musicStatus)).append("\n");
        sb.append("    musicRedirectionType: ").append(toIndentedString(musicRedirectionType)).append("\n");
        sb.append("    musicStoragePath: ").append(toIndentedString(musicStoragePath)).append("\n");
        sb.append("    musicRelativePath: ").append(toIndentedString(musicRelativePath)).append("\n");
        sb.append("    musicExclusiveRights: ").append(toIndentedString(musicExclusiveRights)).append("\n");
        sb.append("    musicMoveContents: ").append(toIndentedString(musicMoveContents)).append("\n");
        sb.append("    musicMoveContentOnPolicyRemoval: ")
            .append(toIndentedString(musicMoveContentOnPolicyRemoval))
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
