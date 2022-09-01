package com.huaweicloud.sdk.codehub.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TemplateRepository
 */
public class TemplateRepository {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_name")

    @JacksonXmlProperty(localName = "template_name")

    private String templateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    @JacksonXmlProperty(localName = "tags")

    private List<String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "brief_introduction")

    @JacksonXmlProperty(localName = "brief_introduction")

    private String briefIntroduction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_pending_pipelines")

    @JacksonXmlProperty(localName = "auto_pending_pipelines")

    private Integer autoPendingPipelines;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    @JacksonXmlProperty(localName = "language")

    private String language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    @JacksonXmlProperty(localName = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_times")

    @JacksonXmlProperty(localName = "used_times")

    private Integer usedTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "liked_times")

    @JacksonXmlProperty(localName = "liked_times")

    private Integer likedTimes;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_name")

    @JacksonXmlProperty(localName = "creator_name")

    private String creatorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "https_url")

    @JacksonXmlProperty(localName = "https_url")

    private String httpsUrl;

    public TemplateRepository withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 模板唯一标识
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TemplateRepository withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 模板名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TemplateRepository withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * 模板关联仓库名称
     * @return templateName
     */
    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public TemplateRepository withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public TemplateRepository addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public TemplateRepository withTags(Consumer<List<String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 模板标签
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public TemplateRepository withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 模板描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TemplateRepository withBriefIntroduction(String briefIntroduction) {
        this.briefIntroduction = briefIntroduction;
        return this;
    }

    /**
     * 模板简介
     * @return briefIntroduction
     */
    public String getBriefIntroduction() {
        return briefIntroduction;
    }

    public void setBriefIntroduction(String briefIntroduction) {
        this.briefIntroduction = briefIntroduction;
    }

    public TemplateRepository withAutoPendingPipelines(Integer autoPendingPipelines) {
        this.autoPendingPipelines = autoPendingPipelines;
        return this;
    }

    /**
     * 是否自动创建流水线
     * @return autoPendingPipelines
     */
    public Integer getAutoPendingPipelines() {
        return autoPendingPipelines;
    }

    public void setAutoPendingPipelines(Integer autoPendingPipelines) {
        this.autoPendingPipelines = autoPendingPipelines;
    }

    public TemplateRepository withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * 模板语言分类
     * @return language
     */
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public TemplateRepository withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 模板创建时间
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public TemplateRepository withUsedTimes(Integer usedTimes) {
        this.usedTimes = usedTimes;
        return this;
    }

    /**
     * 模板引用次数
     * @return usedTimes
     */
    public Integer getUsedTimes() {
        return usedTimes;
    }

    public void setUsedTimes(Integer usedTimes) {
        this.usedTimes = usedTimes;
    }

    public TemplateRepository withLikedTimes(Integer likedTimes) {
        this.likedTimes = likedTimes;
        return this;
    }

    /**
     * 模板被点赞次数
     * @return likedTimes
     */
    public Integer getLikedTimes() {
        return likedTimes;
    }

    public void setLikedTimes(Integer likedTimes) {
        this.likedTimes = likedTimes;
    }

    public TemplateRepository withCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }

    /**
     * 模板创建人
     * @return creatorName
     */
    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public TemplateRepository withHttpsUrl(String httpsUrl) {
        this.httpsUrl = httpsUrl;
        return this;
    }

    /**
     * 模板https链接
     * @return httpsUrl
     */
    public String getHttpsUrl() {
        return httpsUrl;
    }

    public void setHttpsUrl(String httpsUrl) {
        this.httpsUrl = httpsUrl;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TemplateRepository templateRepository = (TemplateRepository) o;
        return Objects.equals(this.id, templateRepository.id) && Objects.equals(this.name, templateRepository.name)
            && Objects.equals(this.templateName, templateRepository.templateName)
            && Objects.equals(this.tags, templateRepository.tags)
            && Objects.equals(this.description, templateRepository.description)
            && Objects.equals(this.briefIntroduction, templateRepository.briefIntroduction)
            && Objects.equals(this.autoPendingPipelines, templateRepository.autoPendingPipelines)
            && Objects.equals(this.language, templateRepository.language)
            && Objects.equals(this.createdAt, templateRepository.createdAt)
            && Objects.equals(this.usedTimes, templateRepository.usedTimes)
            && Objects.equals(this.likedTimes, templateRepository.likedTimes)
            && Objects.equals(this.creatorName, templateRepository.creatorName)
            && Objects.equals(this.httpsUrl, templateRepository.httpsUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            templateName,
            tags,
            description,
            briefIntroduction,
            autoPendingPipelines,
            language,
            createdAt,
            usedTimes,
            likedTimes,
            creatorName,
            httpsUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TemplateRepository {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    briefIntroduction: ").append(toIndentedString(briefIntroduction)).append("\n");
        sb.append("    autoPendingPipelines: ").append(toIndentedString(autoPendingPipelines)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
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
