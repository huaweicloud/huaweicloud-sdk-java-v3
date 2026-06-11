package com.huaweicloud.sdk.workspaceapp.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 文件夹重定向配置(v2)。
 */
public class FolderRedirectionV2Options {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_data_roaming_configurations")

    private AppDataRoamingConfigurations appDataRoamingConfigurations;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_configurations")

    private DesktopConfigurations desktopConfigurations;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_menu_configurations")

    private StartMenuConfigurations startMenuConfigurations;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "documents_configurations")

    private DocumentsConfigurations documentsConfigurations;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pictures_configurations")

    private PicturesConfigurations picturesConfigurations;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "music_configurations")

    private MusicConfigurations musicConfigurations;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "videos_configurations")

    private VideosConfigurations videosConfigurations;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "favorites_configurations")

    private FavoritesConfigurations favoritesConfigurations;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "contacts_configurations")

    private ContactsConfigurations contactsConfigurations;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "downloads_configurations")

    private DownloadsConfigurations downloadsConfigurations;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "links_configurations")

    private LinksConfigurations linksConfigurations;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "searches_configurations")

    private SearchesConfigurations searchesConfigurations;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "saved_games_configurations")

    private SavedGamesConfigurations savedGamesConfigurations;

    public FolderRedirectionV2Options withAppDataRoamingConfigurations(
        AppDataRoamingConfigurations appDataRoamingConfigurations) {
        this.appDataRoamingConfigurations = appDataRoamingConfigurations;
        return this;
    }

    public FolderRedirectionV2Options withAppDataRoamingConfigurations(
        Consumer<AppDataRoamingConfigurations> appDataRoamingConfigurationsSetter) {
        if (this.appDataRoamingConfigurations == null) {
            this.appDataRoamingConfigurations = new AppDataRoamingConfigurations();
            appDataRoamingConfigurationsSetter.accept(this.appDataRoamingConfigurations);
        }

        return this;
    }

    /**
     * Get appDataRoamingConfigurations
     * @return appDataRoamingConfigurations
     */
    public AppDataRoamingConfigurations getAppDataRoamingConfigurations() {
        return appDataRoamingConfigurations;
    }

    public void setAppDataRoamingConfigurations(AppDataRoamingConfigurations appDataRoamingConfigurations) {
        this.appDataRoamingConfigurations = appDataRoamingConfigurations;
    }

    public FolderRedirectionV2Options withDesktopConfigurations(DesktopConfigurations desktopConfigurations) {
        this.desktopConfigurations = desktopConfigurations;
        return this;
    }

    public FolderRedirectionV2Options withDesktopConfigurations(
        Consumer<DesktopConfigurations> desktopConfigurationsSetter) {
        if (this.desktopConfigurations == null) {
            this.desktopConfigurations = new DesktopConfigurations();
            desktopConfigurationsSetter.accept(this.desktopConfigurations);
        }

        return this;
    }

    /**
     * Get desktopConfigurations
     * @return desktopConfigurations
     */
    public DesktopConfigurations getDesktopConfigurations() {
        return desktopConfigurations;
    }

    public void setDesktopConfigurations(DesktopConfigurations desktopConfigurations) {
        this.desktopConfigurations = desktopConfigurations;
    }

    public FolderRedirectionV2Options withStartMenuConfigurations(StartMenuConfigurations startMenuConfigurations) {
        this.startMenuConfigurations = startMenuConfigurations;
        return this;
    }

    public FolderRedirectionV2Options withStartMenuConfigurations(
        Consumer<StartMenuConfigurations> startMenuConfigurationsSetter) {
        if (this.startMenuConfigurations == null) {
            this.startMenuConfigurations = new StartMenuConfigurations();
            startMenuConfigurationsSetter.accept(this.startMenuConfigurations);
        }

        return this;
    }

    /**
     * Get startMenuConfigurations
     * @return startMenuConfigurations
     */
    public StartMenuConfigurations getStartMenuConfigurations() {
        return startMenuConfigurations;
    }

    public void setStartMenuConfigurations(StartMenuConfigurations startMenuConfigurations) {
        this.startMenuConfigurations = startMenuConfigurations;
    }

    public FolderRedirectionV2Options withDocumentsConfigurations(DocumentsConfigurations documentsConfigurations) {
        this.documentsConfigurations = documentsConfigurations;
        return this;
    }

    public FolderRedirectionV2Options withDocumentsConfigurations(
        Consumer<DocumentsConfigurations> documentsConfigurationsSetter) {
        if (this.documentsConfigurations == null) {
            this.documentsConfigurations = new DocumentsConfigurations();
            documentsConfigurationsSetter.accept(this.documentsConfigurations);
        }

        return this;
    }

    /**
     * Get documentsConfigurations
     * @return documentsConfigurations
     */
    public DocumentsConfigurations getDocumentsConfigurations() {
        return documentsConfigurations;
    }

    public void setDocumentsConfigurations(DocumentsConfigurations documentsConfigurations) {
        this.documentsConfigurations = documentsConfigurations;
    }

    public FolderRedirectionV2Options withPicturesConfigurations(PicturesConfigurations picturesConfigurations) {
        this.picturesConfigurations = picturesConfigurations;
        return this;
    }

    public FolderRedirectionV2Options withPicturesConfigurations(
        Consumer<PicturesConfigurations> picturesConfigurationsSetter) {
        if (this.picturesConfigurations == null) {
            this.picturesConfigurations = new PicturesConfigurations();
            picturesConfigurationsSetter.accept(this.picturesConfigurations);
        }

        return this;
    }

    /**
     * Get picturesConfigurations
     * @return picturesConfigurations
     */
    public PicturesConfigurations getPicturesConfigurations() {
        return picturesConfigurations;
    }

    public void setPicturesConfigurations(PicturesConfigurations picturesConfigurations) {
        this.picturesConfigurations = picturesConfigurations;
    }

    public FolderRedirectionV2Options withMusicConfigurations(MusicConfigurations musicConfigurations) {
        this.musicConfigurations = musicConfigurations;
        return this;
    }

    public FolderRedirectionV2Options withMusicConfigurations(Consumer<MusicConfigurations> musicConfigurationsSetter) {
        if (this.musicConfigurations == null) {
            this.musicConfigurations = new MusicConfigurations();
            musicConfigurationsSetter.accept(this.musicConfigurations);
        }

        return this;
    }

    /**
     * Get musicConfigurations
     * @return musicConfigurations
     */
    public MusicConfigurations getMusicConfigurations() {
        return musicConfigurations;
    }

    public void setMusicConfigurations(MusicConfigurations musicConfigurations) {
        this.musicConfigurations = musicConfigurations;
    }

    public FolderRedirectionV2Options withVideosConfigurations(VideosConfigurations videosConfigurations) {
        this.videosConfigurations = videosConfigurations;
        return this;
    }

    public FolderRedirectionV2Options withVideosConfigurations(
        Consumer<VideosConfigurations> videosConfigurationsSetter) {
        if (this.videosConfigurations == null) {
            this.videosConfigurations = new VideosConfigurations();
            videosConfigurationsSetter.accept(this.videosConfigurations);
        }

        return this;
    }

    /**
     * Get videosConfigurations
     * @return videosConfigurations
     */
    public VideosConfigurations getVideosConfigurations() {
        return videosConfigurations;
    }

    public void setVideosConfigurations(VideosConfigurations videosConfigurations) {
        this.videosConfigurations = videosConfigurations;
    }

    public FolderRedirectionV2Options withFavoritesConfigurations(FavoritesConfigurations favoritesConfigurations) {
        this.favoritesConfigurations = favoritesConfigurations;
        return this;
    }

    public FolderRedirectionV2Options withFavoritesConfigurations(
        Consumer<FavoritesConfigurations> favoritesConfigurationsSetter) {
        if (this.favoritesConfigurations == null) {
            this.favoritesConfigurations = new FavoritesConfigurations();
            favoritesConfigurationsSetter.accept(this.favoritesConfigurations);
        }

        return this;
    }

    /**
     * Get favoritesConfigurations
     * @return favoritesConfigurations
     */
    public FavoritesConfigurations getFavoritesConfigurations() {
        return favoritesConfigurations;
    }

    public void setFavoritesConfigurations(FavoritesConfigurations favoritesConfigurations) {
        this.favoritesConfigurations = favoritesConfigurations;
    }

    public FolderRedirectionV2Options withContactsConfigurations(ContactsConfigurations contactsConfigurations) {
        this.contactsConfigurations = contactsConfigurations;
        return this;
    }

    public FolderRedirectionV2Options withContactsConfigurations(
        Consumer<ContactsConfigurations> contactsConfigurationsSetter) {
        if (this.contactsConfigurations == null) {
            this.contactsConfigurations = new ContactsConfigurations();
            contactsConfigurationsSetter.accept(this.contactsConfigurations);
        }

        return this;
    }

    /**
     * Get contactsConfigurations
     * @return contactsConfigurations
     */
    public ContactsConfigurations getContactsConfigurations() {
        return contactsConfigurations;
    }

    public void setContactsConfigurations(ContactsConfigurations contactsConfigurations) {
        this.contactsConfigurations = contactsConfigurations;
    }

    public FolderRedirectionV2Options withDownloadsConfigurations(DownloadsConfigurations downloadsConfigurations) {
        this.downloadsConfigurations = downloadsConfigurations;
        return this;
    }

    public FolderRedirectionV2Options withDownloadsConfigurations(
        Consumer<DownloadsConfigurations> downloadsConfigurationsSetter) {
        if (this.downloadsConfigurations == null) {
            this.downloadsConfigurations = new DownloadsConfigurations();
            downloadsConfigurationsSetter.accept(this.downloadsConfigurations);
        }

        return this;
    }

    /**
     * Get downloadsConfigurations
     * @return downloadsConfigurations
     */
    public DownloadsConfigurations getDownloadsConfigurations() {
        return downloadsConfigurations;
    }

    public void setDownloadsConfigurations(DownloadsConfigurations downloadsConfigurations) {
        this.downloadsConfigurations = downloadsConfigurations;
    }

    public FolderRedirectionV2Options withLinksConfigurations(LinksConfigurations linksConfigurations) {
        this.linksConfigurations = linksConfigurations;
        return this;
    }

    public FolderRedirectionV2Options withLinksConfigurations(Consumer<LinksConfigurations> linksConfigurationsSetter) {
        if (this.linksConfigurations == null) {
            this.linksConfigurations = new LinksConfigurations();
            linksConfigurationsSetter.accept(this.linksConfigurations);
        }

        return this;
    }

    /**
     * Get linksConfigurations
     * @return linksConfigurations
     */
    public LinksConfigurations getLinksConfigurations() {
        return linksConfigurations;
    }

    public void setLinksConfigurations(LinksConfigurations linksConfigurations) {
        this.linksConfigurations = linksConfigurations;
    }

    public FolderRedirectionV2Options withSearchesConfigurations(SearchesConfigurations searchesConfigurations) {
        this.searchesConfigurations = searchesConfigurations;
        return this;
    }

    public FolderRedirectionV2Options withSearchesConfigurations(
        Consumer<SearchesConfigurations> searchesConfigurationsSetter) {
        if (this.searchesConfigurations == null) {
            this.searchesConfigurations = new SearchesConfigurations();
            searchesConfigurationsSetter.accept(this.searchesConfigurations);
        }

        return this;
    }

    /**
     * Get searchesConfigurations
     * @return searchesConfigurations
     */
    public SearchesConfigurations getSearchesConfigurations() {
        return searchesConfigurations;
    }

    public void setSearchesConfigurations(SearchesConfigurations searchesConfigurations) {
        this.searchesConfigurations = searchesConfigurations;
    }

    public FolderRedirectionV2Options withSavedGamesConfigurations(SavedGamesConfigurations savedGamesConfigurations) {
        this.savedGamesConfigurations = savedGamesConfigurations;
        return this;
    }

    public FolderRedirectionV2Options withSavedGamesConfigurations(
        Consumer<SavedGamesConfigurations> savedGamesConfigurationsSetter) {
        if (this.savedGamesConfigurations == null) {
            this.savedGamesConfigurations = new SavedGamesConfigurations();
            savedGamesConfigurationsSetter.accept(this.savedGamesConfigurations);
        }

        return this;
    }

    /**
     * Get savedGamesConfigurations
     * @return savedGamesConfigurations
     */
    public SavedGamesConfigurations getSavedGamesConfigurations() {
        return savedGamesConfigurations;
    }

    public void setSavedGamesConfigurations(SavedGamesConfigurations savedGamesConfigurations) {
        this.savedGamesConfigurations = savedGamesConfigurations;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FolderRedirectionV2Options that = (FolderRedirectionV2Options) obj;
        return Objects.equals(this.appDataRoamingConfigurations, that.appDataRoamingConfigurations)
            && Objects.equals(this.desktopConfigurations, that.desktopConfigurations)
            && Objects.equals(this.startMenuConfigurations, that.startMenuConfigurations)
            && Objects.equals(this.documentsConfigurations, that.documentsConfigurations)
            && Objects.equals(this.picturesConfigurations, that.picturesConfigurations)
            && Objects.equals(this.musicConfigurations, that.musicConfigurations)
            && Objects.equals(this.videosConfigurations, that.videosConfigurations)
            && Objects.equals(this.favoritesConfigurations, that.favoritesConfigurations)
            && Objects.equals(this.contactsConfigurations, that.contactsConfigurations)
            && Objects.equals(this.downloadsConfigurations, that.downloadsConfigurations)
            && Objects.equals(this.linksConfigurations, that.linksConfigurations)
            && Objects.equals(this.searchesConfigurations, that.searchesConfigurations)
            && Objects.equals(this.savedGamesConfigurations, that.savedGamesConfigurations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(appDataRoamingConfigurations,
            desktopConfigurations,
            startMenuConfigurations,
            documentsConfigurations,
            picturesConfigurations,
            musicConfigurations,
            videosConfigurations,
            favoritesConfigurations,
            contactsConfigurations,
            downloadsConfigurations,
            linksConfigurations,
            searchesConfigurations,
            savedGamesConfigurations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FolderRedirectionV2Options {\n");
        sb.append("    appDataRoamingConfigurations: ")
            .append(toIndentedString(appDataRoamingConfigurations))
            .append("\n");
        sb.append("    desktopConfigurations: ").append(toIndentedString(desktopConfigurations)).append("\n");
        sb.append("    startMenuConfigurations: ").append(toIndentedString(startMenuConfigurations)).append("\n");
        sb.append("    documentsConfigurations: ").append(toIndentedString(documentsConfigurations)).append("\n");
        sb.append("    picturesConfigurations: ").append(toIndentedString(picturesConfigurations)).append("\n");
        sb.append("    musicConfigurations: ").append(toIndentedString(musicConfigurations)).append("\n");
        sb.append("    videosConfigurations: ").append(toIndentedString(videosConfigurations)).append("\n");
        sb.append("    favoritesConfigurations: ").append(toIndentedString(favoritesConfigurations)).append("\n");
        sb.append("    contactsConfigurations: ").append(toIndentedString(contactsConfigurations)).append("\n");
        sb.append("    downloadsConfigurations: ").append(toIndentedString(downloadsConfigurations)).append("\n");
        sb.append("    linksConfigurations: ").append(toIndentedString(linksConfigurations)).append("\n");
        sb.append("    searchesConfigurations: ").append(toIndentedString(searchesConfigurations)).append("\n");
        sb.append("    savedGamesConfigurations: ").append(toIndentedString(savedGamesConfigurations)).append("\n");
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
