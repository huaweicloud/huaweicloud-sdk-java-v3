package com.huaweicloud.sdk.dns.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** ListTagReq */
public class ListTagReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<TagValues> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags_any")

    private List<TagValues> tagsAny = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_tags")

    private List<TagValues> notTags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "not_tags_any")

    private List<TagValues> notTagsAny = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "limit")

    private Integer limit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offset")

    private Integer offset;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action")

    private String action;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "matches")

    private List<Match> matches = null;

    public ListTagReq withTags(List<TagValues> tags) {
        this.tags = tags;
        return this;
    }

    public ListTagReq addTagsItem(TagValues tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ListTagReq withTags(Consumer<List<TagValues>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /** 包含标签。 最多包含10个key，每个key下面的value最多10个，结构体不能缺失，key不能为空或者空字符串。Key不能重复，同一个key中values不能重复。
     * 
     * @return tags */
    public List<TagValues> getTags() {
        return tags;
    }

    public void setTags(List<TagValues> tags) {
        this.tags = tags;
    }

    public ListTagReq withTagsAny(List<TagValues> tagsAny) {
        this.tagsAny = tagsAny;
        return this;
    }

    public ListTagReq addTagsAnyItem(TagValues tagsAnyItem) {
        if (this.tagsAny == null) {
            this.tagsAny = new ArrayList<>();
        }
        this.tagsAny.add(tagsAnyItem);
        return this;
    }

    public ListTagReq withTagsAny(Consumer<List<TagValues>> tagsAnySetter) {
        if (this.tagsAny == null) {
            this.tagsAny = new ArrayList<>();
        }
        tagsAnySetter.accept(this.tagsAny);
        return this;
    }

    /** 最多包含10个key，每个key下面的value最多10个，结构体不能缺失，key不能为空或者空字符串。Key不能重复，同一个key中values不能重复。
     * 
     * @return tagsAny */
    public List<TagValues> getTagsAny() {
        return tagsAny;
    }

    public void setTagsAny(List<TagValues> tagsAny) {
        this.tagsAny = tagsAny;
    }

    public ListTagReq withNotTags(List<TagValues> notTags) {
        this.notTags = notTags;
        return this;
    }

    public ListTagReq addNotTagsItem(TagValues notTagsItem) {
        if (this.notTags == null) {
            this.notTags = new ArrayList<>();
        }
        this.notTags.add(notTagsItem);
        return this;
    }

    public ListTagReq withNotTags(Consumer<List<TagValues>> notTagsSetter) {
        if (this.notTags == null) {
            this.notTags = new ArrayList<>();
        }
        notTagsSetter.accept(this.notTags);
        return this;
    }

    /** 最多包含10个key，每个key下面的value最多10个，结构体不能缺失，key不能为空或者空字符串。Key不能重复，同一个key中values不能重复。
     * 
     * @return notTags */
    public List<TagValues> getNotTags() {
        return notTags;
    }

    public void setNotTags(List<TagValues> notTags) {
        this.notTags = notTags;
    }

    public ListTagReq withNotTagsAny(List<TagValues> notTagsAny) {
        this.notTagsAny = notTagsAny;
        return this;
    }

    public ListTagReq addNotTagsAnyItem(TagValues notTagsAnyItem) {
        if (this.notTagsAny == null) {
            this.notTagsAny = new ArrayList<>();
        }
        this.notTagsAny.add(notTagsAnyItem);
        return this;
    }

    public ListTagReq withNotTagsAny(Consumer<List<TagValues>> notTagsAnySetter) {
        if (this.notTagsAny == null) {
            this.notTagsAny = new ArrayList<>();
        }
        notTagsAnySetter.accept(this.notTagsAny);
        return this;
    }

    /** 最多包含10个key，每个key下面的value最多10个，结构体不能缺失，key不能为空或者空字符串。Key不能重复，同一个key中values不能重复。
     * 
     * @return notTagsAny */
    public List<TagValues> getNotTagsAny() {
        return notTagsAny;
    }

    public void setNotTagsAny(List<TagValues> notTagsAny) {
        this.notTagsAny = notTagsAny;
    }

    public ListTagReq withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /** 每页返回的资源个数。 取值范围：1~1000 参数取值说明： 如果action为filter时，默认为1000。 如果action为count时，无此参数。
     * 
     * @return limit */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListTagReq withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /** 分页查询起始偏移量，表示从偏移量的下一个资源开始查询。 取值范围：0~2147483647 默认值为0。 参数取值说明： 查询第一页数据时，不需要传入此参数。 查询后续页码数据时，将查询前一页数据时响应体中的值带入此参数。
     * 如果action为filter时，默认为0，必须为数字，不能为负数。 如果action为count时，无此参数。
     * 
     * @return offset */
    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public ListTagReq withAction(String action) {
        this.action = action;
        return this;
    }

    /** 操作标识（区分大小写）。 取值范围： filter：分页过滤查询 count：查询总条数
     * 
     * @return action */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public ListTagReq withMatches(List<Match> matches) {
        this.matches = matches;
        return this;
    }

    public ListTagReq addMatchesItem(Match matchesItem) {
        if (this.matches == null) {
            this.matches = new ArrayList<>();
        }
        this.matches.add(matchesItem);
        return this;
    }

    public ListTagReq withMatches(Consumer<List<Match>> matchesSetter) {
        if (this.matches == null) {
            this.matches = new ArrayList<>();
        }
        matchesSetter.accept(this.matches);
        return this;
    }

    /** key为要匹配的字段，value为匹配的值。 如果value为空字符串则精确匹配，否则模糊匹配。
     * 
     * @return matches */
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
        ListTagReq listTagReq = (ListTagReq) o;
        return Objects.equals(this.tags, listTagReq.tags) && Objects.equals(this.tagsAny, listTagReq.tagsAny)
            && Objects.equals(this.notTags, listTagReq.notTags)
            && Objects.equals(this.notTagsAny, listTagReq.notTagsAny) && Objects.equals(this.limit, listTagReq.limit)
            && Objects.equals(this.offset, listTagReq.offset) && Objects.equals(this.action, listTagReq.action)
            && Objects.equals(this.matches, listTagReq.matches);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tags, tagsAny, notTags, notTagsAny, limit, offset, action, matches);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListTagReq {\n");
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

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
