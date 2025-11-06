package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ForkRepositoryBasicDto
 */
public class ForkRepositoryBasicDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "namespace")

    private String namespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "develop_mode")

    private String developMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "visibility")

    private String visibility;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "security")

    private String security;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "star_count")

    private Integer starCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "forks_count")

    private Integer forksCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "open_merge_requests_count")

    private Integer openMergeRequestsCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "starred")

    private Boolean starred;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name_with_namespace")

    private String nameWithNamespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_activity_at")

    private String lastActivityAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    public ForkRepositoryBasicDto withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * **参数解释：** 命名空间。 **约束限制：** view=basic时返回
     * @return namespace
     */
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public ForkRepositoryBasicDto withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * **参数解释：** 仓库路径。 **约束限制：** view=basic时返回
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ForkRepositoryBasicDto withDevelopMode(String developMode) {
        this.developMode = developMode;
        return this;
    }

    /**
     * **参数解释：** 开发模式。 **约束限制：** view=basic时返回
     * @return developMode
     */
    public String getDevelopMode() {
        return developMode;
    }

    public void setDevelopMode(String developMode) {
        this.developMode = developMode;
    }

    public ForkRepositoryBasicDto withVisibility(String visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * **参数解释：** 可见性。 **约束限制：** view=basic时返回
     * @return visibility
     */
    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public ForkRepositoryBasicDto withSecurity(String security) {
        this.security = security;
        return this;
    }

    /**
     * **参数解释：** 安全级别。 **约束限制：**  view=basic时返回
     * @return security
     */
    public String getSecurity() {
        return security;
    }

    public void setSecurity(String security) {
        this.security = security;
    }

    public ForkRepositoryBasicDto withStarCount(Integer starCount) {
        this.starCount = starCount;
        return this;
    }

    /**
     * **参数解释：** 关注数。 **约束限制：** view=basic时返回
     * minimum: 1
     * maximum: 2147483647
     * @return starCount
     */
    public Integer getStarCount() {
        return starCount;
    }

    public void setStarCount(Integer starCount) {
        this.starCount = starCount;
    }

    public ForkRepositoryBasicDto withForksCount(Integer forksCount) {
        this.forksCount = forksCount;
        return this;
    }

    /**
     * **参数解释：** Fork数。 **约束限制：** view=basic时返回
     * minimum: 1
     * maximum: 2147483647
     * @return forksCount
     */
    public Integer getForksCount() {
        return forksCount;
    }

    public void setForksCount(Integer forksCount) {
        this.forksCount = forksCount;
    }

    public ForkRepositoryBasicDto withOpenMergeRequestsCount(Integer openMergeRequestsCount) {
        this.openMergeRequestsCount = openMergeRequestsCount;
        return this;
    }

    /**
     * **参数解释：** 开启的合并请求数。 **约束限制：** view=basic时返回
     * minimum: 1
     * maximum: 2147483647
     * @return openMergeRequestsCount
     */
    public Integer getOpenMergeRequestsCount() {
        return openMergeRequestsCount;
    }

    public void setOpenMergeRequestsCount(Integer openMergeRequestsCount) {
        this.openMergeRequestsCount = openMergeRequestsCount;
    }

    public ForkRepositoryBasicDto withStarred(Boolean starred) {
        this.starred = starred;
        return this;
    }

    /**
     * **参数解释：** 是否已关注。 **约束限制：** view=basic时返回
     * @return starred
     */
    public Boolean getStarred() {
        return starred;
    }

    public void setStarred(Boolean starred) {
        this.starred = starred;
    }

    public ForkRepositoryBasicDto withNameWithNamespace(String nameWithNamespace) {
        this.nameWithNamespace = nameWithNamespace;
        return this;
    }

    /**
     * **参数解释：** 带命名空间的仓库名称。 **约束限制：** view=basic时返回
     * @return nameWithNamespace
     */
    public String getNameWithNamespace() {
        return nameWithNamespace;
    }

    public void setNameWithNamespace(String nameWithNamespace) {
        this.nameWithNamespace = nameWithNamespace;
    }

    public ForkRepositoryBasicDto withLastActivityAt(String lastActivityAt) {
        this.lastActivityAt = lastActivityAt;
        return this;
    }

    /**
     * **参数解释：** 最后活动时间。 **约束限制：** view=basic时返回
     * @return lastActivityAt
     */
    public String getLastActivityAt() {
        return lastActivityAt;
    }

    public void setLastActivityAt(String lastActivityAt) {
        this.lastActivityAt = lastActivityAt;
    }

    public ForkRepositoryBasicDto withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释：** 创建时间。 **约束限制：** view=basic时返回
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ForkRepositoryBasicDto that = (ForkRepositoryBasicDto) obj;
        return Objects.equals(this.namespace, that.namespace) && Objects.equals(this.path, that.path)
            && Objects.equals(this.developMode, that.developMode) && Objects.equals(this.visibility, that.visibility)
            && Objects.equals(this.security, that.security) && Objects.equals(this.starCount, that.starCount)
            && Objects.equals(this.forksCount, that.forksCount)
            && Objects.equals(this.openMergeRequestsCount, that.openMergeRequestsCount)
            && Objects.equals(this.starred, that.starred)
            && Objects.equals(this.nameWithNamespace, that.nameWithNamespace)
            && Objects.equals(this.lastActivityAt, that.lastActivityAt)
            && Objects.equals(this.createdAt, that.createdAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(namespace,
            path,
            developMode,
            visibility,
            security,
            starCount,
            forksCount,
            openMergeRequestsCount,
            starred,
            nameWithNamespace,
            lastActivityAt,
            createdAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ForkRepositoryBasicDto {\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    developMode: ").append(toIndentedString(developMode)).append("\n");
        sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
        sb.append("    security: ").append(toIndentedString(security)).append("\n");
        sb.append("    starCount: ").append(toIndentedString(starCount)).append("\n");
        sb.append("    forksCount: ").append(toIndentedString(forksCount)).append("\n");
        sb.append("    openMergeRequestsCount: ").append(toIndentedString(openMergeRequestsCount)).append("\n");
        sb.append("    starred: ").append(toIndentedString(starred)).append("\n");
        sb.append("    nameWithNamespace: ").append(toIndentedString(nameWithNamespace)).append("\n");
        sb.append("    lastActivityAt: ").append(toIndentedString(lastActivityAt)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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
