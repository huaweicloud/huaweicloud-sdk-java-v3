package com.huaweicloud.sdk.cbh.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * TMS查询CBH资源实例列表请求体。
 */
public class ListCBHByTagsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "without_any_tag")

    private Boolean withoutAnyTag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tags> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags_any")

    private List<Tags> tagsAny = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_tags")

    private List<Tags> notTags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_tags_any")

    private List<Tags> notTagsAny = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sys_tags")

    private List<Tags> sysTags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "matches")

    private List<Match> matches = null;

    public ListCBHByTagsRequestBody withWithoutAnyTag(Boolean withoutAnyTag) {
        this.withoutAnyTag = withoutAnyTag;
        return this;
    }

    /**
     * 不包含任意一个标签，该字段为true时查询所有不带标签的资源。  此时忽略 “tags”、“tags_any”、“not_tags”、“not_tags_any”字段。
     * @return withoutAnyTag
     */
    public Boolean getWithoutAnyTag() {
        return withoutAnyTag;
    }

    public void setWithoutAnyTag(Boolean withoutAnyTag) {
        this.withoutAnyTag = withoutAnyTag;
    }

    public ListCBHByTagsRequestBody withTags(List<Tags> tags) {
        this.tags = tags;
        return this;
    }

    public ListCBHByTagsRequestBody addTagsItem(Tags tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ListCBHByTagsRequestBody withTags(Consumer<List<Tags>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 包含标签，最多包含50个key，每个key下面的value最多10个，每个key对应的value可以为空数组但结构体不能缺失。  Key不能重复，同一个key中values不能重复。结果返回包含所有标签的资源列表，key之间是与的关系， key-value结构中value是或的关系。  无tag过滤条件时返回全量数据。
     * @return tags
     */
    public List<Tags> getTags() {
        return tags;
    }

    public void setTags(List<Tags> tags) {
        this.tags = tags;
    }

    public ListCBHByTagsRequestBody withTagsAny(List<Tags> tagsAny) {
        this.tagsAny = tagsAny;
        return this;
    }

    public ListCBHByTagsRequestBody addTagsAnyItem(Tags tagsAnyItem) {
        if (this.tagsAny == null) {
            this.tagsAny = new ArrayList<>();
        }
        this.tagsAny.add(tagsAnyItem);
        return this;
    }

    public ListCBHByTagsRequestBody withTagsAny(Consumer<List<Tags>> tagsAnySetter) {
        if (this.tagsAny == null) {
            this.tagsAny = new ArrayList<>();
        }
        tagsAnySetter.accept(this.tagsAny);
        return this;
    }

    /**
     * 包含任意标签，最多包含50个key，每个key下面的value最多10个,每个key对应的value可以为空数组但结构体不能缺失。Key不能重复，同一个key中values不能重复。  结果返回包含标签的资源列表，key之间是或的关系，key-value结构中value是或的关系。  无过滤条件时返回全量数据。
     * @return tagsAny
     */
    public List<Tags> getTagsAny() {
        return tagsAny;
    }

    public void setTagsAny(List<Tags> tagsAny) {
        this.tagsAny = tagsAny;
    }

    public ListCBHByTagsRequestBody withNotTags(List<Tags> notTags) {
        this.notTags = notTags;
        return this;
    }

    public ListCBHByTagsRequestBody addNotTagsItem(Tags notTagsItem) {
        if (this.notTags == null) {
            this.notTags = new ArrayList<>();
        }
        this.notTags.add(notTagsItem);
        return this;
    }

    public ListCBHByTagsRequestBody withNotTags(Consumer<List<Tags>> notTagsSetter) {
        if (this.notTags == null) {
            this.notTags = new ArrayList<>();
        }
        notTagsSetter.accept(this.notTags);
        return this;
    }

    /**
     * 不包含标签，最多包含50个key，每个key下面的value最多10个, 每个key对应的value可以为空数组但结构体不能缺失。Key不能重复，同一个key中values不能重复。  结果返回不包含标签的资源列表，key之间是与的关系，key-value结构中value是或的关系。  无过滤条件时返回全量数据。
     * @return notTags
     */
    public List<Tags> getNotTags() {
        return notTags;
    }

    public void setNotTags(List<Tags> notTags) {
        this.notTags = notTags;
    }

    public ListCBHByTagsRequestBody withNotTagsAny(List<Tags> notTagsAny) {
        this.notTagsAny = notTagsAny;
        return this;
    }

    public ListCBHByTagsRequestBody addNotTagsAnyItem(Tags notTagsAnyItem) {
        if (this.notTagsAny == null) {
            this.notTagsAny = new ArrayList<>();
        }
        this.notTagsAny.add(notTagsAnyItem);
        return this;
    }

    public ListCBHByTagsRequestBody withNotTagsAny(Consumer<List<Tags>> notTagsAnySetter) {
        if (this.notTagsAny == null) {
            this.notTagsAny = new ArrayList<>();
        }
        notTagsAnySetter.accept(this.notTagsAny);
        return this;
    }

    /**
     * 不包含任意标签，最多包含50个key，每个key下面的value最多10个, 每个key对应的value可以为空数组但结构体不能缺失。Key不能重复，同一个key中values不能重复。  结果返回不包含标签的资源列表，key之间是或的关系，key-value结构中value是或的关系。  无过滤条件时返回全量数据。
     * @return notTagsAny
     */
    public List<Tags> getNotTagsAny() {
        return notTagsAny;
    }

    public void setNotTagsAny(List<Tags> notTagsAny) {
        this.notTagsAny = notTagsAny;
    }

    public ListCBHByTagsRequestBody withSysTags(List<Tags> sysTags) {
        this.sysTags = sysTags;
        return this;
    }

    public ListCBHByTagsRequestBody addSysTagsItem(Tags sysTagsItem) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        this.sysTags.add(sysTagsItem);
        return this;
    }

    public ListCBHByTagsRequestBody withSysTags(Consumer<List<Tags>> sysTagsSetter) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        sysTagsSetter.accept(this.sysTags);
        return this;
    }

    /**
     * 仅op_service权限可以使用此字段做资源实例过滤条件。  目前TMS调用时只包含一个tag结构体。  key：_sys_enterprise_project_id  value：企业项目id列表  目前TMS调用时，key下面只包含一个value。0表示默认企业项目  sys_tags和租户标签过滤条件（without_any_tag 、tags、tags_any、not_tags、not_tags_any）不能同时使用  无sys_tags时按照tag接口处理，无tag过滤条件时返回全量数据。。
     * @return sysTags
     */
    public List<Tags> getSysTags() {
        return sysTags;
    }

    public void setSysTags(List<Tags> sysTags) {
        this.sysTags = sysTags;
    }

    public ListCBHByTagsRequestBody withMatches(List<Match> matches) {
        this.matches = matches;
        return this;
    }

    public ListCBHByTagsRequestBody addMatchesItem(Match matchesItem) {
        if (this.matches == null) {
            this.matches = new ArrayList<>();
        }
        this.matches.add(matchesItem);
        return this;
    }

    public ListCBHByTagsRequestBody withMatches(Consumer<List<Match>> matchesSetter) {
        if (this.matches == null) {
            this.matches = new ArrayList<>();
        }
        matchesSetter.accept(this.matches);
        return this;
    }

    /**
     * 搜索字段,key为要匹配的字段，如resource_name等。  value为匹配的值。key为固定字典值，不能包含重复的key或不支持的key。  根据key的值确认是否需要模糊匹配，如resource_name默认为模糊搜索（不区分大小写），如果value为空字符串精确匹配（多数服务不存在资源名称为空的情况，因此此类情况返回空列表）。  resource_id为精确匹配。第一期只做resource_name，后续再扩展。
     * @return matches
     */
    public List<Match> getMatches() {
        return matches;
    }

    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListCBHByTagsRequestBody that = (ListCBHByTagsRequestBody) obj;
        return Objects.equals(this.withoutAnyTag, that.withoutAnyTag) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.tagsAny, that.tagsAny) && Objects.equals(this.notTags, that.notTags)
            && Objects.equals(this.notTagsAny, that.notTagsAny) && Objects.equals(this.sysTags, that.sysTags)
            && Objects.equals(this.matches, that.matches);
    }

    @Override
    public int hashCode() {
        return Objects.hash(withoutAnyTag, tags, tagsAny, notTags, notTagsAny, sysTags, matches);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListCBHByTagsRequestBody {\n");
        sb.append("    withoutAnyTag: ").append(toIndentedString(withoutAnyTag)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    tagsAny: ").append(toIndentedString(tagsAny)).append("\n");
        sb.append("    notTags: ").append(toIndentedString(notTags)).append("\n");
        sb.append("    notTagsAny: ").append(toIndentedString(notTagsAny)).append("\n");
        sb.append("    sysTags: ").append(toIndentedString(sysTags)).append("\n");
        sb.append("    matches: ").append(toIndentedString(matches)).append("\n");
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
