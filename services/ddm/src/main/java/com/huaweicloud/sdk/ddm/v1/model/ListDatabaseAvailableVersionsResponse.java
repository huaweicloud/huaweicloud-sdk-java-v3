package com.huaweicloud.sdk.ddm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListDatabaseAvailableVersionsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "versions")

    private List<String> versions = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_version")

    private String currentVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_version")

    private String latestVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_favored_version")

    private String currentFavoredVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "previous_version")

    private String previousVersion;

    public ListDatabaseAvailableVersionsResponse withVersions(List<String> versions) {
        this.versions = versions;
        return this;
    }

    public ListDatabaseAvailableVersionsResponse addVersionsItem(String versionsItem) {
        if (this.versions == null) {
            this.versions = new ArrayList<>();
        }
        this.versions.add(versionsItem);
        return this;
    }

    public ListDatabaseAvailableVersionsResponse withVersions(Consumer<List<String>> versionsSetter) {
        if (this.versions == null) {
            this.versions = new ArrayList<>();
        }
        versionsSetter.accept(this.versions);
        return this;
    }

    /**
     * 可变更版本
     * @return versions
     */
    public List<String> getVersions() {
        return versions;
    }

    public void setVersions(List<String> versions) {
        this.versions = versions;
    }

    public ListDatabaseAvailableVersionsResponse withCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
        return this;
    }

    /**
     * 当前版本
     * @return currentVersion
     */
    public String getCurrentVersion() {
        return currentVersion;
    }

    public void setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
    }

    public ListDatabaseAvailableVersionsResponse withLatestVersion(String latestVersion) {
        this.latestVersion = latestVersion;
        return this;
    }

    /**
     * 最新优选版本
     * @return latestVersion
     */
    public String getLatestVersion() {
        return latestVersion;
    }

    public void setLatestVersion(String latestVersion) {
        this.latestVersion = latestVersion;
    }

    public ListDatabaseAvailableVersionsResponse withCurrentFavoredVersion(String currentFavoredVersion) {
        this.currentFavoredVersion = currentFavoredVersion;
        return this;
    }

    /**
     * 本系列优选版本，如3.0.8系列优选版本为3.0.8.5
     * @return currentFavoredVersion
     */
    public String getCurrentFavoredVersion() {
        return currentFavoredVersion;
    }

    public void setCurrentFavoredVersion(String currentFavoredVersion) {
        this.currentFavoredVersion = currentFavoredVersion;
    }

    public ListDatabaseAvailableVersionsResponse withPreviousVersion(String previousVersion) {
        this.previousVersion = previousVersion;
        return this;
    }

    /**
     * 当前实例上一个版本
     * @return previousVersion
     */
    public String getPreviousVersion() {
        return previousVersion;
    }

    public void setPreviousVersion(String previousVersion) {
        this.previousVersion = previousVersion;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDatabaseAvailableVersionsResponse that = (ListDatabaseAvailableVersionsResponse) obj;
        return Objects.equals(this.versions, that.versions) && Objects.equals(this.currentVersion, that.currentVersion)
            && Objects.equals(this.latestVersion, that.latestVersion)
            && Objects.equals(this.currentFavoredVersion, that.currentFavoredVersion)
            && Objects.equals(this.previousVersion, that.previousVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(versions, currentVersion, latestVersion, currentFavoredVersion, previousVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDatabaseAvailableVersionsResponse {\n");
        sb.append("    versions: ").append(toIndentedString(versions)).append("\n");
        sb.append("    currentVersion: ").append(toIndentedString(currentVersion)).append("\n");
        sb.append("    latestVersion: ").append(toIndentedString(latestVersion)).append("\n");
        sb.append("    currentFavoredVersion: ").append(toIndentedString(currentFavoredVersion)).append("\n");
        sb.append("    previousVersion: ").append(toIndentedString(previousVersion)).append("\n");
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
