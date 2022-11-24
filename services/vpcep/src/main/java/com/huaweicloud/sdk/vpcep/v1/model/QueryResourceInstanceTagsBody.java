package com.huaweicloud.sdk.vpcep.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询资源实例接口请求结构体
 */
public class QueryResourceInstanceTagsBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TagValuesList> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags_any")

    private List<TagValuesList> tagsAny = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_tags")

    private List<TagValuesList> notTags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_tags_any")

    private List<TagValuesList> notTagsAny = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sys_tags")

    private List<TagValuesList> sysTags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private String limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private String offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "matches")

    private List<Match> matches = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "without_any_tag")

    private Boolean withoutAnyTag;

    public QueryResourceInstanceTagsBody withTags(List<TagValuesList> tags) {
        this.tags = tags;
        return this;
    }

    public QueryResourceInstanceTagsBody addTagsItem(TagValuesList tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public QueryResourceInstanceTagsBody withTags(Consumer<List<TagValuesList>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 包含标签，最多包含10个key，每个key下面的value最多10个， 每个key对应的value可以为空数组但结构体不能缺失。Key不能重复， 同一个key中values不能重复。结果返回包含所有标签的资源列表， key之间是与的关系，key-value结构中value是或的关系。 无tag过滤条件时返回全量数据。
     * @return tags
     */
    public List<TagValuesList> getTags() {
        return tags;
    }

    public void setTags(List<TagValuesList> tags) {
        this.tags = tags;
    }

    public QueryResourceInstanceTagsBody withTagsAny(List<TagValuesList> tagsAny) {
        this.tagsAny = tagsAny;
        return this;
    }

    public QueryResourceInstanceTagsBody addTagsAnyItem(TagValuesList tagsAnyItem) {
        if (this.tagsAny == null) {
            this.tagsAny = new ArrayList<>();
        }
        this.tagsAny.add(tagsAnyItem);
        return this;
    }

    public QueryResourceInstanceTagsBody withTagsAny(Consumer<List<TagValuesList>> tagsAnySetter) {
        if (this.tagsAny == null) {
            this.tagsAny = new ArrayList<>();
        }
        tagsAnySetter.accept(this.tagsAny);
        return this;
    }

    /**
     * 包含任意标签，最多包含10个key，每个key下面的value最多10个， 每个key对应的value可以为空数组但结构体不能缺失。 Key不能重复，同一个key中values不能重复。 结果返回包含标签的资源列表，key之间是或的关系，key、value结构中value是或的关系。 无过滤条件时返回全量数据。
     * @return tagsAny
     */
    public List<TagValuesList> getTagsAny() {
        return tagsAny;
    }

    public void setTagsAny(List<TagValuesList> tagsAny) {
        this.tagsAny = tagsAny;
    }

    public QueryResourceInstanceTagsBody withNotTags(List<TagValuesList> notTags) {
        this.notTags = notTags;
        return this;
    }

    public QueryResourceInstanceTagsBody addNotTagsItem(TagValuesList notTagsItem) {
        if (this.notTags == null) {
            this.notTags = new ArrayList<>();
        }
        this.notTags.add(notTagsItem);
        return this;
    }

    public QueryResourceInstanceTagsBody withNotTags(Consumer<List<TagValuesList>> notTagsSetter) {
        if (this.notTags == null) {
            this.notTags = new ArrayList<>();
        }
        notTagsSetter.accept(this.notTags);
        return this;
    }

    /**
     * 不包含标签，最多包含10个key，每个key下面的value最多10个， 每个key对应的value可以为空数组但结构体不能缺失。Key不能重复， 同一个key中values不能重复。结果返回不包含标签的资源列表，key之间是与的关系， key、value结构中value是或的关系。 无过滤条件时返回全量数据。
     * @return notTags
     */
    public List<TagValuesList> getNotTags() {
        return notTags;
    }

    public void setNotTags(List<TagValuesList> notTags) {
        this.notTags = notTags;
    }

    public QueryResourceInstanceTagsBody withNotTagsAny(List<TagValuesList> notTagsAny) {
        this.notTagsAny = notTagsAny;
        return this;
    }

    public QueryResourceInstanceTagsBody addNotTagsAnyItem(TagValuesList notTagsAnyItem) {
        if (this.notTagsAny == null) {
            this.notTagsAny = new ArrayList<>();
        }
        this.notTagsAny.add(notTagsAnyItem);
        return this;
    }

    public QueryResourceInstanceTagsBody withNotTagsAny(Consumer<List<TagValuesList>> notTagsAnySetter) {
        if (this.notTagsAny == null) {
            this.notTagsAny = new ArrayList<>();
        }
        notTagsAnySetter.accept(this.notTagsAny);
        return this;
    }

    /**
     * 不包含任意标签，最多包含10个key，每个key下面的value最多10个， 每个key对应的value可以为空数组但结构体不能缺失。Key不能重复， 同一个key中values不能重复。结果返回不包含标签的资源列表， key之间是与的关系，key、value结构中value是或的关系。 无过滤条件时返回全量数据。
     * @return notTagsAny
     */
    public List<TagValuesList> getNotTagsAny() {
        return notTagsAny;
    }

    public void setNotTagsAny(List<TagValuesList> notTagsAny) {
        this.notTagsAny = notTagsAny;
    }

    public QueryResourceInstanceTagsBody withSysTags(List<TagValuesList> sysTags) {
        this.sysTags = sysTags;
        return this;
    }

    public QueryResourceInstanceTagsBody addSysTagsItem(TagValuesList sysTagsItem) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        this.sysTags.add(sysTagsItem);
        return this;
    }

    public QueryResourceInstanceTagsBody withSysTags(Consumer<List<TagValuesList>> sysTagsSetter) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        sysTagsSetter.accept(this.sysTags);
        return this;
    }

    /**
     * 系统标签，
     * @return sysTags
     */
    public List<TagValuesList> getSysTags() {
        return sysTags;
    }

    public void setSysTags(List<TagValuesList> sysTags) {
        this.sysTags = sysTags;
    }

    public QueryResourceInstanceTagsBody withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询记录数（action为count时无此参数）如果action为filter默认为1000， limit最多为1000，不能为负数，最小值为1。
     * @return limit
     */
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public QueryResourceInstanceTagsBody withOffset(String offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 索引位置，偏移量（action为count时无此参数）从第一条数据偏移offset条数据后开始查询， 如果action为filter默认为0（偏移0条数据，表示从第一条数据开始查询）， 必须为数字，不能为负数。
     * @return offset
     */
    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public QueryResourceInstanceTagsBody withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 操作标识（仅限于filter，count）：filter（过滤）， count(查询总条数)如果是filter就按照过滤条件查询， 如果是count，只需要返回总条数，禁止返回其他字段。
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public QueryResourceInstanceTagsBody withMatches(List<Match> matches) {
        this.matches = matches;
        return this;
    }

    public QueryResourceInstanceTagsBody addMatchesItem(Match matchesItem) {
        if (this.matches == null) {
            this.matches = new ArrayList<>();
        }
        this.matches.add(matchesItem);
        return this;
    }

    public QueryResourceInstanceTagsBody withMatches(Consumer<List<Match>> matchesSetter) {
        if (this.matches == null) {
            this.matches = new ArrayList<>();
        }
        matchesSetter.accept(this.matches);
        return this;
    }

    /**
     * 搜索字段，key为要匹配的字段，如resource_name等。value为匹配的值。 key为固定字典值，不能包含重复的key或不支持的key。 根据key的值确认是否需要模糊匹配，如resource_name默认为模糊搜索（不区分大小写）， 如果value为空字符串精确匹配（多数服务不存在资源名称为空的情况， 因此此类情况返回空列表）。resource_id为精确匹配。 第一期只做resource_name，后续再扩展。
     * @return matches
     */
    public List<Match> getMatches() {
        return matches;
    }

    public void setMatches(List<Match> matches) {
        this.matches = matches;
    }

    public QueryResourceInstanceTagsBody withWithoutAnyTag(Boolean withoutAnyTag) {
        this.withoutAnyTag = withoutAnyTag;
        return this;
    }

    /**
     * 默认为false，取值【true/false】,当withoutAnyTag=true， 忽略tags、tagsAny、notTags、notTagsAny参数校验。
     * @return withoutAnyTag
     */
    public Boolean getWithoutAnyTag() {
        return withoutAnyTag;
    }

    public void setWithoutAnyTag(Boolean withoutAnyTag) {
        this.withoutAnyTag = withoutAnyTag;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryResourceInstanceTagsBody queryResourceInstanceTagsBody = (QueryResourceInstanceTagsBody) o;
        return Objects.equals(this.tags, queryResourceInstanceTagsBody.tags)
            && Objects.equals(this.tagsAny, queryResourceInstanceTagsBody.tagsAny)
            && Objects.equals(this.notTags, queryResourceInstanceTagsBody.notTags)
            && Objects.equals(this.notTagsAny, queryResourceInstanceTagsBody.notTagsAny)
            && Objects.equals(this.sysTags, queryResourceInstanceTagsBody.sysTags)
            && Objects.equals(this.limit, queryResourceInstanceTagsBody.limit)
            && Objects.equals(this.offset, queryResourceInstanceTagsBody.offset)
            && Objects.equals(this.action, queryResourceInstanceTagsBody.action)
            && Objects.equals(this.matches, queryResourceInstanceTagsBody.matches)
            && Objects.equals(this.withoutAnyTag, queryResourceInstanceTagsBody.withoutAnyTag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tags, tagsAny, notTags, notTagsAny, sysTags, limit, offset, action, matches, withoutAnyTag);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryResourceInstanceTagsBody {\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    tagsAny: ").append(toIndentedString(tagsAny)).append("\n");
        sb.append("    notTags: ").append(toIndentedString(notTags)).append("\n");
        sb.append("    notTagsAny: ").append(toIndentedString(notTagsAny)).append("\n");
        sb.append("    sysTags: ").append(toIndentedString(sysTags)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    matches: ").append(toIndentedString(matches)).append("\n");
        sb.append("    withoutAnyTag: ").append(toIndentedString(withoutAnyTag)).append("\n");
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
