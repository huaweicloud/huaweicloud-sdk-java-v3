package com.huaweicloud.sdk.dataartsfabric.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 标签管理界面查询资源实例列表的请求体。
 */
public class ListTagWorkspacesRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "without_any_tag")

    private Boolean withoutAnyTag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<ResourceTagParam> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "matches")

    private List<TagMatch> matches = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sys_tags")

    private List<SystemTagParam> sysTags = null;

    public ListTagWorkspacesRequestBody withWithoutAnyTag(Boolean withoutAnyTag) {
        this.withoutAnyTag = withoutAnyTag;
        return this;
    }

    /**
     * 不包含任意一个标签，该字段为true时查询所有不带标签的资源，此时忽略 “tags”、“tags_any”、“not_tags”、“not_tags_any”字段
     * @return withoutAnyTag
     */
    public Boolean getWithoutAnyTag() {
        return withoutAnyTag;
    }

    public void setWithoutAnyTag(Boolean withoutAnyTag) {
        this.withoutAnyTag = withoutAnyTag;
    }

    public ListTagWorkspacesRequestBody withTags(List<ResourceTagParam> tags) {
        this.tags = tags;
        return this;
    }

    public ListTagWorkspacesRequestBody addTagsItem(ResourceTagParam tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ListTagWorkspacesRequestBody withTags(Consumer<List<ResourceTagParam>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 包含标签，最多包含50个key，每个key下面的value最多10个，每个key对应的value可以为空数组但结构体不能缺失。
     * @return tags
     */
    public List<ResourceTagParam> getTags() {
        return tags;
    }

    public void setTags(List<ResourceTagParam> tags) {
        this.tags = tags;
    }

    public ListTagWorkspacesRequestBody withMatches(List<TagMatch> matches) {
        this.matches = matches;
        return this;
    }

    public ListTagWorkspacesRequestBody addMatchesItem(TagMatch matchesItem) {
        if (this.matches == null) {
            this.matches = new ArrayList<>();
        }
        this.matches.add(matchesItem);
        return this;
    }

    public ListTagWorkspacesRequestBody withMatches(Consumer<List<TagMatch>> matchesSetter) {
        if (this.matches == null) {
            this.matches = new ArrayList<>();
        }
        matchesSetter.accept(this.matches);
        return this;
    }

    /**
     * 搜索字段，key为要匹配的字段，如resource_name等。value为匹配的值。
     * @return matches
     */
    public List<TagMatch> getMatches() {
        return matches;
    }

    public void setMatches(List<TagMatch> matches) {
        this.matches = matches;
    }

    public ListTagWorkspacesRequestBody withSysTags(List<SystemTagParam> sysTags) {
        this.sysTags = sysTags;
        return this;
    }

    public ListTagWorkspacesRequestBody addSysTagsItem(SystemTagParam sysTagsItem) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        this.sysTags.add(sysTagsItem);
        return this;
    }

    public ListTagWorkspacesRequestBody withSysTags(Consumer<List<SystemTagParam>> sysTagsSetter) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        sysTagsSetter.accept(this.sysTags);
        return this;
    }

    /**
     * 系统标签列表，目前只包含一个tag结构体。key下面只包含一个value。
     * @return sysTags
     */
    public List<SystemTagParam> getSysTags() {
        return sysTags;
    }

    public void setSysTags(List<SystemTagParam> sysTags) {
        this.sysTags = sysTags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListTagWorkspacesRequestBody that = (ListTagWorkspacesRequestBody) obj;
        return Objects.equals(this.withoutAnyTag, that.withoutAnyTag) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.matches, that.matches) && Objects.equals(this.sysTags, that.sysTags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(withoutAnyTag, tags, matches, sysTags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTagWorkspacesRequestBody {\n");
        sb.append("    withoutAnyTag: ").append(toIndentedString(withoutAnyTag)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    matches: ").append(toIndentedString(matches)).append("\n");
        sb.append("    sysTags: ").append(toIndentedString(sysTags)).append("\n");
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
