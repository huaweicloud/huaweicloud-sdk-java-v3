package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * “保存的游戏”文件夹重定向配置
 */
public class SavedGamesConfigurations {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "saved_games_status")

    private Integer savedGamesStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "saved_games_redirection_type")

    private Integer savedGamesRedirectionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "saved_games_storage_path")

    private String savedGamesStoragePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "saved_games_relative_path")

    private String savedGamesRelativePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "saved_games_exclusive_rights")

    private Integer savedGamesExclusiveRights;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "saved_games_move_contents")

    private Integer savedGamesMoveContents;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "saved_games_move_content_on_policy_removal")

    private Integer savedGamesMoveContentOnPolicyRemoval;

    public SavedGamesConfigurations withSavedGamesStatus(Integer savedGamesStatus) {
        this.savedGamesStatus = savedGamesStatus;
        return this;
    }

    /**
     * 配置文件夹重定向状态： 0: 未选取 1: 已选取
     * minimum: 0
     * maximum: 1
     * @return savedGamesStatus
     */
    public Integer getSavedGamesStatus() {
        return savedGamesStatus;
    }

    public void setSavedGamesStatus(Integer savedGamesStatus) {
        this.savedGamesStatus = savedGamesStatus;
    }

    public SavedGamesConfigurations withSavedGamesRedirectionType(Integer savedGamesRedirectionType) {
        this.savedGamesRedirectionType = savedGamesRedirectionType;
        return this;
    }

    /**
     * 配置文件夹重定向类型： 0: 远程 1: 本地
     * minimum: 0
     * maximum: 1
     * @return savedGamesRedirectionType
     */
    public Integer getSavedGamesRedirectionType() {
        return savedGamesRedirectionType;
    }

    public void setSavedGamesRedirectionType(Integer savedGamesRedirectionType) {
        this.savedGamesRedirectionType = savedGamesRedirectionType;
    }

    public SavedGamesConfigurations withSavedGamesStoragePath(String savedGamesStoragePath) {
        this.savedGamesStoragePath = savedGamesStoragePath;
        return this;
    }

    /**
     * 文件夹重定向(v2)用户存储路径。
     * @return savedGamesStoragePath
     */
    public String getSavedGamesStoragePath() {
        return savedGamesStoragePath;
    }

    public void setSavedGamesStoragePath(String savedGamesStoragePath) {
        this.savedGamesStoragePath = savedGamesStoragePath;
    }

    public SavedGamesConfigurations withSavedGamesRelativePath(String savedGamesRelativePath) {
        this.savedGamesRelativePath = savedGamesRelativePath;
        return this;
    }

    /**
     * 目标文件夹位置。
     * @return savedGamesRelativePath
     */
    public String getSavedGamesRelativePath() {
        return savedGamesRelativePath;
    }

    public void setSavedGamesRelativePath(String savedGamesRelativePath) {
        this.savedGamesRelativePath = savedGamesRelativePath;
    }

    public SavedGamesConfigurations withSavedGamesExclusiveRights(Integer savedGamesExclusiveRights) {
        this.savedGamesExclusiveRights = savedGamesExclusiveRights;
        return this;
    }

    /**
     * 是否开启用户对该文件夹的独占控制权限： 0: 禁用 1: 开启
     * minimum: 0
     * maximum: 1
     * @return savedGamesExclusiveRights
     */
    public Integer getSavedGamesExclusiveRights() {
        return savedGamesExclusiveRights;
    }

    public void setSavedGamesExclusiveRights(Integer savedGamesExclusiveRights) {
        this.savedGamesExclusiveRights = savedGamesExclusiveRights;
    }

    public SavedGamesConfigurations withSavedGamesMoveContents(Integer savedGamesMoveContents) {
        this.savedGamesMoveContents = savedGamesMoveContents;
        return this;
    }

    /**
     * 启用文件夹重定向策略时，是否将现有内容移动到新位置： 0: 否 1: 是
     * minimum: 0
     * maximum: 1
     * @return savedGamesMoveContents
     */
    public Integer getSavedGamesMoveContents() {
        return savedGamesMoveContents;
    }

    public void setSavedGamesMoveContents(Integer savedGamesMoveContents) {
        this.savedGamesMoveContents = savedGamesMoveContents;
    }

    public SavedGamesConfigurations withSavedGamesMoveContentOnPolicyRemoval(
        Integer savedGamesMoveContentOnPolicyRemoval) {
        this.savedGamesMoveContentOnPolicyRemoval = savedGamesMoveContentOnPolicyRemoval;
        return this;
    }

    /**
     * 禁用或删除策略时，是否将内容移回本地用户配置文件位置： 0: 否 1: 是
     * minimum: 0
     * maximum: 1
     * @return savedGamesMoveContentOnPolicyRemoval
     */
    public Integer getSavedGamesMoveContentOnPolicyRemoval() {
        return savedGamesMoveContentOnPolicyRemoval;
    }

    public void setSavedGamesMoveContentOnPolicyRemoval(Integer savedGamesMoveContentOnPolicyRemoval) {
        this.savedGamesMoveContentOnPolicyRemoval = savedGamesMoveContentOnPolicyRemoval;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SavedGamesConfigurations that = (SavedGamesConfigurations) obj;
        return Objects.equals(this.savedGamesStatus, that.savedGamesStatus)
            && Objects.equals(this.savedGamesRedirectionType, that.savedGamesRedirectionType)
            && Objects.equals(this.savedGamesStoragePath, that.savedGamesStoragePath)
            && Objects.equals(this.savedGamesRelativePath, that.savedGamesRelativePath)
            && Objects.equals(this.savedGamesExclusiveRights, that.savedGamesExclusiveRights)
            && Objects.equals(this.savedGamesMoveContents, that.savedGamesMoveContents)
            && Objects.equals(this.savedGamesMoveContentOnPolicyRemoval, that.savedGamesMoveContentOnPolicyRemoval);
    }

    @Override
    public int hashCode() {
        return Objects.hash(savedGamesStatus,
            savedGamesRedirectionType,
            savedGamesStoragePath,
            savedGamesRelativePath,
            savedGamesExclusiveRights,
            savedGamesMoveContents,
            savedGamesMoveContentOnPolicyRemoval);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SavedGamesConfigurations {\n");
        sb.append("    savedGamesStatus: ").append(toIndentedString(savedGamesStatus)).append("\n");
        sb.append("    savedGamesRedirectionType: ").append(toIndentedString(savedGamesRedirectionType)).append("\n");
        sb.append("    savedGamesStoragePath: ").append(toIndentedString(savedGamesStoragePath)).append("\n");
        sb.append("    savedGamesRelativePath: ").append(toIndentedString(savedGamesRelativePath)).append("\n");
        sb.append("    savedGamesExclusiveRights: ").append(toIndentedString(savedGamesExclusiveRights)).append("\n");
        sb.append("    savedGamesMoveContents: ").append(toIndentedString(savedGamesMoveContents)).append("\n");
        sb.append("    savedGamesMoveContentOnPolicyRemoval: ")
            .append(toIndentedString(savedGamesMoveContentOnPolicyRemoval))
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
