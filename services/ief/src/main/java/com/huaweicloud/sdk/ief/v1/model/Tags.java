package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Tags
 */
public class Tags {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Tag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags_any")

    private List<Tag> tagsAny = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_tags")

    private List<Tag> notTags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_tags_any")

    private List<Tag> notTagsAny = null;

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

    private List<Matches> matches = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "console")

    private Boolean console;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sorted")

    private Sorted sorted;

    public Tags withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    public Tags addTagsItem(Tag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public Tags withTags(Consumer<List<Tag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 包含标签，最多包含20个key，每个key下面的value最多10个，每个key对应的value可以为空数组但结构体不能缺失。Key不能重复，同一个key中values不能重复。结果返回包含所有标签的资源列表，key之间是与的关系，key-value结构中value是或的关系。如tags_any和tags字段同时存在，则去重后返回两者并集。无tag过滤条件时返回全量数据。
     * @return tags
     */
    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public Tags withTagsAny(List<Tag> tagsAny) {
        this.tagsAny = tagsAny;
        return this;
    }

    public Tags addTagsAnyItem(Tag tagsAnyItem) {
        if (this.tagsAny == null) {
            this.tagsAny = new ArrayList<>();
        }
        this.tagsAny.add(tagsAnyItem);
        return this;
    }

    public Tags withTagsAny(Consumer<List<Tag>> tagsAnySetter) {
        if (this.tagsAny == null) {
            this.tagsAny = new ArrayList<>();
        }
        tagsAnySetter.accept(this.tagsAny);
        return this;
    }

    /**
     * 包含任意标签，最多包含20个key，每个key下面的value最多10个。Key不能重复，同一个key中values不能重复。结果返回包含标签的资源列表，key之间是或的关系，key-value结构中value是或的关系。如tags_any和tags字段同时存在，则去重后返回两者并集。无过滤条件时返回全量数据。
     * @return tagsAny
     */
    public List<Tag> getTagsAny() {
        return tagsAny;
    }

    public void setTagsAny(List<Tag> tagsAny) {
        this.tagsAny = tagsAny;
    }

    public Tags withNotTags(List<Tag> notTags) {
        this.notTags = notTags;
        return this;
    }

    public Tags addNotTagsItem(Tag notTagsItem) {
        if (this.notTags == null) {
            this.notTags = new ArrayList<>();
        }
        this.notTags.add(notTagsItem);
        return this;
    }

    public Tags withNotTags(Consumer<List<Tag>> notTagsSetter) {
        if (this.notTags == null) {
            this.notTags = new ArrayList<>();
        }
        notTagsSetter.accept(this.notTags);
        return this;
    }

    /**
     * 不包含标签，最多包含20个key，每个key下面的value最多10个。Key不能重复，同一个key中values不能重复。结果返回不包含标签的资源列表，key之间是与的关系，key-value结构中value是或的关系。无过滤条件时返回全量数据。
     * @return notTags
     */
    public List<Tag> getNotTags() {
        return notTags;
    }

    public void setNotTags(List<Tag> notTags) {
        this.notTags = notTags;
    }

    public Tags withNotTagsAny(List<Tag> notTagsAny) {
        this.notTagsAny = notTagsAny;
        return this;
    }

    public Tags addNotTagsAnyItem(Tag notTagsAnyItem) {
        if (this.notTagsAny == null) {
            this.notTagsAny = new ArrayList<>();
        }
        this.notTagsAny.add(notTagsAnyItem);
        return this;
    }

    public Tags withNotTagsAny(Consumer<List<Tag>> notTagsAnySetter) {
        if (this.notTagsAny == null) {
            this.notTagsAny = new ArrayList<>();
        }
        notTagsAnySetter.accept(this.notTagsAny);
        return this;
    }

    /**
     * 不包含任意标签，最多包含20个key，每个key下面的value最多10个。Key不能重复，同一个key中values不能重复。结果返回不包含标签的资源列表，key之间是或的关系，key-value结构中value是或的关系。无过滤条件时返回全量数据。
     * @return notTagsAny
     */
    public List<Tag> getNotTagsAny() {
        return notTagsAny;
    }

    public void setNotTagsAny(List<Tag> notTagsAny) {
        this.notTagsAny = notTagsAny;
    }

    public Tags withLimit(String limit) {
        this.limit = limit;
        return this;
    }

    /**
     * 查询记录数（action为count时无此参数）如果action为filter默认为1000，limit最多为1000,不能为负数，最小值为1
     * @return limit
     */
    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public Tags withOffset(String offset) {
        this.offset = offset;
        return this;
    }

    /**
     * 索引位置，偏移量（action为count时无此参数）从第一条数据偏移offset条数据后开始查询，如果action为filter默认为0（偏移0条数据，表示从第一条数据开始查询）,必须为数字，不能为负数
     * @return offset
     */
    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public Tags withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * 操作标识（仅限于filter，count）：filter（过滤），count(查询总条数) 如果是filter就按照过滤条件查询，如果是count，只需要返回总条数，禁止返回其他字段。
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Tags withMatches(List<Matches> matches) {
        this.matches = matches;
        return this;
    }

    public Tags addMatchesItem(Matches matchesItem) {
        if (this.matches == null) {
            this.matches = new ArrayList<>();
        }
        this.matches.add(matchesItem);
        return this;
    }

    public Tags withMatches(Consumer<List<Matches>> matchesSetter) {
        if (this.matches == null) {
            this.matches = new ArrayList<>();
        }
        matchesSetter.accept(this.matches);
        return this;
    }

    /**
     * 搜索字段,key为要匹配的字段，如resource_name等。value为匹配的值。key为固定字典值，不能包含重复的key或不支持的key。 根据key的值确认是否需要模糊匹配，如resource_name默认为模糊搜索（不区分大小写，不支持*，支持字符串匹配），如果value为空字符串则返回空列表（IEF服务不存在资源名称为空的情况，因此这类情况返回空列表）。
     * @return matches
     */
    public List<Matches> getMatches() {
        return matches;
    }

    public void setMatches(List<Matches> matches) {
        this.matches = matches;
    }

    public Tags withConsole(Boolean console) {
        this.console = console;
        return this;
    }

    /**
     * 确认是否请求源是否为console，通过该字段来判断是否返回resource_detail内容，如果为true则返回，如果为false或者不带该参数则返回空列表。
     * @return console
     */
    public Boolean getConsole() {
        return console;
    }

    public void setConsole(Boolean console) {
        this.console = console;
    }

    public Tags withSorted(Sorted sorted) {
        this.sorted = sorted;
        return this;
    }

    public Tags withSorted(Consumer<Sorted> sortedSetter) {
        if (this.sorted == null) {
            this.sorted = new Sorted();
            sortedSetter.accept(this.sorted);
        }

        return this;
    }

    /**
     * Get sorted
     * @return sorted
     */
    public Sorted getSorted() {
        return sorted;
    }

    public void setSorted(Sorted sorted) {
        this.sorted = sorted;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Tags tags = (Tags) o;
        return Objects.equals(this.tags, tags.tags) && Objects.equals(this.tagsAny, tags.tagsAny)
            && Objects.equals(this.notTags, tags.notTags) && Objects.equals(this.notTagsAny, tags.notTagsAny)
            && Objects.equals(this.limit, tags.limit) && Objects.equals(this.offset, tags.offset)
            && Objects.equals(this.action, tags.action) && Objects.equals(this.matches, tags.matches)
            && Objects.equals(this.console, tags.console) && Objects.equals(this.sorted, tags.sorted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tags, tagsAny, notTags, notTagsAny, limit, offset, action, matches, console, sorted);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Tags {\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    tagsAny: ").append(toIndentedString(tagsAny)).append("\n");
        sb.append("    notTags: ").append(toIndentedString(notTags)).append("\n");
        sb.append("    notTagsAny: ").append(toIndentedString(notTagsAny)).append("\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    offset: ").append(toIndentedString(offset)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    matches: ").append(toIndentedString(matches)).append("\n");
        sb.append("    console: ").append(toIndentedString(console)).append("\n");
        sb.append("    sorted: ").append(toIndentedString(sorted)).append("\n");
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
