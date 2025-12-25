package com.huaweicloud.sdk.secmaster.v2.model;

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
public class ListDirectoriesResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "directories")

    private List<String> directories = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "directory_i18ns")

    private List<DirectoryI18N> directoryI18ns = null;

    public ListDirectoriesResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ListDirectoriesResponse withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * 工作空间ID
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public ListDirectoriesResponse withDirectories(List<String> directories) {
        this.directories = directories;
        return this;
    }

    public ListDirectoriesResponse addDirectoriesItem(String directoriesItem) {
        if (this.directories == null) {
            this.directories = new ArrayList<>();
        }
        this.directories.add(directoriesItem);
        return this;
    }

    public ListDirectoriesResponse withDirectories(Consumer<List<String>> directoriesSetter) {
        if (this.directories == null) {
            this.directories = new ArrayList<>();
        }
        directoriesSetter.accept(this.directories);
        return this;
    }

    /**
     * 目录列表
     * @return directories
     */
    public List<String> getDirectories() {
        return directories;
    }

    public void setDirectories(List<String> directories) {
        this.directories = directories;
    }

    public ListDirectoriesResponse withDirectoryI18ns(List<DirectoryI18N> directoryI18ns) {
        this.directoryI18ns = directoryI18ns;
        return this;
    }

    public ListDirectoriesResponse addDirectoryI18nsItem(DirectoryI18N directoryI18nsItem) {
        if (this.directoryI18ns == null) {
            this.directoryI18ns = new ArrayList<>();
        }
        this.directoryI18ns.add(directoryI18nsItem);
        return this;
    }

    public ListDirectoriesResponse withDirectoryI18ns(Consumer<List<DirectoryI18N>> directoryI18nsSetter) {
        if (this.directoryI18ns == null) {
            this.directoryI18ns = new ArrayList<>();
        }
        directoryI18nsSetter.accept(this.directoryI18ns);
        return this;
    }

    /**
     * 目录I18N列表
     * @return directoryI18ns
     */
    public List<DirectoryI18N> getDirectoryI18ns() {
        return directoryI18ns;
    }

    public void setDirectoryI18ns(List<DirectoryI18N> directoryI18ns) {
        this.directoryI18ns = directoryI18ns;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListDirectoriesResponse that = (ListDirectoriesResponse) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.workspaceId, that.workspaceId)
            && Objects.equals(this.directories, that.directories)
            && Objects.equals(this.directoryI18ns, that.directoryI18ns);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId, workspaceId, directories, directoryI18ns);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListDirectoriesResponse {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    directories: ").append(toIndentedString(directories)).append("\n");
        sb.append("    directoryI18ns: ").append(toIndentedString(directoryI18ns)).append("\n");
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
