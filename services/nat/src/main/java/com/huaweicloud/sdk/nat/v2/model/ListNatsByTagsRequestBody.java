package com.huaweicloud.sdk.nat.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 查询资源实例的请求体
 */
public class ListNatsByTagsRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<PublicTag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags_any")

    private List<PublicTag> tagsAny = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_tags")

    private List<PublicTag> notTags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_tags_any")

    private List<PublicTag> notTagsAny = null;

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

    private List<PublicMatch> matches = null;

    public ListNatsByTagsRequestBody withTags(List<PublicTag> tags) {
        this.tags = tags;
        return this;
    }

    public ListNatsByTagsRequestBody addTagsItem(PublicTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ListNatsByTagsRequestBody withTags(Consumer<List<PublicTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 包含标签对象列表，最多包含10个key，每个key下面的value最多10个，结构体不能缺失，key不能为空或者空字符串。Key不能重复，同一个key中values不能重复。返回包含所有标签的资源列表，key之间是与的关系，key-value结构中value是或的关系。无tag过滤条件时返回全量数据。
     * @return tags
     */
    public List<PublicTag> getTags() {
        return tags;
    }

    public void setTags(List<PublicTag> tags) {
        this.tags = tags;
    }

    public ListNatsByTagsRequestBody withTagsAny(List<PublicTag> tagsAny) {
        this.tagsAny = tagsAny;
        return this;
    }

    public ListNatsByTagsRequestBody addTagsAnyItem(PublicTag tagsAnyItem) {
        if (this.tagsAny == null) {
            this.tagsAny = new ArrayList<>();
        }
        this.tagsAny.add(tagsAnyItem);
        return this;
    }

    public ListNatsByTagsRequestBody withTagsAny(Consumer<List<PublicTag>> tagsAnySetter) {
        if (this.tagsAny == null) {
            this.tagsAny = new ArrayList<>();
        }
        tagsAnySetter.accept(this.tagsAny);
        return this;
    }

    /**
     * 包含任意标签对象列表，最多包含10个key，每个key下面的value最多10个,结构体不能缺失，key不能为空或者空字符串。Key不能重复，同一个key中values不能重复。返回包含标签的资源列表，key之间是或的关系，key-value结构中value是或的关系。无过滤条件时返回全量数据。
     * @return tagsAny
     */
    public List<PublicTag> getTagsAny() {
        return tagsAny;
    }

    public void setTagsAny(List<PublicTag> tagsAny) {
        this.tagsAny = tagsAny;
    }

    public ListNatsByTagsRequestBody withNotTags(List<PublicTag> notTags) {
        this.notTags = notTags;
        return this;
    }

    public ListNatsByTagsRequestBody addNotTagsItem(PublicTag notTagsItem) {
        if (this.notTags == null) {
            this.notTags = new ArrayList<>();
        }
        this.notTags.add(notTagsItem);
        return this;
    }

    public ListNatsByTagsRequestBody withNotTags(Consumer<List<PublicTag>> notTagsSetter) {
        if (this.notTags == null) {
            this.notTags = new ArrayList<>();
        }
        notTagsSetter.accept(this.notTags);
        return this;
    }

    /**
     * 不包含标签对象列表，最多包含10个key，每个key下面的value最多10个, 结构体不能缺失，key不能为空或者空字符串。Key不能重复，同一个key中values不能重复。返回不包含标签的资源列表，key之间是与的关系，key-value结构中value是或的关系。无过滤条件时返回全量数据。
     * @return notTags
     */
    public List<PublicTag> getNotTags() {
        return notTags;
    }

    public void setNotTags(List<PublicTag> notTags) {
        this.notTags = notTags;
    }

    public ListNatsByTagsRequestBody withNotTagsAny(List<PublicTag> notTagsAny) {
        this.notTagsAny = notTagsAny;
        return this;
    }

    public ListNatsByTagsRequestBody addNotTagsAnyItem(PublicTag notTagsAnyItem) {
        if (this.notTagsAny == null) {
            this.notTagsAny = new ArrayList<>();
        }
        this.notTagsAny.add(notTagsAnyItem);
        return this;
    }

    public ListNatsByTagsRequestBody withNotTagsAny(Consumer<List<PublicTag>> notTagsAnySetter) {
        if (this.notTagsAny == null) {
            this.notTagsAny = new ArrayList<>();
        }
        notTagsAnySetter.accept(this.notTagsAny);
        return this;
    }

    /**
     * 不包含任意标签对象列表，最多包含10个key，每个key下面的value最多10个,结构体不能缺失，key不能为空或者空字符串。Key不能重复，同一个key中values不能重复。返回不包含标签的资源列表，key之间是或的关系，key-value结构中value是或的关系。无过滤条件时返回全量数据。
     * @return notTagsAny
     */
    public List<PublicTag> getNotTagsAny() {
        return notTagsAny;
    }

    public void setNotTagsAny(List<PublicTag> notTagsAny) {
        this.notTagsAny = notTagsAny;
    }

    public ListNatsByTagsRequestBody withLimit(String limit) {
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

    public ListNatsByTagsRequestBody withOffset(String offset) {
        this.offset = offset;
        return this;
    }

    /**
     * （索引位置）， 从offset指定的下一条数据开始查询。查询第一页数据时，不需要传入此参数，查询后续页码数据时，将查询前一页数据时响应体中的值带入此参数（action为count时无此参数）如果action为filter默认为0，必须为数字，不能为负数
     * @return offset
     */
    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public ListNatsByTagsRequestBody withAction(String action) {
        this.action = action;
        return this;
    }

    /**
     * - 操作标识（仅限于filter，count）：filter（过滤），count（查询总条数） - 如果是filter就是分页查询，如果是count只需按照条件将总条数返回即可。
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public ListNatsByTagsRequestBody withMatches(List<PublicMatch> matches) {
        this.matches = matches;
        return this;
    }

    public ListNatsByTagsRequestBody addMatchesItem(PublicMatch matchesItem) {
        if (this.matches == null) {
            this.matches = new ArrayList<>();
        }
        this.matches.add(matchesItem);
        return this;
    }

    public ListNatsByTagsRequestBody withMatches(Consumer<List<PublicMatch>> matchesSetter) {
        if (this.matches == null) {
            this.matches = new ArrayList<>();
        }
        matchesSetter.accept(this.matches);
        return this;
    }

    /**
     * - 搜索字段列表，key为要匹配的字段，如resource_name等。value为匹配的值。此字段为固定字典值。 - 根据不同的字段确认是否需要模糊匹配，如resource_name默认为模糊搜索（不区分大小写），如果value为空字符串精确匹配。resource_id为精确匹配。
     * @return matches
     */
    public List<PublicMatch> getMatches() {
        return matches;
    }

    public void setMatches(List<PublicMatch> matches) {
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
        ListNatsByTagsRequestBody that = (ListNatsByTagsRequestBody) obj;
        return Objects.equals(this.tags, that.tags) && Objects.equals(this.tagsAny, that.tagsAny)
            && Objects.equals(this.notTags, that.notTags) && Objects.equals(this.notTagsAny, that.notTagsAny)
            && Objects.equals(this.limit, that.limit) && Objects.equals(this.offset, that.offset)
            && Objects.equals(this.action, that.action) && Objects.equals(this.matches, that.matches);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tags, tagsAny, notTags, notTagsAny, limit, offset, action, matches);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListNatsByTagsRequestBody {\n");
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
