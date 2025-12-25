package com.huaweicloud.sdk.codeartsartifact.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RepoFileDOV5
 */
public class RepoFileDOV5 {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_id")

    private String fileId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_name")

    private String repoName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_name")

    private String projectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_id")

    private String parentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_name")

    private String fileName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extension")

    private String extension;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "full_path")

    private String fullPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "size")

    private Long size;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "md5")

    private String md5;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sha256")

    private String sha256;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "download_url")

    private String downloadUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "download_url_with_id")

    private String downloadUrlWithId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "web_url")

    private String webUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version_enable")

    private Boolean versionEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migrated_state")

    private Integer migratedState;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "upload_id")

    private String uploadId;

    public RepoFileDOV5 withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**: id。 **取值范围**: 不涉及。 
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RepoFileDOV5 withFileId(String fileId) {
        this.fileId = fileId;
        return this;
    }

    /**
     * **参数解释**: 文件id。 **取值范围**: 不涉及。 
     * @return fileId
     */
    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public RepoFileDOV5 withRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }

    /**
     * **参数解释**: 仓库id。 **取值范围**: 不涉及。 
     * @return repoName
     */
    public String getRepoName() {
        return repoName;
    }

    public void setRepoName(String repoName) {
        this.repoName = repoName;
    }

    public RepoFileDOV5 withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * **参数解释**: 项目名称。 **取值范围**: 不涉及。 
     * @return projectName
     */
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public RepoFileDOV5 withParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * **参数解释**: 父级目录ID。 **取值范围**: 不涉及。 
     * @return parentId
     */
    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public RepoFileDOV5 withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**: 文件名。 **取值范围**: 不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RepoFileDOV5 withFileName(String fileName) {
        this.fileName = fileName;
        return this;
    }

    /**
     * **参数解释**: 文件名。 **取值范围**: 不涉及。 
     * @return fileName
     */
    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public RepoFileDOV5 withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**: 文件类型, folder代表是目录,file代表文件。 **取值范围**: 不涉及。 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public RepoFileDOV5 withCategory(String category) {
        this.category = category;
        return this;
    }

    /**
     * **参数解释**: 发布包状态 test为测试包 prod为发布包。 **取值范围**: 不涉及。 
     * @return category
     */
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public RepoFileDOV5 withExtension(String extension) {
        this.extension = extension;
        return this;
    }

    /**
     * **参数解释**: 文件扩展名。 **取值范围**: 不涉及。 
     * @return extension
     */
    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public RepoFileDOV5 withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * **参数解释**: 文件路径。 **取值范围**: 不涉及。 
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public RepoFileDOV5 withFullPath(String fullPath) {
        this.fullPath = fullPath;
        return this;
    }

    /**
     * **参数解释**: 文件路径(含项目)。 **取值范围**: 不涉及。 
     * @return fullPath
     */
    public String getFullPath() {
        return fullPath;
    }

    public void setFullPath(String fullPath) {
        this.fullPath = fullPath;
    }

    public RepoFileDOV5 withSize(Long size) {
        this.size = size;
        return this;
    }

    /**
     * **参数解释**: 文件大小,单位为byte。 **取值范围**: 不涉及。 
     * @return size
     */
    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public RepoFileDOV5 withMd5(String md5) {
        this.md5 = md5;
        return this;
    }

    /**
     * **参数解释**: md5校验和。 **取值范围**: 不涉及。 
     * @return md5
     */
    public String getMd5() {
        return md5;
    }

    public void setMd5(String md5) {
        this.md5 = md5;
    }

    public RepoFileDOV5 withSha256(String sha256) {
        this.sha256 = sha256;
        return this;
    }

    /**
     * **参数解释**: sha256校验和。 **取值范围**: 不涉及。 
     * @return sha256
     */
    public String getSha256() {
        return sha256;
    }

    public void setSha256(String sha256) {
        this.sha256 = sha256;
    }

    public RepoFileDOV5 withDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        return this;
    }

    /**
     * **参数解释**: 下载地址。 **取值范围**: 不涉及。 
     * @return downloadUrl
     */
    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    public RepoFileDOV5 withDownloadUrlWithId(String downloadUrlWithId) {
        this.downloadUrlWithId = downloadUrlWithId;
        return this;
    }

    /**
     * **参数解释**: 带有id的下载地址。 **取值范围**: 不涉及。 
     * @return downloadUrlWithId
     */
    public String getDownloadUrlWithId() {
        return downloadUrlWithId;
    }

    public void setDownloadUrlWithId(String downloadUrlWithId) {
        this.downloadUrlWithId = downloadUrlWithId;
    }

    public RepoFileDOV5 withWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }

    /**
     * **参数解释**: 历史版本遗留字段，请忽略。 **取值范围**: 不涉及。 
     * @return webUrl
     */
    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public RepoFileDOV5 withVersionEnable(Boolean versionEnable) {
        this.versionEnable = versionEnable;
        return this;
    }

    /**
     * **参数解释**: 判断当前文件或文件夹父目录是否为版本路径，即仓库下第一层子目录。 **取值范围**: - true：父目录是版本路径。 - false：父目录不是版本路径。 
     * @return versionEnable
     */
    public Boolean getVersionEnable() {
        return versionEnable;
    }

    public void setVersionEnable(Boolean versionEnable) {
        this.versionEnable = versionEnable;
    }

    public RepoFileDOV5 withMigratedState(Integer migratedState) {
        this.migratedState = migratedState;
        return this;
    }

    /**
     * **参数解释**: migrated_state。 **取值范围**: 该参数为内部数据改造参数，无业务含义，请忽略。 
     * @return migratedState
     */
    public Integer getMigratedState() {
        return migratedState;
    }

    public void setMigratedState(Integer migratedState) {
        this.migratedState = migratedState;
    }

    public RepoFileDOV5 withUploadId(String uploadId) {
        this.uploadId = uploadId;
        return this;
    }

    /**
     * **参数解释**: 该参数无返回值，请忽略。 **取值范围**: 不涉及。 
     * @return uploadId
     */
    public String getUploadId() {
        return uploadId;
    }

    public void setUploadId(String uploadId) {
        this.uploadId = uploadId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RepoFileDOV5 that = (RepoFileDOV5) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.fileId, that.fileId)
            && Objects.equals(this.repoName, that.repoName) && Objects.equals(this.projectName, that.projectName)
            && Objects.equals(this.parentId, that.parentId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.fileName, that.fileName) && Objects.equals(this.type, that.type)
            && Objects.equals(this.category, that.category) && Objects.equals(this.extension, that.extension)
            && Objects.equals(this.path, that.path) && Objects.equals(this.fullPath, that.fullPath)
            && Objects.equals(this.size, that.size) && Objects.equals(this.md5, that.md5)
            && Objects.equals(this.sha256, that.sha256) && Objects.equals(this.downloadUrl, that.downloadUrl)
            && Objects.equals(this.downloadUrlWithId, that.downloadUrlWithId)
            && Objects.equals(this.webUrl, that.webUrl) && Objects.equals(this.versionEnable, that.versionEnable)
            && Objects.equals(this.migratedState, that.migratedState) && Objects.equals(this.uploadId, that.uploadId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            fileId,
            repoName,
            projectName,
            parentId,
            name,
            fileName,
            type,
            category,
            extension,
            path,
            fullPath,
            size,
            md5,
            sha256,
            downloadUrl,
            downloadUrlWithId,
            webUrl,
            versionEnable,
            migratedState,
            uploadId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepoFileDOV5 {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    fileId: ").append(toIndentedString(fileId)).append("\n");
        sb.append("    repoName: ").append(toIndentedString(repoName)).append("\n");
        sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
        sb.append("    parentId: ").append(toIndentedString(parentId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    fileName: ").append(toIndentedString(fileName)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    fullPath: ").append(toIndentedString(fullPath)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    md5: ").append(toIndentedString(md5)).append("\n");
        sb.append("    sha256: ").append(toIndentedString(sha256)).append("\n");
        sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
        sb.append("    downloadUrlWithId: ").append(toIndentedString(downloadUrlWithId)).append("\n");
        sb.append("    webUrl: ").append(toIndentedString(webUrl)).append("\n");
        sb.append("    versionEnable: ").append(toIndentedString(versionEnable)).append("\n");
        sb.append("    migratedState: ").append(toIndentedString(migratedState)).append("\n");
        sb.append("    uploadId: ").append(toIndentedString(uploadId)).append("\n");
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
