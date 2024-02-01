package com.huaweicloud.sdk.cc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * QueryResourceByTagRequestBody
 */
public class QueryResourceByTagRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "request_id")

    private String requestId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "without_any_tag")

    private Boolean withoutAnyTag;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<QueryTag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags_any")

    private List<QueryTag> tagsAny = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_tags")

    private List<QueryTag> notTags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_tags_any")

    private List<QueryTag> notTagsAny = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "matches")

    private List<TmsMatch> matches = null;

    public QueryResourceByTagRequestBody withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * 请求ID。
     * @return requestId
     */
    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public QueryResourceByTagRequestBody withWithoutAnyTag(Boolean withoutAnyTag) {
        this.withoutAnyTag = withoutAnyTag;
        return this;
    }

    /**
     * 不包含任意一个标签，该字段为true时查询所有不带标签的资源，此时忽略 “tags”、“tags_any”、“not_tags”、“not_tags_any”字段。
     * @return withoutAnyTag
     */
    public Boolean getWithoutAnyTag() {
        return withoutAnyTag;
    }

    public void setWithoutAnyTag(Boolean withoutAnyTag) {
        this.withoutAnyTag = withoutAnyTag;
    }

    public QueryResourceByTagRequestBody withTags(List<QueryTag> tags) {
        this.tags = tags;
        return this;
    }

    public QueryResourceByTagRequestBody addTagsItem(QueryTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public QueryResourceByTagRequestBody withTags(Consumer<List<QueryTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 包含标签，最多包含20个key，每个key下面的value最多10个，每个key对应的value可以为空数组但结构体不能缺失。Key不能重复，同一个key中values不能重复。结果返回包含所有标签的资源列表，key之间是与的关系，key-value结构中value是或的关系。无tag过滤条件时返回全量数据。
     * @return tags
     */
    public List<QueryTag> getTags() {
        return tags;
    }

    public void setTags(List<QueryTag> tags) {
        this.tags = tags;
    }

    public QueryResourceByTagRequestBody withTagsAny(List<QueryTag> tagsAny) {
        this.tagsAny = tagsAny;
        return this;
    }

    public QueryResourceByTagRequestBody addTagsAnyItem(QueryTag tagsAnyItem) {
        if (this.tagsAny == null) {
            this.tagsAny = new ArrayList<>();
        }
        this.tagsAny.add(tagsAnyItem);
        return this;
    }

    public QueryResourceByTagRequestBody withTagsAny(Consumer<List<QueryTag>> tagsAnySetter) {
        if (this.tagsAny == null) {
            this.tagsAny = new ArrayList<>();
        }
        tagsAnySetter.accept(this.tagsAny);
        return this;
    }

    /**
     * 包含任意标签，最多包含20个key，每个key下面的value最多10个, 每个key对应的value可以为空数组但结构体不能缺失。Key不能重复，同一个key中values不能重复。结果返回包含标签的资源列表，key之间是或的关系，key-value结构中value是或的关系。无过滤条件时返回全量数据。
     * @return tagsAny
     */
    public List<QueryTag> getTagsAny() {
        return tagsAny;
    }

    public void setTagsAny(List<QueryTag> tagsAny) {
        this.tagsAny = tagsAny;
    }

    public QueryResourceByTagRequestBody withNotTags(List<QueryTag> notTags) {
        this.notTags = notTags;
        return this;
    }

    public QueryResourceByTagRequestBody addNotTagsItem(QueryTag notTagsItem) {
        if (this.notTags == null) {
            this.notTags = new ArrayList<>();
        }
        this.notTags.add(notTagsItem);
        return this;
    }

    public QueryResourceByTagRequestBody withNotTags(Consumer<List<QueryTag>> notTagsSetter) {
        if (this.notTags == null) {
            this.notTags = new ArrayList<>();
        }
        notTagsSetter.accept(this.notTags);
        return this;
    }

    /**
     * 不包含标签，最多包含20个key，每个key下面的value最多10个, 每个key对应的value可以为空数组但结构体不能缺失。Key不能重复，同一个key中values不能重复。结果返回不包含标签的资源列表，key之间是与的关系，key-value结构中value是或的关系。无过滤条件时返回全量数据。
     * @return notTags
     */
    public List<QueryTag> getNotTags() {
        return notTags;
    }

    public void setNotTags(List<QueryTag> notTags) {
        this.notTags = notTags;
    }

    public QueryResourceByTagRequestBody withNotTagsAny(List<QueryTag> notTagsAny) {
        this.notTagsAny = notTagsAny;
        return this;
    }

    public QueryResourceByTagRequestBody addNotTagsAnyItem(QueryTag notTagsAnyItem) {
        if (this.notTagsAny == null) {
            this.notTagsAny = new ArrayList<>();
        }
        this.notTagsAny.add(notTagsAnyItem);
        return this;
    }

    public QueryResourceByTagRequestBody withNotTagsAny(Consumer<List<QueryTag>> notTagsAnySetter) {
        if (this.notTagsAny == null) {
            this.notTagsAny = new ArrayList<>();
        }
        notTagsAnySetter.accept(this.notTagsAny);
        return this;
    }

    /**
     * 不包含任意标签，最多包含20个key，每个key下面的value最多10个, 每个key对应的value可以为空数组但结构体不能缺失。Key不能重复，同一个key中values不能重复。结果返回不包含标签的资源列表，key之间是或的关系，key-value结构中value是或的关系。无过滤条件时返回全量数据。
     * @return notTagsAny
     */
    public List<QueryTag> getNotTagsAny() {
        return notTagsAny;
    }

    public void setNotTagsAny(List<QueryTag> notTagsAny) {
        this.notTagsAny = notTagsAny;
    }

    public QueryResourceByTagRequestBody withMatches(List<TmsMatch> matches) {
        this.matches = matches;
        return this;
    }

    public QueryResourceByTagRequestBody addMatchesItem(TmsMatch matchesItem) {
        if (this.matches == null) {
            this.matches = new ArrayList<>();
        }
        this.matches.add(matchesItem);
        return this;
    }

    public QueryResourceByTagRequestBody withMatches(Consumer<List<TmsMatch>> matchesSetter) {
        if (this.matches == null) {
            this.matches = new ArrayList<>();
        }
        matchesSetter.accept(this.matches);
        return this;
    }

    /**
     * 是否匹配以下tag，key必须为\"resource_name\"，value如果有值则模糊匹配，如果为空字符串则精确匹配。
     * @return matches
     */
    public List<TmsMatch> getMatches() {
        return matches;
    }

    public void setMatches(List<TmsMatch> matches) {
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
        QueryResourceByTagRequestBody that = (QueryResourceByTagRequestBody) obj;
        return Objects.equals(this.requestId, that.requestId) && Objects.equals(this.withoutAnyTag, that.withoutAnyTag)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.tagsAny, that.tagsAny)
            && Objects.equals(this.notTags, that.notTags) && Objects.equals(this.notTagsAny, that.notTagsAny)
            && Objects.equals(this.matches, that.matches);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, withoutAnyTag, tags, tagsAny, notTags, notTagsAny, matches);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryResourceByTagRequestBody {\n");
        sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
        sb.append("    withoutAnyTag: ").append(toIndentedString(withoutAnyTag)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    tagsAny: ").append(toIndentedString(tagsAny)).append("\n");
        sb.append("    notTags: ").append(toIndentedString(notTags)).append("\n");
        sb.append("    notTagsAny: ").append(toIndentedString(notTagsAny)).append("\n");
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
