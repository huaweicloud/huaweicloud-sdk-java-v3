package com.huaweicloud.sdk.codeartsartifact.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ArtifactSearchResult
 */
public class ArtifactSearchResult {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relativePath")

    private String relativePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo")

    private String repo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repoName")

    private String repoName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "displayName")

    private String displayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repoType")

    private String repoType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "createdBy")

    private String createdBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "createdUserName")

    private String createdUserName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created")

    private String created;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modified")

    private String modified;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "oldRepoId")

    private String oldRepoId;

    public ArtifactSearchResult withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**： 文件名。 **取值范围**： 不涉及。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArtifactSearchResult withRelativePath(String relativePath) {
        this.relativePath = relativePath;
        return this;
    }

    /**
     * **参数解释**： 文件相对路径。 **取值范围**： 不涉及。 
     * @return relativePath
     */
    public String getRelativePath() {
        return relativePath;
    }

    public void setRelativePath(String relativePath) {
        this.relativePath = relativePath;
    }

    public ArtifactSearchResult withRepo(String repo) {
        this.repo = repo;
        return this;
    }

    /**
     * **参数解释**： 仓库ID。 **取值范围**： 不涉及。 
     * @return repo
     */
    public String getRepo() {
        return repo;
    }

    public void setRepo(String repo) {
        this.repo = repo;
    }

    public ArtifactSearchResult withRepoName(String repoName) {
        this.repoName = repoName;
        return this;
    }

    /**
     * **参数解释**： 仓库名。 **取值范围**： 不涉及。 
     * @return repoName
     */
    public String getRepoName() {
        return repoName;
    }

    public void setRepoName(String repoName) {
        this.repoName = repoName;
    }

    public ArtifactSearchResult withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * **参数解释**： 展示名称。 **取值范围**： 不涉及。 
     * @return displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public ArtifactSearchResult withRepoType(String repoType) {
        this.repoType = repoType;
        return this;
    }

    /**
     * **参数解释**： 制品类型。 **取值范围**： 不涉及。 
     * @return repoType
     */
    public String getRepoType() {
        return repoType;
    }

    public void setRepoType(String repoType) {
        this.repoType = repoType;
    }

    public ArtifactSearchResult withCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     * **参数解释**： 创建人ID。 **取值范围**： 不涉及。 
     * @return createdBy
     */
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public ArtifactSearchResult withCreatedUserName(String createdUserName) {
        this.createdUserName = createdUserName;
        return this;
    }

    /**
     * **参数解释**： 创建人名称。 **取值范围**： 不涉及。 
     * @return createdUserName
     */
    public String getCreatedUserName() {
        return createdUserName;
    }

    public void setCreatedUserName(String createdUserName) {
        this.createdUserName = createdUserName;
    }

    public ArtifactSearchResult withCreated(String created) {
        this.created = created;
        return this;
    }

    /**
     * **参数解释**： 创建时间。 **取值范围**： 不涉及。 
     * @return created
     */
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public ArtifactSearchResult withModified(String modified) {
        this.modified = modified;
        return this;
    }

    /**
     * **参数解释**： 修改时间。 **取值范围**： 不涉及。 
     * @return modified
     */
    public String getModified() {
        return modified;
    }

    public void setModified(String modified) {
        this.modified = modified;
    }

    public ArtifactSearchResult withOldRepoId(String oldRepoId) {
        this.oldRepoId = oldRepoId;
        return this;
    }

    /**
     * **参数解释**： 旧仓库ID。 **取值范围**： 不涉及。 
     * @return oldRepoId
     */
    public String getOldRepoId() {
        return oldRepoId;
    }

    public void setOldRepoId(String oldRepoId) {
        this.oldRepoId = oldRepoId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ArtifactSearchResult that = (ArtifactSearchResult) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.relativePath, that.relativePath)
            && Objects.equals(this.repo, that.repo) && Objects.equals(this.repoName, that.repoName)
            && Objects.equals(this.displayName, that.displayName) && Objects.equals(this.repoType, that.repoType)
            && Objects.equals(this.createdBy, that.createdBy)
            && Objects.equals(this.createdUserName, that.createdUserName) && Objects.equals(this.created, that.created)
            && Objects.equals(this.modified, that.modified) && Objects.equals(this.oldRepoId, that.oldRepoId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            relativePath,
            repo,
            repoName,
            displayName,
            repoType,
            createdBy,
            createdUserName,
            created,
            modified,
            oldRepoId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ArtifactSearchResult {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    relativePath: ").append(toIndentedString(relativePath)).append("\n");
        sb.append("    repo: ").append(toIndentedString(repo)).append("\n");
        sb.append("    repoName: ").append(toIndentedString(repoName)).append("\n");
        sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
        sb.append("    repoType: ").append(toIndentedString(repoType)).append("\n");
        sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
        sb.append("    createdUserName: ").append(toIndentedString(createdUserName)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
        sb.append("    oldRepoId: ").append(toIndentedString(oldRepoId)).append("\n");
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
