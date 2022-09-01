package com.huaweicloud.sdk.vpcep.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

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

    @JacksonXmlProperty(localName = "tags")

    private List<Tag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags_any")

    @JacksonXmlProperty(localName = "tags_any")

    private List<Tag> tagsAny = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_tags")

    @JacksonXmlProperty(localName = "not_tags")

    private List<Tag> notTags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_tags_any")

    @JacksonXmlProperty(localName = "not_tags_any")

    private List<Tag> notTagsAny = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    @JacksonXmlProperty(localName = "limit")

    private String limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    @JacksonXmlProperty(localName = "offset")

    private String offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    @JacksonXmlProperty(localName = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "matches")

    @JacksonXmlProperty(localName = "matches")

    private List<Match> matches = null;

    public QueryResourceInstanceTagsBody withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public QueryResourceInstanceTagsBody addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public QueryResourceInstanceTagsBody withTags(Consumer<List<Tag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 包含标签，最多包含10个key，每 个key下面的value最多10个，每 个key对应的value可以为空数组但 结构体不能缺失。Key不能重复， 同一个key中values不能重复。结 果返回包含所有标签的资源列表， key之间是与的关系，key-value结 构中value是或的关系。无tag过滤 条件时返回全量数据。
     * @return tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public QueryResourceInstanceTagsBody withTagsAny(List<Tag> tagsAny) {
        this.tagsAny = tagsAny;
        return this;
    }

    public QueryResourceInstanceTagsBody addTagsAnyItem(Tag tagsAnyItem) {
        if (this.tagsAny == null) {
            this.tagsAny = new ArrayList<>();
        }
        this.tagsAny.add(tagsAnyItem);
        return this;
    }

    public QueryResourceInstanceTagsBody withTagsAny(Consumer<List<Tag>> tagsAnySetter) {
        if (this.tagsAny == null) {
            this.tagsAny = new ArrayList<>();
        }
        tagsAnySetter.accept(this.tagsAny);
        return this;
    }

    /**
     * 包含任意标签，最多包含10个 key，每个key下面的value最多10 个，每个key对应的value可以为空 数组但结构体不能缺失。Key不能 重复，同一个key中values不能重 复。结果返回包含标签的资源列 表，key之间是或的关系，keyvalue 结构中value是或的关系。无 过滤条件时返回全量数据。
     * @return tagsAny
     */
    public List<Tag> getTagsAny() {
        return tagsAny;
    }

    public void setTagsAny(List<Tag> tagsAny) {
        this.tagsAny = tagsAny;
    }

    public QueryResourceInstanceTagsBody withNotTags(List<Tag> notTags) {
        this.notTags = notTags;
        return this;
    }

    public QueryResourceInstanceTagsBody addNotTagsItem(Tag notTagsItem) {
        if (this.notTags == null) {
            this.notTags = new ArrayList<>();
        }
        this.notTags.add(notTagsItem);
        return this;
    }

    public QueryResourceInstanceTagsBody withNotTags(Consumer<List<Tag>> notTagsSetter) {
        if (this.notTags == null) {
            this.notTags = new ArrayList<>();
        }
        notTagsSetter.accept(this.notTags);
        return this;
    }

    /**
     * 不包含标签，最多包含10个key， 每个key下面的value最多10个， 每个key对应的value可以为空数组 但结构体不能缺失。Key不能重 复，同一个key中values不能重 复。结果返回不包含标签的资源列 表，key之间是与的关系，keyvalue 结构中value是或的关系。无 过滤条件时返回全量数据。
     * @return notTags
     */
    public List<Tag> getNotTags() {
        return notTags;
    }

    public void setNotTags(List<Tag> notTags) {
        this.notTags = notTags;
    }

    public QueryResourceInstanceTagsBody withNotTagsAny(List<Tag> notTagsAny) {
        this.notTagsAny = notTagsAny;
        return this;
    }

    public QueryResourceInstanceTagsBody addNotTagsAnyItem(Tag notTagsAnyItem) {
        if (this.notTagsAny == null) {
            this.notTagsAny = new ArrayList<>();
        }
        this.notTagsAny.add(notTagsAnyItem);
        return this;
    }

    public QueryResourceInstanceTagsBody withNotTagsAny(Consumer<List<Tag>> notTagsAnySetter) {
        if (this.notTagsAny == null) {
            this.notTagsAny = new ArrayList<>();
        }
        notTagsAnySetter.accept(this.notTagsAny);
        return this;
    }

    /**
     * 不包含任意标签，最多包含10个 key，每个key下面的value最多10 个，每个key对应的value可以为空 数组但结构体不能缺失。Key不能 重复，同一个key中values不能重 复。结果返回不包含标签的资源列 表，key之间是与的关系，keyvalue 结构中value是或的关系。无 过滤条件时返回全量数据。
     * @return notTagsAny
     */
    public List<Tag> getNotTagsAny() {
        return notTagsAny;
    }

    public void setNotTagsAny(List<Tag> notTagsAny) {
        this.notTagsAny = notTagsAny;
    }

    public QueryResourceInstanceTagsBody withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询记录数（action为count时无 此参数）如果action为filter默认为 1000，limit最多为1000，不能为 负数，最小值为1。
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
     * 索引位置，偏移量（action为 count时无此参数）从第一条数据 偏移offset条数据后开始查询，如 果action为filter默认为0（偏移0 条数据，表示从第一条数据开始查 询），必须为数字，不能为负数。
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
     * 操作标识（仅限于filter， count）：filter（过滤）， count(查询总条数) 如果是filter就按照过滤条件查 询，如果是count，只需要返回总 条数，禁止返回其他字段。
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
     * 搜索字段，key为要匹配的字段， 如resource_name等。value为匹 配的值。key为固定字典值，不能 包含重复的key或不支持的key。 根据key的值确认是否需要模糊匹 配，如resource_name默认为模糊 搜索（不区分大小写），如果 value为空字符串精确匹配（多数 服务不存在资源名称为空的情况， 因此此类情况返回空列表）。 resource_id为精确匹配。第一期 只做resource_name，后续再扩 展。
     * @return matches
     */
    public List<Match> getMatches() {
        return matches;
    }

    public void setMatches(List<Match> matches) {
        this.matches = matches;
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
            && Objects.equals(this.limit, queryResourceInstanceTagsBody.limit)
            && Objects.equals(this.offset, queryResourceInstanceTagsBody.offset)
            && Objects.equals(this.action, queryResourceInstanceTagsBody.action)
            && Objects.equals(this.matches, queryResourceInstanceTagsBody.matches);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tags, tagsAny, notTags, notTagsAny, limit, offset, action, matches);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryResourceInstanceTagsBody {\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    tagsAny: ").append(toIndentedString(tagsAny)).append("\n");
        sb.append("    notTags: ").append(toIndentedString(notTags)).append("\n");
        sb.append("    notTagsAny: ").append(toIndentedString(notTagsAny)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
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
