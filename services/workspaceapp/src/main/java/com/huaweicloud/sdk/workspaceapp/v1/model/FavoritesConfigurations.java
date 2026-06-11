package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * “收藏夹”文件夹重定向配置
 */
public class FavoritesConfigurations {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "favorites_status")

    private Integer favoritesStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "favorites_redirection_type")

    private Integer favoritesRedirectionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "favorites_storage_path")

    private String favoritesStoragePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "favorites_relative_path")

    private String favoritesRelativePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "favorites_exclusive_rights")

    private Integer favoritesExclusiveRights;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "favorites_move_contents")

    private Integer favoritesMoveContents;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "favorites_move_content_on_policy_removal")

    private Integer favoritesMoveContentOnPolicyRemoval;

    public FavoritesConfigurations withFavoritesStatus(Integer favoritesStatus) {
        this.favoritesStatus = favoritesStatus;
        return this;
    }

    /**
     * 配置文件夹重定向状态： 0: 未选取 1: 已选取
     * minimum: 0
     * maximum: 1
     * @return favoritesStatus
     */
    public Integer getFavoritesStatus() {
        return favoritesStatus;
    }

    public void setFavoritesStatus(Integer favoritesStatus) {
        this.favoritesStatus = favoritesStatus;
    }

    public FavoritesConfigurations withFavoritesRedirectionType(Integer favoritesRedirectionType) {
        this.favoritesRedirectionType = favoritesRedirectionType;
        return this;
    }

    /**
     * 配置文件夹重定向类型： 0: 远程 1: 本地
     * minimum: 0
     * maximum: 1
     * @return favoritesRedirectionType
     */
    public Integer getFavoritesRedirectionType() {
        return favoritesRedirectionType;
    }

    public void setFavoritesRedirectionType(Integer favoritesRedirectionType) {
        this.favoritesRedirectionType = favoritesRedirectionType;
    }

    public FavoritesConfigurations withFavoritesStoragePath(String favoritesStoragePath) {
        this.favoritesStoragePath = favoritesStoragePath;
        return this;
    }

    /**
     * 文件夹重定向(v2)用户存储路径。
     * @return favoritesStoragePath
     */
    public String getFavoritesStoragePath() {
        return favoritesStoragePath;
    }

    public void setFavoritesStoragePath(String favoritesStoragePath) {
        this.favoritesStoragePath = favoritesStoragePath;
    }

    public FavoritesConfigurations withFavoritesRelativePath(String favoritesRelativePath) {
        this.favoritesRelativePath = favoritesRelativePath;
        return this;
    }

    /**
     * 目标文件夹位置。
     * @return favoritesRelativePath
     */
    public String getFavoritesRelativePath() {
        return favoritesRelativePath;
    }

    public void setFavoritesRelativePath(String favoritesRelativePath) {
        this.favoritesRelativePath = favoritesRelativePath;
    }

    public FavoritesConfigurations withFavoritesExclusiveRights(Integer favoritesExclusiveRights) {
        this.favoritesExclusiveRights = favoritesExclusiveRights;
        return this;
    }

    /**
     * 是否开启用户对该文件夹的独占控制权限： 0: 禁用 1: 开启
     * minimum: 0
     * maximum: 1
     * @return favoritesExclusiveRights
     */
    public Integer getFavoritesExclusiveRights() {
        return favoritesExclusiveRights;
    }

    public void setFavoritesExclusiveRights(Integer favoritesExclusiveRights) {
        this.favoritesExclusiveRights = favoritesExclusiveRights;
    }

    public FavoritesConfigurations withFavoritesMoveContents(Integer favoritesMoveContents) {
        this.favoritesMoveContents = favoritesMoveContents;
        return this;
    }

    /**
     * 启用文件夹重定向策略时，是否将现有内容移动到新位置： 0: 否 1: 是
     * minimum: 0
     * maximum: 1
     * @return favoritesMoveContents
     */
    public Integer getFavoritesMoveContents() {
        return favoritesMoveContents;
    }

    public void setFavoritesMoveContents(Integer favoritesMoveContents) {
        this.favoritesMoveContents = favoritesMoveContents;
    }

    public FavoritesConfigurations withFavoritesMoveContentOnPolicyRemoval(
        Integer favoritesMoveContentOnPolicyRemoval) {
        this.favoritesMoveContentOnPolicyRemoval = favoritesMoveContentOnPolicyRemoval;
        return this;
    }

    /**
     * 禁用或删除策略时，是否将内容移回本地用户配置文件位置： 0: 否 1: 是
     * minimum: 0
     * maximum: 1
     * @return favoritesMoveContentOnPolicyRemoval
     */
    public Integer getFavoritesMoveContentOnPolicyRemoval() {
        return favoritesMoveContentOnPolicyRemoval;
    }

    public void setFavoritesMoveContentOnPolicyRemoval(Integer favoritesMoveContentOnPolicyRemoval) {
        this.favoritesMoveContentOnPolicyRemoval = favoritesMoveContentOnPolicyRemoval;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FavoritesConfigurations that = (FavoritesConfigurations) obj;
        return Objects.equals(this.favoritesStatus, that.favoritesStatus)
            && Objects.equals(this.favoritesRedirectionType, that.favoritesRedirectionType)
            && Objects.equals(this.favoritesStoragePath, that.favoritesStoragePath)
            && Objects.equals(this.favoritesRelativePath, that.favoritesRelativePath)
            && Objects.equals(this.favoritesExclusiveRights, that.favoritesExclusiveRights)
            && Objects.equals(this.favoritesMoveContents, that.favoritesMoveContents)
            && Objects.equals(this.favoritesMoveContentOnPolicyRemoval, that.favoritesMoveContentOnPolicyRemoval);
    }

    @Override
    public int hashCode() {
        return Objects.hash(favoritesStatus,
            favoritesRedirectionType,
            favoritesStoragePath,
            favoritesRelativePath,
            favoritesExclusiveRights,
            favoritesMoveContents,
            favoritesMoveContentOnPolicyRemoval);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FavoritesConfigurations {\n");
        sb.append("    favoritesStatus: ").append(toIndentedString(favoritesStatus)).append("\n");
        sb.append("    favoritesRedirectionType: ").append(toIndentedString(favoritesRedirectionType)).append("\n");
        sb.append("    favoritesStoragePath: ").append(toIndentedString(favoritesStoragePath)).append("\n");
        sb.append("    favoritesRelativePath: ").append(toIndentedString(favoritesRelativePath)).append("\n");
        sb.append("    favoritesExclusiveRights: ").append(toIndentedString(favoritesExclusiveRights)).append("\n");
        sb.append("    favoritesMoveContents: ").append(toIndentedString(favoritesMoveContents)).append("\n");
        sb.append("    favoritesMoveContentOnPolicyRemoval: ")
            .append(toIndentedString(favoritesMoveContentOnPolicyRemoval))
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
