package com.huaweicloud.sdk.servicestage.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建模板请求体
 */
public class CreateTemplate {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_servicestage")

    private Integer isServicestage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desc")

    private String desc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_url")

    private String obsUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<String> tags = null;

    public CreateTemplate withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 模板名称,必填
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateTemplate withIsServicestage(Integer isServicestage) {
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

    public CreateTemplate withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * 描述信息,非必填
     * @return desc
     */
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public CreateTemplate withObsUrl(String obsUrl) {
        this.obsUrl = obsUrl;
        return this;
    }

    /**
     * 模板在桶中的url,必填
     * @return obsUrl
     */
    public String getObsUrl() {
        return obsUrl;
    }

    public void setObsUrl(String obsUrl) {
        this.obsUrl = obsUrl;
    }

    public CreateTemplate withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public CreateTemplate addTagsItem(String tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateTemplate withTags(Consumer<List<String>> tagsSetter) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateTemplate createTemplate = (CreateTemplate) o;
        return Objects.equals(this.name, createTemplate.name)
            && Objects.equals(this.isServicestage, createTemplate.isServicestage)
            && Objects.equals(this.desc, createTemplate.desc) && Objects.equals(this.obsUrl, createTemplate.obsUrl)
            && Objects.equals(this.tags, createTemplate.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, isServicestage, desc, obsUrl, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTemplate {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    isServicestage: ").append(toIndentedString(isServicestage)).append("\n");
        sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
        sb.append("    obsUrl: ").append(toIndentedString(obsUrl)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
