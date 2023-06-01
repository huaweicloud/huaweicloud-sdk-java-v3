package com.huaweicloud.sdk.servicestage.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 更新模板请求
 */
public class UpdateTemplates {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_url")

    private String obsUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_servicestage")

    private Integer isServicestage;

    public UpdateTemplates withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 模板名称,非必填
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateTemplates withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 模板描述,非必填
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateTemplates withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public UpdateTemplates addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public UpdateTemplates withTags(Consumer<List<String>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 模板标签,非必填
     * @return tags
     */
    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public UpdateTemplates withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 模板状态,非必填
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public UpdateTemplates withObsUrl(String obsUrl) {
        this.obsUrl = obsUrl;
        return this;
    }

    /**
     * obs地址,必填
     * @return obsUrl
     */
    public String getObsUrl() {
        return obsUrl;
    }

    public void setObsUrl(String obsUrl) {
        this.obsUrl = obsUrl;
    }

    public UpdateTemplates withIsServicestage(Integer isServicestage) {
        this.isServicestage = isServicestage;
        return this;
    }

    /**
     * 应用是否托管到servicestage,1是托管,0是不托管,非必填
     * @return isServicestage
     */
    public Integer getIsServicestage() {
        return isServicestage;
    }

    public void setIsServicestage(Integer isServicestage) {
        this.isServicestage = isServicestage;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateTemplates updateTemplates = (UpdateTemplates) o;
        return Objects.equals(this.name, updateTemplates.name)
            && Objects.equals(this.description, updateTemplates.description)
            && Objects.equals(this.tags, updateTemplates.tags) && Objects.equals(this.status, updateTemplates.status)
            && Objects.equals(this.obsUrl, updateTemplates.obsUrl)
            && Objects.equals(this.isServicestage, updateTemplates.isServicestage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, tags, status, obsUrl, isServicestage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateTemplates {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    obsUrl: ").append(toIndentedString(obsUrl)).append("\n");
        sb.append("    isServicestage: ").append(toIndentedString(isServicestage)).append("\n");
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
