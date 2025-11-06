package com.huaweicloud.sdk.codeartsrepo.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 合并请求文件变更列表详情
 */
public class SimpleMergeRequestChangesDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_id")

    private Integer repositoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "title")

    private String title;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_branch")

    private String sourceBranch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_branch")

    private String targetBranch;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "author")

    private UserBasicDto author;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "web_url")

    private String webUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_at")

    private String createAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_at")

    private String updateAt;

    public SimpleMergeRequestChangesDto withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * MR id
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public SimpleMergeRequestChangesDto withRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    /**
     * 仓库id
     * @return repositoryId
     */
    public Integer getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
    }

    public SimpleMergeRequestChangesDto withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * 合并请求标题
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public SimpleMergeRequestChangesDto withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 合并请求描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public SimpleMergeRequestChangesDto withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * 合并请求状态
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public SimpleMergeRequestChangesDto withSourceBranch(String sourceBranch) {
        this.sourceBranch = sourceBranch;
        return this;
    }

    /**
     * 合并请求源分支名
     * @return sourceBranch
     */
    public String getSourceBranch() {
        return sourceBranch;
    }

    public void setSourceBranch(String sourceBranch) {
        this.sourceBranch = sourceBranch;
    }

    public SimpleMergeRequestChangesDto withTargetBranch(String targetBranch) {
        this.targetBranch = targetBranch;
        return this;
    }

    /**
     * 合并请求目标分支名
     * @return targetBranch
     */
    public String getTargetBranch() {
        return targetBranch;
    }

    public void setTargetBranch(String targetBranch) {
        this.targetBranch = targetBranch;
    }

    public SimpleMergeRequestChangesDto withAuthor(UserBasicDto author) {
        this.author = author;
        return this;
    }

    public SimpleMergeRequestChangesDto withAuthor(Consumer<UserBasicDto> authorSetter) {
        if (this.author == null) {
            this.author = new UserBasicDto();
            authorSetter.accept(this.author);
        }

        return this;
    }

    /**
     * Get author
     * @return author
     */
    public UserBasicDto getAuthor() {
        return author;
    }

    public void setAuthor(UserBasicDto author) {
        this.author = author;
    }

    public SimpleMergeRequestChangesDto withWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }

    /**
     * 合并请求URL链接
     * @return webUrl
     */
    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public SimpleMergeRequestChangesDto withCreateAt(String createAt) {
        this.createAt = createAt;
        return this;
    }

    /**
     * 合并请求创建时间
     * @return createAt
     */
    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public SimpleMergeRequestChangesDto withUpdateAt(String updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    /**
     * 合并请求最后更新时间
     * @return updateAt
     */
    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SimpleMergeRequestChangesDto that = (SimpleMergeRequestChangesDto) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.repositoryId, that.repositoryId)
            && Objects.equals(this.title, that.title) && Objects.equals(this.description, that.description)
            && Objects.equals(this.state, that.state) && Objects.equals(this.sourceBranch, that.sourceBranch)
            && Objects.equals(this.targetBranch, that.targetBranch) && Objects.equals(this.author, that.author)
            && Objects.equals(this.webUrl, that.webUrl) && Objects.equals(this.createAt, that.createAt)
            && Objects.equals(this.updateAt, that.updateAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            repositoryId,
            title,
            description,
            state,
            sourceBranch,
            targetBranch,
            author,
            webUrl,
            createAt,
            updateAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SimpleMergeRequestChangesDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    sourceBranch: ").append(toIndentedString(sourceBranch)).append("\n");
        sb.append("    targetBranch: ").append(toIndentedString(targetBranch)).append("\n");
        sb.append("    author: ").append(toIndentedString(author)).append("\n");
        sb.append("    webUrl: ").append(toIndentedString(webUrl)).append("\n");
        sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
        sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
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
