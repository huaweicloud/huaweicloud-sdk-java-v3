package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 用户文件夹重定向选项。
 */
public class PoliciesPersonalizedDataMgmtUserFolderRedirectionOptions {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "restore_local_directories_enable")

    private Boolean restoreLocalDirectoriesEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "appData_roaming_enale")

    private Boolean appDataRoamingEnale;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redirec_desktop")

    private Boolean redirecDesktop;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redirec_start_menu")

    private Boolean redirecStartMenu;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redirec_documents")

    private Boolean redirecDocuments;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redirec_pictures")

    private Boolean redirecPictures;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redirec_music")

    private Boolean redirecMusic;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redirec_videos")

    private Boolean redirecVideos;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redirec_favorites")

    private Boolean redirecFavorites;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redirec_contacts")

    private Boolean redirecContacts;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redirec_downloads")

    private Boolean redirecDownloads;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redirec_links")

    private Boolean redirecLinks;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redirec_searches")

    private Boolean redirecSearches;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "redirec_saved_games")

    private Boolean redirecSavedGames;

    public PoliciesPersonalizedDataMgmtUserFolderRedirectionOptions withRestoreLocalDirectoriesEnable(
        Boolean restoreLocalDirectoriesEnable) {
        this.restoreLocalDirectoriesEnable = restoreLocalDirectoriesEnable;
        return this;
    }

    /**
     * 还原本地目录启用。
     * @return restoreLocalDirectoriesEnable
     */
    public Boolean getRestoreLocalDirectoriesEnable() {
        return restoreLocalDirectoriesEnable;
    }

    public void setRestoreLocalDirectoriesEnable(Boolean restoreLocalDirectoriesEnable) {
        this.restoreLocalDirectoriesEnable = restoreLocalDirectoriesEnable;
    }

    public PoliciesPersonalizedDataMgmtUserFolderRedirectionOptions withAppDataRoamingEnale(
        Boolean appDataRoamingEnale) {
        this.appDataRoamingEnale = appDataRoamingEnale;
        return this;
    }

    /**
     * 应用数据漫游启用。
     * @return appDataRoamingEnale
     */
    public Boolean getAppDataRoamingEnale() {
        return appDataRoamingEnale;
    }

    public void setAppDataRoamingEnale(Boolean appDataRoamingEnale) {
        this.appDataRoamingEnale = appDataRoamingEnale;
    }

    public PoliciesPersonalizedDataMgmtUserFolderRedirectionOptions withRedirecDesktop(Boolean redirecDesktop) {
        this.redirecDesktop = redirecDesktop;
        return this;
    }

    /**
     * 桌面重定向。
     * @return redirecDesktop
     */
    public Boolean getRedirecDesktop() {
        return redirecDesktop;
    }

    public void setRedirecDesktop(Boolean redirecDesktop) {
        this.redirecDesktop = redirecDesktop;
    }

    public PoliciesPersonalizedDataMgmtUserFolderRedirectionOptions withRedirecStartMenu(Boolean redirecStartMenu) {
        this.redirecStartMenu = redirecStartMenu;
        return this;
    }

    /**
     * 开始菜单。
     * @return redirecStartMenu
     */
    public Boolean getRedirecStartMenu() {
        return redirecStartMenu;
    }

    public void setRedirecStartMenu(Boolean redirecStartMenu) {
        this.redirecStartMenu = redirecStartMenu;
    }

    public PoliciesPersonalizedDataMgmtUserFolderRedirectionOptions withRedirecDocuments(Boolean redirecDocuments) {
        this.redirecDocuments = redirecDocuments;
        return this;
    }

    /**
     * 文档。
     * @return redirecDocuments
     */
    public Boolean getRedirecDocuments() {
        return redirecDocuments;
    }

    public void setRedirecDocuments(Boolean redirecDocuments) {
        this.redirecDocuments = redirecDocuments;
    }

    public PoliciesPersonalizedDataMgmtUserFolderRedirectionOptions withRedirecPictures(Boolean redirecPictures) {
        this.redirecPictures = redirecPictures;
        return this;
    }

    /**
     * 照片。
     * @return redirecPictures
     */
    public Boolean getRedirecPictures() {
        return redirecPictures;
    }

    public void setRedirecPictures(Boolean redirecPictures) {
        this.redirecPictures = redirecPictures;
    }

    public PoliciesPersonalizedDataMgmtUserFolderRedirectionOptions withRedirecMusic(Boolean redirecMusic) {
        this.redirecMusic = redirecMusic;
        return this;
    }

    /**
     * 音乐。
     * @return redirecMusic
     */
    public Boolean getRedirecMusic() {
        return redirecMusic;
    }

    public void setRedirecMusic(Boolean redirecMusic) {
        this.redirecMusic = redirecMusic;
    }

    public PoliciesPersonalizedDataMgmtUserFolderRedirectionOptions withRedirecVideos(Boolean redirecVideos) {
        this.redirecVideos = redirecVideos;
        return this;
    }

    /**
     * 录音。
     * @return redirecVideos
     */
    public Boolean getRedirecVideos() {
        return redirecVideos;
    }

    public void setRedirecVideos(Boolean redirecVideos) {
        this.redirecVideos = redirecVideos;
    }

    public PoliciesPersonalizedDataMgmtUserFolderRedirectionOptions withRedirecFavorites(Boolean redirecFavorites) {
        this.redirecFavorites = redirecFavorites;
        return this;
    }

    /**
     * 最爱。
     * @return redirecFavorites
     */
    public Boolean getRedirecFavorites() {
        return redirecFavorites;
    }

    public void setRedirecFavorites(Boolean redirecFavorites) {
        this.redirecFavorites = redirecFavorites;
    }

    public PoliciesPersonalizedDataMgmtUserFolderRedirectionOptions withRedirecContacts(Boolean redirecContacts) {
        this.redirecContacts = redirecContacts;
        return this;
    }

    /**
     * 录音。
     * @return redirecContacts
     */
    public Boolean getRedirecContacts() {
        return redirecContacts;
    }

    public void setRedirecContacts(Boolean redirecContacts) {
        this.redirecContacts = redirecContacts;
    }

    public PoliciesPersonalizedDataMgmtUserFolderRedirectionOptions withRedirecDownloads(Boolean redirecDownloads) {
        this.redirecDownloads = redirecDownloads;
        return this;
    }

    /**
     * 下载。
     * @return redirecDownloads
     */
    public Boolean getRedirecDownloads() {
        return redirecDownloads;
    }

    public void setRedirecDownloads(Boolean redirecDownloads) {
        this.redirecDownloads = redirecDownloads;
    }

    public PoliciesPersonalizedDataMgmtUserFolderRedirectionOptions withRedirecLinks(Boolean redirecLinks) {
        this.redirecLinks = redirecLinks;
        return this;
    }

    /**
     * 链接。
     * @return redirecLinks
     */
    public Boolean getRedirecLinks() {
        return redirecLinks;
    }

    public void setRedirecLinks(Boolean redirecLinks) {
        this.redirecLinks = redirecLinks;
    }

    public PoliciesPersonalizedDataMgmtUserFolderRedirectionOptions withRedirecSearches(Boolean redirecSearches) {
        this.redirecSearches = redirecSearches;
        return this;
    }

    /**
     * 查找。
     * @return redirecSearches
     */
    public Boolean getRedirecSearches() {
        return redirecSearches;
    }

    public void setRedirecSearches(Boolean redirecSearches) {
        this.redirecSearches = redirecSearches;
    }

    public PoliciesPersonalizedDataMgmtUserFolderRedirectionOptions withRedirecSavedGames(Boolean redirecSavedGames) {
        this.redirecSavedGames = redirecSavedGames;
        return this;
    }

    /**
     * 游戏存储。
     * @return redirecSavedGames
     */
    public Boolean getRedirecSavedGames() {
        return redirecSavedGames;
    }

    public void setRedirecSavedGames(Boolean redirecSavedGames) {
        this.redirecSavedGames = redirecSavedGames;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PoliciesPersonalizedDataMgmtUserFolderRedirectionOptions that =
            (PoliciesPersonalizedDataMgmtUserFolderRedirectionOptions) obj;
        return Objects.equals(this.restoreLocalDirectoriesEnable, that.restoreLocalDirectoriesEnable)
            && Objects.equals(this.appDataRoamingEnale, that.appDataRoamingEnale)
            && Objects.equals(this.redirecDesktop, that.redirecDesktop)
            && Objects.equals(this.redirecStartMenu, that.redirecStartMenu)
            && Objects.equals(this.redirecDocuments, that.redirecDocuments)
            && Objects.equals(this.redirecPictures, that.redirecPictures)
            && Objects.equals(this.redirecMusic, that.redirecMusic)
            && Objects.equals(this.redirecVideos, that.redirecVideos)
            && Objects.equals(this.redirecFavorites, that.redirecFavorites)
            && Objects.equals(this.redirecContacts, that.redirecContacts)
            && Objects.equals(this.redirecDownloads, that.redirecDownloads)
            && Objects.equals(this.redirecLinks, that.redirecLinks)
            && Objects.equals(this.redirecSearches, that.redirecSearches)
            && Objects.equals(this.redirecSavedGames, that.redirecSavedGames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(restoreLocalDirectoriesEnable,
            appDataRoamingEnale,
            redirecDesktop,
            redirecStartMenu,
            redirecDocuments,
            redirecPictures,
            redirecMusic,
            redirecVideos,
            redirecFavorites,
            redirecContacts,
            redirecDownloads,
            redirecLinks,
            redirecSearches,
            redirecSavedGames);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PoliciesPersonalizedDataMgmtUserFolderRedirectionOptions {\n");
        sb.append("    restoreLocalDirectoriesEnable: ")
            .append(toIndentedString(restoreLocalDirectoriesEnable))
            .append("\n");
        sb.append("    appDataRoamingEnale: ").append(toIndentedString(appDataRoamingEnale)).append("\n");
        sb.append("    redirecDesktop: ").append(toIndentedString(redirecDesktop)).append("\n");
        sb.append("    redirecStartMenu: ").append(toIndentedString(redirecStartMenu)).append("\n");
        sb.append("    redirecDocuments: ").append(toIndentedString(redirecDocuments)).append("\n");
        sb.append("    redirecPictures: ").append(toIndentedString(redirecPictures)).append("\n");
        sb.append("    redirecMusic: ").append(toIndentedString(redirecMusic)).append("\n");
        sb.append("    redirecVideos: ").append(toIndentedString(redirecVideos)).append("\n");
        sb.append("    redirecFavorites: ").append(toIndentedString(redirecFavorites)).append("\n");
        sb.append("    redirecContacts: ").append(toIndentedString(redirecContacts)).append("\n");
        sb.append("    redirecDownloads: ").append(toIndentedString(redirecDownloads)).append("\n");
        sb.append("    redirecLinks: ").append(toIndentedString(redirecLinks)).append("\n");
        sb.append("    redirecSearches: ").append(toIndentedString(redirecSearches)).append("\n");
        sb.append("    redirecSavedGames: ").append(toIndentedString(redirecSavedGames)).append("\n");
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
