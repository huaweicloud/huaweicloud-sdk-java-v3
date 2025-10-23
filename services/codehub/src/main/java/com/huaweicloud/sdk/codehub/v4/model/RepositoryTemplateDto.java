package com.huaweicloud.sdk.codehub.v4.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释：** 模板仓列表
 */
public class RepositoryTemplateDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_id")

    private Integer repositoryId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "system")

    private Boolean system;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private String language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repository_name")

    private String repositoryName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "brief_introduction")

    private String briefIntroduction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_times")

    private Integer usedTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "liked_times")

    private Integer likedTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_name")

    private String creatorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "https_url")

    private String httpsUrl;

    public RepositoryTemplateDto withRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    /**
     * **参数解释：** 仓库Id。
     * minimum: 1
     * maximum: 2147483647
     * @return repositoryId
     */
    public Integer getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(Integer repositoryId) {
        this.repositoryId = repositoryId;
    }

    public RepositoryTemplateDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 模板仓标题。 **取值范围：** 字符串长度1-50。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RepositoryTemplateDto withSystem(Boolean system) {
        this.system = system;
        return this;
    }

    /**
     * **参数解释：** 是否是系统模板。 **取值范围：** - true，系统模板。 - false，个人模板。
     * @return system
     */
    public Boolean getSystem() {
        return system;
    }

    public void setSystem(Boolean system) {
        this.system = system;
    }

    public RepositoryTemplateDto withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public RepositoryTemplateDto addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public RepositoryTemplateDto withTags(Consumer<List<String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释：** 标签列表。 **取值范围：** 不涉及。
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public RepositoryTemplateDto withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 仓库描述信息。 **取值范围：** 字符串长度0-2000。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public RepositoryTemplateDto withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * **参数解释：** 编程语言。 **取值范围：** 字符串长度0-32。
     * @return language
     */
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public RepositoryTemplateDto withRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    /**
     * **参数解释：** 模板仓的仓库名称。 **取值范围：** 字符串长度0-255。
     * @return repositoryName
     */
    public String getRepositoryName() {
        return repositoryName;
    }

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    public RepositoryTemplateDto withBriefIntroduction(String briefIntroduction) {
        this.briefIntroduction = briefIntroduction;
        return this;
    }

    /**
     * **参数解释：** 模板仓的简介。 **取值范围：** 字符串长度0-32。
     * @return briefIntroduction
     */
    public String getBriefIntroduction() {
        return briefIntroduction;
    }

    public void setBriefIntroduction(String briefIntroduction) {
        this.briefIntroduction = briefIntroduction;
    }

    public RepositoryTemplateDto withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释：** 创建时间。
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public RepositoryTemplateDto withUsedTimes(Integer usedTimes) {
        this.usedTimes = usedTimes;
        return this;
    }

    /**
     * **参数解释：** 模板仓被使用的次数。
     * minimum: 0
     * maximum: 2147483647
     * @return usedTimes
     */
    public Integer getUsedTimes() {
        return usedTimes;
    }

    public void setUsedTimes(Integer usedTimes) {
        this.usedTimes = usedTimes;
    }

    public RepositoryTemplateDto withLikedTimes(Integer likedTimes) {
        this.likedTimes = likedTimes;
        return this;
    }

    /**
     * **参数解释：** 模板仓被点赞的次数。
     * minimum: 0
     * maximum: 2147483647
     * @return likedTimes
     */
    public Integer getLikedTimes() {
        return likedTimes;
    }

    public void setLikedTimes(Integer likedTimes) {
        this.likedTimes = likedTimes;
    }

    public RepositoryTemplateDto withCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }

    /**
     * **参数解释：** 作者。 **取值范围：** 字符串长度0-128。
     * @return creatorName
     */
    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public RepositoryTemplateDto withHttpsUrl(String httpsUrl) {
        this.httpsUrl = httpsUrl;
        return this;
    }

    /**
     * **参数解释：** 代码仓https协议的git地址。 **取值范围：** 字符串最大长度512。
     * @return httpsUrl
     */
    public String getHttpsUrl() {
        return httpsUrl;
    }

    public void setHttpsUrl(String httpsUrl) {
        this.httpsUrl = httpsUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RepositoryTemplateDto that = (RepositoryTemplateDto) obj;
        return Objects.equals(this.repositoryId, that.repositoryId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.system, that.system) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.description, that.description) && Objects.equals(this.language, that.language)
            && Objects.equals(this.repositoryName, that.repositoryName)
            && Objects.equals(this.briefIntroduction, that.briefIntroduction)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.usedTimes, that.usedTimes)
            && Objects.equals(this.likedTimes, that.likedTimes) && Objects.equals(this.creatorName, that.creatorName)
            && Objects.equals(this.httpsUrl, that.httpsUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(repositoryId,
            name,
            system,
            tags,
            description,
            language,
            repositoryName,
            briefIntroduction,
            createdAt,
            usedTimes,
            likedTimes,
            creatorName,
            httpsUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryTemplateDto {\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    system: ").append(toIndentedString(system)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    repositoryName: ").append(toIndentedString(repositoryName)).append("\n");
        sb.append("    briefIntroduction: ").append(toIndentedString(briefIntroduction)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    usedTimes: ").append(toIndentedString(usedTimes)).append("\n");
        sb.append("    likedTimes: ").append(toIndentedString(likedTimes)).append("\n");
        sb.append("    creatorName: ").append(toIndentedString(creatorName)).append("\n");
        sb.append("    httpsUrl: ").append(toIndentedString(httpsUrl)).append("\n");
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
